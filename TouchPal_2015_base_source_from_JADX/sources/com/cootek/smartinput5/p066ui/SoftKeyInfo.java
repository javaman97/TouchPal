package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.ui.SoftKeyInfo */
public class SoftKeyInfo {
    public static final int CLICK = 0;
    public static final int DOUBLECLICK = 3;
    public static final int DOWNSLIDE = 5;
    public static final int LEFTDOWNSLIDE = 10;
    public static final int LEFTSLIDE = 6;
    public static final int LEFTUPSLIDE = 8;
    public static final int LONGPRESS_BEGIN = 12;
    public static final int LONGPRESS_END = 13;
    public static final int LONGPRESS_LEFTSLIDE = 14;
    public static final int LONGPRESS_MULTI = 2;
    public static final int LONGPRESS_ONCE = 1;
    public static final int LONGPRESS_RIGHTSLIDE = 15;
    public static final int RIGHTDOWNSLIDE = 11;
    public static final int RIGHTSLIDE = 7;
    public static final int RIGHTUPSLIDE = 9;
    public static final int SOFTKEY_OP_COUNT = 16;
    private static final String TAG = "KeyInfo";
    public static final int TITLETYPE_ALT = 2;
    public static final int TITLETYPE_LEFT = 4;
    public static final int TITLETYPE_LEFTRIGHT = 12;
    public static final int TITLETYPE_MAIN = 1;
    public static final int TITLETYPE_RIGHT = 8;
    public static final int UPSLIDE = 4;
    public String altTitle;
    String leftTitle;
    private boolean mMistypingTolerant = false;
    public String mainTitle;
    boolean needUpdate = true;
    int printTitle;
    String rightTitle;
    int supportedOperation;

    public void update(int i, String str, String str2, String str3, String str4, boolean z) {
        this.mMistypingTolerant = z;
        updateRes(i, getResString(str), getResString(str2), getResString(str3), getResString(str4));
    }

    public void updateRes(int i, String str, String str2, String str3, String str4) {
        if (this.printTitle != i) {
            this.needUpdate = true;
        }
        this.printTitle = i;
        if ((i & 1) == 1 && !str.equals(this.mainTitle)) {
            this.mainTitle = str;
            this.needUpdate = true;
        }
        if ((i & 2) == 2 && !str2.equals(this.altTitle)) {
            this.altTitle = str2;
            this.needUpdate = true;
        }
        if ((i & 4) == 4 && !str3.equals(this.leftTitle)) {
            this.leftTitle = str3;
            this.needUpdate = true;
        }
        if ((i & 8) == 8 && !str4.equals(this.rightTitle)) {
            this.rightTitle = str4;
            this.needUpdate = true;
        }
    }

    private String getResString(String str) {
        return C1368X.m6320c().mo5838k().mo6241b(str);
    }

    public void setSupportedOperation(int i) {
        this.supportedOperation = i;
    }

    public boolean isOperationSupported(int i) {
        return (this.supportedOperation & (1 << i)) != 0;
    }

    public boolean isMistypingTolerant() {
        return this.mMistypingTolerant;
    }
}
