package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C2065u;
import java.io.File;

/* renamed from: com.cootek.smartinput5.ui.settings.O */
/* compiled from: CellDictListActivity */
class C2967O implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2065u f13547a;

    /* renamed from: b */
    final /* synthetic */ CellDictListActivity f13548b;

    C2967O(CellDictListActivity cellDictListActivity, C2065u uVar) {
        this.f13548b = cellDictListActivity;
        this.f13547a = uVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        File a = C1466av.m6849a(C1368X.m6313b(), this.f13547a.mo7437d());
        if (a.exists()) {
            a.delete();
        }
        this.f13547a.mo7439f();
    }
}
