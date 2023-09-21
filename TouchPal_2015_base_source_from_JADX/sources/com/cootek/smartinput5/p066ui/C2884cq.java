package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1599be;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.cq */
/* compiled from: SoftRow */
class C2884cq {

    /* renamed from: a */
    int f13099a;

    /* renamed from: b */
    int f13100b;

    /* renamed from: c */
    int f13101c;

    /* renamed from: d */
    int f13102d;

    /* renamed from: e */
    int f13103e;

    /* renamed from: f */
    C2811cf f13104f;

    /* renamed from: g */
    C2806cb f13105g;

    /* renamed from: h */
    private int f13106h = 0;

    /* renamed from: i */
    private String f13107i = "sk_lng";

    /* renamed from: j */
    private String f13108j = "sk_sp";

    C2884cq(C2811cf cfVar) {
        this.f13104f = cfVar;
    }

    C2884cq(Resources resources, C2811cf cfVar, RowSchema rowSchema) {
        this.f13104f = cfVar;
        String packageName = cfVar.f12571ac.getPackageName();
        this.f13099a = C1599be.m7199a(resources, packageName, rowSchema.keyWidth, cfVar.f12535H, cfVar.f12589y);
        this.f13100b = C1599be.m7199a(resources, packageName, rowSchema.keyHeight, cfVar.f12532E, cfVar.f12588x);
        this.f13101c = C1599be.m7199a(resources, packageName, rowSchema.horizontalGap, cfVar.f12535H, cfVar.f12590z);
        this.f13102d = C1599be.m7199a(resources, packageName, rowSchema.slideThreshold, cfVar.f12532E, cfVar.f12529B);
        this.f13103e = C1599be.m7199a(resources, packageName, rowSchema.verticalGap, cfVar.f12532E, cfVar.f12528A);
    }

    /* renamed from: a */
    public boolean mo9556a(C2806cb cbVar) {
        if (this.f13107i == null || this.f13108j == null) {
            return true;
        }
        if (!this.f13107i.equals(cbVar.keyName) || !m13327a(cbVar.keyName)) {
            if (this.f13108j.equals(cbVar.keyName)) {
                cbVar.width += this.f13106h;
                cbVar.updateKeyInfo();
                this.f13106h = 0;
            }
            return true;
        }
        this.f13106h += cbVar.width;
        return false;
    }

    /* renamed from: a */
    public int mo9555a(int i) {
        return i - this.f13106h;
    }

    /* renamed from: a */
    private boolean m13327a(String str) {
        if (!"sk_lng".equals(str)) {
            return false;
        }
        C1389aD o = C1368X.m6320c().mo5842o();
        if (o.mo5926N() == 1) {
            return false;
        }
        if (o.mo5926N() == 2) {
            return true;
        }
        if (!Settings.getInstance().getBoolSetting(Settings.LANG_KEY_ENABLED)) {
            return true;
        }
        if (o.mo5922J().length < 2) {
            return true;
        }
        return false;
    }
}
