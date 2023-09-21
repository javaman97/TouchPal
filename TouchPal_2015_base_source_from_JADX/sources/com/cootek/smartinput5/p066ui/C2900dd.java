package com.cootek.smartinput5.p066ui;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.cootek.smartinput.p044a.C0978q;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.dd */
/* compiled from: VoiceDialogUtils */
public class C2900dd {
    /* renamed from: a */
    public static void m13357a(Context context) {
        AlertDialog.Builder positiveButton = new C2894d.C2895a(context).setMessage(C1974m.m9063a(context, (int) R.string.vi_switch_to_system_engine)).setNegativeButton(C1974m.m9063a(context, (int) R.string.cancel), new C2902df()).setPositiveButton(C1974m.m9063a(context, (int) R.string.vi_use_system_engine), new C2901de());
        if (!C0978q.m5067c()) {
            m13356a(positiveButton, false);
        }
    }

    /* renamed from: a */
    public static void m13358a(Context context, String str) {
        m13356a(new C2894d.C2895a(context).setMessage(String.format(C1974m.m9063a(context, (int) R.string.vi_language_incompatibale), new Object[]{str})).setNegativeButton(C1974m.m9063a(context, (int) R.string.cancel), new C2904dh()).setPositiveButton(C1974m.m9063a(context, (int) R.string.ok), new C2903dg()), true);
    }

    /* renamed from: a */
    protected static void m13355a() {
        Settings.getInstance().setIntSetting(Settings.VOICE_INPUT_ENGINE, 1);
    }

    /* renamed from: a */
    private static void m13356a(AlertDialog.Builder builder, boolean z) {
        AlertDialog create = builder.create();
        Window window = create.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.type = C2261Q.f9802h;
        window.setAttributes(attributes);
        window.addFlags(131072);
        if (!Engine.isInitialized()) {
            return;
        }
        if (Engine.getInstance().getWidgetManager().mo9609O().isShown() || z) {
            long j = 0;
            if (z) {
                j = 1000;
            }
            new Handler().postDelayed(new C2905di(create), j);
        }
    }
}
