package p018cn.sharesdk.facebook;

import android.content.Context;
import com.cootek.smartinput5.net.cmd.C2250J;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;
import p018cn.sharesdk.framework.p020b.p022b.C0645f;
import p018cn.sharesdk.framework.utils.C0665d;

/* renamed from: cn.sharesdk.facebook.Facebook */
public class Facebook extends Platform {
    public static final String NAME = Facebook.class.getSimpleName();

    /* renamed from: a */
    private String f1445a;

    /* renamed from: cn.sharesdk.facebook.Facebook$ShareParams */
    public static class ShareParams extends Platform.ShareParams {
    }

    public Facebook(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean checkAuthorize(int i, Object obj) {
        if (isValid()) {
            C0607d a = C0607d.m3501a((Platform) this);
            a.mo2058a(this.f1445a);
            String token = this.f1461db.getToken();
            String valueOf = String.valueOf(this.f1461db.getExpiresIn());
            if (!(token == null || valueOf == null)) {
                a.mo2059a(token, valueOf);
                if (a.mo2061a()) {
                    return true;
                }
            }
        }
        innerAuthorize(i, obj);
        return false;
    }

    /* access modifiers changed from: protected */
    public void doAuthorize(String[] strArr) {
        C0607d a = C0607d.m3501a((Platform) this);
        a.mo2058a(this.f1445a);
        a.mo2060a(strArr);
        a.mo2057a((AuthorizeListener) new C0604a(this, a), isSSODisable());
    }

    /* access modifiers changed from: protected */
    public void doCustomerProtocol(String str, String str2, int i, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        try {
            HashMap<String, Object> a = C0607d.m3501a((Platform) this).mo2056a(str, str2, hashMap, hashMap2);
            if (a == null || a.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, i, new Throwable("response is null"));
                }
            } else if (a.containsKey(C2250J.f9627c) || a.containsKey("error")) {
                if (this.listener != null) {
                    this.listener.onError(this, i, new Throwable(new C0665d().mo2495a(a)));
                }
            } else if (this.listener != null) {
                this.listener.onComplete(this, i, a);
            }
        } catch (Throwable th) {
            if (this.listener != null) {
                this.listener.onError(this, i, th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void doShare(Platform.ShareParams shareParams) {
        C0607d a = C0607d.m3501a((Platform) this);
        try {
            String shortLintk = getShortLintk(shareParams.getText(), false);
            String imagePath = shareParams.getImagePath();
            HashMap<String, Object> b = imagePath == null ? a.mo2062b(shortLintk) : a.mo2063b(shortLintk, imagePath);
            if (b == null || b.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 9, new Throwable("response is null"));
                }
            } else if (b.containsKey(C2250J.f9627c) || b.containsKey("error")) {
                if (this.listener != null) {
                    this.listener.onError(this, 9, new Throwable(new C0665d().mo2495a(b)));
                }
            } else if (this.listener != null) {
                b.put("ShareParams", shareParams);
                this.listener.onComplete(this, 9, b);
            }
        } catch (Throwable th) {
            if (this.listener != null) {
                this.listener.onError(this, 9, th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public C0645f.C0646a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        C0645f.C0646a aVar = new C0645f.C0646a();
        aVar.f1573b = shareParams.getText();
        if (hashMap != null) {
            aVar.f1575d.add(String.valueOf(hashMap.get("source")));
            Object obj = hashMap.get("post_id");
            aVar.f1572a = obj == null ? null : String.valueOf(obj);
            aVar.f1578g = hashMap;
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void follow(String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 6);
        }
    }

    /* access modifiers changed from: protected */
    public void getFriendList(int i, int i2, String str) {
        try {
            HashMap<String, Object> a = C0607d.m3501a((Platform) this).mo2055a(i, i2, str);
            if (a == null || a.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable("response is null"));
                }
            } else if (a.containsKey(C2250J.f9627c) || a.containsKey("error")) {
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable(new C0665d().mo2495a(a)));
                }
            } else if (this.listener != null) {
                this.listener.onComplete(this, 2, a);
            }
        } catch (Throwable th) {
            if (this.listener != null) {
                this.listener.onError(this, 2, th);
            }
        }
    }

    public String getName() {
        return NAME;
    }

    public int getPlatformId() {
        return 10;
    }

    public int getVersion() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void initDevInfo(String str) {
        this.f1445a = getDevinfo("ConsumerKey");
    }

    /* access modifiers changed from: protected */
    public void setNetworkDevinfo() {
        this.f1445a = getNetworkDevinfo("api_key", "ConsumerKey");
    }

    /* access modifiers changed from: protected */
    public void timeline(int i, int i2, String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 7);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void userInfor(java.lang.String r10) {
        /*
            r9 = this;
            r8 = 8
            cn.sharesdk.facebook.d r0 = p018cn.sharesdk.facebook.C0607d.m3501a((p018cn.sharesdk.framework.Platform) r9)
            java.util.HashMap r2 = r0.mo2065d(r10)     // Catch:{ Throwable -> 0x004f }
            if (r2 == 0) goto L_0x0012
            int r0 = r2.size()     // Catch:{ Throwable -> 0x004f }
            if (r0 > 0) goto L_0x0025
        L_0x0012:
            cn.sharesdk.framework.PlatformActionListener r0 = r9.listener     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x0024
            cn.sharesdk.framework.PlatformActionListener r0 = r9.listener     // Catch:{ Throwable -> 0x004f }
            r1 = 8
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ Throwable -> 0x004f }
            java.lang.String r3 = "response is null"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x004f }
            r0.onError(r9, r1, r2)     // Catch:{ Throwable -> 0x004f }
        L_0x0024:
            return
        L_0x0025:
            java.lang.String r0 = "error_code"
            boolean r0 = r2.containsKey(r0)     // Catch:{ Throwable -> 0x004f }
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "error"
            boolean r0 = r2.containsKey(r0)     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x005a
        L_0x0035:
            cn.sharesdk.framework.PlatformActionListener r0 = r9.listener     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x0024
            cn.sharesdk.framework.utils.d r0 = new cn.sharesdk.framework.utils.d     // Catch:{ Throwable -> 0x004f }
            r0.<init>()     // Catch:{ Throwable -> 0x004f }
            java.lang.String r0 = r0.mo2495a((java.util.HashMap<java.lang.String, java.lang.Object>) r2)     // Catch:{ Throwable -> 0x004f }
            cn.sharesdk.framework.PlatformActionListener r1 = r9.listener     // Catch:{ Throwable -> 0x004f }
            r2 = 8
            java.lang.Throwable r3 = new java.lang.Throwable     // Catch:{ Throwable -> 0x004f }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x004f }
            r1.onError(r9, r2, r3)     // Catch:{ Throwable -> 0x004f }
            goto L_0x0024
        L_0x004f:
            r0 = move-exception
            cn.sharesdk.framework.PlatformActionListener r1 = r9.listener
            if (r1 == 0) goto L_0x0024
            cn.sharesdk.framework.PlatformActionListener r1 = r9.listener
            r1.onError(r9, r8, r0)
            goto L_0x0024
        L_0x005a:
            if (r10 != 0) goto L_0x02d5
            cn.sharesdk.framework.PlatformDb r0 = r9.f1461db     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = "id"
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x004f }
            r0.putUserId(r1)     // Catch:{ Throwable -> 0x004f }
            cn.sharesdk.framework.PlatformDb r0 = r9.f1461db     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = "nickname"
            java.lang.String r3 = "name"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x004f }
            r0.put(r1, r3)     // Catch:{ Throwable -> 0x004f }
            cn.sharesdk.framework.PlatformDb r1 = r9.f1461db     // Catch:{ Throwable -> 0x004f }
            java.lang.String r3 = "gender"
            java.lang.String r0 = "male"
            java.lang.String r4 = "gender"
            java.lang.Object r4 = r2.get(r4)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x004f }
            boolean r0 = r0.equals(r4)     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = "0"
        L_0x0094:
            r1.put(r3, r0)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r0 = "picture"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Throwable -> 0x004f }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x00bc
            java.lang.String r1 = "data"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Throwable -> 0x004f }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x00bc
            cn.sharesdk.framework.PlatformDb r1 = r9.f1461db     // Catch:{ Throwable -> 0x004f }
            java.lang.String r3 = "icon"
            java.lang.String r4 = "url"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x004f }
            r1.put(r3, r0)     // Catch:{ Throwable -> 0x004f }
        L_0x00bc:
            java.lang.String r0 = "birthday"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Throwable -> 0x01b7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x01b7 }
            java.lang.String r1 = "/"
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Throwable -> 0x01b7 }
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x01b7 }
            r3 = 1
            r4 = 2
            r4 = r0[r4]     // Catch:{ Throwable -> 0x01b7 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Throwable -> 0x01b7 }
            r1.set(r3, r4)     // Catch:{ Throwable -> 0x01b7 }
            r3 = 2
            r4 = 0
            r4 = r0[r4]     // Catch:{ Throwable -> 0x01b7 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Throwable -> 0x01b7 }
            int r4 = r4 + -1
            r1.set(r3, r4)     // Catch:{ Throwable -> 0x01b7 }
            r3 = 5
            r4 = 1
            r0 = r0[r4]     // Catch:{ Throwable -> 0x01b7 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x01b7 }
            r1.set(r3, r0)     // Catch:{ Throwable -> 0x01b7 }
            cn.sharesdk.framework.PlatformDb r0 = r9.f1461db     // Catch:{ Throwable -> 0x01b7 }
            java.lang.String r3 = "birthday"
            long r4 = r1.getTimeInMillis()     // Catch:{ Throwable -> 0x01b7 }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x01b7 }
            r0.put(r3, r1)     // Catch:{ Throwable -> 0x01b7 }
        L_0x0102:
            cn.sharesdk.framework.PlatformDb r1 = r9.f1461db     // Catch:{ Throwable -> 0x004f }
            java.lang.String r3 = "secretType"
            java.lang.String r0 = "true"
            java.lang.String r4 = "verified"
            java.lang.Object r4 = r2.get(r4)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x004f }
            boolean r0 = r0.equals(r4)     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x01bd
            java.lang.String r0 = "1"
        L_0x011a:
            r1.put(r3, r0)     // Catch:{ Throwable -> 0x004f }
            cn.sharesdk.framework.PlatformDb r0 = r9.f1461db     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = "snsUserUrl"
            java.lang.String r3 = "link"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x004f }
            r0.put(r1, r3)     // Catch:{ Throwable -> 0x004f }
            cn.sharesdk.framework.PlatformDb r0 = r9.f1461db     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = "resume"
            java.lang.String r3 = "link"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x004f }
            r0.put(r1, r3)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r0 = "education"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Throwable -> 0x004f }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x01ec
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x004f }
            r3.<init>()     // Catch:{ Throwable -> 0x004f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Throwable -> 0x004f }
        L_0x0152:
            boolean r0 = r4.hasNext()     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x01c6
            java.lang.Object r0 = r4.next()     // Catch:{ Throwable -> 0x004f }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Throwable -> 0x004f }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Throwable -> 0x004f }
            r5.<init>()     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = "school_type"
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x004f }
            r5.put(r1, r6)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = "school"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Throwable -> 0x004f }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Throwable -> 0x004f }
            if (r1 == 0) goto L_0x0186
            java.lang.String r6 = "school"
            java.lang.String r7 = "name"
            java.lang.Object r1 = r1.get(r7)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x004f }
            r5.put(r6, r1)     // Catch:{ Throwable -> 0x004f }
        L_0x0186:
            java.lang.String r1 = "year"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Throwable -> 0x01c1 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r1 = "year"
            java.lang.String r6 = "name"
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Throwable -> 0x01c1 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x01c1 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x01c1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x01c1 }
            r5.put(r1, r0)     // Catch:{ Throwable -> 0x01c1 }
        L_0x01a5:
            java.lang.String r0 = "background"
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x004f }
            r5.put(r0, r1)     // Catch:{ Throwable -> 0x004f }
            r3.add(r5)     // Catch:{ Throwable -> 0x004f }
            goto L_0x0152
        L_0x01b3:
            java.lang.String r0 = "1"
            goto L_0x0094
        L_0x01b7:
            r0 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r0)     // Catch:{ Throwable -> 0x004f }
            goto L_0x0102
        L_0x01bd:
            java.lang.String r0 = "0"
            goto L_0x011a
        L_0x01c1:
            r0 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r0)     // Catch:{ Throwable -> 0x004f }
            goto L_0x01a5
        L_0x01c6:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x004f }
            r0.<init>()     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = "list"
            r0.put(r1, r3)     // Catch:{ Throwable -> 0x004f }
            cn.sharesdk.framework.utils.d r1 = new cn.sharesdk.framework.utils.d     // Catch:{ Throwable -> 0x004f }
            r1.<init>()     // Catch:{ Throwable -> 0x004f }
            java.lang.String r0 = r1.mo2495a((java.util.HashMap<java.lang.String, java.lang.Object>) r0)     // Catch:{ Throwable -> 0x004f }
            cn.sharesdk.framework.PlatformDb r1 = r9.f1461db     // Catch:{ Throwable -> 0x004f }
            java.lang.String r3 = "educationJSONArrayStr"
            r4 = 8
            int r5 = r0.length()     // Catch:{ Throwable -> 0x004f }
            int r5 = r5 + -1
            java.lang.String r0 = r0.substring(r4, r5)     // Catch:{ Throwable -> 0x004f }
            r1.put(r3, r0)     // Catch:{ Throwable -> 0x004f }
        L_0x01ec:
            java.lang.String r0 = "work"
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Throwable -> 0x004f }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x02d5
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x004f }
            r3.<init>()     // Catch:{ Throwable -> 0x004f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Throwable -> 0x004f }
        L_0x01ff:
            boolean r0 = r4.hasNext()     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x02af
            java.lang.Object r0 = r4.next()     // Catch:{ Throwable -> 0x004f }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Throwable -> 0x004f }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Throwable -> 0x004f }
            r5.<init>()     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = "employer"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Throwable -> 0x004f }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Throwable -> 0x004f }
            if (r1 == 0) goto L_0x0229
            java.lang.String r6 = "company"
            java.lang.String r7 = "name"
            java.lang.Object r1 = r1.get(r7)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x004f }
            r5.put(r6, r1)     // Catch:{ Throwable -> 0x004f }
        L_0x0229:
            java.lang.String r1 = "position"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Throwable -> 0x004f }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Throwable -> 0x004f }
            if (r1 == 0) goto L_0x0242
            java.lang.String r6 = "position"
            java.lang.String r7 = "name"
            java.lang.Object r1 = r1.get(r7)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x004f }
            r5.put(r6, r1)     // Catch:{ Throwable -> 0x004f }
        L_0x0242:
            java.lang.String r1 = "start_date"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Throwable -> 0x029b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x029b }
            java.lang.String r6 = "-"
            java.lang.String[] r1 = r1.split(r6)     // Catch:{ Throwable -> 0x029b }
            r6 = 0
            r6 = r1[r6]     // Catch:{ Throwable -> 0x029b }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Throwable -> 0x029b }
            int r6 = r6 * 100
            r7 = 1
            r1 = r1[r7]     // Catch:{ Throwable -> 0x029b }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Throwable -> 0x029b }
            int r1 = r1 + r6
            java.lang.String r6 = "start_date"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x029b }
            r5.put(r6, r1)     // Catch:{ Throwable -> 0x029b }
        L_0x026c:
            java.lang.String r1 = "end_date"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Throwable -> 0x02a0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x02a0 }
            java.lang.String r1 = "-"
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Throwable -> 0x02a0 }
            r1 = 0
            r1 = r0[r1]     // Catch:{ Throwable -> 0x02a0 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Throwable -> 0x02a0 }
            int r1 = r1 * 100
            r6 = 1
            r0 = r0[r6]     // Catch:{ Throwable -> 0x02a0 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x02a0 }
            int r0 = r0 + r1
            java.lang.String r1 = "end_date"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x02a0 }
            r5.put(r1, r0)     // Catch:{ Throwable -> 0x02a0 }
        L_0x0296:
            r3.add(r5)     // Catch:{ Throwable -> 0x004f }
            goto L_0x01ff
        L_0x029b:
            r1 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r1)     // Catch:{ Throwable -> 0x004f }
            goto L_0x026c
        L_0x02a0:
            r0 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r0)     // Catch:{ Throwable -> 0x004f }
            java.lang.String r0 = "end_date"
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x004f }
            r5.put(r0, r1)     // Catch:{ Throwable -> 0x004f }
            goto L_0x0296
        L_0x02af:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x004f }
            r0.<init>()     // Catch:{ Throwable -> 0x004f }
            java.lang.String r1 = "list"
            r0.put(r1, r3)     // Catch:{ Throwable -> 0x004f }
            cn.sharesdk.framework.utils.d r1 = new cn.sharesdk.framework.utils.d     // Catch:{ Throwable -> 0x004f }
            r1.<init>()     // Catch:{ Throwable -> 0x004f }
            java.lang.String r0 = r1.mo2495a((java.util.HashMap<java.lang.String, java.lang.Object>) r0)     // Catch:{ Throwable -> 0x004f }
            cn.sharesdk.framework.PlatformDb r1 = r9.f1461db     // Catch:{ Throwable -> 0x004f }
            java.lang.String r3 = "workJSONArrayStr"
            r4 = 8
            int r5 = r0.length()     // Catch:{ Throwable -> 0x004f }
            int r5 = r5 + -1
            java.lang.String r0 = r0.substring(r4, r5)     // Catch:{ Throwable -> 0x004f }
            r1.put(r3, r0)     // Catch:{ Throwable -> 0x004f }
        L_0x02d5:
            cn.sharesdk.framework.PlatformActionListener r0 = r9.listener     // Catch:{ Throwable -> 0x004f }
            if (r0 == 0) goto L_0x0024
            cn.sharesdk.framework.PlatformActionListener r0 = r9.listener     // Catch:{ Throwable -> 0x004f }
            r1 = 8
            r0.onComplete(r9, r1, r2)     // Catch:{ Throwable -> 0x004f }
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: p018cn.sharesdk.facebook.Facebook.userInfor(java.lang.String):void");
    }
}
