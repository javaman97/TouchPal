package com.cootek.presentation.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface INativeAppInfoRemote extends IInterface {
    boolean canExtend(String str, String str2) throws RemoteException;

    boolean canPointHolderShow(String str, String str2, String str3) throws RemoteException;

    boolean canPointSelfShow(String str, String str2) throws RemoteException;

    String getAuthToken() throws RemoteException;

    boolean getBoolSetting(String str) throws RemoteException;

    long getFirstInstallTimestamp() throws RemoteException;

    String getHostPackageName() throws RemoteException;

    int getInitialMobileQuietDays() throws RemoteException;

    int getInitialQuietDays() throws RemoteException;

    int getIntSetting(String str) throws RemoteException;

    String getLocalConfigPath() throws RemoteException;

    long getLongSetting(String str) throws RemoteException;

    String getStringSetting(String str) throws RemoteException;

    long getUpdateCheckInterval() throws RemoteException;

    void refreshAuthToken() throws RemoteException;

    public static abstract class Stub extends Binder implements INativeAppInfoRemote {
        private static final String DESCRIPTOR = "com.cootek.presentation.sdk.INativeAppInfoRemote";
        static final int TRANSACTION_canExtend = 14;
        static final int TRANSACTION_canPointHolderShow = 12;
        static final int TRANSACTION_canPointSelfShow = 13;
        static final int TRANSACTION_getAuthToken = 5;
        static final int TRANSACTION_getBoolSetting = 4;
        static final int TRANSACTION_getFirstInstallTimestamp = 7;
        static final int TRANSACTION_getHostPackageName = 10;
        static final int TRANSACTION_getInitialMobileQuietDays = 9;
        static final int TRANSACTION_getInitialQuietDays = 8;
        static final int TRANSACTION_getIntSetting = 1;
        static final int TRANSACTION_getLocalConfigPath = 11;
        static final int TRANSACTION_getLongSetting = 3;
        static final int TRANSACTION_getStringSetting = 2;
        static final int TRANSACTION_getUpdateCheckInterval = 15;
        static final int TRANSACTION_refreshAuthToken = 6;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static INativeAppInfoRemote asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof INativeAppInfoRemote)) {
                return new Proxy(iBinder);
            }
            return (INativeAppInfoRemote) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            int i3 = 0;
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int intSetting = getIntSetting(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(intSetting);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    String stringSetting = getStringSetting(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(stringSetting);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    long longSetting = getLongSetting(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(longSetting);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean boolSetting = getBoolSetting(parcel.readString());
                    parcel2.writeNoException();
                    if (boolSetting) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String authToken = getAuthToken();
                    parcel2.writeNoException();
                    parcel2.writeString(authToken);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    refreshAuthToken();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    long firstInstallTimestamp = getFirstInstallTimestamp();
                    parcel2.writeNoException();
                    parcel2.writeLong(firstInstallTimestamp);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    int initialQuietDays = getInitialQuietDays();
                    parcel2.writeNoException();
                    parcel2.writeInt(initialQuietDays);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int initialMobileQuietDays = getInitialMobileQuietDays();
                    parcel2.writeNoException();
                    parcel2.writeInt(initialMobileQuietDays);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    String hostPackageName = getHostPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(hostPackageName);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    String localConfigPath = getLocalConfigPath();
                    parcel2.writeNoException();
                    parcel2.writeString(localConfigPath);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean canPointHolderShow = canPointHolderShow(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (canPointHolderShow) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean canPointSelfShow = canPointSelfShow(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (canPointSelfShow) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean canExtend = canExtend(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (canExtend) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    long updateCheckInterval = getUpdateCheckInterval();
                    parcel2.writeNoException();
                    parcel2.writeLong(updateCheckInterval);
                    return true;
                case 1598968902:
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements INativeAppInfoRemote {
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

            public int getIntSetting(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getStringSetting(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public long getLongSetting(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean getBoolSetting(String str) throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getAuthToken() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void refreshAuthToken() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public long getFirstInstallTimestamp() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getInitialQuietDays() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getInitialMobileQuietDays() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getHostPackageName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getLocalConfigPath() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean canPointHolderShow(String str, String str2, String str3) throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean canPointSelfShow(String str, String str2) throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean canExtend(String str, String str2) throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public long getUpdateCheckInterval() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
