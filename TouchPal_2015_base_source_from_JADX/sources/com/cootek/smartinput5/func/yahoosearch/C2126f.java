package com.cootek.smartinput5.func.yahoosearch;

import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.f */
/* compiled from: BrowserActivity */
class C2126f extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ BrowserActivity f9070a;

    C2126f(BrowserActivity browserActivity) {
        this.f9070a = browserActivity;
    }

    public void onReceivedTitle(WebView webView, String str) {
        if (!TextUtils.isEmpty(str)) {
            String unused = this.f9070a.f9034o = str;
            if (this.f9070a.f9035p == null) {
                TextView unused2 = this.f9070a.f9035p = (TextView) this.f9070a.findViewById(R.id.title);
            }
            this.f9070a.f9035p.setText(this.f9070a.f9034o);
            boolean unused3 = this.f9070a.f9043x = true;
            this.f9070a.f9033A.sendEmptyMessage(2);
        }
    }
}
