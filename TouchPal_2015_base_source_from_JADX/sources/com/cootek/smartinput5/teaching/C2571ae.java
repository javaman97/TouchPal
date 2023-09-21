package com.cootek.smartinput5.teaching;

import android.content.DialogInterface;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.teaching.ae */
/* compiled from: TutorialActivity */
class C2571ae implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ TutorialActivity f11051a;

    C2571ae(TutorialActivity tutorialActivity) {
        this.f11051a = tutorialActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        this.f11051a.m11315a(false);
    }
}
