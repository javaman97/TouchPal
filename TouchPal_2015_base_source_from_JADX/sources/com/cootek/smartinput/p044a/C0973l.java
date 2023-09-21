package com.cootek.smartinput.p044a;

import android.os.Bundle;

/* renamed from: com.cootek.smartinput.a.l */
/* compiled from: ImeRecognitionListener */
public interface C0973l {

    /* renamed from: b */
    public static final int f2502b = 0;

    /* renamed from: c */
    public static final int f2503c = 1;

    /* renamed from: d */
    public static final int f2504d = 2;

    /* renamed from: e */
    public static final int f2505e = 3;

    /* renamed from: f */
    public static final int f2506f = 4;

    /* renamed from: g */
    public static final int f2507g = 5;

    /* renamed from: h */
    public static final int f2508h = 6;

    /* renamed from: a */
    int mo3946a();

    /* renamed from: a */
    void mo3947a(int i);

    /* renamed from: a */
    void mo3948a(Bundle bundle, boolean z);

    /* renamed from: a */
    void mo3949a(C0964c cVar);

    /* renamed from: a */
    void mo3950a(C0975n nVar);

    /* renamed from: a */
    void mo3951a(C0976o oVar);

    /* renamed from: a */
    void mo3952a(C0977p pVar);

    /* renamed from: a */
    void mo3953a(boolean z);

    /* renamed from: c */
    void mo3957c();

    /* renamed from: d */
    void mo3958d();

    /* renamed from: e */
    void mo3959e();

    void onBeginningOfSpeech();

    void onBufferReceived(byte[] bArr);

    void onEndOfSpeech();

    void onError(int i);

    void onEvent(int i, Bundle bundle);

    void onPartialResults(Bundle bundle);

    void onReadyForSpeech(Bundle bundle);

    void onRmsChanged(float f);
}
