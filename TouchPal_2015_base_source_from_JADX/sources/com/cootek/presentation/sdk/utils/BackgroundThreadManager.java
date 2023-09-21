package com.cootek.presentation.sdk.utils;

import android.util.Log;
import com.cootek.presentation.service.PresentationSystem;
import java.util.HashSet;

public class BackgroundThreadManager {
    private static final String TAG = "BackgroundThreadManager";
    private static BackgroundThreadManager sIns = new BackgroundThreadManager();
    /* access modifiers changed from: private */
    public HashSet<String> mRunningThreads = new HashSet<>();

    private BackgroundThreadManager() {
    }

    public static BackgroundThreadManager getIns() {
        return sIns;
    }

    public synchronized boolean startDownloadThread(String str, Runnable runnable) {
        boolean z;
        z = false;
        if (runnable != null) {
            if (canStartThread(str)) {
                doStartThread(str, runnable);
                z = true;
            }
        }
        if (PresentationSystem.DUMPINFO) {
            Log.d(TAG, "startDownloadThread tag: " + str + " ret: " + z);
        }
        return z;
    }

    private boolean canStartThread(String str) {
        if (str == null || this.mRunningThreads.contains(str)) {
            return false;
        }
        return true;
    }

    private void doStartThread(final String str, final Runnable runnable) {
        this.mRunningThreads.add(str);
        try {
            new Thread(new Runnable() {
                public void run() {
                    runnable.run();
                    BackgroundThreadManager.this.mRunningThreads.remove(str);
                    if (PresentationSystem.DUMPINFO) {
                        Log.d(BackgroundThreadManager.TAG, "thread: " + str + " finished!");
                    }
                }
            }).start();
        } catch (IllegalThreadStateException e) {
            this.mRunningThreads.remove(str);
        }
    }
}
