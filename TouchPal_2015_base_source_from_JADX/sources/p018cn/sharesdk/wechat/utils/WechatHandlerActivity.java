package p018cn.sharesdk.wechat.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: cn.sharesdk.wechat.utils.WechatHandlerActivity */
public class WechatHandlerActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        setTheme(16973839);
        super.onCreate(bundle);
        WechatHelper.m3944a().mo2657a(this);
        finish();
    }

    public void onGetMessageFromWXReq(WXMediaMessage wXMediaMessage) {
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        WechatHelper.m3944a().mo2657a(this);
        finish();
    }

    public void onShowMessageFromWXReq(WXMediaMessage wXMediaMessage) {
    }
}
