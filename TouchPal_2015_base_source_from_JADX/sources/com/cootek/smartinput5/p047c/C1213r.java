package com.cootek.smartinput5.p047c;

import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.p068b.C2717b;

/* renamed from: com.cootek.smartinput5.c.r */
/* compiled from: PluginLanguage */
public class C1213r extends C1199d {
    /* renamed from: b */
    public String mo4454b() {
        return C2717b.PLUGIN_LANGUAGE.toString();
    }

    /* renamed from: c */
    public String mo4455c() {
        return C1411aV.f4489p;
    }

    /* renamed from: d */
    public C1198c mo4456d() {
        return new C1214s(this);
    }

    /* renamed from: e */
    public C1197b mo4457e() {
        return new C1215t(this);
    }

    /* renamed from: a */
    public void mo4453a(Context context) {
        if (C1132b.m5654a(context).mo4392a(C1135d.ONLINE_SHOP, Boolean.valueOf(C1593bR.m7162a().f5075a)).booleanValue()) {
            Engine.getInstance().commitKeyEvent(Engine.KEYCODE_FUN_LANG_OPTION);
            return;
        }
        Engine.getInstance().getIms().requestHideSelf(0);
        Intent intent = new Intent(context, C1593bR.m7162a().mo6234b(0));
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.putExtra("SHOW_ALL_LANGUAGE", true);
        context.startActivity(intent);
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
