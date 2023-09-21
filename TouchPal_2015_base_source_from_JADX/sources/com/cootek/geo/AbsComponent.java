package com.cootek.geo;

import com.cootek.geo.GeoLocationManager;

abstract class AbsComponent {
    private boolean mGpsEnabled;
    private AbsGeoLocationItem mLastKnownLocationItem;

    public abstract void invalidate();

    /* access modifiers changed from: protected */
    public abstract boolean isComponentAvailable();

    /* access modifiers changed from: protected */
    public abstract void setCacheEnable(boolean z, long j);

    /* access modifiers changed from: protected */
    public abstract boolean startPosition(boolean z, GeoLocationManager.ILocationChangeListener iLocationChangeListener);

    /* access modifiers changed from: protected */
    public abstract boolean stopPosition();

    /* access modifiers changed from: protected */
    public final void setGpsEnable(boolean z) {
        this.mGpsEnabled = z;
    }

    /* access modifiers changed from: protected */
    public final boolean isGpsEnable() {
        return this.mGpsEnabled;
    }

    /* access modifiers changed from: protected */
    public final AbsGeoLocationItem getBetterLocationItem(AbsGeoLocationItem absGeoLocationItem) {
        if (absGeoLocationItem == null) {
            return this.mLastKnownLocationItem;
        }
        if (absGeoLocationItem.isBetter(this.mLastKnownLocationItem)) {
            this.mLastKnownLocationItem = absGeoLocationItem;
        }
        return this.mLastKnownLocationItem;
    }

    protected static class EmptyTimeoutGeoLocationItem extends AbsGeoLocationItem {
        protected EmptyTimeoutGeoLocationItem() {
        }

        public String getSystem() {
            return null;
        }

        public String getProvider() {
            return null;
        }

        public Double getLatitude() {
            return null;
        }

        public Double getLongitude() {
            return null;
        }

        public String getCountryCode() {
            return null;
        }

        public String getCity() {
            return null;
        }

        public String getAddr() {
            return null;
        }

        /* access modifiers changed from: protected */
        public boolean hasAccuracy() {
            return false;
        }

        /* access modifiers changed from: protected */
        public float getAccuracy() {
            return 0.0f;
        }

        /* access modifiers changed from: protected */
        public long getTime() {
            return 0;
        }

        /* access modifiers changed from: protected */
        public boolean isValid() {
            return true;
        }

        /* access modifiers changed from: protected */
        public Object clone() throws CloneNotSupportedException {
            return new EmptyTimeoutGeoLocationItem();
        }
    }
}
