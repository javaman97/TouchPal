package com.cootek.smartinput5.p066ui.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;
import com.cootek.smartinput5.cust.C1240a;

/* renamed from: com.cootek.smartinput5.ui.settings.CustomizeSymbolDefaultPreference */
public class CustomizeSymbolDefaultPreference extends CustomizableDialogPreference {
    private PreferenceCategory[] PCs;
    private int[] removeNumber;

    public CustomizeSymbolDefaultPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTitle(getTitle());
    }

    public void setRemoveNunber(int[] iArr) {
        this.removeNumber = iArr;
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setPositiveButton(getResString(17039370), new C3029ao(this));
    }

    public void removePCs() {
        this.PCs = null;
    }

    public void addPreferenceCategory(PreferenceCategory preferenceCategory) {
        if (this.PCs == null) {
            this.PCs = new PreferenceCategory[]{preferenceCategory};
            return;
        }
        int length = this.PCs.length + 1;
        PreferenceCategory[] preferenceCategoryArr = new PreferenceCategory[length];
        for (int i = 0; i < length - 1; i++) {
            preferenceCategoryArr[i] = this.PCs[i];
        }
        preferenceCategoryArr[length - 1] = preferenceCategory;
        this.PCs = preferenceCategoryArr;
    }

    private int findCNumber(int[] iArr) {
        return ((iArr.length * (iArr.length + 1)) / 2) - sum(iArr);
    }

    private int sum(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public void flush() {
        if (this.PCs != null) {
            int length = this.PCs.length;
            if (length > 1) {
                for (int i = 0; i < length; i++) {
                    int preferenceCount = this.PCs[i].getPreferenceCount();
                    for (int i2 = 0; i2 < preferenceCount; i2++) {
                        CustomizeSymbolPreference customizeSymbolPreference = (CustomizeSymbolPreference) this.PCs[i].getPreference(i2);
                        String a = C1240a.m5987a().mo4566a((i * 8) + i2 + 1, C1240a.f3682e);
                        customizeSymbolPreference.setTitle(a);
                        customizeSymbolPreference.setMSymbol(a);
                    }
                }
                return;
            }
            int findCNumber = findCNumber(this.removeNumber);
            int preferenceCount2 = this.PCs[0].getPreferenceCount();
            for (int i3 = 0; i3 < preferenceCount2; i3++) {
                CustomizeSymbolPreference customizeSymbolPreference2 = (CustomizeSymbolPreference) this.PCs[0].getPreference(i3);
                String a2 = C1240a.m5987a().mo4566a((findCNumber * 8) + i3 + 1, C1240a.f3682e);
                customizeSymbolPreference2.setTitle(a2);
                customizeSymbolPreference2.setMSymbol(a2);
            }
        }
    }
}
