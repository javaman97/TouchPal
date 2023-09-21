package com.cootek.smartinput5.p047c;

import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.component.C1648J;
import com.cootek.smartinput5.func.mainentrance.MainEntranceActivity;
import com.cootek.smartinput5.p066ui.p068b.C2717b;

/* renamed from: com.cootek.smartinput5.c.N */
/* compiled from: PluginTrends */
public class C1188N extends C1199d {
    /* renamed from: b */
    public String mo4454b() {
        return C2717b.PLUGIN_HOT_WORD.toString();
    }

    /* renamed from: c */
    public String mo4455c() {
        return C1411aV.f4489p;
    }

    /* renamed from: d */
    public C1198c mo4456d() {
        return new C1189O(this);
    }

    /* renamed from: e */
    public C1197b mo4457e() {
        return new C1190P(this);
    }

    /* renamed from: a */
    public void mo4453a(Context context) {
        Settings.getInstance().setBoolSetting(Settings.SHOW_HOTWORD_PAOPAO, false);
        C1648J.m7531a().mo6459a((C1648J.C1649a) null, true);
        C1648J.m7531a().mo6464e();
        Intent intent = new Intent(context, MainEntranceActivity.class);
        intent.putExtra("tabNumber", 1);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        context.startActivity(intent);
        Engine.getInstance().getIms().requestHideSelf(0);
    }

    /* renamed from: f */
    public boolean mo4458f() {
        return true;
    }

    /* renamed from: g */
    public boolean mo4459g() {
        return false;
    }
}
