package com.cootek.smartinput5.net;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p048d.C1246d;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.net.ac */
/* compiled from: SingleFileDownloader */
public class C2214ac {
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static String f9337E = "SingleFileDownloader";

    /* renamed from: a */
    public static final int f9338a = 200;

    /* renamed from: b */
    public static final int f9339b = 100;

    /* renamed from: c */
    public static final int f9340c = -1;

    /* renamed from: d */
    public static final int f9341d = -2;

    /* renamed from: e */
    private static final String f9342e = "SUCCESS";

    /* renamed from: f */
    private static final String f9343f = "FAILED";

    /* renamed from: g */
    private static final String f9344g = "CANCEL";

    /* renamed from: h */
    private static final String f9345h = "QUERY_VERSION_FAILED";

    /* renamed from: i */
    private static final String f9346i = "FORCE_STOP";

    /* renamed from: j */
    private static final String f9347j = "INVALID_CONTENT_LENGTH";

    /* renamed from: k */
    private static final String f9348k = "MD5_UNMATCH";

    /* renamed from: l */
    private static final String f9349l = "LENGTH_UNMATCH";

    /* renamed from: m */
    private static final long f9350m = 300000;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public long f9351A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f9352B = 0;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public String f9353C = "";
    /* access modifiers changed from: private */

    /* renamed from: D */
    public String f9354D = "";
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f9355n;

    /* renamed from: o */
    private boolean f9356o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f9357p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f9358q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f9359r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public File f9360s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Object f9361t;

    /* renamed from: u */
    private String f9362u;

    /* renamed from: v */
    private String f9363v;

    /* renamed from: w */
    private C2373x.C2376b f9364w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C2373x f9365x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f9366y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C2215a f9367z;

    public C2214ac(String str, String str2, File file, int i, Handler handler) {
        this.f9360s = file;
        this.f9362u = str;
        this.f9363v = str2;
        this.f9361t = Integer.valueOf(i);
        this.f9355n = handler;
        this.f9357p = false;
        this.f9358q = false;
        this.f9359r = false;
        this.f9364w = new C2216ad(this);
    }

    public C2214ac(String str, String str2, File file, int i, C2373x.C2376b bVar, Handler handler) {
        this.f9360s = file;
        this.f9362u = str;
        this.f9363v = str2;
        this.f9361t = Integer.valueOf(i);
        this.f9355n = handler;
        this.f9357p = false;
        this.f9358q = false;
        this.f9359r = false;
        this.f9364w = bVar;
    }

    public C2214ac(String str, File file, Object obj, Handler handler, boolean z) {
        this.f9366y = m9993a(str);
        this.f9360s = file;
        this.f9361t = obj;
        this.f9357p = false;
        this.f9358q = false;
        this.f9355n = handler;
        this.f9359r = z;
    }

    /* renamed from: a */
    public void mo7732a() {
        boolean z = true;
        this.f9356o = true;
        if (this.f9364w != null) {
            C2243D d = new C2243D();
            d.f9517c = this.f9362u;
            d.f9518d = this.f9363v;
            if (this.f9362u.equals(C1368X.m6320c().mo5832R())) {
                z = false;
            }
            d.f9519e = z;
            d.f9524j = ((Integer) this.f9361t).intValue();
            this.f9365x = new C2373x(d);
            this.f9365x.mo8060a(this.f9364w);
            return;
        }
        m9995a(this.f9360s, this.f9366y, (String) null);
    }

    /* renamed from: b */
    public boolean mo7733b() {
        return this.f9356o;
    }

    /* renamed from: c */
    public void mo7734c() {
        this.f9357p = false;
        this.f9358q = false;
        this.f9356o = false;
        this.f9365x = null;
        this.f9367z = null;
        m10010k();
    }

    /* renamed from: d */
    public void mo7735d() {
        this.f9357p = true;
        if (this.f9365x != null) {
            this.f9365x.mo8061b();
        }
        if (this.f9367z != null) {
            this.f9367z.cancel(true);
        }
        m10010k();
    }

    /* renamed from: e */
    public void mo7736e() {
        this.f9358q = true;
        if (this.f9365x != null) {
            this.f9365x.mo8061b();
        }
        if (this.f9367z != null) {
            this.f9367z.cancel(true);
        }
        m10010k();
    }

    /* renamed from: f */
    public boolean mo7737f() {
        C1017y.m5224c(f9337E, this.f9360s.getAbsolutePath() + ":" + Environment.getExternalStorageDirectory().getAbsolutePath());
        return this.f9360s.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9995a(File file, String str, String str2) {
        this.f9367z = new C2215a(this, (C2216ad) null);
        C1389aD o = C1368X.m6320c().mo5842o();
        C1602bh n = C1368X.m6320c().mo5841n();
        if (o.mo5915D(this.f9362u) || n.mo6293p(this.f9362u)) {
            this.f9367z.mo7741a((long) f9350m);
        }
        this.f9367z.execute(new Object[]{file, str, str2});
    }

    /* renamed from: g */
    public long mo7738g() {
        return this.f9351A;
    }

    /* renamed from: h */
    public int mo7739h() {
        return this.f9352B;
    }

    /* renamed from: com.cootek.smartinput5.net.ac$a */
    /* compiled from: SingleFileDownloader */
    private class C2215a extends AsyncTask<Object, Integer, Object> {

        /* renamed from: b */
        private File f9369b;

        /* renamed from: c */
        private File f9370c;

        /* renamed from: d */
        private RandomAccessFile f9371d;

        /* renamed from: e */
        private InputStream f9372e;

        /* renamed from: f */
        private BufferedInputStream f9373f;

        /* renamed from: g */
        private int f9374g;

        /* renamed from: h */
        private int f9375h;

        /* renamed from: i */
        private HttpURLConnection f9376i;

        /* renamed from: j */
        private long f9377j;

        private C2215a() {
            this.f9369b = null;
            this.f9370c = null;
            this.f9371d = null;
            this.f9372e = null;
            this.f9373f = null;
            this.f9374g = 0;
            this.f9375h = 0;
            this.f9376i = null;
            this.f9377j = 0;
        }

        /* synthetic */ C2215a(C2214ac acVar, C2216ad adVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
            com.cootek.smartinput5.net.C2214ac.m9989a(r12.f9368a, java.lang.System.currentTimeMillis() - r4);
            com.cootek.smartinput5.net.C2214ac.m9988a(r12.f9368a, r12.f9374g);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c9, code lost:
            if (com.cootek.smartinput5.net.C2214ac.m10006h(r12.f9368a) != false) goto L_0x02e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x02cf, code lost:
            if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x03e5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02dd, code lost:
            if (android.text.TextUtils.equals(r1, com.cootek.smartinput.utilities.C0997e.m5188b(r6.getAbsolutePath())) != false) goto L_0x02e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02df, code lost:
            r6.delete();
            com.cootek.smartinput5.net.C2214ac.m10002d(r12.f9368a, com.cootek.smartinput5.net.C2214ac.f9348k);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x03ee, code lost:
            if (r6.length() == ((long) r12.f9374g)) goto L_0x02e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x03f0, code lost:
            r6.delete();
            com.cootek.smartinput5.net.C2214ac.m10002d(r12.f9368a, com.cootek.smartinput5.net.C2214ac.f9349l);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object... r13) {
            /*
                r12 = this;
                r7 = 2
                r3 = 0
                r5 = 1
                r4 = 0
                r0 = r13[r4]
                java.io.File r0 = (java.io.File) r0
                r12.f9369b = r0
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.io.File r2 = r12.f9369b
                java.lang.String r2 = r2.getAbsolutePath()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = ".tmp"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                r12.f9370c = r0
                java.io.File r6 = r12.f9370c
                r0 = r13[r5]
                java.lang.String r0 = (java.lang.String) r0
                r1 = r13[r7]
                java.lang.String r1 = (java.lang.String) r1
                int r2 = android.os.Build.VERSION.SDK_INT
                r5 = 8
                if (r2 >= r5) goto L_0x0041
                java.lang.String r2 = "http.keepAlive"
                java.lang.String r5 = "false"
                java.lang.System.setProperty(r2, r5)
            L_0x0041:
                com.cootek.smartinput5.net.ac r2 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                r5 = 0
                boolean unused = r2.f9357p = r5     // Catch:{ all -> 0x033a }
                java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0068, IOException -> 0x009f }
                r2.<init>(r0)     // Catch:{ MalformedURLException -> 0x0068, IOException -> 0x009f }
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ MalformedURLException -> 0x0068, IOException -> 0x009f }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ MalformedURLException -> 0x0068, IOException -> 0x009f }
                r12.f9376i = r2     // Catch:{ MalformedURLException -> 0x0068, IOException -> 0x009f }
                java.lang.Object r2 = r12.m10022b()     // Catch:{ MalformedURLException -> 0x0068, IOException -> 0x009f }
                if (r2 == 0) goto L_0x00d6
                r12.m10021a()
                java.net.HttpURLConnection r0 = r12.f9376i
                if (r0 == 0) goto L_0x0066
                java.net.HttpURLConnection r0 = r12.f9376i
                r0.disconnect()
            L_0x0066:
                r0 = r2
            L_0x0067:
                return r0
            L_0x0068:
                r0 = move-exception
                com.cootek.smartinput5.net.ac r1 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x033a }
                java.lang.String unused = r1.f9354D = r2     // Catch:{ all -> 0x033a }
                java.lang.String r1 = com.cootek.smartinput5.net.C2214ac.f9337E     // Catch:{ all -> 0x033a }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x033a }
                r2.<init>()     // Catch:{ all -> 0x033a }
                java.lang.String r3 = "OpenConnection Fail, error message : "
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r3 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r3 = r3.f9354D     // Catch:{ all -> 0x033a }
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x033a }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x033a }
                android.util.Log.e(r1, r2)     // Catch:{ all -> 0x033a }
                r12.m10021a()
                java.net.HttpURLConnection r1 = r12.f9376i
                if (r1 == 0) goto L_0x0067
                java.net.HttpURLConnection r1 = r12.f9376i
                r1.disconnect()
                goto L_0x0067
            L_0x009f:
                r0 = move-exception
                com.cootek.smartinput5.net.ac r1 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x033a }
                java.lang.String unused = r1.f9354D = r2     // Catch:{ all -> 0x033a }
                java.lang.String r1 = com.cootek.smartinput5.net.C2214ac.f9337E     // Catch:{ all -> 0x033a }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x033a }
                r2.<init>()     // Catch:{ all -> 0x033a }
                java.lang.String r3 = "OpenConnection Fail, error message : "
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r3 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r3 = r3.f9354D     // Catch:{ all -> 0x033a }
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x033a }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x033a }
                android.util.Log.e(r1, r2)     // Catch:{ all -> 0x033a }
                r12.m10021a()
                java.net.HttpURLConnection r1 = r12.f9376i
                if (r1 == 0) goto L_0x0067
                java.net.HttpURLConnection r1 = r12.f9376i
                r1.disconnect()
                goto L_0x0067
            L_0x00d6:
                com.cootek.smartinput5.net.q r2 = com.cootek.smartinput5.net.C2361q.m10797b()     // Catch:{ all -> 0x033a }
                java.lang.String r7 = r2.mo8008c((java.io.File) r6)     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.q r2 = com.cootek.smartinput5.net.C2361q.m10797b()     // Catch:{ all -> 0x033a }
                int r8 = r2.mo8010d((java.io.File) r6)     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.q r2 = com.cootek.smartinput5.net.C2361q.m10797b()     // Catch:{ all -> 0x033a }
                int r5 = r2.mo7994a((java.io.File) r6)     // Catch:{ all -> 0x033a }
                boolean r2 = r6.exists()     // Catch:{ all -> 0x033a }
                if (r2 == 0) goto L_0x016a
                if (r7 != 0) goto L_0x0146
                r6.delete()     // Catch:{ all -> 0x033a }
                r2 = r4
            L_0x00fa:
                java.net.HttpURLConnection r9 = r12.f9376i     // Catch:{ IOException -> 0x0175 }
                java.io.InputStream r9 = r9.getInputStream()     // Catch:{ IOException -> 0x0175 }
                r12.f9372e = r9     // Catch:{ IOException -> 0x0175 }
                java.net.HttpURLConnection r9 = r12.f9376i     // Catch:{ all -> 0x033a }
                int r9 = r9.getContentLength()     // Catch:{ all -> 0x033a }
                r12.f9374g = r9     // Catch:{ all -> 0x033a }
                int r9 = r12.f9374g     // Catch:{ all -> 0x033a }
                if (r9 >= 0) goto L_0x01ad
                java.lang.String r0 = com.cootek.smartinput5.net.C2214ac.f9337E     // Catch:{ all -> 0x033a }
                java.lang.String r1 = "Server returns invalid content length"
                android.util.Log.e(r0, r1)     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r0 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                r1 = 1
                boolean unused = r0.f9357p = r1     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r0 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x033a }
                r1.<init>()     // Catch:{ all -> 0x033a }
                java.lang.String r2 = "INVALID_CONTENT_LENGTH_"
                java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x033a }
                int r2 = r12.f9374g     // Catch:{ all -> 0x033a }
                java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x033a }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x033a }
                java.lang.String unused = r0.f9354D = r1     // Catch:{ all -> 0x033a }
                r12.m10021a()
                java.net.HttpURLConnection r0 = r12.f9376i
                if (r0 == 0) goto L_0x0143
                java.net.HttpURLConnection r0 = r12.f9376i
                r0.disconnect()
            L_0x0143:
                r0 = r3
                goto L_0x0067
            L_0x0146:
                if (r8 <= r5) goto L_0x0173
                java.net.HttpURLConnection r2 = r12.f9376i     // Catch:{ all -> 0x033a }
                java.lang.String r9 = "Range"
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x033a }
                r10.<init>()     // Catch:{ all -> 0x033a }
                java.lang.String r11 = "bytes="
                java.lang.StringBuilder r10 = r10.append(r11)     // Catch:{ all -> 0x033a }
                java.lang.StringBuilder r10 = r10.append(r5)     // Catch:{ all -> 0x033a }
                java.lang.String r11 = "-"
                java.lang.StringBuilder r10 = r10.append(r11)     // Catch:{ all -> 0x033a }
                java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x033a }
                r2.setRequestProperty(r9, r10)     // Catch:{ all -> 0x033a }
                r2 = r5
                goto L_0x00fa
            L_0x016a:
                if (r7 == 0) goto L_0x0173
                com.cootek.smartinput5.net.q r2 = com.cootek.smartinput5.net.C2361q.m10797b()     // Catch:{ all -> 0x033a }
                r2.mo8006b((java.io.File) r6)     // Catch:{ all -> 0x033a }
            L_0x0173:
                r2 = r4
                goto L_0x00fa
            L_0x0175:
                r0 = move-exception
                com.cootek.smartinput5.net.ac r1 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x033a }
                java.lang.String unused = r1.f9354D = r2     // Catch:{ all -> 0x033a }
                java.lang.String r1 = com.cootek.smartinput5.net.C2214ac.f9337E     // Catch:{ all -> 0x033a }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x033a }
                r2.<init>()     // Catch:{ all -> 0x033a }
                java.lang.String r3 = "Get input stream from URL connection fail, error message : "
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r3 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r3 = r3.f9354D     // Catch:{ all -> 0x033a }
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x033a }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x033a }
                android.util.Log.e(r1, r2)     // Catch:{ all -> 0x033a }
                r12.m10021a()
                java.net.HttpURLConnection r1 = r12.f9376i
                if (r1 == 0) goto L_0x0067
                java.net.HttpURLConnection r1 = r12.f9376i
                r1.disconnect()
                goto L_0x0067
            L_0x01ad:
                java.net.HttpURLConnection r9 = r12.f9376i     // Catch:{ all -> 0x033a }
                long r10 = r9.getLastModified()     // Catch:{ all -> 0x033a }
                java.lang.String r9 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x033a }
                if (r7 == 0) goto L_0x01d0
                boolean r10 = r7.equals(r9)     // Catch:{ all -> 0x033a }
                if (r10 == 0) goto L_0x01d0
                if (r8 != r5) goto L_0x01d0
                r12.m10021a()
                java.net.HttpURLConnection r0 = r12.f9376i
                if (r0 == 0) goto L_0x01cd
                java.net.HttpURLConnection r0 = r12.f9376i
                r0.disconnect()
            L_0x01cd:
                r0 = r3
                goto L_0x0067
            L_0x01d0:
                com.cootek.smartinput5.net.ac r5 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                boolean r5 = r5.f9357p     // Catch:{ all -> 0x033a }
                if (r5 != 0) goto L_0x02e9
                com.cootek.smartinput5.net.ac r5 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                boolean r5 = r5.f9358q     // Catch:{ all -> 0x033a }
                if (r5 != 0) goto L_0x02e9
                if (r7 == 0) goto L_0x03fc
                boolean r5 = r7.equals(r9)     // Catch:{ all -> 0x033a }
                if (r5 != 0) goto L_0x03fc
                com.cootek.smartinput5.net.q r2 = com.cootek.smartinput5.net.C2361q.m10797b()     // Catch:{ all -> 0x033a }
                r2.mo8006b((java.io.File) r6)     // Catch:{ all -> 0x033a }
                boolean r2 = r6.exists()     // Catch:{ all -> 0x033a }
                if (r2 == 0) goto L_0x01f8
                r6.delete()     // Catch:{ all -> 0x033a }
            L_0x01f8:
                java.io.InputStream r2 = r12.f9372e     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                r2.close()     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                r2.<init>(r0)     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                java.net.URLConnection r0 = r2.openConnection()     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                r12.f9376i = r0     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                r12.m10022b()     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                java.net.HttpURLConnection r0 = r12.f9376i     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                java.io.InputStream r0 = r0.getInputStream()     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                r12.f9372e = r0     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                java.net.HttpURLConnection r0 = r12.f9376i     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                int r0 = r0.getContentLength()     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                r12.f9374g = r0     // Catch:{ MalformedURLException -> 0x02f8, IOException -> 0x0313 }
                r0 = r4
            L_0x021e:
                boolean r2 = r6.exists()     // Catch:{ all -> 0x033a }
                if (r2 != 0) goto L_0x032e
                com.cootek.smartinput5.net.q r2 = com.cootek.smartinput5.net.C2361q.m10797b()     // Catch:{ all -> 0x033a }
                int r4 = r12.f9374g     // Catch:{ all -> 0x033a }
                r2.mo8004a((java.io.File) r6, (java.lang.String) r9, (int) r4)     // Catch:{ all -> 0x033a }
            L_0x022d:
                java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0348, IOException -> 0x037e }
                java.lang.String r4 = "rw"
                r2.<init>(r6, r4)     // Catch:{ FileNotFoundException -> 0x0348, IOException -> 0x037e }
                r12.f9371d = r2     // Catch:{ FileNotFoundException -> 0x0348, IOException -> 0x037e }
                java.io.RandomAccessFile r2 = r12.f9371d     // Catch:{ FileNotFoundException -> 0x0348, IOException -> 0x037e }
                long r4 = (long) r0     // Catch:{ FileNotFoundException -> 0x0348, IOException -> 0x037e }
                r2.seek(r4)     // Catch:{ FileNotFoundException -> 0x0348, IOException -> 0x037e }
                java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x033a }
                java.io.InputStream r4 = r12.f9372e     // Catch:{ all -> 0x033a }
                r5 = 8192(0x2000, float:1.14794E-41)
                r2.<init>(r4, r5)     // Catch:{ all -> 0x033a }
                r12.f9373f = r2     // Catch:{ all -> 0x033a }
                r2 = 8192(0x2000, float:1.14794E-41)
                byte[] r2 = new byte[r2]     // Catch:{ all -> 0x033a }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x033a }
            L_0x024f:
                java.io.BufferedInputStream r7 = r12.f9373f     // Catch:{ IOException -> 0x0399 }
                int r7 = r7.read(r2)     // Catch:{ IOException -> 0x0399 }
                if (r7 <= 0) goto L_0x02b1
                com.cootek.smartinput5.net.ac r8 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ IOException -> 0x0399 }
                boolean r8 = r8.f9357p     // Catch:{ IOException -> 0x0399 }
                if (r8 != 0) goto L_0x02b1
                java.io.RandomAccessFile r8 = r12.f9371d     // Catch:{ IOException -> 0x0399 }
                r9 = 0
                r8.write(r2, r9, r7)     // Catch:{ IOException -> 0x0399 }
                int r0 = r0 + r7
                float r7 = (float) r0     // Catch:{ IOException -> 0x0399 }
                int r8 = r12.f9374g     // Catch:{ IOException -> 0x0399 }
                float r8 = (float) r8     // Catch:{ IOException -> 0x0399 }
                float r7 = r7 / r8
                r8 = 1120403456(0x42c80000, float:100.0)
                float r7 = r7 * r8
                int r7 = (int) r7     // Catch:{ IOException -> 0x0399 }
                int r8 = r12.f9375h     // Catch:{ IOException -> 0x0399 }
                if (r7 <= r8) goto L_0x029c
                r8 = 100
                if (r7 > r8) goto L_0x029c
                com.cootek.smartinput5.net.ac r8 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ IOException -> 0x0399 }
                boolean r8 = r8.f9357p     // Catch:{ IOException -> 0x0399 }
                if (r8 != 0) goto L_0x029c
                r8 = 3
                java.lang.Integer[] r8 = new java.lang.Integer[r8]     // Catch:{ IOException -> 0x0399 }
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0399 }
                r8[r9] = r10     // Catch:{ IOException -> 0x0399 }
                r9 = 1
                java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0399 }
                r8[r9] = r10     // Catch:{ IOException -> 0x0399 }
                r9 = 2
                int r10 = r12.f9374g     // Catch:{ IOException -> 0x0399 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x0399 }
                r8[r9] = r10     // Catch:{ IOException -> 0x0399 }
                r12.publishProgress(r8)     // Catch:{ IOException -> 0x0399 }
            L_0x029c:
                r12.f9375h = r7     // Catch:{ IOException -> 0x0399 }
                long r8 = r12.f9377j     // Catch:{ IOException -> 0x0399 }
                r10 = 0
                int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r7 <= 0) goto L_0x024f
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0399 }
                long r8 = r8 - r4
                long r10 = r12.f9377j     // Catch:{ IOException -> 0x0399 }
                int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r7 <= 0) goto L_0x024f
            L_0x02b1:
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r0 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                long r4 = r8 - r4
                long unused = r0.f9351A = r4     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r0 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                int r2 = r12.f9374g     // Catch:{ all -> 0x033a }
                int unused = r0.f9352B = r2     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r0 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                boolean r0 = r0.f9357p     // Catch:{ all -> 0x033a }
                if (r0 != 0) goto L_0x02e9
                boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x033a }
                if (r0 != 0) goto L_0x03e5
                java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x033a }
                java.lang.String r0 = com.cootek.smartinput.utilities.C0997e.m5188b((java.lang.String) r0)     // Catch:{ all -> 0x033a }
                boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ all -> 0x033a }
                if (r0 != 0) goto L_0x02e9
                r6.delete()     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r0 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r1 = "MD5_UNMATCH"
                java.lang.String unused = r0.f9354D = r1     // Catch:{ all -> 0x033a }
            L_0x02e9:
                r12.m10021a()
                java.net.HttpURLConnection r0 = r12.f9376i
                if (r0 == 0) goto L_0x02f5
                java.net.HttpURLConnection r0 = r12.f9376i
                r0.disconnect()
            L_0x02f5:
                r0 = r3
                goto L_0x0067
            L_0x02f8:
                r0 = move-exception
                com.cootek.smartinput5.net.ac r1 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x033a }
                java.lang.String unused = r1.f9354D = r2     // Catch:{ all -> 0x033a }
                r0.printStackTrace()     // Catch:{ all -> 0x033a }
                r12.m10021a()
                java.net.HttpURLConnection r1 = r12.f9376i
                if (r1 == 0) goto L_0x0067
                java.net.HttpURLConnection r1 = r12.f9376i
                r1.disconnect()
                goto L_0x0067
            L_0x0313:
                r0 = move-exception
                com.cootek.smartinput5.net.ac r1 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x033a }
                java.lang.String unused = r1.f9354D = r2     // Catch:{ all -> 0x033a }
                r0.printStackTrace()     // Catch:{ all -> 0x033a }
                r12.m10021a()
                java.net.HttpURLConnection r1 = r12.f9376i
                if (r1 == 0) goto L_0x0067
                java.net.HttpURLConnection r1 = r12.f9376i
                r1.disconnect()
                goto L_0x0067
            L_0x032e:
                com.cootek.smartinput5.net.q r2 = com.cootek.smartinput5.net.C2361q.m10797b()     // Catch:{ all -> 0x033a }
                int r2 = r2.mo8010d((java.io.File) r6)     // Catch:{ all -> 0x033a }
                r12.f9374g = r2     // Catch:{ all -> 0x033a }
                goto L_0x022d
            L_0x033a:
                r0 = move-exception
                r12.m10021a()
                java.net.HttpURLConnection r1 = r12.f9376i
                if (r1 == 0) goto L_0x0347
                java.net.HttpURLConnection r1 = r12.f9376i
                r1.disconnect()
            L_0x0347:
                throw r0
            L_0x0348:
                r0 = move-exception
                com.cootek.smartinput5.net.ac r1 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x033a }
                java.lang.String unused = r1.f9354D = r2     // Catch:{ all -> 0x033a }
                java.lang.String r1 = ""
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x033a }
                r2.<init>()     // Catch:{ all -> 0x033a }
                java.lang.String r3 = "FileNotFoundException, error message : "
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r3 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r3 = r3.f9354D     // Catch:{ all -> 0x033a }
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x033a }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x033a }
                android.util.Log.e(r1, r2)     // Catch:{ all -> 0x033a }
                r12.m10021a()
                java.net.HttpURLConnection r1 = r12.f9376i
                if (r1 == 0) goto L_0x0067
                java.net.HttpURLConnection r1 = r12.f9376i
                r1.disconnect()
                goto L_0x0067
            L_0x037e:
                r0 = move-exception
                com.cootek.smartinput5.net.ac r1 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x033a }
                java.lang.String unused = r1.f9354D = r2     // Catch:{ all -> 0x033a }
                r0.printStackTrace()     // Catch:{ all -> 0x033a }
                r12.m10021a()
                java.net.HttpURLConnection r1 = r12.f9376i
                if (r1 == 0) goto L_0x0067
                java.net.HttpURLConnection r1 = r12.f9376i
                r1.disconnect()
                goto L_0x0067
            L_0x0399:
                r0 = move-exception
                com.cootek.smartinput5.net.ac r1 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x03d9 }
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x03d9 }
                java.lang.String unused = r1.f9354D = r2     // Catch:{ all -> 0x03d9 }
                java.lang.String r1 = ""
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d9 }
                r2.<init>()     // Catch:{ all -> 0x03d9 }
                java.lang.String r3 = "Write file to disk IOException, error message : "
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x03d9 }
                com.cootek.smartinput5.net.ac r3 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x03d9 }
                java.lang.String r3 = r3.f9354D     // Catch:{ all -> 0x03d9 }
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ all -> 0x03d9 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x03d9 }
                android.util.Log.e(r1, r2)     // Catch:{ all -> 0x03d9 }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r1 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                long r2 = r2 - r4
                long unused = r1.f9351A = r2     // Catch:{ all -> 0x033a }
                r12.m10021a()
                java.net.HttpURLConnection r1 = r12.f9376i
                if (r1 == 0) goto L_0x0067
                java.net.HttpURLConnection r1 = r12.f9376i
                r1.disconnect()
                goto L_0x0067
            L_0x03d9:
                r0 = move-exception
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r1 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                long r2 = r2 - r4
                long unused = r1.f9351A = r2     // Catch:{ all -> 0x033a }
                throw r0     // Catch:{ all -> 0x033a }
            L_0x03e5:
                long r0 = r6.length()     // Catch:{ all -> 0x033a }
                int r2 = r12.f9374g     // Catch:{ all -> 0x033a }
                long r4 = (long) r2     // Catch:{ all -> 0x033a }
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 == 0) goto L_0x02e9
                r6.delete()     // Catch:{ all -> 0x033a }
                com.cootek.smartinput5.net.ac r0 = com.cootek.smartinput5.net.C2214ac.this     // Catch:{ all -> 0x033a }
                java.lang.String r1 = "LENGTH_UNMATCH"
                java.lang.String unused = r0.f9354D = r1     // Catch:{ all -> 0x033a }
                goto L_0x02e9
            L_0x03fc:
                r0 = r2
                goto L_0x021e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.net.C2214ac.C2215a.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            if (!C2214ac.this.f9357p && !C2214ac.this.f9358q) {
                int intValue = numArr[0].intValue();
                int intValue2 = numArr[1].intValue();
                int intValue3 = numArr[2].intValue();
                Message obtain = Message.obtain();
                obtain.what = intValue;
                obtain.arg1 = intValue2;
                obtain.arg2 = intValue3;
                obtain.obj = C2214ac.this.f9361t;
                C2214ac.this.f9355n.sendMessage(obtain);
            }
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
            if (C2214ac.this.f9358q) {
                C2214ac.this.f9355n.sendMessage(Message.obtain(C2214ac.this.f9355n, -2, C2214ac.this.f9361t));
                String unused = C2214ac.this.f9353C = "FAILED";
                String unused2 = C2214ac.this.f9354D = C2214ac.f9346i;
            } else {
                C2214ac.this.f9355n.sendMessage(Message.obtain(C2214ac.this.f9355n, -1, C2214ac.this.f9361t));
                String unused3 = C2214ac.this.f9353C = "CANCEL";
                String unused4 = C2214ac.this.f9354D = "";
            }
            C2214ac.this.m10011l();
            m10021a();
        }

        /* renamed from: a */
        private void m10021a() {
            try {
                if (this.f9373f != null) {
                    this.f9373f.close();
                }
            } catch (IOException e) {
                Log.e("", "Release Streams IOException, error message : " + e.getMessage());
            }
            try {
                if (this.f9372e != null) {
                    this.f9372e.close();
                }
            } catch (IOException e2) {
                Log.e("", "Release Streams IOException, error message : " + e2.getMessage());
            }
            try {
                if (this.f9371d != null) {
                    this.f9371d.close();
                }
            } catch (IOException e3) {
                Log.e("", "Release Streams IOException, error message : " + e3.getMessage());
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            if (obj != null || this.f9370c == null || !this.f9370c.exists()) {
                C2214ac.this.f9355n.sendMessage(Message.obtain(C2214ac.this.f9355n, -2, C2214ac.this.f9361t));
                String unused = C2214ac.this.f9353C = "FAILED";
            } else if (C2214ac.this.f9357p || C2214ac.this.f9358q) {
                C2214ac.this.f9355n.sendMessage(Message.obtain(C2214ac.this.f9355n, -1, C2214ac.this.f9361t));
                String unused2 = C2214ac.this.f9353C = "CANCEL";
                String unused3 = C2214ac.this.f9354D = "";
            } else {
                if (this.f9369b.exists()) {
                    this.f9369b.delete();
                }
                this.f9370c.renameTo(this.f9369b);
                C2214ac.this.f9355n.sendMessage(Message.obtain(C2214ac.this.f9355n, 200, C2214ac.this.f9361t));
                String unused4 = C2214ac.this.f9353C = "SUCCESS";
                String unused5 = C2214ac.this.f9354D = "";
            }
            C2214ac.this.m10011l();
            C2214ac.this.f9367z.cancel(true);
        }

        /* renamed from: b */
        private Object m10022b() {
            if (C2214ac.this.f9359r) {
                String c = C2188Q.m9853a().mo7683c();
                if (!TextUtils.isEmpty(c)) {
                    try {
                        this.f9376i.setRequestProperty(C2261Q.f9792am, "auth_token=" + c);
                    } catch (IllegalStateException e) {
                        Log.e(C2214ac.f9337E, "SetToken Fail, error message : " + e.getMessage());
                        return e;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo7741a(long j) {
            this.f9377j = j;
        }
    }

    /* renamed from: i */
    public Object mo7740i() {
        return this.f9361t;
    }

    /* renamed from: k */
    private void m10010k() {
        if (this.f9355n != null) {
            this.f9355n.removeCallbacksAndMessages(this.f9361t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m9993a(String str) {
        return C2243D.m10187a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m10011l() {
        Context b = C1368X.m6313b();
        if (b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.f9366y);
            hashMap.put("dltm", Long.valueOf(this.f9351A));
            hashMap.put("dlst", this.f9353C);
            hashMap.put("flcs", this.f9354D);
            hashMap.put("conl", Integer.valueOf(this.f9352B));
            String f = C2225al.m10069f(b);
            String a = C2225al.m10051a(b);
            String b2 = C2225al.m10060b();
            String str = C2188Q.m9853a().mo7685e() ? C1899v.f6395s : C1246d.f3815bf;
            hashMap.put("nwop", f);
            hashMap.put("loc", a);
            hashMap.put("ip", b2);
            hashMap.put("nwtp", str);
        }
    }
}
