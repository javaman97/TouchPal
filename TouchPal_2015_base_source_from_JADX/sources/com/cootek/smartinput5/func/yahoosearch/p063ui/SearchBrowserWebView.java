package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.SearchBrowserWebView */
public class SearchBrowserWebView extends WebView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2142a f9117a;

    /* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.SearchBrowserWebView$a */
    public interface C2142a {
        /* renamed from: a */
        void mo7503a(int i);

        /* renamed from: b */
        void mo7504b();
    }

    public SearchBrowserWebView(Context context) {
        super(context);
        m9720a(context);
    }

    public SearchBrowserWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9720a(context);
    }

    public SearchBrowserWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9720a(context);
    }

    /* renamed from: a */
    private void m9720a(Context context) {
        setOnTouchListener(new C2149d(this));
    }

    public void setScrollChangeListener(C2142a aVar) {
        this.f9117a = aVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (this.f9117a != null) {
            if (getHeight() == getScrollY()) {
                this.f9117a.mo7504b();
            } else if (getScrollY() == 0) {
                this.f9117a.mo7504b();
            } else {
                this.f9117a.mo7503a(i2 - i4);
            }
        }
        super.onScrollChanged(i, i2, i3, i4);
    }
}
