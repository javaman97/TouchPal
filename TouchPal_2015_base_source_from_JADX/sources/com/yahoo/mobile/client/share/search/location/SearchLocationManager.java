package com.yahoo.mobile.client.share.search.location;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

public class SearchLocationManager implements LocationListener, ISearchLocationManager {

    /* renamed from: a */
    private LocationManager f16743a;

    /* renamed from: b */
    private String f16744b;

    /* renamed from: c */
    private Location f16745c;

    /* renamed from: d */
    private Criteria f16746d;

    /* renamed from: e */
    private LocationListener f16747e;

    public SearchLocationManager(Context context) {
        this(context, (LocationManager) context.getSystemService("location"));
    }

    public SearchLocationManager(Context context, LocationManager locationManager) {
        if (locationManager != null) {
            this.f16743a = locationManager;
            this.f16746d = new Criteria();
            this.f16746d.setPowerRequirement(1);
            this.f16746d.setAccuracy(2);
            this.f16744b = this.f16743a.getBestProvider(this.f16746d, true);
            if (this.f16744b != null) {
                this.f16745c = this.f16743a.getLastKnownLocation(this.f16744b);
            }
        }
    }

    public void setLocationListener(LocationListener locationListener) {
        this.f16747e = locationListener;
    }

    public void setCriteria(Criteria criteria) {
        this.f16746d = criteria;
    }

    public Criteria getCriteria() {
        return this.f16746d;
    }

    public void requestUpdates() {
        if (this.f16743a != null) {
            this.f16744b = this.f16743a.getBestProvider(this.f16746d, true);
            if (this.f16744b != null) {
                this.f16743a.requestLocationUpdates(this.f16744b, 0, 0.0f, this);
            }
        }
    }

    public void removeUpdates() {
        this.f16743a.removeUpdates(this);
    }

    public Location getLocation() {
        if (this.f16745c == null && this.f16744b != null) {
            this.f16745c = this.f16743a.getLastKnownLocation(this.f16744b);
        }
        return this.f16745c;
    }

    public void onLocationChanged(Location location) {
        this.f16745c = location;
        if (this.f16747e != null) {
            this.f16747e.onLocationChanged(location);
        }
    }

    public void onProviderDisabled(String str) {
        if (this.f16747e != null) {
            this.f16747e.onProviderDisabled(str);
        }
    }

    public void onProviderEnabled(String str) {
        if (this.f16747e != null) {
            this.f16747e.onProviderEnabled(str);
        }
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        if (this.f16747e != null) {
            this.f16747e.onStatusChanged(str, i, bundle);
        }
    }
}
