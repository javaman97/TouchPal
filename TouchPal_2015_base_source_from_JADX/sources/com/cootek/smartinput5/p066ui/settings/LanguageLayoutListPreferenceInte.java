package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p045a.C1056a;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.LanguageLayoutListPreferenceInte */
public class LanguageLayoutListPreferenceInte extends CustomizableListPreference {
    private String mLangId;
    private ArrayList<Runnable> mLayoutChangeListeners = new ArrayList<>();

    public LanguageLayoutListPreferenceInte(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LanguageLayoutListPreferenceInte(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        super.onSetInitialValue(z, obj);
        updateSummary();
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        int parseInt = Integer.parseInt(getValue());
        Settings.getInstance().setIntSetting(4, Integer.parseInt(getValue()), 9, this.mLangId, (Config) null, true);
        Settings.getInstance().setBoolSetting(Settings.FIRST_LANGUAGE_LAYOUT, false, 17, this.mLangId, (Config) null, true);
        onLayoutChanged();
        updateSummary();
        C1056a.m5588a().mo4264a(C1056a.f2984o + this.mLangId + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + parseInt, C1368X.m6313b());
    }

    private void updateSummary() {
        setSummary(getEntry());
    }

    private void initEntry(ArrayList<Integer> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String[] adjustKeyTitles = adjustKeyTitles(C1974m.m9070b(C1368X.m6313b(), R.array.lang_layout_key));
        String[] b = C1974m.m9070b(C1368X.m6313b(), R.array.lang_layout_value);
        for (int i = 0; i < arrayList.size(); i++) {
            for (int i2 = 0; i2 < b.length; i2++) {
                if (TextUtils.equals(b[i2], String.valueOf(arrayList.get(i)))) {
                    arrayList2.add(adjustKeyTitles[i2]);
                    arrayList3.add(b[i2]);
                }
            }
        }
        setEntries((CharSequence[]) arrayList2.toArray(new CharSequence[arrayList2.size()]));
        setEntryValues((CharSequence[]) arrayList3.toArray(new CharSequence[arrayList3.size()]));
    }

    private String[] adjustKeyTitles(String[] strArr) {
        if (C1549b.f4769E.equals(this.mLangId)) {
            return replace(strArr, new int[]{R.string.optpage_full_keyboard_qwertz, R.string.optpage_full_keyboard_qwerty}, new int[]{R.string.optpage_full_keyboard_qwertz_bul, R.string.optpage_full_keyboard_qwerty_bul});
        }
        if (C1549b.f4848s.equals(this.mLangId)) {
            return replace(strArr, new int[]{R.string.optpage_full_keyboard_qwertz, R.string.optpage_full_keyboard_qwerty}, new int[]{R.string.optpage_full_keyboard_qwertz_tur, R.string.optpage_full_keyboard_qwerty_tur});
        }
        if (C1549b.f4839j.equals(this.mLangId)) {
            return replace(strArr, new int[]{R.string.optpage_full_keyboard_custom1}, new int[]{R.string.optpage_full_keyboard_qz_ger});
        } else if (C1549b.f4840k.equals(this.mLangId)) {
            return replace(strArr, new int[]{R.string.optpage_full_keyboard_custom1, R.string.optpage_full_keyboard_qwerty}, new int[]{R.string.optpage_full_keyboard_qwerty_esp, R.string.optpage_full_keyboard_qw_esp});
        } else {
            if (C1549b.f4821aq.equals(this.mLangId)) {
                return replace(strArr, new int[]{R.string.optpage_full_keyboard_custom1, R.string.optpage_full_keyboard_qwerty}, new int[]{R.string.optpage_full_keyboard_qwerty_esp, R.string.optpage_full_keyboard_qw_esp});
            }
            if (C1549b.f4822ar.equals(this.mLangId)) {
                return replace(strArr, new int[]{R.string.optpage_full_keyboard_custom1, R.string.optpage_full_keyboard_qwerty}, new int[]{R.string.optpage_full_keyboard_qwerty_esp, R.string.optpage_full_keyboard_qw_esp});
            }
            if (C1549b.f4772H.equals(this.mLangId)) {
                return replace(strArr, new int[]{R.string.optpage_full_keyboard_qwerty, R.string.optpage_full_keyboard_qwertz}, new int[]{R.string.optpage_full_keyboard_qwerty_ara, R.string.optpage_full_keyboard_qwertz_ara});
            }
            if (C1549b.f4806ab.equals(this.mLangId)) {
                return replace(strArr, new int[]{R.string.optpage_full_keyboard_qwerty, R.string.optpage_full_keyboard_qwertz}, new int[]{R.string.optpage_full_keyboard_qwerty_he, R.string.optpage_full_keyboard_qwertz_he});
            }
            return strArr;
        }
    }

    private String[] replace(String[] strArr, int[] iArr, int[] iArr2) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[i];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (strArr[i].equals(getResString(iArr[i2]))) {
                    strArr2[i] = getResString(iArr2[i2]);
                }
            }
        }
        return strArr2;
    }

    public void setLanguageId(String str) {
        boolean z = false;
        boolean z2 = true;
        this.mLangId = str;
        int intSetting = Settings.getInstance().getIntSetting(4, 9, this.mLangId, (Config) null);
        if (intSetting == 0) {
            intSetting = 1;
        }
        ArrayList<Integer> v = C1368X.m6320c().mo5842o().mo5973v(this.mLangId);
        if (v != null) {
            if (v.size() <= 1) {
                z2 = false;
            }
            initEntry(v);
            z = z2;
        }
        setEnabled(z);
        setValue("" + intSetting);
        updateSummary();
    }

    private void onLayoutChanged() {
        Iterator<Runnable> it = this.mLayoutChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public void addOnLayoutChangeListener(Runnable runnable) {
        if (runnable != null && !this.mLayoutChangeListeners.contains(runnable)) {
            this.mLayoutChangeListeners.add(runnable);
        }
    }
}
