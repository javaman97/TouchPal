package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.toolbox.C0861l;

public class NetworkImageView extends ImageView {

    /* renamed from: a */
    private String f2239a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f2240b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f2241c;

    /* renamed from: d */
    private C0861l f2242d;

    /* renamed from: e */
    private C0861l.C0864c f2243e;

    public NetworkImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo3104a(String str, C0861l lVar) {
        this.f2239a = str;
        this.f2242d = lVar;
        mo3105a(false);
    }

    public void setDefaultImageResId(int i) {
        this.f2240b = i;
    }

    public void setErrorImageResId(int i) {
        this.f2241c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3105a(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        int i = 0;
        int width = getWidth();
        int height = getHeight();
        if (getLayoutParams() != null) {
            z3 = getLayoutParams().width == -2;
            if (getLayoutParams().height == -2) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
            z3 = false;
        }
        if (!z3 || !z2) {
            z4 = false;
        }
        if (width != 0 || height != 0 || z4) {
            if (TextUtils.isEmpty(this.f2239a)) {
                if (this.f2243e != null) {
                    this.f2243e.mo3139a();
                    this.f2243e = null;
                }
                m4739a();
                return;
            }
            if (!(this.f2243e == null || this.f2243e.mo3141c() == null)) {
                if (!this.f2243e.mo3141c().equals(this.f2239a)) {
                    this.f2243e.mo3139a();
                    m4739a();
                } else {
                    return;
                }
            }
            int i2 = z3 ? 0 : width;
            if (!z2) {
                i = height;
            }
            this.f2243e = this.f2242d.mo3130a(this.f2239a, new C0874u(this, z), i2, i);
        }
    }

    /* renamed from: a */
    private void m4739a() {
        if (this.f2240b != 0) {
            setImageResource(this.f2240b);
        } else {
            setImageBitmap((Bitmap) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo3105a(true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.f2243e != null) {
            this.f2243e.mo3139a();
            setImageBitmap((Bitmap) null);
            this.f2243e = null;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }
}
