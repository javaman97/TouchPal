package com.cootek.presentation.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IActionDriverRemote extends IInterface {
    void autoInstall(String str) throws RemoteException;

    boolean changeBoolSetting(String str, boolean z, boolean z2) throws RemoteException;

    boolean changeIntSetting(String str, int i, boolean z) throws RemoteException;

    boolean changeLongSetting(String str, long j, boolean z) throws RemoteException;

    boolean changeStringSetting(String str, String str2, boolean z) throws RemoteException;

    void close(String str) throws RemoteException;

    void contentUpdated() throws RemoteException;

    void download(int i, String str, String str2, String str3, boolean z) throws RemoteException;

    String getDownloadConfirmMessage() throws RemoteException;

    String getDownloadRequestUrl(String str, String str2) throws RemoteException;

    String getNonWifiMessage() throws RemoteException;

    boolean handleDownloadedFile(String str, String str2) throws RemoteException;

    boolean launchApp(String str, String str2, String str3, String str4) throws RemoteException;

    boolean openUrl(String str, String str2, boolean z) throws RemoteException;

    void saveTypeUsage(String str, String str2, String str3) throws RemoteException;

    void showActionConfirmDialog(String str, String str2) throws RemoteException;

    public static abstract class Stub extends Binder implements IActionDriverRemote {
        private static final String DESCRIPTOR = "com.cootek.presentation.sdk.IActionDriverRemote";
        static final int TRANSACTION_autoInstall = 8;
        static final int TRANSACTION_changeBoolSetting = 4;
        static final int TRANSACTION_changeIntSetting = 5;
        static final int TRANSACTION_changeLongSetting = 7;
        static final int TRANSACTION_changeStringSetting = 6;
        static final int TRANSACTION_close = 9;
        static final int TRANSACTION_contentUpdated = 14;
        static final int TRANSACTION_download = 1;
        static final int TRANSACTION_getDownloadConfirmMessage = 11;
        static final int TRANSACTION_getDownloadRequestUrl = 15;
        static final int TRANSACTION_getNonWifiMessage = 12;
        static final int TRANSACTION_handleDownloadedFile = 16;
        static final int TRANSACTION_launchApp = 2;
        static final int TRANSACTION_openUrl = 3;
        static final int TRANSACTION_saveTypeUsage = 13;
        static final int TRANSACTION_showActionConfirmDialog = 10;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IActionDriverRemote asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IActionDriverRemote)) {
                return new Proxy(iBinder);
            }
            return (IActionDriverRemote) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6 = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z6 = true;
                    }
                    download(readInt, readString, readString2, readString3, z6);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean launchApp = launchApp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (launchApp) {
                        z6 = true;
                    }
                    parcel2.writeInt(z6 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean openUrl = openUrl(readString4, readString5, z5);
                    parcel2.writeNoException();
                    if (openUrl) {
                        z6 = true;
                    }
                    parcel2.writeInt(z6 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString6 = parcel.readString();
                    boolean z7 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean changeBoolSetting = changeBoolSetting(readString6, z7, z4);
                    parcel2.writeNoException();
                    if (changeBoolSetting) {
                        z6 = true;
                    }
                    parcel2.writeInt(z6 ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString7 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean changeIntSetting = changeIntSetting(readString7, readInt2, z3);
                    parcel2.writeNoException();
                    if (changeIntSetting) {
                        z6 = true;
                    }
                    parcel2.writeInt(z6 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean changeStringSetting = changeStringSetting(readString8, readString9, z2);
                    parcel2.writeNoException();
                    if (changeStringSetting) {
                        z6 = true;
                    }
                    parcel2.writeInt(z6 ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString10 = parcel.readString();
                    long readLong = parcel.readLong();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean changeLongSetting = changeLongSetting(readString10, readLong, z);
                    parcel2.writeNoException();
                    if (changeLongSetting) {
                        z6 = true;
                    }
                    parcel2.writeInt(z6 ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    autoInstall(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    close(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    showActionConfirmDialog(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    String downloadConfirmMessage = getDownloadConfirmMessage();
                    parcel2.writeNoException();
                    parcel2.writeString(downloadConfirmMessage);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    String nonWifiMessage = getNonWifiMessage();
                    parcel2.writeNoException();
                    parcel2.writeString(nonWifiMessage);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    saveTypeUsage(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    contentUpdated();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    String downloadRequestUrl = getDownloadRequestUrl(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(downloadRequestUrl);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean handleDownloadedFile = handleDownloadedFile(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (handleDownloadedFile) {
                        z6 = true;
                    }
                    parcel2.writeInt(z6 ? 1 : 0);
                    return true;
                case 1598968902:
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements IActionDriverRemote {
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

            public void download(int i, String str, String str2, String str3, boolean z) throws RemoteException {
                int i2 = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!z) {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean launchApp(String str, String str2, String str3, String str4) throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.mRemote.transact(2, obtain, obtain2, 0);
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

            public boolean openUrl(String str, String str2, boolean z) throws RemoteException {
                boolean z2 = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean changeBoolSetting(String str, boolean z, boolean z2) throws RemoteException {
                int i;
                boolean z3 = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    if (z2) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z3 = false;
                    }
                    return z3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean changeIntSetting(String str, int i, boolean z) throws RemoteException {
                boolean z2 = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean changeStringSetting(String str, String str2, boolean z) throws RemoteException {
                boolean z2 = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean changeLongSetting(String str, long j, boolean z) throws RemoteException {
                boolean z2 = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void autoInstall(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void close(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void showActionConfirmDialog(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getDownloadConfirmMessage() throws RemoteException {
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

            public String getNonWifiMessage() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void saveTypeUsage(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void contentUpdated() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getDownloadRequestUrl(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean handleDownloadedFile(String str, String str2) throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(16, obtain, obtain2, 0);
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
        }
    }
}
