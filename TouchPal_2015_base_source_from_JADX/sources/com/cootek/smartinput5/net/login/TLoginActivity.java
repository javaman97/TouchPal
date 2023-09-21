package com.cootek.smartinput5.net.login;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1600bf;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2248H;
import com.cootek.smartinput5.net.cmd.C2300u;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.control.C2849W;
import com.emoji.keyboard.touchpal.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.ArrayList;
import java.util.Iterator;
import p018cn.sharesdk.facebook.Facebook;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.PlatformActionListener;
import p018cn.sharesdk.framework.ShareSDK;
import p018cn.sharesdk.twitter.Twitter;

public class TLoginActivity extends Activity {

    /* renamed from: T */
    private static final int f10228T = 256;

    /* renamed from: U */
    private static final int f10229U = 257;

    /* renamed from: a */
    private static final String f10230a = "TLoginActivity";

    /* renamed from: c */
    private static final String f10231c = "com.google";

    /* renamed from: d */
    private static final int f10232d = 0;

    /* renamed from: e */
    private static final int f10233e = 1;

    /* renamed from: f */
    private static final int f10234f = 2;

    /* renamed from: g */
    private static final int f10235g = 3;

    /* renamed from: h */
    private static final int f10236h = 4;

    /* renamed from: i */
    private static final int f10237i = 5;

    /* renamed from: j */
    private static final int f10238j = 6;

    /* renamed from: k */
    private static final int f10239k = 7;

    /* renamed from: l */
    private static final int f10240l = 8;

    /* renamed from: m */
    private static final int f10241m = 9;

    /* renamed from: n */
    private static final int f10242n = 16777216;

    /* renamed from: o */
    private static final int f10243o = 1;

    /* renamed from: p */
    private static final int f10244p = 2;

    /* renamed from: q */
    private static final int f10245q = -1;

    /* renamed from: r */
    private static final int f10246r = 0;

    /* renamed from: s */
    private static final int f10247s = 1;

    /* renamed from: t */
    private static final int f10248t = 2;

    /* renamed from: A */
    private TextView f10249A;

    /* renamed from: B */
    private TextView f10250B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public EditText f10251C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public EditText f10252D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public EditText f10253E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public EditText f10254F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public EditText f10255G;

    /* renamed from: H */
    private LinearLayout f10256H;

    /* renamed from: I */
    private LinearLayout f10257I;

    /* renamed from: J */
    private LinearLayout f10258J;

    /* renamed from: K */
    private CheckBox f10259K;

    /* renamed from: L */
    private ProgressDialog f10260L;

    /* renamed from: M */
    private PlatformActionListener f10261M;

    /* renamed from: N */
    private ArrayList<Object> f10262N;

    /* renamed from: O */
    private String f10263O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f10264P;

    /* renamed from: Q */
    private boolean f10265Q = false;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f10266R = false;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public long f10267S = -1;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public Handler f10268V = new C2341n(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f10269b;

    /* renamed from: u */
    private TextView f10270u;

    /* renamed from: v */
    private ImageView f10271v;

    /* renamed from: w */
    private ImageView f10272w;

    /* renamed from: x */
    private ImageView f10273x;

    /* renamed from: y */
    private TextView f10274y;

    /* renamed from: z */
    private TextView f10275z;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10269b = this;
        C1368X.m6317b((Context) this);
        if (m10654a()) {
            finish();
            return;
        }
        setTitle(m10643a((int) R.string.vip_login));
        setContentView(R.layout.login_activity);
        this.f10262N = new ArrayList<>();
        this.f10270u = (TextView) findViewById(R.id.login_via_google);
        this.f10271v = (ImageView) findViewById(R.id.login_via_facebook);
        this.f10272w = (ImageView) findViewById(R.id.login_via_twitter);
        this.f10273x = (ImageView) findViewById(R.id.login_via_email);
        this.f10274y = (TextView) findViewById(R.id.goto_sign_up_btn);
        this.f10275z = (TextView) findViewById(R.id.goto_login_btn);
        this.f10249A = (TextView) findViewById(R.id.login_btn);
        this.f10250B = (TextView) findViewById(R.id.sign_up_btn);
        this.f10251C = (EditText) findViewById(R.id.login_email_text);
        this.f10254F = (EditText) findViewById(R.id.login_password_text);
        this.f10252D = (EditText) findViewById(R.id.sign_up_email_text);
        this.f10253E = (EditText) findViewById(R.id.sign_up_email_confirm_text);
        this.f10255G = (EditText) findViewById(R.id.sign_up_password_text);
        this.f10256H = (LinearLayout) findViewById(R.id.email_login_layout);
        this.f10257I = (LinearLayout) findViewById(R.id.email_sign_up_layout);
        this.f10258J = (LinearLayout) findViewById(R.id.third_party_login_layout);
        this.f10259K = (CheckBox) findViewById(R.id.subscribe);
        m10660b();
        this.f10260L = new ProgressDialog(this.f10269b);
        this.f10260L.setProgressStyle(0);
        this.f10260L.setMessage(m10643a((int) R.string.login_in_progress));
        this.f10260L.setCanceledOnTouchOutside(false);
        this.f10260L.setOnCancelListener(new C2315A(this));
        C1246d.m6010a(this.f10269b).mo4591a("LOGIN/OPERATION", C1246d.f3942n, C1246d.f3933e);
    }

    /* renamed from: a */
    private String m10644a(int i, Object... objArr) {
        return C1974m.m9064a((Context) this, i, objArr);
    }

    /* renamed from: a */
    private String m10643a(int i) {
        return C1974m.m9063a((Context) this, i);
    }

    /* renamed from: a */
    private boolean m10654a() {
        return C1617br.m7367a().mo6340g().mo7961a();
    }

    /* renamed from: b */
    private void m10660b() {
        this.f10270u.requestFocus();
        this.f10270u.setOnClickListener(new C2317C(this));
        this.f10271v.setOnClickListener(new C2319E(this));
        this.f10272w.setOnClickListener(new C2321G(this));
        this.f10274y.getPaint().setFlags(8);
        this.f10274y.setOnClickListener(new C2323I(this));
        this.f10275z.getPaint().setFlags(8);
        this.f10275z.setOnClickListener(new C2324J(this));
        this.f10273x.setOnClickListener(new C2325K(this));
        this.f10249A.setOnClickListener(new C2326L(this));
        this.f10250B.setOnClickListener(new C2342o(this));
        TextView textView = (TextView) findViewById(R.id.forget_password_btn);
        textView.getPaint().setFlags(8);
        textView.setOnClickListener(new C2344q(this));
        m10669c();
    }

    /* renamed from: c */
    private void m10669c() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        int i = 0;
        if (m10655a(C1135d.OEM_SHOW_GOOGLE_LOGIN_BUTTON)) {
            this.f10270u.setVisibility(0);
            z = true;
        } else {
            this.f10270u.setVisibility(8);
            z = false;
        }
        if (m10655a(C1135d.OEM_SHOW_FACEBOOK_LOGIN_BUTTON)) {
            this.f10271v.setVisibility(0);
            z2 = true;
        } else {
            this.f10271v.setVisibility(8);
            z2 = false;
        }
        if (m10655a(C1135d.OEM_SHOW_TWITTER_LOGIN_BUTTON)) {
            this.f10272w.setVisibility(0);
            z2 = true;
        } else {
            this.f10272w.setVisibility(8);
        }
        if (m10655a(C1135d.OEM_SHOW_EMAIL_LOGIN_BUTTON)) {
            this.f10273x.setVisibility(0);
        } else {
            this.f10273x.setVisibility(8);
            z3 = z2;
        }
        View findViewById = findViewById(R.id.login_or_division);
        if (findViewById != null) {
            if (!z || !z3) {
                i = 4;
            }
            findViewById.setVisibility(i);
        }
    }

    /* renamed from: a */
    private boolean m10655a(C1135d dVar) {
        return C1132b.m5662a() && C1132b.m5654a((Context) this).mo4392a(dVar, (Boolean) true).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (m10654a()) {
            finish();
            return;
        }
        C1600bf.m7224a(this.f10269b);
        if (this.f10268V != null && !this.f10265Q && !this.f10266R) {
            this.f10268V.sendEmptyMessageDelayed(256, 2000);
        }
        if (this.f10266R) {
            m10695k();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        m10697l();
        if (this.f10268V != null) {
            this.f10268V.removeMessages(256);
        }
        this.f10260L = null;
        m10682f();
        C1600bf.m7225b(this.f10269b);
        C1368X.m6325e();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f10264P) {
            if (i == 1) {
                if (i2 == -1) {
                    m10666b(this.f10263O);
                } else if (i2 == 0) {
                    m10670c(2);
                }
            } else if (i != 2) {
            } else {
                if (i2 != -1) {
                    m10670c(2);
                } else if (intent != null) {
                    this.f10265Q = true;
                    C1246d.m6010a(this.f10269b).mo4591a(C1246d.f3766aj, "WEB_AUTH_SUCCESS", C1246d.f3933e);
                    m10653a(intent.getStringExtra("token"), C2300u.f10103a);
                } else {
                    m10670c(3);
                }
            }
        }
    }

    public void onBackPressed() {
        int e = m10679e();
        if ((e == 1 || e == 2) && (this.f10260L == null || !this.f10260L.isShowing())) {
            m10661b(0);
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m10678d() {
        this.f10264P = true;
        m10682f();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10661b(int i) {
        switch (i) {
            case 0:
                m10645a((View) this.f10257I, false);
                m10645a((View) this.f10256H, false);
                m10645a((View) this.f10258J, true);
                setTitle(m10643a((int) R.string.vip_login));
                return;
            case 1:
                m10645a((View) this.f10258J, false);
                m10645a((View) this.f10257I, false);
                m10645a((View) this.f10256H, true);
                setTitle(m10643a((int) R.string.vip_login));
                return;
            case 2:
                m10645a((View) this.f10258J, false);
                m10645a((View) this.f10256H, false);
                m10645a((View) this.f10257I, true);
                setTitle(m10643a((int) R.string.sign_up));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m10645a(View view, boolean z) {
        if (view != null) {
            if (z) {
                if (!view.isShown()) {
                    view.setVisibility(0);
                    view.startAnimation(AnimationUtils.loadAnimation(this.f10269b, R.anim.fade_in));
                }
            } else if (view.isShown()) {
                view.startAnimation(AnimationUtils.loadAnimation(this.f10269b, R.anim.fade_out));
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: e */
    private int m10679e() {
        if (this.f10258J != null && this.f10258J.isShown()) {
            return 0;
        }
        if (this.f10256H != null && this.f10256H.isShown()) {
            return 1;
        }
        if (this.f10257I == null || !this.f10257I.isShown()) {
            return -1;
        }
        return 2;
    }

    /* renamed from: f */
    private void m10682f() {
        if (this.f10262N != null) {
            ArrayList arrayList = new ArrayList(this.f10262N);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    if (next instanceof C2373x) {
                        ((C2373x) next).mo8061b();
                    } else if (next instanceof AsyncTask) {
                        ((AsyncTask) next).cancel(true);
                    } else if (next instanceof Thread) {
                        ((Thread) next).interrupt();
                    }
                }
            }
            arrayList.clear();
            this.f10262N.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10670c(int i) {
        m10697l();
        String str = null;
        if (i == 4 || i == 1) {
            m10693j();
        } else if (i == 0 || i == 5) {
            str = m10643a((int) R.string.login_error_try_later);
        } else if (i == 2) {
            str = m10643a((int) R.string.login_error_cancelled);
            C1246d.m6010a(this.f10269b).mo4591a("LOGIN/OPERATION", C1246d.f3941m, C1246d.f3933e);
        } else if (i == 3) {
            str = m10643a((int) R.string.login_error_web_auth_fail);
        } else if ((i & 16777216) != 0) {
            int i2 = i ^ 16777216;
            if (i2 == 5002) {
                str = m10643a((int) R.string.login_error_account_not_exist);
            } else if (i2 == 5001) {
                str = m10643a((int) R.string.login_error_password_error);
            } else if (i2 == 4100) {
                str = m10643a((int) R.string.register_error_account_exist);
            } else {
                str = m10643a((int) R.string.login_error_try_later) + " " + m10644a((int) R.string.error_code_string, Integer.valueOf(i2));
            }
        } else if (i == 6) {
            str = m10643a((int) R.string.login_error_email_invalid);
        } else if (i == 7) {
            str = m10643a((int) R.string.login_error_password_invalid_short);
        } else if (i == 8) {
            str = m10643a((int) R.string.login_error_password_invalid_content);
        } else if (i == 9) {
            str = m10643a((int) R.string.login_error_email_not_match);
        }
        if (!TextUtils.isEmpty(str)) {
            C2849W.m13205a().mo9478a(str, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10651a(C2339l lVar) {
        C1246d.m6010a(this.f10269b).mo4591a("LOGIN/OPERATION", C1246d.f3946r, C1246d.f3933e);
        if (lVar == null || !lVar.mo7961a()) {
            C1617br.m7367a().mo6328a((C1617br.C1618a) new C2345r(this));
        } else {
            C1617br.m7367a().mo6330a(lVar);
            C1617br.m7367a().mo6342i();
        }
        C2849W.m13205a().mo9478a(m10643a((int) R.string.login_success_info), false);
        m10686g();
        m10697l();
        m10684f(lVar != null ? lVar.mo7964d() : null);
    }

    /* renamed from: g */
    private void m10686g() {
        String c = C2188Q.m9853a().mo7683c();
        Message obtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 2);
        bundle.putInt(IPCManager.SETTING_KEY, 88);
        bundle.putString(IPCManager.SETTING_VALUE, c);
        obtain.setData(bundle);
        C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
    }

    /* renamed from: h */
    private void m10688h() {
        if (Build.VERSION.SDK_INT > 8) {
            C2894d.C2895a aVar = new C2894d.C2895a(this);
            aVar.setTitle(m10643a((int) R.string.no_google_account_warning_title)).setMessage(m10643a((int) R.string.no_google_account_warning_msg)).setPositiveButton(m10643a((int) R.string.go_to_add_account_btn_title), new C2346s(this)).setNegativeButton(m10643a(17039360), (DialogInterface.OnClickListener) null);
            aVar.create().show();
            return;
        }
        Toast.makeText(this, m10643a((int) R.string.no_google_account_warning_msg), 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m10691i() {
        this.f10264P = false;
        this.f10265Q = false;
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.f10269b) != 0) {
            m10693j();
            return;
        }
        m10695k();
        AccountManager accountManager = AccountManager.get(this.f10269b);
        if (accountManager == null) {
            m10670c(4);
            return;
        }
        Account[] accountArr = null;
        try {
            accountArr = accountManager.getAccountsByType("com.google");
        } catch (SecurityException e) {
        }
        C1246d.m6010a(this.f10269b).mo4591a(C1246d.f3766aj, "LOCAL_AUTH_START", C1246d.f3933e);
        if (accountArr == null || accountArr.length == 0) {
            C1246d.m6010a(this.f10269b).mo4591a(C1246d.f3766aj, "ADD_ACCOUNT_START", C1246d.f3933e);
            m10688h();
            m10697l();
        } else if (accountArr.length > 1) {
            String[] strArr = new String[accountArr.length];
            for (int i = 0; i < accountArr.length; i++) {
                strArr[i] = accountArr[i].name;
            }
            C2894d.C2895a aVar = new C2894d.C2895a(this.f10269b);
            aVar.setTitle(m10643a((int) R.string.login_choose_account_dialog_title));
            aVar.setItems(strArr, new C2347t(this, strArr));
            aVar.setOnCancelListener(new C2348u(this));
            aVar.show();
        } else if (accountArr.length == 1) {
            m10666b(accountArr[0].name);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10666b(String str) {
        this.f10263O = str;
        C2328a aVar = new C2328a(this.f10269b, this.f10268V, str);
        aVar.mo7946a((Runnable) new C2349v(this, aVar));
        m10652a((Object) aVar);
        try {
            aVar.execute(new Void[0]);
            this.f10267S = System.currentTimeMillis();
        } catch (Exception e) {
            m10665b((Object) aVar);
            m10670c(0);
        }
    }

    /* renamed from: j */
    private void m10693j() {
        this.f10264P = false;
        startActivityForResult(new Intent(this.f10269b, GoogleLoginWebviewActivity.class), 2);
        C1246d.m6010a(this.f10269b).mo4591a(C1246d.f3766aj, "WEB_AUTH_START", C1246d.f3933e);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10673c(String str) {
        this.f10264P = false;
        m10695k();
        C1600bf.m7224a(this.f10269b);
        if (this.f10261M == null) {
            this.f10261M = new C2350w(this);
        }
        Platform platform = ShareSDK.getPlatform(this.f10269b, str);
        platform.setPlatformActionListener(this.f10261M);
        platform.authorize();
        this.f10266R = true;
        C1246d.m6010a(this.f10269b).mo4591a(C1246d.f3764ah + str.toUpperCase(), "START", C1246d.f3933e);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m10677d(String str) {
        if (Facebook.NAME.equals(str)) {
            return C2300u.f10104b;
        }
        if (Twitter.NAME.equals(str)) {
            return C2300u.f10105c;
        }
        return null;
    }

    /* renamed from: e */
    private String m10680e(String str) {
        if (C2300u.f10104b.equals(str)) {
            return Facebook.NAME;
        }
        if (C2300u.f10105c.equals(str)) {
            return Twitter.NAME;
        }
        if (C2300u.f10103a.equals(str)) {
            return "Google";
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10653a(String str, String str2) {
        C2373x xVar = new C2373x(new C2300u(str, str2));
        m10695k();
        m10652a((Object) xVar);
        long currentTimeMillis = System.currentTimeMillis();
        String e = m10680e(str2);
        xVar.mo8060a((C2373x.C2376b) new C2352y(this, xVar, e, currentTimeMillis));
        C1246d.m6010a(this.f10269b).mo4591a("LOGIN/3P_LOGIN/" + e, "START", C1246d.f3933e);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10667b(String str, String str2) {
        this.f10264P = false;
        C2373x xVar = new C2373x(new C2300u(str, str2, C2300u.f10108f));
        m10695k();
        m10652a((Object) xVar);
        xVar.mo8060a((C2373x.C2376b) new C2353z(this, xVar, System.currentTimeMillis()));
        C1246d.m6010a(this.f10269b).mo4591a("LOGIN/EMAIL_LOGIN", "START", C1246d.f3933e);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10674c(String str, String str2) {
        this.f10264P = false;
        C2373x xVar = new C2373x(new C2248H(str, str2, this.f10259K.isChecked()));
        m10695k();
        m10652a((Object) xVar);
        xVar.mo8060a((C2373x.C2376b) new C2316B(this, xVar, System.currentTimeMillis()));
        C1246d.m6010a(this.f10269b).mo4591a("LOGIN/REGISTER", "START", C1246d.f3933e);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m10695k() {
        if (this.f10268V != null) {
            this.f10268V.removeMessages(256);
        }
        if (this.f10260L != null && !this.f10260L.isShowing()) {
            this.f10260L.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m10697l() {
        if (this.f10260L != null && this.f10260L.isShowing()) {
            this.f10260L.dismiss();
        }
    }

    /* renamed from: a */
    private void m10652a(Object obj) {
        if (this.f10262N != null) {
            this.f10262N.add(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10665b(Object obj) {
        if (this.f10262N != null) {
            this.f10262N.remove(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public boolean m10699m() {
        return (this.f10262N != null && !this.f10262N.isEmpty()) || this.f10266R;
    }

    /* renamed from: f */
    private void m10684f(String str) {
        if (TextUtils.isEmpty(str)) {
            setResult(0);
        } else {
            Intent intent = new Intent();
            intent.putExtra("name", str);
            setResult(-1, intent);
        }
        finish();
    }

    /* renamed from: a */
    public static boolean m10658a(String str) {
        if (TextUtils.isEmpty(str) || !str.matches("[^@]+@[^@]+\\.[^@]+$") || str.getBytes().length != str.length()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public int m10685g(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 5) {
            return 7;
        }
        if (str.matches("[a-zA-Z0-9/.\\-_+=]+")) {
            return -1;
        }
        return 8;
    }
}
