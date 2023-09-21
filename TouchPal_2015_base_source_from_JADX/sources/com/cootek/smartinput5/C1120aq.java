package com.cootek.smartinput5;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.preference.Preference;
import android.widget.Toast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.asset.UpdatePinyinActivity;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.aq */
/* compiled from: TouchPalOptionInte */
class C1120aq implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3147a;

    C1120aq(TouchPalOptionInte touchPalOptionInte) {
        this.f3147a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (C1368X.m6320c().mo5842o().mo5962p(C1549b.f4831b)) {
            this.f3147a.m5474O();
        } else if (!C1368X.m6320c().mo5842o().mo5960o(C1549b.f4831b)) {
            Toast.makeText(this.f3147a.f2890D, this.f3147a.mo7241b((int) R.string.install_chinese_pinyin), 0).show();
        } else {
            Intent intent = new Intent();
            intent.setClass(this.f3147a.f2890D, UpdatePinyinActivity.class);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            try {
                this.f3147a.f2890D.startActivity(intent);
            } catch (ActivityNotFoundException e) {
            }
        }
        return false;
    }
}
