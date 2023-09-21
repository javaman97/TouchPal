package com.baidu.pcs;

public abstract class BaiduPCSStatusListener {
    public abstract void onProgress(long j, long j2);

    public long progressInterval() {
        return 200;
    }

    public boolean toContinue() {
        return true;
    }
}
