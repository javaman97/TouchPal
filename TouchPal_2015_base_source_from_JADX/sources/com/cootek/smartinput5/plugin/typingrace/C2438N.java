package com.cootek.smartinput5.plugin.typingrace;

import android.content.Context;
import com.weibo.net.C4039c;
import com.weibo.net.C4061w;
import java.io.IOException;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.N */
/* compiled from: RankList */
class C2438N implements C4039c.C4040a {

    /* renamed from: a */
    final /* synthetic */ Context f10632a;

    /* renamed from: b */
    final /* synthetic */ RankList f10633b;

    C2438N(RankList rankList, Context context) {
        this.f10633b = rankList;
        this.f10632a = context;
    }

    /* renamed from: a */
    public void mo8207a(IOException iOException) {
    }

    /* renamed from: a */
    public void mo8206a(C4061w wVar) {
        this.f10633b.f10703s.dismiss();
        this.f10633b.f10702r.dismiss();
        this.f10633b.runOnUiThread(new C2439O(this));
        this.f10633b.finish();
    }

    /* renamed from: a */
    public void mo8208a(String str) {
        this.f10633b.f10703s.dismiss();
        this.f10633b.f10702r.dismiss();
        this.f10633b.runOnUiThread(new C2440P(this));
        this.f10633b.finish();
    }
}
