package com.cootek.smartinput5.net;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cootek.nativejsapis.DeviceInfo;
import com.cootek.nativejsapis.NativeLocalStorage;
import com.cootek.smartinput.utilities.TJavascriptHandler;
import com.cootek.smartinput5.action.ActionStopShareSDK;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1600bf;
import com.cootek.smartinput5.func.IMEJsHandler;
import com.cootek.smartinput5.func.nativeads.NativeAdsJsHandler;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

public class TWebView extends WebView {

    /* renamed from: a */
    private static final int f9262a = 0;

    /* renamed from: b */
    private static final int f9263b = 1;

    /* renamed from: c */
    private static final int f9264c = 2;

    /* renamed from: d */
    private Context f9265d;

    /* renamed from: e */
    private IPCManager f9266e;

    /* renamed from: f */
    private TJavascriptHandler f9267f;

    /* renamed from: g */
    private JsCallBackHandler f9268g = new JsCallBackHandler();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ProgressDialog f9269h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public DialogInterface.OnCancelListener f9270i;

    /* renamed from: j */
    private C2194a f9271j;

    /* renamed from: k */
    private long f9272k;

    /* renamed from: l */
    private String f9273l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Handler f9274m = new C2217ae(this);

    /* renamed from: com.cootek.smartinput5.net.TWebView$c */
    public interface C2196c {
        /* renamed from: a */
        void mo7714a();

        /* renamed from: b */
        void mo7715b();
    }

    /* renamed from: com.cootek.smartinput5.net.TWebView$a */
    public class C2194a extends WebChromeClient {
        public C2194a() {
        }

        public void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                TWebView.this.mo7700d();
            }
            super.onProgressChanged(webView, i);
        }
    }

    /* renamed from: com.cootek.smartinput5.net.TWebView$b */
    public class C2195b extends WebViewClient {
        public C2195b() {
        }

        @TargetApi(11)
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebResourceResponse a = C2228ao.m10094a().mo7755a(webView.getContext(), Uri.parse(str).getLastPathSegment());
            return a != null ? a : super.shouldInterceptRequest(webView, str);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            Context context = webView.getContext();
            if (context != null) {
                try {
                    context.startActivity(intent);
                } catch (Exception e) {
                    return false;
                }
            }
            return true;
        }
    }

    public class JsCallBackHandler {
        private C2196c mWebPageStatusListener = null;

        public JsCallBackHandler() {
        }

        public void setWebPageStatusListener(C2196c cVar) {
            this.mWebPageStatusListener = cVar;
        }

        public void dismissMaskUntilModulesLoaded() {
            if (this.mWebPageStatusListener != null) {
                this.mWebPageStatusListener.mo7714a();
            }
        }

        public void onModulesLoaded() {
            if (this.mWebPageStatusListener != null) {
                this.mWebPageStatusListener.mo7715b();
            }
        }
    }

    public TWebView(Context context) {
        super(context);
        this.f9265d = context;
        m9890f();
    }

    public TWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9265d = context;
        m9890f();
    }

    /* renamed from: f */
    private void m9890f() {
        try {
            m9891g();
        } catch (Exception e) {
        }
    }

    /* renamed from: g */
    private void m9891g() {
        setScrollBarStyle(0);
        getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        getSettings().setJavaScriptEnabled(true);
        m9885a(getSettings());
        setWebViewClient(new C2195b());
        setIWebChromeClient(new C2194a());
        this.f9267f = new TJavascriptHandler(this.f9265d, this);
        if (this.f9265d instanceof Activity) {
            this.f9267f.setActivity((Activity) this.f9265d);
        }
        addJavascriptInterface(this.f9267f, "CTKJavaScriptHandler");
        addJavascriptInterface(new DeviceInfo(this.f9265d), "CTKDeviceInfo");
        addJavascriptInterface(new NativeLocalStorage(this.f9265d, C1466av.f4714w), "CTKNativeLocalStorage");
        addJavascriptInterface(this.f9268g, "CallBackHandler");
        NativeAdsJsHandler.getInstance().setWebView(this);
        addJavascriptInterface(NativeAdsJsHandler.getInstance(), "CTKNativeAds");
        IMEJsHandler.getInstance().setWebView(this);
        addJavascriptInterface(IMEJsHandler.getInstance(), "IMEHandler");
        this.f9269h = new ProgressDialog(this.f9265d);
        this.f9269h.setProgressStyle(0);
        this.f9269h.setMessage(C1974m.m9063a(getContext(), (int) R.string.loading));
        this.f9269h.setCanceledOnTouchOutside(false);
        this.f9269h.setOnCancelListener(new C2218af(this));
    }

    @TargetApi(7)
    /* renamed from: a */
    private void m9885a(WebSettings webSettings) {
        if (Build.VERSION.SDK_INT >= 7) {
            webSettings.setDomStorageEnabled(true);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            Class<WebView> cls = WebView.class;
            try {
                cls.getMethod("setWebContentsDebuggingEnabled", new Class[]{Boolean.TYPE}).invoke((Object) null, new Object[]{true});
            } catch (Exception e) {
            }
        }
    }

    public void setIPCManager(IPCManager iPCManager) {
        this.f9266e = iPCManager;
        if (this.f9267f != null) {
            this.f9267f.setIPCManager(iPCManager);
        }
        IMEJsHandler.getInstance().setIPCManager(iPCManager);
        NativeAdsJsHandler.getInstance().setIPCManager(iPCManager);
    }

    public void setActivity(Activity activity) {
        if (this.f9267f != null) {
            this.f9267f.setActivity(activity);
        }
    }

    /* renamed from: a */
    public boolean mo7697a() {
        if (this.f9267f == null || !this.f9267f.handleBackpress()) {
            return false;
        }
        this.f9267f.disableBackpressHandler();
        return true;
    }

    /* renamed from: b */
    public boolean mo7698b() {
        if (this.f9267f == null || !this.f9267f.handleOnResume()) {
            return false;
        }
        return true;
    }

    public void setIWebChromeClient(C2194a aVar) {
        if (aVar != null) {
            this.f9271j = aVar;
        } else {
            this.f9271j = new C2194a();
        }
        setWebChromeClient(this.f9271j);
    }

    /* renamed from: a */
    public void mo7696a(String str) {
        this.f9273l = str;
        this.f9272k = System.currentTimeMillis();
        mo7699c();
        new C2219ag(this, str).start();
    }

    public void loadUrl(String str) {
        this.f9273l = str;
        this.f9272k = System.currentTimeMillis();
        m9888b(C2232as.m10118a().mo7758a(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9888b(String str) {
        try {
            super.loadUrl(str);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        mo7702e();
        this.f9274m = null;
        this.f9267f = null;
        if (this.f9269h.isShowing()) {
            this.f9269h.dismiss();
        }
        this.f9269h = null;
        super.destroy();
    }

    public void setOnProgressCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.f9270i = onCancelListener;
    }

    /* renamed from: c */
    public void mo7699c() {
        this.f9274m.removeMessages(0);
        this.f9274m.sendEmptyMessage(0);
    }

    /* renamed from: d */
    public void mo7700d() {
        this.f9274m.removeMessages(0);
        this.f9274m.sendEmptyMessage(1);
    }

    /* renamed from: e */
    public void mo7702e() {
        C1600bf.m7225b(this.f9265d);
        if (this.f9266e != null) {
            try {
                this.f9266e.sendMessageForParcelableAction(new ActionStopShareSDK());
            } catch (RemoteException e) {
            }
        }
    }

    public void setWebPageStatusListener(C2196c cVar) {
        this.f9268g.setWebPageStatusListener(cVar);
    }
}
