package com.cootek.smartinput5.func.nativeads;

import android.content.Context;
import android.widget.ImageView;
import com.cootek.smartinput5.func.paopaopanel.C1932a;
import com.emoji.keyboard.touchpal.R;
import com.facebook.ads.C3345i;
import com.facebook.ads.C3509x;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.nativeads.k */
/* compiled from: FacebookNativeAds */
public class C1886k extends C1875a {

    /* renamed from: g */
    private C3509x f6273g;

    /* renamed from: h */
    private C1932a f6274h;

    public C1886k(C3509x xVar) {
        this.f6273g = xVar;
    }

    /* renamed from: a */
    public C1932a mo6995a(Context context) {
        if (this.f6273g == null) {
            return null;
        }
        if (this.f6274h == null) {
            this.f6274h = new C1932a(context, this.f6257e.f6440f, this.f6273g.mo10874l());
        }
        this.f6274h.f6624d = this.f6273g.mo10868f();
        this.f6274h.f6625e = context.getResources().getDrawable(R.drawable.ads_gift);
        this.f6274h.f6626f = this.f6257e.f6439e;
        this.f6273g.mo10877o();
        this.f6273g.mo10860a(this.f6274h.mo8981f());
        this.f6273g.mo10862a((C3345i) new C1887l(this, context));
        mo6997a(this.f6274h.mo7114a());
        mo6999b(context);
        return this.f6274h;
    }

    /* renamed from: b */
    public void mo6999b(Context context) {
    }

    /* renamed from: c */
    public void mo7001c(Context context) {
    }

    /* renamed from: a */
    public JSONObject mo6996a() {
        return null;
    }

    /* renamed from: b */
    public void mo6998b() {
    }

    /* renamed from: a */
    public void mo6997a(ImageView imageView) {
        if (this.f6273g != null) {
            C3509x.m15264a(this.f6273g.mo10866d(), imageView);
        }
    }

    /* renamed from: c */
    public int mo7000c() {
        return 1;
    }

    /* renamed from: d */
    public C3509x mo7019d() {
        return this.f6273g;
    }
}
