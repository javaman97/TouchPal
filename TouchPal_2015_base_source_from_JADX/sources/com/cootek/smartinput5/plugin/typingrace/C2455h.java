package com.cootek.smartinput5.plugin.typingrace;

import android.text.TextUtils;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.h */
/* compiled from: Racing */
class C2455h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Racing f10711a;

    C2455h(Racing racing) {
        this.f10711a = racing;
    }

    public void run() {
        if (!this.f10711a.f10660r) {
            long unused = this.f10711a.f10659q = System.currentTimeMillis();
        }
        if (!this.f10711a.m11087a() && !TextUtils.isEmpty(this.f10711a.f10649g.getText())) {
            this.f10711a.f10649g.setText("");
        }
        this.f10711a.m11099e();
        this.f10711a.f10655m.postDelayed(this, 1000);
    }
}
