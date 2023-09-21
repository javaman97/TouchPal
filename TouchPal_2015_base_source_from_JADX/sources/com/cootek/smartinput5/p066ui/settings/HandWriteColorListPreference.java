package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.ui.settings.HandWriteColorListPreference */
public class HandWriteColorListPreference extends CustomizableListPreference {
    public HandWriteColorListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HandWriteColorListPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        super.onSetInitialValue(z, obj);
        setValue(Settings.getInstance().getStringSetting(100));
        updateSummary();
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            Settings.getInstance().setStringSetting(100, getValue());
            updateSummary();
        }
    }

    private void updateSummary() {
        setSummary(getEntry());
    }
}
