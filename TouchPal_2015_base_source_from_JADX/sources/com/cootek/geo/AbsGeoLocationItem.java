package com.cootek.geo;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

public abstract class AbsGeoLocationItem {
    private static final int ACCURACY_THRESHOLD = 200;
    private static final String CITY_POST = "市";
    public static final String LOCATION_CITY = "city";
    public static final String LOCATION_CITYCODE = "citycode";
    public static final String LOCATION_COUNTRYCODE = "countrycode";
    public static final String LOCATION_LATITUDE = "latitude";
    public static final String LOCATION_LONGITUDE = "longitude";
    public static final String LOCATION_PROVIDER = "provider";
    public static final String LOCATION_PROVIDER_GPS = "gps";
    public static final String LOCATION_PROVIDER_NETWORK = "network";
    public static final String LOCATION_RESULTTYPE = "resulttype";
    public static final String LOCATION_RESULTTYPE_CACHE = "cache";
    public static final String LOCATION_RESULTTYPE_LATEST = "latest";
    public static final String LOCATION_SYSTEM = "system";
    public static final String LOCATION_SYSTEM_BAIDU = "Baidu";
    public static final String LOCATION_SYSTEM_COOTEK = "CooTek";
    public static final String LOCATION_SYSTEM_GOOGLE = "Google";
    private static final int TWO_MINUTES = 120000;
    private String mResultType;

    /* access modifiers changed from: protected */
    public abstract Object clone() throws CloneNotSupportedException;

    /* access modifiers changed from: protected */
    public abstract float getAccuracy();

    public abstract String getAddr();

    public abstract String getCity();

    public abstract String getCountryCode();

    public abstract Double getLatitude();

    public abstract Double getLongitude();

    public abstract String getProvider();

    public abstract String getSystem();

    /* access modifiers changed from: protected */
    public abstract long getTime();

    /* access modifiers changed from: protected */
    public abstract boolean hasAccuracy();

    /* access modifiers changed from: protected */
    public abstract boolean isValid();

    public AbsGeoLocationItem() {
        this.mResultType = LOCATION_RESULTTYPE_LATEST;
    }

    protected AbsGeoLocationItem(String str) {
        this.mResultType = str;
    }

    public final String getCityAreoCode() {
        String city = getCity();
        if (TextUtils.isEmpty(city)) {
            return String.valueOf(0);
        }
        if (city.endsWith(CITY_POST)) {
            city = city.substring(0, city.length() - 1);
        }
        String cityCode = ChinaCitiesCode.getCityCode(city);
        return cityCode == null ? String.valueOf(0) : cityCode;
    }

    /* access modifiers changed from: package-private */
    public final void setResultType(String str) {
        this.mResultType = str;
    }

    public final String getResultType() {
        return this.mResultType;
    }

    public final String printJsonString() {
        String str = null;
        HashMap hashMap = new HashMap();
        hashMap.put(LOCATION_SYSTEM, getSystem());
        hashMap.put(LOCATION_PROVIDER, getProvider());
        hashMap.put(LOCATION_RESULTTYPE, getResultType());
        Double latitude = getLatitude();
        hashMap.put("latitude", latitude == null ? null : latitude.toString());
        Double longitude = getLongitude();
        if (longitude != null) {
            str = longitude.toString();
        }
        hashMap.put("longitude", str);
        hashMap.put(LOCATION_COUNTRYCODE, getCountryCode());
        hashMap.put(LOCATION_CITY, getCity());
        hashMap.put(LOCATION_CITYCODE, getCityAreoCode());
        return new JSONObject(hashMap).toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean isBetter(AbsGeoLocationItem absGeoLocationItem) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (absGeoLocationItem == null) {
            return true;
        }
        if (absGeoLocationItem.getCity() == null && getCity() != null) {
            return true;
        }
        long time = getTime() - absGeoLocationItem.getTime();
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
        int accuracy = (int) (getAccuracy() - absGeoLocationItem.getAccuracy());
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
        boolean isProviderSame = isProviderSame(getProvider(), absGeoLocationItem.getProvider());
        if (z3) {
            return true;
        }
        if (z2 && !z6) {
            return true;
        }
        if (!z2 || z4 || !isProviderSame) {
            return false;
        }
        return true;
    }

    private boolean isProviderSame(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
