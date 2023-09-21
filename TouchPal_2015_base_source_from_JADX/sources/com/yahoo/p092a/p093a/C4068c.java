package com.yahoo.p092a.p093a;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.yahoo.a.a.c */
public final class C4068c {
    /* renamed from: a */
    private static synchronized void m17305a(String str, Context context) {
        synchronized (C4068c.class) {
            m17309b("bcookie", str, context);
        }
    }

    /* renamed from: a */
    protected static synchronized String m17304a(Context context) {
        String c;
        synchronized (C4068c.class) {
            c = m17310c("bcookie", context);
        }
        return c;
    }

    /* renamed from: b */
    private static synchronized void m17308b(String str, Context context) {
        synchronized (C4068c.class) {
            m17309b(AppsFlyerLib.ATTRIBUTION_ID_COLUMN_NAME, str, context);
        }
    }

    /* renamed from: b */
    protected static synchronized String m17307b(Context context) {
        String c;
        synchronized (C4068c.class) {
            c = m17310c(AppsFlyerLib.ATTRIBUTION_ID_COLUMN_NAME, context);
        }
        return c;
    }

    /* renamed from: a */
    protected static synchronized void m17306a(String str, String str2, Context context) {
        synchronized (C4068c.class) {
            String str3 = "";
            if (str != null) {
                if (!str.equals("")) {
                    str3 = C4069d.m17313a(str);
                }
            }
            m17308b(str3, context);
            m17305a(str2, context);
        }
    }

    /* renamed from: c */
    private static String m17310c(String str, Context context) {
        if (context == null) {
            return "";
        }
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            byte[] bArr = new byte[openFileInput.available()];
            openFileInput.read(bArr, 0, bArr.length);
            openFileInput.close();
            return new String(bArr, Utils.UTF8);
        } catch (FileNotFoundException e) {
            return "";
        } catch (IOException e2) {
            return "";
        }
    }

    /* renamed from: b */
    private static void m17309b(String str, String str2, Context context) {
        if (context != null) {
            try {
                FileOutputStream openFileOutput = context.openFileOutput(str, 0);
                openFileOutput.write(str2.getBytes(Utils.UTF8));
                openFileOutput.close();
            } catch (FileNotFoundException | IOException e) {
            }
        }
    }
}
