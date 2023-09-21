package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.FilterItem;
import com.cootek.smartinput5.engine.FilterManager;

/* renamed from: com.cootek.smartinput5.ui.ca */
/* compiled from: SoftFilterPad */
public class C2805ca extends C2811cf implements FilterManager.IFilterListener {

    /* renamed from: a */
    private final String f12441a = "SoftFilterPad";

    /* renamed from: aj */
    private int f12442aj;

    /* renamed from: ak */
    private int f12443ak;

    /* renamed from: al */
    private int f12444al;

    /* renamed from: am */
    private int[] f12445am;

    /* renamed from: an */
    private int f12446an;

    /* renamed from: ao */
    private int f12447ao;

    /* renamed from: ap */
    private int f12448ap;

    /* renamed from: b */
    private final int f12449b = 4;

    /* renamed from: c */
    private boolean f12450c;

    /* renamed from: d */
    private FilterManager.IFilterProvider f12451d;

    /* renamed from: e */
    private int f12452e;

    public C2805ca(String str) {
        super(str);
    }

    /* renamed from: B */
    private void m12735B() {
        int size = this.f12545R.size();
        if (this.f12445am == null) {
            this.f12445am = new int[size];
        }
        int i = this.f12448ap * this.f12444al;
        for (int i2 = 0; i2 < size; i2++) {
            this.f12445am[i2] = i2 + i;
        }
    }

    /* renamed from: c */
    public boolean mo9018c() {
        this.f12444al++;
        if (this.f12444al >= this.f12446an) {
            this.f12444al--;
            return false;
        }
        m12735B();
        m12736C();
        return true;
    }

    /* renamed from: d */
    public boolean mo9019d() {
        this.f12444al--;
        if (this.f12444al < 0) {
            this.f12444al++;
            return false;
        }
        m12735B();
        m12736C();
        return true;
    }

    public C2805ca(String str, int i) {
        super(str, i);
    }

    public void onFilterUpdated(boolean z, FilterManager.IFilterProvider iFilterProvider, boolean z2) {
        this.f12450c = z;
        this.f12451d = iFilterProvider;
        this.f12442aj = iFilterProvider.getSize();
        this.f12443ak = this.f12545R.size();
        this.f12448ap = this.f12443ak - 4;
        this.f12452e = this.f12442aj < this.f12443ak ? this.f12442aj : this.f12443ak;
        this.f12444al = 0;
        this.f12446an = 1;
        if (this.f12442aj > this.f12443ak) {
            int i = this.f12442aj - this.f12443ak;
            int i2 = i / this.f12448ap;
            if (i % this.f12448ap != 0) {
                i2++;
            }
            this.f12446an = i2 + this.f12446an;
        }
        m12735B();
        m12736C();
    }

    /* renamed from: f */
    public int mo9133f() {
        return this.f12444al;
    }

    /* renamed from: C */
    private void m12736C() {
        int i = 0;
        this.f12447ao = 0;
        this.f12447ao = this.f12452e;
        while (true) {
            int i2 = i;
            if (i2 < this.f12452e || i2 < 4) {
                SoftFilter softFilter = (SoftFilter) this.f12545R.get(i2);
                softFilter.setFilterIndex(this.f12445am[i2]);
                softFilter.updateDisplay();
                if (softFilter.mSoftKeyInfo.printTitle == 0) {
                    this.f12447ao = i2 + 1;
                }
                i = i2 + 1;
            } else {
                this.f12546S.mo8734c();
                return;
            }
        }
    }

    /* renamed from: g */
    public int mo9134g() {
        return super.mo9134g();
    }

    /* renamed from: h */
    public int mo9135h() {
        if (this.f12450c) {
            return this.f12447ao * this.f12588x;
        }
        return 0;
    }

    /* renamed from: i */
    public int mo9136i() {
        if (this.f12450c) {
            return (this.f12447ao - 4) * this.f12588x;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public FilterItem mo9132b(int i) {
        return this.f12451d.get(i);
    }
}
