package com.baidu.oauth;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.weibo.net.C4057s;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

class BaiduOAuthViaDialog extends BaiduOAuthBase {
    /* access modifiers changed from: private */
    public DialogListener mAuthDialogListener;

    public interface DialogListener {
        void onCancel();

        void onComplete(Bundle bundle);

        void onException(String str);
    }

    public BaiduOAuthViaDialog(String str) {
        super(str);
    }

    public BaiduOAuthViaDialog(String str, String str2) {
        super(str, str2);
    }

    public boolean startDialogAuth(Context context, String[] strArr, final DialogListener dialogListener) {
        if (dialogListener == null) {
            return false;
        }
        CookieSyncManager.createInstance(context);
        CookieManager.getInstance().removeSessionCookie();
        CookieSyncManager.getInstance().sync();
        this.mAuthDialogListener = dialogListener;
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            this.mAuthDialogListener.onException("Application requires permission to access the Internet");
        }
        dialog(context, strArr, new DialogListener() {
            public void onComplete(Bundle bundle) {
                CookieSyncManager.getInstance().sync();
                BaiduOAuthViaDialog.this.setAccessToken(bundle.getString("access_token"));
                BaiduOAuthViaDialog.this.setAccessExpiresIn(bundle.getString(C4057s.f16527i));
                BaiduOAuthViaDialog.this.setmSessionKey(bundle.getString("session_key"));
                BaiduOAuthViaDialog.this.setmSessionSecret(bundle.getString("session_secret"));
                if (BaiduOAuthViaDialog.this.IsSessionValid()) {
                    dialogListener.onComplete(bundle);
                } else {
                    dialogListener.onException("access_token not valid");
                }
            }

            public void onException(String str) {
                BaiduOAuthViaDialog.this.mAuthDialogListener.onException(str);
            }

            public void onCancel() {
                dialogListener.onCancel();
            }
        });
        return true;
    }

    public boolean startDialogAuth(Context context, DialogListener dialogListener) {
        return startDialogAuth(context, new String[0], dialogListener);
    }

    private void dialog(Context context, String[] strArr, DialogListener dialogListener) {
        dialog(context, strArr, (String) null, dialogListener);
    }

    private void dialog(Context context, String[] strArr, String str, DialogListener dialogListener) {
        String str2;
        String str3;
        if (strArr.length > 0) {
            str2 = "&scope=" + TextUtils.join(" ", strArr);
        } else {
            str2 = "";
        }
        if (str == null || str.length() <= 0) {
            str3 = String.valueOf(AUTH_URL) + "&client_id=" + getConsumerKey();
        } else {
            str3 = String.valueOf(EXPLICIT_AUTH_URL) + "&client_id=" + getConsumerKey() + ("&third_access_token=" + str);
        }
        if (str2.length() != 0) {
            str3 = String.valueOf(str3) + str2;
        }
        new OAuthWebViewDlg(context, str3, dialogListener).show();
    }

    public class OAuthWebViewDlg extends Dialog {
        private FrameLayout mContent;
        /* access modifiers changed from: private */
        public DialogListener mListener;
        /* access modifiers changed from: private */
        public ProgressDialog mSpinner;
        private String mUrl;
        private WebView mWebView;

        protected OAuthWebViewDlg(Context context, String str, DialogListener dialogListener) {
            super(context, 16973833);
            this.mUrl = str;
            this.mListener = dialogListener;
            getWindow().setSoftInputMode(32);
        }

        /* access modifiers changed from: protected */
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.mSpinner = new ProgressDialog(getContext());
            this.mSpinner.requestWindowFeature(1);
            requestWindowFeature(1);
            this.mContent = new FrameLayout(getContext());
            setUpWebView(10);
            setContentView(this.mContent);
        }

        private void setUpWebView(int i) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.mWebView = new WebView(getContext());
            this.mWebView.setVerticalScrollBarEnabled(false);
            this.mWebView.setHorizontalScrollBarEnabled(false);
            this.mWebView.setWebViewClient(new OAuthWebViewClient());
            this.mWebView.getSettings().setJavaScriptEnabled(true);
            this.mWebView.loadUrl(this.mUrl);
            this.mWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.mWebView.getSettings().setUseWideViewPort(true);
            this.mWebView.getSettings().setLoadWithOverviewMode(true);
            linearLayout.setPadding(i, i, i, i);
            linearLayout.addView(this.mWebView);
            this.mContent.addView(linearLayout);
        }

        public void onBackPressed() {
            if (this.mWebView.canGoBack()) {
                this.mWebView.goBack();
            } else {
                this.mListener.onCancel();
            }
            super.onBackPressed();
        }

        public class OAuthWebViewClient extends WebViewClient {
            public OAuthWebViewClient() {
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (!str.contains("error")) {
                    return false;
                }
                OAuthWebViewDlg.this.mListener.onException(str.split("=")[1]);
                OAuthWebViewDlg.this.mSpinner.dismiss();
                OAuthWebViewDlg.this.dismiss();
                return true;
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                OAuthWebViewDlg.this.mListener.onException(str);
                OAuthWebViewDlg.this.mSpinner.dismiss();
                OAuthWebViewDlg.this.dismiss();
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (str.contains("authorize?response_type=token") && !OAuthWebViewDlg.this.mSpinner.isShowing() && OAuthWebViewDlg.this.isShowing()) {
                    OAuthWebViewDlg.this.mSpinner.show();
                }
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (OAuthWebViewDlg.this.mSpinner.isShowing()) {
                    OAuthWebViewDlg.this.mSpinner.dismiss();
                }
                if (str.contains(BaiduOAuthBase.SUCCESS_URL)) {
                    OAuthWebViewDlg.this.mListener.onComplete(BaiduOAuthViaDialog.this.parseUrl(str));
                    OAuthWebViewDlg.this.dismiss();
                }
            }

            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                sslErrorHandler.proceed();
            }
        }
    }

    /* access modifiers changed from: private */
    public Bundle parseUrl(String str) {
        try {
            URL url = new URL(str);
            Bundle decodeUrl = decodeUrl(url.getQuery());
            decodeUrl.putAll(decodeUrl(url.getRef()));
            return decodeUrl;
        } catch (MalformedURLException e) {
            return new Bundle();
        }
    }

    private Bundle decodeUrl(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String split : str.split(C2261Q.f9808n)) {
                String[] split2 = split.split("=");
                try {
                    bundle.putString(URLDecoder.decode(split2[0]), URLDecoder.decode(split2[1]));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return bundle;
    }
}
