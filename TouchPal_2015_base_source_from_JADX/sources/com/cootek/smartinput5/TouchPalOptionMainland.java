package com.cootek.smartinput5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import android.widget.Toast;
import com.cootek.smartinput.p044a.C0978q;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.cust.CustomizeSettings;
import com.cootek.smartinput5.cust.ShortcutSettings;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1372a;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1396aI;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1594bS;
import com.cootek.smartinput5.func.HandWriteManager;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.p055ui.C1977c;
import com.cootek.smartinput5.func.resource.p055ui.TPreferenceScreen;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.settings.CustomizableCheckBoxPreference;
import com.cootek.smartinput5.p066ui.settings.CustomizablePreference;
import com.cootek.smartinput5.p066ui.settings.EmojiDisplayDialogPreference;
import com.cootek.smartinput5.p066ui.settings.HandwriteActivity;
import com.cootek.smartinput5.p066ui.settings.KeyboardCustomizeActivity;
import com.cootek.smartinput5.p066ui.settings.LanguageListActivity;
import com.cootek.smartinput5.p066ui.settings.SkinActivity;
import com.cootek.smartinput5.p066ui.settings.TouchPalCloudActivity;
import com.cootek.smartinput5.p066ui.settings.TypingSpeedActivity;
import com.cootek.smartinput5.p066ui.settings.VoiceInputEngineDialogPreference;
import com.cootek.smartinput5.p066ui.settings.VoiceInputLanguageDialogPreference;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.List;

public class TouchPalOptionMainland extends C1977c implements HandWriteManager.C1349a, C1389aD.C1390a, C1396aI.C1397a {

    /* renamed from: a */
    private static final String f2923a = "TouchPalOption";

    /* renamed from: b */
    private static final int f2924b = 10;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f2925c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f2926d = 0;

    /* renamed from: e */
    private ListView f2927e = null;

    /* renamed from: f */
    private boolean f2928f;

    /* renamed from: c */
    static /* synthetic */ int m5550c(TouchPalOptionMainland touchPalOptionMainland) {
        int i = touchPalOptionMainland.f2926d + 1;
        touchPalOptionMainland.f2926d = i;
        return i;
    }

    /* renamed from: a */
    public void mo4240a(Bundle bundle) {
        C1368X.m6317b((Context) this);
        this.f2925c = this;
        addPreferencesFromResource(R.layout.option);
        this.f2927e = (ListView) findViewById(16908298);
        setTitle(mo7241b((int) R.string.app_name_mainland));
        m5563o();
        if (!m5561m()) {
            Toast.makeText(this, mo7241b((int) R.string.option_warning_ime_not_default), 1).show();
        }
        C1368X.m6320c().mo5842o().mo5929a((C1389aD.C1390a) this);
        C1368X.m6320c().mo5848u().mo5596a((HandWriteManager.C1349a) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4243b() {
        this.f2928f = Settings.getInstance().getBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE);
        if (!C1584bI.m7153f(this) || !C1584bI.m7149c(this)) {
            finish();
            Guide.m5263a((Context) this);
        }
        m5565q();
        m5559i();
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5827M().mo5998d(3);
        }
    }

    /* renamed from: i */
    private void m5559i() {
        EmojiDisplayDialogPreference emojiDisplayDialogPreference = (EmojiDisplayDialogPreference) findPreference(C1135d.option_emoji_display.toString());
        if (emojiDisplayDialogPreference != null) {
            emojiDisplayDialogPreference.updateSummary();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4245c() {
        if (this.f2928f != Settings.getInstance().getBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE) && Engine.isInitialized()) {
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

    /* renamed from: a */
    public void mo4238a() {
        C1368X.m6320c().mo5842o().mo5937b((C1389aD.C1390a) this);
        C1368X.m6320c().mo5848u().mo5598b((HandWriteManager.C1349a) this);
        C1368X.m6325e();
        m5560l();
        System.gc();
    }

    /* renamed from: a */
    public void mo4241a(boolean z) {
        if (z && C1368X.m6324d()) {
            C1368X.m6320c().mo5827M().mo5998d(3);
        }
    }

    /* renamed from: l */
    private void m5560l() {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("root");
        if (preferenceScreen != null) {
            preferenceScreen.removeAll();
        }
    }

    /* renamed from: m */
    private boolean m5561m() {
        List<InputMethodInfo> enabledInputMethodList = ((InputMethodManager) getApplicationContext().getSystemService("input_method")).getEnabledInputMethodList();
        for (int i = 0; i < enabledInputMethodList.size(); i++) {
            if (enabledInputMethodList.get(i).getPackageName().equalsIgnoreCase(getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo4248e() {
        m5562n();
    }

    /* renamed from: n */
    private void m5562n() {
        m5564p();
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("root");
        if (preferenceScreen != null) {
            onNewIntent(getIntent());
            preferenceScreen.removeAll();
            addPreferencesFromResource(R.layout.option);
            m5563o();
        }
    }

    /* renamed from: f */
    public void mo4249f() {
        m5562n();
    }

    /* renamed from: o */
    private void m5563o() {
        C1132b.m5654a((Context) this).mo4405a((PreferenceGroup) getPreferenceScreen());
        TouchPalOption.m5428a((CheckBoxPreference) findPreference("OptionSlideDown"), 7);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_predict.toString()), 1);
        TouchPalOption.m5429a((CheckBoxPreference) findPreference(C1135d.option_space_get_next_word.toString()), 36, 14, "chinese");
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_auto_space.toString()), 37);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_auto_capitalization.toString()), 54);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_spell_check.toString()), 33);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_paopao.toString()), 76);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_correct_mistyping.toString()), 9);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_auto_correction.toString()), 59);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_animation_effect.toString()), 87);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_commit_animation.toString()), (int) Settings.COMMIT_ANIMATION_ENABLED);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_stroke_filter.toString()), 8);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_enable_slip_change_surface.toString()), 5);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_wubi_GBK.toString()), 43);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_keyboard_num_line_style.toString()), (int) Settings.KEYBOARD_NUMBER_ROW_STYLE);
        TouchPalOption.m5428a((CheckBoxPreference) findPreference(C1135d.option_forbid_simple_candidate_style.toString()), (int) Settings.FORBID_SIMPLE_CANDIDATE_STYLE);
        TPreferenceScreen tPreferenceScreen = (TPreferenceScreen) findPreference(C1135d.option_general_screen.toString());
        m5544a(tPreferenceScreen, this.f2927e);
        CustomizableCheckBoxPreference customizableCheckBoxPreference = (CustomizableCheckBoxPreference) findPreference(C1135d.option_accessibility.toString());
        if (customizableCheckBoxPreference != null) {
            TouchPalOption.m5428a((CheckBoxPreference) customizableCheckBoxPreference, (int) Settings.ACCESSIBILITY_ENABLED);
            customizableCheckBoxPreference.setEnabled(false);
            C1368X.m6320c().mo5844q().mo5860a((C1372a.C1373a) new C1159bl(this, customizableCheckBoxPreference));
        }
        CustomizableCheckBoxPreference customizableCheckBoxPreference2 = (CustomizableCheckBoxPreference) findPreference(C1135d.option_landscape_screen_mode.toString());
        if (customizableCheckBoxPreference2 != null) {
            customizableCheckBoxPreference2.setChecked(Settings.getInstance().getIntSetting(Settings.LANDSCAPE_SCREEN_MODE) == 0);
            customizableCheckBoxPreference2.setOnPreferenceClickListener(new C1170bw(this, customizableCheckBoxPreference2));
        }
        VoiceInputEngineDialogPreference voiceInputEngineDialogPreference = (VoiceInputEngineDialogPreference) findPreference(C1135d.option_voice_input_engine_selector.toString());
        voiceInputEngineDialogPreference.updateSummary();
        if (voiceInputEngineDialogPreference != null && !C0978q.m5062a(this.f2925c)) {
            tPreferenceScreen.removePreference(voiceInputEngineDialogPreference);
        }
        VoiceInputLanguageDialogPreference voiceInputLanguageDialogPreference = (VoiceInputLanguageDialogPreference) findPreference(C1135d.option_voice_input_language_selector.toString());
        if (voiceInputLanguageDialogPreference != null && !C0978q.m5062a(this.f2925c)) {
            tPreferenceScreen.removePreference(voiceInputLanguageDialogPreference);
        }
        EmojiDisplayDialogPreference emojiDisplayDialogPreference = (EmojiDisplayDialogPreference) findPreference(C1135d.option_emoji_display.toString());
        if (emojiDisplayDialogPreference != null) {
            tPreferenceScreen.removePreference(emojiDisplayDialogPreference);
        }
        Preference findPreference = findPreference(C1135d.option_chs_handwriting.toString());
        if (findPreference != null) {
            findPreference.setIntent(new Intent(this, HandwriteActivity.class));
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(C1135d.option_predict_next_word_chs.toString());
        if (checkBoxPreference != null) {
            TouchPalOption.m5429a(checkBoxPreference, 2, 4, C1368X.m6320c().mo5835h().getLanguageCategory(C1549b.f4831b, 4));
        }
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference(C1135d.option_advanced_prediction.toString());
        if (checkBoxPreference2 != null) {
            String languageCategory = C1368X.m6320c().mo5835h().getLanguageCategory(C1549b.f4791a, 4);
            checkBoxPreference2.setChecked(Settings.getInstance().getAdvancedPredictionSetting());
            checkBoxPreference2.setOnPreferenceClickListener(new C1141bF(this, checkBoxPreference2, languageCategory));
        }
        ((CheckBoxPreference) findPreference(C1135d.option_auto_correction.toString())).setDependency(C1135d.option_predict.toString());
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
        Preference findPreference2 = findPreference(C1135d.option_select_all.toString());
        if (findPreference2 != null) {
            findPreference2.setOnPreferenceClickListener(new C1142bG(this, arrayList));
        }
        Preference findPreference3 = findPreference(C1135d.option_clear_all.toString());
        if (findPreference3 != null) {
            findPreference3.setOnPreferenceClickListener(new C1143bH(this, arrayList));
        }
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) findPreference("OptionTouchCorrect");
        TPreferenceScreen tPreferenceScreen2 = (TPreferenceScreen) findPreference(C1135d.option_smart_input_screen.toString());
        m5544a(tPreferenceScreen2, this.f2927e);
        if (Build.VERSION.SDK_INT >= 9) {
            TouchPalOption.m5428a(checkBoxPreference3, 39);
        } else if (!(tPreferenceScreen2 == null || checkBoxPreference3 == null)) {
            tPreferenceScreen2.removePreference(checkBoxPreference3);
        }
        Preference findPreference4 = findPreference("OptionOneStopDownload");
        if (findPreference4 != null) {
            findPreference4.setOnPreferenceClickListener(new C1144bI(this));
        }
        Preference findPreference5 = findPreference(C1135d.option_customize_symbols.toString());
        if (findPreference5 != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClass(this, CustomizeSettings.class);
            findPreference5.setIntent(intent);
        }
        Preference findPreference6 = findPreference(C1135d.option_short_cut_input.toString());
        if (findPreference6 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setClass(this, ShortcutSettings.class);
            findPreference6.setIntent(intent2);
        }
        Preference findPreference7 = findPreference(C1135d.option_update_software.toString());
        if (findPreference7 != null) {
            findPreference7.setOnPreferenceClickListener(new C1145bJ(this));
        }
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_customize_keyboard_size.toString());
        if (customizablePreference != null) {
            if (C1594bS.m7176a(C1368X.m6313b())) {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setClass(this, KeyboardCustomizeActivity.class);
                customizablePreference.setIntent(intent3);
            } else if (tPreferenceScreen != null) {
                tPreferenceScreen.removePreference(customizablePreference);
            }
        }
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) findPreference(C1135d.option_onehanded_layout.toString());
        if (checkBoxPreference4 != null) {
            if (C1594bS.m7176a(C1368X.m6313b())) {
                checkBoxPreference4.setChecked(Settings.getInstance().getBoolSetting(Settings.ONE_HANDED_LAYOUT));
                checkBoxPreference4.setOnPreferenceClickListener(new C1146bK(this, checkBoxPreference4));
            } else if (tPreferenceScreen != null) {
                tPreferenceScreen.removePreference(checkBoxPreference4);
            }
        }
        TPreferenceScreen tPreferenceScreen3 = (TPreferenceScreen) findPreference(C1135d.option_skin.toString());
        if (tPreferenceScreen3 != null) {
            m5544a(tPreferenceScreen3, this.f2927e);
            Intent intent4 = new Intent("android.intent.action.VIEW");
            intent4.setClass(this, SkinActivity.class);
            intent4.putStringArrayListExtra(SkinActivity.f13621a, C1368X.m6320c().mo5841n().mo6297s());
            tPreferenceScreen3.setIntent(intent4);
        }
        Preference findPreference8 = findPreference(C1135d.option_language_screen.toString());
        if (findPreference8 != null) {
            Intent intent5 = new Intent("android.intent.action.VIEW");
            intent5.setClass(this, LanguageListActivity.class);
            findPreference8.setIntent(intent5);
        }
        Preference findPreference9 = findPreference(C1135d.option_dict_manage.toString());
        if (findPreference9 != null) {
            Intent intent6 = new Intent("android.intent.action.VIEW");
            intent6.setClass(this, TouchPalCloudActivity.class);
            findPreference9.setIntent(intent6);
            findPreference9.setOnPreferenceClickListener(new C1147bL(this));
        }
        Preference findPreference10 = findPreference(C1135d.option_update_dic.toString());
        if (findPreference10 != null) {
            findPreference10.setOnPreferenceClickListener(new C1160bm(this));
        }
        Preference findPreference11 = findPreference(C1135d.opton_share.toString());
        if (findPreference11 != null) {
            findPreference11.setOnPreferenceClickListener(new C1161bn(this));
        }
        TPreferenceScreen tPreferenceScreen4 = (TPreferenceScreen) findPreference(C1135d.option_speed_screen.toString());
        if (tPreferenceScreen4 != null) {
            m5544a(tPreferenceScreen4, this.f2927e);
            tPreferenceScreen4.setOnPreferenceClickListener(new C1162bo(this));
        }
        Preference findPreference12 = findPreference(C1135d.option_help_on_web.toString());
        if (findPreference12 != null) {
            findPreference12.setOnPreferenceClickListener(new C1163bp(this));
        }
        CustomizablePreference customizablePreference2 = (CustomizablePreference) findPreference(C1135d.option_feedback.toString());
        if (customizablePreference2 != null) {
            customizablePreference2.setModelPreference(findPreference12);
            customizablePreference2.setIntent(TouchPalOption.m5439c(this));
            customizablePreference2.setOnPreferenceClickListener(new C1164bq(this));
        }
        CustomizablePreference customizablePreference3 = (CustomizablePreference) findPreference(C1135d.option_feedback_uservoice.toString());
        if (customizablePreference3 != null) {
            customizablePreference3.setModelPreference(findPreference12);
            customizablePreference3.setOnPreferenceClickListener(new C1165br(this));
        }
        Preference findPreference13 = findPreference(C1135d.option_feedback_forum.toString());
        if (findPreference13 != null) {
            findPreference13.setOnPreferenceClickListener(new C1166bs(this));
        }
        Preference findPreference14 = findPreference(C1135d.option_feedback_weibo.toString());
        if (findPreference14 != null) {
            findPreference14.setOnPreferenceClickListener(new C1167bt(this));
        }
        Preference findPreference15 = findPreference(C1135d.option_all_products.toString());
        if (findPreference15 != null) {
            findPreference15.setOnPreferenceClickListener(new C1168bu(this));
        }
        Preference findPreference16 = findPreference(C1135d.option_visit_handwriting_provider_website.toString());
        if (findPreference16 != null) {
            findPreference16.setOnPreferenceClickListener(new C1169bv(this));
        }
        m5544a((TPreferenceScreen) findPreference(C1135d.option_help_update_screen.toString()), this.f2927e);
        Preference findPreference17 = findPreference(C1135d.privacy.toString());
        if (findPreference17 != null) {
            findPreference17.setOnPreferenceClickListener(new C1171bx(this));
        }
        CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) findPreference(C1135d.option_send_usage_statistics.toString());
        if (checkBoxPreference5 != null) {
            TouchPalOption.m5428a(checkBoxPreference5, (int) Settings.USERDATA_COLLECT_ENABLE);
        }
        Preference findPreference18 = findPreference(C1135d.option_follow_us_mainland.toString());
        if (findPreference18 != null) {
            findPreference18.setOnPreferenceClickListener(new C1172by(this));
        }
        TPreferenceScreen tPreferenceScreen5 = (TPreferenceScreen) findPreference(C1135d.option_version_screen.toString());
        if (tPreferenceScreen5 != null) {
            m5544a(tPreferenceScreen5, this.f2927e);
            tPreferenceScreen5.setOnPreferenceClickListener(new C1173bz(this));
        }
        Preference findPreference19 = findPreference(C1135d.option_version_band.toString());
        if (findPreference19 != null) {
            findPreference19.setOnPreferenceClickListener(new C1136bA(this));
        }
        m5564p();
    }

    /* renamed from: a */
    private void m5544a(TPreferenceScreen tPreferenceScreen, ListView listView) {
        if (tPreferenceScreen != null) {
            tPreferenceScreen.updateListParams(listView);
        }
    }

    /* renamed from: p */
    private void m5564p() {
        TPreferenceScreen tPreferenceScreen = (TPreferenceScreen) findPreference(C1135d.option_smart_input_screen.toString());
        m5544a(tPreferenceScreen, this.f2927e);
        PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference(C1135d.option_chinese_input_screen.toString());
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("root");
        TPreferenceScreen tPreferenceScreen2 = (TPreferenceScreen) findPreference(C1135d.option_chs_handwriting.toString());
        m5544a(tPreferenceScreen2, this.f2927e);
        Preference findPreference = findPreference(C1135d.option_wubi_GBK.toString());
        Preference findPreference2 = findPreference(C1135d.option_stroke_filter.toString());
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_traditional_chs.toString());
        TPreferenceScreen tPreferenceScreen3 = (TPreferenceScreen) findPreference(C1135d.option_fuzzy_pinyin.toString());
        m5544a(tPreferenceScreen3, this.f2927e);
        Preference findPreference3 = findPreference(C1135d.option_shuang_pin.toString());
        TPreferenceScreen tPreferenceScreen4 = (TPreferenceScreen) findPreference(C1135d.option_help_about_screen.toString());
        m5544a(tPreferenceScreen4, this.f2927e);
        TPreferenceScreen tPreferenceScreen5 = (TPreferenceScreen) findPreference(C1135d.option_about_handwriting.toString());
        m5544a(tPreferenceScreen5, this.f2927e);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(C1135d.option_wubi_auto_adjust_freq.toString());
        if (preferenceScreen != null) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            String[] h = C1368X.m6320c().mo5842o().mo5947h();
            for (String str : h) {
                if (str.equals(C1549b.f4832c)) {
                    z = true;
                } else if (str.equals(C1549b.f4834e)) {
                    z = true;
                } else if (str.matches(C1549b.f4836g)) {
                    z = true;
                    z2 = true;
                } else if (str.equals(C1549b.f4831b)) {
                    z = true;
                    z3 = true;
                } else if (str.equals(C1549b.f4833d)) {
                    z = true;
                    z4 = true;
                }
            }
            boolean c = C1368X.m6320c().mo5848u().mo5599c();
            if (!(z || tPreferenceScreen == null || preferenceGroup == null)) {
                tPreferenceScreen.removePreference(preferenceGroup);
            }
            if (!(c || tPreferenceScreen4 == null || tPreferenceScreen5 == null)) {
                tPreferenceScreen4.removePreference(tPreferenceScreen5);
            }
            if (!z2 && !z3 && preferenceGroup != null && tPreferenceScreen2 != null) {
                preferenceGroup.removePreference(tPreferenceScreen2);
            }
            if (customizablePreference != null) {
                customizablePreference.setModelPreference(findPreference2);
                customizablePreference.setLayoutResource(findPreference2);
                m5565q();
                customizablePreference.setOnPreferenceClickListener(new C1137bB(this));
            }
            if (!z3) {
                if (!(preferenceGroup == null || findPreference2 == null || tPreferenceScreen3 == null)) {
                    preferenceGroup.removePreference(findPreference2);
                    preferenceGroup.removePreference(tPreferenceScreen3);
                }
                if (!(preferenceGroup == null || findPreference3 == null)) {
                    preferenceGroup.removePreference(findPreference3);
                }
            }
            if (!(z4 || preferenceGroup == null || findPreference == null)) {
                preferenceGroup.removePreference(findPreference);
            }
            if (checkBoxPreference == null) {
                return;
            }
            if (z4) {
                TouchPalOption.m5428a(checkBoxPreference, 52);
            } else if (preferenceGroup != null) {
                preferenceGroup.removePreference(checkBoxPreference);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m5565q() {
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

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5545a(String str) {
        C1584bI.m7145b(this, new C1139bD(this, str), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5549b(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            C1584bI.m7130a(this.f2925c, intent, 0);
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m5566r() {
        CustomizableCheckBoxPreference customizableCheckBoxPreference = (CustomizableCheckBoxPreference) findPreference(C1135d.option_speed_dometer.toString());
        TouchPalOption.m5428a((CheckBoxPreference) customizableCheckBoxPreference, 84);
        CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_speed_view.toString());
        if (customizablePreference != null) {
            customizablePreference.setModelPreference(customizableCheckBoxPreference);
            customizablePreference.setLayoutResource(customizableCheckBoxPreference);
            customizablePreference.setIntent(TypingSpeedActivity.m14134a((Context) this));
            customizablePreference.setOnPreferenceClickListener(new C1140bE(this));
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

    /* renamed from: a */
    public boolean mo4254a(Menu menu) {
        return TouchPalOption.m5434a(menu);
    }

    /* renamed from: a */
    public boolean mo4242a(MenuItem menuItem) {
        return TouchPalOption.m5433a((Context) this, menuItem);
    }
}
