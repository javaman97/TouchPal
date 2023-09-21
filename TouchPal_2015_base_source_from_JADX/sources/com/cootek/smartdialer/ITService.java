package com.cootek.smartdialer;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ITService extends IInterface {
    String getPhoneNumber() throws RemoteException;

    String getPhoneNumberBySlot(int i) throws RemoteException;

    boolean isContact(String str) throws RemoteException;

    public static abstract class Stub extends Binder implements ITService {
        private static final String DESCRIPTOR = "com.cootek.smartdialer.ITService";
        static final int TRANSACTION_getPhoneNumber = 2;
        static final int TRANSACTION_getPhoneNumberBySlot = 3;
        static final int TRANSACTION_isContact = 1;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITService)) {
                return new Proxy(iBinder);
            }
            return (ITService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isContact = isContact(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(isContact ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    String phoneNumber = getPhoneNumber();
                    parcel2.writeNoException();
                    parcel2.writeString(phoneNumber);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    String phoneNumberBySlot = getPhoneNumberBySlot(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(phoneNumberBySlot);
                    return true;
                case 1598968902:
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements ITService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public boolean isContact(String str) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
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

            public String getPhoneNumber() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getPhoneNumberBySlot(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
