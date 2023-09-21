package com.yahoo.mobile.client.share.search.p099ui.container;

import android.view.View;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.SearchResultFragment;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.ui.container.ISearchContainer */
public interface ISearchContainer {

    /* renamed from: com.yahoo.mobile.client.share.search.ui.container.ISearchContainer$SearchContainerEventListener */
    public interface SearchContainerEventListener {
        void onChangeContent(SearchResultFragment searchResultFragment, SearchResultFragment searchResultFragment2);

        void onLoadQuery(ISearchContainer iSearchContainer, SearchQuery searchQuery);

        void onRestoreState(ISearchContainer iSearchContainer);

        void onShowNewContent(SearchResultFragment searchResultFragment);
    }

    List<SearchResultFragment> getAllFragments();

    SearchResultFragment getCurrentFragment();

    View getFooterView();

    SearchResultFragment getFragment(String str);

    View getHeaderView();

    SearchQuery getQuery();

    SearchContainerEventListener getSearchContainerEventListener();

    SearchResultFragment getSearchResultFragment(int i);

    void hideFooter();

    void hideHeader();

    void insertSearchResultFragment(int i, SearchResultFragment searchResultFragment);

    boolean isFragmentAvailable(String str);

    void loadQuery(SearchQuery searchQuery, boolean z);

    void onDestroy();

    void onErrorReceivedForSearchResultFragment(SearchResultFragment searchResultFragment);

    void onResponseReceivedForSearchResultFragment(SearchResultFragment searchResultFragment);

    void onSearchResultFragmentViewCreated(SearchResultFragment searchResultFragment);

    void removeSearchResultFragment(SearchResultFragment searchResultFragment);

    void setFooterView(View view);

    void setHeaderView(View view);

    void setSearchContainerEventListener(SearchContainerEventListener searchContainerEventListener);

    void showChrome();

    boolean showContent(SearchResultFragment searchResultFragment);

    void showFooter();

    void showFragmentByName(String str);

    void showHeader();
}
