package com.p023a.p024a.p041c;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.a.a.c.c */
/* compiled from: IoUtils */
public final class C0811c {

    /* renamed from: a */
    public static final int f2132a = 32768;

    /* renamed from: b */
    public static final int f2133b = 512000;

    /* renamed from: c */
    public static final int f2134c = 75;

    /* renamed from: com.a.a.c.c$a */
    /* compiled from: IoUtils */
    public interface C0812a {
        /* renamed from: a */
        boolean mo3009a(int i, int i2);
    }

    private C0811c() {
    }

    /* renamed from: a */
    public static boolean m4617a(InputStream inputStream, OutputStream outputStream, C0812a aVar) throws IOException {
        return m4618a(inputStream, outputStream, aVar, 32768);
    }

    /* renamed from: a */
    public static boolean m4618a(InputStream inputStream, OutputStream outputStream, C0812a aVar, int i) throws IOException {
        int available = inputStream.available();
        if (available <= 0) {
            available = f2133b;
        }
        byte[] bArr = new byte[i];
        if (m4616a(aVar, 0, available)) {
            return false;
        }
        int i2 = 0;
        do {
            int read = inputStream.read(bArr, 0, i);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                i2 += read;
            } else {
                outputStream.flush();
                return true;
            }
        } while (!m4616a(aVar, i2, available));
        return false;
    }

    /* renamed from: a */
    private static boolean m4616a(C0812a aVar, int i, int i2) {
        if (aVar == null || aVar.mo3009a(i, i2) || (i * 100) / i2 >= 75) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m4615a(InputStream inputStream) {
        do {
            try {
            } catch (IOException e) {
                return;
            } finally {
                m4614a((Closeable) inputStream);
            }
        } while (inputStream.read(new byte[32768], 0, 32768) != -1);
    }

    /* renamed from: a */
    public static void m4614a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception e) {
        }
    }
}
