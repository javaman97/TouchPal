package com.cootek.smartinput5.plugin.typingrace;

import android.content.Context;
import android.view.View;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.a */
/* compiled from: Guide */
class C2448a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Guide f10704a;

    C2448a(Guide guide) {
        this.f10704a = guide;
    }

    public void onClick(View view) {
        new C2894d.C2895a(this.f10704a).setTitle(C1974m.m9063a((Context) this.f10704a, (int) R.string.race_exit)).setMessage(C1974m.m9063a((Context) this.f10704a, (int) R.string.race_exit_query)).setPositiveButton(C1974m.m9063a((Context) this.f10704a, (int) R.string.race_ok), new C2450c(this)).setNegativeButton(C1974m.m9063a((Context) this.f10704a, (int) R.string.race_cancel), new C2449b(this)).show();
    }
}
