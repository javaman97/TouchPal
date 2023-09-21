package com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.yahoo.mobile.client.share.search.interfaces.IBrowser;

/* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.a */
public class C4251a implements IBrowser {
    public IntentFilter getIntentFilter() {
        return new IntentFilter();
    }

    public Intent getIntent(Context context, String str, String str2) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }
}
