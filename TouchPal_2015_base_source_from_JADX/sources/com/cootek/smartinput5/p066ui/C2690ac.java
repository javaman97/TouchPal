package com.cootek.smartinput5.p066ui;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.ac */
/* compiled from: ExplicitWidget */
class C2690ac implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2649V f12037a;

    C2690ac(C2649V v) {
        this.f12037a = v;
    }

    public void onClick(View view) {
        if (this.f12037a.f11927t == null || !this.f12037a.f11927t.isShowing()) {
            int size = this.f12037a.f11904ag.size() - 1;
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[(size - i) - 1] = (String) this.f12037a.f11904ag.get(i + 1);
            }
            if (this.f12037a.f11927t == null) {
                C2629P unused = this.f12037a.f11927t = new C2629P(this.f12037a.f11915h, this.f12037a.f11923p, this.f12037a.f11921n);
            }
            this.f12037a.f11927t.mo8673a(strArr, this.f12037a.f11923p.getWidth(), this.f12037a.m12263q());
            this.f12037a.f11927t.mo8672a((View) this.f12037a.f11921n);
            this.f12037a.f11921n.startAnimation(AnimationUtils.loadAnimation(this.f12037a.f11915h, R.anim.explicit_cloud_more_open));
            return;
        }
        this.f12037a.f11921n.startAnimation(AnimationUtils.loadAnimation(this.f12037a.f11915h, R.anim.explicit_cloud_more_close));
    }
}
