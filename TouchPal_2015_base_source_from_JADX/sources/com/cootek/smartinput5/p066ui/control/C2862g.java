package com.cootek.smartinput5.p066ui.control;

import android.graphics.Color;

/* renamed from: com.cootek.smartinput5.ui.control.g */
/* compiled from: ColorUtils */
public class C2862g {
    /* renamed from: a */
    public static int[] m13250a(int i, int i2, int i3) {
        int[] iArr = new int[i];
        int i4 = (i2 >> 16) & 255;
        int i5 = (i3 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = (i3 >> 8) & 255;
        int i8 = i2 & 255;
        int i9 = i3 & 255;
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = (i10 << 16) / i;
            iArr[i10] = Color.argb(255, (((i5 - i4) * i11) >> 16) + i4, (((i7 - i6) * i11) >> 16) + i6, ((i11 * (i9 - i8)) >> 16) + i8);
        }
        return iArr;
    }

    /* renamed from: a */
    public static int[] m13251a(int i, int i2, int i3, int i4) {
        int[] a = m13250a(i / 2, i2, i3);
        int[] a2 = m13250a(i / 2, i3, i4);
        int[] iArr = new int[(a.length + a2.length)];
        System.arraycopy(a, 0, iArr, 0, a.length);
        System.arraycopy(a2, 0, iArr, a.length, a2.length);
        return iArr;
    }

    /* renamed from: a */
    public static int m13249a(int i, int i2) {
        return Color.argb((Color.alpha(i) * i2) / 255, Color.red(i), Color.green(i), Color.blue(i));
    }
}
