package p018cn.sharesdk.framework.p019a;

import android.content.Context;
import android.text.TextUtils;
import java.io.InputStream;
import java.util.ArrayList;
import p018cn.sharesdk.framework.ShareSDK;

/* renamed from: cn.sharesdk.framework.a.h */
public class C0617h extends C0616g {

    /* renamed from: c */
    private static C0617h f1478c = null;

    private C0617h() {
    }

    /* renamed from: a */
    public static C0617h m3549a() {
        if (f1478c == null) {
            f1478c = new C0617h();
        }
        return f1478c;
    }

    /* renamed from: a */
    private void m3550a(String str, int i) {
        if (!TextUtils.isEmpty(str) && i > 0) {
            ShareSDK.logApiEvent(str, i);
        }
    }

    /* renamed from: a */
    public InputStream mo2202a(String str, ArrayList<C0613d<String>> arrayList, C0612c cVar, String str2, int i) {
        m3550a(str2, i);
        return super.mo2197a(str, arrayList, cVar);
    }

    /* renamed from: a */
    public String mo2203a(Context context, String str) {
        return mo2198a(context, str, "images", true);
    }

    /* renamed from: a */
    public String mo2204a(String str, ArrayList<C0613d<String>> arrayList, C0613d<String> dVar, String str2, int i) {
        return mo2205a(str, arrayList, dVar, (ArrayList<C0613d<String>>) null, str2, i);
    }

    /* renamed from: a */
    public String mo2205a(String str, ArrayList<C0613d<String>> arrayList, C0613d<String> dVar, ArrayList<C0613d<String>> arrayList2, String str2, int i) {
        return mo2206a(str, arrayList, dVar, arrayList2, (ArrayList<C0613d<?>>) null, str2, i);
    }

    /* renamed from: a */
    public String mo2206a(String str, ArrayList<C0613d<String>> arrayList, C0613d<String> dVar, ArrayList<C0613d<String>> arrayList2, ArrayList<C0613d<?>> arrayList3, String str2, int i) {
        m3550a(str2, i);
        return super.mo2199a(str, arrayList, dVar, arrayList2, arrayList3);
    }

    /* renamed from: a */
    public String mo2207a(String str, ArrayList<C0613d<String>> arrayList, String str2, int i) {
        return mo2208a(str, arrayList, (ArrayList<C0613d<String>>) null, (ArrayList<C0613d<?>>) null, str2, i);
    }

    /* renamed from: a */
    public String mo2208a(String str, ArrayList<C0613d<String>> arrayList, ArrayList<C0613d<String>> arrayList2, ArrayList<C0613d<?>> arrayList3, String str2, int i) {
        m3550a(str2, i);
        return super.mo2200a(str, arrayList, arrayList2, arrayList3);
    }

    /* renamed from: b */
    public String mo2209b(String str, ArrayList<C0613d<String>> arrayList, C0613d<String> dVar, ArrayList<C0613d<String>> arrayList2, ArrayList<C0613d<?>> arrayList3, String str2, int i) {
        m3550a(str2, i);
        return super.mo2201b(str, arrayList, dVar, arrayList2, arrayList3);
    }

    /* renamed from: b */
    public String mo2210b(String str, ArrayList<C0613d<String>> arrayList, String str2, int i) {
        return mo2204a(str, arrayList, (C0613d<String>) null, str2, i);
    }
}
