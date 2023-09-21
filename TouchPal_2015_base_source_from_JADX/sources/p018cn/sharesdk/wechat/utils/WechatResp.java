package p018cn.sharesdk.wechat.utils;

import android.os.Bundle;

/* renamed from: cn.sharesdk.wechat.utils.WechatResp */
public abstract class WechatResp {

    /* renamed from: e */
    public int f1701e;

    /* renamed from: f */
    public String f1702f;

    /* renamed from: g */
    public String f1703g;

    /* renamed from: cn.sharesdk.wechat.utils.WechatResp$ErrCode */
    public interface ErrCode {
        public static final int ERR_AUTH_DENIED = -4;
        public static final int ERR_COMM = -1;
        public static final int ERR_OK = 0;
        public static final int ERR_SENT_FAILED = -3;
        public static final int ERR_UNSUPPORT = -5;
        public static final int ERR_USER_CANCEL = -2;
    }

    public WechatResp(Bundle bundle) {
        mo2662a(bundle);
    }

    /* renamed from: a */
    public abstract int mo2661a();

    /* renamed from: a */
    public void mo2662a(Bundle bundle) {
        this.f1701e = bundle.getInt("_wxapi_baseresp_errcode");
        this.f1702f = bundle.getString("_wxapi_baseresp_errstr");
        this.f1703g = bundle.getString("_wxapi_baseresp_transaction");
    }

    /* renamed from: b */
    public void mo2663b(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", mo2661a());
        bundle.putInt("_wxapi_baseresp_errcode", this.f1701e);
        bundle.putString("_wxapi_baseresp_errstr", this.f1702f);
        bundle.putString("_wxapi_baseresp_transaction", this.f1703g);
    }
}
