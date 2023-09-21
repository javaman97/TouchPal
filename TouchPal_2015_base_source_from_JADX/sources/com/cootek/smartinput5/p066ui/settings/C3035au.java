package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.cootek.smartinput5.cust.C1240a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.au */
/* compiled from: EmotionKeyDialog */
class C3035au implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f13950a;

    /* renamed from: b */
    final /* synthetic */ EmotionKeyDialog f13951b;

    C3035au(EmotionKeyDialog emotionKeyDialog, Context context) {
        this.f13951b = emotionKeyDialog;
        this.f13950a = context;
    }

    public void onClick(View view) {
        String obj = this.f13951b.f13432c.getText().toString();
        if (!this.f13951b.m13766a(obj)) {
            Toast.makeText(this.f13950a, this.f13951b.getResString(R.string.customize_symbol_default), 0).show();
        } else {
            C1240a.m5987a().mo4569b(this.f13951b.f13434e, obj);
        }
        this.f13951b.finish();
    }
}
