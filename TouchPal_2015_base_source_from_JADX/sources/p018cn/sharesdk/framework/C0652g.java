package p018cn.sharesdk.framework;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.p020b.C0639b;
import p018cn.sharesdk.framework.utils.C0662a;
import p018cn.sharesdk.framework.utils.C0665d;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.g */
public class C0652g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Platform f1592a;

    /* renamed from: b */
    private Context f1593b;

    /* renamed from: c */
    private PlatformDb f1594c;

    /* renamed from: d */
    private C0632b f1595d;

    /* renamed from: e */
    private int f1596e;

    /* renamed from: f */
    private int f1597f;

    /* renamed from: g */
    private boolean f1598g;

    /* renamed from: h */
    private boolean f1599h = true;

    /* renamed from: i */
    private boolean f1600i;

    public C0652g(Platform platform, Context context) {
        this.f1592a = platform;
        this.f1593b = context;
        String name = platform.getName();
        this.f1594c = new PlatformDb(context, name, platform.getVersion());
        mo2398a(name);
        this.f1595d = new C0632b();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m3711j() {
        if (!ShareSDK.m3520a()) {
            return true;
        }
        if (ShareSDK.m3522b()) {
            String a = mo2392a(this.f1592a.getPlatformId(), "covert_url", (String) null);
            if (a != null) {
                a.trim();
            }
            this.f1599h = "true".equals(a);
            this.f1592a.setNetworkDevinfo();
            return true;
        }
        try {
            HashMap hashMap = new HashMap();
            if (!C0639b.m3640a(this.f1593b).mo2308a((HashMap<String, Object>) hashMap)) {
                return false;
            }
            if (!ShareSDK.m3521a(hashMap)) {
                System.err.println("Failed to parse network dev-info: " + new C0665d().mo2495a((HashMap<String, Object>) hashMap));
                return false;
            }
            String a2 = mo2392a(this.f1592a.getPlatformId(), "covert_url", (String) null);
            if (a2 != null) {
                a2.trim();
            }
            this.f1599h = "true".equals(a2);
            this.f1592a.setNetworkDevinfo();
            return true;
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return false;
        }
    }

    /* renamed from: k */
    private String m3712k() {
        StringBuilder sb = new StringBuilder();
        try {
            if ("TencentWeibo".equals(this.f1592a.getName())) {
                C0666e.m3839c("user id %s ==>>", mo2412g().getUserName());
                sb.append(C0662a.m3790c(mo2412g().getUserName(), "utf-8"));
            } else {
                sb.append(C0662a.m3790c(mo2412g().getUserId(), "utf-8"));
            }
            sb.append("|").append(C0662a.m3790c(mo2412g().get("secretType"), "utf-8"));
            sb.append("|").append(C0662a.m3790c(mo2412g().get("gender"), "utf-8"));
            sb.append("|").append(C0662a.m3790c(mo2412g().get("birthday"), "utf-8"));
            sb.append("|").append(C0662a.m3790c(mo2412g().get("educationJSONArrayStr"), "utf-8"));
            sb.append("|").append(C0662a.m3790c(mo2412g().get("workJSONArrayStr"), "utf-8"));
        } catch (Throwable th) {
            C0666e.m3838b(th);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo2391a() {
        return this.f1596e;
    }

    /* renamed from: a */
    public String mo2392a(int i, String str, String str2) {
        String a = ShareSDK.m3518a(i, str);
        return (TextUtils.isEmpty(a) || "null".equals(a)) ? this.f1592a.getDevinfo(this.f1592a.getName(), str2) : a;
    }

    /* renamed from: a */
    public String mo2393a(String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f1599h) {
            C0666e.m3839c("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return str;
        } else if (TextUtils.isEmpty(str)) {
            C0666e.m3839c("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return str;
        } else {
            String a = C0639b.m3640a(this.f1593b).mo2303a(str, z, this.f1592a.getPlatformId(), m3712k());
            C0666e.m3839c("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return a;
        }
    }

    /* renamed from: a */
    public void mo2394a(int i, int i2, String str) {
        mo2404b(2, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str});
    }

    /* renamed from: a */
    public void mo2395a(int i, Object obj) {
        this.f1595d.mo2272a(this.f1592a, i, obj);
    }

    /* renamed from: a */
    public void mo2396a(Platform.ShareParams shareParams) {
        if (shareParams != null) {
            mo2404b(9, shareParams);
        } else if (this.f1595d != null) {
            this.f1595d.onError(this.f1592a, 9, new NullPointerException());
        }
    }

    /* renamed from: a */
    public void mo2397a(PlatformActionListener platformActionListener) {
        this.f1595d.mo2273a(platformActionListener);
    }

    /* renamed from: a */
    public void mo2398a(String str) {
        try {
            this.f1596e = Integer.parseInt(ShareSDK.m3519a(str, "Id").trim());
        } catch (Throwable th) {
            if (!(this.f1592a instanceof CustomPlatform)) {
                System.err.println(this.f1592a.getName() + " failed to parse Id, this will cause method getId() always returens 0");
            }
        }
        try {
            this.f1597f = Integer.parseInt(ShareSDK.m3519a(str, "SortId").trim());
        } catch (Throwable th2) {
            if (!(this.f1592a instanceof CustomPlatform)) {
                System.err.println(this.f1592a.getName() + " failed to parse SortId, this won't cause any problem, don't worry");
            }
        }
        String a = ShareSDK.m3519a(str, "Enable");
        if (a == null) {
            this.f1600i = true;
            if (!(this.f1592a instanceof CustomPlatform)) {
                System.err.println(this.f1592a.getName() + " failed to parse Enable, this will cause platform always be enable");
            }
        } else {
            this.f1600i = "true".equals(a.trim());
        }
        this.f1592a.initDevInfo(str);
    }

    /* renamed from: a */
    public void mo2399a(String str, int i, int i2) {
        mo2404b(7, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str});
    }

    /* renamed from: a */
    public void mo2400a(String str, String str2, short s, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        mo2404b(655360 | s, new Object[]{str, str2, hashMap, hashMap2});
    }

    /* renamed from: a */
    public void mo2401a(boolean z) {
        this.f1598g = z;
    }

    /* renamed from: a */
    public void mo2402a(String[] strArr) {
        new C0653h(this, strArr).start();
    }

    /* renamed from: b */
    public int mo2403b() {
        return this.f1597f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2404b(int i, Object obj) {
        new C0654i(this, i, obj).start();
    }

    /* renamed from: b */
    public void mo2405b(String str) {
        mo2404b(6, str);
    }

    /* renamed from: c */
    public PlatformActionListener mo2406c() {
        return this.f1595d.mo2271a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo2407c(int i, Object obj) {
        Object obj2;
        switch (i) {
            case 1:
                if (this.f1595d != null) {
                    this.f1595d.onComplete(this.f1592a, 1, (HashMap<String, Object>) null);
                    return;
                }
                return;
            case 2:
                Object[] objArr = (Object[]) obj;
                this.f1592a.getFriendList(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), (String) objArr[2]);
                return;
            case 6:
                this.f1592a.follow((String) obj);
                return;
            case 7:
                Object[] objArr2 = (Object[]) obj;
                this.f1592a.timeline(((Integer) objArr2[0]).intValue(), ((Integer) objArr2[1]).intValue(), (String) objArr2[2]);
                return;
            case 8:
                this.f1592a.userInfor(obj == null ? null : (String) obj);
                return;
            case 9:
                Platform.ShareParams shareParams = (Platform.ShareParams) obj;
                HashMap<String, Object> map = shareParams.toMap();
                for (Field field : shareParams.getClass().getFields()) {
                    if (map.get(field.getName()) == null) {
                        field.setAccessible(true);
                        try {
                            obj2 = field.get(shareParams);
                        } catch (Throwable th) {
                            C0666e.m3838b(th);
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            map.put(field.getName(), obj2);
                        }
                    }
                }
                this.f1592a.doShare(shareParams);
                return;
            default:
                Object[] objArr3 = (Object[]) obj;
                this.f1592a.doCustomerProtocol(String.valueOf(objArr3[0]), String.valueOf(objArr3[1]), i, (HashMap) objArr3[2], (HashMap) objArr3[3]);
                return;
        }
    }

    /* renamed from: c */
    public void mo2408c(String str) {
        mo2404b(8, str);
    }

    /* renamed from: d */
    public boolean mo2409d() {
        return this.f1594c.isValid();
    }

    /* renamed from: e */
    public boolean mo2410e() {
        return this.f1598g;
    }

    /* renamed from: f */
    public boolean mo2411f() {
        return this.f1600i;
    }

    /* renamed from: g */
    public PlatformDb mo2412g() {
        return this.f1594c;
    }

    /* renamed from: h */
    public void mo2413h() {
        this.f1594c.removeAccount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public PlatformActionListener mo2414i() {
        return this.f1595d;
    }
}
