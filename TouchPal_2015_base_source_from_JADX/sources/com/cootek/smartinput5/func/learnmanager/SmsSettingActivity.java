package com.cootek.smartinput5.func.learnmanager;

import android.content.Context;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceGroup;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.settings.CustomizableCheckBoxPreference;
import com.emoji.keyboard.touchpal.R;

public class SmsSettingActivity extends PreferenceActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.layout.sms_settings);
        setTitle(C1974m.m9063a((Context) this, (int) R.string.optpage_learn_SMS_title));
        TouchPalOption.m5428a((CheckBoxPreference) (CustomizableCheckBoxPreference) findPreference(C1135d.option_auto_learn_sms.toString()), (int) Settings.SMS_AUTO_LEARN);
        TouchPalOption.m5428a((CheckBoxPreference) (CustomizableCheckBoxPreference) findPreference(C1135d.option_only_learn_outgoing.toString()), (int) Settings.SMS_ONLY_IMPORT_OUTGOING);
        if (C1132b.m5654a((Context) this) != null) {
            C1132b.m5654a((Context) this).mo4405a((PreferenceGroup) getPreferenceScreen());
        }
    }
}
