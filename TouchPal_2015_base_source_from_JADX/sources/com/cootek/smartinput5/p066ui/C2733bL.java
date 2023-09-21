package com.cootek.smartinput5.p066ui;

import android.content.Intent;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1593bR;

/* renamed from: com.cootek.smartinput5.ui.bL */
/* compiled from: SelectLanguage */
class C2733bL implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2730bI f12224a;

    C2733bL(C2730bI bIVar) {
        this.f12224a = bIVar;
    }

    public void onClick(View view) {
        this.f12224a.mo8912a();
        Engine.getInstance().getIms().requestHideSelf(0);
        Intent intent = new Intent(this.f12224a.f12216a, C1593bR.m7162a().mo6234b(0));
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.putExtra("SHOW_ALL_LANGUAGE", true);
        this.f12224a.f12216a.startActivity(intent);
    }
}
