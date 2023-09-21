package com.cootek.smartinput5.func.component;

import android.text.TextUtils;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1960r;
import com.cootek.smartinput5.net.C2214ac;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.net.cmd.C2259P;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.func.component.M */
/* compiled from: HotWordIndexer */
class C1652M implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C1648J f5375a;

    C1652M(C1648J j) {
        this.f5375a = j;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C2243D d = (C2243D) p;
        if (d.f9746O != 200 || TextUtils.isEmpty(d.f9522h)) {
            this.f5375a.m7560h();
            return;
        }
        String str = d.f9517c;
        File file = new File(C1466av.m6848a(C1368X.m6313b()), str.substring(str.lastIndexOf(46) + 1, str.length()) + C1960r.f6678a);
        HashMap hashMap = new HashMap();
        hashMap.put("fileId", d.f9517c);
        hashMap.put("filePath", file.getAbsolutePath());
        new C2214ac(d.f9522h, file, (Object) hashMap, this.f5375a.f5372z, false).mo7732a();
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }
}
