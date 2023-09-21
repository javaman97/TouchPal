package com.yahoo.mobile.client.share.search.commands;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.cootek.smartinput5.func.C1411aV;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.MetaData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.p097b.C4092a;
import com.yahoo.mobile.client.share.search.settings.C4127a;
import com.yahoo.mobile.client.share.search.settings.ServerSettings;
import com.yahoo.mobile.client.share.search.util.C4228b;
import com.yahoo.mobile.client.share.search.util.UrlBuilderUtils;
import java.util.ArrayList;
import java.util.Map;

public class SearchHistoryCommand extends SearchCommand {

    /* renamed from: a */
    private static final String f16601a = SearchHistoryCommand.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public SearchHistoryActionEnum f16602g;

    public enum SearchHistoryActionEnum {
        ADD_S,
        ADD_C,
        DELETE_ALL,
        GET_CRUMB
    }

    public SearchHistoryCommand(Context context, SearchQuery searchQuery, SearchHistoryActionEnum searchHistoryActionEnum) {
        super(context, searchQuery);
        this.f16602g = searchHistoryActionEnum;
    }

    public int getCommandType() {
        return 18;
    }

    public SearchResponseData parseResponse(String str) {
        if (this.f16602g != SearchHistoryActionEnum.GET_CRUMB) {
            return null;
        }
        UrlBuilderUtils.Crumb d = C4092a.m17329d(str);
        UrlBuilderUtils.m17741a(d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        return new SearchResponseData((MetaData) null, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo15094g() {
        return this.f16602g != SearchHistoryActionEnum.GET_CRUMB;
    }

    public IUrlBuilder getUrlBuilder() {
        return new IUrlBuilder() {
            public final Uri buildUrl(Context context, SearchQuery searchQuery) {
                switch (C41013.f16605a[SearchHistoryCommand.this.f16602g.ordinal()]) {
                    case 1:
                        return m17374a(SearchHistoryCommand.this.f16591d, SearchHistoryCommand.this.f16593f, 's');
                    case 2:
                        return m17374a(SearchHistoryCommand.this.f16591d, SearchHistoryCommand.this.f16593f, 'c');
                    case 3:
                        Uri.Builder buildUpon = Uri.parse(UrlBuilderUtils.m17740a(SearchHistoryCommand.this.f16591d) + "del").buildUpon();
                        buildUpon.appendQueryParameter(C1411aV.f4472R, "1");
                        UrlBuilderUtils.Crumb a = UrlBuilderUtils.m17739a();
                        if (a != null) {
                            buildUpon.appendQueryParameter(".bcrumb", a.f17318a);
                        }
                        return buildUpon.build();
                    case 4:
                        String a2 = C4127a.m17418a(SearchHistoryCommand.this.f16591d);
                        if (a2.equals("")) {
                            a2 = "en-US";
                        }
                        Uri.Builder buildUpon2 = Uri.parse(String.format(ServerSettings.m17417a().getBCrumbUrlTemplate(), new Object[]{a2})).buildUpon();
                        buildUpon2.appendQueryParameter("p", "");
                        return buildUpon2.build();
                    default:
                        return null;
                }
            }

            /* renamed from: a */
            private static Uri m17374a(Context context, SearchQuery searchQuery, char c) {
                Map<String, String> additionalParameters;
                String queryString = searchQuery.getQueryString();
                Uri.Builder buildUpon = Uri.parse(UrlBuilderUtils.m17740a(context) + "add").buildUpon();
                buildUpon.appendQueryParameter("query", queryString).appendQueryParameter("type", String.valueOf(c));
                UrlBuilderUtils.Crumb a = UrlBuilderUtils.m17739a();
                if (a != null) {
                    buildUpon.appendQueryParameter(".bcrumb", a.f17318a);
                }
                if (c == 'c' && (additionalParameters = searchQuery.getAdditionalParameters()) != null) {
                    String str = additionalParameters.get("url");
                    String str2 = additionalParameters.get("title");
                    if (str != null) {
                        buildUpon.appendQueryParameter("url", str);
                    }
                    if (str2 != null) {
                        buildUpon.appendQueryParameter("title", str2);
                    }
                }
                return buildUpon.build();
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15086a(int i) {
        if (this.f16602g == SearchHistoryActionEnum.DELETE_ALL) {
            C4228b.m17754a(this.f16591d, this.f16591d.getString(C4073a.C4086m.yssdk_clear_history_title), this.f16591d.getString(C4073a.C4086m.yssdk_request_error), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case -1:
                            SearchHistoryCommand.this.mo15115i();
                            return;
                        default:
                            return;
                    }
                }
            });
        } else {
            super.mo15086a(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15091e() {
        switch (this.f16602g) {
            case ADD_S:
            case ADD_C:
            case DELETE_ALL:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: i */
    public final void mo15115i() {
        executeCommand();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15084a() {
        return "SUGGEST_QUEUE";
    }
}
