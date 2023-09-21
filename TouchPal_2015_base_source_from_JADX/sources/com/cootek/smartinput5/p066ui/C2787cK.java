package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.func.C1345G;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.ui.cK */
/* compiled from: TextColorPosition */
public enum C2787cK {
    CANDIDATE_NORMAL(C1345G.C1347a.NORMAL),
    CANDIDATE_SELECTED(C1345G.C1347a.SELECTED),
    CANDIDATE_HIGHLIGHT(C1345G.C1347a.HIGHLIGHT),
    POPUP_TEXT(C1345G.C1347a.NORMAL),
    KEY_TEXT(C1345G.C1347a.NORMAL),
    CLEAR_KEY(C1345G.C1347a.NORMAL),
    KEY_LANGUAGE_TEXT(C1345G.C1347a.NORMAL),
    KEY_LANGUAGE_TEXT_HIGHLIGHT(C1345G.C1347a.SELECTED),
    PLUGIN_WIDGET_TEXT(C1345G.C1347a.NORMAL);
    

    /* renamed from: j */
    private C1345G.C1347a f12393j;

    /* renamed from: k */
    private int f12394k;

    private C2787cK(C1345G.C1347a aVar) {
        this.f12393j = aVar;
        mo9113a();
    }

    /* renamed from: a */
    public void mo9113a() {
        if (C1368X.m6320c().mo5841n().mo6298t() && this.f12393j != null) {
            this.f12394k = C1368X.m6320c().mo5841n().mo6245B().mo5589a(this.f12393j);
        }
    }

    /* renamed from: b */
    public int mo9114b() {
        return this.f12394k;
    }

    /* renamed from: c */
    public static void m12705c() {
        for (C2787cK a : values()) {
            a.mo9113a();
        }
    }
}
