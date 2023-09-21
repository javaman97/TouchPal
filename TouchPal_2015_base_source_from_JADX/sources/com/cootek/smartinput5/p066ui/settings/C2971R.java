package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import com.cootek.smartinput5.func.C1920p;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.settings.CustomCheckBoxPreference;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.R */
/* compiled from: CellDictListActivity */
class C2971R implements CustomCheckBoxPreference.C2953b {

    /* renamed from: a */
    final /* synthetic */ C1920p f13610a;

    /* renamed from: b */
    final /* synthetic */ CellDictListActivity f13611b;

    C2971R(CellDictListActivity cellDictListActivity, C1920p pVar) {
        this.f13611b = cellDictListActivity;
        this.f13610a = pVar;
    }

    /* renamed from: a */
    public void mo9789a(CustomCheckBoxPreference customCheckBoxPreference) {
        C2894d.C2895a aVar = new C2894d.C2895a(this.f13611b.f13394a);
        aVar.setTitle(this.f13611b.mo7241b((int) R.string.delete_pinyin_bigram));
        aVar.setPositiveButton(this.f13611b.mo7241b(17039379), new C2972S(this));
        aVar.setNegativeButton(this.f13611b.mo7241b(17039369), (DialogInterface.OnClickListener) null);
        aVar.create().show();
    }
}
