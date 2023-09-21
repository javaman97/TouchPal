package com.yahoo.mobile.client.share.search.data;

public class LocalData {

    /* renamed from: a */
    private String f16640a;

    /* renamed from: b */
    private String f16641b;

    /* renamed from: c */
    private String f16642c;

    /* renamed from: d */
    private String f16643d;

    /* renamed from: e */
    private String f16644e;

    public LocalData(String str, String str2, String str3, String str4, String str5) {
        this.f16640a = str;
        this.f16641b = str2;
        this.f16642c = str3;
        this.f16644e = str4;
        this.f16643d = str5;
    }

    public String getSourceUrl() {
        return this.f16640a;
    }

    public String getTitle() {
        return this.f16642c;
    }

    public String getDescription() {
        return this.f16644e;
    }

    public String getTrackUrl() {
        return this.f16641b;
    }

    public String getAddress() {
        return this.f16643d;
    }
}
