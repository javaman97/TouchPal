package com.android.vending.billing;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IInAppBillingService extends IInterface {
    /* renamed from: a */
    int mo3017a(int i, String str, String str2) throws RemoteException;

    /* renamed from: a */
    Bundle mo3018a(int i, String str, String str2, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    Bundle mo3019a(int i, String str, String str2, String str3) throws RemoteException;

    /* renamed from: a */
    Bundle mo3020a(int i, String str, String str2, String str3, String str4) throws RemoteException;

    /* renamed from: b */
    int mo3021b(int i, String str, String str2) throws RemoteException;

    public static abstract class Stub extends Binder implements IInAppBillingService {

        /* renamed from: a */
        static final int f2142a = 1;

        /* renamed from: b */
        static final int f2143b = 2;

        /* renamed from: c */
        static final int f2144c = 3;

        /* renamed from: d */
        static final int f2145d = 4;

        /* renamed from: e */
        static final int f2146e = 5;

        /* renamed from: f */
        private static final String f2147f = "com.android.vending.billing.IInAppBillingService";

        public Stub() {
            attachInterface(this, f2147f);
        }

        /* renamed from: a */
        public static IInAppBillingService m4648a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2147f);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IInAppBillingService)) {
                return new Proxy(iBinder);
            }
            return (IInAppBillingService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            switch (i) {
                case 1:
                    parcel.enforceInterface(f2147f);
                    int a = mo3017a(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 2:
                    parcel.enforceInterface(f2147f);
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    } else {
                        bundle = null;
                    }
                    Bundle a2 = mo3018a(readInt, readString, readString2, bundle);
                    parcel2.writeNoException();
                    if (a2 != null) {
                        parcel2.writeInt(1);
                        a2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface(f2147f);
                    Bundle a3 = mo3020a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (a3 != null) {
                        parcel2.writeInt(1);
                        a3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(f2147f);
                    Bundle a4 = mo3019a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (a4 != null) {
                        parcel2.writeInt(1);
                        a4.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface(f2147f);
                    int b = mo3021b(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(b);
                    return true;
                case 1598968902:
                    parcel2.writeString(f2147f);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements IInAppBillingService {

            /* renamed from: a */
            private IBinder f2148a;

            Proxy(IBinder iBinder) {
                this.f2148a = iBinder;
            }

            public IBinder asBinder() {
                return this.f2148a;
            }

            /* renamed from: a */
            public String mo3024a() {
                return Stub.f2147f;
            }

            /* renamed from: a */
            public int mo3017a(int i, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f2147f);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f2148a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo3018a(int i, String str, String str2, Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f2147f);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2148a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo3020a(int i, String str, String str2, String str3, String str4) throws RemoteException {
                Bundle bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f2147f);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.f2148a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle = null;
                    }
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo3019a(int i, String str, String str2, String str3) throws RemoteException {
                Bundle bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f2147f);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f2148a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle = null;
                    }
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public int mo3021b(int i, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f2147f);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f2148a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
