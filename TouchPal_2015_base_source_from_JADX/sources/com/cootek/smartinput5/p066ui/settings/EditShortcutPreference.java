package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.preference.Preference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.settings.CustomButtonPreference;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.EditShortcutPreference */
public class EditShortcutPreference extends CustomButtonPreference implements Preference.OnPreferenceClickListener, CustomButtonPreference.C2951a {
    /* access modifiers changed from: private */
    public String mKey;
    /* access modifiers changed from: private */
    public String mWord;

    public EditShortcutPreference(String str, String str2, Context context) {
        super(context);
        setOnPreferenceClickListener(this);
        setOnCustomButtonClickListener(this);
        setCustomViewDrawable(R.drawable.key_btn_uninstall_ctrl);
        this.mKey = str;
        this.mWord = str2;
        updateDisplay();
    }

    /* access modifiers changed from: private */
    public void updateDisplay() {
        setTitle(this.mWord);
        setSummary(this.mKey);
    }

    public boolean onPreferenceClick(Preference preference) {
        C2894d.C2895a aVar = new C2894d.C2895a(getContext());
        aVar.setTitle(getResString(R.string.edit_shortcut));
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.add_shortcut, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.ShortcutInput);
        EditText editText2 = (EditText) inflate.findViewById(R.id.ShortcutWord);
        editText.setText(this.mKey);
        editText2.setText(this.mWord);
        aVar.setView(inflate);
        aVar.setPositiveButton(getResString(17039370), new C3031aq(this, editText, editText2));
        aVar.setNegativeButton(getResString(17039360), (DialogInterface.OnClickListener) null);
        aVar.setCancelable(true);
        aVar.create().show();
        return true;
    }

    public void onCustomButtonClick(CustomButtonPreference customButtonPreference) {
        C2894d.C2895a aVar = new C2894d.C2895a(getContext());
        aVar.setTitle(getResString(R.string.delete_shortcut));
        aVar.setPositiveButton(getResString(17039379), new C3032ar(this));
        aVar.setNegativeButton(getResString(17039369), (DialogInterface.OnClickListener) null);
        aVar.setCancelable(true);
        aVar.create().show();
    }
}
