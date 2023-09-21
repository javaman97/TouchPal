package com.facebook.ads.internal.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.internal.view.d */
public class C3485d extends LinearLayout {

    /* renamed from: a */
    private DisplayMetrics f15089a;

    /* renamed from: b */
    private Bitmap f15090b;

    /* renamed from: c */
    private Bitmap f15091c;

    /* renamed from: d */
    private ImageView f15092d;

    /* renamed from: e */
    private ImageView f15093e;

    /* renamed from: f */
    private ImageView f15094f;

    /* renamed from: g */
    private float f15095g;

    /* renamed from: h */
    private Bitmap f15096h;

    /* renamed from: i */
    private Bitmap f15097i;

    /* renamed from: j */
    private int f15098j;

    /* renamed from: k */
    private int f15099k;

    public C3485d(Context context) {
        super(context);
        m15198b();
    }

    /* renamed from: a */
    private void m15197a() {
        if (getHeight() > 0) {
            this.f15099k = m15199c();
            this.f15098j = (int) Math.ceil((double) (((float) (getHeight() - this.f15099k)) / 2.0f));
            int floor = (int) Math.floor((double) (((float) (getHeight() - this.f15099k)) / 2.0f));
            float height = ((float) this.f15090b.getHeight()) / ((float) this.f15099k);
            int round = Math.round(((float) this.f15098j) * height);
            if (round > 0) {
                this.f15096h = Bitmap.createBitmap(this.f15091c, 0, this.f15091c.getHeight() - round, this.f15091c.getWidth(), round);
                this.f15092d.setImageBitmap(this.f15096h);
            }
            int round2 = Math.round(((float) floor) * height);
            if (round2 > 0) {
                this.f15097i = Bitmap.createBitmap(this.f15091c, 0, 0, this.f15091c.getWidth(), round2);
                this.f15094f.setImageBitmap(this.f15097i);
            }
        }
    }

    /* renamed from: b */
    private void m15198b() {
        this.f15089a = getContext().getResources().getDisplayMetrics();
        setOrientation(1);
        this.f15092d = new ImageView(getContext());
        this.f15092d.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(this.f15092d);
        this.f15093e = new ImageView(getContext());
        this.f15093e.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f15093e.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.f15093e);
        this.f15094f = new ImageView(getContext());
        this.f15094f.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(this.f15094f);
    }

    /* renamed from: c */
    private int m15199c() {
        double width = (double) (((float) getWidth()) * this.f15095g);
        if (width > ((double) this.f15089a.density) * 188.48167539267016d) {
            width = ((double) this.f15089a.density) * 188.48167539267016d;
        }
        return (int) Math.round(width);
    }

    /* renamed from: a */
    public void mo10818a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null) {
            this.f15093e.setImageDrawable((Drawable) null);
            return;
        }
        this.f15093e.setImageBitmap(Bitmap.createBitmap(bitmap));
        this.f15090b = bitmap;
        this.f15091c = bitmap2;
        this.f15095g = ((float) bitmap.getHeight()) / ((float) bitmap.getWidth());
        m15197a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f15090b == null || this.f15091c == null) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int c = m15199c();
        if (this.f15096h == null || this.f15099k != c) {
            m15197a();
        }
        this.f15092d.layout(i, i2, i3, this.f15098j);
        this.f15093e.layout(i, this.f15098j + i2, i3, this.f15098j + this.f15099k);
        this.f15094f.layout(i, this.f15098j + i2 + this.f15099k, i3, i4);
    }
}
