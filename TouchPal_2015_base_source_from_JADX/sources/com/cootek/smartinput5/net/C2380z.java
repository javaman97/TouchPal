package com.cootek.smartinput5.net;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2377y;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.net.z */
/* compiled from: IdentifyInfo */
final class C2380z extends C2377y.C2379a {
    C2380z(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7614a(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (SecurityException e) {
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7613a() {
        return Settings.IMEI;
    }
}
