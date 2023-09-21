package com.cootek.smartinput5.p066ui.control;

import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: com.cootek.smartinput5.ui.control.G */
/* compiled from: MeasureText */
public class C2829G {
    /* renamed from: a */
    public static int m12928a(Paint paint, CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return m12927a(paint, 0, charSequence.length(), charSequence);
    }

    /* renamed from: a */
    public static int m12927a(Paint paint, int i, int i2, CharSequence charSequence) {
        int i3;
        boolean z;
        float f;
        float f2;
        boolean z2 = true;
        if (paint instanceof C2856c) {
            C2856c cVar = (C2856c) paint;
            int i4 = i;
            int i5 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = false;
                    break;
                }
                char charAt = charSequence.charAt(i4);
                if (charAt > 255) {
                    if (!m12929a(charAt)) {
                        z = true;
                        break;
                    }
                    if (cVar.f13031b == -1.0f) {
                        cVar.f13031b = paint.measureText(charSequence, i4, i4 + 1);
                    }
                    f = (float) i5;
                    f2 = cVar.f13031b;
                } else {
                    if (cVar.f13030a[charAt] == -1.0f) {
                        cVar.f13030a[charAt] = paint.measureText(charSequence, i4, i4 + 1);
                    }
                    f = (float) i5;
                    f2 = cVar.f13030a[charAt];
                }
                i5 = (int) (f + f2);
                i4++;
            }
            z2 = z;
            i3 = i5;
        } else {
            i3 = 0;
        }
        if (z2) {
            return (int) paint.measureText(charSequence, i, i2);
        }
        return i3;
    }

    /* renamed from: a */
    public static boolean m12929a(int i) {
        return (i >= 19968 && i <= 40869) || (i >= 65280 && i <= 65519) || (i >= 12288 && i <= 12351);
    }

    /* renamed from: b */
    public static boolean m12930b(int i) {
        return (i >= 97 && i <= 122) || (i >= 65 && i <= 90);
    }

    /* renamed from: a */
    public static float m12926a(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return (((float) (rect.left + rect.right)) / 2.0f) - (paint.measureText(str) / 2.0f);
    }
}
