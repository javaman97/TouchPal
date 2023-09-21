package com.cootek.smartinput5.p066ui.control;

import android.annotation.SuppressLint;
import com.cootek.smartinput5.func.C1368X;
import java.lang.reflect.Array;

/* renamed from: com.cootek.smartinput5.ui.control.u */
/* compiled from: DynamicGridPager */
public abstract class C2877u {

    /* renamed from: a */
    private static final int f13083a = 6;

    /* renamed from: b */
    private static final int f13084b = 6;

    /* renamed from: c */
    private final int f13085c;

    /* renamed from: d */
    private final int f13086d;

    /* renamed from: e */
    private final int f13087e;

    /* renamed from: f */
    private int f13088f;

    /* renamed from: g */
    private int f13089g;

    /* renamed from: h */
    private int f13090h;

    /* renamed from: i */
    private int f13091i = 6;

    /* renamed from: j */
    private int f13092j;

    /* renamed from: k */
    private int[][] f13093k = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{this.f13085c * 6, this.f13086d}));

    /* renamed from: l */
    private int[][] f13094l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo9021a(int i);

    public C2877u(int i, int i2, int i3) {
        this.f13085c = i;
        this.f13086d = i2;
        this.f13087e = i3;
        this.f13094l = (int[][]) Array.newInstance(Integer.TYPE, new int[]{this.f13085c, this.f13086d});
        mo9546a();
    }

    /* renamed from: a */
    public void mo9546a() {
        this.f13088f = -1;
        this.f13090h = 0;
        this.f13092j = 0;
        m13312a(this.f13093k, -1);
    }

    /* renamed from: b */
    public boolean mo9547b() {
        return this.f13088f > 0;
    }

    /* renamed from: c */
    public boolean mo9548c() {
        if (C1368X.m6320c().mo5842o().mo5955l()) {
            int i = 0;
            int i2 = 0;
            while (i < 16 && mo9021a(i) != -1) {
                i2 += mo9021a(i);
                i++;
            }
            if (i2 > 16 || mo9021a(i + 1) != -1) {
                return false;
            }
            return true;
        } else if (mo9021a(9) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public int[][] mo9549d() {
        if (this.f13088f <= 0) {
            return null;
        }
        this.f13088f--;
        for (int i = 0; i < this.f13085c; i++) {
            for (int i2 = 0; i2 < this.f13086d; i2++) {
                this.f13094l[i][i2] = this.f13093k[(this.f13088f * this.f13085c) + i][i2];
            }
        }
        return this.f13094l;
    }

    /* renamed from: e */
    public int[][] mo9550e() {
        this.f13088f++;
        if (this.f13088f == this.f13090h) {
            this.f13090h++;
            if (m13314f()) {
                this.f13090h--;
                this.f13088f--;
                return null;
            }
        }
        for (int i = 0; i < this.f13085c; i++) {
            for (int i2 = 0; i2 < this.f13086d; i2++) {
                this.f13094l[i][i2] = this.f13093k[(this.f13088f * this.f13085c) + i][i2];
            }
        }
        return this.f13094l;
    }

    @SuppressLint({"WrongCall"})
    /* renamed from: f */
    private boolean m13314f() {
        boolean z;
        int i = this.f13092j;
        int i2 = this.f13088f;
        this.f13089g = 0;
        int i3 = 0;
        while (true) {
            if (i2 != this.f13088f) {
                z = false;
                break;
            }
            int a = mo9021a(i);
            if (a == -1) {
                this.f13092j = i;
                z = true;
                break;
            }
            if (a > this.f13086d / 2) {
                if (i3 > 0) {
                    this.f13089g++;
                    i2 = m13311a(i2, this.f13089g, 0, a, i);
                } else {
                    i2 = m13311a(i2, this.f13089g, i3, a, i);
                    a += i3;
                }
            } else if (a + i3 > this.f13086d) {
                this.f13089g++;
                i2 = m13311a(i2, this.f13089g, 0, a, i);
            } else if (a + i3 != this.f13086d) {
                int a2 = m13310a(i3, i3 + a);
                if (a2 != -1) {
                    int i4 = a2;
                    while (i4 != -1 && i4 < this.f13086d / 2) {
                        a2 = i4;
                        i4 = m13310a(i4, i4 + a);
                    }
                    if (i4 != this.f13086d / 2) {
                        i4 = a2;
                    }
                    i2 = m13311a(i2, this.f13089g, i4, a, i);
                    a += i4;
                } else {
                    i2 = m13311a(i2, this.f13089g, i3, a, i);
                    a += i3;
                }
            } else if (m13310a(i3, i3 + a) != -1) {
                this.f13089g++;
                i2 = m13311a(i2, this.f13089g, 0, a, i);
            } else {
                i2 = m13311a(i2, this.f13089g, i3, a, i);
                a += i3;
            }
            i3 = a;
            this.f13092j = i;
            i++;
        }
        if (z && this.f13089g == 0 && i3 == 0) {
            return true;
        }
        m13313b(this.f13088f);
        return false;
    }

    /* renamed from: b */
    private void m13313b(int i) {
        int i2 = 0;
        while (i2 < this.f13085c) {
            int i3 = (this.f13085c * i) + i2;
            int i4 = this.f13093k[i3][0];
            if (i4 != -1) {
                for (int i5 = 1; i5 < this.f13086d && i4 < this.f13092j - 1; i5++) {
                    if (this.f13093k[i3][i5] == -1) {
                        this.f13093k[i3][i5] = i4;
                    } else {
                        i4 = this.f13093k[i3][i5];
                    }
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private int m13311a(int i, int i2, int i3, int i4, int i5) {
        if (i2 >= this.f13085c) {
            return i + 1;
        }
        if (i >= this.f13091i) {
            this.f13091i += 6;
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, new int[]{this.f13091i * this.f13085c, this.f13086d});
            m13312a(iArr, -1);
            for (int i6 = 0; i6 < (this.f13090h - 1) * this.f13085c; i6++) {
                for (int i7 = 0; i7 < this.f13086d; i7++) {
                    iArr[i6][i7] = this.f13093k[i6][i7];
                }
            }
            this.f13093k = iArr;
        }
        for (int i8 = 0; i8 < i4; i8++) {
            this.f13093k[(this.f13085c * i) + i2][i3 + i8] = i5;
        }
        return i;
    }

    /* renamed from: a */
    private void m13312a(int[][] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            for (int i3 = 0; i3 < iArr[0].length; i3++) {
                iArr[i2][i3] = i;
            }
        }
    }

    /* renamed from: a */
    private int m13310a(int i, int i2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            if (i3 % this.f13087e == 0) {
                return i3;
            }
        }
        return -1;
    }
}
