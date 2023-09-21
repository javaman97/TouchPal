package com.cootek.smartinput5.func;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

public class UserDictReportActivity extends Activity {

    /* renamed from: a */
    public static final String f4237a = "DICT_REPORT_CAUSE";

    /* renamed from: b */
    private AlertDialog f4238b;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        m6268a();
        m6273c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6271a(String str) {
        C1246d.m6010a((Context) this).mo4591a("DICT_RECOVERY/USER_DICT_REPORT", str, C1246d.f3836c);
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        m6268a();
    }

    /* renamed from: a */
    private void m6268a() {
        if (this.f4238b != null && this.f4238b.isShowing()) {
            this.f4238b.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6272b() {
        if (Engine.isInitialized() && Engine.getInstance().getIms() != null) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
    }

    /* renamed from: c */
    private void m6273c() {
        String stringExtra = getIntent() != null ? getIntent().getStringExtra(f4237a) : null;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(C1974m.m9063a((Context) this, (int) R.string.send_user_dict_feedback_dlg_msg));
        builder.setPositiveButton(C1974m.m9063a((Context) this, (int) R.string.send_user_dict_feedback_dlg_report), new C1580bE(this, stringExtra));
        builder.setNegativeButton(C1974m.m9063a((Context) this, (int) R.string.send_user_dict_feedback_dlg_cancel), new C1582bG(this));
        builder.setOnCancelListener(new C1583bH(this));
        this.f4238b = builder.create();
        this.f4238b.show();
    }
}
