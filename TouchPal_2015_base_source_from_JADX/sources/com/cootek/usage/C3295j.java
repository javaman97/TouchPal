package com.cootek.usage;

import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.util.ArrayList;
import org.apache.http.HttpVersion;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

/* renamed from: com.cootek.usage.j */
final class C3295j {

    /* renamed from: a */
    private static final String f14476a = "http://";

    /* renamed from: b */
    private static final char f14477b = ':';

    /* renamed from: c */
    private static final String f14478c = "/statistic/usage?type=";

    /* renamed from: d */
    private static final String f14479d = "Cookie";

    /* renamed from: e */
    private static final String f14480e = "auth_token=\"%s\"";

    /* renamed from: f */
    private static final String f14481f = "Content-Encoding";

    /* renamed from: g */
    private static final String f14482g = "gzip";

    /* renamed from: h */
    private static final String f14483h = "data";

    /* renamed from: i */
    private static final String f14484i = "data_encode";

    /* renamed from: j */
    private static final String f14485j = "data_key";

    /* renamed from: k */
    private static final String f14486k = "path";

    /* renamed from: l */
    private static final String f14487l = "value";

    /* renamed from: m */
    private static final String f14488m = "error_code";

    /* renamed from: n */
    private static final int f14489n = 200;

    /* renamed from: o */
    private static final int f14490o = 400;

    /* renamed from: p */
    private static final int f14491p = 500;

    /* renamed from: q */
    private static final int f14492q = 599;

    /* renamed from: r */
    private static final int f14493r = 0;

    /* renamed from: s */
    private static final int f14494s = 1000;

    /* renamed from: t */
    private static final int f14495t = 1001;

    /* renamed from: u */
    private final AbsUsageAssist f14496u;

    /* renamed from: v */
    private final boolean f14497v;

    /* renamed from: w */
    private final String f14498w;

    /* renamed from: x */
    private final ArrayList f14499x;

    /* renamed from: y */
    private final boolean f14500y;

    C3295j(AbsUsageAssist absUsageAssist, boolean z, String str, ArrayList arrayList, boolean z2) {
        this.f14496u = absUsageAssist;
        this.f14497v = z;
        this.f14498w = str;
        this.f14499x = arrayList;
        this.f14500y = z2;
    }

    /* renamed from: a */
    private DefaultHttpClient m14601a(int i) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basicHttpParams, Utils.UTF8);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, i * 1000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, i * 1000);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), this.f14496u.getHttpPort()));
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0133 A[SYNTHETIC, Splitter:B:101:0x0133] */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb A[SYNTHETIC, Splitter:B:45:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dd A[SYNTHETIC, Splitter:B:59:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e2 A[SYNTHETIC, Splitter:B:62:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e7 A[SYNTHETIC, Splitter:B:65:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0106 A[SYNTHETIC, Splitter:B:78:0x0106] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010b A[SYNTHETIC, Splitter:B:81:0x010b] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0110 A[SYNTHETIC, Splitter:B:84:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0129 A[SYNTHETIC, Splitter:B:95:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012e A[SYNTHETIC, Splitter:B:98:0x012e] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:75:0x0101=Splitter:B:75:0x0101, B:56:0x00d8=Splitter:B:56:0x00d8} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m14602a(org.apache.http.HttpResponse r12) {
        /*
            r11 = this;
            r1 = 1
            r3 = 0
            r2 = 0
            if (r12 == 0) goto L_0x0011
            org.apache.http.StatusLine r0 = r12.getStatusLine()
            int r0 = r0.getStatusCode()
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 == r4) goto L_0x004c
        L_0x0011:
            boolean r0 = com.cootek.usage.UsageRecorder.m14564b()
            if (r0 == 0) goto L_0x0020
            if (r12 != 0) goto L_0x0021
            java.lang.String r0 = "Usage/NetProcessor"
            java.lang.String r1 = "Response is null"
            android.util.Log.i(r0, r1)
        L_0x0020:
            return r2
        L_0x0021:
            org.apache.http.StatusLine r0 = r12.getStatusLine()
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "Usage/NetProcessor"
            java.lang.String r1 = "StatusLine is null"
            android.util.Log.i(r0, r1)
            goto L_0x0020
        L_0x002f:
            java.lang.String r0 = "Usage/NetProcessor"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "StatusCode: "
            r1.<init>(r3)
            org.apache.http.StatusLine r3 = r12.getStatusLine()
            int r3 = r3.getStatusCode()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
            goto L_0x0020
        L_0x004c:
            org.apache.http.HttpEntity r4 = r12.getEntity()
            java.lang.String r0 = "Content-Encoding"
            org.apache.http.Header r0 = r12.getFirstHeader(r0)
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = r0.getValue()
            java.lang.String r5 = "gzip"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x01a7
            r0 = r1
        L_0x0065:
            java.io.InputStream r6 = r4.getContent()     // Catch:{ IllegalStateException -> 0x0188, IOException -> 0x00fa, all -> 0x0123 }
            if (r0 == 0) goto L_0x01a3
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IllegalStateException -> 0x0191, IOException -> 0x0172, all -> 0x0169 }
            r4.<init>(r6)     // Catch:{ IllegalStateException -> 0x0191, IOException -> 0x0172, all -> 0x0169 }
            r0 = r4
        L_0x0071:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IllegalStateException -> 0x0199, IOException -> 0x0179, all -> 0x016d }
            r5.<init>()     // Catch:{ IllegalStateException -> 0x0199, IOException -> 0x0179, all -> 0x016d }
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch:{ IllegalStateException -> 0x00d4, IOException -> 0x017f }
        L_0x007a:
            int r8 = r0.read(r7)     // Catch:{ IllegalStateException -> 0x00d4, IOException -> 0x017f }
            if (r8 > 0) goto L_0x00cf
            r5.flush()     // Catch:{ IllegalStateException -> 0x00d4, IOException -> 0x017f }
            byte[] r7 = r5.toByteArray()     // Catch:{ IllegalStateException -> 0x00d4, IOException -> 0x017f }
            java.lang.String r0 = new java.lang.String     // Catch:{ IllegalStateException -> 0x00d4, IOException -> 0x017f }
            java.lang.String r8 = "UTF-8"
            r0.<init>(r7, r8)     // Catch:{ IllegalStateException -> 0x00d4, IOException -> 0x017f }
            boolean r3 = com.cootek.usage.UsageRecorder.m14564b()     // Catch:{ IllegalStateException -> 0x01a0, IOException -> 0x0185 }
            if (r3 == 0) goto L_0x00a8
            java.lang.String r3 = "Usage/NetProcessor"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x01a0, IOException -> 0x0185 }
            java.lang.String r8 = "response body: "
            r7.<init>(r8)     // Catch:{ IllegalStateException -> 0x01a0, IOException -> 0x0185 }
            java.lang.StringBuilder r7 = r7.append(r0)     // Catch:{ IllegalStateException -> 0x01a0, IOException -> 0x0185 }
            java.lang.String r7 = r7.toString()     // Catch:{ IllegalStateException -> 0x01a0, IOException -> 0x0185 }
            android.util.Log.i(r3, r7)     // Catch:{ IllegalStateException -> 0x01a0, IOException -> 0x0185 }
        L_0x00a8:
            r5.close()     // Catch:{ IOException -> 0x0146 }
        L_0x00ab:
            if (r4 == 0) goto L_0x00b0
            r4.close()     // Catch:{ IOException -> 0x014c }
        L_0x00b0:
            if (r6 == 0) goto L_0x00b5
            r6.close()     // Catch:{ IOException -> 0x0152 }
        L_0x00b5:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0020
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0163 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x0163 }
            java.lang.String r0 = "error_code"
            int r0 = r3.getInt(r0)     // Catch:{ JSONException -> 0x0163 }
            if (r0 == 0) goto L_0x00cc
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r0 != r3) goto L_0x0158
        L_0x00cc:
            r2 = r1
            goto L_0x0020
        L_0x00cf:
            r9 = 0
            r5.write(r7, r9, r8)     // Catch:{ IllegalStateException -> 0x00d4, IOException -> 0x017f }
            goto L_0x007a
        L_0x00d4:
            r0 = move-exception
            r10 = r0
            r0 = r3
            r3 = r10
        L_0x00d8:
            r3.printStackTrace()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x00e0
            r5.close()     // Catch:{ IOException -> 0x00f0 }
        L_0x00e0:
            if (r4 == 0) goto L_0x00e5
            r4.close()     // Catch:{ IOException -> 0x00f5 }
        L_0x00e5:
            if (r6 == 0) goto L_0x00b5
            r6.close()     // Catch:{ IOException -> 0x00eb }
            goto L_0x00b5
        L_0x00eb:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x00b5
        L_0x00f0:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x00e0
        L_0x00f5:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x00e5
        L_0x00fa:
            r0 = move-exception
            r4 = r3
            r5 = r3
            r6 = r3
            r10 = r3
            r3 = r0
            r0 = r10
        L_0x0101:
            r3.printStackTrace()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x0109
            r5.close()     // Catch:{ IOException -> 0x0119 }
        L_0x0109:
            if (r4 == 0) goto L_0x010e
            r4.close()     // Catch:{ IOException -> 0x011e }
        L_0x010e:
            if (r6 == 0) goto L_0x00b5
            r6.close()     // Catch:{ IOException -> 0x0114 }
            goto L_0x00b5
        L_0x0114:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x00b5
        L_0x0119:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x0109
        L_0x011e:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x010e
        L_0x0123:
            r0 = move-exception
            r4 = r3
            r5 = r3
            r6 = r3
        L_0x0127:
            if (r5 == 0) goto L_0x012c
            r5.close()     // Catch:{ IOException -> 0x0137 }
        L_0x012c:
            if (r4 == 0) goto L_0x0131
            r4.close()     // Catch:{ IOException -> 0x013c }
        L_0x0131:
            if (r6 == 0) goto L_0x0136
            r6.close()     // Catch:{ IOException -> 0x0141 }
        L_0x0136:
            throw r0
        L_0x0137:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x012c
        L_0x013c:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0131
        L_0x0141:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0136
        L_0x0146:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x00ab
        L_0x014c:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x00b0
        L_0x0152:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x00b5
        L_0x0158:
            r1 = 1001(0x3e9, float:1.403E-42)
            if (r0 != r1) goto L_0x0020
            com.cootek.usage.AbsUsageAssist r0 = r11.f14496u     // Catch:{ JSONException -> 0x0163 }
            r0.onTokenInvalid()     // Catch:{ JSONException -> 0x0163 }
            goto L_0x0020
        L_0x0163:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0020
        L_0x0169:
            r0 = move-exception
            r4 = r3
            r5 = r3
            goto L_0x0127
        L_0x016d:
            r0 = move-exception
            r5 = r3
            goto L_0x0127
        L_0x0170:
            r0 = move-exception
            goto L_0x0127
        L_0x0172:
            r0 = move-exception
            r4 = r3
            r5 = r3
            r10 = r0
            r0 = r3
            r3 = r10
            goto L_0x0101
        L_0x0179:
            r0 = move-exception
            r5 = r3
            r10 = r0
            r0 = r3
            r3 = r10
            goto L_0x0101
        L_0x017f:
            r0 = move-exception
            r10 = r0
            r0 = r3
            r3 = r10
            goto L_0x0101
        L_0x0185:
            r3 = move-exception
            goto L_0x0101
        L_0x0188:
            r0 = move-exception
            r4 = r3
            r5 = r3
            r6 = r3
            r10 = r3
            r3 = r0
            r0 = r10
            goto L_0x00d8
        L_0x0191:
            r0 = move-exception
            r4 = r3
            r5 = r3
            r10 = r0
            r0 = r3
            r3 = r10
            goto L_0x00d8
        L_0x0199:
            r0 = move-exception
            r5 = r3
            r10 = r0
            r0 = r3
            r3 = r10
            goto L_0x00d8
        L_0x01a0:
            r3 = move-exception
            goto L_0x00d8
        L_0x01a3:
            r4 = r3
            r0 = r6
            goto L_0x0071
        L_0x01a7:
            r0 = r2
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3295j.m14602a(org.apache.http.HttpResponse):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v60, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v58, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v59, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v60, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v61, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v62, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v63, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v64, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v65, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v66, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v67, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v72, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v74, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v75, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v76, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v77, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v78, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v79, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v80, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v81, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v82, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v83, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v84, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v85, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v86, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v87, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v88, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v89, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v93, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v94, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v97, resolved type: int} */
    /* JADX WARNING: type inference failed for: r4v38, types: [java.lang.String] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0286 A[SYNTHETIC, Splitter:B:101:0x0286] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x020a A[SYNTHETIC, Splitter:B:67:0x020a] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0252 A[SYNTHETIC, Splitter:B:78:0x0252] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0257 A[SYNTHETIC, Splitter:B:81:0x0257] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025c A[SYNTHETIC, Splitter:B:84:0x025c] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0281 A[SYNTHETIC, Splitter:B:98:0x0281] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.apache.http.client.methods.HttpPost m14603b() {
        /*
            r12 = this;
            r7 = 47
            r1 = 0
            r6 = 0
            r5 = 1
            org.apache.http.client.methods.HttpPost r2 = new org.apache.http.client.methods.HttpPost
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "http://"
            r0.append(r3)
            com.cootek.usage.AbsUsageAssist r3 = r12.f14496u
            java.lang.String r3 = r3.getServerAddress()
            int r3 = r3.indexOf(r7)
            r4 = -1
            if (r3 != r4) goto L_0x0155
            com.cootek.usage.AbsUsageAssist r3 = r12.f14496u
            java.lang.String r3 = r3.getServerAddress()
            r0.append(r3)
            r3 = 58
            r0.append(r3)
            com.cootek.usage.AbsUsageAssist r3 = r12.f14496u
            int r3 = r3.getHttpPort()
            r0.append(r3)
        L_0x0038:
            java.lang.String r3 = "/statistic/usage?type="
            r0.append(r3)
            java.lang.String r3 = r12.f14498w
            java.lang.String r3 = android.net.Uri.encode(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.net.URI r3 = java.net.URI.create(r3)
            r2.setURI(r3)
            boolean r3 = com.cootek.usage.UsageRecorder.m14564b()
            if (r3 == 0) goto L_0x006f
            java.lang.String r3 = "Usage/NetProcessor"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "request uri: "
            r4.<init>(r7)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
        L_0x006f:
            java.lang.String r0 = ""
            com.cootek.usage.AbsUsageAssist r3 = r12.f14496u
            java.lang.String r3 = r3.getToken()
            if (r3 == 0) goto L_0x0089
            java.lang.String r0 = "auth_token=\"%s\""
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.cootek.usage.AbsUsageAssist r4 = r12.f14496u
            java.lang.String r4 = r4.getToken()
            r3[r6] = r4
            java.lang.String r0 = java.lang.String.format(r0, r3)
        L_0x0089:
            java.lang.String r3 = "Cookie"
            r2.setHeader(r3, r0)
            boolean r3 = com.cootek.usage.UsageRecorder.m14564b()
            if (r3 == 0) goto L_0x00a8
            java.lang.String r3 = "Usage/NetProcessor"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "request cookie: "
            r4.<init>(r7)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
        L_0x00a8:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a1 }
            r3.<init>()     // Catch:{ JSONException -> 0x01a1 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01a1 }
            r4.<init>()     // Catch:{ JSONException -> 0x01a1 }
            java.util.ArrayList r0 = r12.f14499x     // Catch:{ JSONException -> 0x01a1 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ JSONException -> 0x01a1 }
        L_0x00b8:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x01a1 }
            if (r0 != 0) goto L_0x0183
            boolean r0 = r12.f14500y     // Catch:{ JSONException -> 0x01a1 }
            if (r0 == 0) goto L_0x01e7
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            java.lang.String r7 = "SHA-256"
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            byte[] r0 = r0.getBytes()     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            r7.update(r0)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            byte[] r0 = r7.digest()     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            java.lang.String r7 = "data_key"
            com.cootek.usage.AbsUsageAssist r8 = r12.f14496u     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            java.lang.String r8 = com.cootek.usage.AbsUsageAssist.m14559a()     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            java.security.spec.X509EncodedKeySpec r9 = new java.security.spec.X509EncodedKeySpec     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            r10 = 8
            byte[] r8 = com.cootek.usage.C3286a.m14567a((java.lang.String) r8, (int) r10)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            r9.<init>(r8)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            java.lang.String r8 = "RSA"
            java.security.KeyFactory r8 = java.security.KeyFactory.getInstance(r8)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            java.security.PublicKey r8 = r8.generatePublic(r9)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            java.lang.String r9 = "RSA/ECB/PKCS1PADDING"
            javax.crypto.Cipher r9 = javax.crypto.Cipher.getInstance(r9)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            r10 = 1
            r9.init(r10, r8)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            byte[] r8 = r9.doFinal(r0)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            r9 = 8
            java.lang.String r8 = com.cootek.usage.C3286a.m14566a((byte[]) r8, (int) r9)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            r3.put(r7, r8)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            java.lang.String r7 = "data_encode"
            java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            java.lang.String r0 = com.cootek.usage.C3290e.m14579a((java.lang.String) r4, (byte[]) r0)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            r3.put(r7, r0)     // Catch:{ JSONException -> 0x01a8, InvalidKeyException -> 0x01af, NoSuchAlgorithmException -> 0x01b6, InvalidKeySpecException -> 0x01bd, NoSuchPaddingException -> 0x01c4, IllegalBlockSizeException -> 0x01cb, BadPaddingException -> 0x01d2, IOException -> 0x01d9, Error -> 0x01e0 }
            r0 = r6
        L_0x011d:
            if (r0 == 0) goto L_0x012f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a1 }
            r0.<init>()     // Catch:{ JSONException -> 0x01a1 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01a1 }
            r3.<init>()     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r4 = "data"
            r0.put(r4, r3)     // Catch:{ JSONException -> 0x01a1 }
            r3 = r0
        L_0x012f:
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x01a1 }
            boolean r4 = com.cootek.usage.UsageRecorder.m14564b()     // Catch:{ JSONException -> 0x02b6 }
            if (r4 == 0) goto L_0x014d
            java.lang.String r4 = "Usage/NetProcessor"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x02b6 }
            java.lang.String r8 = "request body: "
            r7.<init>(r8)     // Catch:{ JSONException -> 0x02b6 }
            java.lang.StringBuilder r3 = r7.append(r3)     // Catch:{ JSONException -> 0x02b6 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x02b6 }
            android.util.Log.i(r4, r3)     // Catch:{ JSONException -> 0x02b6 }
        L_0x014d:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x01ee
            r0 = r1
        L_0x0154:
            return r0
        L_0x0155:
            com.cootek.usage.AbsUsageAssist r3 = r12.f14496u
            java.lang.String r3 = r3.getServerAddress()
            com.cootek.usage.AbsUsageAssist r4 = r12.f14496u
            java.lang.String r4 = r4.getServerAddress()
            int r4 = r4.indexOf(r7)
            java.lang.String r7 = r3.substring(r6, r4)
            r0.append(r7)
            r7 = 58
            r0.append(r7)
            com.cootek.usage.AbsUsageAssist r7 = r12.f14496u
            int r7 = r7.getHttpPort()
            r0.append(r7)
            java.lang.String r3 = r3.substring(r4)
            r0.append(r3)
            goto L_0x0038
        L_0x0183:
            java.lang.Object r0 = r7.next()     // Catch:{ JSONException -> 0x01a1 }
            com.cootek.usage.UsageData r0 = (com.cootek.usage.UsageData) r0     // Catch:{ JSONException -> 0x01a1 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a1 }
            r8.<init>()     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r9 = "path"
            java.lang.String r10 = r0.path     // Catch:{ JSONException -> 0x01a1 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r9 = "value"
            java.lang.String r0 = r0.value     // Catch:{ JSONException -> 0x01a1 }
            r8.put(r9, r0)     // Catch:{ JSONException -> 0x01a1 }
            r4.put(r8)     // Catch:{ JSONException -> 0x01a1 }
            goto L_0x00b8
        L_0x01a1:
            r0 = move-exception
            r3 = r0
            r0 = r1
        L_0x01a4:
            r3.printStackTrace()
            goto L_0x014d
        L_0x01a8:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x01a1 }
            r0 = r5
            goto L_0x011d
        L_0x01af:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x01a1 }
            r0 = r5
            goto L_0x011d
        L_0x01b6:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x01a1 }
            r0 = r5
            goto L_0x011d
        L_0x01bd:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x01a1 }
            r0 = r5
            goto L_0x011d
        L_0x01c4:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x01a1 }
            r0 = r5
            goto L_0x011d
        L_0x01cb:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x01a1 }
            r0 = r5
            goto L_0x011d
        L_0x01d2:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x01a1 }
            r0 = r5
            goto L_0x011d
        L_0x01d9:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x01a1 }
            r0 = r5
            goto L_0x011d
        L_0x01e0:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x01a1 }
            r0 = r5
            goto L_0x011d
        L_0x01e7:
            java.lang.String r0 = "data"
            r3.put(r0, r4)     // Catch:{ JSONException -> 0x01a1 }
            goto L_0x012f
        L_0x01ee:
            java.lang.String r3 = "UTF-8"
            byte[] r7 = r0.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x0269, IOException -> 0x0273, all -> 0x027d }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ UnsupportedEncodingException -> 0x0269, IOException -> 0x0273, all -> 0x027d }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0269, IOException -> 0x0273, all -> 0x027d }
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch:{ UnsupportedEncodingException -> 0x02af, IOException -> 0x02a8 }
            r3.<init>(r4)     // Catch:{ UnsupportedEncodingException -> 0x02af, IOException -> 0x02a8 }
            r3.write(r7)     // Catch:{ UnsupportedEncodingException -> 0x02b4, IOException -> 0x02ad }
            r3.finish()     // Catch:{ UnsupportedEncodingException -> 0x02b4, IOException -> 0x02ad }
            r4.flush()     // Catch:{ UnsupportedEncodingException -> 0x02b4, IOException -> 0x02ad }
            r1 = r3
        L_0x0208:
            if (r4 == 0) goto L_0x02b9
            int r3 = r4.size()     // Catch:{ all -> 0x02a3 }
            if (r3 <= 0) goto L_0x02b9
            org.apache.http.entity.ByteArrayEntity r3 = new org.apache.http.entity.ByteArrayEntity     // Catch:{ all -> 0x02a3 }
            byte[] r6 = r4.toByteArray()     // Catch:{ all -> 0x02a3 }
            r3.<init>(r6)     // Catch:{ all -> 0x02a3 }
            r2.setEntity(r3)     // Catch:{ all -> 0x02a3 }
            boolean r3 = com.cootek.usage.UsageRecorder.m14564b()     // Catch:{ all -> 0x02a3 }
            if (r3 == 0) goto L_0x0240
            java.lang.String r3 = "Usage/NetProcessor"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a3 }
            java.lang.String r7 = "GZip size: "
            r6.<init>(r7)     // Catch:{ all -> 0x02a3 }
            int r7 = r4.size()     // Catch:{ all -> 0x02a3 }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ all -> 0x02a3 }
            java.lang.String r7 = "bytes"
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ all -> 0x02a3 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x02a3 }
            android.util.Log.i(r3, r6)     // Catch:{ all -> 0x02a3 }
        L_0x0240:
            java.lang.String r3 = "Content-Encoding"
            boolean r3 = r2.containsHeader(r3)     // Catch:{ all -> 0x02a3 }
            if (r3 != 0) goto L_0x024f
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r2.addHeader(r3, r6)     // Catch:{ all -> 0x02a3 }
        L_0x024f:
            r3 = r5
        L_0x0250:
            if (r1 == 0) goto L_0x0255
            r1.close()     // Catch:{ IOException -> 0x0294 }
        L_0x0255:
            if (r4 == 0) goto L_0x025a
            r4.close()     // Catch:{ IOException -> 0x0299 }
        L_0x025a:
            if (r3 != 0) goto L_0x0266
            org.apache.http.entity.StringEntity r1 = new org.apache.http.entity.StringEntity     // Catch:{ UnsupportedEncodingException -> 0x029e }
            java.lang.String r3 = "UTF-8"
            r1.<init>(r0, r3)     // Catch:{ UnsupportedEncodingException -> 0x029e }
            r2.setEntity(r1)     // Catch:{ UnsupportedEncodingException -> 0x029e }
        L_0x0266:
            r0 = r2
            goto L_0x0154
        L_0x0269:
            r3 = move-exception
            r4 = r1
            r11 = r1
            r1 = r3
            r3 = r11
        L_0x026e:
            r1.printStackTrace()     // Catch:{ all -> 0x02a5 }
            r1 = r3
            goto L_0x0208
        L_0x0273:
            r3 = move-exception
            r4 = r1
            r11 = r1
            r1 = r3
            r3 = r11
        L_0x0278:
            r1.printStackTrace()     // Catch:{ all -> 0x02a5 }
            r1 = r3
            goto L_0x0208
        L_0x027d:
            r0 = move-exception
            r4 = r1
        L_0x027f:
            if (r1 == 0) goto L_0x0284
            r1.close()     // Catch:{ IOException -> 0x028a }
        L_0x0284:
            if (r4 == 0) goto L_0x0289
            r4.close()     // Catch:{ IOException -> 0x028f }
        L_0x0289:
            throw r0
        L_0x028a:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0284
        L_0x028f:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0289
        L_0x0294:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0255
        L_0x0299:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x025a
        L_0x029e:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0266
        L_0x02a3:
            r0 = move-exception
            goto L_0x027f
        L_0x02a5:
            r0 = move-exception
            r1 = r3
            goto L_0x027f
        L_0x02a8:
            r3 = move-exception
            r11 = r3
            r3 = r1
            r1 = r11
            goto L_0x0278
        L_0x02ad:
            r1 = move-exception
            goto L_0x0278
        L_0x02af:
            r3 = move-exception
            r11 = r3
            r3 = r1
            r1 = r11
            goto L_0x026e
        L_0x02b4:
            r1 = move-exception
            goto L_0x026e
        L_0x02b6:
            r3 = move-exception
            goto L_0x01a4
        L_0x02b9:
            r3 = r6
            goto L_0x0250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3295j.m14603b():org.apache.http.client.methods.HttpPost");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10498a() {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            java.util.ArrayList r2 = r11.f14499x
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x000c
            r1 = r0
        L_0x000b:
            return r1
        L_0x000c:
            com.cootek.usage.AbsUsageAssist r0 = r11.f14496u
            java.lang.String r0 = r0.getToken()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001e
            com.cootek.usage.AbsUsageAssist r0 = r11.f14496u
            r0.onTokenInvalid()
            goto L_0x000b
        L_0x001e:
            com.cootek.usage.AbsUsageAssist r0 = r11.f14496u
            int r0 = r0.getHttpTimeout()
            org.apache.http.params.BasicHttpParams r2 = new org.apache.http.params.BasicHttpParams
            r2.<init>()
            org.apache.http.HttpVersion r3 = org.apache.http.HttpVersion.HTTP_1_1
            org.apache.http.params.HttpProtocolParams.setVersion(r2, r3)
            java.lang.String r3 = "UTF-8"
            org.apache.http.params.HttpProtocolParams.setContentCharset(r2, r3)
            int r3 = r0 * 1000
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r2, r3)
            int r0 = r0 * 1000
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r2, r0)
            org.apache.http.conn.scheme.SchemeRegistry r0 = new org.apache.http.conn.scheme.SchemeRegistry
            r0.<init>()
            org.apache.http.conn.scheme.Scheme r3 = new org.apache.http.conn.scheme.Scheme
            java.lang.String r4 = "http"
            org.apache.http.conn.scheme.PlainSocketFactory r5 = org.apache.http.conn.scheme.PlainSocketFactory.getSocketFactory()
            com.cootek.usage.AbsUsageAssist r6 = r11.f14496u
            int r6 = r6.getHttpPort()
            r3.<init>(r4, r5, r6)
            r0.register(r3)
            org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager r3 = new org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager
            r3.<init>(r2, r0)
            org.apache.http.impl.client.DefaultHttpClient r5 = new org.apache.http.impl.client.DefaultHttpClient
            r5.<init>(r3, r2)
            org.apache.http.client.methods.HttpPost r6 = r11.m14603b()
            r2 = 0
            com.cootek.usage.AbsUsageAssist r0 = r11.f14496u
            java.util.List r7 = r0.getProxyAddress()
            java.util.Collections.shuffle(r7)
            r3 = r1
        L_0x006f:
            com.cootek.usage.AbsUsageAssist r0 = r11.f14496u
            int r0 = r0.getRetryTimes()
            com.cootek.usage.AbsUsageAssist r4 = r11.f14496u
            java.util.List r4 = r4.getProxyAddress()
            int r4 = r4.size()
            int r0 = r0 + r4
            if (r3 < r0) goto L_0x0087
        L_0x0082:
            boolean r1 = r11.m14602a((org.apache.http.HttpResponse) r2)
            goto L_0x000b
        L_0x0087:
            boolean r0 = r11.f14497v     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            if (r0 == 0) goto L_0x009b
            boolean r0 = r11.f14497v     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            if (r0 == 0) goto L_0x013c
            com.cootek.usage.AbsUsageAssist r0 = r11.f14496u     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            android.content.Context r0 = r0.getContext()     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            boolean r0 = com.cootek.usage.C3292g.m14593a((android.content.Context) r0)     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            if (r0 == 0) goto L_0x013c
        L_0x009b:
            com.cootek.usage.AbsUsageAssist r0 = r11.f14496u     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            int r0 = r0.getRetryTimes()     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            if (r3 < r0) goto L_0x00dd
            com.cootek.usage.AbsUsageAssist r0 = r11.f14496u     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            int r0 = r0.getRetryTimes()     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            int r0 = r3 - r0
            java.lang.Object r0 = r7.get(r0)     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            r4 = 3128(0xc38, float:4.383E-42)
            java.lang.String r8 = ":"
            boolean r8 = r0.contains(r8)     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            if (r8 == 0) goto L_0x0138
            java.lang.String r4 = ":"
            java.lang.String[] r0 = r0.split(r4)     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            r4 = 0
            r4 = r0[r4]     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            r8 = 1
            r0 = r0[r8]     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            int r0 = r0.intValue()     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
        L_0x00cf:
            org.apache.http.HttpHost r8 = new org.apache.http.HttpHost     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            r8.<init>(r4, r0)     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            org.apache.http.params.HttpParams r0 = r5.getParams()     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            java.lang.String r4 = "http.route.default-proxy"
            r0.setParameter(r4, r8)     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
        L_0x00dd:
            org.apache.http.HttpResponse r2 = r5.execute(r6)     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            org.apache.http.StatusLine r0 = r2.getStatusLine()     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
            int r0 = r0.getStatusCode()     // Catch:{ ClientProtocolException -> 0x011a, IOException -> 0x0124, SecurityException -> 0x012e }
        L_0x00e9:
            com.cootek.usage.AbsUsageAssist r4 = r11.f14496u
            boolean r4 = r4.isDebugMode()
            if (r4 == 0) goto L_0x0105
            java.lang.String r4 = "Usage/NetProcessor"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ret code: "
            r8.<init>(r9)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            android.util.Log.i(r4, r8)
        L_0x0105:
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 == r4) goto L_0x0082
            r4 = 400(0x190, float:5.6E-43)
            if (r0 == r4) goto L_0x0082
            r4 = 500(0x1f4, float:7.0E-43)
            if (r0 < r4) goto L_0x0115
            r4 = 599(0x257, float:8.4E-43)
            if (r0 <= r4) goto L_0x0082
        L_0x0115:
            int r0 = r3 + 1
            r3 = r0
            goto L_0x006f
        L_0x011a:
            r0 = move-exception
            r10 = r0
            r0 = r2
            r2 = r10
            r2.printStackTrace()
            r2 = r0
            r0 = r1
            goto L_0x00e9
        L_0x0124:
            r0 = move-exception
            r10 = r0
            r0 = r2
            r2 = r10
            r2.printStackTrace()
            r2 = r0
            r0 = r1
            goto L_0x00e9
        L_0x012e:
            r0 = move-exception
            r10 = r0
            r0 = r2
            r2 = r10
            r2.printStackTrace()
            r2 = r0
            r0 = r1
            goto L_0x00e9
        L_0x0138:
            r10 = r4
            r4 = r0
            r0 = r10
            goto L_0x00cf
        L_0x013c:
            r0 = r1
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3295j.mo10498a():boolean");
    }
}
