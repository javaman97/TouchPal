package com.cootek.smartinput5.func.mainentrance;

import android.view.View;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.func.mainentrance.q */
/* compiled from: SkinProvider */
class C1865q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1859m f6236a;

    C1865q(C1859m mVar) {
        this.f6236a = mVar;
    }

    public void onClick(View view) {
        if (!C2225al.m10059a("skin")) {
            C2225al.m10082p(this.f6236a.f6212a);
        } else if (view.getTag() != null) {
            C1584bI.m7145b(this.f6236a.f6212a, new C1866r(this, ((C1853g) view.getTag()).mo6935e()), false);
            C1246d.m6010a(this.f6236a.f6212a).mo4594a(C1246d.f3845cI, true, C1246d.f3842cF);
        }
    }
}
