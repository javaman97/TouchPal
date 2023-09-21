package p018cn.sharesdk.framework;

import java.util.HashMap;
import p018cn.sharesdk.framework.p020b.C0639b;
import p018cn.sharesdk.framework.p020b.p022b.C0641b;
import p018cn.sharesdk.framework.p020b.p022b.C0642c;
import p018cn.sharesdk.framework.utils.C0665d;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.c */
class C0648c implements PlatformActionListener {

    /* renamed from: a */
    final /* synthetic */ PlatformActionListener f1581a;

    /* renamed from: b */
    final /* synthetic */ int f1582b;

    /* renamed from: c */
    final /* synthetic */ HashMap f1583c;

    /* renamed from: d */
    final /* synthetic */ C0632b f1584d;

    C0648c(C0632b bVar, PlatformActionListener platformActionListener, int i, HashMap hashMap) {
        this.f1584d = bVar;
        this.f1581a = platformActionListener;
        this.f1582b = i;
        this.f1583c = hashMap;
    }

    public void onCancel(Platform platform, int i) {
        PlatformActionListener unused = this.f1584d.f1507a = this.f1581a;
        if (this.f1584d.f1507a != null) {
            this.f1584d.f1507a.onComplete(platform, this.f1582b, this.f1583c);
        }
    }

    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        PlatformActionListener unused = this.f1584d.f1507a = this.f1581a;
        if (this.f1584d.f1507a != null) {
            this.f1584d.f1507a.onComplete(platform, this.f1582b, this.f1583c);
        }
        C0641b bVar = new C0641b();
        bVar.f1543a = platform.getPlatformId();
        bVar.f1544b = "TencentWeibo".equals(platform.getName()) ? platform.getDb().get("name") : platform.getDb().getUserId();
        bVar.f1545c = new C0665d().mo2495a(hashMap);
        bVar.f1546d = this.f1584d.m3586a(platform);
        C0639b.m3640a(platform.getContext()).mo2305a((C0642c) bVar);
    }

    public void onError(Platform platform, int i, Throwable th) {
        C0666e.m3838b(th);
        PlatformActionListener unused = this.f1584d.f1507a = this.f1581a;
        if (this.f1584d.f1507a != null) {
            this.f1584d.f1507a.onComplete(platform, this.f1582b, this.f1583c);
        }
    }
}
