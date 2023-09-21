package p018cn.sharesdk.framework.p020b;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.cootek.smartinput5.p045a.C1063f;
import com.cootek.smartinput5.p046b.C1132b;
import com.p023a.p024a.p032b.p037d.C0781a;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p018cn.sharesdk.framework.ShareSDK;
import p018cn.sharesdk.framework.p019a.C0613d;
import p018cn.sharesdk.framework.p019a.C0616g;
import p018cn.sharesdk.framework.p020b.p021a.C0636c;
import p018cn.sharesdk.framework.p020b.p021a.C0637d;
import p018cn.sharesdk.framework.p020b.p021a.C0638e;
import p018cn.sharesdk.framework.p020b.p022b.C0641b;
import p018cn.sharesdk.framework.p020b.p022b.C0642c;
import p018cn.sharesdk.framework.p020b.p022b.C0645f;
import p018cn.sharesdk.framework.p020b.p022b.C0647g;
import p018cn.sharesdk.framework.utils.C0662a;
import p018cn.sharesdk.framework.utils.C0663b;
import p018cn.sharesdk.framework.utils.C0665d;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.b.a */
public class C0633a {

    /* renamed from: b */
    public static String f1508b = "http://api2.sharesdk.cn:5566";

    /* renamed from: c */
    static String f1509c;

    /* renamed from: d */
    static long f1510d = 0;

    /* renamed from: e */
    private static C0633a f1511e;

    /* renamed from: f */
    private static String f1512f = "http://api2.sharesdk.cn:5566/conf3";

    /* renamed from: g */
    private static String f1513g = "http://s.sharesdk.cn/api/convert3.do";

    /* renamed from: h */
    private static String f1514h = "http://up.sharesdk.cn/upload/image";

    /* renamed from: a */
    Context f1515a;

    /* renamed from: i */
    private boolean f1516i;

    /* renamed from: j */
    private C0616g f1517j = new C0616g();

    private C0633a() {
    }

    /* renamed from: a */
    public static C0633a m3595a(Context context) {
        if (f1511e == null) {
            f1511e = new C0633a();
            f1511e.f1515a = context.getApplicationContext();
        }
        return f1511e;
    }

    /* renamed from: a */
    private String m3596a(String str, Bitmap bitmap) {
        try {
            File createTempFile = File.createTempFile("bm_tmp", ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return m3600b(str, createTempFile.getAbsolutePath());
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return null;
        }
    }

    /* renamed from: a */
    private String m3597a(String str, String str2, String str3, int i, String str4) {
        String str5;
        int i2;
        if (str == null) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        Pattern compile = Pattern.compile(str3);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (group != null && group.length() > 0) {
                arrayList.add(group);
            }
        }
        if (arrayList.size() == 0) {
            return str;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0613d(C1132b.f3175g, str2));
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(new C0613d("urls", ((String) arrayList.get(i3)).toString()));
        }
        arrayList2.add(new C0613d("deviceid", C0663b.m3793a(this.f1515a).mo2486o()));
        arrayList2.add(new C0613d("snsplat", String.valueOf(i)));
        C0666e.m3839c("> deviceid  devicekey: %s", C0663b.m3793a(this.f1515a).mo2486o());
        String d = m3604d(str2, str4);
        if (TextUtils.isEmpty(d)) {
            return str;
        }
        arrayList2.add(new C0613d("m", d));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C0613d("User-Agent", f1509c));
        try {
            str5 = this.f1517j.mo2199a(f1513g, arrayList2, (C0613d<String>) null, arrayList3, (ArrayList<C0613d<?>>) null);
        } catch (Throwable th) {
            C0666e.m3838b(th);
            str5 = null;
        }
        if (str5 == null) {
            return str;
        }
        C0666e.m3839c("> SERVER_SHORT_LINK_URL  resp: %s", str5);
        HashMap<String, Object> a = new C0665d().mo2496a(str5);
        try {
            i2 = ((Integer) a.get("status")).intValue();
        } catch (Throwable th2) {
            C0666e.m3838b(th2);
            i2 = -1;
        }
        if (i2 != 200) {
            return str;
        }
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) a.get("data")).iterator();
        while (it.hasNext()) {
            HashMap hashMap2 = (HashMap) it.next();
            hashMap.put(String.valueOf(hashMap2.get("source")), String.valueOf(hashMap2.get("surl")));
        }
        Matcher matcher2 = compile.matcher(str);
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (matcher2.find()) {
            sb.append(str.substring(i4, matcher2.start()));
            sb.append((String) hashMap.get(matcher2.group()));
            i4 = matcher2.end();
        }
        sb.append(str.substring(i4, str.length()));
        String sb2 = sb.toString();
        C0666e.m3839c("> SERVER_SHORT_LINK_URL content after replace link ===  %s", sb2);
        return sb2;
    }

    /* renamed from: a */
    private void m3598a(C0637d dVar) {
        if (dVar.f1525b.size() == 1 ? m3602c(dVar.f1524a, "0") : m3602c(mo2281b(dVar.f1524a), "1")) {
            C0638e.m3636a(this.f1515a, dVar.f1525b);
        }
    }

    /* renamed from: b */
    private String m3599b() {
        return f1508b + "/date";
    }

    /* renamed from: b */
    private String m3600b(String str, String str2) {
        C0666e.m3837b(" upload file , server url = %s, file path = %s", str, str2);
        try {
            C0613d dVar = new C0613d("file", str2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C0613d("User-Agent", f1509c));
            String a = this.f1517j.mo2199a(str, (ArrayList<C0613d<String>>) null, dVar, arrayList, (ArrayList<C0613d<?>>) null);
            C0666e.m3837b("upload file response == %s", a);
            if (a == null || a.length() <= 0) {
                return null;
            }
            HashMap<String, Object> a2 = new C0665d().mo2496a(a);
            if ((a2.containsKey("status") ? Integer.parseInt(a2.get("status").toString()) : -1) != 200) {
                return null;
            }
            return a2.containsKey("url") ? a2.get("url").toString() : null;
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return null;
        }
    }

    /* renamed from: c */
    private String m3601c() {
        return f1508b + "/log4";
    }

    /* renamed from: c */
    private boolean m3602c(String str, String str2) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C0613d("m", str));
            arrayList.add(new C0613d("t", str2));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C0613d("User-Agent", f1509c));
            String a = this.f1517j.mo2199a(m3601c(), arrayList, (C0613d<String>) null, arrayList2, (ArrayList<C0613d<?>>) null);
            C0666e.m3837b("> %s  resp: %s", m3601c(), a);
            if (a == null) {
                z = false;
            } else if (a.length() <= 0) {
                return true;
            } else {
                z = true;
            }
            return z;
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return false;
        }
    }

    /* renamed from: d */
    private String m3603d() {
        return f1508b + "/data";
    }

    /* renamed from: d */
    private String m3604d(String str, String str2) {
        C0663b a = C0663b.m3793a(this.f1515a);
        C0636c a2 = C0636c.m3622a(this.f1515a);
        boolean b = a2.mo2297b();
        boolean c = a2.mo2299c();
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(C0662a.m3790c(a.mo2487p(), "utf-8")).append("|");
            sb.append(C0662a.m3790c(a.mo2490s(), "utf-8")).append("|");
            sb.append(C0662a.m3790c(String.valueOf(ShareSDK.getSDKVersionCode() + C0781a.f1974b), "utf-8")).append("|");
            sb.append(C0662a.m3790c(String.valueOf(a.mo2484m()), "utf-8")).append("|");
            sb.append(C0662a.m3790c(a.mo2483l(), "utf-8")).append("|");
            if (b) {
                sb.append(C0662a.m3790c(a.mo2478g(), "utf-8")).append("|");
                sb.append(C0662a.m3790c(a.mo2480i(), "utf-8")).append("|");
                sb.append(C0662a.m3790c(a.mo2474c(), "utf-8")).append("|");
                sb.append(C0662a.m3790c(a.mo2473b(), "utf-8")).append("|");
                sb.append(C0662a.m3790c(a.mo2481j(), "utf-8")).append("|");
            } else {
                sb.append("|||||");
            }
            if (c) {
                sb.append(str2);
            } else {
                sb.append(str2.split("\\|")[0]);
                sb.append("|||||");
            }
            String sb2 = sb.toString();
            C0666e.m3839c("shorLinkMsg ===>>>>", sb2);
            C0666e.m3839c("Base64AES key ===>>>>", a.mo2486o() + ":" + str);
            return mo2278a(sb2, C0662a.m3791c(String.format("%s:%s", new Object[]{a.mo2486o(), str})));
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return "";
        }
    }

    /* renamed from: e */
    private String m3605e() {
        return f1508b + "/snsconf";
    }

    /* renamed from: f */
    private String m3606f() {
        JSONObject jSONObject = new JSONObject();
        C0663b a = C0663b.m3793a(this.f1515a);
        try {
            jSONObject.put("type", "DEVICE");
            jSONObject.put(C1132b.f3175g, a.mo2486o());
            jSONObject.put("mac", a.mo2469a());
            jSONObject.put("udid", a.mo2475d());
            jSONObject.put("model", a.mo2473b());
            jSONObject.put("factory", a.mo2474c());
            jSONObject.put("plat", a.mo2484m());
            jSONObject.put("sysver", a.mo2478g());
            jSONObject.put("breaked", false);
            jSONObject.put("screensize", a.mo2480i());
            jSONObject.put("carrier", a.mo2481j());
        } catch (JSONException e) {
            C0666e.m3838b(e);
        }
        return jSONObject.toString();
    }

    /* renamed from: g */
    private String m3607g() {
        JSONObject jSONObject = new JSONObject();
        C0663b a = C0663b.m3793a(this.f1515a);
        try {
            jSONObject.put("type", "PROCESS");
            jSONObject.put("plat", a.mo2484m());
            jSONObject.put("device", a.mo2486o());
            jSONObject.put("list", a.mo2485n());
        } catch (JSONException e) {
            C0666e.m3838b(e);
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public long mo2274a() {
        String str = "{}";
        try {
            str = this.f1517j.mo2200a(m3599b(), (ArrayList<C0613d<String>>) null, (ArrayList<C0613d<String>>) null, (ArrayList<C0613d<?>>) null);
        } catch (Throwable th) {
            C0666e.m3838b(th);
        }
        C0636c a = C0636c.m3622a(this.f1515a);
        HashMap<String, Object> a2 = new C0665d().mo2496a(str);
        if (!a2.containsKey(C1063f.f3049a)) {
            return a.mo2291a();
        }
        long currentTimeMillis = System.currentTimeMillis() - Long.parseLong(a2.get(C1063f.f3049a).toString());
        a.mo2294a("service_time", Long.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }

    /* renamed from: a */
    public long mo2275a(String str) {
        String str2;
        long j;
        C0636c a = C0636c.m3622a(this.f1515a);
        C0663b a2 = C0663b.m3793a(this.f1515a);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C0613d("appkey", str));
            arrayList.add(new C0613d("device", a2.mo2486o()));
            arrayList.add(new C0613d("plat", String.valueOf(a2.mo2484m())));
            arrayList.add(new C0613d("apppkg", a2.mo2487p()));
            arrayList.add(new C0613d("appver", String.valueOf(a2.mo2489r())));
            arrayList.add(new C0613d("sdkver", String.valueOf(ShareSDK.getSDKVersionCode() + C0781a.f1974b)));
            arrayList.add(new C0613d("networktype", a2.mo2483l()));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C0613d("User-Agent", f1509c));
            str2 = this.f1517j.mo2199a(f1512f, arrayList, (C0613d<String>) null, arrayList2, (ArrayList<C0613d<?>>) null);
            if (str2 == null || str2.length() <= 0) {
                str2 = "{}";
            }
            C0666e.m3837b(" get server config response == %s", str2);
        } catch (Throwable th) {
            C0666e.m3838b(th);
            str2 = "{}";
        }
        HashMap<String, Object> a3 = new C0665d().mo2496a(str2);
        if (!a3.containsKey("status") || Integer.parseInt(String.valueOf(a3.get("status"))) != -200) {
            if (a3.containsKey(C1063f.f3049a)) {
                long currentTimeMillis = System.currentTimeMillis() - Long.parseLong(a3.get(C1063f.f3049a).toString());
                a.mo2294a("service_time", Long.valueOf(currentTimeMillis));
                j = currentTimeMillis;
            } else {
                j = 0;
            }
            if (a3.containsKey("switchs")) {
                new HashMap();
                HashMap hashMap = (HashMap) a3.get("switchs");
                String obj = hashMap.get("device").toString();
                String obj2 = hashMap.get("share").toString();
                String obj3 = hashMap.get("auth").toString();
                a.mo2298c(obj);
                a.mo2302e(obj2);
                a.mo2301d(obj3);
            }
            if (a3.containsKey("requesthost") && a3.containsKey("requestport")) {
                String valueOf = String.valueOf(a3.get("requesthost"));
                String valueOf2 = String.valueOf(a3.get("requestport"));
                if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(valueOf2)) {
                    f1508b = "http://" + valueOf + ":" + valueOf2;
                }
            }
            HashMap hashMap2 = (HashMap) a3.get("unfinish");
            if (hashMap2 == null || hashMap2.size() <= 0) {
                return j;
            }
            if ("true".equals(String.valueOf(hashMap2.get("device")))) {
                try {
                    String f = m3606f();
                    C0666e.m3834a(" upload device info == %s", f);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new C0613d("m", C0662a.m3789b(f, "sdk.sharesdk.sdk")));
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new C0613d("User-Agent", f1509c));
                    C0666e.m3837b("> DEVICE_UNFINISHED  resp: %s", this.f1517j.mo2199a(m3603d(), arrayList3, (C0613d<String>) null, arrayList4, (ArrayList<C0613d<?>>) null));
                } catch (Throwable th2) {
                    C0666e.m3838b(th2);
                }
            }
            if ("true".equals(String.valueOf(hashMap2.get(SearchActivity.SUGGEST_APPS)))) {
                try {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("type", "APPS");
                    hashMap3.put("plat", Integer.valueOf(a2.mo2484m()));
                    hashMap3.put("device", a2.mo2486o());
                    hashMap3.put("list", a2.mo2471a(false));
                    String a4 = new C0665d().mo2495a((HashMap<String, Object>) hashMap3);
                    C0666e.m3834a(" upload apps info == %s", a4);
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(new C0613d("m", C0662a.m3789b(a4, "sdk.sharesdk.sdk")));
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(new C0613d("User-Agent", f1509c));
                    C0666e.m3837b("> APPS_UNFINISHED  resp: %s", this.f1517j.mo2199a(m3603d(), arrayList5, (C0613d<String>) null, arrayList6, (ArrayList<C0613d<?>>) null));
                } catch (Throwable th3) {
                    C0666e.m3838b(th3);
                }
            }
            if (!"true".equals(String.valueOf(hashMap2.get("process")))) {
                return j;
            }
            try {
                String g = m3607g();
                C0666e.m3834a(" upload device info == %s", g);
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(new C0613d("m", C0662a.m3789b(g, "sdk.sharesdk.sdk")));
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(new C0613d("User-Agent", f1509c));
                C0666e.m3837b("> PROCESS_UNFINISHED  resp: %s", this.f1517j.mo2199a(m3603d(), arrayList7, (C0613d<String>) null, arrayList8, (ArrayList<C0613d<?>>) null));
                return j;
            } catch (Throwable th4) {
                C0666e.m3838b(th4);
                return j;
            }
        } else {
            System.err.print(String.valueOf(a3.get("error")));
            return 0;
        }
    }

    /* renamed from: a */
    public String mo2276a(String str, String str2) {
        return new String(C0662a.m3787a(C0662a.m3791c(str + ":" + C0663b.m3793a(this.f1515a).mo2486o()), Base64.decode(str2, 0)), Utils.UTF8);
    }

    /* renamed from: a */
    public String mo2277a(String str, String str2, int i, boolean z, String str3) {
        String a;
        C0666e.m3839c("> SERVER_SHORT_LINK_URL content before replace link ===  %s", str);
        if (z && (a = m3597a(str, str2, "<a[^>]*?href[\\s]*=[\\s]*[\"']?([^'\">]+?)['\"]?>", i, str3)) != null && !a.equals(str)) {
            return a;
        }
        String a2 = m3597a(str, str2, "(http://|https://){1}[\\w\\.\\-/:\\?&%=,;\\[\\]\\{\\}`~!@#\\$\\^\\*\\(\\)_\\+\\\\\\|]+", i, str3);
        return (a2 == null || a2.equals(str)) ? str : a2;
    }

    /* renamed from: a */
    public String mo2278a(String str, byte[] bArr) {
        Throwable th;
        String str2;
        try {
            str2 = Base64.encodeToString(C0662a.m3786a(bArr, str), 0);
            try {
                return str2.contains(C0911j.f2473c) ? str2.replace(C0911j.f2473c, "") : str2;
            } catch (Throwable th2) {
                th = th2;
                C0666e.m3838b(th);
                return str2;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            str2 = null;
            th = th4;
            C0666e.m3838b(th);
            return str2;
        }
    }

    /* renamed from: a */
    public void mo2279a(C0642c cVar) {
        C0663b a = C0663b.m3793a(this.f1515a);
        String l = a.mo2483l();
        C0666e.m3837b(" event string == %s", cVar.toString());
        C0636c a2 = C0636c.m3622a(this.f1515a);
        if ((cVar instanceof C0647g) && !l.endsWith("none")) {
            f1509c = (a.mo2487p() + "/" + a.mo2490s()) + " " + ("ShareSDK/" + ShareSDK.getSDKVersionName()) + " " + ("Android/" + a.mo2478g());
            mo2275a(cVar.mo2320g());
        } else if (cVar instanceof C0641b) {
            boolean c = a2.mo2299c();
            String str = ((C0641b) cVar).f1545c;
            if (!c || TextUtils.isEmpty(str)) {
                ((C0641b) cVar).f1546d = null;
                ((C0641b) cVar).f1545c = null;
            } else {
                ((C0641b) cVar).f1545c = C0662a.m3789b(str, cVar.f1548f.substring(0, 16));
            }
        } else if (cVar instanceof C0645f) {
            C0645f fVar = (C0645f) cVar;
            int d = a2.mo2300d();
            boolean c2 = a2.mo2299c();
            C0645f.C0646a aVar = fVar.f1570n;
            if (d == 1 || (d == 0 && this.f1516i)) {
                for (int i = 0; i < aVar.f1576e.size(); i++) {
                    String b = m3600b(f1514h, aVar.f1576e.get(i));
                    if (b != null) {
                        aVar.f1575d.add(b);
                    }
                }
                for (int i2 = 0; i2 < aVar.f1577f.size(); i2++) {
                    String a3 = m3596a(f1514h, aVar.f1577f.get(i2));
                    if (a3 != null) {
                        aVar.f1575d.add(a3);
                    }
                }
            } else {
                fVar.f1570n = null;
            }
            if (!c2) {
                fVar.f1571o = null;
            }
        }
        if (!a2.mo2297b()) {
            cVar.f1555m = null;
        }
        long a4 = a2.mo2291a();
        if (a4 == 0) {
            a4 = mo2274a();
        }
        cVar.f1547e = System.currentTimeMillis() - a4;
        C0638e.m3635a(this.f1515a, cVar.toString(), cVar.f1547e);
        if (!l.equals("none")) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f1510d >= 10000) {
                f1510d = currentTimeMillis;
                ArrayList<C0637d> b2 = l.toLowerCase().equals(C1899v.f6395s) ? C0638e.m3639b(this.f1515a) : C0638e.m3637a(this.f1515a);
                for (int i3 = 0; i3 < b2.size(); i3++) {
                    m3598a(b2.get(i3));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2280a(boolean z) {
        this.f1516i = z;
    }

    /* renamed from: b */
    public String mo2281b(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str2 = null;
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = byteArrayInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                gZIPOutputStream.write(bArr, 0, read);
            }
            gZIPOutputStream.finish();
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            byteArrayInputStream.close();
            str2 = Base64.encodeToString(byteArray, 0);
        } catch (IOException e) {
            C0666e.m3838b(e);
        }
        return str2.contains(C0911j.f2473c) ? str2.replace(C0911j.f2473c, "") : str2;
    }

    /* renamed from: c */
    public String mo2282c(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("appkey", str));
        arrayList.add(new C0613d("device", C0663b.m3793a(this.f1515a).mo2486o()));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0613d("User-Agent", f1509c));
        return this.f1517j.mo2199a(m3605e(), arrayList, (C0613d<String>) null, arrayList2, (ArrayList<C0613d<?>>) null);
    }
}
