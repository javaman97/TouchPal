package com.cootek.smartinput5;

import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import com.cootek.smartinput5.func.C1584bI;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.aX */
/* compiled from: TouchPalOptionInte */
class C1087aX implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    final /* synthetic */ TouchPalOptionInte f3085a;

    C1087aX(TouchPalOptionInte touchPalOptionInte) {
        this.f3085a = touchPalOptionInte;
    }

    public boolean onPreferenceClick(Preference preference) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f3085a.getString(R.string.handwriting_provider_website)));
        C1584bI.m7130a(this.f3085a.f2890D, intent, 0);
        return true;
    }
}
