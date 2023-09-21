package com.cootek.smartinput5.func.iab;

import android.content.Context;
import android.content.DialogInterface;
import com.cootek.smartinput5.func.iab.C1789h;
import com.cootek.smartinput5.func.resource.C1974m;

/* renamed from: com.cootek.smartinput5.func.iab.t */
/* compiled from: IabErrorHandler */
final class C1803t implements C1789h.C1790a {

    /* renamed from: a */
    final /* synthetic */ String f5920a;

    /* renamed from: b */
    final /* synthetic */ Context f5921b;

    /* renamed from: c */
    final /* synthetic */ Runnable f5922c;

    /* renamed from: d */
    final /* synthetic */ String f5923d;

    C1803t(String str, Context context, Runnable runnable, String str2) {
        this.f5920a = str;
        this.f5921b = context;
        this.f5922c = runnable;
        this.f5923d = str2;
    }

    /* renamed from: a */
    public String mo6656a() {
        return this.f5920a;
    }

    /* renamed from: c */
    public String mo6658c() {
        return C1974m.m9063a(this.f5921b, 17039370);
    }

    /* renamed from: f */
    public DialogInterface.OnClickListener mo6661f() {
        return null;
    }

    /* renamed from: e */
    public DialogInterface.OnDismissListener mo6660e() {
        return new C1804u(this);
    }

    /* renamed from: d */
    public String mo6659d() {
        return null;
    }

    /* renamed from: g */
    public DialogInterface.OnClickListener mo6662g() {
        return null;
    }

    /* renamed from: b */
    public String mo6657b() {
        return this.f5923d;
    }
}
