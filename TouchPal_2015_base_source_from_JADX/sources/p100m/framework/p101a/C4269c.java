package p100m.framework.p101a;

import java.io.InputStream;
import org.apache.http.entity.InputStreamEntity;

/* renamed from: m.framework.a.c */
/* compiled from: HTTPPart */
public abstract class C4269c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InputStream mo15911a() throws Throwable;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract long mo15913b() throws Throwable;

    /* renamed from: c */
    public InputStreamEntity mo15918c() throws Throwable {
        return new InputStreamEntity(mo15911a(), mo15913b());
    }
}
