package com.yahoo.mobile.client.share.search.commands;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.MetaData;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.p097b.C4092a;
import com.yahoo.mobile.client.share.search.settings.C4127a;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.settings.ServerSettings;
import com.yahoo.mobile.client.share.search.util.C4245j;
import com.yahoo.mobile.client.share.search.util.UrlBuilderUtils;
import java.util.ArrayList;

/* renamed from: com.yahoo.mobile.client.share.search.commands.d */
public final class C4109d extends SearchCommand {
    public C4109d(Context context, SearchQuery searchQuery, SearchCommand.SearchTaskCallback searchTaskCallback) {
        super(context, searchQuery, searchTaskCallback);
    }

    public final int getCommandType() {
        return 1;
    }

    public final SearchResponseData parseResponse(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<SearchAssistData> a = C4092a.m17325a(str);
        new StringBuilder("Time to parse JSON= ").append(((double) (System.currentTimeMillis() - currentTimeMillis)) / 1000.0d).append(" sec");
        return new SearchResponseData((MetaData) null, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo15093f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo15094g() {
        return C4129c.m17440e();
    }

    public final IUrlBuilder getUrlBuilder() {
        return new IUrlBuilder() {
            public final Uri buildUrl(Context context, SearchQuery searchQuery) {
                Context context2 = C4109d.this.f16591d;
                SearchQuery searchQuery2 = C4109d.this.f16593f;
                String a = C4127a.m17418a(context2);
                String str = "";
                if (searchQuery2 != null && !C4245j.m17785a(searchQuery2.getQueryString())) {
                    str = searchQuery2.getQueryString().toLowerCase();
                }
                Uri.Builder buildUpon = Uri.parse(String.format(ServerSettings.m17417a().getSearchSuggestUrlTemplate(), new Object[]{a})).buildUpon();
                buildUpon.appendQueryParameter("queryfirst", "2").appendQueryParameter("output", "sd1").appendQueryParameter("appid", "natsearch").appendQueryParameter("command", str).appendQueryParameter("nresults", String.valueOf(20));
                UrlBuilderUtils.Crumb a2 = UrlBuilderUtils.m17739a();
                if (a2 != null) {
                    buildUpon.appendQueryParameter(".crumb", a2.f17319b);
                }
                if (C4129c.m17440e()) {
                    buildUpon.appendQueryParameter("f", "1");
                }
                if (!C4245j.m17785a(C4092a.m17324a())) {
                    buildUpon.appendQueryParameter("gprid", C4092a.m17324a());
                }
                buildUpon.appendQueryParameter("spaceid", String.valueOf(C4129c.m17444i().getInstrument().getApplicationSpaceId()));
                Location location = null;
                if (searchQuery2 != null) {
                    location = searchQuery2.getLocation();
                }
                if (location != null) {
                    buildUpon.appendQueryParameter("ll", location.getLongitude() + "," + location.getLatitude());
                }
                buildUpon.appendQueryParameter("t_stmp", String.valueOf(System.currentTimeMillis() / 1000));
                return buildUpon.build();
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15084a() {
        return "SUGGEST_QUEUE";
    }
}
