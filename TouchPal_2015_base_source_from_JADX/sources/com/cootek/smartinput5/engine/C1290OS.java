package com.cootek.smartinput5.engine;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.cootek.smartinput5.engine.OS */
public class C1290OS extends Handler {
    private static int timer_id = 0;

    public long getTickCount() {
        return System.nanoTime();
    }

    public int startTimer(int i, int i2) {
        int i3 = timer_id;
        timer_id = i3 + 1;
        sendMessageDelayed(obtainMessage(i3, i, 0), (long) i2);
        return i3;
    }

    public void killTimer(int i) {
        removeMessages(i);
    }

    public void handleMessage(Message message) {
        Engine.getInstance().fireTimeOperation(message.what, message.arg1);
        Engine.getInstance().processEvent();
    }
}
