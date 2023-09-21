package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.internal.view.k */
public class C3493k extends View {

    /* renamed from: a */
    private C3494l f15120a;

    public C3493k(Context context, C3494l lVar) {
        super(context);
        this.f15120a = lVar;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    public void onWindowVisibilityChanged(int i) {
        if (this.f15120a != null) {
            this.f15120a.mo10515a(i);
        }
    }
}
