package p018cn.sharesdk.twitter;

import android.content.Context;
import com.cootek.smartinput5.net.cmd.C2250J;
import java.util.ArrayList;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;
import p018cn.sharesdk.framework.p020b.p022b.C0645f;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.C0665d;

/* renamed from: cn.sharesdk.twitter.Twitter */
public class Twitter extends Platform {
    public static final String NAME = Twitter.class.getSimpleName();

    /* renamed from: a */
    private String f1679a;

    /* renamed from: b */
    private String f1680b;

    /* renamed from: c */
    private String f1681c;

    /* renamed from: cn.sharesdk.twitter.Twitter$ShareParams */
    public static class ShareParams extends Platform.ShareParams {
    }

    public Twitter(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean checkAuthorize(int i, Object obj) {
        if (isValid()) {
            C0697e a = C0697e.m3922a((Platform) this);
            a.mo2635a(this.f1679a, this.f1680b, this.f1681c);
            String token = this.f1461db.getToken();
            String tokenSecret = this.f1461db.getTokenSecret();
            if (!(token == null || tokenSecret == null)) {
                a.mo2634a(token, tokenSecret);
                return true;
            }
        }
        innerAuthorize(i, obj);
        return false;
    }

    /* access modifiers changed from: protected */
    public void doAuthorize(String[] strArr) {
        C0697e a = C0697e.m3922a((Platform) this);
        a.mo2635a(this.f1679a, this.f1680b, this.f1681c);
        a.mo2633a((AuthorizeListener) new C0693a(this, a));
    }

    /* access modifiers changed from: protected */
    public void doCustomerProtocol(String str, String str2, int i, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        try {
            HashMap<String, Object> a = C0697e.m3922a((Platform) this).mo2632a(str, str2, hashMap, hashMap2);
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
        C0697e a = C0697e.m3922a((Platform) this);
        String shortLintk = getShortLintk(shareParams.getText(), false);
        try {
            String imagePath = shareParams.getImagePath();
            HashMap<String, Object> c = imagePath == null ? a.mo2638c(shortLintk) : a.mo2637b(shortLintk, imagePath);
            if (c == null) {
                if (this.listener != null) {
                    this.listener.onError(this, 8, new Throwable("response is null"));
                }
            } else if (!c.containsKey(C2250J.f9627c) && !c.containsKey("error")) {
                c.put("ShareParams", shareParams);
                if (this.listener != null) {
                    this.listener.onComplete(this, 9, c);
                }
            } else if (this.listener != null) {
                this.listener.onError(this, 8, new Throwable(new C0665d().mo2495a(c)));
            }
        } catch (Throwable th) {
            if (this.listener != null) {
                this.listener.onError(this, 9, th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public C0645f.C0646a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        ArrayList arrayList;
        C0645f.C0646a aVar = new C0645f.C0646a();
        aVar.f1573b = shareParams.getText();
        if (hashMap != null) {
            HashMap hashMap2 = (HashMap) hashMap.get("entities");
            if (!(hashMap2 == null || (arrayList = (ArrayList) hashMap2.get("media")) == null || arrayList.size() <= 0 || ((HashMap) arrayList.get(0)) == null)) {
                aVar.f1575d.add(String.valueOf(hashMap.get("media_url")));
            }
            aVar.f1572a = String.valueOf(hashMap.get("id"));
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
            HashMap<String, Object> a = C0697e.m3922a((Platform) this).mo2631a(i, i2, str);
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
        return 11;
    }

    public int getVersion() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public void initDevInfo(String str) {
        this.f1679a = getDevinfo("ConsumerKey");
        this.f1680b = getDevinfo("ConsumerSecret");
        this.f1681c = getDevinfo("CallbackUrl");
    }

    /* access modifiers changed from: protected */
    public void setNetworkDevinfo() {
        this.f1679a = getNetworkDevinfo("consumer_key", "ConsumerKey");
        this.f1680b = getNetworkDevinfo("consumer_secret", "ConsumerSecret");
        this.f1681c = getNetworkDevinfo("redirect_uri", "CallbackUrl");
    }

    /* access modifiers changed from: protected */
    public void timeline(int i, int i2, String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 7);
        }
    }

    /* access modifiers changed from: protected */
    public void userInfor(String str) {
        try {
            HashMap<String, Object> b = C0697e.m3922a((Platform) this).mo2636b(str);
            if (b == null || b.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 8, new Throwable("response is null"));
                }
            } else if (!b.containsKey(C2250J.f9627c) && !b.containsKey("error")) {
                if (str == null) {
                    this.f1461db.put("nickname", String.valueOf(b.get("screen_name")));
                    this.f1461db.put("icon", String.valueOf(b.get("profile_image_url")));
                    this.f1461db.put("gender", "2");
                    this.f1461db.put("resume", String.valueOf(b.get("description")));
                    this.f1461db.put("secretType", "true".equals(String.valueOf(b.get("verified"))) ? "1" : "0");
                    this.f1461db.put("followerCount", String.valueOf(b.get("followers_count")));
                    this.f1461db.put("favouriteCount", String.valueOf(b.get("friends_count")));
                    this.f1461db.put("shareCount", String.valueOf(b.get("statuses_count")));
                    this.f1461db.put("snsregat", String.valueOf(C0661R.parseTwitterDate(String.valueOf(b.get("created_at")))));
                    this.f1461db.put("snsUserUrl", "https://twitter.com/" + b.get("screen_name"));
                }
                if (this.listener != null) {
                    this.listener.onComplete(this, 8, b);
                }
            } else if (this.listener != null) {
                this.listener.onError(this, 8, new Throwable(new C0665d().mo2495a(b)));
            }
        } catch (Throwable th) {
            if (this.listener != null) {
                this.listener.onError(this, 8, th);
            }
        }
    }
}
