package com.cootek.smartinput5.plugin.typingrace;

import android.content.Context;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.M */
/* compiled from: RankList */
class C2437M implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f10630a;

    /* renamed from: b */
    final /* synthetic */ RankList f10631b;

    C2437M(RankList rankList, Context context) {
        this.f10631b = rankList;
        this.f10630a = context;
    }

    public void run() {
        this.f10631b.m11133a(this.f10630a, this.f10631b.getResString(R.string.race_shared_weibo_content, this.f10631b.f10696l, Integer.valueOf(this.f10631b.f10695k)));
    }
}
