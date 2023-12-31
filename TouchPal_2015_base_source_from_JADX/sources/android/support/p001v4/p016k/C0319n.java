package android.support.p001v4.p016k;

import java.io.PrintWriter;

/* renamed from: android.support.v4.k.n */
/* compiled from: TimeUtils */
public class C0319n {

    /* renamed from: a */
    public static final int f807a = 19;

    /* renamed from: b */
    private static final int f808b = 60;

    /* renamed from: c */
    private static final int f809c = 3600;

    /* renamed from: d */
    private static final int f810d = 86400;

    /* renamed from: e */
    private static final Object f811e = new Object();

    /* renamed from: f */
    private static char[] f812f = new char[24];

    /* renamed from: a */
    private static int m1305a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: a */
    private static int m1307a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        int i5;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i5 = i2;
            i4 = i;
        } else {
            int i6 = i / 100;
            cArr[i2] = (char) (i6 + 48);
            i5 = i2 + 1;
            i4 = i - (i6 * 100);
        }
        if ((z && i3 >= 2) || i4 > 9 || i2 != i5) {
            int i7 = i4 / 10;
            cArr[i5] = (char) (i7 + 48);
            i5++;
            i4 -= i7 * 10;
        }
        cArr[i5] = (char) (i4 + 48);
        int i8 = i5 + 1;
        cArr[i8] = c;
        return i8 + 1;
    }

    /* renamed from: a */
    private static int m1306a(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (f812f.length < i) {
            f812f = new char[i];
        }
        char[] cArr = f812f;
        if (j == 0) {
            int i7 = i - 1;
            while (0 < i7) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j > 0) {
            c = '+';
        } else {
            j = -j;
            c = '-';
        }
        int i8 = (int) (j % 1000);
        int floor = (int) Math.floor((double) (j / 1000));
        int i9 = 0;
        if (floor > f810d) {
            i9 = floor / f810d;
            floor -= f810d * i9;
        }
        if (floor > f809c) {
            int i10 = floor / f809c;
            i2 = i10;
            i3 = floor - (i10 * f809c);
        } else {
            i2 = 0;
            i3 = floor;
        }
        if (i3 > 60) {
            int i11 = i3 / 60;
            i4 = i11;
            i5 = i3 - (i11 * 60);
        } else {
            i4 = 0;
            i5 = i3;
        }
        if (i != 0) {
            int a = m1305a(i9, 1, false, 0);
            int a2 = a + m1305a(i2, 1, a > 0, 2);
            int a3 = a2 + m1305a(i4, 1, a2 > 0, 2);
            int a4 = a3 + m1305a(i5, 1, a3 > 0, 2);
            i6 = 0;
            int a5 = m1305a(i8, 2, true, a4 > 0 ? 3 : 0) + 1 + a4;
            while (a5 < i) {
                cArr[i6] = ' ';
                a5++;
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i12 = i6 + 1;
        boolean z = i != 0;
        int a6 = m1307a(cArr, i9, 'd', i12, false, 0);
        int a7 = m1307a(cArr, i2, 'h', a6, a6 != i12, z ? 2 : 0);
        int a8 = m1307a(cArr, i4, 'm', a7, a7 != i12, z ? 2 : 0);
        int a9 = m1307a(cArr, i5, 's', a8, a8 != i12, z ? 2 : 0);
        int a10 = m1307a(cArr, i8, 'm', a9, true, (!z || a9 == i12) ? 0 : 3);
        cArr[a10] = 's';
        return a10 + 1;
    }

    /* renamed from: a */
    public static void m1311a(long j, StringBuilder sb) {
        synchronized (f811e) {
            sb.append(f812f, 0, m1306a(j, 0));
        }
    }

    /* renamed from: a */
    public static void m1310a(long j, PrintWriter printWriter, int i) {
        synchronized (f811e) {
            printWriter.print(new String(f812f, 0, m1306a(j, i)));
        }
    }

    /* renamed from: a */
    public static void m1309a(long j, PrintWriter printWriter) {
        m1310a(j, printWriter, 0);
    }

    /* renamed from: a */
    public static void m1308a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m1310a(j - j2, printWriter, 0);
        }
    }
}
