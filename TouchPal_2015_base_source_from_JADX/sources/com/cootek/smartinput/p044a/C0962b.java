package com.cootek.smartinput.p044a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.speech.RecognitionListener;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2900dd;
import com.emoji.keyboard.touchpal.R;

@SuppressLint({"NewApi"})
/* renamed from: com.cootek.smartinput.a.b */
/* compiled from: DefaultRecognitionListener */
public class C0962b extends C0961a implements RecognitionListener {

    /* renamed from: i */
    private static final String f2485i = "VoiceInput";

    /* renamed from: j */
    private Context f2486j;

    /* renamed from: k */
    private C0963a f2487k = new C0963a();

    public C0962b(Context context) {
        super(context);
        this.f2486j = context;
    }

    public void onError(int i) {
        String a;
        boolean z = false;
        boolean z2 = true;
        switch (i) {
            case 1:
                a = C1974m.m9063a(this.f2486j, (int) R.string.vi_error_network_timeout);
                z = true;
                break;
            case 2:
                a = C1974m.m9063a(this.f2486j, (int) R.string.vi_error_network);
                break;
            case 3:
                a = C1974m.m9063a(this.f2486j, (int) R.string.vi_error_audio);
                z = true;
                break;
            case 4:
                a = C1974m.m9063a(this.f2486j, (int) R.string.vi_error_server);
                break;
            case 5:
                a = C1974m.m9063a(this.f2486j, (int) R.string.vi_error_client);
                z2 = false;
                break;
            case 6:
                a = C1974m.m9063a(this.f2486j, (int) R.string.vi_error_speech_timeout);
                z2 = false;
                break;
            case 7:
                a = C1974m.m9063a(this.f2486j, (int) R.string.vi_error_no_match);
                z = true;
                z2 = false;
                break;
            case 8:
                a = C1974m.m9063a(this.f2486j, (int) R.string.vi_error_recognizer_busy);
                z = true;
                break;
            case 9:
                a = C1974m.m9063a(this.f2486j, (int) R.string.vi_error_insufficient_permissions);
                break;
            default:
                a = C1974m.m9063a(this.f2486j, (int) R.string.vi_error_unknown);
                break;
        }
        if (z2) {
            m4994f();
        }
        if (super.mo3954a(a)) {
            this.f2487k.mo3971b();
            return;
        }
        super.mo3955b();
        if (z2) {
            mo3958d();
        } else if (z && this.f2487k.mo3970a(i)) {
            this.f2487k.mo3969a();
            if (Engine.isInitialized()) {
                Engine.getInstance().commitKeyEvent(Engine.KEYCODE_FUN_VOICE);
            }
        }
    }

    public void onResults(Bundle bundle) {
        super.mo3956b(true);
        super.mo3953a(false);
        super.mo3948a(bundle, false);
    }

    /* renamed from: d */
    public void mo3958d() {
        super.mo3958d();
        this.f2487k.mo3971b();
    }

    /* renamed from: e */
    public void mo3959e() {
        this.f2487k.mo3971b();
    }

    /* renamed from: f */
    private void m4994f() {
        C2900dd.m13357a(this.f2486j);
    }

    /* renamed from: com.cootek.smartinput.a.b$a */
    /* compiled from: DefaultRecognitionListener */
    class C0963a {

        /* renamed from: d */
        private static final int f2488d = 5;

        /* renamed from: b */
        private int f2490b;

        /* renamed from: c */
        private int f2491c = 0;

        public C0963a() {
            mo3971b();
        }

        /* renamed from: a */
        public boolean mo3970a(int i) {
            mo3972b(i);
            return this.f2491c <= 5;
        }

        /* renamed from: a */
        public void mo3969a() {
            this.f2491c++;
        }

        /* renamed from: b */
        public void mo3972b(int i) {
            if (i != this.f2490b) {
                this.f2490b = i;
                this.f2491c = 0;
            }
        }

        /* renamed from: b */
        public void mo3971b() {
            this.f2491c = 0;
            this.f2490b = -1;
        }
    }
}
