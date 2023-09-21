package com.cootek.smartinput5.cust;

import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.settings.CustomizeSymbolDefaultPreference;
import com.emoji.keyboard.touchpal.R;

public class CustomizeSettings extends PreferenceActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int[] iArr;
        int i = 0;
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        addPreferencesFromResource(R.layout.customize);
        CustomizeSymbolDefaultPreference customizeSymbolDefaultPreference = (CustomizeSymbolDefaultPreference) findPreference("customize_default_set");
        customizeSymbolDefaultPreference.removePCs();
        if (getIntent().getType() != null) {
            int[] a = m5980a(getPreferenceScreen(), getIntent().getType());
            m5978a(getPreferenceScreen(), a);
            customizeSymbolDefaultPreference.addPreferenceCategory((PreferenceCategory) getPreferenceScreen().getPreference(0));
            iArr = a;
        } else {
            while (true) {
                int i2 = i;
                if (i2 >= getPreferenceScreen().getPreferenceCount() - 1) {
                    break;
                }
                customizeSymbolDefaultPreference.addPreferenceCategory((PreferenceCategory) getPreferenceScreen().getPreference(i2));
                i = i2 + 1;
            }
            iArr = null;
        }
        customizeSymbolDefaultPreference.setRemoveNunber(iArr);
    }

    /* renamed from: a */
    private int[] m5980a(PreferenceScreen preferenceScreen, String str) {
        int preferenceCount = preferenceScreen.getPreferenceCount();
        int[] iArr = null;
        for (int i = 0; i < preferenceCount - 1; i++) {
            Preference preference = preferenceScreen.getPreference(i);
            if (preference != null && !preference.getKey().equals(str)) {
                iArr = m5979a(i, iArr);
            }
        }
        return iArr;
    }

    /* renamed from: a */
    private int[] m5979a(int i, int[] iArr) {
        if (iArr == null) {
            return new int[]{i};
        }
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length - 1; i2++) {
            iArr2[i2] = iArr[i2];
        }
        iArr2[length - 1] = i;
        return iArr2;
    }

    /* renamed from: a */
    private void m5978a(PreferenceScreen preferenceScreen, int[] iArr) {
        if (iArr != null) {
            for (int preference : iArr) {
                preferenceScreen.removePreference(preferenceScreen.getPreference(preference));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C1368X.m6325e();
        super.onDestroy();
    }
}
