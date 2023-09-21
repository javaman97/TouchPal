package com.p023a.p024a.p032b.p033a;

import android.widget.ImageView;

/* renamed from: com.a.a.b.a.h */
/* compiled from: ViewScaleType */
public enum C0760h {
    FIT_INSIDE,
    CROP;

    /* renamed from: com.a.a.b.a.h$1 */
    /* compiled from: ViewScaleType */
    static /* synthetic */ class C07611 {

        /* renamed from: a */
        static final /* synthetic */ int[] f1878a = null;

        static {
            f1878a = new int[ImageView.ScaleType.values().length];
            try {
                f1878a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f1878a[ImageView.ScaleType.FIT_XY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f1878a[ImageView.ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f1878a[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f1878a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f1878a[ImageView.ScaleType.MATRIX.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f1878a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f1878a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    /* renamed from: a */
    public static C0760h m4296a(ImageView imageView) {
        switch (C07611.f1878a[imageView.getScaleType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return FIT_INSIDE;
            default:
                return CROP;
        }
    }
}
