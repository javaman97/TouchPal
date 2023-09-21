package com.facebook.ads.internal.p077h;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.ads.C3495j;
import com.facebook.ads.internal.C3404f;
import java.lang.reflect.Constructor;

/* renamed from: com.facebook.ads.internal.h.i */
public class C3442i {

    /* renamed from: a */
    private static String f14981a = null;

    /* renamed from: a */
    public static String m15073a() {
        String b = C3495j.m15220b();
        if (C3456v.m15103a(b)) {
            return "https://www.facebook.com/";
        }
        return String.format("https://www.%s.facebook.com", new Object[]{b});
    }

    @TargetApi(17)
    /* renamed from: a */
    private static String m15074a(Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }

    /* renamed from: a */
    public static String m15075a(Context context, C3404f fVar) {
        if (fVar == C3404f.NATIVE_250 || fVar == C3404f.NATIVE_UNKNOWN || fVar == null) {
            return System.getProperty("http.agent");
        }
        if (f14981a == null) {
            if (Build.VERSION.SDK_INT >= 17) {
                f14981a = m15074a(context);
            } else {
                try {
                    f14981a = m15076a(context, "android.webkit.WebSettings", "android.webkit.WebView");
                } catch (Exception e) {
                    try {
                        f14981a = m15076a(context, "android.webkit.WebSettingsClassic", "android.webkit.WebViewClassic");
                    } catch (Exception e2) {
                        WebView webView = new WebView(context.getApplicationContext());
                        f14981a = webView.getSettings().getUserAgentString();
                        webView.destroy();
                    }
                }
            }
        }
        return f14981a;
    }

    /* renamed from: a */
    private static String m15076a(Context context, String str, String str2) {
        Class<?> cls = Class.forName(str);
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Context.class, Class.forName(str2)});
        declaredConstructor.setAccessible(true);
        try {
            return (String) cls.getMethod("getUserAgentString", new Class[0]).invoke(declaredConstructor.newInstance(new Object[]{context, null}), new Object[0]);
        } finally {
            declaredConstructor.setAccessible(false);
        }
    }

    /* renamed from: a */
    public static void m15077a(WebView webView) {
        webView.loadUrl("about:blank");
        webView.clearCache(true);
        if (Build.VERSION.SDK_INT > 11) {
            webView.onPause();
            return;
        }
        try {
            WebView.class.getMethod("onPause", new Class[0]).invoke(webView, new Object[0]);
        } catch (Exception e) {
        }
    }
}
