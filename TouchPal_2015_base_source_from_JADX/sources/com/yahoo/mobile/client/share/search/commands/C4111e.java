package com.yahoo.mobile.client.share.search.commands;

import android.content.Context;
import android.net.Uri;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.p097b.C4092a;
import com.yahoo.mobile.client.share.search.settings.C4127a;
import com.yahoo.mobile.client.share.search.settings.ServerSettings;

/* renamed from: com.yahoo.mobile.client.share.search.commands.e */
public final class C4111e extends SearchCommand {
    public C4111e(Context context, SearchQuery searchQuery, SearchCommand.SearchTaskCallback searchTaskCallback) {
        super(context, searchQuery, searchTaskCallback);
    }

    public final int getCommandType() {
        return 0;
    }

    public final IUrlBuilder getUrlBuilder() {
        return new IUrlBuilder() {
            public final Uri buildUrl(Context context, SearchQuery searchQuery) {
                String a = C4127a.m17418a(context);
                Uri.Builder buildUpon = Uri.parse(String.format(ServerSettings.m17417a().getTrendingSearchUrlTemplate(), new Object[]{a})).buildUpon();
                buildUpon.appendQueryParameter("category", C4111e.this.f16593f.getAdditionalParameters().get("category"));
                return ServerSettings.m17417a().appendExtraParameters(context, buildUpon).build();
            }
        };
    }

    public final SearchResponseData parseResponse(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        SearchResponseData g = C4092a.m17332g(str);
        new StringBuilder("Time to parse trending JSON= ").append(((double) (System.currentTimeMillis() - currentTimeMillis)) / 1000.0d).append(" sec");
        return g;
    }
}
