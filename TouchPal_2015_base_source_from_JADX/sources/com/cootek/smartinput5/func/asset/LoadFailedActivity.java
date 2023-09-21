package com.cootek.smartinput5.func.asset;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

public class LoadFailedActivity extends Activity {

    /* renamed from: a */
    private AlertDialog f4636a = null;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        m6727a();
        m6729b();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m6727a();
    }

    /* renamed from: a */
    private void m6727a() {
        if (this.f4636a != null && this.f4636a.isShowing()) {
            this.f4636a.dismiss();
        }
    }

    /* renamed from: b */
    private void m6729b() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(C1974m.m9063a((Context) this, (int) R.string.load_failed_title)).setMessage(C1974m.m9063a((Context) this, (int) R.string.load_failed_msg)).setPositiveButton(17039370, new C1458m(this)).setNegativeButton(17039360, new C1457l(this));
        this.f4636a = builder.create();
        this.f4636a.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m6730c() {
        Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:" + getPackageName()));
        intent.setFlags(Engine.EXCEPTION_ERROR);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
