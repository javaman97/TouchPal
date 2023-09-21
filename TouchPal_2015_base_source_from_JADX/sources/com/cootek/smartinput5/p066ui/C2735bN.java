package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.widget.CheckBox;

/* renamed from: com.cootek.smartinput5.ui.bN */
/* compiled from: SelectLanguage */
class C2735bN implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f12227a;

    /* renamed from: b */
    final /* synthetic */ CheckBox f12228b;

    /* renamed from: c */
    final /* synthetic */ C2730bI f12229c;

    C2735bN(C2730bI bIVar, View view, CheckBox checkBox) {
        this.f12229c = bIVar;
        this.f12227a = view;
        this.f12228b = checkBox;
    }

    public void onClick(View view) {
        this.f12227a.setSelected(true);
        this.f12228b.setChecked(true);
        this.f12229c.mo8912a();
    }
}
