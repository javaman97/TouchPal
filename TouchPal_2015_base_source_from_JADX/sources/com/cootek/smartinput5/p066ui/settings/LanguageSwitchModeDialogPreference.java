package com.cootek.smartinput5.p066ui.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.LanguageSwitchModeDialogPreference */
public class LanguageSwitchModeDialogPreference extends CustomizableDialogPreference {
    private static final int LANGUAGE_KEY_INDEX = 1;
    private static final int SPACE_KEY_INDEX = 0;
    private AlertDialog.Builder mDialogBuilder;
    /* access modifiers changed from: private */
    public int mSwitchModeIndex;

    public LanguageSwitchModeDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        this.mSwitchModeIndex = getDefaultIndex();
        this.mDialogBuilder = new AlertDialog.Builder(getContext());
        this.mDialogBuilder.setTitle(getResString(R.string.language_switch_mode_title)).setNegativeButton(getResString(R.string.cancel), (DialogInterface.OnClickListener) null).setSingleChoiceItems(getDisplayTitles(), this.mSwitchModeIndex, new C3052bI(this));
        this.mDialogBuilder.show();
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        updateSummary();
    }

    /* access modifiers changed from: private */
    public void updateSetting() {
        if (this.mSwitchModeIndex == 1) {
            Settings.getInstance().setIntSetting(Settings.LANGUAGE_SWITCHING_MODE, 1);
        } else {
            Settings.getInstance().setIntSetting(Settings.LANGUAGE_SWITCHING_MODE, 2);
        }
    }

    private int getDefaultIndex() {
        if (Settings.getInstance().getBoolSetting(Settings.LANG_KEY_ENABLED)) {
            return 1;
        }
        return 0;
    }

    private String[] getDisplayTitles() {
        return C1974m.m9070b(getContext(), R.array.language_switch_mode_titles);
    }

    public void updateSummary() {
        setSummary(getDisplayTitles()[getDefaultIndex()]);
    }
}
