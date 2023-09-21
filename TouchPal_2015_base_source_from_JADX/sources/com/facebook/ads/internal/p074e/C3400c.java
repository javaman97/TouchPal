package com.facebook.ads.internal.p074e;

import com.facebook.ads.internal.p076g.C3416a;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.e.c */
public class C3400c {

    /* renamed from: i */
    private static final C3416a f14826i = C3416a.UNKNOWN;

    /* renamed from: a */
    protected C3416a f14827a = f14826i;

    /* renamed from: b */
    protected int f14828b = 1;

    /* renamed from: c */
    protected int f14829c;

    /* renamed from: d */
    protected int f14830d = 0;

    /* renamed from: e */
    protected int f14831e = 20;

    /* renamed from: f */
    protected boolean f14832f = false;

    /* renamed from: g */
    public int f14833g = -1;

    /* renamed from: h */
    public int f14834h = -1;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3400c(java.util.Map<java.lang.String, java.lang.Object> r8) {
        /*
            r7 = this;
            r4 = 1
            r2 = 0
            r3 = -1
            r7.<init>()
            com.facebook.ads.internal.g.a r0 = f14826i
            r7.f14827a = r0
            r7.f14828b = r4
            r7.f14830d = r2
            r0 = 20
            r7.f14831e = r0
            r7.f14832f = r2
            r7.f14833g = r3
            r7.f14834h = r3
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x0020:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r1.hashCode()
            switch(r6) {
                case -1561601017: goto L_0x0075;
                case -553208868: goto L_0x007f;
                case 3575610: goto L_0x004d;
                case 664421755: goto L_0x0061;
                case 700812481: goto L_0x0057;
                case 1085444827: goto L_0x006b;
                case 1503616961: goto L_0x0093;
                case 2002133996: goto L_0x0089;
                default: goto L_0x0039;
            }
        L_0x0039:
            r1 = r3
        L_0x003a:
            switch(r1) {
                case 0: goto L_0x003e;
                case 1: goto L_0x009d;
                case 2: goto L_0x00ab;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00c7;
                case 5: goto L_0x00d5;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00f1;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0020
        L_0x003e:
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.facebook.ads.internal.g.a r0 = com.facebook.ads.internal.p076g.C3416a.m15010a(r0)
            r7.f14827a = r0
            goto L_0x0020
        L_0x004d:
            java.lang.String r6 = "type"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0039
            r1 = r2
            goto L_0x003a
        L_0x0057:
            java.lang.String r6 = "min_viewability_percentage"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0039
            r1 = r4
            goto L_0x003a
        L_0x0061:
            java.lang.String r6 = "min_viewability_duration"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0039
            r1 = 2
            goto L_0x003a
        L_0x006b:
            java.lang.String r6 = "refresh"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0039
            r1 = 3
            goto L_0x003a
        L_0x0075:
            java.lang.String r6 = "refresh_threshold"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0039
            r1 = 4
            goto L_0x003a
        L_0x007f:
            java.lang.String r6 = "cacheable"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0039
            r1 = 5
            goto L_0x003a
        L_0x0089:
            java.lang.String r6 = "placement_width"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0039
            r1 = 6
            goto L_0x003a
        L_0x0093:
            java.lang.String r6 = "placement_height"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0039
            r1 = 7
            goto L_0x003a
        L_0x009d:
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.f14828b = r0
            goto L_0x0020
        L_0x00ab:
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.f14829c = r0
            goto L_0x0020
        L_0x00b9:
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.f14830d = r0
            goto L_0x0020
        L_0x00c7:
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            r7.f14831e = r0
            goto L_0x0020
        L_0x00d5:
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7.f14832f = r0
            goto L_0x0020
        L_0x00e3:
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.f14833g = r0
            goto L_0x0020
        L_0x00f1:
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.f14834h = r0
            goto L_0x0020
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p074e.C3400c.<init>(java.util.Map):void");
    }

    /* renamed from: a */
    public static C3400c m14952a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        return new C3400c(hashMap);
    }

    /* renamed from: a */
    public C3416a mo10691a() {
        return this.f14827a;
    }

    /* renamed from: b */
    public long mo10692b() {
        return (long) (this.f14830d * 1000);
    }

    /* renamed from: c */
    public long mo10693c() {
        return (long) (this.f14831e * 1000);
    }

    /* renamed from: d */
    public boolean mo10694d() {
        return this.f14832f;
    }

    /* renamed from: e */
    public int mo10695e() {
        return this.f14828b;
    }
}
