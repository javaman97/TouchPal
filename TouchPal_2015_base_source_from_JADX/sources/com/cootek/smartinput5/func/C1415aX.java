package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.SharedPreferences;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.func.aX */
/* compiled from: ProductDataCollect */
public class C1415aX {

    /* renamed from: a */
    public static final String f4522a = "_PAOPAO_PROMOTE";

    /* renamed from: b */
    public static final String f4523b = "_PAOPAO_CLICK";

    /* renamed from: c */
    public static final String f4524c = "_PRODUCT_INSTALL";

    /* renamed from: d */
    public static final String f4525d = "INSTALLED_BY_ONESELF";

    /* renamed from: e */
    public static final String f4526e = "INSTALLED_FROM_PAOPAO";

    /* renamed from: f */
    public static final String f4527f = "com.cootek.smartdialer";

    /* renamed from: g */
    private Context f4528g;

    /* renamed from: h */
    private SharedPreferences f4529h;

    public C1415aX(Context context) {
        this.f4529h = context.getSharedPreferences("ProductDataCollect", 3);
    }

    /* renamed from: a */
    public void mo6050a(String str, boolean z) {
        if (!this.f4529h.getBoolean(str + f4522a, false)) {
            this.f4529h.edit().putBoolean(str + f4522a, true).commit();
        }
    }

    /* renamed from: a */
    public void mo6049a(String str) {
        if (!this.f4529h.getBoolean(str + f4523b, false)) {
            this.f4529h.edit().putBoolean(str + f4523b, true).commit();
            C1246d.m6010a(this.f4528g).mo4594a(str + "/" + C1246d.f3726W, true, C1246d.f3889d);
        }
    }

    /* renamed from: b */
    public void mo6051b(String str, boolean z) {
        if (!this.f4529h.getBoolean(str + f4524c, false)) {
            this.f4529h.edit().putBoolean(str + f4524c, true).commit();
            if (z) {
                C1246d.m6010a(this.f4528g).mo4591a("INSTALL_MODE/INSTALLED_FROM_PAOPAO", str, C1246d.f3889d);
            }
        }
    }
}
