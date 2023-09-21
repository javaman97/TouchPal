package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.C3329E;
import com.facebook.ads.C3509x;
import com.facebook.ads.internal.view.C3486e;

/* renamed from: com.facebook.ads.internal.view.component.d */
public class C3484d extends LinearLayout {
    public C3484d(Context context, C3509x xVar, C3329E e) {
        super(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVerticalGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f));
        linearLayout.setLayoutParams(layoutParams);
        addView(linearLayout);
        TextView textView = new TextView(getContext());
        textView.setText(xVar.mo10869g());
        C3486e.m15202a(textView, e);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(getContext());
        textView2.setText(xVar.mo10870h());
        C3486e.m15203b(textView2, e);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(2);
        linearLayout.addView(textView2);
    }
}
