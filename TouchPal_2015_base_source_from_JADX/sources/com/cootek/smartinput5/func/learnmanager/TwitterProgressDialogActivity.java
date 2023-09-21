package com.cootek.smartinput5.func.learnmanager;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

public class TwitterProgressDialogActivity extends Activity {

    /* renamed from: a */
    private ProgressDialog f6026a;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        C1831l.f6117p = this;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m8365a(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        if (this.f6026a != null) {
            this.f6026a.dismiss();
        }
        super.onPause();
    }

    /* renamed from: a */
    private void m8365a(Context context) {
        if (C1831l.f6118q) {
            finish();
            return;
        }
        this.f6026a = new ProgressDialog(context);
        this.f6026a.setTitle(C1974m.m9063a(context, (int) R.string.twitter_auth_title));
        this.f6026a.setMessage(C1974m.m9063a(context, (int) R.string.twitter_redirect_tip));
        this.f6026a.setCancelable(true);
        this.f6026a.setOnCancelListener(new C1841u(this));
        this.f6026a.show();
    }
}
