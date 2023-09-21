package com.cootek.smartinput5.func;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.provider.UserDictionary;
import android.text.TextUtils;
import android.webkit.WebView;
import com.cootek.p042a.p043a.C0898b;
import com.cootek.p042a.p043a.C0902f;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.smartinput.utilities.C0989E;
import com.cootek.smartinput.utilities.C0993b;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.cust.C1240a;
import com.cootek.smartinput5.daemon.DaemonManager;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.engine.OkinawaCallBackManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.component.C1660U;
import com.cootek.smartinput5.func.component.C1662W;
import com.cootek.smartinput5.func.component.C1669d;
import com.cootek.smartinput5.func.component.C1684q;
import com.cootek.smartinput5.func.component.C1686s;
import com.cootek.smartinput5.func.learnmanager.C1813a;
import com.cootek.smartinput5.func.learnmanager.C1823f;
import com.cootek.smartinput5.func.learnmanager.C1827i;
import com.cootek.smartinput5.func.nativeads.C1896t;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p053c.C1632c;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2174G;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.C2214ac;
import com.cootek.smartinput5.net.C2228ao;
import com.cootek.smartinput5.net.C2355n;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p047c.C1194T;
import com.cootek.smartinput5.p066ui.p068b.C2717b;
import com.cootek.smartinput5.presentations.C2515q;
import com.cootek.smartinput5.teaching.p065a.C2563e;
import com.cootek.smartinput5.teaching.p065a.C2564f;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.X */
/* compiled from: FuncManager */
public class C1368X {

    /* renamed from: U */
    private static boolean f4245U = false;

    /* renamed from: V */
    private static boolean f4246V = false;

    /* renamed from: X */
    private static int[] f4247X = {88, Settings.IME_CUR_VERSION};

    /* renamed from: a */
    public static final String f4248a = "func";

    /* renamed from: c */
    private static final int f4249c = 0;

    /* renamed from: d */
    private static final int f4250d = 1;

    /* renamed from: e */
    private static final int f4251e = 2;

    /* renamed from: g */
    private static C1368X f4252g;

    /* renamed from: h */
    private static int f4253h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static Context f4254i;

    /* renamed from: A */
    private C1713e f4255A;

    /* renamed from: B */
    private C1632c f4256B;

    /* renamed from: C */
    private C2563e f4257C;

    /* renamed from: D */
    private Okinawa f4258D;

    /* renamed from: E */
    private C1415aX f4259E;

    /* renamed from: F */
    private C1686s f4260F;

    /* renamed from: G */
    private C1660U f4261G;

    /* renamed from: H */
    private C1827i f4262H;

    /* renamed from: I */
    private PendingIntent f4263I;

    /* renamed from: J */
    private C1337C f4264J;

    /* renamed from: K */
    private C1662W f4265K;

    /* renamed from: L */
    private C1813a f4266L;

    /* renamed from: M */
    private C2355n f4267M;

    /* renamed from: N */
    private C1372a f4268N;

    /* renamed from: O */
    private IPCManager f4269O;

    /* renamed from: P */
    private C2564f f4270P;

    /* renamed from: Q */
    private JsHandler f4271Q;

    /* renamed from: R */
    private C1579bD f4272R;

    /* renamed from: S */
    private C1396aI f4273S;

    /* renamed from: T */
    private boolean f4274T = false;

    /* renamed from: W */
    private HashSet<Class> f4275W = new HashSet<>();

    /* renamed from: b */
    String f4276b;

    /* renamed from: f */
    private final int[][] f4277f = {new int[]{88, 2}, new int[]{Settings.IME_CUR_VERSION, 0}, new int[]{Settings.RECOMMEND_CHANNEL_CODE, 2}};

    /* renamed from: j */
    private Handler f4278j = new Handler();

    /* renamed from: k */
    private final long f4279k = Utils.WEEK_MILLIS;

    /* renamed from: l */
    private C1403aO f4280l;

    /* renamed from: m */
    private C1574bA f4281m;

    /* renamed from: n */
    private C1626bx f4282n;

    /* renamed from: o */
    private C1959q f4283o;

    /* renamed from: p */
    private C2119x f4284p;

    /* renamed from: q */
    private C1413aW f4285q;

    /* renamed from: r */
    private C1598bd f4286r;

    /* renamed from: s */
    private C1422ad f4287s;

    /* renamed from: t */
    private C1602bh f4288t;

    /* renamed from: u */
    private C1389aD f4289u;

    /* renamed from: v */
    private C1960r f4290v;

    /* renamed from: w */
    private C1608bk f4291w;

    /* renamed from: x */
    private C1920p f4292x;

    /* renamed from: y */
    private HandWriteManager f4293y;

    /* renamed from: z */
    private C1625bw f4294z;

    /* renamed from: a */
    public static void m6290a(Context context) {
        f4254i = context;
        m6287a();
    }

    /* renamed from: a */
    public static void m6287a() {
        File file;
        String str = null;
        DaemonManager.m6039a(f4254i);
        if (f4254i != null && !f4246V) {
            String a = C1974m.m9063a(f4254i, (int) R.string.lib_filename_smartinput_buildin);
            String mapLibraryName = System.mapLibraryName(a);
            if (TextUtils.isEmpty(mapLibraryName)) {
                mapLibraryName = "lib" + a + ".so";
            }
            String T = m6280T();
            if (!TextUtils.isEmpty(T)) {
                file = new File(T, mapLibraryName);
            } else {
                file = null;
            }
            m6295a(mapLibraryName);
            if (file == null || !file.exists()) {
                File a2 = C1132b.m5654a(f4254i).mo4391a((int) R.array.lib_load_path);
                if (a2 != null) {
                    try {
                        System.load(a2.getAbsolutePath());
                        e = null;
                    } catch (UnsatisfiedLinkError e) {
                        e = e;
                        str = "load configuration path: " + a2.getAbsolutePath();
                    }
                } else {
                    try {
                        System.loadLibrary(a);
                        e = null;
                    } catch (UnsatisfiedLinkError e2) {
                        e = e2;
                        str = "System.loadLibrary failed: " + a;
                    }
                }
            } else {
                try {
                    System.load(file.getAbsolutePath());
                    e = null;
                } catch (UnsatisfiedLinkError e3) {
                    String str2 = "load native lib failed: " + file.getAbsolutePath();
                    e = e3;
                    str = str2;
                }
            }
            if (e != null) {
                String b = m6314b(mapLibraryName);
                if (!TextUtils.isEmpty(b)) {
                    try {
                        System.load(b);
                    } catch (UnsatisfiedLinkError e4) {
                        C0993b.m5159a("Copy lib failed:" + b);
                        C0993b.m5157a(1);
                        throw e4;
                    }
                } else {
                    C0993b.m5159a(str);
                    C0993b.m5157a(1);
                    throw e;
                }
            }
            f4246V = true;
        }
    }

    /* renamed from: a */
    private static void m6295a(String str) {
        File filesDir;
        File file;
        if (f4254i != null && !TextUtils.isEmpty(str) && (filesDir = f4254i.getFilesDir()) != null && filesDir.getParentFile() != null && (file = new File(filesDir.getParentFile(), str)) != null && file.exists()) {
            file.delete();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a8 A[SYNTHETIC, Splitter:B:44:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ad A[SYNTHETIC, Splitter:B:47:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bc A[SYNTHETIC, Splitter:B:53:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c1 A[SYNTHETIC, Splitter:B:56:0x00c1] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m6314b(java.lang.String r7) {
        /*
            r0 = 0
            android.content.Context r1 = f4254i
            if (r1 == 0) goto L_0x000b
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            return r0
        L_0x000c:
            android.content.Context r1 = f4254i
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            java.lang.String r1 = r1.sourceDir
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x00a3, all -> 0x00b5 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00a3, all -> 0x00b5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            r1.<init>()     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.lang.String r3 = "lib"
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.lang.String r3 = java.io.File.separator     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.lang.String r3 = "armeabi"
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.lang.String r3 = java.io.File.separator     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.lang.StringBuilder r1 = r1.append(r7)     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.util.zip.ZipEntry r3 = r2.getEntry(r1)     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            android.content.Context r1 = f4254i     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            if (r1 == 0) goto L_0x00db
            android.content.Context r1 = f4254i     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            java.io.File r1 = r1.getParentFile()     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
        L_0x0054:
            if (r3 == 0) goto L_0x0093
            if (r1 == 0) goto L_0x0093
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            r4.<init>(r1, r7)     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            if (r4 == 0) goto L_0x0068
            boolean r1 = r4.exists()     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            if (r1 == 0) goto L_0x0068
            r4.delete()     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
        L_0x0068:
            java.io.InputStream r1 = r2.getInputStream(r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00cf }
            com.cootek.smartinput.utilities.C0997e.m5174a((java.io.File) r4, (java.io.InputStream) r1)     // Catch:{ Exception -> 0x00d9, all -> 0x00d4 }
            java.lang.String r3 = "755"
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x00d9, all -> 0x00d4 }
            com.cootek.smartinput.utilities.C0997e.m5190b((java.lang.String) r3, (java.lang.String) r5)     // Catch:{ Exception -> 0x00d9, all -> 0x00d4 }
            if (r4 == 0) goto L_0x0094
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x00d9, all -> 0x00d4 }
            if (r3 == 0) goto L_0x0094
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x00d9, all -> 0x00d4 }
            if (r2 == 0) goto L_0x0089
            r2.close()     // Catch:{ Exception -> 0x00c5 }
        L_0x0089:
            if (r1 == 0) goto L_0x000b
            r1.close()     // Catch:{ Exception -> 0x0090 }
            goto L_0x000b
        L_0x0090:
            r1 = move-exception
            goto L_0x000b
        L_0x0093:
            r1 = r0
        L_0x0094:
            if (r2 == 0) goto L_0x0099
            r2.close()     // Catch:{ Exception -> 0x00c7 }
        L_0x0099:
            if (r1 == 0) goto L_0x000b
            r1.close()     // Catch:{ Exception -> 0x00a0 }
            goto L_0x000b
        L_0x00a0:
            r1 = move-exception
            goto L_0x000b
        L_0x00a3:
            r1 = move-exception
            r1 = r0
            r2 = r0
        L_0x00a6:
            if (r2 == 0) goto L_0x00ab
            r2.close()     // Catch:{ Exception -> 0x00c9 }
        L_0x00ab:
            if (r1 == 0) goto L_0x000b
            r1.close()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x000b
        L_0x00b2:
            r1 = move-exception
            goto L_0x000b
        L_0x00b5:
            r1 = move-exception
            r2 = r0
            r6 = r0
            r0 = r1
            r1 = r6
        L_0x00ba:
            if (r2 == 0) goto L_0x00bf
            r2.close()     // Catch:{ Exception -> 0x00cb }
        L_0x00bf:
            if (r1 == 0) goto L_0x00c4
            r1.close()     // Catch:{ Exception -> 0x00cd }
        L_0x00c4:
            throw r0
        L_0x00c5:
            r2 = move-exception
            goto L_0x0089
        L_0x00c7:
            r2 = move-exception
            goto L_0x0099
        L_0x00c9:
            r2 = move-exception
            goto L_0x00ab
        L_0x00cb:
            r2 = move-exception
            goto L_0x00bf
        L_0x00cd:
            r1 = move-exception
            goto L_0x00c4
        L_0x00cf:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x00ba
        L_0x00d4:
            r0 = move-exception
            goto L_0x00ba
        L_0x00d6:
            r1 = move-exception
            r1 = r0
            goto L_0x00a6
        L_0x00d9:
            r3 = move-exception
            goto L_0x00a6
        L_0x00db:
            r1 = r0
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1368X.m6314b(java.lang.String):java.lang.String");
    }

    /* renamed from: T */
    private static String m6280T() {
        Field field;
        if (f4254i == null) {
            return null;
        }
        try {
            field = ApplicationInfo.class.getField("nativeLibraryDir");
        } catch (SecurityException e) {
            field = null;
        } catch (NoSuchFieldException e2) {
            field = null;
        }
        if (field != null) {
            try {
                return (String) field.get(f4254i.getApplicationInfo());
            } catch (IllegalAccessException | IllegalArgumentException e3) {
            }
        }
        File filesDir = f4254i.getFilesDir();
        if (filesDir != null) {
            return new File(filesDir.getParentFile(), "lib").getAbsolutePath();
        }
        return null;
    }

    private C1368X(Context context) {
        Settings.initialize(context.getSharedPreferences(Settings.SETTINGS_FILE_NAME, 0), context, new Config(context));
        this.f4274T = m6284X();
        int intSetting = Settings.getInstance().getIntSetting(Settings.PRODUCT_TYPE);
        int integer = f4254i.getResources().getInteger(R.integer.PRODUCT_TYPE);
        int intSetting2 = Settings.getInstance().getIntSetting(Settings.IME_CUR_VERSION);
        if (intSetting != integer) {
            Object[] U = m6281U();
            Settings.getInstance().clearAllSettings();
            m6297a(U);
        }
        Settings.getInstance().setIntSetting(Settings.LAST_PRODUCT_TYPE, intSetting, false);
        Settings.getInstance().setIntSetting(Settings.PRODUCT_TYPE, integer, false);
        Settings.getInstance().setIntSetting(Settings.CURRENT_PERFORMANCE_MODE, C1132b.m5654a(f4254i).mo4412f().ordinal());
        OkinawaCallBackManager.initialize();
        int c = m6319c(m6313b());
        boolean z = intSetting2 == 0;
        if (z) {
            Settings.getInstance().setBoolSetting(Settings.TOTALLY_NEW_PACK, true, false);
            if (!mo5820F().mo7499d()) {
                Settings.getInstance().setBoolSetting(Settings.V4_USRDICT_IMPORTED, true);
            }
            mo5820F().mo7496a();
        }
        if (intSetting2 != c) {
            m6321c(intSetting2);
            m6309ak();
            if (!z) {
                Settings.getInstance().setBoolSetting(Settings.TOTALLY_NEW_PACK, false, false);
            }
        }
        this.f4265K = new C1662W(new Handler());
        try {
            context.getContentResolver().registerContentObserver(UserDictionary.CONTENT_URI, true, this.f4265K);
        } catch (Exception e) {
        }
        m6285Y();
        C0989E.m5117a();
        C2515q.m11247a(f4254i);
        C1896t.m8712a().mo7037b();
    }

    /* renamed from: U */
    private Object[] m6281U() {
        int length = this.f4277f.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            int i2 = this.f4277f[i][0];
            switch (this.f4277f[i][1]) {
                case 0:
                    objArr[i] = Integer.valueOf(Settings.getInstance().getIntSetting(i2));
                    break;
                case 1:
                    objArr[i] = Boolean.valueOf(Settings.getInstance().getBoolSetting(i2));
                    break;
                case 2:
                    objArr[i] = Settings.getInstance().getStringSetting(i2);
                    break;
            }
        }
        return objArr;
    }

    /* renamed from: a */
    private void m6297a(Object[] objArr) {
        int length = this.f4277f.length;
        if (objArr != null && objArr.length == length) {
            for (int i = 0; i < length; i++) {
                int i2 = this.f4277f[i][0];
                int i3 = this.f4277f[i][1];
                Integer num = objArr[i];
                if (num != null) {
                    switch (i3) {
                        case 0:
                            Settings.getInstance().setIntSetting(i2, num.intValue());
                            break;
                        case 1:
                            Settings.getInstance().setBoolSetting(i2, ((Boolean) num).booleanValue());
                            break;
                        case 2:
                            Settings.getInstance().setStringSetting(i2, (String) num);
                            break;
                    }
                }
            }
        }
    }

    /* renamed from: V */
    private void m6282V() {
        File a = C1358O.m6234a(".uninstall");
        if (a != null && a.exists()) {
            File file = new File(a, "token");
            if (file.exists()) {
                Settings.getInstance().setStringSetting(Settings.OLD_TOKEN_FORM_UNINSTALL, C0997e.m5192d(file));
            }
        }
    }

    /* renamed from: c */
    private boolean m6322c(String str) {
        for (int keyById : f4247X) {
            if (str.startsWith(Settings.getKeyById(keyById))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: W */
    private boolean m6283W() {
        File a = C1358O.m6234a(C1358O.f4204o);
        if (a == null || !a.exists() || !new File(a, "settings").exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m6284X() {
        JSONObject jSONObject;
        JSONObject optJSONObject;
        Object opt;
        if (!m6283W()) {
            return false;
        }
        File a = C1358O.m6234a(".uninstall");
        if (a != null && a.exists()) {
            File file = new File(a, "settings");
            if (file.exists()) {
                try {
                    jSONObject = new JSONObject(C0997e.m5192d(file));
                } catch (JSONException e) {
                    jSONObject = null;
                }
                if (!(jSONObject == null || (optJSONObject = jSONObject.optJSONObject("settings")) == null)) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (m6322c(next) && (opt = optJSONObject.opt(next)) != null) {
                            Settings.getInstance().putKeyValue(next, opt);
                        }
                    }
                    Settings.getInstance().writeBack();
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m6291a(Context context, boolean z) {
        m6317b(context);
        if (!z) {
            f4253h--;
        }
    }

    /* renamed from: b */
    public static void m6317b(Context context) {
        if (f4252g == null) {
            C0904g.m4916a().mo3412c(C0902f.C0903a.INIT);
            C0904g.m4916a().mo3404a(C0898b.INIT_FUNCTION_MANAGER);
            Context applicationContext = context.getApplicationContext();
            f4254i = applicationContext;
            f4252g = new C1368X(applicationContext);
            f4252g.m6323d(applicationContext);
            C0904g.m4916a().mo3409b(C0898b.INIT_FUNCTION_MANAGER);
        }
        f4253h++;
    }

    /* renamed from: b */
    public static Context m6313b() {
        return f4254i;
    }

    /* renamed from: c */
    public static C1368X m6320c() {
        if (f4252g != null) {
            return f4252g;
        }
        throw new IllegalArgumentException("Parameter FuncManager is null. Call FuncManager.initialize(InputMethodService) first. Use FuncManager.isInitialized() to check if FuncManager is assigned.");
    }

    /* renamed from: d */
    public static boolean m6324d() {
        return f4252g != null;
    }

    /* renamed from: c */
    public static int m6319c(Context context) {
        if (context != null) {
            return context.getResources().getInteger(R.integer.ime_version_code);
        }
        return 0;
    }

    /* renamed from: e */
    public static void m6325e() {
        m6296a(true);
    }

    /* renamed from: a */
    public static void m6296a(boolean z) {
        f4253h--;
        if (!f4245U && f4253h <= 0 && !C2361q.m10801i() && !C2209a.m9960b()) {
            if (f4253h < 0) {
                f4253h = 0;
                try {
                    throw new Exception("func manager has destroyed.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            m6286Z();
            C2361q.m10794a();
            f4254i.getContentResolver().unregisterContentObserver(f4252g.f4265K);
            if (f4252g.f4258D != null) {
                f4252g.f4258D.release();
            }
            if (f4252g.f4269O != null) {
                f4252g.f4269O.destroy();
            }
            if (f4252g.f4287s != null) {
                f4252g.f4287s.mo6070f();
            }
            if (f4252g.f4287s != null) {
                f4252g.f4287s.mo6070f();
            }
            C1684q.m7770b();
            f4252g = null;
            f4254i = null;
            Settings.destroy();
            OkinawaCallBackManager.destory();
            C1240a.m5990b();
            C1811k.m8334b();
            C1823f.m8406c();
            PresentationManager.stopWork();
            PresentationManager.destory();
            if (z) {
                System.exit(0);
            }
        }
    }

    /* renamed from: Y */
    private void m6285Y() {
        try {
            ((AlarmManager) f4254i.getSystemService("alarm")).setInexactRepeating(1, System.currentTimeMillis(), 3600000, m6299aa());
        } catch (Exception e) {
        }
    }

    /* renamed from: Z */
    private static void m6286Z() {
        try {
            ((AlarmManager) f4254i.getSystemService("alarm")).cancel(f4252g.m6299aa());
        } catch (Exception e) {
        }
    }

    /* renamed from: f */
    public void mo5833f() {
        AlarmManager alarmManager = (AlarmManager) f4254i.getSystemService("alarm");
        try {
            alarmManager.cancel(m6299aa());
            alarmManager.setInexactRepeating(1, System.currentTimeMillis(), 3600000, m6299aa());
        } catch (Exception e) {
        }
    }

    /* renamed from: aa */
    private PendingIntent m6299aa() throws IllegalAccessException {
        if (this.f4263I == null) {
            try {
                this.f4263I = PendingIntent.getBroadcast(f4254i, 0, new Intent("com.emoji.keyboard.touchpal.INTERNAL_ACTION.auto_update"), Engine.EXCEPTION_WARN);
            } catch (SecurityException e) {
                throw new IllegalAccessException();
            }
        }
        return this.f4263I;
    }

    /* renamed from: g */
    public Handler mo5834g() {
        return this.f4278j;
    }

    /* renamed from: h */
    public Okinawa mo5835h() {
        if (this.f4275W.contains(Okinawa.class)) {
            return null;
        }
        if (this.f4258D == null) {
            this.f4275W.add(Okinawa.class);
            try {
                this.f4258D = new Okinawa(f4254i);
            } finally {
                this.f4275W.remove(Okinawa.class);
            }
        }
        return this.f4258D;
    }

    /* renamed from: i */
    public Okinawa mo5836i() {
        return this.f4258D;
    }

    /* renamed from: j */
    public C1413aW mo5837j() {
        if (this.f4285q == null) {
            this.f4285q = new C1413aW(f4254i);
        }
        return this.f4285q;
    }

    /* renamed from: k */
    public C1598bd mo5838k() {
        if (this.f4286r == null) {
            this.f4286r = new C1598bd(f4254i);
        }
        return this.f4286r;
    }

    /* renamed from: l */
    public IPCManager mo5839l() {
        if (this.f4269O == null) {
            this.f4269O = new IPCManager(f4254i);
        }
        return this.f4269O;
    }

    /* renamed from: m */
    public C1422ad mo5840m() {
        if (this.f4287s == null) {
            this.f4287s = new C1422ad(f4254i);
        }
        return this.f4287s;
    }

    /* renamed from: n */
    public C1602bh mo5841n() {
        if (this.f4288t == null) {
            this.f4288t = new C1602bh(f4254i, mo5838k());
        }
        return this.f4288t;
    }

    /* renamed from: o */
    public C1389aD mo5842o() {
        if (this.f4289u == null) {
            this.f4289u = new C1389aD(f4254i);
        }
        return this.f4289u;
    }

    /* renamed from: p */
    public C1813a mo5843p() {
        if (this.f4266L == null) {
            this.f4266L = new C1813a(f4254i);
        }
        return this.f4266L;
    }

    /* renamed from: q */
    public C1372a mo5844q() {
        if (this.f4268N == null) {
            this.f4268N = new C1372a(f4254i);
        }
        return this.f4268N;
    }

    /* renamed from: r */
    public C1960r mo5845r() {
        if (this.f4290v == null) {
            this.f4290v = new C1960r(f4254i);
        }
        return this.f4290v;
    }

    /* renamed from: s */
    public C1608bk mo5846s() {
        if (this.f4291w == null) {
            this.f4291w = new C1608bk(f4254i);
        }
        return this.f4291w;
    }

    /* renamed from: t */
    public C1920p mo5847t() {
        if (this.f4292x == null) {
            this.f4292x = new C1920p(f4254i);
        }
        return this.f4292x;
    }

    /* renamed from: u */
    public HandWriteManager mo5848u() {
        if (this.f4293y == null) {
            this.f4293y = new HandWriteManager(f4254i);
        }
        return this.f4293y;
    }

    /* renamed from: v */
    public C1632c mo5849v() {
        if (this.f4256B == null) {
            this.f4256B = new C1632c(f4254i);
        }
        return this.f4256B;
    }

    /* renamed from: w */
    public C2563e mo5850w() {
        if (this.f4257C == null) {
            this.f4257C = new C2563e(f4254i);
        }
        return this.f4257C;
    }

    /* renamed from: x */
    public C2564f mo5851x() {
        if (this.f4270P == null) {
            this.f4270P = new C2564f(f4254i);
        }
        return this.f4270P;
    }

    /* renamed from: y */
    public C1625bw mo5852y() {
        if (this.f4294z == null) {
            this.f4294z = new C1625bw(f4254i);
        }
        return this.f4294z;
    }

    /* renamed from: z */
    public C1713e mo5853z() {
        if (this.f4255A == null) {
            this.f4255A = new C1713e(f4254i);
        }
        return this.f4255A;
    }

    /* renamed from: A */
    public C1337C mo5815A() {
        if (this.f4264J == null) {
            this.f4264J = new C1337C(f4254i);
        }
        return this.f4264J;
    }

    /* renamed from: B */
    public C1415aX mo5816B() {
        if (this.f4259E == null) {
            this.f4259E = new C1415aX(f4254i);
        }
        return this.f4259E;
    }

    /* renamed from: C */
    public C1686s mo5817C() {
        if (this.f4260F == null) {
            this.f4260F = new C1686s(f4254i);
        }
        return this.f4260F;
    }

    /* renamed from: D */
    public C1660U mo5818D() {
        if (this.f4261G == null) {
            this.f4261G = new C1660U(f4254i);
        }
        return this.f4261G;
    }

    /* renamed from: E */
    public C1827i mo5819E() {
        if (this.f4262H == null) {
            this.f4262H = new C1827i(f4254i);
        }
        return this.f4262H;
    }

    /* renamed from: F */
    public C2119x mo5820F() {
        if (this.f4284p == null) {
            this.f4284p = new C2119x(f4254i);
        }
        return this.f4284p;
    }

    /* renamed from: G */
    public C1959q mo5821G() {
        if (this.f4283o == null) {
            this.f4283o = new C1959q(f4254i);
        }
        return this.f4283o;
    }

    /* renamed from: H */
    public C1574bA mo5822H() {
        if (this.f4281m == null) {
            this.f4281m = new C1574bA(f4254i);
        }
        return this.f4281m;
    }

    /* renamed from: I */
    public C1626bx mo5823I() {
        if (this.f4282n == null) {
            this.f4282n = new C1626bx(f4254i);
        }
        return this.f4282n;
    }

    /* renamed from: J */
    public C1403aO mo5824J() {
        if (this.f4280l == null) {
            this.f4280l = new C1403aO(f4254i);
        }
        return this.f4280l;
    }

    /* renamed from: K */
    public JsHandler mo5825K() {
        if (this.f4271Q == null) {
            this.f4271Q = new JsHandler(f4254i, (WebView) null);
        }
        return this.f4271Q;
    }

    /* renamed from: L */
    public C1579bD mo5826L() {
        if (this.f4272R == null) {
            this.f4272R = new C1579bD(f4254i);
        }
        return this.f4272R;
    }

    /* renamed from: M */
    public C1396aI mo5827M() {
        if (this.f4273S == null) {
            this.f4273S = new C1396aI(f4254i);
        }
        return this.f4273S;
    }

    /* renamed from: N */
    public C2355n mo5828N() {
        if (this.f4267M == null) {
            this.f4267M = new C2355n();
        }
        return this.f4267M;
    }

    /* renamed from: O */
    public void mo5829O() {
        C2174G.m9763a().mo7626b();
        C1669d.m7670b();
        mo5817C().mo6559a();
        mo5818D().mo6483a();
        mo5822H().mo6205g();
        mo5822H().mo6200b();
        mo5823I().mo6381a();
    }

    /* renamed from: d */
    private void m6323d(Context context) {
        boolean z;
        int i;
        C1460o.m6799b().mo6124a(context, false);
        int intSetting = Settings.getInstance().getIntSetting(Settings.IME_CUR_VERSION);
        if (intSetting == 0) {
            m6300ab();
        }
        int c = m6319c(m6313b());
        if (c == 0) {
            i = Integer.MAX_VALUE;
            z = false;
        } else if (c == intSetting) {
            i = c;
            z = false;
        } else {
            z = true;
            i = c;
        }
        if (intSetting != i) {
            m6302ad();
            m6298a(i, intSetting);
            Settings.getInstance().setIntSetting(200, 0);
            if (Settings.getInstance().getIntSetting(Settings.RECOMMEND_VERSION_CODE) == 0) {
                Settings.getInstance().setIntSetting(Settings.RECOMMEND_VERSION_CODE, intSetting);
            }
            Settings.getInstance().setIntSetting(Settings.IME_LAST_VERSION, intSetting);
        }
        Settings instance = Settings.getInstance();
        C1132b a = C1132b.m5654a(f4254i);
        Settings.getInstance();
        instance.setBoolSetting(39, ((Boolean) a.mo4401a(Settings.getKeyById(39), (Object) Boolean.valueOf(f4254i.getResources().getBoolean(R.bool.TOUCH_CORRECT)))).booleanValue());
        if (z) {
            Settings.getInstance().setIntSetting(Settings.IME_CUR_VERSION, i);
            Settings.getInstance().setLongSetting(Settings.IME_CUR_VERSION_INSTALL_TIME, System.currentTimeMillis());
            C1060e.m5598b().mo4274a(C1060e.f3010a, (Object) Long.valueOf(System.currentTimeMillis()));
        }
        m6288a(i);
        Settings.getInstance().writeBack();
        m6310al();
        mo5841n().mo6279i();
    }

    /* renamed from: ab */
    private void m6300ab() {
        if (C1132b.m5654a(f4254i).mo4392a(C1135d.IMPORT_AUTO_BACKUP_USER_DICTS, Boolean.valueOf(this.f4274T)).booleanValue()) {
            m6301ac();
            Settings.getInstance().setBoolSetting(Settings.NEED_CHECK_IMPORTED_DATA, false);
        }
        m6282V();
    }

    /* renamed from: ac */
    private void m6301ac() {
        m6320c().mo5826L().mo6219k();
    }

    /* renamed from: ad */
    private void m6302ad() {
        String h = C1132b.m5654a(f4254i).mo4414h();
        Settings.getInstance().setStringSetting(Settings.CURRENT_CHANNEL_CODE, h, false);
        if (TextUtils.isEmpty(Settings.getInstance().getStringSetting(Settings.RECOMMEND_CHANNEL_CODE))) {
            Settings.getInstance().setStringSetting(Settings.RECOMMEND_CHANNEL_CODE, h, false);
        }
        if (!TextUtils.equals(Settings.getInstance().getStringSetting(Settings.RECOMMEND_CHANNEL_CODE), h) && !Settings.getInstance().getBoolSetting(Settings.UPDATE_OEM, 26, Settings.OEM_UPDATE_SKIN_CHECKED, (Config) null)) {
            Settings.getInstance().setBoolSetting(Settings.UPDATE_OEM, true, 26, Settings.OEM_UPDATE_SKIN, (Config) null, false);
            Settings.getInstance().setBoolSetting(Settings.UPDATE_OEM, true, 26, Settings.OEM_UPDATE_SKIN_CHECKED, (Config) null, false);
        }
    }

    /* renamed from: a */
    private void m6288a(int i) {
        if (Settings.getInstance().getBoolSetting(Settings.FIRST_START_INPUTMETHOD)) {
            Settings.getInstance().setLongSetting(Settings.FIRST_INSTALL_TIME, System.currentTimeMillis());
            if (Settings.getInstance().getIntSetting(Settings.FIRST_INSTALL_VERSION) == 0) {
                Settings.getInstance().setIntSetting(Settings.FIRST_INSTALL_VERSION, i);
                this.f4278j.postDelayed(new C1370Y(this, i), 100);
            }
            Settings.getInstance().setIntSetting(4, Settings.getInstance().getIntSetting(4, 9, C1549b.f4791a, (Config) null), 9, C1549b.f4791a, (Config) null, true);
            if (C1959q.m8981h()) {
                Settings.getInstance().setBoolSetting(Settings.COMMIT_ANIMATION_ENABLED, false);
            }
            new C1369a(this, (C1370Y) null).execute(new Object[0]);
            Settings.getInstance().setBoolSetting(Settings.FIRST_START_INPUTMETHOD, false);
        }
    }

    /* renamed from: com.cootek.smartinput5.func.X$a */
    /* compiled from: FuncManager */
    private class C1369a extends AsyncTask {
        private C1369a() {
        }

        /* synthetic */ C1369a(C1368X x, C1370Y y) {
            this();
        }

        /* access modifiers changed from: protected */
        public Object doInBackground(Object... objArr) {
            return new int[]{C1439ao.m6713a(), C1439ao.m6714b()};
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Object obj) {
            int[] iArr = (int[]) obj;
            if (iArr != null && iArr.length == 2) {
                int i = iArr[0];
                int i2 = iArr[1];
                if (i < 1100000 || i2 < 700000) {
                    Settings.getInstance().setBoolSetting(50, false);
                }
                if (i2 < 512000) {
                    Settings.getInstance().setBoolSetting(Settings.COMMIT_ANIMATION_ENABLED, false);
                }
            }
        }
    }

    /* renamed from: ae */
    private void m6303ae() {
        mo5845r().mo7207j();
        for (C2065u a : mo5845r().mo7203g()) {
            mo5845r().mo7195a(a, true);
        }
    }

    /* renamed from: a */
    private boolean m6298a(int i, int i2) {
        SharedPreferences sharedPreferences = f4254i.getSharedPreferences("com.cootek.smartinputv5_preferences", 3);
        try {
            if (!(sharedPreferences.getAll() == null || sharedPreferences.getAll().size() == 0)) {
                sharedPreferences.edit().clear().commit();
            }
        } catch (NullPointerException e) {
        }
        C1725i.m7937a(true);
        m6315b(i2);
        m6307ai();
        mo5853z().mo6627a();
        m6303ae();
        m6316b(i, i2);
        m6304af();
        C1351J.m6188a().mo5640a(true);
        m6306ah();
        mo5830P();
        m6305ag();
        if (i2 == 0) {
            mo5842o().mo5974v();
        }
        C2228ao.m10103b(f4254i);
        C1466av.m6853c(f4254i, C1466av.f4711t);
        return true;
    }

    /* renamed from: b */
    private void m6315b(int i) {
        if (i == 5707 || i == 5709) {
            File filesDir = f4254i.getFilesDir();
            File file = new File(filesDir, "usage_folder/wifi_first");
            if (file.exists() && file.isDirectory()) {
                File file2 = new File(filesDir, "usage_folder/encrypt_wifi_first");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (file2.exists()) {
                    C0997e.m5189b(file, file2);
                    C0997e.m5172a(file);
                }
            }
        }
    }

    /* renamed from: af */
    private void m6304af() {
        Settings instance = Settings.getInstance();
        instance.setStringSetting(Settings.CURRENT_LANG_BEFORE_UPDATE, instance.getStringSetting(10));
        instance.setStringSetting(Settings.PREUSED_LANG_BEFORE_UPDATE, instance.getStringSetting(11));
    }

    /* renamed from: P */
    public void mo5830P() {
        if (!mo5842o().mo5972u()) {
            m6320c().mo5842o().mo5970t();
        }
    }

    /* renamed from: ag */
    private void m6305ag() {
        if (!mo5841n().mo6296r()) {
            String stringSetting = Settings.getInstance().getStringSetting(80);
            if (!C1602bh.m7249d(stringSetting)) {
                C1602bh n = m6320c().mo5841n();
                n.mo6268d();
                if (!TextUtils.isEmpty(stringSetting) && n.mo6270e() != null) {
                    Iterator<C1810j> it = n.mo6270e().iterator();
                    while (it.hasNext()) {
                        if (it.next().mo6810a().equalsIgnoreCase(stringSetting)) {
                            Settings.getInstance().setBoolSetting(Settings.DEFUALT_SKIN_UPDATED, false);
                            C2361q.m10797b().mo8012d(stringSetting);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ah */
    private void m6306ah() {
        if (!Settings.getInstance().getBoolSetting(Settings.RATE_US_BUTTON_CLICKED) && Settings.getInstance().getIntSetting(Settings.RATE_US_NOTICATION_SHOW_TIMES) < 1) {
            Settings.getInstance().setLongSetting(Settings.RATE_US_NEXT_SHOW_TIME, System.currentTimeMillis() + Utils.WEEK_MILLIS);
        }
    }

    /* renamed from: ai */
    private void m6307ai() {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        try {
            inputStream = C1460o.m6799b().mo6099a(f4254i, C1466av.f4708q);
        } catch (IOException e) {
            e.printStackTrace();
            inputStream = null;
        }
        if (inputStream != null) {
            File a = C1466av.m6849a(f4254i, C1466av.f4708q);
            if (a != null) {
                if (!a.exists()) {
                    try {
                        a.createNewFile();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                if (a.exists()) {
                    try {
                        fileOutputStream = new FileOutputStream(a);
                    } catch (FileNotFoundException e3) {
                        e3.printStackTrace();
                    }
                    C0997e.m5178a(inputStream, (OutputStream) fileOutputStream);
                }
            }
            fileOutputStream = null;
            try {
                C0997e.m5178a(inputStream, (OutputStream) fileOutputStream);
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        } else {
            fileOutputStream = null;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private void m6316b(int i, int i2) {
        boolean z;
        Settings instance = Settings.getInstance();
        instance.setIntSetting(Settings.LAST_NOTIFY_UPDATE, 0);
        instance.setIntSetting(29, Settings.HW_RECOG_RANGE_ALL, 8, C1549b.f4831b, (Config) null, true);
        instance.setStringSetting(35, "");
        instance.setBoolSetting(7, true);
        instance.setStringSetting(97, "");
        try {
            if (instance.getIntSetting(33) == 2) {
                instance.setIntSetting(33, 3);
            }
        } catch (ClassCastException e) {
            instance.setIntSetting(33, f4254i.getResources().getInteger(R.integer.SPELL_CHECK));
        }
        instance.setBoolSetting(Settings.INVITE_SUCCEED, ((Boolean) C1132b.m5654a(f4254i).mo4401a(Settings.getKeyById(Settings.INVITE_SUCCEED), (Object) Boolean.valueOf(f4254i.getResources().getBoolean(R.bool.INVITE_SUCCEED)))).booleanValue());
        if (instance.getIntSetting(90) < 100000) {
            instance.setIntSetting(90, 0);
        }
        if (instance.getIntSetting(91) < 100000) {
            instance.setIntSetting(91, 0);
        }
        instance.setIntSetting(89, 0);
        instance.setBoolSetting(Settings.SHOW_PROMOTE_PINYIN_ADDONS, true);
        instance.setBoolSetting(Settings.SHOW_LANGPACKS_ADDON, true);
        instance.setIntSetting(Settings.DEVICE_TYPE, instance.getIntSetting(Settings.DEVICE_TYPE));
        instance.setIntSetting(95, f4254i.getResources().getInteger(R.integer.CURRENT_DICTIONARY_TIMESTAMP));
        instance.setBoolSetting(Settings.SHOW_INSTALL_INCOMPATIBLE_LANGUAGE, true);
        instance.setBoolSetting(Settings.IS_FIRST_KEYBOARD_SHOW, true);
        if (C1593bR.m7162a().f5075a && C1593bR.m7162a().f5077c) {
            Settings.getInstance().setBoolSetting(37, Settings.getInstance().getBoolSetting(37));
            Settings.getInstance().setAdvancedPredictionSetting(Settings.getInstance().getAdvancedPredictionSetting());
            Settings.getInstance().setIntSetting(110, Settings.getInstance().getIntSetting(110));
        }
        if (i2 < 5460) {
            if (Settings.getInstance().getIntSetting(73) != 0) {
                Settings.getInstance().setIntSetting(Settings.VIBRATE_TIME, 10);
                Settings.getInstance().setBoolSetting(Settings.ADVANCED_VIBRATION, true);
            } else {
                Settings.getInstance().setIntSetting(Settings.VIBRATE_TIME, 0);
                Settings.getInstance().setBoolSetting(Settings.ADVANCED_VIBRATION, false);
            }
        }
        if (i2 < 5500) {
            Settings.getInstance().setStringSetting(49, C1549b.f4791a, 2, C1549b.f4831b, (Config) null, true);
        }
        if (i2 < 5550 && C1132b.m5654a(f4254i).mo4412f().ordinal() >= C1361R.ECONOMIC.ordinal()) {
            Settings.getInstance().setIntSetting(33, 3);
        }
        if (i2 < 5600 && Settings.getInstance().getBoolSetting(15)) {
            Settings.getInstance().setIntSetting(60, 2);
        }
        if (i2 < 5600 && Settings.getInstance().getIntSetting(Settings.CLOKE_ENABLE_MODE) == 2) {
            Settings.getInstance().setIntSetting(Settings.CLOKE_ENABLE_MODE, 0);
        }
        if (i2 == 0) {
            m6308aj();
        }
        if ((i2 > 0 || mo5820F().mo7500e()) && i2 < 5680) {
            C1389aD o = mo5842o();
            String stringSetting = Settings.getInstance().getStringSetting(10);
            String stringSetting2 = Settings.getInstance().getStringSetting(11);
            for (String str : o.mo5947h()) {
                Settings.getInstance().setLanguageEnabled(str, TextUtils.equals(stringSetting, str) || TextUtils.equals(stringSetting2, str));
            }
            Settings.getInstance().setBoolSetting(Settings.FIRST_SWITCH_LANGUAGE, true);
        }
        if (10 != instance.getIntSetting(Settings.VIBRATE_TIME)) {
            instance.setBoolSetting(Settings.APPLY_SYSTEM_VIBRATE, false);
        }
        if (i2 > 0 && i2 < 5680) {
            instance.setBoolSetting(Settings.PLUGIN_PINNED, true, 23, C1194T.WIDGET_LANGUAGE.mo4465a().mo4456d().mo4460a(), (Config) null, false);
        } else if ((this.f4274T || i2 > 5680) && i2 < 5720) {
            String bVar = C2717b.PLUGIN_EDIT.toString();
            Object writtenMapValue = Settings.getInstance().getWrittenMapValue(Settings.getInstance().getKeyByCategory(Settings.PLUGIN_PINNED, 23, bVar));
            boolean z2 = i2 > 0;
            if (writtenMapValue != null) {
                z2 = ((Boolean) writtenMapValue).booleanValue();
            }
            Settings.getInstance().setBoolSetting(Settings.PLUGIN_PINNED, z2, 23, bVar, (Config) null, false);
            String bVar2 = C2717b.PLUGIN_LANGUAGE.toString();
            Object writtenMapValue2 = Settings.getInstance().getWrittenMapValue(Settings.getInstance().getKeyByCategory(Settings.PLUGIN_PINNED, 23, bVar2));
            if (writtenMapValue != null || z2) {
                z = false;
            } else {
                z = true;
            }
            if (writtenMapValue2 != null) {
                z = ((Boolean) writtenMapValue2).booleanValue();
            }
            Settings.getInstance().setBoolSetting(Settings.PLUGIN_PINNED, z, 23, bVar2, (Config) null, false);
        }
        Settings.getInstance().setBoolSetting(Settings.USER_DICT_CHECK_STRICT_MODE, false);
        Settings.getInstance().setBoolSetting(Settings.USER_DICT_REPORT_ENABLE, false);
        if (!C1351J.m6197k()) {
            Settings.getInstance().setBoolSetting(62, false);
        }
        String a = C1974m.m9063a(f4254i, (int) R.string.SKIN_PACK_EXPECTED_VERSION);
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<C1810j> it = C1811k.m8322a().mo6813a(1, a).iterator();
        while (it.hasNext()) {
            String a2 = it.next().mo6810a();
            if (Settings.getInstance().getLongSetting(Settings.SKIN_FIRST_INSTALLED_TIME, 30, a2, (Config) null) == 0) {
                Settings.getInstance().setLongSetting(Settings.SKIN_FIRST_INSTALLED_TIME, currentTimeMillis, 30, a2, (Config) null, false);
            }
        }
        if (i2 < 5720) {
            m6289a(Settings.getInstance().getIntSetting(256), "bottom");
            int i3 = f4254i.getResources().getDisplayMetrics().widthPixels;
            m6289a((Settings.getInstance().getIntSetting(257) * i3) / 100, Settings.KEYBOARD_MARGIN_LEFT);
            m6289a((i3 * Settings.getInstance().getIntSetting(258)) / 100, Settings.KEYBOARD_MARGIN_RIGHT);
        }
        m6292a(instance, i);
    }

    /* renamed from: a */
    private void m6289a(int i, String str) {
        Settings.getInstance().setIntSetting(Settings.KEYBOARD_MARGIN, i, 18, str, (Config) null, false);
    }

    /* renamed from: aj */
    private void m6308aj() {
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("samsung")) {
            Settings.getInstance().setBoolSetting(99, true);
            Settings.getInstance().setBoolSetting(47, true);
            Settings.getInstance().setBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE, true);
        }
    }

    /* renamed from: a */
    private void m6292a(Settings settings, int i) {
        if (!C1132b.m5654a(f4254i).mo4410d()) {
            if (i == 5160) {
                settings.setStringSetting(100, "#2bbcff");
            }
            settings.setBoolSetting(104, true);
            settings.setBoolSetting(78, true);
            if (m6319c(m6313b()) < 5170) {
                settings.setIntSetting(123, 2);
            }
            if (i == 5210) {
                settings.setIntSetting(Settings.CLOKE_ENABLE_MODE, 0);
            }
            if ((i == 5340 || i == 5350) && C1593bR.m7162a().f5076b) {
                settings.setBoolSetting(37, false);
                settings.setAdvancedPredictionSetting(false);
            }
            if (i == 5400 || i == 5410) {
                settings.setIntSetting(81, 0);
                for (String str : mo5842o().mo5947h()) {
                    if (Settings.getInstance().getIntSetting(Settings.LANGUAGE_USED_TIMES, 17, str, (Config) null) > 0) {
                        Settings.getInstance().setBoolSetting(Settings.SHOW_LANG_FIRST_SETUP_DLG, false, 17, str, (Config) null, true);
                    }
                }
            }
            try {
                int intSetting = settings.getIntSetting(9);
                if (intSetting != 1 && intSetting != 4) {
                    settings.setIntSetting(9, 4);
                }
            } catch (ClassCastException e) {
                settings.setIntSetting(9, 4);
            }
        }
    }

    /* renamed from: c */
    private void m6321c(int i) {
        File a = C1466av.m6848a(m6313b());
        if (a != null) {
            try {
                File[] listFiles = a.listFiles(new C1371Z(this));
                if (listFiles != null) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: ak */
    private void m6309ak() {
        new C1419aa(this).start();
    }

    /* renamed from: al */
    private void m6310al() {
        m6311am();
    }

    /* renamed from: am */
    private void m6311am() {
        if (!m6312an() && C1358O.m6239b() != null && Settings.getInstance().getBoolSetting(Settings.UPDATE_OEM, 26, Settings.OEM_UPDATE_SKIN, (Config) null) && C2188Q.m9853a().mo7686f()) {
            mo5831Q();
            Settings.getInstance().setBoolSetting(Settings.UPDATE_OEM, false, 26, Settings.OEM_UPDATE_SKIN, (Config) null, false);
        }
    }

    /* renamed from: an */
    private boolean m6312an() {
        if (Settings.getInstance().getBoolSetting(Settings.BUILDIN_SKIN_UPDATE_CHECKED) || !m6320c().mo5841n().mo6247D()) {
            return false;
        }
        Settings.getInstance().setBoolSetting(Settings.BUILDIN_SKIN_UPDATE_CHECKED, true);
        return true;
    }

    /* renamed from: Q */
    public void mo5831Q() {
        String a = C1974m.m9063a(f4254i, (int) R.string.oem_skin_update_prefix);
        String encode = Uri.encode(String.valueOf(Settings.getInstance().getIntSetting(Settings.RECOMMEND_VERSION_CODE)) + "__" + Settings.getInstance().getStringSetting(Settings.RECOMMEND_CHANNEL_CODE) + "__");
        File file = new File(C1358O.m6234a("skin"), a + C1602bh.f5114c);
        new C2214ac(a, encode, file, 0, new C1421ac(this, file), new C1420ab(this)).mo7732a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6294a(File file) {
        if (!TextUtils.isEmpty(this.f4276b)) {
            C2361q.m10797b().mo8001a(this.f4276b, file.getAbsolutePath(), C1974m.m9063a(f4254i, (int) R.string.default_theme_title), OemSkinDownloadReceiver.skinDownloadCallback);
        }
    }

    /* renamed from: R */
    public String mo5832R() {
        return C1974m.m9063a(f4254i, C1593bR.m7162a().mo6232a(0));
    }

    /* renamed from: b */
    public static void m6318b(boolean z) {
        f4245U = z;
    }
}
