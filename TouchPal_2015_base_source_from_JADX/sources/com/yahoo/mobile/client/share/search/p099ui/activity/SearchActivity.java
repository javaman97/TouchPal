package com.yahoo.mobile.client.share.search.p099ui.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.os.Bundle;
import android.support.p001v4.app.C0036E;
import android.support.p001v4.app.C0167o;
import android.support.p001v4.app.C0173s;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.content.C0213m;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.cootek.smartinput5.net.C2225al;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.commands.SearchHistoryCommand;
import com.yahoo.mobile.client.share.search.commands.SearchStatusCommand;
import com.yahoo.mobile.client.share.search.controllers.VoiceController;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.interfaces.Export;
import com.yahoo.mobile.client.share.search.p098c.C4094b;
import com.yahoo.mobile.client.share.search.p098c.C4095c;
import com.yahoo.mobile.client.share.search.p099ui.ISearchBox;
import com.yahoo.mobile.client.share.search.p099ui.SearchBarView;
import com.yahoo.mobile.client.share.search.p099ui.container.SearchBoxManager;
import com.yahoo.mobile.client.share.search.p099ui.container.SearchPagerContainer;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.C4202a;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.C4207b;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.C4210e;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.C4213f;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.SearchResultFragment;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.SearchSuggestContentFragment;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.settings.SearchSDKSettings;
import com.yahoo.mobile.client.share.search.suggest.C4132a;
import com.yahoo.mobile.client.share.search.suggest.ISuggestContainer;
import com.yahoo.mobile.client.share.search.util.C4228b;
import com.yahoo.mobile.client.share.search.util.C4238d;
import com.yahoo.mobile.client.share.search.util.C4242g;
import com.yahoo.mobile.client.share.search.util.C4245j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Export
/* renamed from: com.yahoo.mobile.client.share.search.ui.activity.SearchActivity */
public class SearchActivity extends C0167o implements SearchBoxManager.SearchBoxManagerListener {
    public static final String FOOTER_RESOURCE_KEY = "footer_resource";
    public static final String HEADER_RESOURCE_KEY = "header_resource";
    public static final String INITIAL_TAB_INDEX = "initial_tab_index";
    public static final String LAUNCH_TO_SUGGEST = "launch_to_suggest";
    public static final String LOCAL_HISTORY_NUM = "local_history_num";
    public static final String MARGIN_TOP = "margin_top";
    public static final String QUERY_STRING = "query_string";
    public static final String SUCCESSFUL_SEARCH_MADE = "successful_search_made";
    public static final String SUGGEST_APPS = "apps";
    public static final String SUGGEST_CONTACTS = "contacts";
    public static final String TAB_ARGUMENTS_KEY = "tab_arg";
    public static final String TAB_CLASS_NAME_KEY = "tab_class";
    public static final String TAB_CLASS_NAME_LIST = "tab_class_list";
    public static final String THEME_RESOURCE_KEY = "theme_resource";
    public static final String TRANS_BACKGROUND = "transparent_background";
    public static final String TRENDING_CATEGORY = "trending_category";

    /* renamed from: a */
    protected String f17002a;

    /* renamed from: b */
    protected SearchBarView f17003b;

    /* renamed from: c */
    protected C4182a f17004c;

    /* renamed from: d */
    protected SearchBoxManager f17005d;

    /* renamed from: e */
    protected ViewGroup f17006e;

    /* renamed from: f */
    protected SearchPagerContainer f17007f;

    /* renamed from: g */
    protected ViewGroup f17008g;

    /* renamed from: h */
    protected View f17009h;

    /* renamed from: i */
    protected ViewGroup f17010i;

    /* renamed from: j */
    protected BroadcastReceiver f17011j;

    /* renamed from: k */
    protected View.OnClickListener f17012k;

    /* renamed from: l */
    protected SearchBarView.BackPressedListener f17013l;

    /* renamed from: m */
    protected boolean f17014m = true;

    /* renamed from: com.yahoo.mobile.client.share.search.ui.activity.SearchActivity$a */
    public static class C4182a extends SearchSuggestContentFragment {

        /* renamed from: a */
        public List<ISuggestContainer> f17035a;

        /* renamed from: a */
        public static C4182a m17608a(int i) {
            C4182a aVar = new C4182a();
            Bundle bundle = new Bundle();
            bundle.putInt("local_history", i);
            aVar.setArguments(bundle);
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final List<ISuggestContainer> mo15627a() {
            List<ISuggestContainer> a = super.mo15627a();
            if (this.f17035a != null) {
                a.addAll(0, this.f17035a);
            }
            return a;
        }
    }

    /* renamed from: com.yahoo.mobile.client.share.search.ui.activity.SearchActivity$IntentBuilder */
    public static class IntentBuilder {

        /* renamed from: a */
        private static String f17020a = "SearchActivity.IntentBuilder";

        /* renamed from: b */
        private int f17021b = C4073a.C4083j.yssdk_searchview_holder;

        /* renamed from: c */
        private int f17022c = C4073a.C4083j.yssdk_search_pager_tabs_v3;

        /* renamed from: d */
        private int f17023d = 0;

        /* renamed from: e */
        private boolean f17024e = false;

        /* renamed from: f */
        private boolean f17025f = false;

        /* renamed from: g */
        private boolean f17026g = false;

        /* renamed from: h */
        private boolean f17027h = false;

        /* renamed from: i */
        private String f17028i = null;

        /* renamed from: j */
        private int f17029j = -1;

        /* renamed from: k */
        private ArrayList<Bundle> f17030k = new ArrayList<>();

        /* renamed from: l */
        private int f17031l = 0;

        /* renamed from: m */
        private int f17032m = 0;

        /* renamed from: n */
        private String f17033n = TrendingSearchEnum.DEFAULT.toString();

        /* renamed from: o */
        private int f17034o = 3;

        public IntentBuilder setCustomTheme(int i) {
            this.f17023d = i;
            this.f17024e = true;
            return this;
        }

        public IntentBuilder setCustomHeader(int i) {
            this.f17021b = i;
            return this;
        }

        public IntentBuilder setCustomFooter(int i) {
            this.f17022c = i;
            return this;
        }

        public IntentBuilder setMarginTop(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Margin top value can not be negative: " + i);
            }
            this.f17032m = i;
            return this;
        }

        public IntentBuilder showAppSuggestions(boolean z) {
            this.f17025f = z;
            return this;
        }

        public IntentBuilder showContactSuggestions(boolean z) {
            this.f17026g = z;
            return this;
        }

        public IntentBuilder showTransparentBackground(boolean z) {
            this.f17027h = z;
            return this;
        }

        public IntentBuilder setNumberOfHistoryItems(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Number of history items should be nonnegative");
            }
            this.f17034o = i;
            return this;
        }

        public IntentBuilder setQueryString(String str) {
            this.f17028i = str;
            return this;
        }

        public IntentBuilder launchSuggestions(boolean z) {
            if (z) {
                this.f17029j = 1;
            } else {
                this.f17029j = 0;
            }
            return this;
        }

        public IntentBuilder addVertical(String str, Bundle bundle) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Vertical classname is not valid: " + str);
            } else if (this.f17030k.size() == SearchPagerContainer.MAX_NUMBER_VERTICALS) {
                throw new RuntimeException("Can not add more verticals. Max number of verticals (" + SearchPagerContainer.MAX_NUMBER_VERTICALS + " reached");
            } else if (!C4207b.m17680a(str) || !m17606a(str)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(SearchActivity.TAB_CLASS_NAME_KEY, str);
                bundle2.putBundle(SearchActivity.TAB_ARGUMENTS_KEY, bundle);
                this.f17030k.add(bundle2);
                return this;
            } else {
                throw new IllegalArgumentException("Duplicated Yahoo verticals are not allowed: " + str);
            }
        }

        /* renamed from: a */
        private boolean m17606a(String str) {
            Iterator<Bundle> it = this.f17030k.iterator();
            while (it.hasNext()) {
                if (it.next().getString(SearchActivity.TAB_CLASS_NAME_KEY).equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public IntentBuilder addWebVertical() {
            return addVertical(C4213f.class.getName(), new Bundle());
        }

        public IntentBuilder addImageVertical() {
            return addVertical(C4202a.class.getName(), new Bundle());
        }

        public IntentBuilder addVideoVertical() {
            return addVertical(C4210e.class.getName(), new Bundle());
        }

        public IntentBuilder setInitialVerticalIndex(int i) {
            if (i >= 0) {
                this.f17031l = i;
            }
            return this;
        }

        public IntentBuilder setTrendingCategory(TrendingSearchEnum trendingSearchEnum) {
            this.f17033n = trendingSearchEnum.toString();
            return this;
        }

        public Intent buildIntent(Context context) {
            boolean z = true;
            Intent a = mo15609a(context);
            if (this.f17024e) {
                a.putExtra(SearchActivity.THEME_RESOURCE_KEY, this.f17023d);
            }
            a.putExtra(SearchActivity.HEADER_RESOURCE_KEY, this.f17021b);
            a.putExtra(SearchActivity.FOOTER_RESOURCE_KEY, this.f17022c);
            a.putExtra(SearchActivity.SUGGEST_APPS, this.f17025f);
            a.putExtra(SearchActivity.SUGGEST_CONTACTS, this.f17026g);
            a.putExtra(SearchActivity.TRENDING_CATEGORY, this.f17033n);
            a.putExtra(SearchActivity.MARGIN_TOP, this.f17032m);
            a.putExtra(SearchActivity.TRANS_BACKGROUND, this.f17027h);
            a.putExtra(SearchActivity.LOCAL_HISTORY_NUM, this.f17034o);
            if (this.f17028i != null) {
                a.putExtra(SearchActivity.QUERY_STRING, this.f17028i);
            }
            if (this.f17029j != -1) {
                if (this.f17029j != 1) {
                    z = false;
                }
                a.putExtra(SearchActivity.LAUNCH_TO_SUGGEST, z);
            }
            if (this.f17030k != null && this.f17030k.size() > 0) {
                a.putParcelableArrayListExtra(SearchActivity.TAB_CLASS_NAME_LIST, this.f17030k);
            }
            a.putExtra(SearchActivity.INITIAL_TAB_INDEX, this.f17031l);
            return a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Intent mo15609a(Context context) {
            return new Intent(context, SearchActivity.class);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z;
        C4129c.m17435b();
        if (getIntent().hasExtra(THEME_RESOURCE_KEY)) {
            setTheme(getIntent().getIntExtra(THEME_RESOURCE_KEY, 16974064));
        }
        super.onCreate(bundle);
        mo15596a();
        setContentView(C4073a.C4083j.yssdk_search_activity);
        int intExtra = getIntent().getIntExtra(MARGIN_TOP, 0);
        if (intExtra < 0) {
            throw new IllegalArgumentException("Margin top value can not be negative: " + intExtra);
        }
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        if (point.y <= intExtra) {
            throw new IllegalArgumentException("Margin top value can not be bigger than the screen height: " + intExtra);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(C4073a.C4081h.search_activity_root_layout);
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(layoutParams.leftMargin, intExtra + layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
            viewGroup.setLayoutParams(layoutParams);
        }
        this.f17010i = (ViewGroup) findViewById(C4073a.C4081h.search_results_container);
        this.f17008g = (ViewGroup) findViewById(C4073a.C4081h.search_pager);
        this.f17003b = (SearchBarView) findViewById(C4073a.C4081h.search_panel);
        this.f17003b.mo15493a(getIntent().getIntExtra(HEADER_RESOURCE_KEY, C4073a.C4083j.yssdk_searchview_holder));
        this.f17009h = ((LayoutInflater) getSystemService("layout_inflater")).inflate(getIntent().getIntExtra(FOOTER_RESOURCE_KEY, C4073a.C4083j.yssdk_search_pager_tabs_v3), this.f17010i, false);
        this.f17010i.addView(this.f17009h);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(C4073a.C4081h.search_bar_container);
        mo15597a(viewGroup2, bundle);
        this.f17006e = (ViewGroup) findViewById(C4073a.C4081h.search_suggestion_container);
        this.f17012k = new View.OnClickListener() {
            public final void onClick(View view) {
                SearchActivity.this.mo15603g();
            }
        };
        this.f17013l = new SearchBarView.BackPressedListener() {
            public final void onBackPressed() {
                SearchActivity.this.mo15603g();
            }
        };
        C0173s supportFragmentManager = getSupportFragmentManager();
        if (bundle == null) {
            this.f17004c = C4182a.m17608a(getIntent().getIntExtra(LOCAL_HISTORY_NUM, 3));
            C0036E a = supportFragmentManager.mo542a();
            a.mo35a(C4073a.C4081h.search_suggestion_container, (Fragment) this.f17004c);
            a.mo53h();
            supportFragmentManager.mo557c();
        } else {
            this.f17004c = (C4182a) supportFragmentManager.mo544a(C4073a.C4081h.search_suggestion_container);
        }
        this.f17004c.f17035a = mo15598b();
        this.f17005d = new SearchBoxManager(this) {
            public final void onFocusChange(ISearchBox iSearchBox, boolean z) {
                super.onFocusChange(iSearchBox, z);
                if (!z && SearchActivity.this.f17005d != null && SearchActivity.this.f17005d.getQuery() != null) {
                    SearchActivity.this.f17003b.hideKeyboard();
                }
            }
        };
        this.f17005d.setListener(this);
        this.f17005d.setSearchBoxContainer(viewGroup2);
        this.f17005d.setSearchBox(this.f17003b);
        this.f17005d.setSearchSuggestionContainer(this.f17006e);
        this.f17005d.setSearchSuggest(this.f17004c);
        this.f17005d.setSearchContainer(this.f17007f);
        this.f17003b.mo15494a(this.f17012k);
        this.f17003b.mo15496a(this.f17013l);
        this.f17011j = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                new StringBuilder("Received Intent: ").append(intent.toString());
                Bundle extras = intent.getExtras();
                String string = extras.getString("view_content");
                Map map = (Map) extras.getSerializable("properties");
                if (string != null) {
                    new StringBuilder("Received message: ").append(string).append(" with properties = ").append(map);
                    if (string.equalsIgnoreCase("change_query") && SearchActivity.this.f17005d != null) {
                        String str = (String) map.get("original_query");
                        StringBuffer stringBuffer = new StringBuffer(SearchActivity.this.f17005d.getQuery().getQueryString());
                        int indexOf = stringBuffer.indexOf(str);
                        stringBuffer.replace(indexOf, str.length() + indexOf, (String) map.get("new_query"));
                        SearchActivity.this.f17005d.addTextToSearchBox(stringBuffer.toString());
                        SearchActivity.this.f17005d.getSearchBox().submitQuery();
                    } else if (string.equalsIgnoreCase("replace_query") && SearchActivity.this.f17005d != null) {
                        SearchActivity.this.f17005d.addTextToSearchBox((String) map.get("new_query"));
                        SearchActivity.this.f17005d.getSearchBox().submitQuery();
                    }
                }
            }
        };
        if (bundle == null || !bundle.containsKey(QUERY_STRING)) {
            z = false;
        } else {
            this.f17002a = bundle.getString(QUERY_STRING);
            this.f17008g.setVisibility(0);
            this.f17009h.setVisibility(0);
            this.f17006e.setVisibility(8);
            this.f17005d.restoreQuery(this.f17002a);
            z = true;
        }
        if (!z) {
            m17596a(getIntent());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15596a() {
        if (C4129c.m17454s()) {
            C4228b.m17755b(getApplicationContext());
        }
        C4238d.m17763a(getApplicationContext());
        if (C4129c.m17455t()) {
            new SearchStatusCommand(getApplicationContext(), SearchQuery.EMPTY_SEARCH_QUERY).executeCommand();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m17596a(intent);
        if (!intent.hasExtra(QUERY_STRING)) {
            this.f17005d.addTextToSearchBox("", true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<ISuggestContainer> mo15598b() {
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra(SUGGEST_CONTACTS, false);
        boolean booleanExtra2 = intent.getBooleanExtra(SUGGEST_APPS, false);
        if (!booleanExtra && !booleanExtra2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (booleanExtra2) {
            arrayList.add(new C4132a(this));
        }
        if (!booleanExtra) {
            return arrayList;
        }
        arrayList.add(new C4094b(this, new C4095c(this)));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15597a(ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        if (!getResources().getConfiguration().locale.toString().equals(bundle != null ? bundle.getString(C2225al.f9400k) : null)) {
            bundle2 = null;
        } else {
            bundle2 = bundle;
        }
        if (this.f17007f == null) {
            this.f17007f = new SearchPagerContainer(this, bundle2, getSupportFragmentManager(), this.f17010i, this.f17009h, mo15600d(), mo15601e(), getIntent().getBooleanExtra(TRANS_BACKGROUND, false));
            this.f17007f.setHeaderView(viewGroup);
            this.f17008g.setVisibility(4);
            this.f17009h.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (this.f17003b != null && this.f17014m) {
            this.f17003b.setFocus();
        }
        if (bundle != null) {
            String string = bundle.getString(C2225al.f9400k);
            String string2 = bundle.getString(TAB_CLASS_NAME_KEY);
            if (!getResources().getConfiguration().locale.toString().equals(string)) {
                if (string2.equalsIgnoreCase(C4213f.class.getName())) {
                    this.f17007f.showFragmentByName(getResources().getString(C4073a.C4086m.yssdk_web_search), false);
                } else if (string2.equalsIgnoreCase(C4202a.class.getName())) {
                    this.f17007f.showFragmentByName(getResources().getString(C4073a.C4086m.yssdk_image_search), false);
                } else if (string2.equalsIgnoreCase(C4210e.class.getName())) {
                    this.f17007f.showFragmentByName(getResources().getString(C4073a.C4086m.yssdk_video_search), false);
                }
                m17597a(this.f17002a);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C4242g.m17774a((Context) this);
        if (!C4245j.m17787b(getApplicationContext())) {
            C4228b.m17752a((Context) this);
        }
        C0213m.m882a(getApplicationContext()).mo695a(this.f17011j, new IntentFilter("LocalBroadcast"));
        if (this.f17004c != null) {
            this.f17004c.loadPreQuery(this.f17003b.getQuery());
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C4242g.m17775b(this);
        C0213m.m882a(getApplicationContext()).mo694a(this.f17011j);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C4129c.m17444i().getInstrument().activityOnStart(this);
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C4129c.m17444i().getInstrument().activityOnStop(this);
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        VoiceController a;
        if (!(this.f17003b == null || (a = this.f17003b.mo15492a()) == null)) {
            a.destroyVoiceRecognizer();
        }
        SearchSDKSettings.getFactory().getImageLoader(this).clearCache();
        super.onDestroy();
    }

    public void finish() {
        mo15599c();
        super.finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15599c() {
        Intent intent = new Intent();
        boolean z = false;
        if (this.f17007f != null) {
            z = this.f17007f.didGetSearchResults();
        }
        intent.putExtra(SUCCESSFUL_SEARCH_MADE, z);
        setResult(-1, intent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = getIntent().getParcelableArrayListExtra(TAB_CLASS_NAME_LIST);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.os.Bundle> mo15600d() {
        /*
            r3 = this;
            java.util.List r1 = r3.mo15602f()
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r2 = "tab_class_list"
            boolean r0 = r0.hasExtra(r2)
            if (r0 == 0) goto L_0x0023
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r2 = "tab_class_list"
            java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r2)
            if (r0 == 0) goto L_0x0023
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0023
        L_0x0022:
            return r0
        L_0x0023:
            r0 = r1
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity.mo15600d():java.util.List");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo15601e() {
        return getIntent().getIntExtra(INITIAL_TAB_INDEX, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public List<Bundle> mo15602f() {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        bundle.putString(TAB_CLASS_NAME_KEY, C4213f.class.getName());
        arrayList.add(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString(TAB_CLASS_NAME_KEY, C4202a.class.getName());
        arrayList.add(bundle2);
        Bundle bundle3 = new Bundle();
        bundle3.putString(TAB_CLASS_NAME_KEY, C4210e.class.getName());
        arrayList.add(bundle3);
        return arrayList;
    }

    public void onSearchBoxFocusChange(boolean z) {
    }

    public void onQuerySubmitted(SearchBoxManager searchBoxManager, SearchQuery searchQuery) {
        if (C4129c.m17440e()) {
            switch (searchQuery.getAction()) {
                case REQUERY:
                case SUGGESTION:
                case MANUAL:
                case VOICE:
                    new SearchHistoryCommand(getApplicationContext(), searchQuery, SearchHistoryCommand.SearchHistoryActionEnum.ADD_S).executeCommand();
                    break;
            }
        }
        if (this.f17004c != null) {
            this.f17004c.onQuerySubmitted(searchQuery);
        }
        this.f17008g.setVisibility(0);
        this.f17009h.setVisibility(0);
        this.f17006e.setVisibility(8);
        this.f17007f.loadQuery(searchQuery);
    }

    /* renamed from: a */
    private boolean m17596a(Intent intent) {
        if (intent != null) {
            if (intent.hasExtra(QUERY_STRING)) {
                this.f17014m = intent.getBooleanExtra(LAUNCH_TO_SUGGEST, false);
                if (!this.f17014m) {
                    this.f17002a = intent.getStringExtra(QUERY_STRING);
                    m17597a(this.f17002a);
                    this.f17006e.setVisibility(8);
                } else {
                    this.f17005d.addTextToSearchBox(intent.getStringExtra(QUERY_STRING), true);
                }
            } else {
                this.f17014m = intent.getBooleanExtra(LAUNCH_TO_SUGGEST, true);
                if (!this.f17014m) {
                    this.f17006e.setVisibility(8);
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f17007f.onSaveInstanceState(bundle);
        bundle.putString(C2225al.f9400k, getResources().getConfiguration().locale.toString());
        SearchQuery query = this.f17005d.getQuery();
        if (query != null && !TextUtils.isEmpty(query.getQueryString())) {
            bundle.putString(QUERY_STRING, query.getQueryString());
        }
        SearchResultFragment currentFragment = this.f17007f.getCurrentFragment();
        if (currentFragment != null) {
            bundle.putString(TAB_CLASS_NAME_KEY, currentFragment.getClass().getName());
        }
    }

    /* renamed from: a */
    private boolean m17597a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f17005d.addTextToSearchBox(str);
        this.f17005d.getSearchBox().submitQuery(SearchQuery.SearchQueryAction.RESTORED);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo15603g() {
        if (this.f17005d != null && this.f17005d.hasFocus()) {
            if (this.f17003b != null) {
                this.f17003b.hideKeyboard();
            }
            if (this.f17005d.getQuery() != null) {
                this.f17005d.onCancelPressed(this.f17003b);
                return;
            }
        }
        finish();
    }
}
