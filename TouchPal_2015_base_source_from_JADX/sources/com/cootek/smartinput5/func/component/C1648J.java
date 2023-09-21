package com.cootek.smartinput5.func.component;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2241C;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2295r;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.cootek.smartinput5.func.component.J */
/* compiled from: HotWordIndexer */
public class C1648J implements C2373x.C2376b {

    /* renamed from: a */
    public static final String f5346a = "com.cootek.smartinputv5.language.v5.pinyin";

    /* renamed from: b */
    public static final String f5347b = "com.cootek.smartinputv5.language.v5.english";

    /* renamed from: c */
    private static final String f5348c = "HotWordIndexer";

    /* renamed from: d */
    private static final String f5349d = "pinyin";

    /* renamed from: e */
    private static final int f5350e = 3;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static int f5351f = 30;

    /* renamed from: g */
    private static long f5352g = 3000;

    /* renamed from: h */
    private static final String[] f5353h = {f5347b, f5346a};

    /* renamed from: i */
    private static final String[] f5354i = {f5346a};

    /* renamed from: j */
    private static C1648J f5355j = null;

    /* renamed from: A */
    private Runnable f5356A = new C1653N(this);

    /* renamed from: k */
    private boolean f5357k = false;

    /* renamed from: l */
    private boolean f5358l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f5359m = true;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f5360n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f5361o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ArrayList<C2295r> f5362p = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ArrayList<String> f5363q = new ArrayList<>(3);

    /* renamed from: r */
    private Handler f5364r = new Handler();

    /* renamed from: s */
    private C2373x f5365s;

    /* renamed from: t */
    private LinkedList<C2373x> f5366t;

    /* renamed from: u */
    private int f5367u = C1368X.m6313b().getResources().getInteger(R.integer.CURRENT_DICTIONARY_TIMESTAMP);

    /* renamed from: v */
    private int f5368v = Settings.getInstance().getIntSetting(95);
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f5369w = 0;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f5370x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C1649a f5371y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public Handler f5372z = new C1650K(this);

    /* renamed from: com.cootek.smartinput5.func.component.J$a */
    /* compiled from: HotWordIndexer */
    public interface C1649a {
        /* renamed from: a */
        void mo6466a(String str, boolean z, boolean z2);

        /* renamed from: d */
        void mo6467d();

        /* renamed from: e */
        void mo6468e();

        /* renamed from: g */
        void mo6469g();

        /* renamed from: g_ */
        void mo6470g_();
    }

    /* renamed from: a */
    static /* synthetic */ int m7530a(C1648J j, int i) {
        int i2 = j.f5369w + i;
        j.f5369w = i2;
        return i2;
    }

    /* renamed from: f */
    static /* synthetic */ int m7557f(C1648J j) {
        int i = j.f5369w;
        j.f5369w = i + 1;
        return i;
    }

    /* renamed from: a */
    public static C1648J m7531a() {
        if (f5355j == null) {
            synchronized (C1648J.class) {
                if (f5355j == null) {
                    f5355j = new C1648J();
                }
            }
        }
        return f5355j;
    }

    public C1648J() {
        m7562i();
        this.f5366t = new LinkedList<>();
    }

    /* renamed from: b */
    public boolean mo6461b() {
        return this.f5357k;
    }

    /* renamed from: c */
    public boolean mo6462c() {
        return this.f5362p.size() <= 0;
    }

    /* renamed from: a */
    public void mo6460a(boolean z) {
        if (z) {
            this.f5364r.postDelayed(this.f5356A, 0);
        } else {
            this.f5364r.postDelayed(this.f5356A, f5352g);
        }
    }

    /* renamed from: d */
    public void mo6463d() {
        m7562i();
        if (Settings.getInstance().getBoolSetting(Settings.UPDATE_LIVE_WORDS)) {
            if (C1593bR.m7162a().f5076b) {
                m7542a(f5346a);
            } else if (this.f5357k) {
                m7542a(this.f5370x);
            } else {
                C2241C c = new C2241C();
                c.f9486a = C2225al.m10051a(C1368X.m6313b());
                new C2373x(c).mo8060a((C2373x.C2376b) new C1651L(this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7542a(String str) {
        C2295r rVar = new C2295r();
        rVar.f10074a = str;
        rVar.f10075b = this.f5368v;
        this.f5357k = true;
        this.f5365s = new C2373x(rVar);
        this.f5365s.mo8060a((C2373x.C2376b) this);
    }

    /* renamed from: a */
    private void m7543a(String str, String str2) {
        C2243D d = new C2243D();
        d.f9517c = str;
        d.f9518d = str2;
        d.f9519e = true;
        C2373x xVar = new C2373x(d);
        this.f5366t.add(xVar);
        xVar.mo8060a((C2373x.C2376b) new C1652M(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m7535a(ArrayList<String> arrayList) {
        String a = m7536a(arrayList, arrayList.size());
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String[] strArr = null;
        if (C1593bR.m7162a().f5075a) {
            strArr = f5353h;
        } else if (C1593bR.m7162a().f5076b) {
            strArr = f5354i;
        }
        return m7536a((ArrayList<String>) new ArrayList(Arrays.asList(strArr)), 1);
    }

    /* renamed from: a */
    private String m7536a(ArrayList<String> arrayList, int i) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String next = it.next();
            String[] split = next.split("\\.");
            String str = "";
            if (split.length > 0) {
                str = split[split.length - 1];
            }
            if ("pinyin".equals(str)) {
                str = C1549b.f4831b;
            }
            C1498a l = C1368X.m6320c().mo5842o().mo5954l(str);
            if (l != null && l.mo6158h()) {
                sb.append(next);
                sb.append(',');
                i2++;
                if (i2 >= i) {
                    break;
                }
            }
            i2 = i2;
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0 || !sb2.endsWith(",")) {
            return sb2;
        }
        return sb2.substring(0, sb2.length() - 1);
    }

    /* renamed from: a */
    public void mo6459a(C1649a aVar, boolean z) {
        this.f5371y = aVar;
        this.f5359m = z;
    }

    /* renamed from: e */
    public void mo6464e() {
        if (mo6461b()) {
            return;
        }
        if (!mo6462c()) {
            mo6460a(!this.f5359m);
        } else {
            mo6463d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7545a(String str, boolean z, boolean z2) {
        if (this.f5371y != null) {
            this.f5371y.mo6466a(str, z, z2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m7532a(Context context, int i, Object... objArr) {
        return C1974m.m9064a(context, i, objArr);
    }

    /* renamed from: f */
    public void mo6465f() {
        if (this.f5365s != null) {
            this.f5365s.mo8061b();
            if (Engine.isInitialized()) {
                Engine.getInstance().getUsrDicChecker().mo6518a(4, true);
            }
        }
        if (this.f5366t != null) {
            Iterator it = this.f5366t.iterator();
            while (it.hasNext()) {
                C2373x xVar = (C2373x) it.next();
                if (xVar != null) {
                    xVar.mo8061b();
                }
            }
            this.f5366t.clear();
        }
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        boolean z = true;
        if (!C1368X.m6324d()) {
            this.f5357k = false;
            return;
        }
        if (p instanceof C2295r) {
            C2295r rVar = (C2295r) p;
            if (rVar.f9746O == 200) {
                if (rVar.mo7900j() > this.f5368v) {
                    this.f5368v = rVar.mo7900j();
                    mo6463d();
                    C2295r.C2297b q = rVar.mo7905q();
                    if (q != null && !q.f10089e) {
                        m7543a(rVar.mo7905q().f10085a, rVar.mo7905q().f10086b);
                    }
                    this.f5362p.add(rVar);
                    Settings.getInstance().setLongSetting(Settings.HOTWORD_LAST_UPDATE_TIME, System.currentTimeMillis());
                } else {
                    m7560h();
                }
            } else if (rVar.f9746O == 204) {
                this.f5358l = true;
                Settings.getInstance().setLongSetting(Settings.HOTWORD_LAST_UPDATE_TIME, System.currentTimeMillis());
            } else {
                m7560h();
            }
        }
        if (this.f5358l && m7564j()) {
            if (this.f5359m) {
                z = false;
            }
            mo6460a(z);
            if (this.f5371y != null) {
                this.f5371y.mo6467d();
            }
            this.f5357k = false;
            this.f5358l = false;
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        if (this.f5371y != null) {
            this.f5371y.mo6470g_();
        }
        this.f5357k = false;
        this.f5358l = false;
        m7566k();
        this.f5364r.removeCallbacks(this.f5356A);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m7560h() {
        if (this.f5371y != null) {
            this.f5371y.mo6468e();
        }
        this.f5357k = false;
        this.f5358l = false;
        m7566k();
        this.f5364r.removeCallbacks(this.f5356A);
    }

    /* renamed from: i */
    private void m7562i() {
        if (this.f5368v < this.f5367u) {
            this.f5368v = this.f5367u;
            Settings.getInstance().setIntSetting(95, this.f5367u);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7537a(int i) {
        if (i > this.f5367u && i > Settings.getInstance().getIntSetting(95)) {
            Settings.getInstance().setIntSetting(95, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7550b(String str) {
        Settings.getInstance().setStringSetting(Settings.CURRENT_HOTWORD_DICTIONARY_ID, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7544a(String str, boolean z) {
        Iterator<C2295r> it = this.f5362p.iterator();
        while (it.hasNext()) {
            C2295r next = it.next();
            if (next.mo7905q() != null && next.mo7905q().f10085a.equals(str)) {
                next.mo7905q().f10089e = true;
                return;
            }
        }
    }

    /* renamed from: j */
    private boolean m7564j() {
        Iterator<C2295r> it = this.f5362p.iterator();
        while (it.hasNext()) {
            C2295r next = it.next();
            if (next.mo7905q() != null && !next.mo7905q().f10089e) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    private void m7566k() {
        Iterator<C2295r> it = this.f5362p.iterator();
        this.f5368v = Settings.getInstance().getIntSetting(95);
        while (it.hasNext()) {
            C2295r next = it.next();
            if (next.mo7905q() == null || next.mo7905q().f10089e) {
                this.f5368v = next.f10075b;
            } else {
                it.remove();
                while (it.hasNext()) {
                    it.next();
                    it.remove();
                }
                return;
            }
        }
    }
}
