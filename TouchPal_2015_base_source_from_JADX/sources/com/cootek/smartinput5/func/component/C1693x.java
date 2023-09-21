package com.cootek.smartinput5.func.component;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.cootek.smartinput5.func.component.C1689v;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.component.x */
/* compiled from: ContactNameIndexer */
class C1693x implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1689v f5525a;

    C1693x(C1689v vVar) {
        this.f5525a = vVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String a = C1974m.m9063a((Context) this.f5525a.f5513b, (int) R.string.contactname_clearing_message);
        try {
            dialogInterface.dismiss();
            boolean unused = this.f5525a.f5516e = false;
            ProgressDialog unused2 = this.f5525a.f5512a = ProgressDialog.show(this.f5525a.f5513b, (CharSequence) null, a, true, true);
            this.f5525a.f5512a.setCancelable(true);
            this.f5525a.f5512a.setOnCancelListener(new C1694y(this));
            C1689v.C1691b unused3 = this.f5525a.f5518g = new C1689v.C1691b(this.f5525a, (C1692w) null);
            this.f5525a.f5518g.execute(new String[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
