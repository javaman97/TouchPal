package com.cootek.smartinput5.func;

import com.cootek.smartinput.utilities.C0997e;
import java.io.File;

/* renamed from: com.cootek.smartinput5.func.aa */
/* compiled from: FuncManager */
class C1419aa extends Thread {

    /* renamed from: a */
    final /* synthetic */ C1368X f4549a;

    C1419aa(C1368X x) {
        this.f4549a = x;
    }

    public void run() {
        C0997e.m5172a(C1358O.m6235a("webview", false));
        C0997e.m5172a(C1358O.m6235a("waveguide", false));
        C0997e.m5172a(C1358O.m6235a(C1358O.f4200k, false));
        C0997e.m5172a(C1358O.m6235a(C1358O.f4197h, false));
        File a = C1358O.m6235a("skin", false);
        if (a != null) {
            for (String file : C1602bh.f5130s) {
                File file2 = new File(a, file);
                if (file2 != null && file2.exists()) {
                    file2.delete();
                }
            }
            File file3 = new File(a, "SkinPackT.tps");
            if (file3 != null && file3.exists()) {
                file3.delete();
            }
        }
    }
}
