package com.iflytek.cloud.p084b;

import android.text.TextUtils;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.iflytek.cloud.b.a */
public class C4000a {

    /* renamed from: a */
    HashMap<String, String> f16350a = new HashMap<>();

    public C4000a() {
    }

    public C4000a(String str, String[][] strArr) {
        mo14708a(str);
        mo14711a(strArr);
    }

    /* renamed from: e */
    public static String m17053e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.replaceAll("[,\n ]", "|");
    }

    /* renamed from: a */
    public int mo14705a(String str, int i) {
        String str2 = this.f16350a.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            return Integer.parseInt(str2);
        } catch (Exception e) {
            return i;
        }
    }

    /* renamed from: a */
    public void mo14706a() {
        this.f16350a.clear();
    }

    /* renamed from: a */
    public void mo14707a(C4000a aVar, String str) {
        if (aVar != null) {
            mo14709a(str, aVar.mo14719d(str));
        }
    }

    /* renamed from: a */
    public void mo14708a(String str) {
        this.f16350a.clear();
        mo14715b(str);
    }

    /* renamed from: a */
    public void mo14709a(String str, String str2) {
        mo14710a(str, str2, true);
    }

    /* renamed from: a */
    public void mo14710a(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (z || !this.f16350a.containsKey(str)) {
                this.f16350a.put(str, str2);
            }
        }
    }

    /* renamed from: a */
    public void mo14711a(String[][] strArr) {
        if (strArr != null) {
            for (String[] strArr2 : strArr) {
                if (this.f16350a.containsKey(strArr2[0])) {
                    String str = this.f16350a.get(strArr2[0]);
                    this.f16350a.remove(strArr2[0]);
                    for (int i = 1; i < strArr2.length; i++) {
                        this.f16350a.put(strArr2[i], str);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo14712a(String str, boolean z) {
        String str2 = this.f16350a.get(str);
        if (str2 == null) {
            return z;
        }
        if (str2.equals("true") || str2.equals("1")) {
            return true;
        }
        if (str2.equals("false") || str2.equals("0")) {
            return false;
        }
        return z;
    }

    /* renamed from: b */
    public C4000a clone() {
        C4000a aVar = new C4000a();
        aVar.f16350a = (HashMap) this.f16350a.clone();
        return aVar;
    }

    /* renamed from: b */
    public String mo14714b(String str, String str2) {
        String str3 = this.f16350a.get(str);
        return str3 == null ? str2 : str3;
    }

    /* renamed from: b */
    public void mo14715b(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                int indexOf = str2.indexOf("=");
                if (indexOf > 0 && indexOf < str2.length()) {
                    this.f16350a.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                }
            }
        }
    }

    /* renamed from: c */
    public Boolean mo14716c(String str) {
        return Boolean.valueOf(this.f16350a.remove(str) != null);
    }

    /* renamed from: c */
    public HashMap<String, String> mo14717c() {
        return this.f16350a;
    }

    /* renamed from: d */
    public String mo14719d(String str) {
        return this.f16350a.get(str);
    }

    /* renamed from: d */
    public void mo14720d() {
        for (Map.Entry next : this.f16350a.entrySet()) {
            next.setValue(m17053e((String) next.getValue()));
        }
    }

    /* renamed from: f */
    public boolean mo14721f(String str) {
        return this.f16350a.containsKey(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry next : this.f16350a.entrySet()) {
            stringBuffer.append((String) next.getKey());
            stringBuffer.append("=");
            stringBuffer.append((String) next.getValue());
            stringBuffer.append(",");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        String stringBuffer2 = stringBuffer.toString();
        C3990a.m17033c(stringBuffer2);
        return stringBuffer2;
    }
}
