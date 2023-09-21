package p018cn.sharesdk.facebook;

import android.os.Bundle;
import android.webkit.WebView;
import com.cootek.smartinput5.plugin.twitter.C2409j;
import com.weibo.net.C4057s;
import p018cn.sharesdk.framework.authorize.C0622b;
import p018cn.sharesdk.framework.authorize.C0627g;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.facebook.c */
public class C0606c extends C0622b {
    public C0606c(C0627g gVar) {
        super(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2053a(String str) {
        int i;
        Bundle urlToBundle = C0661R.urlToBundle(str);
        String string = urlToBundle.getString("error");
        if (string == null) {
            string = urlToBundle.getString("error_type");
        }
        if (string == null) {
            String string2 = urlToBundle.getString("access_token");
            String string3 = urlToBundle.getString(C4057s.f16527i);
            if (this.f1489c != null) {
                Bundle bundle = new Bundle();
                bundle.putString(C2409j.f10554l, string2);
                bundle.putString(C2409j.f10553k, "");
                try {
                    i = Integer.parseInt(string3);
                } catch (Throwable th) {
                    C0666e.m3838b(th);
                    i = -1;
                }
                bundle.putInt("oauth_token_expires", i);
                this.f1489c.onComplete(bundle);
            }
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith(this.f1488b)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        webView.stopLoading();
        this.f1487a.finish();
        mo2053a(str);
        return true;
    }
}
