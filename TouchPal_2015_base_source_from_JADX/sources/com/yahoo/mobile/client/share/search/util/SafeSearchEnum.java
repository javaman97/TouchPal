package com.yahoo.mobile.client.share.search.util;

public enum SafeSearchEnum {
    STRICT("r"),
    MODERATE("i"),
    OFF("p");
    

    /* renamed from: a */
    private String f17316a;

    private SafeSearchEnum(String str) {
        this.f17316a = str;
    }

    public final String getSafeSearchStringValue() {
        return this.f17316a;
    }

    public static SafeSearchEnum fromSafeSearchStringValue(String str) {
        if (str != null) {
            for (SafeSearchEnum safeSearchEnum : values()) {
                if (str.equalsIgnoreCase(safeSearchEnum.getSafeSearchStringValue())) {
                    return safeSearchEnum;
                }
            }
        }
        throw new IllegalArgumentException("There is no value with text '" + str + " in SafeSearchEnum ");
    }
}
