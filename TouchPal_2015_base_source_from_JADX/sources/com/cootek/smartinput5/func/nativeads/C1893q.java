package com.cootek.smartinput5.func.nativeads;

import com.cootek.smartinput5.func.nativeads.C1896t;

/* renamed from: com.cootek.smartinput5.func.nativeads.q */
/* compiled from: NativeAdsJsHandler */
class C1893q implements C1896t.C1897a {

    /* renamed from: a */
    final /* synthetic */ NativeAdsJsHandler f6339a;

    C1893q(NativeAdsJsHandler nativeAdsJsHandler) {
        this.f6339a = nativeAdsJsHandler;
    }

    /* renamed from: a */
    public void mo7030a(C1900w wVar) {
        String unused = this.f6339a.mNativeAds = wVar.mo6082a();
        boolean unused2 = this.f6339a.mNativeAdsLoading = false;
        this.f6339a.onNativeAdsAdded(this.f6339a.mNativeAds);
    }

    /* renamed from: a */
    public void mo7031a(String str) {
        if (str != null) {
            this.f6339a.mWebView.loadUrl(String.format("javascript:JSNativeAds.%s(\"%s\")", new Object[]{"onNativeAdsRequestFailed", str}));
        }
    }
}
