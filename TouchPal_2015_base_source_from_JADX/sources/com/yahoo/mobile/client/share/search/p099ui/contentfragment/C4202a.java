package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p001v4.content.C0213m;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Settings;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.C4104a;
import com.yahoo.mobile.client.share.search.commands.C4107c;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.MetaData;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.contentmanager.C4121a;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.data.contentmanager.IListViewAdapterHandler;
import com.yahoo.mobile.client.share.search.p099ui.activity.ImageGalleryActivity;
import com.yahoo.mobile.client.share.search.p099ui.container.ISearchContainer;
import com.yahoo.mobile.client.share.search.p099ui.scroll.C4215a;
import com.yahoo.mobile.client.share.search.p099ui.scroll.IScrollable;
import com.yahoo.mobile.client.share.search.p099ui.view.justifiedview.C4224c;
import com.yahoo.mobile.client.share.search.settings.C4127a;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.C4227a;
import com.yahoo.mobile.client.share.search.util.C4242g;
import com.yahoo.mobile.client.share.search.util.C4243h;
import com.yahoo.mobile.client.share.search.util.C4245j;
import com.yahoo.mobile.client.share.search.util.C4248m;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.a */
public class C4202a extends ContentFragment implements AbsListView.OnScrollListener, IListViewAdapterHandler {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final int f17190q = (C4248m.f17353h ? Settings.DRAWER_GUIDE_POINT_SHOWED : 0);

    /* renamed from: a */
    protected String f17191a;

    /* renamed from: i */
    protected View f17192i;

    /* renamed from: j */
    protected View f17193j;

    /* renamed from: k */
    protected ListView f17194k;

    /* renamed from: l */
    protected C4224c f17195l;

    /* renamed from: m */
    protected MetaData f17196m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public View f17197n;

    /* renamed from: o */
    private FrameLayout f17198o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C4215a f17199p;

    /* renamed from: r */
    private boolean f17200r = false;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f17201s;

    /* renamed from: t */
    private int f17202t = 0;

    /* renamed from: u */
    private BroadcastReceiver f17203u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public View.OnClickListener f17204v = new View.OnClickListener() {
        public final void onClick(View view) {
            int intValue;
            Object tag = view.getTag();
            if ((tag instanceof Integer) && (intValue = ((Integer) tag).intValue()) >= 0 && intValue < C4202a.this.f17195l.mo15856d()) {
                PhotoData photoData = C4202a.this.f17195l.mo15854b().get(intValue);
                C4202a aVar = C4202a.this;
                C4202a.m17668a(photoData.getEscapedPhotoUrl(), photoData.getImgPos());
                C4202a.this.mo15781a(photoData);
                C4245j.m17783a(C4202a.this.getActivity(), (SearchQuery) C4202a.this.f17136b.getLastQuery(), photoData.getEscapedThumbnailUrl(), photoData.getTitle());
            }
        }
    };

    /* renamed from: a */
    static /* synthetic */ void m17668a(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("sch_url", str);
        hashMap.put("sch_type", "image result");
        hashMap.put("sch_pos", Integer.valueOf(i + 1));
        C4242g.m17773a(980778377, "sch_select_action", hashMap);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17136b = new C4121a(this, getActivity());
        this.f17201s = false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17137c = (ViewGroup) layoutInflater.inflate(C4073a.C4083j.yssdk_image_list_justified, viewGroup, false);
        this.f17192i = layoutInflater.inflate(C4073a.C4083j.yssdk_padding_cell, (ViewGroup) null);
        this.f17193j = layoutInflater.inflate(C4073a.C4083j.yssdk_bing_attribution_footer, (ViewGroup) null);
        ((TextView) this.f17193j.findViewById(C4073a.C4081h.copy_right_message)).setText(Html.fromHtml(getResources().getString(C4073a.C4086m.common_powered_by_bing)));
        this.f17138d = this.f17137c.findViewById(C4073a.C4081h.spinner_view);
        hideSpinnerView();
        this.f17137c.requestFocus();
        return this.f17137c;
    }

    public void setOnScrollListener(IScrollable.OnScrollListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
        if (this.f17199p != null) {
            this.f17199p.setOnScrollListener(onScrollListener);
        }
    }

    public String getLabel(Context context) {
        if (context != null) {
            return context.getResources().getString(C4073a.C4086m.yssdk_image_search);
        }
        return null;
    }

    @SuppressFBWarnings({"BC_UNCONFIRMED_CAST"})
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f17194k != null) {
            this.f17194k = null;
        }
        this.f17198o = (FrameLayout) view;
        this.f17194k = (ListView) view.findViewById(C4073a.C4081h.image_list_justified);
        View view2 = this.f17192i;
        this.f17194k.addHeaderView(view2);
        View findViewById = view2.findViewById(C4073a.C4081h.padding_cell_view);
        if (findViewById != null) {
            findViewById.getLayoutParams().height = this.f17139e;
        }
        View view3 = this.f17193j;
        view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), this.f17140f);
        if (getActivity() != null && C4127a.m17419a(getActivity().getApplicationContext(), 2)) {
            this.f17194k.addFooterView(view3);
        }
        this.f17199p = new C4215a(this.f17194k);
        this.f17194k.setOnScrollListener(this);
        this.f17199p.setOnScrollListener(getOnScrollListener());
        this.f17197n = View.inflate(getActivity(), C4073a.C4083j.yssdk_result_error_message, (ViewGroup) null);
        this.f17197n.setVisibility(8);
        this.f17198o.addView(this.f17197n);
        if (this.f17141g == 0) {
            this.f17138d.setBackgroundColor(0);
        }
        if (bundle != null) {
            String string = bundle.getString("image_query_key");
            int i = bundle.getInt("image_page_num", 1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("image_data_list");
            this.f17196m = (MetaData) bundle.getParcelable("meta_data");
            if (parcelableArrayList != null && parcelableArrayList.size() > 0) {
                SearchQuery searchQuery = new SearchQuery(new SearchQuery.Builder().setQueryString(string));
                this.f17136b.restoreLastQuery(searchQuery);
                onContentReceived(this.f17136b, new SearchResponseData(this.f17196m, parcelableArrayList), searchQuery);
                this.f17202t = i;
                hideSpinnerView();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("image_page_num", this.f17202t);
        bundle.putParcelable("meta_data", this.f17196m);
        if (this.f17195l != null) {
            SearchQuery a = this.f17195l.mo15851a();
            if (a != null) {
                bundle.putString("image_query_key", a.getQueryString());
            }
            ArrayList<PhotoData> b = this.f17195l.mo15854b();
            if (b != null) {
                bundle.putParcelableArrayList("image_data_list", b);
            }
        }
        if (this.f17194k != null) {
            bundle.putInt("image_offset", this.f17194k.getFirstVisiblePosition());
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null && this.f17194k != null && bundle.containsKey("mJustifiedList")) {
            this.f17194k.onRestoreInstanceState(bundle.getParcelable("mJustifiedList"));
            this.f17194k.invalidate();
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f17203u = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                Bundle extras = intent.getExtras();
                String string = extras.getString("view_content");
                HashMap hashMap = (HashMap) extras.getSerializable("properties");
                if (string != null && hashMap != null && C4202a.this.f17195l != null && string.equalsIgnoreCase("update_image_current_index")) {
                    int a = C4202a.this.f17195l.mo15847a(((Integer) hashMap.get("current_index")).intValue());
                    C4202a.this.f17194k.setSelection(a);
                    C4202a.this.f17199p.mo15804a(C4202a.this.f17194k, a, C4202a.this.f17195l.getCount());
                }
            }
        };
        C0213m.m882a((Context) getActivity()).mo695a(this.f17203u, new IntentFilter("LocalBroadcast"));
    }

    public void onDetach() {
        if (this.f17203u != null) {
            C0213m.m882a((Context) getActivity()).mo694a(this.f17203u);
        }
        super.onDetach();
    }

    public void onHiddenChanged(boolean z) {
        if (!z && this.f17194k != null) {
            this.f17194k.requestFocus();
        }
    }

    public String getContentProvider(Context context) {
        if (C4127a.m17424f(context)) {
            return "Flickr";
        }
        return super.getContentProvider(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15781a(PhotoData photoData) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList<PhotoData> arrayList;
        int i5;
        int i6 = 0;
        if (photoData != null) {
            ArrayList<PhotoData> b = this.f17195l.mo15854b();
            if (!b.isEmpty()) {
                String str = "https://images.search.yahoo.com/search/images?p=" + this.f17136b.getLastQuery().getQueryString();
                String beaconViewUrl = photoData.getBeaconViewUrl();
                if (!TextUtils.isEmpty(beaconViewUrl) && C4129c.m17448m()) {
                    new C4104a(getActivity().getApplicationContext(), Uri.parse(beaconViewUrl)).executeCommand();
                }
                if (C4127a.m17422d(getActivity())) {
                    int indexOf = b.indexOf(photoData);
                    if (C4248m.f17353h) {
                        i5 = indexOf;
                        arrayList = b;
                    } else {
                        if (indexOf < 0) {
                            i = 0;
                        } else {
                            i = indexOf;
                        }
                        if (i >= 0 && i < 5) {
                            i3 = 20;
                            i2 = 0;
                        } else if (i > b.size() - 5) {
                            i3 = b.size();
                            i2 = i3 - 10;
                        } else {
                            i2 = i - 5;
                            i3 = i2 + 20;
                        }
                        if (i2 >= 0) {
                            i6 = i2;
                        }
                        if (i3 > b.size()) {
                            i4 = b.size();
                        } else {
                            i4 = i3;
                        }
                        arrayList = new ArrayList<>(b.subList(i6, i4));
                        i5 = i;
                    }
                    mo15780a(i5, arrayList, i6, str);
                    return;
                }
                C4227a.m17749a(getActivity(), photoData.getSourceUrl(), str, "sch_images_screen");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15780a(int i, ArrayList<PhotoData> arrayList, int i2, String str) {
        getActivity().startActivity(ImageGalleryActivity.getIntent(getActivity(), this.f17191a, i, arrayList, i2, (SearchQuery) null, str, mo15627a(), false, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo15627a() {
        return 6;
    }

    public void onProgressReceived(ContentManager contentManager, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
        if (searchQuery.getOffset() == 0) {
            super.onProgressReceived(contentManager, searchProgressEnum, searchQuery);
            if (searchProgressEnum == SearchCommand.SearchProgressEnum.STARTING && this.f17194k != null) {
                this.f17194k.setVisibility(8);
            }
        }
        if (contentManager == this.f17136b && searchProgressEnum == SearchCommand.SearchProgressEnum.STARTING) {
            if (this.f17197n != null) {
                this.f17197n.setVisibility(8);
            }
            if (searchQuery.getOffset() == 0) {
                showSpinnerView();
            }
            if (searchQuery.getOffset() == 0 && this.f17194k != null) {
                this.f17194k.setSelection(0);
            }
        }
    }

    /* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.a$b */
    private class C4206b extends AsyncTask<Object, Void, Object[]> {
        private C4206b() {
        }

        /* synthetic */ C4206b(C4202a aVar, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return objArr;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (C4202a.this.getActivity() != null) {
                ArrayList arrayList = (ArrayList) objArr[0];
                SearchQuery searchQuery = (SearchQuery) objArr[1];
                if (C4202a.this.f17195l == null) {
                    C4202a.this.f17195l = C4202a.this.mo15779a(searchQuery, (ArrayList<PhotoData>) arrayList);
                    C4202a.this.f17195l.mo15852a(C4202a.this.f17204v);
                } else {
                    if (searchQuery.getOffset() == 0) {
                        C4202a.this.f17195l.mo15855c();
                        C4202a.this.f17199p.mo15803a();
                    }
                    C4202a.this.f17195l.mo15853a(searchQuery, (ArrayList<PhotoData>) arrayList);
                }
                if (C4202a.this.f17195l.mo15856d() >= C4202a.f17190q) {
                    boolean unused = C4202a.this.f17201s = true;
                }
                if (C4202a.this.f17195l.mo15851a().getOffset() == 0) {
                    C4202a.this.f17194k.setAdapter(C4202a.this.f17195l);
                    C4202a.this.f17194k.invalidate();
                    C4202a.this.f17194k.requestFocus();
                    C4202a.this.f17194k.setVisibility(0);
                }
                C4202a.this.hideSpinnerView();
                C4202a.this.f17195l.notifyDataSetChanged();
                HashMap hashMap = new HashMap();
                hashMap.put("progress", "100");
                hashMap.put("target_fragment", C4202a.this.getLabel(C4202a.this.getActivity()));
                C4243h.m17777a((Context) C4202a.this.getActivity(), "search_progress", hashMap);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4224c mo15779a(SearchQuery searchQuery, ArrayList<PhotoData> arrayList) {
        return new C4224c(getActivity(), searchQuery, this, arrayList);
    }

    public void onContentReceived(ContentManager contentManager, SearchResponseData searchResponseData, SearchQuery searchQuery) {
        if (contentManager == this.f17136b) {
            C4206b bVar = new C4206b(this, (byte) 0);
            if (searchResponseData != null) {
                ArrayList<? extends Object> responseList = searchResponseData.getResponseList();
                mo15735a(bVar, responseList, searchQuery);
                if (responseList == null || responseList.isEmpty()) {
                    this.f17201s = true;
                } else {
                    this.f17201s = ((PhotoData) responseList.get(responseList.size() - 1)).isLastImage();
                }
                this.f17196m = searchResponseData.getMetaData();
                if (this.f17196m.getErr() != null) {
                    mo15736a(getActivity().getResources().getString(C4073a.C4086m.yssdk_invalid_yhs_key));
                }
            }
        }
        this.f17200r = false;
        if (searchQuery.getOffset() == 0) {
            this.f17202t = 0;
        }
        this.f17202t++;
        String queryString = searchQuery.getQueryString();
        int i = this.f17202t;
        ISearchContainer containerFragment = getContainerFragment();
        if (containerFragment == null || containerFragment.getCurrentFragment() == this) {
            HashMap hashMap = new HashMap();
            hashMap.put("sch_pgnm", Integer.valueOf(i));
            hashMap.put("query", queryString);
            C4242g.m17773a(980778377, "sch_show_results", hashMap);
            return;
        }
        setShowResultsPendingTracking(true);
    }

    /* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.a$a */
    private class C4205a extends AsyncTask<Object, Void, SearchQuery> {

        /* renamed from: a */
        SearchError f17207a;

        private C4205a() {
            this.f17207a = null;
        }

        /* synthetic */ C4205a(C4202a aVar, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return objArr[1];
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String string;
            SearchQuery searchQuery = (SearchQuery) obj;
            super.onPostExecute(searchQuery);
            TextView textView = (TextView) C4202a.this.f17197n.findViewById(C4073a.C4081h.text_view_results_error_t1);
            Resources resources = C4202a.this.getResources();
            switch (this.f17207a.getErrorCode()) {
                case 1:
                    string = resources.getString(C4073a.C4086m.yssdk_no_image_results_found);
                    break;
                case 2:
                case 3:
                case 4:
                    string = resources.getString(C4073a.C4086m.yssdk_request_error);
                    break;
                case 10:
                    string = resources.getString(C4073a.C4086m.yssdk_search_status_error);
                    break;
                default:
                    string = resources.getString(C4073a.C4086m.yssdk_request_error);
                    break;
            }
            int indexOf = string.indexOf("%s");
            SpannableString spannableString = new SpannableString(String.format(string, new Object[]{searchQuery.getQueryString()}));
            TextView textView2 = (TextView) C4202a.this.f17197n.findViewById(C4073a.C4081h.text_view_result_error_message);
            if (indexOf != -1) {
                spannableString.setSpan(new AbsoluteSizeSpan(C4202a.this.getResources().getDimensionPixelSize(C4073a.C4079f.no_image_result_t2_fontsize)), indexOf, searchQuery.getQueryString().length() + indexOf, 33);
            }
            if (this.f17207a == null || this.f17207a.getErrorCode() != 1) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            textView.setText(spannableString);
            C4202a.this.f17197n.setVisibility(0);
            C4202a.this.f17197n.bringToFront();
        }

        /* renamed from: a */
        public final void mo15786a(SearchError searchError) {
            this.f17207a = searchError;
        }
    }

    public void onContentError(ContentManager contentManager, SearchError searchError, SearchQuery searchQuery) {
        if (searchError.getCommandType() == 13 && searchQuery.getOffset() == 0) {
            C4205a aVar = new C4205a(this, (byte) 0);
            aVar.mo15786a(searchError);
            mo15735a(aVar, (ArrayList<? extends Object>) null, searchQuery);
            hideSpinnerView();
        }
        this.f17201s = true;
        this.f17200r = false;
    }

    public void onShowRowView(BaseAdapter baseAdapter, int i, View view, SearchQuery searchQuery) {
        C4224c cVar = (C4224c) baseAdapter;
        if (cVar.mo15856d() < f17190q && !this.f17200r && !this.f17201s && i >= cVar.getCount() - 18) {
            SearchQuery searchQuery2 = new SearchQuery(new SearchQuery.Builder(searchQuery).setOffset(C4107c.f16618a + ((this.f17202t - 1) * Settings.SHOW_PRIVACY_POLICY) + 1));
            this.f17136b.loadQuery(searchQuery2);
            String queryString = searchQuery2.getQueryString();
            int i2 = this.f17202t;
            HashMap hashMap = new HashMap();
            hashMap.put("query", queryString);
            hashMap.put("sch_pgnm", Integer.valueOf(i2));
            C4242g.m17773a(980778377, "sch_submit_query", hashMap);
            this.f17200r = true;
        }
    }

    public boolean isScrollEnabled() {
        if (this.f17199p == null) {
            return false;
        }
        return this.f17199p.isScrollEnabled();
    }

    public int getScrollY() {
        if (this.f17199p == null) {
            return 0;
        }
        return this.f17199p.getScrollY();
    }

    public View getParallaxView() {
        return this.f17194k;
    }

    public String getVerticalId() {
        return "sch_images_screen";
    }

    public int getType() {
        return 2;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.f17199p.onScrollStateChanged(absListView, i);
        if (this.f17195l != null) {
            this.f17195l.onScrollStateChanged(absListView, i);
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f17199p.onScroll(absListView, i, i2, i3);
        if (this.f17195l != null) {
            this.f17195l.onScroll(absListView, i, i2, i3);
        }
    }

    public boolean isAvailable(Context context) {
        return C4127a.m17421c(context);
    }
}
