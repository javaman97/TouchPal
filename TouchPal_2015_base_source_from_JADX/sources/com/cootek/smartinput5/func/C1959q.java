package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.func.q */
/* compiled from: BlackListManager */
public class C1959q {

    /* renamed from: a */
    private static String f6656a = "com.android.launcher";

    public C1959q(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveInfo = null;
        try {
            resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
        } catch (Exception e) {
        }
        if (resolveInfo != null && resolveInfo.activityInfo != null && !TextUtils.isEmpty(resolveInfo.activityInfo.packageName)) {
            f6656a = resolveInfo.activityInfo.packageName;
        }
    }

    /* renamed from: a */
    public boolean mo7179a() {
        EditorInfo editorInfo = null;
        if (Engine.isInitialized()) {
            editorInfo = Engine.getInstance().getEditor().getEditorInfo();
        }
        if (editorInfo != null) {
            String str = editorInfo.packageName;
            if ("GT-I9300".equalsIgnoreCase(Build.MODEL) && "com.android.email".equalsIgnoreCase(str)) {
                return false;
            }
            if (TextUtils.isEmpty(str) || !str.startsWith("cn.wps.moffice")) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo7181b() {
        EditorInfo editorInfo;
        if (!"GT-I9300".equalsIgnoreCase(Build.MODEL) || !"4.0.4".equalsIgnoreCase(Build.VERSION.RELEASE) || !Engine.isInitialized() || (editorInfo = Engine.getInstance().getEditor().getEditorInfo()) == null || 180225 != editorInfo.inputType || !"com.android.email".equalsIgnoreCase(editorInfo.packageName)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo7183c() {
        EditorInfo editorInfo;
        if (!Engine.isInitialized() || (editorInfo = Engine.getInstance().getEditor().getEditorInfo()) == null || (!"com.evernote".equalsIgnoreCase(editorInfo.packageName) && (TextUtils.isEmpty(editorInfo.packageName) || !editorInfo.packageName.startsWith("com.evernote.")))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo7185d() {
        EditorInfo editorInfo;
        if (!Engine.isInitialized() || (editorInfo = Engine.getInstance().getEditor().getEditorInfo()) == null || ((Build.VERSION.SDK_INT < 16 || !"com.htc.android.mail".equalsIgnoreCase(editorInfo.packageName)) && m8980f(editorInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo7180a(EditorInfo editorInfo) {
        if (editorInfo != null) {
            if ("com.UCMobile".equalsIgnoreCase(editorInfo.packageName)) {
                return false;
            }
            if (Build.VERSION.SDK_INT == 16 && (editorInfo.inputType & 4080) == 160 && "com.android.browser".equalsIgnoreCase(editorInfo.packageName)) {
                return false;
            }
            if (("com.evernote".equalsIgnoreCase(editorInfo.packageName) || (!TextUtils.isEmpty(editorInfo.packageName) && editorInfo.packageName.startsWith("com.evernote."))) && "L36h".equalsIgnoreCase(Build.MODEL)) {
                return false;
            }
            if ((!"com.android.chrome".equalsIgnoreCase(editorInfo.packageName) || (editorInfo.inputType & 4080) != 160) && m8980f(editorInfo)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo7182b(EditorInfo editorInfo) {
        if (editorInfo != null) {
            if ("com.google.android.keep".equalsIgnoreCase(editorInfo.packageName) && (editorInfo.inputType & 65536) == 65536) {
                return false;
            }
            if ("com.UCMobile".equalsIgnoreCase(editorInfo.packageName) && (editorInfo.inputType & 4080) == 160) {
                return false;
            }
            if ("com.tencent.mtt".equalsIgnoreCase(editorInfo.packageName) && (editorInfo.inputType & 4080) == 160) {
                return false;
            }
            if ((!"com.android.chrome".equalsIgnoreCase(editorInfo.packageName) || (editorInfo.inputType & 4080) != 160) && m8980f(editorInfo)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m8980f(EditorInfo editorInfo) {
        boolean z;
        if (editorInfo == null) {
            return true;
        }
        if ((editorInfo.inputType & 16773120 & 65536) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo7184c(EditorInfo editorInfo) {
        if (editorInfo == null || ((!"com.facebook.katana".equalsIgnoreCase(editorInfo.packageName) || 180225 != editorInfo.inputType) && (editorInfo.inputType & 4080) != 160)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo7186d(EditorInfo editorInfo) {
        if (editorInfo == null || (editorInfo.inputType & 524288) != 524288) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo7187e() {
        if ("GT-I9300".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo7189f() {
        EditorInfo editorInfo;
        if (!Engine.isInitialized() || (editorInfo = Engine.getInstance().getEditor().getEditorInfo()) == null || (editorInfo.inputType & 4080) != 160 || (!"MI 2".equalsIgnoreCase(Build.MODEL) && (Build.VERSION.SDK_INT >= 17 || !"Galaxy Nexus".equalsIgnoreCase(Build.MODEL)))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo7188e(EditorInfo editorInfo) {
        if (editorInfo == null || !f6656a.equalsIgnoreCase(editorInfo.packageName)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo7190g() {
        return false;
    }

    /* renamed from: h */
    public static boolean m8981h() {
        if (Build.VERSION.SDK_INT != 15 || !"LNV-Lenovo A600e".equalsIgnoreCase(Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo7191i() {
        if (!"meizu".equalsIgnoreCase(Build.MANUFACTURER) || (!"mx2".equalsIgnoreCase(Build.DEVICE) && !"mx3".equalsIgnoreCase(Build.DEVICE))) {
            return false;
        }
        return true;
    }
}
