package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.cj */
/* compiled from: SoftKeyboardInfo */
public class C2816cj {

    /* renamed from: a */
    public static final int f12593a = 0;

    /* renamed from: b */
    public static final int f12594b = 1;

    /* renamed from: c */
    public static final int f12595c = 2;

    /* renamed from: d */
    public static final int f12596d = 3;

    /* renamed from: e */
    public static final int f12597e = 4;

    /* renamed from: f */
    public static final int f12598f = 5;

    /* renamed from: g */
    public static final int f12599g = 6;

    /* renamed from: h */
    public static final int f12600h = 7;

    /* renamed from: i */
    public static final int f12601i = 8;

    public C2816cj(C2811cf cfVar) {
    }

    /* renamed from: a */
    public boolean mo9208a(int i) {
        if ((Engine.getInstance().getSurfaceSupportedOperation() & (1 << i)) != 0) {
            return true;
        }
        return false;
    }
}
