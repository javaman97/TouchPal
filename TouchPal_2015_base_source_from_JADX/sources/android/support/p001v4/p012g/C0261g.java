package android.support.p001v4.p012g;

import android.net.TrafficStats;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: android.support.v4.g.g */
/* compiled from: TrafficStatsCompatIcs */
class C0261g {
    C0261g() {
    }

    /* renamed from: a */
    public static void m1043a() {
        TrafficStats.clearThreadStatsTag();
    }

    /* renamed from: b */
    public static int m1047b() {
        return TrafficStats.getThreadStatsTag();
    }

    /* renamed from: a */
    public static void m1044a(int i) {
        TrafficStats.incrementOperationCount(i);
    }

    /* renamed from: a */
    public static void m1045a(int i, int i2) {
        TrafficStats.incrementOperationCount(i, i2);
    }

    /* renamed from: b */
    public static void m1048b(int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    /* renamed from: a */
    public static void m1046a(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    /* renamed from: b */
    public static void m1049b(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
