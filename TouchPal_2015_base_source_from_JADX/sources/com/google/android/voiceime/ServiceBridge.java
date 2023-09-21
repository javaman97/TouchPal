package com.google.android.voiceime;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.control.C2849W;
import com.emoji.keyboard.touchpal.R;
import com.google.android.voiceime.IntentApiTrigger;
import com.google.android.voiceime.ServiceHelper;

class ServiceBridge {
    private static final String TAG = "ServiceBridge";
    /* access modifiers changed from: private */
    public final IntentApiTrigger.Callback mCallback;

    public ServiceBridge() {
        this((IntentApiTrigger.Callback) null);
    }

    public ServiceBridge(IntentApiTrigger.Callback callback) {
        this.mCallback = callback;
    }

    public void startVoiceRecognition(final Context context, String str) {
        final ConnectionRequest connectionRequest = new ConnectionRequest(str);
        connectionRequest.setServiceCallback(new ServiceHelper.Callback() {
            public void onResult(String str) {
                ServiceBridge.this.mCallback.onRecognitionResult(str);
                try {
                    context.unbindService(connectionRequest);
                } catch (Exception e) {
                    C2849W a = C2849W.m13205a();
                    C1368X.m6320c();
                    a.mo9476a(C1974m.m9063a(C1368X.m6313b(), (int) R.string.vi_voice_typing_not_available));
                    e.printStackTrace();
                }
            }
        });
        context.bindService(new Intent(context, ServiceHelper.class), connectionRequest, 1);
    }

    public void notifyResult(Context context, String str) {
        context.bindService(new Intent(context, ServiceHelper.class), new ConnectionResponse(context, str), 1);
    }

    private class ConnectionRequest implements ServiceConnection {
        private final String mLanguageCode;
        private ServiceHelper.Callback mServiceCallback;

        private ConnectionRequest(String str) {
            this.mLanguageCode = str;
        }

        /* access modifiers changed from: private */
        public void setServiceCallback(ServiceHelper.Callback callback) {
            this.mServiceCallback = callback;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder instanceof ServiceHelper.ServiceHelperBinder) {
                ((ServiceHelper.ServiceHelperBinder) iBinder).getService().startRecognition(this.mLanguageCode, this.mServiceCallback);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private class ConnectionResponse implements ServiceConnection {
        private final Context mContext;
        private final String mRecognitionResult;

        private ConnectionResponse(Context context, String str) {
            this.mRecognitionResult = str;
            this.mContext = context;
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder instanceof ServiceHelper.ServiceHelperBinder) {
                ((ServiceHelper.ServiceHelperBinder) iBinder).getService().notifyResult(this.mRecognitionResult);
                this.mContext.unbindService(this);
            }
        }
    }
}
