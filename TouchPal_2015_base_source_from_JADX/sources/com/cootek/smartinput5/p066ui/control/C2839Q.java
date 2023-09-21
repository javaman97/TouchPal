package com.cootek.smartinput5.p066ui.control;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.control.Q */
/* compiled from: SlideSentenceView */
class C2839Q extends Handler {

    /* renamed from: a */
    final /* synthetic */ SlideSentenceView f12805a;

    C2839Q(SlideSentenceView slideSentenceView) {
        this.f12805a = slideSentenceView;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                Object[] objArr = (Object[]) message.obj;
                this.f12805a.m13057a(message.arg1, message.arg2, (String) objArr[0]);
                this.f12805a.m13095o();
                if (objArr[1] != null) {
                    this.f12805a.m13065a((String) objArr[0], (Rect) objArr[1]);
                }
                boolean unused = this.f12805a.f12884au = false;
                this.f12805a.m13101u();
                return;
            case 1:
                this.f12805a.m13103w();
                return;
            case 2:
                this.f12805a.m13102v();
                return;
            case 3:
                this.f12805a.m13056a(message.arg1);
                return;
            case 4:
                if (Settings.getInstance().getBoolSetting(Settings.SHOW_WAVE_TIP_SLIDE_DOWN)) {
                    boolean unused2 = this.f12805a.f12888ay = true;
                    this.f12805a.invalidate();
                    return;
                }
                return;
            case 5:
                if (message.obj != null && Settings.getInstance().getBoolSetting(Settings.SHOW_WAVE_TIP_SLIDE_DOWN)) {
                    this.f12805a.f12874ai.mo9587a((String) message.obj);
                    return;
                }
                return;
            case 6:
                this.f12805a.m13104x();
                return;
            default:
                return;
        }
    }
}
