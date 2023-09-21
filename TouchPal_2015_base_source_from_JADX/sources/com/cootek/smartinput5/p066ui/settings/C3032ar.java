package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import com.cootek.smartinput5.cust.ShortcutSettings;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.ui.settings.ar */
/* compiled from: EditShortcutPreference */
class C3032ar implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ EditShortcutPreference f13947a;

    C3032ar(EditShortcutPreference editShortcutPreference) {
        this.f13947a = editShortcutPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Okinawa h = C1368X.m6320c().mo5835h();
        h.fireDeleteUserWordOperation(this.f13947a.mKey, this.f13947a.mWord, 4, false);
        h.processEvent();
        ((ShortcutSettings) this.f13947a.getContext()).mo4560a(this.f13947a);
    }
}
