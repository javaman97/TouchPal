package com.cootek.smartinput5.func.resource.p055ui;

import android.content.Context;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;
import com.cootek.smartinput5.func.resource.C1963b;

/* renamed from: com.cootek.smartinput5.func.resource.ui.TPreferenceCategory */
public class TPreferenceCategory extends PreferenceCategory {
    public TPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initAttrs(context, attributeSet);
    }

    public TPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initAttrs(context, attributeSet);
    }

    public TPreferenceCategory(Context context) {
        super(context);
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        C1963b.m9042a(context, this, attributeSet);
    }
}
