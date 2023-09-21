package com.iflytek.cloud.util.p088a;

import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.iflytek.cloud.util.a.d */
public class C4028d {
    /* renamed from: a */
    public static int m17152a(String str, String str2, boolean z) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.createNewFile();
            } else if (z) {
                file.delete();
                file.createNewFile();
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(str2.getBytes("utf-8"));
            int length = (int) randomAccessFile.length();
            randomAccessFile.close();
            return length;
        } catch (IOException e) {
            C3990a.m17031a("iFly_ContactManager", "save file failed. " + str);
            return 0;
        }
    }

    /* renamed from: a */
    public static String m17153a(String str) {
        String str2;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            str2 = new String(bArr, "utf-8");
            try {
                fileInputStream.close();
            } catch (IOException e) {
                C3990a.m17031a("iFly_ContactManager", "load file failed. " + str);
                return str2;
            }
        } catch (IOException e2) {
            str2 = null;
            C3990a.m17031a("iFly_ContactManager", "load file failed. " + str);
            return str2;
        }
        return str2;
    }
}
