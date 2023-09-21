package com.cootek.smartinput5.p066ui.settings;

import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.ui.settings.W */
/* compiled from: CloudBackupSyncSettingActivity */
class C2980W extends Handler {

    /* renamed from: a */
    final /* synthetic */ CloudBackupSyncSettingActivity f13800a;

    C2980W(CloudBackupSyncSettingActivity cloudBackupSyncSettingActivity) {
        this.f13800a = cloudBackupSyncSettingActivity;
    }

    public void handleMessage(Message message) {
        if (C1368X.m6324d()) {
            switch (message.what) {
                case 3:
                    this.f13800a.m13739d(message.getData());
                    return;
                default:
                    return;
            }
        }
    }
}
