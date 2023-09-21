package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.cootek.smartinput5.func.iab.C1730E;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.p098c.C4093a;
import com.yahoo.mobile.client.share.search.p098c.C4095c;
import com.yahoo.mobile.client.share.search.p098c.C4096d;
import com.yahoo.mobile.client.share.search.p099ui.SearchSuggestionsAdapterCallback;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity;
import com.yahoo.mobile.client.share.search.p099ui.activity.TrendingSearchEnum;
import com.yahoo.mobile.client.share.search.suggest.C4140c;
import com.yahoo.mobile.client.share.search.suggest.C4146d;
import com.yahoo.mobile.client.share.search.suggest.C4152e;
import com.yahoo.mobile.client.share.search.suggest.C4153f;
import com.yahoo.mobile.client.share.search.suggest.ISuggestContainer;
import com.yahoo.mobile.client.share.search.suggest.ISuggestContentHandler;
import com.yahoo.mobile.client.share.search.suggest.SearchSuggestController;
import com.yahoo.mobile.client.share.search.util.C4233c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.SearchSuggestContentFragment */
public class SearchSuggestContentFragment extends ContentFragment implements SearchSuggestController.SearchSuggestCallback {

    /* renamed from: a */
    private List<ISuggestContainer> f17155a;

    /* renamed from: i */
    protected ListView f17156i;

    /* renamed from: j */
    protected SearchSuggestionsAdapterCallback f17157j;

    /* renamed from: k */
    private C4096d f17158k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C4095c f17159l;

    /* renamed from: m */
    private String f17160m = TrendingSearchEnum.DEFAULT.toString();

    /* renamed from: n */
    private int f17161n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<ISuggestContainer> mo15627a() {
        ArrayList arrayList = new ArrayList();
        if (getActivity() != null && !getActivity().isFinishing()) {
            arrayList.add(new C4140c(getActivity()));
        }
        return arrayList;
    }

    /* renamed from: b */
    private String m17660b() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            this.f17160m = getActivity().getIntent().getStringExtra(SearchActivity.TRENDING_CATEGORY);
        }
        return this.f17160m;
    }

    public void onContentReceived(ContentManager contentManager, SearchResponseData searchResponseData, SearchQuery searchQuery) {
    }

    public void onContentError(ContentManager contentManager, SearchError searchError, SearchQuery searchQuery) {
    }

    public int getScrollY() {
        return 0;
    }

    public void setAdapterCallback(SearchSuggestionsAdapterCallback searchSuggestionsAdapterCallback) {
        this.f17157j = searchSuggestionsAdapterCallback;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f17161n = arguments.getInt("local_history", 3);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17137c = (ViewGroup) layoutInflater.inflate(C4073a.C4083j.yssdk_search_suggest_page, viewGroup, false);
        this.f17159l = new C4095c(getActivity());
        this.f17156i = (ListView) this.f17137c.findViewById(C4073a.C4081h.search_suggest_list);
        this.f17156i.setEmptyView(this.f17137c.findViewById(C4073a.C4081h.empty_list_view));
        this.f17156i.setOnScrollListener(new AbsListView.OnScrollListener() {
            public final void onScrollStateChanged(AbsListView absListView, int i) {
                if (i == 1 && SearchSuggestContentFragment.this.f17157j != null) {
                    SearchSuggestContentFragment.this.f17157j.onSearchTipsScroll();
                }
            }

            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }
        });
        return this.f17137c;
    }

    public String getLabel(Context context) {
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f17137c.setPadding(view.getPaddingLeft(), this.f17139e, view.getPaddingRight(), view.getPaddingBottom());
        if (this.f17155a == null) {
            this.f17155a = mo15627a();
            C4146d dVar = new C4146d(getActivity(), this.f17159l, this.f17155a, this.f17161n);
            this.f17155a.add(dVar);
            if (m17660b() != null && TrendingSearchEnum.contains(this.f17160m) && !TrendingSearchEnum.NONE.toString().equals(this.f17160m)) {
                C4153f fVar = new C4153f(getActivity(), m17660b());
                this.f17155a.add(fVar);
                dVar.mo15469a((ISuggestContainer) fVar);
            }
        }
        this.f17158k = new C4096d(getActivity(), this.f17156i, this.f17155a, Collections.emptyList(), this.f17159l);
        this.f17158k.mo15437a((SearchSuggestController.SearchSuggestCallback) this);
        this.f17158k.mo15436a((SearchSuggestController.ISuggestTrimmer) new C4152e());
    }

    public void onStop() {
        super.onStop();
        this.f17156i.setVisibility(4);
    }

    public void loadPreQuery(SearchQuery searchQuery) {
        if (this.f17158k != null) {
            this.f17158k.mo15435a(searchQuery);
        }
    }

    public void onQuerySubmitted(SearchQuery searchQuery) {
        if (searchQuery != null && !TextUtils.isEmpty(searchQuery.getQueryString())) {
            String[] strArr = {searchQuery.getQueryString()};
            switch (searchQuery.getAction()) {
                case VOICE:
                case MANUAL:
                    C4233c.m17759c(new C4199a(), strArr);
                    return;
                default:
                    return;
            }
        }
    }

    public boolean onSearchSuggestItemClick(ISuggestContainer iSuggestContainer, int i, SearchAssistData searchAssistData, String str, SearchQuery searchQuery) {
        if (this.f17157j == null) {
            return false;
        }
        if (str.equals(ISuggestContentHandler.SEARCH_QUERY)) {
            this.f17157j.suggestionSelected(searchAssistData.getLabel());
            return false;
        } else if (str.equals(ISuggestContentHandler.BUILD_QUERY) || str.equals(ISuggestContentHandler.BUILD_QUERY_WITH_HISTORY)) {
            this.f17157j.addTextToSearchBox(searchAssistData.getLabel() + " ", true);
            return false;
        } else if (!str.equals(ISuggestContentHandler.CLEAR_HISTORY)) {
            return false;
        } else {
            this.f17157j.onClearAllHistoryClicked();
            this.f17158k.mo15434a();
            return false;
        }
    }

    public void onDataReceived(ISuggestContainer iSuggestContainer, List<SearchAssistData> list, SearchQuery searchQuery) {
    }

    public void onContainerViewCreated(ISuggestContainer iSuggestContainer) {
    }

    public void onContentReadyForDisplay(ISuggestContainer iSuggestContainer, List<SearchAssistData> list, SearchQuery searchQuery) {
    }

    public List<ISuggestContainer> getContainers() {
        if (this.f17155a == null) {
            this.f17155a = mo15627a();
        }
        return this.f17155a;
    }

    public C4096d getSearchSuggestController() {
        return this.f17158k;
    }

    public void reloadContainers() {
        if (this.f17158k != null) {
            this.f17158k.notifyDataSetChanged();
        }
    }

    public String getVerticalId() {
        return "search_sug";
    }

    public int getType() {
        return 0;
    }

    /* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.SearchSuggestContentFragment$a */
    class C4199a extends AsyncTask<String, Void, Void> {
        C4199a() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            C4093a aVar;
            String str = ((String[]) objArr)[0];
            if (str != null) {
                str = str.trim().toLowerCase();
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            List<C4093a> a = SearchSuggestContentFragment.this.f17159l.mo15074a(C1730E.f5650d, (List<String>) arrayList);
            if (a == null || a.size() == 0) {
                aVar = new C4093a(str, C1730E.f5650d);
            } else {
                aVar = a.get(0);
                aVar.mo15064a();
            }
            SearchSuggestContentFragment.this.f17159l.mo15076a(aVar);
            return null;
        }
    }
}
