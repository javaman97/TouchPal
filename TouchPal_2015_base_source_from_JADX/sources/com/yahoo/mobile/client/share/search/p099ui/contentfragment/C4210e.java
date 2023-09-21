package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.C4104a;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.MetaData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.VideoData;
import com.yahoo.mobile.client.share.search.data.contentmanager.C4124d;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.data.contentmanager.IListViewAdapterHandler;
import com.yahoo.mobile.client.share.search.p099ui.container.ISearchContainer;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.VideoListAdapter;
import com.yahoo.mobile.client.share.search.p099ui.scroll.C4215a;
import com.yahoo.mobile.client.share.search.p099ui.scroll.IScrollable;
import com.yahoo.mobile.client.share.search.settings.C4127a;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.C4227a;
import com.yahoo.mobile.client.share.search.util.C4242g;
import com.yahoo.mobile.client.share.search.util.C4243h;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.e */
public class C4210e extends ContentFragment implements View.OnClickListener, ContentManager.IContentHandler, IListViewAdapterHandler {

    /* renamed from: k */
    private static final String f17218k = C4210e.class.getSimpleName();

    /* renamed from: a */
    protected View f17219a;

    /* renamed from: i */
    protected VideoListAdapter f17220i;

    /* renamed from: j */
    protected MetaData f17221j;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public View f17222l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ListView f17223m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C4215a f17224n;

    /* renamed from: o */
    private View f17225o;

    /* renamed from: p */
    private boolean f17226p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f17227q;

    /* renamed from: r */
    private int f17228r = 1;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17136b = new C4124d(this, getActivity());
        this.f17227q = false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17137c = (FrameLayout) layoutInflater.inflate(C4073a.C4083j.yssdk_search_result_video_page, viewGroup, false);
        this.f17225o = layoutInflater.inflate(C4073a.C4083j.yssdk_padding_cell, (ViewGroup) null);
        this.f17219a = layoutInflater.inflate(C4073a.C4083j.yssdk_bing_attribution_footer, (ViewGroup) null);
        ((TextView) this.f17219a.findViewById(C4073a.C4081h.copy_right_message)).setText(Html.fromHtml(getResources().getString(C4073a.C4086m.common_powered_by_bing)));
        this.f17138d = this.f17137c.findViewById(C4073a.C4081h.spinner_view);
        hideSpinnerView();
        this.f17137c.requestFocus();
        return this.f17137c;
    }

    public void setOnScrollListener(IScrollable.OnScrollListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
        if (this.f17224n != null) {
            this.f17224n.setOnScrollListener(onScrollListener);
        }
    }

    public String getLabel(Context context) {
        if (context != null) {
            return context.getResources().getString(C4073a.C4086m.yssdk_video_search);
        }
        return null;
    }

    @SuppressFBWarnings({"BC_UNCONFIRMED_CAST"})
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f17223m != null) {
            this.f17223m = null;
        }
        this.f17223m = (ListView) view.findViewById(C4073a.C4081h.video_list);
        this.f17224n = new C4215a(this.f17223m);
        this.f17224n.setOnScrollListener(getOnScrollListener());
        View view2 = this.f17225o;
        this.f17223m.addHeaderView(view2);
        View findViewById = view2.findViewById(C4073a.C4081h.padding_cell_view);
        if (findViewById != null) {
            findViewById.getLayoutParams().height = this.f17139e;
        }
        View view3 = this.f17219a;
        view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), this.f17140f);
        if (getActivity() != null && C4127a.m17419a(getActivity().getApplicationContext(), 4)) {
            this.f17223m.addFooterView(view3);
        }
        this.f17222l = View.inflate(getActivity(), C4073a.C4083j.yssdk_result_error_message, (ViewGroup) null);
        TextView textView = (TextView) this.f17222l.findViewById(C4073a.C4081h.text_view_results_error_t1);
        if (textView != null) {
            textView.setText(C4073a.C4086m.yssdk_no_video_results_found);
        }
        this.f17222l.setVisibility(8);
        if (this.f17141g == 0) {
            this.f17138d.setBackgroundColor(0);
        }
        ((FrameLayout) view).addView(this.f17222l);
        if (bundle != null) {
            String string = bundle.getString("video_query_key");
            int i = bundle.getInt("video_page_num", 1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("video_data_list");
            this.f17221j = (MetaData) bundle.getParcelable("meta_key");
            if (parcelableArrayList != null && parcelableArrayList.size() > 0) {
                SearchQuery searchQuery = new SearchQuery(new SearchQuery.Builder().setQueryString(string));
                this.f17136b.restoreLastQuery(searchQuery);
                onContentReceived(this.f17136b, new SearchResponseData(this.f17221j, parcelableArrayList), searchQuery);
                this.f17228r = i;
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        if (!z && this.f17223m != null) {
            this.f17223m.requestFocus();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("video_page_num", this.f17228r);
        bundle.putParcelable("meta_key", this.f17221j);
        if (this.f17220i != null) {
            SearchQuery query = this.f17220i.getQuery();
            if (query != null) {
                bundle.putString("video_query_key", query.getQueryString());
            }
            ArrayList<VideoData> allItems = this.f17220i.getAllItems();
            if (allItems != null) {
                bundle.putParcelableArrayList("video_data_list", allItems);
            }
        }
        if (this.f17223m != null) {
            bundle.putInt("video_offset", this.f17223m.getFirstVisiblePosition());
        }
    }

    public void onClick(View view) {
        VideoData videoData;
        Object tag = view.getTag();
        if (tag != null && (tag instanceof VideoListAdapter.C4201a) && (videoData = ((VideoListAdapter.C4201a) tag).f17183c) != null) {
            String videoUrl = videoData.getVideoUrl();
            int i = ((VideoListAdapter.C4201a) tag).f17187g;
            HashMap hashMap = new HashMap();
            hashMap.put("sch_url", videoUrl);
            hashMap.put("sch_type", "video result");
            hashMap.put("sch_pos", Integer.valueOf(i + 1));
            C4242g.m17773a(980778378, "sch_select_action", hashMap);
            if (videoData != null) {
                String videoUrl2 = videoData.getVideoUrl();
                String beaconUrl = videoData.getBeaconUrl();
                if (!TextUtils.isEmpty(beaconUrl) && C4129c.m17448m()) {
                    new C4104a(getActivity().getApplicationContext(), Uri.parse(beaconUrl)).executeCommand();
                }
                C4227a.m17749a(getActivity(), videoUrl2, mo15627a(), "sch_video_screen");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo15627a() {
        return "https://videos.search.yahoo.com/search/video?p=" + this.f17136b.getLastQuery().getQueryString();
    }

    public void onProgressReceived(ContentManager contentManager, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
        if (searchQuery.getOffset() == 0) {
            super.onProgressReceived(contentManager, searchProgressEnum, searchQuery);
            if (searchProgressEnum == SearchCommand.SearchProgressEnum.STARTING && this.f17223m != null) {
                this.f17223m.setVisibility(8);
            }
        }
        if (contentManager == this.f17136b && searchProgressEnum == SearchCommand.SearchProgressEnum.STARTING) {
            if (searchQuery.getOffset() == 0) {
                showSpinnerView();
            }
            if (this.f17222l != null) {
                this.f17222l.setVisibility(8);
            }
            if (searchQuery.getOffset() == 0 && this.f17223m != null) {
                this.f17223m.setSelection(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public VideoListAdapter mo15791a(SearchQuery searchQuery, IListViewAdapterHandler iListViewAdapterHandler, ArrayList<VideoData> arrayList) {
        return new VideoListAdapter(getActivity(), searchQuery, iListViewAdapterHandler, arrayList);
    }

    /* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.e$b */
    private class C4212b extends AsyncTask<Object, Void, Object[]> {
        private C4212b() {
        }

        /* synthetic */ C4212b(C4210e eVar, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return objArr;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (C4210e.this.getActivity() != null) {
                ArrayList arrayList = (ArrayList) objArr[0];
                SearchQuery searchQuery = (SearchQuery) objArr[1];
                if (C4210e.this.f17220i == null) {
                    C4210e.this.f17220i = C4210e.this.mo15791a(searchQuery, C4210e.this, arrayList);
                    C4210e.this.f17220i.setItemClickListener(C4210e.this);
                } else {
                    if (searchQuery.getOffset() == 0) {
                        C4210e.this.f17220i.clear();
                        C4210e.this.f17224n.mo15803a();
                    }
                    C4210e.this.f17220i.addVideos(searchQuery, arrayList);
                }
                if (C4210e.this.f17220i.getCount() >= 420) {
                    boolean unused = C4210e.this.f17227q = true;
                }
                if (C4210e.this.f17220i.getQuery().getOffset() == 0) {
                    C4210e.this.f17223m.setAdapter(C4210e.this.f17220i);
                    C4210e.this.f17223m.invalidate();
                    C4210e.this.f17223m.requestFocus();
                    C4210e.this.f17223m.setVisibility(0);
                }
                C4210e.this.hideSpinnerView();
                C4210e.this.f17220i.notifyDataSetChanged();
                HashMap hashMap = new HashMap();
                hashMap.put("progress", "100");
                hashMap.put("target_fragment", C4210e.this.getLabel(C4210e.this.getActivity()));
                C4243h.m17777a((Context) C4210e.this.getActivity(), "search_progress", hashMap);
            }
        }
    }

    public void onContentReceived(ContentManager contentManager, SearchResponseData searchResponseData, SearchQuery searchQuery) {
        if (contentManager == this.f17136b) {
            C4212b bVar = new C4212b(this, (byte) 0);
            if (searchResponseData != null) {
                ArrayList<? extends Object> responseList = searchResponseData.getResponseList();
                mo15735a(bVar, responseList, searchQuery);
                setContentAvailable(true);
                if (responseList == null || responseList.isEmpty()) {
                    this.f17227q = true;
                } else {
                    this.f17227q = ((VideoData) responseList.get(responseList.size() - 1)).isLastVideo();
                }
                this.f17221j = searchResponseData.getMetaData();
                if (this.f17221j.getErr() != null) {
                    mo15736a(getActivity().getResources().getString(C4073a.C4086m.yssdk_invalid_yhs_key));
                }
            }
        }
        this.f17226p = false;
        if (searchQuery.getOffset() == 0) {
            this.f17228r = 1;
        } else {
            this.f17228r++;
        }
        String queryString = searchQuery.getQueryString();
        int i = this.f17228r;
        HashMap hashMap = new HashMap();
        hashMap.put("sch_pgnm", Integer.valueOf(i));
        hashMap.put("query", queryString);
        ISearchContainer containerFragment = getContainerFragment();
        if (containerFragment == null || containerFragment.getCurrentFragment() == this) {
            C4242g.m17773a(980778378, "sch_show_results", hashMap);
        } else {
            setShowResultsPendingTracking(true);
        }
    }

    /* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.e$a */
    private class C4211a extends AsyncTask<Object, Void, SearchQuery> {

        /* renamed from: a */
        SearchError f17229a;

        private C4211a() {
            this.f17229a = null;
        }

        /* synthetic */ C4211a(C4210e eVar, byte b) {
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
            TextView textView = (TextView) C4210e.this.f17222l.findViewById(C4073a.C4081h.text_view_results_error_t1);
            Resources resources = C4210e.this.getResources();
            switch (this.f17229a.getErrorCode()) {
                case 1:
                    string = resources.getString(C4073a.C4086m.yssdk_no_video_results_found);
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
            String format = String.format(string, new Object[]{searchQuery.getQueryString()});
            SpannableString spannableString = new SpannableString(format);
            TextView textView2 = (TextView) C4210e.this.f17222l.findViewById(C4073a.C4081h.text_view_result_error_message);
            int indexOf = format.indexOf("%s");
            if (indexOf != -1) {
                spannableString.setSpan(new AbsoluteSizeSpan(C4210e.this.getResources().getDimensionPixelSize(C4073a.C4079f.no_image_result_t2_fontsize)), indexOf, searchQuery.getQueryString().length() + indexOf, 33);
                textView2.setVisibility(0);
            }
            if (this.f17229a == null || this.f17229a.getErrorCode() != 1) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            textView.setText(spannableString);
            C4210e.this.f17222l.setVisibility(0);
            C4210e.this.f17222l.bringToFront();
        }

        /* renamed from: a */
        public final void mo15793a(SearchError searchError) {
            this.f17229a = searchError;
        }
    }

    public void onContentError(ContentManager contentManager, SearchError searchError, SearchQuery searchQuery) {
        if (searchError.getCommandType() == 15) {
            C4211a aVar = new C4211a(this, (byte) 0);
            aVar.mo15793a(searchError);
            mo15735a(aVar, (ArrayList<? extends Object>) null, searchQuery);
            hideSpinnerView();
        }
        this.f17227q = true;
        this.f17226p = false;
    }

    public void onShowRowView(BaseAdapter baseAdapter, int i, View view, SearchQuery searchQuery) {
        int count = ((VideoListAdapter) baseAdapter).getCount();
        if (count < 420 && !this.f17226p && !this.f17227q && i >= count - 15) {
            SearchQuery searchQuery2 = new SearchQuery(new SearchQuery.Builder(searchQuery).setOffset(count + 1));
            this.f17136b.loadQuery(searchQuery2);
            String queryString = searchQuery2.getQueryString();
            int i2 = this.f17228r;
            HashMap hashMap = new HashMap();
            hashMap.put("query", queryString);
            hashMap.put("sch_pgnm", Integer.valueOf(i2));
            C4242g.m17773a(980778378, "sch_submit_query", hashMap);
            this.f17226p = true;
        }
    }

    public boolean isScrollEnabled() {
        if (this.f17224n == null) {
            return false;
        }
        return this.f17224n.isScrollEnabled();
    }

    public int getScrollY() {
        if (this.f17224n == null) {
            return 0;
        }
        return this.f17224n.getScrollY();
    }

    public View getParallaxView() {
        return this.f17223m;
    }

    public String getVerticalId() {
        return "sch_video_screen";
    }

    public int getType() {
        return 4;
    }

    public boolean isAvailable(Context context) {
        return C4127a.m17420b(context);
    }
}
