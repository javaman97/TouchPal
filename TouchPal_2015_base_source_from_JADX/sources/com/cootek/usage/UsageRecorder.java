package com.cootek.usage;

import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class UsageRecorder {

    /* renamed from: a */
    static AbsUsageAssist f14422a = null;

    /* renamed from: b */
    private static volatile C3301p f14423b = null;

    /* renamed from: c */
    private static final String f14424c = "single_key";

    /* renamed from: d */
    private static final String f14425d = "timestamp";

    /* renamed from: e */
    private static final int f14426e = 1;

    /* renamed from: f */
    private static final int f14427f = 2;

    /* renamed from: g */
    private static final int f14428g = 3;

    /* renamed from: a */
    private static void m14560a(AbsUsageAssist absUsageAssist) {
        if (absUsageAssist.getContext() == null) {
            throw new IllegalArgumentException("Context should not be null");
        }
        m14561a(absUsageAssist.getServerAddress(), 3);
        if (absUsageAssist.getHttpPort() <= 0 || absUsageAssist.getHttpPort() > 65535) {
            throw new IllegalArgumentException("Http port invalid");
        } else if (absUsageAssist.getHttpTimeout() <= 0) {
            throw new IllegalArgumentException("Http timeout invalid");
        } else if (absUsageAssist.getRetryTimes() <= 0) {
            throw new IllegalArgumentException("Http retry times invalid");
        } else if (!absUsageAssist.getFolder().exists()) {
            throw new IllegalArgumentException("Folder not exists.");
        } else if (absUsageAssist.getStrategyFileName() == null) {
            throw new IllegalArgumentException("Strategy file name should not be null.");
        } else if (absUsageAssist.getAlarmInterval() < 1) {
            throw new IllegalArgumentException("AlarmInterval invalid.");
        } else if (absUsageAssist.getProxyAddress() == null) {
            throw new IllegalArgumentException("ProxyAddress should be empty list rather than null.");
        }
    }

    /* renamed from: a */
    private static void m14561a(String str, int i) {
        String str2 = null;
        switch (i) {
            case 1:
                str2 = "[a-zA-Z0-9_]*";
                break;
            case 2:
                str2 = "[a-zA-Z0-9_/.]*";
                break;
            case 3:
                str2 = "[a-zA-Z0-9./-]*";
                break;
        }
        if (!str.matches(str2) || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("name \"" + str + "\" invalid");
        }
    }

    /* renamed from: a */
    private static void m14562a(Map map) {
        for (String str : map.keySet()) {
            if (str == null) {
                throw new IllegalArgumentException("The key in values is illegal. Keys in map should not be null.");
            }
        }
    }

    /* renamed from: a */
    static boolean m14563a() {
        return f14422a != null;
    }

    /* renamed from: b */
    static boolean m14564b() {
        return f14422a.isDebugMode();
    }

    /* renamed from: c */
    private static C3301p m14565c() {
        if (f14423b == null) {
            synchronized (UsageRecorder.class) {
                if (f14423b == null) {
                    if (f14422a == null) {
                        throw new IllegalStateException("UsageRecorder is not initialized.");
                    }
                    f14423b = new C3301p(f14422a);
                }
            }
        }
        return f14423b;
    }

    public static void initialize(AbsUsageAssist absUsageAssist) {
        if (absUsageAssist == null) {
            throw new IllegalArgumentException("UsageRecorder can't initialize with a null assist.");
        } else if (absUsageAssist.getContext() == null) {
            throw new IllegalArgumentException("Context should not be null");
        } else {
            m14561a(absUsageAssist.getServerAddress(), 3);
            if (absUsageAssist.getHttpPort() <= 0 || absUsageAssist.getHttpPort() > 65535) {
                throw new IllegalArgumentException("Http port invalid");
            } else if (absUsageAssist.getHttpTimeout() <= 0) {
                throw new IllegalArgumentException("Http timeout invalid");
            } else if (absUsageAssist.getRetryTimes() <= 0) {
                throw new IllegalArgumentException("Http retry times invalid");
            } else if (!absUsageAssist.getFolder().exists()) {
                throw new IllegalArgumentException("Folder not exists.");
            } else if (absUsageAssist.getStrategyFileName() == null) {
                throw new IllegalArgumentException("Strategy file name should not be null.");
            } else if (absUsageAssist.getAlarmInterval() < 1) {
                throw new IllegalArgumentException("AlarmInterval invalid.");
            } else if (absUsageAssist.getProxyAddress() == null) {
                throw new IllegalArgumentException("ProxyAddress should be empty list rather than null.");
            } else {
                f14422a = absUsageAssist;
            }
        }
    }

    public static void record(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(f14424c, str3);
        record(str, str2, (Map) hashMap);
    }

    public static void record(String str, String str2, Map map) {
        m14561a(str, 1);
        m14561a(str2, 2);
        map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        for (String str3 : map.keySet()) {
            if (str3 == null) {
                throw new IllegalArgumentException("The key in values is illegal. Keys in map should not be null.");
            }
        }
        m14565c().mo10512a(str, str2, map);
    }

    public static void send() {
        m14565c().mo10510a();
        m14565c().mo10513b();
    }

    public static void updateStrategyFile(File file) {
        m14565c().mo10511a(file);
    }
}
