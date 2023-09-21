package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Settings;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.internal.C3608as;
import com.google.android.gms.internal.C3769f;
import com.google.android.gms.internal.C3774g;
import com.google.android.gms.internal.C3775h;
import com.google.android.gms.internal.C3799r;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.a */
public final class C3536a {

    /* renamed from: aG */
    final C3537a f15302aG;

    /* renamed from: aH */
    private int f15303aH;

    /* renamed from: aI */
    private int f15304aI;

    /* renamed from: aJ */
    int f15305aJ;

    /* renamed from: aK */
    private int f15306aK;

    /* renamed from: aL */
    private WeakReference<ImageManager.OnImageLoadedListener> f15307aL;

    /* renamed from: aM */
    private WeakReference<ImageView> f15308aM;

    /* renamed from: aN */
    private WeakReference<TextView> f15309aN;

    /* renamed from: aO */
    private int f15310aO;

    /* renamed from: aP */
    private boolean f15311aP;

    /* renamed from: aQ */
    private boolean f15312aQ;

    /* renamed from: com.google.android.gms.common.images.a$a */
    public static final class C3537a {
        public final Uri uri;

        public C3537a(Uri uri2) {
            this.uri = uri2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3537a)) {
                return false;
            }
            return this == obj || ((C3537a) obj).hashCode() == hashCode();
        }

        public int hashCode() {
            return C3799r.hashCode(this.uri);
        }
    }

    public C3536a(int i) {
        this.f15303aH = 0;
        this.f15304aI = 0;
        this.f15310aO = -1;
        this.f15311aP = true;
        this.f15312aQ = false;
        this.f15302aG = new C3537a((Uri) null);
        this.f15304aI = i;
    }

    public C3536a(Uri uri) {
        this.f15303aH = 0;
        this.f15304aI = 0;
        this.f15310aO = -1;
        this.f15311aP = true;
        this.f15312aQ = false;
        this.f15302aG = new C3537a(uri);
        this.f15304aI = 0;
    }

    /* renamed from: a */
    private C3769f m15404a(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof C3769f) {
            drawable = ((C3769f) drawable).mo12335r();
        }
        return new C3769f(drawable, drawable2);
    }

    /* renamed from: a */
    private void m15405a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageManager.OnImageLoadedListener onImageLoadedListener;
        switch (this.f15305aJ) {
            case 1:
                if (!z2 && (onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.f15307aL.get()) != null) {
                    onImageLoadedListener.onImageLoaded(this.f15302aG.uri, drawable);
                    return;
                }
                return;
            case 2:
                ImageView imageView = (ImageView) this.f15308aM.get();
                if (imageView != null) {
                    m15406a(imageView, drawable, z, z2, z3);
                    return;
                }
                return;
            case 3:
                TextView textView = (TextView) this.f15309aN.get();
                if (textView != null) {
                    m15407a(textView, this.f15310aO, drawable, z, z2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m15406a(ImageView imageView, Drawable drawable, boolean z, boolean z2, boolean z3) {
        boolean z4 = !z2 && !z3;
        if (z4 && (imageView instanceof C3774g)) {
            int t = ((C3774g) imageView).mo12352t();
            if (this.f15304aI != 0 && t == this.f15304aI) {
                return;
            }
        }
        boolean a = m15408a(z, z2);
        Drawable a2 = a ? m15404a(imageView.getDrawable(), drawable) : drawable;
        imageView.setImageDrawable(a2);
        if (imageView instanceof C3774g) {
            C3774g gVar = (C3774g) imageView;
            gVar.mo12350a(z3 ? this.f15302aG.uri : null);
            gVar.mo12351k(z4 ? this.f15304aI : 0);
        }
        if (a) {
            ((C3769f) a2).startTransition(Settings.VIBRATE_TIME);
        }
    }

    /* renamed from: a */
    private void m15407a(TextView textView, int i, Drawable drawable, boolean z, boolean z2) {
        boolean a = m15408a(z, z2);
        Drawable[] compoundDrawablesRelative = C3608as.m15702as() ? textView.getCompoundDrawablesRelative() : textView.getCompoundDrawables();
        Drawable a2 = a ? m15404a(compoundDrawablesRelative[i], drawable) : drawable;
        Drawable drawable2 = i == 0 ? a2 : compoundDrawablesRelative[0];
        Drawable drawable3 = i == 1 ? a2 : compoundDrawablesRelative[1];
        Drawable drawable4 = i == 2 ? a2 : compoundDrawablesRelative[2];
        Drawable drawable5 = i == 3 ? a2 : compoundDrawablesRelative[3];
        if (C3608as.m15702as()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        }
        if (a) {
            ((C3769f) a2).startTransition(Settings.VIBRATE_TIME);
        }
    }

    /* renamed from: a */
    private boolean m15408a(boolean z, boolean z2) {
        return this.f15311aP && !z2 && (!z || this.f15312aQ);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11021a(Context context, Bitmap bitmap, boolean z) {
        C3775h.m16567b(bitmap);
        m15405a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* renamed from: a */
    public void mo11022a(ImageView imageView) {
        C3775h.m16567b(imageView);
        this.f15307aL = null;
        this.f15308aM = new WeakReference<>(imageView);
        this.f15309aN = null;
        this.f15310aO = -1;
        this.f15305aJ = 2;
        this.f15306aK = imageView.hashCode();
    }

    /* renamed from: a */
    public void mo11023a(ImageManager.OnImageLoadedListener onImageLoadedListener) {
        C3775h.m16567b(onImageLoadedListener);
        this.f15307aL = new WeakReference<>(onImageLoadedListener);
        this.f15308aM = null;
        this.f15309aN = null;
        this.f15310aO = -1;
        this.f15305aJ = 1;
        this.f15306aK = C3799r.hashCode(onImageLoadedListener, this.f15302aG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11024b(Context context, boolean z) {
        Drawable drawable = null;
        if (this.f15304aI != 0) {
            drawable = context.getResources().getDrawable(this.f15304aI);
        }
        m15405a(drawable, z, false, false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3536a)) {
            return false;
        }
        return this == obj || ((C3536a) obj).hashCode() == hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11026f(Context context) {
        Drawable drawable = null;
        if (this.f15303aH != 0) {
            drawable = context.getResources().getDrawable(this.f15303aH);
        }
        m15405a(drawable, false, true, false);
    }

    public int hashCode() {
        return this.f15306aK;
    }

    /* renamed from: j */
    public void mo11028j(int i) {
        this.f15304aI = i;
    }
}
