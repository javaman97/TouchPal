package p018cn.sharesdk.framework.utils;

import android.os.Handler;
import android.os.Message;

/* renamed from: cn.sharesdk.framework.utils.UIHandler */
public class UIHandler {
    private static Handler handler;

    private static Message getShellMessage(int i, Handler.Callback callback) {
        Message message = new Message();
        message.what = i;
        return getShellMessage(message, callback);
    }

    private static Message getShellMessage(Message message, Handler.Callback callback) {
        Message message2 = new Message();
        message2.obj = new Object[]{message, callback};
        return message2;
    }

    /* access modifiers changed from: private */
    public static void handleMessage(Message message) {
        Object[] objArr = (Object[]) message.obj;
        Message message2 = (Message) objArr[0];
        Handler.Callback callback = (Handler.Callback) objArr[1];
        if (callback != null) {
            callback.handleMessage(message2);
        }
    }

    public static void prepare() {
        if (handler == null) {
            handler = new Handler(new C0675i());
        }
    }

    public static boolean sendEmptyMessage(int i, Handler.Callback callback) {
        return handler.sendMessage(getShellMessage(i, callback));
    }

    public static boolean sendEmptyMessageAtTime(int i, long j, Handler.Callback callback) {
        return handler.sendMessageAtTime(getShellMessage(i, callback), j);
    }

    public static boolean sendEmptyMessageDelayed(int i, long j, Handler.Callback callback) {
        return handler.sendMessageDelayed(getShellMessage(i, callback), j);
    }

    public static boolean sendMessage(Message message, Handler.Callback callback) {
        return handler.sendMessage(getShellMessage(message, callback));
    }

    public static boolean sendMessageAtFrontOfQueue(Message message, Handler.Callback callback) {
        return handler.sendMessageAtFrontOfQueue(getShellMessage(message, callback));
    }

    public static boolean sendMessageAtTime(Message message, long j, Handler.Callback callback) {
        return handler.sendMessageAtTime(getShellMessage(message, callback), j);
    }

    public static boolean sendMessageDelayed(Message message, long j, Handler.Callback callback) {
        return handler.sendMessageDelayed(getShellMessage(message, callback), j);
    }
}
