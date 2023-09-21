package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class TestReciever extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.i(AppsFlyerLib.LOG_TAG, "test dummy receiver - in onReceive");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
