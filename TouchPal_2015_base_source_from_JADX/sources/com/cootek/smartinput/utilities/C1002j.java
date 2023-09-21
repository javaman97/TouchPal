package com.cootek.smartinput.utilities;

/* renamed from: com.cootek.smartinput.utilities.j */
/* compiled from: IntArrayList */
public class C1002j {

    /* renamed from: a */
    private static final int f2634a = 10;

    /* renamed from: b */
    private int[] f2635b = new int[10];

    /* renamed from: c */
    private int f2636c;

    /* renamed from: d */
    private int f2637d = -1;

    /* renamed from: a */
    public void mo4091a(int i) {
        if (this.f2636c >= this.f2635b.length) {
            m5202c();
        }
        this.f2635b[this.f2636c] = i;
        this.f2636c++;
    }

    /* renamed from: b */
    public int mo4093b(int i) {
        return this.f2635b[i];
    }

    /* renamed from: a */
    public void mo4090a() {
        int i = 10;
        if (this.f2637d == -1) {
            this.f2637d = this.f2636c;
        } else {
            this.f2637d = ((this.f2637d * 3) + this.f2636c) >> 2;
        }
        int length = this.f2635b.length >> 1;
        if (this.f2637d < length && this.f2636c < length) {
            if (this.f2637d > 10) {
                i = this.f2637d;
            }
            this.f2635b = new int[i];
        }
        this.f2636c = 0;
    }

    /* renamed from: b */
    public int mo4092b() {
        return this.f2636c;
    }

    /* renamed from: c */
    private void m5202c() {
        int length = this.f2635b.length + (this.f2635b.length >> 1);
        if (length <= 10) {
            length = 10;
        }
        int[] iArr = new int[length];
        System.arraycopy(this.f2635b, 0, iArr, 0, this.f2635b.length);
        this.f2635b = iArr;
    }
}
