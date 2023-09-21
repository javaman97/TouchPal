package com.cootek.smartinput5.engine;

public class ExplicitInfo {
    public static final int CONFIRM_CHARS = 3;
    public static final int CONFIRM_STRING = 8;
    public static final int CONTEXT_CHARS = 5;
    private static final int NEED_REVERT = 140;
    public static final int PREDICT_CHARS = 4;
    public static final int RESOLVED_CHARS = 2;
    public static final int SIGNAL_CHARS = 6;
    public static final int STROKE_FILTER = 7;
    private static final int TYPE_LENGTH = 10;
    public static final int USER_INPUT_CHARS = 1;
    private int[] mBegin = new int[10];
    private int[] mEnd = new int[10];
    private int mLength;
    private int[] mType = new int[10];
    private int mTypeBit;

    public void reset() {
        this.mLength = 0;
        this.mTypeBit = 0;
    }

    public void setData(int i, int i2, int i3) {
        this.mTypeBit |= 1 << i;
        this.mType[this.mLength] = i;
        this.mBegin[this.mLength] = i2;
        this.mEnd[this.mLength] = i3;
        this.mLength++;
    }

    public int length() {
        return this.mLength;
    }

    public int getType(int i) {
        return this.mType[i];
    }

    public int getBegin(int i) {
        return this.mBegin[i];
    }

    public int getEnd(int i) {
        return this.mEnd[i];
    }

    public boolean needRevert() {
        return (this.mTypeBit & 140) != 0;
    }

    public void clone(ExplicitInfo explicitInfo) {
        for (int i = 0; i < explicitInfo.length(); i++) {
            setData(explicitInfo.getType(i), explicitInfo.getBegin(i), explicitInfo.getEnd(i));
        }
    }

    public int getIndex(int i) {
        for (int i2 = 0; i2 < this.mLength; i2++) {
            if (getType(i2) == i) {
                return i2;
            }
        }
        return -1;
    }

    public int getSize(int i) {
        int index = getIndex(i);
        if (index == -1) {
            return 0;
        }
        return getEnd(index) - getBegin(index);
    }
}
