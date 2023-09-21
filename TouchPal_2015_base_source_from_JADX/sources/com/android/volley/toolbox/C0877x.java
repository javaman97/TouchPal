package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.android.volley.toolbox.x */
/* compiled from: PoolingByteArrayOutputStream */
public class C0877x extends ByteArrayOutputStream {

    /* renamed from: a */
    private static final int f2322a = 256;

    /* renamed from: b */
    private final C0848d f2323b;

    public C0877x(C0848d dVar) {
        this(dVar, 256);
    }

    public C0877x(C0848d dVar, int i) {
        this.f2323b = dVar;
        this.buf = this.f2323b.mo3116a(Math.max(i, 256));
    }

    public void close() throws IOException {
        this.f2323b.mo3115a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f2323b.mo3115a(this.buf);
    }

    /* renamed from: a */
    private void m4863a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] a = this.f2323b.mo3116a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f2323b.mo3115a(this.buf);
            this.buf = a;
        }
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        m4863a(i2);
        super.write(bArr, i, i2);
    }

    public synchronized void write(int i) {
        m4863a(1);
        super.write(i);
    }
}
