package com.cootek.smartinput5;

import android.content.Intent;
import android.preference.Preference;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.func.C1358O;

/* renamed from: com.cootek.smartinput5.aH */
/* compiled from: TouchPalOptionInte */
class C1071aH implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Preference f3068a;

    /* renamed from: b */
    final /* synthetic */ C1070aG f3069b;

    C1071aH(C1070aG aGVar, Preference preference) {
        this.f3069b = aGVar;
        this.f3068a = preference;
    }

    public void run() {
        Intent intent = this.f3068a.getIntent();
        if (C1358O.m6239b() != null) {
            new TouchPalOption.C1047c(this.f3069b.f3067a, intent).execute(new String[0]);
        } else {
            this.f3069b.f3067a.startActivity(intent);
        }
    }
}
