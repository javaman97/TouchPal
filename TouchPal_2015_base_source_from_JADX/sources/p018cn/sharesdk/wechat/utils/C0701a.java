package p018cn.sharesdk.wechat.utils;

import android.os.Bundle;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.wechat.utils.a */
public class C0701a extends C0709i {

    /* renamed from: a */
    public String f1704a;

    /* renamed from: b */
    public String f1705b;

    /* renamed from: a */
    public int mo2664a() {
        return 1;
    }

    /* renamed from: a */
    public void mo2665a(Bundle bundle) {
        super.mo2665a(bundle);
        bundle.putInt("_wxapi_command_type", mo2664a());
        bundle.putString("_wxapi_sendauth_req_scope", this.f1704a);
        bundle.putString("_wxapi_sendauth_req_state", this.f1705b);
    }

    /* renamed from: b */
    public boolean mo2666b() {
        if (this.f1704a == null || this.f1704a.length() == 0 || this.f1704a.length() > 1024) {
            C0666e.m3839c("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, scope is invalid");
            return false;
        } else if (this.f1705b == null || this.f1705b.length() <= 1024) {
            return true;
        } else {
            C0666e.m3839c("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, state is invalid");
            return false;
        }
    }
}
