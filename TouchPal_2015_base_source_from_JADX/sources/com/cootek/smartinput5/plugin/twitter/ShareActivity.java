package com.cootek.smartinput5.plugin.twitter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

public class ShareActivity extends Activity {

    /* renamed from: a */
    public static final String f10507a = "twitter.ShareActivity.EXTRA_CONST_TEXT";

    /* renamed from: b */
    public static final String f10508b = "twitter.ShareActivity.EXTRA_FOLLOW_US";

    /* renamed from: c */
    public static final String f10509c = "twitter.ShareActivity.EXTRA_BUNDLE_SETTING_CHANGED_ON_SUCCEED";

    /* renamed from: d */
    public static final String f10510d = "twitter.ShareActivity.EXTRA_TEXT_EDITABLE";

    /* renamed from: e */
    public static final int f10511e = 140;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public EditText f10512f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f10513g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Button f10514h;

    /* renamed from: i */
    private Button f10515i;

    /* renamed from: j */
    private LinearLayout f10516j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ProgressDialog f10517k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2417r f10518l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Handler f10519m;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.twitter_share);
        this.f10518l = C2417r.m11027a();
        this.f10517k = new ProgressDialog(this);
        this.f10519m = new Handler();
        this.f10514h = (Button) findViewById(R.id.btnSend);
        this.f10515i = (Button) findViewById(R.id.btnClose);
        this.f10513g = (TextView) findViewById(R.id.tv_text_limit);
        this.f10516j = (LinearLayout) findViewById(R.id.ll_text_limit_unit);
        this.f10516j.setOnClickListener(new C2410k(this));
        this.f10514h.setOnClickListener(new C2412m(this));
        this.f10515i.setOnClickListener(new C2413n(this));
        this.f10512f = (EditText) findViewById(R.id.etEdit);
        this.f10512f.setHint(C1974m.m9063a((Context) this, (int) R.string.twitter_hint));
        this.f10512f.addTextChangedListener(new C2414o(this));
        String stringExtra = getIntent().getStringExtra(f10507a);
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f10512f.setText(stringExtra);
            boolean booleanExtra = getIntent().getBooleanExtra(f10510d, false);
            this.f10512f.setEnabled(booleanExtra);
            this.f10516j.setEnabled(booleanExtra);
        }
    }

    public void onDestroy() {
        if (this.f10517k != null && this.f10517k.isShowing()) {
            this.f10517k.dismiss();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10974a() {
        if (this.f10517k != null) {
            this.f10517k.setMessage(C1974m.m9063a((Context) this, (int) R.string.twitter_sending_msg));
            this.f10517k.setCancelable(true);
            this.f10517k.show();
        }
        String obj = this.f10512f.getText().toString();
        new C2398a(this, (C2410k) null).execute(new String[]{obj});
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10975b() {
        finish();
    }

    /* renamed from: com.cootek.smartinput5.plugin.twitter.ShareActivity$a */
    private class C2398a extends AsyncTask<String, Integer, Integer> {
        private C2398a() {
        }

        /* synthetic */ C2398a(ShareActivity shareActivity, C2410k kVar) {
            this();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(String... strArr) {
            int i = 0;
            if (ShareActivity.this.f10518l.mo8173d() == null) {
                ShareActivity.this.f10518l.mo8168b(C2400a.m10988a().mo8121d());
            }
            if (ShareActivity.this.getIntent().getBooleanExtra(ShareActivity.f10508b, false)) {
                ShareActivity.this.f10518l.mo8182m();
            }
            try {
                i = ShareActivity.this.f10518l.mo8172d(strArr[0]);
                if (ShareActivity.this.f10517k != null && ShareActivity.this.f10517k.isShowing()) {
                    ShareActivity.this.f10517k.dismiss();
                }
            } catch (C2421v e) {
                e.printStackTrace();
                ShareActivity.this.f10519m.post(new C2415p(this, e));
                if (ShareActivity.this.f10517k != null && ShareActivity.this.f10517k.isShowing()) {
                    ShareActivity.this.f10517k.dismiss();
                }
            } catch (Throwable th) {
                if (ShareActivity.this.f10517k != null && ShareActivity.this.f10517k.isShowing()) {
                    ShareActivity.this.f10517k.dismiss();
                }
                throw th;
            }
            return Integer.valueOf(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 200) {
                Bundle bundleExtra = ShareActivity.this.getIntent().getBundleExtra(ShareActivity.f10509c);
                if (bundleExtra != null) {
                    C1368X.m6320c().mo5839l().handleSettingsChanged(bundleExtra);
                    Message obtain = Message.obtain();
                    obtain.what = 3;
                    obtain.setData(bundleExtra);
                    C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
                }
                ShareActivity.this.m10975b();
                Toast.makeText(ShareActivity.this, C1974m.m9063a((Context) ShareActivity.this, (int) R.string.twitter_send_sucess), 1).show();
                return;
            }
            Toast.makeText(ShareActivity.this, C1974m.m9063a((Context) ShareActivity.this, (int) R.string.twitter_send_failed), 1).show();
        }
    }
}
