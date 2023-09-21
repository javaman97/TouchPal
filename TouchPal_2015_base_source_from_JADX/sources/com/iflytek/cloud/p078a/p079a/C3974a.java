package com.iflytek.cloud.p078a.p079a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.iflytek.cloud.GrammarListener;
import com.iflytek.cloud.LexiconListener;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechEvent;
import com.iflytek.cloud.p078a.p080b.C3976a;
import com.iflytek.cloud.p078a.p080b.C3979b;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.cloud.p084b.C4002c;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import java.io.UnsupportedEncodingException;

/* renamed from: com.iflytek.cloud.a.a.a */
public class C3974a extends C3979b {

    /* renamed from: f */
    private static GrammarListener f16258f;

    /* renamed from: g */
    private static LexiconListener f16259g;

    /* renamed from: c */
    private MSCSessionInfo f16260c = new MSCSessionInfo();

    /* renamed from: d */
    private MSCSessionInfo f16261d = new MSCSessionInfo();

    /* renamed from: e */
    private byte[] f16262e = null;

    /* renamed from: h */
    private String f16263h = "";

    /* renamed from: a */
    private synchronized void m16939a(byte[] bArr, int i, int i2) throws SpeechError {
        int QISRAudioWrite = MSC.QISRAudioWrite(this.f16300a, bArr, i, i2, this.f16261d);
        this.f16260c.sesstatus = this.f16261d.sesstatus;
        C3990a.m17030a("QISRAudioWrite length:" + i);
        if (QISRAudioWrite != 0) {
            throw new SpeechError(this.f16261d.errorcode);
        }
    }

    /* renamed from: a */
    public int mo14619a(Context context, String str, C3976a aVar) throws SpeechError, UnsupportedEncodingException {
        String a = C4002c.m17072a(context, str, aVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (C3974a.class) {
            if (TextUtils.isEmpty(str)) {
                C3990a.m17030a(a);
                this.f16300a = MSC.QISRSessionBegin((byte[]) null, a.getBytes(aVar.mo14668n()), this.f16260c);
            } else {
                this.f16300a = MSC.QISRSessionBegin(str.getBytes(aVar.mo14668n()), a.getBytes(aVar.mo14668n()), this.f16260c);
                C3990a.m17030a("sessionBegin grammarId:" + str);
            }
        }
        C3990a.m17030a("sessionBegin ErrCode:" + this.f16260c.errorcode + " time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        int i = this.f16260c.errorcode;
        if (i == 0 || i == 10129 || i == 10113 || i == 10132) {
            return i;
        }
        throw new SpeechError(i);
    }

    /* renamed from: a */
    public synchronized void mo14620a() throws SpeechError {
        m16939a(new byte[0], 0, 4);
    }

    /* renamed from: a */
    public void mo14621a(String str) {
        if (this.f16300a != null) {
            C3990a.m17030a("sessionEnd enter ");
            C3990a.m17030a("sessionEnd leavel:" + (MSC.QISRSessionEnd(this.f16300a, str.getBytes()) == 0) + " time:" + (System.currentTimeMillis() - System.currentTimeMillis()));
            this.f16300a = null;
            this.f16301b = null;
        }
    }

    /* renamed from: a */
    public synchronized void mo14622a(byte[] bArr, int i) throws SpeechError {
        m16939a(bArr, i, 2);
    }

    /* renamed from: a */
    public synchronized boolean mo14623a(String str, String str2) {
        int i;
        boolean z = false;
        synchronized (this) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && this.f16300a != null) {
                try {
                    i = MSC.QISRSetParam(this.f16300a, str.getBytes("utf-8"), str2.getBytes("utf-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    i = -1;
                }
                if (i == 0) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public synchronized int mo14624b() {
        return this.f16261d.epstatues;
    }

    /* renamed from: b */
    public synchronized int mo14625b(String str) {
        int i = 0;
        synchronized (this) {
            if (this.f16300a != null) {
                try {
                    String c = mo14627c(str);
                    if (!TextUtils.isEmpty(c)) {
                        i = Integer.parseInt(new String(c));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public synchronized int mo14626c() {
        int i;
        int i2 = 0;
        synchronized (this) {
            try {
                i = MSC.QISRGetParam(this.f16300a, SpeechConstant.VOLUME.getBytes(), this.f16261d);
                if (i == 0) {
                    try {
                        i2 = Integer.parseInt(new String(new String(this.f16261d.buffer)));
                    } catch (Exception e) {
                    }
                } else {
                    C3990a.m17030a("VAD CHECK FALSE");
                }
            } catch (Exception e2) {
                i = 0;
            }
        }
        return i2;
        C3990a.m17030a("getAudioVolume Exception vadret = " + i);
        return i2;
    }

    /* renamed from: c */
    public synchronized String mo14627c(String str) {
        String str2 = null;
        synchronized (this) {
            if (this.f16300a != null) {
                try {
                    if (MSC.QISRGetParam(this.f16300a, str.getBytes(), this.f16260c) == 0) {
                        str2 = new String(this.f16260c.buffer);
                    }
                } catch (Exception e) {
                }
            }
        }
        return str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo14628d() {
        if (this.f16301b == null) {
            this.f16301b = mo14627c("sid");
        }
        return this.f16301b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo14629e() {
        return mo14627c(SpeechEvent.KEY_EVENT_AUDIO_URL);
    }

    /* access modifiers changed from: package-private */
    public int grammarCallBack(int i, char[] cArr) {
        SpeechError speechError = null;
        if (f16258f == null) {
            return 0;
        }
        if (i != 0) {
            GrammarListener grammarListener = f16258f;
            if (i != 0) {
                speechError = new SpeechError(i);
            }
            grammarListener.onBuildFinish("", speechError);
            return 0;
        }
        f16258f.onBuildFinish(String.valueOf(cArr), (SpeechError) null);
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int lexiconCallBack(int i, char[] cArr) {
        SpeechError speechError = null;
        if (f16259g == null) {
            return 0;
        }
        if (i != 0) {
            LexiconListener lexiconListener = f16259g;
            String str = this.f16263h;
            if (i != 0) {
                speechError = new SpeechError(i);
            }
            lexiconListener.onLexiconUpdated(str, speechError);
            return 0;
        }
        f16259g.onLexiconUpdated(this.f16263h, (SpeechError) null);
        return 0;
    }
}
