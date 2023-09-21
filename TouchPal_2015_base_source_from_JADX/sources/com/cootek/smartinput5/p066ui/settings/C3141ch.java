package com.cootek.smartinput5.p066ui.settings;

import android.widget.CompoundButton;
import com.cootek.smartinput5.p066ui.settings.C3134cc;

/* renamed from: com.cootek.smartinput5.ui.settings.ch */
/* compiled from: SeparatedListAdapter */
class C3141ch implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ C3134cc.C3136b f14182a;

    C3141ch(C3134cc.C3136b bVar) {
        this.f14182a = bVar;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean unused = this.f14182a.f14173c = z;
        if (this.f14182a.f14174d != null) {
            this.f14182a.f14174d.mo10030a();
        }
    }
}
