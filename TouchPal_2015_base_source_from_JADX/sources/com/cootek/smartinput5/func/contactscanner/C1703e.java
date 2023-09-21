package com.cootek.smartinput5.func.contactscanner;

import android.content.Context;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2361q;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.contactscanner.e */
/* compiled from: ContactScannerFollowActivity */
class C1703e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ContactScannerFollowActivity f5551a;

    C1703e(ContactScannerFollowActivity contactScannerFollowActivity) {
        this.f5551a = contactScannerFollowActivity;
    }

    public void run() {
        C2361q.m10797b().mo8025k(C1974m.m9063a((Context) this.f5551a, (int) R.string.app_id_dialer), C1974m.m9063a((Context) this.f5551a, (int) R.string.smartdialer_app_name), (String) null);
        this.f5551a.finish();
    }
}
