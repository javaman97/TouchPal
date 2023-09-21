package com.yahoo.mobile.client.share.search.p099ui.container;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p001v4.app.C0173s;
import android.support.p001v4.content.C0213m;
import android.support.p001v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.interfaces.IFooterViewHolder;
import com.yahoo.mobile.client.share.search.interfaces.IQueryManager;
import com.yahoo.mobile.client.share.search.interfaces.ISearchVertical;
import com.yahoo.mobile.client.share.search.interfaces.ITabController;
import com.yahoo.mobile.client.share.search.p099ui.container.ContentPagesAdapter;
import com.yahoo.mobile.client.share.search.p099ui.container.ISearchContainer;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.ContentFragment;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.SearchResultFragment;
import com.yahoo.mobile.client.share.search.p099ui.scroll.C4216b;
import com.yahoo.mobile.client.share.search.p099ui.scroll.IScrollable;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.C4228b;
import com.yahoo.mobile.client.share.search.util.C4240e;
import com.yahoo.mobile.client.share.search.util.C4242g;
import com.yahoo.mobile.client.share.search.util.C4243h;
import com.yahoo.mobile.client.share.search.util.C4245j;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressFBWarnings({"UUF_UNUSED_PUBLIC_OR_PROTECTED_FIELD"})
/* renamed from: com.yahoo.mobile.client.share.search.ui.container.SearchPagerContainer */
public class SearchPagerContainer implements ViewPager.C0382e, ITabController, ContentPagesAdapter.AdapterStateListener, ISearchContainer {
    public static int MAX_NUMBER_VERTICALS = 20;

    /* renamed from: a */
    private static final C4240e f17098a = new C4240e(1000, 2);

    /* renamed from: m */
    private static final C4240e f17099m = new C4240e(60000, 60);

    /* renamed from: n */
    private static final C4240e f17100n = new C4240e(3600000, 600);

    /* renamed from: b */
    protected SearchQuery f17101b;

    /* renamed from: c */
    protected Context f17102c;

    /* renamed from: d */
    protected ISearchContainer.SearchContainerEventListener f17103d;

    /* renamed from: e */
    protected ViewPager f17104e;

    /* renamed from: f */
    protected ContentPagesAdapter f17105f;

    /* renamed from: g */
    protected C0173s f17106g;

    /* renamed from: h */
    protected C4216b f17107h;

    /* renamed from: i */
    protected String f17108i;

    /* renamed from: j */
    protected boolean f17109j;

    /* renamed from: k */
    protected boolean f17110k;

    /* renamed from: l */
    protected List<Bundle> f17111l;

    /* renamed from: o */
    private RefreshMode f17112o;

    /* renamed from: p */
    private boolean[] f17113p;

    /* renamed from: q */
    private IFooterViewHolder f17114q;

    /* renamed from: r */
    private View f17115r;

    /* renamed from: s */
    private ViewGroup f17116s;

    /* renamed from: t */
    private boolean f17117t;

    /* renamed from: u */
    private BroadcastReceiver f17118u;

    /* renamed from: v */
    private BroadcastReceiver f17119v;

    /* renamed from: com.yahoo.mobile.client.share.search.ui.container.SearchPagerContainer$RefreshMode */
    public enum RefreshMode {
        CURRENT,
        NEIGHBOR,
        ALL
    }

    public SearchPagerContainer(Context context, C0173s sVar, ViewGroup viewGroup, View view, List<Bundle> list, int i) {
        this(context, (Bundle) null, sVar, viewGroup, view, list, i, false);
    }

    public SearchPagerContainer(Context context, Bundle bundle, C0173s sVar, ViewGroup viewGroup, View view, List<Bundle> list, int i, boolean z) {
        this.f17112o = RefreshMode.CURRENT;
        this.f17108i = "";
        this.f17109j = true;
        this.f17110k = false;
        this.f17117t = false;
        if (list.size() > MAX_NUMBER_VERTICALS) {
            throw new RuntimeException("Can not load " + list.size() + " verticals. Max number of verticals is " + MAX_NUMBER_VERTICALS);
        }
        this.f17102c = context;
        this.f17106g = sVar;
        this.f17116s = viewGroup;
        this.f17107h = new C4216b();
        this.f17107h.mo15810a(C4129c.m17439d());
        setFooterView(view);
        this.f17111l = list;
        this.f17113p = new boolean[MAX_NUMBER_VERTICALS];
        this.f17104e = (ViewPager) this.f17116s.findViewById(C4073a.C4081h.search_pager);
        this.f17104e.setOffscreenPageLimit(MAX_NUMBER_VERTICALS);
        this.f17104e.setOnPageChangeListener(this);
        this.f17104e.setSaveEnabled(true);
        this.f17104e.setPageMargin((int) Utils.convertDpToPixel((float) this.f17102c.getResources().getInteger(C4073a.C4082i.page_margin), this.f17102c));
        this.f17105f = new ContentPagesAdapter(context, sVar, list);
        this.f17104e.setAdapter(this.f17105f);
        if (bundle == null) {
            this.f17105f.notifyDataSetChanged();
            this.f17114q.setTabs(m17638a());
            if (i >= 0 && i < this.f17105f.getCount()) {
                this.f17104e.setCurrentItem(i);
            }
        } else {
            String string = bundle.getString("SearchPagerContainer.query");
            if (!TextUtils.isEmpty(string)) {
                this.f17101b = new SearchQuery(new SearchQuery.Builder().setQueryString(string));
            }
            this.f17105f.setStateListener(this);
        }
        if (z) {
            this.f17104e.setBackgroundColor(0);
        }
        this.f17110k = z;
        m17640a(view, this.f17107h, z);
        this.f17118u = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                Bundle extras = intent.getExtras();
                String string = extras.getString("view_content");
                HashMap hashMap = (HashMap) extras.getSerializable("properties");
                if (string != null) {
                    if (string.equalsIgnoreCase("switch_fragment")) {
                        SearchPagerContainer.this.showFragmentByName((String) hashMap.get("target_fragment"));
                    }
                    if (string.equalsIgnoreCase("change_page")) {
                        SearchPagerContainer.this.showChrome();
                    }
                }
            }
        };
        C0213m.m882a(this.f17102c).mo695a(this.f17118u, new IntentFilter("LocalBroadcast"));
        this.f17119v = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                Bundle extras = intent.getExtras();
                String string = extras.getString("url");
                String string2 = extras.getString("title");
                if (SearchPagerContainer.this.f17101b != null) {
                    C4245j.m17783a(SearchPagerContainer.this.f17102c, SearchPagerContainer.this.f17101b, string, string2);
                }
            }
        };
        C0213m.m882a(this.f17102c).mo695a(this.f17119v, C4129c.m17444i().getBrowser().getIntentFilter());
    }

    /* renamed from: a */
    private void m17640a(View view, C4216b bVar, boolean z) {
        int viewHeight = Utils.getViewHeight(view);
        for (SearchResultFragment next : this.f17105f.getFragmentList()) {
            if (!C4129c.m17439d()) {
                next.setBottomPadding(viewHeight);
            }
            if (next instanceof ContentFragment) {
                ((ContentFragment) next).setContainerFragment(this);
            }
            next.setOnScrollListener(bVar);
            if (z) {
                next.setBackgroundColor(0);
            }
        }
    }

    /* renamed from: a */
    private List<ISearchVertical> m17638a() {
        ArrayList arrayList = new ArrayList();
        for (SearchResultFragment add : this.f17105f.getFragmentList()) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.f17101b != null) {
            bundle.putString("SearchPagerContainer.query", this.f17101b.getQueryString());
        }
    }

    public boolean isClick() {
        return this.f17117t;
    }

    public void setClick(boolean z) {
        this.f17117t = z;
    }

    public C0173s getFragmentManager() {
        return this.f17106g;
    }

    public void setFragmentManager(C0173s sVar) {
        this.f17106g = sVar;
    }

    public void insertSearchResultFragment(int i, SearchResultFragment searchResultFragment) {
    }

    public SearchResultFragment getCurrentFragment() {
        if (this.f17105f.getFragmentList().size() == 0) {
            return null;
        }
        return this.f17105f.getFragmentList().get(getSelectedIndex());
    }

    public int getSelectedIndex() {
        return this.f17104e.getCurrentItem();
    }

    public void loadQuery(SearchQuery searchQuery) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!(!f17100n.mo15878a(currentTimeMillis) || !f17099m.mo15878a(currentTimeMillis) || !f17098a.mo15878a(currentTimeMillis))) {
            loadQuery(searchQuery, true);
            showChrome();
        }
    }

    public void loadQuery(SearchQuery searchQuery, boolean z) {
        if (m17643a(searchQuery)) {
            this.f17108i = "";
            this.f17101b = searchQuery;
            switch (this.f17112o) {
                case ALL:
                    m17641a(searchQuery, z);
                    return;
                case NEIGHBOR:
                    m17645b(searchQuery, z);
                    return;
                default:
                    m17648c(searchQuery, z);
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m17642a(SearchResultFragment searchResultFragment, SearchQuery searchQuery, boolean z) {
        IQueryManager contentManager = searchResultFragment.getContentManager();
        if (contentManager == null) {
            int itemPosition = this.f17105f.getItemPosition(searchResultFragment);
            if (itemPosition != -1) {
                this.f17113p[itemPosition] = true;
                return;
            }
            return;
        }
        contentManager.loadQuery(searchQuery);
        if (!z) {
            SearchQuery searchQuery2 = this.f17101b;
            HashMap hashMap = new HashMap();
            hashMap.put("query", searchQuery2);
            hashMap.put("sch_mthd", "neighbor");
            C4242g.m17773a(980778382, "sch_submit_query", hashMap);
        }
    }

    public void loadQueryUpdate(SearchQuery searchQuery) {
        if (m17643a(searchQuery)) {
            switch (this.f17112o) {
                case NEIGHBOR:
                    m17645b(searchQuery, true);
                    return;
                case CURRENT:
                    m17648c(searchQuery, true);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m17641a(SearchQuery searchQuery, boolean z) {
        if (m17643a(searchQuery)) {
            SearchResultFragment searchResultFragment = (SearchResultFragment) this.f17105f.getItem(this.f17104e.getCurrentItem());
            for (SearchResultFragment next : this.f17105f.getFragmentList()) {
                if (searchResultFragment != null && m17647b(next, searchQuery, z)) {
                    m17642a(next, searchQuery, searchResultFragment.equals(next));
                }
            }
        }
    }

    /* renamed from: b */
    private void m17645b(SearchQuery searchQuery, boolean z) {
        SearchResultFragment searchResultFragment;
        SearchResultFragment searchResultFragment2;
        if (m17643a(searchQuery)) {
            int currentItem = this.f17104e.getCurrentItem();
            int i = currentItem - 1;
            int i2 = currentItem + 1;
            SearchResultFragment searchResultFragment3 = (SearchResultFragment) this.f17105f.getItem(currentItem);
            if (searchResultFragment3 != null && m17647b(searchResultFragment3, searchQuery, z)) {
                m17642a(searchResultFragment3, searchQuery, true);
            }
            if (i >= 0 && (searchResultFragment2 = (SearchResultFragment) this.f17105f.getItem(i)) != null && m17647b(searchResultFragment2, searchQuery, z)) {
                m17642a(searchResultFragment2, searchQuery, false);
            }
            if (i2 < this.f17105f.getCount() && (searchResultFragment = (SearchResultFragment) this.f17105f.getItem(i2)) != null && m17647b(searchResultFragment, searchQuery, z)) {
                m17642a(searchResultFragment, searchQuery, false);
            }
        }
    }

    /* renamed from: c */
    private void m17648c(SearchQuery searchQuery, boolean z) {
        SearchResultFragment searchResultFragment = (SearchResultFragment) this.f17105f.getItem(this.f17104e.getCurrentItem());
        if (searchResultFragment != null && m17647b(searchResultFragment, searchQuery, z)) {
            m17642a(searchResultFragment, searchQuery, true);
        }
    }

    /* renamed from: b */
    private static boolean m17647b(SearchResultFragment searchResultFragment, SearchQuery searchQuery, boolean z) {
        if (searchResultFragment.getContentManager() == null) {
            return true;
        }
        IQueryManager contentManager = searchResultFragment.getContentManager();
        if (!(contentManager instanceof ContentManager)) {
            return true;
        }
        if (((ContentManager) contentManager).getLastQuery() == null) {
            return true;
        }
        if (!C4245j.m17788b(((ContentManager) contentManager).getLastQuery().getQueryString(), searchQuery.getQueryString())) {
            return true;
        }
        return !z;
    }

    /* renamed from: a */
    private boolean m17643a(SearchQuery searchQuery) {
        if (TextUtils.isEmpty(searchQuery.getQueryString())) {
            return false;
        }
        if (C4245j.m17787b(this.f17102c)) {
            return true;
        }
        C4228b.m17752a(this.f17102c);
        return false;
    }

    /* renamed from: a */
    private boolean m17644a(SearchResultFragment searchResultFragment) {
        changeTab(this.f17105f.getFragmentList().indexOf(searchResultFragment));
        return true;
    }

    public boolean showContent(SearchResultFragment searchResultFragment) {
        return m17644a(searchResultFragment);
    }

    public View getHeaderView() {
        return this.f17115r;
    }

    public void setHeaderView(View view) {
        this.f17115r = view;
        this.f17107h.mo15808a(view);
    }

    public View getFooterView() {
        return (View) this.f17114q;
    }

    public void setFooterView(View view) {
        if (!(view instanceof IFooterViewHolder)) {
            throw new IllegalArgumentException(view + " does not implement IFooterViewHolder.");
        }
        this.f17114q = (IFooterViewHolder) view;
        this.f17114q.setTabController(this);
        this.f17107h.mo15812b(view);
    }

    public void showHeader() {
        this.f17115r.setVisibility(0);
    }

    public void hideHeader() {
        this.f17115r.setVisibility(8);
    }

    public void showFooter() {
        getFooterView().setVisibility(0);
    }

    public void hideFooter() {
        getFooterView().setVisibility(8);
    }

    public SearchResultFragment getSearchResultFragment(int i) {
        if (this.f17105f.getFragmentList().size() > i) {
            return this.f17105f.getFragmentList().get(i);
        }
        return null;
    }

    public ISearchContainer.SearchContainerEventListener getSearchContainerEventListener() {
        return this.f17103d;
    }

    public void setSearchContainerEventListener(ISearchContainer.SearchContainerEventListener searchContainerEventListener) {
        this.f17103d = searchContainerEventListener;
    }

    public void showChrome() {
        this.f17107h.mo15811b();
    }

    public void onSearchResultFragmentViewCreated(SearchResultFragment searchResultFragment) {
        int itemPosition = this.f17105f.getItemPosition(searchResultFragment);
        if (this.f17113p[itemPosition]) {
            m17642a(searchResultFragment, this.f17101b, true);
            this.f17113p[itemPosition] = false;
        }
    }

    public void onResponseReceivedForSearchResultFragment(SearchResultFragment searchResultFragment) {
    }

    public void onErrorReceivedForSearchResultFragment(SearchResultFragment searchResultFragment) {
    }

    public void removeSearchResultFragment(SearchResultFragment searchResultFragment) {
        this.f17105f.removeFragment(searchResultFragment);
        this.f17114q.setTabs(m17638a());
        this.f17105f.notifyDataSetChanged();
        m17641a(this.f17101b, true);
    }

    public void onPageSelected(int i) {
        if (this.f17105f != null && this.f17105f.getCount() != 0) {
            if (this.f17101b != null) {
                loadQueryUpdate(this.f17101b);
            }
            m17639a(i);
            if (this.f17109j) {
                m17646b(this.f17105f.getFragmentList().get(i));
            }
        }
    }

    /* renamed from: a */
    private void m17639a(int i) {
        SearchResultFragment searchResultFragment = this.f17105f.getFragmentList().get(i);
        if (this.f17103d != null) {
            this.f17103d.onShowNewContent(searchResultFragment);
        }
        if (this.f17107h.mo15807a() != null) {
            this.f17107h.mo15809a((IScrollable) searchResultFragment);
        }
        this.f17114q.onTabChanged((float) i);
        m17649c(searchResultFragment);
    }

    /* renamed from: b */
    private void m17646b(SearchResultFragment searchResultFragment) {
        String label = searchResultFragment.getLabel(this.f17102c);
        if (!this.f17108i.equals(label) && this.f17101b != null) {
            this.f17108i = label;
            HashMap hashMap = new HashMap();
            hashMap.put("screen_name", searchResultFragment.getVerticalId());
            C4242g.m17773a(980778382, "page_view_classic", hashMap);
        }
    }

    /* renamed from: c */
    private void m17649c(SearchResultFragment searchResultFragment) {
        String label = searchResultFragment.getLabel(this.f17102c);
        HashMap hashMap = new HashMap();
        hashMap.put("target_fragment", label);
        C4243h.m17777a(this.f17102c, "fragment_changed", hashMap);
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.f17114q.onTabChanged(((float) i) + f);
        if (i < this.f17105f.getFragmentList().size() - 1) {
            this.f17105f.getFragmentList().get(i).moveBackgroundWithParallax(i2, true, this.f17102c);
            this.f17105f.getFragmentList().get(i + 1).moveBackgroundWithParallax(Utils.getScreenWidth(this.f17102c) - i2, false, this.f17102c);
        } else if (i > 0) {
            this.f17105f.getFragmentList().get(i - 1).moveBackgroundWithParallax(i2, true, this.f17102c);
            this.f17105f.getFragmentList().get(i).moveBackgroundWithParallax(Utils.getScreenWidth(this.f17102c) - i2, false, this.f17102c);
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public SearchResultFragment getFragment(String str) {
        return this.f17105f.getFragment(str);
    }

    public boolean isFragmentAvailable(String str) {
        return getFragment(str) != null;
    }

    public void showFragmentByName(String str) {
        showFragmentByName(str, true);
    }

    public void showFragmentByName(String str, boolean z) {
        SearchResultFragment fragment = getFragment(str);
        if (fragment != null) {
            m17644a(fragment);
            if (this.f17103d != null) {
                this.f17103d.onShowNewContent(fragment);
            }
        }
    }

    public List<SearchResultFragment> getAllFragments() {
        return this.f17105f.getFragmentList();
    }

    public SearchQuery getQuery() {
        return this.f17101b;
    }

    public void onDestroy() {
        if (this.f17118u != null) {
            C0213m.m882a(this.f17102c).mo694a(this.f17118u);
        }
        if (this.f17119v != null) {
            C0213m.m882a(this.f17102c).mo694a(this.f17119v);
        }
    }

    public void setRefreshMode(RefreshMode refreshMode) {
        this.f17112o = refreshMode;
    }

    public void onStateRestored(ContentPagesAdapter contentPagesAdapter) {
        this.f17114q.setTabs(m17638a());
        m17639a(this.f17104e.getCurrentItem());
        m17640a((View) this.f17114q, this.f17107h, this.f17110k);
        if (this.f17101b != null) {
            loadQuery(this.f17101b);
        }
        if (this.f17103d != null) {
            this.f17103d.onRestoreState(this);
        }
    }

    public void changeTab(int i) {
        this.f17104e.setCurrentItem(i);
        SearchResultFragment searchResultFragment = getSearchResultFragment(i);
        m17646b(searchResultFragment);
        m17649c(searchResultFragment);
    }

    public int getTabType(int i) {
        SearchResultFragment searchResultFragment = getSearchResultFragment(i);
        if (searchResultFragment == null) {
            return -1;
        }
        if (searchResultFragment instanceof ContentFragment) {
            return ((ContentFragment) searchResultFragment).getType();
        }
        return 0;
    }

    public boolean didGetSearchResults() {
        boolean z;
        boolean z2 = false;
        for (SearchResultFragment next : this.f17105f.getFragmentList()) {
            if (!(next instanceof ContentFragment)) {
                z = z2;
            } else if (z2 || ((ContentFragment) next).didGetSearchResults()) {
                z = true;
            } else {
                z = false;
            }
            z2 = z;
        }
        return z2;
    }
}
