package com.cootek.smartinput5.p050f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.cootek.smartinput5.f.h */
/* compiled from: WizardPopupWindow */
class C1327h extends View {

    /* renamed from: a */
    final /* synthetic */ RectF f4052a;

    /* renamed from: b */
    final /* synthetic */ boolean f4053b;

    /* renamed from: c */
    final /* synthetic */ Drawable f4054c;

    /* renamed from: d */
    final /* synthetic */ C1319a f4055d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1327h(C1319a aVar, Context context, RectF rectF, boolean z, Drawable drawable) {
        super(context);
        this.f4055d = aVar;
        this.f4052a = rectF;
        this.f4053b = z;
        this.f4054c = drawable;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(this.f4052a, Region.Op.DIFFERENCE);
        canvas.drawColor(-1291845632);
        canvas.restore();
        if (this.f4053b) {
            this.f4054c.setBounds((int) this.f4052a.left, (int) this.f4052a.top, (int) this.f4052a.right, (int) this.f4052a.bottom);
            this.f4054c.draw(canvas);
        }
    }
}
