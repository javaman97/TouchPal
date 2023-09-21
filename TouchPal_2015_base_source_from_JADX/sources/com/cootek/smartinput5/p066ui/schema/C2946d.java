package com.cootek.smartinput5.p066ui.schema;

import com.cootek.smartinput.utilities.C1017y;

/* renamed from: com.cootek.smartinput5.ui.schema.d */
/* compiled from: SchemaChooser */
public class C2946d {

    /* renamed from: a */
    private static final String f13369a = "SchemaChooser";

    /* renamed from: b */
    private static final String f13370b = "com.cootek.smartinput5.ui.schema.template.T_";

    /* renamed from: a */
    public static final KeyboardSchema m13631a(String str) {
        Class<?> cls;
        String str2 = f13370b + str;
        try {
            cls = Class.forName(str2);
        } catch (ClassNotFoundException e) {
            C1017y.m5213a(f13369a, "can not find template for [" + str2 + "]");
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (KeyboardSchema) cls.newInstance();
        } catch (InstantiationException e2) {
            return null;
        } catch (IllegalAccessException e3) {
            return null;
        }
    }
}
