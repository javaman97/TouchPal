package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.C4115g;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.LocalData;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.SearchResultData;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import com.yahoo.mobile.client.share.search.data.contentmanager.C4125e;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.p099ui.C4189c;
import com.yahoo.mobile.client.share.search.p099ui.SearchResultWebView;
import com.yahoo.mobile.client.share.search.p099ui.SearchWebViewCallback;
import com.yahoo.mobile.client.share.search.p099ui.activity.ImageGalleryActivity;
import com.yahoo.mobile.client.share.search.p099ui.container.ISearchContainer;
import com.yahoo.mobile.client.share.search.p099ui.scroll.IScrollable;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.settings.C4127a;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.settings.ServerSettings;
import com.yahoo.mobile.client.share.search.util.C4227a;
import com.yahoo.mobile.client.share.search.util.C4228b;
import com.yahoo.mobile.client.share.search.util.C4242g;
import com.yahoo.mobile.client.share.search.util.C4243h;
import com.yahoo.mobile.client.share.search.util.C4245j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.f */
public class C4213f extends ContentFragment implements ContentManager.IContentHandler, SearchWebViewCallback {
    public static final Pattern sBValuePattern = Pattern.compile("[&|\\?]b=(.*?)&");
    public static final Pattern sQueryValuePattern = Pattern.compile("[&|\\?]p=(.*?)&");

    /* renamed from: a */
    protected SearchResultWebView f17232a;

    /* renamed from: i */
    protected C4189c f17233i;

    /* renamed from: j */
    private View f17234j;

    /* renamed from: k */
    private ViewGroup f17235k;

    /* renamed from: l */
    private int f17236l = 0;

    /* renamed from: m */
    private int f17237m;

    /* renamed from: n */
    private int f17238n;

    /* renamed from: o */
    private int f17239o = 1;

    /* renamed from: p */
    private int f17240p = Integer.MIN_VALUE;

    /* renamed from: q */
    private String f17241q;

    /* renamed from: r */
    private boolean f17242r;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17137c = (ViewGroup) layoutInflater.inflate(C4073a.C4083j.yssdk_search_result_web_page, viewGroup, false);
        if (this.f17141g == 0) {
            this.f17137c.setBackgroundColor(this.f17141g);
        }
        return this.f17137c;
    }

    public void setOnScrollListener(IScrollable.OnScrollListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
        if (this.f17232a != null) {
            this.f17232a.setOnScrollListener(onScrollListener);
        }
    }

    public String getLabel(Context context) {
        if (context != null) {
            return context.getResources().getString(C4073a.C4086m.yssdk_web_search);
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17136b = mo15627a();
        this.f17242r = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4125e mo15627a() {
        boolean isFragmentAvailable;
        boolean z = false;
        if (getContainerFragment() == null) {
            isFragmentAvailable = false;
        } else {
            isFragmentAvailable = getContainerFragment().isFragmentAvailable(getResources().getString(C4073a.C4086m.yssdk_image_search));
            z = getContainerFragment().isFragmentAvailable(getResources().getString(C4073a.C4086m.yssdk_video_search));
        }
        return new C4125e(this, getActivity(), isFragmentAvailable, z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f17235k = (ViewGroup) view.findViewById(C4073a.C4081h.content);
        this.f17235k.setVisibility(4);
        this.f17232a = (SearchResultWebView) view.findViewById(C4073a.C4081h.web_search_results);
        this.f17138d = view.findViewById(C4073a.C4081h.spinner_view);
        hideSpinnerView();
        if (this.f17141g == 0) {
            this.f17232a.setBackgroundColor(0);
            this.f17138d.setBackgroundColor(0);
        } else {
            this.f17138d.setBackgroundColor(getResources().getColor(C4073a.C4078e.yssdk_web_gelato_background_color));
        }
        this.f17232a.setOnScrollListener(getOnScrollListener());
        this.f17234j = view.findViewById(C4073a.C4081h.results_error_layout);
        if (this.f17234j != null) {
            this.f17234j.setVisibility(8);
            TextView textView = (TextView) this.f17234j.findViewById(C4073a.C4081h.text_view_results_error_t1);
            if (textView != null) {
                textView.setText(C4073a.C4086m.yssdk_request_error);
            }
        }
        this.f17237m = this.f17140f;
        if (ServerSettings.m17417a() instanceof ServerSettings.C4126a) {
            this.f17238n = getActivity().getResources().getInteger(C4073a.C4082i.top_padding_offset_yhs);
        } else {
            this.f17238n = getActivity().getResources().getInteger(C4073a.C4082i.top_padding_offset);
        }
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            String string = bundle.getString("web_url");
            String string2 = bundle.getString("web_query");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                SearchResultData searchResultData = new SearchResultData(string);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(searchResultData);
                this.f17136b.restoreLastQuery(new SearchQuery(new SearchQuery.Builder().setQueryString(string2)));
                onContentReceived(this.f17136b, new SearchResponseData(arrayList), (SearchQuery) null);
            }
        }
    }

    public void onStart() {
        super.onStart();
        if (this.f17232a != null) {
            this.f17233i = new C4189c(getActivity(), this.f17232a, this);
            this.f17232a.setWebViewClient(this.f17233i);
        }
    }

    public void onHiddenChanged(boolean z) {
    }

    public String getContentProvider(Context context) {
        if (C4127a.m17423e(context)) {
            return "Google";
        }
        return super.getContentProvider(context);
    }

    public void onImageResultsWrapperUrlTapped() {
        HashMap hashMap = new HashMap();
        hashMap.put("target_fragment", getResources().getString(C4073a.C4086m.yssdk_image_search));
        C4243h.m17777a((Context) getActivity(), "switch_fragment", hashMap);
    }

    public void onVideoResultsWrapperUrlTapped() {
        HashMap hashMap = new HashMap();
        hashMap.put("target_fragment", getResources().getString(C4073a.C4086m.yssdk_video_search));
        C4243h.m17777a((Context) getActivity(), "switch_fragment", hashMap);
    }

    public void onSearchResultsNewQueryTapped(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("new_query", str);
        C4243h.m17777a((Context) getActivity(), "replace_query", hashMap);
    }

    public void onProgressChanged(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("progress", new StringBuilder().append(i).toString());
        hashMap.put("target_fragment", getLabel(getActivity()));
        C4243h.m17777a((Context) getActivity(), "search_progress", hashMap);
    }

    public void onPageLoaded(String str, boolean z) {
        hideSpinnerView();
        if (!z) {
            setContentAvailable(true);
            this.f17235k.setVisibility(0);
            this.f17242r = true;
            this.f17236l = m17696b(str);
            String str2 = null;
            Matcher matcher = sQueryValuePattern.matcher(str);
            if (matcher.find()) {
                str2 = matcher.group(1);
            }
            int i = this.f17236l;
            ISearchContainer containerFragment = getContainerFragment();
            if (containerFragment == null || containerFragment.getCurrentFragment() == this) {
                HashMap hashMap = new HashMap();
                hashMap.put("sch_pgnm", Integer.valueOf(i));
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("query", str2);
                }
                C4242g.m17773a(980778527, "sch_show_results", hashMap);
                return;
            }
            setShowResultsPendingTracking(true);
        }
    }

    /* renamed from: b */
    private int m17696b(String str) {
        int i;
        C4189c cVar = this.f17233i;
        if (!C4189c.m17636a(str)) {
            return 1;
        }
        String str2 = null;
        Matcher matcher = sBValuePattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        if (str2 != null) {
            i = Integer.parseInt(str2);
        } else {
            i = Integer.MIN_VALUE;
        }
        if (i == Integer.MIN_VALUE || i == 1) {
            return 1;
        }
        if (i > this.f17239o && this.f17240p == Integer.MIN_VALUE) {
            this.f17240p = i - this.f17239o;
        }
        this.f17239o = i;
        return (this.f17239o / this.f17240p) + 1;
    }

    public void onReceivedTitle(String str) {
    }

    public void onReceivedIcon(Bitmap bitmap) {
    }

    public void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public void showCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public void onHideCustomView() {
    }

    public boolean isCustomViewShowing() {
        return false;
    }

    public void onProgressReceived(ContentManager contentManager, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
        if (contentManager == this.f17136b && searchProgressEnum == SearchCommand.SearchProgressEnum.STARTING) {
            this.f17232a.clearView();
        }
    }

    /* renamed from: a */
    private void m17694a(String str, int i, int i2) {
        if (!C4245j.m17787b(getActivity().getApplicationContext())) {
            C4228b.m17752a((Context) getActivity());
            return;
        }
        showSpinnerView();
        if (getContainerFragment() != null) {
            getContainerFragment().showChrome();
        }
        this.f17232a.mo15541a(str, i, i2, this.f17141g == 0);
    }

    public void onContentReceived(ContentManager contentManager, SearchResponseData searchResponseData, SearchQuery searchQuery) {
        if (contentManager == this.f17136b) {
            showSpinnerView();
            if (this.f17234j != null) {
                this.f17234j.setVisibility(8);
            }
            ArrayList<? extends Object> responseList = searchResponseData.getResponseList();
            if (responseList != null) {
                this.f17241q = ((SearchResultData) responseList.get(0)).getSiteUrl();
                this.f17232a.getSettings().getUserAgentString();
                m17694a(this.f17241q, ((int) Utils.convertPixelsToDp((float) this.f17139e, getActivity())) - this.f17238n, this.f17237m);
            }
        }
    }

    public View getParallaxView() {
        return this.f17137c.findViewById(C4073a.C4081h.web_search_results);
    }

    public void willLoadUrl(String str) {
        showSpinnerView();
        C4243h.m17777a((Context) getActivity(), "change_page", new HashMap());
        this.f17232a.scrollTo(0, 0);
        this.f17235k.setVisibility(4);
        String queryString = this.f17136b.getLastQuery().getQueryString();
        int b = m17696b(str);
        HashMap hashMap = new HashMap();
        hashMap.put("query", queryString);
        hashMap.put("sch_pgnm", Integer.valueOf(b));
        C4242g.m17773a(980778527, "sch_submit_query", hashMap);
        String str2 = TAG;
        new StringBuilder("<URL><WebView>=").append(str);
    }

    public void openUrlOnMinibrowser(String str, Map<String, String> map) {
        m17697c(str);
    }

    public void handleSearchStatus(SearchStatusData searchStatusData) {
        if (getActivity() != null) {
            C4129c.m17428a(searchStatusData);
            switch (searchStatusData.getValidStatus()) {
                case INVALID:
                case REVOKED:
                    mo15736a(getActivity().getResources().getString(C4073a.C4086m.yssdk_invalid_yhs_key));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: c */
    private void m17697c(String str) {
        C4227a.m17749a(getActivity(), str, mo15798b(), "sch_web_screen");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo15798b() {
        return "https://search.yahoo.com/mobile/s?p=" + this.f17136b.getLastQuery().getQueryString();
    }

    public String getVerticalId() {
        return "sch_web_screen";
    }

    public int getType() {
        return 1;
    }

    public void onImageThumbmailTapped(String str, PhotoData photoData) {
        if (getActivity() == null) {
            return;
        }
        if (C4127a.m17422d(getActivity())) {
            C4245j.m17783a(getActivity(), (SearchQuery) this.f17136b.getLastQuery(), photoData.getEscapedThumbnailUrl(), photoData.getTitle());
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(photoData);
            getActivity().startActivity(ImageGalleryActivity.getIntent(getActivity(), str, 0, arrayList, 0, (SearchQuery) null, (String) null, 6, false, false));
            return;
        }
        String sourceUrl = photoData.getSourceUrl();
        String origPhotoUrl = photoData.getOrigPhotoUrl();
        int imgPos = photoData.getImgPos();
        HashMap hashMap = new HashMap();
        hashMap.put("sch_url", origPhotoUrl);
        hashMap.put("sch_type", "image result");
        hashMap.put("sch_pos", Integer.valueOf(imgPos));
        C4242g.m17773a(980778527, "sch_select_action", hashMap);
        C4227a.m17749a(getActivity(), sourceUrl, mo15798b(), "sch_web_screen");
    }

    public void onLocalResutTapped(String str, LocalData localData) {
        m17697c(localData.getSourceUrl());
    }

    /* renamed from: a */
    private static void m17695a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("sch_url", str);
        hashMap.put("sch_type", str2);
        hashMap.put("sch_pos", str3);
        C4242g.m17773a(980778527, "sch_select_action", hashMap);
    }

    public void onSearchResultsRequeryTapped(Map<String, String> map) {
        SearchQuery.Builder builder;
        SearchQuery.Builder builder2 = new SearchQuery.Builder();
        if (getContentManager() == null || this.f17136b.getLastQuery() == null) {
            builder = builder2;
        } else {
            builder = new SearchQuery.Builder((SearchQuery) this.f17136b.getLastQuery());
        }
        if (map.containsKey("p")) {
            HashMap hashMap = new HashMap();
            if (map.containsKey("fr2")) {
                builder.setQueryString(map.get("p"));
                hashMap.put("fr2", map.get("fr2"));
            } else {
                builder.setQueryString("+" + map.get("p"));
                map.remove("p");
            }
            if (map.containsKey("b")) {
                hashMap.put("b", map.get("b"));
            }
            if (map.containsKey("norw")) {
                hashMap.put("norw", map.get("norw"));
            }
            SearchQuery searchQuery = new SearchQuery(builder);
            C4115g.C4116a aVar = C4115g.f16624a;
            this.f17241q = C4115g.C4116a.m17390a(getActivity(), searchQuery, hashMap).toString();
            if (this.f17234j != null) {
                this.f17234j.setVisibility(8);
            }
            m17694a(this.f17241q, ((int) Utils.convertPixelsToDp((float) this.f17139e, getActivity())) - this.f17238n, this.f17237m);
            String str = TAG;
            new StringBuilder("<URL><Requery>=").append(this.f17241q);
        }
    }

    public int getScrollY() {
        if (this.f17232a == null) {
            return 0;
        }
        return this.f17232a.getScrollY();
    }

    public void onUrlLoaded(String str, Map<String, Object> map) {
        if (map != null && map.containsKey("sch_type")) {
            String str2 = (String) map.get("sch_type");
            String str3 = "";
            if (str2.equals("web result")) {
                if (map.containsKey("sch_pos")) {
                    str3 = (String) map.get("sch_pos");
                }
                m17695a(str, str2, str3);
            } else if (str2.equals("ov-top") || str2.equals("ov-bottom")) {
                if (map.containsKey("sch_pos")) {
                    str3 = (String) map.get("sch_pos");
                }
                m17695a(str, str2, str3);
            }
        }
    }

    public void onDestroy() {
        this.f17232a.getSettings().setJavaScriptEnabled(false);
        super.onDestroy();
    }

    public void onContentError(ContentManager contentManager, SearchError searchError, SearchQuery searchQuery) {
        if (this.f17234j != null) {
            this.f17235k.setVisibility(4);
            this.f17234j.setVisibility(0);
            TextView textView = (TextView) this.f17234j.findViewById(C4073a.C4081h.text_view_results_error_t1);
            if (textView != null) {
                textView.setText(C4073a.C4086m.yssdk_search_status_error);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("web_url", this.f17232a.getUrl());
        if (this.f17136b.getLastQuery() != null) {
            bundle.putString("web_query", this.f17136b.getLastQuery().getQueryString());
        }
    }

    public boolean didGetSearchResults() {
        return this.f17242r;
    }
}
