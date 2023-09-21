package p100m.framework.p101a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: m.framework.a.k */
/* compiled from: StringPart */
public class C4277k extends C4269c {

    /* renamed from: a */
    private StringBuilder f17437a = new StringBuilder();

    /* renamed from: a */
    public C4277k mo15942a(String str) {
        this.f17437a.append(str);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo15911a() throws Throwable {
        return new ByteArrayInputStream(this.f17437a.toString().getBytes("utf-8"));
    }

    public String toString() {
        return this.f17437a.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo15913b() throws Throwable {
        return (long) this.f17437a.toString().getBytes("utf-8").length;
    }
}
