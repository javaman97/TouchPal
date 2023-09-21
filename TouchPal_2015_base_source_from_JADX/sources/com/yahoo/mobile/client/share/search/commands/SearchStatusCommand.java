package com.yahoo.mobile.client.share.search.commands;

import android.content.Context;
import android.net.Uri;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.MetaData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import com.yahoo.mobile.client.share.search.p097b.C4092a;
import com.yahoo.mobile.client.share.search.settings.C4127a;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.settings.ServerSettings;
import com.yahoo.mobile.client.share.search.util.C4228b;
import java.util.ArrayList;

public class SearchStatusCommand extends SearchCommand implements SearchCommand.SearchTaskCallback {

    /* renamed from: a */
    private static final String f16607a = SearchStatusCommand.class.getSimpleName();

    /* renamed from: g */
    private ISearchStatusCallback f16608g = null;

    public interface ISearchStatusCallback {
        void onSearchStatusResult(SearchStatusCommand searchStatusCommand, SearchStatusData.SearchStatusEnum searchStatusEnum);
    }

    public SearchStatusCommand(Context context, ISearchStatusCallback iSearchStatusCallback) {
        super(context, (SearchQuery) null);
        this.f16608g = iSearchStatusCallback;
        setSearchTaskCallback(this);
    }

    public SearchStatusCommand(Context context, SearchQuery searchQuery) {
        super(context, searchQuery);
    }

    public int getCommandType() {
        return 20;
    }

    public SearchResponseData parseResponse(String str) {
        SearchStatusData f = C4092a.m17331f(str);
        C4129c.m17428a(f);
        C4228b.m17753a(this.f16591d, f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(f);
        return new SearchResponseData((MetaData) null, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15084a() {
        return "SUGGEST_QUEUE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo15100h() {
        return false;
    }

    public IUrlBuilder getUrlBuilder() {
        return new IUrlBuilder() {
            public final Uri buildUrl(Context context, SearchQuery searchQuery) {
                String a = C4127a.m17418a(context);
                if (a.equals("")) {
                    a = "en-US";
                }
                return ServerSettings.m17417a().appendExtraParameters(context, Uri.parse(String.format(ServerSettings.m17417a().getSearchStatusUrlTemplate(), new Object[]{a})).buildUpon()).build();
            }
        };
    }

    public void onProgressReceived(SearchCommand searchCommand, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
    }

    public void onSearchTaskError(SearchCommand searchCommand, SearchError searchError, SearchQuery searchQuery) {
        SearchStatusData.SearchStatusEnum searchStatusEnum;
        if (this.f16608g != null) {
            switch (searchError.getErrorCode()) {
                case 3:
                case 4:
                    searchStatusEnum = SearchStatusData.SearchStatusEnum.UNKOWN_ERROR;
                    break;
                default:
                    searchStatusEnum = SearchStatusData.SearchStatusEnum.SERVER_ERROR;
                    break;
            }
            this.f16608g.onSearchStatusResult(this, searchStatusEnum);
        }
    }

    public void onSearchTaskCompleted(SearchCommand searchCommand, SearchResponseData searchResponseData, SearchQuery searchQuery) {
        if (this.f16608g != null && searchResponseData != null && searchResponseData.getResponseList() != null && searchResponseData.getResponseList().size() > 0) {
            this.f16608g.onSearchStatusResult(this, ((SearchStatusData) searchResponseData.getResponseList().get(0)).getValidStatus());
        }
    }

    public void onSearchTaskCancelled(SearchCommand searchCommand, SearchQuery searchQuery) {
    }
}
