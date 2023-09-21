package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.br */
public interface C3706br extends IInterface {

    /* renamed from: com.google.android.gms.internal.br$a */
    public static abstract class C3707a extends Binder implements C3706br {

        /* renamed from: com.google.android.gms.internal.br$a$a */
        private static class C3708a implements C3706br {

            /* renamed from: a */
            private IBinder f15615a;

            C3708a(IBinder iBinder) {
                this.f15615a = iBinder;
            }

            public IBinder asBinder() {
                return this.f15615a;
            }

            public void cancelClick() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneDelegate");
                    this.f15615a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public PendingIntent getResolution() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneDelegate");
                    this.f15615a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void reinitialize() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneDelegate");
                    this.f15615a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: aa */
        public static C3706br m16228aa(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3706br)) ? new C3708a(iBinder) : (C3706br) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
                    PendingIntent resolution = getResolution();
                    parcel2.writeNoException();
                    if (resolution != null) {
                        parcel2.writeInt(1);
                        resolution.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
                    cancelClick();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
                    reinitialize();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.plus.internal.IPlusOneDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void cancelClick() throws RemoteException;

    PendingIntent getResolution() throws RemoteException;

    void reinitialize() throws RemoteException;
}
