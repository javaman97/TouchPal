package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput5.net.C2361q;

/* renamed from: com.cootek.smartinput5.ui.settings.I */
/* compiled from: CellDictListActivity */
class C2961I implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13452a;

    /* renamed from: b */
    final /* synthetic */ String f13453b;

    /* renamed from: c */
    final /* synthetic */ String f13454c;

    /* renamed from: d */
    final /* synthetic */ CellDictListActivity f13455d;

    C2961I(CellDictListActivity cellDictListActivity, String str, String str2, String str3) {
        this.f13455d = cellDictListActivity;
        this.f13452a = str;
        this.f13453b = str2;
        this.f13454c = str3;
    }

    public void run() {
        C2361q.m10797b().mo8020g(this.f13452a, this.f13453b, this.f13454c);
    }
}
