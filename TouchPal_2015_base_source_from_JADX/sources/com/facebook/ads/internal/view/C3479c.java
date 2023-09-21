package com.facebook.ads.internal.view;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.C3327D;
import com.facebook.ads.C3329E;
import com.facebook.ads.C3509x;
import com.facebook.ads.internal.p077h.C3445l;
import com.facebook.ads.internal.view.component.C3482b;
import com.facebook.ads.internal.view.component.C3484d;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.c */
public class C3479c extends RelativeLayout {

    /* renamed from: a */
    private final C3329E f15076a;

    /* renamed from: b */
    private final C3509x f15077b;

    /* renamed from: c */
    private final int f15078c;

    /* renamed from: d */
    private final DisplayMetrics f15079d;

    public C3479c(Context context, C3509x xVar, C3327D.C3328a aVar, C3329E e) {
        super(context);
        setBackgroundColor(e.mo10530b());
        this.f15076a = e;
        this.f15077b = xVar;
        this.f15079d = context.getResources().getDisplayMetrics();
        this.f15078c = aVar.mo10526b();
        setLayoutParams(new RelativeLayout.LayoutParams(-1, Math.round(((float) this.f15078c) * this.f15079d.density)));
        C3489h hVar = new C3489h(context);
        hVar.setMinWidth(Math.round(280.0f * this.f15079d.density));
        hVar.setMaxWidth(Math.round(375.0f * this.f15079d.density));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        hVar.setLayoutParams(layoutParams);
        addView(hVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        hVar.addView(linearLayout);
        switch (aVar) {
            case HEIGHT_400:
                m15195b((ViewGroup) linearLayout);
                break;
            case HEIGHT_300:
                break;
        }
        m15191a((ViewGroup) linearLayout);
        m15192a(linearLayout, aVar);
        AdChoicesView adChoicesView = new AdChoicesView(getContext(), xVar);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) adChoicesView.getLayoutParams();
        layoutParams2.addRule(11);
        layoutParams2.setMargins(Math.round(this.f15079d.density * 4.0f), Math.round(this.f15079d.density * 4.0f), Math.round(this.f15079d.density * 4.0f), Math.round(this.f15079d.density * 4.0f));
        hVar.addView(adChoicesView);
    }

    /* renamed from: a */
    private void m15191a(ViewGroup viewGroup) {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(this.f15079d.density * 180.0f)));
        relativeLayout.setBackgroundColor(this.f15076a.mo10530b());
        C3485d dVar = new C3485d(getContext());
        relativeLayout.addView(dVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (this.f15079d.density * 180.0f));
        layoutParams.addRule(13, -1);
        dVar.setLayoutParams(layoutParams);
        new C3445l(dVar).execute(new String[]{this.f15077b.mo10867e().mo10878a()});
        viewGroup.addView(relativeLayout);
    }

    /* renamed from: a */
    private void m15192a(ViewGroup viewGroup, C3327D.C3328a aVar) {
        C3482b bVar = new C3482b(getContext(), this.f15077b, this.f15076a, m15193a(aVar), m15194b(aVar));
        bVar.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(((float) m15194b(aVar)) * this.f15079d.density)));
        viewGroup.addView(bVar);
        this.f15077b.mo10861a((View) this, (List<View>) Arrays.asList(new View[]{bVar.getIconView(), bVar.getCallToActionView()}));
    }

    /* renamed from: a */
    private boolean m15193a(C3327D.C3328a aVar) {
        return aVar == C3327D.C3328a.HEIGHT_300 || aVar == C3327D.C3328a.HEIGHT_120;
    }

    /* renamed from: b */
    private int m15194b(C3327D.C3328a aVar) {
        switch (aVar) {
            case HEIGHT_400:
                return (aVar.mo10526b() - 180) / 2;
            case HEIGHT_300:
                return aVar.mo10526b() - 180;
            case HEIGHT_100:
            case HEIGHT_120:
                return aVar.mo10526b();
            default:
                return 0;
        }
    }

    /* renamed from: b */
    private void m15195b(ViewGroup viewGroup) {
        C3484d dVar = new C3484d(getContext(), this.f15077b, this.f15076a);
        dVar.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(110.0f * this.f15079d.density)));
        viewGroup.addView(dVar);
    }
}
