package com.google.android.gms.common.data;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.data.f */
public abstract class C3529f<T> extends DataBuffer<T> {

    /* renamed from: ao */
    private boolean f15280ao = false;

    /* renamed from: ap */
    private ArrayList<Integer> f15281ap;

    protected C3529f(C3525d dVar) {
        super(dVar);
    }

    /* renamed from: h */
    private int m15376h(int i) {
        if (i >= 0 && i < this.f15281ap.size()) {
            return this.f15281ap.get(i).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }

    /* renamed from: i */
    private int m15377i(int i) {
        if (i < 0 || i == this.f15281ap.size()) {
            return 0;
        }
        return i == this.f15281ap.size() + -1 ? this.f15255S.getCount() - this.f15281ap.get(i).intValue() : this.f15281ap.get(i + 1).intValue() - this.f15281ap.get(i).intValue();
    }

    /* renamed from: m */
    private void m15378m() {
        synchronized (this) {
            if (!this.f15280ao) {
                int count = this.f15255S.getCount();
                this.f15281ap = new ArrayList<>();
                if (count > 0) {
                    this.f15281ap.add(0);
                    String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    String c = this.f15255S.mo10977c(primaryDataMarkerColumn, 0, this.f15255S.mo10981e(0));
                    int i = 1;
                    while (i < count) {
                        String c2 = this.f15255S.mo10977c(primaryDataMarkerColumn, i, this.f15255S.mo10981e(i));
                        if (!c2.equals(c)) {
                            this.f15281ap.add(Integer.valueOf(i));
                        } else {
                            c2 = c;
                        }
                        i++;
                        c = c2;
                    }
                }
                this.f15280ao = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo10998a(int i, int i2);

    public final T get(int i) {
        m15378m();
        return mo10998a(m15376h(i), m15377i(i));
    }

    public int getCount() {
        m15378m();
        return this.f15281ap.size();
    }

    /* access modifiers changed from: protected */
    public abstract String getPrimaryDataMarkerColumn();
}
