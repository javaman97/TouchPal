package com.yahoo.mobile.client.share.search.p099ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.support.p001v4.view.C0333F;
import android.view.View;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.ZoomButtonsController;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.p099ui.activity.ImageGalleryActivity;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.settings.ServerSettings;
import com.yahoo.mobile.client.share.search.util.C4248m;
import com.yahoo.mobile.client.share.search.util.UrlUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"NewApi", "SetJavaScriptEnabled"})
/* renamed from: com.yahoo.mobile.client.share.search.ui.c */
public final class C4189c extends WebViewClient {

    /* renamed from: f */
    private static final Pattern f17068f = Pattern.compile(";_ylu=((.*?/)|(.*))");

    /* renamed from: g */
    private static final Pattern f17069g = Pattern.compile(".*pos\u0003(\\d+).*");

    /* renamed from: h */
    private static final Pattern f17070h = Pattern.compile(".*sec\u0003(.*?)\u0004.*");

    /* renamed from: a */
    Context f17071a;

    /* renamed from: b */
    String f17072b;

    /* renamed from: c */
    C4188b f17073c;

    /* renamed from: d */
    SearchWebViewCallback f17074d;

    /* renamed from: e */
    private int f17075e = -1;

    /* renamed from: i */
    private final Activity f17076i;

    /* renamed from: j */
    private long f17077j;

    /* renamed from: k */
    private Handler f17078k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f17079l = false;

    public C4189c(Activity activity, WebView webView, SearchWebViewCallback searchWebViewCallback) {
        this.f17076i = activity;
        this.f17071a = this.f17076i.getBaseContext();
        this.f17074d = searchWebViewCallback;
        this.f17073c = new C4188b(this.f17074d);
        this.f17075e = 0;
        this.f17078k = new Handler(this.f17071a.getMainLooper());
        if (webView != null) {
            CookieSyncManager.createInstance(this.f17071a);
            webView.setWebViewClient(this);
            WebSettings settings = webView.getSettings();
            settings.setLightTouchEnabled(true);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            settings.setLoadWithOverviewMode(true);
            settings.setSaveFormData(true);
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setAllowFileAccess(true);
            settings.setGeolocationEnabled(true);
            settings.setSupportZoom(false);
            settings.setBuiltInZoomControls(false);
            if (Build.VERSION.SDK_INT >= 11) {
                settings.setDisplayZoomControls(false);
            } else {
                try {
                    ((ZoomButtonsController) webView.getClass().getMethod("getZoomButtonsController", new Class[0]).invoke(webView, new Object[]{null})).getContainer().setVisibility(8);
                } catch (IllegalArgumentException e) {
                    e.getMessage();
                } catch (IllegalAccessException e2) {
                    e2.getMessage();
                } catch (InvocationTargetException e3) {
                    e3.getMessage();
                } catch (NoSuchMethodException e4) {
                    e4.getMessage();
                }
            }
            settings.setLoadsImagesAutomatically(true);
            if (C4248m.f17347b) {
                settings.setPluginState(WebSettings.PluginState.ON);
            }
            settings.setGeolocationDatabasePath(ImageGalleryActivity.DOWNLOAD_PATH);
            settings.setUseWideViewPort(true);
            settings.setDefaultFontSize(16);
            settings.setDefaultFixedFontSize(13);
            settings.setNeedInitialFocus(false);
            settings.setSupportMultipleWindows(false);
            settings.setAllowFileAccess(false);
            settings.setAppCacheEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabasePath(ImageGalleryActivity.DOWNLOAD_PATH);
            webView.setWebChromeClient(this.f17073c);
            webView.setVerticalScrollBarEnabled(true);
            webView.setScrollBarStyle(0);
            webView.setScrollbarFadingEnabled(true);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f17077j = System.currentTimeMillis();
        String str2 = this.f17072b;
        if (str2 == null || !str2.equals(str)) {
            this.f17072b = str;
        } else {
            str = str2;
        }
        this.f17079l = false;
        this.f17076i.onContentChanged();
        CookieSyncManager.getInstance().sync();
        super.onPageStarted(webView, str, bitmap);
    }

    public final void onPageFinished(WebView webView, final String str) {
        if (str.equals(this.f17072b)) {
            super.onPageFinished(webView, str);
            if (this.f17077j > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f17077j;
                new StringBuilder("Url loading duration: ").append(currentTimeMillis);
                HashMap hashMap = new HashMap(1);
                hashMap.put("url", str);
                C4129c.m17444i().getInstrument().logDurationEvent("web_url_loading", currentTimeMillis, hashMap);
                this.f17077j = 0;
            }
            this.f17078k.postDelayed(new Runnable() {
                public final void run() {
                    C4189c.this.f17074d.onPageLoaded(str, C4189c.this.f17079l);
                }
            }, 100);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        new StringBuilder("shouldOverrideUrlLoading for url=").append(str);
        if (str == null || str.equals("")) {
            return true;
        }
        String b = UrlUtils.m17744b(str);
        this.f17074d.onUrlLoaded(b, m17637b(str));
        CookieSyncManager.getInstance().sync();
        try {
            b = URLDecoder.decode(b, Utils.UTF8);
        } catch (UnsupportedEncodingException e) {
        }
        Uri parse = Uri.parse(b);
        if (UrlUtils.m17743a(parse)) {
            try {
                this.f17076i.startActivityForResult(new Intent("android.intent.action.VIEW", parse), 0);
            } catch (Exception e2) {
                e2.getMessage();
            }
            return true;
        } else if (m17634a(webView, str)) {
            return true;
        } else {
            if (m17636a(str)) {
                this.f17074d.willLoadUrl(str);
            } else if (this.f17075e == 0) {
                this.f17074d.openUrlOnMinibrowser(str, (Map<String, String>) null);
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m17636a(String str) {
        return Pattern.compile(String.format(ServerSettings.m17417a().getWebUrlTemplate(), new Object[]{"[a-z]{2}(-Hant)?-[A-Z]{2}"})).matcher(str).find();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (r18.equalsIgnoreCase(r17.getUrl() + "#") != false) goto L_0x0051;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m17634a(android.webkit.WebView r17, java.lang.String r18) {
        /*
            r16 = this;
            java.lang.String r2 = "wrapper:"
            r0 = r18
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x006e
            java.lang.String r2 = "tel:"
            r0 = r18
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "rtsp:"
            r0 = r18
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "market.android.com"
            r0 = r18
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "maps.google.com"
            r0 = r18
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x0051
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r17.getUrl()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "#"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0 = r18
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x006e
        L_0x0051:
            r17.stopLoading()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            android.net.Uri r4 = android.net.Uri.parse(r18)
            r2.<init>(r3, r4)
            r0 = r16
            android.app.Activity r3 = r0.f17076i     // Catch:{ Exception -> 0x0069 }
            r4 = 0
            r3.startActivityForResult(r2, r4)     // Catch:{ Exception -> 0x0069 }
        L_0x0067:
            r2 = 1
        L_0x0068:
            return r2
        L_0x0069:
            r2 = move-exception
            r2.getMessage()
            goto L_0x0067
        L_0x006e:
            java.lang.String r2 = "wrapper://app/status"
            r0 = r18
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x00b7
            r2 = 20
            r0 = r18
            java.lang.String r2 = r0.substring(r2)
            java.util.Map r3 = com.yahoo.mobile.client.share.search.util.UrlUtils.getParametersMap(r2)
            java.lang.String r2 = "status"
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L_0x00b5
            java.lang.String r2 = "status"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r4 = java.lang.Integer.parseInt(r2)
            r2 = 0
            java.lang.String r5 = "desc"
            boolean r5 = r3.containsKey(r5)
            if (r5 == 0) goto L_0x00a9
            java.lang.String r2 = "desc"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
        L_0x00a9:
            com.yahoo.mobile.client.share.search.data.SearchStatusData r3 = new com.yahoo.mobile.client.share.search.data.SearchStatusData
            r3.<init>(r4, r2)
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r2 = r0.f17074d
            r2.handleSearchStatus(r3)
        L_0x00b5:
            r2 = 1
            goto L_0x0068
        L_0x00b7:
            java.lang.String r2 = "wrapper://app/dd"
            r0 = r18
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x0128
            r2 = 16
            r0 = r18
            java.lang.String r2 = r0.substring(r2)
            java.util.Map r4 = com.yahoo.mobile.client.share.search.util.UrlUtils.getParametersMap(r2)
            java.lang.String r2 = "type"
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0125
            java.lang.String r3 = "local"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0125
            java.lang.String r2 = ""
            java.lang.String r3 = "p"
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto L_0x035e
            java.lang.String r2 = "p"
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r8 = r2
        L_0x00f2:
            java.lang.String r2 = "title"
            java.lang.Object r5 = r4.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r2 = "desc"
            java.lang.Object r6 = r4.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r2 = "url"
            java.lang.Object r3 = r4.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = "daddr"
            java.lang.Object r7 = r4.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            com.yahoo.mobile.client.share.search.data.LocalData r2 = new com.yahoo.mobile.client.share.search.data.LocalData
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r3 = r0.f17074d
            if (r3 == 0) goto L_0x0125
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r3 = r0.f17074d
            r3.onLocalResutTapped(r8, r2)
        L_0x0125:
            r2 = 1
            goto L_0x0068
        L_0x0128:
            java.lang.String r2 = "wrapper://app/images"
            r0 = r18
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x0293
            r17.stopLoading()
            r2 = 20
            r0 = r18
            java.lang.String r2 = r0.substring(r2)
            java.util.Map r15 = com.yahoo.mobile.client.share.search.util.UrlUtils.getParametersMap(r2)
            java.lang.String r2 = "oid"
            boolean r2 = r15.containsKey(r2)
            if (r2 == 0) goto L_0x028b
            java.lang.String r2 = ""
            java.lang.String r3 = "p"
            boolean r3 = r15.containsKey(r3)
            if (r3 == 0) goto L_0x035b
            java.lang.String r2 = "p"
            java.lang.Object r2 = r15.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r14 = r2
        L_0x015c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Open Image Gallery for url="
            r2.<init>(r3)
            r0 = r18
            r2.append(r0)
            java.lang.String r2 = "iurl"
            boolean r2 = r15.containsKey(r2)     // Catch:{ Exception -> 0x0286 }
            if (r2 == 0) goto L_0x026c
            java.lang.String r2 = "iurl"
            java.lang.Object r2 = r15.get(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0286 }
            r3 = r2
        L_0x0179:
            java.lang.String r2 = "h"
            java.lang.Object r2 = r15.get(r2)     // Catch:{ Exception -> 0x0286 }
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0286 }
            r4 = r0
            java.lang.String r2 = "w"
            java.lang.Object r2 = r15.get(r2)     // Catch:{ Exception -> 0x0286 }
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0286 }
            r5 = r0
            java.lang.String r2 = "turl"
            java.lang.Object r6 = r15.get(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = "th"
            boolean r2 = r15.containsKey(r2)     // Catch:{ Exception -> 0x0286 }
            if (r2 == 0) goto L_0x0277
            java.lang.String r2 = "th"
            java.lang.Object r2 = r15.get(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0286 }
            r7 = r2
        L_0x01a6:
            java.lang.String r2 = "tw"
            boolean r2 = r15.containsKey(r2)     // Catch:{ Exception -> 0x0286 }
            if (r2 == 0) goto L_0x027a
            java.lang.String r2 = "tw"
            java.lang.Object r2 = r15.get(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0286 }
            r8 = r2
        L_0x01b7:
            java.lang.String r2 = "size"
            java.lang.Object r9 = r15.get(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = "no"
            boolean r2 = r15.containsKey(r2)     // Catch:{ Exception -> 0x0286 }
            if (r2 == 0) goto L_0x027d
            java.lang.String r2 = "no"
            java.lang.Object r2 = r15.get(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0286 }
            r10 = r2
        L_0x01d0:
            java.lang.String r2 = "bImg"
            java.lang.Object r12 = r15.get(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = "bShr"
            java.lang.Object r13 = r15.get(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0286 }
            com.yahoo.mobile.client.share.search.data.PhotoData r2 = new com.yahoo.mobile.client.share.search.data.PhotoData     // Catch:{ Exception -> 0x0286 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x0286 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0286 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x0286 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0286 }
            long r10 = java.lang.Long.parseLong(r10)     // Catch:{ Exception -> 0x0286 }
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r4 = "turlL"
            boolean r4 = r15.containsKey(r4)     // Catch:{ Exception -> 0x0286 }
            if (r4 == 0) goto L_0x0282
            java.lang.String r3 = "turlL"
            java.lang.Object r3 = r15.get(r3)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0286 }
            r2.setOrigPhotoUrl(r3)     // Catch:{ Exception -> 0x0286 }
        L_0x020c:
            java.lang.String r3 = "tit"
            boolean r3 = r15.containsKey(r3)     // Catch:{ Exception -> 0x0286 }
            if (r3 == 0) goto L_0x021f
            java.lang.String r3 = "tit"
            java.lang.Object r3 = r15.get(r3)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0286 }
            r2.setTitle(r3)     // Catch:{ Exception -> 0x0286 }
        L_0x021f:
            java.lang.String r3 = "rhost"
            boolean r3 = r15.containsKey(r3)     // Catch:{ Exception -> 0x0286 }
            if (r3 == 0) goto L_0x0232
            java.lang.String r3 = "rhost"
            java.lang.Object r3 = r15.get(r3)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0286 }
            r2.setDisplayUrl(r3)     // Catch:{ Exception -> 0x0286 }
        L_0x0232:
            java.lang.String r3 = "rurl"
            boolean r3 = r15.containsKey(r3)     // Catch:{ Exception -> 0x0286 }
            if (r3 == 0) goto L_0x0245
            java.lang.String r3 = "rurl"
            java.lang.Object r3 = r15.get(r3)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0286 }
            r2.setSourceUrl(r3)     // Catch:{ Exception -> 0x0286 }
        L_0x0245:
            java.lang.String r3 = "no"
            boolean r3 = r15.containsKey(r3)     // Catch:{ Exception -> 0x0286 }
            if (r3 == 0) goto L_0x025c
            java.lang.String r3 = "no"
            java.lang.Object r3 = r15.get(r3)     // Catch:{ NumberFormatException -> 0x0288 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NumberFormatException -> 0x0288 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0288 }
        L_0x0259:
            r2.setImgPos(r3)     // Catch:{ Exception -> 0x0286 }
        L_0x025c:
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r3 = r0.f17074d     // Catch:{ Exception -> 0x0286 }
            if (r3 == 0) goto L_0x0269
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r3 = r0.f17074d     // Catch:{ Exception -> 0x0286 }
            r3.onImageThumbmailTapped(r14, r2)     // Catch:{ Exception -> 0x0286 }
        L_0x0269:
            r2 = 1
            goto L_0x0068
        L_0x026c:
            java.lang.String r2 = "imgurl"
            java.lang.Object r2 = r15.get(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0286 }
            r3 = r2
            goto L_0x0179
        L_0x0277:
            r7 = r4
            goto L_0x01a6
        L_0x027a:
            r8 = r5
            goto L_0x01b7
        L_0x027d:
            java.lang.String r2 = "0"
            r10 = r2
            goto L_0x01d0
        L_0x0282:
            r2.setOrigPhotoUrl(r3)     // Catch:{ Exception -> 0x0286 }
            goto L_0x020c
        L_0x0286:
            r2 = move-exception
            goto L_0x0269
        L_0x0288:
            r3 = move-exception
            r3 = -1
            goto L_0x0259
        L_0x028b:
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r2 = r0.f17074d
            r2.onImageResultsWrapperUrlTapped()
            goto L_0x0269
        L_0x0293:
            java.lang.String r2 = "wrapper://app/video"
            r0 = r18
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x02aa
            r17.stopLoading()
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r2 = r0.f17074d
            r2.onVideoResultsWrapperUrlTapped()
            r2 = 1
            goto L_0x0068
        L_0x02aa:
            java.lang.String r2 = "wrapper://app/web"
            r0 = r18
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x0318
            r2 = 17
            r0 = r18
            java.lang.String r2 = r0.substring(r2)
            java.util.Map r3 = com.yahoo.mobile.client.share.search.util.UrlUtils.getParametersMap(r2)
            java.lang.String r2 = "norw"
            boolean r2 = r3.containsKey(r2)
            if (r2 != 0) goto L_0x02d0
            java.lang.String r2 = "fr2"
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L_0x02e2
        L_0x02d0:
            java.lang.String r2 = "p"
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L_0x02e2
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r2 = r0.f17074d
            r2.onSearchResultsRequeryTapped(r3)
        L_0x02df:
            r2 = 1
            goto L_0x0068
        L_0x02e2:
            java.lang.String r2 = "p"
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L_0x02fa
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r4 = r0.f17074d
            java.lang.String r2 = "p"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4.onSearchResultsNewQueryTapped(r2)
            goto L_0x02df
        L_0x02fa:
            java.lang.String r2 = "url"
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L_0x02df
            r0 = r16
            int r2 = r0.f17075e
            if (r2 != 0) goto L_0x02df
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r4 = r0.f17074d
            java.lang.String r2 = "url"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4.openUrlOnMinibrowser(r2, r3)
            goto L_0x02df
        L_0x0318:
            java.lang.String r2 = "https://search.yahoo.com/mobile/sapp"
            r0 = r18
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x0358
            r2 = 36
            r0 = r18
            java.lang.String r2 = r0.substring(r2)
            java.util.Map r2 = com.yahoo.mobile.client.share.search.util.UrlUtils.getParametersMap(r2)
            java.lang.String r3 = "p"
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L_0x0345
            java.lang.String r3 = "fr2"
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L_0x0348
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r3 = r0.f17074d
            r3.onSearchResultsRequeryTapped(r2)
        L_0x0345:
            r2 = 1
            goto L_0x0068
        L_0x0348:
            r0 = r16
            com.yahoo.mobile.client.share.search.ui.SearchWebViewCallback r3 = r0.f17074d
            java.lang.String r4 = "p"
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            r3.onSearchResultsNewQueryTapped(r2)
            goto L_0x0345
        L_0x0358:
            r2 = 0
            goto L_0x0068
        L_0x035b:
            r14 = r2
            goto L_0x015c
        L_0x035e:
            r8 = r2
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yahoo.mobile.client.share.search.p099ui.C4189c.m17634a(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        int i2;
        this.f17079l = true;
        switch (i) {
            case -8:
            case -6:
                i2 = C4073a.C4086m.yssdk_request_error;
                break;
            default:
                i2 = C4073a.C4086m.yssdk_request_error;
                break;
        }
        m17633a(webView, i2);
        super.onReceivedError(webView, i, str, str2);
    }

    /* renamed from: a */
    private static void m17633a(WebView webView, int i) {
        View findViewById = webView.getRootView().findViewById(C4073a.C4081h.spinner_view);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        TextView textView = (TextView) webView.getRootView().findViewById(C4073a.C4081h.text_view_results_error_t1);
        if (textView != null) {
            textView.setText(i);
        }
        View findViewById2 = webView.getRootView().findViewById(C4073a.C4081h.results_error_layout);
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(C0333F.f835s);
            findViewById2.setVisibility(0);
            findViewById2.bringToFront();
        }
    }

    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        super.onReceivedLoginRequest(webView, str, str2, str3);
        m17633a(webView, C4073a.C4086m.yssdk_request_error);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        m17633a(webView, C4073a.C4086m.yssdk_request_error);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (r2.equals("sr") == false) goto L_0x0076;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.Object> m17637b(java.lang.String r5) {
        /*
            r1 = 0
            r4 = 1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r5, r2)     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            java.util.regex.Pattern r3 = f17068f     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            java.util.regex.Matcher r2 = r3.matcher(r2)     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            boolean r3 = r2.find()     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            if (r3 == 0) goto L_0x0090
            r3 = 1
            java.lang.String r2 = r2.group(r3)     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            java.lang.String r3 = "/"
            boolean r3 = r2.endsWith(r3)     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            if (r3 == 0) goto L_0x0037
            int r3 = r2.length()     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            if (r3 <= r4) goto L_0x0037
            r3 = 0
            int r4 = r2.length()     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            int r4 = r4 + -1
            java.lang.String r2 = r2.substring(r3, r4)     // Catch:{ UnsupportedEncodingException -> 0x0081 }
        L_0x0037:
            if (r2 == 0) goto L_0x007b
            r3 = 0
            byte[] r2 = android.util.Base64.decode(r2, r3)     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r2, r4)     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            java.util.regex.Pattern r2 = f17069g     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            java.util.regex.Matcher r2 = r2.matcher(r3)     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            boolean r4 = r2.matches()     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            if (r4 == 0) goto L_0x008e
            r4 = 1
            java.lang.String r2 = r2.group(r4)     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
        L_0x0056:
            java.lang.String r4 = "sch_pos"
            r0.put(r4, r2)     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            java.util.regex.Pattern r2 = f17070h     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            java.util.regex.Matcher r2 = r2.matcher(r3)     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            java.lang.String r3 = "web result"
            boolean r4 = r2.matches()     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            if (r4 == 0) goto L_0x008c
            r4 = 1
            java.lang.String r2 = r2.group(r4)     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            java.lang.String r4 = "sr"
            boolean r4 = r2.equals(r4)     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
            if (r4 != 0) goto L_0x008c
        L_0x0076:
            java.lang.String r3 = "sch_type"
            r0.put(r3, r2)     // Catch:{ IllegalArgumentException -> 0x007c, UnsupportedEncodingException -> 0x0087 }
        L_0x007b:
            return r0
        L_0x007c:
            r2 = move-exception
            r2.getMessage()     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            goto L_0x007b
        L_0x0081:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r1
            goto L_0x007b
        L_0x0087:
            r2 = move-exception
            r2.getMessage()     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            goto L_0x007b
        L_0x008c:
            r2 = r3
            goto L_0x0076
        L_0x008e:
            r2 = r1
            goto L_0x0056
        L_0x0090:
            r2 = r1
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yahoo.mobile.client.share.search.p099ui.C4189c.m17637b(java.lang.String):java.util.Map");
    }
}
