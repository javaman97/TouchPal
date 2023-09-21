package com.cootek.smartinput5.p066ui.control;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

/* renamed from: com.cootek.smartinput5.ui.control.t */
/* compiled from: DisplayTransformParameters */
public class C2875t {

    /* renamed from: a */
    public static final int f13078a = 0;

    /* renamed from: b */
    public static final int f13079b = 1;

    /* renamed from: c */
    public static final int f13080c = 2;

    /* renamed from: d */
    public static final int f13081d = 3;

    /* renamed from: e */
    private static final int[] f13082e = {0, 0, 0, 0};

    /* renamed from: com.cootek.smartinput5.ui.control.t$a */
    /* compiled from: DisplayTransformParameters */
    public interface C2876a {
        /* renamed from: a */
        int[] mo9378a();
    }

    @TargetApi(8)
    /* renamed from: a */
    public static int[] m13306a(Context context) {
        WindowManager windowManager;
        int[] iArr = f13082e;
        if (Build.VERSION.SDK_INT < 8 || (windowManager = (WindowManager) context.getSystemService("window")) == null || windowManager.getDefaultDisplay() == null) {
            return iArr;
        }
        return m13307a(context, windowManager.getDefaultDisplay().getRotation(), m13308b(context));
    }

    /* renamed from: a */
    private static int[] m13307a(Context context, int i, C2876a aVar) {
        int[] a = aVar.mo9378a();
        int[] iArr = new int[a.length];
        int length = a.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = a[(i + i2) % length];
        }
        iArr[1] = 0;
        return iArr;
    }

    /* renamed from: b */
    private static C2876a m13308b(Context context) {
        return C2840R.m13035a(context);
    }
}
