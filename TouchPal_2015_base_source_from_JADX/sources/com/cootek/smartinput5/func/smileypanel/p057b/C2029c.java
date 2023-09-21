package com.cootek.smartinput5.func.smileypanel.p057b;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.smileypanel.b.c */
/* compiled from: DisplayLine */
public class C2029c {

    /* renamed from: e */
    private static final float f7052e = 0.5f;

    /* renamed from: a */
    private ArrayList<C2011a> f7053a = new ArrayList<>();

    /* renamed from: b */
    private final int f7054b;

    /* renamed from: c */
    private int f7055c = 0;

    /* renamed from: d */
    private int f7056d = 0;

    public C2029c(int i, int i2) {
        this.f7054b = i;
        this.f7056d = i2;
    }

    /* renamed from: a */
    public boolean mo7381a(C2011a aVar) {
        int a;
        int i = this.f7054b - this.f7055c;
        if (i >= aVar.mo7362a()) {
            this.f7053a.add(aVar);
            this.f7055c += aVar.mo7362a();
            return true;
        } else if (this.f7053a.size() == 0) {
            this.f7055c = this.f7054b;
            this.f7053a.add(aVar);
            aVar.mo7364a(this.f7054b);
            return true;
        } else if (((float) i) > ((float) aVar.mo7362a()) * f7052e) {
            this.f7053a.add(aVar);
            this.f7055c = this.f7054b;
            aVar.mo7364a(i);
            return true;
        } else {
            C2011a aVar2 = this.f7053a.get(this.f7053a.size() - 1);
            int b = aVar2.mo7365b();
            if (b < Integer.MAX_VALUE) {
                a = i + b;
            } else {
                a = i + aVar2.mo7362a();
            }
            aVar2.mo7364a(a);
            return false;
        }
    }

    /* renamed from: a */
    public View mo7380a(Context context, View view, int i) {
        View view2;
        LinearLayout linearLayout;
        int i2;
        if (view == null || view.findViewWithTag("row_0") != null) {
            view2 = view;
        } else {
            view2 = null;
        }
        if (view2 == null) {
            linearLayout = new LinearLayout(context);
        } else {
            linearLayout = (LinearLayout) view2;
        }
        linearLayout.setOrientation(0);
        if (this.f7053a.size() > 0) {
            i2 = this.f7056d / this.f7053a.size();
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < this.f7054b; i3++) {
            String str = "row_" + i3;
            View findViewWithTag = linearLayout.findViewWithTag(str);
            if (i3 < this.f7053a.size()) {
                C2011a aVar = this.f7053a.get(i3);
                aVar.mo7366b(i2);
                View a = aVar.mo7363a(context, findViewWithTag, i);
                if (findViewWithTag == null) {
                    a.setTag(str);
                    linearLayout.addView(a);
                }
                a.setVisibility(0);
            } else if (findViewWithTag != null) {
                findViewWithTag.setVisibility(8);
            }
        }
        linearLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        return linearLayout;
    }
}
