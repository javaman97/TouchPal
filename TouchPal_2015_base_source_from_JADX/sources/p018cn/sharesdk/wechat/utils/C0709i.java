package p018cn.sharesdk.wechat.utils;

import android.os.Bundle;

/* renamed from: cn.sharesdk.wechat.utils.i */
public abstract class C0709i {

    /* renamed from: c */
    public String f1720c;

    /* renamed from: a */
    public abstract int mo2664a();

    /* renamed from: a */
    public void mo2665a(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", mo2664a());
        bundle.putString("_wxapi_basereq_transaction", this.f1720c);
    }

    /* renamed from: b */
    public abstract boolean mo2666b();
}
