package com.cootek.smartinput5;

import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1579bD;
import com.cootek.smartinput5.func.component.C1659T;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.bb */
/* compiled from: TouchPalOptionInte */
class C1149bb implements TouchPalOption.C1045a {

    /* renamed from: a */
    final /* synthetic */ C1659T f3498a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionInte f3499b;

    C1149bb(TouchPalOptionInte touchPalOptionInte, C1659T t) {
        this.f3499b = touchPalOptionInte;
        this.f3498a = t;
    }

    /* renamed from: a */
    public void mo4221a() {
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5835h().release();
        }
        Engine.setBusyState(true);
    }

    /* renamed from: b */
    public int mo4223b() {
        int i;
        if (!C1368X.m6324d()) {
            return 3;
        }
        Okinawa h = C1368X.m6320c().mo5835h();
        h.init();
        C1579bD L = C1368X.m6320c().mo5826L();
        L.mo6215e();
        ArrayList<String> g = L.mo6217g();
        String[] strArr = (String[]) g.toArray(new String[g.size()]);
        if (strArr.length <= 0) {
            C1246d.m6010a(this.f3499b.f2890D).mo4591a("DICT_RECOVERY/USER_DICT_REBUILD", C1246d.f3710G, C1246d.f3836c);
            i = 3;
        } else if (this.f3498a.mo6482a(strArr, true)) {
            i = 1;
        } else {
            i = 2;
        }
        h.release();
        return i;
    }

    /* renamed from: a */
    public void mo4222a(int i) {
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5835h().init();
        }
        this.f3498a.mo6480a(i);
        Engine.setBusyState(false);
    }

    /* renamed from: c */
    public String mo4224c() {
        return this.f3499b.mo7241b((int) R.string.process_waiting);
    }
}
