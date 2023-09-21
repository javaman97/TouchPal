package com.cootek.smartinput5.func.learnmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.learnmanager.C1813a;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.plugin.twitter.C2400a;
import com.cootek.smartinput5.plugin.twitter.C2417r;
import com.cootek.smartinput5.plugin.twitter.C2421v;
import com.cootek.smartinput5.plugin.twitter.C2423x;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.learnmanager.l */
/* compiled from: TwitterLearnProvider */
public class C1831l extends C1819b {

    /* renamed from: m */
    public static final String f6114m = "followUs";

    /* renamed from: n */
    public static final String f6115n = "tweetAfterLearning";

    /* renamed from: o */
    public static final String f6116o = "tweetContent";

    /* renamed from: p */
    public static Activity f6117p;

    /* renamed from: q */
    public static boolean f6118q;

    /* renamed from: r */
    public static boolean f6119r;

    /* renamed from: s */
    public static boolean f6120s = false;

    /* renamed from: t */
    private final int f6121t = 100;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C2417r f6122u;

    /* renamed from: v */
    private Bundle f6123v;

    /* renamed from: w */
    private Handler f6124w = new Handler();

    public C1831l(Context context) {
        super(context);
        f6119r = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String[] mo6849a(Context context) {
        return m8454o();
    }

    /* renamed from: o */
    private String[] m8454o() {
        String[] strArr;
        try {
            strArr = this.f6122u.mo8164a(100);
        } catch (C2421v e) {
            e.printStackTrace();
            this.f6067j = true;
            strArr = null;
        }
        if (this.f6123v != null) {
            boolean z = this.f6123v.getBoolean(f6114m);
            boolean z2 = this.f6123v.getBoolean(f6115n);
            if (z && !C2417r.m11027a().mo8180k()) {
                m8456q();
            }
            if (z2) {
                m8451a(this.f6123v.getString(f6116o));
            }
            this.f6123v = null;
        }
        f6119r = false;
        return strArr;
    }

    /* renamed from: b */
    private void m8452b(Context context, C1813a.C1816c cVar) {
        C2423x.m11065a(new C1833m(this, cVar), (Runnable) null);
        C1832a aVar = new C1832a(this, (C1833m) null);
        f6120s = false;
        f6118q = false;
        Intent intent = new Intent();
        intent.setClass(context, TwitterProgressDialogActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        context.startActivity(intent);
        aVar.execute(new C1813a.C1816c[]{cVar});
    }

    /* renamed from: com.cootek.smartinput5.func.learnmanager.l$a */
    /* compiled from: TwitterLearnProvider */
    private class C1832a extends AsyncTask<C1813a.C1816c, Integer, Object> {
        private C1832a() {
        }

        /* synthetic */ C1832a(C1831l lVar, C1833m mVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object doInBackground(C1813a.C1816c... cVarArr) {
            try {
                C1831l.this.f6122u.mo8161a(C1831l.this.f6068k);
                C1831l.this.m8455p();
                if (C1831l.f6120s) {
                    return null;
                }
                C1831l.this.f6122u.mo8167b(C1831l.this.f6068k);
                C1831l.f6119r = false;
                return null;
            } catch (C2421v e) {
                C1831l.this.m8455p();
                if (C1831l.f6120s) {
                    return null;
                }
                C1831l.this.m8450a(e);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m8455p() {
        f6118q = true;
        if (f6117p != null) {
            f6117p.finish();
            f6117p = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8450a(C2421v vVar) {
        f6119r = false;
        this.f6124w.post(new C1834n(this, vVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo6851c() {
        return C1974m.m9063a(this.f6068k, (int) R.string.optpage_learn_twitter_title);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo6852d() {
        return C1974m.m9063a(this.f6068k, (int) R.string.twitter_learn_success);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo6854f() {
        return C1974m.m9063a(this.f6068k, (int) R.string.twitter_learn_failed);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6846a(Context context, C1813a.C1816c cVar) {
        f6119r = true;
        this.f6067j = false;
        this.f6068k = context;
        this.f6122u = C2417r.m11027a();
        f6117p = null;
        if (!C2400a.m10990b()) {
            C2400a.m10989a(this.f6068k);
        }
        if (!C2400a.m10988a().mo8120c() || this.f6122u.mo8176g()) {
            m8452b(context, cVar);
        } else {
            cVar.mo6845a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo6856h() {
        return C1974m.m9063a(this.f6068k, (int) R.string.twitter_import_none);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo6858j() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo6859k() {
        return Settings.TWITTER_LEARN_RESULT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo6853e() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo6855g() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo6857i() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo6860l() {
        return f6059b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Runnable mo6861m() {
        return new C1835o(this);
    }

    /* renamed from: q */
    private void m8456q() {
        new Thread(new C1836p(this)).start();
    }

    /* renamed from: a */
    private void m8451a(String str) {
        try {
            C2417r.m11027a().mo8172d(str);
        } catch (C2421v e) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo6862n() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6848a() {
        return f6119r;
    }

    /* renamed from: a */
    public void mo6847a(Bundle bundle) {
        this.f6123v = bundle;
    }
}
