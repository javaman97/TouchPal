package com.iflytek.cloud;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.p078a.p080b.C3981d;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.cloud.p086d.p087a.C4008a;
import com.iflytek.msc.MSC;
import com.iflytek.speech.RecognizerListener;
import com.iflytek.speech.SpeechRecognizerAidl;

public final class SpeechRecognizer extends C3981d {

    /* renamed from: a */
    private static SpeechRecognizer f16240a = null;

    /* renamed from: c */
    private C4008a f16241c = null;

    /* renamed from: d */
    private SpeechRecognizerAidl f16242d = null;

    /* renamed from: e */
    private C3970a f16243e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public InitListener f16244f = null;

    /* renamed from: g */
    private Handler f16245g = new C3999b(this, Looper.getMainLooper());

    /* renamed from: com.iflytek.cloud.SpeechRecognizer$a */
    private final class C3970a implements RecognizerListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public RecognizerListener f16247b = null;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public RecognizerListener f16248c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Handler f16249d = new C4014f(this, Looper.getMainLooper());

        public C3970a(RecognizerListener recognizerListener) {
            this.f16247b = recognizerListener;
            this.f16248c = new C4013e(this, SpeechRecognizer.this);
        }

        public void onBeginOfSpeech() {
            this.f16249d.sendMessage(this.f16249d.obtainMessage(2, 0, 0, (Object) null));
        }

        public void onEndOfSpeech() {
            this.f16249d.sendMessage(this.f16249d.obtainMessage(3, 0, 0, (Object) null));
        }

        public void onError(SpeechError speechError) {
            this.f16249d.sendMessage(this.f16249d.obtainMessage(0, speechError));
        }

        public void onEvent(int i, int i2, int i3, Bundle bundle) {
            Message message = new Message();
            message.what = i;
            message.arg1 = i2;
            message.arg2 = i3;
            message.obj = bundle;
            this.f16249d.sendMessage(this.f16249d.obtainMessage(6, 0, 0, message));
        }

        public void onResult(RecognizerResult recognizerResult, boolean z) {
            int i = 1;
            Handler handler = this.f16249d;
            if (!z) {
                i = 0;
            }
            this.f16249d.sendMessage(handler.obtainMessage(4, i, 0, recognizerResult));
        }

        public void onVolumeChanged(int i) {
            this.f16249d.sendMessage(this.f16249d.obtainMessage(1, i, 0, (Object) null));
        }
    }

    protected SpeechRecognizer(Context context, InitListener initListener) {
        this.f16244f = initListener;
        if (MSC.isLoaded()) {
            this.f16241c = new C4008a(context);
        }
        SpeechUtility utility = SpeechUtility.getUtility();
        if (utility != null && utility.mo14606a() && utility.getEngineMode() != C3981d.C3982a.MSC) {
            this.f16242d = new SpeechRecognizerAidl(context.getApplicationContext(), initListener);
        } else if (initListener != null) {
            Message.obtain(this.f16245g, 0, 0, 0, (Object) null).sendToTarget();
        }
    }

    public static synchronized SpeechRecognizer createRecognizer(Context context, InitListener initListener) {
        SpeechRecognizer speechRecognizer;
        synchronized (SpeechRecognizer.class) {
            if (f16240a == null) {
                f16240a = new SpeechRecognizer(context, initListener);
            }
            speechRecognizer = f16240a;
        }
        return speechRecognizer;
    }

    public static SpeechRecognizer getRecognizer() {
        return f16240a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14595a(Context context) {
        SpeechUtility utility = SpeechUtility.getUtility();
        if (utility != null && utility.mo14606a() && utility.getEngineMode() != C3981d.C3982a.MSC) {
            if (this.f16242d != null && !this.f16242d.isAvailable()) {
                this.f16242d.destory();
                this.f16242d = null;
            }
            this.f16242d = new SpeechRecognizerAidl(context.getApplicationContext(), this.f16244f);
        } else if (this.f16244f != null && this.f16242d != null) {
            this.f16242d.destory();
            this.f16242d = null;
        }
    }

    public int buildGrammar(String str, String str2, GrammarListener grammarListener) {
        C3981d.C3982a a = mo14682a(SpeechConstant.ENG_ASR, this.f16242d);
        C3990a.m17030a("start engine mode = " + a.toString());
        if (a == C3981d.C3982a.PLUS) {
            if (this.f16242d == null) {
                return 21001;
            }
            this.f16242d.setParameter(SpeechConstant.PARAMS, (String) null);
            this.f16242d.setParameter(SpeechConstant.PARAMS, this.f16305b.toString());
            return this.f16242d.buildGrammar(str, str2, new C4003c(this, grammarListener));
        } else if (this.f16241c == null) {
            return 21001;
        } else {
            this.f16241c.setParameter(this.f16305b);
            return this.f16241c.mo14731a(str, str2, grammarListener);
        }
    }

    public void cancel() {
        if (this.f16241c != null && this.f16241c.mo14736f()) {
            this.f16241c.cancel(false);
        } else if (this.f16242d == null || !this.f16242d.isListening()) {
            C3990a.m17032b("SpeechRecognizer cancel failed, is not running");
        } else {
            this.f16242d.cancel(this.f16243e.f16248c);
        }
    }

    public boolean destroy() {
        boolean z = true;
        if (this.f16242d != null) {
            this.f16242d.destory();
            this.f16242d = null;
        }
        if (this.f16241c != null) {
            z = this.f16241c.destroy();
        }
        if (z) {
            f16240a = null;
        }
        return z;
    }

    public String getParameter(String str) {
        return super.getParameter(str);
    }

    public boolean isListening() {
        if (this.f16241c == null || !this.f16241c.mo14736f()) {
            return this.f16242d != null && this.f16242d.isListening();
        }
        return true;
    }

    public boolean setParameter(String str, String str2) {
        return super.setParameter(str, str2);
    }

    public int startListening(RecognizerListener recognizerListener) {
        C3981d.C3982a a = mo14682a(SpeechConstant.ENG_ASR, this.f16242d);
        C3990a.m17030a("start engine mode = " + a.toString());
        if (a == C3981d.C3982a.PLUS) {
            if (this.f16242d == null) {
                return 21001;
            }
            this.f16242d.setParameter(SpeechConstant.PARAMS, (String) null);
            this.f16242d.setParameter(SpeechConstant.PARAMS, this.f16305b.toString());
            this.f16243e = new C3970a(recognizerListener);
            return this.f16242d.startListening(this.f16243e.f16248c);
        } else if (this.f16241c == null) {
            return 21001;
        } else {
            this.f16241c.setParameter(this.f16305b);
            return this.f16241c.mo14730a(recognizerListener);
        }
    }

    public void stopListening() {
        if (this.f16241c != null && this.f16241c.mo14736f()) {
            this.f16241c.mo14735e();
        } else if (this.f16242d == null || !this.f16242d.isListening()) {
            C3990a.m17032b("SpeechRecognizer stopListening failed, is not running");
        } else {
            this.f16242d.stopListening(this.f16243e.f16248c);
        }
    }

    public int updateLexicon(String str, String str2, LexiconListener lexiconListener) {
        C3981d.C3982a a = mo14682a(SpeechConstant.ENG_ASR, this.f16242d);
        C3990a.m17030a("start engine mode = " + a.toString());
        if (a == C3981d.C3982a.PLUS) {
            if (this.f16242d == null) {
                return 21001;
            }
            this.f16242d.setParameter(SpeechConstant.PARAMS, (String) null);
            this.f16242d.setParameter(SpeechConstant.PARAMS, this.f16305b.toString());
            return this.f16242d.updateLexicon(str, str2, new C4007d(this, lexiconListener));
        } else if (this.f16241c == null) {
            return 21001;
        } else {
            this.f16241c.setParameter(this.f16305b);
            return this.f16241c.mo14732a(str, str2, lexiconListener);
        }
    }

    public int writeAudio(byte[] bArr, int i, int i2) {
        if (this.f16241c != null && this.f16241c.mo14736f()) {
            return this.f16241c.mo14733a(bArr, i, i2);
        }
        if (this.f16242d != null && this.f16242d.isListening()) {
            return this.f16242d.writeAudio(bArr, i, i2);
        }
        C3990a.m17032b("SpeechRecognizer writeAudio failed, is not running");
        return ErrorCode.ERROR_ENGINE_CALL_FAIL;
    }
}
