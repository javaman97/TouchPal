package com.cootek.smartinput5.net;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.cootek.smartinput5.net.C2377y;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.net.C */
/* compiled from: IdentifyInfo */
final class C2169C extends C2377y.C2379a {
    C2169C(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7614a(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService(C1899v.f6395s)).getConnectionInfo();
        if (connectionInfo != null) {
            return connectionInfo.getMacAddress();
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7613a() {
        return Settings.MACADDRESS;
    }
}
