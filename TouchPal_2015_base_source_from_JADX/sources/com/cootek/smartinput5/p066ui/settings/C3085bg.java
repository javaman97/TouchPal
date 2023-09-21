package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1337C;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.settings.CustomButtonPreference;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.bg */
/* compiled from: LanguageEditActivityInte */
class C3085bg implements CustomButtonPreference.C2951a {

    /* renamed from: a */
    final /* synthetic */ C1498a f14062a;

    /* renamed from: b */
    final /* synthetic */ C1337C f14063b;

    /* renamed from: c */
    final /* synthetic */ String f14064c;

    /* renamed from: d */
    final /* synthetic */ LanguageEditActivityInte f14065d;

    C3085bg(LanguageEditActivityInte languageEditActivityInte, C1498a aVar, C1337C c, String str) {
        this.f14065d = languageEditActivityInte;
        this.f14062a = aVar;
        this.f14063b = c;
        this.f14064c = str;
    }

    public void onCustomButtonClick(CustomButtonPreference customButtonPreference) {
        if (C1358O.m6234a(C1358O.f4194e) == null) {
            Toast.makeText(this.f14065d.f13511b, this.f14065d.mo7241b((int) R.string.sdcard_not_ready_message), 1).show();
            return;
        }
        String d = this.f14065d.mo7241b((int) R.string.curve_uninstall_title);
        new C2894d.C2895a(this.f14065d.f13511b).setTitle(d).setMessage(String.format(this.f14065d.mo7241b((int) R.string.curve_uninstall_msg_inte), new Object[]{this.f14062a.f4728g})).setPositiveButton(this.f14065d.mo7241b((int) R.string.yes), new C3086bh(this)).setNegativeButton(this.f14065d.mo7241b((int) R.string.no), (DialogInterface.OnClickListener) null).show();
    }
}
