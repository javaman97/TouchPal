package com.facebook.ads.internal.p074e;

import android.content.Context;
import android.view.View;
import com.cootek.smartinput5.p045a.C1060e;
import com.facebook.ads.C3495j;
import com.facebook.ads.C3496k;
import com.facebook.ads.C3501p;
import com.facebook.ads.internal.C3395d;
import com.facebook.ads.internal.C3397e;
import com.facebook.ads.internal.C3404f;
import com.facebook.ads.internal.adapters.C3373l;
import com.facebook.ads.internal.p071b.C3390a;
import com.facebook.ads.internal.p071b.C3392b;
import com.facebook.ads.internal.p073d.C3396a;
import com.facebook.ads.internal.p076g.C3416a;
import com.facebook.ads.internal.p077h.C3430a;
import com.facebook.ads.internal.p077h.C3434d;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.e.d */
public class C3401d {

    /* renamed from: a */
    protected String f14835a;

    /* renamed from: b */
    protected String f14836b;

    /* renamed from: c */
    protected View f14837c;

    /* renamed from: d */
    protected C3416a f14838d;

    /* renamed from: e */
    protected C3390a f14839e;

    /* renamed from: f */
    public Context f14840f;

    /* renamed from: g */
    public C3392b f14841g;

    /* renamed from: h */
    Map<String, Object> f14842h;

    /* renamed from: i */
    public C3404f f14843i;

    /* renamed from: j */
    public boolean f14844j;

    /* renamed from: k */
    private C3395d f14845k;

    /* renamed from: l */
    private int f14846l;

    /* renamed from: m */
    private C3496k f14847m;

    public C3401d(Context context, String str, C3496k kVar, C3404f fVar, C3395d dVar, int i, boolean z) {
        this.f14835a = str;
        this.f14847m = kVar;
        this.f14843i = fVar;
        this.f14839e = C3390a.m14932a(fVar);
        this.f14845k = dVar;
        this.f14846l = i;
        this.f14844j = z;
        Map<String, Object> a = C3430a.m15042a();
        if (a != null) {
            this.f14842h = a;
        }
        m14959b(context);
    }

    /* renamed from: a */
    public static Map<String, String> m14958a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("VIEWABLE", "1");
        hashMap.put("SCHEMA", "json");
        hashMap.put("SDK", "android");
        hashMap.put("SDK_VERSION", C3501p.f15147f);
        hashMap.put(C1060e.f3015f, Locale.getDefault().toString());
        float f = context.getResources().getDisplayMetrics().density;
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        hashMap.put("DENSITY", String.valueOf(f));
        hashMap.put("SCREEN_WIDTH", String.valueOf((int) (((float) i) / f)));
        hashMap.put("SCREEN_HEIGHT", String.valueOf((int) (((float) i2) / f)));
        hashMap.put("IDFA", C3403e.f14862n);
        hashMap.put("IDFA_FLAG", C3403e.f14863o ? "0" : "1");
        hashMap.put("ATTRIBUTION_ID", C3403e.f14861m);
        hashMap.put("OS", "Android");
        hashMap.put("OSVERS", C3403e.f14849a);
        hashMap.put("BUNDLE", C3403e.f14852d);
        hashMap.put("APPNAME", C3403e.f14853e);
        hashMap.put("APPVERS", C3403e.f14854f);
        hashMap.put("APPBUILD", String.valueOf(C3403e.f14855g));
        hashMap.put("CARRIER", C3403e.f14856h);
        hashMap.put("MAKE", C3403e.f14850b);
        hashMap.put("MODEL", C3403e.f14851c);
        hashMap.put("COPPA", String.valueOf(C3495j.m15223c()));
        hashMap.put("SDK_CAPABILITY", C3397e.m14942b());
        return hashMap;
    }

    /* renamed from: b */
    private void m14959b(Context context) {
        this.f14840f = context;
        C3403e.m14968a(context);
        this.f14841g = new C3392b(context);
        m14960h();
    }

    /* renamed from: h */
    private void m14960h() {
        if (this.f14839e == null) {
            this.f14839e = C3390a.UNKNOWN;
        }
        switch (this.f14839e) {
            case INTERSTITIAL:
                this.f14838d = C3416a.INTERSTITIAL;
                return;
            case BANNER:
                this.f14838d = C3416a.BANNER;
                return;
            case NATIVE:
                this.f14838d = C3416a.NATIVE;
                return;
            default:
                this.f14838d = C3416a.UNKNOWN;
                return;
        }
    }

    /* renamed from: a */
    public String mo10696a() {
        return this.f14835a;
    }

    /* renamed from: b */
    public C3390a mo10697b() {
        return this.f14839e;
    }

    /* renamed from: c */
    public C3496k mo10698c() {
        return this.f14847m;
    }

    /* renamed from: d */
    public int mo10699d() {
        return this.f14846l;
    }

    /* renamed from: e */
    public boolean mo10700e() {
        return this.f14835a != null;
    }

    /* renamed from: f */
    public boolean mo10701f() {
        if (this.f14836b == null || this.f14836b.length() < 0) {
            C3396a.m14941e("No PUBLISHER_ID passed");
            return false;
        }
        try {
            return Integer.parseInt(this.f14836b) > 0;
        } catch (NumberFormatException e) {
            C3396a.m14941e("Invalid PUBLISHER_ID passed " + this.f14836b);
            return false;
        }
    }

    /* renamed from: g */
    public Map<String, String> mo10702g() {
        HashMap hashMap = new HashMap();
        if (this.f14842h != null) {
            for (Map.Entry next : this.f14842h.entrySet()) {
                hashMap.put(next.getKey(), next.getValue().toString());
            }
        }
        hashMap.remove("PLACEMENT_ID");
        hashMap.remove("PUBLISHER_ID");
        if (mo10700e()) {
            hashMap.put("PLACEMENT_ID", this.f14835a);
        } else if (mo10701f()) {
            hashMap.put("PUBLISHER_ID", this.f14836b);
        }
        if (this.f14838d != C3416a.UNKNOWN) {
            hashMap.put("PLACEMENT_TYPE", this.f14838d.toString().toLowerCase());
        } else {
            hashMap.remove("PLACEMENT_TYPE");
        }
        for (Map.Entry next2 : m14958a(this.f14840f).entrySet()) {
            hashMap.put(next2.getKey(), next2.getValue());
        }
        hashMap.remove("WIDTH");
        hashMap.remove("HEIGHT");
        if (this.f14837c != null && this.f14837c.getWidth() > 0 && this.f14837c.getHeight() > 0) {
            float f = this.f14840f.getResources().getDisplayMetrics().density;
            hashMap.put("WIDTH", String.valueOf((int) (((float) this.f14837c.getWidth()) / f)));
            hashMap.put("HEIGHT", String.valueOf((int) (((float) this.f14837c.getHeight()) / f)));
        } else if (this.f14847m != null) {
            hashMap.put("WIDTH", String.valueOf(this.f14847m.mo10840a()));
            hashMap.put("HEIGHT", String.valueOf(this.f14847m.mo10841b()));
        }
        hashMap.put("ADAPTERS", C3373l.m14834a(this.f14838d));
        if (this.f14843i != null) {
            hashMap.put("TEMPLATE_ID", String.valueOf(this.f14843i.mo10703a()));
        }
        if (this.f14845k != null) {
            hashMap.put("REQUEST_TYPE", String.valueOf(this.f14845k.mo10681a()));
        }
        if (this.f14844j) {
            hashMap.put("TEST_MODE", "1");
        }
        if (this.f14846l != 0) {
            hashMap.put("NUM_ADS_REQUESTED", String.valueOf(this.f14846l));
        }
        hashMap.put("CLIENT_EVENTS", C3434d.m15048a());
        return hashMap;
    }
}
