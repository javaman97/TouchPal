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

/* renamed from: com.cootek.smartinput5.ui.settings.HandWriteWidthDialogPreference */
public class HandWriteWidthDialogPreference extends CustomizableDialogPreference implements SeekBar.OnSeekBarChangeListener {
    /* access modifiers changed from: private */
    public boolean isSmallerAction = false;
    /* access modifiers changed from: private */
    public int mCurrentProgress = (Settings.getInstance().getIntSetting(Settings.HANDWRITE_WIDTH) - 2);
    /* access modifiers changed from: private */
    public SeekBar mSeekBar;
    private TextView mTextView;
    private Resources resources = getContext().getResources();
    private String selectInfo = getResString(R.string.optpage_stroke_width_info);

    static /* synthetic */ int access$004(HandWriteWidthDialogPreference handWriteWidthDialogPreference) {
        int i = handWriteWidthDialogPreference.mCurrentProgress + 1;
        handWriteWidthDialogPreference.mCurrentProgress = i;
        return i;
    }

    public HandWriteWidthDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        updateSummary();
    }

    private void updateSummary() {
        setSummary("" + (this.mCurrentProgress + 2));
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        super.showDialog(bundle);
        Dialog dialog = getDialog();
        this.mSeekBar = (SeekBar) dialog.findViewById(R.id.key_vibrate_seek);
        this.mTextView = (TextView) dialog.findViewById(R.id.key_vibrate_progress);
        this.mSeekBar.setOnSeekBarChangeListener(this);
        this.mCurrentProgress = Settings.getInstance().getIntSetting(Settings.HANDWRITE_WIDTH) - 2;
        this.mSeekBar.setProgress(this.mCurrentProgress);
        this.mTextView.setText(this.selectInfo + " " + (this.mCurrentProgress + 2));
        this.mSeekBar.setOnTouchListener(new C2990aF(this, this.mSeekBar.getMax()));
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.isSmallerAction = i < this.mCurrentProgress;
        this.mCurrentProgress = i;
        this.mTextView.setText(this.selectInfo + " " + (this.mCurrentProgress + 2));
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            Settings.getInstance().setIntSetting(Settings.HANDWRITE_WIDTH, this.mCurrentProgress + 2);
            updateSummary();
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
