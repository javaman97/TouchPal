package com.yahoo.mobile.client.share.search.p099ui;

import android.view.KeyEvent;
import com.yahoo.mobile.client.share.search.data.SearchQuery;

/* renamed from: com.yahoo.mobile.client.share.search.ui.ISearchBox */
public interface ISearchBox {

    /* renamed from: com.yahoo.mobile.client.share.search.ui.ISearchBox$QueryAction */
    public enum QueryAction {
        NOTHING,
        SUBMITTED,
        CANCELED
    }

    void clearQuery();

    SearchQuery getQuery();

    int getSearchBoxHeight();

    SearchBoxListener getSearchBoxListener();

    void hideKeyboard();

    boolean onKeyDown(int i, KeyEvent keyEvent);

    void setCursorVisible(boolean z);

    void setEnhancementTitle(String str);

    boolean setFocus();

    void setQuery(SearchQuery searchQuery);

    void setSearchBoxListener(SearchBoxListener searchBoxListener);

    void submitQuery();

    void submitQuery(SearchQuery.SearchQueryAction searchQueryAction);
}
