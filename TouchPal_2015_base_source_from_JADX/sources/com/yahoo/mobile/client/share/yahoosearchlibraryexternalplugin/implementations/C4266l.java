package com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p001v4.app.C0173s;
import android.text.TextUtils;
import com.yahoo.mobile.client.share.search.interfaces.IShare;

/* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.l */
public class C4266l implements IShare {
    public void share(Context context, String str, String str2, String str3, String str4, C0173s sVar, String str5) {
        Intent intent = new Intent("android.intent.action.SEND");
        if (!TextUtils.isEmpty(str)) {
            intent.setType("image/jpeg");
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        } else {
            intent.setType("text/plain");
        }
        intent.putExtra("android.intent.extra.SUBJECT", str3);
        intent.putExtra("android.intent.extra.TEXT", str4);
        intent.putExtra("android.intent.extra.TITLE", str2);
        context.startActivity(intent);
    }
}
