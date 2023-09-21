package com.yahoo.mobile.client.share.search.p099ui;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

@TargetApi(8)
/* renamed from: com.yahoo.mobile.client.share.search.ui.b */
public final class C4188b extends WebChromeClient {

    /* renamed from: a */
    private SearchWebViewCallback f17067a;

    public C4188b(SearchWebViewCallback searchWebViewCallback) {
        this.f17067a = searchWebViewCallback;
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        new StringBuilder("Javascript alert ").append(str).append(" message: ").append(str2).append(" View URL: ").append(webView.getUrl());
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public final void onProgressChanged(WebView webView, int i) {
        this.f17067a.onProgressChanged(i);
    }

    public final void onReceivedTitle(WebView webView, String str) {
        this.f17067a.onReceivedTitle(str);
    }

    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        this.f17067a.onReceivedIcon(bitmap);
    }

    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        new StringBuilder("onReceivedTouchIconUrl ").append(str);
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        callback.invoke(str, true, false);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        new StringBuilder().append(consoleMessage.message()).append(" -- From line ").append(consoleMessage.lineNumber()).append(" of ").append(consoleMessage.sourceId());
        return false;
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f17067a.showCustomView(view, customViewCallback);
    }

    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f17067a.showCustomView(view, i, customViewCallback);
    }

    public final void onHideCustomView() {
        this.f17067a.onHideCustomView();
    }
}
