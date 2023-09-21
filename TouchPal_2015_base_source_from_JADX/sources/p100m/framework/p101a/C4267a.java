package p100m.framework.p101a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import p100m.framework.p102b.C4278a;

/* renamed from: m.framework.a.a */
/* compiled from: ByteArrayPart */
public class C4267a extends C4269c {

    /* renamed from: a */
    private byte[] f17426a;

    /* renamed from: a */
    public C4267a mo15912a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.f17426a != null && this.f17426a.length > 0) {
            byteArrayOutputStream.write(this.f17426a);
        }
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.flush();
        this.f17426a = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo15911a() throws Throwable {
        if (this.f17426a == null || this.f17426a.length <= 0) {
            return new ByteArrayInputStream(new byte[0]);
        }
        return new ByteArrayInputStream(this.f17426a);
    }

    public String toString() {
        return C4278a.m17867a(this.f17426a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo15913b() throws Throwable {
        return (long) (this.f17426a == null ? 0 : this.f17426a.length);
    }
}
