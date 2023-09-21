package android.support.p001v4.p003b;

import android.text.TextUtils;

/* renamed from: android.support.v4.b.a */
/* compiled from: DatabaseUtilsCompat */
public class C0183a {
    private C0183a() {
    }

    /* renamed from: a */
    public static String m763a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return "(" + str + ") AND (" + str2 + ")";
    }

    /* renamed from: a */
    public static String[] m764a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[(strArr.length + strArr2.length)];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }
}
