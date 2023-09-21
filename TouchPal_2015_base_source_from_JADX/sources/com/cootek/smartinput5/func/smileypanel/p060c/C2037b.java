package com.cootek.smartinput5.func.smileypanel.p060c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.smileypanel.c.b */
/* compiled from: EmojiArtColumn */
public class C2037b {

    /* renamed from: d */
    private static final String f7067d = "item";

    /* renamed from: a */
    private final int f7068a;

    /* renamed from: b */
    private int f7069b;

    /* renamed from: c */
    private ArrayList<C2039d> f7070c = new ArrayList<>();

    public C2037b(int i) {
        this.f7068a = i;
    }

    /* renamed from: a */
    public boolean mo7396a(C2039d dVar) {
        if (this.f7069b + dVar.mo7404d() > this.f7068a) {
            return false;
        }
        this.f7069b += dVar.mo7404d();
        this.f7070c.add(dVar);
        return true;
    }

    /* renamed from: a */
    public LinearLayout mo7395a(Context context, View view) {
        boolean z;
        LinearLayout linearLayout = (LinearLayout) view;
        if (linearLayout == null) {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
        }
        for (int i = 0; i < this.f7068a; i++) {
            String str = f7067d + i;
            View findViewWithTag = linearLayout.findViewWithTag(str);
            if (i < this.f7070c.size()) {
                C2039d dVar = this.f7070c.get(i);
                int i2 = this.f7068a;
                if (this.f7070c.size() == this.f7068a) {
                    z = true;
                } else {
                    z = false;
                }
                View a = dVar.mo7399a(context, findViewWithTag, i2, z);
                a.setTag(str);
                a.setVisibility(0);
                if (findViewWithTag == null) {
                    linearLayout.addView(a);
                }
            } else if (findViewWithTag != null) {
                findViewWithTag.setVisibility(8);
            }
        }
        return linearLayout;
    }
}
