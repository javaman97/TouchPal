package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.common.a */
public class C3521a implements ServiceConnection {

    /* renamed from: A */
    private final BlockingQueue<IBinder> f15253A = new LinkedBlockingQueue();

    /* renamed from: z */
    boolean f15254z = false;

    /* renamed from: e */
    public IBinder mo10953e() throws InterruptedException {
        if (this.f15254z) {
            throw new IllegalStateException();
        }
        this.f15254z = true;
        return this.f15253A.take();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f15253A.put(iBinder);
        } catch (InterruptedException e) {
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
