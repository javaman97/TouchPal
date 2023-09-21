package com.cootek.usage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.cootek.usage.r */
final class C3303r extends Handler {

    /* renamed from: a */
    private /* synthetic */ C3301p f14544a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3303r(C3301p pVar, Looper looper) {
        super(looper);
        this.f14544a = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r4) {
        /*
            r3 = this;
            int r0 = r4.what     // Catch:{ RuntimeException -> 0x000c }
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x001a;
                case 2: goto L_0x0046;
                case 3: goto L_0x0050;
                default: goto L_0x0005;
            }     // Catch:{ RuntimeException -> 0x000c }
        L_0x0005:
            return
        L_0x0006:
            com.cootek.usage.p r0 = r3.f14544a     // Catch:{ RuntimeException -> 0x000c }
            com.cootek.usage.C3301p.m14626a((com.cootek.usage.C3301p) r0)     // Catch:{ RuntimeException -> 0x000c }
            goto L_0x0005
        L_0x000c:
            r0 = move-exception
            com.cootek.usage.p r1 = r3.f14544a
            com.cootek.usage.AbsUsageAssist r1 = r1.f14534c
            boolean r1 = r1.isDebugMode()
            if (r1 == 0) goto L_0x0056
            throw r0
        L_0x001a:
            java.lang.Object r0 = r4.obj     // Catch:{ RuntimeException -> 0x000c }
            com.cootek.usage.q r0 = (com.cootek.usage.C3302q) r0     // Catch:{ RuntimeException -> 0x000c }
            com.cootek.usage.UsageData r1 = new com.cootek.usage.UsageData     // Catch:{ RuntimeException -> 0x000c }
            r1.<init>()     // Catch:{ RuntimeException -> 0x000c }
            java.lang.String r2 = r0.f14540a     // Catch:{ RuntimeException -> 0x000c }
            r1.type = r2     // Catch:{ RuntimeException -> 0x000c }
            java.lang.String r2 = r0.f14541b     // Catch:{ RuntimeException -> 0x000c }
            r1.path = r2     // Catch:{ RuntimeException -> 0x000c }
            java.lang.Object r0 = r0.f14542c     // Catch:{ RuntimeException -> 0x000c }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ RuntimeException -> 0x000c }
            boolean r2 = r0.isEmpty()     // Catch:{ RuntimeException -> 0x000c }
            if (r2 != 0) goto L_0x0005
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ RuntimeException -> 0x000c }
            r2.<init>(r0)     // Catch:{ RuntimeException -> 0x000c }
            java.lang.String r0 = r2.toString()     // Catch:{ RuntimeException -> 0x000c }
            r1.value = r0     // Catch:{ RuntimeException -> 0x000c }
            com.cootek.usage.p r0 = r3.f14544a     // Catch:{ RuntimeException -> 0x000c }
            com.cootek.usage.C3301p.m14627a((com.cootek.usage.C3301p) r0, (com.cootek.usage.UsageData) r1)     // Catch:{ RuntimeException -> 0x000c }
            goto L_0x0005
        L_0x0046:
            java.lang.Object r0 = r4.obj     // Catch:{ RuntimeException -> 0x000c }
            java.io.File r0 = (java.io.File) r0     // Catch:{ RuntimeException -> 0x000c }
            com.cootek.usage.p r1 = r3.f14544a     // Catch:{ RuntimeException -> 0x000c }
            com.cootek.usage.C3301p.m14628a((com.cootek.usage.C3301p) r1, (java.io.File) r0)     // Catch:{ RuntimeException -> 0x000c }
            goto L_0x0005
        L_0x0050:
            com.cootek.usage.p r0 = r3.f14544a     // Catch:{ RuntimeException -> 0x000c }
            com.cootek.usage.C3301p.m14631b((com.cootek.usage.C3301p) r0)     // Catch:{ RuntimeException -> 0x000c }
            goto L_0x0005
        L_0x0056:
            r0.printStackTrace()
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3303r.handleMessage(android.os.Message):void");
    }
}
