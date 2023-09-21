package com.cootek.smartinput5.engine;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.smartinput5.action.ParcelableAction;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.p066ui.settings.InvitationDialog;
import com.cootek.smartinput5.presentations.C2515q;

public class IPCManager {
    public static final int ACTION_ATTACHED_PACKAGE_CHANGED = 10;
    public static final int ACTION_CLEAR_PRESENTATION_TOAST = 4;
    public static final int ACTION_COLLECT_DATA = 1;
    public static final int ACTION_DISABLE_INVITATION_DIALOG_FOR_TEMP = 8;
    public static final int ACTION_DOWNLOAD_APK = 5;
    public static final int ACTION_INIT_OKINAWA = 6;
    public static final int ACTION_MISSION_STATE_CHANGED = 11;
    public static final int ACTION_PARCELABLE = 9;
    public static final int ACTION_RELEASE_OKINAWA = 7;
    public static final int ACTION_SET_SKIN = 3;
    public static final int ACTION_SKIN_REMOVED = 2;
    public static final int ACTION_TYPE_NONE = 0;
    private static final int DELAY_SEND_MESSAGE_TIME = 500;
    public static final String DOWNLOADED_PACKAGE_LIST = "downloaded_package_list";
    public static final String EXTRA_ACTION_TYPE = "extra_action_type";
    private static final int LOCAL_MSG_DELAY_SEND_MESSAGE = 1;
    public static final int MSG_APK_DOWNLOADED = 5;
    public static final int MSG_APK_INSTALLED = 6;
    public static final int MSG_BATCH_DOWNLOAD_FINISHED = 15;
    public static final int MSG_DO_EXTRAL_ACTION = 4;
    public static final int MSG_ENTER_ONLINE_SHOP = 17;
    public static final int MSG_GOODS_UPDATE = 10;
    public static final int MSG_GOODS_UPDATED = 11;
    public static final int MSG_HOTWORD_UPDATED = 12;
    public static final int MSG_MEDIA_EJECT = 13;
    public static final int MSG_MEDIA_MOUNTED = 14;
    public static final int MSG_NOTIFY_OTHER_PROCESS = 7;
    public static final int MSG_REGISTER_CLIENT = 1;
    public static final int MSG_SAFE_MASK = 256;
    public static final int MSG_SETTINGS_CHANGED = 3;
    public static final int MSG_SHARE_MESSAGE_CALLBACK = 9;
    public static final int MSG_SKIN_DOWNLOADED = 8;
    public static final int MSG_SKIN_DOWNLOAD_QUERY = 16;
    public static final int MSG_SKIN_UPDATE_STATE_CHANGED = 18;
    public static final int MSG_UNREGISTER_CLIENT = 2;
    public static String SETTING_CATEGORY_TYPE = "setting_category_type";
    public static String SETTING_CATEGORY_VALUE = "setting_category_value";
    public static String SETTING_CONFIG = "setting_config";
    public static String SETTING_FIRE_CHANGED = "setting_fire_changed";
    public static String SETTING_KEY = "setting_key";
    public static String SETTING_TYPE = "setting_type";
    public static final int SETTING_TYPE_BOOLEAN = 3;
    public static final int SETTING_TYPE_ERROR = 0;
    public static final int SETTING_TYPE_INT = 1;
    public static final int SETTING_TYPE_LONG = 4;
    public static final int SETTING_TYPE_STRING = 2;
    public static String SETTING_VALUE = "setting_value";
    public static final String SKIN_DISPLAY_NAME = "skin_display_name";
    public static final String SKIN_PACKAGE_NAME = "skin_package_name";
    public static final String SKIN_PACKAGE_URL = "skin_package_url";
    public static final String SKIN_REMOVED_PACKAGE_NAME = "skin_removed_package_name";
    public static final String SKIN_SETTINGS_NAME = "skin_setting_name";
    public static final String UPGRADING_SKIN_LIST = "upgrading_skin_list";
    public static final String WHAT_NOTIFY_OTHER_PROCESS = "what";
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceDisconnected(ComponentName componentName) {
            Messenger unused = IPCManager.this.mService = null;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Messenger unused = IPCManager.this.mService = new Messenger(iBinder);
        }
    };
    private Context mContext;
    private Handler mHandler = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    try {
                        IPCManager.this.sendMessage((Message) message.obj);
                        return;
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        return;
                    }
                default:
                    return;
            }
        }
    };
    private boolean mIsBound = false;
    /* access modifiers changed from: private */
    public Messenger mService = null;

    public IPCManager(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void bindService() {
        if (this.mService == null) {
            this.mIsBound = this.mContext.bindService(new Intent(this.mContext, SettingsService.class), this.mConnection, 1);
        }
    }

    public void destroy() {
        unBindService();
    }

    private void unBindService() {
        if (this.mIsBound) {
            this.mContext.unbindService(this.mConnection);
            this.mIsBound = false;
        }
    }

    public void sendMessage(Message message) throws RemoteException {
        if (this.mService == null) {
            if (!this.mIsBound) {
                bindService();
            }
            Message obtainMessage = this.mHandler.obtainMessage(1);
            obtainMessage.obj = message;
            this.mHandler.sendMessageDelayed(obtainMessage, 500);
            return;
        }
        this.mService.send(message);
    }

    public void sendMessageForParcelableAction(ParcelableAction parcelableAction) throws RemoteException {
        Message obtain = Message.obtain((Handler) null, 4);
        Bundle bundle = new Bundle();
        bundle.putInt(EXTRA_ACTION_TYPE, 9);
        bundle.putParcelable(ParcelableAction.f3123d, parcelableAction);
        obtain.setData(bundle);
        sendMessage(obtain);
    }

    public void notifyOtherProcesses(Message message) {
        SettingsService.notifyClients(message);
    }

    public void handleSettingsChanged(Bundle bundle) {
        int i;
        if (bundle != null && (i = bundle.getInt(SETTING_KEY, -1)) != -1) {
            int i2 = bundle.getInt(SETTING_CATEGORY_TYPE, -1);
            String string = bundle.getString(SETTING_CATEGORY_VALUE);
            boolean z = bundle.getBoolean(SETTING_FIRE_CHANGED, true);
            Config config = null;
            int i3 = bundle.getInt(SETTING_CONFIG, -1);
            if (i3 != -1) {
                config = new Config(i3);
            }
            switch (bundle.getInt(SETTING_TYPE, 0)) {
                case 1:
                    int i4 = bundle.getInt(SETTING_VALUE, -1);
                    if (i4 != -1) {
                        Settings.getInstance().setIntSetting(i, i4, i2, string, config, z);
                        return;
                    }
                    return;
                case 2:
                    String string2 = bundle.getString(SETTING_VALUE);
                    if (TextUtils.isEmpty(string2)) {
                        return;
                    }
                    if (i == 88) {
                        C2188Q.m9853a().mo7680a(string2);
                        return;
                    }
                    Settings.getInstance().setStringSetting(i, string2, i2, string, config, z);
                    if (i == 270) {
                        C1617br.m7367a().mo6339f();
                        return;
                    }
                    return;
                case 3:
                    Settings.getInstance().setBoolSetting(i, bundle.getBoolean(SETTING_VALUE, false), i2, string, config, z);
                    return;
                case 4:
                    Settings.getInstance().setLongSetting(i, bundle.getLong(SETTING_VALUE, 0), i2, string, config, z);
                    return;
                default:
                    return;
            }
        }
    }

    public void handleExtralAction(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C1368X.class.getClassLoader());
            switch (bundle.getInt(EXTRA_ACTION_TYPE, 0)) {
                case 2:
                    skinRemoved(bundle);
                    return;
                case 3:
                    setSkin(bundle);
                    return;
                case 4:
                    clearPresentationToast(bundle);
                    return;
                case 5:
                    downloadApk(bundle);
                    return;
                case 6:
                    C1368X.m6320c().mo5835h().init();
                    return;
                case 7:
                    if (Engine.isInitialized()) {
                        C1368X.m6320c().mo5835h().release();
                        return;
                    }
                    return;
                case 8:
                    disableInvitationDialogForTemp(bundle);
                    return;
                case 9:
                    handleParcelableAction(bundle);
                    return;
                default:
                    return;
            }
        }
    }

    private void handleParcelableAction(Bundle bundle) {
        ParcelableAction parcelableAction = (ParcelableAction) bundle.getParcelable(ParcelableAction.f3123d);
        if (parcelableAction != null) {
            parcelableAction.run();
        }
    }

    private void disableInvitationDialogForTemp(Bundle bundle) {
        if (bundle.getBoolean(InvitationDialog.f13460e, true)) {
            InvitationDialog.f13461f = false;
        } else {
            InvitationDialog.f13461f = true;
        }
    }

    private void downloadApk(Bundle bundle) {
        Intent a = C2515q.m11245a(this.mContext, bundle.getString(C2515q.f10829b), bundle.getString(C2515q.f10835h), bundle.getString(C2515q.f10830c), bundle.getBoolean(C2515q.f10832e, false), bundle.getBoolean(C2515q.f10838k, false), bundle.getBoolean(C2515q.f10839l, false), bundle.getBoolean(C2515q.f10837j, false));
        if (a != null) {
            try {
                this.mContext.startActivity(a);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void clearPresentationToast(Bundle bundle) {
        int i = bundle.getInt(C2515q.f10831d);
        String string = bundle.getString(C2515q.f10829b);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (i == 1) {
            PresentationManager.webPageOpened(string);
        } else if (i == 2) {
            PresentationManager.webPageLoaded(string);
        }
    }

    private void setSkin(Bundle bundle) {
        String string = bundle.getString(SKIN_SETTINGS_NAME);
        if (!TextUtils.isEmpty(string)) {
            C1368X.m6320c().mo5841n().mo6259a(string, true, true, true);
        }
    }

    private void skinRemoved(Bundle bundle) {
        String string = bundle.getString(SKIN_REMOVED_PACKAGE_NAME);
        if (!TextUtils.isEmpty(string)) {
            C1368X.m6320c().mo5841n().mo5951j(string);
        }
    }
}
