package com.cootek.smartinput5.func.iab;

/* renamed from: com.cootek.smartinput5.func.iab.b */
/* compiled from: Base64 */
public class C1774b {

    /* renamed from: a */
    public static final boolean f5766a = true;

    /* renamed from: b */
    public static final boolean f5767b = false;

    /* renamed from: c */
    static final /* synthetic */ boolean f5768c;

    /* renamed from: d */
    private static final byte f5769d = 61;

    /* renamed from: e */
    private static final byte f5770e = 10;

    /* renamed from: f */
    private static final byte[] f5771f = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: g */
    private static final byte[] f5772g = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: h */
    private static final byte[] f5773h = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f5775j, f5775j, -9, -9, f5775j, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f5775j, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, f5769d, -9, -9, -9, f5776k, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f5770e, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* renamed from: i */
    private static final byte[] f5774i = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f5775j, f5775j, -9, -9, f5775j, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f5775j, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, f5769d, -9, -9, -9, f5776k, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f5770e, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* renamed from: j */
    private static final byte f5775j = -5;

    /* renamed from: k */
    private static final byte f5776k = -1;

    static {
        boolean z;
        if (!C1774b.class.desiredAssertionStatus()) {
            z = true;
        } else {
            z = false;
        }
        f5768c = z;
    }

    private C1774b() {
    }

    /* renamed from: a */
    private static byte[] m8149a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3) {
        int i4 = 0;
        int i5 = (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0);
        if (i2 > 2) {
            i4 = (bArr[i + 2] << 24) >>> 24;
        }
        int i6 = i4 | i5;
        switch (i2) {
            case 1:
                bArr2[i3] = bArr3[i6 >>> 18];
                bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
                bArr2[i3 + 2] = f5769d;
                bArr2[i3 + 3] = f5769d;
                break;
            case 2:
                bArr2[i3] = bArr3[i6 >>> 18];
                bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i6 >>> 6) & 63];
                bArr2[i3 + 3] = f5769d;
                break;
            case 3:
                bArr2[i3] = bArr3[i6 >>> 18];
                bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i6 >>> 6) & 63];
                bArr2[i3 + 3] = bArr3[i6 & 63];
                break;
        }
        return bArr2;
    }

    /* renamed from: a */
    public static String m8142a(byte[] bArr) {
        return m8143a(bArr, 0, bArr.length, f5771f, true);
    }

    /* renamed from: a */
    public static String m8144a(byte[] bArr, boolean z) {
        return m8143a(bArr, 0, bArr.length, f5772g, z);
    }

    /* renamed from: a */
    public static String m8143a(byte[] bArr, int i, int i2, byte[] bArr2, boolean z) {
        byte[] a = m8148a(bArr, i, i2, bArr2, Integer.MAX_VALUE);
        int length = a.length;
        while (!z && length > 0 && a[length - 1] == 61) {
            length--;
        }
        return new String(a, 0, length);
    }

    /* renamed from: a */
    public static byte[] m8148a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = ((i2 + 2) / 3) * 4;
        byte[] bArr3 = new byte[(i4 + (i4 / i3))];
        int i5 = i2 - 2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i8 < i5) {
            int i9 = ((bArr[i8 + i] << 24) >>> 8) | ((bArr[(i8 + 1) + i] << 24) >>> 16) | ((bArr[(i8 + 2) + i] << 24) >>> 24);
            bArr3[i7] = bArr2[i9 >>> 18];
            bArr3[i7 + 1] = bArr2[(i9 >>> 12) & 63];
            bArr3[i7 + 2] = bArr2[(i9 >>> 6) & 63];
            bArr3[i7 + 3] = bArr2[i9 & 63];
            int i10 = i6 + 4;
            if (i10 == i3) {
                bArr3[i7 + 4] = f5770e;
                i7++;
                i10 = 0;
            }
            i8 += 3;
            i7 += 4;
            i6 = i10;
        }
        if (i8 < i2) {
            m8149a(bArr, i8 + i, i2 - i8, bArr3, i7, bArr2);
            if (i6 + 4 == i3) {
                bArr3[i7 + 4] = f5770e;
                i7++;
            }
            i7 += 4;
        }
        if (f5768c || i7 == bArr3.length) {
            return bArr3;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private static int m8141a(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        if (bArr[i + 2] == 61) {
            bArr2[i2] = (byte) ((((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12)) >>> 16);
            return 1;
        } else if (bArr[i + 3] == 61) {
            int i3 = ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i + 2]] << 24) >>> 18);
            bArr2[i2] = (byte) (i3 >>> 16);
            bArr2[i2 + 1] = (byte) (i3 >>> 8);
            return 2;
        } else {
            int i4 = ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i + 2]] << 24) >>> 18) | ((bArr3[bArr[i + 3]] << 24) >>> 24);
            bArr2[i2] = (byte) (i4 >> 16);
            bArr2[i2 + 1] = (byte) (i4 >> 8);
            bArr2[i2 + 2] = (byte) i4;
            return 3;
        }
    }

    /* renamed from: a */
    public static byte[] m8145a(String str) throws C1775c {
        byte[] bytes = str.getBytes();
        return m8146a(bytes, 0, bytes.length);
    }

    /* renamed from: b */
    public static byte[] m8150b(String str) throws C1775c {
        byte[] bytes = str.getBytes();
        return m8152b(bytes, 0, bytes.length);
    }

    /* renamed from: b */
    public static byte[] m8151b(byte[] bArr) throws C1775c {
        return m8146a(bArr, 0, bArr.length);
    }

    /* renamed from: c */
    public static byte[] m8153c(byte[] bArr) throws C1775c {
        return m8152b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static byte[] m8146a(byte[] bArr, int i, int i2) throws C1775c {
        return m8147a(bArr, i, i2, f5773h);
    }

    /* renamed from: b */
    public static byte[] m8152b(byte[] bArr, int i, int i2) throws C1775c {
        return m8147a(bArr, i, i2, f5774i);
    }

    /* renamed from: a */
    public static byte[] m8147a(byte[] bArr, int i, int i2, byte[] bArr2) throws C1775c {
        int i3;
        int i4;
        byte[] bArr3 = new byte[(((i2 * 3) / 4) + 2)];
        byte[] bArr4 = new byte[4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 >= i2) {
                break;
            }
            byte b = (byte) (bArr[i5 + i] & Byte.MAX_VALUE);
            byte b2 = bArr2[b];
            if (b2 >= -5) {
                if (b2 < -1) {
                    i3 = i6;
                    i4 = i7;
                } else if (b == 61) {
                    int i8 = i2 - i5;
                    byte b3 = (byte) (bArr[(i2 - 1) + i] & Byte.MAX_VALUE);
                    if (i6 == 0 || i6 == 1) {
                        throw new C1775c("invalid padding byte '=' at byte offset " + i5);
                    } else if ((i6 == 3 && i8 > 2) || (i6 == 4 && i8 > 1)) {
                        throw new C1775c("padding byte '=' falsely signals end of encoded value at offset " + i5);
                    } else if (b3 != 61 && b3 != 10) {
                        throw new C1775c("encoded value has invalid trailing byte");
                    }
                } else {
                    i3 = i6 + 1;
                    bArr4[i6] = b;
                    if (i3 == 4) {
                        i4 = m8141a(bArr4, 0, bArr3, i7, bArr2) + i7;
                        i3 = 0;
                    } else {
                        i4 = i7;
                    }
                }
                i5++;
                i7 = i4;
                i6 = i3;
            } else {
                throw new C1775c("Bad Base64 input character at " + i5 + ": " + bArr[i5 + i] + "(decimal)");
            }
        }
        if (i6 != 0) {
            if (i6 == 1) {
                throw new C1775c("single trailing character at offset " + (i2 - 1));
            }
            int i9 = i6 + 1;
            bArr4[i6] = f5769d;
            i7 += m8141a(bArr4, 0, bArr3, i7, bArr2);
        }
        byte[] bArr5 = new byte[i7];
        System.arraycopy(bArr3, 0, bArr5, 0, i7);
        return bArr5;
    }
}
