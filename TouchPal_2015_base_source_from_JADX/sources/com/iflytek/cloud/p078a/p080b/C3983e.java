package com.iflytek.cloud.p078a.p080b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;
import com.iflytek.cloud.p078a.p082d.C3992b;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;

/* renamed from: com.iflytek.cloud.a.b.e */
public abstract class C3983e extends C3981d {
    /* access modifiers changed from: protected */

    /* renamed from: a */
    public Context f16310a = null;

    /* renamed from: c */
    protected Object f16311c = new Object();
    /* access modifiers changed from: protected */

    /* renamed from: d */
    public volatile C3976a f16312d = null;

    /* renamed from: e */
    protected volatile HandlerThread f16313e = null;

    /* renamed from: com.iflytek.cloud.a.b.e$a */
    protected class C3984a implements SpeechListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public SpeechListener f16315b = null;

        /* renamed from: c */
        private Handler f16316c = new C3985f(this, Looper.getMainLooper());

        public C3984a(SpeechListener speechListener) {
            this.f16315b = speechListener;
        }

        public void onCompleted(SpeechError speechError) {
            this.f16316c.sendMessage(this.f16316c.obtainMessage(2, speechError));
        }

        public void onData(byte[] bArr) {
            this.f16316c.sendMessage(this.f16316c.obtainMessage(1, bArr));
        }

        public void onEvent(int i, Bundle bundle) {
            this.f16316c.sendMessage(this.f16316c.obtainMessage(0, i, 0, bundle));
        }
    }

    protected C3983e(Context context) {
        if (context != null) {
            C3992b.m17035a(context.getApplicationContext());
            this.f16310a = context.getApplicationContext();
            try {
                mo14685b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.f16310a = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HandlerThread mo14684a(String str) {
        this.f16313e = new HandlerThread(str);
        this.f16313e.start();
        return this.f16313e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14578a() {
        if (this.f16313e == null || !this.f16313e.isAlive()) {
            return true;
        }
        HandlerThread handlerThread = this.f16313e;
        this.f16313e = null;
        handlerThread.interrupt();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14685b() throws Exception {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo14686c() {
        return getClass().toString();
    }

    public void cancel(boolean z) {
        if (this.f16312d != null) {
            this.f16312d.mo14643b(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo14688d() {
        return this.f16312d != null && this.f16312d.mo14672r();
    }

    public boolean destroy() {
        boolean z = false;
        synchronized (this.f16311c) {
            if (mo14688d()) {
                this.f16312d.mo14643b(false);
            } else {
                z = mo14578a();
                C3990a.m17033c(mo14686c() + "destory =" + z);
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        C3990a.m17030a(mo14686c() + " finalize called");
        super.finalize();
    }

    public int getSampleRate() {
        return this.f16305b.mo14705a(SpeechConstant.SAMPLE_RATE, (int) ErrorCode.MSP_ERROR_LMOD_BASE);
    }
}
