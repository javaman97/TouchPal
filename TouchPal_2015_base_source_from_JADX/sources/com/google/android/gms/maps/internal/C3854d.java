package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C3549b;
import com.google.android.gms.maps.model.internal.C3912d;

/* renamed from: com.google.android.gms.maps.internal.d */
public interface C3854d extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.d$a */
    public static abstract class C3855a extends Binder implements C3854d {

        /* renamed from: com.google.android.gms.maps.internal.d$a$a */
        private static class C3856a implements C3854d {

            /* renamed from: a */
            private IBinder f16009a;

            C3856a(IBinder iBinder) {
                this.f16009a = iBinder;
            }

            public IBinder asBinder() {
                return this.f16009a;
            }

            /* renamed from: f */
            public C3549b mo12556f(C3912d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f16009a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public C3549b mo12557g(C3912d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f16009a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3855a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
        }

        /* renamed from: x */
        public static C3854d m16778x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3854d)) ? new C3856a(iBinder) : (C3854d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    C3549b f = mo12556f(C3912d.C3913a.m16889Q(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (f != null) {
                        iBinder = f.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    C3549b g = mo12557g(C3912d.C3913a.m16889Q(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (g != null) {
                        iBinder = g.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: f */
    C3549b mo12556f(C3912d dVar) throws RemoteException;

    /* renamed from: g */
    C3549b mo12557g(C3912d dVar) throws RemoteException;
}
