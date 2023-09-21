package p018cn.sharesdk.framework.utils;

import android.os.Handler;
import android.os.Message;

/* renamed from: cn.sharesdk.framework.utils.i */
final class C0675i implements Handler.Callback {
    C0675i() {
    }

    public boolean handleMessage(Message message) {
        UIHandler.handleMessage(message);
        return false;
    }
}
