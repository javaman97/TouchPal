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

/* renamed from: com.yahoo.mobile.client.share.search.commands.f */
public class C4113f extends SearchCommand {

    /* renamed from: a */
    private static final String f16622a = C4113f.class.getSimpleName();

    public C4113f(Context context, SearchQuery searchQuery, SearchCommand.SearchTaskCallback searchTaskCallback) {
        super(context, searchQuery, searchTaskCallback);
    }

    public int getCommandType() {
        return 15;
    }

    public IUrlBuilder getUrlBuilder() {
        return new IUrlBuilder() {
            public final Uri buildUrl(Context context, SearchQuery searchQuery) {
                Context context2 = C4113f.this.f16591d;
                SearchQuery searchQuery2 = C4113f.this.f16593f;
                String b = C4129c.m17434b(context2);
                String queryString = searchQuery2.getQueryString();
                String a = C4127a.m17418a(context2);
                if (a.equals("")) {
                    a = "en-US";
                }
                Uri.Builder buildUpon = Uri.parse(String.format(ServerSettings.m17417a().getVideoUrlTemplate(), new Object[]{a})).buildUpon();
                buildUpon.appendQueryParameter("p", queryString).appendQueryParameter("o", "js").appendQueryParameter("native", "1").appendQueryParameter("b", String.valueOf(searchQuery2.getOffset())).appendQueryParameter("vm", b).appendQueryParameter("n", String.valueOf(30)).appendQueryParameter("voice", searchQuery2.isVoiceSearch() ? "1" : "0");
                return ServerSettings.m17417a().appendExtraParameters(context2, buildUpon).build();
            }
        };
    }

    public SearchResponseData parseResponse(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        SearchResponseData c = C4092a.m17328c(str);
        if (c != null) {
            String partnerStatus = c.getMetaData().getPartnerStatus();
            if (!TextUtils.isEmpty(partnerStatus)) {
                SearchStatusData searchStatusData = new SearchStatusData(partnerStatus);
                C4129c.m17428a(searchStatusData);
                C4228b.m17753a(this.f16591d, searchStatusData);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        String str2 = f16622a;
        new StringBuilder("Time to parse JSON= ").append(((double) (currentTimeMillis2 - currentTimeMillis)) / 1000.0d).append(" sec");
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15084a() {
        return "IMAGE_VIDEO_QUEUE";
    }
}
