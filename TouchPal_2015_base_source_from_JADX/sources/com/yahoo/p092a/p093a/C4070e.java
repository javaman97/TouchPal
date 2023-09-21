package com.yahoo.p092a.p093a;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.yahoo.a.a.e */
public final class C4070e {

    /* renamed from: a */
    private static volatile AdvertisingIdClient.Info f16554a = null;

    /* renamed from: b */
    private static String f16555b = "";

    /* renamed from: c */
    private static boolean f16556c = false;

    /* renamed from: d */
    private static Object f16557d = new Object();

    /* renamed from: e */
    private static ExecutorService f16558e = Executors.newSingleThreadExecutor();

    /* renamed from: com.yahoo.a.a.e$a */
    protected interface C4071a {
        /* renamed from: a */
        void mo15044a(String str);
    }

    /* renamed from: b */
    private static void m17322b(Context context) {
        try {
            synchronized (f16557d) {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                f16554a = advertisingIdInfo;
                if (advertisingIdInfo != null) {
                    f16555b = f16554a.getId();
                    f16556c = f16554a.isLimitAdTrackingEnabled();
                }
            }
        } catch (SecurityException e) {
            m17321b();
        } catch (IllegalStateException e2) {
            m17321b();
        } catch (IOException e3) {
            m17321b();
        } catch (GooglePlayServicesNotAvailableException e4) {
            m17321b();
        } catch (GooglePlayServicesRepairableException e5) {
            m17321b();
        } catch (Exception e6) {
            m17321b();
        } catch (Throwable th) {
        }
    }

    /* renamed from: a */
    public static void m17319a(Context context, C4071a aVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                f16558e.execute(new C4072f(aVar, context));
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo15044a(f16555b);
                }
            }
        } else if (aVar != null) {
            aVar.mo15044a(m17318a(context));
        }
    }

    /* renamed from: a */
    protected static String m17318a(Context context) {
        String str = "";
        synchronized (f16557d) {
            if (f16554a == null) {
                try {
                    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0) {
                        m17322b(context);
                    }
                } catch (Exception e) {
                    m17321b();
                }
            } else {
                m17322b(context);
            }
            if (f16554a != null) {
                try {
                    str = f16554a.getId();
                    f16556c = f16554a.isLimitAdTrackingEnabled();
                } catch (Throwable th) {
                }
                if (str == null) {
                    str = "";
                }
            }
            if (str != null) {
                if (str.length() > 0) {
                    f16555b = str;
                }
            }
            f16555b = "";
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m17320a() {
        return f16556c;
    }

    /* renamed from: b */
    private static void m17321b() {
        synchronized (f16557d) {
            f16554a = null;
            f16555b = "";
            f16556c = false;
        }
    }
}
