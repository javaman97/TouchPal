package com.cootek.smartinput.p044a;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import android.widget.Toast;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.Setting;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.resource.Resource;
import java.util.Locale;

/* renamed from: com.cootek.smartinput.a.r */
/* compiled from: VoiceInput */
public class C0979r {

    /* renamed from: a */
    public static final String f2516a = " × ";

    /* renamed from: b */
    public static final String f2517b = "com.google.android.voiceservice.IMERecognitionService";

    /* renamed from: c */
    public static final String f2518c = "com.google.android.voicesearch.GoogleRecognitionService";

    /* renamed from: d */
    public static final String f2519d = "com.google.android.voicesearch.RecognitionService";

    /* renamed from: e */
    public static final String f2520e = "com.google.android.voicesearch.serviceapi.GoogleRecognitionService";

    /* renamed from: f */
    public static final String f2521f = "android.speech.RecognitionService";

    /* renamed from: g */
    private static final String f2522g = "VoiceInput";

    /* renamed from: h */
    private static final String f2523h = "iat";

    /* renamed from: i */
    private static final String f2524i = "0";

    /* renamed from: j */
    private static final int f2525j = 1;

    /* renamed from: k */
    private static final long f2526k = 5;

    /* renamed from: l */
    private static final long f2527l = 500;

    /* renamed from: m */
    private static final long f2528m = 1000;

    /* renamed from: n */
    private static final int f2529n = 4000;

    /* renamed from: o */
    private static final int f2530o = 1000;

    /* renamed from: p */
    private static Intent f2531p;

    /* renamed from: A */
    private String f2532A = "free_form";

    /* renamed from: B */
    private String f2533B;

    /* renamed from: C */
    private String f2534C;

    /* renamed from: q */
    private SpeechRecognizer f2535q;

    /* renamed from: r */
    private C0973l f2536r;

    /* renamed from: s */
    private com.iflytek.cloud.SpeechRecognizer f2537s;

    /* renamed from: t */
    private Context f2538t;

    /* renamed from: u */
    private int f2539u = 1;

    /* renamed from: v */
    private long f2540v = f2526k;

    /* renamed from: w */
    private long f2541w = f2527l;

    /* renamed from: x */
    private long f2542x = 1000;

    /* renamed from: y */
    private String f2543y = String.valueOf(4000);

    /* renamed from: z */
    private String f2544z = String.valueOf(1000);

    public C0979r(Context context) {
        this.f2538t = context;
        m5071l();
    }

    /* renamed from: j */
    private void m5069j() {
        Locale locale;
        SpeechUtility.createUtility(this.f2538t, "appid=" + C1974m.m9063a(this.f2538t, (int) R.string.app_id_iflytek_voice_engine));
        this.f2537s = com.iflytek.cloud.SpeechRecognizer.createRecognizer(this.f2538t, (InitListener) null);
        Setting.showLogcat(false);
        Locale locale2 = this.f2538t.getResources().getConfiguration().locale;
        String lowerCase = locale2.toString().toLowerCase(locale2);
        if (TextUtils.equals(lowerCase, "zh_cn")) {
            locale = Locale.CHINA;
        } else if (TextUtils.equals(lowerCase, "zh_hk") || TextUtils.equals(lowerCase, "zh_tw")) {
            locale = Locale.TRADITIONAL_CHINESE;
        } else {
            locale = Locale.US;
        }
        Resource.setUILanguage(locale);
    }

    /* renamed from: k */
    private void m5070k() {
        if (this.f2535q == null) {
            m5071l();
        } else if (!TextUtils.equals(m5072m(), this.f2534C)) {
            m5071l();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: l */
    private void m5071l() {
        if (C0978q.m5067c()) {
            m5069j();
            return;
        }
        this.f2534C = m5072m();
        if (TextUtils.isEmpty(this.f2534C)) {
            this.f2535q = SpeechRecognizer.createSpeechRecognizer(this.f2538t);
        } else {
            this.f2535q = SpeechRecognizer.createSpeechRecognizer(this.f2538t, new ComponentName(this.f2534C, f2518c));
        }
    }

    /* renamed from: m */
    private String m5072m() {
        PackageManager packageManager = this.f2538t.getPackageManager();
        for (ResolveInfo next : packageManager.queryIntentServices(new Intent(f2521f), 0)) {
            try {
                packageManager.getServiceInfo(new ComponentName(next.serviceInfo.packageName, f2518c), 0);
                return next.serviceInfo.packageName;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return "";
    }

    /* renamed from: a */
    public void mo4004a(int i) {
        this.f2539u = i;
    }

    /* renamed from: a */
    public int mo4003a() {
        return this.f2539u;
    }

    /* renamed from: a */
    public void mo4005a(long j) {
        this.f2540v = j;
    }

    /* renamed from: b */
    public long mo4010b() {
        return this.f2540v;
    }

    /* renamed from: a */
    public void mo4009a(String str) {
        this.f2532A = str;
    }

    /* renamed from: c */
    public String mo4013c() {
        return this.f2532A;
    }

    /* renamed from: b */
    public void mo4012b(String str) {
        this.f2533B = str;
    }

    /* renamed from: d */
    public String mo4015d() {
        return this.f2533B;
    }

    /* renamed from: b */
    public void mo4011b(long j) {
        this.f2541w = j;
    }

    /* renamed from: e */
    public long mo4016e() {
        return this.f2541w;
    }

    /* renamed from: c */
    public void mo4014c(long j) {
        this.f2542x = j;
    }

    /* renamed from: f */
    public long mo4017f() {
        return this.f2542x;
    }

    /* renamed from: g */
    public void mo4018g() {
        C1017y.m5232e(f2522g, String.format("onConfigurationChanged", new Object[0]));
    }

    /* renamed from: a */
    public void mo4008a(C0973l lVar) {
        if (lVar != null) {
            this.f2536r = lVar;
            if (m5068b(lVar.mo3946a())) {
                C1017y.m5232e(f2522g, String.format("Locale %s", new Object[]{mo4015d()}));
                lVar.mo3947a(5);
                lVar.mo3957c();
                m5070k();
                if (lVar instanceof C0962b) {
                    mo4006a((C0962b) lVar);
                } else if (lVar instanceof C0965d) {
                    mo4007a((C0965d) lVar);
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo4006a(C0962b bVar) {
        this.f2535q.setRecognitionListener(bVar);
        m5074o();
    }

    /* renamed from: a */
    public void mo4007a(C0965d dVar) {
        m5073n();
        try {
            this.f2537s.startListening(dVar);
        } catch (SecurityException e) {
            if (this.f2536r != null) {
                this.f2536r.mo3947a(0);
            }
            Toast.makeText(this.f2538t, C1974m.m9063a(this.f2538t, (int) R.string.vi_not_supported), 0).show();
        }
    }

    /* renamed from: n */
    private void m5073n() {
        C0967f F = C1368X.m6320c().mo5842o().mo5917F();
        this.f2537s.setParameter(SpeechConstant.DOMAIN, f2523h);
        this.f2537s.setParameter("language", F.mo3989a());
        if (!TextUtils.isEmpty(F.mo3991b())) {
            this.f2537s.setParameter(SpeechConstant.ACCENT, F.mo3991b());
        }
        this.f2537s.setParameter(SpeechConstant.VAD_BOS, this.f2543y);
        this.f2537s.setParameter(SpeechConstant.VAD_EOS, this.f2544z);
        this.f2537s.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_CLOUD);
        this.f2537s.setParameter(SpeechConstant.ASR_PTT, f2524i);
    }

    /* renamed from: b */
    private boolean m5068b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 5:
            case 6:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: h */
    public void mo4019h() {
        if (this.f2535q != null) {
            this.f2535q.stopListening();
        }
        if (this.f2537s != null) {
            this.f2537s.stopListening();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo4020i() {
        if (this.f2535q != null) {
            this.f2535q.stopListening();
            this.f2535q.cancel();
            try {
                this.f2535q.destroy();
            } catch (Exception e) {
                C1017y.m5219b(f2522g, "SpeechRecognizer destroy");
            }
        }
        if (this.f2537s != null) {
            this.f2537s.stopListening();
            this.f2537s.cancel();
            try {
                this.f2537s.destroy();
            } catch (Exception e2) {
                C1017y.m5219b(f2522g, "iflySpeechRecognizer destroy");
            }
        }
        if (this.f2536r != null) {
            this.f2536r.mo3947a(4);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: o */
    private void m5074o() {
        Intent p = m5075p();
        p.putExtra("android.speech.extra.LANGUAGE_MODEL", this.f2532A);
        p.putExtra("calling_package", "VoiceIME");
        p.putExtra("android.speech.extra.LANGUAGE", this.f2533B);
        p.putExtra("android.speech.extra.MAX_RESULTS", this.f2539u);
        p.putExtra("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS", this.f2540v);
        p.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", this.f2542x);
        p.putExtra("android.speech.extras.SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS", this.f2541w);
        try {
            this.f2535q.startListening(p);
        } catch (SecurityException e) {
            if (this.f2536r != null) {
                this.f2536r.mo3947a(0);
            }
            Toast.makeText(this.f2538t, C1974m.m9063a(this.f2538t, (int) R.string.vi_not_supported), 0).show();
        }
    }

    /* renamed from: p */
    private Intent m5075p() {
        if (f2531p == null) {
            f2531p = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            String c = C0978q.m5066c(this.f2538t);
            if (TextUtils.equals(c, C0978q.f2510a)) {
                f2531p = f2531p.setClassName(C0978q.f2510a, f2517b);
            } else if (TextUtils.equals(c, C0978q.f2511b)) {
                f2531p = f2531p.setClassName(C0978q.f2511b, f2519d);
            } else if (TextUtils.equals(c, C0978q.f2512c)) {
                f2531p = f2531p.setClassName(C0978q.f2512c, f2520e);
                f2531p.setAction(f2521f);
            }
        }
        C1017y.m5232e(f2522g, String.format("makeIntent", new Object[0]));
        return f2531p;
    }
}
