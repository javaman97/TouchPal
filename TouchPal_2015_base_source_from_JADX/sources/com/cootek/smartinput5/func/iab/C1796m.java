package com.cootek.smartinput5.func.iab;

import android.content.Context;
import com.cootek.smartinput5.func.iab.C1759a;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.iab.m */
/* compiled from: IabErrorHandler */
final class C1796m implements C1759a.C1760a {

    /* renamed from: a */
    final /* synthetic */ Context f5903a;

    /* renamed from: b */
    final /* synthetic */ int f5904b;

    /* renamed from: c */
    final /* synthetic */ int f5905c;

    C1796m(Context context, int i, int i2) {
        this.f5903a = context;
        this.f5904b = i;
        this.f5905c = i2;
    }

    /* renamed from: a */
    public void mo6745a(String str) {
        C1794k.m8276b(this.f5903a, C1974m.m9063a(this.f5903a, (int) R.string.iab_error_server_error) + C1794k.m8278c(this.f5903a, this.f5904b), this.f5905c, false);
    }
}
