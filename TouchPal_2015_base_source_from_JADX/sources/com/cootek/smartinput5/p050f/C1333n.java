package com.cootek.smartinput5.p050f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.cootek.smartinput5.f.n */
/* compiled from: WizardPopupWindow */
class C1333n extends View {

    /* renamed from: a */
    final /* synthetic */ Path f4065a;

    /* renamed from: b */
    final /* synthetic */ Drawable f4066b;

    /* renamed from: c */
    final /* synthetic */ RectF f4067c;

    /* renamed from: d */
    final /* synthetic */ C1319a f4068d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1333n(C1319a aVar, Context context, Path path, Drawable drawable, RectF rectF) {
        super(context);
        this.f4068d = aVar;
        this.f4065a = path;
        this.f4066b = drawable;
        this.f4067c = rectF;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f4065a, Region.Op.DIFFERENCE);
        canvas.drawColor(-872415232);
        canvas.restore();
        this.f4066b.setBounds((int) this.f4067c.left, (int) this.f4067c.top, (int) this.f4067c.right, (int) this.f4067c.bottom);
        this.f4066b.draw(canvas);
    }
}
