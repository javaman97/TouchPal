package com.cootek.smartinput5.p066ui;

import com.yahoo.mobile.client.share.search.data.SearchStatusData;

/* renamed from: com.cootek.smartinput5.ui.ao */
/* compiled from: FunctionBar */
class C2703ao implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f12098a;

    /* renamed from: b */
    final /* synthetic */ FunctionBar f12099b;

    C2703ao(FunctionBar functionBar, int i) {
        this.f12099b = functionBar;
        this.f12098a = i;
    }

    public void run() {
        if (this.f12099b.f11245J != null && this.f12099b.f11269x != null) {
            int scrollX = this.f12099b.f11269x.getScrollX();
            this.f12099b.m11653a(scrollX, -scrollX, SearchStatusData.RESPONSE_STATUS_SERVER_ERROR);
            this.f12099b.f11245J.mo9065a(this.f12098a);
        }
    }
}
