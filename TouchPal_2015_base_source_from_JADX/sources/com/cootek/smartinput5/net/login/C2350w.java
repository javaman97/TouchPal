package com.cootek.smartinput5.net.login;

import android.os.Message;
import android.text.TextUtils;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.net.cmd.C2300u;
import com.cootek.smartinput5.p048d.C1246d;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.PlatformActionListener;

/* renamed from: com.cootek.smartinput5.net.login.w */
/* compiled from: TLoginActivity */
class C2350w implements PlatformActionListener {

    /* renamed from: a */
    final /* synthetic */ TLoginActivity f10335a;

    C2350w(TLoginActivity tLoginActivity) {
        this.f10335a = tLoginActivity;
    }

    public void onError(Platform platform, int i, Throwable th) {
        boolean unused = this.f10335a.f10266R = false;
        if (!this.f10335a.f10264P) {
            Message obtainMessage = this.f10335a.f10268V.obtainMessage(257);
            obtainMessage.arg1 = 5;
            this.f10335a.f10268V.sendMessage(obtainMessage);
        }
    }

    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        boolean unused = this.f10335a.f10266R = false;
        String name = platform.getName();
        if (!this.f10335a.f10264P) {
            String d = this.f10335a.m10677d(name);
            if (!TextUtils.isEmpty(d)) {
                String token = platform.getDb().getToken();
                if (d == C2300u.f10105c) {
                    token = token + C2261Q.f9808n + platform.getDb().getTokenSecret();
                }
                this.f10335a.f10268V.post(new C2351x(this, token, d));
                C1246d.m6010a(this.f10335a.f10269b).mo4591a(C1246d.f3764ah + name.toUpperCase(), C1246d.f3946r, C1246d.f3933e);
                return;
            }
            Message obtainMessage = this.f10335a.f10268V.obtainMessage(257);
            obtainMessage.arg1 = 5;
            this.f10335a.f10268V.sendMessage(obtainMessage);
        }
    }

    public void onCancel(Platform platform, int i) {
        boolean unused = this.f10335a.f10266R = false;
        C1246d.m6010a(this.f10335a.f10269b).mo4591a(C1246d.f3764ah + platform.getName().toUpperCase(), C1246d.f3941m, C1246d.f3933e);
        if (!this.f10335a.f10264P) {
            Message obtainMessage = this.f10335a.f10268V.obtainMessage(257);
            obtainMessage.arg1 = 2;
            this.f10335a.f10268V.sendMessage(obtainMessage);
        }
    }
}
