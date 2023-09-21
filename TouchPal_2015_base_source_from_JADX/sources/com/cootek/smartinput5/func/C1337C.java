package com.cootek.smartinput5.func;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0990F;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2183M;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.C */
/* compiled from: CurveManager */
public class C1337C implements C2183M.C2184a {

    /* renamed from: a */
    public static final String[] f4086a = {f4088c};

    /* renamed from: b */
    public static final String f4087b = ".tpv";

    /* renamed from: c */
    public static final String f4088c = ".imy";

    /* renamed from: d */
    public static final String f4089d = "cootek.smartinput.android.curve.";

    /* renamed from: e */
    public static final String[] f4090e = {"qw", "az", "qz"};

    /* renamed from: f */
    private static final String f4091f = "CurveManager";

    /* renamed from: g */
    private static final String f4092g = "language";

    /* renamed from: h */
    private static final String f4093h = "compatible";

    /* renamed from: i */
    private static final String f4094i = "layout";

    /* renamed from: j */
    private static final String f4095j = "files";
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Context f4096k;

    /* renamed from: l */
    private ArrayList<C1340b> f4097l = new ArrayList<>();

    /* renamed from: m */
    private ArrayList<C1336B> f4098m;

    /* renamed from: com.cootek.smartinput5.func.C$b */
    /* compiled from: CurveManager */
    public interface C1340b {
        /* renamed from: t_ */
        void mo5579t_();
    }

    /* renamed from: com.cootek.smartinput5.func.C$a */
    /* compiled from: CurveManager */
    public enum C1339a {
        qw,
        az,
        qz;

        public String toString() {
            switch (this) {
                case qw:
                    return "QWERTY";
                case az:
                    return "AZERTY";
                case qz:
                    return "QWERTZ";
                default:
                    return "QWERTY";
            }
        }
    }

    /* renamed from: a */
    public static String m6137a(String str, C1339a aVar) {
        if (aVar != null) {
            return f4089d + str + C1389aD.f4374j + aVar.name();
        }
        return f4089d + str;
    }

    /* renamed from: a */
    public static String m6136a(String str, int i) {
        if (i < 1 || i > 3) {
            return str;
        }
        return str + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + f4090e[i - 1];
    }

    /* renamed from: a */
    public static int m6133a(C1339a aVar) {
        switch (aVar) {
            case az:
                return 2;
            case qz:
                return 3;
            default:
                return 1;
        }
    }

    public C1337C(Context context) {
        this.f4096k = context;
    }

    /* renamed from: a */
    public void mo5565a(C1340b bVar) {
        this.f4097l.add(bVar);
    }

    /* renamed from: b */
    public void mo5570b(C1340b bVar) {
        this.f4097l.remove(bVar);
    }

    /* renamed from: a */
    public void mo5566a(String str, File file) {
        File parentFile = file.getParentFile();
        String name = file.getName();
        try {
            C0990F.m5124a(file, parentFile);
        } catch (Exception e) {
        }
        file.delete();
        parentFile.listFiles(new C1342D(this));
        mo5563a();
        Settings.getInstance().setBoolSetting(Settings.CURVE_DOWNLOAD_PROMPTED, true);
        if (name.contains(C1549b.f4831b)) {
            Settings.getInstance().setStringSetting(Settings.CURVE_DOWNLOAD_LANGUAGE, C1549b.f4831b);
        } else {
            Settings.getInstance().setStringSetting(Settings.CURVE_DOWNLOAD_LANGUAGE, C1549b.f4791a);
        }
    }

    /* renamed from: a */
    public void mo5563a() {
        if (C1368X.m6324d()) {
            if (Engine.isInitialized()) {
                Engine.getInstance().getIms().requestHideSelf(0);
            }
            C1368X.m6320c().mo5835h().fireSettingsChangedOperation(14);
            C1368X.m6320c().mo5835h().processEvent();
        }
        mo5569b();
        Iterator<C1340b> it = this.f4097l.iterator();
        while (it.hasNext()) {
            it.next().mo5579t_();
        }
    }

    /* renamed from: b */
    public void mo5569b() {
        File[] listFiles;
        String a = C1974m.m9063a(this.f4096k, (int) R.string.CURVE_TARGET_VERSION);
        File a2 = C1358O.m6234a(C1358O.f4194e);
        this.f4098m = new ArrayList<>();
        if (C1368X.m6324d()) {
            C1389aD o = C1368X.m6320c().mo5842o();
            for (String str : o.mo5947h()) {
                C1498a l = o.mo5954l(str);
                if (l.mo6163m()) {
                    this.f4098m.add(new C1336B(m6136a(str, l.mo6149a()), a, 0, (File) null, (String[]) null, true));
                }
            }
        }
        if (a2 != null && (listFiles = a2.listFiles(new C1343E(this))) != null) {
            for (File a3 : listFiles) {
                C1336B a4 = m6135a(a3, a);
                if (a4 != null) {
                    this.f4098m.add(a4);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[SYNTHETIC, Splitter:B:28:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086 A[SYNTHETIC, Splitter:B:38:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093 A[SYNTHETIC, Splitter:B:45:0x0093] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.cootek.smartinput5.func.C1336B m6135a(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 0
            r7 = 0
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006e, JSONException -> 0x007f, all -> 0x008f }
            r8.<init>(r10)     // Catch:{ IOException -> 0x006e, JSONException -> 0x007f, all -> 0x008f }
            long r2 = r10.length()     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            int r1 = (int) r2     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            byte[] r1 = new byte[r1]     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            r8.read(r1)     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            java.lang.String r3 = "utf-8"
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            java.lang.String r1 = "language"
            java.lang.String r1 = r4.getString(r1)     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            java.lang.String r2 = "compatible"
            java.lang.String r2 = r4.getString(r2)     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            java.lang.String r3 = "layout"
            int r3 = r4.getInt(r3)     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            java.lang.String r5 = "files"
            org.json.JSONArray r4 = r4.getJSONArray(r5)     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            int r5 = r4.length()     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
        L_0x003b:
            int r6 = r5.length     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            if (r0 >= r6) goto L_0x0047
            java.lang.String r6 = r4.getString(r0)     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            r5[r0] = r6     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            int r0 = r0 + 1
            goto L_0x003b
        L_0x0047:
            com.cootek.smartinput5.func.B r0 = new com.cootek.smartinput5.func.B     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            r6 = 0
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            boolean r1 = r11.equals(r2)     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            if (r1 == 0) goto L_0x005f
            if (r8 == 0) goto L_0x0059
            r8.close()     // Catch:{ IOException -> 0x005a }
        L_0x0059:
            return r0
        L_0x005a:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0059
        L_0x005f:
            r0.mo5562b()     // Catch:{ IOException -> 0x00a3, JSONException -> 0x00a1 }
            if (r8 == 0) goto L_0x0067
            r8.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0067:
            r0 = r7
            goto L_0x0059
        L_0x0069:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0067
        L_0x006e:
            r0 = move-exception
            r1 = r7
        L_0x0070:
            r0.printStackTrace()     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0078
            r1.close()     // Catch:{ IOException -> 0x007a }
        L_0x0078:
            r0 = r7
            goto L_0x0059
        L_0x007a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0078
        L_0x007f:
            r0 = move-exception
            r8 = r7
        L_0x0081:
            r0.printStackTrace()     // Catch:{ all -> 0x009c }
            if (r8 == 0) goto L_0x0078
            r8.close()     // Catch:{ IOException -> 0x008a }
            goto L_0x0078
        L_0x008a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0078
        L_0x008f:
            r0 = move-exception
            r8 = r7
        L_0x0091:
            if (r8 == 0) goto L_0x0096
            r8.close()     // Catch:{ IOException -> 0x0097 }
        L_0x0096:
            throw r0
        L_0x0097:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0096
        L_0x009c:
            r0 = move-exception
            goto L_0x0091
        L_0x009e:
            r0 = move-exception
            r8 = r1
            goto L_0x0091
        L_0x00a1:
            r0 = move-exception
            goto L_0x0081
        L_0x00a3:
            r0 = move-exception
            r1 = r8
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1337C.m6135a(java.io.File, java.lang.String):com.cootek.smartinput5.func.B");
    }

    /* renamed from: b */
    public boolean mo5572b(String str, int i) {
        return mo5575d(m6136a(str, i));
    }

    /* renamed from: d */
    public boolean mo5575d(String str) {
        if (this.f4098m == null) {
            mo5569b();
        }
        if (this.f4098m == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<C1336B> it = this.f4098m.iterator();
        while (it.hasNext()) {
            C1336B next = it.next();
            if (str.contains(next.f4079a)) {
                return next.mo5561a();
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5567a(C1498a aVar) {
        boolean z = true;
        if (aVar == null || !aVar.mo6163m()) {
            return false;
        }
        if (aVar.mo6149a() == 0) {
            return true;
        }
        if (aVar.mo6149a() != Settings.getInstance().getIntSetting(4, 9, aVar.f4727f, (Config) null)) {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    public void mo5576e(String str) {
        if (this.f4098m == null) {
            mo5569b();
        }
        if (this.f4098m != null && !TextUtils.isEmpty(str)) {
            Iterator<C1336B> it = this.f4098m.iterator();
            while (it.hasNext()) {
                C1336B next = it.next();
                if (str.contains(next.f4079a)) {
                    next.mo5562b();
                }
            }
            mo5563a();
            Settings.getInstance().setBoolSetting(Settings.CURVE_DOWNLOAD_PROMPTED, false);
            Settings.getInstance().setStringSetting(Settings.CURVE_DOWNLOAD_LANGUAGE, "");
        }
    }

    /* renamed from: c */
    public boolean mo5574c() {
        if (this.f4098m == null) {
            mo5569b();
        }
        if (this.f4098m != null && !this.f4098m.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo5564a(Context context, String str, int i, String str2, boolean z) {
        C1584bI.m7145b(context, new C1344F(this, i, str, str2), z);
    }

    /* renamed from: a */
    public boolean mo5568a(String str) {
        return false;
    }

    /* renamed from: b */
    public void mo5571b(String str) {
    }

    /* renamed from: f */
    public void mo5577f() {
    }

    /* renamed from: c */
    public void mo5573c(String str) {
    }
}
