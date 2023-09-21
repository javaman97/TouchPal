package com.cootek.smartinput5.plugin.weibo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.emoji.keyboard.touchpal.R;
import com.weibo.net.C4037a;
import com.weibo.net.C4042e;
import com.weibo.net.C4057s;
import com.weibo.net.C4060v;
import com.weibo.net.C4061w;
import java.util.Iterator;
import java.util.Set;

public class AuthorizeActivity extends C1976b {

    /* renamed from: a */
    public static final String f10738a = "com.cootek.smartinput.intent.category.MINIMODE";

    /* renamed from: b */
    public static final boolean f10739b = true;

    /* renamed from: d */
    private static final String f10740d = "weiboandroidsdk://FollowActivity";

    /* renamed from: e */
    private static final String f10741e = "3492286671";

    /* renamed from: f */
    private static final String f10742f = "c4b21948fbe3073c0a2d405d296983c8";

    /* renamed from: c */
    Handler f10743c = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ProgressDialog f10744g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f10745h = false;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        boolean z;
        super.onPostCreate(bundle);
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
        if (z || !m11153b()) {
            mo8254a();
        }
    }

    /* renamed from: a */
    public void mo8254a() {
        C2477a.m11174a((Context) this);
        if (C2477a.m11173a().mo8268b()) {
            m11157d();
        } else {
            m11158e();
        }
    }

    /* renamed from: b */
    private boolean m11153b() {
        Intent intent = new Intent();
        intent.setAction("com.sina.weibo.intent.action.NEW_BLOG");
        intent.putExtra("com.sina.weibo.intent.extra.TEXT", " ");
        intent.putExtra("com.sina.weibo.intent.extra.IMAGE", Bundle.EMPTY);
        try {
            startActivity(intent);
            finish();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    private void m11155c() {
        this.f10744g = new ProgressDialog(this);
        this.f10744g.setTitle(getResString(R.string.weibo_auth_title));
        this.f10744g.setMessage(getResString(R.string.weibo_redirect_tip));
        this.f10744g.setCancelable(true);
        this.f10744g.setOnCancelListener(new C2478b(this));
        this.f10744g.show();
        new C2479c(this).start();
    }

    /* renamed from: d */
    private void m11157d() {
        startActivity(new Intent(this, FollowActivity.class));
        finish();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: a */
    public void mo8256a(String str) {
        if (this.f10745h) {
            this.f10745h = false;
            return;
        }
        this.f10743c.post(new C2480d(this));
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C4057s.f16523e + "?oauth_token=" + str + "&display=mobile"));
        Iterator<ResolveInfo> it = getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            if ("com.android.browser".equals(next.activityInfo.packageName)) {
                intent.setClassName(next.activityInfo.packageName, next.activityInfo.name);
                break;
            }
        }
        startActivity(intent);
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        finish();
    }

    /* renamed from: a */
    public void mo8255a(C4061w wVar) {
        wVar.printStackTrace();
        this.f10743c.post(new C2481e(this));
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f10744g != null && this.f10744g.isShowing()) {
            this.f10744g.dismiss();
        }
        super.onDestroy();
    }

    /* renamed from: e */
    private void m11158e() {
        new C2482f(this).start();
    }

    /* renamed from: com.cootek.smartinput5.plugin.weibo.AuthorizeActivity$a */
    class C2474a implements C4060v {
        C2474a() {
        }

        /* renamed from: a */
        public void mo8261a(Bundle bundle) {
            String string = bundle.getString("access_token");
            String string2 = bundle.getString(C4057s.f16527i);
            C4037a aVar = new C4037a(string, AuthorizeActivity.f10742f);
            aVar.mo15000b(string2);
            C4057s.m17245a().mo15019a(aVar);
            Intent intent = new Intent();
            intent.setClass(AuthorizeActivity.this, FollowActivity.class);
            AuthorizeActivity.this.startActivity(intent);
        }

        /* renamed from: a */
        public void mo8262a(C4042e eVar) {
            eVar.printStackTrace();
            AuthorizeActivity.this.f10743c.post(new C2483g(this));
        }

        /* renamed from: a */
        public void mo8260a() {
        }

        /* renamed from: a */
        public void mo8263a(C4061w wVar) {
            wVar.printStackTrace();
            AuthorizeActivity.this.f10743c.post(new C2484h(this));
        }
    }
}
