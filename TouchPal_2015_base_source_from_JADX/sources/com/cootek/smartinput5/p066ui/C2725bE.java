package com.cootek.smartinput5.p066ui;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;

/* renamed from: com.cootek.smartinput5.ui.bE */
/* compiled from: RendingColor */
public class C2725bE {

    /* renamed from: a */
    private static final int f12159a = 16711680;

    /* renamed from: b */
    private static final int f12160b = 65280;

    /* renamed from: c */
    private static final int f12161c = 255;

    /* renamed from: d */
    private static final int f12162d = -16777216;

    /* renamed from: e */
    private static final int[][] f12163e = {new int[]{f12159a, 16}, new int[]{65280, 8}, new int[]{255, 0}, new int[]{-16777216, 24}};

    /* renamed from: f */
    private ColorFilter f12164f;

    /* renamed from: a */
    public void mo8997a(int i, int i2) {
        if (C1368X.m6324d()) {
            C1602bh n = C1368X.m6320c().mo5841n();
            mo8998b(n.mo6260b(i), n.mo6260b(i2));
        }
    }

    /* renamed from: b */
    public void mo8998b(int i, int i2) {
        float[] c = m12507c(i, i2);
        if (c != null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.set(c);
            this.f12164f = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    /* renamed from: a */
    public Drawable mo8995a(Drawable drawable) {
        if (drawable != null) {
            drawable.clearColorFilter();
            drawable.setColorFilter(this.f12164f);
        }
        return drawable;
    }

    /* renamed from: a */
    public void mo8996a() {
        this.f12164f = null;
    }

    /* renamed from: c */
    private float[] m12507c(int i, int i2) {
        if (i == i2) {
            return null;
        }
        float[][] fArr = new float[4][];
        int length = f12163e.length;
        for (int i3 = 0; i3 < length; i3++) {
            fArr[i3] = m12506a(i, i2, f12163e[i3]);
        }
        return new float[]{fArr[0][0], 0.0f, 0.0f, 0.0f, fArr[0][1], 0.0f, fArr[1][0], 0.0f, 0.0f, fArr[1][1], 0.0f, 0.0f, fArr[2][0], 0.0f, fArr[2][1], 0.0f, 0.0f, 0.0f, fArr[3][0], fArr[3][1]};
    }

    /* renamed from: a */
    private float[] m12506a(int i, int i2, int[] iArr) {
        float f;
        float f2 = 0.0f;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = (i3 & i) >>> i4;
        int i6 = (i3 & i2) >>> i4;
        if (i5 == i6) {
            f2 = 1.0f;
            f = 0.0f;
        } else if (i5 == 0) {
            f = (float) i6;
        } else {
            f2 = ((float) i6) / ((float) i5);
            f = 0.0f;
        }
        return new float[]{f2, f};
    }
}
