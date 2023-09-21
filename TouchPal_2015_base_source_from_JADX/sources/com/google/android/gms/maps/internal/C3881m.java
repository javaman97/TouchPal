package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C3549b;

/* renamed from: com.google.android.gms.maps.internal.m */
public interface C3881m extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.m$a */
    public static abstract class C3882a extends Binder implements C3881m {

        /* renamed from: com.google.android.gms.maps.internal.m$a$a */
        private static class C3883a implements C3881m {

            /* renamed from: a */
            private IBinder f16018a;

            C3883a(IBinder iBinder) {
                this.f16018a = iBinder;
            }

            public IBinder asBinder() {
                return this.f16018a;
            }

            /* renamed from: b */
            public void mo12558b(C3549b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f16018a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3882a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
        }

        /* renamed from: J */
        public static C3881m m16802J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3881m)) ? new C3883a(iBinder) : (C3881m) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    mo12558b(C3549b.C3550a.m15488l(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: b */
    void mo12558b(C3549b bVar) throws RemoteException;
}
