package com.cootek.smartinput5.func;

import android.content.Context;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.p045a.C1060e;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.func.bx */
/* compiled from: TypingEfficiencyDataProvider */
public class C1626bx {

    /* renamed from: a */
    private static final String f5237a = "TypingEfficiencyDataProvider";

    /* renamed from: b */
    private static final int f5238b = 0;

    /* renamed from: c */
    private static final int f5239c = 1;

    /* renamed from: d */
    private static final int f5240d = 2;

    /* renamed from: e */
    private static final int f5241e = 3;

    /* renamed from: f */
    private static final int f5242f = 4;

    /* renamed from: g */
    private static final int f5243g = 5;

    /* renamed from: h */
    private static final int f5244h = 6;

    /* renamed from: i */
    private static final int f5245i = 7;

    /* renamed from: j */
    private static final String[] f5246j = {"keystroke saved count", "error correction count", "curve count", "curve distance count", "nextword selected count", "committed char count", "cloud_candidates_saved_stroke"};

    /* renamed from: k */
    private HashMap<Integer, Long> f5247k;

    /* renamed from: l */
    private long[] f5248l;

    /* renamed from: m */
    private boolean f5249m = false;

    /* renamed from: n */
    private Context f5250n;

    public C1626bx(Context context) {
        this.f5250n = context;
        m7435n();
        mo6384b();
    }

    /* renamed from: a */
    public void mo6383a(int i, int i2, int i3) {
        if (m7433l()) {
            if (i3 == 2) {
                m7436o();
                m7431b(i);
                C1060e.m5598b().mo4272a(C1060e.f3034y);
            }
            m7432b(i, i2, i3);
            this.f5249m = false;
            long[] jArr = this.f5248l;
            jArr[5] = jArr[5] + ((long) i);
            C1060e.m5598b().mo4273a(C1060e.f3035z, i);
            m7437p();
        }
    }

    /* renamed from: l */
    private boolean m7433l() {
        return !C1368X.m6320c().mo5842o().mo5955l();
    }

    /* renamed from: a */
    public void mo6381a() {
        if (this.f5247k != null) {
            File a = C1466av.m6849a(this.f5250n, C1466av.f4706o);
            for (int i = 0; i < 7; i++) {
                this.f5247k.put(Integer.valueOf(i), Long.valueOf(this.f5248l[i]));
            }
            C0997e.m5175a(a, (Object) this.f5247k);
        }
    }

    /* renamed from: b */
    public void mo6384b() {
        this.f5247k = (HashMap) C0997e.m5187b(C1466av.m6849a(this.f5250n, C1466av.f4706o));
        if (this.f5247k != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= 7) {
                    break;
                }
                if (this.f5247k.get(Integer.valueOf(i2)) != null) {
                    this.f5248l[i2] = this.f5247k.get(Integer.valueOf(i2)).longValue();
                }
                i = i2 + 1;
            }
        } else {
            this.f5247k = new HashMap<>();
        }
        if (m7434m()) {
            m7435n();
        }
    }

    /* renamed from: m */
    private boolean m7434m() {
        for (int i = 0; i < 7; i++) {
            if (this.f5248l[i] < 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    private void m7435n() {
        if (this.f5248l == null) {
            this.f5248l = new long[7];
        }
        for (int i = 0; i < 7; i++) {
            this.f5248l[i] = 0;
        }
    }

    /* renamed from: c */
    public long mo6385c() {
        return this.f5248l[0];
    }

    /* renamed from: b */
    private void m7432b(int i, int i2, int i3) {
        if (this.f5249m || i3 == 2) {
            long[] jArr = this.f5248l;
            jArr[0] = jArr[0] + ((long) (i - 1));
        } else if (i3 == 3) {
            long[] jArr2 = this.f5248l;
            jArr2[0] = jArr2[0] + ((long) i);
        } else if (i3 == 1) {
            long[] jArr3 = this.f5248l;
            jArr3[0] = jArr3[0] + ((long) (i - i2));
        }
    }

    /* renamed from: d */
    public long mo6386d() {
        return this.f5248l[1];
    }

    /* renamed from: e */
    public void mo6387e() {
        if (m7433l()) {
            long[] jArr = this.f5248l;
            jArr[1] = jArr[1] + 1;
        }
    }

    /* renamed from: a */
    public void mo6382a(int i) {
        if (m7433l()) {
            long[] jArr = this.f5248l;
            jArr[6] = jArr[6] + ((long) i);
        }
    }

    /* renamed from: f */
    public long mo6388f() {
        return this.f5248l[6];
    }

    /* renamed from: g */
    public long mo6389g() {
        return this.f5248l[2];
    }

    /* renamed from: o */
    private void m7436o() {
        long[] jArr = this.f5248l;
        jArr[2] = jArr[2] + 1;
    }

    /* renamed from: h */
    public long mo6390h() {
        return this.f5248l[3];
    }

    /* renamed from: b */
    private void m7431b(int i) {
        double d = ((double) this.f5250n.getResources().getDisplayMetrics().widthPixels) / ((double) this.f5250n.getResources().getDisplayMetrics().densityDpi);
        long[] jArr = this.f5248l;
        jArr[3] = (long) (((d * ((double) (i - 1))) / 5.0d) + ((double) jArr[3]));
    }

    /* renamed from: i */
    public long mo6391i() {
        return this.f5248l[5];
    }

    /* renamed from: j */
    public long mo6392j() {
        return this.f5248l[4];
    }

    /* renamed from: k */
    public void mo6393k() {
        if (m7433l()) {
            long[] jArr = this.f5248l;
            jArr[4] = jArr[4] + 1;
            this.f5249m = true;
        }
    }

    /* renamed from: p */
    private void m7437p() {
    }
}
