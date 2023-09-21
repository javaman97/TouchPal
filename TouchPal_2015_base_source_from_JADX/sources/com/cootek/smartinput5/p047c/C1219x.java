package com.cootek.smartinput5.p047c;

import android.content.Context;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.p050f.C1334o;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.p068b.C2717b;

/* renamed from: com.cootek.smartinput5.c.x */
/* compiled from: PluginPrediction */
public class C1219x extends C1199d {
    /* renamed from: b */
    public String mo4454b() {
        return C2717b.PLUGIN_PREDICTION.toString();
    }

    /* renamed from: c */
    public String mo4455c() {
        return C1411aV.f4488o;
    }

    /* renamed from: d */
    public C1198c mo4456d() {
        return new C1220y(this);
    }

    /* renamed from: e */
    public C1197b mo4457e() {
        return new C1221z(this);
    }

    /* renamed from: a */
    public void mo4453a(Context context) {
        if (Engine.isInitialized()) {
            C2917du widgetManager = Engine.getInstance().getWidgetManager();
            if (!widgetManager.mo9668y().mo9514c()) {
                boolean showWizardTipsDialog = Engine.getInstance().getDialogManager().showWizardTipsDialog(C1334o.COMMA_LONG_PRESS);
                if (widgetManager.mo9650h() != null && showWizardTipsDialog) {
                    Settings.getInstance().setBoolSetting(Settings.LONG_PRESS_COMMA_TIP_SHOWN, true);
                    widgetManager.mo9650h().mo8552o();
                    return;
                }
                return;
            }
            mo4475b(Engine.KEYCODE_FUN_DICT);
        }
    }

    /* renamed from: f */
    public boolean mo4458f() {
        if (!Settings.getInstance().getBoolSetting(Settings.LONG_PRESS_COMMA_TIP_SHOWN) && Engine.isInitialized() && Engine.getInstance().getWidgetManager() != null && Engine.getInstance().getWidgetManager().mo9646f() != null) {
            return Engine.getInstance().getWidgetManager().mo9646f().mo9175A();
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo4459g() {
        return false;
    }
}
