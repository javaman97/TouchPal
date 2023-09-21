package com.cootek.smartinput5.p046b;

import com.cootek.p042a.p043a.C0911j;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.b.a */
/* compiled from: ConfigurationData */
public class C1131a {

    /* renamed from: a */
    public static final C1131a f3161a = new C1131a((String) null, (Object) null, (Boolean) null);

    /* renamed from: b */
    private static final String f3162b = "    ";

    /* renamed from: g */
    private static String f3163g = "";

    /* renamed from: h */
    private static C1131a f3164h = new C1131a((String) null, (Boolean) null);

    /* renamed from: c */
    private String f3165c;

    /* renamed from: d */
    private Object f3166d;

    /* renamed from: e */
    private Boolean f3167e;

    /* renamed from: f */
    private HashMap<String, C1131a> f3168f;

    public C1131a(String str, Boolean bool) {
        this(str, (Object) null, bool);
    }

    public C1131a(String str, Object obj) {
        this(str, obj, (Boolean) null);
    }

    public C1131a(String str, Object obj, Boolean bool) {
        this(str, obj, bool, (HashMap<String, C1131a>) null);
    }

    public C1131a(String str, Object obj, Boolean bool, HashMap<String, C1131a> hashMap) {
        this.f3165c = str;
        this.f3166d = obj;
        this.f3167e = bool;
        this.f3168f = hashMap;
    }

    /* renamed from: a */
    public String mo4388a() {
        return this.f3165c;
    }

    /* renamed from: a */
    public Object mo4387a(String[] strArr) {
        return m5650c(strArr).f3166d;
    }

    /* renamed from: b */
    public Boolean mo4389b(String[] strArr) {
        return m5650c(strArr).f3167e;
    }

    /* renamed from: c */
    private C1131a m5650c(String[] strArr) {
        HashMap<String, C1131a> hashMap;
        C1131a aVar;
        if (strArr == null || strArr.length == 0) {
            return this;
        }
        HashMap<String, C1131a> hashMap2 = this.f3168f;
        m5649b();
        HashMap<String, C1131a> hashMap3 = hashMap2;
        int i = 0;
        C1131a aVar2 = this;
        while (i < strArr.length) {
            f3164h.m5647a(aVar2);
            if (hashMap3 == null || (aVar2 = hashMap3.get(strArr[i])) == null) {
                hashMap = hashMap3;
                aVar = aVar2;
            } else {
                hashMap = aVar2.f3168f;
                aVar = aVar2;
            }
            if ((hashMap != null || i == strArr.length - 1) && aVar != null) {
                i++;
                aVar2 = aVar;
                hashMap3 = hashMap;
            } else {
                f3164h.m5647a(aVar);
                return m5648b(f3164h);
            }
        }
        return aVar2;
    }

    /* renamed from: b */
    private void m5649b() {
        f3164h.f3167e = null;
        f3164h.f3166d = null;
    }

    /* renamed from: a */
    private void m5647a(C1131a aVar) {
        if (aVar != null) {
            if (aVar.f3167e != null) {
                this.f3167e = aVar.f3167e;
            }
            if (aVar.f3166d != null) {
                this.f3166d = aVar.f3166d;
            }
        }
    }

    /* renamed from: b */
    private C1131a m5648b(C1131a aVar) {
        if (aVar != null) {
            return new C1131a((String) null, aVar.f3166d, aVar.f3167e);
        }
        return f3161a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.setLength(0);
        stringBuffer.append(String.format("key=%-30s  ", new Object[]{String.format("[%s]", new Object[]{this.f3165c})}));
        if (this.f3167e != null) {
            stringBuffer.append(String.format("visible=%-7s", new Object[]{String.format("[%s]", new Object[]{this.f3167e})}));
        } else {
            stringBuffer.append("                ");
        }
        if (this.f3166d != null) {
            stringBuffer.append(String.format("value=%-8s", new Object[]{String.format("[%s]", new Object[]{this.f3166d})}));
            stringBuffer.append(String.format("type=%-8s", new Object[]{String.format("[%s]", new Object[]{this.f3166d.getClass()})}));
        }
        if (this.f3168f != null) {
            f3163g += f3162b;
            for (C1131a aVar : this.f3168f.values()) {
                stringBuffer.append(C0911j.f2473c + f3163g + aVar.toString());
            }
            if (f3163g.length() > 0) {
                int length = f3163g.length() - f3162b.length();
                if (length <= 0) {
                    length = 0;
                }
                f3163g = f3163g.subSequence(0, length).toString();
            }
        }
        return stringBuffer.toString();
    }
}
