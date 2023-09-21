package com.cootek.smartinput5.p066ui.settings;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.SeekBar;
import android.widget.TextView;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.LongPressDelayPreference */
public class LongPressDelayPreference extends CustomizableDialogPreference implements SeekBar.OnSeekBarChangeListener {
    private final int MAX_LONG_PRESS_DELAY = C1132b.m5654a(this.mContext).mo4397a(C1135d.OPTION_LONG_PRESS_DELAY_MAX, (Integer) 1000).intValue();
    private final int MIN_LONG_PRESS_DELAY = C1132b.m5654a(this.mContext).mo4397a(C1135d.OPTION_LONG_PRESS_DELAY_MIN, (Integer) 200).intValue();
    private final int PROGRESS_BAR_STEP = C1132b.m5654a(this.mContext).mo4397a(C1135d.OPTION_LONG_PRESS_PROGRESSBAR_STEP, (Integer) 50).intValue();
    private Context mContext;
    private int mCurrentProgress = ((HighFreqSettings.getInstance().longPressDelay - this.MIN_LONG_PRESS_DELAY) / this.PROGRESS_BAR_STEP);
    private SeekBar mSeekBar;
    private TextView mTextView;
    private String mUnit = getResString(R.string.optpage_long_press_delay_unit);

    public LongPressDelayPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        updateSummary();
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        super.showDialog(bundle);
        this.mCurrentProgress = (HighFreqSettings.getInstance().longPressDelay - this.MIN_LONG_PRESS_DELAY) / this.PROGRESS_BAR_STEP;
        Dialog dialog = getDialog();
        this.mSeekBar = (SeekBar) dialog.findViewById(R.id.long_press_seekbar);
        if (this.mSeekBar != null) {
            this.mSeekBar.setMax((this.MAX_LONG_PRESS_DELAY - this.MIN_LONG_PRESS_DELAY) / this.PROGRESS_BAR_STEP);
            this.mSeekBar.setOnSeekBarChangeListener(this);
            this.mSeekBar.setProgress(this.mCurrentProgress);
        }
        this.mTextView = (TextView) dialog.findViewById(R.id.long_press_delay);
        updateInfo(HighFreqSettings.getInstance().longPressDelay);
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            Settings.getInstance().setIntSetting(Settings.LONG_PRESS_DELAY, getLongPressDelay(this.mCurrentProgress));
            updateSummary();
        }
    }

    private int getLongPressDelay(int i) {
        return (this.PROGRESS_BAR_STEP * i) + this.MIN_LONG_PRESS_DELAY;
    }

    private void updateSummary() {
        setSummary(Integer.toString(getLongPressDelay(this.mCurrentProgress)) + this.mUnit);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.mCurrentProgress = i;
        updateInfo(getLongPressDelay(this.mCurrentProgress));
    }

    private void updateInfo(int i) {
        if (this.mTextView != null) {
            this.mTextView.setText(getResString(R.string.optpage_long_press_delay_info) + Integer.toString(i) + this.mUnit);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
