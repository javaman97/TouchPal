package p018cn.sharesdk.framework.p019a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import p018cn.sharesdk.framework.utils.C0662a;

/* renamed from: cn.sharesdk.framework.a.a */
public class C0610a extends C0612c {

    /* renamed from: a */
    private byte[] f1469a;

    /* renamed from: a */
    public C0610a mo2180a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.f1469a != null && this.f1469a.length > 0) {
            byteArrayOutputStream.write(this.f1469a);
        }
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.flush();
        this.f1469a = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo2181a() {
        return (this.f1469a == null || this.f1469a.length <= 0) ? new ByteArrayInputStream(new byte[0]) : new ByteArrayInputStream(this.f1469a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo2182b() {
        if (this.f1469a == null) {
            return 0;
        }
        return (long) this.f1469a.length;
    }

    public String toString() {
        return C0662a.m3783a(this.f1469a);
    }
}
