package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C3549b;

/* renamed from: com.google.android.gms.internal.q */
public interface C3796q extends IInterface {

    /* renamed from: com.google.android.gms.internal.q$a */
    public static abstract class C3797a extends Binder implements C3796q {

        /* renamed from: com.google.android.gms.internal.q$a$a */
        private static class C3798a implements C3796q {

            /* renamed from: a */
            private IBinder f15892a;

            C3798a(IBinder iBinder) {
                this.f15892a = iBinder;
            }

            /* renamed from: a */
            public C3549b mo12410a(C3549b bVar, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f15892a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f15892a;
            }
        }

        /* renamed from: i */
        public static C3796q m16667i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3796q)) ? new C3798a(iBinder) : (C3796q) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
                    C3549b a = mo12410a(C3549b.C3550a.m15488l(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    C3549b mo12410a(C3549b bVar, int i, int i2) throws RemoteException;
}
