package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.C3912d;

/* renamed from: com.google.android.gms.maps.internal.j */
public interface C3872j extends IInterface {

    /* renamed from: com.google.android.gms.maps.internal.j$a */
    public static abstract class C3873a extends Binder implements C3872j {

        /* renamed from: com.google.android.gms.maps.internal.j$a$a */
        private static class C3874a implements C3872j {

            /* renamed from: a */
            private IBinder f16015a;

            C3874a(IBinder iBinder) {
                this.f16015a = iBinder;
            }

            /* renamed from: a */
            public boolean mo12564a(C3912d dVar) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.f16015a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f16015a;
            }
        }

        public C3873a() {
            attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerClickListener");
        }

        /* renamed from: G */
        public static C3872j m16791G(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3872j)) ? new C3874a(iBinder) : (C3872j) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    boolean a = mo12564a(C3912d.C3913a.m16889Q(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(a ? 1 : 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    boolean mo12564a(C3912d dVar) throws RemoteException;
}
