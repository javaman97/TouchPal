package com.cootek.smartinput5.engine.cloke;

public class CloudParameters {
    private static final String TAG = "CloudParameter";
    public String filter;
    public String history;
    public String key_string;
    public String location;
    public int options;
    public String shuangpin_config;
    public String stroke_filter;
    public String userid;

    public void setLocation(String str) {
        this.location = str;
    }

    public void setData(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.key_string = str6;
        this.options = i;
        this.history = str;
        this.filter = str2;
        this.stroke_filter = str3;
        this.shuangpin_config = str4;
        this.userid = str5;
    }
}
