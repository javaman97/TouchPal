package com.yahoo.mobile.client.share.search.data;

public class SearchStatusData {
    public static final int RESPONSE_STATUS_INVALID = 404;
    public static final int RESPONSE_STATUS_REVOKED = 401;
    public static final int RESPONSE_STATUS_SERVER_ERROR = 500;
    public static final String RESPONSE_STATUS_STRING_INVALID = "invalid";
    public static final String RESPONSE_STATUS_STRING_REVOKED = "revoked";
    public static final String RESPONSE_STATUS_STRING_VALID = "valid";
    public static final int RESPONSE_STATUS_VALID = 200;

    /* renamed from: a */
    private int f16707a;

    /* renamed from: b */
    private String f16708b;

    public enum SearchStatusEnum {
        VALID,
        INVALID,
        REVOKED,
        SERVER_ERROR,
        UNKOWN_ERROR
    }

    public SearchStatusData(int i, String str) {
        this.f16707a = i;
        this.f16708b = str;
    }

    public SearchStatusData(String str) {
        if (str.equals(RESPONSE_STATUS_STRING_VALID)) {
            this.f16707a = 200;
        } else if (str.equals(RESPONSE_STATUS_STRING_INVALID)) {
            this.f16707a = RESPONSE_STATUS_INVALID;
        } else if (str.equals(RESPONSE_STATUS_STRING_REVOKED)) {
            this.f16707a = RESPONSE_STATUS_REVOKED;
        }
        this.f16708b = str;
    }

    public String getDescription() {
        return this.f16708b;
    }

    public void setDescription(String str) {
        this.f16708b = str;
    }

    public SearchStatusEnum getValidStatus() {
        if (this.f16707a == 200) {
            return SearchStatusEnum.VALID;
        }
        if (this.f16707a == 401) {
            return SearchStatusEnum.REVOKED;
        }
        if (this.f16707a == 404) {
            return SearchStatusEnum.INVALID;
        }
        if (this.f16707a == 500) {
            return SearchStatusEnum.SERVER_ERROR;
        }
        return SearchStatusEnum.UNKOWN_ERROR;
    }

    public void setValidStatus(int i) {
        this.f16707a = i;
    }
}
