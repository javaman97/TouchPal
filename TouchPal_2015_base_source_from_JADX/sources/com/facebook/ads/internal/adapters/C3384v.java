package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.C3344h;
import com.facebook.ads.C3509x;
import com.facebook.ads.internal.p077h.C3438g;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.v */
public class C3384v extends C3351A {

    /* renamed from: a */
    private Context f14742a;

    /* renamed from: b */
    private C3352B f14743b;

    /* renamed from: c */
    private C3387y f14744c;

    /* renamed from: a */
    public void mo10583a(int i) {
        if (this.f14744c != null) {
            this.f14744c.mo10655a(i);
        }
    }

    /* renamed from: a */
    public void mo10584a(Context context, C3352B b, Map<String, Object> map) {
        this.f14744c = C3387y.m14901a("com.facebook.ads.internal.adapters.FacebookNativeAdapter", (JSONObject) map.get("data"));
        this.f14742a = context;
        this.f14743b = b;
        if (this.f14744c == null || C3438g.m15059a(context, (C3367g) this.f14744c)) {
            this.f14743b.mo10601a(this, C3344h.f14638g);
        } else if (this.f14743b != null) {
            this.f14743b.mo10600a(this);
        }
    }

    /* renamed from: a */
    public void mo10585a(Map<String, Object> map) {
        if (this.f14744c != null) {
            this.f14744c.mo10657a(map);
        }
    }

    /* renamed from: b */
    public void mo10602b() {
    }

    /* renamed from: b */
    public void mo10586b(Map<String, Object> map) {
        if (this.f14744c != null) {
            this.f14744c.mo10656a(this.f14742a, map);
        }
    }

    /* renamed from: c */
    public boolean mo10587c() {
        if (!mo10599o()) {
            return false;
        }
        return this.f14744c.mo10666l();
    }

    /* renamed from: d */
    public C3509x.C3510a mo10588d() {
        if (!mo10599o()) {
            return null;
        }
        return this.f14744c.mo10658d();
    }

    /* renamed from: e */
    public C3509x.C3510a mo10589e() {
        if (!mo10599o()) {
            return null;
        }
        return this.f14744c.mo10659e();
    }

    /* renamed from: f */
    public String mo10590f() {
        if (!mo10599o()) {
            return null;
        }
        return this.f14744c.mo10660f();
    }

    /* renamed from: g */
    public String mo10591g() {
        if (!mo10599o()) {
            return null;
        }
        return this.f14744c.mo10661g();
    }

    /* renamed from: h */
    public String mo10592h() {
        if (!mo10599o()) {
            return null;
        }
        return this.f14744c.mo10662h();
    }

    /* renamed from: i */
    public String mo10593i() {
        if (!mo10599o()) {
            return null;
        }
        return this.f14744c.mo10663i();
    }

    /* renamed from: j */
    public String mo10594j() {
        if (!mo10599o()) {
            return null;
        }
        return this.f14744c.mo10664j();
    }

    /* renamed from: k */
    public C3509x.C3512c mo10595k() {
        if (!mo10599o()) {
            return null;
        }
        return this.f14744c.mo10665k();
    }

    /* renamed from: l */
    public String mo10596l() {
        if (!mo10599o()) {
            return null;
        }
        return this.f14744c.mo10667m();
    }

    /* renamed from: m */
    public C3509x.C3510a mo10597m() {
        if (!mo10599o()) {
            return null;
        }
        return this.f14744c.mo10668n();
    }

    /* renamed from: n */
    public String mo10598n() {
        if (!mo10599o()) {
            return null;
        }
        return this.f14744c.mo10669o();
    }

    /* renamed from: o */
    public boolean mo10599o() {
        return this.f14744c != null;
    }
}
