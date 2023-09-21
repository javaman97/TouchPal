package com.google.android.gms.location;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.location.a */
public interface C3810a extends IInterface {

    /* renamed from: com.google.android.gms.location.a$a */
    public static abstract class C3811a extends Binder implements C3810a {

        /* renamed from: com.google.android.gms.location.a$a$a */
        private static class C3812a implements C3810a {

            /* renamed from: a */
            private IBinder f15935a;

            C3812a(IBinder iBinder) {
                this.f15935a = iBinder;
            }

            public IBinder asBinder() {
                return this.f15935a;
            }

            public void onLocationChanged(Location location) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f15935a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C3811a() {
            attachInterface(this, "com.google.android.gms.location.ILocationListener");
        }

        /* renamed from: p */
        public static C3810a m16716p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3810a)) ? new C3812a(iBinder) : (C3810a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.ILocationListener");
                    onLocationChanged(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.ILocationListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onLocationChanged(Location location) throws RemoteException;
}
