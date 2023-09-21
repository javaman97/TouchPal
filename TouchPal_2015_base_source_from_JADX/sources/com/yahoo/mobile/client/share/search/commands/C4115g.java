package com.yahoo.mobile.client.share.search.commands;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import com.iflytek.cloud.SpeechConstant;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.MetaData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.SearchResultData;
import com.yahoo.mobile.client.share.search.settings.C4127a;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.settings.ServerSettings;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

/* renamed from: com.yahoo.mobile.client.share.search.commands.g */
public final class C4115g extends SearchCommand {

    /* renamed from: a */
    public static final C4116a f16624a = new C4116a();

    /* renamed from: com.yahoo.mobile.client.share.search.commands.g$a */
    public static class C4116a implements IUrlBuilder {
        public final Uri buildUrl(Context context, SearchQuery searchQuery) {
            boolean shouldShowMoreImageLink = searchQuery.shouldShowMoreImageLink();
            boolean shouldShowMoreVideoLink = searchQuery.shouldShowMoreVideoLink();
            String b = C4129c.m17434b(context);
            C4129c.m17457v();
            return m17389a(context, searchQuery, 1, shouldShowMoreImageLink, shouldShowMoreVideoLink, b, (Map<String, String>) null);
        }

        /* renamed from: a */
        public static Uri m17390a(Context context, SearchQuery searchQuery, Map<String, String> map) {
            String b = C4129c.m17434b(context);
            C4129c.m17457v();
            return m17389a(context, searchQuery, 0, true, true, b, map);
        }

        /* renamed from: a */
        private static Uri m17389a(Context context, SearchQuery searchQuery, int i, boolean z, boolean z2, String str, Map<String, String> map) {
            String queryString = searchQuery.getQueryString();
            String a = C4127a.m17418a(context);
            if (a.equals("")) {
                a = "en-US";
            }
            Uri.Builder buildUpon = Uri.parse(String.format(ServerSettings.m17417a().getWebUrlTemplate(), new Object[]{a})).buildUpon();
            buildUpon.appendQueryParameter("p", queryString).appendQueryParameter("b", String.valueOf(i)).appendQueryParameter("vm", str).appendQueryParameter("nocache", "1");
            buildUpon.appendQueryParameter("ctz", String.valueOf(((long) ((Calendar.getInstance().get(15) + Calendar.getInstance().get(16)) / 1000)) / 3600));
            buildUpon.appendQueryParameter("voice", searchQuery.isVoiceSearch() ? "1" : "0");
            Location location = searchQuery.getLocation();
            if (location != null) {
                buildUpon.appendQueryParameter("geo", location.getLatitude() + "," + location.getLongitude());
            }
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                }
            }
            Map<String, String> additionalParameters = searchQuery.getAdditionalParameters();
            if (additionalParameters != null) {
                for (Map.Entry next2 : additionalParameters.entrySet()) {
                    buildUpon.appendQueryParameter((String) next2.getKey(), (String) next2.getValue());
                }
            }
            Uri.Builder appendExtraParameters = ServerSettings.m17417a().appendExtraParameters(context, buildUpon);
            appendExtraParameters.appendQueryParameter("cts", String.valueOf(System.currentTimeMillis()));
            String str2 = "";
            if (!z || !C4127a.m17421c(context)) {
                str2 = str2 + "img";
            }
            if (!z2 || !C4127a.m17420b(context)) {
                if (!str2.isEmpty()) {
                    str2 = str2 + ",";
                }
                str2 = str2 + SpeechConstant.ISV_VID;
            }
            if (!str2.isEmpty()) {
                appendExtraParameters.appendQueryParameter("noml", str2);
            }
            return appendExtraParameters.build();
        }
    }

    public C4115g(Context context, SearchQuery searchQuery, SearchCommand.SearchTaskCallback searchTaskCallback) {
        super(context, searchQuery, searchTaskCallback);
    }

    public final int getCommandType() {
        return 2;
    }

    public final IUrlBuilder getUrlBuilder() {
        return f16624a;
    }

    public final SearchResponseData parseResponse(String str) {
        return null;
    }

    public final void executeCommand() {
        if (mo15087b() && this.f16592e != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new SearchResultData(getUrlBuilder().buildUrl(this.f16591d, this.f16593f).toString()));
            this.f16592e.onSearchTaskCompleted(this, new SearchResponseData((MetaData) null, arrayList), this.f16593f);
        }
    }
}
