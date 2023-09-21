package com.cootek.smartinput5.func.component;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.cmd.C2270d;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.control.C2849W;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.func.component.T */
/* compiled from: ImportExportDictionary */
public class C1659T {

    /* renamed from: a */
    public static final int f5385a = 1;

    /* renamed from: b */
    public static final int f5386b = 2;

    /* renamed from: c */
    public static final int f5387c = 3;

    /* renamed from: d */
    private static final String f5388d = "ImportExportDictionary";

    /* renamed from: e */
    private static final String[] f5389e = {"western.usr", "chinese_simplified.usr", "chinese_traditional.usr"};

    /* renamed from: f */
    private static final String[] f5390f = {"western_exported.txt", "chinese_simplified_exported.txt", "chinese_traditional_exported.txt"};

    /* renamed from: g */
    private static final int f5391g = f5389e.length;

    /* renamed from: h */
    private static boolean f5392h = false;

    /* renamed from: i */
    private static boolean f5393i = false;

    /* renamed from: j */
    private Map<String, String> f5394j;

    /* renamed from: k */
    private Context f5395k;

    /* renamed from: l */
    private File f5396l;

    /* renamed from: m */
    private File f5397m;

    public C1659T(Context context) {
        this.f5394j = null;
        this.f5394j = new HashMap();
        for (int i = 0; i < f5391g; i++) {
            this.f5394j.put(f5389e[i], f5390f[i]);
        }
        this.f5395k = context;
        this.f5396l = C1466av.m6848a(context);
        this.f5397m = C1466av.m6849a(context, C1466av.f4698g);
    }

    /* renamed from: a */
    public boolean mo6481a(boolean z) {
        return mo6482a(f5389e, z);
    }

    /* renamed from: a */
    public boolean mo6482a(String[] strArr, boolean z) {
        if (!C1368X.m6324d()) {
            return false;
        }
        m7596a();
        Okinawa h = C1368X.m6320c().mo5835h();
        h.release();
        m7598a(strArr);
        h.init();
        boolean c = m7605c(strArr) & true & m7603b(strArr);
        m7600b();
        m7597a(c, z);
        return c;
    }

    /* renamed from: a */
    private void m7598a(String[] strArr) {
        for (String str : strArr) {
            File file = new File(this.f5396l, str);
            File file2 = new File(this.f5397m, str);
            if (file.exists()) {
                C0997e.m5173a(file, file2);
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private void m7596a() {
        if (!this.f5397m.exists()) {
            this.f5397m.mkdir();
        }
    }

    /* renamed from: b */
    private void m7600b() {
        C0997e.m5172a(this.f5397m);
    }

    /* renamed from: b */
    private boolean m7603b(String[] strArr) {
        boolean z;
        if (!Engine.isInitialized()) {
            return true;
        }
        Engine.getInstance().fireTransactionOperation(1);
        int length = strArr.length;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= length) {
                z = z2;
                break;
            }
            String str = strArr[i];
            if (!this.f5394j.containsKey(str)) {
                z = z2;
            } else {
                String str2 = this.f5394j.get(str);
                File file = new File(this.f5396l, str2);
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                    }
                }
                z = m7599a(str, str2) | z2;
                if (!z) {
                    break;
                }
            }
            i++;
            z2 = z;
        }
        boolean z3 = z & true;
        Engine.getInstance().fireTransactionOperation(2);
        Engine.getInstance().processEvent();
        return z3;
    }

    /* renamed from: c */
    private boolean m7605c(String[] strArr) {
        boolean z;
        if (!Engine.isInitialized()) {
            return true;
        }
        Engine.getInstance().fireTransactionOperation(1);
        int length = strArr.length;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= length) {
                z = z2;
                break;
            }
            String str = strArr[i];
            if (!this.f5394j.containsKey(str)) {
                z = z2;
            } else {
                String str2 = this.f5394j.get(str);
                File file = new File(this.f5396l, str2);
                if (file.exists()) {
                    z = m7602b(str, str2) | z2;
                    file.delete();
                } else {
                    z = z2;
                }
                if (!z) {
                    break;
                }
            }
            i++;
            z2 = z;
        }
        boolean z3 = z & true;
        Engine.getInstance().fireTransactionOperation(2);
        Engine.getInstance().processEvent();
        return z3;
    }

    /* renamed from: a */
    private boolean m7599a(String str, String str2) {
        f5392h = false;
        if (Engine.isInitialized()) {
            System.currentTimeMillis();
            Engine.getInstance().fireExportUserDictionaryOperation(str, str2);
            Engine.getInstance().processEvent();
        }
        return f5392h;
    }

    /* renamed from: b */
    private boolean m7602b(String str, String str2) {
        f5393i = false;
        if (Engine.isInitialized()) {
            System.currentTimeMillis();
            Engine.getInstance().fireImportUserDictionaryOperation(str, str2);
            Engine.getInstance().processEvent();
        }
        return f5393i;
    }

    /* renamed from: b */
    public static void m7601b(boolean z) {
        f5392h = z;
    }

    /* renamed from: c */
    public static void m7604c(boolean z) {
        f5393i = z;
    }

    /* renamed from: a */
    public void mo6480a(int i) {
        String str = null;
        switch (i) {
            case 1:
                str = C1974m.m9063a(this.f5395k, (int) R.string.rebuild_language_data_success);
                break;
            case 2:
                str = C1974m.m9063a(this.f5395k, (int) R.string.rebuild_language_data_failed);
                break;
            case 3:
                str = C1974m.m9063a(this.f5395k, (int) R.string.rebuild_language_data_nothing);
                break;
        }
        if (!TextUtils.isEmpty(str)) {
            C2849W.m13205a().mo9476a(str);
        }
    }

    /* renamed from: a */
    private void m7597a(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(C2270d.f9912d, z ? C1246d.f3946r : C1246d.f3947s);
        hashMap.put("type", z2 ? C1246d.f3712I : C1246d.f3711H);
        C1246d.m6010a(this.f5395k).mo4593a("DICT_RECOVERY/USER_DICT_REBUILD", (Map<String, Object>) hashMap, C1246d.f3836c);
    }
}
