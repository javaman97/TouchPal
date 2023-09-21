package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.net.cmd.G */
/* compiled from: CmdQueryWebsite */
public class C2247G extends C2259P {

    /* renamed from: a */
    public static final String f9598a = "ETag";

    /* renamed from: h */
    private static final String f9599h = "CmdQueryWebsite";

    /* renamed from: b */
    public String f9600b;

    /* renamed from: c */
    public String f9601c;

    /* renamed from: d */
    public String f9602d;

    /* renamed from: e */
    public String f9603e;

    /* renamed from: f */
    public String f9604f;

    /* renamed from: g */
    public String f9605g;

    public C2247G(String str, String str2, String str3, String str4, String str5) {
        this.f9600b = str;
        this.f9601c = str2;
        this.f9602d = str3;
        this.f9603e = str4;
        this.f9604f = str5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f A[SYNTHETIC, Splitter:B:23:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074 A[SYNTHETIC, Splitter:B:26:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097 A[SYNTHETIC, Splitter:B:41:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009c A[SYNTHETIC, Splitter:B:44:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8 A[SYNTHETIC, Splitter:B:50:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad A[SYNTHETIC, Splitter:B:53:0x00ad] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7765a(org.apache.http.HttpResponse r9) {
        /*
            r8 = this;
            r1 = 0
            r5 = 8192(0x2000, float:1.14794E-41)
            r4 = 0
            r6 = 1
            int r0 = r8.f9746O
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 == r2) goto L_0x000c
        L_0x000b:
            return r6
        L_0x000c:
            org.apache.http.HttpEntity r0 = r9.getEntity()
            java.lang.String r2 = "ETag"
            org.apache.http.Header[] r2 = r9.getHeaders(r2)
            if (r2 == 0) goto L_0x000b
            int r3 = r2.length
            if (r3 != r6) goto L_0x000b
            r2 = r2[r4]
            java.lang.String r2 = r2.getValue()
            r8.f9605g = r2
            java.lang.String r2 = r8.f9605g
            java.lang.String r3 = r8.f9604f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0032
            r0 = 304(0x130, float:4.26E-43)
            r8.f9746O = r0
            goto L_0x000b
        L_0x0032:
            if (r0 == 0) goto L_0x000b
            byte[] r3 = new byte[r5]
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00c7, IllegalStateException -> 0x0093, all -> 0x00a4 }
            java.io.InputStream r0 = r0.getContent()     // Catch:{ IOException -> 0x00c7, IllegalStateException -> 0x0093, all -> 0x00a4 }
            r4 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r0, r4)     // Catch:{ IOException -> 0x00c7, IllegalStateException -> 0x0093, all -> 0x00a4 }
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x00ca, IllegalStateException -> 0x00c2, all -> 0x00bb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ca, IllegalStateException -> 0x00c2, all -> 0x00bb }
            r0.<init>()     // Catch:{ IOException -> 0x00ca, IllegalStateException -> 0x00c2, all -> 0x00bb }
            java.lang.String r5 = r8.f9602d     // Catch:{ IOException -> 0x00ca, IllegalStateException -> 0x00c2, all -> 0x00bb }
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch:{ IOException -> 0x00ca, IllegalStateException -> 0x00c2, all -> 0x00bb }
            java.lang.String r5 = ".temp"
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch:{ IOException -> 0x00ca, IllegalStateException -> 0x00c2, all -> 0x00bb }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00ca, IllegalStateException -> 0x00c2, all -> 0x00bb }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00ca, IllegalStateException -> 0x00c2, all -> 0x00bb }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ca, IllegalStateException -> 0x00c2, all -> 0x00bb }
            r0.<init>(r4)     // Catch:{ IOException -> 0x00ca, IllegalStateException -> 0x00c2, all -> 0x00bb }
        L_0x0060:
            int r1 = r2.read(r3)     // Catch:{ IOException -> 0x006b, IllegalStateException -> 0x00c4, all -> 0x00bd }
            if (r1 <= 0) goto L_0x007a
            r5 = 0
            r0.write(r3, r5, r1)     // Catch:{ IOException -> 0x006b, IllegalStateException -> 0x00c4, all -> 0x00bd }
            goto L_0x0060
        L_0x006b:
            r1 = move-exception
            r1 = r2
        L_0x006d:
            if (r1 == 0) goto L_0x0072
            r1.close()     // Catch:{ IOException -> 0x00b3 }
        L_0x0072:
            if (r0 == 0) goto L_0x000b
            r0.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x000b
        L_0x0078:
            r0 = move-exception
            goto L_0x000b
        L_0x007a:
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x006b, IllegalStateException -> 0x00c4, all -> 0x00bd }
            java.lang.String r3 = r8.f9602d     // Catch:{ IOException -> 0x006b, IllegalStateException -> 0x00c4, all -> 0x00bd }
            r1.<init>(r3)     // Catch:{ IOException -> 0x006b, IllegalStateException -> 0x00c4, all -> 0x00bd }
            r4.renameTo(r1)     // Catch:{ IOException -> 0x006b, IllegalStateException -> 0x00c4, all -> 0x00bd }
            if (r2 == 0) goto L_0x0089
            r2.close()     // Catch:{ IOException -> 0x00b1 }
        L_0x0089:
            if (r0 == 0) goto L_0x000b
            r0.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x000b
        L_0x0090:
            r0 = move-exception
            goto L_0x000b
        L_0x0093:
            r0 = move-exception
            r2 = r1
        L_0x0095:
            if (r2 == 0) goto L_0x009a
            r2.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x009a:
            if (r1 == 0) goto L_0x000b
            r1.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x000b
        L_0x00a1:
            r0 = move-exception
            goto L_0x000b
        L_0x00a4:
            r0 = move-exception
            r2 = r1
        L_0x00a6:
            if (r2 == 0) goto L_0x00ab
            r2.close()     // Catch:{ IOException -> 0x00b7 }
        L_0x00ab:
            if (r1 == 0) goto L_0x00b0
            r1.close()     // Catch:{ IOException -> 0x00b9 }
        L_0x00b0:
            throw r0
        L_0x00b1:
            r1 = move-exception
            goto L_0x0089
        L_0x00b3:
            r1 = move-exception
            goto L_0x0072
        L_0x00b5:
            r0 = move-exception
            goto L_0x009a
        L_0x00b7:
            r2 = move-exception
            goto L_0x00ab
        L_0x00b9:
            r1 = move-exception
            goto L_0x00b0
        L_0x00bb:
            r0 = move-exception
            goto L_0x00a6
        L_0x00bd:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x00a6
        L_0x00c2:
            r0 = move-exception
            goto L_0x0095
        L_0x00c4:
            r1 = move-exception
            r1 = r0
            goto L_0x0095
        L_0x00c7:
            r0 = move-exception
            r0 = r1
            goto L_0x006d
        L_0x00ca:
            r0 = move-exception
            r0 = r1
            r1 = r2
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.net.cmd.C2247G.mo7765a(org.apache.http.HttpResponse):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return this.f9601c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo7774a() {
        HashMap hashMap = new HashMap();
        hashMap.put(C2261Q.f9793an, this.f9604f.trim());
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        return "";
    }
}
