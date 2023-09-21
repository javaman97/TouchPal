package com.cootek.presentation.service;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.presentation.sdk.IActionDriverRemote;
import com.cootek.presentation.sdk.INativeAppInfoRemote;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.service.IRemoteService;
import com.cootek.presentation.service.toast.BackgroundImageToast;
import com.cootek.presentation.service.toast.CloudInputToast;
import com.cootek.presentation.service.toast.DummyToast;
import com.cootek.presentation.service.toast.ExtensionStaticToast;
import com.cootek.presentation.service.toast.FreecallHangupToast;
import com.cootek.presentation.service.toast.FullscreenToast;
import com.cootek.presentation.service.toast.GuidePointsToast;
import com.cootek.presentation.service.toast.NextWordToast;
import com.cootek.presentation.service.toast.PopupToast;
import com.cootek.presentation.service.toast.PresentToast;
import com.cootek.presentation.service.toast.StartupToast;
import com.cootek.presentation.service.toast.StatusbarToast;
import com.cootek.presentation.service.toast.ToolbarToast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PresentationService extends Service {
    private final IRemoteService.Stub mBinder = new IRemoteService.Stub() {
        public void webPageOpened(String str) throws RemoteException {
            PresentationSystem.getInstance().actionPerformed(6, str);
        }

        public void webPageLoaded(String str) throws RemoteException {
            PresentationSystem.getInstance().actionPerformed(7, str);
        }

        public void shown(String str) throws RemoteException {
            PresentationSystem.getInstance().shown(str);
        }

        public void setNativeAppInfo(INativeAppInfoRemote iNativeAppInfoRemote) throws RemoteException {
            PresentationSystem.getInstance().setNativeAppInfo(iNativeAppInfoRemote);
            PresentationSystem.getInstance().setUpdateAlarm();
        }

        public void setActionDriver(IActionDriverRemote iActionDriverRemote) throws RemoteException {
            PresentationSystem.getInstance().setActionDriver(iActionDriverRemote);
        }

        public boolean isToastExists(String str) throws RemoteException {
            PresentToast toastByFeatureId = PresentationSystem.getInstance().getToastByFeatureId(str);
            if (toastByFeatureId != null) {
                return toastByFeatureId.isShowing();
            }
            return false;
        }

        public void installStarted(String str) throws RemoteException {
            PackageInfo packageArchiveInfo = PresentationService.this.getPackageManager().getPackageArchiveInfo(str, 0);
            if (packageArchiveInfo != null) {
                PresentationSystem.getInstance().actionPerformed(12, packageArchiveInfo.packageName);
            }
        }

        public void installFinished(String str) throws RemoteException {
            PresentationSystem.getInstance().actionPerformed(1, str);
        }

        public void hostAppClosed() throws RemoteException {
            PresentationSystem.getInstance().actionPerformed(8, new String[0]);
            PresentationSystem.getInstance().update();
        }

        public void downloadFinished(String str, String str2) throws RemoteException {
            PresentationSystem.getInstance().actionPerformed(2, str, str2);
        }

        public void closed(String str) throws RemoteException {
            PresentationSystem.getInstance().closed(str);
        }

        public void clicked(String str) throws RemoteException {
            PresentationSystem.getInstance().clicked(str, false);
        }

        public void cleaned(String str) throws RemoteException {
            PresentationSystem.getInstance().cleaned(str);
        }

        public void actionConfirmed(String str) throws RemoteException {
            PresentationSystem.getInstance().clicked(str, true);
        }

        public void update() throws RemoteException {
            PresentationSystem.getInstance().update();
        }

        public void setUpdateAlarm() throws RemoteException {
            PresentationSystem.getInstance().setUpdateAlarm();
        }

        public ToolbarToast getToolbarToast() throws RemoteException {
            return (ToolbarToast) PresentationSystem.getInstance().getPresentToast(ToolbarToast.class, (String) null);
        }

        public StartupToast getStartupToast() throws RemoteException {
            return (StartupToast) PresentationSystem.getInstance().getPresentToast(StartupToast.class, (String) null);
        }

        public StatusbarToast getStatusbarToast() throws RemoteException {
            return (StatusbarToast) PresentationSystem.getInstance().getPresentToast(StatusbarToast.class, (String) null);
        }

        public NextWordToast getNextwordToast(String str) throws RemoteException {
            return (NextWordToast) PresentationSystem.getInstance().getPresentToast(NextWordToast.class, str);
        }

        public CloudInputToast getCloudInputToast(String str) throws RemoteException {
            return (CloudInputToast) PresentationSystem.getInstance().getPresentToast(CloudInputToast.class, str);
        }

        public DummyToast getDummyToast() throws RemoteException {
            return (DummyToast) PresentationSystem.getInstance().getPresentToast(DummyToast.class, (String) null);
        }

        public FullscreenToast getFullscreenToast() throws RemoteException {
            return (FullscreenToast) PresentationSystem.getInstance().getPresentToast(FullscreenToast.class, (String) null);
        }

        public String getToastType(String str) throws RemoteException {
            PresentToast toastByFeatureId = PresentationSystem.getInstance().getToastByFeatureId(str);
            if (toastByFeatureId != null) {
                return toastByFeatureId.getClass().getName();
            }
            return null;
        }

        public void clearFeatureSetting(String str) throws RemoteException {
            PresentationSystem.getInstance().clearFeatureSetting(str);
        }

        public void reset(String str) throws RemoteException {
            PresentationSystem.getInstance().reset(str);
        }

        public int getPresentTimes(String str) throws RemoteException {
            return PresentationSystem.getInstance().getPresentTimes(str);
        }

        public String getPresentImagePath(String str) throws RemoteException {
            return PresentationSystem.getInstance().getPresentImagePath(str);
        }

        public String getDownloadFilePath(String str) throws RemoteException {
            return PresentationSystem.getInstance().getDownloadFilePath(str);
        }

        public void setNotShowAgain(String str, boolean z) throws RemoteException {
            PresentationSystem.getInstance().setNotShowAgain(str, z);
        }

        public List<ExtensionStaticToast> getExtensionStaticToast(String str) throws RemoteException {
            List<PresentToast> extensionStaticToasts = PresentationSystem.getInstance().getExtensionStaticToasts(str);
            if (extensionStaticToasts == null || extensionStaticToasts.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<PresentToast> it = extensionStaticToasts.iterator();
            while (it.hasNext()) {
                arrayList.add((ExtensionStaticToast) it.next());
            }
            return arrayList;
        }

        public int getGuidePointNumber(String str) throws RemoteException {
            GuidePointsToast guidePointsToast = (GuidePointsToast) PresentationSystem.getInstance().getPresentToast(GuidePointsToast.class, (String) null);
            if (guidePointsToast == null) {
                return 0;
            }
            return guidePointsToast.getChildrenCount(str);
        }

        public int getGuidePointType(String str) throws RemoteException {
            GuidePointsToast guidePointsToast = (GuidePointsToast) PresentationSystem.getInstance().getPresentToast(GuidePointsToast.class, (String) null);
            if (guidePointsToast == null) {
                return 0;
            }
            return guidePointsToast.getGuideType(str);
        }

        public void guidePointClicked(String str) throws RemoteException {
            GuidePointsToast guidePointsToast = (GuidePointsToast) PresentationSystem.getInstance().getPresentToast(GuidePointsToast.class, (String) null);
            if (guidePointsToast != null) {
                guidePointsToast.clicked(str);
            }
        }

        public void guidePointShown(String str) throws RemoteException {
            GuidePointsToast guidePointsToast = (GuidePointsToast) PresentationSystem.getInstance().getPresentToast(GuidePointsToast.class, (String) null);
            if (guidePointsToast != null) {
                guidePointsToast.shown(str);
            }
        }

        public void loadLocalConfig() throws RemoteException {
            PresentationSystem.getInstance().loadlocalConfig();
        }

        public boolean executeToastById(String str) throws RemoteException {
            return PresentationSystem.getInstance().executeToastById(str);
        }

        public boolean executeToastWithMessage(String str) throws RemoteException {
            return PresentationSystem.getInstance().executeToastWithMessage(str);
        }

        public boolean addToast(String str) throws RemoteException {
            return PresentationSystem.getInstance().addToast(str);
        }

        public PopupToast getPopupToast() throws RemoteException {
            return (PopupToast) PresentationSystem.getInstance().getPresentToast(PopupToast.class, (String) null);
        }

        public void saveData() throws RemoteException {
        }

        public BackgroundImageToast getBackgroundImageToast() {
            return (BackgroundImageToast) PresentationSystem.getInstance().getPresentToast(BackgroundImageToast.class, (String) null);
        }

        public int getConnection() throws RemoteException {
            return PresentationSystem.getInstance().getPresentations().getGlobalStrategy().checkConnection;
        }

        public float getCheckInterval() throws RemoteException {
            return PresentationSystem.getInstance().getPresentations().getGlobalStrategy().checkInterval;
        }

        public int getToolbarQuiet() throws RemoteException {
            return PresentationSystem.getInstance().getPresentations().getGlobalStrategy().toolbarQuietDays;
        }

        public int getStatusbarQuiet() throws RemoteException {
            return PresentationSystem.getInstance().getPresentations().getGlobalStrategy().statusbarQuietDays;
        }

        public int getStartupQuiet() throws RemoteException {
            return PresentationSystem.getInstance().getPresentations().getGlobalStrategy().startupQuietDays;
        }

        public FreecallHangupToast getFreecallHangupToast() {
            return (FreecallHangupToast) PresentationSystem.getInstance().getPresentToast(FreecallHangupToast.class, (String) null);
        }

        public void setTimeFake(boolean z) throws RemoteException {
            SystemFacade.setTimeFake(z);
        }

        public void setTimestamp(long j) throws RemoteException {
            SystemFacade.setCurrentTimeMillis(j);
        }
    };

    public void onCreate() {
        super.onCreate();
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService onCreate");
        }
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                return null;
            }
        };
        PresentationSystem.init(this);
        Intent intent = new Intent(PresentationManager.INTENT_ACTION_REGISTER_TOAST_CREATOR);
        intent.setPackage(getPackageName());
        sendBroadcast(intent);
    }

    private void start(Intent intent) {
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_DEBUG_MODE", false);
            if (booleanExtra) {
                PresentationSystem.DUMPINFO = booleanExtra;
            }
            String stringExtra = intent.getStringExtra("EXTRA_SERVER_HTTP_ADDR");
            if (!TextUtils.isEmpty(stringExtra)) {
                PresentationSystem.setServer(stringExtra);
            }
            String stringExtra2 = intent.getStringExtra("EXTRA_PROXY_HTTP_ADDR");
            if (!TextUtils.isEmpty(stringExtra2)) {
                PresentationSystem.setProxy(stringExtra2);
            }
            PresentationSystem.getInstance().startListenNetworkChanges();
            PresentationSystem.getInstance().setUpdateAlarm();
        }
    }

    public void onStart(Intent intent, int i) {
        start(intent);
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService onStart");
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        start(intent);
        if (!PresentationSystem.DUMPINFO) {
            return 1;
        }
        Log.i("Joe", "PresentationService onStartCommand");
        return 1;
    }

    public boolean onUnbind(Intent intent) {
        if (!PresentationSystem.DUMPINFO) {
            return false;
        }
        Log.i("Joe", "PresentationService onUnbind");
        return false;
    }

    public void onDestroy() {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService onDestroy");
        }
    }

    public IBinder onBind(Intent intent) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "PresentationService onBind");
        }
        return this.mBinder;
    }
}
