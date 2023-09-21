package com.cootek.smartinput5;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.preference.Preference;
import android.widget.Toast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.asset.UpdatePinyinActivity;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.paopaopanel.C1924C;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.bB */
/* compiled from: TouchPalOptionMainland */
class C1137bB implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionMainland f3480a;

    C1137bB(TouchPalOptionMainland touchPalOptionMainland) {
        this.f3480a = touchPalOptionMainland;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (C1368X.m6320c().mo5842o().mo5962p(C1549b.f4831b)) {
            new C1924C(this.f3480a.f2925c).mo7086a(new C1138bC(this));
        } else if (!C1368X.m6320c().mo5842o().mo5960o(C1549b.f4831b)) {
            Toast.makeText(this.f3480a.f2925c, this.f3480a.mo7241b((int) R.string.install_chinese_pinyin), 0).show();
        } else {
            Intent intent = new Intent();
            intent.setClass(this.f3480a.f2925c, UpdatePinyinActivity.class);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            try {
                this.f3480a.f2925c.startActivity(intent);
            } catch (ActivityNotFoundException e) {
            }
        }
        return false;
    }
}
