package com.cootek.smartinput5.p047c;

import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.p068b.C2717b;
import com.cootek.smartinput5.p066ui.settings.SkinActivity;
import com.cootek.smartinput5.p066ui.settings.SkinDownloadActivity;

/* renamed from: com.cootek.smartinput5.c.G */
/* compiled from: PluginSkin */
public class C1181G extends C1199d {
    /* renamed from: b */
    public String mo4454b() {
        return C2717b.MORE_SKIN.toString();
    }

    /* renamed from: c */
    public String mo4455c() {
        return C1411aV.f4489p;
    }

    /* renamed from: d */
    public C1198c mo4456d() {
        return new C1182H(this);
    }

    /* renamed from: e */
    public C1197b mo4457e() {
        return new C1183I(this);
    }

    /* renamed from: a */
    public void mo4453a(Context context) {
        mo4471a();
        Settings.getInstance().writeBack();
        if (C1132b.m5654a(context).mo4392a(C1135d.ONLINE_SHOP, Boolean.valueOf(C1593bR.m7162a().f5075a)).booleanValue()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClass(context, SkinActivity.class);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            intent.putStringArrayListExtra(SkinActivity.f13621a, C1368X.m6320c().mo5841n().mo6297s());
            context.startActivity(intent);
            Engine.getInstance().getIms().requestHideSelf(0);
            return;
        }
        Intent intent2 = new Intent(context, SkinDownloadActivity.class);
        intent2.putExtra(SkinDownloadActivity.f13710d, C1368X.m6320c().mo5842o().mo5934a(new String[]{C1549b.f4831b, C1549b.f4832c}));
        intent2.addFlags(Engine.EXCEPTION_ERROR);
        context.startActivity(intent2);
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
