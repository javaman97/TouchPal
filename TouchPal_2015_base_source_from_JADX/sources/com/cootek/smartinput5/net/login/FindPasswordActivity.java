package com.cootek.smartinput5.net.login;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2292o;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

public class FindPasswordActivity extends Activity {

    /* renamed from: a */
    private static final String f10188a = "FindPasswordActivity";

    /* renamed from: c */
    private static final int f10189c = 0;

    /* renamed from: d */
    private static final int f10190d = 1;

    /* renamed from: e */
    private static final int f10191e = 2;

    /* renamed from: f */
    private static final int f10192f = 16777216;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f10193b;

    /* renamed from: g */
    private LinearLayout f10194g;

    /* renamed from: h */
    private LinearLayout f10195h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public EditText f10196i;

    /* renamed from: j */
    private TextView f10197j;

    /* renamed from: k */
    private TextView f10198k;

    /* renamed from: l */
    private ProgressDialog f10199l;

    /* renamed from: m */
    private C2373x f10200m;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10193b = this;
        setContentView(R.layout.find_password_activity);
        setTitle(C1974m.m9063a((Context) this, (int) R.string.reset_password));
        this.f10194g = (LinearLayout) findViewById(R.id.reset_password_layout);
        this.f10195h = (LinearLayout) findViewById(R.id.reset_password_done_layout);
        this.f10196i = (EditText) findViewById(R.id.reset_password_email_text);
        this.f10197j = (TextView) findViewById(R.id.reset_password_btn);
        this.f10198k = (TextView) findViewById(R.id.reset_password_done_btn);
        m10611a();
        this.f10199l = new ProgressDialog(this.f10193b);
        this.f10199l.setProgressStyle(0);
        this.f10199l.setCanceledOnTouchOutside(false);
        this.f10199l.setOnCancelListener(new C2329b(this));
    }

    /* renamed from: a */
    private void m10611a() {
        this.f10197j.setOnClickListener(new C2330c(this));
        this.f10198k.setOnClickListener(new C2332e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10616a(String str) {
        m10621d();
        this.f10200m = new C2373x(new C2292o(str));
        this.f10200m.mo8060a((C2373x.C2376b) new C2333f(this, System.currentTimeMillis()));
        C1246d.m6010a(this.f10193b).mo4591a("LOGIN/FIND_PWD", "START", C1246d.f3933e);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10618b() {
        m10623e();
        this.f10194g.startAnimation(AnimationUtils.loadAnimation(this.f10193b, R.anim.fade_out));
        this.f10194g.setVisibility(8);
        this.f10195h.setVisibility(0);
        this.f10195h.startAnimation(AnimationUtils.loadAnimation(this.f10193b, R.anim.fade_in));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10620c() {
        this.f10200m.mo8061b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10612a(int i) {
        m10623e();
        String str = null;
        if (i == 2) {
            str = C1974m.m9063a(this.f10193b, (int) R.string.login_error_email_invalid);
        } else if ((i & 16777216) != 0) {
            int i2 = i ^ 16777216;
            if (i2 == 4101) {
                str = C1974m.m9063a(this.f10193b, (int) R.string.login_error_account_not_exist);
            } else {
                str = C1974m.m9063a(this.f10193b, (int) R.string.vi_error_network) + " " + C1974m.m9064a(this.f10193b, (int) R.string.error_code_string, Integer.valueOf(i2));
            }
        }
        if (!TextUtils.isEmpty(str)) {
            Toast.makeText(this.f10193b, str, 0).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        m10623e();
        this.f10199l = null;
        super.onDestroy();
    }

    /* renamed from: d */
    private void m10621d() {
        if (this.f10199l != null && !this.f10199l.isShowing()) {
            this.f10199l.show();
        }
    }

    /* renamed from: e */
    private void m10623e() {
        if (this.f10199l != null && this.f10199l.isShowing()) {
            this.f10199l.dismiss();
        }
    }
}
