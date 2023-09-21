package com.cootek.smartinput5.net;

import com.cootek.smartinput5.net.C2361q;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.net.r */
/* compiled from: DownloadManager */
class C2363r implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ ArrayList f10406a;

    /* renamed from: b */
    final /* synthetic */ C2361q f10407b;

    C2363r(C2361q qVar, ArrayList arrayList) {
        this.f10407b = qVar;
        this.f10406a = arrayList;
    }

    public boolean accept(File file, String str) {
        Iterator it = this.f10406a.iterator();
        while (it.hasNext()) {
            if (str.startsWith(((C2361q.C2362a) it.next()).f10402c)) {
                return true;
            }
        }
        return false;
    }
}
