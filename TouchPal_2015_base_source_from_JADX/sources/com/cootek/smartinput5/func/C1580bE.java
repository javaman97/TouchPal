package com.cootek.smartinput5.func;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.bE */
/* compiled from: UserDictReportActivity */
class C1580bE implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f5001a;

    /* renamed from: b */
    final /* synthetic */ UserDictReportActivity f5002b;

    C1580bE(UserDictReportActivity userDictReportActivity, String str) {
        this.f5002b = userDictReportActivity;
        this.f5001a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent a = TouchPalOption.m5423a((Context) this.f5002b, String.format("[%s]", new Object[]{this.f5001a}), (String) null, "crashlog_android@cootek.cn");
        this.f5002b.m6271a(C1246d.f3940l);
        if (C1358O.m6239b() != null) {
            new C1581bF(this, this.f5002b, a).execute(new String[0]);
        } else {
            try {
                this.f5002b.startActivity(a);
            } catch (ActivityNotFoundException e) {
                this.f5002b.m6271a(C1246d.f3947s);
                Toast.makeText(this.f5002b, C1974m.m9063a((Context) this.f5002b, (int) R.string.mailclient_not_found), 0).show();
                this.f5002b.finish();
            }
            this.f5002b.finish();
        }
        this.f5002b.m6272b();
    }
}
