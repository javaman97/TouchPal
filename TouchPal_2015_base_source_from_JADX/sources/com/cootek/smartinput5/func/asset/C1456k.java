package com.cootek.smartinput5.func.asset;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.cootek.smartinput5.func.C1443as;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.cootek.smartinput5.func.asset.k */
/* compiled from: InternalAssetProcessor */
public class C1456k implements C1445b {

    /* renamed from: a */
    private final String f4659a = "file:///android_asset/";

    /* renamed from: a */
    public InputStream mo6098a(Context context, C1443as asVar, String str) throws IOException {
        return m6780a(m6778a(asVar), str);
    }

    /* renamed from: a */
    public InputStream mo6099a(Context context, String str) throws IOException {
        return m6780a(m6777a(context), str);
    }

    /* renamed from: a */
    private InputStream m6780a(AssetManager assetManager, String str) throws IOException {
        if (assetManager != null) {
            return assetManager.open(str);
        }
        return null;
    }

    /* renamed from: b */
    public C1444a mo6101b(Context context, String str) throws IOException {
        String str2 = null;
        if (!(context == null || context.getFileStreamPath(str) == null)) {
            str2 = context.getFileStreamPath(str).getAbsolutePath();
        }
        return m6779a(m6777a(context), str, str2);
    }

    /* renamed from: b */
    public C1444a mo6100b(Context context, C1443as asVar, String str) throws IOException {
        return m6779a(m6778a(asVar), str, asVar.mo6020a());
    }

    /* renamed from: a */
    private C1444a m6779a(AssetManager assetManager, String str, String str2) throws IOException {
        AssetFileDescriptor b = m6781b(assetManager, str);
        if (b != null) {
            return new C1455j(b, b.createInputStream(), str2);
        }
        return null;
    }

    /* renamed from: b */
    private AssetFileDescriptor m6781b(AssetManager assetManager, String str) throws IOException {
        if (assetManager != null) {
            return assetManager.openFd(str);
        }
        return null;
    }

    /* renamed from: c */
    public String[] mo6103c(Context context, String str) throws IOException {
        return m6782c(m6777a(context), str);
    }

    /* renamed from: c */
    public String[] mo6102c(Context context, C1443as asVar, String str) throws IOException {
        return m6782c(m6778a(asVar), str);
    }

    /* renamed from: c */
    private String[] m6782c(AssetManager assetManager, String str) throws IOException {
        if (assetManager != null) {
            return assetManager.list(str);
        }
        return null;
    }

    /* renamed from: d */
    public Typeface mo6104d(Context context, C1443as asVar, String str) {
        AssetManager a = m6778a(asVar);
        if (a != null) {
            return Typeface.createFromAsset(a, str);
        }
        return null;
    }

    /* renamed from: d */
    public String mo6105d(Context context, String str) {
        return "file:///android_asset/" + str;
    }

    /* renamed from: a */
    private AssetManager m6778a(C1443as asVar) {
        if (asVar != null) {
            return asVar.getAssets();
        }
        return null;
    }

    /* renamed from: a */
    private AssetManager m6777a(Context context) {
        if (context != null) {
            return context.getAssets();
        }
        return null;
    }
}
