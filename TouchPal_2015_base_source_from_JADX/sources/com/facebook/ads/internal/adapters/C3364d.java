package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.p001v4.content.C0213m;
import com.facebook.ads.C3344h;

/* renamed from: com.facebook.ads.internal.adapters.d */
public class C3364d extends BroadcastReceiver {

    /* renamed from: a */
    private String f14685a;

    /* renamed from: b */
    private Context f14686b;

    /* renamed from: c */
    private C3366f f14687c;

    /* renamed from: d */
    private C3365e f14688d;

    public C3364d(Context context, String str, C3365e eVar, C3366f fVar) {
        this.f14686b = context;
        this.f14685a = str;
        this.f14687c = fVar;
        this.f14688d = eVar;
    }

    /* renamed from: a */
    public void mo10622a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.ads.interstitial.impression.logged:" + this.f14685a);
        intentFilter.addAction("com.facebook.ads.interstitial.displayed:" + this.f14685a);
        intentFilter.addAction("com.facebook.ads.interstitial.dismissed:" + this.f14685a);
        intentFilter.addAction("com.facebook.ads.interstitial.clicked:" + this.f14685a);
        intentFilter.addAction("com.facebook.ads.interstitial.error:" + this.f14685a);
        C0213m.m882a(this.f14686b).mo695a(this, intentFilter);
    }

    /* renamed from: b */
    public void mo10623b() {
        try {
            C0213m.m882a(this.f14686b).mo694a((BroadcastReceiver) this);
        } catch (Exception e) {
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str = intent.getAction().split(":")[0];
        if (this.f14687c != null && str != null) {
            if ("com.facebook.ads.interstitial.clicked".equals(str)) {
                this.f14687c.mo10629a(this.f14688d, intent.getStringExtra("com.facebook.ads.interstitial.ad.click.url"), intent.getBooleanExtra("com.facebook.ads.interstitial.ad.player.handles.click", true));
            } else if ("com.facebook.ads.interstitial.dismissed".equals(str)) {
                this.f14687c.mo10632d(this.f14688d);
            } else if ("com.facebook.ads.interstitial.displayed".equals(str)) {
                this.f14687c.mo10631c(this.f14688d);
            } else if ("com.facebook.ads.interstitial.impression.logged".equals(str)) {
                this.f14687c.mo10630b(this.f14688d);
            } else if ("com.facebook.ads.interstitial.error".equals(str)) {
                this.f14687c.mo10628a(this.f14688d, C3344h.f14641j);
            }
        }
    }
}
