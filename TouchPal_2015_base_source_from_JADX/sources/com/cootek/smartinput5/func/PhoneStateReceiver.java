package com.cootek.smartinput5.func;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.cootek.smartinput5.engine.Engine;

public class PhoneStateReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        switch (((TelephonyManager) context.getSystemService("phone")).getCallState()) {
            case 1:
                hideInputMethod();
                return;
            default:
                return;
        }
    }

    private void hideInputMethod() {
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
    }
}
