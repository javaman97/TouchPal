package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1405aP;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.settings.LanguageMixInputListPreferenceInte */
public class LanguageMixInputListPreferenceInte extends CustomizableListPreference {
    private Context mContext;
    private String mLangId;

    public LanguageMixInputListPreferenceInte(Context context, String str) {
        super(context);
        this.mContext = context;
        setLanguageId(str);
        setTitleMaxLines(2);
    }

    public LanguageMixInputListPreferenceInte(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        setTitleMaxLines(2);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        super.onSetInitialValue(z, obj);
        updateSummary();
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        C1368X.m6320c().mo5842o().mo5931a(this.mLangId, getValue());
        updateSummary();
    }

    private void updateSummary() {
        CharSequence entry = getEntry();
        if (entry != null) {
            SpannableString spannableString = new SpannableString(getResString(R.string.optpage_mixedlang_item_summary, entry));
            int indexOf = spannableString.toString().indexOf(entry.toString());
            if (indexOf >= 0) {
                spannableString.setSpan(new StyleSpan(1), indexOf, entry.length() + indexOf, 33);
            }
            setSummary(spannableString);
        }
    }

    public void setLanguageId(String str) {
        this.mLangId = str;
        C1389aD o = C1368X.m6320c().mo5842o();
        String[] h = o.mo5947h();
        ArrayList<String> a = C1405aP.m6594a().mo6013a(this.mLangId);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(getResString(R.string.optpage_mixedlang_none));
        arrayList2.add("");
        for (int i = 0; i < h.length; i++) {
            if (o.mo5954l(h[i]).mo6156f() && a.contains(h[i])) {
                arrayList.add(o.mo5954l(h[i]).f4728g);
                arrayList2.add(h[i]);
            }
        }
        setEntries((CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]));
        setEntryValues((CharSequence[]) arrayList2.toArray(new CharSequence[arrayList2.size()]));
        if (arrayList.size() <= 1) {
            setEnabled(false);
        }
        setTitle(getResString(R.string.optpage_mixedlang_item_title, o.mo5954l(this.mLangId).f4728g));
        setDialogTitle(getTitle());
        String w = o.mo5975w(this.mLangId);
        if (w == null || !arrayList2.contains(w)) {
            setValue("");
        } else {
            setValue(w);
        }
        updateSummary();
    }
}
