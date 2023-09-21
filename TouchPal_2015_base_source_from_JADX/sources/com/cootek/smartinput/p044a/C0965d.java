package com.cootek.smartinput.p044a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput.a.d */
/* compiled from: IflyRecognitionListener */
public class C0965d extends C0961a implements RecognizerListener {

    /* renamed from: i */
    private Context f2492i;

    /* renamed from: j */
    private RecognizerListener f2493j;

    public C0965d(Context context) {
        super(context);
        this.f2492i = context;
    }

    public void onBeginOfSpeech() {
        super.onReadyForSpeech((Bundle) null);
        super.onBeginningOfSpeech();
    }

    public void onEndOfSpeech() {
        super.onEndOfSpeech();
    }

    public void onError(SpeechError speechError) {
        if (!super.mo3954a(speechError.getErrorDescription())) {
            super.mo3955b();
        }
    }

    public void onEvent(int i, int i2, int i3, Bundle bundle) {
    }

    public void onResult(RecognizerResult recognizerResult, boolean z) {
        String a = C0966e.m5014a(recognizerResult.getResultString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("results_recognition", arrayList);
        super.mo3956b(z);
        if (z) {
            super.mo3953a(false);
        }
        super.mo3948a(bundle, TextUtils.isEmpty(a) & z);
    }

    public void onVolumeChanged(int i) {
        super.onRmsChanged((float) i);
    }

    /* renamed from: c */
    public void mo3957c() {
        super.mo3957c();
    }

    /* renamed from: d */
    public void mo3958d() {
        onEndOfSpeech();
        super.mo3958d();
    }
}
