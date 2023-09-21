package p018cn.sharesdk.framework;

import android.content.Context;
import java.util.HashMap;
import p018cn.sharesdk.framework.p020b.p022b.C0645f;

/* renamed from: cn.sharesdk.framework.Platform */
public abstract class Platform {
    public static final int ACTION_AUTHORIZING = 1;
    protected static final int ACTION_CUSTOMER = 655360;
    public static final int ACTION_FOLLOWING_USER = 6;
    public static final int ACTION_GETTING_FRIEND_LIST = 2;
    public static final int ACTION_SENDING_DIRECT_MESSAGE = 5;
    public static final int ACTION_SHARE = 9;
    public static final int ACTION_TIMELINE = 7;
    public static final int ACTION_USER_INFOR = 8;
    public static final int CUSTOMER_ACTION_MASK = 65535;
    public static final int SHARE_APPS = 7;
    public static final int SHARE_EMOJI = 9;
    public static final int SHARE_FILE = 8;
    public static final int SHARE_IMAGE = 2;
    public static final int SHARE_MUSIC = 5;
    public static final int SHARE_TEXT = 1;
    public static final int SHARE_VIDEO = 6;
    public static final int SHARE_WEBPAGE = 4;

    /* renamed from: a */
    private C0652g f1460a;
    protected final Context context;
    /* access modifiers changed from: protected */

    /* renamed from: db */
    public final PlatformDb f1461db = this.f1460a.mo2412g();
    /* access modifiers changed from: protected */
    public PlatformActionListener listener = this.f1460a.mo2414i();

    /* renamed from: cn.sharesdk.framework.Platform$ShareParams */
    public static class ShareParams extends C0650e {
        public String imagePath;
        public String text;

        public ShareParams() {
        }

        public ShareParams(String str) {
            super(str);
        }

        public ShareParams(HashMap<String, Object> hashMap) {
            super(hashMap);
        }
    }

    public Platform(Context context2) {
        this.context = context2;
        this.f1460a = new C0652g(this, context2);
    }

    public void SSOSetting(boolean z) {
        this.f1460a.mo2401a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2100a() {
        return this.f1460a.mo2411f();
    }

    /* access modifiers changed from: protected */
    public void afterRegister(int i, Object obj) {
        this.f1460a.mo2407c(i, obj);
    }

    public void authorize() {
        authorize((String[]) null);
    }

    public void authorize(String[] strArr) {
        this.f1460a.mo2402a(strArr);
    }

    /* access modifiers changed from: protected */
    public abstract boolean checkAuthorize(int i, Object obj);

    public void customerProtocol(String str, String str2, short s, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        this.f1460a.mo2400a(str, str2, s, hashMap, hashMap2);
    }

    /* access modifiers changed from: protected */
    public abstract void doAuthorize(String[] strArr);

    /* access modifiers changed from: protected */
    public abstract void doCustomerProtocol(String str, String str2, int i, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2);

    /* access modifiers changed from: protected */
    public abstract void doShare(ShareParams shareParams);

    /* access modifiers changed from: protected */
    public abstract C0645f.C0646a filterShareContent(ShareParams shareParams, HashMap<String, Object> hashMap);

    /* access modifiers changed from: protected */
    public abstract void follow(String str);

    public void followFriend(String str) {
        this.f1460a.mo2405b(str);
    }

    public Context getContext() {
        return this.context;
    }

    public PlatformDb getDb() {
        return this.f1461db;
    }

    public String getDevinfo(String str) {
        return getDevinfo(getName(), str);
    }

    public String getDevinfo(String str, String str2) {
        return ShareSDK.m3519a(str, str2);
    }

    /* access modifiers changed from: protected */
    public abstract void getFriendList(int i, int i2, String str);

    public int getId() {
        return this.f1460a.mo2391a();
    }

    public abstract String getName();

    /* access modifiers changed from: protected */
    public String getNetworkDevinfo(int i, String str, String str2) {
        return this.f1460a.mo2392a(i, str, str2);
    }

    /* access modifiers changed from: protected */
    public String getNetworkDevinfo(String str, String str2) {
        return getNetworkDevinfo(getPlatformId(), str, str2);
    }

    public PlatformActionListener getPlatformActionListener() {
        return this.f1460a.mo2406c();
    }

    /* access modifiers changed from: protected */
    public abstract int getPlatformId();

    public String getShortLintk(String str, boolean z) {
        return this.f1460a.mo2393a(str, z);
    }

    public int getSortId() {
        return this.f1460a.mo2403b();
    }

    public void getTimeLine(String str, int i, int i2) {
        this.f1460a.mo2399a(str, i, i2);
    }

    public abstract int getVersion();

    /* access modifiers changed from: protected */
    public abstract void initDevInfo(String str);

    /* access modifiers changed from: protected */
    public void innerAuthorize(int i, Object obj) {
        this.f1460a.mo2395a(i, obj);
    }

    public boolean isSSODisable() {
        return this.f1460a.mo2410e();
    }

    public boolean isValid() {
        return this.f1460a.mo2409d();
    }

    public void listFriend(int i, int i2, String str) {
        this.f1460a.mo2394a(i, i2, str);
    }

    public void removeAccount() {
        this.f1460a.mo2413h();
    }

    /* access modifiers changed from: protected */
    public abstract void setNetworkDevinfo();

    public void setPlatformActionListener(PlatformActionListener platformActionListener) {
        this.f1460a.mo2397a(platformActionListener);
    }

    public void share(ShareParams shareParams) {
        this.f1460a.mo2396a(shareParams);
    }

    public void showUser(String str) {
        this.f1460a.mo2408c(str);
    }

    /* access modifiers changed from: protected */
    public abstract void timeline(int i, int i2, String str);

    /* access modifiers changed from: protected */
    public abstract void userInfor(String str);
}
