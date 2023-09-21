package com.cootek.smartinput5.func;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.asset.LoadFailedActivity;

/* renamed from: com.cootek.smartinput5.func.bP */
/* compiled from: Utils */
final class C1591bP extends Handler {
    C1591bP(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 0 && C1584bI.f5018m != null) {
            Intent intent = new Intent();
            intent.setClass(C1584bI.f5018m, LoadFailedActivity.class);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            try {
                C1584bI.f5018m.startActivity(intent);
            } catch (ActivityNotFoundException e) {
            }
        }
    }
}
