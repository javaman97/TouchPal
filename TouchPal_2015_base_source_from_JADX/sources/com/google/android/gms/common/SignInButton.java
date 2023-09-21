package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.C3554e;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.internal.C3803t;
import com.google.android.gms.internal.C3804u;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;

    /* renamed from: O */
    private int f15249O;

    /* renamed from: P */
    private int f15250P;

    /* renamed from: Q */
    private View f15251Q;

    /* renamed from: R */
    private View.OnClickListener f15252R;

    public SignInButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15252R = null;
        setStyle(0, 0);
    }

    /* renamed from: c */
    private static Button m15345c(Context context, int i, int i2) {
        C3804u uVar = new C3804u(context);
        uVar.mo12416a(context.getResources(), i, i2);
        return uVar;
    }

    /* renamed from: d */
    private void m15346d(Context context) {
        if (this.f15251Q != null) {
            removeView(this.f15251Q);
        }
        try {
            this.f15251Q = C3803t.m16679d(context, this.f15249O, this.f15250P);
        } catch (C3554e.C3555a e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            this.f15251Q = m15345c(context, this.f15249O, this.f15250P);
        }
        addView(this.f15251Q);
        this.f15251Q.setEnabled(isEnabled());
        this.f15251Q.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (this.f15252R != null && view == this.f15251Q) {
            this.f15252R.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        setStyle(this.f15249O, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f15251Q.setEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f15252R = onClickListener;
        if (this.f15251Q != null) {
            this.f15251Q.setOnClickListener(this);
        }
    }

    public void setSize(int i) {
        setStyle(i, this.f15250P);
    }

    public void setStyle(int i, int i2) {
        boolean z = true;
        C3802s.m16673a(i >= 0 && i < 3, "Unknown button size " + i);
        if (i2 < 0 || i2 >= 2) {
            z = false;
        }
        C3802s.m16673a(z, "Unknown color scheme " + i2);
        this.f15249O = i;
        this.f15250P = i2;
        m15346d(getContext());
    }
}
