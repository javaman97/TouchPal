package com.yahoo.mobile.client.share.search.commands;

import android.content.Context;
import android.net.Uri;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;

/* renamed from: com.yahoo.mobile.client.share.search.commands.a */
public final class C4104a extends SearchCommand {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Uri f16615a;

    public C4104a(Context context, Uri uri) {
        super(context, (SearchQuery) null);
        this.f16615a = uri;
    }

    public final int getCommandType() {
        return 19;
    }

    public final IUrlBuilder getUrlBuilder() {
        return new IUrlBuilder() {
            public final Uri buildUrl(Context context, SearchQuery searchQuery) {
                return C4104a.this.f16615a;
            }
        };
    }

    public final SearchResponseData parseResponse(String str) {
        return null;
    }
}
