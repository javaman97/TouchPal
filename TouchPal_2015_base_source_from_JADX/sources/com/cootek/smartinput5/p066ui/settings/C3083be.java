package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.be */
/* compiled from: LanguageEditActivityInte */
class C3083be implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ C1498a f14057a;

    /* renamed from: b */
    final /* synthetic */ C1389aD f14058b;

    /* renamed from: c */
    final /* synthetic */ LanguageEditActivityInte f14059c;

    C3083be(LanguageEditActivityInte languageEditActivityInte, C1498a aVar, C1389aD aDVar) {
        this.f14059c = languageEditActivityInte;
        this.f14057a = aVar;
        this.f14058b = aDVar;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (this.f14057a != null) {
            C1443as c = C1811k.m8322a().mo6824c((String) null);
            C1443as c2 = C1811k.m8322a().mo6824c(this.f14057a.mo6160j());
            if (!(c2 == null || c2 == c)) {
                if (c2.mo6023b()) {
                    this.f14059c.m13831a(c2);
                    this.f14059c.finish();
                } else {
                    String j = this.f14057a.mo6160j();
                    if (this.f14059c.m13828a(j) == null) {
                        C2894d.C2895a aVar = new C2894d.C2895a(this.f14059c);
                        String str = this.f14057a.f4728g;
                        if (this.f14057a.f4727f.equals(C1549b.f4831b)) {
                            str = str + "/" + this.f14058b.mo5954l(C1549b.f4832c).f4728g;
                        } else if (this.f14057a.f4727f.equals(C1549b.f4832c)) {
                            str = str + "/" + this.f14058b.mo5954l(C1549b.f4831b).f4728g;
                        }
                        aVar.setTitle(this.f14059c.mo7237a((int) R.string.hint_language_uninstall, str));
                        aVar.setPositiveButton(this.f14059c.mo7241b(17039379), new C3084bf(this, c2));
                        aVar.setNegativeButton(this.f14059c.mo7241b(17039369), (DialogInterface.OnClickListener) null);
                        aVar.create().show();
                    } else {
                        this.f14059c.m13831a(c2);
                        Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:" + j));
                        intent.setFlags(Engine.EXCEPTION_ERROR);
                        this.f14059c.startActivity(intent);
                    }
                }
            }
        }
        return false;
    }
}
