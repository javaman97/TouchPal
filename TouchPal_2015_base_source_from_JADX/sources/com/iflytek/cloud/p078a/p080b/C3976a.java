package com.iflytek.cloud.p078a.p080b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.cloud.p084b.C4000a;
import com.p023a.p024a.p032b.p037d.C0781a;
import java.io.IOException;

/* renamed from: com.iflytek.cloud.a.b.a */
public abstract class C3976a extends Handler {

    /* renamed from: a */
    private C4000a f16280a = new C4000a();

    /* renamed from: b */
    private volatile C3978b f16281b = C3978b.init;

    /* renamed from: c */
    private HandlerThread f16282c;

    /* renamed from: p */
    protected int f16283p = 60000;

    /* renamed from: q */
    protected int f16284q = ErrorCode.MSP_ERROR_LMOD_BASE;

    /* renamed from: r */
    protected Context f16285r = null;

    /* renamed from: s */
    protected volatile boolean f16286s = false;

    /* renamed from: t */
    protected long f16287t = 0;

    /* renamed from: u */
    protected int f16288u = C0781a.f1974b;

    /* renamed from: com.iflytek.cloud.a.b.a$a */
    protected enum C3977a {
        max,
        f16290b,
        min
    }

    /* renamed from: com.iflytek.cloud.a.b.a$b */
    protected enum C3978b {
        init,
        start,
        recording,
        waitresult,
        exiting,
        exited
    }

    public C3976a(Context context) {
        this.f16285r = context;
        this.f16286s = false;
    }

    public C3976a(Context context, HandlerThread handlerThread) {
        super(handlerThread.getLooper());
        this.f16282c = handlerThread;
        this.f16285r = context;
        this.f16286s = false;
    }

    /* renamed from: a */
    private void mo14632a() {
        if (this.f16282c.isAlive()) {
            mo14675u();
            this.f16282c.quit();
            this.f16282c = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14659a(int i) {
        mo14661a(obtainMessage(i), C3977a.f16290b, false, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14660a(int i, C3977a aVar, boolean z, int i2) {
        mo14661a(obtainMessage(i), aVar, z, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14633a(Message message) throws Exception {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14661a(Message message, C3977a aVar, boolean z, int i) {
        if (mo14673s() != C3978b.exited && mo14673s() != C3978b.exiting) {
            switch (message.what) {
                case 0:
                    mo14662a(C3978b.start);
                    break;
                case 3:
                    mo14662a(C3978b.waitresult);
                    break;
                case 21:
                    mo14662a(C3978b.exiting);
                    break;
            }
            if (aVar != C3977a.max || i > 0) {
                sendMessageDelayed(message, (long) i);
            } else {
                sendMessageAtFrontOfQueue(message);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14635a(SpeechError speechError) {
        mo14662a(C3978b.exited);
        mo14675u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo14662a(C3978b bVar) {
        C3990a.m17030a("curStatus=" + this.f16281b + ",setStatus=" + bVar);
        if (this.f16281b != C3978b.exited) {
            if (this.f16281b != C3978b.exiting || bVar == C3978b.exited) {
                C3990a.m17030a("setStatus success=" + bVar);
                this.f16281b = bVar;
                this.f16287t = SystemClock.elapsedRealtime();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14663a(C4000a aVar) {
        this.f16280a = aVar.clone();
        mo14652h();
    }

    /* renamed from: b */
    public void mo14643b(boolean z) {
        this.f16286s = true;
        mo14675u();
        mo14664c((SpeechError) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14644c() {
        mo14660a(0, C3977a.max, false, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public synchronized void mo14664c(SpeechError speechError) {
        if (speechError != null) {
            mo14675u();
        }
        mo14665d(obtainMessage(21, speechError));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14665d(Message message) {
        mo14661a(message, C3977a.f16290b, false, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo14652h() {
        this.f16288u = this.f16280a.mo14705a(SpeechConstant.NET_TIMEOUT, this.f16288u);
        this.f16284q = this.f16280a.mo14705a(SpeechConstant.SAMPLE_RATE, this.f16284q);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 21:
                mo14635a((SpeechError) message.obj);
                mo14632a();
                return;
            default:
                SpeechError speechError = null;
                try {
                    switch (message.what) {
                        case 8:
                            throw new SpeechError((int) ErrorCode.ERROR_NETWORK_TIMEOUT);
                        default:
                            mo14633a(message);
                            if (speechError != null) {
                                C3990a.m17030a(mo14676v() + " occur Error = " + speechError.toString());
                                mo14664c(speechError);
                                return;
                            }
                            return;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    SpeechError speechError2 = new SpeechError((int) ErrorCode.ERROR_FILE_ACCESS);
                    if (speechError2 != null) {
                        C3990a.m17030a(mo14676v() + " occur Error = " + speechError2.toString());
                        mo14664c(speechError2);
                        return;
                    }
                    return;
                } catch (SpeechError e2) {
                    e2.printStackTrace();
                    if (e2 != null) {
                        C3990a.m17030a(mo14676v() + " occur Error = " + e2.toString());
                        mo14664c(e2);
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    SpeechError speechError3 = new SpeechError(e3);
                    if (speechError3 != null) {
                        C3990a.m17030a(mo14676v() + " occur Error = " + speechError3.toString());
                        mo14664c(speechError3);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (speechError != null) {
                        C3990a.m17030a(mo14676v() + " occur Error = " + speechError.toString());
                        mo14664c(speechError);
                    }
                    throw th;
                }
        }
    }

    /* renamed from: i */
    public boolean mo14653i() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo14667m() {
        removeMessages(8);
        mo14660a(8, C3977a.f16290b, false, this.f16288u);
    }

    /* renamed from: n */
    public String mo14668n() {
        return this.f16280a.mo14714b("pte", "utf-8");
    }

    /* renamed from: o */
    public String mo14669o() {
        return this.f16280a.mo14714b(SpeechConstant.TEXT_ENCODING, "utf-8");
    }

    /* renamed from: p */
    public String mo14670p() {
        return this.f16280a.mo14714b("rse", "utf-8");
    }

    /* renamed from: q */
    public int mo14671q() {
        return this.f16284q;
    }

    /* renamed from: r */
    public boolean mo14672r() {
        return (this.f16281b == C3978b.exited || this.f16281b == C3978b.exiting || this.f16281b == C3978b.init) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public synchronized C3978b mo14673s() {
        return this.f16281b;
    }

    /* renamed from: t */
    public C4000a mo14674t() {
        return this.f16280a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo14675u() {
        C3990a.m17030a("clear all message");
        for (int i = 0; i < 20; i++) {
            removeMessages(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo14676v() {
        return getClass().toString();
    }
}
