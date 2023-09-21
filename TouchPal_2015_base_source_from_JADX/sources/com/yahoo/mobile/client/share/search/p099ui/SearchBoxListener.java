package com.yahoo.mobile.client.share.search.p099ui;

import com.yahoo.mobile.client.share.search.data.SearchQuery;

/* renamed from: com.yahoo.mobile.client.share.search.ui.SearchBoxListener */
public interface SearchBoxListener {
    void onCancelPressed(ISearchBox iSearchBox);

    void onFocusChange(ISearchBox iSearchBox, boolean z);

    void onQueryChanged(ISearchBox iSearchBox, SearchQuery searchQuery);

    void onQuerySubmitted(ISearchBox iSearchBox, SearchQuery searchQuery);
}
