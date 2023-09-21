package p018cn.sharesdk.framework;

import android.content.Context;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.p020b.p022b.C0645f;
import p018cn.sharesdk.framework.utils.C0663b;
import p018cn.sharesdk.framework.utils.C0665d;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.Service */
public abstract class Service {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f1463a;

    /* renamed from: b */
    private String f1464b;

    /* renamed from: cn.sharesdk.framework.Service$ServiceEvent */
    public static abstract class ServiceEvent {
        private final int PLATFORM = 1;
        protected Service service;

        public ServiceEvent(Service service2) {
            this.service = service2;
        }

        /* access modifiers changed from: protected */
        public HashMap<String, Object> filterShareContent(int i, Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
            C0645f.C0646a filterShareContent = ShareSDK.getPlatform(this.service.getContext(), ShareSDK.platformIdToName(i)).filterShareContent(shareParams, hashMap);
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("shareID", filterShareContent.f1572a);
            hashMap2.put("shareContent", new C0665d().mo2496a(filterShareContent.toString()));
            C0666e.m3839c("filterShareContent ==>>%s", hashMap2);
            return hashMap2;
        }

        /* access modifiers changed from: protected */
        public HashMap<String, Object> toMap() {
            HashMap<String, Object> hashMap = new HashMap<>();
            C0663b a = C0663b.m3793a(this.service.f1463a);
            hashMap.put("deviceid", a.mo2486o());
            hashMap.put("appkey", this.service.getAppKey());
            hashMap.put("apppkg", a.mo2487p());
            hashMap.put("appver", Integer.valueOf(a.mo2489r()));
            hashMap.put("sdkver", Integer.valueOf(this.service.getServiceVersionInt()));
            hashMap.put("plat", 1);
            hashMap.put("networktype", a.mo2483l());
            hashMap.put("deviceData", a.mo2477f());
            return hashMap;
        }

        public final String toString() {
            return new C0665d().mo2495a(toMap());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2148a(Context context) {
        this.f1463a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2149a(String str) {
        this.f1464b = str;
    }

    public String getAppKey() {
        return this.f1464b;
    }

    public Context getContext() {
        return this.f1463a;
    }

    public String getDeviceKey() {
        return C0663b.m3793a(this.f1463a).mo2486o();
    }

    /* access modifiers changed from: protected */
    public abstract int getServiceVersionInt();

    public abstract String getServiceVersionName();

    public void onBind() {
    }

    public void onUnbind() {
    }
}
