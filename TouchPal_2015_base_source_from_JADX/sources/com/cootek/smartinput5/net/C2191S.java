package com.cootek.smartinput5.net;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.CallLog;
import android.util.Log;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2220ah;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2254L;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2299t;
import com.cootek.smartinput5.net.cmd.C2305z;

/* renamed from: com.cootek.smartinput5.net.S */
/* compiled from: NewLogChecker */
public class C2191S extends C2220ah implements C2373x.C2376b {

    /* renamed from: a */
    public static final String f9258a = "NewLogChecker";

    /* renamed from: b */
    public static final String f9259b = "call_log_control";

    public C2191S(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.NEW_LOG_NEXT_CHECK_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.NEW_LOG_NEXT_CHECK_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        if (Settings.getInstance().getBoolSetting(Settings.USERDATA_COLLECT_ENABLE) && C2188Q.m9853a().mo7685e()) {
            m9872e();
        }
        mo7752i();
    }

    /* renamed from: e */
    private void m9872e() {
        new C2192a(this, (C2193T) null).execute(new Integer[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m9873g() {
        C2305z zVar = new C2305z();
        zVar.f10165a = f9259b;
        new C2373x(zVar).mo8060a((C2373x.C2376b) new C2193T(this));
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        if (p.f9748Q == 1003 && C2188Q.m9853a() != null && C2188Q.m9853a().mo7685e()) {
            new C2373x(new C2254L()).mo8060a((C2373x.C2376b) null);
        }
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
    }

    /* renamed from: com.cootek.smartinput5.net.S$a */
    /* compiled from: NewLogChecker */
    private class C2192a extends AsyncTask<Integer, String, String> {
        private C2192a() {
        }

        /* synthetic */ C2192a(C2191S s, C2193T t) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Integer... numArr) {
            Cursor cursor;
            long longSetting = Settings.getInstance().getLongSetting(Settings.NEW_LOG_LAST_CHECK_TIMESTAMP);
            long currentTimeMillis = System.currentTimeMillis();
            Settings.getInstance().setLongSetting(Settings.NEW_LOG_LAST_CHECK_TIMESTAMP, currentTimeMillis, false);
            ContentResolver contentResolver = C1368X.m6313b().getContentResolver();
            String str = "date < " + String.valueOf(currentTimeMillis) + " and " + "date" + " > " + String.valueOf(longSetting);
            int j = C2254L.m10288j();
            Uri uri = CallLog.Calls.CONTENT_URI;
            String[] strArr = j == 1 ? new String[]{"number", "type", PresentConfigXmlTag.TOAST_ATTR_TOAST_DURATION, "date", "name", C2254L.f9647e} : new String[]{"number", "type", PresentConfigXmlTag.TOAST_ATTR_TOAST_DURATION, "date", "name"};
            String str2 = "date DESC";
            if (longSetting == 0) {
                str2 = str2 + " LIMIT 1";
            }
            try {
                cursor = contentResolver.query(uri, strArr, str, (String[]) null, str2);
            } catch (Exception e) {
                cursor = null;
            }
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        do {
                            C2254L.C2255a a = C2254L.m10281a(cursor);
                            if (a != null) {
                                C2299t.m10532a(a);
                            }
                        } while (cursor.moveToNext());
                    }
                    cursor.close();
                } catch (Exception e2) {
                    Log.e("", e2.toString());
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e3) {
                        }
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e4) {
                        }
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e5) {
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            C2188Q a = C2188Q.m9853a();
            if (a != null && a.mo7685e() && C2299t.m10533j() > 0) {
                C2191S.this.m9873g();
            }
        }
    }
}
