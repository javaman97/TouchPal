package com.cootek.smartinput5.func.iab;

import android.content.Context;
import android.content.DialogInterface;
import com.cootek.smartinput5.func.iab.C1789h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.iab.v */
/* compiled from: IabErrorHandler */
final class C1805v implements C1789h.C1790a {

    /* renamed from: a */
    final /* synthetic */ Context f5925a;

    /* renamed from: b */
    final /* synthetic */ int f5926b;

    C1805v(Context context, int i) {
        this.f5925a = context;
        this.f5926b = i;
    }

    /* renamed from: a */
    public String mo6656a() {
        return null;
    }

    /* renamed from: c */
    public String mo6658c() {
        return C1974m.m9063a(this.f5925a, (int) R.string.iab_error_update_confirm);
    }

    /* renamed from: f */
    public DialogInterface.OnClickListener mo6661f() {
        return new C1806w(this);
    }

    /* renamed from: e */
    public DialogInterface.OnDismissListener mo6660e() {
        return new C1807x(this);
    }

    /* renamed from: d */
    public String mo6659d() {
        return C1974m.m9063a(this.f5925a, 17039360);
    }

    /* renamed from: g */
    public DialogInterface.OnClickListener mo6662g() {
        return null;
    }

    /* renamed from: b */
    public String mo6657b() {
        return C1974m.m9063a(this.f5925a, (int) R.string.iab_error_update_plugin);
    }
}
