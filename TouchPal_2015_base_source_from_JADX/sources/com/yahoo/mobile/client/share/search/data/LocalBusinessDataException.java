package com.yahoo.mobile.client.share.search.data;

public class LocalBusinessDataException extends Exception {
    public static final int ERR_NO_CONTACT_INFO = 13;
    public static final int ERR_NO_LISTING_ID = 10;
    public static final int ERR_NO_LOCATION = 12;
    public static final int ERR_NO_NAME = 11;

    /* renamed from: a */
    private int f16639a;

    public LocalBusinessDataException(int i) {
        this.f16639a = i;
    }

    public LocalBusinessDataException(int i, String str) {
        super("LocalBusinessDataException: " + str);
        this.f16639a = i;
    }

    public LocalBusinessDataException(int i, Throwable th) {
        super(th);
        this.f16639a = i;
    }

    public LocalBusinessDataException(int i, String str, Throwable th) {
        super("LocalBusinessDataException: " + str, th);
        this.f16639a = i;
    }

    public int getErrorCode() {
        return this.f16639a;
    }
}
