package com.cootek.smartinput.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.cootek.smartinput.utilities.g */
/* compiled from: GZipCompressor */
public class C0999g {
    /* renamed from: a */
    public static void m5199a(String str, String str2) {
        GZIPOutputStream gZIPOutputStream;
        FileInputStream fileInputStream = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(str2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            gZIPOutputStream = null;
        }
        try {
            fileInputStream = new FileInputStream(str);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    gZIPOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    gZIPOutputStream.finish();
                    gZIPOutputStream.close();
                    return;
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
