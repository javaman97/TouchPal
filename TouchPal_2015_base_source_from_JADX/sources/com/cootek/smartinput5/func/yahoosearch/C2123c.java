package com.cootek.smartinput5.func.yahoosearch;

import android.content.Context;
import android.view.View;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.share.C1985g;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.c */
/* compiled from: BrowserActivity */
class C2123c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ BrowserActivity f9067a;

    C2123c(BrowserActivity browserActivity) {
        this.f9067a = browserActivity;
    }

    public void onClick(View view) {
        C1985g.m9132a((Context) this.f9067a, this.f9067a.f9034o, this.f9067a.f9036q.getUrl() + " " + C1974m.m9063a((Context) this.f9067a, (int) R.string.search_share_result));
        C1246d.m6010a((Context) this.f9067a).mo4591a(C1246d.f3929dw, C1246d.f3931dy, C1246d.f3923dq);
    }
}
