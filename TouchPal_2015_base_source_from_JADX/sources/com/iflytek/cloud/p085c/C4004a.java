package com.iflytek.cloud.p085c;

import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.cloud.p085c.C4005b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.iflytek.cloud.c.a */
public class C4004a extends C4005b {

    /* renamed from: a */
    private int f16355a = 0;

    /* renamed from: b */
    private int f16356b = 0;

    /* renamed from: c */
    private int f16357c = 0;

    /* renamed from: d */
    private boolean f16358d = false;

    /* renamed from: e */
    private int f16359e = ErrorCode.MSP_ERROR_LMOD_BASE;

    /* renamed from: f */
    private final short f16360f = 16;

    /* renamed from: g */
    private int f16361g = 40;

    /* renamed from: h */
    private int f16362h = 40;

    /* renamed from: i */
    private byte[] f16363i = null;

    /* renamed from: j */
    private RandomAccessFile f16364j = null;

    /* renamed from: k */
    private String f16365k = null;

    /* renamed from: l */
    private C4005b.C4006a f16366l = null;

    public C4004a(int i, int i2, int i3, String str) {
        super(i, i2, i3);
        this.f16359e = i;
        this.f16361g = i2;
        this.f16362h = i2;
        this.f16365k = str;
    }

    /* renamed from: b */
    private int m17077b() throws SpeechError {
        if (this.f16364j == null || this.f16366l == null) {
            return 0;
        }
        if (this.f16356b >= this.f16355a) {
            try {
                this.f16356b = 0;
                this.f16355a = this.f16364j.read(this.f16363i, this.f16356b, this.f16363i.length);
                if (this.f16355a < 0) {
                    return -1;
                }
            } catch (IOException e) {
                throw new SpeechError((int) ErrorCode.ERROR_AUDIO_RECORD);
            }
        }
        if (this.f16355a <= 0 || this.f16366l == null) {
            return 0;
        }
        int i = this.f16355a - this.f16356b > this.f16357c ? this.f16357c : this.f16355a - this.f16356b;
        this.f16366l.mo14637a(this.f16363i, this.f16356b, i);
        this.f16356b += i;
        return i;
    }

    /* renamed from: c */
    private void m17078c() {
        if (this.f16364j != null) {
            C3990a.m17030a("release record begin");
            try {
                this.f16364j.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f16364j = null;
            if (this.f16366l != null) {
                this.f16366l.mo14655k();
                this.f16366l = null;
            }
            C3990a.m17030a("release record over");
        }
        if (this.f16363i != null) {
            this.f16363i = null;
        }
    }

    /* renamed from: a */
    public void mo14724a() {
        this.f16358d = true;
    }

    /* renamed from: a */
    public void mo14725a(C4005b.C4006a aVar) throws SpeechError {
        this.f16366l = aVar;
        setPriority(10);
        start();
    }

    /* renamed from: a */
    public void mo14726a(short s, int i, int i2) throws SpeechError {
        this.f16357c = (16 * (((i * 40) / 1000) * s)) / 8;
        this.f16363i = new byte[(this.f16357c * 10)];
        try {
            this.f16364j = new RandomAccessFile(this.f16365k, "r");
        } catch (FileNotFoundException e) {
            throw new SpeechError((int) ErrorCode.ERROR_AUDIO_RECORD);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        m17078c();
        super.finalize();
    }

    public void run() {
        try {
            mo14726a(1, this.f16359e, this.f16361g);
            if (this.f16366l != null) {
                this.f16366l.mo14646c(true);
            }
            while (true) {
                if (this.f16358d) {
                    break;
                } else if (m17077b() < 0) {
                    this.f16358d = true;
                    break;
                } else {
                    sleep((long) this.f16362h);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (this.f16366l != null) {
                this.f16366l.mo14642b(new SpeechError((int) ErrorCode.ERROR_AUDIO_RECORD));
            }
        }
        m17078c();
    }
}
