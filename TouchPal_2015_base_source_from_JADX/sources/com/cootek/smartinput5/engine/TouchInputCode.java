package com.cootek.smartinput5.engine;

public class TouchInputCode {
    private String mFuzzyString;
    private String mPreciseString;
    private int mRelativeX;
    private int mRelativeY;
    private long mTimeStamp;

    public void setData(String str, String str2, int i, int i2, long j) {
        this.mPreciseString = str;
        this.mFuzzyString = str2;
        this.mRelativeX = i;
        this.mRelativeY = i2;
        this.mTimeStamp = j;
    }

    public String getPreciseString() {
        return this.mPreciseString;
    }

    public String getFuzzyString() {
        return this.mFuzzyString;
    }

    public int getRelativeX() {
        return this.mRelativeX;
    }

    public int getRelativeY() {
        return this.mRelativeY;
    }

    public long getTimeStamp() {
        return this.mTimeStamp;
    }

    public String toString() {
        return String.format("precise = %s, fuzzy = %s, relativeX = %d, relativeY = %d, timestamp = %d", new Object[]{this.mPreciseString, this.mFuzzyString, Integer.valueOf(this.mRelativeX), Integer.valueOf(this.mRelativeY), Long.valueOf(this.mTimeStamp)});
    }
}
