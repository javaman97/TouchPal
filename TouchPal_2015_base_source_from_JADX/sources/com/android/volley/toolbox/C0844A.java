package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.android.volley.C0837q;
import java.io.File;

/* renamed from: com.android.volley.toolbox.A */
/* compiled from: Volley */
public class C0844A {

    /* renamed from: a */
    private static final String f2238a = "volley";

    /* renamed from: a */
    public static C0837q m4737a(Context context, C0858j jVar) {
        File file = new File(context.getCacheDir(), f2238a);
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = packageName + "/" + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (jVar == null) {
            if (Build.VERSION.SDK_INT >= 9) {
                jVar = new C0859k();
            } else {
                jVar = new C0855h(AndroidHttpClient.newInstance(str));
            }
        }
        C0837q qVar = new C0837q(new C0851g(file), new C0847c(jVar));
        qVar.mo3093a();
        return qVar;
    }

    /* renamed from: a */
    public static C0837q m4736a(Context context) {
        return m4737a(context, (C0858j) null);
    }
}
