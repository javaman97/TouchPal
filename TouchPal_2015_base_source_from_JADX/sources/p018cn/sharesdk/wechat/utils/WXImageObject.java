package p018cn.sharesdk.wechat.utils;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.io.ByteArrayOutputStream;
import java.io.File;
import p018cn.sharesdk.framework.utils.C0666e;
import p018cn.sharesdk.wechat.utils.WXMediaMessage;

/* renamed from: cn.sharesdk.wechat.utils.WXImageObject */
public class WXImageObject implements WXMediaMessage.IMediaObject {
    public byte[] imageData;
    public String imagePath;
    public String imageUrl;

    public WXImageObject() {
    }

    public WXImageObject(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.imageData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception e) {
            C0666e.m3838b(e);
        }
    }

    public WXImageObject(byte[] bArr) {
        this.imageData = bArr;
    }

    public boolean checkArgs() {
        if ((this.imageData == null || this.imageData.length == 0) && ((this.imagePath == null || this.imagePath.length() == 0) && (this.imageUrl == null || this.imageUrl.length() == 0))) {
            C0666e.m3839c("checkArgs fail, all arguments are null", new Object[0]);
            return false;
        } else if (this.imageData != null && this.imageData.length > 10485760) {
            C0666e.m3839c("checkArgs fail, content is too large", new Object[0]);
            return false;
        } else if (this.imagePath != null && this.imagePath.length() > 10240) {
            C0666e.m3839c("checkArgs fail, path is invalid", new Object[0]);
            return false;
        } else if (this.imagePath != null && new File(this.imagePath).length() > 10485760) {
            C0666e.m3839c("checkArgs fail, image content is too large", new Object[0]);
            return false;
        } else if (this.imageUrl == null || this.imageUrl.length() <= 10240) {
            return true;
        } else {
            C0666e.m3839c("checkArgs fail, url is invalid", new Object[0]);
            return false;
        }
    }

    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wximageobject_imageData", this.imageData);
        bundle.putString("_wximageobject_imagePath", this.imagePath);
        bundle.putString("_wximageobject_imageUrl", this.imageUrl);
    }

    public void setImagePath(String str) {
        this.imagePath = str;
    }

    public int type() {
        return 2;
    }

    public void unserialize(Bundle bundle) {
        this.imageData = bundle.getByteArray("_wximageobject_imageData");
        this.imagePath = bundle.getString("_wximageobject_imagePath");
        this.imageUrl = bundle.getString("_wximageobject_imageUrl");
    }
}
