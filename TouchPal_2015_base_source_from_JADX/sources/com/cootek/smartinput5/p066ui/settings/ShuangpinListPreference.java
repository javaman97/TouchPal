package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.settings.ShuangpinListPreference */
public class ShuangpinListPreference extends CustomizableListPreference {
    public ShuangpinListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShuangpinListPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        super.onSetInitialValue(z, obj);
        setValue(String.valueOf(Settings.getInstance().getIntSetting(51)));
        updateSummary();
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            Settings.getInstance().setIntSetting(51, Integer.valueOf(getValue()).intValue());
            updateSummary();
        }
    }

    private void updateSummary() {
        setSummary(getEntry());
    }
}
