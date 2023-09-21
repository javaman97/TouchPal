package com.cootek.smartinput5.presentations;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.asset.C1451h;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.cmd.C2268c;

public class ActionCallbackReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            handleBroadCast(context, intent);
        } catch (C1451h e) {
        }
    }

    private void handleBroadCast(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(PresentationManager.INTENT_ACTION_START_WORK) || action.equals(PresentationManager.INTENT_ACITON_CONFIG_UPDATE)) {
            context.startService(new Intent(context, BindService.class));
        } else if (action.equals(PresentationManager.INTENT_ACTION_REFRESH_TOKEN)) {
            PresentationManager.setAuthToken(C2188Q.m9853a().mo7683c());
            C2209a.m9956a().mo7727a(context, C2209a.C2210a.DIRECTLY, true, C2268c.C2269a.ACR);
        } else if (action.equals(PresentationManager.INTENT_ACTION_NEED_TOKEN)) {
            PresentationManager.setAuthToken(C2188Q.m9853a().mo7683c());
        } else if (action.equals(PresentationManager.INTENT_ACTION_CHECK_STATUS_TOAST)) {
            if (!C1368X.m6324d()) {
                C1368X.m6291a(context, false);
            }
            if (C2515q.m11248a()) {
                C2515q.m11251b().mo8325h();
            }
        } else if (action.equals(PresentationManager.INTENT_ACTION_CHECK_DUMMY_TOAST)) {
            if (C2515q.m11248a()) {
                C2515q.m11251b().mo8326i();
            }
        } else if (action.equals(PresentationManager.INTENT_ACTION_MESSAGE_READY) && C2515q.m11248a()) {
            C2515q.m11251b().mo8327j();
        }
        doInBackground(context);
    }

    private void doInBackground(Context context) {
        processNotDefaultIme(context);
    }

    private void processNotDefaultIme(Context context) {
        if (!(C1584bI.m7149c(context) && C1584bI.m7153f(context))) {
            if (!C1368X.m6324d()) {
                C1368X.m6291a(context, false);
            }
            C1368X.m6290a(context);
        }
    }
}
