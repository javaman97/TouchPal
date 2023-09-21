package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.o */
public interface C3790o extends IInterface {

    /* renamed from: com.google.android.gms.internal.o$a */
    public static abstract class C3791a extends Binder implements C3790o {

        /* renamed from: com.google.android.gms.internal.o$a$a */
        private static class C3792a implements C3790o {

            /* renamed from: a */
            private IBinder f15890a;

            C3792a(IBinder iBinder) {
                this.f15890a = iBinder;
            }

            public IBinder asBinder() {
                return this.f15890a;
            }

            /* renamed from: b */
            public void mo12366b(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15890a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3791a() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* renamed from: g */
        public static C3790o m16637g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3790o)) ? new C3792a(iBinder) : (C3790o) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                    mo12366b(parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: b */
    void mo12366b(int i, IBinder iBinder, Bundle bundle) throws RemoteException;
}
