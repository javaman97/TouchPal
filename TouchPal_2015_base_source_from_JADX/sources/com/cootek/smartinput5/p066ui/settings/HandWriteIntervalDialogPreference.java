package com.cootek.smartinput5.p066ui.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.SeekBar;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Settings;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.HandWriteIntervalDialogPreference */
public class HandWriteIntervalDialogPreference extends CustomizableDialogPreference implements SeekBar.OnSeekBarChangeListener {
    /* access modifiers changed from: private */
    public boolean isSmallerAction = false;
    /* access modifiers changed from: private */
    public int mCurrentProgress = getProgress(Settings.getInstance().getIntSetting(102));
    /* access modifiers changed from: private */
    public SeekBar mSeekBar;
    private TextView mTextView;
    private Resources resources = getContext().getResources();
    private String selectInfo = getResString(R.string.optpage_recognize_interval_info);
    private String unit = getResString(R.string.optpage_recognize_interval_unit);

    static /* synthetic */ int access$004(HandWriteIntervalDialogPreference handWriteIntervalDialogPreference) {
        int i = handWriteIntervalDialogPreference.mCurrentProgress + 1;
        handWriteIntervalDialogPreference.mCurrentProgress = i;
        return i;
    }

    public HandWriteIntervalDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        updateSummary();
    }

    private int getIntervalValue(int i) {
        return (i + 1) * 100;
    }

    private int getProgress(int i) {
        return (i / 100) - 1;
    }

    private void updateSummary() {
        setSummary(getIntervalValue(this.mCurrentProgress) + " " + this.unit);
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        super.showDialog(bundle);
        Dialog dialog = getDialog();
        this.mSeekBar = (SeekBar) dialog.findViewById(R.id.key_vibrate_seek);
        this.mTextView = (TextView) dialog.findViewById(R.id.key_vibrate_progress);
        this.mSeekBar.setOnSeekBarChangeListener(this);
        this.mCurrentProgress = getProgress(Settings.getInstance().getIntSetting(102));
        this.mSeekBar.setProgress(this.mCurrentProgress);
        this.mTextView.setText(this.selectInfo + " " + getIntervalValue(this.mCurrentProgress) + " " + this.unit);
        this.mSeekBar.setOnTouchListener(new C2989aE(this, this.mSeekBar.getMax()));
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.isSmallerAction = i < this.mCurrentProgress;
        this.mCurrentProgress = i;
        this.mTextView.setText(this.selectInfo + " " + getIntervalValue(this.mCurrentProgress) + " " + this.unit);
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            Settings.getInstance().setIntSetting(102, getIntervalValue(this.mCurrentProgress));
            updateSummary();
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
