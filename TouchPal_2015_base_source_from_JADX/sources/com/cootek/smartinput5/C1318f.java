package com.cootek.smartinput5;

import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.Guide;

/* renamed from: com.cootek.smartinput5.f */
/* compiled from: Guide */
class C1318f extends Handler {

    /* renamed from: a */
    final /* synthetic */ Guide f4020a;

    C1318f(Guide guide) {
        this.f4020a = guide;
    }

    public void handleMessage(Message message) {
        Guide.C1027a a = this.f4020a.f2732C.mo4128a(message.what);
        if (a != null) {
            a.mo4127a();
        }
    }
}
