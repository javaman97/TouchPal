package com.cootek.smartinput5.func.smileypanel;

import com.cootek.smartinput5.func.C1810j;
import java.util.Comparator;

/* renamed from: com.cootek.smartinput5.func.smileypanel.b */
/* compiled from: EmojiPluginManager */
class C2010b implements Comparator<C1810j> {

    /* renamed from: a */
    final /* synthetic */ C2003a f6993a;

    C2010b(C2003a aVar) {
        this.f6993a = aVar;
    }

    /* renamed from: a */
    public int compare(C1810j jVar, C1810j jVar2) {
        String str;
        String str2 = null;
        if (jVar != null) {
            str = jVar.mo6810a();
        } else {
            str = null;
        }
        if (jVar2 != null) {
            str2 = jVar2.mo6810a();
        }
        if (str != null && str2 != null) {
            return str.compareTo(str2);
        }
        if (str != null) {
            return 1;
        }
        if (str2 != null) {
            return -1;
        }
        return 0;
    }
}
