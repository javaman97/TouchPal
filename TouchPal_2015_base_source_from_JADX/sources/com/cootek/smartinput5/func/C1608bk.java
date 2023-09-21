package com.cootek.smartinput5.func;

import android.app.NotificationManager;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.cootek.smartinput.utilities.C0990F;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2183M;
import com.cootek.smartinput5.net.C2361q;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.bk */
/* compiled from: SuperDictManager */
public class C1608bk implements C2183M.C2184a {

    /* renamed from: a */
    public static final String f5174a = ".sdi";

    /* renamed from: b */
    public static final String f5175b = ".sdd";

    /* renamed from: c */
    public static final String f5176c = "cootek.smartinput.android.language_addition.superdict.";

    /* renamed from: d */
    public static final String f5177d = "pinyin";

    /* renamed from: e */
    private static final String f5178e = "SuperDictManager";

    /* renamed from: j */
    private static final String f5179j = "language";

    /* renamed from: k */
    private static final String f5180k = "compatible";

    /* renamed from: l */
    private static final String f5181l = "files";

    /* renamed from: m */
    private static final int f5182m = 0;

    /* renamed from: n */
    private static final int f5183n = 1;

    /* renamed from: f */
    private Context f5184f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f5185g;

    /* renamed from: h */
    private ArrayList<C1607bj> f5186h;

    /* renamed from: i */
    private ArrayList<C1610b> f5187i;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Handler f5188o = new C1613bn(this);

    /* renamed from: com.cootek.smartinput5.func.bk$b */
    /* compiled from: SuperDictManager */
    public interface C1610b {
        /* renamed from: i */
        void mo4252i();
    }

    public C1608bk(Context context) {
        this.f5184f = context;
        this.f5185g = false;
        this.f5187i = new ArrayList<>();
    }

    /* renamed from: a */
    public void mo6310a(C1610b bVar) {
        this.f5187i.add(bVar);
    }

    /* renamed from: b */
    public void mo6312b(C1610b bVar) {
        this.f5187i.remove(bVar);
    }

    /* renamed from: d */
    public static String m7345d(String str) {
        if (TextUtils.equals(C1549b.f4831b, str)) {
            return "cootek.smartinput.android.language_addition.superdict.pinyin";
        }
        return null;
    }

    /* renamed from: a */
    public void mo6308a(Context context, String str, String str2) {
        String a = C1974m.m9063a(context, (int) R.string.super_dict_display_name);
        String d = m7345d(str);
        if (d != null) {
            if (C1358O.m6234a(C1358O.f4193d) == null) {
                Toast.makeText(this.f5184f, C1974m.m9063a(context, (int) R.string.sdcard_not_ready_message), 1).show();
                return;
            }
            NotificationManager notificationManager = (NotificationManager) this.f5184f.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(Settings.SHOW_SUPER_DICT_DOWNLOAD_REMINDER);
            }
            if (Settings.getInstance().getBoolSetting(Settings.SHOW_SUPER_DICT_DOWNLOAD_REMINDER)) {
                Settings.getInstance().setBoolSetting(Settings.SHOW_SUPER_DICT_DOWNLOAD_REMINDER, false);
            }
            if (Settings.getInstance().getBoolSetting(Settings.SHOW_SUPER_DICT_EXPIRED_REMINDER)) {
                Settings.getInstance().setBoolSetting(Settings.SHOW_SUPER_DICT_EXPIRED_REMINDER, false);
            }
            this.f5185g = true;
            C2361q.m10797b().mo8022h(d, str2, a);
        }
    }

    /* renamed from: a */
    public void mo6309a(Context context, String str, String str2, boolean z) {
        C1584bI.m7131a(context, (Runnable) new C1611bl(this, context, str, str2), (Runnable) new C1612bm(this), z);
    }

    /* renamed from: a */
    public void mo5566a(String str, File file) {
        new C1609a(this, (C1611bl) null).execute(new File[]{file});
    }

    /* renamed from: com.cootek.smartinput5.func.bk$a */
    /* compiled from: SuperDictManager */
    private class C1609a extends AsyncTask<File, Integer, Integer> {
        private C1609a() {
        }

        /* synthetic */ C1609a(C1608bk bkVar, C1611bl blVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(File... fileArr) {
            File file = fileArr[0];
            C2361q.m10797b().mo8006b(file);
            int intValue = C1608bk.this.m7341a(file).intValue();
            boolean unused = C1608bk.this.f5185g = false;
            return Integer.valueOf(intValue);
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            C1608bk.this.f5188o.sendEmptyMessage(num.intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Integer m7341a(File file) {
        int i = 0;
        if (file != null) {
            try {
                C0990F.m5124a(file, file.getParentFile());
                i = 1;
            } catch (Exception e) {
                e.printStackTrace();
                C1017y.m5224c(f5178e, "SuperDictFile zip exception thrown");
            }
            file.delete();
        }
        return i;
    }

    /* renamed from: a */
    public void mo6307a() {
        File[] listFiles;
        String a = C1974m.m9063a(this.f5184f, (int) R.string.SUPER_DICT_TARGET_VERSION);
        File a2 = C1358O.m6234a(C1358O.f4193d);
        this.f5186h = new ArrayList<>();
        if (a2 != null && (listFiles = a2.listFiles(new C1615bp(this))) != null) {
            for (File a3 : listFiles) {
                C1607bj a4 = m7339a(a3, a);
                if (a4 != null) {
                    this.f5186h.add(a4);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077 A[SYNTHETIC, Splitter:B:28:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087 A[SYNTHETIC, Splitter:B:37:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0094 A[SYNTHETIC, Splitter:B:44:0x0094] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0072=Splitter:B:25:0x0072, B:34:0x0082=Splitter:B:34:0x0082} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.cootek.smartinput5.func.C1607bj m7339a(java.io.File r9, java.lang.String r10) {
        /*
            r8 = this;
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0070, JSONException -> 0x0080, all -> 0x0090 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x0070, JSONException -> 0x0080, all -> 0x0090 }
            long r4 = r9.length()     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            int r0 = (int) r4     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            r2.read(r0)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            java.lang.String r5 = "utf-8"
            r4.<init>(r0, r5)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            java.lang.String r0 = "language"
            java.lang.String r4 = r3.getString(r0)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            java.lang.String r0 = "compatible"
            java.lang.String r5 = r3.getString(r0)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            java.lang.String r0 = "files"
            org.json.JSONArray r3 = r3.getJSONArray(r0)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            int r0 = r3.length()     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            r0 = 0
        L_0x0035:
            int r7 = r6.length     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            if (r0 >= r7) goto L_0x0041
            java.lang.String r7 = r3.getString(r0)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            r6[r0] = r7     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            int r0 = r0 + 1
            goto L_0x0035
        L_0x0041:
            com.cootek.smartinput5.func.bj r0 = new com.cootek.smartinput5.func.bj     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            r0.<init>(r4, r5, r6, r9)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            boolean r3 = android.text.TextUtils.equals(r10, r5)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            if (r3 == 0) goto L_0x0057
            if (r2 == 0) goto L_0x0051
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0051:
            return r0
        L_0x0052:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0051
        L_0x0057:
            com.cootek.smartinput5.engine.Settings r3 = com.cootek.smartinput5.engine.Settings.getInstance()     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            r4 = 302(0x12e, float:4.23E-43)
            r5 = 1
            r3.setBoolSetting(r4, r5)     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            r0.mo6306b()     // Catch:{ IOException -> 0x00a1, JSONException -> 0x009f }
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x006b }
        L_0x0069:
            r0 = r1
            goto L_0x0051
        L_0x006b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0069
        L_0x0070:
            r0 = move-exception
            r2 = r1
        L_0x0072:
            r0.printStackTrace()     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x007b }
            goto L_0x0069
        L_0x007b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0069
        L_0x0080:
            r0 = move-exception
            r2 = r1
        L_0x0082:
            r0.printStackTrace()     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x008b }
            goto L_0x0069
        L_0x008b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0069
        L_0x0090:
            r0 = move-exception
            r2 = r1
        L_0x0092:
            if (r2 == 0) goto L_0x0097
            r2.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0097:
            throw r0
        L_0x0098:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0097
        L_0x009d:
            r0 = move-exception
            goto L_0x0092
        L_0x009f:
            r0 = move-exception
            goto L_0x0082
        L_0x00a1:
            r0 = move-exception
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1608bk.m7339a(java.io.File, java.lang.String):com.cootek.smartinput5.func.bj");
    }

    /* renamed from: b */
    public void mo6311b() {
        if (!mo6315e(C1549b.f4831b)) {
            if (Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_ENABLED_UI)) {
                Settings.getInstance().setBoolSetting(Settings.SUPER_DICT_ENABLED_UI, false);
            }
            if (Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
                Settings.getInstance().setBoolSetting(Settings.SUPER_DICT_DOWNLOADED, false);
                return;
            }
            return;
        }
        if (!Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
            Settings.getInstance().setBoolSetting(Settings.SUPER_DICT_DOWNLOADED, true);
        }
        Settings.getInstance().setBoolSetting(Settings.SHOW_SUPER_DICT_DOWNLOAD_REMINDER, false);
    }

    /* renamed from: e */
    public boolean mo6315e(String str) {
        if (this.f5186h == null) {
            mo6307a();
        }
        if (this.f5186h == null || str == null) {
            return false;
        }
        Iterator<C1607bj> it = this.f5186h.iterator();
        while (it.hasNext()) {
            C1607bj next = it.next();
            if (str.contains(next.f5171b)) {
                return next.mo6305a();
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo6316f(String str) {
        boolean z;
        if (this.f5186h == null) {
            mo6307a();
        }
        if (this.f5186h != null && str != null) {
            boolean z2 = false;
            Iterator<C1607bj> it = this.f5186h.iterator();
            while (true) {
                z = z2;
                if (!it.hasNext()) {
                    break;
                }
                C1607bj next = it.next();
                if (str.contains(next.f5171b)) {
                    next.mo6306b();
                    z2 = true;
                } else {
                    z2 = z;
                }
            }
            if (z) {
                mo6313c((C1610b) new C1616bq(this, str));
            }
        }
    }

    /* renamed from: c */
    public void mo6313c(C1610b bVar) {
        mo6307a();
        if (bVar != null) {
            bVar.mo4252i();
        }
        Iterator<C1610b> it = this.f5187i.iterator();
        while (it.hasNext()) {
            it.next().mo4252i();
        }
    }

    /* renamed from: a */
    public boolean mo5568a(String str) {
        return false;
    }

    /* renamed from: b */
    public void mo5571b(String str) {
        this.f5185g = false;
        m7346d();
    }

    /* renamed from: f */
    public void mo5577f() {
        this.f5185g = false;
        m7346d();
    }

    /* renamed from: c */
    public void mo5573c(String str) {
        this.f5185g = true;
        m7346d();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m7346d() {
        Iterator<C1610b> it = this.f5187i.iterator();
        while (it.hasNext()) {
            it.next().mo4252i();
        }
    }

    /* renamed from: c */
    public boolean mo6314c() {
        return this.f5185g;
    }
}
