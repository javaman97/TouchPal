package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2618H;
import com.cootek.smartinput5.p066ui.C2806cb;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.l */
/* compiled from: PaopaoUtils */
public class C1943l {
    /* renamed from: a */
    public static void m8908a(Context context) {
        if (Settings.getInstance().getBoolSetting(Settings.SHOW_WAVE_TUTORIAL_DIALOG)) {
            C2618H h = new C2618H(context);
            h.mo8580b(C1974m.m9063a(context, (int) R.string.paopao_enable_wave_dialog));
            h.mo8574a(C1974m.m9063a(context, (int) R.string.paopao_enable_wave_dialog_positive_button), (View.OnClickListener) new C1944m(context));
            h.mo8581b(C1974m.m9063a(context, (int) R.string.paopao_enable_wave_dialog_negetive_button), (View.OnClickListener) null);
            Settings.getInstance().setBoolSetting(Settings.SHOW_WAVE_TUTORIAL_DIALOG, false);
            h.mo8567a();
        }
    }

    /* renamed from: a */
    public static boolean m8910a() {
        if (C1368X.m6324d()) {
            return C1368X.m6320c().mo5842o().mo5960o(C1549b.f4831b);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m8913b() {
        if (C1368X.m6324d()) {
            return C1368X.m6320c().mo5842o().mo5962p(C1549b.f4831b);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m8911a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1368X.m6320c().mo5815A().mo5572b(str, Settings.getInstance().getIntSetting(4, 9, str, (Config) null));
    }

    /* renamed from: c */
    public static boolean m8915c() {
        if (!Engine.isInitialized()) {
            return false;
        }
        String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
        C1389aD o = C1368X.m6320c().mo5842o();
        String[] g = o.mo5945g();
        String w = o.mo5975w(currentLanguageId);
        for (String equals : g) {
            if (equals.equals(w)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static int m8916d() {
        C2811cf f = Engine.getInstance().getWidgetManager().mo9646f();
        if (f == null) {
            return 0;
        }
        C2806cb b = f.mo9182b("sk_sp");
        if (b != null) {
            return b.height;
        }
        return f.mo9134g() / 4;
    }

    /* renamed from: a */
    public static void m8909a(Context context, String str, boolean z) {
        if (z) {
            int intSetting = Settings.getInstance().getIntSetting(3, 1, C1368X.m6320c().mo5835h().getLanguageCategory(Engine.getInstance().getCurrentLanguageId(), 1), (Config) null);
            if (C1549b.f4831b.equals(str)) {
                m8914c(str);
                Engine.showPinyinCurveTutorial(context);
                Settings.getInstance().setBoolSetting(Settings.CURVE_ENABLED_UI, z);
            } else if (intSetting != 2 || !TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), str)) {
                C2618H h = new C2618H(context);
                h.mo8572a(C1974m.m9063a(context, C1593bR.m7162a().mo6232a(16)));
                h.mo8580b(C1974m.m9063a(context, (int) R.string.quick_setting_enable_curve_msg));
                h.mo8574a(C1974m.m9063a(context, 17039379), (View.OnClickListener) new C1945n(str));
                h.mo8581b(C1974m.m9063a(context, 17039369), (View.OnClickListener) null);
                h.mo8579b((Runnable) new C1946o(z));
                h.mo8567a();
            } else {
                Settings.getInstance().setBoolSetting(Settings.CURVE_ENABLED_UI, z);
            }
        } else {
            Settings.getInstance().setBoolSetting(Settings.CURVE_ENABLED_UI, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m8914c(String str) {
        String languageCategory = C1368X.m6320c().mo5835h().getLanguageCategory(str, 1);
        if (!TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), str)) {
            Settings.getInstance().setIntSetting(3, 2, 1, languageCategory, (Config) null, false);
            Settings.getInstance().setStringSetting(10, str, true);
            return;
        }
        Settings.getInstance().setIntSetting(3, 2, 1, languageCategory, (Config) null, true);
    }
}
