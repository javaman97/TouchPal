package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.settings.UpdateDialogPreference */
public class UpdateDialogPreference extends CustomizableListPreference {
    public UpdateDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        super.onSetInitialValue(z, obj);
        setValue(String.valueOf(Settings.getInstance().getIntSetting(105)));
        updateSummary();
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            Settings.getInstance().setIntSetting(105, Integer.valueOf(getValue()).intValue());
        }
        updateSummary();
    }

    private void updateSummary() {
        setSummary(getEntry());
    }
}
