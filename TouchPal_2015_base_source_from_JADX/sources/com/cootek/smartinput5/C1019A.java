package com.cootek.smartinput5;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.A */
/* compiled from: GuideIMEActivedMonitor */
class C1019A extends Handler {

    /* renamed from: a */
    final /* synthetic */ C3285z f2701a;

    C1019A(C3285z zVar) {
        this.f2701a = zVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (C1584bI.m7149c(this.f2701a.f14412c)) {
                    Intent intent = new Intent(this.f2701a.f14412c, Guide.class);
                    intent.setFlags(872415232);
                    this.f2701a.f14412c.getApplicationContext().startActivity(intent);
                    this.f2701a.mo10486b();
                    return;
                }
                this.f2701a.mo10485a();
                return;
            default:
                return;
        }
    }
}
