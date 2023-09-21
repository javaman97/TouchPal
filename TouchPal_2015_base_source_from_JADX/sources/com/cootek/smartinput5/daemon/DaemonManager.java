package com.cootek.smartinput5.daemon;

import android.content.Context;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p046b.C1132b;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class DaemonManager {

    /* renamed from: a */
    public static boolean f3959a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f3960b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Context f3961c;

    /* renamed from: d */
    private static final int f3962d = 0;

    /* renamed from: e */
    private static Handler f3963e = new C1248a();

    public static native int init(String str, String str2, String str3, String str4, String str5, long j, long j2, Object[] objArr);

    public static native void onSocketSetup();

    /* renamed from: a */
    public static String m6037a() {
        File file = new File(C1358O.m6234a(C1358O.f4204o), "token");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            if (Settings.isInitialized()) {
                String stringSetting = Settings.getInstance().getStringSetting(88);
                if (!TextUtils.isEmpty(stringSetting)) {
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.append(stringSetting);
                    fileWriter.flush();
                    fileWriter.close();
                }
            }
            return file.getAbsolutePath();
        } catch (IOException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m6039a(Context context) {
        if (C1368X.m6324d() && !f3960b && !C1132b.m5654a(context).mo4410d()) {
            f3961c = context;
            f3963e.removeMessages(0);
            f3963e.sendEmptyMessageDelayed(0, 2000);
        }
    }

    /* renamed from: b */
    protected static Object[] m6042b() {
        File a = C1358O.m6234a(C1358O.f4204o);
        ArrayList arrayList = new ArrayList();
        for (String a2 : C1056a.f2974e) {
            String a3 = m6038a(a, a2);
            if (!TextUtils.isEmpty(a3)) {
                arrayList.add(a3);
            }
        }
        return arrayList.toArray();
    }

    /* renamed from: a */
    private static String m6038a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                return null;
            }
        }
        return file2.getAbsolutePath();
    }

    /* renamed from: c */
    public static boolean m6044c() {
        return f3960b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m6043c(Context context) {
        Object systemService = context.getSystemService("user");
        if (systemService == null) {
            return null;
        }
        try {
            Object invoke = Process.class.getMethod("myUserHandle", (Class[]) null).invoke(Process.class, (Object[]) null);
            return String.valueOf(((Long) systemService.getClass().getMethod("getSerialNumberForUser", new Class[]{invoke.getClass()}).invoke(systemService, new Object[]{invoke})).longValue());
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            return null;
        }
    }
}
