package com.cootek.usage;

/* renamed from: com.cootek.usage.d */
final class C3289d extends C3287b {

    /* renamed from: f */
    private static int f14445f = 19;

    /* renamed from: g */
    private static final byte[] f14446g = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: h */
    private static final byte[] f14447h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: m */
    private static /* synthetic */ boolean f14448m = (!C3286a.class.desiredAssertionStatus());

    /* renamed from: c */
    public final boolean f14449c;

    /* renamed from: d */
    public final boolean f14450d;

    /* renamed from: e */
    public final boolean f14451e;

    /* renamed from: i */
    private final byte[] f14452i;

    /* renamed from: j */
    private int f14453j;

    /* renamed from: k */
    private int f14454k;

    /* renamed from: l */
    private final byte[] f14455l;

    public C3289d(int i, byte[] bArr) {
        boolean z = true;
        this.f14436a = null;
        this.f14449c = (i & 1) == 0;
        this.f14450d = (i & 2) == 0;
        this.f14451e = (i & 4) == 0 ? false : z;
        this.f14455l = (i & 8) == 0 ? f14446g : f14447h;
        this.f14452i = new byte[2];
        this.f14453j = 0;
        this.f14454k = this.f14450d ? 19 : -1;
    }

    /* renamed from: a */
    public final int mo10495a(int i) {
        return ((i << 3) / 5) + 10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10496a(byte[] r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            byte[] r6 = r10.f14455l
            byte[] r7 = r10.f14436a
            r4 = 0
            int r2 = r10.f14454k
            int r8 = r13 + r12
            r0 = -1
            int r1 = r10.f14453j
            switch(r1) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x00b7;
                case 2: goto L_0x00db;
                default: goto L_0x000f;
            }
        L_0x000f:
            r3 = r0
            r1 = r12
        L_0x0011:
            r0 = -1
            if (r3 == r0) goto L_0x0218
            r0 = 0
            int r4 = r3 >> 18
            r4 = r4 & 63
            byte r4 = r6[r4]
            r7[r0] = r4
            r0 = 1
            int r4 = r3 >> 12
            r4 = r4 & 63
            byte r4 = r6[r4]
            r7[r0] = r4
            r0 = 2
            int r4 = r3 >> 6
            r4 = r4 & 63
            byte r4 = r6[r4]
            r7[r0] = r4
            r4 = 3
            r0 = 4
            r3 = r3 & 63
            byte r3 = r6[r3]
            r7[r4] = r3
            int r2 = r2 + -1
            if (r2 != 0) goto L_0x0214
            boolean r2 = r10.f14451e
            if (r2 == 0) goto L_0x0045
            r2 = 4
            r0 = 5
            r3 = 13
            r7[r2] = r3
        L_0x0045:
            int r4 = r0 + 1
            r2 = 10
            r7[r0] = r2
            r0 = 19
            r5 = r0
        L_0x004e:
            int r0 = r1 + 3
            if (r0 <= r8) goto L_0x00ff
            int r0 = r10.f14453j
            int r0 = r1 - r0
            int r2 = r8 + -1
            if (r0 != r2) goto L_0x015f
            r3 = 0
            int r0 = r10.f14453j
            if (r0 <= 0) goto L_0x0157
            byte[] r0 = r10.f14452i
            r3 = 0
            r2 = 1
            byte r0 = r0[r3]
        L_0x0065:
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r0 << 4
            int r0 = r10.f14453j
            int r0 = r0 - r2
            r10.f14453j = r0
            int r2 = r4 + 1
            int r0 = r3 >> 6
            r0 = r0 & 63
            byte r0 = r6[r0]
            r7[r4] = r0
            int r0 = r2 + 1
            r3 = r3 & 63
            byte r3 = r6[r3]
            r7[r2] = r3
            boolean r2 = r10.f14449c
            if (r2 == 0) goto L_0x0090
            int r2 = r0 + 1
            r3 = 61
            r7[r0] = r3
            int r0 = r2 + 1
            r3 = 61
            r7[r2] = r3
        L_0x0090:
            boolean r2 = r10.f14450d
            if (r2 == 0) goto L_0x0207
            boolean r2 = r10.f14451e
            if (r2 == 0) goto L_0x009f
            int r2 = r0 + 1
            r3 = 13
            r7[r0] = r3
            r0 = r2
        L_0x009f:
            int r4 = r0 + 1
            r2 = 10
            r7[r0] = r2
        L_0x00a5:
            boolean r0 = f14448m
            if (r0 != 0) goto L_0x01f3
            int r0 = r10.f14453j
            if (r0 == 0) goto L_0x01f3
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00b3:
            r3 = r0
            r1 = r12
            goto L_0x0011
        L_0x00b7:
            int r1 = r12 + 2
            if (r1 > r8) goto L_0x000f
            byte[] r0 = r10.f14452i
            r1 = 0
            byte r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            int r1 = r12 + 1
            byte r3 = r11[r12]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r0 = r0 | r3
            int r12 = r1 + 1
            byte r1 = r11[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            r1 = 0
            r10.f14453j = r1
            r3 = r0
            r1 = r12
            goto L_0x0011
        L_0x00db:
            int r1 = r12 + 1
            if (r1 > r8) goto L_0x000f
            byte[] r0 = r10.f14452i
            r1 = 0
            byte r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            byte[] r1 = r10.f14452i
            r3 = 1
            byte r1 = r1[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r12 + 1
            byte r3 = r11[r12]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = r0 | r3
            r3 = 0
            r10.f14453j = r3
            r3 = r0
            goto L_0x0011
        L_0x00ff:
            byte r0 = r11[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            int r2 = r1 + 1
            byte r2 = r11[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r0 = r0 | r2
            int r2 = r1 + 2
            byte r2 = r11[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            int r2 = r0 >> 18
            r2 = r2 & 63
            byte r2 = r6[r2]
            r7[r4] = r2
            int r2 = r4 + 1
            int r3 = r0 >> 12
            r3 = r3 & 63
            byte r3 = r6[r3]
            r7[r2] = r3
            int r2 = r4 + 2
            int r3 = r0 >> 6
            r3 = r3 & 63
            byte r3 = r6[r3]
            r7[r2] = r3
            int r2 = r4 + 3
            r0 = r0 & 63
            byte r0 = r6[r0]
            r7[r2] = r0
            int r2 = r1 + 3
            int r1 = r4 + 4
            int r0 = r5 + -1
            if (r0 != 0) goto L_0x020f
            boolean r0 = r10.f14451e
            if (r0 == 0) goto L_0x020c
            int r0 = r1 + 1
            r3 = 13
            r7[r1] = r3
        L_0x014b:
            int r4 = r0 + 1
            r1 = 10
            r7[r0] = r1
            r0 = 19
            r1 = r2
            r5 = r0
            goto L_0x004e
        L_0x0157:
            int r2 = r1 + 1
            byte r0 = r11[r1]
            r1 = r2
            r2 = r3
            goto L_0x0065
        L_0x015f:
            int r0 = r10.f14453j
            int r0 = r1 - r0
            int r2 = r8 + -2
            if (r0 != r2) goto L_0x01d7
            r3 = 0
            int r0 = r10.f14453j
            r2 = 1
            if (r0 <= r2) goto L_0x01ca
            byte[] r0 = r10.f14452i
            r3 = 0
            r2 = 1
            byte r0 = r0[r3]
        L_0x0173:
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r9 = r0 << 10
            int r0 = r10.f14453j
            if (r0 <= 0) goto L_0x01d1
            byte[] r0 = r10.f14452i
            int r3 = r2 + 1
            byte r0 = r0[r2]
            r2 = r3
        L_0x0182:
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 2
            r0 = r0 | r9
            int r3 = r10.f14453j
            int r2 = r3 - r2
            r10.f14453j = r2
            int r2 = r4 + 1
            int r3 = r0 >> 12
            r3 = r3 & 63
            byte r3 = r6[r3]
            r7[r4] = r3
            int r3 = r2 + 1
            int r4 = r0 >> 6
            r4 = r4 & 63
            byte r4 = r6[r4]
            r7[r2] = r4
            int r2 = r3 + 1
            r0 = r0 & 63
            byte r0 = r6[r0]
            r7[r3] = r0
            boolean r0 = r10.f14449c
            if (r0 == 0) goto L_0x020a
            int r0 = r2 + 1
            r3 = 61
            r7[r2] = r3
        L_0x01b3:
            boolean r2 = r10.f14450d
            if (r2 == 0) goto L_0x0207
            boolean r2 = r10.f14451e
            if (r2 == 0) goto L_0x01c2
            int r2 = r0 + 1
            r3 = 13
            r7[r0] = r3
            r0 = r2
        L_0x01c2:
            int r4 = r0 + 1
            r2 = 10
            r7[r0] = r2
            goto L_0x00a5
        L_0x01ca:
            int r2 = r1 + 1
            byte r0 = r11[r1]
            r1 = r2
            r2 = r3
            goto L_0x0173
        L_0x01d1:
            int r3 = r1 + 1
            byte r0 = r11[r1]
            r1 = r3
            goto L_0x0182
        L_0x01d7:
            boolean r0 = r10.f14450d
            if (r0 == 0) goto L_0x00a5
            if (r4 <= 0) goto L_0x00a5
            r0 = 19
            if (r5 == r0) goto L_0x00a5
            boolean r0 = r10.f14451e
            if (r0 == 0) goto L_0x0205
            int r0 = r4 + 1
            r2 = 13
            r7[r4] = r2
        L_0x01eb:
            int r4 = r0 + 1
            r2 = 10
            r7[r0] = r2
            goto L_0x00a5
        L_0x01f3:
            boolean r0 = f14448m
            if (r0 != 0) goto L_0x01ff
            if (r1 == r8) goto L_0x01ff
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x01ff:
            r10.f14437b = r4
            r10.f14454k = r5
            r0 = 1
            return r0
        L_0x0205:
            r0 = r4
            goto L_0x01eb
        L_0x0207:
            r4 = r0
            goto L_0x00a5
        L_0x020a:
            r0 = r2
            goto L_0x01b3
        L_0x020c:
            r0 = r1
            goto L_0x014b
        L_0x020f:
            r5 = r0
            r4 = r1
            r1 = r2
            goto L_0x004e
        L_0x0214:
            r5 = r2
            r4 = r0
            goto L_0x004e
        L_0x0218:
            r5 = r2
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3289d.mo10496a(byte[], int, int, boolean):boolean");
    }
}
