package com.yahoo.mobile.client.share.search;

public class SearchError {
    public static final int NO_COMMAND_TYPE = -1;
    public static final int NO_ERROR = 0;
    public static final int SEARCH_ERROR_CANNOT_REACH_HOST = 3;
    public static final int SEARCH_ERROR_EMPTY_RESULTS = 1;
    public static final int SEARCH_ERROR_NETWORK_UNAVAILABLE = 2;
    public static final int SEARCH_ERROR_OTHER_SERVER_ERROR = 4;
    public static final int SEARCH_ERROR_REQUEST_CANCELED = 5;
    public static final int SEARCH_ERROR_REVOKED_PARTNER = 10;

    /* renamed from: a */
    private int f16563a;

    /* renamed from: b */
    private int f16564b;

    /* renamed from: c */
    private Object f16565c;

    public SearchError(int i, int i2, Object obj) {
        this.f16563a = i;
        this.f16564b = i2;
        this.f16565c = obj;
    }

    public int getCommandType() {
        return this.f16563a;
    }

    public void setCommandType(int i) {
        this.f16563a = i;
    }

    public int getErrorCode() {
        return this.f16564b;
    }

    public void setErrorCode(int i) {
        this.f16564b = i;
    }

    public String getErrorMessage() {
        return this.f16565c.toString();
    }

    public Object getErrorObject() {
        return this.f16565c;
    }

    public void setErrorObject(Object obj) {
        this.f16565c = obj;
    }
}
