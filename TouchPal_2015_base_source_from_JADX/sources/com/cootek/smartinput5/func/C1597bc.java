package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p048d.C1246d;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.func.bc */
/* compiled from: ReferrerHandler */
final class C1597bc extends C1418aZ {
    C1597bc(String str, int i) {
        super(str, i, (C1595ba) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6052a(Context context, String str) {
        String str2;
        String queryParameter = Uri.parse("http://www.just-anchor.com?" + str).getQueryParameter("tpp");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                str2 = context.getPackageManager().getPackageInfo(queryParameter, 0) == null ? str + "&p_exists=n" : str + "&p_exists=y";
            } catch (PackageManager.NameNotFoundException e) {
                str2 = str + "&p_exists=n";
            }
        } else {
            str2 = str;
        }
        C1246d.m6010a(context).mo4591a(C1246d.f3787bD, str2, C1246d.f3933e);
        if (Settings.isInitialized()) {
            Settings.getInstance().setStringSetting(Settings.REFERRER, Uri.encode(str2));
            Settings.getInstance().writeBack();
        }
    }
}
