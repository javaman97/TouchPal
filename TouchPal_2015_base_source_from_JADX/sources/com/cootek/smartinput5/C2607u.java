package com.cootek.smartinput5;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.cootek.smartinput5.Guide;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.u */
/* compiled from: Guide */
class C2607u extends Guide.C1027a {

    /* renamed from: b */
    final /* synthetic */ int f11145b;

    /* renamed from: c */
    final /* synthetic */ Guide.C1028b f11146c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2607u(Guide.C1028b bVar, int i) {
        super(Guide.this, (C1318f) null);
        this.f11146c = bVar;
        this.f11145b = i;
    }

    /* renamed from: a */
    public void mo4127a() {
        View findViewById = ((LinearLayout) Guide.this.findViewById(R.id.guide_buttons)).findViewById(this.f11145b);
        findViewById.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(Guide.this.getApplicationContext(), R.anim.guide_entrance_buttons_animation);
        loadAnimation.setFillAfter(true);
        loadAnimation.setDuration((long) Guide.this.f2748e);
        findViewById.startAnimation(loadAnimation);
    }
}
