package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.ce */
/* compiled from: SoftKeyRelatedWeight */
public class C2810ce {

    /* renamed from: a */
    public static final int f12477a = 100;

    /* renamed from: b */
    private int f12478b;

    /* renamed from: c */
    private int f12479c;

    /* renamed from: d */
    private final boolean f12480d;

    public C2810ce(int i) {
        this.f12478b = i;
        this.f12479c = 100;
        this.f12480d = true;
    }

    public C2810ce(int i, float f, boolean z) {
        this.f12478b = i;
        this.f12479c = (int) (100.0f * f);
        this.f12480d = z;
    }

    /* renamed from: a */
    public int mo9170a() {
        return this.f12478b;
    }

    /* renamed from: a */
    public void mo9171a(int i) {
        if (i != 0) {
            this.f12479c = (this.f12479c * 100) / i;
        }
    }

    /* renamed from: b */
    public int mo9172b() {
        return this.f12479c;
    }

    /* renamed from: c */
    public boolean mo9173c() {
        return this.f12480d;
    }

    public String toString() {
        SoftKeyInfo softKeyInfo = new SoftKeyInfo();
        Engine.getInstance().updateKey(this.f12478b, softKeyInfo);
        StringBuilder sb = new StringBuilder();
        sb.append("keyId: ").append(this.f12478b).append(" keyInfo: ").append(softKeyInfo.mainTitle).append(" weight: ").append(this.f12479c);
        return sb.toString();
    }
}
