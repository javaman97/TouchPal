package com.cootek.smartinput5.func.resource;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1599be;
import com.cootek.smartinput5.func.asset.C1460o;

/* renamed from: com.cootek.smartinput5.func.resource.m */
/* compiled from: TouchPalResources */
public class C1974m {

    /* renamed from: a */
    public static final String f6735a = "TouchPalResources.tprc";

    /* renamed from: b */
    public static final String f6736b = "TouchPalResources.md5";

    /* renamed from: c */
    public static final String f6737c = "";

    /* renamed from: d */
    private static C1443as f6738d;

    /* renamed from: a */
    public static String m9064a(Context context, int i, Object... objArr) {
        String a = m9063a(context, i);
        if (a != null) {
            return String.format(a, objArr);
        }
        return "";
    }

    /* renamed from: a */
    public static String m9063a(Context context, int i) {
        String str = null;
        if (m9069b(context)) {
            str = m9073d(context, i);
        }
        if (str == null) {
            return context.getString(i);
        }
        return str;
    }

    /* renamed from: b */
    public static String[] m9070b(Context context, int i) {
        String[] strArr = null;
        if (m9069b(context)) {
            strArr = m9072c(context, i);
        }
        if (strArr == null) {
            return context.getResources().getStringArray(i);
        }
        return strArr;
    }

    /* renamed from: a */
    public static void m9066a(Context context, Object obj, C1962a aVar, AttributeSet attributeSet, String str, String str2, boolean z) {
        int attributeResourceValue;
        Object a;
        if (context != null && attributeSet != null && obj != null && aVar != null && (attributeResourceValue = attributeSet.getAttributeResourceValue(str, str2, 0)) > 0) {
            if (z) {
                a = m9072c(context, attributeResourceValue);
            } else {
                a = m9063a(context, attributeResourceValue);
            }
            if (a != null) {
                aVar.mo7214a(obj, a);
            }
        }
    }

    /* renamed from: c */
    private static String[] m9072c(Context context, int i) {
        if (f6738d != null) {
            return m9067a(C1599be.m7196a(context, f6738d, i));
        }
        return null;
    }

    /* renamed from: a */
    private static String[] m9067a(int i) {
        if (i <= 0) {
            return null;
        }
        try {
            return f6738d.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            return null;
        }
    }

    /* renamed from: d */
    private static String m9073d(Context context, int i) {
        if (f6738d != null) {
            return m9068b(C1599be.m7196a(context, f6738d, i));
        }
        return null;
    }

    /* renamed from: b */
    private static String m9068b(int i) {
        if (i <= 0) {
            return null;
        }
        try {
            return f6738d.getResources().getString(i);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m9069b(Context context) {
        if (f6738d != null) {
            return true;
        }
        m9071c(context);
        if (f6738d == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static void m9071c(Context context) {
        f6738d = C1460o.m6799b().mo6132e(context);
    }

    /* renamed from: a */
    public static void m9065a(Context context) {
        C1460o.m6799b().mo6123a(context);
        m9071c(context);
    }

    /* renamed from: a */
    public static Object m9061a(Context context, String str) {
        Object obj = null;
        if (f6738d != null) {
            obj = m9062a(f6738d.getPackageName(), f6738d.getResources(), str);
        }
        if (obj == null) {
            return m9062a(context.getPackageName(), context.getResources(), str);
        }
        return obj;
    }

    /* renamed from: a */
    private static Object m9062a(String str, Resources resources, String str2) {
        String str3 = str + ":" + str2;
        int identifier = resources.getIdentifier(str3, "integer", (String) null);
        if (identifier > 0) {
            return Integer.valueOf(resources.getInteger(identifier));
        }
        int identifier2 = resources.getIdentifier(str3, "string", (String) null);
        if (identifier2 > 0) {
            return resources.getString(identifier2);
        }
        int identifier3 = resources.getIdentifier(str3, "bool", (String) null);
        if (identifier3 > 0) {
            return Boolean.valueOf(resources.getBoolean(identifier3));
        }
        return null;
    }
}
