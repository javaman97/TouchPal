package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import com.cootek.smartinput5.func.HandWriteManager;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.settings.CustomCheckBoxPreference;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.G */
/* compiled from: CellDictListActivity */
class C2959G implements CustomCheckBoxPreference.C2953b {

    /* renamed from: a */
    final /* synthetic */ HandWriteManager f13447a;

    /* renamed from: b */
    final /* synthetic */ CellDictListActivity f13448b;

    C2959G(CellDictListActivity cellDictListActivity, HandWriteManager handWriteManager) {
        this.f13448b = cellDictListActivity;
        this.f13447a = handWriteManager;
    }

    /* renamed from: a */
    public void mo9789a(CustomCheckBoxPreference customCheckBoxPreference) {
        C2894d.C2895a aVar = new C2894d.C2895a(this.f13448b.f13394a);
        aVar.setTitle(this.f13448b.mo7241b((int) R.string.delete_handwrite_data));
        aVar.setPositiveButton(this.f13448b.mo7241b(17039379), new C2960H(this));
        aVar.setNegativeButton(this.f13448b.mo7241b(17039369), (DialogInterface.OnClickListener) null);
        aVar.create().show();
    }
}
