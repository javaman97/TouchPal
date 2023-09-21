package android.support.p001v4.content;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.content.p */
/* compiled from: ModernAsyncTask */
final class C0223p implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f579a = new AtomicInteger(1);

    C0223p() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ModernAsyncTask #" + this.f579a.getAndIncrement());
    }
}
