package com.cootek.smartinput5.plugin.typingrace;

import android.content.Context;
import android.view.View;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.plugin.typingrace.Racing;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.t */
/* compiled from: Racing */
class C2467t implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Racing f10728a;

    /* renamed from: b */
    final /* synthetic */ Racing.C2444b f10729b;

    C2467t(Racing.C2444b bVar, Racing racing) {
        this.f10729b = bVar;
        this.f10728a = racing;
    }

    public void onClick(View view) {
        new C2894d.C2895a(Racing.this).setTitle(C1974m.m9063a((Context) Racing.this, (int) R.string.race_retry)).setMessage(C1974m.m9063a((Context) Racing.this, (int) R.string.race_retry_query)).setPositiveButton(C1974m.m9063a((Context) Racing.this, (int) R.string.race_ok), new C2469v(this)).setNegativeButton(C1974m.m9063a((Context) Racing.this, (int) R.string.race_cancel), new C2468u(this)).show();
    }
}
