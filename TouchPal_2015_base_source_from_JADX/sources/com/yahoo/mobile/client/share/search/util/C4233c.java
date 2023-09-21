package com.yahoo.mobile.client.share.search.util;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yahoo.mobile.client.share.search.util.c */
public final class C4233c {

    /* renamed from: a */
    private static ThreadPoolExecutor f17326a = new ThreadPoolExecutor(2, 4, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            runnable.run();
        }
    });

    /* renamed from: b */
    private static ThreadPoolExecutor f17327b = new ThreadPoolExecutor(2, 4, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            runnable.run();
        }
    });

    /* renamed from: c */
    private static ThreadPoolExecutor f17328c = new ThreadPoolExecutor(2, 4, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            runnable.run();
        }
    });

    /* renamed from: d */
    private static ThreadPoolExecutor f17329d = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            runnable.run();
        }
    });

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static <P, T extends AsyncTask<P, ?, ?>> void m17757a(T t, P... pArr) {
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                t.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, pArr);
            } catch (RejectedExecutionException e) {
                e.printStackTrace();
            }
        } else {
            t.execute(pArr);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static <P, T extends AsyncTask<P, ?, ?>> void m17758b(T t, P... pArr) {
        if (Build.VERSION.SDK_INT >= 11) {
            t.executeOnExecutor(f17328c, pArr);
            new StringBuilder("Task added to UI pool (").append(f17328c.getActiveCount()).append(" active threads).");
            return;
        }
        t.execute(pArr);
    }

    /* renamed from: c */
    public static <P, T extends AsyncTask<P, ?, ?>> void m17759c(T t, P... pArr) {
        if (Build.VERSION.SDK_INT >= 11) {
            t.executeOnExecutor(f17329d, pArr);
            new StringBuilder("Task added to DB pool (").append(f17329d.getActiveCount()).append(" active threads).");
            return;
        }
        t.execute(pArr);
    }
}
