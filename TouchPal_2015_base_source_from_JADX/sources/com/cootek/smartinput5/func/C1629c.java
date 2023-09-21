package com.cootek.smartinput5.func;

import android.speech.tts.TextToSpeech;
import com.cootek.smartinput5.func.C1372a;

/* renamed from: com.cootek.smartinput5.func.c */
/* compiled from: AccessibilityManager */
class C1629c implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    final /* synthetic */ C1372a.C1373a f5251a;

    /* renamed from: b */
    final /* synthetic */ C1372a f5252b;

    C1629c(C1372a aVar, C1372a.C1373a aVar2) {
        this.f5252b = aVar;
        this.f5251a = aVar2;
    }

    public void onInit(int i) {
        boolean unused = this.f5252b.f4308j = i == 0;
        if (this.f5251a != null) {
            this.f5251a.mo4371a(this.f5252b.f4308j);
        }
    }
}
