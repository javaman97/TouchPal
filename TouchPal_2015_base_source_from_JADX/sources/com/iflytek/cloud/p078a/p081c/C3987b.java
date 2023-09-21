package com.iflytek.cloud.p078a.p081c;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;
import com.iflytek.cloud.p078a.p080b.C3976a;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.cloud.p078a.p082d.p083a.C3991b;
import com.iflytek.cloud.p084b.C4000a;
import java.io.IOException;

/* renamed from: com.iflytek.cloud.a.c.b */
public class C3987b extends C3976a {

    /* renamed from: a */
    private SpeechListener f16320a = null;

    /* renamed from: b */
    private C3986a f16321b = new C3986a();

    /* renamed from: com.iflytek.cloud.a.c.b$a */
    private class C3988a {

        /* renamed from: b */
        private byte[] f16323b = null;

        /* renamed from: c */
        private String f16324c = "";

        public C3988a(byte[] bArr, String str) {
            this.f16323b = bArr;
            this.f16324c = str;
        }

        /* renamed from: a */
        public byte[] mo14699a() {
            return this.f16323b;
        }

        /* renamed from: b */
        public String mo14700b() {
            return this.f16324c;
        }
    }

    public C3987b(Context context, C4000a aVar) {
        super(context);
        mo14663a(aVar);
    }

    public C3987b(Context context, C4000a aVar, HandlerThread handlerThread) {
        super(context, handlerThread);
        mo14663a(aVar);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.iflytek.cloud.SpeechError, java.lang.String] */
    /* renamed from: a */
    public SpeechError mo14696a(String str, String str2) {
        ? r0 = 0;
        C3991b.m17034a("QMSPLogin", r0);
        try {
            C3986a.m17014a(this.f16285r, str, str2, (C3976a) this);
            if (r0 == 0) {
                return r0;
            }
            C3990a.m17030a(mo14676v() + " occur Error = " + r0.toString());
            return r0;
        } catch (SpeechError e) {
            e.printStackTrace();
            if (e == null) {
                return e;
            }
            C3990a.m17030a(mo14676v() + " occur Error = " + e.toString());
            return e;
        } catch (IOException e2) {
            e2.printStackTrace();
            SpeechError speechError = new SpeechError((int) ErrorCode.ERROR_FILE_ACCESS);
            if (speechError == null) {
                return speechError;
            }
            C3990a.m17030a(mo14676v() + " occur Error = " + speechError.toString());
            return speechError;
        } catch (Throwable th) {
            if (r0 != 0) {
                C3990a.m17030a(mo14676v() + " occur Error = " + r0.toString());
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14633a(Message message) throws Exception {
        byte[] a;
        super.mo14633a(message);
        switch (message.what) {
            case 10:
                C3988a aVar = (C3988a) message.obj;
                if (aVar.mo14699a() != null && aVar.mo14699a().length > 0) {
                    C3991b.m17034a("QMSPUploadData", (String) null);
                    a = this.f16321b.mo14695a(this.f16285r, aVar.mo14700b(), aVar.mo14699a(), (C3976a) this);
                    break;
                } else {
                    throw new SpeechError((int) ErrorCode.ERROR_EMPTY_UTTERANCE);
                }
            case 11:
                C3991b.m17034a("QMSPDownloadData", (String) null);
                a = this.f16321b.mo14693a(this.f16285r, this);
                break;
            case 12:
                String str = (String) message.obj;
                if (!TextUtils.isEmpty(str)) {
                    C3991b.m17034a("QMSPSearch", (String) null);
                    a = this.f16321b.mo14694a(this.f16285r, this, str);
                    break;
                } else {
                    throw new SpeechError((int) ErrorCode.ERROR_EMPTY_UTTERANCE);
                }
            default:
                a = null;
                break;
        }
        if (a == null) {
            throw new SpeechError((int) ErrorCode.ERROR_INVALID_RESULT);
        }
        if (this.f16320a != null) {
            this.f16320a.onData(a);
        }
        mo14664c((SpeechError) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14635a(SpeechError speechError) {
        super.mo14635a(speechError);
        if (this.f16320a != null && !this.f16286s) {
            this.f16320a.onCompleted(speechError);
        }
    }

    /* renamed from: a */
    public void mo14697a(SpeechListener speechListener) {
        this.f16320a = speechListener;
        mo14659a(11);
    }

    /* renamed from: a */
    public void mo14698a(SpeechListener speechListener, String str, byte[] bArr) {
        this.f16320a = speechListener;
        mo14665d(obtainMessage(10, new C3988a(bArr, str)));
    }
}
