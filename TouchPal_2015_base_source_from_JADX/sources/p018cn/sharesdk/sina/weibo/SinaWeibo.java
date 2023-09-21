package p018cn.sharesdk.sina.weibo;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput5.net.cmd.C2250J;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;
import p018cn.sharesdk.framework.p020b.p022b.C0645f;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.C0665d;

/* renamed from: cn.sharesdk.sina.weibo.SinaWeibo */
public class SinaWeibo extends Platform {
    public static final String NAME = SinaWeibo.class.getSimpleName();

    /* renamed from: a */
    private String f1658a;

    /* renamed from: b */
    private String f1659b;

    /* renamed from: c */
    private String f1660c;

    /* renamed from: d */
    private boolean f1661d;

    /* renamed from: cn.sharesdk.sina.weibo.SinaWeibo$ShareParams */
    public static class ShareParams extends Platform.ShareParams {
        public String imageUrl;
        public float latitude;
        public float longitude;
    }

    public SinaWeibo(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean checkAuthorize(int i, Object obj) {
        C0691e a = C0691e.m3893a((Platform) this);
        if (i == 9 && this.f1661d && a.mo2622a()) {
            return true;
        }
        if (isValid()) {
            a.mo2619a(this.f1658a, this.f1659b);
            a.mo2624b(this.f1461db.getToken());
            return true;
        }
        innerAuthorize(i, obj);
        return false;
    }

    /* access modifiers changed from: protected */
    public void doAuthorize(String[] strArr) {
        C0691e a = C0691e.m3893a((Platform) this);
        a.mo2619a(this.f1658a, this.f1659b);
        a.mo2618a(this.f1660c);
        a.mo2621a(strArr);
        a.mo2617a((AuthorizeListener) new C0687a(this, a), isSSODisable());
    }

    /* access modifiers changed from: protected */
    public void doCustomerProtocol(String str, String str2, int i, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        try {
            HashMap<String, Object> a = C0691e.m3893a((Platform) this).mo2616a(str, str2, hashMap, hashMap2);
            if (a == null || a.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, i, new Throwable());
                }
            } else if (!a.containsKey(C2250J.f9627c) || ((Integer) a.get(C2250J.f9627c)).intValue() == 0) {
                if (this.listener != null) {
                    this.listener.onComplete(this, i, a);
                }
            } else if (this.listener != null) {
                this.listener.onError(this, i, new Throwable(new C0665d().mo2495a(a)));
            }
        } catch (Throwable th) {
            this.listener.onError(this, i, th);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = p018cn.sharesdk.framework.utils.C0661R.getStringRes(getContext(), "weibo_upload_content");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doShare(p018cn.sharesdk.framework.Platform.ShareParams r8) {
        /*
            r7 = this;
            r6 = 9
            java.lang.String r0 = r8.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x00c3
            android.content.Context r1 = r7.getContext()
            java.lang.String r2 = "weibo_upload_content"
            int r1 = p018cn.sharesdk.framework.utils.C0661R.getStringRes(r1, r2)
            if (r1 <= 0) goto L_0x00c3
            android.content.Context r0 = r7.getContext()
            java.lang.String r0 = r0.getString(r1)
            r1 = r0
        L_0x0021:
            cn.sharesdk.sina.weibo.e r0 = p018cn.sharesdk.sina.weibo.C0691e.m3893a((p018cn.sharesdk.framework.Platform) r7)
            r2 = 0
            java.lang.String r1 = r7.getShortLintk(r1, r2)
            java.lang.String r3 = r8.getImagePath()
            java.lang.String r2 = r8.getImageUrl()
            boolean r4 = r7.f1661d
            if (r4 == 0) goto L_0x005c
            boolean r4 = r0.mo2622a()
            if (r4 == 0) goto L_0x005c
            r0.mo2620a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0055 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x0055 }
            r0.<init>()     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r1 = "ShareParams"
            r0.put(r1, r8)     // Catch:{ Throwable -> 0x0055 }
            cn.sharesdk.framework.PlatformActionListener r1 = r7.listener     // Catch:{ Throwable -> 0x0055 }
            if (r1 == 0) goto L_0x0054
            cn.sharesdk.framework.PlatformActionListener r1 = r7.listener     // Catch:{ Throwable -> 0x0055 }
            r2 = 9
            r1.onComplete(r7, r2, r0)     // Catch:{ Throwable -> 0x0055 }
        L_0x0054:
            return
        L_0x0055:
            r0 = move-exception
            cn.sharesdk.framework.PlatformActionListener r1 = r7.listener
            r1.onError(r7, r6, r0)
            goto L_0x0054
        L_0x005c:
            float r5 = r8.getLatitude()     // Catch:{ Throwable -> 0x007b }
            float r4 = r8.getLongitude()     // Catch:{ Throwable -> 0x007b }
            java.util.HashMap r1 = r0.mo2615a(r1, r2, r3, r4, r5)     // Catch:{ Throwable -> 0x007b }
            if (r1 != 0) goto L_0x0082
            cn.sharesdk.framework.PlatformActionListener r0 = r7.listener     // Catch:{ Throwable -> 0x007b }
            if (r0 == 0) goto L_0x0054
            cn.sharesdk.framework.PlatformActionListener r0 = r7.listener     // Catch:{ Throwable -> 0x007b }
            r1 = 9
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ Throwable -> 0x007b }
            r2.<init>()     // Catch:{ Throwable -> 0x007b }
            r0.onError(r7, r1, r2)     // Catch:{ Throwable -> 0x007b }
            goto L_0x0054
        L_0x007b:
            r0 = move-exception
            cn.sharesdk.framework.PlatformActionListener r1 = r7.listener
            r1.onError(r7, r6, r0)
            goto L_0x0054
        L_0x0082:
            java.lang.String r0 = "error_code"
            boolean r0 = r1.containsKey(r0)     // Catch:{ Throwable -> 0x007b }
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = "error_code"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Throwable -> 0x007b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Throwable -> 0x007b }
            int r0 = r0.intValue()     // Catch:{ Throwable -> 0x007b }
            if (r0 == 0) goto L_0x00b2
            cn.sharesdk.framework.PlatformActionListener r0 = r7.listener     // Catch:{ Throwable -> 0x007b }
            if (r0 == 0) goto L_0x0054
            cn.sharesdk.framework.utils.d r0 = new cn.sharesdk.framework.utils.d     // Catch:{ Throwable -> 0x007b }
            r0.<init>()     // Catch:{ Throwable -> 0x007b }
            java.lang.String r0 = r0.mo2495a((java.util.HashMap<java.lang.String, java.lang.Object>) r1)     // Catch:{ Throwable -> 0x007b }
            cn.sharesdk.framework.PlatformActionListener r1 = r7.listener     // Catch:{ Throwable -> 0x007b }
            r2 = 9
            java.lang.Throwable r3 = new java.lang.Throwable     // Catch:{ Throwable -> 0x007b }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x007b }
            r1.onError(r7, r2, r3)     // Catch:{ Throwable -> 0x007b }
            goto L_0x0054
        L_0x00b2:
            java.lang.String r0 = "ShareParams"
            r1.put(r0, r8)     // Catch:{ Throwable -> 0x007b }
            cn.sharesdk.framework.PlatformActionListener r0 = r7.listener     // Catch:{ Throwable -> 0x007b }
            if (r0 == 0) goto L_0x0054
            cn.sharesdk.framework.PlatformActionListener r0 = r7.listener     // Catch:{ Throwable -> 0x007b }
            r2 = 9
            r0.onComplete(r7, r2, r1)     // Catch:{ Throwable -> 0x007b }
            goto L_0x0054
        L_0x00c3:
            r1 = r0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: p018cn.sharesdk.sina.weibo.SinaWeibo.doShare(cn.sharesdk.framework.Platform$ShareParams):void");
    }

    /* access modifiers changed from: protected */
    public C0645f.C0646a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        C0645f.C0646a aVar = new C0645f.C0646a();
        aVar.f1573b = shareParams.getText();
        if (hashMap != null) {
            aVar.f1572a = String.valueOf(hashMap.get("id"));
            aVar.f1575d.add(String.valueOf(hashMap.get("original_pic")));
            aVar.f1578g = hashMap;
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void follow(String str) {
        try {
            HashMap<String, Object> d = C0691e.m3893a((Platform) this).mo2626d(str);
            if (d == null) {
                if (this.listener != null) {
                    this.listener.onError(this, 6, new Throwable());
                }
            } else if (!d.containsKey(C2250J.f9627c) || ((Integer) d.get(C2250J.f9627c)).intValue() == 0) {
                if (this.listener != null) {
                    this.listener.onComplete(this, 6, d);
                }
            } else if (this.listener != null) {
                this.listener.onError(this, 6, new Throwable(new C0665d().mo2495a(d)));
            }
        } catch (Throwable th) {
            this.listener.onError(this, 6, th);
        }
    }

    /* access modifiers changed from: protected */
    public void getFriendList(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.f1461db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f1461db.get("nickname");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                HashMap<String, Object> b = C0691e.m3893a((Platform) this).mo2623b(i, i2, str);
                if (b == null) {
                    if (this.listener != null) {
                        this.listener.onError(this, 2, new Throwable());
                    }
                } else if (!b.containsKey(C2250J.f9627c) || ((Integer) b.get(C2250J.f9627c)).intValue() == 0) {
                    if (this.listener != null) {
                        this.listener.onComplete(this, 2, b);
                    }
                } else if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable(new C0665d().mo2495a(b)));
                }
            } catch (Throwable th) {
                this.listener.onError(this, 2, th);
            }
        } else if (this.listener != null) {
            this.listener.onError(this, 2, new RuntimeException("Both weibo id and screen_name are null"));
        }
    }

    public String getName() {
        return NAME;
    }

    public int getPlatformId() {
        return 1;
    }

    public int getVersion() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void initDevInfo(String str) {
        this.f1658a = getDevinfo("AppKey");
        this.f1659b = getDevinfo("AppSecret");
        this.f1660c = getDevinfo("RedirectUrl");
        this.f1661d = "true".equals(getDevinfo("ShareByAppClient"));
    }

    /* access modifiers changed from: protected */
    public void setNetworkDevinfo() {
        this.f1658a = getNetworkDevinfo("app_key", "AppKey");
        this.f1659b = getNetworkDevinfo("app_secret", "AppSecret");
        this.f1660c = getNetworkDevinfo("redirect_uri", "RedirectUrl");
    }

    /* access modifiers changed from: protected */
    public void timeline(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.f1461db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f1461db.get("nickname");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                HashMap<String, Object> a = C0691e.m3893a((Platform) this).mo2614a(i, i2, str);
                if (a == null) {
                    if (this.listener != null) {
                        this.listener.onError(this, 7, new Throwable());
                    }
                } else if (!a.containsKey(C2250J.f9627c) || ((Integer) a.get(C2250J.f9627c)).intValue() == 0) {
                    if (this.listener != null) {
                        this.listener.onComplete(this, 7, a);
                    }
                } else if (this.listener != null) {
                    this.listener.onError(this, 7, new Throwable(new C0665d().mo2495a(a)));
                }
            } catch (Throwable th) {
                this.listener.onError(this, 7, th);
            }
        } else if (this.listener != null) {
            this.listener.onError(this, 7, new RuntimeException("Both weibo id and screen_name are null"));
        }
    }

    /* access modifiers changed from: protected */
    public void userInfor(String str) {
        boolean z = true;
        boolean z2 = false;
        if (TextUtils.isEmpty(str)) {
            str = this.f1461db.getUserId();
            z2 = true;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f1461db.get("nickname");
        } else {
            z = z2;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                HashMap<String, Object> c = C0691e.m3893a((Platform) this).mo2625c(str);
                if (c == null) {
                    if (this.listener != null) {
                        this.listener.onError(this, 8, new Throwable());
                    }
                } else if (!c.containsKey(C2250J.f9627c) || ((Integer) c.get(C2250J.f9627c)).intValue() == 0) {
                    if (z) {
                        this.f1461db.putUserId(String.valueOf(c.get("id")));
                        this.f1461db.put("nickname", String.valueOf(c.get("screen_name")));
                        this.f1461db.put("icon", String.valueOf(c.get("avatar_large")));
                        if (String.valueOf(c.get("verified")).equals("true")) {
                            this.f1461db.put("secretType", "1");
                        } else {
                            this.f1461db.put("secretType", "0");
                        }
                        this.f1461db.put("secret", String.valueOf(c.get("verified_reason")));
                        String valueOf = String.valueOf(c.get("gender"));
                        if (valueOf.equals("m")) {
                            this.f1461db.put("gender", "0");
                        } else if (valueOf.equals("f")) {
                            this.f1461db.put("gender", "1");
                        } else {
                            this.f1461db.put("gender", "2");
                        }
                        this.f1461db.put("snsUserUrl", "http://weibo.com/" + String.valueOf(c.get("profile_url")));
                        this.f1461db.put("resume", String.valueOf(c.get("description")));
                        this.f1461db.put("followerCount", String.valueOf(c.get("followers_count")));
                        this.f1461db.put("favouriteCount", String.valueOf(c.get("friends_count")));
                        this.f1461db.put("shareCount", String.valueOf(c.get("statuses_count")));
                        this.f1461db.put("snsregat", String.valueOf(C0661R.parseTwitterDate(String.valueOf(c.get("created_at")))));
                    }
                    if (this.listener != null) {
                        this.listener.onComplete(this, 8, c);
                    }
                } else if (this.listener != null) {
                    this.listener.onError(this, 8, new Throwable(new C0665d().mo2495a(c)));
                }
            } catch (Throwable th) {
                this.listener.onError(this, 8, th);
            }
        } else if (this.listener != null) {
            this.listener.onError(this, 8, new RuntimeException("Both weibo id and screen_name are null"));
        }
    }
}
