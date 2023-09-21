package p018cn.sharesdk.framework.utils;

import android.text.TextUtils;
import android.util.Xml;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: cn.sharesdk.framework.utils.m */
public class C0679m {

    /* renamed from: cn.sharesdk.framework.utils.m$a */
    private static class C0680a extends DefaultHandler {

        /* renamed from: a */
        private HashMap<String, Object> f1656a = new HashMap<>();

        /* renamed from: b */
        private HashMap<String, Object> f1657b;

        /* renamed from: a */
        public HashMap<String, Object> mo2519a() {
            return this.f1656a;
        }

        public void characters(char[] cArr, int i, int i2) {
            String trim = String.valueOf(cArr, i, i2).trim();
            if (!TextUtils.isEmpty(trim) && this.f1657b != null) {
                this.f1657b.put("value", trim);
            }
        }

        public void endElement(String str, String str2, String str3) {
            this.f1657b = null;
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            if (this.f1657b != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                this.f1657b.put(str2, hashMap);
                this.f1657b = hashMap;
            } else {
                this.f1657b = new HashMap<>();
                this.f1656a.put(str2, this.f1657b);
            }
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                this.f1657b.put(attributes.getLocalName(i), attributes.getValue(i));
            }
        }
    }

    /* renamed from: a */
    public HashMap<String, Object> mo2518a(String str) {
        C0680a aVar = new C0680a();
        Xml.parse(str, aVar);
        return aVar.mo2519a();
    }
}
