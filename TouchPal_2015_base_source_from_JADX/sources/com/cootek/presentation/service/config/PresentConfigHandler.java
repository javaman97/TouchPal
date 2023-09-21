package com.cootek.presentation.service.config;

import android.os.HandlerThread;

public class PresentConfigHandler {
    private static final String TAG = "PresentConfigHandler";
    static HandlerThread sThread = new HandlerThread(TAG);

    static {
        if (sThread == null) {
            sThread.start();
        }
    }
}
