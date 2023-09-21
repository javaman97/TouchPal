package com.cootek.smartinput5.func;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.smileypanel.C2003a;
import com.cootek.smartinput5.net.C2197U;

/* renamed from: com.cootek.smartinput5.func.ay */
/* compiled from: JsHandler */
class C1469ay extends Handler {

    /* renamed from: a */
    final /* synthetic */ JsHandler f4718a;

    C1469ay(JsHandler jsHandler) {
        this.f4718a = jsHandler;
    }

    public void handleMessage(Message message) {
        if (C1368X.m6324d()) {
            Bundle data = message.getData();
            switch (message.what) {
                case 3:
                    if (data != null) {
                        this.f4718a.mIPCManager.handleSettingsChanged(data);
                        if (data.getInt(IPCManager.SETTING_KEY, -1) == 88) {
                            this.f4718a.resetWebviewAuthToken();
                            return;
                        }
                        return;
                    }
                    return;
                case 4:
                    if (data != null) {
                        int i = data.getInt(IPCManager.EXTRA_ACTION_TYPE);
                        if (i == 10) {
                            int i2 = data.getInt(C1811k.f5998p);
                            String string = data.getString(C1811k.f5999q);
                            if (i2 == C1368X.m6320c().mo5841n().mo5935b()) {
                                this.f4718a.reloadItem("skin", "");
                                this.f4718a.addChangeSet(4);
                            } else if (i2 == C1368X.m6320c().mo5842o().mo5935b()) {
                                C1368X.m6320c().mo5842o().mo5941e();
                                C1498a m = C1368X.m6320c().mo5842o().mo5956m(string);
                                if (m != null) {
                                    string = m.f4727f;
                                    if (C1549b.f4831b.equals(string)) {
                                        this.f4718a.mChangedPkgnameList.add(C1549b.f4832c);
                                    } else if (C1549b.f4832c.equals(string)) {
                                        this.f4718a.mChangedPkgnameList.add(C1549b.f4831b);
                                    }
                                }
                                this.f4718a.addChangeSet(2);
                            } else if (i2 == C1368X.m6320c().mo5845r().mo5935b()) {
                                this.f4718a.reloadItem(C1358O.f4192c, "");
                                this.f4718a.addChangeSet(256);
                            } else if (i2 == C2003a.m9262c().mo5935b()) {
                                if (string != null && string.startsWith(C1811k.f5996n)) {
                                    String[] split = string.split("\\.");
                                    int length = split.length - 1;
                                    if (length < 0) {
                                        length = 0;
                                    }
                                    string = C2197U.f9278p + split[length];
                                }
                                this.f4718a.addChangeSet(512);
                            }
                            if (!TextUtils.isEmpty(string)) {
                                this.f4718a.mChangedPkgnameList.add(string);
                            }
                            this.f4718a.updateResult();
                            return;
                        } else if (i == 11) {
                            this.f4718a.notifyMissionStateChanged(data.getString(JsHandler.EXTRA_STRING_MISSION_ID), data.getInt(JsHandler.EXTRA_INT_MISSION_STATE));
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 11:
                    this.f4718a.reloadItem("skin", "");
                    this.f4718a.reloadItem(C1358O.f4192c, "");
                    return;
                case 13:
                case 14:
                    this.f4718a.reloadItem("skin", "");
                    this.f4718a.refreshWebView();
                    return;
                case 257:
                    Bundle data2 = message.getData();
                    if (data2 != null) {
                        this.f4718a.doCallbackWebview(data2.getString("callbackUrl"), data2.getString("callbackParams"));
                        return;
                    }
                    return;
                case 258:
                    if (message.obj != null && this.f4718a.mWebView != null) {
                        String str = (String) message.obj;
                        if (!TextUtils.isEmpty(str)) {
                            this.f4718a.mWebView.loadUrl(str);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }
}
