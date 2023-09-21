package com.google.android.voiceime;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.cootek.smartinput5.engine.Engine;

public class ServiceHelper extends Service {
    private static final String TAG = "ServiceHelper";
    private final IBinder mBinder = new ServiceHelperBinder();
    private Callback mCallback;

    public interface Callback {
        void onResult(String str);
    }

    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "#onCreate");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "#onDestroy");
    }

    public void startRecognition(String str, Callback callback) {
        Log.i(TAG, "#startRecognition");
        this.mCallback = callback;
        Intent intent = new Intent(this, ActivityHelper.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        startActivity(intent);
    }

    public void notifyResult(String str) {
        if (this.mCallback != null) {
            this.mCallback.onResult(str);
        }
    }

    public class ServiceHelperBinder extends Binder {
        public ServiceHelperBinder() {
        }

        /* access modifiers changed from: package-private */
        public ServiceHelper getService() {
            return ServiceHelper.this;
        }
    }
}
