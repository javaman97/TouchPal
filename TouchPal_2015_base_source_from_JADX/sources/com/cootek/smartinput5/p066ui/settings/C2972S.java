package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1358O;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.S */
/* compiled from: CellDictListActivity */
class C2972S implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2971R f13616a;

    C2972S(C2971R r) {
        this.f13616a = r;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (C1358O.m6234a(C1358O.f4199j) == null) {
            Toast.makeText(this.f13616a.f13611b.f13394a, this.f13616a.f13611b.mo7241b((int) R.string.sdcard_not_ready_message), 1).show();
        } else {
            this.f13616a.f13610a.mo7080e();
        }
    }
}
