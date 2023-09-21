package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.view.View;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.settings.cr */
/* compiled from: SkinActivity */
class C3153cr implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f14198a;

    /* renamed from: b */
    final /* synthetic */ String f14199b;

    /* renamed from: c */
    final /* synthetic */ String f14200c;

    /* renamed from: d */
    final /* synthetic */ SkinActivity f14201d;

    C3153cr(SkinActivity skinActivity, String str, String str2, String str3) {
        this.f14201d = skinActivity;
        this.f14198a = str;
        this.f14199b = str2;
        this.f14200c = str3;
    }

    public void onClick(View view) {
        C1368X.m6320c().mo5825K().downloadSkinPackage(this.f14198a, this.f14199b, this.f14200c);
        C1246d.m6010a((Context) this.f14201d).mo4594a(C1246d.f3853cQ, true, C1246d.f3842cF);
        C1056a.m5588a().mo4264a(C1056a.f2989t, this.f14201d);
    }
}
