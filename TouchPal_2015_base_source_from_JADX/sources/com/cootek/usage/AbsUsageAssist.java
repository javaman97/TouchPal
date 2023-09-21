package com.cootek.usage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class AbsUsageAssist {

    /* renamed from: a */
    private final String f14414a;

    /* renamed from: b */
    private final String f14415b;

    /* renamed from: c */
    private final String f14416c;

    /* renamed from: d */
    private final int f14417d;

    /* renamed from: e */
    private final String f14418e;

    /* renamed from: f */
    private final int f14419f;

    /* renamed from: g */
    private final int f14420g;

    /* renamed from: h */
    private final int f14421h;

    /* renamed from: a */
    static String m14559a() {
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA20-Yife_IVl-wfWptGEKOzAekD1OWM5rbF8WdDohHznBZPgrXS0mCnSA7Lg1Qs_R470y8IYeFtql6gU2HPi1aBDxDdbYGeJj8qA5VQD9KIsLijY1qmAXnhJKna88Eqoy9AJF8cC7qocTcZ5pyz64x3QFl8QNGbrjEKrjJR05i4lm5eECzGgqaQ_z2hEbGEChFR_dJtOXV2sSue8x-ZFi-UHCuCoHd2_4SOytSBipavSyB1Pt9a0RBOaz2627uuKSQrSpUXa8DFZDNUKIeiXoKYoGwaICVSRcexKoBLPUjcXRQHVKjTYo7GSmQsSNORq2taoLiN4o3ee9MkPpnLUWuwIDAQAB";
    }

    /* access modifiers changed from: protected */
    public long getAlarmInterval() {
        return 3600000;
    }

    /* access modifiers changed from: protected */
    public abstract Context getContext();

    /* access modifiers changed from: protected */
    public File getFolder() {
        if (getContext() == null) {
            throw new IllegalArgumentException("AbsUsageAssist.getContext() returns null");
        }
        File file = new File(getContext().getFilesDir(), "usage_folder");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* access modifiers changed from: protected */
    public int getHttpPort() {
        return 80;
    }

    /* access modifiers changed from: protected */
    public int getHttpTimeout() {
        return 30;
    }

    /* access modifiers changed from: protected */
    public int getInfoInterval(int i) {
        return -1;
    }

    /* access modifiers changed from: protected */
    public List getProxyAddress() {
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    public int getRetryTimes() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public String getServerAddress() {
        return "ws2.cootekservice.com";
    }

    /* access modifiers changed from: protected */
    public String getStrategyFileName() {
        return "usage_strategy.xml";
    }

    /* access modifiers changed from: protected */
    public abstract String getToken();

    /* access modifiers changed from: protected */
    public int getVersionCode() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public abstract boolean isDebugMode();

    /* access modifiers changed from: protected */
    public abstract void onStrategyUpdate(boolean z);

    /* access modifiers changed from: protected */
    public abstract void onTokenInvalid();
}
