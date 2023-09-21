package com.cootek.smartinput5.func.nativeads;

import android.content.pm.PackageManager;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.func.nativeads.b */
/* compiled from: AdsLoader */
public abstract class C1876b {

    /* renamed from: a */
    protected C1902y f6259a;

    /* renamed from: com.cootek.smartinput5.func.nativeads.b$a */
    /* compiled from: AdsLoader */
    public interface C1877a {
        /* renamed from: a */
        void mo7008a();

        /* renamed from: b */
        void mo7009b();
    }

    /* renamed from: a */
    public abstract void mo7002a();

    /* renamed from: a */
    public abstract void mo7003a(C1877a aVar);

    /* renamed from: a */
    public abstract void mo7004a(String str);

    /* renamed from: b */
    public abstract C1875a mo7005b();

    /* renamed from: c */
    public abstract void mo7007c();

    public C1876b(C1902y yVar) {
        this.f6259a = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo7006b(String str) {
        PackageManager packageManager = C1368X.m6313b().getPackageManager();
        if (packageManager == null) {
            return false;
        }
        try {
            if (packageManager.getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
