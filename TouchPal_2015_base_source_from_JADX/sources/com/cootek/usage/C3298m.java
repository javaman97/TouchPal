package com.cootek.usage;

import android.util.Log;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.cootek.usage.m */
class C3298m {

    /* renamed from: a */
    private static volatile C3298m f14504a = null;

    /* renamed from: e */
    private static final String f14505e = "UploadStrategy";

    /* renamed from: f */
    private static final String f14506f = "Strategy";

    /* renamed from: g */
    private static final String f14507g = "name";

    /* renamed from: h */
    private static final String f14508h = "wifi";

    /* renamed from: i */
    private static final String f14509i = "mobile";

    /* renamed from: j */
    private static final String f14510j = "encrypt";

    /* renamed from: k */
    private static final String f14511k = "UploadControl";

    /* renamed from: l */
    private static final String f14512l = "data";

    /* renamed from: m */
    private static final String f14513m = "path";

    /* renamed from: n */
    private static final String f14514n = "sampling";

    /* renamed from: o */
    private static final String f14515o = "strategy";

    /* renamed from: p */
    private static final String f14516p = "default";

    /* renamed from: b */
    private Map f14517b;

    /* renamed from: c */
    private Map f14518c;

    /* renamed from: d */
    private AbsUsageAssist f14519d;

    private C3298m(AbsUsageAssist absUsageAssist) {
        this.f14519d = absUsageAssist;
    }

    /* renamed from: a */
    static C3298m m14615a() {
        if (f14504a == null) {
            synchronized (C3298m.class) {
                if (f14504a == null) {
                    C3298m mVar = new C3298m(UsageRecorder.f14422a);
                    f14504a = mVar;
                    mVar.mo10507b();
                }
            }
        }
        return f14504a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ec, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00ed, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0025, B:24:0x0070] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6 A[SYNTHETIC, Splitter:B:43:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ba A[SYNTHETIC, Splitter:B:53:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cb A[SYNTHETIC, Splitter:B:61:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e2 A[ExcHandler: XmlPullParserException (e org.xmlpull.v1.XmlPullParserException), PHI: r4 
      PHI: (r4v12 java.io.InputStream) = (r4v16 java.io.InputStream), (r4v16 java.io.InputStream), (r4v17 java.io.InputStream) binds: [B:12:0x003f, B:13:?, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE], Splitter:B:8:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e4 A[ExcHandler: IOException (e java.io.IOException), PHI: r4 
      PHI: (r4v11 java.io.InputStream) = (r4v16 java.io.InputStream), (r4v16 java.io.InputStream), (r4v17 java.io.InputStream) binds: [B:12:0x003f, B:13:?, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE], Splitter:B:8:0x0025] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x00a1=Splitter:B:40:0x00a1, B:50:0x00b5=Splitter:B:50:0x00b5} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m14616a(com.cootek.usage.AbsUsageAssist r13) {
        /*
            r12 = this;
            r1 = 1
            r3 = 0
            r5 = 0
            java.lang.String r0 = r13.getStrategyFileName()     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x009f, XmlPullParserException -> 0x00b3, all -> 0x00c7 }
            android.content.Context r2 = r13.getContext()     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x009f, XmlPullParserException -> 0x00b3, all -> 0x00c7 }
            java.io.File r6 = r2.getFileStreamPath(r0)     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x009f, XmlPullParserException -> 0x00b3, all -> 0x00c7 }
            long r8 = r6.length()     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x009f, XmlPullParserException -> 0x00b3, all -> 0x00c7 }
            r10 = 0
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x00f3
            r2 = r3
        L_0x001a:
            boolean r4 = r6.exists()     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x009f, XmlPullParserException -> 0x00b3, all -> 0x00c7 }
            if (r4 == 0) goto L_0x0064
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x009f, XmlPullParserException -> 0x00b3, all -> 0x00c7 }
            r4.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x009f, XmlPullParserException -> 0x00b3, all -> 0x00c7 }
            boolean r0 = com.cootek.usage.UsageRecorder.m14564b()     // Catch:{ FileNotFoundException -> 0x00e9, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "Usage/Controller"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00e9, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            java.lang.String r6 = "parser file on disk: "
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00e9, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            java.lang.StringBuilder r5 = r5.append(r4)     // Catch:{ FileNotFoundException -> 0x00e9, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x00e9, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            android.util.Log.i(r0, r5)     // Catch:{ FileNotFoundException -> 0x00e9, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
        L_0x003f:
            org.xmlpull.v1.XmlPullParser r0 = android.util.Xml.newPullParser()     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            r0.setInput(r5)     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            boolean r0 = r12.m14617a((org.xmlpull.v1.XmlPullParser) r0)     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            if (r4 == 0) goto L_0x0054
            r4.close()     // Catch:{ IOException -> 0x00d4 }
        L_0x0054:
            java.lang.String r4 = "default"
            java.util.Map r5 = r12.f14517b
            boolean r4 = r5.containsKey(r4)
            if (r4 != 0) goto L_0x005f
            r2 = r3
        L_0x005f:
            if (r2 == 0) goto L_0x00db
            if (r0 == 0) goto L_0x00db
        L_0x0063:
            return r1
        L_0x0064:
            android.content.Context r4 = r13.getContext()     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x009f, XmlPullParserException -> 0x00b3, all -> 0x00c7 }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x009f, XmlPullParserException -> 0x00b3, all -> 0x00c7 }
            java.io.InputStream r4 = r4.open(r0)     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x009f, XmlPullParserException -> 0x00b3, all -> 0x00c7 }
            boolean r0 = com.cootek.usage.UsageRecorder.m14564b()     // Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "Usage/Controller"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            java.lang.String r6 = "parser file in apk: "
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            java.lang.StringBuilder r5 = r5.append(r4)     // Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            android.util.Log.i(r0, r5)     // Catch:{ FileNotFoundException -> 0x008b, IOException -> 0x00e4, XmlPullParserException -> 0x00e2 }
            goto L_0x003f
        L_0x008b:
            r0 = move-exception
            r2 = r4
        L_0x008d:
            r0.printStackTrace()     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x00ef
            r2.close()     // Catch:{ IOException -> 0x0098 }
            r0 = r1
            r2 = r3
            goto L_0x0054
        L_0x0098:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r1
            r2 = r3
            goto L_0x0054
        L_0x009f:
            r0 = move-exception
            r4 = r5
        L_0x00a1:
            r0.printStackTrace()     // Catch:{ all -> 0x00dd }
            if (r4 == 0) goto L_0x00ef
            r4.close()     // Catch:{ IOException -> 0x00ac }
            r0 = r1
            r2 = r3
            goto L_0x0054
        L_0x00ac:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r1
            r2 = r3
            goto L_0x0054
        L_0x00b3:
            r0 = move-exception
            r4 = r5
        L_0x00b5:
            r0.printStackTrace()     // Catch:{ all -> 0x00dd }
            if (r4 == 0) goto L_0x00ef
            r4.close()     // Catch:{ IOException -> 0x00c0 }
            r0 = r1
            r2 = r3
            goto L_0x0054
        L_0x00c0:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r1
            r2 = r3
            goto L_0x0054
        L_0x00c7:
            r0 = move-exception
            r4 = r5
        L_0x00c9:
            if (r4 == 0) goto L_0x00ce
            r4.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00ce:
            throw r0
        L_0x00cf:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00ce
        L_0x00d4:
            r2 = move-exception
            r2.printStackTrace()
            r2 = r3
            goto L_0x0054
        L_0x00db:
            r1 = r3
            goto L_0x0063
        L_0x00dd:
            r0 = move-exception
            goto L_0x00c9
        L_0x00df:
            r0 = move-exception
            r4 = r2
            goto L_0x00c9
        L_0x00e2:
            r0 = move-exception
            goto L_0x00b5
        L_0x00e4:
            r0 = move-exception
            goto L_0x00a1
        L_0x00e6:
            r0 = move-exception
            r2 = r5
            goto L_0x008d
        L_0x00e9:
            r0 = move-exception
            r2 = r4
            goto L_0x008d
        L_0x00ec:
            r0 = move-exception
            r2 = r4
            goto L_0x008d
        L_0x00ef:
            r0 = r1
            r2 = r3
            goto L_0x0054
        L_0x00f3:
            r2 = r1
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3298m.m14616a(com.cootek.usage.AbsUsageAssist):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e A[LOOP:0: B:1:0x0004->B:24:0x006e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041 A[EDGE_INSN: B:26:0x0041->B:11:0x0041 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m14617a(org.xmlpull.v1.XmlPullParser r9) {
        /*
            r8 = this;
            r1 = 0
            r0 = 1
            r3 = r0
            r4 = r0
        L_0x0004:
            int r5 = r9.next()     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            int r2 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            r6 = 2
            if (r2 != r6) goto L_0x0071
            boolean r2 = com.cootek.usage.UsageRecorder.m14564b()     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            if (r2 == 0) goto L_0x002d
            java.lang.String r2 = "Usage/Controller"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            java.lang.String r7 = "parser name: "
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            java.lang.String r7 = r9.getName()     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            android.util.Log.i(r2, r6)     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
        L_0x002d:
            java.lang.String r2 = "UploadStrategy"
            java.lang.String r6 = r9.getName()     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            boolean r2 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            if (r2 == 0) goto L_0x0049
            boolean r4 = r8.m14619c((org.xmlpull.v1.XmlPullParser) r9)     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            r2 = r3
            r3 = r4
        L_0x003f:
            if (r5 != r0) goto L_0x006e
            r4 = r0
        L_0x0042:
            if (r4 == 0) goto L_0x006c
            if (r3 == 0) goto L_0x006c
            if (r2 == 0) goto L_0x006c
        L_0x0048:
            return r0
        L_0x0049:
            java.lang.String r2 = "UploadControl"
            java.lang.String r6 = r9.getName()     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            boolean r2 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            if (r2 == 0) goto L_0x0071
            boolean r3 = r8.m14618b((org.xmlpull.v1.XmlPullParser) r9)     // Catch:{ XmlPullParserException -> 0x005c, IOException -> 0x0064 }
            r2 = r3
            r3 = r4
            goto L_0x003f
        L_0x005c:
            r2 = move-exception
            r2.printStackTrace()
            r2 = r3
            r3 = r4
            r4 = r1
            goto L_0x0042
        L_0x0064:
            r2 = move-exception
            r2.printStackTrace()
            r2 = r3
            r3 = r4
            r4 = r1
            goto L_0x0042
        L_0x006c:
            r0 = r1
            goto L_0x0048
        L_0x006e:
            r4 = r3
            r3 = r2
            goto L_0x0004
        L_0x0071:
            r2 = r3
            r3 = r4
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3298m.m14617a(org.xmlpull.v1.XmlPullParser):boolean");
    }

    /* renamed from: b */
    private boolean m14618b(XmlPullParser xmlPullParser) {
        boolean z = true;
        int i = 0;
        while (true) {
            try {
                i = xmlPullParser.next();
            } catch (XmlPullParserException e) {
                e.printStackTrace();
                z = false;
            } catch (IOException e2) {
                e2.printStackTrace();
                z = false;
            }
            if (i == 2 && "data".equals(xmlPullParser.getName())) {
                C3299n nVar = new C3299n();
                nVar.f14520a = xmlPullParser.getAttributeValue((String) null, f14513m);
                if (xmlPullParser.getAttributeValue((String) null, f14514n) == null) {
                    nVar.f14521b = 100;
                } else {
                    nVar.f14521b = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, f14514n));
                }
                nVar.f14522c = xmlPullParser.getAttributeValue((String) null, "strategy");
                if (nVar.f14522c == null) {
                    nVar.f14522c = "default";
                }
                this.f14518c.put(nVar.f14520a, nVar);
                if (UsageRecorder.m14564b()) {
                    Log.i("Usage/Controller", "control path: " + nVar.f14520a);
                    Log.i("Usage/Controller", "control sampling: " + nVar.f14521b);
                    Log.i("Usage/Controller", "control strategyName: " + nVar.f14522c);
                }
            }
            if (i == 3 && f14511k.equals(xmlPullParser.getName())) {
                return z;
            }
        }
    }

    /* renamed from: c */
    private boolean m14619c(XmlPullParser xmlPullParser) {
        boolean z = true;
        int i = 0;
        while (true) {
            try {
                i = xmlPullParser.next();
            } catch (XmlPullParserException e) {
                e.printStackTrace();
                z = false;
            } catch (IOException e2) {
                e2.printStackTrace();
                z = false;
            }
            if (i == 2 && f14506f.equals(xmlPullParser.getName())) {
                C3300o oVar = new C3300o();
                oVar.f14523a = xmlPullParser.getAttributeValue((String) null, "name");
                oVar.f14524b = ((long) Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "wifi"))) * Utils.MINUTE_MILLIS;
                oVar.f14525c = ((long) Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "mobile"))) * Utils.MINUTE_MILLIS;
                oVar.f14526d = Boolean.parseBoolean(xmlPullParser.getAttributeValue((String) null, f14510j));
                this.f14517b.put(oVar.f14523a, oVar);
                if (UsageRecorder.m14564b()) {
                    Log.i("Usage/Controller", "strategy name: " + oVar.f14523a);
                    Log.i("Usage/Controller", "wifi interval: " + oVar.f14524b);
                    Log.i("Usage/Controller", "mobile interval: " + oVar.f14525c);
                    Log.i("Usage/Controller", "encrypt: " + oVar.f14526d);
                }
            }
            if (i == 3 && f14505e.equals(xmlPullParser.getName())) {
                return z;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo10505a(String str) {
        C3299n nVar = (C3299n) this.f14518c.get(str);
        if (nVar == null) {
            return 100;
        }
        return nVar.f14521b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo10506b(String str) {
        C3299n nVar = (C3299n) this.f14518c.get(str);
        return nVar == null ? "default" : nVar.f14522c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo10507b() {
        if (UsageRecorder.m14564b()) {
            Log.i("Usage/Controller", "reset strategies & controls");
        }
        this.f14517b = new HashMap();
        this.f14518c = new HashMap();
        return m14616a(this.f14519d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C3300o mo10508c(String str) {
        C3300o oVar = (C3300o) this.f14517b.get(str);
        return oVar == null ? (C3300o) this.f14517b.get("default") : oVar;
    }
}
