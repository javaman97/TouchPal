package com.cootek.smartinput5.p066ui.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.cootek.smartinput5.cust.C1240a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.CustomizeSymbolPreference */
public class CustomizeSymbolPreference extends CustomizableDialogPreference {
    /* access modifiers changed from: private */
    public EditText mEditText;
    /* access modifiers changed from: private */
    public int mIndex = Integer.valueOf(getKey()).intValue();
    /* access modifiers changed from: private */
    public String mSymbol = C1240a.m5987a().mo4565a(this.mIndex);

    public void setMSymbol(String str) {
        this.mSymbol = str;
    }

    public CustomizeSymbolPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDialogLayoutResource(R.layout.customize_symbol);
        setTitle(this.mSymbol);
    }

    /* access modifiers changed from: protected */
    public void onBindDialogView(View view) {
        super.onBindDialogView(view);
        this.mEditText = (EditText) view.findViewById(R.id.sym_content);
        this.mEditText.setText(this.mSymbol);
        this.mEditText.setSelection(0, this.mSymbol.length());
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setPositiveButton(getResString(17039370), new C3030ap(this));
    }
}
