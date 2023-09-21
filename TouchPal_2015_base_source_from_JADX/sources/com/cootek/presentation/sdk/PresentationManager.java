package com.cootek.presentation.sdk;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.presentation.sdk.IActionDriverRemote;
import com.cootek.presentation.sdk.INativeAppInfoRemote;
import com.cootek.presentation.service.IRemoteService;
import com.cootek.presentation.service.PresentationService;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.toast.BackgroundImageToast;
import com.cootek.presentation.service.toast.BannerAdsToast;
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
import com.cootek.smartinput5.func.C1411aV;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PresentationManager {
    public static final int GUIDE_TYPE_DOT = 2;
    public static final int GUIDE_TYPE_NEW = 1;
    public static final int GUIDE_TYPE_NONE = 0;
    public static final int GUIDE_TYPE_NUM = 3;
    public static final int GUIDE_TYPE_POINT_HIDE = -1;
    public static final String INTENT_ACITON_CONFIG_UPDATE = "com.cootek.presentation.action.CONFIG_UPDATE";
    public static final String INTENT_ACTION_CHECK_DUMMY_TOAST = "com.cootek.presentation.action.CHECK_DUMMY_TOAST";
    public static final String INTENT_ACTION_CHECK_SHORTCUT_TOAST = "com.cootek.presentation.action.CHECK_DESKTOP_SHORTCUT_TOAST";
    public static final String INTENT_ACTION_CHECK_STATUS_TOAST = "com.cootek.presentation.action.CHECK_STATUS_TOAST";
    public static final String INTENT_ACTION_MESSAGE_READY = "com.cootek.presentation.action.MESSAGE_READY";
    public static final String INTENT_ACTION_NEED_TOKEN = "com.cootek.presentation.action.NEED_TOKEN";
    public static final String INTENT_ACTION_REFRESH_TOKEN = "com.cootek.presentation.action.REFRESH_TOKEN";
    public static final String INTENT_ACTION_REGISTER_TOAST_CREATOR = "com.cootek.presentation.action.REGISTER_TOAST_CREATOR";
    public static final String INTENT_ACTION_REMOVE_SHORTCUT_TOAST = "com.cootek.presentation.action.REMOVE_DESKTOP_SHORTCUT_TOAST";
    public static final String INTENT_ACTION_START_WORK = "com.cootek.presentation.action.START_WORK";
    public static final String INTENT_EXTRA_PRESENT_ID = "present_id";
    private static final String SDK_VERSION = "3.0.0.8";
    private static boolean sDebugMode = false;
    private static PresentationManager sInst = null;
    private static String sProxyAddr = null;
    private static String sServerAddr = null;
    /* access modifiers changed from: private */
    public IActionDriver mActionDriver = null;
    /* access modifiers changed from: private */
    public String mAuthToken = null;
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (PresentationSystem.DUMPINFO) {
                Log.i("Joe", "PresentationService onServiceConnected");
            }
            PresentationManager.this.mService = IRemoteService.Stub.asInterface(iBinder);
            try {
                PresentationManager.this.mService.setActionDriver(new IActionDriverRemote.Stub() {
                    public void download(int i, String str, String str2, String str3, boolean z) throws RemoteException {
                        if (PresentationManager.this.mActionDriver != null) {
                            PresentationManager.this.mActionDriver.download(i, str, str2, str3, z);
                        }
                    }

                    public boolean launchApp(String str, String str2, String str3, String str4) throws RemoteException {
                        if (PresentationManager.this.mActionDriver == null) {
                            return false;
                        }
                        return PresentationManager.this.mActionDriver.launchApp(str, str2, str3, str4);
                    }

                    public boolean openUrl(String str, String str2, boolean z) throws RemoteException {
                        if (PresentationManager.this.mActionDriver == null) {
                            return false;
                        }
                        return PresentationManager.this.mActionDriver.openUrl(str, str2, z);
                    }

                    public void autoInstall(String str) throws RemoteException {
                        if (PresentationManager.this.mActionDriver != null) {
                            PresentationManager.this.mActionDriver.autoInstall(str);
                        }
                    }

                    public void close(String str) throws RemoteException {
                        if (PresentationManager.this.mActionDriver != null) {
                            PresentationManager.this.mActionDriver.close(str);
                            removeShortcut(str);
                        }
                    }

                    private void removeShortcut(String str) {
                        Intent intent = new Intent();
                        intent.setAction(PresentationManager.INTENT_ACTION_REMOVE_SHORTCUT_TOAST);
                        intent.setPackage(PresentationManager.this.mContext.getPackageName());
                        intent.putExtra(PresentationManager.INTENT_EXTRA_PRESENT_ID, str);
                        PresentationManager.this.mContext.sendBroadcast(intent);
                        if (PresentationSystem.DUMPINFO) {
                            Log.d("Joe", "PresentManager Send REMOVE_SHORTCUT_TOAST, id: " + str);
                        }
                    }

                    public void showActionConfirmDialog(String str, String str2) throws RemoteException {
                        if (PresentationManager.this.mActionDriver != null) {
                            PresentationManager.this.mActionDriver.showActionConfirmDialog(str, str2);
                        }
                    }

                    public String getDownloadConfirmMessage() throws RemoteException {
                        if (PresentationManager.this.mActionDriver == null) {
                            return "";
                        }
                        return PresentationManager.this.mActionDriver.getDownloadConfirmMessage();
                    }

                    public String getNonWifiMessage() throws RemoteException {
                        if (PresentationManager.this.mActionDriver == null) {
                            return "";
                        }
                        return PresentationManager.this.mActionDriver.getNonWifiMessage();
                    }

                    public void contentUpdated() throws RemoteException {
                        if (PresentationManager.this.mActionDriver != null) {
                            PresentationManager.this.mActionDriver.contentUpdated();
                        }
                    }

                    public boolean changeBoolSetting(String str, boolean z, boolean z2) throws RemoteException {
                        if (PresentationManager.this.mActionDriver == null) {
                            return false;
                        }
                        return PresentationManager.this.mActionDriver.changeBoolSetting(str, z, z2);
                    }

                    public boolean changeIntSetting(String str, int i, boolean z) throws RemoteException {
                        if (PresentationManager.this.mActionDriver == null) {
                            return false;
                        }
                        return PresentationManager.this.mActionDriver.changeIntSetting(str, i, z);
                    }

                    public boolean changeStringSetting(String str, String str2, boolean z) throws RemoteException {
                        if (PresentationManager.this.mActionDriver == null) {
                            return false;
                        }
                        return PresentationManager.this.mActionDriver.changeStringSetting(str, str2, z);
                    }

                    public boolean changeLongSetting(String str, long j, boolean z) throws RemoteException {
                        if (PresentationManager.this.mActionDriver == null) {
                            return false;
                        }
                        return PresentationManager.this.mActionDriver.changeLongSetting(str, j, z);
                    }

                    public String getDownloadRequestUrl(String str, String str2) throws RemoteException {
                        IDownloadHandler iDownloadHandler = (IDownloadHandler) PresentationManager.this.mDownloadHandlerMap.get(str);
                        return iDownloadHandler == null ? str2 : iDownloadHandler.getDownloadRequestUrl(str2);
                    }

                    public boolean handleDownloadedFile(String str, String str2) throws RemoteException {
                        IDownloadHandler iDownloadHandler = (IDownloadHandler) PresentationManager.this.mDownloadHandlerMap.get(str);
                        if (iDownloadHandler == null) {
                            return false;
                        }
                        return iDownloadHandler.handleDownloadedFile(new File(str2));
                    }

                    public void saveTypeUsage(String str, String str2, String str3) throws RemoteException {
                        if (PresentationManager.this.mActionDriver != null) {
                            PresentationManager.this.mActionDriver.saveTypeUsage(str, str2, str3);
                        }
                    }
                });
                PresentationManager.this.mService.setNativeAppInfo(new INativeAppInfoRemote.Stub() {
                    public void refreshAuthToken() throws RemoteException {
                        Intent intent = new Intent();
                        intent.setAction(PresentationManager.INTENT_ACTION_REFRESH_TOKEN);
                        intent.setPackage(PresentationManager.this.mContext.getPackageName());
                        if (PresentationSystem.DUMPINFO) {
                            Log.i("Joe", "send broadcast REFRESH_TOKEN");
                        }
                        PresentationManager.this.mContext.sendBroadcast(intent);
                    }

                    public String getStringSetting(String str) throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return null;
                        }
                        return PresentationManager.this.mNativeAppInfo.getStringSetting(str);
                    }

                    public long getLongSetting(String str) throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return 0;
                        }
                        return PresentationManager.this.mNativeAppInfo.getLongSetting(str);
                    }

                    public int getIntSetting(String str) throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return 0;
                        }
                        return PresentationManager.this.mNativeAppInfo.getIntSetting(str);
                    }

                    public int getInitialQuietDays() throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return 0;
                        }
                        return PresentationManager.this.mNativeAppInfo.getInitialQuietDays();
                    }

                    public int getInitialMobileQuietDays() throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return 0;
                        }
                        return PresentationManager.this.mNativeAppInfo.getInitialMobileQuietDays();
                    }

                    public String getHostPackageName() throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null || PresentationManager.this.mNativeAppInfo.getCurrentEditorInfo() == null) {
                            return null;
                        }
                        return PresentationManager.this.mNativeAppInfo.getCurrentEditorInfo().packageName;
                    }

                    public long getFirstInstallTimestamp() throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return 0;
                        }
                        return PresentationManager.this.mNativeAppInfo.getFirstInstallTimestamp();
                    }

                    public boolean getBoolSetting(String str) throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return false;
                        }
                        return PresentationManager.this.mNativeAppInfo.getBoolSetting(str);
                    }

                    public String getAuthToken() throws RemoteException {
                        return PresentationManager.this.mAuthToken;
                    }

                    public boolean canPointHolderShow(String str, String str2, String str3) throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return false;
                        }
                        return PresentationManager.this.mNativeAppInfo.canPointHolderShow(str, str2, str3);
                    }

                    public boolean canPointSelfShow(String str, String str2) throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return false;
                        }
                        return PresentationManager.this.mNativeAppInfo.canPointSelfShow(str, str2);
                    }

                    public boolean canExtend(String str, String str2) throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return false;
                        }
                        return PresentationManager.this.mNativeAppInfo.canExtend(str, str2);
                    }

                    public String getLocalConfigPath() throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return null;
                        }
                        return PresentationManager.this.mNativeAppInfo.getLocalConfigFilePath();
                    }

                    public long getUpdateCheckInterval() throws RemoteException {
                        if (PresentationManager.this.mNativeAppInfo == null) {
                            return 3600000;
                        }
                        return PresentationManager.this.mNativeAppInfo.getUpdateCheckInterval();
                    }
                });
                PresentationManager.this.mService.loadLocalConfig();
                PresentationManager.this.mService.update();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            PresentationManager.this.mService = null;
        }
    };
    /* access modifiers changed from: private */
    public Context mContext;
    /* access modifiers changed from: private */
    public Map<String, IDownloadHandler> mDownloadHandlerMap = null;
    private boolean mIsBound;
    /* access modifiers changed from: private */
    public INativeAppInfo mNativeAppInfo = null;
    private int mPid = 0;
    /* access modifiers changed from: private */
    public IRemoteService mService = null;
    private int mServicePid = 0;

    private PresentationManager(Context context) {
        this.mContext = context;
        this.mDownloadHandlerMap = new HashMap();
        this.mPid = Process.myPid();
    }

    private void startService() {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService startService");
        }
        Intent intent = new Intent(this.mContext, PresentationService.class);
        intent.putExtra("EXTRA_DEBUG_MODE", sDebugMode);
        if (!TextUtils.isEmpty(sServerAddr)) {
            intent.putExtra("EXTRA_SERVER_HTTP_ADDR", sServerAddr);
        }
        if (!TextUtils.isEmpty(sProxyAddr)) {
            intent.putExtra("EXTRA_PROXY_HTTP_ADDR", sProxyAddr);
        }
        this.mContext.startService(intent);
    }

    private void stopService() {
        if (this.mContext != null) {
            this.mContext.getApplicationContext().stopService(new Intent(this.mContext, PresentationService.class));
        }
    }

    private void bindService() {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService bindService");
        }
        this.mIsBound = this.mContext.getApplicationContext().bindService(new Intent(this.mContext, PresentationService.class), this.mConnection, 1);
    }

    private void unbindService() {
        if (this.mIsBound) {
            if (PresentationSystem.DUMPINFO) {
                Log.i("Joe", "PresentationService unbindService");
            }
            if (this.mContext != null) {
                this.mContext.getApplicationContext().unbindService(this.mConnection);
            }
            this.mIsBound = false;
        }
    }

    public static void enableDebugMode() {
        sDebugMode = true;
    }

    public static void setServer(String str) {
        sServerAddr = str;
    }

    public static void setProxy(String str) {
        sProxyAddr = str;
    }

    public static void initialize(Context context) {
        if (sInst == null) {
            sInst = new PresentationManager(context);
        }
        try {
            sInst.stopService();
            sInst.startService();
        } catch (NullPointerException | SecurityException e) {
        }
    }

    public static void initialize(Context context, IPresentToastCreator iPresentToastCreator) {
        initialize(context);
        PresentationSystem.init(context);
        PresentationSystem.getInstance().setPresentToastCreator(iPresentToastCreator);
        PresentationSystem.getInstance().loadlocalConfig();
        PresentationSystem.getInstance().update();
    }

    public static void destory() {
        if (sInst != null) {
            sInst.stopService();
        }
        sInst = null;
    }

    public static void setContext(Context context) {
        if (sInst != null) {
            sInst.mContext = context;
            PresentationSystem.getInstance().setContext(context);
        }
    }

    public static void setAuthToken(String str) {
        if (sInst != null) {
            sInst.mAuthToken = str;
        }
    }

    public static String getSDKVersion() {
        return SDK_VERSION;
    }

    public static void setNativeAppInfo(INativeAppInfo iNativeAppInfo) {
        if (sInst != null) {
            sInst.mNativeAppInfo = iNativeAppInfo;
        }
    }

    public static void setActionDriver(IActionDriver iActionDriver) {
        if (sInst != null) {
            sInst.mActionDriver = iActionDriver;
        }
    }

    public static void startWork(INativeAppInfo iNativeAppInfo, IActionDriver iActionDriver, String str) {
        if (sInst != null) {
            setNativeAppInfo(iNativeAppInfo);
            setActionDriver(iActionDriver);
            setAuthToken(str);
            try {
                sInst.bindService();
            } catch (SecurityException e) {
            }
        }
    }

    public static void stopWork() {
        if (sInst != null) {
            sInst.unbindService();
        }
    }

    private static boolean isServiceRunning() {
        List<ActivityManager.RunningServiceInfo> list;
        if (sInst.mServicePid != 0 && sInst.mServicePid == sInst.mPid) {
            return true;
        }
        ActivityManager activityManager = (ActivityManager) sInst.mContext.getSystemService(C1411aV.f4484k);
        if (activityManager != null) {
            try {
                list = activityManager.getRunningServices(Integer.MAX_VALUE);
            } catch (Exception e) {
                list = null;
            }
            if (list != null) {
                for (ActivityManager.RunningServiceInfo next : list) {
                    if (next != null && next.service != null && PresentationService.class.getName().equals(next.service.getClassName())) {
                        sInst.mServicePid = next.pid;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isWorking() {
        return sInst != null && isServiceRunning() && sInst.mIsBound && sInst.mService != null;
    }

    private static boolean ensureWork() {
        if (isWorking()) {
            return true;
        }
        try {
            sInst.bindService();
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean isToastExists(String str) {
        if (!isWorking()) {
            return false;
        }
        try {
            return sInst.mService.isToastExists(str);
        } catch (Exception e) {
            return false;
        }
    }

    public static void saveData() {
        if (isWorking()) {
            try {
                sInst.mService.saveData();
            } catch (Exception e) {
            }
        }
    }

    public static int getConnection() {
        if (!isWorking()) {
            return 1;
        }
        try {
            return sInst.mService.getConnection();
        } catch (Exception e) {
            return 1;
        }
    }

    public static float getCheckInterval() {
        if (!isWorking()) {
            return 1.0f;
        }
        try {
            return sInst.mService.getCheckInterval();
        } catch (Exception e) {
            return 1.0f;
        }
    }

    public static int getToolbarQuiet() {
        if (!isWorking()) {
            return 0;
        }
        try {
            return sInst.mService.getToolbarQuiet();
        } catch (Exception e) {
            return 0;
        }
    }

    public static int getStatusbarQuiet() {
        if (!isWorking()) {
            return 0;
        }
        try {
            return sInst.mService.getStatusbarQuiet();
        } catch (Exception e) {
            return 0;
        }
    }

    public static int getStartupQuiet() {
        if (!isWorking()) {
            return 0;
        }
        try {
            return sInst.mService.getStartupQuiet();
        } catch (Exception e) {
            return 0;
        }
    }

    public static void setTimeFake(boolean z) {
        if (isWorking()) {
            try {
                sInst.mService.setTimeFake(z);
            } catch (Exception e) {
            }
        }
    }

    public static void setTimestamp(long j) {
        if (isWorking()) {
            try {
                sInst.mService.setTimestamp(j);
            } catch (Exception e) {
            }
        }
    }

    public static void loadLocalConfig() {
        if (isWorking()) {
            try {
                sInst.mService.loadLocalConfig();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static ToolbarToast getToolbarToast() {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getToolbarToast();
        } catch (Exception e) {
            return null;
        }
    }

    public static StartupToast getStartupToast() {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getStartupToast();
        } catch (Exception e) {
            return null;
        }
    }

    public static PopupToast getPopupToast() {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getPopupToast();
        } catch (RemoteException e) {
            return null;
        }
    }

    public static StatusbarToast getStatusbarToast() {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getStatusbarToast();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static NextWordToast getNextwordToast(String str) {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getNextwordToast(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static CloudInputToast getCloudInputToast(String str) {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getCloudInputToast(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static DummyToast getDummyToast() {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getDummyToast();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static BackgroundImageToast getBackgroundImageToast() {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getBackgroundImageToast();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static FreecallHangupToast getFreecallHangupToast() {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getFreecallHangupToast();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<ExtensionStaticToast> getExtensionStaticToast(String str) {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getExtensionStaticToast(str);
        } catch (Exception e) {
            return null;
        }
    }

    public static FullscreenToast getFullscreenToast() {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getFullscreenToast();
        } catch (Exception e) {
            return null;
        }
    }

    public static void actionConfirmed(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService actionConfirmed");
        }
        if (ensureWork()) {
            try {
                sInst.mService.actionConfirmed(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void clicked(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService clicked");
        }
        if (ensureWork()) {
            try {
                sInst.mService.clicked(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void shown(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService shown");
        }
        if (ensureWork()) {
            try {
                sInst.mService.shown(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void cleaned(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService cleaned");
        }
        if (ensureWork()) {
            try {
                sInst.mService.cleaned(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void closed(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService closed");
        }
        if (ensureWork()) {
            try {
                sInst.mService.closed(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void setNotShowAgain(String str, boolean z) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService setNotShowAgain");
        }
        if (ensureWork()) {
            try {
                sInst.mService.setNotShowAgain(str, z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void downloadFinished(String str, String str2) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService downloadFinished");
        }
        if (ensureWork()) {
            try {
                sInst.mService.downloadFinished(str, str2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void installStarted(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService installStarted");
        }
        if (ensureWork()) {
            try {
                sInst.mService.installStarted(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void installFinished(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService installFinished");
        }
        if (ensureWork()) {
            try {
                sInst.mService.installFinished(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void webPageLoaded(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService webPageLoaded");
        }
        if (ensureWork()) {
            try {
                sInst.mService.webPageLoaded(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void webPageOpened(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService webPageOpened");
        }
        if (ensureWork()) {
            try {
                sInst.mService.webPageOpened(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void hostAppClosed() {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService hostAppClosed");
        }
        if (ensureWork()) {
            try {
                sInst.mService.hostAppClosed();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static int getPresentTimes(String str) {
        if (!isWorking()) {
            return -1;
        }
        try {
            return sInst.mService.getPresentTimes(str);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String getPresentImagePath(String str) {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getPresentImagePath(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getDownloadFilePath(String str) {
        if (!isWorking()) {
            return null;
        }
        try {
            return sInst.mService.getDownloadFilePath(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void clearFeatureSetting(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService reset");
        }
        if (ensureWork()) {
            try {
                sInst.mService.clearFeatureSetting(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void reset(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService reset");
        }
        if (ensureWork()) {
            try {
                sInst.mService.reset(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void registerDownloadHandler(String str, IDownloadHandler iDownloadHandler) {
        if (sInst != null && !sInst.mDownloadHandlerMap.containsKey(str)) {
            sInst.mDownloadHandlerMap.put(str, iDownloadHandler);
        }
    }

    public static void unregisterDownloadHandler(String str) {
        if (sInst != null && sInst.mDownloadHandlerMap.containsKey(str)) {
            sInst.mDownloadHandlerMap.remove(str);
        }
    }

    public static void setPresentToastCreator(IPresentToastCreator iPresentToastCreator) {
        PresentationSystem.setCreator(iPresentToastCreator);
    }

    public static int getGuidePointNumber(String str) {
        if (!isWorking()) {
            return 0;
        }
        try {
            return sInst.mService.getGuidePointNumber(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getGuidePointType(String str) {
        if (!isWorking()) {
            return 0;
        }
        try {
            return sInst.mService.getGuidePointType(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void guidePointClicked(String str, int i) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService guidePointClicked");
        }
        if (i != 0 && ensureWork()) {
            try {
                sInst.mService.guidePointClicked(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void guidePointShown(String str, int i) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService guidePointShown");
        }
        if (i != 0 && isWorking()) {
            try {
                sInst.mService.guidePointShown(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static List<BannerAdsToast> getBannerToasts(String str) {
        return null;
    }

    public static boolean executeToastById(String str) {
        if (!isWorking()) {
            return false;
        }
        try {
            sInst.mService.executeToastById(str);
            return true;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean executeToastWithMessage(String str) {
        if (!isWorking()) {
            return false;
        }
        try {
            sInst.mService.executeToastWithMessage(str);
            return true;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean addToast(String str) {
        if (!isWorking()) {
            return false;
        }
        try {
            sInst.mService.addToast(str);
            return true;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
