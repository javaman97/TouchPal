package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
import com.cootek.smartinput5.cust.ShortcutSettings;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.aq */
/* compiled from: EditShortcutPreference */
class C3031aq implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ EditText f13944a;

    /* renamed from: b */
    final /* synthetic */ EditText f13945b;

    /* renamed from: c */
    final /* synthetic */ EditShortcutPreference f13946c;

    C3031aq(EditShortcutPreference editShortcutPreference, EditText editText, EditText editText2) {
        this.f13946c = editShortcutPreference;
        this.f13944a = editText;
        this.f13945b = editText2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (C1368X.m6324d()) {
            String lowerCase = this.f13944a.getText().toString().trim().toLowerCase();
            String trim = this.f13945b.getText().toString().trim();
            if (TextUtils.isEmpty(lowerCase) || TextUtils.isEmpty(trim)) {
                Toast.makeText(this.f13946c.getContext(), this.f13946c.getResString(R.string.edit_shortcut_fail), 0).show();
                return;
            }
            for (int i2 = 0; i2 < lowerCase.length(); i2++) {
                if (lowerCase.charAt(i2) < 'a' || lowerCase.charAt(i2) > 'z') {
                    Toast.makeText(this.f13946c.getContext(), this.f13946c.getResString(R.string.shortcut_input_not_match), 0).show();
                    return;
                }
            }
            if (!((ShortcutSettings) this.f13946c.getContext()).mo4562a(lowerCase) || lowerCase.equals(this.f13946c.mKey)) {
                Okinawa h = C1368X.m6320c().mo5835h();
                h.fireDeleteUserWordOperation(this.f13946c.mKey, this.f13946c.mWord, 4, false);
                h.fireAddUserwordOperation(lowerCase, trim, 4);
                String unused = this.f13946c.mKey = lowerCase;
                String unused2 = this.f13946c.mWord = trim;
                this.f13946c.updateDisplay();
                h.processEvent();
                ((ShortcutSettings) this.f13946c.getContext()).mo4559a();
                return;
            }
            Toast.makeText(this.f13946c.getContext(), this.f13946c.getResString(R.string.edit_shortcut_key_existed), 0).show();
        }
    }
}
