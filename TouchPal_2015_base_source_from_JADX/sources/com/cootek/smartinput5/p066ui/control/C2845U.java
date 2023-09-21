package com.cootek.smartinput5.p066ui.control;

import android.util.StateSet;

/* renamed from: com.cootek.smartinput5.ui.control.U */
/* compiled from: StateSet */
public class C2845U {

    /* renamed from: A */
    public static final int[] f12927A = m13131a(f12969z, f12950g);

    /* renamed from: B */
    public static final int[] f12928B = m13131a(f12969z, f12948e);

    /* renamed from: C */
    public static final int[] f12929C = m13131a(f12928B, f12950g);

    /* renamed from: D */
    public static final int[] f12930D = m13131a(f12969z, f12947d);

    /* renamed from: E */
    public static final int[] f12931E = m13131a(f12930D, f12950g);

    /* renamed from: F */
    public static final int[] f12932F = m13131a(f12930D, f12948e);

    /* renamed from: G */
    public static final int[] f12933G = m13131a(f12932F, f12950g);

    /* renamed from: H */
    public static final int[][] f12934H = {f12945b, f12950g, f12948e, f12956m, f12947d, f12955l, f12954k, f12960q, f12946c, f12953j, f12952i, f12959p, f12951h, f12958o, f12957n, f12961r, f12949f, f12962s, f12963t, f12964u, f12965v, f12966w, f12967x, f12968y, f12969z, f12927A, f12928B, f12929C, f12930D, f12931E, f12932F, f12933G};

    /* renamed from: I */
    public static final int[] f12935I = {16842918};

    /* renamed from: J */
    public static final int[] f12936J = {16842916};

    /* renamed from: K */
    public static final int[] f12937K = {16842917};

    /* renamed from: L */
    public static final int[] f12938L = {16842915};

    /* renamed from: M */
    public static final int[] f12939M = {16842918, 16842919};

    /* renamed from: N */
    public static final int[] f12940N = {16842916, 16842919};

    /* renamed from: O */
    public static final int[] f12941O = {16842917, 16842919};

    /* renamed from: P */
    public static final int[] f12942P = {16842915, 16842919};

    /* renamed from: Q */
    static final /* synthetic */ boolean f12943Q = (!C2845U.class.desiredAssertionStatus());

    /* renamed from: a */
    public static int[] f12944a = {16842908, 16842909, 16842910, 16842913, 16842914, 16842915, 16842916, 16842917, 16842918, 16842919};

    /* renamed from: b */
    public static final int[] f12945b = new int[0];

    /* renamed from: c */
    public static final int[] f12946c = {16842910};

    /* renamed from: d */
    public static final int[] f12947d = {16842908};

    /* renamed from: e */
    public static final int[] f12948e = {16842913};

    /* renamed from: f */
    public static final int[] f12949f = {16842919};

    /* renamed from: g */
    public static final int[] f12950g = {16842909};

    /* renamed from: h */
    public static final int[] f12951h = m13131a(f12946c, f12947d);

    /* renamed from: i */
    public static final int[] f12952i = m13131a(f12946c, f12948e);

    /* renamed from: j */
    public static final int[] f12953j = m13131a(f12946c, f12950g);

    /* renamed from: k */
    public static final int[] f12954k = m13131a(f12947d, f12948e);

    /* renamed from: l */
    public static final int[] f12955l = m13131a(f12947d, f12950g);

    /* renamed from: m */
    public static final int[] f12956m = m13131a(f12948e, f12950g);

    /* renamed from: n */
    public static final int[] f12957n = m13131a(f12951h, f12948e);

    /* renamed from: o */
    public static final int[] f12958o = m13131a(f12951h, f12950g);

    /* renamed from: p */
    public static final int[] f12959p = m13131a(f12952i, f12950g);

    /* renamed from: q */
    public static final int[] f12960q = m13131a(f12954k, f12950g);

    /* renamed from: r */
    public static final int[] f12961r = m13131a(f12957n, f12950g);

    /* renamed from: s */
    public static final int[] f12962s = m13131a(f12949f, f12950g);

    /* renamed from: t */
    public static final int[] f12963t = m13131a(f12949f, f12948e);

    /* renamed from: u */
    public static final int[] f12964u = m13131a(f12963t, f12950g);

    /* renamed from: v */
    public static final int[] f12965v = m13131a(f12949f, f12947d);

    /* renamed from: w */
    public static final int[] f12966w = m13131a(f12965v, f12950g);

    /* renamed from: x */
    public static final int[] f12967x = m13131a(f12965v, f12948e);

    /* renamed from: y */
    public static final int[] f12968y = m13131a(f12967x, f12950g);

    /* renamed from: z */
    public static final int[] f12969z = m13131a(f12949f, f12946c);

    /* renamed from: a */
    public static int[] m13131a(int[] iArr, int[] iArr2) {
        int i = 0;
        int length = iArr == null ? 0 : iArr.length;
        int length2 = iArr2 == null ? 0 : iArr2.length;
        if (length == 0) {
            return iArr2;
        }
        if (length2 == 0) {
            return iArr;
        }
        int[] iArr3 = new int[(length + length2)];
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            if (i3 <= 0 || f12943Q || iArr[i3 - 1] < iArr[i3]) {
                while (i2 < length2 && iArr[i3] > iArr2[i2]) {
                    if (i2 <= 0 || f12943Q || iArr2[i2 - 1] < iArr2[i2]) {
                        iArr3[i] = iArr2[i2];
                        i++;
                        i2++;
                        if (i2 >= length2) {
                            break;
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
                iArr3[i] = iArr[i3];
                if (i2 < length2 && iArr[i3] == iArr2[i2]) {
                    i2++;
                }
                i++;
                i3++;
            } else {
                throw new AssertionError();
            }
        }
        while (i2 < length2) {
            if (i2 <= 0 || f12943Q || iArr2[i2 - 1] < iArr2[i2]) {
                iArr3[i] = iArr2[i2];
                i++;
                i2++;
            } else {
                throw new AssertionError();
            }
        }
        return StateSet.trimStateSet(iArr3, i);
    }

    /* renamed from: b */
    public static int[] m13132b(int[] iArr, int[] iArr2) {
        int i = 0;
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr3[i2] = iArr[i2];
            int length2 = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                if (iArr[i2] == iArr2[i3]) {
                    iArr3[i2] = 0;
                    break;
                }
                i3++;
            }
        }
        int i4 = 0;
        while (i4 + i < iArr3.length) {
            while (i4 + i < iArr3.length && iArr3[i4 + i] == 0) {
                i++;
            }
            if (i4 + i >= iArr3.length) {
                break;
            }
            if (i > 0) {
                iArr3[i4] = iArr3[i4 + i];
            }
            i4++;
        }
        return StateSet.trimStateSet(iArr3, i4);
    }
}
