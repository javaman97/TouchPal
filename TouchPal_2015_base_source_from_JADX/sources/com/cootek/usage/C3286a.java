package com.cootek.usage;

import java.io.UnsupportedEncodingException;

/* renamed from: com.cootek.usage.a */
class C3286a {

    /* renamed from: a */
    private static int f14429a = 0;

    /* renamed from: b */
    private static int f14430b = 1;

    /* renamed from: c */
    private static int f14431c = 2;

    /* renamed from: d */
    private static int f14432d = 4;

    /* renamed from: e */
    private static int f14433e = 8;

    /* renamed from: f */
    private static int f14434f = 16;

    /* renamed from: g */
    private static /* synthetic */ boolean f14435g = (!C3286a.class.desiredAssertionStatus());

    private C3286a() {
    }

    /* renamed from: a */
    public static String m14566a(byte[] bArr, int i) {
        try {
            return new String(m14572c(bArr, 0, bArr.length, 8), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static byte[] m14567a(String str, int i) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        C3288c cVar = new C3288c(8, new byte[((length * 3) / 4)]);
        if (!cVar.mo10496a(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        } else if (cVar.f14437b == cVar.f14436a.length) {
            return cVar.f14436a;
        } else {
            byte[] bArr = new byte[cVar.f14437b];
            System.arraycopy(cVar.f14436a, 0, bArr, 0, cVar.f14437b);
            return bArr;
        }
    }

    /* renamed from: a */
    private static byte[] m14568a(byte[] bArr, int i, int i2, int i3) {
        C3288c cVar = new C3288c(i3, new byte[((i2 * 3) / 4)]);
        if (!cVar.mo10496a(bArr, 0, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        } else if (cVar.f14437b == cVar.f14436a.length) {
            return cVar.f14436a;
        } else {
            byte[] bArr2 = new byte[cVar.f14437b];
            System.arraycopy(cVar.f14436a, 0, bArr2, 0, cVar.f14437b);
            return bArr2;
        }
    }

    /* renamed from: b */
    private static String m14569b(byte[] bArr, int i, int i2, int i3) {
        try {
            return new String(m14572c(bArr, i, i2, i3), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    private static byte[] m14570b(byte[] bArr, int i) {
        int length = bArr.length;
        C3288c cVar = new C3288c(i, new byte[((length * 3) / 4)]);
        if (!cVar.mo10496a(bArr, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        } else if (cVar.f14437b == cVar.f14436a.length) {
            return cVar.f14436a;
        } else {
            byte[] bArr2 = new byte[cVar.f14437b];
            System.arraycopy(cVar.f14436a, 0, bArr2, 0, cVar.f14437b);
            return bArr2;
        }
    }

    /* renamed from: c */
    private static byte[] m14571c(byte[] bArr, int i) {
        return m14572c(bArr, 0, bArr.length, i);
    }

    /* renamed from: c */
    private static byte[] m14572c(byte[] bArr, int i, int i2, int i3) {
        C3289d dVar = new C3289d(i3, (byte[]) null);
        int i4 = (i2 / 3) << 2;
        if (!dVar.f14449c) {
            switch (i2 % 3) {
                case 1:
                    i4 += 2;
                    break;
                case 2:
                    i4 += 3;
                    break;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (dVar.f14450d && i2 > 0) {
            i4 += (dVar.f14451e ? 2 : 1) * (((i2 - 1) / 57) + 1);
        }
        dVar.f14436a = new byte[i4];
        dVar.mo10496a(bArr, i, i2, true);
        if (f14435g || dVar.f14437b == i4) {
            return dVar.f14436a;
        }
        throw new AssertionError();
    }
}
