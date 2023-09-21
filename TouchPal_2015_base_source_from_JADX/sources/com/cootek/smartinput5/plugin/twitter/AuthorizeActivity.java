package com.cootek.smartinput5.plugin.twitter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.util.Iterator;
import java.util.Set;

public class AuthorizeActivity extends Activity {

    /* renamed from: a */
    public static final String f10501a = "com.cootek.smartinput.intent.category.MINIMODE";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2417r f10502b = null;

    /* renamed from: c */
    private ProgressDialog f10503c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2421v f10504d;

    /* renamed from: e */
    private Handler f10505e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f10506f = false;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f10505e = new Handler();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        boolean z;
        super.onPostCreate(bundle);
        this.f10502b = C2417r.m11027a();
        Set<String> categories = getIntent().getCategories();
        if (categories != null) {
            Iterator<String> it = categories.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("com.cootek.smartinput.intent.category.MINIMODE".equals(it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z || !m10961a()) {
            m10964b();
        }
    }

    /* renamed from: a */
    private boolean m10961a() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("twitter://post"));
        intent.addFlags(Engine.EXCEPTION_ERROR);
        try {
            startActivity(intent);
            finish();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: b */
    private void m10964b() {
        C2400a.m10989a((Context) this);
        if (!C2400a.m10988a().mo8120c() || this.f10502b.mo8176g()) {
            this.f10506f = false;
            m10966c();
            new C2401b(this).start();
            return;
        }
        m10971e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10960a(C2421v vVar) {
        this.f10505e.post(new C2403d(this, vVar));
    }

    /* renamed from: c */
    private void m10966c() {
        this.f10503c = new ProgressDialog(this);
        this.f10503c.setTitle(C1974m.m9063a((Context) this, (int) R.string.twitter_auth_title));
        this.f10503c.setMessage(C1974m.m9063a((Context) this, (int) R.string.twitter_redirect_tip));
        this.f10503c.setCancelable(true);
        this.f10503c.setOnCancelListener(new C2404e(this));
        this.f10503c.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m10968d() {
        if (this.f10503c != null) {
            this.f10503c.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m10971e() {
        Intent intent = new Intent();
        intent.setClass(this, ShareActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.putExtras(getIntent());
        startActivity(intent);
        finish();
    }
}
