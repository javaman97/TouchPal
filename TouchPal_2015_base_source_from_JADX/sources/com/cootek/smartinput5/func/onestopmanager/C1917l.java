package com.cootek.smartinput5.func.onestopmanager;

import android.widget.CompoundButton;
import com.cootek.smartinput5.func.onestopmanager.C1904a;

/* renamed from: com.cootek.smartinput5.func.onestopmanager.l */
/* compiled from: OneStopDownloadDialog */
class C1917l implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ int f6493a;

    /* renamed from: b */
    final /* synthetic */ C1904a.C1906b f6494b;

    C1917l(C1904a.C1906b bVar, int i) {
        this.f6494b = bVar;
        this.f6493a = i;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ((C1904a.C1905a) this.f6494b.f6471d.get(this.f6493a)).f6466d = z;
        if (this.f6493a < C1904a.f6458h) {
            this.f6494b.f6473f[this.f6493a] = z;
        }
        C1904a.this.m8764g();
    }
}
