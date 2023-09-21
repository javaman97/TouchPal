package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p045a.C1056a;

/* renamed from: com.cootek.smartinput5.ui.bK */
/* compiled from: SelectLanguage */
class C2732bK implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f12220a;

    /* renamed from: b */
    final /* synthetic */ int f12221b;

    /* renamed from: c */
    final /* synthetic */ String f12222c;

    /* renamed from: d */
    final /* synthetic */ C2730bI f12223d;

    C2732bK(C2730bI bIVar, View view, int i, String str) {
        this.f12223d = bIVar;
        this.f12220a = view;
        this.f12221b = i;
        this.f12222c = str;
    }

    public void onClick(View view) {
        this.f12220a.setSelected(true);
        Settings.getInstance().setIntSetting(3, this.f12221b, 1, this.f12222c, (Config) null, true);
        C1056a.m5588a().mo4264a(C1056a.f2983n + this.f12221b, this.f12223d.f12216a);
        this.f12223d.mo8912a();
    }
}
