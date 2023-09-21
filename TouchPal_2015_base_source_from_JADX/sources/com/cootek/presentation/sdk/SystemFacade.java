package com.cootek.presentation.sdk;

public class SystemFacade {
    private static long currentTime = System.currentTimeMillis();
    private static boolean enableTestMode = false;

    public static void setCurrentTimeMillis(long j) {
        currentTime = j;
    }

    public static void setTimeFake(boolean z) {
        enableTestMode = z;
    }

    public static long currentTimeMillis() {
        return enableTestMode ? currentTime : System.currentTimeMillis();
    }
}
