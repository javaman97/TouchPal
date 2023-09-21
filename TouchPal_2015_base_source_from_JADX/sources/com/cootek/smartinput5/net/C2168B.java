package com.cootek.smartinput5.net;

import android.content.Context;
import android.provider.Settings;
import com.cootek.smartinput5.net.C2377y;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.net.B */
/* compiled from: IdentifyInfo */
final class C2168B extends C2377y.C2379a {
    C2168B(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7614a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), com.cootek.smartinput5.engine.Settings.ANDROID_ID);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7613a() {
        return com.cootek.smartinput5.engine.Settings.ANDROID_ID;
    }
}
