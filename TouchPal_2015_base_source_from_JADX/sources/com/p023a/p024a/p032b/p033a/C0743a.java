package com.p023a.p024a.p032b.p033a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.a.a.b.a.a */
/* compiled from: ContentLengthInputStream */
public class C0743a extends InputStream {

    /* renamed from: a */
    private final InputStream f1829a;

    /* renamed from: b */
    private final int f1830b;

    public C0743a(InputStream inputStream, int i) {
        this.f1829a = inputStream;
        this.f1830b = i;
    }

    public int available() {
        return this.f1830b;
    }

    public void close() throws IOException {
        this.f1829a.close();
    }

    public void mark(int i) {
        this.f1829a.mark(i);
    }

    public int read() throws IOException {
        return this.f1829a.read();
    }

    public int read(byte[] bArr) throws IOException {
        return this.f1829a.read(bArr);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f1829a.read(bArr, i, i2);
    }

    public void reset() throws IOException {
        this.f1829a.reset();
    }

    public long skip(long j) throws IOException {
        return this.f1829a.skip(j);
    }

    public boolean markSupported() {
        return this.f1829a.markSupported();
    }
}
