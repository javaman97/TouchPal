package com.cootek.smartinput5.plugin.typingrace;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.plugin.typingrace.Racing;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.m */
/* compiled from: Racing */
class C2460m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Racing f10717a;

    /* renamed from: b */
    final /* synthetic */ Racing.C2443a f10718b;

    C2460m(Racing.C2443a aVar, Racing racing) {
        this.f10718b = aVar;
        this.f10717a = racing;
    }

    public void onClick(View view) {
        new C2894d.C2895a(Racing.this).setTitle(C1974m.m9063a((Context) Racing.this, (int) R.string.race_retry)).setMessage(C1974m.m9063a((Context) Racing.this, (int) R.string.race_retry_query)).setPositiveButton(C1974m.m9063a((Context) Racing.this, (int) R.string.race_ok), new C2461n(this)).setNegativeButton(C1974m.m9063a((Context) Racing.this, (int) R.string.race_cancel), (DialogInterface.OnClickListener) null).show();
    }
}
