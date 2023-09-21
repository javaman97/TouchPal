package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.f */
public final class C3769f extends Drawable implements Drawable.Callback {

    /* renamed from: aP */
    private boolean f15824aP;

    /* renamed from: aR */
    private int f15825aR;

    /* renamed from: aS */
    private long f15826aS;

    /* renamed from: aT */
    private int f15827aT;

    /* renamed from: aU */
    private int f15828aU;

    /* renamed from: aV */
    private int f15829aV;

    /* renamed from: aW */
    private int f15830aW;

    /* renamed from: aX */
    private int f15831aX;

    /* renamed from: aY */
    private boolean f15832aY;

    /* renamed from: aZ */
    private C3773b f15833aZ;

    /* renamed from: ba */
    private Drawable f15834ba;

    /* renamed from: bb */
    private Drawable f15835bb;

    /* renamed from: bc */
    private boolean f15836bc;

    /* renamed from: bd */
    private boolean f15837bd;

    /* renamed from: be */
    private boolean f15838be;

    /* renamed from: bf */
    private int f15839bf;

    /* renamed from: com.google.android.gms.internal.f$a */
    private static final class C3771a extends Drawable {
        /* access modifiers changed from: private */

        /* renamed from: bg */
        public static final C3771a f15840bg = new C3771a();

        /* renamed from: bh */
        private static final C3772a f15841bh = new C3772a();

        /* renamed from: com.google.android.gms.internal.f$a$a */
        private static final class C3772a extends Drawable.ConstantState {
            private C3772a() {
            }

            public int getChangingConfigurations() {
                return 0;
            }

            public Drawable newDrawable() {
                return C3771a.f15840bg;
            }
        }

        private C3771a() {
        }

        public void draw(Canvas canvas) {
        }

        public Drawable.ConstantState getConstantState() {
            return f15841bh;
        }

        public int getOpacity() {
            return -2;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* renamed from: com.google.android.gms.internal.f$b */
    static final class C3773b extends Drawable.ConstantState {

        /* renamed from: bi */
        int f15842bi;

        /* renamed from: bj */
        int f15843bj;

        C3773b(C3773b bVar) {
            if (bVar != null) {
                this.f15842bi = bVar.f15842bi;
                this.f15843bj = bVar.f15843bj;
            }
        }

        public int getChangingConfigurations() {
            return this.f15842bi;
        }

        public Drawable newDrawable() {
            return new C3769f(this);
        }
    }

    public C3769f(Drawable drawable, Drawable drawable2) {
        this((C3773b) null);
        drawable = drawable == null ? C3771a.f15840bg : drawable;
        this.f15834ba = drawable;
        drawable.setCallback(this);
        this.f15833aZ.f15843bj |= drawable.getChangingConfigurations();
        drawable2 = drawable2 == null ? C3771a.f15840bg : drawable2;
        this.f15835bb = drawable2;
        drawable2.setCallback(this);
        this.f15833aZ.f15843bj |= drawable2.getChangingConfigurations();
    }

    C3769f(C3773b bVar) {
        this.f15825aR = 0;
        this.f15829aV = 255;
        this.f15831aX = 0;
        this.f15824aP = true;
        this.f15833aZ = new C3773b(bVar);
    }

    public boolean canConstantState() {
        if (!this.f15836bc) {
            this.f15837bd = (this.f15834ba.getConstantState() == null || this.f15835bb.getConstantState() == null) ? false : true;
            this.f15836bc = true;
        }
        return this.f15837bd;
    }

    public void draw(Canvas canvas) {
        boolean z = true;
        boolean z2 = false;
        switch (this.f15825aR) {
            case 1:
                this.f15826aS = SystemClock.uptimeMillis();
                this.f15825aR = 2;
                break;
            case 2:
                if (this.f15826aS >= 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f15826aS)) / ((float) this.f15830aW);
                    if (uptimeMillis < 1.0f) {
                        z = false;
                    }
                    if (z) {
                        this.f15825aR = 0;
                    }
                    this.f15831aX = (int) ((Math.min(uptimeMillis, 1.0f) * ((float) (this.f15828aU - this.f15827aT))) + ((float) this.f15827aT));
                    break;
                }
                break;
        }
        z2 = z;
        int i = this.f15831aX;
        boolean z3 = this.f15824aP;
        Drawable drawable = this.f15834ba;
        Drawable drawable2 = this.f15835bb;
        if (z2) {
            if (!z3 || i == 0) {
                drawable.draw(canvas);
            }
            if (i == this.f15829aV) {
                drawable2.setAlpha(this.f15829aV);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z3) {
            drawable.setAlpha(this.f15829aV - i);
        }
        drawable.draw(canvas);
        if (z3) {
            drawable.setAlpha(this.f15829aV);
        }
        if (i > 0) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f15829aV);
        }
        invalidateSelf();
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f15833aZ.f15842bi | this.f15833aZ.f15843bj;
    }

    public Drawable.ConstantState getConstantState() {
        if (!canConstantState()) {
            return null;
        }
        this.f15833aZ.f15842bi = getChangingConfigurations();
        return this.f15833aZ;
    }

    public int getIntrinsicHeight() {
        return Math.max(this.f15834ba.getIntrinsicHeight(), this.f15835bb.getIntrinsicHeight());
    }

    public int getIntrinsicWidth() {
        return Math.max(this.f15834ba.getIntrinsicWidth(), this.f15835bb.getIntrinsicWidth());
    }

    public int getOpacity() {
        if (!this.f15838be) {
            this.f15839bf = Drawable.resolveOpacity(this.f15834ba.getOpacity(), this.f15835bb.getOpacity());
            this.f15838be = true;
        }
        return this.f15839bf;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback;
        if (C3608as.m15697an() && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    public Drawable mutate() {
        if (!this.f15832aY && super.mutate() == this) {
            if (!canConstantState()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f15834ba.mutate();
            this.f15835bb.mutate();
            this.f15832aY = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f15834ba.setBounds(rect);
        this.f15835bb.setBounds(rect);
    }

    /* renamed from: r */
    public Drawable mo12335r() {
        return this.f15835bb;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback;
        if (C3608as.m15697an() && (callback = getCallback()) != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f15831aX == this.f15829aV) {
            this.f15831aX = i;
        }
        this.f15829aV = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f15834ba.setColorFilter(colorFilter);
        this.f15835bb.setColorFilter(colorFilter);
    }

    public void startTransition(int i) {
        this.f15827aT = 0;
        this.f15828aU = this.f15829aV;
        this.f15831aX = 0;
        this.f15830aW = i;
        this.f15825aR = 1;
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback;
        if (C3608as.m15697an() && (callback = getCallback()) != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
