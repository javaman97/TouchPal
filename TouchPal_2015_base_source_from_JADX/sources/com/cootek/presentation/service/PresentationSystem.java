package com.cootek.presentation.service;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.cootek.presentation.sdk.IActionDriverRemote;
import com.cootek.presentation.sdk.INativeAppInfoRemote;
import com.cootek.presentation.sdk.IPresentToastCreator;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.action.PresentAction;
import com.cootek.presentation.service.config.PresentConfigLoader;
import com.cootek.presentation.service.config.PresentConfigParser;
import com.cootek.presentation.service.config.PresentConfigUpdater;
import com.cootek.presentation.service.feature.ToastDrivenFeature;
import com.cootek.presentation.service.history.PresentHistoryManager;
import com.cootek.presentation.service.history.PresentStatisticUploader;
import com.cootek.presentation.service.toast.ExtensionStaticToast;
import com.cootek.presentation.service.toast.PresentToast;
import com.cootek.presentation.service.toast.PresentToastFactory;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1351J;
import com.iflytek.speech.VoiceWakeuperAidl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class PresentationSystem implements PresentAction.IActionListener {
    public static final long DAY_MILLIS = 86400000;
    public static boolean DUMPINFO = false;
    public static final long HOUR_MILLIS = 3600000;
    private static IPresentToastCreator sCreator = null;
    private static PresentationSystem sInstance = null;
    private static String sProxyUrl = null;
    private static String sServerUrl = "http://ws2.cootekservice.com";
    private IActionDriverRemote mActionDriver;
    private int mCleanType = 10;
    private Context mContext;
    private boolean mIsListeningNetwork = false;
    private PresentConfigLoader mLoader = null;
    private INativeAppInfoRemote mNativeAppInfo;
    private PresentHistoryManager mPresentHistories = null;
    private PresentStatisticUploader mPresentStatisticUploader = null;
    private IPresentToastCreator mPresentToastCreator;
    private Presentations mPresents = null;
    private PresentationServiceReceiver mReceiver = new PresentationServiceReceiver();
    private PresentConfigUpdater mUpdater = null;

    private PresentationSystem(Context context) {
        this.mPresentHistories = new PresentHistoryManager(context);
        this.mPresentStatisticUploader = new PresentStatisticUploader();
        this.mUpdater = new PresentConfigUpdater();
        this.mLoader = new PresentConfigLoader();
    }

    public static void init(Context context) {
        if (sInstance == null) {
            synchronized (PresentationSystem.class) {
                if (sInstance == null) {
                    sInstance = new PresentationSystem(context);
                }
            }
        }
        sInstance.setContext(context);
        sInstance.setPresentToastCreator(sCreator);
    }

    public static void setCreator(IPresentToastCreator iPresentToastCreator) {
        sCreator = iPresentToastCreator;
        if (sInstance != null) {
            sInstance.setPresentToastCreator(sCreator);
        }
    }

    public static PresentationSystem getInstance() {
        return sInstance;
    }

    public static void setServer(String str) {
        sServerUrl = str;
    }

    public static String getServer() {
        return sServerUrl;
    }

    public static void setProxy(String str) {
        sProxyUrl = str;
    }

    public static List<Pair<String, Integer>> getProxy() {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(sProxyUrl)) {
            String[] split = sProxyUrl.split(VoiceWakeuperAidl.PARAMS_SEPARATE);
            for (String str : split) {
                int i = 3128;
                if (str.contains(":")) {
                    String[] split2 = str.split(":");
                    str = split2[0];
                    i = Integer.valueOf(split2[1]).intValue();
                }
                arrayList.add(new Pair(str, Integer.valueOf(i)));
            }
        }
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public void loadlocalConfig() {
        this.mLoader.load();
    }

    public void prepareLocal() {
        this.mLoader.prepareAll();
    }

    public void setPresentations(Presentations presentations) {
        this.mPresents = presentations;
    }

    public Presentations getPresentations() {
        return this.mPresents;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void setNativeAppInfo(INativeAppInfoRemote iNativeAppInfoRemote) {
        this.mNativeAppInfo = iNativeAppInfoRemote;
    }

    public INativeAppInfoRemote getNativeAppInfo() {
        return this.mNativeAppInfo;
    }

    public IActionDriverRemote getActionDriver() {
        return this.mActionDriver;
    }

    public void setActionDriver(IActionDriverRemote iActionDriverRemote) {
        this.mActionDriver = iActionDriverRemote;
    }

    public IPresentToastCreator getPresentToastCreate() {
        return this.mPresentToastCreator;
    }

    public PresentToast createToast(String str, XmlPullParser xmlPullParser) {
        if (this.mPresentToastCreator != null) {
            return this.mPresentToastCreator.create(str, xmlPullParser);
        }
        return null;
    }

    public void setPresentToastCreator(IPresentToastCreator iPresentToastCreator) {
        this.mPresentToastCreator = iPresentToastCreator;
    }

    public boolean matchToast(String str, PresentToast presentToast) {
        if (this.mPresentToastCreator != null) {
            return this.mPresentToastCreator.match(str, presentToast);
        }
        return false;
    }

    public PackageInfo getPackageInfo(String str) {
        try {
            return this.mContext.getApplicationContext().getPackageManager().getPackageInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public String getLocale() {
        Locale locale = this.mContext.getResources().getConfiguration().locale;
        return (String.valueOf(locale.getLanguage()) + C1351J.f4161f + locale.getCountry()).toLowerCase();
    }

    public PresentHistoryManager getHistoryManager() {
        return this.mPresentHistories;
    }

    public PresentStatisticUploader getPresentStatisticUploader() {
        return this.mPresentStatisticUploader;
    }

    public PresentToast getToastByFeatureId(String str) {
        if (getPresentations() != null) {
            return getPresentations().findByFeatureId(str);
        }
        return null;
    }

    public void clicked(String str, boolean z) {
        PresentAction action;
        PresentToast toastByFeatureId = getToastByFeatureId(str);
        if (toastByFeatureId != null && (action = toastByFeatureId.getAction()) != null) {
            action.onClick(toastByFeatureId, z);
        }
    }

    public void shown(String str) {
        PresentToast toastByFeatureId = getToastByFeatureId(str);
        if (toastByFeatureId != null) {
            toastByFeatureId.onToastShown();
        }
    }

    public void closed(String str) {
        PresentToast toastByFeatureId = getToastByFeatureId(str);
        if (toastByFeatureId != null) {
            toastByFeatureId.onToastCleared(10);
        }
    }

    public void cleaned(String str) {
        PresentToast toastByFeatureId = getToastByFeatureId(str);
        if (toastByFeatureId != null) {
            toastByFeatureId.onToastCleared(11);
        }
    }

    public void actionPerformed(int i, String... strArr) {
        List<PresentToast> meetActionToasts;
        if (this.mPresents != null && (meetActionToasts = this.mPresents.getMeetActionToasts(i, strArr)) != null) {
            for (PresentToast next : meetActionToasts) {
                next.addStatisticItem(i);
                if (next.isShowing()) {
                    this.mCleanType = next.getCleanType(i);
                    if (next.clearRuleSupported(2) && this.mCleanType == 8) {
                        try {
                            if (this.mActionDriver != null) {
                                this.mActionDriver.close(next.getId());
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                    if (next.getAction() != null) {
                        if (next.clearRuleSupported(1) && this.mCleanType == next.getAction().cleanAcknowledge) {
                            try {
                                if (this.mActionDriver != null) {
                                    this.mActionDriver.close(next.getId());
                                }
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                            }
                        }
                        next.getAction().autoPerformNextAction(i, strArr);
                    }
                }
            }
        }
    }

    public void clickException(PresentToast presentToast) {
        this.mCleanType = -1;
        try {
            this.mActionDriver.close(presentToast.getId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setCleanType(int i) {
        this.mCleanType = i;
    }

    private boolean nativeHooked() {
        return (this.mActionDriver == null || this.mNativeAppInfo == null || this.mContext == null) ? false : true;
    }

    public void update() {
        if (nativeHooked()) {
            this.mUpdater.update();
        }
    }

    public void updateWithDelay() {
        if (nativeHooked()) {
            this.mUpdater.updateWithDelay();
        }
    }

    public void prepareContent(String str) {
        this.mLoader.prepare(str);
    }

    public void sortPresentation() {
        this.mLoader.sort();
    }

    public void onMessageReady() {
        Intent intent = new Intent();
        intent.setAction(PresentationManager.INTENT_ACTION_MESSAGE_READY);
        intent.setPackage(this.mContext.getPackageName());
        if (DUMPINFO) {
            Log.i("Joe", "send broadcast MESSAGE READY");
        }
        this.mContext.sendBroadcast(intent);
    }

    public void startListenNetworkChanges() {
        if (this.mContext != null && this.mContext.getApplicationContext() != null && !this.mIsListeningNetwork) {
            try {
                this.mContext.getApplicationContext().registerReceiver(this.mReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (SecurityException e) {
            }
            this.mIsListeningNetwork = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r4 > 0) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setUpdateAlarm() {
        /*
            r10 = this;
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            r2 = 0
            android.content.Context r0 = r10.mContext
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            return
        L_0x000a:
            android.content.Context r0 = r10.mContext
            java.lang.String r1 = "alarm"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            com.cootek.presentation.sdk.INativeAppInfoRemote r1 = r10.mNativeAppInfo
            if (r1 == 0) goto L_0x0045
            com.cootek.presentation.sdk.INativeAppInfoRemote r1 = r10.mNativeAppInfo     // Catch:{ RemoteException -> 0x0041 }
            long r4 = r1.getUpdateCheckInterval()     // Catch:{ RemoteException -> 0x0041 }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0045
        L_0x0022:
            java.lang.String r1 = "Presentation"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "presentation check interval hours="
            r8.<init>(r9)
            long r6 = r4 / r6
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r1, r6)
            r1 = 1
            android.app.PendingIntent r6 = r10.getAutoUpdatePending()
            r0.setInexactRepeating(r1, r2, r4, r6)
            goto L_0x0009
        L_0x0041:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0045:
            r4 = r6
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.presentation.service.PresentationSystem.setUpdateAlarm():void");
    }

    private PendingIntent getAutoUpdatePending() {
        Intent intent = new Intent(PresentationManager.INTENT_ACITON_CONFIG_UPDATE);
        intent.setPackage(this.mContext.getPackageName());
        return PendingIntent.getBroadcast(this.mContext, 0, intent, Engine.EXCEPTION_WARN);
    }

    public PresentToast getPresentToast(Class<? extends PresentToast> cls, String str) {
        if (this.mPresents == null || cls == null || PresentToastFactory.needQuiet(cls)) {
            return null;
        }
        return this.mPresents.find(cls, str);
    }

    public void clearFeatureSetting(String str) {
        this.mPresentHistories.clearFeatureSetting(str);
    }

    public void reset(String str) {
        this.mPresentHistories.resetFeatureSetting(str);
    }

    public int getPresentTimes(String str) {
        return this.mPresentHistories.getFeatureSettingInt(str, PresentHistoryManager.ALREADY_PRESNET_TIMES);
    }

    public String getPresentImagePath(String str) {
        return this.mPresentHistories.getFeatureSettingString(str, PresentHistoryManager.IMAGE_PATH);
    }

    public String getDownloadFilePath(String str) {
        return this.mPresentHistories.getFeatureSettingString(str, PresentHistoryManager.FILE_PATH);
    }

    public void setNotShowAgain(String str, boolean z) {
        this.mPresentHistories.setFeatureSetting(str, PresentHistoryManager.IS_CLEAR, Boolean.valueOf(z));
    }

    public void needAuthToken() {
        Intent intent = new Intent();
        intent.setAction(PresentationManager.INTENT_ACTION_NEED_TOKEN);
        intent.setPackage(this.mContext.getPackageName());
        this.mContext.sendBroadcast(intent);
        if (DUMPINFO) {
            Log.d("Joe", "PresentUpdater Send NEEN_TOKEN");
        }
    }

    public void checkStatusToast(String str) {
        Intent intent = new Intent();
        intent.setAction(PresentationManager.INTENT_ACTION_CHECK_STATUS_TOAST);
        intent.setPackage(this.mContext.getPackageName());
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(PresentationManager.INTENT_EXTRA_PRESENT_ID, str);
        }
        this.mContext.sendBroadcast(intent);
        if (DUMPINFO) {
            Log.d("Joe", "PresentUpdater Send CHECK_STATUS_TOAST");
        }
    }

    public void checkDummyToast(String str) {
        Intent intent = new Intent();
        intent.setAction(PresentationManager.INTENT_ACTION_CHECK_DUMMY_TOAST);
        intent.setPackage(this.mContext.getPackageName());
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(PresentationManager.INTENT_EXTRA_PRESENT_ID, str);
        }
        this.mContext.sendBroadcast(intent);
        if (DUMPINFO) {
            Log.d("Joe", "PresentUpdater Send CHECK_DUMMY_TOAST");
        }
    }

    public void checkShortcutToast(String str) {
        Intent intent = new Intent();
        intent.setAction(PresentationManager.INTENT_ACTION_CHECK_SHORTCUT_TOAST);
        intent.setPackage(this.mContext.getPackageName());
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(PresentationManager.INTENT_EXTRA_PRESENT_ID, str);
        }
        this.mContext.sendBroadcast(intent);
        if (DUMPINFO) {
            Log.d("Joe", "PresentUpdater Send CHECK_SHORTCUT_TOAST");
        }
    }

    public boolean executeToastById(String str) {
        PresentToast toastByFeatureId = getToastByFeatureId(str);
        if (toastByFeatureId == null) {
            return false;
        }
        return executeToast(toastByFeatureId);
    }

    private boolean executeToast(PresentToast presentToast) {
        presentToast.onToastShown();
        PresentAction action = presentToast.getAction();
        if (action != null) {
            action.onClick(presentToast, false);
        }
        return false;
    }

    private List<PresentToast> generateAndAddToasts(String str) {
        if (this.mPresents == null) {
            return null;
        }
        try {
            List<PresentToast> parse = new PresentConfigParser().parse(str);
            if (parse == null || parse.isEmpty()) {
                return null;
            }
            this.mPresents.addDynamicToasts(parse);
            return parse;
        } catch (IOException | XmlPullParserException e) {
            return null;
        }
    }

    public boolean addToast(String str) {
        if (generateAndAddToasts(str) == null) {
            return false;
        }
        return true;
    }

    public boolean executeToastWithMessage(String str) {
        List<PresentToast> generateAndAddToasts = generateAndAddToasts(str);
        if (generateAndAddToasts == null) {
            return false;
        }
        for (PresentToast next : generateAndAddToasts) {
            if (next != null && !(next.getFeature() instanceof ToastDrivenFeature)) {
                reset(next.getId());
                return executeToast(next);
            }
        }
        return false;
    }

    public List<PresentToast> getExtensionStaticToasts(String str) {
        if (this.mPresents != null && !PresentToastFactory.needQuiet(ExtensionStaticToast.class)) {
            return this.mPresents.findList(ExtensionStaticToast.class, str);
        }
        return null;
    }
}
