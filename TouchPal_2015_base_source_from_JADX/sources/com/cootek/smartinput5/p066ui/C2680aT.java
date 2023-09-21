package com.cootek.smartinput5.p066ui;

import android.text.TextUtils;
import android.view.View;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.C2361q;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.aT */
/* compiled from: InstallIncompatibleLanguageSkinDialog */
class C2680aT implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2678aR f12015a;

    C2680aT(C2678aR aRVar) {
        this.f12015a = aRVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        if (this.f12015a.f12011b != null) {
            for (C1498a add : this.f12015a.f12011b) {
                arrayList.add(add);
            }
        }
        this.f12015a.mo8912a();
        if (arrayList.size() > 0) {
            this.f12015a.m12366a((ArrayList<C1498a>) arrayList);
        }
        if (!TextUtils.isEmpty(this.f12015a.f12012c) && C2225al.m10059a("skin") && this.f12015a.f12013d != null && this.f12015a.f12013d.f5102f) {
            C2361q.m10797b().mo7999a(this.f12015a.f12013d.mo6810a(), this.f12015a.f12013d.f5100d);
        }
    }
}
