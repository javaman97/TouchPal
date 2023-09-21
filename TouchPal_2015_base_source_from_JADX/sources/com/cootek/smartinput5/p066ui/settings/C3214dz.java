package com.cootek.smartinput5.p066ui.settings;

import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.settings.dz */
/* compiled from: TouchPalCloudActivity */
class C3214dz implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ EditText f14277a;

    /* renamed from: b */
    final /* synthetic */ TextView f14278b;

    /* renamed from: c */
    final /* synthetic */ TouchPalCloudActivity f14279c;

    C3214dz(TouchPalCloudActivity touchPalCloudActivity, EditText editText, TextView textView) {
        this.f14279c = touchPalCloudActivity;
        this.f14277a = editText;
        this.f14278b = textView;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f14277a.setVisibility(0);
            this.f14278b.setVisibility(0);
            this.f14277a.setText(this.f14277a.getText().toString());
            this.f14277a.requestFocus();
            ((InputMethodManager) this.f14279c.getSystemService("input_method")).toggleSoftInput(0, 2);
            return;
        }
        this.f14277a.setVisibility(8);
        this.f14278b.setVisibility(8);
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
    }
}
