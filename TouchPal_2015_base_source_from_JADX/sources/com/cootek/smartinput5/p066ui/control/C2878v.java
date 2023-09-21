package com.cootek.smartinput5.p066ui.control;

import android.content.res.TypedArray;
import android.util.TypedValue;

/* renamed from: com.cootek.smartinput5.ui.control.v */
/* compiled from: FractionCalaculator */
public class C2878v {
    /* renamed from: a */
    public static int m13321a(TypedArray typedArray, int i, int i2, int i3) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return i3;
        }
        if (peekValue.type == 5) {
            return typedArray.getDimensionPixelOffset(i, i3);
        }
        if (peekValue.type == 6) {
            return Math.round(typedArray.getFraction(i, i2, i2, (float) i3));
        }
        return i3;
    }

    /* renamed from: b */
    public static int m13322b(TypedArray typedArray, int i, int i2, int i3) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return i3;
        }
        if (peekValue.type == 5) {
            return typedArray.getDimensionPixelOffset(i, i3);
        }
        if (peekValue.type == 6) {
            return (int) Math.ceil((double) typedArray.getFraction(i, i2, i2, (float) i3));
        }
        return i3;
    }
}
