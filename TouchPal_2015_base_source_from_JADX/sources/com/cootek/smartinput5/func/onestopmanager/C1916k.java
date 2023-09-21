package com.cootek.smartinput5.func.onestopmanager;

import android.database.DataSetObserver;
import android.widget.ListView;
import com.cootek.smartinput5.p066ui.control.C2869n;

/* renamed from: com.cootek.smartinput5.func.onestopmanager.k */
/* compiled from: OneStopDownloadDialog */
class C1916k extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ ListView f6491a;

    /* renamed from: b */
    final /* synthetic */ C1904a f6492b;

    C1916k(C1904a aVar, ListView listView) {
        this.f6492b = aVar;
        this.f6491a = listView;
    }

    public void onChanged() {
        this.f6492b.m8756b(C1904a.f6453c);
        C2869n.m13272a(this.f6491a);
        this.f6491a.requestLayout();
    }
}
