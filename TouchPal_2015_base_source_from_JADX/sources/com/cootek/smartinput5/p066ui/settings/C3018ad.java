package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1337C;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.settings.CustomButtonPreference;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.ad */
/* compiled from: CurveDictActivity */
class C3018ad implements CustomButtonPreference.C2951a {

    /* renamed from: a */
    final /* synthetic */ C1337C f13925a;

    /* renamed from: b */
    final /* synthetic */ CustomButtonPreference f13926b;

    /* renamed from: c */
    final /* synthetic */ CurveDictActivity f13927c;

    C3018ad(CurveDictActivity curveDictActivity, C1337C c, CustomButtonPreference customButtonPreference) {
        this.f13927c = curveDictActivity;
        this.f13925a = c;
        this.f13926b = customButtonPreference;
    }

    public void onCustomButtonClick(CustomButtonPreference customButtonPreference) {
        if (C1358O.m6234a(C1358O.f4194e) == null) {
            Toast.makeText(this.f13927c, this.f13927c.mo7241b((int) R.string.sdcard_not_ready_message), 1).show();
            return;
        }
        CurveDictActivity curveDictActivity = this.f13927c;
        String b = this.f13927c.mo7241b((int) R.string.curve_uninstall_title);
        new C2894d.C2895a(curveDictActivity).setTitle(b).setMessage(String.format(this.f13927c.mo7241b((int) R.string.curve_uninstall_msg), new Object[]{""})).setPositiveButton(this.f13927c.mo7241b((int) R.string.yes), new C3019ae(this)).setNegativeButton(this.f13927c.mo7241b((int) R.string.no), (DialogInterface.OnClickListener) null).show();
    }
}
