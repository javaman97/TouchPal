package com.cootek.smartinput5.net.login;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.net.login.g */
/* compiled from: GoogleLoginWebviewActivity */
class C2334g extends Handler {

    /* renamed from: a */
    final /* synthetic */ GoogleLoginWebviewActivity f10296a;

    C2334g(GoogleLoginWebviewActivity googleLoginWebviewActivity) {
        this.f10296a = googleLoginWebviewActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                if (this.f10296a.f10209e != null) {
                    this.f10296a.f10209e.dismiss();
                    return;
                }
                return;
            case 1:
                if (this.f10296a.f10209e != null) {
                    this.f10296a.f10209e.show();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
