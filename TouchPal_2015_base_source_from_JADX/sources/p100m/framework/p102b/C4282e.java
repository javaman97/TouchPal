package p100m.framework.p102b;

import android.os.Handler;
import android.os.Message;

/* renamed from: m.framework.b.e */
/* compiled from: UIHandler */
public class C4282e {

    /* renamed from: a */
    private static Handler f17443a;

    /* renamed from: a */
    public static void m17925a() {
        if (f17443a == null) {
            f17443a = new Handler(new C4283f());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17932b(Message message) {
        Object[] objArr = (Object[]) message.obj;
        Message message2 = (Message) objArr[0];
        Handler.Callback callback = (Handler.Callback) objArr[1];
        if (callback != null) {
            callback.handleMessage(message2);
        }
    }

    /* renamed from: c */
    private static Message m17936c(Message message, Handler.Callback callback) {
        Message message2 = new Message();
        message2.obj = new Object[]{message, callback};
        return message2;
    }

    /* renamed from: b */
    private static Message m17931b(int i, Handler.Callback callback) {
        Message message = new Message();
        message.what = i;
        return m17936c(message, callback);
    }

    /* renamed from: a */
    public static boolean m17930a(Message message, Handler.Callback callback) {
        return f17443a.sendMessage(m17936c(message, callback));
    }

    /* renamed from: a */
    public static boolean m17929a(Message message, long j, Handler.Callback callback) {
        return f17443a.sendMessageDelayed(m17936c(message, callback), j);
    }

    /* renamed from: b */
    public static boolean m17934b(Message message, long j, Handler.Callback callback) {
        return f17443a.sendMessageAtTime(m17936c(message, callback), j);
    }

    /* renamed from: b */
    public static boolean m17935b(Message message, Handler.Callback callback) {
        return f17443a.sendMessageAtFrontOfQueue(m17936c(message, callback));
    }

    /* renamed from: a */
    public static boolean m17928a(int i, Handler.Callback callback) {
        return f17443a.sendMessage(m17931b(i, callback));
    }

    /* renamed from: a */
    public static boolean m17927a(int i, long j, Handler.Callback callback) {
        return f17443a.sendMessageAtTime(m17931b(i, callback), j);
    }

    /* renamed from: b */
    public static boolean m17933b(int i, long j, Handler.Callback callback) {
        return f17443a.sendMessageDelayed(m17931b(i, callback), j);
    }
}
