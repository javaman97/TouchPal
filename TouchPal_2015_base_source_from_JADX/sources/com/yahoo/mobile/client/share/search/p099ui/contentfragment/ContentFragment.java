package com.yahoo.mobile.client.share.search.p099ui.contentfragment;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.SearchError;
import com.yahoo.mobile.client.share.search.commands.SearchCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.data.SearchResponseData;
import com.yahoo.mobile.client.share.search.data.contentmanager.ContentManager;
import com.yahoo.mobile.client.share.search.interfaces.IQuery;
import com.yahoo.mobile.client.share.search.interfaces.IQueryManager;
import com.yahoo.mobile.client.share.search.p099ui.container.ISearchContainer;
import com.yahoo.mobile.client.share.search.p099ui.scroll.IScrollable;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.util.C4233c;
import com.yahoo.mobile.client.share.search.util.C4243h;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.yahoo.mobile.client.share.search.ui.contentfragment.ContentFragment */
public abstract class ContentFragment extends SearchResultFragment implements ContentManager.IContentHandler {
    public static final String TAG = ContentFragment.class.getSimpleName();

    /* renamed from: a */
    private boolean f17135a;

    /* renamed from: b */
    protected ContentManager f17136b;

    /* renamed from: c */
    protected ViewGroup f17137c;

    /* renamed from: d */
    protected View f17138d;

    /* renamed from: e */
    protected int f17139e;

    /* renamed from: f */
    protected int f17140f;

    /* renamed from: g */
    protected int f17141g = Integer.MIN_VALUE;

    /* renamed from: h */
    protected ISearchContainer f17142h;

    /* renamed from: i */
    private Runnable f17143i;

    /* renamed from: j */
    private boolean f17144j = false;

    /* renamed from: k */
    private IScrollable.OnScrollListener f17145k;

    /* renamed from: l */
    private LayoutInflater f17146l;

    /* renamed from: m */
    private View f17147m;

    /* renamed from: n */
    private int f17148n = 0;

    /* renamed from: o */
    private boolean f17149o;

    public abstract void onContentError(ContentManager contentManager, SearchError searchError, SearchQuery searchQuery);

    public abstract void onContentReceived(ContentManager contentManager, SearchResponseData searchResponseData, SearchQuery searchQuery);

    public IQueryManager getContentManager() {
        return this.f17136b;
    }

    protected ContentFragment() {
        setShowSpinner(true);
    }

    public boolean isShowResultsPendingTracking() {
        return this.f17149o;
    }

    public void setShowResultsPendingTracking(boolean z) {
        this.f17149o = z;
    }

    public void setTopPadding(int i) {
        this.f17139e = i;
    }

    public void setBottomPadding(int i) {
        this.f17140f = i;
    }

    public void setBackgroundColor(int i) {
        this.f17141g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15735a(final AsyncTask asyncTask, final ArrayList<? extends Object> arrayList, final SearchQuery searchQuery) {
        if (getActivity() != null) {
            C4233c.m17758b(asyncTask, arrayList, searchQuery);
            setContentAvailable(true);
            this.f17143i = null;
            return;
        }
        this.f17143i = new Runnable() {
            public final void run() {
                C4233c.m17758b(asyncTask, arrayList, searchQuery);
                ContentFragment.this.setContentAvailable(true);
            }
        };
    }

    public void onProgressReceived(ContentManager contentManager, SearchCommand.SearchProgressEnum searchProgressEnum, SearchQuery searchQuery) {
        if (contentManager == this.f17136b) {
            HashMap hashMap = new HashMap();
            switch (searchProgressEnum) {
                case STARTING:
                    if (this.f17135a && this.f17138d != null) {
                        this.f17138d.setVisibility(0);
                        this.f17138d.bringToFront();
                    }
                    hashMap.put("progress", "5");
                    break;
                case EXECUTING:
                    hashMap.put("progress", "35");
                    break;
                case REQUEST_MADE:
                    hashMap.put("progress", "45");
                    break;
                case RESPONSE_RECEIVED:
                    hashMap.put("progress", "75");
                    break;
                case PARSING_DONE:
                    hashMap.put("progress", "90");
                    break;
                case ERROR:
                    hashMap.put("progress", "100");
                    break;
            }
            hashMap.put("target_fragment", getLabel(getActivity()));
            C4243h.m17777a((Context) getActivity(), "search_progress", hashMap);
        }
    }

    public void showSpinnerView() {
        if (this.f17135a && this.f17138d != null) {
            this.f17138d.setVisibility(0);
            this.f17138d.bringToFront();
        }
    }

    public void hideSpinnerView() {
        if (this.f17138d != null) {
            this.f17138d.setVisibility(8);
        }
    }

    public ISearchContainer getContainerFragment() {
        return this.f17142h;
    }

    public void setContainerFragment(ISearchContainer iSearchContainer) {
        this.f17142h = iSearchContainer;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f17142h != null) {
            this.f17142h.onSearchResultFragmentViewCreated(this);
            String str = TAG;
            new StringBuilder("onViewCreated ").append(this).append(" mContainerFragment = ").append(this.f17142h);
        }
        if (this.f17143i != null) {
            this.f17143i.run();
        }
        if (bundle != null) {
            setShowSpinner(bundle.getBoolean(mo15627a()));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17146l = layoutInflater;
        this.f17138d = this.f17146l.inflate(C4073a.C4083j.yssdk_progress_spinner_view, (ViewGroup) null);
        this.f17137c.addView(this.f17138d);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public IScrollable.OnScrollListener getOnScrollListener() {
        return this.f17145k;
    }

    public void setOnScrollListener(IScrollable.OnScrollListener onScrollListener) {
        this.f17145k = onScrollListener;
    }

    public void setShowSpinner(boolean z) {
        this.f17135a = z;
    }

    public void onDestroyView() {
        if (this.f17136b != null) {
            this.f17136b.cancelBackgroundTasks();
        }
        super.onDestroyView();
    }

    public boolean isContentAvailable() {
        return this.f17144j;
    }

    public void setContentAvailable(boolean z) {
        this.f17144j = z;
    }

    public boolean isScrollEnabled() {
        return false;
    }

    public View getParallaxView() {
        return null;
    }

    public void moveBackgroundWithParallax(int i, boolean z, Context context) {
        float f;
        if (this.f17148n == 0) {
            this.f17148n = Utils.getScreenWidth(getActivity());
        }
        this.f17147m = getParallaxView();
        if (this.f17147m != null) {
            float f2 = 1.0f;
            if (!z) {
                f2 = -1.0f;
            }
            if (i >= this.f17148n || i <= 0) {
                f = 0.0f;
            } else {
                f = (f2 * ((float) i)) / 2.0f;
                new StringBuilder("x=").append(f);
            }
            this.f17147m.setTranslationX(f);
        }
    }

    public void tryAgain() {
        IQuery lastQuery;
        if (getContentManager() != null && (lastQuery = this.f17136b.getLastQuery()) != null) {
            if (getContainerFragment() != null) {
                getContainerFragment().loadQuery((SearchQuery) lastQuery, false);
            } else {
                getContentManager().loadQuery(lastQuery);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15736a(String str) {
        Toast.makeText(getActivity(), str, 1).show();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(mo15627a(), this.f17135a);
    }

    /* renamed from: a */
    private String mo15627a() {
        return "show_spinner_" + getVerticalId();
    }

    public boolean didGetSearchResults() {
        return false;
    }

    public String getContentProvider(Context context) {
        return "";
    }

    public int getType() {
        return 0;
    }
}
