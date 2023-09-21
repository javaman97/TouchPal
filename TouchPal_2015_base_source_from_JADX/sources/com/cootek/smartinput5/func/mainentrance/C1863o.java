package com.cootek.smartinput5.func.mainentrance;

import android.view.View;
import com.cootek.smartinput5.p045a.C1056a;

/* renamed from: com.cootek.smartinput5.func.mainentrance.o */
/* compiled from: SkinProvider */
class C1863o implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1859m f6233a;

    C1863o(C1859m mVar) {
        this.f6233a = mVar;
    }

    public void onClick(View view) {
        if (view.getTag() != null) {
            this.f6233a.f6221j.mo6941a((C1853g) view.getTag());
            this.f6233a.f6221j.show();
            C1056a.m5588a().mo4264a(C1056a.f2987r, this.f6233a.f6212a);
        }
    }
}
