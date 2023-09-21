package com.cootek.smartinput5;

import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1372a;
import com.cootek.smartinput5.p066ui.settings.CustomizableCheckBoxPreference;

/* renamed from: com.cootek.smartinput5.al */
/* compiled from: TouchPalOptionInte */
class C1115al implements C1372a.C1373a {

    /* renamed from: a */
    final /* synthetic */ CustomizableCheckBoxPreference f3136a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionInte f3137b;

    C1115al(TouchPalOptionInte touchPalOptionInte, CustomizableCheckBoxPreference customizableCheckBoxPreference) {
        this.f3137b = touchPalOptionInte;
        this.f3136a = customizableCheckBoxPreference;
    }

    /* renamed from: a */
    public void mo4371a(boolean z) {
        if (!z) {
            this.f3136a.setChecked(false);
        }
        this.f3136a.setEnabled(z);
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5844q().mo5858a();
        }
    }
}
