package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.presentation.sdk.PresentationManager;

/* renamed from: com.cootek.smartinput5.ui.n */
/* compiled from: CandidateViewWidget */
class C2936n implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f13341a;

    /* renamed from: b */
    final /* synthetic */ C2934m f13342b;

    C2936n(C2934m mVar, String str) {
        this.f13342b = mVar;
        this.f13341a = str;
    }

    public void onClick(View view) {
        PresentationManager.clicked(this.f13341a);
    }
}
