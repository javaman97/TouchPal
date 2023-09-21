package com.cootek.smartinput5.daemon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DaemonReceiver extends BroadcastReceiver {
    private static final String ACTION_SOCKET_SETUP = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.SOCKET_SETUP";
    private static final String TAG = "DaemonReceiver";

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ACTION_SOCKET_SETUP) && DaemonManager.m6044c()) {
            DaemonManager.onSocketSetup();
        }
    }
}
