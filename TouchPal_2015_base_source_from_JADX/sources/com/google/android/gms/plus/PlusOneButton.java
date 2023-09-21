package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.C3719bu;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.internal.C3805v;

public final class PlusOneButton extends FrameLayout {
    public static final int ANNOTATION_BUBBLE = 1;
    public static final int ANNOTATION_INLINE = 2;
    public static final int ANNOTATION_NONE = 0;
    public static final int DEFAULT_ACTIVITY_REQUEST_CODE = -1;
    public static final int SIZE_MEDIUM = 1;
    public static final int SIZE_SMALL = 0;
    public static final int SIZE_STANDARD = 3;
    public static final int SIZE_TALL = 2;

    /* renamed from: O */
    private int f16123O;
    /* access modifiers changed from: private */

    /* renamed from: ic */
    public View f16124ic;

    /* renamed from: id */
    private int f16125id;

    /* renamed from: ie */
    private String f16126ie;
    /* access modifiers changed from: private */

    /* renamed from: if */
    public int f16127if;

    /* renamed from: ig */
    private OnPlusOneClickListener f16128ig;

    protected class DefaultOnPlusOneClickListener implements View.OnClickListener, OnPlusOneClickListener {

        /* renamed from: ih */
        private final OnPlusOneClickListener f16129ih;

        public DefaultOnPlusOneClickListener(OnPlusOneClickListener onPlusOneClickListener) {
            this.f16129ih = onPlusOneClickListener;
        }

        public void onClick(View view) {
            Intent intent = (Intent) PlusOneButton.this.f16124ic.getTag();
            if (this.f16129ih != null) {
                this.f16129ih.onPlusOneClick(intent);
            } else {
                onPlusOneClick(intent);
            }
        }

        public void onPlusOneClick(Intent intent) {
            Context context = PlusOneButton.this.getContext();
            if ((context instanceof Activity) && intent != null) {
                ((Activity) context).startActivityForResult(intent, PlusOneButton.this.f16127if);
            }
        }
    }

    public interface OnPlusOneClickListener {
        void onPlusOneClick(Intent intent);
    }

    public PlusOneButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public PlusOneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16123O = getSize(context, attributeSet);
        this.f16125id = getAnnotation(context, attributeSet);
        this.f16127if = -1;
        m16905d(getContext());
        if (isInEditMode()) {
        }
    }

    /* renamed from: d */
    private void m16905d(Context context) {
        if (this.f16124ic != null) {
            removeView(this.f16124ic);
        }
        this.f16124ic = C3719bu.m16319a(context, this.f16123O, this.f16125id, this.f16126ie, this.f16127if);
        setOnPlusOneClickListener(this.f16128ig);
        addView(this.f16124ic);
    }

    protected static int getAnnotation(Context context, AttributeSet attributeSet) {
        String a = C3805v.m16688a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(a)) {
            return 2;
        }
        return !"NONE".equalsIgnoreCase(a) ? 1 : 0;
    }

    protected static int getSize(Context context, AttributeSet attributeSet) {
        String a = C3805v.m16688a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(a)) {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(a)) {
            return 1;
        }
        return "TALL".equalsIgnoreCase(a) ? 2 : 3;
    }

    public void initialize(String str, int i) {
        C3802s.m16673a(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(PlusClient, String, OnPlusOneClickListener).");
        this.f16126ie = str;
        this.f16127if = i;
        m16905d(getContext());
    }

    public void initialize(String str, OnPlusOneClickListener onPlusOneClickListener) {
        this.f16126ie = str;
        this.f16127if = 0;
        m16905d(getContext());
        setOnPlusOneClickListener(onPlusOneClickListener);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f16124ic.layout(0, 0, i3 - i, i4 - i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.f16124ic;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.f16125id = i;
        m16905d(getContext());
    }

    public void setOnPlusOneClickListener(OnPlusOneClickListener onPlusOneClickListener) {
        this.f16128ig = onPlusOneClickListener;
        this.f16124ic.setOnClickListener(new DefaultOnPlusOneClickListener(onPlusOneClickListener));
    }

    public void setSize(int i) {
        this.f16123O = i;
        m16905d(getContext());
    }
}
