package com.cootek.smartinput5.func.learnmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

public class LearnRetryActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        m8363a();
    }

    /* renamed from: a */
    private void m8363a() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(C1813a.f6027a);
        new C2894d.C2895a(this).setTitle(stringExtra).setMessage(intent.getStringExtra(C1813a.f6028b)).setPositiveButton(C1974m.m9063a((Context) this, (int) R.string.yes), new C1822e(this, intent.getIntExtra(C1813a.f6029c, 0))).setNegativeButton(C1974m.m9063a((Context) this, (int) R.string.no), new C1821d(this)).setOnCancelListener(new C1820c(this)).show();
    }
}
