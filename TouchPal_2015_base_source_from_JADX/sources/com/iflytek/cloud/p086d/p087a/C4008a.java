package com.iflytek.cloud.p086d.p087a;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.DataUploader;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.GrammarListener;
import com.iflytek.cloud.LexiconListener;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.p078a.p079a.C3975b;
import com.iflytek.cloud.p078a.p080b.C3983e;
import com.iflytek.cloud.p078a.p082d.C3995e;
import com.iflytek.cloud.p078a.p082d.C3996f;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;

/* renamed from: com.iflytek.cloud.d.a.a */
public class C4008a extends C3983e {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f16379f = false;

    /* renamed from: com.iflytek.cloud.d.a.a$a */
    private final class C4009a implements RecognizerListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public RecognizerListener f16381b = null;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f16382c = false;

        /* renamed from: d */
        private Handler f16383d = new C4012d(this, Looper.getMainLooper());

        public C4009a(RecognizerListener recognizerListener) {
            this.f16381b = recognizerListener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14737a() {
            String d = C4008a.this.f16312d.mo14674t().mo14719d(SpeechConstant.ASR_AUDIO_PATH);
            if (!TextUtils.isEmpty(d)) {
                C3995e.m17045a(((C3975b) C4008a.this.f16312d).mo14640b(), d);
            }
            C3996f.m17047b(C4008a.this.f16310a, Boolean.valueOf(C4008a.this.f16379f), (AudioManager.OnAudioFocusChangeListener) null);
        }

        public void onBeginOfSpeech() {
            C3990a.m17030a("onBeginOfSpeech");
            this.f16383d.sendMessage(this.f16383d.obtainMessage(2, 0, 0, (Object) null));
        }

        public void onEndOfSpeech() {
            this.f16383d.sendMessage(this.f16383d.obtainMessage(3, 0, 0, (Object) null));
        }

        public void onError(SpeechError speechError) {
            mo14737a();
            this.f16383d.sendMessage(this.f16383d.obtainMessage(0, speechError));
        }

        public void onEvent(int i, int i2, int i3, Bundle bundle) {
            Message message = new Message();
            message.what = i;
            message.arg1 = i2;
            message.arg2 = i3;
            message.obj = bundle;
            this.f16383d.sendMessage(this.f16383d.obtainMessage(6, 0, 0, message));
        }

        public void onResult(RecognizerResult recognizerResult, boolean z) {
            int i = 1;
            if (z) {
                mo14737a();
            }
            Handler handler = this.f16383d;
            if (!z) {
                i = 0;
            }
            this.f16383d.sendMessage(handler.obtainMessage(4, i, 0, recognizerResult));
        }

        public void onVolumeChanged(int i) {
            this.f16383d.sendMessage(this.f16383d.obtainMessage(1, i, 0, (Object) null));
        }
    }

    public C4008a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public int mo14730a(RecognizerListener recognizerListener) {
        synchronized (this.f16311c) {
            this.f16379f = this.f16305b.mo14712a(SpeechConstant.KEY_REQUEST_FOCUS, true);
            if (this.f16312d != null && this.f16312d.mo14672r()) {
                this.f16312d.mo14643b(this.f16305b.mo14712a(SpeechConstant.ASR_INTERRUPT_ERROR, false));
            }
            this.f16312d = new C3975b(this.f16310a, this.f16305b, mo14684a("iat"));
            C3996f.m17046a(this.f16310a, Boolean.valueOf(this.f16379f), (AudioManager.OnAudioFocusChangeListener) null);
            ((C3975b) this.f16312d).mo14634a((RecognizerListener) new C4009a(recognizerListener));
        }
        return 0;
    }

    /* renamed from: a */
    public int mo14731a(String str, String str2, GrammarListener grammarListener) {
        if (TextUtils.isEmpty(str2)) {
            return ErrorCode.ERROR_EMPTY_UTTERANCE;
        }
        if (TextUtils.isEmpty(str) || grammarListener == null) {
            return ErrorCode.ERROR_INVALID_PARAM;
        }
        DataUploader dataUploader = new DataUploader(this.f16310a);
        C4010b bVar = new C4010b(this, grammarListener);
        dataUploader.setParameter(this.f16305b);
        dataUploader.setParameter(SpeechConstant.SUBJECT, SpeechConstant.ENG_ASR);
        dataUploader.setParameter(SpeechConstant.DATA_TYPE, str);
        String b = this.f16305b.mo14714b(SpeechConstant.TEXT_ENCODING, "utf-8");
        try {
            String parameter = getParameter(SpeechConstant.GRAMMAR_NAME);
            if (!TextUtils.isEmpty(parameter)) {
                str = parameter;
            }
            dataUploader.uploadData(bVar, str, str2.getBytes(b));
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return ErrorCode.ERROR_INVALID_PARAM;
        }
    }

    /* renamed from: a */
    public int mo14732a(String str, String str2, LexiconListener lexiconListener) {
        if (TextUtils.isEmpty(str2)) {
            return ErrorCode.ERROR_EMPTY_UTTERANCE;
        }
        if (TextUtils.isEmpty(str)) {
            return ErrorCode.ERROR_INVALID_PARAM;
        }
        if (lexiconListener == null) {
            return ErrorCode.ERROR_INVALID_PARAM;
        }
        DataUploader dataUploader = new DataUploader(this.f16310a);
        C4011c cVar = new C4011c(this, lexiconListener);
        dataUploader.setParameter(this.f16305b);
        dataUploader.setParameter(SpeechConstant.SUBJECT, "uup");
        String parameter = getParameter(SpeechConstant.LEXICON_TYPE);
        if (TextUtils.isEmpty(parameter)) {
            parameter = str;
        }
        dataUploader.setParameter(SpeechConstant.DATA_TYPE, parameter);
        try {
            dataUploader.uploadData(cVar, str, str2.getBytes(this.f16305b.mo14714b(SpeechConstant.TEXT_ENCODING, "utf-8")));
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return ErrorCode.ERROR_INVALID_PARAM;
        }
    }

    /* renamed from: a */
    public int mo14733a(byte[] bArr, int i, int i2) {
        int i3 = ErrorCode.MSP_ERROR_INVALID_DATA;
        synchronized (this.f16311c) {
            if (this.f16312d == null) {
                C3990a.m17030a("writeAudio error, no active session.");
                i3 = ErrorCode.ERROR_ENGINE_CALL_FAIL;
            } else if (bArr == null || bArr.length <= 0) {
                C3990a.m17030a("writeAudio error,buffer is null.");
            } else if (bArr.length < i2 + i) {
                C3990a.m17030a("writeAudio error,buffer length < length.");
            } else if (((C3975b) this.f16312d).mo14632a() != -1) {
                i3 = ErrorCode.MSP_ERROR_INVALID_PARA;
            } else {
                ((C3975b) this.f16312d).mo14637a(bArr, i, i2);
                i3 = 0;
            }
        }
        return i3;
    }

    /* renamed from: b */
    public void mo14734b(String str) {
        synchronized (this.f16311c) {
            if (this.f16312d != null) {
                ((C3975b) this.f16312d).mo14654j().mo14679a(str);
            }
        }
    }

    public void cancel(boolean z) {
        C3996f.m17047b(this.f16310a, Boolean.valueOf(this.f16379f), (AudioManager.OnAudioFocusChangeListener) null);
        super.cancel(z);
    }

    /* renamed from: e */
    public void mo14735e() {
        synchronized (this.f16311c) {
            if (this.f16312d != null) {
                ((C3975b) this.f16312d).mo14639a(true);
            }
        }
    }

    /* renamed from: f */
    public boolean mo14736f() {
        return mo14688d();
    }
}
