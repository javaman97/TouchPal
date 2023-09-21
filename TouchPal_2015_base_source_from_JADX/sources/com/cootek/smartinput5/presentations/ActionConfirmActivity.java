package com.cootek.smartinput5.presentations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

public class ActionConfirmActivity extends Activity {

    /* renamed from: a */
    private String f10765a;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Intent intent = getIntent();
        this.f10765a = intent.getStringExtra(C2515q.f10828a);
        String stringExtra = intent.getStringExtra(C2515q.f10833f);
        if (!TextUtils.isEmpty(stringExtra)) {
            m11187a(stringExtra);
        } else {
            finish();
        }
    }

    /* renamed from: a */
    private void m11187a(String str) {
        C2894d.C2895a aVar = new C2894d.C2895a(this);
        aVar.setPositiveButton(m11184a((int) R.string.yes), new C2499c(this));
        aVar.setNegativeButton(m11184a((int) R.string.no), new C2500d(this));
        aVar.setOnCancelListener(new C2501e(this));
        aVar.setMessage(str);
        aVar.create().show();
    }

    /* renamed from: a */
    private String m11184a(int i) {
        return C1974m.m9063a((Context) this, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11185a() {
        PresentationManager.actionConfirmed(this.f10765a);
    }
}
