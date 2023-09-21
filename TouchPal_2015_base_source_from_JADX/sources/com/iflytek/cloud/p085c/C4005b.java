package com.iflytek.cloud.p085c;

import android.media.AudioRecord;
import com.cootek.p042a.p043a.C0911j;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;

/* renamed from: com.iflytek.cloud.c.b */
public class C4005b extends Thread {

    /* renamed from: a */
    private final short f16367a = 16;

    /* renamed from: b */
    private byte[] f16368b = null;

    /* renamed from: c */
    private AudioRecord f16369c = null;

    /* renamed from: d */
    private C4006a f16370d = null;

    /* renamed from: e */
    private C4006a f16371e = null;

    /* renamed from: f */
    private volatile boolean f16372f = false;

    /* renamed from: g */
    private int f16373g = ErrorCode.MSP_ERROR_LMOD_BASE;

    /* renamed from: h */
    private int f16374h = 40;

    /* renamed from: i */
    private int f16375i = 40;

    /* renamed from: j */
    private int f16376j;

    /* renamed from: com.iflytek.cloud.c.b$a */
    public interface C4006a {
        /* renamed from: a */
        void mo14637a(byte[] bArr, int i, int i2);

        /* renamed from: b */
        void mo14642b(SpeechError speechError);

        /* renamed from: c */
        void mo14646c(boolean z);

        /* renamed from: k */
        void mo14655k();
    }

    public C4005b(int i, int i2, int i3) {
        this.f16376j = i3;
        this.f16373g = i;
        this.f16374h = i2;
        if (this.f16374h < 40 || this.f16374h > 100) {
            this.f16374h = 40;
        }
        this.f16375i = 10;
    }

    /* renamed from: b */
    private int m17082b() throws SpeechError {
        if (this.f16369c == null || this.f16370d == null) {
            return 0;
        }
        int read = this.f16369c.read(this.f16368b, 0, this.f16368b.length);
        if (read <= 0 || this.f16370d == null) {
            return read;
        }
        this.f16370d.mo14637a(this.f16368b, 0, read);
        return read;
    }

    /* renamed from: c */
    private void m17083c() {
        if (this.f16369c != null) {
            C3990a.m17030a("release record begin");
            this.f16369c.release();
            this.f16369c = null;
            if (this.f16371e != null) {
                this.f16371e.mo14655k();
                this.f16371e = null;
            }
            C3990a.m17030a("release record over");
        }
    }

    /* renamed from: a */
    public void mo14724a() {
        this.f16372f = true;
        if (this.f16371e == null) {
            this.f16371e = this.f16370d;
        }
        this.f16370d = null;
    }

    /* renamed from: a */
    public void mo14725a(C4006a aVar) throws SpeechError {
        this.f16370d = aVar;
        setPriority(10);
        start();
    }

    /* renamed from: a */
    public void mo14726a(short s, int i, int i2) throws SpeechError {
        if (this.f16369c != null) {
            m17083c();
        }
        int i3 = (i * i2) / 1000;
        int i4 = (((i3 * 4) * 16) * s) / 8;
        int i5 = s == 1 ? 2 : 3;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i5, 2);
        if (i4 < minBufferSize) {
            i4 = minBufferSize;
        }
        this.f16369c = new AudioRecord(this.f16376j, i, i5, 2, i4);
        this.f16368b = new byte[(((i3 * s) * 16) / 8)];
        C3990a.m17030a("\nSampleRate:" + i + "\nChannel:" + i5 + "\nFormat:" + 2 + "\nFramePeriod:" + i3 + "\nBufferSize:" + i4 + "\nMinBufferSize:" + minBufferSize + "\nActualBufferSize:" + this.f16368b.length + C0911j.f2473c);
        if (this.f16369c.getState() != 1) {
            C3990a.m17030a("create AudioRecord error");
            throw new SpeechError((int) ErrorCode.ERROR_AUDIO_RECORD);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        m17083c();
        super.finalize();
    }

    public void run() {
        int i = 0;
        int i2 = 0;
        while (!this.f16372f) {
            try {
                mo14726a(1, this.f16373g, this.f16374h);
            } catch (Exception e) {
                i2++;
                if (i2 < 10) {
                    sleep(40);
                } else {
                    throw new SpeechError((int) ErrorCode.ERROR_AUDIO_RECORD);
                }
            } catch (Exception e2) {
                i++;
                if (i < 10) {
                    sleep(40);
                } else {
                    throw new SpeechError((int) ErrorCode.ERROR_AUDIO_RECORD);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                if (this.f16370d != null) {
                    this.f16370d.mo14642b(new SpeechError((int) ErrorCode.ERROR_AUDIO_RECORD));
                }
            }
        }
        while (true) {
            if (this.f16372f) {
                break;
            }
            this.f16369c.startRecording();
            if (this.f16369c.getRecordingState() != 3) {
                throw new SpeechError((int) ErrorCode.ERROR_AUDIO_RECORD);
            }
        }
        if (this.f16370d != null) {
            this.f16370d.mo14646c(true);
        }
        while (!this.f16372f) {
            m17082b();
            sleep((long) this.f16375i);
        }
        m17083c();
    }
}
