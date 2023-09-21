package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;
import com.facebook.ads.C3344h;
import com.facebook.ads.C3505t;
import com.facebook.ads.internal.adapters.p070a.C3358e;
import com.facebook.ads.internal.p077h.C3438g;
import com.facebook.ads.internal.p077h.C3442i;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.t */
public class C3382t extends C3365e {

    /* renamed from: a */
    private final String f14730a = UUID.randomUUID().toString();

    /* renamed from: b */
    private Context f14731b;

    /* renamed from: c */
    private boolean f14732c;

    /* renamed from: d */
    private int f14733d;

    /* renamed from: e */
    private int f14734e;

    /* renamed from: f */
    private boolean f14735f;

    /* renamed from: g */
    private C3364d f14736g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3366f f14737h;

    /* renamed from: i */
    private boolean f14738i = false;

    /* renamed from: j */
    private C3385w f14739j;

    /* renamed from: k */
    private WebView f14740k;

    /* renamed from: a */
    private void m14860a(C3385w wVar) {
        if (wVar != null) {
            this.f14740k = new WebView(this.f14731b);
            this.f14740k.setWebChromeClient(new C3383u(this));
            this.f14740k.loadDataWithBaseURL(C3442i.m15073a(), wVar.mo10645d(), "text/html", "utf-8", (String) null);
        }
    }

    /* renamed from: a */
    public void mo10625a(Context context, C3366f fVar, Map<String, Object> map) {
        this.f14731b = context;
        this.f14737h = fVar;
        this.f14739j = C3385w.m14883a("com.facebook.ads.internal.FacebookInterstitialAdapter", (JSONObject) map.get("data"));
        if (C3438g.m15059a(context, (C3367g) this.f14739j)) {
            fVar.mo10628a(this, C3344h.f14638g);
            return;
        }
        this.f14736g = new C3364d(context, this.f14730a, this, this.f14737h);
        this.f14736g.mo10622a();
        this.f14738i = true;
        Map<String, String> h = this.f14739j.mo10649h();
        if (h.containsKey("is_tablet")) {
            this.f14732c = Boolean.parseBoolean(h.get("is_tablet"));
        }
        if (h.containsKey("ad_height")) {
            this.f14733d = Integer.parseInt(h.get("ad_height"));
        }
        if (h.containsKey("ad_width")) {
            this.f14734e = Integer.parseInt(h.get("ad_width"));
        }
        if (h.containsKey("native_close")) {
            this.f14735f = Boolean.valueOf(h.get("native_close")).booleanValue();
        }
        if (h.containsKey("preloadMarkup") && Boolean.parseBoolean(h.get("preloadMarkup"))) {
            m14860a(this.f14739j);
        } else if (this.f14737h != null) {
            this.f14737h.mo10627a(this);
        }
    }

    /* renamed from: b */
    public void mo10602b() {
        if (this.f14736g != null) {
            this.f14736g.mo10623b();
        }
        if (this.f14740k != null) {
            C3442i.m15077a(this.f14740k);
            this.f14740k.destroy();
            this.f14740k = null;
        }
    }

    /* renamed from: c */
    public boolean mo10626c() {
        if (!this.f14738i) {
            if (this.f14737h != null) {
                this.f14737h.mo10628a(this, C3344h.f14641j);
            }
            return false;
        }
        Intent intent = new Intent(this.f14731b, C3505t.class);
        this.f14739j.mo10644a(intent);
        Display defaultDisplay = ((WindowManager) this.f14731b.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        intent.putExtra("displayRotation", defaultDisplay.getRotation());
        intent.putExtra("displayWidth", displayMetrics.widthPixels);
        intent.putExtra("displayHeight", displayMetrics.heightPixels);
        intent.putExtra("isTablet", this.f14732c);
        intent.putExtra("adHeight", this.f14733d);
        intent.putExtra("adWidth", this.f14734e);
        intent.putExtra("adInterstitialUniqueId", this.f14730a);
        intent.putExtra("useNativeCloseButton", this.f14735f);
        intent.putExtra(C3505t.f15157a, C3358e.C3361b.DISPLAY);
        this.f14731b.startActivity(intent);
        return true;
    }
}
