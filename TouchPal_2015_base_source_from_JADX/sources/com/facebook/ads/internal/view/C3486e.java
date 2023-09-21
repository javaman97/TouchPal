package com.facebook.ads.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.facebook.ads.C3329E;
import com.facebook.ads.C3509x;

/* renamed from: com.facebook.ads.internal.view.e */
public abstract class C3486e {
    /* renamed from: a */
    public static LinearLayout m15201a(Context context, C3509x xVar, C3329E e) {
        LinearLayout linearLayout = new LinearLayout(context);
        C3509x.C3512c k = xVar.mo10873k();
        if (k == null || k.mo10882a() < 3.0d) {
            C3488g gVar = new C3488g(context);
            gVar.setText(xVar.mo10872j());
            m15203b(gVar, e);
            linearLayout.addView(gVar);
        } else {
            RatingBar ratingBar = new RatingBar(context, (AttributeSet) null, 16842877);
            ratingBar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            ratingBar.setStepSize(0.1f);
            ratingBar.setIsIndicator(true);
            ratingBar.setNumStars((int) k.mo10883b());
            ratingBar.setRating((float) k.mo10882a());
            linearLayout.addView(ratingBar);
        }
        return linearLayout;
    }

    /* renamed from: a */
    public static void m15202a(TextView textView, C3329E e) {
        textView.setTextColor(e.mo10532c());
        textView.setTextSize((float) e.mo10541h());
        textView.setTypeface(e.mo10527a(), 1);
    }

    /* renamed from: b */
    public static void m15203b(TextView textView, C3329E e) {
        textView.setTextColor(e.mo10534d());
        textView.setTextSize((float) e.mo10542i());
        textView.setTypeface(e.mo10527a());
    }
}
