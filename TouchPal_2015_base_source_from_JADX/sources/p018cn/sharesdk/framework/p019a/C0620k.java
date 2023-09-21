package p018cn.sharesdk.framework.p019a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: cn.sharesdk.framework.a.k */
public class C0620k extends C0612c {

    /* renamed from: a */
    private StringBuilder f1481a = new StringBuilder();

    /* renamed from: a */
    public C0620k mo2216a(String str) {
        this.f1481a.append(str);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo2181a() {
        return new ByteArrayInputStream(this.f1481a.toString().getBytes("utf-8"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo2182b() {
        return (long) this.f1481a.toString().getBytes("utf-8").length;
    }

    public String toString() {
        return this.f1481a.toString();
    }
}
