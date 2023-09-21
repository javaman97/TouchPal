package p018cn.sharesdk.framework.authorize;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: cn.sharesdk.framework.authorize.d */
class C0624d extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ TextView f1491a;

    /* renamed from: b */
    final /* synthetic */ int f1492b;

    /* renamed from: c */
    final /* synthetic */ RegisterView f1493c;

    C0624d(RegisterView registerView, TextView textView, int i) {
        this.f1493c = registerView;
        this.f1491a = textView;
        this.f1492b = i;
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1491a.getLayoutParams();
        layoutParams.width = (this.f1492b * i) / 100;
        this.f1491a.setLayoutParams(layoutParams);
        if (i <= 0 || i >= 100) {
            this.f1491a.setVisibility(8);
        } else {
            this.f1491a.setVisibility(0);
        }
    }
}
