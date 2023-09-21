package com.cootek.smartinput5.engine;

import com.cootek.smartinput5.p066ui.C2727bG;

public class FilterItem implements C2727bG {
    public static final int TYPE_HANDWRITE_FILTER = 4;
    public static final int TYPE_MISTYPE_CORRECT = 3;
    public static final int TYPE_PHONEPAD_RESOLVE = 1;
    public static final int TYPE_PINYIN_FILTER = 2;
    public String filter;
    public int index;
    public int tag;

    public void setData(int i, String str, int i2) {
        this.index = i;
        this.filter = str;
        this.tag = i2;
    }

    public String getDisplayString() {
        return this.filter;
    }

    public int getTag() {
        return this.tag;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FilterItem) {
            return this.filter.equals(((FilterItem) obj).filter);
        }
        return false;
    }

    public boolean hasLongPressIcon() {
        return false;
    }

    public boolean hasAdditionalIcon() {
        return false;
    }
}
