package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.C3912d;

/* renamed from: com.google.android.gms.maps.internal.f */
public interface C3860f extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.f$a */
    public static abstract class C3861a extends Binder implements C3860f {

        /* renamed from: com.google.android.gms.maps.internal.f$a$a */
        private static class C3862a implements C3860f {

            /* renamed from: a */
            private IBinder f16011a;

            C3862a(IBinder iBinder) {
                this.f16011a = iBinder;
            }

            public IBinder asBinder() {
                return this.f16011a;
            }

            /* renamed from: e */
            public void mo12568e(C3912d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f16011a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3861a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        }

        /* renamed from: C */
        public static C3860f m16783C(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3860f)) ? new C3862a(iBinder) : (C3860f) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    mo12568e(C3912d.C3913a.m16889Q(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: e */
    void mo12568e(C3912d dVar) throws RemoteException;
}
