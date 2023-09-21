package com.iflytek.cloud.p078a.p082d;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import com.cootek.geo.AbsGeoLocationItem;
import com.iflytek.cloud.Setting;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;

/* renamed from: com.iflytek.cloud.a.d.b */
public class C3992b {

    /* renamed from: a */
    public static C3992b f16339a = null;

    /* renamed from: b */
    private SharedPreferences f16340b = null;

    /* renamed from: c */
    private Context f16341c = null;

    /* renamed from: d */
    private boolean f16342d = true;

    /* renamed from: e */
    private long f16343e = 0;

    private C3992b(Context context) {
        this.f16341c = context;
        this.f16340b = context.getSharedPreferences("com.iflytek.msc", 0);
        this.f16342d = m17036b(context);
    }

    /* renamed from: a */
    public static C3992b m17035a(Context context) {
        if (f16339a == null && context != null) {
            m17037c(context);
        }
        return f16339a;
    }

    /* renamed from: b */
    public static boolean m17036b(Context context) {
        try {
            if (!Setting.f16234b || context == null) {
                return false;
            }
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            for (int i = 0; i < strArr.length; i++) {
                if ("android.permission.ACCESS_FINE_LOCATION".equalsIgnoreCase(strArr[i]) || "android.permission.ACCESS_COARSE_LOCATION".equalsIgnoreCase(strArr[i])) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: c */
    private static synchronized C3992b m17037c(Context context) {
        C3992b bVar;
        synchronized (C3992b.class) {
            if (f16339a == null) {
                f16339a = new C3992b(context);
            }
            C3995e.m17043a(context);
            C3989a.m17026a(context);
            bVar = f16339a;
        }
        return bVar;
    }

    /* renamed from: a */
    public synchronized float mo14701a(String str) {
        try {
            if (this.f16342d && System.currentTimeMillis() - this.f16343e > 216000) {
                LocationManager locationManager = (LocationManager) this.f16341c.getApplicationContext().getSystemService("location");
                this.f16343e = System.currentTimeMillis();
                mo14703a("loction_last_update", this.f16343e);
                C3990a.m17033c("getLocation begin:" + System.currentTimeMillis());
                Criteria criteria = new Criteria();
                criteria.setAccuracy(1);
                C3990a.m17033c("bestProvider:" + locationManager.getBestProvider(criteria, true));
                Location lastKnownLocation = locationManager.getLastKnownLocation(AbsGeoLocationItem.LOCATION_PROVIDER_GPS);
                if (lastKnownLocation != null) {
                    C3990a.m17030a(lastKnownLocation.toString());
                    mo14702a(lastKnownLocation);
                } else {
                    Location lastKnownLocation2 = locationManager.getLastKnownLocation("network");
                    if (lastKnownLocation2 != null) {
                        C3990a.m17030a(lastKnownLocation2.toString());
                        mo14702a(lastKnownLocation2);
                    }
                }
                C3990a.m17033c("getLocation end:" + System.currentTimeMillis());
            }
        } catch (Exception e) {
        }
        return this.f16340b.getFloat(str, -0.1f);
    }

    /* renamed from: a */
    public void mo14702a(Location location) {
        if (location != null) {
            SharedPreferences.Editor edit = this.f16340b.edit();
            edit.putFloat("msc.lat", (float) location.getLatitude());
            edit.putFloat("msc.lng", (float) location.getLongitude());
            edit.commit();
        }
    }

    /* renamed from: a */
    public void mo14703a(String str, long j) {
        SharedPreferences.Editor edit = this.f16340b.edit();
        edit.putLong(str, j);
        edit.commit();
    }
}
