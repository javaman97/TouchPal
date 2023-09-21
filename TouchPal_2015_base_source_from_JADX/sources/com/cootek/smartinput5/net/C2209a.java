package com.cootek.smartinput5.net;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2254L;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2268c;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;

/* renamed from: com.cootek.smartinput5.net.a */
/* compiled from: Activator */
public class C2209a implements C2373x.C2376b {

    /* renamed from: a */
    public static final int f9314a = 0;

    /* renamed from: b */
    public static final int f9315b = 1;

    /* renamed from: c */
    public static final int f9316c = 2;

    /* renamed from: d */
    public static final int f9317d = 3;

    /* renamed from: e */
    public static final int f9318e = 0;

    /* renamed from: f */
    public static final int f9319f = 1;

    /* renamed from: g */
    public static final int f9320g = 2;

    /* renamed from: h */
    public static final int f9321h = 3;

    /* renamed from: i */
    private static C2209a f9322i = new C2209a();

    /* renamed from: j */
    private static final String f9323j = "Activator";

    /* renamed from: k */
    private static final String f9324k = "recommend_userid";

    /* renamed from: l */
    private static final int f9325l = 4;

    /* renamed from: m */
    private static boolean f9326m = false;

    /* renamed from: n */
    private C2268c f9327n;

    /* renamed from: o */
    private boolean f9328o = false;

    /* renamed from: p */
    private Context f9329p;

    /* renamed from: com.cootek.smartinput5.net.a$a */
    /* compiled from: Activator */
    public enum C2210a implements C2259P.C2260a {
        CHECK_STATE,
        CHECK_TOKEN,
        DIRECTLY,
        FORBID
    }

    private C2209a() {
    }

    /* renamed from: a */
    public static C2209a m9956a() {
        return f9322i;
    }

    /* renamed from: b */
    public static boolean m9960b() {
        return f9326m;
    }

    /* renamed from: a */
    public static void m9958a(boolean z) {
        f9326m = z;
    }

    /* renamed from: a */
    private synchronized int m9955a(Context context, C2210a aVar, boolean z) {
        int i;
        if (m9960b()) {
            i = 2;
        } else if (!Settings.isInitialized() || !aVar.mo7763a(context)) {
            i = 0;
        } else if (!z || m9969g()) {
            i = 1;
        } else {
            i = 3;
        }
        if (i == 1) {
            m9958a(true);
        }
        return i;
    }

    /* renamed from: a */
    public int mo7727a(Context context, C2210a aVar, boolean z, C2268c.C2269a aVar2) {
        this.f9329p = context;
        if (aVar == null) {
            aVar = C2210a.FORBID;
        }
        int a = m9955a(context, aVar, true);
        if (a == 1) {
            this.f9327n = m9957a(context, false);
            this.f9327n.f9866B = aVar2;
            this.f9327n.mo7827a((C2259P.C2260a) aVar);
            if (z) {
                new C2373x(this.f9327n).mo8060a((C2373x.C2376b) this);
            } else {
                this.f9327n.mo7830h_();
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo7728a(Context context) {
        this.f9329p = context;
        if (m9960b()) {
            this.f9328o = true;
        } else {
            m9964e();
        }
    }

    /* renamed from: e */
    private void m9964e() {
        if (m9966f()) {
            m9965e(this.f9329p);
        }
    }

    /* renamed from: e */
    private void m9965e(Context context) {
        if (m9955a(context, C2210a.DIRECTLY, false) == 1) {
            C2268c a = m9957a(context, true);
            a.mo7827a((C2259P.C2260a) C2210a.DIRECTLY);
            new C2373x(a).mo8060a((C2373x.C2376b) new C2236b(this));
        }
    }

    /* renamed from: f */
    private boolean m9966f() {
        if (!Settings.isInitialized() || Settings.getInstance().getBoolSetting(Settings.HAS_ACTIVATE_EFFECTIVELY) || TextUtils.isEmpty(Settings.getInstance().getStringSetting(88))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public int mo7729c() {
        if (this.f9327n != null) {
            return this.f9327n.f9746O;
        }
        return 0;
    }

    /* renamed from: d */
    public int mo7730d() {
        if (this.f9327n != null) {
            return this.f9327n.f9748Q;
        }
        return 0;
    }

    /* renamed from: g */
    private static boolean m9969g() {
        if (TextUtils.isEmpty(C2188Q.m9853a().mo7683c())) {
            return true;
        }
        if (!Settings.isInitialized() || C2225al.m10050a() - Settings.getInstance().getIntSetting(200) <= 86400) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m9967f(Context context) {
        if (m9961b(context) && Settings.getInstance().getIntSetting(200) <= 0 && C2188Q.m9853a().mo7686f()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m9961b(Context context) {
        if (C1132b.m5662a()) {
            return C1132b.m5654a(context).mo4392a(C1135d.ACTIVATOR, (Boolean) true).booleanValue();
        }
        return true;
    }

    /* renamed from: b */
    private static String m9959b(boolean z) {
        if (TextUtils.isEmpty(C2188Q.m9853a().mo7683c())) {
            return C2268c.f9863b;
        }
        if (z) {
            return C2268c.f9864c;
        }
        return C2268c.f9862a;
    }

    /* renamed from: a */
    private static C2268c m9957a(Context context, boolean z) {
        C2268c cVar = new C2268c();
        cVar.f9875d = C2225al.m10065d(context);
        cVar.f9876e = C2225al.m10063c(context);
        cVar.f9877f = "Android";
        cVar.f9878g = Build.VERSION.RELEASE;
        cVar.f9879h = Build.MODEL;
        cVar.f9880i = C1132b.m5654a(context).mo4414h();
        cVar.f9881j = C2225al.m10076j(context);
        cVar.f9882k = C2377y.m10894a(context).mo8068b();
        cVar.f9883l = C2377y.m10894a(context).mo8069c();
        cVar.f9884m = C2377y.m10894a(context).mo8070d();
        cVar.f9894w = C2225al.m10078l(context);
        cVar.f9896y = Settings.getInstance().getStringSetting(Settings.REFERRER);
        cVar.f9897z = C2225al.m10079m(context);
        cVar.f9885n = m9959b(z);
        cVar.f9886o = Build.MANUFACTURER;
        cVar.f9887p = Build.VERSION.SDK;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        cVar.f9888q = String.format("%d*%d", new Object[]{Integer.valueOf(displayMetrics.heightPixels > displayMetrics.widthPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels <= displayMetrics.widthPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels)});
        cVar.f9889r = String.valueOf(displayMetrics.densityDpi);
        double d = ((double) displayMetrics.heightPixels) / ((double) displayMetrics.densityDpi);
        double d2 = ((double) displayMetrics.widthPixels) / ((double) displayMetrics.densityDpi);
        cVar.f9890s = String.format("%.2f", new Object[]{Double.valueOf(Math.sqrt((d * d) + (d2 * d2)))});
        cVar.f9891t = C2225al.m10051a(context);
        cVar.f9892u = m9962c(context);
        cVar.f9893v = C1132b.m5654a(context).mo4415i();
        cVar.f9865A = C1584bI.m7147b(context, context.getPackageName());
        cVar.f9868E = Settings.getInstance().getIntSetting(200);
        cVar.f9867C = Settings.getInstance().getIntSetting(Settings.LAST_ACTIVATE_CONSUME_TIME);
        cVar.f9869F = m9968g(context);
        cVar.f9870G = System.currentTimeMillis();
        cVar.f9895x = C2188Q.m9853a().mo7683c();
        cVar.f9871H = Process.myPid();
        cVar.f9872I = Process.myTid();
        return cVar;
    }

    /* renamed from: g */
    private static String m9968g(Context context) {
        String str;
        int myPid = Process.myPid();
        String str2 = "";
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(C1411aV.f4484k)).getRunningAppProcesses()) {
            if (next != null) {
                try {
                    if (next.pid == myPid) {
                        String str3 = next.processName;
                        if (str3 == null) {
                            return str3;
                        }
                        try {
                            return str3.replace(context.getPackageName(), "");
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception e2) {
                    str = str2;
                }
            }
            str = str2;
            str2 = str;
        }
        return str2;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (p.f9748Q == 1003) {
            if (C2188Q.m9853a() != null && C2188Q.m9853a().mo7685e()) {
                new C2373x(new C2254L()).mo8060a((C2373x.C2376b) null);
            }
        } else if (p.f9748Q == 0 && this.f9328o) {
            m9964e();
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004a A[SYNTHETIC, Splitter:B:30:0x004a] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m9962c(android.content.Context r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
        L_0x0003:
            return r0
        L_0x0004:
            com.cootek.smartinput5.func.asset.o r1 = com.cootek.smartinput5.func.asset.C1460o.m6799b()     // Catch:{ IOException -> 0x0055, all -> 0x0045 }
            java.lang.String r2 = "recommend_userid"
            java.io.InputStream r2 = r1.mo6099a((android.content.Context) r6, (java.lang.String) r2)     // Catch:{ IOException -> 0x0055, all -> 0x0045 }
            if (r2 == 0) goto L_0x003a
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0025 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0025 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0025 }
            r3.<init>()     // Catch:{ IOException -> 0x0025 }
        L_0x001a:
            int r4 = r1.read()     // Catch:{ IOException -> 0x0025 }
            r5 = -1
            if (r4 == r5) goto L_0x0034
            r3.write(r4)     // Catch:{ IOException -> 0x0025 }
            goto L_0x001a
        L_0x0025:
            r1 = move-exception
        L_0x0026:
            r1.printStackTrace()     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0003
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0003
        L_0x002f:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0003
        L_0x0034:
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = r3.toString(r1)     // Catch:{ IOException -> 0x0025 }
        L_0x003a:
            if (r2 == 0) goto L_0x0003
            r2.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0003
        L_0x0040:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0003
        L_0x0045:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0048:
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004d:
            throw r0
        L_0x004e:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x004d
        L_0x0053:
            r0 = move-exception
            goto L_0x0048
        L_0x0055:
            r1 = move-exception
            r2 = r0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.net.C2209a.m9962c(android.content.Context):java.lang.String");
    }
}
