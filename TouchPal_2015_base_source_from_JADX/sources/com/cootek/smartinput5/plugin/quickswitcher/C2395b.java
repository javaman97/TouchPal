package com.cootek.smartinput5.plugin.quickswitcher;

import android.content.Context;
import android.widget.CompoundButton;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.quickswitcher.b */
/* compiled from: Options */
class C2395b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ Options f10498a;

    C2395b(Options options) {
        this.f10498a = options;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        compoundButton.setText(C1974m.m9063a((Context) this.f10498a, z ? R.string.quick_switcher_on : R.string.quick_switcher_off));
    }
}
