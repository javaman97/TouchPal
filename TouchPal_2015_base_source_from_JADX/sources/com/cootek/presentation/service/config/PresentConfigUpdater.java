package com.cootek.presentation.service.config;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.sdk.utils.NetworkUtil;
import com.cootek.presentation.service.GlobalStrategy;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigDownloader;
import java.io.IOException;
import java.util.Random;

public class PresentConfigUpdater {
    private static final float DEFAULT_CHECK_INTERVAL_DAYS = 0.1f;
    private static final String TAG = "PresentConfigUpdater";
    private static final int WHAT_UPDATE = 1;
    /* access modifiers changed from: private */
    public String authToken = null;
    /* access modifiers changed from: private */
    public String locale = null;
    /* access modifiers changed from: private */
    public PresentConfigDownloader mDownloader = new PresentConfigDownloader();
    private Handler mHandler = new Handler(PresentConfigHandler.sThread.getLooper()) {
        public void handleMessage(Message message) {
            if (message.what == 1) {
                tryPrepareLocal(PresentConfigUpdater.this.locale, PresentConfigUpdater.this.authToken);
            }
            super.handleMessage(message);
        }

        private void tryPrepareLocal(String str, String str2) {
            PresentConfigDownloader.DownloadResult downloadResult;
            if (PresentationSystem.DUMPINFO) {
                Log.d("Joe", "PresentUpdater update in thread");
            }
            if (PresentConfigUpdater.this.canUpdate()) {
                if (PresentationSystem.DUMPINFO) {
                    Log.d("Joe", "PresentUpdater can update");
                }
                try {
                    downloadResult = PresentConfigUpdater.this.mDownloader.download(str, str2);
                } catch (IOException e) {
                    e.printStackTrace();
                    Log.e(PresentConfigUpdater.TAG, "update -- download exception");
                    downloadResult = null;
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                    Log.e(PresentConfigUpdater.TAG, "update -- download exception");
                    downloadResult = null;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    Log.e(PresentConfigUpdater.TAG, "update -- download exception");
                    downloadResult = null;
                } catch (Error e4) {
                    e4.printStackTrace();
                    Log.e(PresentConfigUpdater.TAG, "update -- download exception");
                    downloadResult = null;
                }
                if (downloadResult != null) {
                    if (downloadResult.isSucceed) {
                        PresentationSystem.getInstance().getHistoryManager().setLastCheckTime(SystemFacade.currentTimeMillis());
                        PresentationSystem.getInstance().loadlocalConfig();
                    }
                    if (downloadResult.retCode == 444 && downloadResult.errorCode == 1001) {
                        try {
                            PresentationSystem.getInstance().getNativeAppInfo().refreshAuthToken();
                        } catch (RemoteException e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            } else if (PresentationSystem.DUMPINFO) {
                Log.d("Joe", "PresentUpdater can NOT update");
            }
            PresentationSystem.getInstance().prepareLocal();
        }
    };

    public void update() {
        update(false);
    }

    public void updateWithDelay() {
        update(true);
    }

    public void update(boolean z) {
        long j;
        try {
            this.authToken = PresentationSystem.getInstance().getNativeAppInfo().getAuthToken();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if (PresentationSystem.DUMPINFO) {
            Log.d("Joe", "PresentUpdater authToken: " + this.authToken);
        }
        if (TextUtils.isEmpty(this.authToken)) {
            PresentationSystem.getInstance().needAuthToken();
            return;
        }
        try {
            this.locale = PresentationSystem.getInstance().getLocale();
            if (PresentationSystem.DUMPINFO) {
                Log.d("Joe", "PresentUpdater Locale: " + this.locale);
            }
            if (PresentationSystem.DUMPINFO) {
                Log.d("Joe", "PresentUpdater before execute task");
            }
            Message obtainMessage = this.mHandler.obtainMessage(1);
            if (!z || PresentationSystem.DUMPINFO) {
                this.mHandler.sendMessage(obtainMessage);
                return;
            }
            try {
                j = PresentationSystem.getInstance().getNativeAppInfo().getUpdateCheckInterval();
                if (j <= 0) {
                    j = 3600000;
                }
            } catch (RemoteException e2) {
                j = 3600000;
            }
            int nextInt = new Random().nextInt((int) j);
            Log.i(TAG, "delay time: " + ((((float) nextInt) / 1000.0f) / 60.0f));
            this.mHandler.sendMessageDelayed(obtainMessage, (long) nextInt);
        } catch (NullPointerException e3) {
            e3.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public boolean canUpdate() {
        boolean meetNetwork;
        GlobalStrategy globalStrategy;
        NetworkUtil.NetworkStatus networkStatus = NetworkUtil.getNetworkStatus();
        float f = DEFAULT_CHECK_INTERVAL_DAYS;
        int i = 4;
        if (!(PresentationSystem.getInstance().getPresentations() == null || (globalStrategy = PresentationSystem.getInstance().getPresentations().getGlobalStrategy()) == null)) {
            f = globalStrategy.checkInterval;
            i = globalStrategy.checkConnection;
        }
        if (PresentationSystem.DUMPINFO) {
            Log.d("Joe", "PresentUpdater interval: " + f + ", connection: " + i);
        }
        long currentTimeMillis = SystemFacade.currentTimeMillis();
        long firstUsedTime = PresentationSystem.getInstance().getHistoryManager().getFirstUsedTime();
        if (PresentationSystem.DUMPINFO) {
            Log.d("Joe", "PresentUpdater firstUsedTime: " + firstUsedTime);
        }
        int i2 = 0;
        try {
            if (networkStatus.wifiConnected) {
                i2 = PresentationSystem.getInstance().getNativeAppInfo().getInitialQuietDays();
            } else {
                i2 = PresentationSystem.getInstance().getNativeAppInfo().getInitialMobileQuietDays();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if (PresentationSystem.DUMPINFO) {
            Log.d("Joe", "PresentUpdater initialQuietDays: " + i2);
            Log.d("Joe", "PresentUpdater curTimestamp: " + currentTimeMillis);
            Log.d("Joe", "PresentUpdater check: " + ((((long) i2) * 86400000) + firstUsedTime));
        }
        if (currentTimeMillis < (((long) i2) * 86400000) + firstUsedTime) {
            return false;
        }
        long lastCheckTime = PresentationSystem.getInstance().getHistoryManager().getLastCheckTime();
        long j = (long) (f * 8.64E7f);
        if (PresentationSystem.DUMPINFO) {
            Log.d("Joe", "PresentUpdater lastCheckTime: " + lastCheckTime + ", interval: " + j);
        }
        if (PresentationSystem.DUMPINFO) {
            Log.d("Joe", "PresentUpdater ns wifi: " + networkStatus.wifiConnected + ", mobile: " + networkStatus.mobileConnected);
        }
        if (i != 4) {
            meetNetwork = NetworkUtil.meetNetwork(networkStatus, i);
        } else if (networkStatus.wifiConnected) {
            meetNetwork = true;
        } else if (networkStatus.mobileConnected) {
            meetNetwork = true;
            j *= 3;
        } else {
            meetNetwork = false;
        }
        if (!meetNetwork || currentTimeMillis < lastCheckTime + j) {
            return false;
        }
        return true;
    }
}
