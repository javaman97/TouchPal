package com.cootek.smartinput5.func.learnmanager;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.google.android.gms.games.GamesClient;

/* renamed from: com.cootek.smartinput5.func.learnmanager.i */
/* compiled from: SmsImporter */
public class C1827i {

    /* renamed from: a */
    public static boolean f6103a = false;

    /* renamed from: b */
    private final int f6104b = 30;

    /* renamed from: c */
    private final int f6105c = GamesClient.STATUS_ACHIEVEMENT_UNLOCK_FAILURE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1825g f6106d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f6107e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String[] f6108f;

    /* renamed from: g */
    private int f6109g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f6110h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Runnable f6111i;

    public C1827i(Context context) {
        this.f6107e = context;
        this.f6106d = new C1825g(context);
        this.f6109g = 0;
        this.f6111i = new C1829j(this);
        this.f6110h = new Handler();
    }

    /* renamed from: a */
    public void mo6873a() {
        if (Settings.getInstance().getBoolSetting(Settings.SMS_AUTO_LEARN)) {
            if ((f6103a || !(this.f6108f == null || this.f6108f.length == 0)) && C1368X.m6324d()) {
                m8437b();
            }
        }
    }

    /* renamed from: b */
    private void m8437b() {
        if (Engine.isInitialized() && Engine.getInstance().getIms().isInputViewShown()) {
            return;
        }
        if (f6103a) {
            f6103a = false;
            new C1828a(this, (C1829j) null).execute(new String[0]);
            this.f6109g++;
            return;
        }
        if (this.f6108f != null) {
            int i = (this.f6109g - 1) * 30;
            int i2 = this.f6109g * 30;
            if (this.f6108f.length > i) {
                Okinawa h = C1368X.m6320c().mo5835h();
                h.fireTransactionOperation(1);
                while (true) {
                    if (i >= i2) {
                        break;
                    } else if (i >= this.f6108f.length) {
                        this.f6109g = -1;
                        f6103a = true;
                        break;
                    } else {
                        h.fireLearnTextOperation(this.f6108f[i], C1819b.f6058a, C1819b.f6065h);
                        i++;
                    }
                }
                h.fireTransactionOperation(2);
                h.processEvent();
            } else {
                this.f6109g = -1;
                f6103a = true;
            }
        } else {
            f6103a = true;
            this.f6109g = -1;
        }
        this.f6109g++;
        this.f6110h.postDelayed(this.f6111i, 3000);
    }

    /* renamed from: com.cootek.smartinput5.func.learnmanager.i$a */
    /* compiled from: SmsImporter */
    private class C1828a extends AsyncTask<String, Integer, String[]> {
        private C1828a() {
        }

        /* synthetic */ C1828a(C1827i iVar, C1829j jVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String[] doInBackground(String... strArr) {
            return C1827i.this.f6106d.mo6849a(C1827i.this.f6107e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String[] strArr) {
            super.onPostExecute(strArr);
            String[] unused = C1827i.this.f6108f = strArr;
            C1827i.this.f6110h.postDelayed(C1827i.this.f6111i, 3000);
        }
    }
}
