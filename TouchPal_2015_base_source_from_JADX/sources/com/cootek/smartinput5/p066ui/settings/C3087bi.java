package com.cootek.smartinput5.p066ui.settings;

import android.preference.Preference;
import android.widget.Toast;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1337C;
import com.cootek.smartinput5.func.C1358O;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.bi */
/* compiled from: LanguageEditActivityInte */
class C3087bi implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ String f14067a;

    /* renamed from: b */
    final /* synthetic */ C1337C f14068b;

    /* renamed from: c */
    final /* synthetic */ LanguageEditActivityInte f14069c;

    C3087bi(LanguageEditActivityInte languageEditActivityInte, String str, C1337C c) {
        this.f14069c = languageEditActivityInte;
        this.f14067a = str;
        this.f14068b = c;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (C1358O.m6234a(C1358O.f4194e) == null) {
            Toast.makeText(this.f14069c.f13511b, this.f14069c.mo7241b((int) R.string.sdcard_not_ready_message), 1).show();
            return true;
        }
        this.f14068b.mo5564a(this.f14069c.f13511b, this.f14067a, Settings.getInstance().getIntSetting(4, 9, this.f14067a, (Config) null), preference.getTitle().toString(), false);
        return false;
    }
}
