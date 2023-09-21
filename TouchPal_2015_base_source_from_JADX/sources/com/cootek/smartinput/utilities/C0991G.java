package com.cootek.smartinput.utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.cootek.smartinput.utilities.G */
/* compiled from: ZipProcessor */
class C0991G {

    /* renamed from: a */
    private boolean f2582a = false;

    /* renamed from: b */
    private boolean f2583b = false;

    /* renamed from: c */
    private final String f2584c;

    public C0991G(String str) {
        this.f2584c = str;
    }

    /* renamed from: a */
    public void mo4053a(Enumeration<? extends ZipEntry> enumeration, ZipFile zipFile, File file) throws IOException {
        this.f2582a = true;
        while (enumeration.hasMoreElements() && !this.f2583b) {
            try {
                ZipEntry zipEntry = (ZipEntry) enumeration.nextElement();
                String name = zipEntry.getName();
                File file2 = new File(file, name);
                if (file2.exists()) {
                    file2.delete();
                }
                File file3 = new File(file, name);
                if (zipEntry.isDirectory()) {
                    file3.mkdirs();
                } else {
                    File parentFile = file3.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file3.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    InputStream inputStream = zipFile.getInputStream(zipEntry);
                    try {
                        C0997e.m5179a(inputStream, (OutputStream) fileOutputStream, this.f2584c);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                            }
                        }
                    } catch (IOException e3) {
                        throw e3;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e6) {
                throw e6;
            } catch (Throwable th2) {
                this.f2582a = false;
                this.f2583b = false;
                throw th2;
            }
        }
        this.f2582a = false;
        this.f2583b = false;
    }

    /* renamed from: a */
    public boolean mo4054a() {
        return this.f2582a;
    }

    /* renamed from: b */
    public void mo4055b() {
        this.f2583b = true;
        C0997e.m5180a(this.f2584c);
    }
}
