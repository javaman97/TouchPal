package com.cootek.smartinput5.presentations;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.cootek.smartinput5.func.C1368X;

public class BindService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onStart(Intent intent, int i) {
        start();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        start();
        return 1;
    }

    private void start() {
        try {
            C1368X.m6291a((Context) this, false);
            if (C2515q.m11248a()) {
                C2515q.m11251b().mo8316c();
            }
        } catch (Exception e) {
        }
    }
}
