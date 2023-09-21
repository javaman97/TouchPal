package com.p023a.p024a.p041c;

import android.content.Context;
import android.os.Environment;
import com.cootek.geo.AbsGeoLocationItem;
import java.io.File;
import java.io.IOException;

/* renamed from: com.a.a.c.g */
/* compiled from: StorageUtils */
public final class C0816g {

    /* renamed from: a */
    private static final String f2140a = "android.permission.WRITE_EXTERNAL_STORAGE";

    /* renamed from: b */
    private static final String f2141b = "uil-images";

    private C0816g() {
    }

    /* renamed from: a */
    public static File m4637a(Context context) {
        return m4639a(context, true);
    }

    /* renamed from: a */
    public static File m4639a(Context context, boolean z) {
        String str;
        File file = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException e) {
            str = "";
        }
        if (z && "mounted".equals(str) && m4642d(context)) {
            file = m4641c(context);
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file != null) {
            return file;
        }
        String str2 = "/data/data/" + context.getPackageName() + "/cache/";
        C0813d.m4629c("Can't define system cache directory! '%s' will be used.", str2);
        return new File(str2);
    }

    /* renamed from: b */
    public static File m4640b(Context context) {
        File a = m4637a(context);
        File file = new File(a, f2141b);
        return (file.exists() || file.mkdir()) ? file : a;
    }

    /* renamed from: a */
    public static File m4638a(Context context, String str) {
        File file = null;
        if ("mounted".equals(Environment.getExternalStorageState()) && m4642d(context)) {
            file = new File(Environment.getExternalStorageDirectory(), str);
        }
        if (file == null || (!file.exists() && !file.mkdirs())) {
            return context.getCacheDir();
        }
        return file;
    }

    /* renamed from: c */
    private static File m4641c(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), AbsGeoLocationItem.LOCATION_RESULTTYPE_CACHE);
        if (file.exists()) {
            return file;
        }
        if (!file.mkdirs()) {
            C0813d.m4629c("Unable to create external cache directory", new Object[0]);
            return null;
        }
        try {
            new File(file, ".nomedia").createNewFile();
            return file;
        } catch (IOException e) {
            C0813d.m4627b("Can't create \".nomedia\" file in application external cache directory", new Object[0]);
            return file;
        }
    }

    /* renamed from: d */
    private static boolean m4642d(Context context) {
        return context.checkCallingOrSelfPermission(f2140a) == 0;
    }
}
