package p018cn.sharesdk.wechat.utils;

import android.os.Bundle;
import android.text.TextUtils;
import p018cn.sharesdk.framework.utils.C0666e;
import p018cn.sharesdk.wechat.utils.WXMediaMessage;

/* renamed from: cn.sharesdk.wechat.utils.WXMusicObject */
public class WXMusicObject implements WXMediaMessage.IMediaObject {
    public String musicDataUrl;
    public String musicLowBandDataUrl;
    public String musicLowBandUrl;
    public String musicUrl;

    public boolean checkArgs() {
        if (TextUtils.isEmpty(this.musicUrl) && TextUtils.isEmpty(this.musicLowBandUrl)) {
            C0666e.m3839c("both musicUrl and musicLowBandUrl are null", new Object[0]);
            return false;
        } else if (this.musicUrl != null && this.musicUrl.length() > 10240) {
            C0666e.m3839c("checkArgs fail, musicUrl is too long", new Object[0]);
            return false;
        } else if (this.musicLowBandUrl == null || this.musicLowBandUrl.length() <= 10240) {
            return true;
        } else {
            C0666e.m3839c("checkArgs fail, musicLowBandUrl is too long", new Object[0]);
            return false;
        }
    }

    public void serialize(Bundle bundle) {
        bundle.putString("_wxmusicobject_musicUrl", this.musicUrl);
        bundle.putString("_wxmusicobject_musicLowBandUrl", this.musicLowBandUrl);
        bundle.putString("_wxmusicobject_musicDataUrl", this.musicDataUrl);
        bundle.putString("_wxmusicobject_musicLowBandDataUrl", this.musicLowBandDataUrl);
    }

    public int type() {
        return 3;
    }

    public void unserialize(Bundle bundle) {
        this.musicUrl = bundle.getString("_wxmusicobject_musicUrl");
        this.musicLowBandUrl = bundle.getString("_wxmusicobject_musicLowBandUrl");
        this.musicDataUrl = bundle.getString("_wxmusicobject_musicDataUrl");
        this.musicLowBandDataUrl = bundle.getString("_wxmusicobject_musicLowBandDataUrl");
    }
}
