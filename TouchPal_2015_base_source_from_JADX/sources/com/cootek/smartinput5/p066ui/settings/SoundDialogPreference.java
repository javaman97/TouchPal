package com.cootek.smartinput5.p066ui.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.baidu.pcs.BaiduPCSClient;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.SoundDialogPreference */
public class SoundDialogPreference extends CustomizableDialogPreference implements CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    public static final float maxVolume = ((float) HighFreqSettings.getInstance().MAX_SOUND_VOLUME);
    /* access modifiers changed from: private */
    public boolean isSmallerAction = false;
    private CheckBox mApplySystemVolume;
    private AudioManager mAudioManager;
    private Boolean mChecked = Boolean.valueOf(Settings.getInstance().getBoolSetting(99));
    /* access modifiers changed from: private */
    public int mCurrentProgress = Settings.getInstance().getIntSetting(72);
    /* access modifiers changed from: private */
    public SeekBar mSeekBar;
    private TextView mTextView;
    private Resources resources = getContext().getResources();
    private String selectInfo = getResString(R.string.optpage_sound_info);

    static /* synthetic */ int access$004(SoundDialogPreference soundDialogPreference) {
        int i = soundDialogPreference.mCurrentProgress + 1;
        soundDialogPreference.mCurrentProgress = i;
        return i;
    }

    public SoundDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        updateSummary();
    }

    private void updateSummary() {
        if (this.mChecked.booleanValue()) {
            setSummary(getResString(R.string.optpage_apply_system_volume));
        } else {
            setSummary(this.selectInfo + " " + (this.mCurrentProgress == 0 ? getResString(R.string.optpage_volume1) : Integer.valueOf(this.mCurrentProgress)));
        }
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        super.showDialog(bundle);
        Dialog dialog = getDialog();
        this.mSeekBar = (SeekBar) dialog.findViewById(R.id.key_volume_seek);
        this.mSeekBar.setMax((int) maxVolume);
        this.mTextView = (TextView) dialog.findViewById(R.id.key_volume_progress);
        this.mApplySystemVolume = (CheckBox) dialog.findViewById(R.id.key_volume_media);
        if (!C1132b.m5654a(getContext()).mo4395a(C1135d.OPTION_SHOW_APPLY_SYS_RING_VOLUME.toString(), (Boolean) true).booleanValue()) {
            this.mApplySystemVolume.setVisibility(8);
        }
        this.mCurrentProgress = Settings.getInstance().getIntSetting(72);
        this.mSeekBar.setProgress(this.mCurrentProgress);
        this.mSeekBar.setOnSeekBarChangeListener(this);
        this.mChecked = Boolean.valueOf(Settings.getInstance().getBoolSetting(99));
        this.mApplySystemVolume.setChecked(this.mChecked.booleanValue());
        this.mApplySystemVolume.setOnCheckedChangeListener(this);
        if (this.mChecked.booleanValue()) {
            this.mSeekBar.setEnabled(false);
            this.mTextView.setText(this.selectInfo + " " + getResString(R.string.optpage_apply_system_volume));
        } else {
            this.mSeekBar.setEnabled(true);
            this.mTextView.setText(this.selectInfo + " " + (this.mCurrentProgress == 0 ? getResString(R.string.optpage_volume1) : Integer.valueOf(this.mCurrentProgress)));
        }
        this.mSeekBar.setOnTouchListener(new C3131cZ(this, this.mSeekBar.getMax()));
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.isSmallerAction = i < this.mCurrentProgress;
        this.mCurrentProgress = i;
        this.mTextView.setText(this.selectInfo + " " + (this.mCurrentProgress == 0 ? getResString(R.string.optpage_volume1) : Integer.valueOf(this.mCurrentProgress)));
        if (!Settings.getInstance().getBoolSetting(99)) {
            float f = ((float) this.mCurrentProgress) / maxVolume;
            if (this.mAudioManager == null) {
                this.mAudioManager = (AudioManager) getContext().getSystemService(BaiduPCSClient.Type_Stream_Audio);
            }
            this.mAudioManager.playSoundEffect(5, f * f);
        }
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            Settings.getInstance().setIntSetting(72, this.mCurrentProgress);
            Settings.getInstance().setBoolSetting(99, this.mChecked.booleanValue());
            updateSummary();
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.mChecked = Boolean.valueOf(z);
        if (this.mChecked.booleanValue()) {
            this.mSeekBar.setEnabled(false);
            this.mTextView.setText(this.selectInfo + " " + getResString(R.string.optpage_apply_system_volume));
            return;
        }
        this.mSeekBar.setEnabled(true);
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) getContext().getSystemService(BaiduPCSClient.Type_Stream_Audio);
        }
        float f = ((float) this.mCurrentProgress) / maxVolume;
        this.mAudioManager.playSoundEffect(5, f * f);
        this.mTextView.setText(this.selectInfo + " " + (this.mCurrentProgress == 0 ? getResString(R.string.optpage_volume1) : Integer.valueOf(this.mCurrentProgress)));
    }
}
