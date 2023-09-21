package com.cootek.smartinput5.plugin.twitter;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;

public class FollowActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m10972a(getIntent().getExtras());
    }

    /* renamed from: a */
    private void m10972a(Bundle bundle) {
        if (bundle == null) {
            finish();
            return;
        }
        String string = bundle.getString(C2417r.f10583l);
        String string2 = bundle.getString(C2417r.f10584m);
        String string3 = bundle.getString(C2417r.f10585n);
        String string4 = bundle.getString(C2417r.f10586o);
        C2416q qVar = null;
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            qVar = new C2416q(string, string2);
        }
        if (qVar != null && C2400a.m10990b()) {
            C2400a.m10988a().mo8118a(qVar);
            C2417r a = C2417r.m11027a();
            a.mo8168b(qVar);
            a.mo8163a(string3);
            a.mo8169b(string4);
        }
        if (C2423x.m11066a()) {
            C2423x.m11068c();
        }
        finish();
    }
}
