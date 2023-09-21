package com.cootek.smartinput5.p066ui.settings;

import java.util.Comparator;

/* renamed from: com.cootek.smartinput5.ui.settings.cd */
/* compiled from: SeparatedListAdapter */
class C3137cd implements Comparator<String> {

    /* renamed from: a */
    final /* synthetic */ C3134cc f14177a;

    C3137cd(C3134cc ccVar) {
        this.f14177a = ccVar;
    }

    /* renamed from: a */
    public int compare(String str, String str2) {
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
