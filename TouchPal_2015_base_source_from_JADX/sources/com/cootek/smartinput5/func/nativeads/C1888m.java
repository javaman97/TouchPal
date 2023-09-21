package com.cootek.smartinput5.func.nativeads;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.ImageView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.paopaopanel.C1932a;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.nativeads.m */
/* compiled from: NativeAds */
public class C1888m extends C1875a {

    /* renamed from: F */
    private static final String f6277F = "id";

    /* renamed from: G */
    private static final String f6278G = "type";

    /* renamed from: H */
    private static final String f6279H = "icon_url";

    /* renamed from: I */
    private static final String f6280I = "banner_url";

    /* renamed from: J */
    private static final String f6281J = "title";

    /* renamed from: K */
    private static final String f6282K = "description";

    /* renamed from: L */
    private static final String f6283L = "action_type";

    /* renamed from: M */
    private static final String f6284M = "action_title";

    /* renamed from: N */
    private static final String f6285N = "action_url";

    /* renamed from: O */
    private static final String f6286O = "preview_icon_url";

    /* renamed from: P */
    private static final String f6287P = "preview_url";

    /* renamed from: Q */
    private static final String f6288Q = "pkg_name";

    /* renamed from: R */
    private static final String f6289R = "display_index";

    /* renamed from: S */
    private static final String f6290S = "layout";

    /* renamed from: T */
    private static final String f6291T = "native_filter";

    /* renamed from: U */
    private static final String f6292U = "name";

    /* renamed from: V */
    private static final String f6293V = "impression_url";

    /* renamed from: W */
    private static final String f6294W = "notice_url";

    /* renamed from: X */
    private static final String f6295X = "slot_id";

    /* renamed from: Y */
    private static final String f6296Y = "media_type";

    /* renamed from: Z */
    private static final String f6297Z = "payload";

    /* renamed from: aa */
    private static final String f6298aa = "request_id";

    /* renamed from: ab */
    private static final String f6299ab = "conversion_url";

    /* renamed from: ac */
    private static final long f6300ac = 1800000;

    /* renamed from: g */
    public static final String f6301g = "ads_icon_";

    /* renamed from: A */
    public String f6302A;

    /* renamed from: B */
    public String f6303B;

    /* renamed from: C */
    public String f6304C;

    /* renamed from: D */
    public String f6305D;

    /* renamed from: E */
    public C1892p f6306E = C1892p.NORMAL;

    /* renamed from: ad */
    private long f6307ad = 0;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C1932a f6308ae;

    /* renamed from: af */
    private Drawable f6309af;

    /* renamed from: ag */
    private C1889a f6310ag;

    /* renamed from: h */
    public Context f6311h;

    /* renamed from: i */
    public JSONObject f6312i;

    /* renamed from: j */
    public String f6313j;

    /* renamed from: k */
    public String f6314k;

    /* renamed from: l */
    public String f6315l;

    /* renamed from: m */
    public String f6316m;

    /* renamed from: n */
    public String f6317n;

    /* renamed from: o */
    public String f6318o;

    /* renamed from: p */
    public String f6319p;

    /* renamed from: q */
    public String f6320q;

    /* renamed from: r */
    public int f6321r;

    /* renamed from: s */
    public String f6322s;

    /* renamed from: t */
    public String f6323t;

    /* renamed from: u */
    public String f6324u;

    /* renamed from: v */
    public String f6325v;

    /* renamed from: w */
    public String f6326w;

    /* renamed from: x */
    public String f6327x;

    /* renamed from: y */
    public String f6328y;

    /* renamed from: z */
    public String f6329z;

    public C1888m(JSONObject jSONObject) throws JSONException {
        this.f6312i = jSONObject;
        this.f6255c = jSONObject.getString("id");
        if (jSONObject.has("type")) {
            this.f6313j = jSONObject.getString("type");
        }
        if (jSONObject.has(f6279H)) {
            this.f6314k = jSONObject.getString(f6279H);
        }
        if (jSONObject.has(f6280I)) {
            this.f6315l = jSONObject.getString(f6280I);
        }
        if (jSONObject.has("title")) {
            this.f6316m = jSONObject.getString("title");
        }
        if (jSONObject.has("description")) {
            this.f6317n = jSONObject.getString("description");
        }
        if (jSONObject.has(f6283L)) {
            this.f6318o = jSONObject.getString(f6283L);
        }
        if (jSONObject.has(f6284M)) {
            this.f6319p = jSONObject.getString(f6284M);
        }
        if (jSONObject.has(f6285N)) {
            this.f6320q = jSONObject.getString(f6285N);
        }
        if (jSONObject.has(f6288Q)) {
            this.f6258f = jSONObject.getString(f6288Q);
        }
        if (jSONObject.has(f6289R)) {
            this.f6321r = jSONObject.getInt(f6289R);
        }
        if (jSONObject.has(f6290S)) {
            this.f6322s = jSONObject.getString(f6290S);
        }
        if (jSONObject.has(f6291T)) {
            this.f6323t = jSONObject.getString(f6291T);
        }
        if (jSONObject.has("name")) {
            this.f6324u = jSONObject.getString("name");
        }
        if (jSONObject.has(f6293V)) {
            this.f6325v = jSONObject.getString(f6293V);
        }
        if (jSONObject.has(f6294W)) {
            this.f6326w = jSONObject.getString(f6294W);
        }
        if (jSONObject.has(f6295X)) {
            this.f6327x = jSONObject.getString(this.f6327x);
        }
        if (jSONObject.has(f6296Y)) {
            this.f6328y = jSONObject.getString(f6296Y);
        }
        if (jSONObject.has("payload")) {
            this.f6329z = jSONObject.getString(this.f6329z);
        }
        this.f6302A = jSONObject.getString(f6298aa);
        if (jSONObject.has(f6286O)) {
            this.f6303B = jSONObject.getString(f6286O);
        }
        if (jSONObject.has(f6287P)) {
            this.f6304C = jSONObject.getString(f6287P);
        }
        if (jSONObject.has(f6299ab)) {
            this.f6305D = jSONObject.getString(f6299ab);
        }
    }

    /* renamed from: a */
    public C1932a mo6995a(Context context) {
        String str = this.f6257e.f6440f;
        String str2 = this.f6255c;
        if (this.f6308ae == null) {
            this.f6308ae = new C1932a(context, str, str2);
        }
        this.f6308ae.f6624d = this.f6316m;
        this.f6308ae.f6626f = this.f6257e.f6439e;
        this.f6308ae.f6627g = new C1890n(this, context);
        this.f6308ae.mo8981f();
        mo6997a(this.f6308ae.mo7114a());
        mo6999b(context);
        return this.f6308ae;
    }

    /* renamed from: b */
    public void mo6999b(Context context) {
        if (!TextUtils.isEmpty(this.f6325v)) {
            m8679a(this.f6325v);
        }
        C1246d.m6010a(context).mo4591a(C1246d.f3909dc, this.f6255c, C1246d.f3908db);
    }

    /* renamed from: c */
    public void mo7001c(Context context) {
        this.f6307ad = System.currentTimeMillis();
        this.f6311h = context;
        if (!TextUtils.isEmpty(this.f6320q)) {
            m8682b(this.f6320q);
            if (!TextUtils.isEmpty(this.f6326w)) {
                m8679a(this.f6326w);
            }
        }
        C1246d.m6010a(context).mo4591a(C1246d.f3910dd, this.f6255c, C1246d.f3908db);
    }

    /* renamed from: a */
    public JSONObject mo6996a() {
        return this.f6312i;
    }

    /* renamed from: b */
    public void mo6998b() {
        if (System.currentTimeMillis() - this.f6307ad < f6300ac) {
            if (!TextUtils.isEmpty(this.f6305D)) {
                m8679a(this.f6305D);
            }
            C1246d.m6010a(C1368X.m6313b()).mo4591a(C1246d.f3911de, this.f6255c, C1246d.f3908db);
        }
    }

    /* renamed from: a */
    public void mo6997a(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        if (this.f6309af != null) {
            imageView.setImageDrawable(this.f6309af);
            return;
        }
        imageView.setImageResource(R.drawable.ads_gift);
        if (this.f6310ag == null) {
            this.f6310ag = new C1889a(this, (C1890n) null);
            this.f6310ag.execute(new Void[0]);
        }
    }

    /* renamed from: c */
    public int mo7000c() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[SYNTHETIC, Splitter:B:30:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d A[SYNTHETIC, Splitter:B:45:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0092  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m8684e() {
        /*
            r9 = this;
            r4 = 0
            r1 = 1
            r2 = 0
            java.lang.String r0 = r9.f6314k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            return r2
        L_0x000c:
            r3 = 0
            java.io.File r5 = new java.io.File
            java.lang.String r0 = r9.mo7023d()
            r5.<init>(r0)
            if (r5 == 0) goto L_0x00b1
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0020
            r2 = r1
            goto L_0x000b
        L_0x0020:
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x00a9, all -> 0x0089 }
            java.lang.String r6 = r9.f6314k     // Catch:{ IOException -> 0x00a9, all -> 0x0089 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x00a9, all -> 0x0089 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x00a9, all -> 0x0089 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x00a9, all -> 0x0089 }
            r6 = 30000(0x7530, float:4.2039E-41)
            r0.setReadTimeout(r6)     // Catch:{ IOException -> 0x00ac, all -> 0x009e }
            r6 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r6)     // Catch:{ IOException -> 0x00ac, all -> 0x009e }
            java.lang.String r6 = "GET"
            r0.setRequestMethod(r6)     // Catch:{ IOException -> 0x00ac, all -> 0x009e }
            r0.connect()     // Catch:{ IOException -> 0x00ac, all -> 0x009e }
            int r6 = r0.getResponseCode()     // Catch:{ IOException -> 0x00ac, all -> 0x009e }
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 == r7) goto L_0x0052
            if (r4 == 0) goto L_0x004c
            r3.close()     // Catch:{ IOException -> 0x0096 }
        L_0x004c:
            if (r0 == 0) goto L_0x000b
            r0.disconnect()
            goto L_0x000b
        L_0x0052:
            java.io.InputStream r6 = r0.getInputStream()     // Catch:{ IOException -> 0x00ac, all -> 0x009e }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ac, all -> 0x009e }
            r3.<init>(r5)     // Catch:{ IOException -> 0x00ac, all -> 0x009e }
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x006a, all -> 0x00a3 }
        L_0x005f:
            int r5 = r6.read(r4)     // Catch:{ IOException -> 0x006a, all -> 0x00a3 }
            if (r5 <= 0) goto L_0x007a
            r7 = 0
            r3.write(r4, r7, r5)     // Catch:{ IOException -> 0x006a, all -> 0x00a3 }
            goto L_0x005f
        L_0x006a:
            r1 = move-exception
            r4 = r0
            r0 = r3
        L_0x006d:
            if (r0 == 0) goto L_0x0072
            r0.close()     // Catch:{ IOException -> 0x009a }
        L_0x0072:
            if (r4 == 0) goto L_0x00b1
            r4.disconnect()
            r0 = r2
        L_0x0078:
            r2 = r0
            goto L_0x000b
        L_0x007a:
            r3.flush()     // Catch:{ IOException -> 0x006a, all -> 0x00a3 }
            if (r3 == 0) goto L_0x0082
            r3.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0082:
            if (r0 == 0) goto L_0x00b3
            r0.disconnect()
            r0 = r1
            goto L_0x0078
        L_0x0089:
            r0 = move-exception
            r1 = r4
        L_0x008b:
            if (r4 == 0) goto L_0x0090
            r4.close()     // Catch:{ IOException -> 0x009c }
        L_0x0090:
            if (r1 == 0) goto L_0x0095
            r1.disconnect()
        L_0x0095:
            throw r0
        L_0x0096:
            r1 = move-exception
            goto L_0x004c
        L_0x0098:
            r2 = move-exception
            goto L_0x0082
        L_0x009a:
            r0 = move-exception
            goto L_0x0072
        L_0x009c:
            r2 = move-exception
            goto L_0x0090
        L_0x009e:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x008b
        L_0x00a3:
            r1 = move-exception
            r4 = r3
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x008b
        L_0x00a9:
            r0 = move-exception
            r0 = r4
            goto L_0x006d
        L_0x00ac:
            r1 = move-exception
            r8 = r4
            r4 = r0
            r0 = r8
            goto L_0x006d
        L_0x00b1:
            r0 = r2
            goto L_0x0078
        L_0x00b3:
            r0 = r1
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.nativeads.C1888m.m8684e():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Drawable m8685f() {
        if (this.f6309af != null) {
            return this.f6309af;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = m8686g();
        options.inJustDecodeBounds = false;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeFile(mo7023d(), options));
        this.f6309af = bitmapDrawable;
        return bitmapDrawable;
    }

    /* renamed from: a */
    private void m8679a(String str) {
        new Thread(new C1891o(this, str)).start();
    }

    /* renamed from: b */
    private void m8682b(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(Engine.EXCEPTION_ERROR);
        this.f6311h.startActivity(intent);
    }

    /* renamed from: g */
    private int m8686g() {
        if (!C1368X.m6324d()) {
            return 1;
        }
        int i = (int) ((1.5f / C1368X.m6313b().getResources().getDisplayMetrics().density) + 0.5f);
        if (i == 0) {
            i = 1;
        }
        if (i == 1 || i % 2 == 0) {
            return i;
        }
        return i + 1;
    }

    /* renamed from: d */
    public String mo7023d() {
        return new File(C1358O.m6234a(C1358O.f4201l), f6301g + this.f6302A + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + this.f6255c).getAbsolutePath();
    }

    /* renamed from: com.cootek.smartinput5.func.nativeads.m$a */
    /* compiled from: NativeAds */
    private class C1889a extends AsyncTask<Void, Void, Drawable> {
        private C1889a() {
        }

        /* synthetic */ C1889a(C1888m mVar, C1890n nVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable doInBackground(Void... voidArr) {
            if (C1888m.this.m8684e()) {
                return C1888m.this.m8685f();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Drawable drawable) {
            if (C1888m.this.f6308ae != null) {
                C1888m.this.f6308ae.mo7114a().setImageDrawable(drawable);
            }
        }
    }
}
