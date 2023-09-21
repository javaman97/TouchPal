package com.cootek.smartinput5.func;

import android.content.Context;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.bS */
/* compiled from: ZoomModeInfoProvider */
public class C1594bS {

    /* renamed from: a */
    private static final int f5079a = 2131165219;

    /* renamed from: b */
    private static final int f5080b = 2131165242;

    /* renamed from: c */
    private static final int f5081c = 2131165206;

    /* renamed from: d */
    private static double[] f5082d;

    /* renamed from: e */
    private static int f5083e = 0;

    /* renamed from: f */
    private static int f5084f = 1;

    /* renamed from: a */
    public static boolean m7176a(Context context) {
        double a = C1439ao.m6712a(context);
        String[] stringArray = context.getResources().getStringArray(R.array.phone_size_scale_in_zoom_mode);
        int length = stringArray.length;
        if (a < Double.valueOf(stringArray[0]).doubleValue() || a > Double.valueOf(stringArray[length - 1]).doubleValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static double[] m7177b(Context context) {
        if (f5082d == null) {
            f5082d = new double[2];
            if (!m7176a(context)) {
                f5082d[f5083e] = 1.0d;
                f5082d[f5084f] = 1.0d;
            } else {
                double a = C1439ao.m6712a(context);
                String[] stringArray = context.getResources().getStringArray(R.array.phone_size_scale_in_zoom_mode);
                String[] stringArray2 = context.getResources().getStringArray(R.array.width_zoom_scale);
                String[] stringArray3 = context.getResources().getStringArray(R.array.height_zoom_scale);
                int i = 0;
                while (true) {
                    if (i < stringArray.length - 1) {
                        if (Double.valueOf(stringArray[i]).doubleValue() <= a && a < Double.valueOf(stringArray[i + 1]).doubleValue()) {
                            f5082d[f5083e] = Double.valueOf(stringArray2[i]).doubleValue();
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                f5082d[f5084f] = Double.valueOf(stringArray3[0]).doubleValue();
            }
        }
        return f5082d;
    }
}
