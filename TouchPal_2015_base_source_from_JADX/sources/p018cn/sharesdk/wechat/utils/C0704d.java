package p018cn.sharesdk.wechat.utils;

import android.os.Bundle;
import p018cn.sharesdk.framework.utils.C0666e;
import p018cn.sharesdk.wechat.utils.WXMediaMessage;

/* renamed from: cn.sharesdk.wechat.utils.d */
public class C0704d extends C0709i {

    /* renamed from: a */
    public WXMediaMessage f1711a;

    /* renamed from: b */
    public int f1712b;

    /* renamed from: a */
    public int mo2664a() {
        return 2;
    }

    /* renamed from: a */
    public void mo2665a(Bundle bundle) {
        super.mo2665a(bundle);
        bundle.putAll(WXMediaMessage.C0700a.m3942a(this.f1711a));
        bundle.putInt("_wxapi_sendmessagetowx_req_scene", this.f1712b);
    }

    /* renamed from: b */
    public boolean mo2666b() {
        if (this.f1711a.getType() == 8 && (this.f1711a.thumbData == null || this.f1711a.thumbData.length <= 0)) {
            C0666e.m3839c("checkArgs fail, thumbData should not be null when send emoji", new Object[0]);
            return false;
        } else if (this.f1711a.thumbData != null && this.f1711a.thumbData.length > 32768) {
            C0666e.m3839c("checkArgs fail, thumbData is invalid", new Object[0]);
            return false;
        } else if (this.f1711a.title == null || this.f1711a.title.length() <= 512) {
            if (this.f1711a.description != null && this.f1711a.description.length() > 1024) {
                this.f1711a.description = this.f1711a.description.substring(0, 1021) + "...";
            }
            if (this.f1711a.mediaObject != null) {
                return this.f1711a.mediaObject.checkArgs();
            }
            C0666e.m3839c("checkArgs fail, mediaObject is null", new Object[0]);
            return false;
        } else {
            C0666e.m3839c("checkArgs fail, title is invalid", new Object[0]);
            return false;
        }
    }
}
