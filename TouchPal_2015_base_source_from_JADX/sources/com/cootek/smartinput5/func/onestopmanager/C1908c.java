package com.cootek.smartinput5.func.onestopmanager;

import android.database.DataSetObserver;
import android.widget.ListView;
import com.cootek.smartinput5.p066ui.control.C2869n;

/* renamed from: com.cootek.smartinput5.func.onestopmanager.c */
/* compiled from: OneStopDownloadDialog */
class C1908c extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ int f6475a;

    /* renamed from: b */
    final /* synthetic */ ListView f6476b;

    /* renamed from: c */
    final /* synthetic */ C1904a f6477c;

    C1908c(C1904a aVar, int i, ListView listView) {
        this.f6477c = aVar;
        this.f6475a = i;
        this.f6476b = listView;
    }

    public void onChanged() {
        this.f6477c.m8756b(this.f6475a);
        C2869n.m13272a(this.f6476b);
        this.f6476b.requestLayout();
    }
}
