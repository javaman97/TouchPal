package com.yahoo.mobile.client.share.search.data;

public class TrendingData extends SearchAssistData {

    /* renamed from: a */
    private String f16710a;

    /* renamed from: b */
    private String f16711b;

    /* renamed from: c */
    private String f16712c;

    /* renamed from: d */
    private int f16713d;

    /* renamed from: e */
    private String f16714e;

    public TrendingData(String str, String str2) {
        super(str, str2, 5);
        this.f16710a = str;
        this.f16712c = str2;
    }

    public int getValidStatus() {
        return this.f16713d;
    }

    public void setValidStatus(int i) {
        this.f16713d = i;
    }

    public String getSearchLink() {
        return this.f16714e;
    }

    public void setSearchLink(String str) {
        this.f16714e = str;
    }

    public String getSearchTerm() {
        return this.f16710a;
    }

    public void setSearchTerm(String str) {
        this.f16710a = str;
    }

    public String getCategory() {
        return this.f16712c;
    }

    public void setCategory(String str) {
        this.f16712c = str;
    }

    public String getScore() {
        return this.f16711b;
    }

    public void setScore(String str) {
        this.f16711b = str;
    }
}
