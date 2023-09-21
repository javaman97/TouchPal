package com.cootek.smartinput5;

import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1584bI;
import java.io.File;

/* renamed from: com.cootek.smartinput5.Z */
/* compiled from: TouchPalIME */
class C1054Z extends Thread {

    /* renamed from: a */
    final /* synthetic */ TouchPalIME f2934a;

    C1054Z(TouchPalIME touchPalIME) {
        this.f2934a = touchPalIME;
    }

    public void run() {
        try {
            C1584bI.m7137a(new File(C1358O.m6234a(C1358O.f4191b), "auto_crash_log"));
        } catch (Exception e) {
        }
    }
}
