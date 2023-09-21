package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.C3552c;
import com.google.android.gms.dynamic.C3554e;
import com.google.android.gms.internal.C3796q;

/* renamed from: com.google.android.gms.internal.t */
public final class C3803t extends C3554e<C3796q> {

    /* renamed from: ca */
    private static final C3803t f15895ca = new C3803t();

    private C3803t() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: d */
    public static View m16679d(Context context, int i, int i2) throws C3554e.C3555a {
        return f15895ca.m16680e(context, i, i2);
    }

    /* renamed from: e */
    private View m16680e(Context context, int i, int i2) throws C3554e.C3555a {
        try {
            return (View) C3552c.m15489a(((C3796q) mo11059h(context)).mo12410a(C3552c.m15490f(context), i, i2));
        } catch (Exception e) {
            throw new C3554e.C3555a("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    /* renamed from: j */
    public C3796q mo11060k(IBinder iBinder) {
        return C3796q.C3797a.m16667i(iBinder);
    }
}
