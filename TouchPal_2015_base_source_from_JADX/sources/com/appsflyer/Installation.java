package com.appsflyer;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.cootek.smartinput5.func.C1351J;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.UUID;

public class Installation {
    private static final String INSTALLATION = "AF_INSTALLATION";
    private static String sID = null;

    /* renamed from: id */
    public static synchronized String m4886id(Context context) {
        String str;
        synchronized (Installation.class) {
            if (sID == null) {
                File file = new File(context.getFilesDir(), INSTALLATION);
                try {
                    if (!file.exists()) {
                        writeInstallationFile(file, context);
                    }
                    sID = readInstallationFile(file);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            str = sID;
        }
        return str;
    }

    private static String readInstallationFile(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        byte[] bArr = new byte[((int) randomAccessFile.length())];
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        return new String(bArr);
    }

    private static void writeInstallationFile(File file, Context context) throws IOException, PackageManager.NameNotFoundException {
        String uuid;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        if (Build.VERSION.SDK_INT >= 9) {
            uuid = packageInfo.firstInstallTime + C1351J.f4161f + Math.abs(new Random().nextLong());
        } else {
            uuid = UUID.randomUUID().toString();
        }
        fileOutputStream.write(uuid.getBytes());
        fileOutputStream.close();
    }
}
