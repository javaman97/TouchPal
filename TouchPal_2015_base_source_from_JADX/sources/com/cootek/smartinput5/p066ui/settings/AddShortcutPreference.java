package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.AddShortcutPreference */
public class AddShortcutPreference extends CustomizablePreference implements Preference.OnPreferenceClickListener {
    public AddShortcutPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnPreferenceClickListener(this);
    }

    public boolean onPreferenceClick(Preference preference) {
        C2894d.C2895a aVar = new C2894d.C2895a(getContext());
        aVar.setTitle(getResString(R.string.edit_shortcut));
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.add_shortcut, (ViewGroup) null);
        aVar.setView(inflate);
        aVar.setPositiveButton(getResString(17039370), new C2984a(this, (EditText) inflate.findViewById(R.id.ShortcutInput), (EditText) inflate.findViewById(R.id.ShortcutWord)));
        aVar.setNegativeButton(getResString(17039360), (DialogInterface.OnClickListener) null);
        aVar.setCancelable(true);
        aVar.create().show();
        return true;
    }
}
