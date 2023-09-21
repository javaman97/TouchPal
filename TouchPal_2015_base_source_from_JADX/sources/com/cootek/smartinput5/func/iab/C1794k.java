package com.cootek.smartinput5.func.iab;

import android.content.Context;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.func.iab.C1759a;
import com.cootek.smartinput5.func.iab.C1789h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.cmd.C2250J;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.net.cmd.C2286j;
import com.cootek.smartinput5.net.cmd.C2291n;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.iab.k */
/* compiled from: IabErrorHandler */
class C1794k {

    /* renamed from: a */
    private static final String f5900a = "IabErroHandler";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f5901b = false;

    C1794k() {
    }

    /* renamed from: a */
    static void m8258a(Context context, int i, C2259P p) {
        if (p == null || p.f9746O != 200) {
            m8276b(context, m8252a(context, p), i, false);
        } else {
            m8275b(context, i, p);
        }
    }

    /* renamed from: a */
    static void m8260a(Context context, int i, C2259P p, C2250J.C2251a aVar) {
        f5901b = false;
        m8266a(context, C1974m.m9063a(context, (int) R.string.iab_error_warning_title), C1974m.m9063a(context, (int) R.string.iab_error_sync_failed), (Runnable) new C1795l(i), (Runnable) new C1797n(aVar));
    }

    /* renamed from: a */
    static void m8259a(Context context, int i, C2259P p, C1746T.C1752f fVar) {
        C2286j jVar;
        String str = null;
        int i2 = -1;
        if (p != null) {
            jVar = (C2286j) p;
            if (jVar.mo7868j() != null) {
                i2 = jVar.mo7868j().mo7869a();
                str = jVar.mo7868j().mo7870b();
            }
        } else {
            jVar = null;
        }
        if (jVar == null || jVar.f9746O != 200) {
            m8267a(context, m8252a(context, (C2259P) jVar), false, i2, str, fVar);
            return;
        }
        switch (jVar.f9748Q) {
            case C1778f.f5802W:
                m8277b(true, i2, str, fVar);
                return;
            default:
                m8267a(context, m8251a(context, jVar.f9748Q), false, i2, str, fVar);
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8277b(boolean z, int i, String str, C1746T.C1752f fVar) {
        if (fVar != null) {
            fVar.mo6710a(z, i, str);
        }
    }

    /* renamed from: a */
    static String m8251a(Context context, int i) {
        return C1974m.m9063a(context, (int) R.string.iab_cancel_subscription_failed) + m8278c(context, i);
    }

    /* renamed from: a */
    private static void m8267a(Context context, String str, boolean z, int i, String str2, C1746T.C1752f fVar) {
        m8265a(context, C1974m.m9063a(context, (int) R.string.error_msg_title), str, (Runnable) new C1798o(z, i, str2, fVar));
    }

    /* renamed from: a */
    static void m8255a(Context context, int i, int i2) {
        m8256a(context, i, i2, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m8262a(android.content.Context r3, int r4, java.lang.String r5, java.lang.String r6, com.cootek.smartinput5.func.iab.C1754V r7) {
        /*
            r1 = 1
            if (r7 == 0) goto L_0x0033
            java.lang.String r0 = "order_id"
            java.lang.Object r0 = com.cootek.smartinput5.func.iab.C1730E.m7951a((com.cootek.smartinput5.func.iab.C1754V) r7, (java.lang.String) r0)
            if (r0 == 0) goto L_0x0033
            r1 = 0
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = com.cootek.smartinput5.func.iab.C1730E.m8004c()
            if (r2 == 0) goto L_0x001b
            com.cootek.smartinput5.func.iab.E r2 = com.cootek.smartinput5.func.iab.C1730E.m8005d()
            r2.mo6690j(r6)
        L_0x001b:
            boolean r0 = android.text.TextUtils.equals(r0, r6)
            if (r0 == 0) goto L_0x002e
            r0 = -10016(0xffffffffffffd8e0, float:NaN)
            m8255a((android.content.Context) r3, (int) r4, (int) r0)
            r0 = r1
        L_0x0027:
            if (r0 == 0) goto L_0x002d
            r0 = 7
            m8255a((android.content.Context) r3, (int) r4, (int) r0)
        L_0x002d:
            return
        L_0x002e:
            r0 = -10017(0xffffffffffffd8df, float:NaN)
            m8255a((android.content.Context) r3, (int) r4, (int) r0)
        L_0x0033:
            r0 = r1
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.iab.C1794k.m8262a(android.content.Context, int, java.lang.String, java.lang.String, com.cootek.smartinput5.func.iab.V):void");
    }

    /* renamed from: a */
    static void m8256a(Context context, int i, int i2, String str) {
        C1779g.m8163a(i, i2);
        switch (i2) {
            case C1778f.f5791L:
                m8276b(context, m8280d(context, i2), i, false);
                if (C1730E.m8004c()) {
                    C1730E.m8005d().mo6678a(str, i);
                    return;
                }
                return;
            case C1778f.f5790K:
                m8276b(context, m8280d(context, i2), i, false);
                if (C1730E.m8004c()) {
                    C1730E.m8005d().mo6678a(str, i);
                    return;
                }
                return;
            case C1778f.f5780A:
                if (C1730E.m8004c()) {
                    C1730E.m8005d().mo6684b(context);
                }
                m8276b(context, m8280d(context, i2), i, false);
                return;
            case C1778f.f5842t:
            case C1778f.f5841s:
            case 1:
                m8272b(i);
                return;
            case 3:
                m8276b(context, m8280d(context, i2), i, false);
                return;
            case 4:
            case 5:
            case 6:
            case 8:
                m8276b(context, m8280d(context, i2), i, false);
                return;
            case 7:
                m8276b(context, m8280d(context, i2), i, false);
                if (C1730E.m8004c()) {
                    C1730E.m8005d().mo6678a(str, i);
                    return;
                }
                return;
            default:
                m8276b(context, m8280d(context, i2), i, false);
                return;
        }
    }

    /* renamed from: b */
    private static void m8275b(Context context, int i, C2259P p) {
        if (p instanceof C2291n) {
            m8261a(context, i, (C2291n) p);
        } else if (p instanceof C2250J) {
            m8257a(context, i, (C2250J) p);
        } else {
            m8276b(context, C1974m.m9063a(context, (int) R.string.iab_error_server_error), i, false);
        }
    }

    /* renamed from: a */
    private static void m8257a(Context context, int i, C2250J j) {
        int i2 = j.f9748Q;
        m8276b(context, C1974m.m9063a(context, (int) R.string.iab_error_server_error) + m8278c(context, j.f9748Q), i, false);
    }

    /* renamed from: a */
    private static void m8261a(Context context, int i, C2291n nVar) {
        switch (nVar.f9748Q) {
            case 1006:
                C1617br.m7367a().mo6340g().mo7972l();
                m8286g(context, i);
                return;
            case 4000:
                m8276b(context, C1974m.m9063a(context, (int) R.string.iab_error_item_unavailable), i, false);
                return;
            case 4001:
                m8276b(context, C1974m.m9063a(context, (int) R.string.iab_error_already_bought), i, true);
                return;
            case 4004:
                m8284f(context, i);
                return;
            case C1778f.f5797R:
                m8282e(context, i);
                return;
            default:
                m8276b(context, C1974m.m9063a(context, (int) R.string.iab_error_create_order_failed) + m8278c(context, nVar.f9748Q), i, false);
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m8278c(Context context, int i) {
        return C1769ah.m8125a(context, i);
    }

    /* renamed from: a */
    private static String m8252a(Context context, C2259P p) {
        return C1769ah.m8126a(context, p);
    }

    /* renamed from: d */
    private static String m8280d(Context context, int i) {
        String a;
        switch (i) {
            case C1778f.f5791L:
                a = C1974m.m9063a(context, (int) R.string.iab_error_bought_by_others);
                break;
            case C1778f.f5790K:
                a = C1974m.m9063a(context, (int) R.string.iab_error_already_bought);
                break;
            case C1778f.f5846x:
                a = C1974m.m9063a(context, (int) R.string.iab_error_create_order_failed);
                break;
            case C1778f.f5845w:
                a = C1974m.m9063a(context, (int) R.string.iab_error_wrong_parameters);
                break;
            case 3:
                a = C1974m.m9063a(context, (int) R.string.iab_error_purchase_not_supported);
                break;
            default:
                a = C1974m.m9063a(context, (int) R.string.iab_error_purchase_failed);
                break;
        }
        return a + m8278c(context, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8272b(int i) {
        m8273b(i, "not_purchased");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8273b(int i, String str) {
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6670a(i, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8276b(Context context, String str, int i, boolean z) {
        m8265a(context, C1974m.m9063a(context, (int) R.string.purchase_error_message_title), str, (Runnable) new C1799p(i, z));
    }

    /* renamed from: a */
    private static void m8266a(Context context, String str, String str2, Runnable runnable, Runnable runnable2) {
        C1779g.m8175b(C1779g.f5851c, "SHOW");
        C1789h.m8227a().mo6794a(context, (C1789h.C1790a) new C1800q(str, context, runnable2, runnable, str2));
    }

    /* renamed from: a */
    private static void m8265a(Context context, String str, String str2, Runnable runnable) {
        C1789h.m8227a().mo6794a(context, (C1789h.C1790a) new C1803t(str, context, runnable, str2));
    }

    /* renamed from: e */
    private static void m8282e(Context context, int i) {
        C1779g.m8175b(C1779g.f5853e, "SHOW");
        C1789h.m8227a().mo6794a(context, (C1789h.C1790a) new C1805v(context, i));
    }

    /* renamed from: f */
    private static void m8284f(Context context, int i) {
        C1779g.m8175b(C1779g.f5852d, "SHOW");
        C1789h.m8227a().mo6794a(context, (C1789h.C1790a) new C1808y(context, i));
    }

    /* renamed from: g */
    private static void m8286g(Context context, int i) {
        C1779g.m8175b(C1779g.f5850b, "SHOW");
        C1789h.m8227a().mo6794a(context, (C1789h.C1790a) new C1727B(context, i));
    }

    /* renamed from: b */
    public static void m8274b(Context context, int i, int i2) {
        m8276b(context, C1974m.m9063a(context, (int) R.string.twitter_connect_failed) + C1769ah.m8125a(context, i2), i, false);
    }

    /* renamed from: c */
    public static void m8279c(Context context, int i, int i2) {
        if (i2 < 1000) {
            m8285f(context, i, i2);
        } else if (i2 < 1100) {
            m8281d(context, i, i2);
        } else {
            m8283e(context, i, i2);
        }
    }

    /* renamed from: d */
    public static void m8281d(Context context, int i, int i2) {
        switch (i2) {
            case 1000:
                m8276b(context, C1974m.m9063a(context, (int) R.string.iab_error_wrong_parameters) + m8278c(context, i2), i, false);
                return;
            case 1001:
                m8263a(context, (C1759a.C1760a) new C1796m(context, i2, i));
                return;
            case C2261Q.f9803i /*1004*/:
                m8276b(context, C1974m.m9063a(context, (int) R.string.iab_error_server_error) + m8278c(context, i2), i, false);
                return;
            case 1006:
                C1617br.m7367a().mo6340g().mo7972l();
                m8286g(context, i);
                return;
            default:
                m8285f(context, i, i2);
                return;
        }
    }

    /* renamed from: a */
    private static void m8263a(Context context, C1759a.C1760a aVar) {
        new C1759a(context, aVar).execute(new String[0]);
    }

    /* renamed from: e */
    public static void m8283e(Context context, int i, int i2) {
        switch (i2) {
            case 4000:
                m8276b(context, C1974m.m9063a(context, (int) R.string.iab_error_item_unavailable) + m8278c(context, i2), i, false);
                return;
            case 4001:
                m8276b(context, C1974m.m9063a(context, (int) R.string.iab_error_already_bought) + m8278c(context, i2), i, true);
                return;
            case 4004:
                m8284f(context, i);
                return;
            case C1778f.f5808ab:
                m8276b(context, C1974m.m9063a(context, (int) R.string.iab_error_no_purchase_channel_supported) + m8278c(context, i2), i, false);
                return;
            default:
                m8285f(context, i, i2);
                return;
        }
    }

    /* renamed from: f */
    public static void m8285f(Context context, int i, int i2) {
        m8276b(context, C1769ah.m8131b(context, i2), i, false);
    }
}
