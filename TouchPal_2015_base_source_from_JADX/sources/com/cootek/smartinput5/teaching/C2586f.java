package com.cootek.smartinput5.teaching;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: com.cootek.smartinput5.teaching.f */
/* compiled from: TeachingTipCurve */
class C2586f extends View {

    /* renamed from: a */
    final /* synthetic */ C2584d f11093a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2586f(C2584d dVar, Context context) {
        super(context);
        this.f11093a = dVar;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.drawPath(this.f11093a.f11078b, this.f11093a.f11079c);
        canvas.restore();
    }
}
