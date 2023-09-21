package com.cootek.smartinput5.p066ui.settings;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1396aI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1608bk;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.p055ui.C1977c;
import com.cootek.smartinput5.net.login.TCloudShowActivity;
import com.cootek.smartinput5.p045a.C1063f;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.C2618H;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.TouchPalCloudActivity */
public class TouchPalCloudActivity extends C1977c implements C1608bk.C1610b {

    /* renamed from: n */
    private static final int f13731n = 1;

    /* renamed from: o */
    private static final int f13732o = 0;

    /* renamed from: p */
    private static final int f13733p = 1;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f13734a;

    /* renamed from: b */
    private CustomizablePreference f13735b;

    /* renamed from: c */
    private CustomizablePreference f13736c;

    /* renamed from: d */
    private CustomizablePreference f13737d;

    /* renamed from: e */
    private CustomizablePreference f13738e;

    /* renamed from: f */
    private CustomizablePreference f13739f;

    /* renamed from: g */
    private CustomizablePreference f13740g;

    /* renamed from: h */
    private CustomCheckBoxPreference f13741h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public CustomizablePreference f13742i;

    /* renamed from: j */
    private CustomizablePreference f13743j;

    /* renamed from: k */
    private CustomizableCheckBoxPreference f13744k;

    /* renamed from: l */
    private CustomizableCheckBoxPreference f13745l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ProgressDialog f13746m;

    /* renamed from: q */
    private int f13747q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Handler f13748r = new C3190db(this);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13734a = this;
        C1368X.m6317b((Context) this);
        addPreferencesFromResource(R.layout.setting_touchpal_cloud);
        C1132b.m5654a((Context) this).mo4405a((PreferenceGroup) getPreferenceScreen());
        setTitle(mo7241b(C1593bR.m7162a().mo6232a(1)));
        this.f13746m = new ProgressDialog(this.f13734a);
        this.f13746m.setProgressStyle(0);
        this.f13746m.setCanceledOnTouchOutside(false);
        if (C1593bR.m7162a().f5075a && TextUtils.isEmpty(C1617br.m7367a().mo6340g().mo7964d())) {
            startActivityForResult(new Intent(this.f13734a, TCloudShowActivity.class), 1);
        }
        C1368X.m6320c().mo5846s().mo6310a((C1608bk.C1610b) this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f13746m != null) {
            this.f13746m.dismiss();
            this.f13746m = null;
        }
        C1368X.m6320c().mo5846s().mo6312b((C1608bk.C1610b) this);
        Settings.getInstance().writeBack();
        super.onDestroy();
        m14083e();
        C1368X.m6325e();
        System.gc();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        m14091h();
        super.onResume();
    }

    /* renamed from: e */
    private void m14083e() {
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("root");
        if (preferenceScreen != null) {
            preferenceScreen.removeAll();
        }
        this.f13735b = null;
        this.f13736c = null;
        this.f13737d = null;
        this.f13738e = null;
        this.f13739f = null;
        this.f13740g = null;
        this.f13741h = null;
        this.f13742i = null;
        m14088g();
    }

    /* renamed from: f */
    private void m14085f() {
        this.f13744k = (CustomizableCheckBoxPreference) findPreference(C1135d.option_enable_super_dict.toString());
        this.f13743j = (CustomizablePreference) findPreference(C1135d.option_uninstall_super_dict.toString());
        if (this.f13743j != null) {
            this.f13743j.setModelPreference(this.f13745l);
            this.f13743j.setLayoutResource(this.f13747q);
        }
    }

    /* renamed from: g */
    private void m14088g() {
        this.f13743j = null;
        this.f13744k = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m14091h() {
        String str;
        String str2 = null;
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference(C1135d.option_category_cloud_services.toString());
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) findPreference(C1135d.option_category_personalization.toString());
        PreferenceCategory preferenceCategory3 = (PreferenceCategory) findPreference(C1135d.option_category_account.toString());
        this.f13745l = (CustomizableCheckBoxPreference) findPreference(C1135d.option_live_words.toString());
        if (this.f13745l != null) {
            this.f13747q = this.f13745l.getLayoutResource();
        }
        m14085f();
        if (C1593bR.m7162a().f5076b) {
            PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("root");
            if (preferenceScreen != null) {
                if (preferenceCategory3 != null) {
                    preferenceScreen.removePreference(preferenceCategory3);
                }
                if (preferenceCategory != null) {
                    preferenceScreen.removePreference(preferenceCategory);
                }
            }
        } else {
            if (this.f13745l != null) {
                this.f13745l.setChecked(Settings.getInstance().getBoolSetting(Settings.UPDATE_LIVE_WORDS));
                String a = TouchPalOption.m5424a(this.f13734a, Settings.getInstance().getLongSetting(Settings.HOTWORD_LAST_UPDATE_TIME));
                String b = mo7241b((int) R.string.optpage_live_words_summary);
                if (b != null && b.startsWith(C1063f.f3053e)) {
                    b = null;
                }
                if (!this.f13745l.isChecked() || TextUtils.isEmpty(a)) {
                    this.f13745l.setSummary(b);
                } else {
                    this.f13745l.setSummary(mo7237a((int) R.string.optpage_live_words_update_summary, a));
                }
                this.f13745l.setOnPreferenceClickListener(new C3205dq(this, b));
            }
            CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_backup_sync_screen.toString());
            if (customizablePreference != null) {
                customizablePreference.setModelPreference(this.f13745l);
                customizablePreference.setLayoutResource(this.f13747q);
                customizablePreference.setOnPreferenceClickListener(new C3168dF(this));
            }
            TouchPalOption.m5428a((CheckBoxPreference) (CustomizableCheckBoxPreference) findPreference(C1135d.option_service_wifi_only.toString()), (int) Settings.CLOUD_SERVICE_WIFI_ONLY);
            CustomizableCheckBoxPreference customizableCheckBoxPreference = (CustomizableCheckBoxPreference) findPreference(C1135d.option_cloud_prediction.toString());
            if (customizableCheckBoxPreference != null) {
                if (C1617br.m7367a().mo6335b()) {
                    customizableCheckBoxPreference.setChecked(Settings.getInstance().getBoolSetting(Settings.ARCTIC_CLOUD_INPUT_ENABLE));
                    customizableCheckBoxPreference.setOnPreferenceClickListener(new C3169dG(this));
                } else {
                    customizableCheckBoxPreference.setChecked(false);
                    customizableCheckBoxPreference.setOnPreferenceClickListener(new C3170dH(this));
                }
            }
            CustomizablePreference customizablePreference2 = (CustomizablePreference) findPreference(C1135d.option_account_log_op.toString());
            if (customizablePreference2 != null) {
                customizablePreference2.setModelPreference(this.f13745l);
                customizablePreference2.setLayoutResource(this.f13747q);
                if (TextUtils.isEmpty(C1617br.m7367a().mo6340g().mo7964d())) {
                    customizablePreference2.setTitle(mo7241b((int) R.string.vip_login));
                    customizablePreference2.setSummary((CharSequence) null);
                    customizablePreference2.setOnPreferenceClickListener(new C3171dI(this));
                } else {
                    customizablePreference2.setTitle(C1617br.m7367a().mo6340g().mo7964d());
                    customizablePreference2.setSummary(mo7241b((int) R.string.optpage_account_logout_summary));
                    customizablePreference2.setOnPreferenceClickListener(new C3172dJ(this));
                }
            }
        }
        this.f13740g = (CustomizablePreference) findPreference(C1135d.privacy.toString());
        if (this.f13740g != null) {
            this.f13740g.setModelPreference(this.f13745l);
            this.f13740g.setLayoutResource(this.f13747q);
            this.f13740g.setOnPreferenceClickListener(new C3175dM(this));
        }
        CustomizablePreference customizablePreference3 = (CustomizablePreference) findPreference(C1135d.option_cell_dictionary_screen.toString());
        if (customizablePreference3 != null) {
            customizablePreference3.setModelPreference(this.f13745l);
            customizablePreference3.setLayoutResource(this.f13747q);
            customizablePreference3.setOnPreferenceClickListener(new C3176dN(this));
        }
        this.f13742i = (CustomizablePreference) findPreference(C1135d.option_learn_twitter.toString());
        if (this.f13742i != null) {
            this.f13742i.setModelPreference(this.f13745l);
            this.f13742i.setLayoutResource(this.f13747q);
            if (C1593bR.m7162a().f5075a) {
                switch (Settings.getInstance().getIntSetting(Settings.TWITTER_LEARN_RESULT)) {
                    case 0:
                        str = null;
                        break;
                    default:
                        str = mo7241b((int) R.string.twitter_learn_second);
                        break;
                }
                this.f13742i.setSummary(str);
                this.f13742i.setOnPreferenceClickListener(new C3191dc(this));
            } else if (preferenceCategory2 != null) {
                preferenceCategory2.removePreference(this.f13742i);
            }
        }
        this.f13741h = (CustomCheckBoxPreference) findPreference(C1135d.option_learn_sms.toString());
        if (this.f13741h != null) {
            this.f13741h.setLayoutResource(this.f13747q);
            if (C1593bR.m7162a().f5075a) {
                this.f13741h.setCheckBoxVisibility(8);
                this.f13741h.setCustomViewOnClickListener(new C3192dd(this));
                switch (Settings.getInstance().getIntSetting(Settings.SMS_LEARN_RESULT)) {
                    case 0:
                        break;
                    default:
                        str2 = mo7241b((int) R.string.sms_learn_second);
                        break;
                }
                this.f13741h.setSummary(str2);
                this.f13741h.setOnPreferenceClickListener(new C3193de(this));
            } else if (preferenceCategory2 != null) {
                preferenceCategory2.removePreference(this.f13741h);
            }
        }
        this.f13735b = (CustomizablePreference) findPreference(C1135d.option_import_contact.toString());
        if (this.f13735b != null) {
            this.f13735b.setModelPreference(this.f13745l);
            this.f13735b.setLayoutResource(this.f13747q);
            this.f13735b.setOnPreferenceClickListener(new C3194df(this));
        }
        this.f13736c = (CustomizablePreference) findPreference(C1135d.option_clear_language_data.toString());
        if (this.f13736c != null) {
            this.f13736c.setModelPreference(this.f13745l);
            this.f13736c.setLayoutResource(this.f13747q);
            this.f13736c.setOnPreferenceClickListener(new C3195dg(this));
        }
        this.f13737d = (CustomizablePreference) findPreference(C1135d.option_backup_dictionary.toString());
        if (this.f13737d != null) {
            this.f13737d.setModelPreference(this.f13745l);
            this.f13737d.setLayoutResource(this.f13747q);
            this.f13737d.setOnPreferenceClickListener(new C3196dh(this));
        }
        this.f13738e = (CustomizablePreference) findPreference(C1135d.option_restore_dictionary.toString());
        if (this.f13738e != null) {
            this.f13738e.setModelPreference(this.f13745l);
            this.f13738e.setLayoutResource(this.f13747q);
            this.f13738e.setOnPreferenceClickListener(new C3199dk(this));
        }
        this.f13739f = (CustomizablePreference) findPreference(C1135d.option_manage_user_word.toString());
        if (this.f13739f != null) {
            this.f13739f.setModelPreference(this.f13745l);
            this.f13739f.setLayoutResource(this.f13747q);
            if (!C1593bR.m7162a().f5076b) {
                this.f13739f.setOnPreferenceClickListener(new C3202dn(this));
            } else if (((PreferenceScreen) findPreference("root")) != null) {
                ((PreferenceCategory) findPreference(C1135d.option_category_manager_dictionary.toString())).removePreference(this.f13739f);
            }
        }
        CustomizablePreference customizablePreference4 = (CustomizablePreference) findPreference(C1135d.option_cloud_backup_restore.toString());
        if (customizablePreference4 != null) {
            customizablePreference4.setModelPreference(this.f13745l);
            customizablePreference4.setLayoutResource(this.f13747q);
            if (C1593bR.m7162a().f5077c || C1593bR.m7162a().f5075a || Build.VERSION.SDK_INT < 8) {
                ((PreferenceCategory) findPreference(C1135d.option_category_manager_dictionary.toString())).removePreference(customizablePreference4);
            } else {
                customizablePreference4.setModelPreference(this.f13745l);
                customizablePreference4.setOnPreferenceClickListener(new C3203do(this));
            }
        }
        m14099l();
    }

    /* renamed from: l */
    private void m14099l() {
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference(C1135d.option_category_manager_dictionary.toString());
        if (preferenceCategory != null) {
            CustomizableCheckBoxPreference customizableCheckBoxPreference = (CustomizableCheckBoxPreference) findPreference(C1135d.option_enable_super_dict.toString());
            CustomizablePreference customizablePreference = (CustomizablePreference) findPreference(C1135d.option_uninstall_super_dict.toString());
            if (customizablePreference != null) {
                customizablePreference.setLayoutResource(customizableCheckBoxPreference.getLayoutResource());
            }
            boolean o = C1368X.m6320c().mo5842o().mo5960o(C1549b.f4831b);
            C1368X.m6320c().mo5846s().mo6311b();
            if (C1593bR.m7162a().f5075a) {
                if (customizableCheckBoxPreference != null) {
                    preferenceCategory.removePreference(customizableCheckBoxPreference);
                }
                if (customizablePreference != null) {
                    preferenceCategory.removePreference(customizablePreference);
                    return;
                }
                return;
            }
            if (!o && Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED) && customizableCheckBoxPreference != null) {
                customizableCheckBoxPreference.setEnabled(false);
            }
            boolean z = customizableCheckBoxPreference == null;
            if (z) {
                customizableCheckBoxPreference = this.f13744k;
            }
            m14072a(customizableCheckBoxPreference, z);
            if (customizablePreference != null) {
                if (!Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
                    preferenceCategory.removePreference(customizablePreference);
                } else {
                    m14073a(customizablePreference, false);
                }
            } else if (this.f13743j != null && Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
                m14073a(this.f13743j, true);
            }
        }
    }

    /* renamed from: a */
    private void m14072a(CustomizableCheckBoxPreference customizableCheckBoxPreference, boolean z) {
        boolean z2 = true;
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference(C1135d.option_category_manager_dictionary.toString());
        if (preferenceCategory != null && customizableCheckBoxPreference != null) {
            customizableCheckBoxPreference.setSummary(m14100m());
            customizableCheckBoxPreference.setEnabled(true);
            if (!Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_ENABLED_UI) || !Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
                z2 = false;
            }
            customizableCheckBoxPreference.setChecked(z2);
            customizableCheckBoxPreference.setOnPreferenceClickListener(new C3204dp(this, customizableCheckBoxPreference));
            if (z) {
                preferenceCategory.addPreference(customizableCheckBoxPreference);
            }
        }
    }

    /* renamed from: m */
    private String m14100m() {
        if (Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED)) {
            return null;
        }
        if (C1368X.m6320c().mo5846s().mo6314c()) {
            return mo7241b((int) R.string.download_apk_inprogress);
        }
        return mo7241b((int) R.string.click_to_download_super_dict);
    }

    /* renamed from: a */
    private void m14073a(CustomizablePreference customizablePreference, boolean z) {
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference(C1135d.option_category_manager_dictionary.toString());
        if (preferenceCategory != null && customizablePreference != null) {
            customizablePreference.setModelPreference(this.f13745l);
            customizablePreference.setOnPreferenceClickListener(m14104o());
            if (z) {
                preferenceCategory.addPreference(customizablePreference);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m14103n() {
        new C2894d.C2895a(this.f13734a).setMessage(mo7241b((int) R.string.download_super_dict_dialog_msg)).setPositiveButton(mo7241b((int) R.string.ok), new C3207ds(this, (CheckBoxPreference) findPreference(C1135d.option_enable_super_dict.toString()))).setNegativeButton(mo7241b((int) R.string.cancel), new C3206dr(this)).show();
    }

    /* renamed from: o */
    private Preference.OnPreferenceClickListener m14104o() {
        return new C3209du(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m14107p() {
        C2894d.C2895a aVar = new C2894d.C2895a(this);
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.twitter_learn_dialog_content, (ViewGroup) null);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.follow_check_box);
        CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.tweet_check_box);
        EditText editText = (EditText) inflate.findViewById(R.id.tweet_share_content);
        TextView textView = (TextView) inflate.findViewById(R.id.tweet_number_limitation);
        checkBox.setChecked(true);
        checkBox2.setChecked(false);
        View findViewById = inflate.findViewById(R.id.follow_frame);
        View findViewById2 = inflate.findViewById(R.id.tweet_frame);
        findViewById.setOnClickListener(new C3212dx(this, checkBox));
        findViewById2.setOnClickListener(new C3213dy(this, checkBox2));
        checkBox2.setOnCheckedChangeListener(new C3214dz(this, editText, textView));
        editText.addTextChangedListener(new C3163dA(this, textView, editText));
        editText.setText(C1396aI.m6564d((Context) this));
        aVar.setView(inflate);
        aVar.setPositiveButton(mo7241b((int) R.string.learn_twitter_start), new C3164dB(this, checkBox, checkBox2, editText));
        aVar.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m14109q() {
        C2894d.C2895a aVar = new C2894d.C2895a(this);
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.clear_language_database_checkbox, (ViewGroup) null);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.clear_cloud_data_check_box);
        checkBox.setChecked(false);
        View findViewById = inflate.findViewById(R.id.clear_cloud_data_frame);
        findViewById.setOnClickListener(new C3165dC(this, checkBox));
        if (!C1617br.m7367a().mo6335b()) {
            findViewById.setVisibility(8);
        }
        aVar.setView(inflate);
        aVar.setPositiveButton(mo7241b(17039379), new C3166dD(this, checkBox));
        aVar.setNegativeButton(mo7241b(17039360), (DialogInterface.OnClickListener) null);
        aVar.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m14111r() {
        C2618H h = new C2618H(this.f13734a);
        h.mo8586e((int) R.drawable.arctic_predict_alert_pic);
        h.mo8572a(mo7241b((int) R.string.touchpal_cloud_cloud_prediction_title));
        h.mo8580b(mo7241b((int) R.string.touchpal_cloud_cloud_prediction_summary));
        h.mo8574a(mo7241b((int) R.string.ok), (View.OnClickListener) null);
        h.mo8567a();
    }

    /* renamed from: a */
    private void m14074a(String str, DialogInterface.OnCancelListener onCancelListener) {
        if (this.f13746m != null) {
            this.f13746m.setMessage(str);
            this.f13746m.setOnCancelListener(onCancelListener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m14113s() {
        if (this.f13746m != null) {
            this.f13746m.setMessage((CharSequence) null);
            this.f13746m.setOnCancelListener((DialogInterface.OnCancelListener) null);
        }
    }

    /* renamed from: i */
    public void mo4252i() {
        m14099l();
    }
}
