package p018cn.sharesdk.sina.weibo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.net.cmd.C2250J;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.authorize.C0622b;
import p018cn.sharesdk.framework.authorize.C0627g;
import p018cn.sharesdk.framework.utils.C0661R;

/* renamed from: cn.sharesdk.sina.weibo.b */
public class C0688b extends C0622b {

    /* renamed from: d */
    private boolean f1664d;

    public C0688b(C0627g gVar) {
        super(gVar);
    }

    /* renamed from: a */
    private void m3881a(Platform platform, String str) {
        new C0689c(this, platform, str).start();
    }

    /* renamed from: b */
    private Intent m3882b(String str) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", "");
        intent.setFlags(Engine.EXCEPTION_ERROR);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2608a(String str) {
        if (!this.f1664d) {
            this.f1664d = true;
            Bundle urlToBundle = C0661R.urlToBundle(str);
            String string = urlToBundle.getString("error");
            String string2 = urlToBundle.getString(C2250J.f9627c);
            if (this.f1489c == null) {
                return;
            }
            if (string == null && string2 == null) {
                String string3 = urlToBundle.getString("code");
                if (TextUtils.isEmpty(string3)) {
                    this.f1489c.onError(new Throwable("Authorize code is empty"));
                }
                m3881a(this.f1487a.mo2254a().getPlatform(), string3);
            } else if (string.equals("access_denied")) {
                this.f1489c.onCancel();
            } else {
                this.f1489c.onError(new Throwable(string + " (" + Integer.parseInt(string2) + ")"));
            }
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (str.startsWith(this.f1488b)) {
            webView.stopLoading();
            this.f1487a.finish();
            mo2608a(str);
        } else if (str.startsWith("sms:")) {
            String substring = str.substring(4);
            try {
                Intent b = m3882b(substring);
                b.setPackage("com.android.mms");
                webView.getContext().startActivity(b);
            } catch (Throwable th) {
                if (this.f1489c != null) {
                    this.f1489c.onError(th);
                }
            }
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f1488b)) {
            webView.stopLoading();
            this.f1487a.finish();
            mo2608a(str);
            return true;
        } else if (!str.startsWith("sms:")) {
            return super.shouldOverrideUrlLoading(webView, str);
        } else {
            String substring = str.substring(4);
            try {
                Intent b = m3882b(substring);
                b.setPackage("com.android.mms");
                webView.getContext().startActivity(b);
                return true;
            } catch (Throwable th) {
                if (this.f1489c == null) {
                    return true;
                }
                this.f1489c.onError(th);
                return true;
            }
        }
    }
}
