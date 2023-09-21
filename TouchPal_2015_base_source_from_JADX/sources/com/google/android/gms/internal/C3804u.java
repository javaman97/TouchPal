package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.R;

/* renamed from: com.google.android.gms.internal.u */
public final class C3804u extends Button {
    public C3804u(Context context) {
        this(context, (AttributeSet) null);
    }

    public C3804u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    /* renamed from: a */
    private int m16683a(int i, int i2, int i3) {
        switch (i) {
            case 0:
                return i2;
            case 1:
                return i3;
            default:
                throw new IllegalStateException("Unknown color scheme: " + i);
        }
    }

    /* renamed from: b */
    private void m16684b(Resources resources, int i, int i2) {
        int a;
        switch (i) {
            case 0:
            case 1:
                a = m16683a(i2, R.drawable.common_signin_btn_text_dark, R.drawable.common_signin_btn_text_light);
                break;
            case 2:
                a = m16683a(i2, R.drawable.common_signin_btn_icon_dark, R.drawable.common_signin_btn_icon_light);
                break;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
        if (a == -1) {
            throw new IllegalStateException("Could not find background resource!");
        }
        setBackgroundDrawable(resources.getDrawable(a));
    }

    /* renamed from: c */
    private void m16685c(Resources resources) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int) ((f * 48.0f) + 0.5f));
        setMinWidth((int) ((f * 48.0f) + 0.5f));
    }

    /* renamed from: c */
    private void m16686c(Resources resources, int i, int i2) {
        setTextColor(resources.getColorStateList(m16683a(i2, R.color.common_signin_btn_text_dark, R.color.common_signin_btn_text_light)));
        switch (i) {
            case 0:
                setText(resources.getString(R.string.common_signin_button_text));
                return;
            case 1:
                setText(resources.getString(R.string.common_signin_button_text_long));
                return;
            case 2:
                setText((CharSequence) null);
                return;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
    }

    /* renamed from: a */
    public void mo12416a(Resources resources, int i, int i2) {
        boolean z = true;
        C3802s.m16673a(i >= 0 && i < 3, "Unknown button size " + i);
        if (i2 < 0 || i2 >= 2) {
            z = false;
        }
        C3802s.m16673a(z, "Unknown color scheme " + i2);
        m16685c(resources);
        m16684b(resources, i, i2);
        m16686c(resources, i, i2);
    }
}
