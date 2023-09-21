package com.cootek.smartinput5.p066ui;

import android.util.SparseArray;

/* renamed from: com.cootek.smartinput5.ui.ck */
/* compiled from: SoftKeyboardTag */
public enum C2817ck {
    KEYBOARD(0),
    KEYBOARD_BACKGROUND_ORIGIN(1),
    EMOTION(2),
    FILTER(3),
    SYMPAD(4);
    

    /* renamed from: f */
    private static SparseArray<C2817ck> f12607f;

    /* renamed from: g */
    private final int f12609g;

    static {
        int i;
        f12607f = new SparseArray<>();
        for (C2817ck ckVar : values()) {
            f12607f.put(ckVar.mo9214f(), ckVar);
        }
    }

    private C2817ck(int i) {
        this.f12609g = i;
    }

    /* renamed from: a */
    public C2726bF mo9209a() {
        return null;
    }

    /* renamed from: b */
    public C2726bF mo9210b() {
        return null;
    }

    /* renamed from: c */
    public C2726bF mo9211c() {
        return null;
    }

    /* renamed from: d */
    public C2726bF mo9212d() {
        return null;
    }

    /* renamed from: e */
    public C2726bF mo9213e() {
        return null;
    }

    /* renamed from: a */
    public static C2817ck m12805a(int i) {
        C2817ck ckVar = f12607f.get(i);
        if (ckVar == null) {
            return KEYBOARD;
        }
        return ckVar;
    }

    /* renamed from: f */
    public int mo9214f() {
        return this.f12609g;
    }
}
