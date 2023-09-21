package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.C3912d;

/* renamed from: com.google.android.gms.maps.internal.k */
public interface C3875k extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.k$a */
    public static abstract class C3876a extends Binder implements C3875k {

        /* renamed from: com.google.android.gms.maps.internal.k$a$a */
        private static class C3877a implements C3875k {

            /* renamed from: a */
            private IBinder f16016a;

            C3877a(IBinder iBinder) {
                this.f16016a = iBinder;
            }

            public IBinder asBinder() {
                return this.f16016a;
            }

            /* renamed from: b */
            public void mo12565b(C3912d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f16016a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo12566c(C3912d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f16016a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo12567d(C3912d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f16016a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3876a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerDragListener");
        }

        /* renamed from: H */
        public static C3875k m16796H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3875k)) ? new C3877a(iBinder) : (C3875k) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    mo12565b(C3912d.C3913a.m16889Q(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    mo12567d(C3912d.C3913a.m16889Q(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    mo12566c(C3912d.C3913a.m16889Q(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: b */
    void mo12565b(C3912d dVar) throws RemoteException;

    /* renamed from: c */
    void mo12566c(C3912d dVar) throws RemoteException;

    /* renamed from: d */
    void mo12567d(C3912d dVar) throws RemoteException;
}
