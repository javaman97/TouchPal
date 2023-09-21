package com.cootek.smartinput5.engine;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ConcurrentHashMap;

public class OkinawaCallBackManager {
    public static final int CALLBACK_TYPE_COUNT = 1;
    private static final int[] CALLBACK_TYPE_LIST = {1};
    public static final int CALLBACK_TYPE_LOCAL_CLOUD_RESULT = 1;
    public static final long INVALID_CALLBACK_TOKEN = -1;
    private static final String TAG = "OkinawaCallBackManager";
    private static boolean mInitialized = false;
    private static OkinawaCallBackManager mInstance;
    ConcurrentHashMap<Integer, ICallBackHandler> mCallBackTokenMap;
    private Handler mMainThreadHandler;

    public interface ICallBackHandler {
        long applyCallBackToken();

        void discardCallBackToken();

        void handleCallBack(long j);
    }

    public static OkinawaCallBackManager getInstance() {
        if (mInstance != null) {
            return mInstance;
        }
        throw new IllegalArgumentException("Param InputMethodService is null.");
    }

    public static void initialize() {
        mInstance = new OkinawaCallBackManager();
        mInitialized = true;
    }

    public static void destory() {
        mInstance = null;
        mInitialized = false;
    }

    public static boolean isInitialized() {
        return mInitialized;
    }

    private OkinawaCallBackManager() {
        initCallBackHandler();
        initCallBackTokenMap();
    }

    private void initCallBackHandler() {
        this.mMainThreadHandler = new Handler() {
            public void handleMessage(Message message) {
                int i = message.arg1;
                ICallBackHandler iCallBackHandler = OkinawaCallBackManager.this.mCallBackTokenMap.get(Integer.valueOf(message.what));
                if (iCallBackHandler != null) {
                    iCallBackHandler.handleCallBack((long) i);
                }
            }
        };
    }

    private void initCallBackTokenMap() {
        this.mCallBackTokenMap = new ConcurrentHashMap<>();
        for (int i : CALLBACK_TYPE_LIST) {
            this.mCallBackTokenMap.put(Integer.valueOf(i), getCallBackHandler(i));
        }
    }

    public long applyCallBackToken(int i) {
        ICallBackHandler iCallBackHandler = this.mCallBackTokenMap.get(Integer.valueOf(i));
        if (iCallBackHandler != null) {
            return iCallBackHandler.applyCallBackToken();
        }
        return -1;
    }

    public long getGeneratedCallBackToken() {
        return (long) ((int) System.currentTimeMillis());
    }

    public void discardCallBackToken(int i) {
        ICallBackHandler iCallBackHandler = this.mCallBackTokenMap.get(Integer.valueOf(i));
        if (iCallBackHandler != null) {
            iCallBackHandler.discardCallBackToken();
        }
    }

    public void startCallBack(int i, long j) {
        switch (i) {
            case 1:
                completeLocalCloudSearchCallBack(j);
                return;
            default:
                return;
        }
    }

    public void completeLocalCloudSearchCallBack(long j) {
        Message obtainMessage = this.mMainThreadHandler.obtainMessage(1);
        obtainMessage.arg1 = (int) j;
        this.mMainThreadHandler.sendMessage(obtainMessage);
    }

    private ICallBackHandler getCallBackHandler(int i) {
        if (i == 1) {
            return new LocalCloudSearchCallBackHandler();
        }
        return null;
    }
}
