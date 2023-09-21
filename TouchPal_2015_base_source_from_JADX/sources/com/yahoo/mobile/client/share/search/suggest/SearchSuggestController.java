package com.yahoo.mobile.client.share.search.suggest;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.data.SearchAssistData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.util.C4233c;
import com.yahoo.mobile.client.share.search.util.C4242g;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SearchSuggestController extends BaseAdapter implements ISuggestContentHandler {

    /* renamed from: e */
    private static final List<SearchAssistData> f16819e = Collections.emptyList();

    /* renamed from: a */
    protected Map<String, ISuggestContainer> f16820a;

    /* renamed from: b */
    protected SearchSuggestCallback f16821b;

    /* renamed from: c */
    protected SearchMetricsLogger f16822c;

    /* renamed from: d */
    protected Context f16823d;

    /* renamed from: f */
    private ListView f16824f;

    /* renamed from: g */
    private List<ISuggestContainer> f16825g;

    /* renamed from: h */
    private List<ISuggestContainer> f16826h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public SearchQuery f16827i;

    /* renamed from: j */
    private SearchQuery f16828j;

    /* renamed from: k */
    private Map<ISuggestContainer, List<SearchAssistData>> f16829k;

    /* renamed from: l */
    private Map<ISuggestContainer, List<SearchAssistData>> f16830l;

    /* renamed from: m */
    private List<ISuggestContainer> f16831m;

    /* renamed from: n */
    private Set<ISuggestContainer> f16832n;

    /* renamed from: o */
    private String f16833o = "suggest";

    /* renamed from: p */
    private ISuggestTrimmer f16834p;

    public interface ISuggestTrimmer {
        void trimSearchResults(SearchQuery searchQuery, List<ISuggestContainer> list, List<ISuggestContainer> list2, Map<ISuggestContainer, List<SearchAssistData>> map);
    }

    public interface SearchMetricsLogger {

        public enum SearchEventType {
            START_LOADING,
            RESULT_RECEIVED,
            VIEW_CREATED
        }

        void logEvent(ISuggestContainer iSuggestContainer, SearchEventType searchEventType, SearchQuery searchQuery);
    }

    public interface SearchSuggestCallback {
        void onContainerViewCreated(ISuggestContainer iSuggestContainer);

        void onContentReadyForDisplay(ISuggestContainer iSuggestContainer, List<SearchAssistData> list, SearchQuery searchQuery);

        void onDataReceived(ISuggestContainer iSuggestContainer, List<SearchAssistData> list, SearchQuery searchQuery);

        boolean onSearchSuggestItemClick(ISuggestContainer iSuggestContainer, int i, SearchAssistData searchAssistData, String str, SearchQuery searchQuery);
    }

    @SuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
    public SearchSuggestController(Context context, ListView listView, List<ISuggestContainer> list, List<ISuggestContainer> list2) {
        this.f16823d = context;
        this.f16824f = listView;
        this.f16825g = list;
        this.f16820a = new HashMap();
        for (ISuggestContainer next : this.f16825g) {
            this.f16820a.put(next.getContainerName(), next);
            next.setSuggestContentHandler(this);
        }
        this.f16826h = list2;
        for (ISuggestContainer next2 : this.f16826h) {
            this.f16820a.put(next2.getContainerName(), next2);
            next2.setSuggestContentHandler(this);
        }
        this.f16824f.setAdapter(this);
    }

    /* renamed from: a */
    public final void mo15436a(ISuggestTrimmer iSuggestTrimmer) {
        this.f16834p = iSuggestTrimmer;
    }

    /* renamed from: a */
    public final void mo15435a(SearchQuery searchQuery) {
        this.f16827i = searchQuery;
        this.f16829k = new IdentityHashMap();
        this.f16832n = new HashSet();
        for (ISuggestContainer b : this.f16825g) {
            m17499b(b, searchQuery);
        }
        for (ISuggestContainer b2 : this.f16826h) {
            m17499b(b2, searchQuery);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15081a(ISuggestContainer iSuggestContainer, SearchQuery searchQuery) {
        iSuggestContainer.loadContainerResult(searchQuery, iSuggestContainer.getMaxResultCount(searchQuery));
    }

    /* renamed from: b */
    private void m17499b(ISuggestContainer iSuggestContainer, SearchQuery searchQuery) {
        List<SearchAssistData> list;
        if (this.f16822c != null) {
            this.f16822c.logEvent(iSuggestContainer, SearchMetricsLogger.SearchEventType.START_LOADING, searchQuery);
        }
        if (iSuggestContainer.canIncrementalFilter() && this.f16828j != null) {
            boolean contains = this.f16831m.contains(iSuggestContainer);
            String queryString = searchQuery.getQueryString();
            if (contains && queryString != null && queryString.startsWith(this.f16828j.getQueryString()) && ((list = this.f16830l.get(iSuggestContainer)) == null || (list.size() == 0 && list != f16819e))) {
                onContainerContentReadyForDisplay(iSuggestContainer, list, searchQuery);
                return;
            }
        }
        if (iSuggestContainer.canCacheResults()) {
            List<SearchAssistData> list2 = null;
            if (searchQuery.equals(this.f16828j)) {
                list2 = this.f16830l.get(iSuggestContainer);
            } else if (searchQuery.equals(this.f16827i)) {
                list2 = this.f16829k.get(iSuggestContainer);
            }
            if (list2 == null || list2 == f16819e) {
                mo15081a(iSuggestContainer, searchQuery);
            } else {
                onContainerContentReadyForDisplay(iSuggestContainer, list2, searchQuery);
            }
        } else {
            mo15081a(iSuggestContainer, searchQuery);
        }
    }

    /* renamed from: a */
    public final void mo15434a() {
        this.f16827i = null;
        this.f16828j = null;
        this.f16829k = null;
        this.f16830l = null;
        this.f16831m = null;
        this.f16832n = null;
        notifyDataSetChanged();
    }

    public void onContainerContentReceived(final ISuggestContainer iSuggestContainer, final List<SearchAssistData> list, final SearchQuery searchQuery) {
        if (searchQuery.equals(this.f16827i)) {
            this.f16821b.onDataReceived(iSuggestContainer, list, searchQuery);
            if (this.f16822c != null) {
                this.f16822c.logEvent(iSuggestContainer, SearchMetricsLogger.SearchEventType.RESULT_RECEIVED, searchQuery);
            }
            C4233c.m17759c(new AsyncTask<Object, Void, Void>() {
                /* access modifiers changed from: protected */
                public final /* synthetic */ Object doInBackground(Object[] objArr) {
                    if (!searchQuery.equals(SearchSuggestController.this.f16827i)) {
                        return null;
                    }
                    SearchSuggestController.this.mo15082a(iSuggestContainer, (List<SearchAssistData>) list, searchQuery);
                    return null;
                }

                /* access modifiers changed from: protected */
                public final /* synthetic */ void onPostExecute(Object obj) {
                    SearchSuggestController.this.onContainerContentReadyForDisplay(iSuggestContainer, list, searchQuery);
                }
            }, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15082a(ISuggestContainer iSuggestContainer, List<SearchAssistData> list, SearchQuery searchQuery) {
        if (list != null && list.size() != 0) {
            iSuggestContainer.prepareDataForDisplay(list, searchQuery);
        }
    }

    public void onContainerContentError(ISuggestContainer iSuggestContainer, SearchError searchError, SearchQuery searchQuery) {
        if (!searchQuery.equals(this.f16827i)) {
            return;
        }
        if (m17497a(iSuggestContainer)) {
            this.f16832n.add(iSuggestContainer);
            this.f16829k.put(iSuggestContainer, f16819e);
            m17498b();
        } else if (m17500b(iSuggestContainer)) {
            this.f16829k.put(iSuggestContainer, f16819e);
            m17498b();
        }
    }

    public void onContainerContentReadyForDisplay(ISuggestContainer iSuggestContainer, List<SearchAssistData> list, SearchQuery searchQuery) {
        this.f16821b.onContentReadyForDisplay(iSuggestContainer, list, searchQuery);
        if (!searchQuery.equals(this.f16827i)) {
            return;
        }
        if (m17497a(iSuggestContainer)) {
            this.f16832n.add(iSuggestContainer);
            this.f16829k.put(iSuggestContainer, list);
            m17498b();
        } else if (m17500b(iSuggestContainer)) {
            this.f16829k.put(iSuggestContainer, list);
            m17498b();
            if (this.f16828j == this.f16827i && list != null && list.size() > 0) {
                if (this.f16831m.indexOf(iSuggestContainer) == -1) {
                    this.f16831m.add(iSuggestContainer);
                }
                List<ISuggestContainer> list2 = this.f16825g;
                List<ISuggestContainer> list3 = this.f16826h;
                List<ISuggestContainer> list4 = this.f16831m;
                m17496a(list2, list3, this.f16829k);
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: b */
    private void m17498b() {
        if (this.f16828j != this.f16827i) {
            if (this.f16832n.size() == this.f16825g.size()) {
                ArrayList<ISuggestContainer> arrayList = new ArrayList<>(this.f16825g);
                arrayList.addAll(this.f16826h);
                ArrayList arrayList2 = new ArrayList();
                for (ISuggestContainer iSuggestContainer : arrayList) {
                    List list = this.f16829k.get(iSuggestContainer);
                    if (!(list == null || list.size() == 0)) {
                        arrayList2.add(iSuggestContainer);
                    }
                }
                if (arrayList2.size() > 0 || this.f16829k.size() == arrayList.size()) {
                    this.f16830l = this.f16829k;
                    this.f16828j = this.f16827i;
                    this.f16831m = arrayList2;
                    List<ISuggestContainer> list2 = this.f16825g;
                    List<ISuggestContainer> list3 = this.f16826h;
                    List<ISuggestContainer> list4 = this.f16831m;
                    m17496a(list2, list3, this.f16830l);
                    notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: a */
    private void m17496a(List<ISuggestContainer> list, List<ISuggestContainer> list2, Map<ISuggestContainer, List<SearchAssistData>> map) {
        if (this.f16834p != null) {
            this.f16834p.trimSearchResults(this.f16828j, list, list2, map);
        }
    }

    public void onItemClick(ISuggestContainer iSuggestContainer, int i, String str) {
        List list;
        if (this.f16830l != null && (list = this.f16830l.get(iSuggestContainer)) != null && i >= 0 && i < list.size()) {
            SearchAssistData searchAssistData = (SearchAssistData) list.get(i);
            mo15080a(iSuggestContainer, searchAssistData, i, str);
            boolean z = false;
            if (this.f16821b != null) {
                z = this.f16821b.onSearchSuggestItemClick(iSuggestContainer, i, searchAssistData, str, this.f16828j);
            }
            if (!z) {
                iSuggestContainer.performItemClick(searchAssistData, i, str, this.f16828j);
            }
        }
    }

    public int getCount() {
        if (this.f16831m != null) {
            return this.f16831m.size();
        }
        return 0;
    }

    public Object getItem(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return this.f16831m.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        ISuggestContainer iSuggestContainer = this.f16831m.get(i);
        View view2 = iSuggestContainer.getView(this.f16830l.get(iSuggestContainer), this.f16828j, view);
        if (this.f16822c != null) {
            this.f16822c.logEvent(iSuggestContainer, SearchMetricsLogger.SearchEventType.VIEW_CREATED, this.f16828j);
        }
        if (this.f16821b != null) {
            this.f16821b.onContainerViewCreated(iSuggestContainer);
        }
        return view2;
    }

    public int getItemViewType(int i) {
        if (i < 0 || i >= getCount() || this.f16831m == null) {
            return super.getItemViewType(i);
        }
        ISuggestContainer iSuggestContainer = this.f16831m.get(i);
        if (iSuggestContainer == null) {
            return super.getItemViewType(i);
        }
        int indexOf = this.f16825g.indexOf(iSuggestContainer);
        if (indexOf != -1) {
            return indexOf;
        }
        int indexOf2 = this.f16826h.indexOf(iSuggestContainer);
        if (indexOf2 == -1) {
            return super.getItemViewType(i);
        }
        return indexOf2 + this.f16825g.size();
    }

    public int getViewTypeCount() {
        return this.f16820a.size();
    }

    /* renamed from: a */
    public final void mo15437a(SearchSuggestCallback searchSuggestCallback) {
        this.f16821b = searchSuggestCallback;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15080a(ISuggestContainer iSuggestContainer, SearchAssistData searchAssistData, int i, String str) {
        if (!iSuggestContainer.shouldOverrideInstrumentation(iSuggestContainer, searchAssistData, i, str)) {
            if (str.equals(ISuggestContentHandler.SEARCH_QUERY)) {
                HashMap hashMap = new HashMap();
                hashMap.put("sch_pqry", this.f16828j.getQueryString());
                hashMap.put("query", searchAssistData.getTip());
                if (searchAssistData.getType() == 5) {
                    hashMap.put("query", searchAssistData.getLabel());
                    hashMap.put("sch_type", searchAssistData.getTip());
                }
                String str2 = "";
                if (searchAssistData.getType() == 13) {
                    str2 = "history";
                } else if (searchAssistData.getType() == 1) {
                    str2 = "gossip";
                } else if (searchAssistData.getType() == 5) {
                    str2 = "trending";
                }
                hashMap.put("sch_mthd", str2);
                hashMap.put("sch_pos", Integer.valueOf(i + 1));
                C4242g.m17773a(980778381, "sch_submit_query", hashMap);
                return;
            }
            String containerName = iSuggestContainer.getContainerName();
            int indexOf = this.f16831m.indexOf(iSuggestContainer) + 1;
            String itemI13nId = iSuggestContainer.getItemI13nId(searchAssistData);
            int i2 = i + 1;
            String queryString = this.f16828j.getQueryString();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("sch_cmpt", containerName);
            if (indexOf > 0) {
                hashMap2.put("sch_cpos", Integer.valueOf(indexOf));
            }
            hashMap2.put("query", itemI13nId);
            if (i2 > 0) {
                hashMap2.put("sch_pos", Integer.valueOf(i2));
            }
            if (queryString != null) {
                hashMap2.put("sch_pqry", queryString);
            }
            if (str.equals(ISuggestContentHandler.BUILD_QUERY)) {
                hashMap2.put("sch_type", ISuggestContentHandler.BUILD_QUERY);
            } else if (str.equals(ISuggestContentHandler.BUILD_QUERY_WITH_HISTORY)) {
                hashMap2.put("sch_type", ISuggestContentHandler.BUILD_QUERY_WITH_HISTORY);
            } else if (str.equals(ISuggestContentHandler.CLEAR_HISTORY)) {
                hashMap2.put("sch_type", "clear history");
            } else if (str.equals("default")) {
                hashMap2.put("sch_type", this.f16833o);
            }
            C4242g.m17773a(980778381, "sch_select_action", hashMap2);
        }
    }

    /* renamed from: a */
    private boolean m17497a(ISuggestContainer iSuggestContainer) {
        return this.f16825g.indexOf(iSuggestContainer) != -1;
    }

    /* renamed from: b */
    private boolean m17500b(ISuggestContainer iSuggestContainer) {
        return this.f16826h.indexOf(iSuggestContainer) != -1;
    }

    public void reloadQuery() {
        mo15435a(new SearchQuery(new SearchQuery.Builder(this.f16827i)));
    }
}
