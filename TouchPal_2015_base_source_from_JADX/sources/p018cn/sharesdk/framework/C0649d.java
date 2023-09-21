package p018cn.sharesdk.framework;

import java.util.HashMap;

/* renamed from: cn.sharesdk.framework.d */
class C0649d implements PlatformActionListener {

    /* renamed from: a */
    final /* synthetic */ PlatformActionListener f1585a;

    /* renamed from: b */
    final /* synthetic */ int f1586b;

    /* renamed from: c */
    final /* synthetic */ Object f1587c;

    /* renamed from: d */
    final /* synthetic */ C0632b f1588d;

    C0649d(C0632b bVar, PlatformActionListener platformActionListener, int i, Object obj) {
        this.f1588d = bVar;
        this.f1585a = platformActionListener;
        this.f1586b = i;
        this.f1587c = obj;
    }

    public void onCancel(Platform platform, int i) {
        PlatformActionListener unused = this.f1588d.f1507a = this.f1585a;
        if (this.f1588d.f1507a != null) {
            this.f1588d.f1507a.onCancel(platform, this.f1586b);
        }
    }

    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        PlatformActionListener unused = this.f1588d.f1507a = this.f1585a;
        platform.afterRegister(this.f1586b, this.f1587c);
    }

    public void onError(Platform platform, int i, Throwable th) {
        PlatformActionListener unused = this.f1588d.f1507a = this.f1585a;
        if (this.f1588d.f1507a != null) {
            this.f1588d.f1507a.onError(platform, i, th);
        }
    }
}
