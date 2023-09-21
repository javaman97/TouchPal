package com.cootek.smartinput5.net;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2377y;

/* 'enum' modifier removed */
/* renamed from: com.cootek.smartinput5.net.D */
/* compiled from: IdentifyInfo */
final class C2170D extends C2377y.C2379a {
    C2170D(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7614a(Context context) {
        String d = C2377y.C2379a.f10450a.mo8076d();
        String d2 = C2377y.C2379a.f10453d.mo8076d();
        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(d2)) {
            return d + "##" + d2;
        }
        if (TextUtils.isEmpty(d)) {
            if (!TextUtils.isEmpty(d2)) {
                d = d2;
            } else {
                d = "";
            }
        }
        String d3 = C2377y.C2379a.f10452c.mo8076d();
        if (!TextUtils.isEmpty(d)) {
            if (!TextUtils.isEmpty(d)) {
                return d + "##" + d3;
            }
            return d;
        } else if (!TextUtils.isEmpty(d3)) {
            return d3;
        } else {
            return C2377y.C2379a.f10451b.mo8076d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7613a() {
        return Settings.IDENTIFIER;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo7615b() {
        if (Settings.isInitialized()) {
            return Settings.getInstance().getStringSetting(Settings.ACTIVATE_IDENTIFIER);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7616c() {
        if (Settings.isInitialized()) {
            Settings.getInstance().setStringSetting(Settings.ACTIVATE_IDENTIFIER, mo8076d(), false);
        }
    }
}
