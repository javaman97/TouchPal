package com.cootek.smartinput5.cropimage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.cootek.smartinput5.cropimage.f */
/* compiled from: CropImageActivity */
class C1229f implements Runnable {

    /* renamed from: a */
    float f3629a = 1.0f;

    /* renamed from: b */
    Matrix f3630b;

    /* renamed from: c */
    final /* synthetic */ CropImageActivity f3631c;

    C1229f(CropImageActivity cropImageActivity) {
        this.f3631c = cropImageActivity;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5943a() {
        int i;
        int i2;
        boolean z;
        C1232i iVar = new C1232i(this.f3631c.f3590q);
        int width = this.f3631c.f3591r.getWidth();
        int height = this.f3631c.f3591r.getHeight();
        Rect rect = new Rect(0, 0, width, height);
        int min = (Math.min(width, height) * 4) / 5;
        if (this.f3631c.f3581h == 0 || this.f3631c.f3582i == 0) {
            i = min;
            i2 = min;
        } else if (this.f3631c.f3581h > this.f3631c.f3582i) {
            i = (this.f3631c.f3582i * min) / this.f3631c.f3581h;
            i2 = min;
        } else {
            i2 = (this.f3631c.f3581h * min) / this.f3631c.f3582i;
            i = min;
        }
        int i3 = (width - i2) / 2;
        int i4 = (height - i) / 2;
        RectF rectF = new RectF((float) i3, (float) i4, (float) (i2 + i3), (float) (i + i4));
        Matrix matrix = this.f3630b;
        if (this.f3631c.f3581h == 0 || this.f3631c.f3582i == 0) {
            z = false;
        } else {
            z = true;
        }
        iVar.mo4532a(matrix, rect, rectF, false, z);
        this.f3631c.f3590q.mo4496a(iVar);
    }

    public void run() {
        this.f3630b = this.f3631c.f3590q.getImageMatrix();
        this.f3629a = 1.0f / this.f3629a;
        this.f3631c.f3583j.post(new C1230g(this));
    }
}
