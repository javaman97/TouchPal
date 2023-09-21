package com.yahoo.mobile.client.share.search.data;

import java.util.ArrayList;

public class SearchResponseData {

    /* renamed from: a */
    private ArrayList<? extends Object> f16704a;

    /* renamed from: b */
    private MetaData f16705b;

    public SearchResponseData(ArrayList<? extends Object> arrayList) {
        this.f16705b = null;
        this.f16704a = arrayList;
    }

    public SearchResponseData(MetaData metaData, ArrayList<? extends Object> arrayList) {
        this.f16704a = arrayList;
        this.f16705b = metaData;
    }

    public MetaData getMetaData() {
        return this.f16705b;
    }

    public void setMetaData(MetaData metaData) {
        this.f16705b = metaData;
    }

    public ArrayList<? extends Object> getResponseList() {
        return this.f16704a;
    }

    public void setResponseList(ArrayList<? extends Object> arrayList) {
        this.f16704a = arrayList;
    }
}
