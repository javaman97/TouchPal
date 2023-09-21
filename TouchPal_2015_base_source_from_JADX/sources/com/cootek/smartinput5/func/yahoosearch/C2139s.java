package com.cootek.smartinput5.func.yahoosearch;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.s */
/* compiled from: YahooSearchActivity */
class C2139s extends Handler {

    /* renamed from: a */
    final /* synthetic */ YahooSearchActivity f9095a;

    C2139s(YahooSearchActivity yahooSearchActivity) {
        this.f9095a = yahooSearchActivity;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f9095a.f9059q.setImageDrawable(this.f9095a.f9060r);
                this.f9095a.f9060r.start();
                return;
            case 1:
                this.f9095a.f9060r.stop();
                this.f9095a.f9059q.setImageDrawable(this.f9095a.f9061s);
                return;
            default:
                return;
        }
    }
}
