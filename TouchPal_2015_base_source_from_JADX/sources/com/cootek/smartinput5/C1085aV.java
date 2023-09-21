package com.cootek.smartinput5;

import android.content.Intent;
import android.preference.Preference;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.settings.JoinBetaActivity;

/* renamed from: com.cootek.smartinput5.aV */
/* compiled from: TouchPalOptionInte */
class C1085aV implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3083a;

    C1085aV(TouchPalOptionInte touchPalOptionInte) {
        this.f3083a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        Intent intent = new Intent();
        intent.setClass(this.f3083a, JoinBetaActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        this.f3083a.startActivity(intent);
        return true;
    }
}
