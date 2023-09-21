package p018cn.sharesdk.wechat.utils;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import p018cn.sharesdk.framework.utils.C0666e;
import p018cn.sharesdk.wechat.utils.WXMediaMessage;

/* renamed from: cn.sharesdk.wechat.utils.WXEmojiObject */
public class WXEmojiObject implements WXMediaMessage.IMediaObject {
    public byte[] emojiData;
    public String emojiPath;

    public WXEmojiObject() {
    }

    public WXEmojiObject(String str) {
        this.emojiPath = str;
    }

    public WXEmojiObject(byte[] bArr) {
        this.emojiData = bArr;
    }

    public boolean checkArgs() {
        if ((this.emojiData == null || this.emojiData.length == 0) && TextUtils.isEmpty(this.emojiPath)) {
            C0666e.m3839c("MicroMsg.SDK.WXEmojiObject", "checkArgs fail, both arguments is null");
            return false;
        } else if (this.emojiData == null || this.emojiData.length <= 10485760) {
            if (this.emojiPath != null) {
                File file = new File(this.emojiPath);
                if (!file.exists()) {
                    C0666e.m3839c("MicroMsg.SDK.WXEmojiObject", "checkArgs fail, emojiPath not found");
                    return false;
                } else if (file.length() > 10485760) {
                    C0666e.m3839c("MicroMsg.SDK.WXEmojiObject", "checkArgs fail, emojiSize is too large");
                    return false;
                }
            }
            return true;
        } else {
            C0666e.m3839c("MicroMsg.SDK.WXEmojiObject", "checkArgs fail, emojiData is too large");
            return false;
        }
    }

    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wxemojiobject_emojiData", this.emojiData);
        bundle.putString("_wxemojiobject_emojiPath", this.emojiPath);
    }

    public void setEmojiData(byte[] bArr) {
        this.emojiData = bArr;
    }

    public void setEmojiPath(String str) {
        this.emojiPath = str;
    }

    public int type() {
        return 8;
    }

    public void unserialize(Bundle bundle) {
        this.emojiData = bundle.getByteArray("_wxemojiobject_emojiData");
        this.emojiPath = bundle.getString("_wxemojiobject_emojiPath");
    }
}
