package com.facebook.ads.internal.p077h;

/* renamed from: com.facebook.ads.internal.h.o */
final class C3448o implements C3446m {

    /* renamed from: a */
    final /* synthetic */ int[] f14993a;

    /* renamed from: b */
    final /* synthetic */ C3446m f14994b;

    C3448o(int[] iArr, C3446m mVar) {
        this.f14993a = iArr;
        this.f14994b = mVar;
    }

    /* renamed from: a */
    public void mo10551a() {
        int[] iArr = this.f14993a;
        iArr[0] = iArr[0] - 1;
        if (this.f14993a[0] == 0 && this.f14994b != null) {
            this.f14994b.mo10551a();
        }
    }
}
