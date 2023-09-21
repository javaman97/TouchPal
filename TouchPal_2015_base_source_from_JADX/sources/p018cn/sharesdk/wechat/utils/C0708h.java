package p018cn.sharesdk.wechat.utils;

import android.os.Bundle;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.PlatformActionListener;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;
import p018cn.sharesdk.framework.utils.C0665d;
import p018cn.sharesdk.wechat.utils.WechatResp;

/* renamed from: cn.sharesdk.wechat.utils.h */
public class C0708h {

    /* renamed from: a */
    private Platform f1716a;

    /* renamed from: b */
    private Platform.ShareParams f1717b;

    /* renamed from: c */
    private PlatformActionListener f1718c;

    /* renamed from: d */
    private AuthorizeListener f1719d;

    public C0708h(Platform platform) {
        this.f1716a = platform;
    }

    /* renamed from: a */
    public Platform.ShareParams mo2672a() {
        return this.f1717b;
    }

    /* renamed from: a */
    public void mo2673a(Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
        this.f1717b = shareParams;
        this.f1718c = platformActionListener;
    }

    /* renamed from: a */
    public void mo2674a(AuthorizeListener authorizeListener) {
        this.f1719d = authorizeListener;
    }

    /* renamed from: a */
    public void mo2675a(WechatResp wechatResp) {
        switch (wechatResp.f1701e) {
            case WechatResp.ErrCode.ERR_AUTH_DENIED:
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", Integer.valueOf(wechatResp.f1701e));
                hashMap.put("errStr", wechatResp.f1702f);
                hashMap.put("transaction", wechatResp.f1703g);
                Throwable th = new Throwable(new C0665d().mo2495a((HashMap<String, Object>) hashMap));
                switch (wechatResp.mo2661a()) {
                    case 1:
                        if (this.f1719d != null) {
                            this.f1719d.onError(th);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case -3:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("errCode", Integer.valueOf(wechatResp.f1701e));
                hashMap2.put("errStr", wechatResp.f1702f);
                hashMap2.put("transaction", wechatResp.f1703g);
                Throwable th2 = new Throwable(new C0665d().mo2495a((HashMap<String, Object>) hashMap2));
                switch (wechatResp.mo2661a()) {
                    case 1:
                        if (this.f1719d != null) {
                            this.f1719d.onError(th2);
                            return;
                        }
                        return;
                    case 2:
                        if (this.f1718c != null) {
                            this.f1718c.onError(this.f1716a, 9, th2);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case -2:
                switch (wechatResp.mo2661a()) {
                    case 1:
                        if (this.f1719d != null) {
                            this.f1719d.onCancel();
                            return;
                        }
                        return;
                    case 2:
                        if (this.f1718c != null) {
                            this.f1718c.onCancel(this.f1716a, 9);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 0:
                switch (wechatResp.mo2661a()) {
                    case 1:
                        if (this.f1719d != null) {
                            Bundle bundle = new Bundle();
                            wechatResp.mo2663b(bundle);
                            this.f1719d.onComplete(bundle);
                            return;
                        }
                        return;
                    case 2:
                        if (this.f1718c != null) {
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("ShareParams", this.f1717b);
                            this.f1718c.onComplete(this.f1716a, 9, hashMap3);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            default:
                HashMap hashMap4 = new HashMap();
                hashMap4.put("req", wechatResp.getClass().getSimpleName());
                hashMap4.put("errCode", Integer.valueOf(wechatResp.f1701e));
                hashMap4.put("errStr", wechatResp.f1702f);
                hashMap4.put("transaction", wechatResp.f1703g);
                new Throwable(new C0665d().mo2495a((HashMap<String, Object>) hashMap4)).printStackTrace();
                return;
        }
    }

    /* renamed from: b */
    public Platform mo2676b() {
        return this.f1716a;
    }

    /* renamed from: c */
    public PlatformActionListener mo2677c() {
        return this.f1718c;
    }
}
