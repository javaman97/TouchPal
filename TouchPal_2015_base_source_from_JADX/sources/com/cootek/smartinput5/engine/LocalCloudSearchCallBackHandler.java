package com.cootek.smartinput5.engine;

import com.cootek.smartinput5.engine.OkinawaCallBackManager;

public class LocalCloudSearchCallBackHandler implements OkinawaCallBackManager.ICallBackHandler {
    private static final String TAG = "LocalCloudSearchCallBackHandler";
    private long mCallBackToken = -1;

    public long applyCallBackToken() {
        this.mCallBackToken = OkinawaCallBackManager.getInstance().getGeneratedCallBackToken();
        return this.mCallBackToken;
    }

    public void discardCallBackToken() {
        this.mCallBackToken = -1;
    }

    public void handleCallBack(long j) {
        if (isCallBackTokenValid(j)) {
            discardCallBackToken();
            Engine.getInstance().fireLocalCloudResultOperation();
            Engine.getInstance().processEvent();
        }
    }

    private boolean isCallBackTokenValid(long j) {
        return j != -1 && j == this.mCallBackToken;
    }
}
