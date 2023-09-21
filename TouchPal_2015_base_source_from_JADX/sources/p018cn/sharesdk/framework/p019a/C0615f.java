package p018cn.sharesdk.framework.p019a;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: cn.sharesdk.framework.a.f */
public class C0615f extends InputStream {

    /* renamed from: a */
    private ArrayList<InputStream> f1474a = new ArrayList<>();

    /* renamed from: b */
    private int f1475b;

    C0615f() {
    }

    /* renamed from: a */
    private boolean m3538a() {
        return this.f1474a == null || this.f1474a.size() <= 0;
    }

    /* renamed from: a */
    public void mo2191a(InputStream inputStream) {
        this.f1474a.add(inputStream);
    }

    public int available() {
        if (m3538a()) {
            return 0;
        }
        return this.f1474a.get(this.f1475b).available();
    }

    public void close() {
        Iterator<InputStream> it = this.f1474a.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    public int read() {
        if (m3538a()) {
            return -1;
        }
        int read = this.f1474a.get(this.f1475b).read();
        while (read < 0) {
            this.f1475b++;
            if (this.f1475b >= this.f1474a.size()) {
                return read;
            }
            read = this.f1474a.get(this.f1475b).read();
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (m3538a()) {
            return -1;
        }
        int read = this.f1474a.get(this.f1475b).read(bArr, i, i2);
        while (read < 0) {
            this.f1475b++;
            if (this.f1475b >= this.f1474a.size()) {
                return read;
            }
            read = this.f1474a.get(this.f1475b).read(bArr, i, i2);
        }
        return read;
    }

    public long skip(long j) {
        throw new IOException();
    }
}
