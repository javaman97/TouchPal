package com.yahoo.mobile.client.share.search.p099ui.activity;

/* renamed from: com.yahoo.mobile.client.share.search.ui.activity.TrendingSearchEnum */
public enum TrendingSearchEnum {
    DEFAULT("default"),
    NONE("None"),
    NEWS("news"),
    SPORTS("sports"),
    CELEBRITY("celebrity");
    

    /* renamed from: a */
    private final String f17066a;

    private TrendingSearchEnum(String str) {
        this.f17066a = str;
    }

    public final String toString() {
        return this.f17066a;
    }

    public static boolean contains(String str) {
        for (TrendingSearchEnum trendingSearchEnum : values()) {
            if (trendingSearchEnum.f17066a.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
