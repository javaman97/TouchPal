package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* renamed from: com.google.android.gms.maps.model.internal.g */
public interface C3921g extends IInterface {

    /* renamed from: com.google.android.gms.maps.model.internal.g$a */
    public static abstract class C3922a extends Binder implements C3921g {

        /* renamed from: com.google.android.gms.maps.model.internal.g$a$a */
        private static class C3923a implements C3921g {

            /* renamed from: a */
            private IBinder f16111a;

            C3923a(IBinder iBinder) {
                this.f16111a = iBinder;
            }

            public IBinder asBinder() {
                return this.f16111a;
            }

            public Tile getTile(int i, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f16111a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Tile.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3922a() {
            attachInterface(this, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        }

        /* renamed from: U */
        public static C3921g m16898U(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3921g)) ? new C3923a(iBinder) : (C3921g) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    Tile tile = getTile(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    if (tile != null) {
                        parcel2.writeInt(1);
                        tile.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    Tile getTile(int i, int i2, int i3) throws RemoteException;
}
