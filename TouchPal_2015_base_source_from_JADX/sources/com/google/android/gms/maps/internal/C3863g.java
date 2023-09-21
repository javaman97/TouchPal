package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C3549b;

/* renamed from: com.google.android.gms.maps.internal.g */
public interface C3863g extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.g$a */
    public static abstract class C3864a extends Binder implements C3863g {

        /* renamed from: com.google.android.gms.maps.internal.g$a$a */
        private static class C3865a implements C3863g {

            /* renamed from: a */
            private IBinder f16012a;

            C3865a(IBinder iBinder) {
                this.f16012a = iBinder;
            }

            public IBinder asBinder() {
                return this.f16012a;
            }

            /* renamed from: e */
            public void mo12790e(C3549b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f16012a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: D */
        public static C3863g m16786D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3863g)) ? new C3865a(iBinder) : (C3863g) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    mo12790e(C3549b.C3550a.m15488l(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: e */
    void mo12790e(C3549b bVar) throws RemoteException;
}
