package com.cootek.smartinput5.plugin.messagepal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public class MessageReceiver extends BroadcastReceiver {
    static final String ACTION = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.plugin.messagepal.action.SEND";

    public void onReceive(Context context, Intent intent) {
        if (ACTION.equals(intent.getAction())) {
            new Handler().postDelayed(new C2388e(this, intent.getStringExtra("text")), 200);
        }
    }
}
