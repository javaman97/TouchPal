package p018cn.sharesdk.framework.authorize;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import p018cn.sharesdk.framework.C0655j;

/* renamed from: cn.sharesdk.framework.authorize.b */
public abstract class C0622b extends C0655j {

    /* renamed from: a */
    protected C0627g f1487a;

    /* renamed from: b */
    protected String f1488b;

    /* renamed from: c */
    protected AuthorizeListener f1489c;

    public C0622b(C0627g gVar) {
        this.f1487a = gVar;
        AuthorizeHelper a = gVar.mo2254a();
        this.f1488b = a.getRedirectUri();
        this.f1489c = a.getAuthorizeListener();
    }

    /* renamed from: a */
    public String mo2256a() {
        return "AuthClient";
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.stopLoading();
        AuthorizeListener authorizeListener = this.f1487a.mo2254a().getAuthorizeListener();
        this.f1487a.finish();
        if (authorizeListener != null) {
            authorizeListener.onError(new Throwable(str + " (" + i + "): " + str2));
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.proceed();
    }
}
