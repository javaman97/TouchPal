package p018cn.sharesdk.wechat.utils;

import android.os.Bundle;
import p018cn.sharesdk.framework.utils.C0666e;
import p018cn.sharesdk.wechat.utils.WXMediaMessage;

/* renamed from: cn.sharesdk.wechat.utils.WXWebpageObject */
public class WXWebpageObject implements WXMediaMessage.IMediaObject {
    public String webpageUrl;

    public WXWebpageObject() {
    }

    public WXWebpageObject(String str) {
        this.webpageUrl = str;
    }

    public boolean checkArgs() {
        if (this.webpageUrl != null && this.webpageUrl.length() != 0 && this.webpageUrl.length() <= 10240) {
            return true;
        }
        C0666e.m3839c("checkArgs fail, webpageUrl is invalid", new Object[0]);
        return false;
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxwebpageobject_webpageUrl", this.webpageUrl);
    }

    public int type() {
        return 5;
    }

    public void unserialize(Bundle bundle) {
        this.webpageUrl = bundle.getString("_wxwebpageobject_webpageUrl");
    }
}
