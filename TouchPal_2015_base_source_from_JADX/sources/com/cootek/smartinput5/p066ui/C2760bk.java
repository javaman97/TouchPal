package com.cootek.smartinput5.p066ui;

import android.view.MotionEvent;
import android.view.View;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.bk */
/* compiled from: LogoItem */
class C2760bk implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C2759bj f12321a;

    C2760bk(C2759bj bjVar) {
        this.f12321a = bjVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C2917du widgetManager;
        if (motionEvent.getAction() == 0) {
            C0904g.m4916a().mo3411c();
            if (C1368X.m6324d() && Engine.isInitialized() && (widgetManager = Engine.getInstance().getWidgetManager()) != null) {
                if (Settings.getInstance().getBoolSetting(Settings.ADVANCED_VIBRATION)) {
                    C1368X.m6320c().mo5852y().mo6379a(false);
                }
                if (widgetManager.mo9650h() != null) {
                    widgetManager.mo9650h().mo8542g();
                }
                if (!Engine.getInstance().isInputPaused() && this.f12321a.f12320g) {
                    this.f12321a.mo9039c();
                    this.f12321a.m12597n();
                    widgetManager.mo9617W().mo7130e();
                    C1056a.m5588a().mo4264a(C1056a.f2980k, this.f12321a.mo8985j());
                    this.f12321a.f12315b.setPressed(true);
                    this.f12321a.m12599p();
                    C1246d.m6010a(this.f12321a.mo8985j()).mo4594a(C1246d.f3840cD, true, C1246d.f3839cC);
                    this.f12321a.mo8891e();
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            this.f12321a.f12315b.setPressed(false);
            this.f12321a.m12599p();
        }
        return true;
    }
}
