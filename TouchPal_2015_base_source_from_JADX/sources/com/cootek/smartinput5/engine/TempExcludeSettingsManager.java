package com.cootek.smartinput5.engine;

import android.view.inputmethod.EditorInfo;
import com.cootek.smartinput5.func.C1368X;

public class TempExcludeSettingsManager {
    private static final int SETTING_TYPE_BOOLEAN = 0;
    private static final int SETTING_TYPE_INT = 1;
    private static final int SETTING_TYPE_LONG = 2;
    private static final int SETTING_TYPE_STRING = 3;

    public enum SpecialSettingItem {
        ITEM_KEYBOARD_LAYOUT {
            /* access modifiers changed from: package-private */
            public boolean isTempExcluded() {
                return !SpecialSettingItem.isInputTypeSupported(getSupportedSpecialInputType());
            }

            /* access modifiers changed from: package-private */
            public int getSettingId() {
                return 4;
            }

            /* access modifiers changed from: package-private */
            public Object getSpecialModeDefaultValue() {
                return null;
            }

            /* access modifiers changed from: package-private */
            public int getSettingType() {
                return 1;
            }

            private int[] getSupportedSpecialInputType() {
                return new int[]{4};
            }
        },
        ITEM_KEYBOARD_SUBTYPE {
            /* access modifiers changed from: package-private */
            public boolean isTempExcluded() {
                return !SpecialSettingItem.isInputTypeSupported(getSupportedSpecialInputType());
            }

            /* access modifiers changed from: package-private */
            public int getSettingId() {
                return 3;
            }

            /* access modifiers changed from: package-private */
            public Object getSpecialModeDefaultValue() {
                return null;
            }

            /* access modifiers changed from: package-private */
            public int getSettingType() {
                return 1;
            }

            private int[] getSupportedSpecialInputType() {
                return new int[]{4};
            }
        },
        ITEM_WORD_PREDICTION {
            /* access modifiers changed from: package-private */
            public boolean isTempExcluded() {
                return !isPredictionSupported(Engine.getInstance().getEditor());
            }

            /* access modifiers changed from: package-private */
            public int getSettingId() {
                return 1;
            }

            /* access modifiers changed from: package-private */
            public Object getSpecialModeDefaultValue() {
                return false;
            }

            /* access modifiers changed from: package-private */
            public int getSettingType() {
                return 0;
            }

            private int[] getSupportedSpecialInputType() {
                return new int[]{4};
            }

            private boolean isPredictionSupported(Editor editor) {
                if (editor == null) {
                    return false;
                }
                if (editor.getInputType() == 0) {
                    return SpecialSettingItem.isTextEditorSupportPredict(editor.getEditorInfo());
                }
                return SpecialSettingItem.isInputTypeSupported(getSupportedSpecialInputType());
            }
        },
        ITEM_TOUCH_CORRECT {
            /* access modifiers changed from: package-private */
            public boolean isTempExcluded() {
                Editor editor;
                if (!C1368X.m6324d() || !Engine.isInitialized() || (editor = Engine.getInstance().getEditor()) == null) {
                    return false;
                }
                if (!C1368X.m6320c().mo5821G().mo7180a(editor.getEditorInfo())) {
                    return true;
                }
                return false;
            }

            /* access modifiers changed from: package-private */
            public int getSettingId() {
                return 39;
            }

            /* access modifiers changed from: package-private */
            public Object getSpecialModeDefaultValue() {
                return false;
            }

            /* access modifiers changed from: package-private */
            public int getSettingType() {
                return 0;
            }
        },
        ITEM_FORWARD_PREDICTION {
            /* access modifiers changed from: package-private */
            public boolean isTempExcluded() {
                Editor editor;
                if (!C1368X.m6324d() || !Engine.isInitialized() || (editor = Engine.getInstance().getEditor()) == null) {
                    return false;
                }
                if (!C1368X.m6320c().mo5821G().mo7182b(editor.getEditorInfo())) {
                    return true;
                }
                return false;
            }

            /* access modifiers changed from: package-private */
            public int getSettingId() {
                return 55;
            }

            /* access modifiers changed from: package-private */
            public Object getSpecialModeDefaultValue() {
                return false;
            }

            /* access modifiers changed from: package-private */
            public int getSettingType() {
                return 0;
            }
        },
        ITEM_SMART_AUTOSPACE {
            /* access modifiers changed from: package-private */
            public boolean isTempExcluded() {
                Editor editor;
                if (!C1368X.m6324d() || !Engine.isInitialized() || (editor = Engine.getInstance().getEditor()) == null) {
                    return false;
                }
                if (!C1368X.m6320c().mo5821G().mo7184c(editor.getEditorInfo())) {
                    return true;
                }
                return false;
            }

            /* access modifiers changed from: package-private */
            public int getSettingId() {
                return 56;
            }

            /* access modifiers changed from: package-private */
            public Object getSpecialModeDefaultValue() {
                return false;
            }

            /* access modifiers changed from: package-private */
            public int getSettingType() {
                return 0;
            }
        };

        /* access modifiers changed from: package-private */
        public abstract int getSettingId();

        /* access modifiers changed from: package-private */
        public abstract int getSettingType();

        /* access modifiers changed from: package-private */
        public abstract Object getSpecialModeDefaultValue();

        /* access modifiers changed from: package-private */
        public abstract boolean isTempExcluded();

        /* access modifiers changed from: private */
        public static boolean isTextEditorSupportPredict(EditorInfo editorInfo) {
            if (editorInfo == null || editorInfo.inputType == 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public static boolean isInputTypeSupported(int[] iArr) {
            int inputType = Engine.getInstance().getEditor().getInputType();
            if (inputType == 0) {
                return true;
            }
            if (iArr != null) {
                for (int i : iArr) {
                    if (inputType == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static void checkTempExcludeSettings() {
        for (SpecialSettingItem specialSettingItem : SpecialSettingItem.values()) {
            int settingId = specialSettingItem.getSettingId();
            if (specialSettingItem.isTempExcluded()) {
                Settings.getInstance().addTempExcludeSetting(settingId);
                setValue(specialSettingItem, specialSettingItem.getSpecialModeDefaultValue());
            } else {
                Settings.getInstance().removeTempExcludeSetting(settingId);
            }
        }
    }

    private static void setValue(SpecialSettingItem specialSettingItem, Object obj) {
        if (specialSettingItem != null && obj != null) {
            int settingType = specialSettingItem.getSettingType();
            if (settingType == 0) {
                Settings.getInstance().setBoolSetting(specialSettingItem.getSettingId(), ((Boolean) obj).booleanValue());
            } else if (settingType == 1) {
                Settings.getInstance().setIntSetting(specialSettingItem.getSettingId(), ((Integer) obj).intValue());
            } else if (settingType == 2) {
                Settings.getInstance().setLongSetting(specialSettingItem.getSettingId(), ((Long) obj).longValue());
            } else if (settingType == 3) {
                Settings.getInstance().setStringSetting(specialSettingItem.getSettingId(), (String) obj);
            }
        }
    }
}
