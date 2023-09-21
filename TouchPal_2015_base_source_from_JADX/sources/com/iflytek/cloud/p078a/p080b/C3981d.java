package com.iflytek.cloud.p078a.p080b;

import android.text.TextUtils;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.p084b.C4000a;
import com.iflytek.msc.MSC;
import com.iflytek.speech.ISpeechModule;

/* renamed from: com.iflytek.cloud.a.b.d */
public abstract class C3981d {

    /* renamed from: b */
    protected C4000a f16305b = new C4000a();

    /* renamed from: com.iflytek.cloud.a.b.d$a */
    public enum C3982a {
        MSC,
        PLUS,
        f16308c
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3982a mo14682a(String str, ISpeechModule iSpeechModule) {
        SpeechUtility utility = SpeechUtility.getUtility();
        if (utility == null) {
            return C3982a.MSC;
        }
        if (utility.getEngineMode() != C3982a.f16308c) {
            return utility.getEngineMode();
        }
        if (!MSC.isLoaded()) {
            return C3982a.PLUS;
        }
        String parameter = getParameter(SpeechConstant.ENGINE_TYPE);
        return SpeechConstant.TYPE_LOCAL.equals(parameter) ? C3982a.PLUS : SpeechConstant.TYPE_MIX.equals(parameter) ? (iSpeechModule == null || !iSpeechModule.isAvailable()) ? C3982a.MSC : C3982a.PLUS : (!SpeechConstant.ENG_TTS.equals(str) || iSpeechModule == null || !iSpeechModule.isAvailable()) ? C3982a.MSC : C3982a.PLUS;
    }

    public String getParameter(String str) {
        return SpeechConstant.PARAMS.equals(str) ? this.f16305b.toString() : this.f16305b.mo14719d(str);
    }

    public boolean setParameter(C4000a aVar) {
        this.f16305b = aVar.clone();
        return true;
    }

    public boolean setParameter(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals(SpeechConstant.PARAMS)) {
            if (TextUtils.isEmpty(str2)) {
                this.f16305b.mo14706a();
                return true;
            }
            this.f16305b.mo14715b(str2);
            return true;
        } else if (TextUtils.isEmpty(str2)) {
            return this.f16305b.mo14716c(str).booleanValue();
        } else {
            this.f16305b.mo14709a(str, str2);
            return true;
        }
    }
}
