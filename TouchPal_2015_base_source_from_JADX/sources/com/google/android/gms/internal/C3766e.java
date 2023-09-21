package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.cootek.smartinput5.net.cmd.C2300u;
import com.google.android.gms.internal.C3763d;

/* renamed from: com.google.android.gms.internal.e */
public interface C3766e extends IInterface {

    /* renamed from: com.google.android.gms.internal.e$a */
    public static abstract class C3767a extends Binder implements C3766e {

        /* renamed from: com.google.android.gms.internal.e$a$a */
        private static class C3768a implements C3766e {

            /* renamed from: a */
            private IBinder f15823a;

            C3768a(IBinder iBinder) {
                this.f15823a = iBinder;
            }

            /* renamed from: a */
            public void mo12314a(C3763d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f15823a.transact(5005, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12315a(C3763d dVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.f15823a.transact(5004, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12316a(C3763d dVar, int i, String str, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    this.f15823a.transact(5006, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo12317a(C3763d dVar, int i, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    this.f15823a.transact(5003, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f15823a;
            }

            /* renamed from: b */
            public void mo12318b(C3763d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f15823a.transact(5008, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo12319b(C3763d dVar, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeInt(i);
                    this.f15823a.transact(5007, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo12320c(C3763d dVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f15823a.transact(5009, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getMaxNumKeys() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    this.f15823a.transact(C2300u.f10110h, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getMaxStateSize() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    this.f15823a.transact(C2300u.f10109g, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: e */
        public static C3766e m16552e(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3766e)) ? new C3768a(iBinder) : (C3766e) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case C2300u.f10109g:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    int maxStateSize = getMaxStateSize();
                    parcel2.writeNoException();
                    parcel2.writeInt(maxStateSize);
                    return true;
                case C2300u.f10110h:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    int maxNumKeys = getMaxNumKeys();
                    parcel2.writeNoException();
                    parcel2.writeInt(maxNumKeys);
                    return true;
                case 5003:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    mo12317a(C3763d.C3764a.m16541d(parcel.readStrongBinder()), parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 5004:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    mo12315a(C3763d.C3764a.m16541d(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5005:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    mo12314a(C3763d.C3764a.m16541d(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5006:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    mo12316a(C3763d.C3764a.m16541d(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 5007:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    mo12319b(C3763d.C3764a.m16541d(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5008:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    mo12318b(C3763d.C3764a.m16541d(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5009:
                    parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    mo12320c(C3763d.C3764a.m16541d(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.appstate.internal.IAppStateService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12314a(C3763d dVar) throws RemoteException;

    /* renamed from: a */
    void mo12315a(C3763d dVar, int i) throws RemoteException;

    /* renamed from: a */
    void mo12316a(C3763d dVar, int i, String str, byte[] bArr) throws RemoteException;

    /* renamed from: a */
    void mo12317a(C3763d dVar, int i, byte[] bArr) throws RemoteException;

    /* renamed from: b */
    void mo12318b(C3763d dVar) throws RemoteException;

    /* renamed from: b */
    void mo12319b(C3763d dVar, int i) throws RemoteException;

    /* renamed from: c */
    void mo12320c(C3763d dVar) throws RemoteException;

    int getMaxNumKeys() throws RemoteException;

    int getMaxStateSize() throws RemoteException;
}
