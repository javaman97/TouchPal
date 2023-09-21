package com.cootek.smartinput5;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.n */
/* compiled from: Guide */
class C2166n implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Guide f9166a;

    C2166n(Guide guide) {
        this.f9166a = guide;
    }

    public void onClick(View view) {
        boolean z;
        ((InputMethodManager) this.f9166a.getApplicationContext().getSystemService("input_method")).showInputMethodPicker();
        boolean unused = this.f9166a.f2746c = true;
        this.f9166a.m5267a(false);
        if (Settings.getInstance().getIntSetting(Settings.GUIDE_PLAY_STATE) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f9166a.m5262a(1, z);
        boolean unused2 = this.f9166a.f2756z = true;
    }
}
