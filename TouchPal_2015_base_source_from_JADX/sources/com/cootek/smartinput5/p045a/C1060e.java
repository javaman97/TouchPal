package com.cootek.smartinput5.p045a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.p048d.C1246d;
import com.google.android.gms.auth.GoogleAuthUtil;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.a.e */
/* compiled from: StatesCollector */
public class C1060e {

    /* renamed from: A */
    private static final String f3005A = "StatesCollector";

    /* renamed from: B */
    private static final int f3006B = 20;

    /* renamed from: C */
    private static final long f3007C = 10000;

    /* renamed from: D */
    private static int f3008D = 0;

    /* renamed from: I */
    private static C1060e f3009I = null;

    /* renamed from: a */
    public static final String f3010a = "IME_CUR_VERSION_INSTALL_TIME";

    /* renamed from: b */
    public static final String f3011b = "ANDROID_VERSION";

    /* renamed from: c */
    public static final String f3012c = "DEVICE_INFO";

    /* renamed from: d */
    public static final String f3013d = "INSTALLED_LANGUAGE";

    /* renamed from: e */
    public static final String f3014e = "CURRENT_LANGUAGE";

    /* renamed from: f */
    public static final String f3015f = "LOCALE";

    /* renamed from: g */
    public static final String f3016g = "JAVA_CRASH";

    /* renamed from: h */
    public static final String f3017h = "NATIVE_CRASH";

    /* renamed from: i */
    public static final String f3018i = "HAS_OEM_VERSION";

    /* renamed from: j */
    public static final String f3019j = "PACKAGE_OEM_VERSION_CODE";

    /* renamed from: k */
    public static final String f3020k = "HAS_LOGIN";

    /* renamed from: l */
    public static final String f3021l = "IS_VIP";

    /* renamed from: m */
    public static final String f3022m = "SDCARD_SIZE";

    /* renamed from: n */
    public static final String f3023n = "SDCARD_AVAILABLE_SIZE";

    /* renamed from: o */
    public static final String f3024o = "INNER_AVAILABLE_SIZE";

    /* renamed from: p */
    public static final String f3025p = "INNER_AVAILABLE_SIZE";

    /* renamed from: q */
    public static final String f3026q = "USER_ACCOUNT";

    /* renamed from: r */
    public static final String f3027r = "BACKSPACE_CLICK";

    /* renamed from: s */
    public static final String f3028s = "DEFAULT_INPUT_METHOD";

    /* renamed from: t */
    public static final String f3029t = "CLICK_50";

    /* renamed from: u */
    public static final String f3030u = "CLICK_100";

    /* renamed from: v */
    public static final String f3031v = "CLICK_200";

    /* renamed from: w */
    public static final String f3032w = "CLICK_500";

    /* renamed from: x */
    public static final String f3033x = "CLICK_LONGER";

    /* renamed from: y */
    public static final String f3034y = "CURVE_COUNT";

    /* renamed from: z */
    public static final String f3035z = "COMMIT_TEXT_LENGTH";

    /* renamed from: E */
    private File f3036E = new File(C1358O.m6234a(C1358O.f4204o), "states");

    /* renamed from: F */
    private JSONObject f3037F;

    /* renamed from: G */
    private Context f3038G = C1368X.m6313b();

    /* renamed from: H */
    private Stack<C1061a> f3039H;

    /* renamed from: com.cootek.smartinput5.a.e$b */
    /* compiled from: StatesCollector */
    public enum C1062b {
        keyUp,
        cand_draw,
        cand_buff_draw,
        kbd_draw,
        kbd_buf_draw
    }

    /* renamed from: com.cootek.smartinput5.a.e$a */
    /* compiled from: StatesCollector */
    class C1061a {

        /* renamed from: a */
        public C1062b f3040a;

        /* renamed from: b */
        public long f3041b;

        C1061a() {
        }
    }

    private C1060e() {
        if (!this.f3036E.exists()) {
            try {
                this.f3036E.createNewFile();
            } catch (IOException e) {
            }
        }
        try {
            String d = C0997e.m5192d(this.f3036E);
            if (d != null) {
                this.f3037F = new JSONObject(d).optJSONObject("states");
                if (this.f3037F == null) {
                    this.f3037F = new JSONObject();
                }
            }
        } catch (JSONException e2) {
            this.f3037F = new JSONObject();
        }
        f3008D = 0;
    }

    /* renamed from: a */
    public void mo4270a() {
        if (this.f3037F != null) {
            try {
                this.f3037F.put(f3011b, Build.VERSION.SDK_INT);
                this.f3037F.put(f3012c, Build.MODEL);
                C1617br a = C1617br.m7367a();
                this.f3037F.put(f3020k, a.mo6337d());
                this.f3037F.put(f3021l, a.mo6335b());
                this.f3037F.put(f3015f, this.f3038G.getResources().getConfiguration().locale.toString());
                File file = null;
                try {
                    file = Environment.getExternalStorageDirectory();
                } catch (Exception e) {
                }
                if (file != null) {
                    StatFs statFs = new StatFs(file.getPath());
                    long blockSize = (long) statFs.getBlockSize();
                    long blockCount = (long) statFs.getBlockCount();
                    this.f3037F.put(f3023n, (((long) statFs.getAvailableBlocks()) * blockSize) / 1024);
                    this.f3037F.put(f3022m, (blockSize * blockCount) / 1024);
                    File a2 = C1466av.m6848a(this.f3038G);
                    if (a2 != null) {
                        StatFs statFs2 = new StatFs(a2.getPath());
                        long blockSize2 = (long) statFs2.getBlockSize();
                        long blockCount2 = (long) statFs2.getBlockCount();
                        this.f3037F.put("INNER_AVAILABLE_SIZE", (((long) statFs2.getAvailableBlocks()) * blockSize2) / 1024);
                        this.f3037F.put("INNER_AVAILABLE_SIZE", (blockSize2 * blockCount2) / 1024);
                    }
                }
                this.f3037F.put(f3026q, m5597a(this.f3038G));
            } catch (IllegalArgumentException | JSONException e2) {
            }
        }
    }

    /* renamed from: a */
    private String m5597a(Context context) {
        Account a;
        AccountManager accountManager = AccountManager.get(context);
        if (accountManager == null || (a = m5596a(accountManager)) == null) {
            return null;
        }
        return a.name;
    }

    /* renamed from: a */
    private Account m5596a(AccountManager accountManager) {
        try {
            Account[] accountsByType = accountManager.getAccountsByType(GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE);
            if (accountsByType.length > 0) {
                return accountsByType[0];
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: b */
    public static C1060e m5598b() {
        if (f3009I == null) {
            f3009I = new C1060e();
        }
        return f3009I;
    }

    /* renamed from: a */
    public void mo4274a(String str, Object obj) {
        mo4275a(str, obj, true);
    }

    /* renamed from: a */
    public void mo4275a(String str, Object obj, boolean z) {
        System.currentTimeMillis();
        if (this.f3037F != null) {
            try {
                this.f3037F.put(str, obj);
            } catch (JSONException e) {
            }
        }
        if (z && C1368X.m6324d()) {
            C1246d.m6010a(C1368X.m6313b()).mo4591a(C1246d.f3796bM + str, String.valueOf(obj), C1246d.f3937i);
        }
    }

    /* renamed from: c */
    public synchronized void mo4276c() {
        if (this.f3037F != null) {
            try {
                FileWriter fileWriter = new FileWriter(this.f3036E);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("states", this.f3037F);
                fileWriter.append(jSONObject.toString());
                fileWriter.flush();
                fileWriter.close();
                m5600d();
            } catch (IOException | JSONException e) {
            }
        }
    }

    /* renamed from: a */
    public void mo4272a(String str) {
        mo4273a(str, 1);
    }

    /* renamed from: a */
    public void mo4273a(String str, int i) {
        System.currentTimeMillis();
        if (this.f3037F != null) {
            try {
                this.f3037F.put(str, this.f3037F.opt(str) == null ? 1 : this.f3037F.optInt(str) + i);
                f3008D++;
                if (f3008D >= 20) {
                    mo4276c();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private void m5600d() {
        f3009I = null;
        f3008D = 0;
    }

    /* renamed from: a */
    public void mo4271a(C1062b bVar) {
        if (this.f3039H == null) {
            this.f3039H = new Stack<>();
        }
        if (!TextUtils.equals(bVar.toString(), C1062b.keyUp.toString())) {
            m5599b(bVar);
        } else if (!this.f3039H.isEmpty()) {
            long j = 0;
            do {
                C1061a pop = this.f3039H.pop();
                if (j == 0 && !TextUtils.equals(pop.f3040a.toString(), C1062b.keyUp.toString())) {
                    j = pop.f3041b;
                }
                if (TextUtils.equals(pop.f3040a.toString(), C1062b.keyUp.toString()) && j > 0) {
                    long j2 = j - pop.f3041b;
                    if (j2 < f3007C) {
                        if (j2 <= 50) {
                            mo4272a(f3029t);
                        } else if (j2 <= 100) {
                            mo4272a(f3030u);
                        } else if (j2 <= 200) {
                            mo4272a(f3031v);
                        } else if (j2 <= 500) {
                            mo4272a(f3032w);
                        } else {
                            mo4272a(f3033x);
                        }
                    }
                    this.f3039H.clear();
                    m5599b(bVar);
                    return;
                }
            } while (!this.f3039H.isEmpty());
        } else {
            m5599b(bVar);
        }
    }

    /* renamed from: b */
    private void m5599b(C1062b bVar) {
        C1061a aVar = new C1061a();
        aVar.f3040a = bVar;
        aVar.f3041b = System.currentTimeMillis();
        this.f3039H.push(aVar);
    }
}
