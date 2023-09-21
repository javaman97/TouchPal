package com.cootek.smartinput5;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1372a;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1396aI;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1594bS;
import com.cootek.smartinput5.func.C1608bk;
import com.cootek.smartinput5.func.HandWriteManager;
import com.cootek.smartinput5.func.component.C1659T;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.paopaopanel.C1922A;
import com.cootek.smartinput5.func.paopaopanel.C1924C;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1977c;
import com.cootek.smartinput5.func.resource.p055ui.TPreferenceScreen;
import com.cootek.smartinput5.func.share.C1979a;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.BottomBtnsFrame;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.settings.CustomizableCheckBoxPreference;
import com.cootek.smartinput5.p066ui.settings.CustomizablePreference;
import com.cootek.smartinput5.p066ui.settings.EmojiDisplayDialogPreference;
import com.cootek.smartinput5.p066ui.settings.HandwriteActivity;
import com.cootek.smartinput5.p066ui.settings.KeyboardCustomizeActivity;
import com.cootek.smartinput5.p066ui.settings.LanguageListActivityInte;
import com.cootek.smartinput5.p066ui.settings.SkinActivity;
import com.cootek.smartinput5.p066ui.settings.TouchPalCloudActivity;
import com.cootek.smartinput5.p066ui.settings.TouchPalFAQActivity;
import com.cootek.smartinput5.p066ui.settings.TypingSpeedActivity;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.List;

public class TouchPalOptionInte extends C1977c implements HandWriteManager.C1349a, C1389aD.C1390a, C1396aI.C1397a, C1608bk.C1610b {

    /* renamed from: C */
    private static final String f2874C = "TouchPalOptionInternational";

    /* renamed from: M */
    private static final String f2875M = "currentScreen";

    /* renamed from: N */
    private static final int f2876N = 10;

    /* renamed from: O */
    private static final int f2877O = -1;

    /* renamed from: P */
    private static final int f2878P = 0;

    /* renamed from: Q */
    private static final int f2879Q = 1;

    /* renamed from: R */
    private static final int f2880R = 2;

    /* renamed from: S */
    private static final int f2881S = 3;

    /* renamed from: T */
    private static final int f2882T = 4;

    /* renamed from: U */
    private static final int f2883U = 5;

    /* renamed from: V */
    private static final int f2884V = 6;

    /* renamed from: W */
    private static final int f2885W = 7;

    /* renamed from: a */
    public static final String f2886a = "SUB_PREF";

    /* renamed from: b */
    public static final String f2887b = "HELP_ABOUT";

    /* renamed from: A */
    boolean f2888A;

    /* renamed from: B */
    boolean f2889B;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public Context f2890D;

    /* renamed from: E */
    private boolean f2891E;

    /* renamed from: F */
    private List<Preference> f2892F;

    /* renamed from: G */
    private CustomizablePreference f2893G;

    /* renamed from: H */
    private CustomizablePreference f2894H;

    /* renamed from: I */
    private CustomizableCheckBoxPreference f2895I;

    /* renamed from: J */
    private ListView f2896J = null;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f2897K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f2898L;

    /* renamed from: c */
    PreferenceScreen f2899c;

    /* renamed from: d */
    TPreferenceScreen f2900d;

    /* renamed from: e */
    TPreferenceScreen f2901e;

    /* renamed from: f */
    TPreferenceScreen f2902f;

    /* renamed from: g */
    TPreferenceScreen f2903g;

    /* renamed from: h */
    TPreferenceScreen f2904h;

    /* renamed from: i */
    Preference f2905i;

    /* renamed from: j */
    Preference f2906j;

    /* renamed from: k */
    Preference f2907k;

    /* renamed from: l */
    Preference f2908l;

    /* renamed from: m */
    boolean f2909m = false;

    /* renamed from: n */
    boolean f2910n = false;

    /* renamed from: o */
    boolean f2911o = false;

    /* renamed from: p */
    boolean f2912p = false;

    /* renamed from: q */
    boolean f2913q = false;

    /* renamed from: r */
    boolean f2914r = false;

    /* renamed from: s */
    boolean f2915s;

    /* renamed from: t */
    boolean f2916t;

    /* renamed from: u */
    boolean f2917u;

    /* renamed from: v */
    boolean f2918v;

    /* renamed from: w */
    boolean f2919w;

    /* renamed from: x */
    boolean f2920x;

    /* renamed from: y */
    boolean f2921y;

    /* renamed from: z */
    boolean f2922z;

    /* renamed from: o */
    static /* synthetic */ int m5512o(TouchPalOptionInte touchPalOptionInte) {
        int i = touchPalOptionInte.f2898L + 1;
        touchPalOptionInte.f2898L = i;
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4240a(Bundle bundle) {
        C1368X.m6317b((Context) this);
        C1368X.m6320c().mo5842o().mo5929a((C1389aD.C1390a) this);
        C1368X.m6320c().mo5848u().mo5596a((HandWriteManager.C1349a) this);
        C1368X.m6320c().mo5846s().mo6310a((C1608bk.C1610b) this);
        this.f2890D = this;
        this.f2892F = new ArrayList();
        if (!m5521v()) {
            Toast.makeText(this, mo7241b((int) R.string.option_warning_ime_not_default), 1).show();
        }
        this.f2897K = 0;
        m5522w();
        m5520u();
        m5504l();
        C1979a.m9108a(this.f2890D);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4238a() {
        C1368X.m6320c().mo5842o().mo5937b((C1389aD.C1390a) this);
        C1368X.m6320c().mo5848u().mo5598b((HandWriteManager.C1349a) this);
        C1368X.m6320c().mo5846s().mo6312b((C1608bk.C1610b) this);
        C1368X.m6325e();
        m5510n();
        System.gc();
    }

    /* renamed from: l */
    private static void m5504l() {
        Settings.getInstance().setIntSetting(Settings.OPTION_PAGE_OPEN_TIMES, Settings.getInstance().getIntSetting(Settings.OPTION_PAGE_OPEN_TIMES) + 1);
    }

    /* renamed from: m */
    private void m5508m() {
        C1584bI.m7138a(Settings.SETTING_SCREENSHOT, getWindow().getDecorView());
    }

    /* renamed from: n */
    private void m5510n() {
        m5513o();
        m5516q();
        this.f2892F.clear();
        this.f2892F = null;
        this.f2900d = null;
        this.f2901e = null;
        this.f2902f = null;
        this.f2905i = null;
        this.f2904h = null;
        this.f2906j = null;
        this.f2907k = null;
        this.f2903g = null;
        this.f2908l = null;
        if (this.f2899c != null) {
            this.f2899c.removeAll();
            this.f2899c = null;
        }
    }

    /* renamed from: o */
    private void m5513o() {
        this.f2909m = false;
        this.f2910n = false;
        this.f2911o = false;
        this.f2912p = false;
        this.f2913q = false;
    }

    /* renamed from: p */
    private void m5514p() {
        this.f2895I = (CustomizableCheckBoxPreference) findPreference(C1135d.option_enable_super_dict.toString());
        this.f2894H = (CustomizablePreference) findPreference(C1135d.option_uninstall_super_dict.toString());
        if (this.f2894H != null) {
            this.f2894H.setModelPreference(this.f2895I);
        }
    }

    /* renamed from: q */
    private void m5516q() {
        this.f2894H = null;
        this.f2895I = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4244b(Bundle bundle) {
        bundle.putInt(f2875M, this.f2897K);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4246c(Bundle bundle) {
        this.f2897K = bundle.getInt(f2875M);
        m5518s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4243b() {
        this.f2891E = Settings.getInstance().getBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE);
        if (!C1584bI.m7153f(this) || !C1584bI.m7149c(this)) {
            finish();
            Guide.m5263a((Context) this);
        }
        m5517r();
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5827M().mo5998d(3);
        }
        m5472M();
        m5475P();
        m5461B();
        m5462C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4245c() {
        if (this.f2891E != Settings.getInstance().getBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE) && Engine.isInitialized()) {
            Engine.getInstance().getWidgetManager().mo9630ad().mo9248f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4247d() {
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5827M().mo5998d(2);
        }
        Settings.getInstance().writeBack();
    }

    /* renamed from: r */
    private void m5517r() {
        if (this.f2892F != null) {
            for (Preference next : this.f2892F) {
                if (next != null) {
                    if (!m5521v() || !m5468I()) {
                        next.setEnabled(false);
                    } else {
                        next.setEnabled(true);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private void m5518s() {
        switch (this.f2897K) {
            case 1:
                m5524y();
                return;
            case 2:
                m5525z();
                return;
            case 3:
                m5460A();
                return;
            case 5:
                m5469J();
                return;
            case 7:
                m5470K();
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    public void mo4248e() {
        m5519t();
    }

    /* renamed from: t */
    private void m5519t() {
        m5513o();
        if (this.f2899c != null) {
            onNewIntent(getIntent());
            this.f2899c.removeAll();
            m5522w();
        }
    }

    /* renamed from: u */
    private void m5520u() {
        Bundle extras;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && f2887b.equals(extras.getString(f2886a)) && this.f2903g != null) {
            if (!this.f2913q) {
                m5470K();
            }
            this.f2897K = 7;
            this.f2903g.onClick();
        }
    }

    /* renamed from: f */
    public void mo4249f() {
        m5519t();
    }

    /* renamed from: v */
    private boolean m5521v() {
        List<InputMethodInfo> enabledInputMethodList = ((InputMethodManager) getApplicationContext().getSystemService("input_method")).getEnabledInputMethodList();
        for (int i = 0; i < enabledInputMethodList.size(); i++) {
            if (enabledInputMethodList.get(i).getPackageName().equalsIgnoreCase(getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    private void m5522w() {
        addPreferencesFromResource(R.layout.option_inte);
        setTitle(mo7241b((int) R.string.app_name_international));
        ListView listView = (ListView) findViewById(16908298);
        this.f2896J = listView;
        C1132b.m5654a((Context) this).mo4405a((PreferenceGroup) getPreferenceScreen());
        this.f2899c = (PreferenceScreen) findPreference("root");
        this.f2900d = (TPreferenceScreen) findPreference(C1135d.option_general_screen.toString());
        m5479a(this.f2900d, listView);
        this.f2901e = (TPreferenceScreen) findPreference(C1135d.option_smart_input_screen.toString());
        m5479a(this.f2901e, listView);
        this.f2902f = (TPreferenceScreen) findPreference(C1135d.option_chinese_input_screen.toString());
        m5479a(this.f2902f, listView);
        this.f2905i = findPreference(C1135d.option_language_screen.toString());
        this.f2906j = findPreference(C1135d.option_touchpal_cloud_screen.toString());
        this.f2907k = findPreference(C1135d.option_vip.toString());
        this.f2904h = (TPreferenceScreen) findPreference(C1135d.option_speed_screen.toString());
        m5479a(this.f2904h, this.f2896J);
        this.f2903g = (TPreferenceScreen) findPreference(C1135d.option_help_about_screen.toString());
        m5479a(this.f2903g, listView);
        this.f2908l = findPreference(C1135d.option_faq.toString());
        m5514p();
        if (this.f2899c != null) {
            m5472M();
            if (this.f2900d != null) {
                this.f2900d.setOnPreferenceClickListener(new C1114ak(this));
            }
            if (this.f2901e != null) {
                this.f2901e.setOnPreferenceClickListener(new C1125av(this));
            }
            if (this.f2902f != null) {
                if (!this.f2915s) {
                    this.f2899c.removePreference(this.f2902f);
                } else {
                    this.f2902f.setOnPreferenceClickListener(new C1077aN(this));
                }
            }
            if (this.f2905i != null) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setClass(this, LanguageListActivityInte.class);
                this.f2905i.setIntent(intent);
                this.f2905i.setOnPreferenceClickListener(new C1148ba(this));
            }
            if (this.f2906j != null) {
                this.f2906j.setOnPreferenceClickListener(new C1153bf(this));
            }
            if (this.f2904h != null) {
                this.f2904h.setOnPreferenceClickListener(new C1154bg(this));
            }
            if (this.f2907k != null) {
                this.f2907k.setOnPreferenceClickListener(new C1155bh(this));
            }
            if (this.f2903g != null) {
                this.f2903g.setOnPreferenceClickListener(new C1156bi(this));
            }
            if (this.f2908l != null) {
                this.f2908l.setOnPreferenceClickListener(new C1157bj(this));
            }
        }
    }

    /* renamed from: a */
    private void m5479a(TPreferenceScreen tPreferenceScreen, ListView listView) {
        if (tPreferenceScreen != null) {
            tPreferenceScreen.updateListParams(listView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m5523x() {
        this.f2890D.startActivity(new Intent(this.f2890D, TouchPalCloudActivity.class));
        this.f2897K = 6;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m5524y() {
        boolean z = false;
        Preference findPreference = findPreference(C1135d.option_sound_dialog.toString());
        CustomizableCheckBoxPreference customizableCheckBoxPreference = (CustomizableCheckBoxPreference) findPreference(C1135d.option_accessibility.toString());
        if (customizableCheckBoxPreference != null) {
            customizableCheckBoxPreference.setModelPreference(findPreference);
            TouchPalOption.m5428a((CheckBoxPreference) customizableCheckBoxPreference, (int) Settings.ACCESSIBILITY_ENABLED);
            customizableCheckBoxPreference.setEnabled(false);
            C1368X.m6320c().mo5844q().mo5860a((C1372a.C1373a) new C1115al(this, customizableCheckBoxPreference));
        }
        CustomizableCheckBoxPreference customizableCheckBoxPreference2 = (CustomizableCheckBoxPreference) findPreference(C1135d.option_landscape_screen_mode.toString());
        if (customizableCheckBoxPreference2 != null) {
            customizableCheckBoxPreference2.setModelPreference(findPreference);
            if (Settings.getInstance().getIntSetting(Settings.LANDSCAPE_SCREEN_MODE) == 0) {
                z = true;
            }
            customizableCheckBoxPreference2.setChecked(z);
            customizableCheckBoxPreference2.setOnPreferenceClickListener(new C1116am(this, customizableCheckBoxPreference2));
        }
        CustomizableCheckBoxPreference customizableCheckBoxPreference3 = (CustomizableCheckBoxPreference) findPreference(C1135d.option_keyboard_num_line_style.toString());
        if (customizableCheckBoxPreference3 != null) {
            customizableCheckBoxPreference3.setModelPreference(findPreference);
            TouchPalOption.m5428a((CheckBoxPreference) customizableCheckBoxPreference3, (int) Settings.KEYBOARD_NUMBER_ROW_STYLE);
        }
        CustomizableCheckBoxPreference customizableCheckBoxPreference4 = (CustomizableCheckBoxPreference) findPreference(C1135d.option_forbid_simple_candidate_style.toString());
        if (customizableCheckBoxPreference4 != null) {
            customizableCheckBoxPreference4.setModelPreference(findPreference);
            TouchPalOption.m5428a((CheckBoxPreference) customizableCheckBoxPreference4, (int) Settings.FORBID_SIMPLE_CANDIDATE_STYLE);
        }
        CustomizableCheckBoxPreference customizableCheckBoxPreference5 = (CustomizableCheckBoxPreference) findPreference(C1135d.option_commit_animation.toString());
        if (customizableCheckBoxPreference5 != null) {
            customizableCheckBoxPreference5.setModelPreference(findPreference);
            TouchPalOption.m5428a((CheckBoxPreference) customizableCheckBoxPreference5, (int) Settings.COMMIT_ANIMATION_ENABLED);
        }
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_skin.toString());
        if (customizablePreference != null) {
            customizablePreference.setModelPreference(findPreference);
            customizablePreference.setLayoutResource(findPreference);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClass(this, SkinActivity.class);
            intent.putStringArrayListExtra(SkinActivity.f13621a, C1368X.m6320c().mo5841n().mo6297s());
            customizablePreference.setIntent(intent);
        }
        m5462C();
        CustomizableCheckBoxPreference customizableCheckBoxPreference6 = (CustomizableCheckBoxPreference) findPreference(C1135d.option_emoji_prediction.toString());
        if (customizableCheckBoxPreference6 != null) {
            if (C1351J.m6197k()) {
                customizableCheckBoxPreference6.setModelPreference(findPreference);
                TouchPalOption.m5428a((CheckBoxPreference) customizableCheckBoxPreference6, 62);
            } else if (this.f2900d != null) {
                this.f2900d.removePreference(customizableCheckBoxPreference6);
            }
        }
        CustomizablePreference customizablePreference2 = (CustomizablePreference) findPreference(C1135d.option_customize_keyboard_size.toString());
        if (customizablePreference2 != null) {
            if (C1594bS.m7176a(this.f2890D)) {
                customizablePreference2.setModelPreference(findPreference);
                customizablePreference2.setLayoutResource(findPreference);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setClass(this, KeyboardCustomizeActivity.class);
                customizablePreference2.setIntent(intent2);
            } else if (this.f2900d != null) {
                this.f2900d.removePreference(customizablePreference2);
            }
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(C1135d.option_onehanded_layout.toString());
        if (checkBoxPreference != null) {
            if (C1594bS.m7176a(this.f2890D)) {
                checkBoxPreference.setChecked(Settings.getInstance().getBoolSetting(Settings.ONE_HANDED_LAYOUT));
                checkBoxPreference.setOnPreferenceClickListener(new C1117an(this, checkBoxPreference));
            } else if (this.f2900d != null) {
                this.f2900d.removePreference(checkBoxPreference);
            }
        }
        this.f2909m = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m5525z() {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(C1135d.option_wave_without_next_word_on_candidate.toString());
        if (checkBoxPreference != null) {
            checkBoxPreference.setDependency(C1135d.option_wave.toString());
        }
        TouchPalOption.m5428a(checkBoxPreference, (int) Settings.WAVE_WITHOUT_NEXT_WORD_ON_CANDIDATE);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_curve.toString()), (int) Settings.CURVE_ENABLED_UI);
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference(C1135d.option_wave.toString());
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.setChecked(Settings.getInstance().getBoolSetting(53));
            checkBoxPreference2.setOnPreferenceClickListener(new C1118ao(this, checkBoxPreference2));
        }
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) findPreference(C1135d.option_auto_correction.toString());
        if (checkBoxPreference3 != null) {
            checkBoxPreference3.setEnabled(Settings.getInstance().getBoolSetting(1));
            TouchPalOption.m5428a(checkBoxPreference3, 59);
        }
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) findPreference(C1135d.option_advanced_prediction.toString());
        if (checkBoxPreference4 != null) {
            String languageCategory = C1368X.m6320c().mo5835h().getLanguageCategory(C1549b.f4791a, 4);
            checkBoxPreference4.setChecked(Settings.getInstance().getAdvancedPredictionSetting());
            checkBoxPreference4.setOnPreferenceClickListener(new C1119ap(this, checkBoxPreference4, languageCategory));
        }
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_auto_save.toString()), 47);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_auto_space.toString()), 37);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_auto_capitalization.toString()), 54);
        TouchPalOption.m5429a((CheckBoxPreference) findPreference(C1135d.option_space_to_input_nextword.toString()), 36, 14, "western");
        this.f2910n = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m5460A() {
        this.f2914r = false;
        Preference findPreference = findPreference(C1135d.option_shuang_pin.toString());
        Preference findPreference2 = findPreference(C1135d.option_stroke_filter.toString());
        Preference findPreference3 = findPreference(C1135d.option_wubi_GBK.toString());
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_chs_handwriting.toString());
        TPreferenceScreen tPreferenceScreen = (TPreferenceScreen) findPreference(C1135d.option_fuzzy_pinyin.toString());
        m5479a(tPreferenceScreen, this.f2896J);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(C1135d.option_predict_next_word_chs.toString());
        CustomizablePreference customizablePreference2 = (CustomizablePreference) findPreference(C1135d.option_traditional_chs.toString());
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference(C1135d.option_wubi_auto_adjust_freq.toString());
        if (checkBoxPreference != null) {
            TouchPalOption.m5429a(checkBoxPreference, 2, 4, m5484c(4));
        }
        TouchPalOption.m5429a((CheckBoxPreference) findPreference(C1135d.option_space_get_next_word.toString()), 36, 14, "chinese");
        if (findPreference2 != null) {
            if (!this.f2918v) {
                this.f2902f.removePreference(findPreference2);
            } else {
                TouchPalOption.m5428a((CheckBoxPreference) findPreference2, 8);
            }
        }
        if (customizablePreference2 != null) {
            customizablePreference2.setModelPreference(checkBoxPreference);
            customizablePreference2.setLayoutResource(checkBoxPreference);
            m5461B();
            customizablePreference2.setOnPreferenceClickListener(new C1120aq(this));
        }
        if (tPreferenceScreen != null) {
            if (!this.f2918v) {
                this.f2902f.removePreference(tPreferenceScreen);
            } else {
                tPreferenceScreen.setOnPreferenceClickListener(new C1121ar(this));
            }
        }
        if (findPreference != null && !this.f2918v) {
            this.f2902f.removePreference(findPreference);
        }
        if (customizablePreference != null) {
            if (this.f2917u || this.f2918v) {
                customizablePreference.setModelPreference(checkBoxPreference);
                customizablePreference.setLayoutResource(checkBoxPreference);
                customizablePreference.setIntent(new Intent(this, HandwriteActivity.class));
            } else {
                this.f2902f.removePreference(customizablePreference);
            }
        }
        if (findPreference3 != null) {
            if (!this.f2919w) {
                this.f2902f.removePreference(findPreference3);
            } else {
                TouchPalOption.m5428a((CheckBoxPreference) findPreference3, 43);
            }
        }
        if (checkBoxPreference2 != null) {
            if (!this.f2919w) {
                this.f2902f.removePreference(checkBoxPreference2);
            } else {
                TouchPalOption.m5428a(checkBoxPreference2, 52);
            }
        }
        m5463D();
        this.f2911o = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m5461B() {
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_traditional_chs.toString());
        String str = null;
        switch (Settings.getInstance().getIntSetting(60)) {
            case 0:
                str = mo7241b((int) R.string.trad_simp_convert_auto);
                break;
            case 1:
                str = mo7241b((int) R.string.trad_simp_convert_output_simp);
                break;
            case 2:
                str = mo7241b((int) R.string.trad_simp_convert_output_trad);
                break;
        }
        if (customizablePreference != null && str != null) {
            customizablePreference.setSummary(str);
        }
    }

    /* renamed from: C */
    private void m5462C() {
        EmojiDisplayDialogPreference emojiDisplayDialogPreference = (EmojiDisplayDialogPreference) findPreference(C1135d.option_emoji_display.toString());
        if (emojiDisplayDialogPreference != null) {
            emojiDisplayDialogPreference.updateSummary();
        }
    }

    /* renamed from: D */
    private void m5463D() {
        boolean z;
        CustomizableCheckBoxPreference customizableCheckBoxPreference = (CustomizableCheckBoxPreference) findPreference(C1135d.option_enable_super_dict.toString());
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_uninstall_super_dict.toString());
        boolean o = C1368X.m6320c().mo5842o().mo5960o(C1549b.f4831b);
        C1368X.m6320c().mo5846s().mo6307a();
        C1368X.m6320c().mo5846s().mo6311b();
        if (o || !Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
            if (C1593bR.m7162a().f5076b) {
                if (customizableCheckBoxPreference != null) {
                    this.f2902f.removePreference(customizableCheckBoxPreference);
                }
                if (customizablePreference != null) {
                    this.f2902f.removePreference(customizablePreference);
                    return;
                }
                return;
            }
        } else if (customizableCheckBoxPreference != null) {
            customizableCheckBoxPreference.setEnabled(false);
        }
        if (customizableCheckBoxPreference == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            customizableCheckBoxPreference = this.f2895I;
        }
        m5480a(customizableCheckBoxPreference, z);
        if (customizablePreference != null) {
            if (!Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
                this.f2902f.removePreference(customizablePreference);
            } else {
                m5481a(customizablePreference, false);
            }
        } else if (this.f2894H != null && Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
            m5481a(this.f2894H, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public String m5464E() {
        if (Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
            return null;
        }
        if (C1368X.m6320c().mo5846s().mo6314c()) {
            return mo7241b((int) R.string.download_apk_inprogress);
        }
        return mo7241b((int) R.string.click_to_download_super_dict);
    }

    /* renamed from: a */
    private void m5480a(CustomizableCheckBoxPreference customizableCheckBoxPreference, boolean z) {
        boolean z2 = true;
        if (customizableCheckBoxPreference != null) {
            customizableCheckBoxPreference.setSummary(m5464E());
            customizableCheckBoxPreference.setEnabled(true);
            if (!Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_ENABLED_UI) || !Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
                z2 = false;
            }
            customizableCheckBoxPreference.setChecked(z2);
            customizableCheckBoxPreference.setOnPreferenceClickListener(new C1122as(this, customizableCheckBoxPreference));
            if (z) {
                this.f2902f.addPreference(customizableCheckBoxPreference);
            }
        }
    }

    /* renamed from: a */
    private void m5481a(CustomizablePreference customizablePreference, boolean z) {
        if (customizablePreference != null) {
            customizablePreference.setModelPreference(this.f2895I);
            customizablePreference.setOnPreferenceClickListener(m5466G());
            if (z) {
                this.f2902f.addPreference(customizablePreference);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m5465F() {
        new C2894d.C2895a(this.f2890D).setMessage(mo7241b((int) R.string.download_super_dict_dialog_msg)).setPositiveButton(mo7241b((int) R.string.ok), new C1124au(this, (CheckBoxPreference) findPreference(C1135d.option_enable_super_dict.toString()))).setNegativeButton(mo7241b((int) R.string.cancel), new C1123at(this)).show();
    }

    /* renamed from: G */
    private Preference.OnPreferenceClickListener m5466G() {
        return new C1126aw(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m5467H() {
        ArrayList arrayList = new ArrayList();
        TouchPalOption.m5430a((CheckBoxPreference) findPreference(C1135d.option_z_zh.toString()), 19, (ArrayList<Preference>) arrayList, (TouchPalOption.C1048d) null);
        TouchPalOption.m5430a((CheckBoxPreference) findPreference(C1135d.option_c_ch.toString()), 17, (ArrayList<Preference>) arrayList, (TouchPalOption.C1048d) null);
        TouchPalOption.m5430a((CheckBoxPreference) findPreference(C1135d.option_s_sh.toString()), 18, (ArrayList<Preference>) arrayList, (TouchPalOption.C1048d) null);
        TouchPalOption.m5430a((CheckBoxPreference) findPreference(C1135d.option_an_ang.toString()), 24, (ArrayList<Preference>) arrayList, (TouchPalOption.C1048d) null);
        TouchPalOption.m5430a((CheckBoxPreference) findPreference(C1135d.option_en_eng.toString()), 25, (ArrayList<Preference>) arrayList, (TouchPalOption.C1048d) null);
        TouchPalOption.m5430a((CheckBoxPreference) findPreference(C1135d.option_in_ing.toString()), 26, (ArrayList<Preference>) arrayList, (TouchPalOption.C1048d) null);
        TouchPalOption.m5430a((CheckBoxPreference) findPreference(C1135d.option_l_n.toString()), 21, (ArrayList<Preference>) arrayList, (TouchPalOption.C1048d) null);
        TouchPalOption.m5430a((CheckBoxPreference) findPreference(C1135d.option_f_h.toString()), 20, (ArrayList<Preference>) arrayList, (TouchPalOption.C1048d) null);
        TouchPalOption.m5430a((CheckBoxPreference) findPreference(C1135d.option_r_l.toString()), 22, (ArrayList<Preference>) arrayList, (TouchPalOption.C1048d) null);
        TouchPalOption.m5430a((CheckBoxPreference) findPreference(C1135d.option_ian_iang.toString()), 27, (ArrayList<Preference>) arrayList, (TouchPalOption.C1048d) null);
        TouchPalOption.m5430a((CheckBoxPreference) findPreference(C1135d.option_uan_uang.toString()), 28, (ArrayList<Preference>) arrayList, (TouchPalOption.C1048d) null);
        Preference findPreference = findPreference(C1135d.option_select_all.toString());
        if (findPreference != null) {
            findPreference.setOnPreferenceClickListener(new C1129az(this, arrayList));
        }
        Preference findPreference2 = findPreference(C1135d.option_clear_all.toString());
        if (findPreference2 != null) {
            findPreference2.setOnPreferenceClickListener(new C1064aA(this, arrayList));
        }
        this.f2914r = true;
    }

    /* renamed from: I */
    private boolean m5468I() {
        String string = Settings.Secure.getString(getContentResolver(), "default_input_method");
        return string != null && string.equalsIgnoreCase(new StringBuilder().append(getPackageName()).append("/").append(TouchPalIME.class.getName()).toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m5469J() {
        CustomizableCheckBoxPreference customizableCheckBoxPreference = (CustomizableCheckBoxPreference) findPreference(C1135d.option_speed_dometer.toString());
        TouchPalOption.m5428a((CheckBoxPreference) customizableCheckBoxPreference, 84);
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_speed_view.toString());
        if (customizablePreference != null) {
            customizablePreference.setModelPreference(customizableCheckBoxPreference);
            customizablePreference.setLayoutResource(customizableCheckBoxPreference);
            customizablePreference.setIntent(TypingSpeedActivity.m14134a((Context) this));
            customizablePreference.setOnPreferenceClickListener(new C1065aB(this));
        }
        this.f2912p = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m5470K() {
        TPreferenceScreen tPreferenceScreen = (TPreferenceScreen) findPreference(C1135d.option_about_handwriting.toString());
        Preference findPreference = findPreference(C1135d.option_visit_handwriting_provider_website.toString());
        TPreferenceScreen tPreferenceScreen2 = (TPreferenceScreen) findPreference(C1135d.option_version_screen.toString());
        m5479a(tPreferenceScreen2, this.f2896J);
        Preference findPreference2 = findPreference(C1135d.option_version_band.toString());
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(C1135d.option_paopao.toString());
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_wave_tutorial.toString());
        Preference findPreference3 = findPreference(C1135d.option_twitter_follow_us.toString());
        Preference findPreference4 = findPreference(C1135d.option_rate_us.toString());
        Preference findPreference5 = findPreference(C1135d.privacy.toString());
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference(C1135d.option_send_usage_statistics.toString());
        CustomizablePreference customizablePreference2 = (CustomizablePreference) findPreference(C1135d.option_tutorial.toString());
        this.f2892F.add(customizablePreference2);
        if (customizablePreference2 != null) {
            if (!m5521v() || !m5468I()) {
                customizablePreference2.setEnabled(false);
            } else {
                customizablePreference2.setEnabled(true);
            }
            customizablePreference2.setModelPreference(findPreference2);
            customizablePreference2.setLayoutResource(findPreference2);
            customizablePreference2.setIntent(TouchPalOption.m5435b((Context) this));
            customizablePreference2.setOnPreferenceClickListener(new C1066aC(this));
        }
        if (customizablePreference != null) {
            customizablePreference.setModelPreference(findPreference2);
            customizablePreference.setLayoutResource(findPreference2);
            customizablePreference.setOnPreferenceClickListener(new C1067aD(this));
        }
        TouchPalOption.m5428a(checkBoxPreference, 76);
        CustomizablePreference customizablePreference3 = (CustomizablePreference) findPreference(C1135d.opton_share.toString());
        if (customizablePreference3 != null) {
            customizablePreference3.setModelPreference(findPreference2);
            customizablePreference3.setLayoutResource(findPreference2);
            customizablePreference3.setOnPreferenceClickListener(new C1069aF(this));
        }
        CustomizablePreference customizablePreference4 = (CustomizablePreference) findPreference(C1135d.option_feedback.toString());
        if (customizablePreference4 != null) {
            customizablePreference4.setModelPreference(findPreference2);
            customizablePreference4.setLayoutResource(findPreference2);
            customizablePreference4.setIntent(TouchPalOption.m5439c(this));
            customizablePreference4.setOnPreferenceClickListener(new C1070aG(this));
        }
        CustomizablePreference customizablePreference5 = (CustomizablePreference) findPreference(C1135d.option_feedback_uservoice.toString());
        if (customizablePreference5 != null) {
            customizablePreference5.setModelPreference(findPreference2);
            customizablePreference5.setLayoutResource(findPreference2);
            customizablePreference5.setOnPreferenceClickListener(new C1072aI(this));
        }
        CustomizableCheckBoxPreference customizableCheckBoxPreference = (CustomizableCheckBoxPreference) findPreference(C1135d.option_debugging_mode.toString());
        if (customizableCheckBoxPreference != null) {
            customizableCheckBoxPreference.setModelPreference(findPreference2);
            customizableCheckBoxPreference.setLayoutResource(findPreference2);
            TouchPalOption.m5428a((CheckBoxPreference) customizableCheckBoxPreference, 63);
        }
        CustomizablePreference customizablePreference6 = (CustomizablePreference) findPreference(C1135d.option_rebuild_language_data.toString());
        if (customizablePreference6 != null) {
            customizablePreference6.setModelPreference(findPreference2);
            customizablePreference6.setLayoutResource(findPreference2);
            customizablePreference6.setOnPreferenceClickListener(new C1074aK(this));
        }
        Preference findPreference6 = findPreference(C1135d.option_update_freq.toString());
        this.f2893G = (CustomizablePreference) findPreference(C1135d.option_update_dic.toString());
        if (this.f2893G != null) {
            this.f2893G.setModelPreference(findPreference6);
            this.f2893G.setOnPreferenceClickListener(new C1078aO(this));
            if (!this.f2889B) {
                TPreferenceScreen tPreferenceScreen3 = (TPreferenceScreen) findPreference(C1135d.option_help_update_screen.toString());
                m5479a(tPreferenceScreen3, this.f2896J);
                if (tPreferenceScreen3 != null) {
                    tPreferenceScreen3.removePreference(this.f2893G);
                }
            }
        }
        CustomizablePreference customizablePreference7 = (CustomizablePreference) findPreference(C1135d.option_update_software.toString());
        if (customizablePreference7 != null) {
            customizablePreference7.setModelPreference(findPreference6);
            customizablePreference7.setOnPreferenceClickListener(new C1079aP(this));
        }
        if (findPreference3 != null) {
            findPreference3.setOnPreferenceClickListener(new C1080aQ(this));
        }
        if (findPreference4 != null) {
            findPreference4.setIntent(TouchPalOption.m5421a((Context) this));
            findPreference4.setOnPreferenceClickListener(new C1082aS(this));
        }
        if (findPreference5 != null) {
            findPreference5.setOnPreferenceClickListener(new C1083aT(this));
        }
        if (checkBoxPreference2 != null) {
            TouchPalOption.m5428a(checkBoxPreference2, (int) com.cootek.smartinput5.engine.Settings.USERDATA_COLLECT_ENABLE);
        }
        Preference findPreference7 = findPreference(C1135d.option_beta.toString());
        if (findPreference7 != null) {
            findPreference7.setOnPreferenceClickListener(new C1085aV(this));
        }
        Preference findPreference8 = findPreference(C1135d.option_special_thanks.toString());
        if (findPreference8 != null) {
            findPreference8.setIntent(TouchPalOption.m5440d(this));
            findPreference8.setOnPreferenceClickListener(new C1086aW(this));
        }
        if (tPreferenceScreen != null && !this.f2888A) {
            this.f2903g.removePreference(tPreferenceScreen);
        } else if (findPreference != null) {
            findPreference.setOnPreferenceClickListener(new C1087aX(this));
        }
        if (tPreferenceScreen2 != null) {
            tPreferenceScreen2.setOnPreferenceClickListener(new C1088aY(this));
        }
        if (findPreference2 != null) {
            findPreference2.setOnPreferenceClickListener(new C1089aZ(this));
        }
        this.f2913q = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m5471L() {
        new TouchPalOption.C1046b(this.f2890D, new C1149bb(this, new C1659T(this.f2890D)), false).execute(new String[0]);
        C1246d.m6010a(this.f2890D).mo4591a("DICT_RECOVERY/USER_DICT_REBUILD", "CLICK", C1246d.f3836c);
    }

    /* renamed from: M */
    private void m5472M() {
        this.f2915s = false;
        this.f2916t = false;
        this.f2917u = false;
        this.f2919w = false;
        this.f2918v = false;
        this.f2920x = false;
        this.f2921y = false;
        this.f2922z = false;
        this.f2888A = false;
        this.f2889B = false;
        C1389aD o = C1368X.m6320c().mo5842o();
        String[] h = o.mo5947h();
        for (String str : h) {
            C1498a l = o.mo5954l(str);
            if (l != null && l.mo6156f()) {
                if (!this.f2889B) {
                    this.f2889B = com.cootek.smartinput5.engine.Settings.getInstance().getBoolSetting(com.cootek.smartinput5.engine.Settings.UPDATE_LIVE_WORDS);
                }
                if (str.equals(C1549b.f4832c)) {
                    this.f2920x = true;
                    this.f2915s = true;
                } else if (str.equals(C1549b.f4834e)) {
                    this.f2915s = true;
                    this.f2916t = true;
                } else if (str.matches(C1549b.f4836g)) {
                    this.f2915s = true;
                    this.f2917u = true;
                } else if (str.equals(C1549b.f4831b)) {
                    this.f2915s = true;
                    this.f2918v = true;
                } else if (str.equals(C1549b.f4833d)) {
                    this.f2915s = true;
                    this.f2919w = true;
                } else if (str.equals(C1549b.f4837h)) {
                    this.f2915s = true;
                    this.f2921y = true;
                } else if (str.equals(C1549b.f4813ai)) {
                    this.f2915s = true;
                    this.f2922z = true;
                }
            }
        }
        this.f2888A = C1368X.m6320c().mo5848u().mo5599c();
    }

    /* renamed from: c */
    private String m5484c(int i) {
        String str;
        if (this.f2918v) {
            str = C1549b.f4831b;
        } else if (this.f2920x) {
            str = C1549b.f4832c;
        } else if (this.f2917u) {
            str = C1549b.f4835f;
        } else if (this.f2916t) {
            str = C1549b.f4834e;
        } else if (this.f2921y) {
            str = C1549b.f4837h;
        } else if (this.f2919w) {
            str = C1549b.f4833d;
        } else {
            str = this.f2922z ? C1549b.f4813ai : null;
        }
        if (str != null) {
            return C1368X.m6320c().mo5835h().getLanguageCategory(str, i);
        }
        return null;
    }

    /* renamed from: a */
    public void mo4241a(boolean z) {
        if (z && C1368X.m6324d()) {
            C1368X.m6320c().mo5827M().mo5998d(3);
        }
    }

    /* renamed from: a */
    public void mo4239a(int i) {
    }

    /* renamed from: g */
    public int mo4250g() {
        return -1;
    }

    /* renamed from: h */
    public void mo4251h() {
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m5473N() {
        if (com.cootek.smartinput5.engine.Settings.getInstance().getBoolSetting(com.cootek.smartinput5.engine.Settings.SHOW_WAVE_TUTORIAL_DIALOG)) {
            com.cootek.smartinput5.engine.Settings.getInstance().setBoolSetting(com.cootek.smartinput5.engine.Settings.SHOW_WAVE_TUTORIAL_DIALOG, false);
            new C2894d.C2895a(this.f2890D).setMessage(mo7241b((int) R.string.paopao_enable_wave_dialog)).setPositiveButton(mo7241b((int) R.string.paopao_enable_wave_dialog_positive_button), new C1150bc(this)).setNegativeButton(mo7241b((int) R.string.paopao_enable_wave_dialog_negetive_button), (DialogInterface.OnClickListener) null).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m5474O() {
        Dialog dialog = new Dialog(this.f2902f.getContext());
        dialog.requestWindowFeature(1);
        View inflate = ((LayoutInflater) this.f2890D.getSystemService("layout_inflater")).inflate(R.layout.dialog_with_title, (ViewGroup) null, false);
        dialog.getWindow().getDecorView().setBackgroundDrawable((Drawable) null);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        ((LinearLayout) textView.getParent()).findViewById(R.id.sub_title).setVisibility(8);
        textView.setText(C1974m.m9063a(this.f2890D, (int) R.string.trad_simp_convert_dialog_title));
        textView.setGravity(17);
        ((FrameLayout) inflate.findViewById(R.id.content_frame)).addView(new C1922A(this.f2902f.getContext(), dialog, (C1924C.C1925a) new C1151bd(this)).mo7084b());
        BottomBtnsFrame bottomBtnsFrame = (BottomBtnsFrame) inflate.findViewById(R.id.buttons_frame);
        bottomBtnsFrame.getPositiveBtn().setVisibility(8);
        bottomBtnsFrame.mo8486a();
        bottomBtnsFrame.getNegertiveBtn().setOnClickListener(new C1152be(this, dialog));
        dialog.setContentView(inflate);
        dialog.show();
    }

    /* renamed from: P */
    private void m5475P() {
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_update_dic.toString());
        TPreferenceScreen tPreferenceScreen = (TPreferenceScreen) findPreference(C1135d.option_help_update_screen.toString());
        if (this.f2893G != null) {
            if (customizablePreference != null) {
                if (!this.f2889B && tPreferenceScreen != null) {
                    tPreferenceScreen.removePreference(this.f2893G);
                }
            } else if (this.f2889B && tPreferenceScreen != null) {
                tPreferenceScreen.addPreference(this.f2893G);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m5476Q() {
        startActivity(new Intent(this.f2890D, TouchPalFAQActivity.class));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return TouchPalOption.m5434a(menu);
    }

    /* renamed from: a */
    public boolean mo4242a(MenuItem menuItem) {
        return TouchPalOption.m5433a((Context) this, menuItem);
    }

    /* renamed from: i */
    public void mo4252i() {
        m5463D();
    }
}
