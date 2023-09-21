package com.cootek.smartinput5;

import android.view.View;

/* renamed from: com.cootek.smartinput5.Q */
/* compiled from: GuideSkinSelectorActivity */
class C1038Q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f2854a;

    /* renamed from: b */
    final /* synthetic */ GuideSkinSelectorActivity f2855b;

    C1038Q(GuideSkinSelectorActivity guideSkinSelectorActivity, int i) {
        this.f2855b = guideSkinSelectorActivity;
        this.f2854a = i;
    }

    public void onClick(View view) {
        int unused = this.f2855b.f2843p = this.f2854a;
        this.f2855b.mo4147b();
    }
}
