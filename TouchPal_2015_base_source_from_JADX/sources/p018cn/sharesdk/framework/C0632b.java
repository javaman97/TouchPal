package p018cn.sharesdk.framework;

import android.text.TextUtils;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.p020b.C0639b;
import p018cn.sharesdk.framework.p020b.p022b.C0642c;
import p018cn.sharesdk.framework.p020b.p022b.C0645f;
import p018cn.sharesdk.framework.utils.C0662a;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.b */
public class C0632b implements PlatformActionListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public PlatformActionListener f1507a;

    C0632b() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m3586a(Platform platform) {
        try {
            return m3587a(platform.getDb(), new String[]{"nickname", "icon", "gender", "snsUserUrl", "resume", "secretType", "secret", "birthday", "followerCount", "favouriteCount", "shareCount", "snsregat", "snsUserLevel", "educationJSONArrayStr", "workJSONArrayStr"});
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return null;
        }
    }

    /* renamed from: a */
    private String m3587a(PlatformDb platformDb, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        for (String str : strArr) {
            if (i > 0) {
                sb2.append('|');
                sb.append('|');
            }
            i++;
            String str2 = platformDb.get(str);
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
                sb2.append(C0662a.m3790c(str2, "utf-8"));
            }
        }
        C0666e.m3839c("======UserData: " + sb.toString(), new Object[0]);
        return sb2.toString();
    }

    /* renamed from: a */
    private void m3589a(Platform platform, int i, HashMap<String, Object> hashMap) {
        this.f1507a = new C0648c(this, this.f1507a, i, hashMap);
        platform.showUser((String) null);
    }

    /* renamed from: b */
    private String m3590b(Platform platform) {
        try {
            return m3587a(platform.getDb(), new String[]{"gender", "birthday", "secretType", "educationJSONArrayStr", "workJSONArrayStr"});
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return null;
        }
    }

    /* renamed from: b */
    private void m3591b(Platform platform, int i, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2;
        Platform.ShareParams shareParams = hashMap != null ? (Platform.ShareParams) hashMap.remove("ShareParams") : null;
        try {
            hashMap2 = (HashMap) hashMap.clone();
        } catch (Throwable th) {
            C0666e.m3838b(th);
            hashMap2 = hashMap;
        }
        if (this.f1507a != null) {
            this.f1507a.onComplete(platform, i, hashMap);
        }
        if (shareParams != null) {
            C0645f fVar = new C0645f();
            fVar.f1567b = "TencentWeibo".equals(platform.getName()) ? platform.getDb().get("name") : platform.getDb().getUserId();
            fVar.f1566a = platform.getPlatformId();
            C0645f.C0646a filterShareContent = platform.filterShareContent(shareParams, hashMap2);
            if (filterShareContent != null) {
                fVar.f1568c = filterShareContent.f1572a;
                fVar.f1570n = filterShareContent;
            }
            fVar.f1571o = m3590b(platform);
            C0639b.m3640a(platform.getContext()).mo2305a((C0642c) fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PlatformActionListener mo2271a() {
        return this.f1507a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2272a(Platform platform, int i, Object obj) {
        this.f1507a = new C0649d(this, this.f1507a, i, obj);
        platform.doAuthorize((String[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2273a(PlatformActionListener platformActionListener) {
        this.f1507a = platformActionListener;
    }

    public void onCancel(Platform platform, int i) {
        if (this.f1507a != null) {
            this.f1507a.onCancel(platform, i);
        }
    }

    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        if (!(platform instanceof CustomPlatform)) {
            switch (i) {
                case 1:
                    m3589a(platform, i, hashMap);
                    return;
                case 9:
                    m3591b(platform, i, hashMap);
                    return;
                default:
                    if (this.f1507a != null) {
                        this.f1507a.onComplete(platform, i, hashMap);
                        return;
                    }
                    return;
            }
        } else if (this.f1507a != null) {
            this.f1507a.onComplete(platform, i, hashMap);
        }
    }

    public void onError(Platform platform, int i, Throwable th) {
        if (this.f1507a != null) {
            this.f1507a.onError(platform, i, th);
        }
    }
}
