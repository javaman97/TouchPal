package com.cootek.smartinput5.func.paopaopanel;

import android.view.View;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.ExtensionStaticToast;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.w */
/* compiled from: PluginTab */
class C1955w implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ExtensionStaticToast f6649a;

    /* renamed from: b */
    final /* synthetic */ C1953u f6650b;

    C1955w(C1953u uVar, ExtensionStaticToast extensionStaticToast) {
        this.f6650b = uVar;
        this.f6649a = extensionStaticToast;
    }

    public void onClick(View view) {
        C1937f W = Engine.getInstance().getWidgetManager().mo9617W();
        if (W != null && !W.mo7134i()) {
            PresentationManager.clicked(this.f6649a.getId());
            PresentationManager.closed(this.f6649a.getId());
            W.mo7132g();
        }
    }
}
