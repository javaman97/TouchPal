package com.yahoo.mobile.client.share.search.p099ui;

import android.content.Context;
import android.net.Uri;
import android.support.p001v4.view.C0471i;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yahoo.mobile.client.share.search.p099ui.scroll.IScrollable;
import com.yahoo.mobile.client.share.search.p099ui.scroll.MeasurableWebView;
import com.yahoo.mobile.client.share.search.util.C4248m;

/* renamed from: com.yahoo.mobile.client.share.search.ui.SearchResultWebView */
public class SearchResultWebView extends MeasurableWebView implements IScrollable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public IScrollable.OnScrollListener f16931a = null;

    /* renamed from: b */
    private VelocityTracker f16932b = VelocityTracker.obtain();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f16933c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f16934d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Runnable f16935e;

    /* renamed from: f */
    private C0471i f16936f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f16937g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public WebViewClient f16938h;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ android.app.Dialog m17553a(com.yahoo.mobile.client.share.search.p099ui.SearchResultWebView r6, final java.lang.String r7) {
        /*
            r5 = 0
            java.lang.String r0 = "wrapper://app/web"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x0060
            r0 = 17
            java.lang.String r0 = r7.substring(r0)
            java.util.Map r0 = com.yahoo.mobile.client.share.search.util.UrlUtils.getParametersMap(r0)
            java.lang.String r1 = "url"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = "url"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0023:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            android.content.Context r2 = r6.getContext()
            r1.<init>(r2)
            boolean r2 = com.yahoo.mobile.client.share.search.settings.C4129c.m17442g()
            if (r2 == 0) goto L_0x004b
            android.app.AlertDialog$Builder r2 = r1.setTitle(r0)
            int r3 = com.yahoo.mobile.client.p094a.p095a.C4073a.C4075b.longPressListOptionsWithMinibrowserEnabled
            com.yahoo.mobile.client.share.search.ui.SearchResultWebView$2 r4 = new com.yahoo.mobile.client.share.search.ui.SearchResultWebView$2
            r4.<init>(r7, r0)
            android.app.AlertDialog$Builder r0 = r2.setItems(r3, r4)
            int r2 = com.yahoo.mobile.client.p094a.p095a.C4073a.C4086m.yssdk_cancel
            r0.setNegativeButton(r2, r5)
        L_0x0046:
            android.app.AlertDialog r0 = r1.create()
            return r0
        L_0x004b:
            android.app.AlertDialog$Builder r2 = r1.setTitle(r0)
            int r3 = com.yahoo.mobile.client.p094a.p095a.C4073a.C4075b.longPressListOptionsWithMinibrowserDisabled
            com.yahoo.mobile.client.share.search.ui.SearchResultWebView$3 r4 = new com.yahoo.mobile.client.share.search.ui.SearchResultWebView$3
            r4.<init>(r0)
            android.app.AlertDialog$Builder r0 = r2.setItems(r3, r4)
            int r2 = com.yahoo.mobile.client.p094a.p095a.C4073a.C4086m.yssdk_cancel
            r0.setNegativeButton(r2, r5)
            goto L_0x0046
        L_0x0060:
            r0 = r7
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yahoo.mobile.client.share.search.p099ui.SearchResultWebView.m17553a(com.yahoo.mobile.client.share.search.ui.SearchResultWebView, java.lang.String):android.app.Dialog");
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f16931a != null && this.f16933c) {
            this.f16931a.onScroll(this, i, Math.max(0, i2));
        }
        this.f16934d = true;
    }

    public SearchResultWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17555a(context);
    }

    public SearchResultWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17555a(context);
    }

    /* renamed from: a */
    private void m17555a(Context context) {
        if (C4248m.f17353h) {
            this.f16936f = null;
        } else {
            this.f16936f = new C0471i(context, new GestureDetector.SimpleOnGestureListener() {
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    return false;
                }

                public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                    boolean unused = SearchResultWebView.this.f16937g = true;
                    return false;
                }

                public final boolean onDoubleTap(MotionEvent motionEvent) {
                    return false;
                }
            });
        }
        setLongClickable(true);
        setOnLongClickListener(new View.OnLongClickListener() {
            public final boolean onLongClick(View view) {
                String extra;
                WebView.HitTestResult hitTestResult = SearchResultWebView.this.getHitTestResult();
                int type = hitTestResult.getType();
                if ((type != 7 && type != 8) || (extra = hitTestResult.getExtra()) == null) {
                    return false;
                }
                SearchResultWebView.m17553a(SearchResultWebView.this, extra).show();
                return false;
            }
        });
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f16936f != null) {
            this.f16936f.mo1622a(motionEvent);
        }
        if (this.f16937g) {
            this.f16937g = false;
            return false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            if (this.f16935e != null) {
                removeCallbacks(this.f16935e);
            }
            this.f16933c = true;
            if (this.f16931a != null) {
                this.f16931a.onScrollBegin(this, getScrollX(), getScrollY());
            }
        } else if (motionEvent.getAction() == 2) {
            this.f16932b.addMovement(motionEvent);
        } else if (motionEvent.getAction() == 1) {
            this.f16932b.computeCurrentVelocity(1);
            final float yVelocity = this.f16932b.getYVelocity();
            if (((double) Math.abs(yVelocity)) < 0.1d) {
                this.f16933c = false;
                if (this.f16931a != null) {
                    this.f16931a.onScrollEnd(this, getScrollX(), getScrollY(), this.f16932b.getYVelocity());
                }
            } else {
                this.f16934d = false;
                this.f16935e = new Runnable() {
                    public final void run() {
                        if (!SearchResultWebView.this.f16934d) {
                            boolean unused = SearchResultWebView.this.f16933c = false;
                            if (SearchResultWebView.this.f16931a != null) {
                                SearchResultWebView.this.f16931a.onScrollEnd(SearchResultWebView.this, SearchResultWebView.this.getScrollX(), SearchResultWebView.this.getScrollY(), yVelocity);
                            }
                            Runnable unused2 = SearchResultWebView.this.f16935e = null;
                            return;
                        }
                        boolean unused3 = SearchResultWebView.this.f16934d = false;
                        SearchResultWebView.this.postDelayed(SearchResultWebView.this.f16935e, 40);
                    }
                };
                postDelayed(this.f16935e, 40);
            }
            this.f16932b.clear();
        }
        return onTouchEvent;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            this.f16933c = true;
            if (this.f16931a != null) {
                this.f16931a.onScrollBegin(this, getScrollX(), getScrollY());
            }
        }
        return onInterceptTouchEvent;
    }

    public IScrollable.OnScrollListener getOnScrollListener() {
        return this.f16931a;
    }

    public void setOnScrollListener(IScrollable.OnScrollListener onScrollListener) {
        this.f16931a = onScrollListener;
    }

    public boolean isScrollEnabled() {
        return true;
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f16938h = webViewClient;
    }

    /* renamed from: a */
    public final void mo15541a(String str, int i, int i2, boolean z) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("ptop", String.valueOf(i));
        buildUpon.appendQueryParameter("pbot", String.valueOf(i2));
        if (z) {
            buildUpon.appendQueryParameter("nobg", "1");
        }
        new StringBuilder("<URL><WithParams>=").append(buildUpon.toString());
        loadUrl(buildUpon.toString());
    }
}
