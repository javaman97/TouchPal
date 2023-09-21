package com.yahoo.mobile.client.share.search.suggest;

import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import java.util.List;

public interface ISuggestContentHandler {
    public static final String BUILD_QUERY = "add gossip";
    public static final String BUILD_QUERY_WITH_HISTORY = "add history";
    public static final String CLEAR_HISTORY = "clear_history";
    public static final String CLEAR_LOCAL_HISTORY = "clear_local_history";
    public static final String DEFAULT = "default";
    public static final String SEARCH_QUERY = "search_query";

    void onContainerContentError(ISuggestContainer iSuggestContainer, SearchError searchError, SearchQuery searchQuery);

    void onContainerContentReadyForDisplay(ISuggestContainer iSuggestContainer, List<SearchAssistData> list, SearchQuery searchQuery);

    void onContainerContentReceived(ISuggestContainer iSuggestContainer, List<SearchAssistData> list, SearchQuery searchQuery);

    void onItemClick(ISuggestContainer iSuggestContainer, int i, String str);

    void reloadQuery();
}
