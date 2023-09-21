package com.cootek.smartinput5.func;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.cootek.smartinput5.func.p052b.C1550c;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p045a.C1056a;
import com.emoji.keyboard.touchpal.R;

public class LocaleLanguageDownloadReceiver extends BroadcastReceiver {
    public static String ACTION_LOCALE_LANGUAGE_DOWNLOAD = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.download_locale_langauge";

    public void onReceive(Context context, Intent intent) {
        C1550c a;
        if (C1368X.m6324d()) {
            if (TextUtils.equals(intent.getAction(), ACTION_LOCALE_LANGUAGE_DOWNLOAD) && (a = C1550c.m6998a(C1974m.m9063a(context, (int) R.string.CURRENT_LANGUAGE))) != null) {
                downloadPackage(a.mo6192b(context), a.mo6191a(context), "0", context);
            }
            C1056a.m5588a().mo4264a("SETTING_LOCALE_LANGUAGE_DOWNLOAD", context);
        }
    }

    private void downloadPackage(String str, String str2, String str3, Context context) {
        C1389aD o;
        if (!TextUtils.isEmpty(str) && (o = C1368X.m6320c().mo5842o()) != null && o.mo5925M()) {
            C1584bI.m7145b(context, new C1402aN(this, str, str2, str3, context), false);
        }
    }
}
