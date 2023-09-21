package com.cootek.smartinput5.func.p052b;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1465au;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.func.b.a */
/* compiled from: LangData */
public class C1498a {

    /* renamed from: a */
    public static final int f4722a = 0;

    /* renamed from: b */
    public static final int f4723b = 1;

    /* renamed from: c */
    public static final int f4724c = 2;

    /* renamed from: d */
    public static final int f4725d = 3;

    /* renamed from: e */
    public static final int f4726e = 0;

    /* renamed from: f */
    public final String f4727f;

    /* renamed from: g */
    public String f4728g;

    /* renamed from: h */
    public String f4729h;

    /* renamed from: i */
    public boolean f4730i;

    /* renamed from: j */
    public boolean f4731j;

    /* renamed from: k */
    public String f4732k;

    /* renamed from: l */
    public int f4733l;

    /* renamed from: m */
    public String f4734m;

    /* renamed from: n */
    public boolean f4735n;

    /* renamed from: o */
    public final int f4736o;

    /* renamed from: p */
    public boolean f4737p;

    /* renamed from: q */
    public String f4738q;

    /* renamed from: r */
    public String f4739r;

    /* renamed from: s */
    public C1443as f4740s;

    /* renamed from: t */
    private boolean f4741t;

    /* renamed from: u */
    private int f4742u;

    /* renamed from: v */
    private Context f4743v;

    public C1498a(Context context, C1550c cVar) {
        this(context, cVar.mo6190a(), cVar.mo6191a(context), cVar.mo6192b(context), cVar.mo6193c(context), cVar.mo6194d(context), cVar.mo6146b());
    }

    public C1498a(Context context, String str, String str2, String str3, String str4, String str5, int i) {
        this(context, str, str2, str3, str4, false, false, false, (String) null, 0, false, i);
        this.f4738q = str5;
    }

    public C1498a(Context context, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, int i, boolean z4, int i2) {
        this.f4742u = 0;
        this.f4743v = context;
        this.f4727f = str;
        this.f4728g = str2;
        this.f4729h = str3;
        this.f4734m = str4;
        this.f4730i = z;
        this.f4741t = z2;
        this.f4731j = z3;
        this.f4737p = true;
        this.f4732k = str5;
        this.f4733l = i;
        this.f4735n = z4;
        this.f4736o = i2;
    }

    /* renamed from: a */
    public void mo6150a(int i) {
        this.f4742u = i;
    }

    /* renamed from: a */
    public int mo6149a() {
        return this.f4742u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6152b() {
        this.f4739r = null;
        this.f4740s = null;
        this.f4737p = true;
    }

    /* renamed from: c */
    public String mo6153c() {
        return this.f4728g;
    }

    /* renamed from: d */
    public String mo6154d() {
        if (this.f4729h == null) {
            return "";
        }
        return this.f4729h;
    }

    /* renamed from: e */
    public boolean mo6155e() {
        return !this.f4743v.getPackageName().equals(this.f4739r);
    }

    /* renamed from: f */
    public boolean mo6156f() {
        return this.f4737p;
    }

    /* renamed from: g */
    public boolean mo6157g() {
        return !mo6155e() || !TextUtils.isEmpty(this.f4739r);
    }

    /* renamed from: h */
    public boolean mo6158h() {
        return mo6157g() && Settings.getInstance().isLanguageEnabled(this.f4727f);
    }

    /* renamed from: a */
    public void mo6151a(boolean z) {
        Settings.getInstance().setLanguageEnabled(this.f4727f, z);
    }

    /* renamed from: i */
    public String mo6159i() {
        if (this.f4733l != 0) {
            return String.valueOf(this.f4733l);
        }
        return null;
    }

    /* renamed from: j */
    public String mo6160j() {
        return this.f4739r;
    }

    /* renamed from: k */
    public Context mo6161k() {
        return (C1465au) this.f4740s;
    }

    /* renamed from: l */
    public boolean mo6162l() {
        return C1584bI.m7147b(this.f4743v, this.f4739r);
    }

    /* renamed from: m */
    public boolean mo6163m() {
        return this.f4741t;
    }
}
