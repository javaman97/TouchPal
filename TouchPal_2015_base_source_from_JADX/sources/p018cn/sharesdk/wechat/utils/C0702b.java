package p018cn.sharesdk.wechat.utils;

import android.os.Bundle;

/* renamed from: cn.sharesdk.wechat.utils.b */
public class C0702b extends WechatResp {

    /* renamed from: a */
    public String f1706a;

    /* renamed from: b */
    public String f1707b;

    /* renamed from: c */
    public int f1708c;

    /* renamed from: d */
    public String f1709d;

    public C0702b(Bundle bundle) {
        super(bundle);
    }

    /* renamed from: a */
    public int mo2661a() {
        return 1;
    }

    /* renamed from: a */
    public void mo2662a(Bundle bundle) {
        super.mo2662a(bundle);
        this.f1706a = bundle.getString("_wxapi_sendauth_resp_userName");
        this.f1707b = bundle.getString("_wxapi_sendauth_resp_token");
        this.f1708c = bundle.getInt("_wxapi_sendauth_resp_expireDate", 0);
        this.f1709d = bundle.getString("_wxapi_sendauth_resp_state");
    }

    /* renamed from: b */
    public void mo2663b(Bundle bundle) {
        super.mo2663b(bundle);
        bundle.putString("_wxapi_sendauth_resp_userName", this.f1706a);
        bundle.putString("_wxapi_sendauth_resp_token", this.f1707b);
        bundle.putInt("_wxapi_sendauth_resp_expireDate", this.f1708c);
        bundle.putString("_wxapi_sendauth_resp_state", this.f1709d);
    }
}
