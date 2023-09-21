package com.cootek.smartinput5.p066ui;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;

/* renamed from: com.cootek.smartinput5.ui.d */
/* compiled from: AlertCustomDialog */
public class C2894d extends AlertDialog {
    protected C2894d(Context context) {
        super(context);
    }

    /* renamed from: com.cootek.smartinput5.ui.d$a */
    /* compiled from: AlertCustomDialog */
    public static class C2895a extends AlertDialog.Builder {
        public C2895a(Context context) {
            super(context);
        }

        @SuppressLint({"NewApi"})
        public C2895a(Context context, int i) {
            super(context, i);
        }

        public AlertDialog show() {
            try {
                return super.show();
            } catch (Exception e) {
                return super.create();
            }
        }
    }

    /* renamed from: a */
    public static boolean m13347a() {
        if (Build.VERSION.SDK_INT >= 14) {
            return false;
        }
        return true;
    }

    public void show() {
        try {
            super.show();
        } catch (Exception e) {
        }
    }
}
