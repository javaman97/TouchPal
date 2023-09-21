package p018cn.sharesdk.framework;

import android.content.Context;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.p020b.p022b.C0645f;

/* renamed from: cn.sharesdk.framework.CustomPlatform */
public abstract class CustomPlatform extends Platform {
    public CustomPlatform(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public abstract boolean checkAuthorize(int i, Object obj);

    /* access modifiers changed from: protected */
    public void doAuthorize(String[] strArr) {
    }

    /* access modifiers changed from: protected */
    public void doCustomerProtocol(String str, String str2, int i, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
    }

    /* access modifiers changed from: protected */
    public void doShare(Platform.ShareParams shareParams) {
    }

    /* access modifiers changed from: protected */
    public final C0645f.C0646a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void follow(String str) {
    }

    /* access modifiers changed from: protected */
    public int getCustomPlatformId() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void getFriendList(int i, int i2, String str) {
    }

    public abstract String getName();

    /* access modifiers changed from: protected */
    public final int getPlatformId() {
        return -Math.abs(getCustomPlatformId());
    }

    public int getVersion() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void initDevInfo(String str) {
    }

    /* access modifiers changed from: protected */
    public final void setNetworkDevinfo() {
    }

    /* access modifiers changed from: protected */
    public void timeline(int i, int i2, String str) {
    }

    /* access modifiers changed from: protected */
    public void userInfor(String str) {
    }
}
