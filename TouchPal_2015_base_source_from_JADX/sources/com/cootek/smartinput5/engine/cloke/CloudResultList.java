package com.cootek.smartinput5.engine.cloke;

public class CloudResultList {
    private String history;
    private CloudResult[][] results;

    public CloudResultList(String str, CloudResult[][] cloudResultArr) {
        this.results = cloudResultArr;
        this.history = str;
    }

    public String getHistory() {
        return this.history;
    }

    public CloudResult[][] getResults() {
        return this.results;
    }
}
