package com.google.android.gms.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.dynamic.b */
public interface C3549b extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.b$a */
    public static abstract class C3550a extends Binder implements C3549b {

        /* renamed from: com.google.android.gms.dynamic.b$a$a */
        private static class C3551a implements C3549b {

            /* renamed from: a */
            private IBinder f15333a;

            C3551a(IBinder iBinder) {
                this.f15333a = iBinder;
            }

            public IBinder asBinder() {
                return this.f15333a;
            }
        }

        public C3550a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: l */
        public static C3549b m15488l(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3549b)) ? new C3551a(iBinder) : (C3549b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }
}
