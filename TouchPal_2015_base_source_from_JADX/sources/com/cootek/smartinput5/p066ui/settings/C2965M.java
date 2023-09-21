package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.preference.Preference;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.M */
/* compiled from: CellDictListActivity */
class C2965M implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ CellDictListActivity f13545a;

    C2965M(CellDictListActivity cellDictListActivity) {
        this.f13545a = cellDictListActivity;
    }

    public boolean onPreferenceClick(Preference preference) {
        if (C1132b.m5654a((Context) this.f13545a).mo4392a(C1135d.ONLINE_SHOP, Boolean.valueOf(C1593bR.m7162a().f5075a)).booleanValue()) {
            C1584bI.m7145b(this.f13545a.f13394a, new C2966N(this), false);
            return true;
        }
        this.f13545a.f13395b.removePreference(preference);
        Iterator it = this.f13545a.f13399f.iterator();
        while (it.hasNext()) {
            this.f13545a.f13395b.addPreference((Preference) it.next());
        }
        return true;
    }
}
