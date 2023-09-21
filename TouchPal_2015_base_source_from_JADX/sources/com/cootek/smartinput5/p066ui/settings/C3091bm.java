package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.settings.CustomCheckBoxPreference;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.bm */
/* compiled from: LanguageListActivity */
class C3091bm implements CustomCheckBoxPreference.C2953b {

    /* renamed from: a */
    final /* synthetic */ C1498a f14078a;

    /* renamed from: b */
    final /* synthetic */ C1389aD f14079b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivity f14080c;

    C3091bm(LanguageListActivity languageListActivity, C1498a aVar, C1389aD aDVar) {
        this.f14080c = languageListActivity;
        this.f14078a = aVar;
        this.f14079b = aDVar;
    }

    /* renamed from: a */
    public void mo9789a(CustomCheckBoxPreference customCheckBoxPreference) {
        if (this.f14078a != null) {
            C1443as c = C1811k.m8322a().mo6824c((String) null);
            C1443as c2 = C1811k.m8322a().mo6824c(this.f14078a.mo6160j());
            if (c2 != null && c2 != c) {
                if (c2.mo6023b()) {
                    this.f14080c.m13850a(c2);
                    return;
                }
                String j = this.f14078a.mo6160j();
                if (C1584bI.m7123a((Context) this.f14080c, j) == null) {
                    C2894d.C2895a aVar = new C2894d.C2895a(this.f14080c.f13520b);
                    String str = this.f14078a.f4728g;
                    if (this.f14078a.f4727f.equals(C1549b.f4831b)) {
                        str = str + "/" + this.f14079b.mo5954l(C1549b.f4832c).f4728g;
                    } else if (this.f14078a.f4727f.equals(C1549b.f4832c)) {
                        str = str + "/" + this.f14079b.mo5954l(C1549b.f4831b).f4728g;
                    }
                    aVar.setTitle(this.f14080c.mo7237a((int) R.string.hint_language_uninstall, str));
                    aVar.setPositiveButton(this.f14080c.mo7241b(17039379), new C3092bn(this, c2));
                    aVar.setNegativeButton(this.f14080c.mo7241b(17039369), (DialogInterface.OnClickListener) null);
                    aVar.create().show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:" + j));
                intent.setFlags(Engine.EXCEPTION_ERROR);
                this.f14080c.startActivity(intent);
            }
        }
    }
}
