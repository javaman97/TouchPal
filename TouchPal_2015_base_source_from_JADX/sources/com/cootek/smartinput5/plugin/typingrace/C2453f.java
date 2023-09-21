package com.cootek.smartinput5.plugin.typingrace;

import android.content.Intent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.f */
/* compiled from: Guide */
class C2453f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Guide f10709a;

    C2453f(Guide guide) {
        this.f10709a = guide;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f10709a, Racing.class);
        intent.putExtra(Racing.f10641b, this.f10709a.f10623g);
        this.f10709a.startActivity(intent);
    }
}
