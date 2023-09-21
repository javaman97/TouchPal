package com.google.android.gms.plus;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.C3706br;
import com.google.android.gms.internal.C3719bu;
import com.google.android.gms.internal.C3802s;

public final class PlusOneButtonWithPopup extends ViewGroup {

    /* renamed from: O */
    private int f16131O;

    /* renamed from: g */
    private String f16132g;

    /* renamed from: ic */
    private View f16133ic;

    /* renamed from: id */
    private int f16134id;

    /* renamed from: ie */
    private String f16135ie;

    /* renamed from: ij */
    private View.OnClickListener f16136ij;

    public PlusOneButtonWithPopup(Context context) {
        this(context, (AttributeSet) null);
    }

    public PlusOneButtonWithPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16131O = PlusOneButton.getSize(context, attributeSet);
        this.f16134id = PlusOneButton.getAnnotation(context, attributeSet);
        this.f16133ic = new PlusOneDummyView(context, this.f16131O);
        addView(this.f16133ic);
    }

    /* renamed from: bv */
    private void m16906bv() {
        if (this.f16133ic != null) {
            removeView(this.f16133ic);
        }
        this.f16133ic = C3719bu.m16320a(getContext(), this.f16131O, this.f16134id, this.f16135ie, this.f16132g);
        if (this.f16136ij != null) {
            setOnClickListener(this.f16136ij);
        }
        addView(this.f16133ic);
    }

    /* renamed from: bw */
    private C3706br m16907bw() throws RemoteException {
        C3706br aa = C3706br.C3707a.m16228aa((IBinder) this.f16133ic.getTag());
        if (aa != null) {
            return aa;
        }
        if (Log.isLoggable("PlusOneButtonWithPopup", 5)) {
            Log.w("PlusOneButtonWithPopup", "Failed to get PlusOneDelegate");
        }
        throw new RemoteException();
    }

    /* renamed from: c */
    private int m16908c(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        switch (mode) {
            case Integer.MIN_VALUE:
            case 1073741824:
                return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - i2, mode);
            default:
                return i;
        }
    }

    public void cancelClick() {
        if (this.f16133ic != null) {
            try {
                m16907bw().cancelClick();
            } catch (RemoteException e) {
            }
        }
    }

    public PendingIntent getResolution() {
        if (this.f16133ic != null) {
            try {
                return m16907bw().getResolution();
            } catch (RemoteException e) {
            }
        }
        return null;
    }

    public void initialize(String str, String str2) {
        C3802s.m16675b(str, (Object) "Url must not be null");
        this.f16135ie = str;
        this.f16132g = str2;
        m16906bv();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f16133ic.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        this.f16133ic.measure(m16908c(i, paddingLeft), m16908c(i2, paddingTop));
        setMeasuredDimension(paddingLeft + this.f16133ic.getMeasuredWidth(), paddingTop + this.f16133ic.getMeasuredHeight());
    }

    public void reinitialize() {
        if (this.f16133ic != null) {
            try {
                m16907bw().reinitialize();
            } catch (RemoteException e) {
            }
        }
    }

    public void setAnnotation(int i) {
        this.f16134id = i;
        m16906bv();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f16136ij = onClickListener;
        this.f16133ic.setOnClickListener(onClickListener);
    }

    public void setSize(int i) {
        this.f16131O = i;
        m16906bv();
    }
}
