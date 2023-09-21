package com.cootek.smartinput5.func;

import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.aR */
/* compiled from: NotInstalledPackage */
public class C1407aR implements C1443as {

    /* renamed from: a */
    private Resources f4458a = null;

    /* renamed from: b */
    private String f4459b;

    /* renamed from: c */
    private AssetManager f4460c;

    /* renamed from: d */
    private String f4461d;

    /* renamed from: e */
    private boolean f4462e;

    /* renamed from: f */
    private DisplayMetrics f4463f;

    /* renamed from: g */
    private Configuration f4464g;

    /* renamed from: h */
    private final int f4465h;

    /* renamed from: i */
    private int f4466i;

    public C1407aR(PackageInfo packageInfo, String str, String str2, DisplayMetrics displayMetrics, Configuration configuration, int i) {
        this.f4466i = packageInfo.versionCode;
        this.f4459b = str;
        this.f4460c = null;
        this.f4461d = str2;
        this.f4463f = displayMetrics;
        this.f4464g = configuration;
        this.f4462e = true;
        this.f4465h = i;
    }

    public Resources getResources() {
        Resources resources;
        if (this.f4458a != null) {
            return this.f4458a;
        }
        Class<AssetManager> cls = AssetManager.class;
        try {
            Constructor<AssetManager> constructor = cls.getConstructor(new Class[0]);
            if (this.f4460c == null) {
                AssetManager newInstance = constructor.newInstance(new Object[0]);
                cls.getDeclaredMethod("addAssetPath", new Class[]{String.class}).invoke(newInstance, new Object[]{this.f4461d});
                this.f4460c = newInstance;
            }
            resources = Resources.class.getConstructor(new Class[]{cls, DisplayMetrics.class, Configuration.class}).newInstance(new Object[]{this.f4460c, this.f4463f, this.f4464g});
        } catch (Exception e) {
            resources = null;
        }
        this.f4458a = resources;
        return resources;
    }

    public String getPackageName() {
        return this.f4459b;
    }

    public AssetManager getAssets() {
        AssetManager assetManager;
        if (this.f4460c != null) {
            return this.f4460c;
        }
        Class<AssetManager> cls = AssetManager.class;
        try {
            assetManager = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            try {
                cls.getDeclaredMethod("addAssetPath", new Class[]{String.class}).invoke(assetManager, new Object[]{this.f4461d});
            } catch (Exception e) {
            }
        } catch (Exception e2) {
            assetManager = null;
        }
        this.f4460c = assetManager;
        return assetManager;
    }

    /* renamed from: a */
    public String mo6020a() {
        return this.f4461d;
    }

    /* renamed from: b */
    public boolean mo6023b() {
        return false;
    }

    /* renamed from: a */
    public void mo6021a(boolean z) {
        this.f4462e = z;
    }

    /* renamed from: c */
    public boolean mo6024c() {
        return this.f4462e;
    }

    /* renamed from: d */
    public boolean mo6025d() {
        return mo6022a(true, true);
    }

    /* renamed from: a */
    public boolean mo6022a(boolean z, boolean z2) {
        boolean delete = new File(this.f4461d).delete();
        if (z2) {
            delete &= m6609g();
        }
        if (z && delete) {
            C1811k.m8322a().mo6819a(this.f4459b, false);
        }
        return delete;
    }

    /* renamed from: g */
    private boolean m6609g() {
        C1810j jVar = null;
        if (this.f4465h != -1) {
            Iterator<C1810j> it = C1811k.m8322a().mo6814a(this.f4465h, (String) null, true).iterator();
            while (it.hasNext()) {
                C1810j next = it.next();
                if (!next.f5932a.mo6023b() || !TextUtils.equals(next.f5932a.getPackageName(), getPackageName())) {
                    if (!next.f5932a.mo6023b()) {
                        C1407aR aRVar = (C1407aR) next.f5932a;
                        if (TextUtils.equals(aRVar.getPackageName(), getPackageName())) {
                            aRVar.mo6022a(false, false);
                        }
                    }
                    next = jVar;
                }
                jVar = next;
            }
            if (jVar != null) {
                jVar.f5932a.mo6025d();
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void mo6027f() {
        this.f4460c = null;
        this.f4458a = null;
    }

    /* renamed from: e */
    public int mo6026e() {
        return this.f4466i;
    }
}
