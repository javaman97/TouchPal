package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C3802s;

/* renamed from: com.google.android.gms.dynamic.e */
public abstract class C3554e<T> {

    /* renamed from: dd */
    private final String f15335dd;

    /* renamed from: de */
    private T f15336de;

    /* renamed from: com.google.android.gms.dynamic.e$a */
    public static class C3555a extends Exception {
        public C3555a(String str) {
            super(str);
        }

        public C3555a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected C3554e(String str) {
        this.f15335dd = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final T mo11059h(Context context) throws C3555a {
        if (this.f15336de == null) {
            C3802s.m16678d(context);
            Context remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
            if (remoteContext == null) {
                throw new C3555a("Could not get remote context.");
            }
            try {
                this.f15336de = mo11060k((IBinder) remoteContext.getClassLoader().loadClass(this.f15335dd).newInstance());
            } catch (ClassNotFoundException e) {
                throw new C3555a("Could not load creator class.");
            } catch (InstantiationException e2) {
                throw new C3555a("Could not instantiate creator.");
            } catch (IllegalAccessException e3) {
                throw new C3555a("Could not access creator.");
            }
        }
        return this.f15336de;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract T mo11060k(IBinder iBinder);
}
