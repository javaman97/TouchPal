package com.p023a.p024a.p032b.p038e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.p023a.p024a.p032b.p033a.C0760h;
import com.p023a.p024a.p041c.C0813d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: com.a.a.b.e.d */
/* compiled from: ViewAware */
public abstract class C0793d implements C0790a {

    /* renamed from: a */
    public static final String f2051a = "Can't set a drawable into view. You should call ImageLoader on UI thread for it.";

    /* renamed from: b */
    public static final String f2052b = "Can't set a bitmap into view. You should call ImageLoader on UI thread for it.";

    /* renamed from: c */
    protected Reference<View> f2053c;

    /* renamed from: d */
    protected boolean f2054d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2981a(Bitmap bitmap, View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2982a(Drawable drawable, View view);

    public C0793d(View view) {
        this(view, true);
    }

    public C0793d(View view, boolean z) {
        if (view == null) {
            throw new IllegalArgumentException("view must not be null");
        }
        this.f2053c = new WeakReference(view);
        this.f2054d = z;
    }

    /* renamed from: a */
    public int mo2973a() {
        int i;
        View view = this.f2053c.get();
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!this.f2054d || layoutParams == null || layoutParams.width == -2) {
            i = 0;
        } else {
            i = view.getWidth();
        }
        if (i > 0 || layoutParams == null) {
            return i;
        }
        return layoutParams.width;
    }

    /* renamed from: b */
    public int mo2976b() {
        int i;
        View view = this.f2053c.get();
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!this.f2054d || layoutParams == null || layoutParams.height == -2) {
            i = 0;
        } else {
            i = view.getHeight();
        }
        if (i > 0 || layoutParams == null) {
            return i;
        }
        return layoutParams.height;
    }

    /* renamed from: c */
    public C0760h mo2977c() {
        return C0760h.CROP;
    }

    /* renamed from: d */
    public View mo2978d() {
        return this.f2053c.get();
    }

    /* renamed from: e */
    public boolean mo2979e() {
        return this.f2053c.get() == null;
    }

    /* renamed from: f */
    public int mo2980f() {
        View view = this.f2053c.get();
        return view == null ? super.hashCode() : view.hashCode();
    }

    /* renamed from: a */
    public boolean mo2975a(Drawable drawable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = this.f2053c.get();
            if (view != null) {
                mo2982a(drawable, view);
                return true;
            }
        } else {
            C0813d.m4629c(f2051a, new Object[0]);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2974a(Bitmap bitmap) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = this.f2053c.get();
            if (view != null) {
                mo2981a(bitmap, view);
                return true;
            }
        } else {
            C0813d.m4629c(f2052b, new Object[0]);
        }
        return false;
    }
}
