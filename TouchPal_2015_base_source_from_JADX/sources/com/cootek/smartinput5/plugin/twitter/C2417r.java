package com.cootek.smartinput5.plugin.twitter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.weibo.net.C4054q;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.plugin.twitter.r */
/* compiled from: Twitter */
public class C2417r {

    /* renamed from: a */
    public static String f10572a = "Rj1ZzK5O10RgmdEcYgpSQ";

    /* renamed from: b */
    public static String f10573b = "stYKCzRptoCl9yYgkSJwwO3nbP7CPi03dI0NCQU";

    /* renamed from: c */
    public static final String f10574c = "https://api.twitter.com";

    /* renamed from: d */
    public static final String f10575d = "https://api.twitter.com/oauth/request_token";

    /* renamed from: e */
    public static final String f10576e = "https://api.twitter.com/oauth/authorize";

    /* renamed from: f */
    public static final String f10577f = "https://api.twitter.com/oauth/access_token";

    /* renamed from: g */
    public static final String f10578g = "https://api.twitter.com/oauth/authenticate";

    /* renamed from: h */
    public static final String f10579h = "twitterandroidsdk://FollowActivity";

    /* renamed from: i */
    public static final String f10580i = "144898415";

    /* renamed from: j */
    public static final String f10581j = "requestToken";

    /* renamed from: k */
    public static final String f10582k = "requestSecret";

    /* renamed from: l */
    public static final String f10583l = "accessToken";

    /* renamed from: m */
    public static final String f10584m = "accessSecret";

    /* renamed from: n */
    public static final String f10585n = "userId";

    /* renamed from: o */
    public static final String f10586o = "screenName";

    /* renamed from: p */
    private static final String f10587p = "Twitter";

    /* renamed from: z */
    private static C2417r f10588z = null;

    /* renamed from: q */
    private long f10589q = 1;

    /* renamed from: r */
    private C2416q f10590r = null;

    /* renamed from: s */
    private String f10591s;

    /* renamed from: t */
    private String f10592t;

    /* renamed from: u */
    private C2416q f10593u = null;

    /* renamed from: v */
    private C2416q f10594v = null;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public HttpUriRequest f10595w;

    /* renamed from: x */
    private boolean f10596x = false;

    /* renamed from: y */
    private boolean f10597y;

    /* renamed from: a */
    public static C2417r m11027a() {
        if (f10588z == null) {
            f10588z = new C2417r();
        }
        return f10588z;
    }

    private C2417r() {
    }

    /* renamed from: a */
    public void mo8162a(C2416q qVar) {
        this.f10593u = qVar;
    }

    /* renamed from: b */
    public C2416q mo8165b() {
        return this.f10593u;
    }

    /* renamed from: c */
    public C2416q mo8170c() {
        return this.f10594v;
    }

    /* renamed from: d */
    public C2416q mo8173d() {
        return this.f10590r;
    }

    /* renamed from: b */
    public void mo8168b(C2416q qVar) {
        this.f10590r = qVar;
    }

    /* renamed from: e */
    public String mo8174e() {
        return this.f10591s;
    }

    /* renamed from: a */
    public void mo8163a(String str) {
        this.f10591s = str;
    }

    /* renamed from: f */
    public String mo8175f() {
        return this.f10592t;
    }

    /* renamed from: b */
    public void mo8169b(String str) {
        this.f10592t = str;
    }

    /* renamed from: c */
    public void mo8171c(String str) {
        this.f10593u.mo8154b(str);
    }

    /* renamed from: g */
    public boolean mo8176g() {
        return TextUtils.isEmpty(this.f10591s) || TextUtils.isEmpty(this.f10592t);
    }

    /* renamed from: d */
    public int mo8172d(String str) throws C2421v {
        C2422w wVar = new C2422w();
        wVar.mo8136a("status", str);
        HttpResponse a = mo8159a("https://api.twitter.com/1.1/statuses/update.json", C4054q.f16509e, wVar, this.f10590r);
        if (a != null) {
            return a.getStatusLine().getStatusCode();
        }
        throw new C2421v();
    }

    /* renamed from: a */
    public HttpResponse mo8159a(String str, String str2, C2422w wVar, C2416q qVar) throws C2421v {
        return mo8160a(str, str2, wVar, qVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        r6.f10596x = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079 A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:6:0x002c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.HttpResponse mo8160a(java.lang.String r7, java.lang.String r8, com.cootek.smartinput5.plugin.twitter.C2422w r9, com.cootek.smartinput5.plugin.twitter.C2416q r10, boolean r11) throws com.cootek.smartinput5.plugin.twitter.C2421v {
        /*
            r6 = this;
            r1 = 0
            r5 = 0
            com.cootek.smartinput5.plugin.twitter.w r0 = r6.mo8166b(r7, r8, r9, r10)
            java.lang.String r2 = com.cootek.smartinput5.plugin.twitter.C2409j.m11014b((com.cootek.smartinput5.plugin.twitter.C2408i) r0)
            org.apache.http.impl.client.DefaultHttpClient r3 = com.cootek.smartinput5.plugin.twitter.C2409j.m11011a()
            java.lang.String r0 = "POST"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x005e
            org.apache.http.client.methods.HttpPost r0 = new org.apache.http.client.methods.HttpPost
            r0.<init>(r7)
            if (r11 == 0) goto L_0x0020
            r6.m11031a((org.apache.http.client.methods.HttpPost) r0, (com.cootek.smartinput5.plugin.twitter.C2422w) r9)
        L_0x0020:
            java.lang.String r4 = "Authorization"
            r0.setHeader(r4, r2)
            java.lang.String r2 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            r0.setHeader(r2, r4)
            r6.f10595w = r0     // Catch:{ NullPointerException -> 0x0081, ClientProtocolException -> 0x006f, IOException -> 0x0074, all -> 0x0079 }
            boolean r2 = r6.f10596x     // Catch:{ NullPointerException -> 0x0081, ClientProtocolException -> 0x006f, IOException -> 0x0074, all -> 0x0079 }
            if (r2 != 0) goto L_0x0084
            org.apache.http.HttpResponse r0 = r3.execute(r0)     // Catch:{ NullPointerException -> 0x0081, ClientProtocolException -> 0x006f, IOException -> 0x0074, all -> 0x0079 }
        L_0x0036:
            if (r0 == 0) goto L_0x0068
            org.apache.http.StatusLine r1 = r0.getStatusLine()     // Catch:{ NullPointerException -> 0x005a, ClientProtocolException -> 0x007f, IOException -> 0x007d, all -> 0x0079 }
            int r1 = r1.getStatusCode()     // Catch:{ NullPointerException -> 0x005a, ClientProtocolException -> 0x007f, IOException -> 0x007d, all -> 0x0079 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x006c
            com.cootek.smartinput5.plugin.twitter.v r2 = new com.cootek.smartinput5.plugin.twitter.v     // Catch:{ NullPointerException -> 0x005a, ClientProtocolException -> 0x007f, IOException -> 0x007d, all -> 0x0079 }
            r2.<init>()     // Catch:{ NullPointerException -> 0x005a, ClientProtocolException -> 0x007f, IOException -> 0x007d, all -> 0x0079 }
            r2.mo8188a((int) r1)     // Catch:{ NullPointerException -> 0x005a, ClientProtocolException -> 0x007f, IOException -> 0x007d, all -> 0x0079 }
            org.apache.http.HttpEntity r1 = r0.getEntity()     // Catch:{ NullPointerException -> 0x005a, ClientProtocolException -> 0x007f, IOException -> 0x007d, all -> 0x0079 }
            java.lang.String r3 = "UTF-8"
            java.lang.String r1 = org.apache.http.util.EntityUtils.toString(r1, r3)     // Catch:{ NullPointerException -> 0x005a, ClientProtocolException -> 0x007f, IOException -> 0x007d, all -> 0x0079 }
            r2.mo8189a((java.lang.String) r1)     // Catch:{ NullPointerException -> 0x005a, ClientProtocolException -> 0x007f, IOException -> 0x007d, all -> 0x0079 }
            throw r2     // Catch:{ NullPointerException -> 0x005a, ClientProtocolException -> 0x007f, IOException -> 0x007d, all -> 0x0079 }
        L_0x005a:
            r1 = move-exception
        L_0x005b:
            r6.f10596x = r5
        L_0x005d:
            return r0
        L_0x005e:
            java.lang.String r4 = r6.m11028a((com.cootek.smartinput5.plugin.twitter.C2422w) r9, (java.lang.String) r7)
            org.apache.http.client.methods.HttpGet r0 = new org.apache.http.client.methods.HttpGet
            r0.<init>(r4)
            goto L_0x0020
        L_0x0068:
            r6.f10596x = r5
            r0 = r1
            goto L_0x005d
        L_0x006c:
            r6.f10596x = r5
            goto L_0x005d
        L_0x006f:
            r0 = move-exception
            r0 = r1
        L_0x0071:
            r6.f10596x = r5
            goto L_0x005d
        L_0x0074:
            r0 = move-exception
            r0 = r1
        L_0x0076:
            r6.f10596x = r5
            goto L_0x005d
        L_0x0079:
            r0 = move-exception
            r6.f10596x = r5
            throw r0
        L_0x007d:
            r1 = move-exception
            goto L_0x0076
        L_0x007f:
            r1 = move-exception
            goto L_0x0071
        L_0x0081:
            r0 = move-exception
            r0 = r1
            goto L_0x005b
        L_0x0084:
            r0 = r1
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.plugin.twitter.C2417r.mo8160a(java.lang.String, java.lang.String, com.cootek.smartinput5.plugin.twitter.w, com.cootek.smartinput5.plugin.twitter.q, boolean):org.apache.http.HttpResponse");
    }

    /* renamed from: h */
    public int mo8177h() throws C2421v {
        C2422w wVar = new C2422w();
        wVar.mo8136a("user_id", this.f10591s);
        try {
            JSONObject jSONObject = new JSONObject(EntityUtils.toString(mo8159a("https://api.twitter.com/1.1/users/show.json", C4054q.f16510f, wVar, this.f10590r).getEntity(), Utils.UTF8));
            if (jSONObject.has("statuses_count")) {
                return jSONObject.getInt("statuses_count");
            }
            return 0;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return 0;
        } catch (IOException e3) {
            e3.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public String[] mo8164a(int i) throws C2421v {
        JSONException e;
        String[] strArr;
        IOException e2;
        ParseException e3;
        try {
            this.f10597y = mo8181l();
        } catch (C2421v e4) {
        }
        C2422w wVar = new C2422w();
        wVar.mo8136a(C1899v.f6362a, String.valueOf(i));
        wVar.mo8136a("include_rts", "true");
        this.f10589q = Long.valueOf(Settings.getInstance().getStringSetting(Settings.TWITTER_IMPORT_SINCE_ID)).longValue() + 1;
        wVar.mo8136a("since_id", String.valueOf(this.f10589q));
        HttpResponse a = mo8159a("https://api.twitter.com/1.1/statuses/user_timeline.json", C4054q.f16510f, wVar, this.f10590r);
        if (a != null) {
            try {
                JSONArray jSONArray = new JSONArray(EntityUtils.toString(a.getEntity(), Utils.UTF8));
                strArr = new String[jSONArray.length()];
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        strArr[i2] = jSONObject.getString("text");
                        long j = jSONObject.getLong("id_str");
                        if (j > this.f10589q) {
                            this.f10589q = j;
                        }
                        i2++;
                    } catch (ParseException e5) {
                        e3 = e5;
                        e3.printStackTrace();
                        return strArr;
                    } catch (IOException e6) {
                        e2 = e6;
                        e2.printStackTrace();
                        return strArr;
                    } catch (JSONException e7) {
                        e = e7;
                        e.printStackTrace();
                        return strArr;
                    }
                }
                Settings.getInstance().setStringSetting(Settings.TWITTER_IMPORT_SINCE_ID, String.valueOf(this.f10589q), false);
            } catch (ParseException e8) {
                ParseException parseException = e8;
                strArr = null;
                e3 = parseException;
                e3.printStackTrace();
                return strArr;
            } catch (IOException e9) {
                IOException iOException = e9;
                strArr = null;
                e2 = iOException;
                e2.printStackTrace();
                return strArr;
            } catch (JSONException e10) {
                JSONException jSONException = e10;
                strArr = null;
                e = jSONException;
                e.printStackTrace();
                return strArr;
            }
            return strArr;
        }
        C2421v vVar = new C2421v();
        vVar.mo8188a(-1);
        throw vVar;
    }

    /* renamed from: a */
    private String m11028a(C2422w wVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String d = C2409j.m11018d(new C2422w(C2409j.m11007a((C2408i) wVar)));
        if (!TextUtils.isEmpty(d)) {
            sb.append(C2261Q.f9807m);
            sb.append(d);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m11031a(HttpPost httpPost, C2422w wVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(51200);
        try {
            byteArrayOutputStream.write(C2409j.m11018d(new C2422w(C2409j.m11007a((C2408i) wVar))).getBytes(Utils.UTF8));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            httpPost.setEntity(new ByteArrayEntity(byteArray));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: i */
    public C2416q mo8178i() throws C2421v {
        C2422w wVar = new C2422w();
        wVar.mo8136a(C2409j.f10557o, this.f10593u.mo8153b());
        HttpResponse a = mo8159a(f10577f, C4054q.f16509e, wVar, this.f10593u);
        if (a != null && a.getStatusLine().getStatusCode() == 200) {
            return m11032b(a);
        }
        throw new C2421v();
    }

    /* renamed from: b */
    private C2416q m11032b(HttpResponse httpResponse) {
        String str = null;
        try {
            str = EntityUtils.toString(httpResponse.getEntity(), Utils.UTF8);
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return m11033e(str);
    }

    /* renamed from: e */
    private C2416q m11033e(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(C2261Q.f9808n);
        String a = C2409j.m11010a(C2409j.f10554l, split);
        String a2 = C2409j.m11010a(C2409j.f10553k, split);
        String a3 = C2409j.m11010a("user_id", split);
        String a4 = C2409j.m11010a("screen_name", split);
        this.f10591s = a3;
        this.f10592t = a4;
        return new C2416q(a, a2);
    }

    /* renamed from: j */
    public C2416q mo8179j() throws C2421v {
        C2422w wVar = new C2422w();
        wVar.mo8136a(C2409j.f10545c, f10579h);
        HttpResponse a = mo8160a(f10575d, C4054q.f16509e, wVar, (C2416q) null, false);
        if (a != null && a.getStatusLine().getStatusCode() == 200) {
            return mo8158a(a);
        }
        C2421v vVar = new C2421v();
        if (a != null) {
            try {
                String entityUtils = EntityUtils.toString(a.getEntity(), Utils.UTF8);
                vVar.mo8188a(a.getStatusLine().getStatusCode());
                vVar.mo8189a(entityUtils);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } else {
            vVar.mo8188a(-1);
        }
        throw vVar;
    }

    /* renamed from: b */
    public C2422w mo8166b(String str, String str2, C2422w wVar, C2416q qVar) {
        C2422w wVar2 = new C2422w();
        wVar2.mo8134a((C2408i) wVar);
        wVar2.mo8136a(C2409j.f10546d, f10572a);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        wVar2.mo8136a(C2409j.f10550h, String.valueOf(currentTimeMillis));
        wVar2.mo8136a(C2409j.f10547e, String.valueOf(currentTimeMillis + ((long) new Random().nextInt())));
        wVar2.mo8136a(C2409j.f10549g, "HMAC-SHA1");
        wVar2.mo8136a(C2409j.f10551i, "1.0");
        String str3 = null;
        if (qVar != null) {
            wVar2.mo8136a(C2409j.f10554l, qVar.mo8150a());
            str3 = qVar.mo8155c();
        }
        wVar2.mo8136a(C2409j.f10548f, C2409j.m11015b(C2409j.m11009a(C2409j.m11018d(C2409j.m11017c(C2409j.m11007a((C2408i) wVar2))), str2, str), f10573b, str3));
        return wVar2;
    }

    /* renamed from: a */
    public C2416q mo8158a(HttpResponse httpResponse) {
        InputStream inputStream;
        try {
            InputStream content = httpResponse.getEntity().getContent();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Header firstHeader = httpResponse.getFirstHeader(C2261Q.f9795ap);
            if (firstHeader == null || firstHeader.getValue().toLowerCase().indexOf("gzip") <= -1) {
                inputStream = content;
            } else {
                inputStream = new GZIPInputStream(content);
            }
            byte[] bArr = new byte[512];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return new C2416q(new String(byteArrayOutputStream.toByteArray()));
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public void mo8161a(Context context) throws C2421v {
        C2416q j = mo8179j();
        if (j != null) {
            mo8162a(j);
        }
    }

    /* renamed from: b */
    public void mo8167b(Context context) {
        if (mo8165b() != null) {
            Intent intent = new Intent();
            intent.setClass(context, TwitterDialog.class);
            intent.putExtra("requestToken", this.f10593u.mo8150a());
            intent.putExtra(f10582k, this.f10593u.mo8155c());
            intent.putExtra("url", "https://api.twitter.com/oauth/authorize?oauth_token=" + mo8165b().mo8150a());
            intent.putExtra(TwitterDialog.f10521a, !Settings.getInstance().getBoolSetting(Settings.INVITE_SUCCEED));
            intent.addFlags(Engine.EXCEPTION_ERROR);
            context.startActivity(intent);
        }
    }

    /* renamed from: k */
    public boolean mo8180k() {
        return this.f10597y;
    }

    /* renamed from: l */
    public boolean mo8181l() throws C2421v {
        boolean z;
        C2422w wVar = new C2422w();
        wVar.mo8136a("user_id", f10580i);
        HttpResponse a = mo8159a("https://api.twitter.com/1.1/friendships/lookup.json", C4054q.f16510f, wVar, this.f10590r);
        if (a == null) {
            return false;
        }
        try {
            Object obj = new JSONArray(EntityUtils.toString(a.getEntity(), Utils.UTF8)).getJSONObject(0).get("connections");
            if (obj != null) {
                JSONArray jSONArray = (JSONArray) obj;
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        break;
                    } else if ("following".equals((String) jSONArray.get(i))) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            z = false;
            return z;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    /* renamed from: m */
    public void mo8182m() {
        C2422w wVar = new C2422w();
        wVar.mo8136a("user_id", f10580i);
        wVar.mo8136a("follow", "true");
        try {
            HttpResponse a = mo8159a("https://api.twitter.com/1.1/friendships/create.json", C4054q.f16509e, wVar, this.f10590r);
            if (a != null) {
                EntityUtils.toString(a.getEntity(), Utils.UTF8);
            }
        } catch (C2421v e) {
            e.printStackTrace();
        } catch (ParseException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: n */
    public void mo8183n() {
        this.f10596x = true;
        if (this.f10595w != null) {
            new C2418s(this).start();
        }
        this.f10596x = false;
    }
}
