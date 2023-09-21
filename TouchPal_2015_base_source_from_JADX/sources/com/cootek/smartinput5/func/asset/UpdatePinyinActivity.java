package com.cootek.smartinput5.func.asset;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

public class UpdatePinyinActivity extends Activity {

    /* renamed from: a */
    private AlertDialog f4637a = null;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        m6731a();
        m6732b();
        this.f4637a.setOnDismissListener(new C1461p(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m6731a();
    }

    /* renamed from: a */
    private void m6731a() {
        if (this.f4637a != null && this.f4637a.isShowing()) {
            this.f4637a.dismiss();
        }
    }

    /* renamed from: b */
    private void m6732b() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(C1593bR.m7162a().mo6232a(16)).setMessage(C1974m.m9063a((Context) this, (int) R.string.update_pinyin_message)).setPositiveButton(C1974m.m9063a((Context) this, (int) R.string.iab_error_update_confirm), new C1463r(this, C1368X.m6320c().mo5842o())).setNegativeButton(17039360, new C1462q(this));
        this.f4637a = builder.create();
        this.f4637a.show();
    }
}
