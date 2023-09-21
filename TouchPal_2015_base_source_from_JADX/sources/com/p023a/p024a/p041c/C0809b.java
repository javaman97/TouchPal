package com.p023a.p024a.p041c;

import android.opengl.GLES10;
import com.p023a.p024a.p032b.p033a.C0757e;
import com.p023a.p024a.p032b.p033a.C0760h;
import com.p023a.p024a.p032b.p038e.C0790a;

/* renamed from: com.a.a.c.b */
/* compiled from: ImageSizeUtils */
public final class C0809b {

    /* renamed from: a */
    private static final int f2129a = 2048;

    /* renamed from: b */
    private static C0757e f2130b;

    static {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int max = Math.max(iArr[0], 2048);
        f2130b = new C0757e(max, max);
    }

    private C0809b() {
    }

    /* renamed from: a */
    public static C0757e m4612a(C0790a aVar, C0757e eVar) {
        int a = aVar.mo2973a();
        if (a <= 0) {
            a = eVar.mo2820a();
        }
        int b = aVar.mo2976b();
        if (b <= 0) {
            b = eVar.mo2823b();
        }
        return new C0757e(a, b);
    }

    /* renamed from: a */
    public static int m4611a(C0757e eVar, C0757e eVar2, C0760h hVar, boolean z) {
        int min;
        int i = 1;
        int a = eVar.mo2820a();
        int b = eVar.mo2823b();
        int a2 = eVar2.mo2820a();
        int b2 = eVar2.mo2823b();
        switch (hVar) {
            case FIT_INSIDE:
                if (!z) {
                    min = Math.max(a / a2, b / b2);
                    break;
                } else {
                    int i2 = a / 2;
                    int i3 = b / 2;
                    min = 1;
                    while (true) {
                        if (i2 / min <= a2 && i3 / min <= b2) {
                            break;
                        } else {
                            min *= 2;
                        }
                    }
                }
                break;
            case CROP:
                if (!z) {
                    min = Math.min(a / a2, b / b2);
                    break;
                } else {
                    int i4 = a / 2;
                    int i5 = b / 2;
                    int i6 = 1;
                    while (i4 / min > a2 && i5 / min > b2) {
                        i6 = min * 2;
                    }
                }
                break;
            default:
                min = 1;
                break;
        }
        if (min >= 1) {
            i = min;
        }
        return m4609a(a, b, i, z);
    }

    /* renamed from: a */
    private static int m4609a(int i, int i2, int i3, boolean z) {
        int a = f2130b.mo2820a();
        int b = f2130b.mo2823b();
        while (true) {
            if (i / i3 <= a && i2 / i3 <= b) {
                return i3;
            }
            if (z) {
                i3 *= 2;
            } else {
                i3++;
            }
        }
    }

    /* renamed from: a */
    public static int m4610a(C0757e eVar) {
        int a = eVar.mo2820a();
        int b = eVar.mo2823b();
        return Math.max((int) Math.ceil((double) (((float) a) / ((float) f2130b.mo2820a()))), (int) Math.ceil((double) (((float) b) / ((float) f2130b.mo2823b()))));
    }

    /* renamed from: b */
    public static float m4613b(C0757e eVar, C0757e eVar2, C0760h hVar, boolean z) {
        int i;
        int i2;
        int a = eVar.mo2820a();
        int b = eVar.mo2823b();
        int a2 = eVar2.mo2820a();
        int b2 = eVar2.mo2823b();
        float f = ((float) a) / ((float) a2);
        float f2 = ((float) b) / ((float) b2);
        if ((hVar != C0760h.FIT_INSIDE || f < f2) && (hVar != C0760h.CROP || f >= f2)) {
            i = (int) (((float) a) / f2);
            i2 = b2;
        } else {
            i = a2;
            i2 = (int) (((float) b) / f);
        }
        if ((z || i >= a || i2 >= b) && (!z || i == a || i2 == b)) {
            return 1.0f;
        }
        return ((float) i) / ((float) a);
    }
}
