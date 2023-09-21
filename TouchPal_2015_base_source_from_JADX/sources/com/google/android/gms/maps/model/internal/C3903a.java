package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C3549b;

/* renamed from: com.google.android.gms.maps.model.internal.a */
public interface C3903a extends IInterface {

    /* renamed from: com.google.android.gms.maps.model.internal.a$a */
    public static abstract class C3904a extends Binder implements C3903a {

        /* renamed from: com.google.android.gms.maps.model.internal.a$a$a */
        private static class C3905a implements C3903a {

            /* renamed from: a */
            private IBinder f16105a;

            C3905a(IBinder iBinder) {
                this.f16105a = iBinder;
            }

            /* renamed from: B */
            public C3549b mo13118B(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    obtain.writeString(str);
                    this.f16105a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: C */
            public C3549b mo13119C(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    obtain.writeString(str);
                    this.f16105a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: D */
            public C3549b mo13120D(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    obtain.writeString(str);
                    this.f16105a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: S */
            public C3549b mo13121S(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    obtain.writeInt(i);
                    this.f16105a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public C3549b mo13122a(Bitmap bitmap) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    if (bitmap != null) {
                        obtain.writeInt(1);
                        bitmap.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f16105a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f16105a;
            }

            /* renamed from: bt */
            public C3549b mo13123bt() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    this.f16105a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public C3549b mo13124c(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    obtain.writeFloat(f);
                    this.f16105a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return C3549b.C3550a.m15488l(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: N */
        public static C3903a m16871N(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3903a)) ? new C3905a(iBinder) : (C3903a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    C3549b S = mo13121S(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(S != null ? S.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    C3549b B = mo13118B(parcel.readString());
                    parcel2.writeNoException();
                    if (B != null) {
                        iBinder = B.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    C3549b C = mo13119C(parcel.readString());
                    parcel2.writeNoException();
                    if (C != null) {
                        iBinder = C.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    C3549b bt = mo13123bt();
                    parcel2.writeNoException();
                    if (bt != null) {
                        iBinder = bt.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    C3549b c = mo13124c(parcel.readFloat());
                    parcel2.writeNoException();
                    if (c != null) {
                        iBinder = c.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    C3549b a = mo13122a(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    C3549b D = mo13120D(parcel.readString());
                    parcel2.writeNoException();
                    if (D != null) {
                        iBinder = D.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: B */
    C3549b mo13118B(String str) throws RemoteException;

    /* renamed from: C */
    C3549b mo13119C(String str) throws RemoteException;

    /* renamed from: D */
    C3549b mo13120D(String str) throws RemoteException;

    /* renamed from: S */
    C3549b mo13121S(int i) throws RemoteException;

    /* renamed from: a */
    C3549b mo13122a(Bitmap bitmap) throws RemoteException;

    /* renamed from: bt */
    C3549b mo13123bt() throws RemoteException;

    /* renamed from: c */
    C3549b mo13124c(float f) throws RemoteException;
}
