package com.cootek.smartinput5.net;

import android.annotation.TargetApi;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import com.cootek.geo.AbsGeoLocationItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.cootek.smartinput5.net.t */
/* compiled from: GeoLocation */
public class C2366t {

    /* renamed from: b */
    private static final long f10423b = 5000;

    /* renamed from: c */
    private static final float f10424c = 500.0f;

    /* renamed from: d */
    private static final int f10425d = 120000;

    /* renamed from: e */
    private static final long f10426e = 20000;

    /* renamed from: a */
    LocationListener f10427a;

    /* renamed from: f */
    private Context f10428f;

    /* renamed from: g */
    private LocationManager f10429g;

    /* renamed from: h */
    private Location f10430h;

    /* renamed from: i */
    private long f10431i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Geocoder f10432j;

    /* renamed from: k */
    private Handler f10433k;

    /* renamed from: l */
    private List<C2369c> f10434l;

    /* renamed from: com.cootek.smartinput5.net.t$b */
    /* compiled from: GeoLocation */
    public interface C2368b {
        /* renamed from: a */
        void mo7639a(Location location);

        /* renamed from: a */
        void mo7640a(Location location, List<Address> list);
    }

    /* renamed from: com.cootek.smartinput5.net.t$c */
    /* compiled from: GeoLocation */
    public interface C2369c {
        /* renamed from: a */
        void mo7636a(Location location);

        /* renamed from: b */
        void mo7637b(Location location);

        /* renamed from: c */
        void mo7638c(Location location);
    }

    public C2366t(Context context) {
        this(context, Locale.getDefault());
    }

    public C2366t(Context context, Locale locale) {
        this.f10427a = new C2371v(this);
        this.f10429g = (LocationManager) context.getSystemService("location");
        this.f10434l = new ArrayList();
        this.f10432j = new Geocoder(context, locale);
        this.f10428f = context;
        this.f10433k = new Handler();
    }

    @TargetApi(8)
    /* renamed from: a */
    public boolean mo8036a() {
        if (Build.VERSION.SDK_INT >= 8) {
            return Settings.Secure.isLocationProviderEnabled(this.f10428f.getContentResolver(), "network");
        }
        return false;
    }

    /* renamed from: b */
    public void mo8039b() {
        mo8045f();
        for (C2369c a : this.f10434l) {
            a.mo7636a(this.f10430h);
        }
        mo8046g();
        mo8047h();
        this.f10431i = System.currentTimeMillis();
        this.f10433k.postDelayed(new C2370u(this), f10426e);
    }

    /* renamed from: a */
    public void mo8033a(Location location, int i, C2368b bVar) {
        new C2367a(i, bVar).execute(new Location[]{location});
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8042c() {
        if (this.f10431i > 0) {
            this.f10431i = -1;
            this.f10429g.removeUpdates(this.f10427a);
            for (C2369c b : this.f10434l) {
                b.mo7637b(this.f10430h);
            }
        }
    }

    /* renamed from: a */
    public void mo8034a(C2369c cVar) {
        if (!this.f10434l.contains(cVar)) {
            this.f10434l.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo8041b(C2369c cVar) {
        if (this.f10434l.contains(cVar)) {
            this.f10434l.remove(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8035a(String str) {
        if (str != null) {
            try {
                if (this.f10429g.isProviderEnabled(str)) {
                    this.f10429g.requestLocationUpdates(str, f10423b, 0.0f, this.f10427a);
                }
            } catch (SecurityException e) {
            }
        }
    }

    /* renamed from: d */
    public void mo8043d() {
        mo8045f();
        mo8042c();
    }

    /* renamed from: i */
    private Location m10855i() {
        if ("network" == 0) {
            return null;
        }
        try {
            if (this.f10429g.isProviderEnabled("network")) {
                return this.f10429g.getLastKnownLocation("network");
            }
            return null;
        } catch (SecurityException e) {
            return null;
        }
    }

    /* renamed from: e */
    public boolean mo8044e() {
        try {
            if (this.f10429g.getProvider("network") != null) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo8045f() {
        Location location = null;
        if (AbsGeoLocationItem.LOCATION_PROVIDER_GPS != 0) {
            try {
                if (this.f10429g.isProviderEnabled(AbsGeoLocationItem.LOCATION_PROVIDER_GPS)) {
                    location = this.f10429g.getLastKnownLocation(AbsGeoLocationItem.LOCATION_PROVIDER_GPS);
                }
            } catch (IllegalArgumentException | SecurityException e) {
            }
        }
        this.f10430h = location;
        Location i = m10855i();
        if (i != null && mo8037a(i, this.f10430h)) {
            this.f10430h = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo8046g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8047h() {
        mo8035a("network");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8032a(Location location) {
        this.f10430h = location;
        for (C2369c c : this.f10434l) {
            c.mo7638c(this.f10430h);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8040b(Location location) {
        if (mo8037a(location, this.f10430h)) {
            mo8032a(location);
            if (location.hasAccuracy() && location.getAccuracy() < f10424c) {
                mo8042c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8037a(Location location, Location location2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z5 = time > 120000;
        if (time < -120000) {
            z = true;
        } else {
            z = false;
        }
        if (time > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z5) {
            return true;
        }
        if (z) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z6 = accuracy > 0;
        if (accuracy < 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (accuracy > 200) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean a = mo8038a(location.getProvider(), location2.getProvider());
        if (z3) {
            return true;
        }
        if (z2 && !z6) {
            return true;
        }
        if (!z2 || z4 || !a) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8038a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: com.cootek.smartinput5.net.t$a */
    /* compiled from: GeoLocation */
    class C2367a extends AsyncTask<Location, Void, List<Address>> {

        /* renamed from: b */
        private int f10436b;

        /* renamed from: c */
        private C2368b f10437c;

        /* renamed from: d */
        private Location f10438d;

        C2367a(int i, C2368b bVar) {
            this.f10436b = i;
            this.f10437c = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<Address> doInBackground(Location... locationArr) {
            Location location = locationArr[0];
            this.f10438d = location;
            try {
                return C2366t.this.f10432j.getFromLocation(location.getLatitude(), location.getLongitude(), this.f10436b);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(List<Address> list) {
            if (list == null || list.size() <= 0) {
                if (this.f10437c != null) {
                    this.f10437c.mo7639a(this.f10438d);
                }
            } else if (this.f10437c != null) {
                this.f10437c.mo7640a(this.f10438d, list);
            }
        }
    }
}
