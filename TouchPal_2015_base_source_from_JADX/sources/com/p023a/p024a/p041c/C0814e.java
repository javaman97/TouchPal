package com.p023a.p024a.p041c;

import android.graphics.Bitmap;
import com.p023a.p024a.p025a.p030b.C0739c;
import com.p023a.p024a.p032b.p033a.C0757e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.a.a.c.e */
/* compiled from: MemoryCacheUtils */
public final class C0814e {

    /* renamed from: a */
    private static final String f2138a = "_";

    /* renamed from: b */
    private static final String f2139b = "x";

    private C0814e() {
    }

    /* renamed from: a */
    public static String m4631a(String str, C0757e eVar) {
        return str + "_" + eVar.mo2820a() + f2139b + eVar.mo2823b();
    }

    /* renamed from: a */
    public static Comparator<String> m4632a() {
        return new C0815f();
    }

    /* renamed from: a */
    public static List<Bitmap> m4633a(String str, C0739c cVar) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : cVar.mo2735a()) {
            if (str2.startsWith(str)) {
                arrayList.add(cVar.mo2739b(str2));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m4634b(String str, C0739c cVar) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : cVar.mo2735a()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static void m4635c(String str, C0739c cVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : cVar.mo2735a()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        for (String a : arrayList) {
            cVar.mo2733a(a);
        }
    }
}
