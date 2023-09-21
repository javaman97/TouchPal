package com.cootek.smartinput5.func.onestopmanager;

import android.view.View;
import com.cootek.smartinput5.func.onestopmanager.C1904a;

/* renamed from: com.cootek.smartinput5.func.onestopmanager.n */
/* compiled from: OneStopDownloadDialog */
class C1919n implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1904a.C1906b f6496a;

    C1919n(C1904a.C1906b bVar) {
        this.f6496a = bVar;
    }

    public void onClick(View view) {
        ((DownloadItemView) view).setVisibility(8);
        this.f6496a.f6468a = true;
        this.f6496a.notifyDataSetChanged();
    }
}
