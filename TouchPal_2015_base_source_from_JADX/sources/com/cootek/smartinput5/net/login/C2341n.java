package com.cootek.smartinput5.net.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.cootek.smartinput5.net.cmd.C2300u;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.net.login.n */
/* compiled from: TLoginActivity */
class C2341n extends Handler {

    /* renamed from: a */
    final /* synthetic */ TLoginActivity f10324a;

    C2341n(TLoginActivity tLoginActivity) {
        this.f10324a = tLoginActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (!this.f10324a.f10264P) {
                    String str = (String) message.obj;
                    if (!TextUtils.isEmpty(str)) {
                        C1246d.m6010a(this.f10324a.f10269b).mo4591a(C1246d.f3766aj, "LOCAL_AUTH_SUCCESS", C1246d.f3933e);
                        if (this.f10324a.f10267S != -1) {
                            C1246d.m6010a(this.f10324a.f10269b).mo4589a("LOGIN/GOOGLE/LOCAL_AUTH_TIME", System.currentTimeMillis() - this.f10324a.f10267S, C1246d.f3933e);
                        }
                        this.f10324a.m10653a(str, C2300u.f10103a);
                    } else {
                        this.f10324a.m10670c(0);
                    }
                    long unused = this.f10324a.f10267S = -1;
                    return;
                }
                return;
            case 2:
                long unused2 = this.f10324a.f10267S = -1;
                if (!this.f10324a.f10264P) {
                    int i = message.arg1;
                    if (i == 0) {
                        this.f10324a.m10670c(0);
                        return;
                    } else if (i == 2) {
                        this.f10324a.m10670c(2);
                        return;
                    } else if (i == 3) {
                        this.f10324a.m10670c(4);
                        return;
                    } else if (i == 1) {
                        Bundle data = message.getData();
                        Intent intent = null;
                        if (data != null) {
                            intent = (Intent) data.getParcelable("intent");
                        }
                        if (intent == null) {
                            this.f10324a.m10670c(0);
                            return;
                        }
                        this.f10324a.m10695k();
                        try {
                            this.f10324a.startActivityForResult(intent, 1);
                            return;
                        } catch (Exception e) {
                            this.f10324a.m10670c(0);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 256:
                this.f10324a.m10697l();
                return;
            case 257:
                this.f10324a.m10670c(message.arg1);
                return;
            default:
                return;
        }
    }
}
