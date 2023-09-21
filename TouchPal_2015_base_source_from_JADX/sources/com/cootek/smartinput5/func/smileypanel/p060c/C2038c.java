package com.cootek.smartinput5.func.smileypanel.p060c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.cootek.smartinput5.func.smileypanel.c.c */
/* compiled from: EmojiArtGroup */
public class C2038c {

    /* renamed from: a */
    private static final String f7071a = "tag";

    /* renamed from: b */
    private final int f7072b;

    /* renamed from: c */
    private C2037b[] f7073c;

    /* renamed from: d */
    private int f7074d = 0;

    public C2038c(int i, int i2) {
        this.f7072b = i;
        this.f7073c = new C2037b[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f7073c[i3] = new C2037b(i2);
        }
    }

    /* renamed from: a */
    public boolean mo7398a(C2039d dVar) {
        boolean z;
        int i = 0;
        int i2 = this.f7074d;
        int i3 = this.f7074d;
        boolean z2 = false;
        while (true) {
            if (i3 >= this.f7072b) {
                z = z2;
                break;
            }
            z2 = this.f7073c[i3].mo7396a(dVar);
            if (z2) {
                this.f7074d = (i3 + 1) % this.f7072b;
                z = z2;
                break;
            }
            i3++;
        }
        if (!z) {
            while (true) {
                if (i >= i2) {
                    break;
                }
                z = this.f7073c[i].mo7396a(dVar);
                if (z) {
                    this.f7074d = (i + 1) % this.f7072b;
                    break;
                }
                i++;
            }
        }
        return z;
    }

    /* renamed from: a */
    public View mo7397a(Context context, View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        if (linearLayout == null) {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(3);
        } else if (linearLayout.getChildCount() > this.f7072b) {
            linearLayout.removeAllViews();
        }
        for (int i = 0; i < this.f7072b; i++) {
            String str = "tag" + i;
            View findViewWithTag = linearLayout.findViewWithTag(str);
            LinearLayout a = this.f7073c[i].mo7395a(context, findViewWithTag);
            if (findViewWithTag == null) {
                a.setTag(str);
                linearLayout.addView(a, new LinearLayout.LayoutParams(-2, -2));
            }
        }
        return linearLayout;
    }
}
