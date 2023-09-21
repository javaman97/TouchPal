package com.p023a.p024a.p025a.p026a.p027a.p028a;

import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* renamed from: com.a.a.a.a.a.a.g */
/* compiled from: Util */
final class C0722g {

    /* renamed from: a */
    static final Charset f1798a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f1799b = Charset.forName(Utils.UTF8);

    private C0722g() {
    }

    /* renamed from: a */
    static String m4110a(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = reader.read(cArr);
                if (read == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, read);
            }
        } finally {
            reader.close();
        }
    }

    /* renamed from: a */
    static void m4112a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m4112a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    /* renamed from: a */
    static void m4111a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }
}
