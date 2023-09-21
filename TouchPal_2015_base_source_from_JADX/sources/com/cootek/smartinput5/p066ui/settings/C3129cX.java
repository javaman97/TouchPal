package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1601bg;

/* renamed from: com.cootek.smartinput5.ui.settings.cX */
/* compiled from: SkinInfoHandler */
class C3129cX implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1601bg f14147a;

    /* renamed from: b */
    final /* synthetic */ SkinInfoHandler f14148b;

    C3129cX(SkinInfoHandler skinInfoHandler, C1601bg bgVar) {
        this.f14148b = skinInfoHandler;
        this.f14147a = bgVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f14147a.f5932a.mo6025d();
        C1368X.m6320c().mo5841n().mo5951j(this.f14147a.mo6810a());
    }
}
