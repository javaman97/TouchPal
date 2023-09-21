package com.cootek.smartinput5.p066ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1713e;

/* renamed from: com.cootek.smartinput5.ui.cV */
/* compiled from: UserWordDialog */
class C2800cV implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1713e.C1715a f12435a;

    /* renamed from: b */
    final /* synthetic */ C2794cR f12436b;

    C2800cV(C2794cR cRVar, C1713e.C1715a aVar) {
        this.f12436b = cRVar;
        this.f12435a = aVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f12435a.mo6630b()));
        intent.setFlags(Engine.EXCEPTION_ERROR);
        this.f12436b.mo9534b_();
        Engine.getInstance().getIms().requestHideSelf(0);
        this.f12436b.mo9539i().startActivity(intent);
    }
}
