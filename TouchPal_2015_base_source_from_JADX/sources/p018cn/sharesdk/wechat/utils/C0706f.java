package p018cn.sharesdk.wechat.utils;

import android.os.Bundle;
import p018cn.sharesdk.wechat.utils.WXMediaMessage;

/* renamed from: cn.sharesdk.wechat.utils.f */
public class C0706f extends WechatResp {

    /* renamed from: a */
    public WXMediaMessage f1713a;

    public C0706f(Bundle bundle) {
        super(bundle);
    }

    /* renamed from: a */
    public int mo2661a() {
        return 4;
    }

    /* renamed from: a */
    public void mo2662a(Bundle bundle) {
        super.mo2662a(bundle);
        this.f1713a = WXMediaMessage.C0700a.m3943a(bundle);
    }

    /* renamed from: b */
    public void mo2663b(Bundle bundle) {
        super.mo2663b(bundle);
        bundle.putAll(WXMediaMessage.C0700a.m3942a(this.f1713a));
    }
}
