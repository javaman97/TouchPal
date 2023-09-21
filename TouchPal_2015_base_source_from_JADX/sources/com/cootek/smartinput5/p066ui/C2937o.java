package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.NextWordToast;

/* renamed from: com.cootek.smartinput5.ui.o */
/* compiled from: CandidateViewWidget */
class C2937o implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f13343a;

    /* renamed from: b */
    final /* synthetic */ C2934m f13344b;

    C2937o(C2934m mVar, String str) {
        this.f13344b = mVar;
        this.f13343a = str;
    }

    public void onClick(View view) {
        boolean unused = this.f13344b.f13316G = true;
        boolean unused2 = this.f13344b.f13317H = false;
        NextWordToast unused3 = this.f13344b.f13318I = null;
        this.f13344b.m13574o();
        PresentationManager.cleaned(this.f13343a);
    }
}
