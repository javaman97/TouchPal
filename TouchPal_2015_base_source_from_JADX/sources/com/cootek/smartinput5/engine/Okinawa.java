package com.cootek.smartinput5.engine;

import android.content.Context;
import android.os.Handler;
import com.cootek.smartinput5.engine.cloke.CloudFeedback;
import com.cootek.smartinput5.engine.cloke.CloudParameters;
import com.cootek.smartinput5.engine.cloke.CloudResultList;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.SoftKeyActionInfo;
import com.cootek.smartinput5.p066ui.SoftKeyInfo;

public class Okinawa {
    public static final int ADJUST_FLAG_ABSOLUTE = 1;
    public static final int ADJUST_FLAG_AUTO = 0;
    @Deprecated
    public static final int ADJUST_FLAG_RELATIVE = 2;
    public static final int ADJUST_FLAG_RESET = 3;
    public static final int COMMIT_TYPE_KEYCODE = 2;
    public static final int COMMIT_TYPE_TEXT = 1;
    public static final int TRANS_BEGIN = 1;
    public static final int TRANS_END = 2;
    private Engine mEngine;
    private Handler mHandler;
    private OkinawaCallBackManager mInterfaceCallBackManager = OkinawaCallBackManager.getInstance();
    private C1290OS mInterfaceOS = new C1290OS();
    private Settings mInterfaceSettings = Settings.getInstance();
    private Storage mInterfaceStorage;
    private Config mInterfaceSystemConfig = Settings.getInstance().getConfig();
    private final Runnable mProcessEventRunnable;

    private native void unInitialImeCore();

    public native boolean cloudHandwriteUpdate();

    public native void fireAddAdOperation(String str);

    public native void fireAddCandidateEndOperation();

    public native void fireAddCandidateOperation(String str);

    public native void fireAddUserwordOperation(String str, String str2, int i);

    public native void fireAdjustWordpriorityOperation(int i, int i2, int i3);

    public native void fireAdjustWordpriorityOperation(String str, int i, int i2, int i3);

    public native void fireCandidateEndOperation(int i);

    public native void fireCheckImageOperation(String str, int i, int i2);

    public native void fireCleanupOperation();

    public native void fireClearNextwordOperation();

    public native void fireCloudCandidateOperation(int i, int i2);

    public native void fireCloudResultOperation(String str, String str2, CloudResultList[] cloudResultListArr);

    public native void fireCommitOperation(int i);

    public native void fireCommitOperation(String str);

    public native void fireCommitOperation(String str, int i, int i2);

    public native void fireConfigChangeOperation();

    public native void fireConfirmCandidateOperation(int i);

    public native void fireConfirmNextphraseOperation(int i);

    public native void fireConfirmNextwordOperation(int i);

    public native void fireDeleteAdOperation(String str);

    public native void fireDeleteUserWordOperation(int i, boolean z);

    public native void fireDeleteUserWordOperation(String str, String str2, int i, boolean z);

    public native void fireExportUserDictionaryOperation(String str, String str2);

    public native void fireFinishInputOperation();

    public native void fireFinishInputViewOperation();

    public native void fireHandwriteOperation(MoveContrail moveContrail);

    public native void fireHardKeyOperation(int i, int i2, int i3);

    public native void fireImportUserDataOperation();

    public native void fireImportUserDictionaryOperation(String str, String str2);

    public native void fireInputMultiOperation(String str, boolean z);

    public native void fireKeyOperation(SoftKeyActionInfo softKeyActionInfo, int i, int i2);

    public native void fireLearnTextOperation(String str, int i, int i2);

    public native void fireLocalCloudResultOperation();

    public native void fireLocalCloudSearchOperation();

    public native void fireLuaCallOperation(String str);

    public native void fireRetrieveNextwordOperation();

    public native void fireSelectCandidateOperation(int i);

    public native void fireSelectDialectOperation(int i);

    public native void fireSelectFilterOperation(int i);

    public native void fireSelectMistypeCorrectOperation(int i);

    public native void fireSelectUserwordOperation(int i);

    public native void fireSetDefaultCandidateOperation(int i);

    public native void fireSettingsChangedOperation(int i);

    public native void fireSlipOperation(int i);

    public native void fireStartInputOperation(int i, int i2, boolean z);

    public native void fireStartInputViewOperation(int i, int i2, boolean z);

    public native void fireTimeOperation(int i, int i2);

    public native void fireTransactionOperation(int i);

    public native void fireUpdateSelectionOperation(int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public native String getAccessibilityString();

    public native FilterItem getActiveFilterItem(FilterItem filterItem);

    public native int[] getAllKeyId();

    public native int getCallbackTicks();

    public native int getCandidateFirstIndex();

    public native CandidateItem getCandidateItem(int i, CandidateItem candidateItem);

    public native String getCandidateItemPredictText(int i);

    public native int getCandidateItemPriority(int i);

    public native int getCandidateItemSource(int i);

    public native CandidateItem getCloudCandidateItem(int i, CandidateItem candidateItem, int i2);

    public native String getCloudCandidateItemPredictText(int i);

    public native CloudFeedback getCloudFeedback(CloudFeedback cloudFeedback);

    public native int getCloudInputType();

    public native CloudParameters getCloudParameters(String str, CloudParameters cloudParameters);

    public native int getCommitCorrectionCount(int i);

    public native int getCommitCount();

    public native String getCommitDefaultItemText(int i);

    public native int getCommitDictTag(int i);

    public native CurveInputContext getCommitEffectiveCurveInputContext(int i, CurveInputContext curveInputContext, CurveInputPoint[] curveInputPointArr);

    public native int getCommitEffectiveCurveInputPointsSize(int i);

    public native int getCommitEffectiveInputType(int i);

    public native int getCommitEffectiveTouchInputCodesSize(int i);

    public native TouchInputContext getCommitEffectiveTouchInputContext(int i, TouchInputContext touchInputContext, TouchInputCode[] touchInputCodeArr);

    public native String getCommitEvidence(int i);

    public native String[] getCommitHistory(int i);

    public native int getCommitKeyEvent(int i);

    public native String getCommitLangId(int i);

    public native CurveInputContext getCommitLastWrongCurveInputContext(int i, CurveInputContext curveInputContext, CurveInputPoint[] curveInputPointArr);

    public native int getCommitLastWrongCurveInputPointsSize(int i);

    public native int getCommitLastWrongInputType(int i);

    public native int getCommitLastWrongTouchInputCodesSize(int i);

    public native TouchInputContext getCommitLastWrongTouchInputContext(int i, TouchInputContext touchInputContext, TouchInputCode[] touchInputCodeArr);

    public native SibCandidateItem[] getCommitSibCandidateItems(int i, SibCandidateItem[] sibCandidateItemArr);

    public native int getCommitSibCandidateItemsSize(int i);

    public native int getCommitSource(int i);

    public native String getCommitText(int i);

    public native int getCommitType(int i);

    public native int getCommitWrongInputTimes(int i);

    public native ExplicitInfo getConfirmedInfo(ExplicitInfo explicitInfo);

    public native String getConfirmedText();

    public native String getCurrentCell();

    public native String getCurrentLanguageId();

    public native String getCurrentLanguageShortName();

    public native int getDefaultCandidateItemIndex();

    public native int getDefaultKeyId();

    public native CandidateItem getDialectItem(int i, CandidateItem candidateItem);

    public native int getDictOptions();

    public native String[] getEditableUserWordList(String str);

    public native int getEnabledLanguageCount();

    public native String getEnabledLanguageFullName(int i);

    public native String getEnabledLanguageId(int i);

    public native int getEraseCountAfterCursor();

    public native int getEraseCountBeforeCursor();

    public native int getErrorCode();

    public native String getErrorLanguageId();

    public native String getErrorMsg();

    public native ExplicitInfo getExplicitInfo(ExplicitInfo explicitInfo);

    public native String getExplicitText();

    public native FilterItem getFilterItem(int i, FilterItem filterItem);

    public native int getFilterSize();

    public native int getFilterType();

    public native int getHandwriteEngineType();

    public native ExplicitInfo getInlineInfo(ExplicitInfo explicitInfo);

    public native String getInlineText();

    public native int getInternalErrorCode();

    public native int getKeyId(String str);

    public native int getKeySupportedOperation(int i);

    public native String getLanguageCategory(String str, int i);

    public native int getLanguageSupportLayout(String str);

    public native int getLanguageSupportSubType(String str);

    public native String getLayoutAlias();

    public native String getLearnedSentence();

    public native CandidateItem getNextphraseItemDirectly(int i, CandidateItem candidateItem);

    public native CandidateItem getNextwordItemDirectly(int i, CandidateItem candidateItem);

    public native int getOceanTicks();

    public native int getOkinawaTicks();

    public native String getOriginalLetters(String str);

    public native String getPreUsedLanguageShortName();

    public native String getPreviewText(int i, int i2);

    public native String[] getShortcutList();

    public native int getStatisticDataCount();

    public native String getStatisticDataPath(int i);

    public native String getStatisticDataValue(String str);

    public native int getSurfaceAttribute();

    public native String getSurfaceExtraElement(int i);

    public native int getSurfaceExtraElementsCount();

    public native int getSurfaceSubType();

    public native int getSurfaceSupportedMode();

    public native int getSurfaceSupportedOperation();

    public native String getSurfaceTemplate();

    public native int getSurfaceType();

    public native int getTriStatus(int i);

    public native int getUserWordCount(String str);

    public native CandidateItem getUserWordItem(int i, CandidateItem candidateItem);

    public native int getWordFilter();

    public native boolean hasCandidate();

    public native boolean hasCloudCandidate(int i);

    public native boolean hasDialect();

    public native boolean hasNextphrase();

    public native boolean hasNextword();

    public native boolean hasUserword();

    public native void initialImeCore(Settings settings, OkinawaCallBackManager okinawaCallBackManager, Storage storage, Config config, C1290OS os);

    public native boolean isBopomofoTone(int i);

    public native boolean isClickTransMode();

    public native boolean isCommitActive(int i);

    public native boolean isCurrentLanguageSupportCurve();

    public native boolean isHandwriteMaskVisible();

    public native boolean isTransactionMode();

    public native boolean isUserWordMode();

    public native boolean isWordContact(String str, String str2);

    public native void printPerformanceData(long j);

    public native void processEvent();

    public native String[] queryChinesePronunciation(String str);

    public native void releasePinyinCache();

    public native void reloadHandwriteEngine();

    public native void setClickTransMode(boolean z);

    public native void updateKey(int i, SoftKeyInfo softKeyInfo);

    static {
        C1368X.m6287a();
    }

    public Okinawa(Context context) {
        this.mInterfaceStorage = new Storage(context);
        initialImeCore(this.mInterfaceSettings, this.mInterfaceCallBackManager, this.mInterfaceStorage, this.mInterfaceSystemConfig, this.mInterfaceOS);
        this.mHandler = new Handler();
        this.mProcessEventRunnable = new Runnable() {
            public void run() {
                Okinawa.this.processEvent();
            }
        };
    }

    public void restartImeCore() {
        release();
        init();
    }

    public void release() {
        unInitialImeCore();
        changeEngineState(false);
    }

    private void changeEngineState(boolean z) {
        if (this.mEngine != null) {
            this.mEngine.setEnable(z);
        }
    }

    public void init() {
        initialImeCore(this.mInterfaceSettings, this.mInterfaceCallBackManager, this.mInterfaceStorage, this.mInterfaceSystemConfig, this.mInterfaceOS);
        changeEngineState(true);
    }

    public Okinawa setEngine(Engine engine) {
        this.mEngine = engine;
        return this;
    }

    public Editor getEditor() {
        if (this.mEngine != null) {
            return this.mEngine.getEditor();
        }
        return null;
    }

    public void updateResult(int i, int i2) {
        if (this.mEngine != null) {
            this.mEngine.updateResult(i, i2);
        }
    }

    public void onManualOperation() {
        C1368X.m6320c().mo5822H().mo6202d();
    }

    public void postProcessEvent() {
        this.mHandler.post(this.mProcessEventRunnable);
    }
}
