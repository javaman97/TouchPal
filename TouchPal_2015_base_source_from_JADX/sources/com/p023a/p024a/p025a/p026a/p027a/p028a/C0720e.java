package com.p023a.p024a.p025a.p026a.p027a.p028a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: com.a.a.a.a.a.a.e */
/* compiled from: StrictLineReader */
class C0720e implements Closeable {

    /* renamed from: a */
    private static final byte f1790a = 13;

    /* renamed from: b */
    private static final byte f1791b = 10;

    /* renamed from: c */
    private final InputStream f1792c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Charset f1793d;

    /* renamed from: e */
    private byte[] f1794e;

    /* renamed from: f */
    private int f1795f;

    /* renamed from: g */
    private int f1796g;

    public C0720e(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C0720e(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (!charset.equals(C0722g.f1798a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        } else {
            this.f1792c = inputStream;
            this.f1793d = charset;
            this.f1794e = new byte[i];
        }
    }

    public void close() throws IOException {
        synchronized (this.f1792c) {
            if (this.f1794e != null) {
                this.f1794e = null;
                this.f1792c.close();
            }
        }
    }

    /* renamed from: a */
    public String mo2728a() throws IOException {
        int i;
        String byteArrayOutputStream;
        synchronized (this.f1792c) {
            if (this.f1794e == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f1795f >= this.f1796g) {
                m4108b();
            }
            int i2 = this.f1795f;
            while (true) {
                if (i2 == this.f1796g) {
                    C0721f fVar = new C0721f(this, (this.f1796g - this.f1795f) + 80);
                    loop1:
                    while (true) {
                        fVar.write(this.f1794e, this.f1795f, this.f1796g - this.f1795f);
                        this.f1796g = -1;
                        m4108b();
                        i = this.f1795f;
                        while (true) {
                            if (i != this.f1796g) {
                                if (this.f1794e[i] == 10) {
                                    break loop1;
                                }
                                i++;
                            }
                        }
                    }
                    if (i != this.f1795f) {
                        fVar.write(this.f1794e, this.f1795f, i - this.f1795f);
                    }
                    this.f1795f = i + 1;
                    byteArrayOutputStream = fVar.toString();
                } else if (this.f1794e[i2] == 10) {
                    byteArrayOutputStream = new String(this.f1794e, this.f1795f, ((i2 == this.f1795f || this.f1794e[i2 + -1] != 13) ? i2 : i2 - 1) - this.f1795f, this.f1793d.name());
                    this.f1795f = i2 + 1;
                } else {
                    i2++;
                }
            }
        }
        return byteArrayOutputStream;
    }

    /* renamed from: b */
    private void m4108b() throws IOException {
        int read = this.f1792c.read(this.f1794e, 0, this.f1794e.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f1795f = 0;
        this.f1796g = read;
    }
}
