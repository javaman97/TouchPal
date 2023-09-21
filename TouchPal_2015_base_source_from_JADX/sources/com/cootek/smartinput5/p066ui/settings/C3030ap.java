package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.widget.Toast;
import com.cootek.smartinput5.cust.C1240a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.ap */
/* compiled from: CustomizeSymbolPreference */
class C3030ap implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CustomizeSymbolPreference f13943a;

    C3030ap(CustomizeSymbolPreference customizeSymbolPreference) {
        this.f13943a = customizeSymbolPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.f13943a.mEditText.getText().toString();
        if (obj.length() == 0) {
            Toast.makeText(this.f13943a.getContext(), this.f13943a.getResString(R.string.customize_symbol_default), 0).show();
        } else if (C1240a.m5987a().mo4569b(this.f13943a.mIndex, obj)) {
            String unused = this.f13943a.mSymbol = obj;
            this.f13943a.setTitle(obj);
        }
    }
}
