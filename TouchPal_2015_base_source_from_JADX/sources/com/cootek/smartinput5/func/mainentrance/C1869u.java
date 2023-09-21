package com.cootek.smartinput5.func.mainentrance;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.cootek.smartinput5.func.mainentrance.C1859m;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.mainentrance.u */
/* compiled from: SkinProvider */
class C1869u implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1859m f6242a;

    /* renamed from: b */
    final /* synthetic */ C1859m.C1860a f6243b;

    C1869u(C1859m.C1860a aVar, C1859m mVar) {
        this.f6243b = aVar;
        this.f6242a = mVar;
    }

    public void onClick(View view) {
        if (this.f6243b.f6228b.f5932a.mo6023b()) {
            this.f6243b.f6230d.startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:" + this.f6243b.f6228b.mo6810a())));
            return;
        }
        C2894d.C2895a aVar = new C2894d.C2895a(this.f6243b.f6230d);
        aVar.setTitle(C1974m.m9063a(C1859m.this.f6212a, (int) R.string.delete_skin));
        aVar.setPositiveButton(C1974m.m9063a(C1859m.this.f6212a, 17039379), new C1870v(this));
        aVar.setNegativeButton(C1974m.m9063a(C1859m.this.f6212a, 17039369), new C1871w(this));
        aVar.create().show();
    }
}
