package android.support.p001v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.app.F */
/* compiled from: INotificationSideChannel */
public interface C0038F extends IInterface {
    /* renamed from: a */
    void mo56a(String str) throws RemoteException;

    /* renamed from: a */
    void mo57a(String str, int i, String str2) throws RemoteException;

    /* renamed from: a */
    void mo58a(String str, int i, String str2, Notification notification) throws RemoteException;

    /* renamed from: android.support.v4.app.F$a */
    /* compiled from: INotificationSideChannel */
    public static abstract class C0039a extends Binder implements C0038F {

        /* renamed from: a */
        static final int f34a = 1;

        /* renamed from: b */
        static final int f35b = 2;

        /* renamed from: c */
        static final int f36c = 3;

        /* renamed from: d */
        private static final String f37d = "android.support.v4.app.INotificationSideChannel";

        public C0039a() {
            attachInterface(this, f37d);
        }

        /* renamed from: a */
        public static C0038F m72a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37d);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0038F)) {
                return new C0040a(iBinder);
            }
            return (C0038F) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Notification notification;
            switch (i) {
                case 1:
                    parcel.enforceInterface(f37d);
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                    } else {
                        notification = null;
                    }
                    mo58a(readString, readInt, readString2, notification);
                    return true;
                case 2:
                    parcel.enforceInterface(f37d);
                    mo57a(parcel.readString(), parcel.readInt(), parcel.readString());
                    return true;
                case 3:
                    parcel.enforceInterface(f37d);
                    mo56a(parcel.readString());
                    return true;
                case 1598968902:
                    parcel2.writeString(f37d);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* renamed from: android.support.v4.app.F$a$a */
        /* compiled from: INotificationSideChannel */
        private static class C0040a implements C0038F {

            /* renamed from: a */
            private IBinder f38a;

            C0040a(IBinder iBinder) {
                this.f38a = iBinder;
            }

            public IBinder asBinder() {
                return this.f38a;
            }

            /* renamed from: a */
            public String mo61a() {
                return C0039a.f37d;
            }

            /* renamed from: a */
            public void mo58a(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0039a.f37d);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f38a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo57a(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0039a.f37d);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f38a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo56a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0039a.f37d);
                    obtain.writeString(str);
                    this.f38a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
