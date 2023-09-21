package com.yahoo.mobile.client.share.search.p099ui;

/* renamed from: com.yahoo.mobile.client.share.search.ui.SearchSuggestionsAdapterCallback */
public interface SearchSuggestionsAdapterCallback {
    void addTextToSearchBox(String str);

    void addTextToSearchBox(String str, boolean z);

    void onClearAllHistoryClicked();

    void onSearchTipsScroll();

    void suggestionSelected(String str);
}
