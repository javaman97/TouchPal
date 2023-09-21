package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import com.cootek.smartinput5.func.resource.C1963b;
import com.cootek.smartinput5.func.resource.C1974m;

/* renamed from: com.cootek.smartinput5.ui.settings.CustomizablePreference */
public class CustomizablePreference extends Preference {
    protected CustomizableFunc customFunc;

    public CustomizablePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        initPref(context, attributeSet);
    }

    public CustomizablePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initPref(context, attributeSet);
    }

    public CustomizablePreference(Context context) {
        super(context);
        initPref(context, (AttributeSet) null);
    }

    private void initPref(Context context, AttributeSet attributeSet) {
        C1963b.m9042a(context, this, attributeSet);
        this.customFunc = new CustomizableFunc(context, attributeSet);
    }

    public void setTitleMaxLines(int i) {
        this.customFunc.mo9806a(i);
    }

    public void setTitleTextAppearenceId(int i) {
        this.customFunc.mo9810b(i);
    }

    public void setTitleTextSize(int i, float f) {
        this.customFunc.mo9807a(i, f);
    }

    public void setModelPreference(Preference preference) {
        this.customFunc.mo9808a(preference);
    }

    public void setLayoutResource(Preference preference) {
        if (preference != null) {
            super.setLayoutResource(preference.getLayoutResource());
        }
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        this.customFunc.mo9809a(view);
    }

    /* access modifiers changed from: protected */
    public String getResString(int i) {
        return C1974m.m9063a(getContext(), i);
    }

    /* access modifiers changed from: protected */
    public String getResString(int i, Object... objArr) {
        return C1974m.m9064a(getContext(), i, objArr);
    }
}
