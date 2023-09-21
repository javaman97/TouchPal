package com.cootek.smartinput5.plugin.typingrace;

import android.content.Context;
import android.view.View;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.plugin.typingrace.Racing;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.o */
/* compiled from: Racing */
class C2462o implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Racing f10720a;

    /* renamed from: b */
    final /* synthetic */ Racing.C2443a f10721b;

    C2462o(Racing.C2443a aVar, Racing racing) {
        this.f10721b = aVar;
        this.f10720a = racing;
    }

    public void onClick(View view) {
        new C2894d.C2895a(Racing.this).setTitle(C1974m.m9063a((Context) Racing.this, (int) R.string.race_exit)).setMessage(C1974m.m9063a((Context) Racing.this, (int) R.string.race_exit_query)).setPositiveButton(C1974m.m9063a((Context) Racing.this, (int) R.string.race_ok), new C2464q(this)).setNegativeButton(C1974m.m9063a((Context) Racing.this, (int) R.string.race_cancel), new C2463p(this)).show();
    }
}
