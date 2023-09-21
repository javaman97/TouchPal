package com.cootek.presentation.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.cootek.presentation.sdk.IActionDriverRemote;
import com.cootek.presentation.sdk.INativeAppInfoRemote;
import com.cootek.presentation.service.toast.BackgroundImageToast;
import com.cootek.presentation.service.toast.CloudInputToast;
import com.cootek.presentation.service.toast.DummyToast;
import com.cootek.presentation.service.toast.ExtensionStaticToast;
import com.cootek.presentation.service.toast.FreecallHangupToast;
import com.cootek.presentation.service.toast.FullscreenToast;
import com.cootek.presentation.service.toast.NextWordToast;
import com.cootek.presentation.service.toast.PopupToast;
import com.cootek.presentation.service.toast.StartupToast;
import com.cootek.presentation.service.toast.StatusbarToast;
import com.cootek.presentation.service.toast.ToolbarToast;
import java.util.List;

public interface IRemoteService extends IInterface {
    void actionConfirmed(String str) throws RemoteException;

    boolean addToast(String str) throws RemoteException;

    void cleaned(String str) throws RemoteException;

    void clearFeatureSetting(String str) throws RemoteException;

    void clicked(String str) throws RemoteException;

    void closed(String str) throws RemoteException;

    void downloadFinished(String str, String str2) throws RemoteException;

    boolean executeToastById(String str) throws RemoteException;

    boolean executeToastWithMessage(String str) throws RemoteException;

    BackgroundImageToast getBackgroundImageToast() throws RemoteException;

    float getCheckInterval() throws RemoteException;

    CloudInputToast getCloudInputToast(String str) throws RemoteException;

    int getConnection() throws RemoteException;

    String getDownloadFilePath(String str) throws RemoteException;

    DummyToast getDummyToast() throws RemoteException;

    List<ExtensionStaticToast> getExtensionStaticToast(String str) throws RemoteException;

    FreecallHangupToast getFreecallHangupToast() throws RemoteException;

    FullscreenToast getFullscreenToast() throws RemoteException;

    int getGuidePointNumber(String str) throws RemoteException;

    int getGuidePointType(String str) throws RemoteException;

    NextWordToast getNextwordToast(String str) throws RemoteException;

    PopupToast getPopupToast() throws RemoteException;

    String getPresentImagePath(String str) throws RemoteException;

    int getPresentTimes(String str) throws RemoteException;

    int getStartupQuiet() throws RemoteException;

    StartupToast getStartupToast() throws RemoteException;

    int getStatusbarQuiet() throws RemoteException;

    StatusbarToast getStatusbarToast() throws RemoteException;

    String getToastType(String str) throws RemoteException;

    int getToolbarQuiet() throws RemoteException;

    ToolbarToast getToolbarToast() throws RemoteException;

    void guidePointClicked(String str) throws RemoteException;

    void guidePointShown(String str) throws RemoteException;

    void hostAppClosed() throws RemoteException;

    void installFinished(String str) throws RemoteException;

    void installStarted(String str) throws RemoteException;

    boolean isToastExists(String str) throws RemoteException;

    void loadLocalConfig() throws RemoteException;

    void reset(String str) throws RemoteException;

    void saveData() throws RemoteException;

    void setActionDriver(IActionDriverRemote iActionDriverRemote) throws RemoteException;

    void setNativeAppInfo(INativeAppInfoRemote iNativeAppInfoRemote) throws RemoteException;

    void setNotShowAgain(String str, boolean z) throws RemoteException;

    void setTimeFake(boolean z) throws RemoteException;

    void setTimestamp(long j) throws RemoteException;

    void setUpdateAlarm() throws RemoteException;

    void shown(String str) throws RemoteException;

    void update() throws RemoteException;

    void webPageLoaded(String str) throws RemoteException;

    void webPageOpened(String str) throws RemoteException;

    public static abstract class Stub extends Binder implements IRemoteService {
        private static final String DESCRIPTOR = "com.cootek.presentation.service.IRemoteService";
        static final int TRANSACTION_actionConfirmed = 6;
        static final int TRANSACTION_addToast = 42;
        static final int TRANSACTION_cleaned = 4;
        static final int TRANSACTION_clearFeatureSetting = 43;
        static final int TRANSACTION_clicked = 2;
        static final int TRANSACTION_closed = 3;
        static final int TRANSACTION_downloadFinished = 7;
        static final int TRANSACTION_executeToastById = 40;
        static final int TRANSACTION_executeToastWithMessage = 41;
        static final int TRANSACTION_getBackgroundImageToast = 27;
        static final int TRANSACTION_getCheckInterval = 45;
        static final int TRANSACTION_getCloudInputToast = 25;
        static final int TRANSACTION_getConnection = 44;
        static final int TRANSACTION_getDownloadFilePath = 35;
        static final int TRANSACTION_getDummyToast = 22;
        static final int TRANSACTION_getExtensionStaticToast = 26;
        static final int TRANSACTION_getFreecallHangupToast = 28;
        static final int TRANSACTION_getFullscreenToast = 23;
        static final int TRANSACTION_getGuidePointNumber = 36;
        static final int TRANSACTION_getGuidePointType = 37;
        static final int TRANSACTION_getNextwordToast = 24;
        static final int TRANSACTION_getPopupToast = 20;
        static final int TRANSACTION_getPresentImagePath = 34;
        static final int TRANSACTION_getPresentTimes = 33;
        static final int TRANSACTION_getStartupQuiet = 48;
        static final int TRANSACTION_getStartupToast = 19;
        static final int TRANSACTION_getStatusbarQuiet = 47;
        static final int TRANSACTION_getStatusbarToast = 21;
        static final int TRANSACTION_getToastType = 30;
        static final int TRANSACTION_getToolbarQuiet = 46;
        static final int TRANSACTION_getToolbarToast = 18;
        static final int TRANSACTION_guidePointClicked = 38;
        static final int TRANSACTION_guidePointShown = 39;
        static final int TRANSACTION_hostAppClosed = 12;
        static final int TRANSACTION_installFinished = 9;
        static final int TRANSACTION_installStarted = 8;
        static final int TRANSACTION_isToastExists = 29;
        static final int TRANSACTION_loadLocalConfig = 15;
        static final int TRANSACTION_reset = 31;
        static final int TRANSACTION_saveData = 32;
        static final int TRANSACTION_setActionDriver = 14;
        static final int TRANSACTION_setNativeAppInfo = 13;
        static final int TRANSACTION_setNotShowAgain = 5;
        static final int TRANSACTION_setTimeFake = 49;
        static final int TRANSACTION_setTimestamp = 50;
        static final int TRANSACTION_setUpdateAlarm = 17;
        static final int TRANSACTION_shown = 1;
        static final int TRANSACTION_update = 16;
        static final int TRANSACTION_webPageLoaded = 10;
        static final int TRANSACTION_webPageOpened = 11;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteService)) {
                return new Proxy(iBinder);
            }
            return (IRemoteService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    shown(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    clicked(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    closed(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    cleaned(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    setNotShowAgain(readString, z);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    actionConfirmed(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    downloadFinished(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    installStarted(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    installFinished(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    webPageLoaded(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    webPageOpened(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    hostAppClosed();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    setNativeAppInfo(INativeAppInfoRemote.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    setActionDriver(IActionDriverRemote.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    loadLocalConfig();
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    update();
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    setUpdateAlarm();
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    ToolbarToast toolbarToast = getToolbarToast();
                    parcel2.writeNoException();
                    if (toolbarToast != null) {
                        parcel2.writeInt(1);
                        toolbarToast.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    StartupToast startupToast = getStartupToast();
                    parcel2.writeNoException();
                    if (startupToast != null) {
                        parcel2.writeInt(1);
                        startupToast.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    PopupToast popupToast = getPopupToast();
                    parcel2.writeNoException();
                    if (popupToast != null) {
                        parcel2.writeInt(1);
                        popupToast.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    StatusbarToast statusbarToast = getStatusbarToast();
                    parcel2.writeNoException();
                    if (statusbarToast != null) {
                        parcel2.writeInt(1);
                        statusbarToast.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    DummyToast dummyToast = getDummyToast();
                    parcel2.writeNoException();
                    if (dummyToast != null) {
                        parcel2.writeInt(1);
                        dummyToast.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    FullscreenToast fullscreenToast = getFullscreenToast();
                    parcel2.writeNoException();
                    if (fullscreenToast != null) {
                        parcel2.writeInt(1);
                        fullscreenToast.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    NextWordToast nextwordToast = getNextwordToast(parcel.readString());
                    parcel2.writeNoException();
                    if (nextwordToast != null) {
                        parcel2.writeInt(1);
                        nextwordToast.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    CloudInputToast cloudInputToast = getCloudInputToast(parcel.readString());
                    parcel2.writeNoException();
                    if (cloudInputToast != null) {
                        parcel2.writeInt(1);
                        cloudInputToast.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<ExtensionStaticToast> extensionStaticToast = getExtensionStaticToast(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(extensionStaticToast);
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    BackgroundImageToast backgroundImageToast = getBackgroundImageToast();
                    parcel2.writeNoException();
                    if (backgroundImageToast != null) {
                        parcel2.writeInt(1);
                        backgroundImageToast.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    FreecallHangupToast freecallHangupToast = getFreecallHangupToast();
                    parcel2.writeNoException();
                    if (freecallHangupToast != null) {
                        parcel2.writeInt(1);
                        freecallHangupToast.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isToastExists = isToastExists(parcel.readString());
                    parcel2.writeNoException();
                    if (isToastExists) {
                        z = true;
                    }
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    String toastType = getToastType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(toastType);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    reset(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    saveData();
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    int presentTimes = getPresentTimes(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(presentTimes);
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    String presentImagePath = getPresentImagePath(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(presentImagePath);
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    String downloadFilePath = getDownloadFilePath(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(downloadFilePath);
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    int guidePointNumber = getGuidePointNumber(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(guidePointNumber);
                    return true;
                case 37:
                    parcel.enforceInterface(DESCRIPTOR);
                    int guidePointType = getGuidePointType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(guidePointType);
                    return true;
                case 38:
                    parcel.enforceInterface(DESCRIPTOR);
                    guidePointClicked(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface(DESCRIPTOR);
                    guidePointShown(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean executeToastById = executeToastById(parcel.readString());
                    parcel2.writeNoException();
                    if (executeToastById) {
                        z = true;
                    }
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                case 41:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean executeToastWithMessage = executeToastWithMessage(parcel.readString());
                    parcel2.writeNoException();
                    if (executeToastWithMessage) {
                        z = true;
                    }
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                case 42:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean addToast = addToast(parcel.readString());
                    parcel2.writeNoException();
                    if (addToast) {
                        z = true;
                    }
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                case 43:
                    parcel.enforceInterface(DESCRIPTOR);
                    clearFeatureSetting(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface(DESCRIPTOR);
                    int connection = getConnection();
                    parcel2.writeNoException();
                    parcel2.writeInt(connection);
                    return true;
                case 45:
                    parcel.enforceInterface(DESCRIPTOR);
                    float checkInterval = getCheckInterval();
                    parcel2.writeNoException();
                    parcel2.writeFloat(checkInterval);
                    return true;
                case 46:
                    parcel.enforceInterface(DESCRIPTOR);
                    int toolbarQuiet = getToolbarQuiet();
                    parcel2.writeNoException();
                    parcel2.writeInt(toolbarQuiet);
                    return true;
                case 47:
                    parcel.enforceInterface(DESCRIPTOR);
                    int statusbarQuiet = getStatusbarQuiet();
                    parcel2.writeNoException();
                    parcel2.writeInt(statusbarQuiet);
                    return true;
                case 48:
                    parcel.enforceInterface(DESCRIPTOR);
                    int startupQuiet = getStartupQuiet();
                    parcel2.writeNoException();
                    parcel2.writeInt(startupQuiet);
                    return true;
                case 49:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    setTimeFake(z);
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface(DESCRIPTOR);
                    setTimestamp(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements IRemoteService {
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

            public void shown(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void clicked(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void closed(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void cleaned(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setNotShowAgain(String str, boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void actionConfirmed(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void downloadFinished(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void installStarted(String str) throws RemoteException {
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

            public void installFinished(String str) throws RemoteException {
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

            public void webPageLoaded(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void webPageOpened(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void hostAppClosed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setNativeAppInfo(INativeAppInfoRemote iNativeAppInfoRemote) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iNativeAppInfoRemote != null ? iNativeAppInfoRemote.asBinder() : null);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setActionDriver(IActionDriverRemote iActionDriverRemote) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iActionDriverRemote != null ? iActionDriverRemote.asBinder() : null);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void loadLocalConfig() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void update() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setUpdateAlarm() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ToolbarToast getToolbarToast() throws RemoteException {
                ToolbarToast toolbarToast;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        toolbarToast = ToolbarToast.CREATOR.createFromParcel(obtain2);
                    } else {
                        toolbarToast = null;
                    }
                    return toolbarToast;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public StartupToast getStartupToast() throws RemoteException {
                StartupToast startupToast;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        startupToast = StartupToast.CREATOR.createFromParcel(obtain2);
                    } else {
                        startupToast = null;
                    }
                    return startupToast;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public PopupToast getPopupToast() throws RemoteException {
                PopupToast popupToast;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        popupToast = PopupToast.CREATOR.createFromParcel(obtain2);
                    } else {
                        popupToast = null;
                    }
                    return popupToast;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public StatusbarToast getStatusbarToast() throws RemoteException {
                StatusbarToast statusbarToast;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        statusbarToast = StatusbarToast.CREATOR.createFromParcel(obtain2);
                    } else {
                        statusbarToast = null;
                    }
                    return statusbarToast;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public DummyToast getDummyToast() throws RemoteException {
                DummyToast dummyToast;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        dummyToast = DummyToast.CREATOR.createFromParcel(obtain2);
                    } else {
                        dummyToast = null;
                    }
                    return dummyToast;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FullscreenToast getFullscreenToast() throws RemoteException {
                FullscreenToast fullscreenToast;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        fullscreenToast = FullscreenToast.CREATOR.createFromParcel(obtain2);
                    } else {
                        fullscreenToast = null;
                    }
                    return fullscreenToast;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public NextWordToast getNextwordToast(String str) throws RemoteException {
                NextWordToast nextWordToast;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        nextWordToast = NextWordToast.CREATOR.createFromParcel(obtain2);
                    } else {
                        nextWordToast = null;
                    }
                    return nextWordToast;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public CloudInputToast getCloudInputToast(String str) throws RemoteException {
                CloudInputToast cloudInputToast;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        cloudInputToast = CloudInputToast.CREATOR.createFromParcel(obtain2);
                    } else {
                        cloudInputToast = null;
                    }
                    return cloudInputToast;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public List<ExtensionStaticToast> getExtensionStaticToast(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ExtensionStaticToast.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public BackgroundImageToast getBackgroundImageToast() throws RemoteException {
                BackgroundImageToast backgroundImageToast;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        backgroundImageToast = BackgroundImageToast.CREATOR.createFromParcel(obtain2);
                    } else {
                        backgroundImageToast = null;
                    }
                    return backgroundImageToast;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public FreecallHangupToast getFreecallHangupToast() throws RemoteException {
                FreecallHangupToast freecallHangupToast;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        freecallHangupToast = FreecallHangupToast.CREATOR.createFromParcel(obtain2);
                    } else {
                        freecallHangupToast = null;
                    }
                    return freecallHangupToast;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isToastExists(String str) throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(29, obtain, obtain2, 0);
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

            public String getToastType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void reset(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void saveData() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getPresentTimes(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getPresentImagePath(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getDownloadFilePath(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getGuidePointNumber(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getGuidePointType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void guidePointClicked(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void guidePointShown(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean executeToastById(String str) throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(40, obtain, obtain2, 0);
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

            public boolean executeToastWithMessage(String str) throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(41, obtain, obtain2, 0);
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

            public boolean addToast(String str) throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(42, obtain, obtain2, 0);
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

            public void clearFeatureSetting(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getConnection() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public float getCheckInterval() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getToolbarQuiet() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getStatusbarQuiet() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getStartupQuiet() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setTimeFake(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setTimestamp(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeLong(j);
                    this.mRemote.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
