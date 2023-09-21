package com.cootek.smartinput5.func;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.i */
/* compiled from: AppsFlyerDataCollect */
public class C1725i {

    /* renamed from: a */
    private static final long f5636a = 86400000;

    /* renamed from: a */
    public static void m7937a(boolean z) {
        if (C1368X.m6324d() && m7938b(z)) {
            Context applicationContext = C1368X.m6313b().getApplicationContext();
            AppsFlyerLib.setAppsFlyerKey(C1974m.m9063a(applicationContext, (int) R.string.appsflyer_key));
            AppsFlyerLib.sendTracking(applicationContext);
            Settings.getInstance().setLongSetting(Settings.APPSFLYER_NEXT_ACTIVE_TIME, System.currentTimeMillis() + 86400000);
        }
    }

    /* renamed from: b */
    private static boolean m7938b(boolean z) {
        if (!z && System.currentTimeMillis() <= Settings.getInstance().getLongSetting(Settings.APPSFLYER_NEXT_ACTIVE_TIME)) {
            return false;
        }
        return true;
    }
}
