package com.p023a.p024a.p032b.p038e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.p023a.p024a.p032b.p033a.C0757e;
import com.p023a.p024a.p032b.p033a.C0760h;

/* renamed from: com.a.a.b.e.c */
/* compiled from: NonViewAware */
public class C0792c implements C0790a {

    /* renamed from: a */
    protected final String f2048a;

    /* renamed from: b */
    protected final C0757e f2049b;

    /* renamed from: c */
    protected final C0760h f2050c;

    public C0792c(C0757e eVar, C0760h hVar) {
        this((String) null, eVar, hVar);
    }

    public C0792c(String str, C0757e eVar, C0760h hVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("imageSize must not be null");
        } else if (hVar == null) {
            throw new IllegalArgumentException("scaleType must not be null");
        } else {
            this.f2048a = str;
            this.f2049b = eVar;
            this.f2050c = hVar;
        }
    }

    /* renamed from: a */
    public int mo2973a() {
        return this.f2049b.mo2820a();
    }

    /* renamed from: b */
    public int mo2976b() {
        return this.f2049b.mo2823b();
    }

    /* renamed from: c */
    public C0760h mo2977c() {
        return this.f2050c;
    }

    /* renamed from: d */
    public View mo2978d() {
        return null;
    }

    /* renamed from: e */
    public boolean mo2979e() {
        return false;
    }

    /* renamed from: f */
    public int mo2980f() {
        return TextUtils.isEmpty(this.f2048a) ? super.hashCode() : this.f2048a.hashCode();
    }

    /* renamed from: a */
    public boolean mo2975a(Drawable drawable) {
        return true;
    }

    /* renamed from: a */
    public boolean mo2974a(Bitmap bitmap) {
        return true;
    }
}
