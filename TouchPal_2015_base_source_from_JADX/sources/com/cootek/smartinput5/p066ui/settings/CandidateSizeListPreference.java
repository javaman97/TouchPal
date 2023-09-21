package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.settings.CandidateSizeListPreference */
public class CandidateSizeListPreference extends CustomizableListPreference {
    private Context mContext;

    public CandidateSizeListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
    }

    public CandidateSizeListPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        super.onSetInitialValue(z, obj);
        setValue(String.valueOf(Settings.getInstance().getIntSetting(123)));
        updateSummary();
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            int intValue = Integer.valueOf(getValue()).intValue();
            Settings.getInstance().setIntSetting(123, intValue);
            C1246d a = C1246d.m6010a(this.mContext);
            Settings.getInstance();
            a.mo4588a(Settings.getKeyById(123), intValue, C1246d.f3730a);
            updateSummary();
        }
    }

    private void updateSummary() {
        setSummary(getEntry());
    }
}
