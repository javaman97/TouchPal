package com.cootek.smartinput5.plugin.typingrace;

import android.view.View;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.D */
/* compiled from: RankList */
class C2427D implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ RankList f10613a;

    C2427D(RankList rankList) {
        this.f10613a = rankList;
    }

    public void onClick(View view) {
        new C2894d.C2895a(this.f10613a).setTitle(this.f10613a.getResString(R.string.race_retry)).setMessage(this.f10613a.getResString(R.string.race_retry_query)).setPositiveButton(this.f10613a.getResString(R.string.race_ok), new C2429F(this)).setNegativeButton(this.f10613a.getResString(R.string.race_cancel), new C2428E(this)).show();
    }
}
