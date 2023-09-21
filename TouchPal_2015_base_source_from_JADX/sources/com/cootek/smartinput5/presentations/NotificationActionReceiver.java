package com.cootek.smartinput5.presentations;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.func.C1368X;

public class NotificationActionReceiver extends BroadcastReceiver {
    private static final String TAG = "NotificationActionReceiver";

    public void onReceive(Context context, Intent intent) {
        if (C1368X.m6324d()) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra(C2515q.f10828a);
            if (C2515q.f10840m.equals(action)) {
                if (C2515q.m11248a()) {
                    C2515q.m11251b().mo8319d(stringExtra);
                }
            } else if (C2515q.f10841n.equals(action) && C2515q.m11248a()) {
                C2515q.m11251b().mo8321e(stringExtra);
            }
        }
    }
}
