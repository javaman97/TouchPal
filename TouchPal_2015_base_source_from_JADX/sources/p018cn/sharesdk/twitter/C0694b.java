package p018cn.sharesdk.twitter;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.plugin.twitter.C2409j;
import p018cn.sharesdk.framework.authorize.C0622b;
import p018cn.sharesdk.framework.authorize.C0627g;
import p018cn.sharesdk.framework.utils.C0661R;

/* renamed from: cn.sharesdk.twitter.b */
public class C0694b extends C0622b {
    public C0694b(C0627g gVar) {
        super(gVar);
    }

    /* renamed from: a */
    public void mo2627a(String str) {
        String a = C0697e.m3922a(this.f1487a.mo2254a().getPlatform()).mo2630a(str);
        if (a != null && a.length() > 0) {
            String[] split = a.split(C2261Q.f9808n);
            Bundle bundle = new Bundle();
            for (String str2 : split) {
                if (str2 != null) {
                    String[] split2 = str2.split("=");
                    if (split2.length >= 2) {
                        bundle.putString(split2[0], split2[1]);
                    }
                }
            }
            if (bundle == null || bundle.size() <= 0) {
                if (this.f1489c != null) {
                    this.f1489c.onError(new Throwable());
                }
            } else if (this.f1489c != null) {
                this.f1489c.onComplete(bundle);
            }
        } else if (this.f1489c != null) {
            this.f1489c.onError(new Throwable());
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f1488b != null && str.startsWith(this.f1488b)) {
            webView.stopLoading();
            this.f1487a.finish();
            new C0696d(this, String.valueOf(C0661R.urlToBundle(str).get(C2409j.f10557o))).start();
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f1488b == null || !str.startsWith(this.f1488b)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        webView.stopLoading();
        this.f1487a.finish();
        new C0695c(this, String.valueOf(C0661R.urlToBundle(str).get(C2409j.f10557o))).start();
        return true;
    }
}
