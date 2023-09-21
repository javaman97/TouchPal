package com.cootek.smartinput5.func;

import android.os.Build;

/* renamed from: com.cootek.smartinput5.func.w */
/* compiled from: ClipboardManagerFactory */
public class C2117w {

    /* renamed from: a */
    private static ClipboardManager f8990a;

    /* renamed from: a */
    public static ClipboardManager m9655a() {
        String str;
        if (f8990a == null) {
            if (Build.VERSION.SDK_INT < 11) {
                str = "com.cootek.smartinput5.func.ClipboardManager10";
            } else if (Build.VERSION.SDK_INT == 18) {
                str = "com.cootek.smartinput5.func.ClipboardManager18";
            } else {
                str = "com.cootek.smartinput5.func.ClipboardManager11_";
            }
            try {
                f8990a = (ClipboardManager) Class.forName(str).asSubclass(ClipboardManager.class).newInstance();
            } catch (Exception e) {
            }
        }
        return f8990a;
    }
}
