package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.C3790o;

/* renamed from: com.google.android.gms.internal.p */
public interface C3793p extends IInterface {

    /* renamed from: com.google.android.gms.internal.p$a */
    public static abstract class C3794a extends Binder implements C3793p {

        /* renamed from: com.google.android.gms.internal.p$a$a */
        private static class C3795a implements C3793p {

            /* renamed from: a */
            private IBinder f15891a;

            C3795a(IBinder iBinder) {
                this.f15891a = iBinder;
            }

            /* renamed from: a */
            public void mo12395a(C3790o oVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.f15891a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12396a(C3790o oVar, int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f15891a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12397a(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15891a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12398a(C3790o oVar, int i, String str, String str2, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    this.f15891a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12399a(C3790o oVar, int i, String str, String str2, String[] strArr, String str3, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15891a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12400a(C3790o oVar, int i, String str, String str2, String[] strArr, String str3, IBinder iBinder, String str4, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str3);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str4);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15891a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f15891a;
            }

            /* renamed from: b */
            public void mo12401b(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15891a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo12402c(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15891a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo12403d(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15891a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo12404e(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15891a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public void mo12405f(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15891a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo12406g(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15891a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo12407h(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15891a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: h */
        public static C3793p m16652h(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3793p)) ? new C3795a(iBinder) : (C3793p) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    mo12399a(C3790o.C3791a.m16637g(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    C3790o g = C3790o.C3791a.m16637g(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    mo12397a(g, readInt, readString, bundle);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    mo12396a(C3790o.C3791a.m16637g(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    mo12395a(C3790o.C3791a.m16637g(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    C3790o g2 = C3790o.C3791a.m16637g(parcel.readStrongBinder());
                    int readInt2 = parcel.readInt();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    mo12401b(g2, readInt2, readString2, bundle);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    C3790o g3 = C3790o.C3791a.m16637g(parcel.readStrongBinder());
                    int readInt3 = parcel.readInt();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    mo12402c(g3, readInt3, readString3, bundle);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    C3790o g4 = C3790o.C3791a.m16637g(parcel.readStrongBinder());
                    int readInt4 = parcel.readInt();
                    String readString4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    mo12403d(g4, readInt4, readString4, bundle);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    C3790o g5 = C3790o.C3791a.m16637g(parcel.readStrongBinder());
                    int readInt5 = parcel.readInt();
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    mo12404e(g5, readInt5, readString5, bundle);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    mo12400a(C3790o.C3791a.m16637g(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readStrongBinder(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    mo12398a(C3790o.C3791a.m16637g(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    C3790o g6 = C3790o.C3791a.m16637g(parcel.readStrongBinder());
                    int readInt6 = parcel.readInt();
                    String readString6 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    mo12405f(g6, readInt6, readString6, bundle);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    C3790o g7 = C3790o.C3791a.m16637g(parcel.readStrongBinder());
                    int readInt7 = parcel.readInt();
                    String readString7 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    mo12406g(g7, readInt7, readString7, bundle);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    C3790o g8 = C3790o.C3791a.m16637g(parcel.readStrongBinder());
                    int readInt8 = parcel.readInt();
                    String readString8 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    mo12407h(g8, readInt8, readString8, bundle);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12395a(C3790o oVar, int i) throws RemoteException;

    /* renamed from: a */
    void mo12396a(C3790o oVar, int i, String str) throws RemoteException;

    /* renamed from: a */
    void mo12397a(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo12398a(C3790o oVar, int i, String str, String str2, String[] strArr) throws RemoteException;

    /* renamed from: a */
    void mo12399a(C3790o oVar, int i, String str, String str2, String[] strArr, String str3, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo12400a(C3790o oVar, int i, String str, String str2, String[] strArr, String str3, IBinder iBinder, String str4, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo12401b(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException;

    /* renamed from: c */
    void mo12402c(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException;

    /* renamed from: d */
    void mo12403d(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException;

    /* renamed from: e */
    void mo12404e(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException;

    /* renamed from: f */
    void mo12405f(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException;

    /* renamed from: g */
    void mo12406g(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException;

    /* renamed from: h */
    void mo12407h(C3790o oVar, int i, String str, Bundle bundle) throws RemoteException;
}
