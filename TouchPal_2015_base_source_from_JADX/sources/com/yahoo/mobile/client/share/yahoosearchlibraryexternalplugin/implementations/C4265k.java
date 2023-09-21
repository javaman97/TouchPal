package com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yahoo.mobile.client.share.search.interfaces.IBrowser;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchBrowserActivity;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;

/* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.k */
public class C4265k implements IBrowser {
    public IntentFilter getIntentFilter() {
        return null;
    }

    public Intent getIntent(Context context, String str, String str2) {
        Intent intent = new Intent(context, SearchBrowserActivity.class);
        intent.putExtra(SearchToLinkActivity.SOURCE_URL, str);
        return intent;
    }
}
