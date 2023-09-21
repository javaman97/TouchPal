package p100m.framework.p101a;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m.framework.a.f */
/* compiled from: MultiPartInputStream */
public class C4272f extends InputStream {

    /* renamed from: a */
    private ArrayList<InputStream> f17431a = new ArrayList<>();

    /* renamed from: b */
    private int f17432b;

    C4272f() {
    }

    /* renamed from: a */
    public void mo15922a(InputStream inputStream) throws Throwable {
        this.f17431a.add(inputStream);
    }

    /* renamed from: a */
    private boolean m17846a() {
        return this.f17431a == null || this.f17431a.size() <= 0;
    }

    public int available() throws IOException {
        if (m17846a()) {
            return 0;
        }
        return this.f17431a.get(this.f17432b).available();
    }

    public void close() throws IOException {
        Iterator<InputStream> it = this.f17431a.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    public long skip(long j) throws IOException {
        throw new IOException();
    }

    public int read() throws IOException {
        if (m17846a()) {
            return -1;
        }
        int read = this.f17431a.get(this.f17432b).read();
        while (read < 0) {
            this.f17432b++;
            if (this.f17432b >= this.f17431a.size()) {
                return read;
            }
            read = this.f17431a.get(this.f17432b).read();
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (m17846a()) {
            return -1;
        }
        int read = this.f17431a.get(this.f17432b).read(bArr, i, i2);
        while (read < 0) {
            this.f17432b++;
            if (this.f17432b >= this.f17431a.size()) {
                return read;
            }
            read = this.f17431a.get(this.f17432b).read(bArr, i, i2);
        }
        return read;
    }
}
