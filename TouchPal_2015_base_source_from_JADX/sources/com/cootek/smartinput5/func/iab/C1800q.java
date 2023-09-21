package com.cootek.smartinput5.func.iab;

import android.content.Context;
import android.content.DialogInterface;
import com.cootek.smartinput5.func.iab.C1789h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.iab.q */
/* compiled from: IabErrorHandler */
final class C1800q implements C1789h.C1790a {

    /* renamed from: a */
    final /* synthetic */ String f5913a;

    /* renamed from: b */
    final /* synthetic */ Context f5914b;

    /* renamed from: c */
    final /* synthetic */ Runnable f5915c;

    /* renamed from: d */
    final /* synthetic */ Runnable f5916d;

    /* renamed from: e */
    final /* synthetic */ String f5917e;

    C1800q(String str, Context context, Runnable runnable, Runnable runnable2, String str2) {
        this.f5913a = str;
        this.f5914b = context;
        this.f5915c = runnable;
        this.f5916d = runnable2;
        this.f5917e = str2;
    }

    /* renamed from: a */
    public String mo6656a() {
        return this.f5913a;
    }

    /* renamed from: c */
    public String mo6658c() {
        return C1974m.m9063a(this.f5914b, (int) R.string.iab_error_retry);
    }

    /* renamed from: f */
    public DialogInterface.OnClickListener mo6661f() {
        return new C1801r(this);
    }

    /* renamed from: e */
    public DialogInterface.OnDismissListener mo6660e() {
        return new C1802s(this);
    }

    /* renamed from: d */
    public String mo6659d() {
        return C1974m.m9063a(this.f5914b, (int) R.string.iab_error_close);
    }

    /* renamed from: g */
    public DialogInterface.OnClickListener mo6662g() {
        return null;
    }

    /* renamed from: b */
    public String mo6657b() {
        return this.f5917e;
    }
}
