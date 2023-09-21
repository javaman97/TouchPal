package com.cootek.smartinput5.teaching;

import android.content.Intent;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.teaching.p065a.C2563e;

/* renamed from: com.cootek.smartinput5.teaching.am */
/* compiled from: TutorialWelcomeDialog */
class C2579am implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2578al f11071a;

    C2579am(C2578al alVar) {
        this.f11071a = alVar;
    }

    public void onClick(View view) {
        C2563e.f11003l = true;
        Intent intent = new Intent();
        intent.setClass(this.f11071a.f11064a, TutorialActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        this.f11071a.f11064a.startActivity(intent);
        boolean unused = this.f11071a.f11070g = true;
        C1368X.m6320c().mo5850w().mo8412b();
    }
}
