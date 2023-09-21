package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.KeyboardMaskArrowPair */
public abstract class KeyboardMaskArrowPair extends View {

    /* renamed from: a */
    public static final int f13485a = 0;

    /* renamed from: b */
    public static final int f13486b = 1;

    /* renamed from: c */
    public static final int f13487c = 2;

    /* renamed from: d */
    public static final int f13488d = 3;

    /* renamed from: e */
    protected static final int f13489e = 0;

    /* renamed from: f */
    protected static final int f13490f = 1;

    /* renamed from: g */
    protected static final int f13491g = 2;

    /* renamed from: h */
    protected static final int f13492h = 3;

    /* renamed from: i */
    protected Drawable f13493i;

    /* renamed from: j */
    protected Drawable f13494j;

    /* renamed from: k */
    protected Drawable f13495k;

    /* renamed from: l */
    protected Drawable f13496l;

    /* renamed from: m */
    protected int f13497m = 0;

    /* renamed from: n */
    protected int f13498n = 0;

    /* renamed from: o */
    protected Context f13499o;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo9859a();

    public abstract int getArrowPairHeight();

    public abstract int getArrowPairWidth();

    public KeyboardMaskArrowPair(Context context) {
        super(context);
        this.f13499o = context;
        mo9859a();
    }

    /* renamed from: c */
    public boolean mo9876c() {
        return false;
    }

    /* renamed from: b */
    public boolean mo9860b() {
        return false;
    }

    /* renamed from: a */
    public void mo9875a(boolean z, boolean z2) {
        this.f13497m = 0;
        if (z) {
            this.f13498n = 1;
        }
        if (z2) {
            this.f13498n = 2;
        }
        invalidate();
    }

    /* renamed from: d */
    public void mo9877d() {
        this.f13498n = 3;
        invalidate();
    }

    /* renamed from: e */
    public void mo9878e() {
        this.f13498n = 0;
        invalidate();
    }

    public void setDisableArrowIndex(int i) {
        this.f13497m = i;
        invalidate();
    }
}
