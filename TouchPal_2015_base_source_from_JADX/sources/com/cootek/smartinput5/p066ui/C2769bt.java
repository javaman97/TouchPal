package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.ExtensionStaticToast;

/* renamed from: com.cootek.smartinput5.ui.bt */
/* compiled from: PluginBar */
class C2769bt implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ExtensionStaticToast f12347a;

    /* renamed from: b */
    final /* synthetic */ C2767br f12348b;

    C2769bt(C2767br brVar, ExtensionStaticToast extensionStaticToast) {
        this.f12348b = brVar;
        this.f12347a = extensionStaticToast;
    }

    public void onClick(View view) {
        PresentationManager.clicked(this.f12347a.getId());
    }
}
