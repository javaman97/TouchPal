package com.cootek.smartinput5.p048d;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2214ac;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.p045a.C1063f;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.d.a */
/* compiled from: NetworkDataCollect */
public class C1242a {

    /* renamed from: a */
    private static final String f3690a = "NetworkDataCollect";

    /* renamed from: b */
    private static C1242a f3691b = new C1242a();

    /* renamed from: c */
    private static String[] f3692c = {"http://ime.cdn.service.cootek.com/international/temp/test1.zip", "http://ime.cdn.service.cootek.com/international/temp/test2.zip", "http://cdngc.ime.cdn.host.cootekservice.com/international/temp/test1.zip", "http://cdngc.ime.cdn.host.cootekservice.com/international/temp/test2.zip"};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LinkedList<C2214ac> f3693d = new LinkedList<>();

    /* renamed from: e */
    private Map<String, Object> f3694e = new HashMap();

    /* renamed from: f */
    private ArrayList<C1243a> f3695f = new ArrayList<>();

    /* renamed from: g */
    private Handler f3696g = new C1244b(this);

    /* renamed from: com.cootek.smartinput5.d.a$a */
    /* compiled from: NetworkDataCollect */
    private class C1243a {

        /* renamed from: a */
        public String f3697a;

        /* renamed from: b */
        public long f3698b;

        /* renamed from: c */
        public long f3699c;

        /* renamed from: d */
        public String f3700d;

        /* renamed from: e */
        public int f3701e;

        public C1243a(String str, long j, long j2, String str2, int i) {
            this.f3697a = str;
            this.f3698b = j;
            this.f3699c = j2;
            this.f3700d = str2;
            this.f3701e = i;
        }

        /* renamed from: a */
        public JSONObject mo4575a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.f3697a);
                jSONObject.put(C1063f.f3049a, this.f3698b);
                jSONObject.put("downloadTime", this.f3699c);
                jSONObject.put("downloadStatus", this.f3700d);
                jSONObject.put("contentLength", this.f3701e);
            } catch (JSONException e) {
            }
            return jSONObject;
        }

        public String toString() {
            return String.format("url = %s, timestamp = %d, downloadTime = %d ms, downloadStatus = %s, contentLength = %d bytes", new Object[]{this.f3697a, Long.valueOf(this.f3698b), Long.valueOf(this.f3699c), this.f3700d, Integer.valueOf(this.f3701e)});
        }
    }

    private C1242a() {
    }

    /* renamed from: a */
    public static C1242a m6000a() {
        return f3691b;
    }

    /* renamed from: b */
    public void mo4574b() {
        this.f3694e.clear();
        this.f3695f.clear();
        Context b = C1368X.m6313b();
        if (b != null) {
            String f = C2225al.m10069f(b);
            String a = C2225al.m10051a(b);
            String b2 = C2225al.m10060b();
            String g = C2188Q.m9853a().mo7687g();
            this.f3694e.put(C2225al.f9401l, f);
            this.f3694e.put(C2225al.f9400k, a);
            this.f3694e.put("ip", b2);
            this.f3694e.put("network_type", g);
        }
        for (String str : f3692c) {
            this.f3693d.add(new C2214ac(str, new File(C1466av.m6848a(C1368X.m6313b()), Uri.parse(str).getLastPathSegment()), (Object) str, this.f3696g, false));
        }
        m6006d();
    }

    /* renamed from: c */
    private void m6005c() {
        Context b = C1368X.m6313b();
        if (b != null && !this.f3694e.isEmpty()) {
            C1246d.m6010a(b).mo4593a(C1246d.f3784bA, this.f3694e, C1246d.f3836c);
        }
        this.f3694e.clear();
        this.f3695f.clear();
    }

    /* renamed from: d */
    private void m6006d() {
        if (!this.f3693d.isEmpty()) {
            C2214ac first = this.f3693d.getFirst();
            if (!first.mo7733b()) {
                first.mo7732a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6003a(String str, boolean z) {
        if (!this.f3693d.isEmpty()) {
            C2214ac first = this.f3693d.getFirst();
            this.f3695f.add(new C1243a(str, System.currentTimeMillis(), first.mo7738g(), z ? "success" : "failed", first.mo7739h()));
            if (!TextUtils.isEmpty(str)) {
                File file = new File(C1466av.m6848a(C1368X.m6313b()), Uri.parse(str).getLastPathSegment());
                if (file.exists()) {
                    file.delete();
                }
            }
            this.f3693d.removeFirst();
            m6006d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m6007e() {
        JSONArray jSONArray = new JSONArray();
        Iterator<C1243a> it = this.f3695f.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo4575a());
        }
        this.f3694e.put("test_result", jSONArray);
        m6005c();
    }
}
