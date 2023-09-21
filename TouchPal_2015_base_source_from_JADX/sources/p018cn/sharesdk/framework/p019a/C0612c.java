package p018cn.sharesdk.framework.p019a;

import java.io.InputStream;
import org.apache.http.entity.InputStreamEntity;

/* renamed from: cn.sharesdk.framework.a.c */
public abstract class C0612c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InputStream mo2181a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract long mo2182b();

    /* renamed from: c */
    public InputStreamEntity mo2187c() {
        return new InputStreamEntity(mo2181a(), mo2182b());
    }
}
