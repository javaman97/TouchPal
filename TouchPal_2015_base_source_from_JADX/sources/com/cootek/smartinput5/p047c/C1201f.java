package com.cootek.smartinput5.p047c;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.asset.UpdatePinyinActivity;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.paopaopanel.C1924C;
import com.cootek.smartinput5.func.paopaopanel.C1943l;
import com.cootek.smartinput5.p066ui.p068b.C2717b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.c.f */
/* compiled from: PluginChtChsConvert */
public class C1201f extends C1199d {
    /* renamed from: b */
    public String mo4454b() {
        return C2717b.PLUGIN_CHT_CHS_CONVERT.toString();
    }

    /* renamed from: c */
    public String mo4455c() {
        return C1411aV.f4489p;
    }

    /* renamed from: d */
    public C1198c mo4456d() {
        return new C1202g(this);
    }

    /* renamed from: e */
    public C1197b mo4457e() {
        return new C1203h(this);
    }

    /* renamed from: a */
    public void mo4453a(Context context) {
        if (!C1368X.m6324d()) {
            return;
        }
        if (C1943l.m8913b()) {
            new C1924C(context).mo7053a();
        } else if (!C1368X.m6320c().mo5842o().mo5960o(C1549b.f4831b)) {
            Toast.makeText(context, R.string.install_chinese_pinyin, 0).show();
        } else {
            Intent intent = new Intent();
            intent.setClass(context, UpdatePinyinActivity.class);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
            }
        }
    }

    /* renamed from: f */
    public boolean mo4458f() {
        return C1389aD.m6470y(Engine.getInstance().getCurrentLanguageId());
    }

    /* renamed from: g */
    public boolean mo4459g() {
        return false;
    }
}
