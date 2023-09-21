package com.cootek.smartinput5.net;

import android.os.AsyncTask;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2220ah;

/* renamed from: com.cootek.smartinput5.net.L */
/* compiled from: LocalizeWebsiteChecker */
public class C2180L extends C2220ah {
    public C2180L(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.NEXT_LOCALIZE_WEB_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.NEXT_LOCALIZE_WEB_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        C2188Q.m9853a().mo7684d();
        if (C2188Q.m9853a().mo7685e()) {
            new C2182a().execute(new String[0]);
        }
    }

    /* renamed from: com.cootek.smartinput5.net.L$a */
    /* compiled from: LocalizeWebsiteChecker */
    private class C2182a extends AsyncTask<String, Integer, Object> {
        private C2182a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object doInBackground(String... strArr) {
            return Boolean.valueOf(C2232as.m10118a().mo7759b());
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            if (((Boolean) obj).booleanValue()) {
                C2180L.this.mo7752i();
            } else {
                C2180L.this.mo6538f();
            }
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
            C2180L.this.mo6538f();
        }
    }
}
