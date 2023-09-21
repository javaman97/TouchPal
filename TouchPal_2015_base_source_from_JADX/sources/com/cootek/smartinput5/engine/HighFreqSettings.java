package com.cootek.smartinput5.engine;

import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;

public class HighFreqSettings {
    private static HighFreqSettings sInstance;
    public final int MAX_SOUND_VOLUME = C1132b.m5654a(C1368X.m6313b()).mo4397a(C1135d.OPTION_KEYPRESS_SOUND_MAX_VOLUME, (Integer) 8).intValue();
    public final int MAX_VIBRATE = C1132b.m5654a(C1368X.m6313b()).mo4397a(C1135d.OPTION_KEYPRESS_VIBRATION_TIME_MAX, (Integer) 200).intValue();
    public final boolean accessibilityEnabled;
    public final boolean applySystemVibrate;
    public final boolean applySystemVolume;
    public final boolean arcticCloudInputEnable;
    public final int clokeEnableMode;
    public final boolean cloudServiceWifiOnly;
    public final boolean firstChsMode;
    public final boolean firstDelWizard;
    public final int firstStartTime;
    public final boolean forbidSimpleCandidateStyle;
    public final int longPressDelay;
    public final int previewLevel;
    public final boolean showDoubleClickShiftTips;
    public final int sound;
    public final int spaceLongpressState;
    public final int vibrate;

    public static synchronized HighFreqSettings getInstance() {
        HighFreqSettings highFreqSettings;
        synchronized (HighFreqSettings.class) {
            if (sInstance == null) {
                sInstance = new HighFreqSettings();
            }
            highFreqSettings = sInstance;
        }
        return highFreqSettings;
    }

    public static synchronized void reset() {
        synchronized (HighFreqSettings.class) {
            sInstance = null;
        }
    }

    private HighFreqSettings() {
        Settings instance = Settings.getInstance();
        this.previewLevel = instance.getIntSetting(Settings.PREVIEW_LEVEL);
        this.vibrate = instance.getIntSetting(Settings.VIBRATE_TIME);
        this.sound = instance.getIntSetting(72);
        this.firstStartTime = instance.getIntSetting(120);
        this.clokeEnableMode = instance.getIntSetting(Settings.CLOKE_ENABLE_MODE);
        this.applySystemVolume = instance.getBoolSetting(99);
        this.applySystemVibrate = instance.getBoolSetting(Settings.APPLY_SYSTEM_VIBRATE);
        this.firstDelWizard = instance.getBoolSetting(115);
        this.firstChsMode = instance.getBoolSetting(Settings.FIRST_CHS_MORE);
        this.showDoubleClickShiftTips = instance.getBoolSetting(Settings.SHOW_DOUBLE_CLICK_SHIFT_TIPS);
        this.spaceLongpressState = instance.getIntSetting(Settings.SPACE_LONG_PRESS_TIP_STATE);
        this.forbidSimpleCandidateStyle = instance.getBoolSetting(Settings.FORBID_SIMPLE_CANDIDATE_STYLE);
        this.accessibilityEnabled = instance.getBoolSetting(Settings.ACCESSIBILITY_ENABLED);
        this.arcticCloudInputEnable = instance.getBoolSetting(Settings.ARCTIC_CLOUD_INPUT_ENABLE);
        this.cloudServiceWifiOnly = instance.getBoolSetting(Settings.CLOUD_SERVICE_WIFI_ONLY);
        this.longPressDelay = instance.getIntSetting(Settings.LONG_PRESS_DELAY);
    }
}
