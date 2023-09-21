package com.facebook.ads.internal.p074e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.ads.internal.p073d.C3396a;

/* renamed from: com.facebook.ads.internal.e.e */
public class C3403e {

    /* renamed from: a */
    public static final String f14849a = Build.VERSION.RELEASE;

    /* renamed from: b */
    public static String f14850b = "";

    /* renamed from: c */
    public static String f14851c = "";

    /* renamed from: d */
    public static String f14852d = "";

    /* renamed from: e */
    public static String f14853e = "";

    /* renamed from: f */
    public static String f14854f = "";

    /* renamed from: g */
    public static int f14855g = 0;

    /* renamed from: h */
    public static String f14856h = "";

    /* renamed from: i */
    public static int f14857i = 0;

    /* renamed from: j */
    public static String f14858j = "";

    /* renamed from: k */
    public static int f14859k = 0;

    /* renamed from: l */
    public static String f14860l = "";

    /* renamed from: m */
    public static String f14861m = "";

    /* renamed from: n */
    public static String f14862n = "";

    /* renamed from: o */
    public static boolean f14863o = false;

    /* renamed from: p */
    private static boolean f14864p = false;

    /* renamed from: a */
    public static synchronized void m14968a(Context context) {
        synchronized (C3403e.class) {
            if (!f14864p) {
                f14864p = true;
                m14970c(context);
            }
            m14971d(context);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[Catch:{ Exception -> 0x008f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14969b(android.content.Context r8) {
        /*
            r2 = 0
            boolean r0 = f14864p
            if (r0 != 0) goto L_0x0006
        L_0x0005:
            return
        L_0x0006:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = "SDKIDFA"
            r1 = 0
            android.content.SharedPreferences r3 = r8.getSharedPreferences(r0, r1)     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = "attributionId"
            boolean r0 = r3.contains(r0)     // Catch:{ Exception -> 0x008f }
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "attributionId"
            java.lang.String r1 = ""
            java.lang.String r0 = r3.getString(r0, r1)     // Catch:{ Exception -> 0x008f }
            f14861m = r0     // Catch:{ Exception -> 0x008f }
        L_0x0023:
            java.lang.String r0 = "advertisingId"
            boolean r0 = r3.contains(r0)     // Catch:{ Exception -> 0x008f }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "advertisingId"
            java.lang.String r1 = ""
            java.lang.String r0 = r3.getString(r0, r1)     // Catch:{ Exception -> 0x008f }
            f14862n = r0     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = "limitAdTracking"
            boolean r1 = f14863o     // Catch:{ Exception -> 0x008f }
            boolean r0 = r3.getBoolean(r0, r1)     // Catch:{ Exception -> 0x008f }
            f14863o = r0     // Catch:{ Exception -> 0x008f }
        L_0x003f:
            android.content.ContentResolver r0 = r8.getContentResolver()     // Catch:{ Exception -> 0x0095 }
            com.facebook.ads.internal.h.h$a r1 = com.facebook.ads.internal.p077h.C3439h.m15062a((android.content.ContentResolver) r0)     // Catch:{ Exception -> 0x0095 }
            com.facebook.ads.internal.h r2 = com.facebook.ads.internal.C3429h.m15039a(r8, r1)     // Catch:{ Exception -> 0x009b }
        L_0x004b:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x008f }
            long r4 = r6 - r4
            if (r1 == 0) goto L_0x0059
            java.lang.String r0 = r1.f14978a     // Catch:{ Exception -> 0x008f }
            if (r0 == 0) goto L_0x0059
            f14861m = r0     // Catch:{ Exception -> 0x008f }
        L_0x0059:
            if (r2 == 0) goto L_0x0071
            java.lang.String r0 = r2.mo10763a()     // Catch:{ Exception -> 0x008f }
            boolean r1 = r2.mo10764b()     // Catch:{ Exception -> 0x008f }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x008f }
            if (r0 == 0) goto L_0x0071
            f14862n = r0     // Catch:{ Exception -> 0x008f }
            boolean r0 = r1.booleanValue()     // Catch:{ Exception -> 0x008f }
            f14863o = r0     // Catch:{ Exception -> 0x008f }
        L_0x0071:
            android.content.SharedPreferences$Editor r0 = r3.edit()     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = "attributionId"
            java.lang.String r2 = f14861m     // Catch:{ Exception -> 0x008f }
            r0.putString(r1, r2)     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = "advertisingId"
            java.lang.String r2 = f14862n     // Catch:{ Exception -> 0x008f }
            r0.putString(r1, r2)     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = "limitAdTracking"
            boolean r2 = f14863o     // Catch:{ Exception -> 0x008f }
            r0.putBoolean(r1, r2)     // Catch:{ Exception -> 0x008f }
            r0.apply()     // Catch:{ Exception -> 0x008f }
            goto L_0x0005
        L_0x008f:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0005
        L_0x0095:
            r0 = move-exception
            r1 = r2
        L_0x0097:
            r0.printStackTrace()     // Catch:{ Exception -> 0x008f }
            goto L_0x004b
        L_0x009b:
            r0 = move-exception
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p074e.C3403e.m14969b(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m14970c(android.content.Context r4) {
        /*
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r0 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0067 }
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r2 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0067 }
            f14852d = r2     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r2 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0067 }
            f14854f = r2     // Catch:{ NameNotFoundException -> 0x0067 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0067 }
            f14855g = r0     // Catch:{ NameNotFoundException -> 0x0067 }
        L_0x0019:
            java.lang.String r0 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0089 }
            r2 = 0
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0089 }
            java.lang.CharSequence r0 = r1.getApplicationLabel(r0)     // Catch:{ NameNotFoundException -> 0x0089 }
            if (r0 == 0) goto L_0x0083
            int r1 = r0.length()     // Catch:{ NameNotFoundException -> 0x0089 }
            if (r1 <= 0) goto L_0x0083
            java.lang.String r0 = r0.toString()     // Catch:{ NameNotFoundException -> 0x0089 }
            f14853e = r0     // Catch:{ NameNotFoundException -> 0x0089 }
        L_0x0034:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r0.getNetworkOperatorName()
            if (r0 == 0) goto L_0x00a5
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x00a5
            f14856h = r0
        L_0x004c:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            if (r0 == 0) goto L_0x00ab
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x00ab
            f14850b = r0
        L_0x0058:
            java.lang.String r0 = android.os.Build.MODEL
            if (r0 == 0) goto L_0x00b1
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00b1
            java.lang.String r0 = android.os.Build.MODEL
            f14851c = r0
        L_0x0066:
            return
        L_0x0067:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to retrieve BUNDLE, APPVERS, APPBUILD"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.internal.p073d.C3396a.m14937a(r0)
            goto L_0x0019
        L_0x0083:
            java.lang.String r0 = "Failed to retrieve APPNAME"
            com.facebook.ads.internal.p073d.C3396a.m14937a(r0)     // Catch:{ NameNotFoundException -> 0x0089 }
            goto L_0x0034
        L_0x0089:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to retrieve APPNAME "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.internal.p073d.C3396a.m14937a(r0)
            goto L_0x0034
        L_0x00a5:
            java.lang.String r0 = "Failed to retrieve CARRIER"
            com.facebook.ads.internal.p073d.C3396a.m14937a(r0)
            goto L_0x004c
        L_0x00ab:
            java.lang.String r0 = "Failed to retrieve MAKE"
            com.facebook.ads.internal.p073d.C3396a.m14937a(r0)
            goto L_0x0058
        L_0x00b1:
            java.lang.String r0 = "Failed to retrieve MODEL"
            com.facebook.ads.internal.p073d.C3396a.m14937a(r0)
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p074e.C3403e.m14970c(android.content.Context):void");
    }

    /* renamed from: d */
    private static void m14971d(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                C3396a.m14937a("No network connection is currently active");
                return;
            }
            f14857i = activeNetworkInfo.getType();
            f14858j = activeNetworkInfo.getTypeName();
            f14859k = activeNetworkInfo.getSubtype();
            f14860l = activeNetworkInfo.getSubtypeName();
        } catch (Exception e) {
            C3396a.m14937a("Missing permission ACCESS_NETWORK_STATE");
        }
    }
}
