package com.cootek.smartinput5.func.learnmanager;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.Preference;
import android.text.TextUtils;
import android.widget.Toast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.learnmanager.C1823f;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.cootek.smartinput5.func.learnmanager.a */
/* compiled from: LearnManager */
public class C1813a {

    /* renamed from: a */
    public static final String f6027a = "failedTitle";

    /* renamed from: b */
    public static final String f6028b = "failedMessage";

    /* renamed from: c */
    public static final String f6029c = "failedProbiderType";

    /* renamed from: d */
    public static final int f6030d = 0;

    /* renamed from: e */
    public static final int f6031e = 1;

    /* renamed from: f */
    public static final int f6032f = 0;

    /* renamed from: g */
    public static final int f6033g = 1;

    /* renamed from: h */
    public static final int f6034h = 2;

    /* renamed from: i */
    public static final int f6035i = 3;

    /* renamed from: j */
    private final String f6036j = "LearnManager";
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1814a f6037k;

    /* renamed from: l */
    private C1823f f6038l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Context f6039m;

    /* renamed from: n */
    private C1819b[] f6040n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Queue<String> f6041o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Queue<Integer> f6042p;

    public C1813a(Context context) {
        this.f6039m = context;
        C1823f.m8405a(context);
        this.f6038l = C1823f.m8404a();
        m8369b();
        this.f6041o = new ConcurrentLinkedQueue();
        this.f6042p = new ConcurrentLinkedQueue();
    }

    /* renamed from: b */
    private void m8369b() {
        this.f6040n = new C1819b[]{new C1825g(this.f6039m), new C1831l(this.f6039m)};
    }

    /* renamed from: a */
    public void mo6836a(int i, Context context, Preference preference) {
        mo6837a(i, context, preference, (Bundle) null);
    }

    /* renamed from: a */
    public void mo6837a(int i, Context context, Preference preference, Bundle bundle) {
        if (context != null) {
            mo6838a(0, preference, this.f6040n[i]);
            if (!this.f6040n[i].mo6848a()) {
                this.f6040n[i].f6069l = preference;
                this.f6040n[i].mo6847a(bundle);
                this.f6040n[i].mo6846a(context, new C1816c(preference, this.f6040n[i]));
            }
        }
    }

    /* renamed from: a */
    public void mo6835a(int i) {
        this.f6040n[i].mo6846a(this.f6039m, new C1816c(this.f6040n[i].f6069l, this.f6040n[i]));
    }

    /* renamed from: com.cootek.smartinput5.func.learnmanager.a$c */
    /* compiled from: LearnManager */
    public class C1816c {

        /* renamed from: b */
        private Preference f6050b;

        /* renamed from: c */
        private C1819b f6051c;

        public C1816c(Preference preference, C1819b bVar) {
            this.f6050b = preference;
            this.f6051c = bVar;
        }

        /* renamed from: a */
        public void mo6845a() {
            C1814a unused = C1813a.this.f6037k = new C1814a(this.f6051c);
            C1813a.this.f6037k.execute(new Preference[]{this.f6050b});
        }
    }

    /* renamed from: a */
    public C1823f mo6834a() {
        return this.f6038l;
    }

    /* renamed from: com.cootek.smartinput5.func.learnmanager.a$a */
    /* compiled from: LearnManager */
    private class C1814a extends AsyncTask<Preference, Integer, Object> {

        /* renamed from: b */
        private C1819b f6044b;

        /* renamed from: c */
        private Preference f6045c;

        public C1814a(C1819b bVar) {
            this.f6044b = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object doInBackground(Preference... preferenceArr) {
            this.f6045c = preferenceArr[0];
            return this.f6044b.mo6849a(C1813a.this.f6039m);
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            String[] strArr = (String[]) obj;
            if (this.f6044b.mo6850b()) {
                C1813a.this.mo6838a(2, this.f6045c, this.f6044b);
            } else if (strArr == null || strArr.length == 0) {
                C1813a.this.mo6838a(3, this.f6045c, this.f6044b);
            } else {
                C1813a.this.mo6838a(1, this.f6045c, this.f6044b);
                for (String add : strArr) {
                    C1813a.this.f6041o.add(add);
                    C1813a.this.f6042p.add(Integer.valueOf(this.f6044b.mo6860l()));
                }
                C1813a.this.m8371c();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m8371c() {
        if (C1368X.m6324d() && !TextUtils.isEmpty(this.f6041o.peek())) {
            Okinawa h = C1368X.m6320c().mo5835h();
            h.fireTransactionOperation(1);
            while (!this.f6041o.isEmpty()) {
                String poll = this.f6041o.poll();
                int intValue = this.f6042p.poll().intValue();
                if (!TextUtils.isEmpty(poll)) {
                    h.fireLearnTextOperation(poll, intValue, C1819b.f6065h);
                }
            }
            h.fireTransactionOperation(2);
            h.processEvent();
        }
    }

    /* renamed from: a */
    public void mo6838a(int i, Preference preference, C1819b bVar) {
        C1823f.C1824a dVar;
        String str = null;
        int i2 = 0;
        switch (i) {
            case 0:
                Toast.makeText(this.f6039m, C1974m.m9063a(this.f6039m, (int) R.string.learn_text_hint), 1).show();
                dVar = null;
                break;
            case 1:
                dVar = new C1818e(bVar);
                i2 = bVar.mo6853e();
                str = bVar.mo6852d();
                break;
            case 2:
                dVar = new C1815b(bVar);
                i2 = bVar.mo6855g();
                str = bVar.mo6854f();
                break;
            case 3:
                dVar = new C1817d(bVar);
                i2 = bVar.mo6857i();
                str = bVar.mo6856h();
                break;
            default:
                dVar = null;
                break;
        }
        if (dVar != null) {
            Settings.getInstance().setIntSetting(bVar.mo6859k(), i2);
            preference.setSummary(str);
            this.f6038l.mo6866a(dVar);
        }
    }

    /* renamed from: com.cootek.smartinput5.func.learnmanager.a$e */
    /* compiled from: LearnManager */
    public class C1818e extends C1823f.C1824a {

        /* renamed from: m */
        private PendingIntent f6056m = mo6870a(0);

        /* renamed from: n */
        private C1819b f6057n;

        public C1818e(C1819b bVar) {
            super(bVar.mo6858j());
            this.f6057n = bVar;
            this.f6090l.flags = 16;
            this.f6090l.defaults = 2;
        }

        /* renamed from: a */
        public void mo6843a() {
            Runnable m = this.f6057n.mo6861m();
            if (m != null) {
                m.run();
            }
        }

        /* renamed from: b */
        public void mo6844b() {
            String c = this.f6057n.mo6851c();
            String d = this.f6057n.mo6852d();
            this.f6090l.tickerText = c;
            this.f6090l.setLatestEventInfo(C1813a.this.f6039m, c, d, this.f6056m);
        }
    }

    /* renamed from: com.cootek.smartinput5.func.learnmanager.a$d */
    /* compiled from: LearnManager */
    public class C1817d extends C1823f.C1824a {

        /* renamed from: m */
        private PendingIntent f6053m = mo6870a(1);

        /* renamed from: n */
        private C1819b f6054n;

        public C1817d(C1819b bVar) {
            super(bVar.mo6858j());
            this.f6054n = bVar;
            this.f6090l.flags = 16;
            this.f6090l.defaults = 1;
        }

        /* renamed from: b */
        public void mo6844b() {
            String c = this.f6054n.mo6851c();
            String h = this.f6054n.mo6856h();
            this.f6090l.tickerText = c;
            try {
                this.f6090l.setLatestEventInfo(C1813a.this.f6039m, c, h, this.f6053m);
            } catch (NullPointerException e) {
            }
        }
    }

    /* renamed from: com.cootek.smartinput5.func.learnmanager.a$b */
    /* compiled from: LearnManager */
    public class C1815b extends C1823f.C1824a {

        /* renamed from: m */
        private PendingIntent f6047m = mo6870a(0);

        /* renamed from: n */
        private C1819b f6048n;

        public C1815b(C1819b bVar) {
            super(bVar.mo6858j());
            this.f6048n = bVar;
            this.f6090l.flags = 16;
            this.f6090l.defaults = 2;
        }

        /* renamed from: a */
        public void mo6843a() {
            Intent intent = new Intent();
            intent.setClass(C1813a.this.f6039m, LearnRetryActivity.class);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            intent.putExtra(C1813a.f6027a, this.f6048n.mo6851c());
            intent.putExtra(C1813a.f6028b, this.f6048n.mo6854f());
            intent.putExtra(C1813a.f6029c, this.f6048n.mo6862n());
            C1813a.this.f6039m.startActivity(intent);
        }

        /* renamed from: b */
        public void mo6844b() {
            String c = this.f6048n.mo6851c();
            String f = this.f6048n.mo6854f();
            this.f6090l.tickerText = c;
            this.f6090l.setLatestEventInfo(C1813a.this.f6039m, c, f, this.f6047m);
        }
    }
}
