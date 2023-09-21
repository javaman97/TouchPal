package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.cootek.smartinput.p044a.C0967f;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.p066ui.VoiceView;
import com.cootek.smartinput5.p066ui.settings.C2991aG;
import com.cootek.smartinput5.p066ui.settings.C3146cm;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.settings.aH */
/* compiled from: IflyVoiceChoiceAdapter */
public class C2993aH extends C3146cm implements C2991aG {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ArrayList<C0967f> f13817c;

    public C2993aH(Context context, C2991aG.C2992a aVar) {
        super(context, 0);
        super.mo10304a((C3146cm.C3147a) new C2994aI(this, aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10071c() {
        VoiceView f = Engine.getInstance().getWidgetManager().mo9645f(false);
        if (f != null && f.isShown()) {
            Engine.getInstance().fireLuaCallOperation(Engine.LUA_CALL_UPDATE_VOICE_SYM_KEY);
            Engine.getInstance().processEvent();
        }
    }

    /* renamed from: d */
    public String[] mo10072d() {
        boolean z;
        C1389aD o = C1368X.m6320c().mo5842o();
        if (this.f13817c != null) {
            this.f13817c.clear();
        }
        this.f13817c = new ArrayList<>();
        String H = o.mo5919H();
        C0967f fVar = null;
        if (!TextUtils.isEmpty(H)) {
            fVar = C0967f.m5016b(H);
            this.f13817c.add(fVar);
        }
        for (C0967f fVar2 : C0967f.values()) {
            if (fVar != null) {
                z = TextUtils.equals(fVar2.toString(), fVar.toString());
            } else {
                z = false;
            }
            if (fVar == null || !z) {
                this.f13817c.add(fVar2);
            }
        }
        String[] strArr = new String[this.f13817c.size()];
        for (int i = 0; i < this.f13817c.size(); i++) {
            strArr[i] = this.f13817c.get(i).mo3990a(this.f14185a);
        }
        return strArr;
    }

    /* renamed from: a */
    public String mo10067a() {
        return C1368X.m6320c().mo5842o().mo5918G();
    }

    /* renamed from: e */
    public String mo10069b() {
        return C1368X.m6320c().mo5842o().mo5918G();
    }

    /* renamed from: a */
    public View mo10066a(int i, View view, LinearLayout linearLayout) {
        return super.getView(i, view, linearLayout);
    }
}
