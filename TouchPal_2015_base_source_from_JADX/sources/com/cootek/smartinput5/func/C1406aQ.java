package com.cootek.smartinput5.func;

import android.widget.ImageView;
import com.cootek.smartinput5.func.p054d.C1712h;

/* renamed from: com.cootek.smartinput5.func.aQ */
/* compiled from: NewGuideKeyboardView */
public class C1406aQ {

    /* renamed from: f */
    private static final String[][] f4447f = {new String[]{"Q", "W", C1712h.f5595q, "R", "T", "Y", "U", C1712h.f5599u, C1712h.f5575A, "P"}, new String[]{C1712h.f5591m, "S", C1712h.f5594p, C1712h.f5596r, C1712h.f5597s, C1712h.f5598t, C1712h.f5600v, C1712h.f5601w, C1712h.f5602x}, new String[]{"Z", "X", C1712h.f5593o, "V", C1712h.f5592n, C1712h.f5604z, C1712h.f5603y}};

    /* renamed from: g */
    private static final int f4448g = 0;

    /* renamed from: h */
    private static final int f4449h = 1;

    /* renamed from: i */
    private static final int f4450i = 2;

    /* renamed from: j */
    private static final int f4451j = 3;

    /* renamed from: k */
    private static final int f4452k = 4;

    /* renamed from: a */
    private ImageView f4453a;

    /* renamed from: b */
    private int f4454b = (this.f4456d / f4447f[0].length);

    /* renamed from: c */
    private int f4455c = (this.f4457e / 4);

    /* renamed from: d */
    private int f4456d = this.f4453a.getMeasuredWidth();

    /* renamed from: e */
    private int f4457e = this.f4453a.getMeasuredHeight();

    public C1406aQ(ImageView imageView) {
        this.f4453a = imageView;
        this.f4453a.measure(0, 0);
    }

    /* renamed from: a */
    public int mo6015a() {
        return this.f4454b;
    }

    /* renamed from: b */
    public int mo6017b() {
        return this.f4455c;
    }

    /* renamed from: a */
    public int[] mo6016a(String str) {
        if (str.equals(" ")) {
            return mo6018c();
        }
        int[] iArr = {-1, -1};
        int i = 0;
        int i2 = -1;
        while (i < 4 && (i2 = m6603a(str, f4447f[i])) == -1) {
            i++;
        }
        if (i2 != -1) {
            int i3 = i2 * this.f4454b;
            if (i == 1) {
                i3 += this.f4454b / 2;
            } else if (i == 2) {
                i3 += (this.f4454b * 3) / 2;
            }
            iArr[0] = i3 + (this.f4454b / 2);
            iArr[1] = (int) ((((double) i) + 0.5d) * ((double) this.f4455c));
        }
        return iArr;
    }

    /* renamed from: a */
    private int m6603a(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public int[] mo6018c() {
        return new int[]{this.f4456d / 2, (int) (3.5d * ((double) this.f4455c))};
    }

    /* renamed from: d */
    public int[] mo6019d() {
        return new int[]{((this.f4456d * 4) / 6) + (this.f4454b / 2), (int) ((1.5d * ((double) this.f4457e)) / 6.0d)};
    }
}
