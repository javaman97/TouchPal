package com.yahoo.mobile.client.share.search.p099ui.container;

import android.app.ProgressDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.commands.SearchHistoryCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.p099ui.ISearchBox;
import com.yahoo.mobile.client.share.search.p099ui.SearchBoxListener;
import com.yahoo.mobile.client.share.search.p099ui.SearchSuggestionsAdapterCallback;
import com.yahoo.mobile.client.share.search.p099ui.container.ISearchContainer;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.ContentFragment;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.SearchResultFragment;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.SearchSuggestContentFragment;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.C4242g;
import com.yahoo.mobile.client.share.search.util.C4245j;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.HashMap;
import java.util.List;

@SuppressFBWarnings({"URF_UNREAD_FIELD"})
/* renamed from: com.yahoo.mobile.client.share.search.ui.container.SearchBoxManager */
public class SearchBoxManager implements SearchCommand.SearchTaskCallback, SearchBoxListener, SearchSuggestionsAdapterCallback, ISearchContainer.SearchContainerEventListener {

    /* renamed from: a */
    private boolean f17085a;

    /* renamed from: b */
    ProgressDialog f17086b;

    /* renamed from: c */
    private boolean f17087c;

    /* renamed from: d */
    private Context f17088d;

    /* renamed from: e */
    private SearchQuery f17089e;

    /* renamed from: f */
    private SearchSuggestContentFragment f17090f;

    /* renamed from: g */
    private ISearchBox f17091g;

    /* renamed from: h */
    private ISearchContainer f17092h;

    /* renamed from: i */
    private ViewGroup f17093i;

    /* renamed from: j */
    private ViewGroup f17094j;

    /* renamed from: k */
    private SearchBoxManagerListener f17095k;

    /* renamed from: l */
    private int f17096l;

    /* renamed from: m */
    private String f17097m;

    /* renamed from: com.yahoo.mobile.client.share.search.ui.container.SearchBoxManager$SearchBoxManagerListener */
    public interface SearchBoxManagerListener {
        void onQuerySubmitted(SearchBoxManager searchBoxManager, SearchQuery searchQuery);

        void onSearchBoxFocusChange(boolean z);
    }

    public SearchBoxManager(Context context) {
        this.f17085a = false;
        this.f17087c = false;
        this.f17096l = 6;
        this.f17097m = "sch_search_screen";
        this.f17086b = null;
        this.f17087c = context.getResources().getBoolean(C4073a.C4077d.yssdk_locale_isSearchSuggestionEnabled);
        this.f17088d = context;
    }

    public SearchBoxManager(Context context, int i) {
        this(context);
        this.f17096l = i;
        if (this.f17096l == 5) {
            this.f17097m = "sch_shr_search_screen";
        }
    }

    public SearchQuery getQuery() {
        return this.f17089e;
    }

    public void clearQuery() {
        this.f17089e = new SearchQuery(new SearchQuery.Builder());
        this.f17091g.clearQuery();
    }

    public SearchSuggestContentFragment getSearchSuggest() {
        return this.f17090f;
    }

    public void setSearchSuggest(SearchSuggestContentFragment searchSuggestContentFragment) {
        this.f17090f = searchSuggestContentFragment;
        if (searchSuggestContentFragment != null) {
            searchSuggestContentFragment.setAdapterCallback(this);
        }
    }

    public ISearchBox getSearchBox() {
        return this.f17091g;
    }

    public void setSearchBox(ISearchBox iSearchBox) {
        this.f17091g = iSearchBox;
        if (iSearchBox != null) {
            iSearchBox.setSearchBoxListener(this);
        }
    }

    public ISearchContainer getSearchContainer() {
        return this.f17092h;
    }

    public void setSearchContainer(ISearchContainer iSearchContainer) {
        this.f17092h = iSearchContainer;
        if (this.f17092h != null) {
            this.f17092h.setSearchContainerEventListener(this);
            if (this.f17092h.getCurrentFragment() != null) {
                SearchResultFragment currentFragment = this.f17092h.getCurrentFragment();
                if (this.f17091g != null && (currentFragment instanceof ContentFragment)) {
                    this.f17091g.setEnhancementTitle(((ContentFragment) currentFragment).getContentProvider(this.f17088d));
                }
                setTopPaddingForAllFragments(this.f17091g.getSearchBoxHeight());
            }
        }
    }

    public void setTopPaddingForAllFragments(int i) {
        List<SearchResultFragment> allFragments = this.f17092h.getAllFragments();
        if (allFragments != null) {
            for (SearchResultFragment topPadding : allFragments) {
                topPadding.setTopPadding(i);
            }
        }
        if (this.f17090f != null) {
            this.f17090f.setTopPadding(i);
        }
    }

    public ViewGroup getSearchBoxContainer() {
        return this.f17093i;
    }

    public void setSearchBoxContainer(ViewGroup viewGroup) {
        this.f17093i = viewGroup;
        if (viewGroup != null) {
            viewGroup.setFocusable(true);
            viewGroup.setFocusableInTouchMode(true);
        }
    }

    public ViewGroup getSearchSuggestionContainer() {
        return this.f17094j;
    }

    public void setSearchSuggestionContainer(ViewGroup viewGroup) {
        this.f17094j = viewGroup;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    public SearchBoxManagerListener getListener() {
        return this.f17095k;
    }

    public void setListener(SearchBoxManagerListener searchBoxManagerListener) {
        this.f17095k = searchBoxManagerListener;
    }

    public void restoreQuery(String str) {
        addTextToSearchBox(str);
        this.f17089e = this.f17091g.getQuery();
    }

    public void addTextToSearchBox(String str) {
        this.f17091g.setCursorVisible(true);
        this.f17091g.setQuery(new SearchQuery(new SearchQuery.Builder().setQueryString(str)));
    }

    public void addTextToSearchBox(String str, boolean z) {
        addTextToSearchBox(str);
        if (z) {
            this.f17091g.setFocus();
        }
    }

    public void suggestionSelected(String str) {
        addTextToSearchBox(str);
        this.f17091g.submitQuery(SearchQuery.SearchQueryAction.SUGGESTION);
    }

    public void onQueryChanged(ISearchBox iSearchBox, SearchQuery searchQuery) {
        if (this.f17087c) {
            this.f17090f.loadPreQuery(searchQuery);
        }
        if (this.f17085a && this.f17094j.getVisibility() != 0) {
            this.f17094j.setVisibility(0);
        }
    }

    public void onQuerySubmitted(ISearchBox iSearchBox, SearchQuery searchQuery) {
        if (!TextUtils.isEmpty(searchQuery.getQueryString())) {
            if (this.f17095k != null) {
                this.f17095k.onQuerySubmitted(this, searchQuery);
            }
            this.f17089e = searchQuery;
        }
    }

    public void onFocusChange(ISearchBox iSearchBox, boolean z) {
        if (this.f17094j != null && this.f17087c && z) {
            HashMap hashMap = new HashMap();
            hashMap.put("screen_name", "sch_search_screen");
            C4242g.m17773a(980778382, "page_view_classic", hashMap);
            this.f17094j.setVisibility(0);
        }
        this.f17085a = z;
        if (this.f17095k != null) {
            this.f17095k.onSearchBoxFocusChange(z);
        }
        if (this.f17087c && z) {
            if (this.f17089e == null || C4245j.m17785a(this.f17089e.getQueryString())) {
                this.f17090f.loadPreQuery(SearchQuery.EMPTY_SEARCH_QUERY);
            } else {
                this.f17090f.loadPreQuery(this.f17089e);
            }
        }
    }

    public boolean hasFocus() {
        return this.f17085a;
    }

    public void onCancelPressed(ISearchBox iSearchBox) {
        this.f17093i.requestFocus();
        this.f17094j.setVisibility(8);
        HashMap hashMap = new HashMap();
        hashMap.put("sch_type", "cancel");
        C4242g.m17773a(980778382, "sch_select_action", hashMap);
    }

    public void onSearchTipsScroll() {
        this.f17091g.setCursorVisible(false);
        this.f17091g.hideKeyboard();
    }

    public void onClearAllHistoryClicked() {
        if (C4129c.m17440e()) {
            this.f17086b = new ProgressDialog(this.f17088d);
            this.f17086b.setMessage(this.f17088d.getResources().getString(C4073a.C4086m.yssdk_processing));
            this.f17086b.setCanceledOnTouchOutside(false);
            this.f17086b.show();
            SearchHistoryCommand searchHistoryCommand = new SearchHistoryCommand(this.f17088d, SearchQuery.EMPTY_SEARCH_QUERY, SearchHistoryCommand.SearchHistoryActionEnum.DELETE_ALL);
            searchHistoryCommand.setSearchTaskCallback(this);
            searchHistoryCommand.executeCommand();
        }
    }

    public void onProgressReceived(SearchCommand searchCommand, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
    }

    public void onSearchTaskCompleted(SearchCommand searchCommand, SearchResponseData searchResponseData, SearchQuery searchQuery) {
        if (this.f17086b != null && this.f17086b.isShowing()) {
            this.f17086b.dismiss();
        }
        this.f17086b = null;
    }

    public void onSearchTaskError(SearchCommand searchCommand, SearchError searchError, SearchQuery searchQuery) {
        if (this.f17086b != null && this.f17086b.isShowing()) {
            this.f17086b.dismiss();
        }
        this.f17086b = null;
    }

    public void onSearchTaskCancelled(SearchCommand searchCommand, SearchQuery searchQuery) {
        if (this.f17086b != null && this.f17086b.isShowing()) {
            this.f17086b.dismiss();
        }
        this.f17086b = null;
    }

    public void onLoadQuery(ISearchContainer iSearchContainer, SearchQuery searchQuery) {
    }

    public void onChangeContent(SearchResultFragment searchResultFragment, SearchResultFragment searchResultFragment2) {
    }

    public void onShowNewContent(SearchResultFragment searchResultFragment) {
        if (searchResultFragment != null && this.f17091g != null) {
            if (searchResultFragment instanceof ContentFragment) {
                this.f17091g.setEnhancementTitle(((ContentFragment) searchResultFragment).getContentProvider(this.f17088d));
                return;
            }
            this.f17091g.setEnhancementTitle("");
        }
    }

    public void onRestoreState(ISearchContainer iSearchContainer) {
        setSearchContainer(iSearchContainer);
    }
}
