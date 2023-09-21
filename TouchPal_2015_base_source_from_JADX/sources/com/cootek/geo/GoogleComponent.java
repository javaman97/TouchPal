package com.cootek.geo;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import com.cootek.geo.AbsComponent;
import com.cootek.geo.GeoLocationManager;

class GoogleComponent extends AbsComponent implements LocationListener {
    private boolean mCacheEnabled = false;
    private long mCacheMillis = 0;
    /* access modifiers changed from: private */
    public GeoLocationManager.ILocationChangeListener mCachedListener;
    private boolean mCachedRequireCity;
    private boolean mFromCache = false;
    /* access modifiers changed from: private */
    public Geocoder mGeocoder;
    /* access modifiers changed from: private */
    public LocationManager mLocationmanager;

    public GoogleComponent(Context context) {
        this.mLocationmanager = (LocationManager) context.getSystemService("location");
        this.mGeocoder = new Geocoder(context);
    }

    public void invalidate() {
        this.mLocationmanager.removeUpdates(this);
    }

    public boolean isComponentAvailable() {
        boolean isProviderEnabled = this.mLocationmanager.isProviderEnabled("network");
        if (isGpsEnable()) {
            return isProviderEnabled | this.mLocationmanager.isProviderEnabled(AbsGeoLocationItem.LOCATION_PROVIDER_GPS);
        }
        return isProviderEnabled;
    }

    /* access modifiers changed from: protected */
    public boolean startPosition(boolean z, GeoLocationManager.ILocationChangeListener iLocationChangeListener) {
        Location lastKnownLocation;
        this.mCachedListener = iLocationChangeListener;
        this.mCachedRequireCity = z;
        this.mFromCache = false;
        if (!this.mCacheEnabled || (lastKnownLocation = getLastKnownLocation()) == null) {
            requestLocationUpdates("network");
            if (isGpsEnable()) {
                requestLocationUpdates(AbsGeoLocationItem.LOCATION_PROVIDER_GPS);
            }
        } else {
            Log.i("GoogleComponent", "Get location from cache!");
            this.mFromCache = true;
            onLocationChanged(lastKnownLocation);
        }
        return true;
    }

    private void requestLocationUpdates(String str) {
        if (this.mLocationmanager.isProviderEnabled(str)) {
            this.mLocationmanager.requestLocationUpdates(str, 1000, 0.0f, this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean stopPosition() {
        if (this.mCachedListener == null) {
            return false;
        }
        this.mCachedListener.onLocationChanged(new AbsComponent.EmptyTimeoutGeoLocationItem());
        this.mLocationmanager.removeUpdates(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public void setCacheEnable(boolean z, long j) {
        this.mCacheEnabled = z;
        this.mCacheMillis = j;
    }

    public void onLocationChanged(final Location location) {
        if (!this.mCachedRequireCity || this.mFromCache) {
            AbsGeoLocationItem betterLocationItem = getBetterLocationItem(new GoogleGeoLocationItem(location, (Address) null));
            if (betterLocationItem == null || !betterLocationItem.isValid()) {
                this.mLocationmanager.removeUpdates(this);
                return;
            }
            if (this.mCachedListener != null) {
                this.mCachedListener.onLocationChanged(betterLocationItem);
                this.mCachedListener = null;
            }
            this.mLocationmanager.removeUpdates(this);
            return;
        }
        new Thread(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r8 = this;
                    r7 = 0
                    com.cootek.geo.GoogleComponent r0 = com.cootek.geo.GoogleComponent.this     // Catch:{ IllegalArgumentException -> 0x0053, IOException -> 0x0059, NullPointerException -> 0x005f }
                    android.location.Geocoder r1 = r0.mGeocoder     // Catch:{ IllegalArgumentException -> 0x0053, IOException -> 0x0059, NullPointerException -> 0x005f }
                    android.location.Location r0 = r4     // Catch:{ IllegalArgumentException -> 0x0053, IOException -> 0x0059, NullPointerException -> 0x005f }
                    double r2 = r0.getLatitude()     // Catch:{ IllegalArgumentException -> 0x0053, IOException -> 0x0059, NullPointerException -> 0x005f }
                    android.location.Location r0 = r4     // Catch:{ IllegalArgumentException -> 0x0053, IOException -> 0x0059, NullPointerException -> 0x005f }
                    double r4 = r0.getLongitude()     // Catch:{ IllegalArgumentException -> 0x0053, IOException -> 0x0059, NullPointerException -> 0x005f }
                    r6 = 1
                    java.util.List r0 = r1.getFromLocation(r2, r4, r6)     // Catch:{ IllegalArgumentException -> 0x0053, IOException -> 0x0059, NullPointerException -> 0x005f }
                    if (r0 == 0) goto L_0x0063
                    boolean r1 = r0.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0053, IOException -> 0x0059, NullPointerException -> 0x005f }
                    if (r1 != 0) goto L_0x0063
                    r1 = 0
                    java.lang.Object r0 = r0.get(r1)     // Catch:{ IllegalArgumentException -> 0x0053, IOException -> 0x0059, NullPointerException -> 0x005f }
                    android.location.Address r0 = (android.location.Address) r0     // Catch:{ IllegalArgumentException -> 0x0053, IOException -> 0x0059, NullPointerException -> 0x005f }
                    r1 = r0
                L_0x0028:
                    if (r1 == 0) goto L_0x0065
                    com.cootek.geo.GoogleComponent$GoogleGeoLocationItem r0 = new com.cootek.geo.GoogleComponent$GoogleGeoLocationItem
                    android.location.Location r2 = r4
                    r0.<init>(r2, r1)
                L_0x0031:
                    com.cootek.geo.GoogleComponent r1 = com.cootek.geo.GoogleComponent.this
                    com.cootek.geo.AbsGeoLocationItem r0 = r1.getBetterLocationItem(r0)
                    if (r0 == 0) goto L_0x003f
                    boolean r1 = r0.isValid()
                    if (r1 != 0) goto L_0x006d
                L_0x003f:
                    com.cootek.geo.GoogleComponent r0 = com.cootek.geo.GoogleComponent.this
                    android.location.LocationManager r0 = r0.mLocationmanager
                    if (r0 == 0) goto L_0x0052
                    com.cootek.geo.GoogleComponent r0 = com.cootek.geo.GoogleComponent.this
                    android.location.LocationManager r0 = r0.mLocationmanager
                    com.cootek.geo.GoogleComponent r1 = com.cootek.geo.GoogleComponent.this
                    r0.removeUpdates(r1)
                L_0x0052:
                    return
                L_0x0053:
                    r0 = move-exception
                    r0.printStackTrace()
                    r1 = r7
                    goto L_0x0028
                L_0x0059:
                    r0 = move-exception
                    r0.printStackTrace()
                    r1 = r7
                    goto L_0x0028
                L_0x005f:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x0063:
                    r1 = r7
                    goto L_0x0028
                L_0x0065:
                    com.cootek.geo.GoogleComponent$GoogleGeoLocationItem r0 = new com.cootek.geo.GoogleComponent$GoogleGeoLocationItem
                    android.location.Location r1 = r4
                    r0.<init>(r1, r7)
                    goto L_0x0031
                L_0x006d:
                    com.cootek.geo.GoogleComponent r1 = com.cootek.geo.GoogleComponent.this
                    com.cootek.geo.GeoLocationManager$ILocationChangeListener r1 = r1.mCachedListener
                    if (r1 == 0) goto L_0x0083
                    com.cootek.geo.GoogleComponent r1 = com.cootek.geo.GoogleComponent.this
                    com.cootek.geo.GeoLocationManager$ILocationChangeListener r1 = r1.mCachedListener
                    r1.onLocationChanged(r0)
                    com.cootek.geo.GoogleComponent r0 = com.cootek.geo.GoogleComponent.this
                    r0.mCachedListener = r7
                L_0x0083:
                    com.cootek.geo.GoogleComponent r0 = com.cootek.geo.GoogleComponent.this
                    android.location.LocationManager r0 = r0.mLocationmanager
                    if (r0 == 0) goto L_0x0052
                    com.cootek.geo.GoogleComponent r0 = com.cootek.geo.GoogleComponent.this
                    android.location.LocationManager r0 = r0.mLocationmanager
                    com.cootek.geo.GoogleComponent r1 = com.cootek.geo.GoogleComponent.this
                    r0.removeUpdates(r1)
                    goto L_0x0052
                */
                throw new UnsupportedOperationException("Method not decompiled: com.cootek.geo.GoogleComponent.C09181.run():void");
            }
        }).start();
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onProviderDisabled(String str) {
    }

    private Location getLastKnownLocation() {
        Location location = null;
        for (String lastKnownLocation : this.mLocationmanager.getProviders(true)) {
            Location lastKnownLocation2 = this.mLocationmanager.getLastKnownLocation(lastKnownLocation);
            if (lastKnownLocation2 != null && (location == null || lastKnownLocation2.getAccuracy() < location.getAccuracy())) {
                location = lastKnownLocation2;
            }
        }
        if (location != null) {
            if (System.currentTimeMillis() - location.getTime() < this.mCacheMillis) {
                return location;
            }
        }
        return null;
    }

    private static class GoogleGeoLocationItem extends AbsGeoLocationItem {
        private final Address mAddress;
        private final Location mLocation;

        public GoogleGeoLocationItem(Location location, Address address) {
            this.mLocation = location;
            this.mAddress = address;
        }

        private GoogleGeoLocationItem(Location location, Address address, String str) {
            super(str);
            this.mLocation = location;
            this.mAddress = address;
        }

        public String getSystem() {
            return "Google";
        }

        public String getProvider() {
            return this.mLocation.getProvider();
        }

        public Double getLatitude() {
            return Double.valueOf(this.mLocation.getLatitude());
        }

        public Double getLongitude() {
            return Double.valueOf(this.mLocation.getLongitude());
        }

        public String getCountryCode() {
            if (this.mAddress == null) {
                return null;
            }
            return this.mAddress.getCountryCode();
        }

        public String getCity() {
            if (this.mAddress == null) {
                return null;
            }
            return this.mAddress.getLocality();
        }

        public String getAddr() {
            if (this.mAddress == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < this.mAddress.getMaxAddressLineIndex() && i < 3) {
                sb.append(this.mAddress.getAddressLine(i));
                i++;
            }
            return sb.toString();
        }

        /* access modifiers changed from: protected */
        public boolean hasAccuracy() {
            return this.mLocation.hasAccuracy();
        }

        /* access modifiers changed from: protected */
        public float getAccuracy() {
            return this.mLocation.getAccuracy();
        }

        /* access modifiers changed from: protected */
        public long getTime() {
            return this.mLocation.getTime();
        }

        /* access modifiers changed from: protected */
        public boolean isValid() {
            return this.mLocation != null;
        }

        /* access modifiers changed from: protected */
        public Object clone() throws CloneNotSupportedException {
            return new GoogleGeoLocationItem(this.mLocation, this.mAddress, getResultType());
        }
    }
}
