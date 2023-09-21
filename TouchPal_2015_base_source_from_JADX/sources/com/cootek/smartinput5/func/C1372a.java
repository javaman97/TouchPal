package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.pm.ServiceInfo;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import com.iflytek.speech.VoiceWakeuperAidl;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.a */
/* compiled from: AccessibilityManager */
public class C1372a {

    /* renamed from: a */
    public static final String f4299a = "com.cootek.smartinputv5";

    /* renamed from: b */
    private static final String f4300b = "AccessibilityManager";

    /* renamed from: d */
    private static Hashtable<String, String> f4301d;

    /* renamed from: e */
    private static Hashtable<String, String> f4302e;

    /* renamed from: f */
    private static boolean f4303f = false;

    /* renamed from: c */
    private Context f4304c;

    /* renamed from: g */
    private boolean f4305g;

    /* renamed from: h */
    private boolean f4306h;

    /* renamed from: i */
    private TextToSpeech f4307i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f4308j;

    /* renamed from: k */
    private AccessibilityManager f4309k = ((AccessibilityManager) this.f4304c.getSystemService("accessibility"));

    /* renamed from: com.cootek.smartinput5.func.a$a */
    /* compiled from: AccessibilityManager */
    public interface C1373a {
        /* renamed from: a */
        void mo4371a(boolean z);
    }

    /* renamed from: d */
    private static void m6370d() {
        f4301d = new Hashtable<>();
        f4302e = new Hashtable<>();
        f4301d.put(",", "comma");
        f4301d.put(C1389aD.f4374j, "peroid");
        f4301d.put(":", "colon");
        f4301d.put(VoiceWakeuperAidl.PARAMS_SEPARATE, "semicolon");
        f4301d.put(C2261Q.f9807m, "question");
        f4301d.put("!", "exclamation");
        f4301d.put("\"", "ditto");
        f4301d.put("(", "left parentheses");
        f4301d.put(")", "right parentheses");
        f4301d.put("∞", "infinity");
        f4301d.put("√", "square");
        f4301d.put("…", "ellipsis");
        f4301d.put(" ", C1246d.f3818bi);
        f4302e.put("\"\"", "Double quotes");
        f4302e.put("www.", "w w w");
        f4302e.put("http://", "h t t p");
        f4302e.put("https://", "h t t p s");
        f4302e.put("www.*.com", "w w w dot dot com");
        f4302e.put(":(", "colon left parentheses");
        f4302e.put(";)", "semicolon right parentheses");
        f4302e.put(":'(", "colon apostrophe left parentheses");
        f4302e.put(":-(", "colon hyphen left parentheses");
        f4302e.put(":-)", "colon hyphen right parentheses");
        f4303f = true;
    }

    public C1372a(Context context) {
        this.f4304c = context;
        m6370d();
    }

    /* renamed from: a */
    public void mo5858a() {
        if (!m6371e() || !this.f4308j || this.f4307i == null) {
            m6372f();
        } else {
            this.f4307i.setOnUtteranceCompletedListener(new C1471b(this));
        }
    }

    /* renamed from: e */
    private boolean m6371e() {
        if (this.f4307i == null) {
            return false;
        }
        try {
            return this.f4307i.isSpeaking();
        } catch (IllegalArgumentException e) {
            m6372f();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m6372f() {
        this.f4308j = false;
        if (this.f4307i != null) {
            try {
                this.f4307i.shutdown();
            } catch (IllegalArgumentException e) {
            } finally {
                this.f4307i = null;
            }
        }
    }

    /* renamed from: b */
    public void mo5863b() {
        mo5860a((C1373a) null);
    }

    /* renamed from: a */
    public void mo5860a(C1373a aVar) {
        m6372f();
        try {
            this.f4307i = new TextToSpeech(this.f4304c.getApplicationContext(), new C1629c(this, aVar));
        } catch (SecurityException e) {
            m6372f();
            if (aVar != null) {
                aVar.mo4371a(this.f4308j);
            }
        }
    }

    /* renamed from: b */
    private static String m6367b(String str) {
        if (!f4303f) {
            m6370d();
        }
        if (f4301d.get(str) != null) {
            return f4301d.get(str);
        }
        return f4302e.get(str) != null ? f4302e.get(str) : str;
    }

    /* renamed from: g */
    private boolean m6373g() {
        List<ServiceInfo> accessibilityServiceList;
        if (this.f4309k.isEnabled() && (accessibilityServiceList = this.f4309k.getAccessibilityServiceList()) != null) {
            for (ServiceInfo next : accessibilityServiceList) {
                if (next != null && next.enabled) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private boolean m6374h() {
        if (!Engine.isInitialized()) {
            return true;
        }
        if (Engine.getInstance().getEditor().convertInputType(((TouchPalIME) Engine.getInstance().getIms()).getCurrentInputEditorInfo().inputType) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo5861a(String str) {
        mo5862a(str, false);
    }

    /* renamed from: a */
    public void mo5862a(String str, boolean z) {
        String str2 = null;
        if (this.f4307i != null && HighFreqSettings.getInstance().accessibilityEnabled && this.f4308j) {
            if (!z || !m6373g()) {
                if (!m6374h() && str != null) {
                    str2 = m6369c(str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        this.f4307i.speak(str2, 0, (HashMap) null);
                    } catch (IllegalArgumentException e) {
                        this.f4308j = false;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private String m6369c(String str) {
        String str2;
        String str3 = null;
        if (str == null) {
            return null;
        }
        if (str.contains("&&")) {
            str = str.substring(0, str.indexOf("&&"));
        }
        if (str.contains(C2261Q.f9808n) && str.length() > 1) {
            int indexOf = str.indexOf(C2261Q.f9808n);
            String substring = str.substring(0, indexOf);
            str3 = str.substring(indexOf + 1, str.length());
            str = substring;
        }
        String b = C1368X.m6320c().mo5838k().mo6241b(str);
        if (!TextUtils.isEmpty(str3)) {
            str2 = b + " " + str3;
        } else {
            str2 = b;
        }
        return m6367b(str2.toLowerCase());
    }

    /* renamed from: a */
    public void mo5859a(int i) {
        if (Settings.getInstance().getBoolSetting(Settings.ACCESSIBILITY_ENABLED)) {
            String string = this.f4304c.getString(i);
            if (i == R.string.accessibility_open_keyboard) {
                mo5860a((C1373a) new C1704d(this, string));
            } else {
                mo5861a(string);
            }
        }
    }

    /* renamed from: c */
    public boolean mo5864c() {
        return this.f4308j;
    }
}
