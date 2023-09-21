package com.cootek.smartinput.utilities;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.cootek.nativejsapis.JavascriptHandler;
import com.cootek.smartinput5.presentations.C2515q;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput.utilities.t */
/* compiled from: TJavascriptHandler */
class C1012t extends Handler {

    /* renamed from: a */
    final /* synthetic */ TJavascriptHandler f2652a;

    C1012t(TJavascriptHandler tJavascriptHandler) {
        this.f2652a = tJavascriptHandler;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 5:
                Bundle data = message.getData();
                if (data != null && this.f2652a.mWebview != null) {
                    String string = data.getString(C2515q.f10829b);
                    String string2 = data.getString(C2515q.f10830c);
                    HashMap hashMap = new HashMap();
                    hashMap.put("pkgName", string2);
                    hashMap.put("url", string);
                    try {
                        this.f2652a.doCallbackWebview(JavascriptHandler.WEB_CALLBACK_METHOD_NAME_APK_DOWNLOADED, "'" + new JSONObject(hashMap).toString() + "'");
                        return;
                    } catch (Exception e) {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                Bundle data2 = message.getData();
                if (data2 != null && this.f2652a.mWebview != null) {
                    String string3 = data2.getString(C2515q.f10829b);
                    String string4 = data2.getString(C2515q.f10830c);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("pkgName", string4);
                    hashMap2.put("url", string3);
                    try {
                        this.f2652a.doCallbackWebview(JavascriptHandler.WEB_CALLBACK_METHOD_NAME_PKG_INSTALLED, "'" + new JSONObject(hashMap2).toString() + "'");
                        return;
                    } catch (Exception e2) {
                        return;
                    }
                } else {
                    return;
                }
            case 9:
                Bundle data3 = message.getData();
                if (data3 != null && this.f2652a.mWebview != null) {
                    this.f2652a.doCallbackWebview(data3.getString(TJavascriptHandler.EXTRA_STRING_JS_METHOD), "'" + data3.getString(TJavascriptHandler.EXTRA_STRING_SHARE_CALLBACK_FLAG) + "'");
                    return;
                }
                return;
            default:
                return;
        }
    }
}
