package com.cootek.smartinput5.cropimage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: com.cootek.smartinput5.cropimage.m */
/* compiled from: RotateBitmap */
public class C1239m {

    /* renamed from: a */
    public static final String f3673a = "RotateBitmap";

    /* renamed from: b */
    private Bitmap f3674b;

    /* renamed from: c */
    private int f3675c;

    public C1239m(Bitmap bitmap) {
        this.f3674b = bitmap;
        this.f3675c = 0;
    }

    public C1239m(Bitmap bitmap, int i) {
        this.f3674b = bitmap;
        this.f3675c = i % 360;
    }

    /* renamed from: a */
    public void mo4549a(int i) {
        this.f3675c = i;
    }

    /* renamed from: a */
    public int mo4548a() {
        return this.f3675c;
    }

    /* renamed from: b */
    public Bitmap mo4551b() {
        return this.f3674b;
    }

    /* renamed from: a */
    public void mo4550a(Bitmap bitmap) {
        this.f3674b = bitmap;
    }

    /* renamed from: c */
    public Matrix mo4552c() {
        Matrix matrix = new Matrix();
        if (this.f3675c != 0) {
            matrix.preTranslate((float) (-(this.f3674b.getWidth() / 2)), (float) (-(this.f3674b.getHeight() / 2)));
            matrix.postRotate((float) this.f3675c);
            matrix.postTranslate((float) (mo4555f() / 2), (float) (mo4554e() / 2));
        }
        return matrix;
    }

    /* renamed from: d */
    public boolean mo4553d() {
        return (this.f3675c / 90) % 2 != 0;
    }

    /* renamed from: e */
    public int mo4554e() {
        if (mo4553d()) {
            return this.f3674b.getWidth();
        }
        return this.f3674b.getHeight();
    }

    /* renamed from: f */
    public int mo4555f() {
        if (mo4553d()) {
            return this.f3674b.getHeight();
        }
        return this.f3674b.getWidth();
    }

    /* renamed from: g */
    public void mo4556g() {
        if (this.f3674b != null) {
            this.f3674b.recycle();
            this.f3674b = null;
        }
    }
}
