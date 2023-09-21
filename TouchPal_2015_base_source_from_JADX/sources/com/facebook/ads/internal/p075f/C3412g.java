package com.facebook.ads.internal.p075f;

import com.cootek.smartinput5.net.cmd.C2261Q;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.facebook.ads.internal.f.g */
public class C3412g {

    /* renamed from: d */
    private static String f14892d = Utils.UTF8;

    /* renamed from: a */
    protected ConcurrentHashMap<String, String> f14893a;

    /* renamed from: b */
    protected ConcurrentHashMap<String, C3413a> f14894b;

    /* renamed from: c */
    protected ConcurrentHashMap<String, ArrayList<String>> f14895c;

    /* renamed from: com.facebook.ads.internal.f.g$a */
    private static class C3413a {

        /* renamed from: a */
        public InputStream f14896a;

        /* renamed from: b */
        public String f14897b;

        /* renamed from: c */
        public String f14898c;

        /* renamed from: a */
        public String mo10734a() {
            return this.f14897b != null ? this.f14897b : "nofilename";
        }
    }

    public C3412g() {
        m14999c();
    }

    public C3412g(Map<String, String> map) {
        m14999c();
        for (Map.Entry next : map.entrySet()) {
            mo10731a((String) next.getKey(), (String) next.getValue());
        }
    }

    /* renamed from: c */
    private void m14999c() {
        this.f14893a = new ConcurrentHashMap<>();
        this.f14894b = new ConcurrentHashMap<>();
        this.f14895c = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public HttpEntity mo10730a() {
        if (!this.f14894b.isEmpty()) {
            C3414h hVar = new C3414h();
            for (Map.Entry next : this.f14893a.entrySet()) {
                hVar.mo10736a((String) next.getKey(), (String) next.getValue());
            }
            int size = this.f14894b.entrySet().size() - 1;
            int i = 0;
            for (Map.Entry next2 : this.f14894b.entrySet()) {
                C3413a aVar = (C3413a) next2.getValue();
                if (aVar.f14896a != null) {
                    boolean z = i == size;
                    if (aVar.f14898c != null) {
                        hVar.mo10737a((String) next2.getKey(), aVar.mo10734a(), aVar.f14896a, aVar.f14898c, z);
                    } else {
                        hVar.mo10738a((String) next2.getKey(), aVar.mo10734a(), aVar.f14896a, z);
                    }
                }
                i++;
            }
            for (Map.Entry next3 : this.f14895c.entrySet()) {
                Iterator it = ((ArrayList) next3.getValue()).iterator();
                while (it.hasNext()) {
                    hVar.mo10736a((String) next3.getKey(), (String) it.next());
                }
            }
            return hVar;
        }
        try {
            return new UrlEncodedFormEntity(mo10732b(), f14892d);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo10731a(String str, String str2) {
        if (str != null && str2 != null) {
            this.f14893a.put(str, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<BasicNameValuePair> mo10732b() {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry next : this.f14893a.entrySet()) {
            linkedList.add(new BasicNameValuePair((String) next.getKey(), (String) next.getValue()));
        }
        for (Map.Entry next2 : this.f14895c.entrySet()) {
            Iterator it = ((ArrayList) next2.getValue()).iterator();
            while (it.hasNext()) {
                linkedList.add(new BasicNameValuePair((String) next2.getKey(), (String) it.next()));
            }
        }
        return linkedList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : this.f14893a.entrySet()) {
            if (sb.length() > 0) {
                sb.append(C2261Q.f9808n);
            }
            sb.append((String) next.getKey());
            sb.append("=");
            sb.append((String) next.getValue());
        }
        for (Map.Entry next2 : this.f14894b.entrySet()) {
            if (sb.length() > 0) {
                sb.append(C2261Q.f9808n);
            }
            sb.append((String) next2.getKey());
            sb.append("=");
            sb.append("FILE");
        }
        for (Map.Entry next3 : this.f14895c.entrySet()) {
            if (sb.length() > 0) {
                sb.append(C2261Q.f9808n);
            }
            ArrayList arrayList = (ArrayList) next3.getValue();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (arrayList.indexOf(str) != 0) {
                    sb.append(C2261Q.f9808n);
                }
                sb.append((String) next3.getKey());
                sb.append("=");
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
