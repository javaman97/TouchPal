package com.iflytek.speech;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.InitListener;
import com.iflytek.speech.aidl.ITextUnderstander;

public class TextUnderstanderAidl extends SpeechModuleAidl<ITextUnderstander> {
    public static final String SCENE = "scene";
    private static final String TEXT = "text";

    public TextUnderstanderAidl(Context context, InitListener initListener) {
        super(context, initListener, UtilityConfig.ACTION_TEXT_UNDERSTANDER);
    }

    public int cancel(TextUnderstanderListener textUnderstanderListener) {
        if (this.mService == null) {
            return ErrorCode.ERROR_ENGINE_INIT_FAIL;
        }
        if (textUnderstanderListener == null) {
            return ErrorCode.ERROR_INVALID_PARAM;
        }
        try {
            ((ITextUnderstander) this.mService).cancel(textUnderstanderListener);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return ErrorCode.ERROR_ENGINE_CALL_FAIL;
        }
    }

    public /* bridge */ /* synthetic */ boolean destory() {
        return super.destory();
    }

    public /* bridge */ /* synthetic */ Intent getIntent() {
        return super.getIntent();
    }

    public String getParameter(String str) {
        return super.getParameter(str);
    }

    public /* bridge */ /* synthetic */ boolean isActionInstalled(Context context, String str) {
        return super.isActionInstalled(context, str);
    }

    public /* bridge */ /* synthetic */ boolean isAvailable() {
        return super.isAvailable();
    }

    public boolean isUnderstanding() {
        try {
            if (this.mService != null) {
                return ((ITextUnderstander) this.mService).isUnderstanding();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int setParameter(String str, String str2) {
        return super.setParameter(str, str2);
    }

    public int understandText(String str, TextUnderstanderListener textUnderstanderListener) {
        if (this.mService == null) {
            return ErrorCode.ERROR_ENGINE_INIT_FAIL;
        }
        if (textUnderstanderListener == null) {
            return ErrorCode.ERROR_INVALID_PARAM;
        }
        try {
            Intent intent = getIntent();
            intent.putExtra("text", str);
            ((ITextUnderstander) this.mService).understandText(intent, textUnderstanderListener);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return ErrorCode.ERROR_ENGINE_CALL_FAIL;
        }
    }
}
