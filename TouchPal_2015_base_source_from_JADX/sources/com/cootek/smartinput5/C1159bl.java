package com.cootek.smartinput5;

import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1372a;
import com.cootek.smartinput5.p066ui.settings.CustomizableCheckBoxPreference;

/* renamed from: com.cootek.smartinput5.bl */
/* compiled from: TouchPalOptionMainland */
class C1159bl implements C1372a.C1373a {

    /* renamed from: a */
    final /* synthetic */ CustomizableCheckBoxPreference f3510a;

    /* renamed from: b */
    final /* synthetic */ TouchPalOptionMainland f3511b;

    C1159bl(TouchPalOptionMainland touchPalOptionMainland, CustomizableCheckBoxPreference customizableCheckBoxPreference) {
        this.f3511b = touchPalOptionMainland;
        this.f3510a = customizableCheckBoxPreference;
    }

    /* renamed from: a */
    public void mo4371a(boolean z) {
        if (!z) {
            this.f3510a.setChecked(false);
        }
        this.f3510a.setEnabled(z);
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5844q().mo5858a();
        }
    }
}
