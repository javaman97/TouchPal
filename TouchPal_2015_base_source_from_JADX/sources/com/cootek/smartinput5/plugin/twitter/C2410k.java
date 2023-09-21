package com.cootek.smartinput5.plugin.twitter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.twitter.k */
/* compiled from: ShareActivity */
class C2410k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ShareActivity f10560a;

    C2410k(ShareActivity shareActivity) {
        this.f10560a = shareActivity;
    }

    public void onClick(View view) {
        new C2894d.C2895a(this.f10560a).setTitle(C1974m.m9063a((Context) this.f10560a, (int) R.string.twitter_attention)).setMessage(C1974m.m9063a((Context) this.f10560a, (int) R.string.twitter_delete_all)).setPositiveButton(C1974m.m9063a((Context) this.f10560a, (int) R.string.ok), new C2411l(this)).setNegativeButton(C1974m.m9063a((Context) this.f10560a, (int) R.string.cancel), (DialogInterface.OnClickListener) null).create().show();
    }
}
