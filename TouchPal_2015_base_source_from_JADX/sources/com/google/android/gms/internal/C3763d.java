package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.cootek.smartinput5.net.cmd.C2300u;
import com.google.android.gms.common.data.C3525d;

/* renamed from: com.google.android.gms.internal.d */
public interface C3763d extends IInterface {

    /* renamed from: com.google.android.gms.internal.d$a */
    public static abstract class C3764a extends Binder implements C3763d {

        /* renamed from: com.google.android.gms.internal.d$a$a */
        private static class C3765a implements C3763d {

            /* renamed from: a */
            private IBinder f15822a;

            C3765a(IBinder iBinder) {
                this.f15822a = iBinder;
            }

            /* renamed from: a */
            public void mo11677a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    obtain.writeInt(i);
                    this.f15822a.transact(5005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11678a(int i, C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    obtain.writeInt(i);
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15822a.transact(C2300u.f10109g, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo11679a(C3525d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if (dVar != null) {
                        obtain.writeInt(1);
                        dVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15822a.transact(C2300u.f10110h, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f15822a;
            }

            public void onSignOutComplete() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    this.f15822a.transact(5004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onStateDeleted(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f15822a.transact(5003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3764a() {
            attachInterface(this, "com.google.android.gms.appstate.internal.IAppStateCallbacks");
        }

        /* renamed from: d */
        public static C3763d m16541d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3763d)) ? new C3765a(iBinder) : (C3763d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            C3525d dVar = null;
            switch (i) {
                case C2300u.f10109g:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        dVar = C3525d.CREATOR.createFromParcel(parcel);
                    }
                    mo11678a(readInt, dVar);
                    parcel2.writeNoException();
                    return true;
                case C2300u.f10110h:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if (parcel.readInt() != 0) {
                        dVar = C3525d.CREATOR.createFromParcel(parcel);
                    }
                    mo11679a(dVar);
                    parcel2.writeNoException();
                    return true;
                case 5003:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    onStateDeleted(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5004:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    onSignOutComplete();
                    parcel2.writeNoException();
                    return true;
                case 5005:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    mo11677a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo11677a(int i) throws RemoteException;

    /* renamed from: a */
    void mo11678a(int i, C3525d dVar) throws RemoteException;

    /* renamed from: a */
    void mo11679a(C3525d dVar) throws RemoteException;

    void onSignOutComplete() throws RemoteException;

    void onStateDeleted(int i, int i2) throws RemoteException;
}
