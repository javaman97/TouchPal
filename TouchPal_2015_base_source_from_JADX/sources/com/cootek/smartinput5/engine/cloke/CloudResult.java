package com.cootek.smartinput5.engine.cloke;

public class CloudResult {
    private String candidate;
    private int dictTag;
    private String evidence;
    private int priority;
    private String tag;

    public CloudResult(String str, String str2, String str3, int i, int i2) {
        this.candidate = str;
        this.evidence = str2;
        this.tag = str3;
        this.dictTag = i;
        this.priority = i2;
    }

    public String getCandidate() {
        return this.candidate;
    }

    public String getEvidence() {
        return this.evidence;
    }

    public String getTag() {
        return this.tag;
    }

    public int getDictTag() {
        return this.dictTag;
    }

    public int getPriority() {
        return this.priority;
    }
}
