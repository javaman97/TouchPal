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

/* renamed from: com.cootek.smartinput5.ui.settings.bB */
/* compiled from: LanguageListActivityInte */
class C3045bB implements CustomCheckBoxPreference.C2953b {

    /* renamed from: a */
    final /* synthetic */ C1498a f13981a;

    /* renamed from: b */
    final /* synthetic */ C1389aD f13982b;

    /* renamed from: c */
    final /* synthetic */ LanguageListActivityInte f13983c;

    C3045bB(LanguageListActivityInte languageListActivityInte, C1498a aVar, C1389aD aDVar) {
        this.f13983c = languageListActivityInte;
        this.f13981a = aVar;
        this.f13982b = aDVar;
    }

    /* renamed from: a */
    public void mo9789a(CustomCheckBoxPreference customCheckBoxPreference) {
        if (this.f13981a != null) {
            C1443as c = C1811k.m8322a().mo6824c((String) null);
            C1443as c2 = C1811k.m8322a().mo6824c(this.f13981a.mo6160j());
            if (c2 != null && c2 != c) {
                if (c2.mo6023b()) {
                    this.f13983c.m13874a(c2);
                    return;
                }
                String j = this.f13981a.mo6160j();
                if (C1584bI.m7123a((Context) this.f13983c, j) == null) {
                    C2894d.C2895a aVar = new C2894d.C2895a(this.f13983c);
                    String str = this.f13981a.f4728g;
                    if (this.f13981a.f4727f.equals(C1549b.f4831b)) {
                        str = str + "/" + this.f13982b.mo5954l(C1549b.f4832c).f4728g;
                    } else if (this.f13981a.f4727f.equals(C1549b.f4832c)) {
                        str = str + "/" + this.f13982b.mo5954l(C1549b.f4831b).f4728g;
                    }
                    aVar.setTitle(this.f13983c.mo7237a((int) R.string.hint_language_uninstall, str));
                    aVar.setPositiveButton(this.f13983c.mo7241b(17039379), new C3046bC(this, c2));
                    aVar.setNegativeButton(this.f13983c.mo7241b(17039369), (DialogInterface.OnClickListener) null);
                    aVar.create().show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:" + j));
                intent.setFlags(Engine.EXCEPTION_ERROR);
                this.f13983c.startActivity(intent);
            }
        }
    }
}
