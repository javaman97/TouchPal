package p018cn.sharesdk.onekeyshare;

import android.content.Context;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;

/* renamed from: cn.sharesdk.onekeyshare.ShareCore */
public class ShareCore {
    private ShareContentCustomizeCallback customizeCallback;

    public void setShareContentCustomizeCallback(ShareContentCustomizeCallback shareContentCustomizeCallback) {
        this.customizeCallback = shareContentCustomizeCallback;
    }

    public boolean share(Platform platform, HashMap<String, Object> hashMap) {
        if (platform == null || hashMap == null) {
            return false;
        }
        Platform.ShareParams shareParams = new Platform.ShareParams(hashMap);
        if (this.customizeCallback != null) {
            this.customizeCallback.onShare(platform, shareParams);
        }
        platform.share(shareParams);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isUseClientToShare(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 1
            java.lang.String r1 = "Wechat"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = "WechatMoments"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = "WechatFavorite"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = "ShortMessage"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = "Email"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = "GooglePlus"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = "QQ"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = "Pinterest"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = "Instagram"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = "Yixin"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = "YixinMoments"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = "QZone"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0062
        L_0x0061:
            return r0
        L_0x0062:
            java.lang.String r1 = "Evernote"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x007e
            cn.sharesdk.framework.Platform r1 = p018cn.sharesdk.framework.ShareSDK.getPlatform(r4, r5)
            java.lang.String r2 = "true"
            java.lang.String r3 = "ShareByAppClient"
            java.lang.String r1 = r1.getDevinfo(r3)
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0061
        L_0x007c:
            r0 = 0
            goto L_0x0061
        L_0x007e:
            java.lang.String r1 = "SinaWeibo"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x007c
            cn.sharesdk.framework.Platform r1 = p018cn.sharesdk.framework.ShareSDK.getPlatform(r4, r5)
            java.lang.String r2 = "true"
            java.lang.String r3 = "ShareByAppClient"
            java.lang.String r1 = r1.getDevinfo(r3)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x007c
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: p018cn.sharesdk.onekeyshare.ShareCore.isUseClientToShare(android.content.Context, java.lang.String):boolean");
    }

    public static boolean canAuthorize(Context context, String str) {
        if ("Wechat".equals(str) || "WechatMoments".equals(str) || "WechatFavorite".equals(str) || "ShortMessage".equals(str) || "Email".equals(str) || "GooglePlus".equals(str) || "QQ".equals(str) || "Pinterest".equals(str) || "Yixin".equals(str) || "YixinMoments".equals(str)) {
            return false;
        }
        return true;
    }
}
