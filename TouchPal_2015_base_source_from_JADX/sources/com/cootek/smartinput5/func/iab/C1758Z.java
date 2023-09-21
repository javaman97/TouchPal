package com.cootek.smartinput5.func.iab;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import com.cootek.smartinput5.net.TWebView;

/* renamed from: com.cootek.smartinput5.func.iab.Z */
/* compiled from: PurchaseChannelChooseActivity */
class C1758Z extends TWebView.C2195b {

    /* renamed from: a */
    final /* synthetic */ PurchaseChannelChooseActivity f5731a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1758Z(PurchaseChannelChooseActivity purchaseChannelChooseActivity, TWebView tWebView) {
        super();
        this.f5731a = purchaseChannelChooseActivity;
        tWebView.getClass();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f5731a.handleSpecialUrl(str)) {
            return true;
        }
        return false;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        boolean z = true;
        if (str != null && str.contains(this.f5731a.mPurchaseUrl)) {
            z = false;
        }
        if (z) {
            this.f5731a.showOverrideProgress(new C1761aa(this));
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f5731a.hideOverrideProgress();
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (str2 != null && str2.contains(this.f5731a.mPurchaseUrl)) {
            int intExtra = this.f5731a.getIntent().getIntExtra(PurchaseChannelChooseActivity.PURCHASE_GOODS_ID, 0);
            C1794k.m8274b((Context) this.f5731a, intExtra, i);
            C1779g.m8164a(intExtra, i, this.f5731a.mStartTime);
        }
    }
}
