package com.cootek.smartinput5.func.yahoosearch;

import android.content.Context;
import android.content.Intent;
import com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.C4251a;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.m */
/* compiled from: SearchBrowser */
public class C2133m extends C4251a {
    public Intent getIntent(Context context, String str, String str2) {
        Intent intent = new Intent(context, BrowserActivity.class);
        intent.putExtra(BrowserActivity.f9027a, str);
        intent.putExtra(BrowserActivity.f9028b, str2);
        return intent;
    }
}
