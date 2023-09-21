package com.yahoo.mobile.client.share.search.interfaces;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public interface IBrowser {
    Intent getIntent(Context context, String str, String str2);

    IntentFilter getIntentFilter();
}
