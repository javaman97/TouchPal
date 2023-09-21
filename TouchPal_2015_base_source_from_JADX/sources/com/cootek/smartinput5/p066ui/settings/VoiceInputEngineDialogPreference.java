package com.cootek.smartinput5.p066ui.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.VoiceInputEngineDialogPreference */
public class VoiceInputEngineDialogPreference extends CustomizableDialogPreference {
    private AlertDialog.Builder mVoiceEngineDlg;
    /* access modifiers changed from: private */
    public int mVoiceEngineIndex = getDefautEngineIndex();

    public VoiceInputEngineDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void updateVoiceInputEngine(int i) {
        Settings.getInstance().setIntSetting(Settings.VOICE_INPUT_ENGINE, i);
    }

    private int getDefautEngineIndex() {
        return Settings.getInstance().getIntSetting(Settings.VOICE_INPUT_ENGINE);
    }

    private String[] getVoiceInputEngineTitles() {
        return new String[]{getContext().getString(R.string.default_voice_engine), getContext().getString(R.string.system_voice_engine)};
    }

    public void updateSummary() {
        setSummary(getVoiceInputEngineTitles()[this.mVoiceEngineIndex]);
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        this.mVoiceEngineDlg = new AlertDialog.Builder(getContext()).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        this.mVoiceEngineDlg.setTitle(R.string.voice_input_engine_choose_title);
        this.mVoiceEngineDlg.setSingleChoiceItems(getVoiceInputEngineTitles(), this.mVoiceEngineIndex, new C3229en(this));
        this.mVoiceEngineDlg.show();
    }

    /* access modifiers changed from: private */
    public void updateVoiceLanguagePref(boolean z) {
        getPreferenceManager().findPreference(C1135d.option_voice_input_language_selector.toString()).setEnabled(z);
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        updateSummary();
    }

    public boolean isSystemVoiceEngineChosen() {
        return 1 == getDefautEngineIndex();
    }
}
