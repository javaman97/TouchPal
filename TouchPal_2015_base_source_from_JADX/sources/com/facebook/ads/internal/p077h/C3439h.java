package com.facebook.ads.internal.p077h;

import android.app.KeyguardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.C3495j;
import com.facebook.ads.C3496k;
import com.facebook.ads.internal.C3404f;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.Map;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.h.h */
public class C3439h {

    /* renamed from: a */
    private static final Uri f14976a = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");

    /* renamed from: com.facebook.ads.internal.h.h$a */
    public static class C3441a {

        /* renamed from: a */
        public String f14978a;

        /* renamed from: b */
        public String f14979b;

        /* renamed from: c */
        public boolean f14980c;

        public C3441a(String str, String str2, boolean z) {
            this.f14978a = str;
            this.f14979b = str2;
            this.f14980c = z;
        }
    }

    /* renamed from: a */
    public static C3404f m15061a(C3496k kVar) {
        switch (kVar) {
            case INTERSTITIAL:
                return C3404f.WEBVIEW_INTERSTITIAL_UNKNOWN;
            case RECTANGLE_HEIGHT_250:
                return C3404f.NATIVE_250;
            case BANNER_HEIGHT_90:
                return C3404f.WEBVIEW_BANNER_90;
            case BANNER_HEIGHT_50:
                return C3404f.WEBVIEW_BANNER_50;
            default:
                return C3404f.WEBVIEW_BANNER_LEGACY;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.ads.internal.p077h.C3439h.C3441a m15062a(android.content.ContentResolver r7) {
        /*
            r6 = 0
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0064, all -> 0x0074 }
            r0 = 0
            java.lang.String r1 = "aid"
            r2[r0] = r1     // Catch:{ Exception -> 0x0064, all -> 0x0074 }
            r0 = 1
            java.lang.String r1 = "androidid"
            r2[r0] = r1     // Catch:{ Exception -> 0x0064, all -> 0x0074 }
            r0 = 2
            java.lang.String r1 = "limit_tracking"
            r2[r0] = r1     // Catch:{ Exception -> 0x0064, all -> 0x0074 }
            android.net.Uri r1 = f14976a     // Catch:{ Exception -> 0x0064, all -> 0x0074 }
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r7
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0064, all -> 0x0074 }
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x007e }
            if (r0 != 0) goto L_0x0033
        L_0x0025:
            com.facebook.ads.internal.h.h$a r0 = new com.facebook.ads.internal.h.h$a     // Catch:{ Exception -> 0x007e }
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r2, r3, r4)     // Catch:{ Exception -> 0x007e }
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r0
        L_0x0033:
            java.lang.String r0 = "aid"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x007e }
            java.lang.String r2 = r1.getString(r0)     // Catch:{ Exception -> 0x007e }
            java.lang.String r0 = "androidid"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x007e }
            java.lang.String r3 = r1.getString(r0)     // Catch:{ Exception -> 0x007e }
            java.lang.String r0 = "limit_tracking"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x007e }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x007e }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x007e }
            com.facebook.ads.internal.h.h$a r0 = new com.facebook.ads.internal.h.h$a     // Catch:{ Exception -> 0x007e }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x007e }
            r0.<init>(r2, r3, r4)     // Catch:{ Exception -> 0x007e }
            if (r1 == 0) goto L_0x0032
            r1.close()
            goto L_0x0032
        L_0x0064:
            r0 = move-exception
            r1 = r6
        L_0x0066:
            com.facebook.ads.internal.h.h$a r0 = new com.facebook.ads.internal.h.h$a     // Catch:{ all -> 0x007c }
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r2, r3, r4)     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x0032
            r1.close()
            goto L_0x0032
        L_0x0074:
            r0 = move-exception
            r1 = r6
        L_0x0076:
            if (r1 == 0) goto L_0x007b
            r1.close()
        L_0x007b:
            throw r0
        L_0x007c:
            r0 = move-exception
            goto L_0x0076
        L_0x007e:
            r0 = move-exception
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p077h.C3439h.m15062a(android.content.ContentResolver):com.facebook.ads.internal.h.h$a");
    }

    /* renamed from: a */
    public static Object m15063a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m15064a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), next.getValue());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static Method m15065a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m15066a(String str, String str2, Class<?>... clsArr) {
        try {
            return m15065a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m15067a(Context context, String str) {
        if (C3495j.m15219a(context)) {
            Log.d("FBAudienceNetworkLog", str + " (displayed for test ads only)");
        }
    }

    /* renamed from: a */
    public static void m15068a(DisplayMetrics displayMetrics, View view, C3496k kVar) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) >= kVar.mo10840a() ? displayMetrics.widthPixels : (int) Math.ceil((double) (((float) kVar.mo10840a()) * displayMetrics.density)), (int) Math.ceil((double) (((float) kVar.mo10841b()) * displayMetrics.density)));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static boolean m15069a() {
        String b = C3495j.m15220b();
        return !C3456v.m15103a(b) && b.endsWith(".sb");
    }

    /* renamed from: a */
    public static boolean m15070a(Context context) {
        if (!((PowerManager) context.getSystemService("power")).isScreenOn()) {
            return false;
        }
        return !((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    /* renamed from: a */
    public static boolean m15071a(Context context, View view, int i) {
        if (view == null || view.getParent() == null || view.getVisibility() != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 11 && view.getAlpha() < 0.9f) {
            return false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (iArr[0] < 0 || displayMetrics.widthPixels - iArr[0] < width) {
            return false;
        }
        int i2 = (int) ((((double) height) * (100.0d - ((double) i))) / 100.0d);
        if ((iArr[1] >= 0 || Math.abs(iArr[1]) <= i2) && (height + iArr[1]) - displayMetrics.heightPixels <= i2) {
            return m15070a(context);
        }
        return false;
    }

    /* renamed from: b */
    public static HttpClient m15072b() {
        HttpClient defaultHttpClient = new DefaultHttpClient();
        HttpParams params = defaultHttpClient.getParams();
        HttpConnectionParams.setConnectionTimeout(params, 30000);
        HttpConnectionParams.setSoTimeout(params, 30000);
        if (m15069a()) {
            try {
                KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
                instance.load((InputStream) null, (char[]) null);
                C3453s sVar = new C3453s(instance);
                sVar.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
                HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
                HttpProtocolParams.setContentCharset(params, Utils.UTF8);
                SchemeRegistry schemeRegistry = new SchemeRegistry();
                schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
                schemeRegistry.register(new Scheme("https", sVar, 443));
                return new DefaultHttpClient(new ThreadSafeClientConnManager(params, schemeRegistry), params);
            } catch (Exception e) {
            }
        }
        return defaultHttpClient;
    }
}
