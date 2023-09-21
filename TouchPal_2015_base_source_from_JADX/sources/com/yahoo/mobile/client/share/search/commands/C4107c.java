package com.yahoo.mobile.client.share.search.commands;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import com.yahoo.mobile.client.share.search.p097b.C4092a;
import com.yahoo.mobile.client.share.search.settings.C4127a;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.settings.ServerSettings;
import com.yahoo.mobile.client.share.search.util.C4228b;
import com.yahoo.mobile.client.share.search.util.C4248m;

/* renamed from: com.yahoo.mobile.client.share.search.commands.c */
public final class C4107c extends SearchCommand {

    /* renamed from: a */
    public static final int f16618a = (C4248m.f17353h ? 50 : 80);

    public C4107c(Context context, SearchQuery searchQuery, SearchCommand.SearchTaskCallback searchTaskCallback) {
        super(context, searchQuery, searchTaskCallback);
    }

    public final int getCommandType() {
        return 13;
    }

    public final IUrlBuilder getUrlBuilder() {
        return new IUrlBuilder() {
            public final Uri buildUrl(Context context, SearchQuery searchQuery) {
                Context context2 = C4107c.this.f16591d;
                SearchQuery searchQuery2 = C4107c.this.f16593f;
                int offset = C4107c.this.f16593f.getOffset();
                int count = C4107c.this.f16593f.getCount();
                String b = C4129c.m17434b(context2);
                String queryString = searchQuery2.getQueryString();
                String a = C4127a.m17418a(context2);
                if (a.equals("")) {
                    a = "en-US";
                }
                Uri.Builder buildUpon = Uri.parse(String.format(ServerSettings.m17417a().getImageUrlTemplate(), new Object[]{a})).buildUpon();
                buildUpon.appendQueryParameter("p", queryString).appendQueryParameter("o", "js").appendQueryParameter("native", "1").appendQueryParameter("b", String.valueOf(offset)).appendQueryParameter("vm", b).appendQueryParameter("n", String.valueOf(count)).appendQueryParameter("voice", searchQuery2.isVoiceSearch() ? "1" : "0");
                Uri.Builder appendExtraParameters = ServerSettings.m17417a().appendExtraParameters(context2, buildUpon);
                if (C4127a.m17424f(context2)) {
                    appendExtraParameters.appendQueryParameter("imgs", "yahoohq").appendQueryParameter("imgsr", "flickr");
                }
                return appendExtraParameters.build();
            }
        };
    }

    public final SearchResponseData parseResponse(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        SearchResponseData b = C4092a.m17327b(str);
        if (!(b == null || b.getMetaData() == null)) {
            String partnerStatus = b.getMetaData().getPartnerStatus();
            if (!TextUtils.isEmpty(partnerStatus)) {
                SearchStatusData searchStatusData = new SearchStatusData(partnerStatus);
                C4129c.m17428a(searchStatusData);
                C4228b.m17753a(this.f16591d, searchStatusData);
            }
        }
        new StringBuilder("Time to parse JSON= ").append(((double) (System.currentTimeMillis() - currentTimeMillis)) / 1000.0d).append(" sec");
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15084a() {
        return "IMAGE_VIDEO_QUEUE";
    }
}
