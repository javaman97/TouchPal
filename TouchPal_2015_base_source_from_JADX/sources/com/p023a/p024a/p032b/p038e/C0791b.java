package com.p023a.p024a.p032b.p038e;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.p023a.p024a.p032b.p033a.C0760h;
import com.p023a.p024a.p041c.C0813d;
import java.lang.reflect.Field;

/* renamed from: com.a.a.b.e.b */
/* compiled from: ImageViewAware */
public class C0791b extends C0793d {
    public C0791b(ImageView imageView) {
        super(imageView);
    }

    public C0791b(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    /* renamed from: a */
    public int mo2973a() {
        ImageView imageView;
        int a = super.mo2973a();
        if (a > 0 || (imageView = (ImageView) this.f2053c.get()) == null) {
            return a;
        }
        return m4527a((Object) imageView, "mMaxWidth");
    }

    /* renamed from: b */
    public int mo2976b() {
        ImageView imageView;
        int b = super.mo2976b();
        if (b > 0 || (imageView = (ImageView) this.f2053c.get()) == null) {
            return b;
        }
        return m4527a((Object) imageView, "mMaxHeight");
    }

    /* renamed from: c */
    public C0760h mo2977c() {
        ImageView imageView = (ImageView) this.f2053c.get();
        if (imageView != null) {
            return C0760h.m4296a(imageView);
        }
        return super.mo2977c();
    }

    /* renamed from: g */
    public ImageView mo2978d() {
        return (ImageView) super.mo2978d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2982a(Drawable drawable, View view) {
        ((ImageView) view).setImageDrawable(drawable);
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2981a(Bitmap bitmap, View view) {
        ((ImageView) view).setImageBitmap(bitmap);
    }

    /* renamed from: a */
    private static int m4527a(Object obj, String str) {
        try {
            Field declaredField = ImageView.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(obj)).intValue();
            if (intValue > 0 && intValue < Integer.MAX_VALUE) {
                return intValue;
            }
        } catch (Exception e) {
            C0813d.m4623a((Throwable) e);
        }
        return 0;
    }
}
