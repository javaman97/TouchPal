package p018cn.sharesdk.wechat.utils;

import android.os.Bundle;
import java.io.File;
import p018cn.sharesdk.framework.utils.C0666e;
import p018cn.sharesdk.wechat.utils.WXMediaMessage;

/* renamed from: cn.sharesdk.wechat.utils.WXFileObject */
public class WXFileObject implements WXMediaMessage.IMediaObject {
    public byte[] fileData;
    public String filePath;

    public WXFileObject() {
        this.fileData = null;
        this.filePath = null;
    }

    public WXFileObject(String str) {
        this.filePath = str;
    }

    public WXFileObject(byte[] bArr) {
        this.fileData = bArr;
    }

    public boolean checkArgs() {
        if ((this.fileData == null || this.fileData.length == 0) && (this.filePath == null || this.filePath.length() == 0)) {
            C0666e.m3839c("checkArgs fail, both arguments is null", new Object[0]);
            return false;
        } else if (this.fileData != null && this.fileData.length > 10485760) {
            C0666e.m3839c("checkArgs fail, fileData is too large", new Object[0]);
            return false;
        } else if (this.filePath == null || new File(this.filePath).length() <= 10485760) {
            return true;
        } else {
            C0666e.m3839c("checkArgs fail, fileSize is too large", new Object[0]);
            return false;
        }
    }

    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wxfileobject_fileData", this.fileData);
        bundle.putString("_wxfileobject_filePath", this.filePath);
    }

    public void setFileData(byte[] bArr) {
        this.fileData = bArr;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public int type() {
        return 6;
    }

    public void unserialize(Bundle bundle) {
        this.fileData = bundle.getByteArray("_wxfileobject_fileData");
        this.filePath = bundle.getString("_wxfileobject_filePath");
    }
}
