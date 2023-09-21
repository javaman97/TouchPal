package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.interfaces.ILinkableContent;
import com.yahoo.mobile.client.share.search.interfaces.IQuery;
import com.yahoo.mobile.client.share.search.interfaces.IQueryManager;
import com.yahoo.mobile.client.share.search.interfaces.ISearchToLinkListener;
import com.yahoo.mobile.client.share.search.p099ui.contentfragment.SearchResultFragment;
import com.yahoo.mobile.client.share.search.p099ui.scroll.IScrollable;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.h */
/* compiled from: TranslationSearchFragment */
public class C2153h extends SearchResultFragment implements ILinkableContent {

    /* renamed from: a */
    private static final String f9142a = "sch_shr_translation_screen";

    /* renamed from: b */
    private static final String f9143b = "http://www.bing.com/translator/";

    /* renamed from: c */
    private static final int f9144c = 1;

    /* renamed from: d */
    private static final int f9145d = 2;

    /* renamed from: e */
    private IQueryManager f9146e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f9147f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public View f9148g;

    /* renamed from: h */
    private int f9149h = 0;

    /* renamed from: i */
    private int f9150i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f9151j = new C2154i(this);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f9152k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f9153l = null;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9146e = new C2155j(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.translation_search_layout, viewGroup, false);
        this.f9147f = (WebView) viewGroup2.findViewById(R.id.translate_webview);
        this.f9148g = viewGroup2.findViewById(R.id.webview_progress);
        this.f9147f.getSettings().setJavaScriptEnabled(true);
        this.f9147f.setWebViewClient(new C2156k(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = this.f9149h;
        layoutParams.bottomMargin = this.f9150i;
        this.f9147f.setLayoutParams(layoutParams);
        viewGroup2.requestFocus();
        return viewGroup2;
    }

    public IScrollable.OnScrollListener getOnScrollListener() {
        return null;
    }

    public int getScrollY() {
        if (this.f9147f == null) {
            return 0;
        }
        return this.f9147f.getScrollY();
    }

    public boolean isScrollEnabled() {
        return true;
    }

    public void setOnScrollListener(IScrollable.OnScrollListener onScrollListener) {
    }

    public IQueryManager getContentManager() {
        return this.f9146e;
    }

    /* renamed from: a */
    public void mo7586a(IQuery iQuery) {
        if (!TextUtils.isEmpty(iQuery.getQueryString()) && !iQuery.getQueryString().equals(this.f9153l)) {
            this.f9153l = iQuery.getQueryString();
            if (this.f9152k) {
                m9736a(this.f9153l);
            } else {
                this.f9147f.loadUrl(f9143b);
            }
        }
    }

    public String getLabel(Context context) {
        return C1974m.m9063a(context, (int) R.string.search_translation);
    }

    public String getVerticalId() {
        return f9142a;
    }

    public void moveBackgroundWithParallax(int i, boolean z, Context context) {
    }

    public void setBottomPadding(int i) {
        this.f9150i = i;
        if (this.f9147f != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9147f.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            }
            layoutParams.bottomMargin = i;
            this.f9147f.setLayoutParams(layoutParams);
        }
    }

    public void setTopPadding(int i) {
        this.f9149h = i;
        if (this.f9147f != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9147f.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            }
            layoutParams.topMargin = i;
            this.f9147f.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9736a(String str) {
        if (str != null) {
            String replace = str.replace("'", "\\'");
            this.f9147f.loadUrl(String.format("javascript:document.getElementById('InputTextArea').value='%s'", new Object[]{replace}));
            this.f9147f.loadUrl(String.format("javascript:document.getElementById('InputText').value='%s'", new Object[]{replace}));
            this.f9151j.postDelayed(new C2157l(this), 200);
            C1246d.m6010a((Context) getActivity()).mo4594a(C1246d.f3926dt, true, C1246d.f3923dq);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setSearchToLinkListener(ISearchToLinkListener iSearchToLinkListener) {
    }
}
