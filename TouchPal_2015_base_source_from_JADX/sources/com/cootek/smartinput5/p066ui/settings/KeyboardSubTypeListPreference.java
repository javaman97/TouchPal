package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.paopaopanel.C1933b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.cootek.smartinput5.ui.settings.KeyboardSubTypeListPreference */
public class KeyboardSubTypeListPreference extends CustomizableListPreference {
    private String mLangId;

    public KeyboardSubTypeListPreference(Context context) {
        super(context);
    }

    public KeyboardSubTypeListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        super.onSetInitialValue(z, obj);
        updateSummary();
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        Settings.getInstance().setIntSetting(3, Integer.parseInt(getValue()), 1, C1368X.m6320c().mo5835h().getLanguageCategory(this.mLangId, 1), (Config) null, true);
        updateSummary();
    }

    private void updateSummary() {
        setSummary(getEntry());
    }

    private void initEntry(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] b = C1974m.m9070b(C1368X.m6313b(), R.array.keyboard_subtype_key);
        String[] b2 = C1974m.m9070b(C1368X.m6313b(), R.array.keyboard_subtype_value);
        for (int i = 0; i < list.size(); i++) {
            for (int i2 = 0; i2 < b2.length; i2++) {
                if (TextUtils.equals(b2[i2], String.valueOf(list.get(i)))) {
                    arrayList.add(b[i2]);
                    arrayList2.add(b2[i2]);
                }
            }
        }
        setEntries((CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]));
        setEntryValues((CharSequence[]) arrayList2.toArray(new CharSequence[arrayList2.size()]));
    }

    public void setLanguageId(String str) {
        boolean z = true;
        this.mLangId = str;
        int intSetting = Settings.getInstance().getIntSetting(3, 1, C1368X.m6320c().mo5835h().getLanguageCategory(str, 1), (Config) null);
        if (intSetting == 0) {
            intSetting = 2;
        }
        List<Integer> a = new C1933b().mo7115a(str);
        if (a.size() <= 1 || !str.equals(Engine.getInstance().getCurrentLanguageId())) {
            z = false;
        }
        setEnabled(z);
        initEntry(a);
        setValue("" + intSetting);
        updateSummary();
    }
}
