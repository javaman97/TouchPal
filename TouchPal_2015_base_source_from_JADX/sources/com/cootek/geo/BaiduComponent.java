package com.cootek.geo;

import android.content.Context;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.cootek.geo.AbsComponent;
import com.cootek.geo.GeoLocationManager;
import com.cootek.smartinput5.func.C1411aV;

class BaiduComponent extends AbsComponent implements BDLocationListener {
    private GeoLocationManager.ILocationChangeListener mCachedListener;
    private LocationClient mLocationClient;

    public BaiduComponent(Context context, String str) {
        this.mLocationClient = new LocationClient(context);
        this.mLocationClient.registerLocationListener(this);
        this.mLocationClient.setAK(str);
        LocationClientOption locationClientOption = new LocationClientOption();
        locationClientOption.setAddrType(C1411aV.f4472R);
        locationClientOption.setCoorType("gcj02");
        locationClientOption.setScanSpan(0);
        locationClientOption.disableCache(false);
        locationClientOption.setPoiNumber(0);
        locationClientOption.setPriority(2);
        this.mLocationClient.setLocOption(locationClientOption);
        this.mLocationClient.start();
    }

    public void invalidate() {
        this.mLocationClient.stop();
        this.mLocationClient.unRegisterLocationListener(this);
        this.mLocationClient = null;
    }

    /* access modifiers changed from: protected */
    public boolean isComponentAvailable() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean startPosition(boolean z, GeoLocationManager.ILocationChangeListener iLocationChangeListener) {
        this.mCachedListener = iLocationChangeListener;
        this.mLocationClient.getLocOption().setOpenGps(isGpsEnable());
        this.mLocationClient.requestLocation();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean stopPosition() {
        if (this.mCachedListener == null) {
            return false;
        }
        this.mCachedListener.onLocationChanged(new AbsComponent.EmptyTimeoutGeoLocationItem());
        return true;
    }

    /* access modifiers changed from: protected */
    public void setCacheEnable(boolean z, long j) {
        this.mLocationClient.getLocOption().disableCache(!z);
    }

    public void onReceiveLocation(BDLocation bDLocation) {
        BaiduGeoLocationItem baiduGeoLocationItem;
        int locType = bDLocation != null ? bDLocation.getLocType() : 0;
        if (locType == 61 || locType == 65 || locType == 161) {
            baiduGeoLocationItem = new BaiduGeoLocationItem(bDLocation);
        } else {
            baiduGeoLocationItem = null;
        }
        AbsGeoLocationItem betterLocationItem = getBetterLocationItem(baiduGeoLocationItem);
        if (betterLocationItem != null && betterLocationItem.isValid() && this.mCachedListener != null) {
            this.mCachedListener.onLocationChanged(betterLocationItem);
            this.mCachedListener = null;
        }
    }

    public void onReceivePoi(BDLocation bDLocation) {
    }

    private static class BaiduGeoLocationItem extends AbsGeoLocationItem {
        private BDLocation mLocation;
        private final long mTime;

        public BaiduGeoLocationItem(BDLocation bDLocation) {
            this.mTime = System.currentTimeMillis();
            this.mLocation = bDLocation;
        }

        private BaiduGeoLocationItem(BDLocation bDLocation, long j, String str) {
            super(str);
            this.mTime = j;
            this.mLocation = bDLocation;
        }

        public String getSystem() {
            return AbsGeoLocationItem.LOCATION_SYSTEM_BAIDU;
        }

        public String getProvider() {
            if (61 == this.mLocation.getLocType()) {
                return AbsGeoLocationItem.LOCATION_PROVIDER_GPS;
            }
            return "network";
        }

        public Double getLatitude() {
            return Double.valueOf(this.mLocation.getLatitude());
        }

        public Double getLongitude() {
            return Double.valueOf(this.mLocation.getLongitude());
        }

        public String getCountryCode() {
            return "CN";
        }

        public String getCity() {
            return this.mLocation.getCity();
        }

        public String getAddr() {
            return this.mLocation.getAddrStr();
        }

        /* access modifiers changed from: protected */
        public boolean hasAccuracy() {
            return this.mLocation.hasRadius();
        }

        /* access modifiers changed from: protected */
        public float getAccuracy() {
            return this.mLocation.getRadius();
        }

        /* access modifiers changed from: protected */
        public long getTime() {
            return this.mTime;
        }

        /* access modifiers changed from: protected */
        public boolean isValid() {
            return this.mLocation != null;
        }

        /* access modifiers changed from: protected */
        public Object clone() throws CloneNotSupportedException {
            return new BaiduGeoLocationItem(this.mLocation, this.mTime, getResultType());
        }
    }
}
