package com.cootek.smartinput5.net.cmd;

import android.text.TextUtils;
import com.weibo.net.C4054q;

/* renamed from: com.cootek.smartinput5.net.cmd.N */
/* compiled from: CmdUploadTypingSpeed */
public class C2257N extends C2259P {

    /* renamed from: g */
    private static final String f9679g = "lang";

    /* renamed from: h */
    private static final String f9680h = "mode";

    /* renamed from: i */
    private static final String f9681i = "top_speed";

    /* renamed from: j */
    private static final String f9682j = "total_chars";

    /* renamed from: k */
    private static final String f9683k = "total_time";

    /* renamed from: l */
    private static final String f9684l = "keystrokes";

    /* renamed from: a */
    public String f9685a;

    /* renamed from: b */
    public String f9686b;

    /* renamed from: c */
    public int f9687c;

    /* renamed from: d */
    public int f9688d;

    /* renamed from: e */
    public int f9689e;

    /* renamed from: f */
    public int f9690f;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.UPLOAD_TYPINGSPEED.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(this.f9685a)) {
            return null;
        }
        sb.append(C2261Q.f9807m);
        sb.append(f9679g);
        sb.append("=");
        sb.append(this.f9685a);
        sb.append(C2261Q.f9808n);
        sb.append(f9680h);
        sb.append("=");
        sb.append(this.f9686b);
        sb.append(C2261Q.f9808n);
        sb.append(f9681i);
        sb.append("=");
        sb.append(this.f9687c);
        sb.append(C2261Q.f9808n);
        sb.append(f9682j);
        sb.append("=");
        sb.append(this.f9688d);
        sb.append(C2261Q.f9808n);
        sb.append(f9683k);
        sb.append("=");
        sb.append(this.f9689e);
        sb.append(C2261Q.f9808n);
        sb.append(f9684l);
        sb.append("=");
        sb.append(this.f9690f);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9741M;
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }
}
