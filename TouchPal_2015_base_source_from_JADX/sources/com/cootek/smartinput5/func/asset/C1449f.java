package com.cootek.smartinput5.func.asset;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.cootek.smartinput5.func.asset.f */
/* compiled from: ExternalAssetFileInfo */
public class C1449f implements C1444a {

    /* renamed from: a */
    private final long f4640a;

    /* renamed from: b */
    private final FileDescriptor f4641b;

    /* renamed from: c */
    private final InputStream f4642c;

    /* renamed from: d */
    private final String f4643d;

    public C1449f(FileDescriptor fileDescriptor, long j, InputStream inputStream, String str) {
        this.f4641b = fileDescriptor;
        this.f4642c = inputStream;
        this.f4640a = j;
        this.f4643d = str;
    }

    /* renamed from: b */
    public FileDescriptor mo6095b() {
        return this.f4641b;
    }

    /* renamed from: c */
    public InputStream mo6096c() {
        return this.f4642c;
    }

    /* renamed from: a */
    public long mo6094a() {
        return this.f4640a;
    }

    public void close() throws IOException {
        if (this.f4642c != null) {
            this.f4642c.close();
        }
    }

    /* renamed from: d */
    public String mo6097d() {
        return this.f4643d;
    }
}
