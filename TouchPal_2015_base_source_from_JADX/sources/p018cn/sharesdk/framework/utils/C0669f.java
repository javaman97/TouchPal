package p018cn.sharesdk.framework.utils;

import android.util.Base64;
import com.cootek.smartinput5.plugin.twitter.C2409j;
import com.weibo.net.C4054q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p018cn.sharesdk.framework.p019a.C0613d;

/* renamed from: cn.sharesdk.framework.utils.f */
public class C0669f {

    /* renamed from: a */
    private C0672b f1636a = new C0672b();

    /* renamed from: b */
    private C0673g f1637b = new C0673g("-._~", false);

    /* renamed from: cn.sharesdk.framework.utils.f$a */
    public enum C0671a {
        HMAC_SHA1,
        PLAINTEXT
    }

    /* renamed from: cn.sharesdk.framework.utils.f$b */
    public static class C0672b {

        /* renamed from: a */
        public String f1642a;

        /* renamed from: b */
        public String f1643b;

        /* renamed from: c */
        public String f1644c;

        /* renamed from: d */
        public String f1645d;

        /* renamed from: e */
        public String f1646e;
    }

    /* renamed from: a */
    private ArrayList<C0613d<String>> m3843a(long j, String str) {
        ArrayList<C0613d<String>> arrayList = new ArrayList<>();
        arrayList.add(new C0613d(C2409j.f10546d, this.f1636a.f1642a));
        arrayList.add(new C0613d(C2409j.f10549g, str));
        arrayList.add(new C0613d(C2409j.f10550h, String.valueOf(j / 1000)));
        arrayList.add(new C0613d(C2409j.f10547e, String.valueOf(j)));
        arrayList.add(new C0613d(C2409j.f10551i, "1.0"));
        String str2 = this.f1636a.f1644c;
        if (str2 != null && str2.length() > 0) {
            arrayList.add(new C0613d(C2409j.f10554l, str2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private ArrayList<C0613d<String>> m3844a(long j, ArrayList<C0613d<String>> arrayList, String str) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator<C0613d<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                C0613d next = it.next();
                hashMap.put(mo2500a(next.f1471a), mo2500a((String) next.f1472b));
            }
        }
        ArrayList<C0613d<String>> a = m3843a(j, str);
        if (a != null) {
            Iterator<C0613d<String>> it2 = a.iterator();
            while (it2.hasNext()) {
                C0613d next2 = it2.next();
                hashMap.put(mo2500a(next2.f1471a), mo2500a((String) next2.f1472b));
            }
        }
        String[] strArr = new String[hashMap.size()];
        int i = 0;
        for (Map.Entry key : hashMap.entrySet()) {
            strArr[i] = (String) key.getKey();
            i++;
        }
        Arrays.sort(strArr);
        ArrayList<C0613d<String>> arrayList2 = new ArrayList<>();
        for (String str2 : strArr) {
            arrayList2.add(new C0613d(str2, hashMap.get(str2)));
        }
        return arrayList2;
    }

    /* renamed from: a */
    private ArrayList<C0613d<String>> m3845a(String str, String str2, ArrayList<C0613d<String>> arrayList, C0671a aVar) {
        String str3;
        String str4 = null;
        long currentTimeMillis = System.currentTimeMillis();
        switch (aVar) {
            case HMAC_SHA1:
                str4 = "HMAC-SHA1";
                SecretKeySpec secretKeySpec = new SecretKeySpec((mo2500a(this.f1636a.f1643b) + '&' + mo2500a(this.f1636a.f1645d)).getBytes("utf-8"), "HMAC-SHA1");
                Mac instance = Mac.getInstance("HMAC-SHA1");
                instance.init(secretKeySpec);
                str3 = new String(Base64.encode(instance.doFinal((str2 + '&' + mo2500a(str.toLowerCase()) + '&' + mo2500a(m3846b(m3844a(currentTimeMillis, arrayList, str4)))).getBytes("utf-8")), 0)).trim();
                break;
            case PLAINTEXT:
                str4 = "PLAINTEXT";
                str3 = mo2500a(this.f1636a.f1643b) + '&' + mo2500a(this.f1636a.f1645d);
                break;
            default:
                str3 = null;
                break;
        }
        ArrayList<C0613d<String>> a = m3843a(currentTimeMillis, str4);
        a.add(new C0613d(C2409j.f10548f, str3));
        return a;
    }

    /* renamed from: b */
    private String m3846b(ArrayList<C0613d<String>> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Iterator<C0613d<String>> it = arrayList.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return sb.toString();
            }
            C0613d next = it.next();
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(next.f1471a).append('=').append((String) next.f1472b);
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    public C0672b mo2499a() {
        return this.f1636a;
    }

    /* renamed from: a */
    public String mo2500a(String str) {
        return str == null ? "" : this.f1637b.escape(str);
    }

    /* renamed from: a */
    public ArrayList<C0613d<String>> mo2501a(String str, ArrayList<C0613d<String>> arrayList) {
        return mo2502a(str, arrayList, C0671a.HMAC_SHA1);
    }

    /* renamed from: a */
    public ArrayList<C0613d<String>> mo2502a(String str, ArrayList<C0613d<String>> arrayList, C0671a aVar) {
        return m3845a(str, C4054q.f16509e, arrayList, aVar);
    }

    /* renamed from: a */
    public ArrayList<C0613d<String>> mo2503a(ArrayList<C0613d<String>> arrayList) {
        StringBuilder sb = new StringBuilder("OAuth ");
        int i = 0;
        Iterator<C0613d<String>> it = arrayList.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                C0613d next = it.next();
                if (i2 > 0) {
                    sb.append(',');
                }
                sb.append(next.f1471a).append("=\"").append(mo2500a((String) next.f1472b)).append("\"");
                i = i2 + 1;
            } else {
                ArrayList<C0613d<String>> arrayList2 = new ArrayList<>();
                arrayList2.add(new C0613d("Authorization", sb.toString()));
                arrayList2.add(new C0613d("Content-Type", "application/x-www-form-urlencoded"));
                return arrayList2;
            }
        }
    }

    /* renamed from: a */
    public void mo2504a(String str, String str2) {
        this.f1636a.f1644c = str;
        this.f1636a.f1645d = str2;
    }

    /* renamed from: a */
    public void mo2505a(String str, String str2, String str3) {
        this.f1636a.f1642a = str;
        this.f1636a.f1643b = str2;
        this.f1636a.f1646e = str3;
    }

    /* renamed from: b */
    public ArrayList<C0613d<String>> mo2506b(String str, ArrayList<C0613d<String>> arrayList) {
        return mo2507b(str, arrayList, C0671a.HMAC_SHA1);
    }

    /* renamed from: b */
    public ArrayList<C0613d<String>> mo2507b(String str, ArrayList<C0613d<String>> arrayList, C0671a aVar) {
        return m3845a(str, C4054q.f16510f, arrayList, aVar);
    }

    /* renamed from: c */
    public ArrayList<C0613d<String>> mo2508c(String str, ArrayList<C0613d<String>> arrayList, C0671a aVar) {
        return m3845a(str, "PUT", arrayList, aVar);
    }
}
