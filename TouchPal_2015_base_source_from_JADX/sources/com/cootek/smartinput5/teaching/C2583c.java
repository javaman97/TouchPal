package com.cootek.smartinput5.teaching;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.cootek.smartinput5.teaching.c */
/* compiled from: TeachingTipBase */
class C2583c extends View {

    /* renamed from: a */
    final /* synthetic */ Drawable f11075a;

    /* renamed from: b */
    final /* synthetic */ C2557a f11076b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2583c(C2557a aVar, Context context, Drawable drawable) {
        super(context);
        this.f11076b = aVar;
        this.f11075a = drawable;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(this.f11076b.f10975i, Region.Op.DIFFERENCE);
        canvas.drawColor(-1442840576);
        canvas.restore();
        this.f11075a.setBounds((int) this.f11076b.f10975i.left, (int) this.f11076b.f10975i.top, (int) this.f11076b.f10975i.right, (int) this.f11076b.f10975i.bottom);
        this.f11075a.draw(canvas);
    }
}
