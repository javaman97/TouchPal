package com.weibo.net;

import android.support.p001v4.p009e.p010a.C0230a;
import android.text.Editable;
import android.text.TextWatcher;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.weibo.net.l */
/* compiled from: ShareActivity */
class C4049l implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ ShareActivity f16493a;

    C4049l(ShareActivity shareActivity) {
        this.f16493a = shareActivity;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int length = this.f16493a.f16466h.getText().toString().length();
        if (length <= 140) {
            i4 = 140 - length;
            this.f16493a.f16464f.setTextColor(this.f16493a.getResources().getColor(R.color.text_num_gray));
            if (!this.f16493a.f16465g.isEnabled()) {
                this.f16493a.f16465g.setEnabled(true);
            }
        } else {
            i4 = length - 140;
            this.f16493a.f16464f.setTextColor(C0230a.f588c);
            if (this.f16493a.f16465g.isEnabled()) {
                this.f16493a.f16465g.setEnabled(false);
            }
        }
        this.f16493a.f16464f.setText(String.valueOf(i4));
    }
}
