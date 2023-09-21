package com.cootek.smartinput5.plugin.twitter;

import android.support.p001v4.p009e.p010a.C0230a;
import android.text.Editable;
import android.text.TextWatcher;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.twitter.o */
/* compiled from: ShareActivity */
class C2414o implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ ShareActivity f10564a;

    C2414o(ShareActivity shareActivity) {
        this.f10564a = shareActivity;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int length = 140 - this.f10564a.f10512f.getText().toString().length();
        this.f10564a.f10513g.setText(String.valueOf(length));
        if (length <= 10) {
            this.f10564a.f10513g.setTextColor(C0230a.f588c);
        } else {
            this.f10564a.f10513g.setTextColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.text_num_gray));
        }
        if (length < 0) {
            if (this.f10564a.f10514h.isEnabled()) {
                this.f10564a.f10514h.setEnabled(false);
            }
        } else if (!this.f10564a.f10514h.isEnabled()) {
            this.f10564a.f10514h.setEnabled(true);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }
}
