package com.cootek.smartinput.p044a;

import android.content.Context;
import android.os.Bundle;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput.a.a */
/* compiled from: BaseRecognitionListener */
public class C0961a implements C0973l {

    /* renamed from: i */
    private static final String f2476i = "VoiceInput";

    /* renamed from: a */
    final ByteArrayOutputStream f2477a = new ByteArrayOutputStream();

    /* renamed from: j */
    private int f2478j = 0;

    /* renamed from: k */
    private C0964c f2479k = null;

    /* renamed from: l */
    private int f2480l;

    /* renamed from: m */
    private C0976o f2481m = null;

    /* renamed from: n */
    private C0975n f2482n = null;

    /* renamed from: o */
    private C0977p f2483o = null;

    /* renamed from: p */
    private Context f2484p;

    public C0961a(Context context) {
        this.f2484p = context;
    }

    /* renamed from: a */
    public void mo3947a(int i) {
        this.f2478j = i;
    }

    /* renamed from: a */
    public int mo3946a() {
        return this.f2478j;
    }

    /* renamed from: a */
    public void mo3949a(C0964c cVar) {
        this.f2479k = cVar;
        if (this.f2479k != null) {
            this.f2479k.mo3983h();
        }
    }

    /* renamed from: a */
    public void mo3950a(C0975n nVar) {
        this.f2482n = nVar;
    }

    /* renamed from: a */
    public void mo3952a(C0977p pVar) {
        this.f2483o = pVar;
    }

    /* renamed from: a */
    public void mo3951a(C0976o oVar) {
        this.f2481m = oVar;
    }

    public void onBeginningOfSpeech() {
        this.f2478j = 1;
        if (this.f2479k != null) {
            this.f2479k.mo3980e();
        }
        this.f2480l = this.f2477a.size();
    }

    public void onBufferReceived(byte[] bArr) {
    }

    public void onEndOfSpeech() {
        if (this.f2479k != null) {
            this.f2479k.mo3981f();
        }
        this.f2478j = 2;
        if (this.f2479k != null) {
            this.f2479k.mo3975a(this.f2477a, this.f2480l, this.f2477a.size());
        }
    }

    public void onError(int i) {
        String a;
        switch (i) {
            case 1:
                a = C1974m.m9063a(this.f2484p, (int) R.string.vi_error_network_timeout);
                break;
            case 2:
                a = C1974m.m9063a(this.f2484p, (int) R.string.vi_error_network);
                break;
            case 3:
                a = C1974m.m9063a(this.f2484p, (int) R.string.vi_error_audio);
                break;
            case 4:
                a = C1974m.m9063a(this.f2484p, (int) R.string.vi_error_server);
                break;
            case 5:
                a = C1974m.m9063a(this.f2484p, (int) R.string.vi_error_client);
                break;
            case 6:
                a = C1974m.m9063a(this.f2484p, (int) R.string.vi_error_speech_timeout);
                break;
            case 7:
                a = C1974m.m9063a(this.f2484p, (int) R.string.vi_error_no_match);
                break;
            case 8:
                a = C1974m.m9063a(this.f2484p, (int) R.string.vi_error_recognizer_busy);
                break;
            case 9:
                a = C1974m.m9063a(this.f2484p, (int) R.string.vi_error_insufficient_permissions);
                break;
            default:
                a = C1974m.m9063a(this.f2484p, (int) R.string.vi_error_unknown);
                break;
        }
        if (!mo3954a(a)) {
            mo3955b();
        }
    }

    /* renamed from: b */
    public void mo3955b() {
        this.f2478j = 3;
        mo3953a(false);
    }

    /* renamed from: a */
    public boolean mo3954a(String str) {
        return this.f2479k != null && !this.f2479k.mo3976a(str);
    }

    public void onEvent(int i, Bundle bundle) {
    }

    public void onPartialResults(Bundle bundle) {
    }

    public void onReadyForSpeech(Bundle bundle) {
        this.f2478j = 6;
        if (this.f2482n != null) {
            this.f2482n.mo4000a();
        }
        mo3953a(true);
        if (this.f2479k != null) {
            this.f2479k.mo3979d();
        }
    }

    /* renamed from: a */
    public void mo3953a(boolean z) {
        if (!Engine.isInitialized()) {
            return;
        }
        if (z) {
            Engine.getInstance().fireLuaCallOperation(Engine.LUA_CALL_VOICE_RECOGNIZE_START);
            Engine.getInstance().processEvent();
            if (C1368X.m6324d()) {
                C1368X.m6320c().mo5852y().mo6379a(true);
                return;
            }
            return;
        }
        Engine.getInstance().fireLuaCallOperation(Engine.LUA_CALL_VOICE_RECOGNIZE_END);
        Engine.getInstance().processEvent();
    }

    /* renamed from: a */
    public void mo3948a(Bundle bundle, boolean z) {
        if (this.f2478j != 4) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            this.f2478j = 0;
            if (this.f2481m != null && this.f2478j != 4 && !z) {
                this.f2481m.OnRecognitionResults(this, stringArrayList);
            }
        }
    }

    /* renamed from: b */
    public void mo3956b(boolean z) {
        if (this.f2479k != null && z) {
            this.f2479k.mo3973a();
        }
    }

    public void onRmsChanged(float f) {
        if (this.f2479k != null) {
            this.f2479k.mo3974a(f);
        }
    }

    /* renamed from: c */
    public void mo3957c() {
        if (this.f2479k != null) {
            this.f2479k.mo3978c();
        }
    }

    /* renamed from: d */
    public void mo3958d() {
        if (this.f2479k != null) {
            this.f2479k.mo3982g();
        }
        if (this.f2483o != null) {
            this.f2483o.mo4002a();
        }
    }

    /* renamed from: e */
    public void mo3959e() {
    }
}
