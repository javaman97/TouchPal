package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.learnmanager.C1831l;
import com.cootek.smartinput5.p045a.C1056a;

/* renamed from: com.cootek.smartinput5.ui.settings.dB */
/* compiled from: TouchPalCloudActivity */
class C3164dB implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBox f14214a;

    /* renamed from: b */
    final /* synthetic */ CheckBox f14215b;

    /* renamed from: c */
    final /* synthetic */ EditText f14216c;

    /* renamed from: d */
    final /* synthetic */ TouchPalCloudActivity f14217d;

    C3164dB(TouchPalCloudActivity touchPalCloudActivity, CheckBox checkBox, CheckBox checkBox2, EditText editText) {
        this.f14217d = touchPalCloudActivity;
        this.f14214a = checkBox;
        this.f14215b = checkBox2;
        this.f14216c = editText;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean isChecked = this.f14214a.isChecked();
        boolean isChecked2 = this.f14215b.isChecked();
        Bundle bundle = new Bundle();
        bundle.putBoolean(C1831l.f6114m, isChecked);
        bundle.putBoolean(C1831l.f6115n, isChecked2);
        String obj = this.f14216c.getText().toString();
        if (obj != null && obj.length() > 140) {
            obj = obj.substring(0, 140);
        }
        bundle.putString(C1831l.f6116o, obj);
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5843p().mo6837a(1, this.f14217d.f13734a, this.f14217d.f13742i, bundle);
        }
        C1056a.m5588a().mo4264a(C1056a.f2944E, this.f14217d.f13734a);
    }
}
