package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;

/* renamed from: com.cootek.smartinput5.ui.settings.ClokeListPreference */
public class ClokeListPreference extends CustomizableListPreference {
    public ClokeListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClokeListPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        super.onSetInitialValue(z, obj);
        setValue(String.valueOf(getSettingsValue()));
        updateSummary();
    }

    private int getSettingsValue() {
        int intSetting = Settings.getInstance().getIntSetting(Settings.CLOKE_ENABLE_MODE);
        if (intSetting < 2 || C1132b.m5654a(getContext()).mo4392a(C1135d.MANUAL_CLOUD_SEARCH, (Boolean) true).booleanValue()) {
            return intSetting;
        }
        return intSetting - 1;
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            int intValue = Integer.valueOf(getValue()).intValue();
            Settings.getInstance().setIntSetting(Settings.CLOKE_ENABLE_MODE, getClokeEnableMode(intValue));
            Settings.getInstance().setBoolSetting(46, intValue != 3);
            updateSummary();
        }
    }

    private int getClokeEnableMode(int i) {
        if (i < 2 || C1132b.m5654a(getContext()).mo4392a(C1135d.MANUAL_CLOUD_SEARCH, (Boolean) true).booleanValue()) {
            return i;
        }
        return i + 1;
    }

    private void updateSummary() {
        setSummary(getEntry());
    }
}
