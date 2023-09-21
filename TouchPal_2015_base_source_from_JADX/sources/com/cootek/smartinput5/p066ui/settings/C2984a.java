package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
import com.cootek.smartinput5.cust.ShortcutSettings;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.a */
/* compiled from: AddShortcutPreference */
class C2984a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ EditText f13806a;

    /* renamed from: b */
    final /* synthetic */ EditText f13807b;

    /* renamed from: c */
    final /* synthetic */ AddShortcutPreference f13808c;

    C2984a(AddShortcutPreference addShortcutPreference, EditText editText, EditText editText2) {
        this.f13808c = addShortcutPreference;
        this.f13806a = editText;
        this.f13807b = editText2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (C1368X.m6324d()) {
            String lowerCase = this.f13806a.getText().toString().trim().toLowerCase();
            String trim = this.f13807b.getText().toString().trim();
            if (TextUtils.isEmpty(lowerCase) || TextUtils.isEmpty(trim)) {
                Toast.makeText(this.f13808c.getContext(), this.f13808c.getResString(R.string.edit_shortcut_fail), 0).show();
                return;
            }
            for (int i2 = 0; i2 < lowerCase.length(); i2++) {
                if (lowerCase.charAt(i2) < 'a' || lowerCase.charAt(i2) > 'z') {
                    Toast.makeText(this.f13808c.getContext(), this.f13808c.getResString(R.string.shortcut_input_not_match), 0).show();
                    return;
                }
            }
            if (((ShortcutSettings) this.f13808c.getContext()).mo4562a(lowerCase)) {
                Toast.makeText(this.f13808c.getContext(), this.f13808c.getResString(R.string.edit_shortcut_key_existed), 0).show();
                return;
            }
            Okinawa h = C1368X.m6320c().mo5835h();
            h.fireAddUserwordOperation(lowerCase, trim, 4);
            h.processEvent();
            ((ShortcutSettings) this.f13808c.getContext()).mo4561a(lowerCase, trim);
        }
    }
}
