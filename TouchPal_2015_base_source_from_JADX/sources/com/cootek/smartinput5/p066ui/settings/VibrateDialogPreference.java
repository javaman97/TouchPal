package com.cootek.smartinput5.p066ui.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.p055ui.TCheckBox;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.VibrateDialogPreference */
public class VibrateDialogPreference extends CustomizableDialogPreference implements CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private TCheckBox mCheckBox;
    private boolean mChecked = Settings.getInstance().getBoolSetting(Settings.APPLY_SYSTEM_VIBRATE);
    private int mCurrentProgress = Settings.getInstance().getIntSetting(Settings.VIBRATE_TIME);
    private SeekBar mSeekBar;
    private TextView mTextView;
    private Resources resources = getContext().getResources();
    private String selectInfo = getResString(R.string.optpage_vibrate_info);
    private String unit = getResString(R.string.optpage_recognize_interval_unit);

    public VibrateDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        updateSummary();
    }

    private void updateSummary() {
        if (this.mChecked) {
            setSummary(this.selectInfo + " " + getResString(R.string.optpage_vibrate_system));
        } else {
            setSummary(this.selectInfo + " " + (this.mCurrentProgress == 0 ? getResString(R.string.optpage_vibrate1) : this.mCurrentProgress + " " + this.unit));
        }
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        super.showDialog(bundle);
        Dialog dialog = getDialog();
        this.mSeekBar = (SeekBar) dialog.findViewById(R.id.key_vibrate_seek);
        this.mSeekBar.setMax(HighFreqSettings.getInstance().MAX_VIBRATE);
        this.mTextView = (TextView) dialog.findViewById(R.id.key_vibrate_progress);
        this.mCurrentProgress = Settings.getInstance().getIntSetting(Settings.VIBRATE_TIME);
        this.mSeekBar.setOnSeekBarChangeListener(this);
        this.mSeekBar.setProgress(this.mCurrentProgress);
        this.mCheckBox = (TCheckBox) dialog.findViewById(R.id.key_vibrate_system);
        this.mCheckBox.setOnCheckedChangeListener(this);
        updateCheckedState(this.mChecked);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.mCurrentProgress = i;
        this.mTextView.setText(getProgressText());
    }

    private CharSequence getProgressText() {
        if (this.mChecked) {
            return getResString(R.string.optpage_vibrate_system);
        }
        return this.mCurrentProgress == 0 ? getResString(R.string.optpage_vibrate1) : this.mCurrentProgress + " " + this.unit;
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            Settings.getInstance().setIntSetting(Settings.VIBRATE_TIME, this.mCurrentProgress);
            Settings.getInstance().setBoolSetting(Settings.APPLY_SYSTEM_VIBRATE, this.mChecked);
            Settings.getInstance().setBoolSetting(Settings.ADVANCED_VIBRATION, this.mCurrentProgress != 0 || this.mChecked);
            C1246d.m6010a(getContext()).mo4588a(Settings.getKeyById(Settings.VIBRATE_TIME), this.mCurrentProgress, C1246d.f3730a);
            updateSummary();
            if (this.mCurrentProgress == 0) {
                C1368X.m6320c().mo5852y().mo6377a();
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.mCurrentProgress != 0) {
            C1368X.m6320c().mo5852y().mo6378a(this.mCurrentProgress);
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        updateCheckedState(z);
    }

    private void updateCheckedState(boolean z) {
        this.mChecked = z;
        this.mSeekBar.setEnabled(!z);
        this.mCheckBox.setChecked(z);
        this.mTextView.setText(getProgressText());
    }
}
