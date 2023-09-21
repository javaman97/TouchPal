package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.settings.PopupPreviewListPreference */
public class PopupPreviewListPreference extends CustomizableListPreference {
    public PopupPreviewListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PopupPreviewListPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        super.onSetInitialValue(z, obj);
        setValue(String.valueOf(Settings.getInstance().getIntSetting(Settings.PREVIEW_LEVEL)));
        updateSummary();
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            int intValue = Integer.valueOf(getValue()).intValue();
            Settings.getInstance().setIntSetting(Settings.PREVIEW_LEVEL, intValue);
            C1246d a = C1246d.m6010a(getContext());
            Settings.getInstance();
            a.mo4588a(Settings.getKeyById(Settings.PREVIEW_LEVEL), intValue, C1246d.f3730a);
            updateSummary();
        }
    }

    private void updateSummary() {
        setSummary(getEntry());
    }
}
