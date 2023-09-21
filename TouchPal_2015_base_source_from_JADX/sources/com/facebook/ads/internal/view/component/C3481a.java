package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.C3329E;
import com.facebook.ads.C3509x;
import com.facebook.ads.internal.view.C3486e;
import com.facebook.ads.internal.view.C3487f;

/* renamed from: com.facebook.ads.internal.view.component.a */
public class C3481a extends LinearLayout {

    /* renamed from: a */
    private C3487f f15081a = new C3487f(getContext(), 2);

    /* renamed from: b */
    private int f15082b;

    public C3481a(Context context, C3509x xVar, C3329E e) {
        super(context);
        setOrientation(1);
        setVerticalGravity(16);
        this.f15081a.setMinTextSize((float) (e.mo10541h() - 2));
        this.f15081a.setText(xVar.mo10868f());
        C3486e.m15202a(this.f15081a, e);
        this.f15081a.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(this.f15081a);
        this.f15082b = Math.min(xVar.mo10868f().length(), 21);
        addView(C3486e.m15201a(context, xVar, e));
    }

    public int getMinVisibleTitleCharacters() {
        return this.f15082b;
    }

    public TextView getTitleTextView() {
        return this.f15081a;
    }
}
