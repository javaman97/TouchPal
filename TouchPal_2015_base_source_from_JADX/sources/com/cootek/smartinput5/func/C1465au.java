package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.func.au */
/* compiled from: InstalledPackage */
public class C1465au extends ContextWrapper implements C1443as {

    /* renamed from: a */
    private boolean f4689a = true;

    /* renamed from: b */
    private int f4690b;

    public C1465au(Context context) {
        super(context);
        m6841a(context);
    }

    /* renamed from: a */
    private void m6841a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                this.f4690b = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public String mo6020a() {
        return getBaseContext().getApplicationInfo().sourceDir;
    }

    /* renamed from: b */
    public boolean mo6023b() {
        return true;
    }

    /* renamed from: a */
    public void mo6021a(boolean z) {
        this.f4689a = z;
    }

    /* renamed from: c */
    public boolean mo6024c() {
        return this.f4689a;
    }

    /* renamed from: d */
    public boolean mo6025d() {
        String packageName = getPackageName();
        if (!TextUtils.isEmpty(packageName) && !packageName.equals(C1368X.m6313b().getPackageName())) {
            if (C1368X.m6324d() && packageName.startsWith(C1811k.f5994l)) {
                C1368X.m6320c().mo5841n().mo6289n(packageName);
            }
            Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:" + packageName));
            intent.setFlags(Engine.EXCEPTION_ERROR);
            startActivity(intent);
        }
        return false;
    }

    /* renamed from: e */
    public int mo6026e() {
        return this.f4690b;
    }
}
