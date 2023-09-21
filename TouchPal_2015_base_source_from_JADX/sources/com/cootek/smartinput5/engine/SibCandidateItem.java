package com.cootek.smartinput5.engine;

public class SibCandidateItem {
    private int mTag;
    private String mText;

    public void setData(String str, int i) {
        this.mText = str;
        this.mTag = i;
    }

    public String getText() {
        return this.mText;
    }

    public int getTag() {
        return this.mTag;
    }

    public String toString() {
        return String.format("text = %s, tag = %d", new Object[]{this.mText, Integer.valueOf(this.mTag)});
    }
}
