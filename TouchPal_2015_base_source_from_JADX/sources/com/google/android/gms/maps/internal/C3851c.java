package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C3549b;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.internal.C3903a;

/* renamed from: com.google.android.gms.maps.internal.c */
public interface C3851c extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.c$a */
    public static abstract class C3852a extends Binder implements C3851c {

        /* renamed from: com.google.android.gms.maps.internal.c$a$a */
        private static class C3853a implements C3851c {

            /* renamed from: a */
            private IBinder f16008a;

            C3853a(IBinder iBinder) {
                this.f16008a = iBinder;
            }

            /* renamed from: a */
            public IMapViewDelegate mo12773a(C3549b bVar, GoogleMapOptions googleMapOptions) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (googleMapOptions != null) {
                        obtain.writeInt(1);
                        googleMapOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16008a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return IMapViewDelegate.C3841a.m16757A(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12774a(C3549b bVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.f16008a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f16008a;
            }

            /* renamed from: bk */
            public ICameraUpdateFactoryDelegate mo12775bk() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.f16008a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return ICameraUpdateFactoryDelegate.C3833a.m16753t(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: bl */
            public C3903a mo12776bl() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.f16008a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3903a.C3904a.m16871N(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo12777c(C3549b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f16008a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public IMapFragmentDelegate mo12778d(C3549b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f16008a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return IMapFragmentDelegate.C3839a.m16756z(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: v */
        public static C3851c m16769v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3851c)) ? new C3853a(iBinder) : (C3851c) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    mo12777c(C3549b.C3550a.m15488l(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    IMapFragmentDelegate d = mo12778d(C3549b.C3550a.m15488l(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (d != null) {
                        iBinder = d.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    IMapViewDelegate a = mo12773a(C3549b.C3550a.m15488l(parcel.readStrongBinder()), parcel.readInt() != 0 ? GoogleMapOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    ICameraUpdateFactoryDelegate bk = mo12775bk();
                    parcel2.writeNoException();
                    if (bk != null) {
                        iBinder = bk.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    C3903a bl = mo12776bl();
                    parcel2.writeNoException();
                    if (bl != null) {
                        iBinder = bl.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    mo12774a(C3549b.C3550a.m15488l(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.ICreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IMapViewDelegate mo12773a(C3549b bVar, GoogleMapOptions googleMapOptions) throws RemoteException;

    /* renamed from: a */
    void mo12774a(C3549b bVar, int i) throws RemoteException;

    /* renamed from: bk */
    ICameraUpdateFactoryDelegate mo12775bk() throws RemoteException;

    /* renamed from: bl */
    C3903a mo12776bl() throws RemoteException;

    /* renamed from: c */
    void mo12777c(C3549b bVar) throws RemoteException;

    /* renamed from: d */
    IMapFragmentDelegate mo12778d(C3549b bVar) throws RemoteException;
}
