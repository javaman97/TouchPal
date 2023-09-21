package p018cn.sharesdk.framework;

import java.util.Comparator;

/* renamed from: cn.sharesdk.framework.l */
class C0657l implements Comparator<Platform> {

    /* renamed from: a */
    final /* synthetic */ C0656k f1607a;

    C0657l(C0656k kVar) {
        this.f1607a = kVar;
    }

    /* renamed from: a */
    public int compare(Platform platform, Platform platform2) {
        return platform.getSortId() != platform2.getSortId() ? platform.getSortId() - platform2.getSortId() : platform.getPlatformId() - platform2.getPlatformId();
    }
}
