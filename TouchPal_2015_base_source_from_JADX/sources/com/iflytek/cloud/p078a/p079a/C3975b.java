package com.iflytek.cloud.p078a.p079a;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechEvent;
import com.iflytek.cloud.p078a.p080b.C3976a;
import com.iflytek.cloud.p078a.p080b.C3980c;
import com.iflytek.cloud.p078a.p082d.C3998h;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.cloud.p078a.p082d.p083a.C3991b;
import com.iflytek.cloud.p084b.C4000a;
import com.iflytek.cloud.p084b.C4002c;
import com.iflytek.cloud.p085c.C4004a;
import com.iflytek.cloud.p085c.C4005b;
import com.iflytek.msc.MSC;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.iflytek.cloud.a.a.b */
public class C3975b extends C3976a implements C4005b.C4006a {

    /* renamed from: j */
    public static int f16264j = 0;

    /* renamed from: k */
    public static int f16265k = 0;

    /* renamed from: a */
    protected volatile RecognizerListener f16266a;

    /* renamed from: b */
    protected boolean f16267b;

    /* renamed from: c */
    protected boolean f16268c;

    /* renamed from: d */
    protected boolean f16269d;

    /* renamed from: e */
    protected boolean f16270e;

    /* renamed from: f */
    protected int f16271f;

    /* renamed from: g */
    protected boolean f16272g;

    /* renamed from: h */
    protected C3974a f16273h;

    /* renamed from: i */
    protected C4005b f16274i;

    /* renamed from: l */
    protected String f16275l;

    /* renamed from: m */
    protected ConcurrentLinkedQueue<byte[]> f16276m;

    /* renamed from: n */
    protected ArrayList<String> f16277n;

    /* renamed from: o */
    protected C3980c f16278o;

    /* renamed from: v */
    private int f16279v;

    public C3975b(Context context, C4000a aVar, HandlerThread handlerThread) {
        super(context, handlerThread);
        this.f16266a = null;
        this.f16267b = false;
        this.f16268c = false;
        this.f16269d = false;
        this.f16270e = false;
        this.f16271f = 1;
        this.f16272g = true;
        this.f16273h = new C3974a();
        this.f16274i = null;
        this.f16275l = null;
        this.f16276m = null;
        this.f16277n = null;
        this.f16278o = new C3980c();
        this.f16279v = 0;
        this.f16276m = new ConcurrentLinkedQueue<>();
        this.f16277n = new ArrayList<>();
        this.f16270e = false;
        mo14663a(aVar);
    }

    /* renamed from: a */
    private void m16951a(boolean z, byte[] bArr) throws SpeechError, UnsupportedEncodingException {
        String str;
        C3991b.m17034a("QISRGetResult", (String) null);
        this.f16287t = SystemClock.elapsedRealtime();
        if (bArr != null && bArr.length > 0) {
            str = new String(bArr, "utf-8");
        } else if (this.f16277n.size() <= 0) {
            String d = mo14674t().mo14719d(SpeechConstant.LOCAL_GRAMMAR);
            if (TextUtils.isEmpty(d) || "sms.irf".equals(d)) {
                throw new SpeechError((int) ErrorCode.MSP_ERROR_NO_DATA);
            }
            throw new SpeechError((int) ErrorCode.ERROR_NO_MATCH);
        } else {
            str = "";
        }
        this.f16277n.add(str);
        if (this.f16266a != null && mo14672r()) {
            Bundle bundle = new Bundle();
            bundle.putString("session_id", mo14656l());
            this.f16266a.onEvent(20001, 0, 0, bundle);
            if (z && mo14674t().mo14712a("request_audio_url", false)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(SpeechEvent.KEY_EVENT_AUDIO_URL, this.f16273h.mo14629e());
                this.f16266a.onEvent(23001, 0, 0, bundle2);
            }
            this.f16266a.onResult(new RecognizerResult(str), z);
        }
        C3990a.m17030a("msc result time:" + System.currentTimeMillis());
        if (z) {
            mo14664c((SpeechError) null);
        }
    }

    /* renamed from: w */
    private void m16952w() throws SpeechError, IOException, InterruptedException {
        C3990a.m17030a("recording stop");
        m16953x();
        this.f16278o.mo14679a("app_lau");
        this.f16273h.mo14620a();
        mo14667m();
        mo14660a(8, C3976a.C3977a.min, false, this.f16288u);
    }

    /* renamed from: x */
    private void m16953x() {
        if (this.f16274i != null) {
            this.f16274i.mo14724a();
            this.f16274i = null;
            this.f16278o.mo14679a("rec_close");
        }
    }

    /* renamed from: a */
    public int mo14632a() {
        return this.f16271f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14633a(Message message) throws Exception {
        super.mo14633a(message);
        switch (message.what) {
            case 0:
                mo14647d();
                return;
            case 1:
                mo14648e();
                return;
            case 2:
                mo14641b(message);
                return;
            case 3:
                m16952w();
                return;
            case 4:
                mo14645c(message);
                return;
            case 7:
                mo14650f();
                return;
            case 9:
                mo14651g();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public synchronized void mo14634a(RecognizerListener recognizerListener) {
        this.f16266a = recognizerListener;
        C3990a.m17030a("startListening called");
        mo14644c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14635a(SpeechError speechError) {
        C3990a.m17030a("onSessionEnd");
        m16953x();
        f16264j = this.f16273h.mo14625b("upflow");
        f16265k = this.f16273h.mo14625b("downflow");
        mo14656l();
        if (this.f16277n.size() <= 0 && speechError == null && mo14674t().mo14712a(SpeechConstant.ASR_NOMATCH_ERROR, true)) {
            speechError = new SpeechError((int) ErrorCode.MSP_ERROR_NO_DATA);
        }
        if (speechError != null) {
            this.f16278o.mo14680a("app_ret", (long) speechError.getErrorCode(), false);
        } else {
            this.f16278o.mo14680a("app_ret", 0, false);
        }
        C3991b.m17034a("QISRSessionEnd", (String) null);
        this.f16278o.mo14681a("rec_ustop", this.f16270e ? "1" : "0", false);
        this.f16273h.mo14623a("sessinfo", this.f16278o.mo14677a());
        if (this.f16286s) {
            this.f16273h.mo14621a("user abort");
        } else if (speechError != null) {
            this.f16273h.mo14621a("error" + speechError.getErrorCode());
        } else {
            this.f16273h.mo14621a("success");
        }
        super.mo14635a(speechError);
        if (this.f16266a == null) {
            return;
        }
        if (this.f16286s) {
            C3990a.m17030a("RecognizerListener#onCancel");
            return;
        }
        C3990a.m17030a("RecognizerListener#onEnd");
        if (speechError != null) {
            this.f16266a.onError(speechError);
        }
    }

    /* renamed from: a */
    public void mo14636a(byte[] bArr, int i) {
        if (mo14672r()) {
            this.f16266a.onVolumeChanged(i);
        }
    }

    /* renamed from: a */
    public void mo14637a(byte[] bArr, int i, int i2) {
        if (bArr != null && i2 > 0 && bArr.length >= i2 && i2 > 0 && mo14672r()) {
            if (!this.f16267b) {
                this.f16267b = true;
                this.f16278o.mo14679a("rec_start");
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            mo14665d(obtainMessage(2, bArr2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14638a(byte[] bArr, boolean z) throws SpeechError {
        if (!this.f16268c) {
            this.f16268c = true;
            this.f16278o.mo14679a("app_fau");
        }
        C3991b.m17034a("QISRAudioWrite", "" + bArr.length);
        this.f16273h.mo14622a(bArr, bArr.length);
        if (!z) {
            return;
        }
        if (this.f16273h.mo14624b() == 3) {
            mo14651g();
            return;
        }
        int c = this.f16273h.mo14626c();
        C3990a.m17030a("QISRAudioWrite volume:" + c);
        mo14636a(bArr, c);
    }

    /* renamed from: a */
    public synchronized boolean mo14639a(boolean z) {
        C3990a.m17030a("stopRecognize, current status is :" + mo14673s() + " usercancel : " + z);
        this.f16278o.mo14679a("app_stop");
        m16953x();
        this.f16270e = z;
        mo14659a(3);
        return true;
    }

    /* renamed from: b */
    public ConcurrentLinkedQueue<byte[]> mo14640b() {
        return this.f16276m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14641b(Message message) throws Exception {
        byte[] bArr = (byte[]) message.obj;
        if (bArr != null && bArr.length != 0) {
            this.f16276m.add(bArr);
            mo14638a(bArr, true);
        }
    }

    /* renamed from: b */
    public void mo14642b(SpeechError speechError) {
        mo14664c(speechError);
    }

    /* renamed from: b */
    public void mo14643b(boolean z) {
        if (z && mo14672r() && this.f16266a != null) {
            this.f16266a.onError(new SpeechError((int) ErrorCode.ERROR_INTERRUPT));
        }
        m16953x();
        if (mo14673s() == C3976a.C3978b.recording) {
            this.f16270e = true;
        }
        super.mo14643b(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14644c() {
        this.f16278o.mo14678a(mo14674t());
        super.mo14644c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14645c(Message message) throws SpeechError, InterruptedException, UnsupportedEncodingException {
        int i = message.arg1;
        byte[] bArr = (byte[]) message.obj;
        switch (i) {
            case 0:
                if (!this.f16269d) {
                    this.f16269d = true;
                    this.f16278o.mo14679a("app_frs");
                }
                m16951a(false, bArr);
                return;
            case 5:
                if (!this.f16269d) {
                    this.f16269d = true;
                    this.f16278o.mo14679a("app_frs");
                }
                this.f16278o.mo14679a("app_lrs");
                m16951a(true, bArr);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public void mo14646c(boolean z) {
        this.f16278o.mo14679a("rec_ready");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14647d() throws Exception {
        C3990a.m17030a("start connecting");
        String d = mo14674t().mo14719d(SpeechConstant.ENGINE_TYPE);
        if (mo14674t().mo14712a(SpeechConstant.NET_CHECK, true)) {
            if (SpeechConstant.TYPE_CLOUD.equals(d)) {
                C3998h.m17051a(this.f16285r);
            } else if (SpeechConstant.TYPE_MIX.equals(d) || "mixed".equals(d)) {
                try {
                    C3998h.m17051a(this.f16285r);
                } catch (Exception e) {
                    mo14674t().mo14709a(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_LOCAL);
                }
            }
        }
        int a = mo14674t().mo14705a("record_read_rate", 40);
        if (hasMessages(3)) {
            throw new SpeechError((int) ErrorCode.MSP_ERROR_NO_DATA);
        }
        if (this.f16271f != -1 && mo14672r()) {
            C3990a.m17030a("start  record");
            if (this.f16271f == -2) {
                this.f16274i = new C4004a(mo14671q(), a, this.f16271f, mo14674t().mo14719d(SpeechConstant.ASR_SOURCE_PATH));
            } else {
                this.f16274i = new C4005b(mo14671q(), a, this.f16271f);
            }
            this.f16278o.mo14679a("rec_open");
            this.f16274i.mo14725a(this);
            mo14660a(9, C3976a.C3977a.min, false, this.f16283p);
            if (this.f16266a != null) {
                this.f16266a.onBeginOfSpeech();
            }
        }
        C3991b.m17034a("QISRSessionBegin", (String) null);
        this.f16278o.mo14679a("app_ssb");
        mo14660a(1, C3976a.C3977a.max, false, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo14648e() throws Exception {
        int a = this.f16273h.mo14619a(this.f16285r, this.f16275l, (C3976a) this);
        if (a != 0 || this.f16273h.f16300a == null) {
            this.f16279v++;
            if (this.f16279v > 40) {
                throw new SpeechError(a);
            } else if (mo14672r()) {
                Thread.sleep(15);
                mo14660a(1, C3976a.C3977a.max, false, 0);
            }
        } else if (mo14672r()) {
            MSC.QISRRegisterNotify(this.f16273h.f16300a, "rsltCb", "stusCb", "errCb", this);
            mo14662a(C3976a.C3978b.recording);
            if (mo14674t().mo14712a(SpeechConstant.ASR_NET_PERF, false)) {
                mo14660a(7, C3976a.C3977a.max, false, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void errCb(char[] cArr, int i, byte[] bArr) {
        mo14642b(new SpeechError(i));
    }

    /* renamed from: f */
    public void mo14650f() {
        if (mo14672r()) {
            int b = this.f16273h.mo14625b("netperf");
            if (this.f16266a != null) {
                this.f16266a.onEvent(10001, b, 0, (Bundle) null);
            }
            mo14660a(7, C3976a.C3977a.f16290b, false, 100);
        }
    }

    /* renamed from: g */
    public void mo14651g() {
        if (C3976a.C3978b.recording == mo14673s()) {
            mo14639a(false);
            if (this.f16266a != null) {
                this.f16266a.onEndOfSpeech();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo14652h() {
        this.f16275l = mo14674t().mo14719d(SpeechConstant.CLOUD_GRAMMAR);
        this.f16271f = mo14674t().mo14705a(SpeechConstant.AUDIO_SOURCE, 1);
        this.f16272g = C4002c.m17075a(mo14674t().mo14719d(SpeechConstant.DOMAIN));
        this.f16283p = mo14674t().mo14705a(SpeechConstant.KEY_SPEECH_TIMEOUT, this.f16283p);
        C3990a.m17030a("mSpeechTimeOut=" + this.f16283p);
        super.mo14652h();
    }

    /* renamed from: i */
    public boolean mo14653i() {
        return this.f16272g;
    }

    /* renamed from: j */
    public C3980c mo14654j() {
        return this.f16278o;
    }

    /* renamed from: k */
    public void mo14655k() {
        if (this.f16274i != null && (this.f16274i instanceof C4004a)) {
            mo14639a(true);
        }
    }

    /* renamed from: l */
    public String mo14656l() {
        return this.f16273h.mo14628d();
    }

    /* access modifiers changed from: package-private */
    public void rsltCb(char[] cArr, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C3990a.m17031a("MscRecognizer", "rsltCb:" + i2 + "result:" + new String(bArr));
        } else {
            C3990a.m17031a("MscRecognizer", "rsltCb:" + i2 + "result:null");
        }
        Message obtainMessage = obtainMessage(4, i2, 0, bArr);
        if (hasMessages(4)) {
            mo14661a(obtainMessage, C3976a.C3977a.f16290b, false, 0);
        } else {
            mo14661a(obtainMessage, C3976a.C3977a.max, false, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void stusCb(char[] cArr, int i, int i2, int i3, byte[] bArr) {
    }
}
