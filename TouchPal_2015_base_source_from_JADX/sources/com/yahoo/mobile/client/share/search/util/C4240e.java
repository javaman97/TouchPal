package com.yahoo.mobile.client.share.search.util;

/* renamed from: com.yahoo.mobile.client.share.search.util.e */
public final class C4240e {

    /* renamed from: a */
    private long f17335a;

    /* renamed from: b */
    private int f17336b;

    /* renamed from: c */
    private final int f17337c;

    /* renamed from: d */
    private final int f17338d;

    public C4240e(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("arguments must be greater than zero.");
        }
        this.f17337c = i;
        this.f17338d = i2;
    }

    /* renamed from: a */
    public final boolean mo15878a(long j) {
        long j2 = 0;
        if (j >= this.f17335a) {
            if (this.f17335a != 0) {
                j2 = (j - this.f17335a) % ((long) this.f17337c);
            }
            this.f17335a = (((long) this.f17337c) + j) - j2;
            this.f17336b = this.f17338d;
        } else if (((long) this.f17337c) + j < this.f17335a) {
            this.f17335a = ((long) this.f17337c) + j;
            this.f17336b = this.f17338d;
        }
        if (this.f17336b <= 0) {
            return false;
        }
        this.f17336b--;
        return true;
    }
}
