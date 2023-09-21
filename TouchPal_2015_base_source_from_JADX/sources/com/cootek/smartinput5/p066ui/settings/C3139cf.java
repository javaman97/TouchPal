package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import android.widget.CheckBox;
import com.cootek.smartinput5.p066ui.settings.C3134cc;

/* renamed from: com.cootek.smartinput5.ui.settings.cf */
/* compiled from: SeparatedListAdapter */
class C3139cf implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBox f14179a;

    /* renamed from: b */
    final /* synthetic */ C3134cc.C3136b f14180b;

    C3139cf(C3134cc.C3136b bVar, CheckBox checkBox) {
        this.f14180b = bVar;
        this.f14179a = checkBox;
    }

    public void onClick(View view) {
        if (!this.f14180b.f14175e) {
            if (C3134cc.this.f14158f != null) {
                C3134cc.this.f14158f.run();
            }
            this.f14180b.mo10292b(true);
        } else if (this.f14179a != null) {
            this.f14179a.performClick();
        }
    }
}
