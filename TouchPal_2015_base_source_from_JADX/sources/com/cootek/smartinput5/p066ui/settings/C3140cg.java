package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import com.cootek.smartinput5.p066ui.settings.C3134cc;

/* renamed from: com.cootek.smartinput5.ui.settings.cg */
/* compiled from: SeparatedListAdapter */
class C3140cg implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ C3134cc.C3136b f14181a;

    C3140cg(C3134cc.C3136b bVar) {
        this.f14181a = bVar;
    }

    public boolean onLongClick(View view) {
        if (this.f14181a.f14175e || C3134cc.this.f14158f == null) {
            return false;
        }
        C3134cc.this.f14158f.run();
        this.f14181a.mo10292b(true);
        return true;
    }
}
