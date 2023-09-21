package com.cootek.smartinput5.engine;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Editor;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.ExplicitManager;
import com.cootek.smartinput5.engine.VerboseManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p049e.C1252b;
import com.cootek.smartinput5.p050f.C1319a;
import com.cootek.smartinput5.p050f.C1334o;
import com.cootek.smartinput5.p066ui.BackSpaceKey;
import com.cootek.smartinput5.p066ui.C2726bF;
import com.cootek.smartinput5.p066ui.C2806cb;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.C2934m;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.cootek.smartinput5.p066ui.FunctionBar;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2828F;
import com.cootek.smartinput5.p066ui.control.ShadowView;
import com.cootek.smartinput5.p066ui.guideintro.C2922a;
import com.cootek.smartinput5.teaching.p065a.C2564f;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

public class SurfaceManager {
    private static final int BG_STATE_CUSTOMISE = 1;
    private static final int BG_STATE_FULLSCREEN = 2;
    private static final int BG_STATE_NONE = 0;
    private static final int BG_STATE_ZOOM_MODE = 4;
    private static final String CLIPBOARD_VIEW = "clipboard_view";
    private static final String ENGINE_PROVIDER_WATERMARK = "engine_provider_watermark";
    public static final String HAND_WRITE_HALF = "hand_write_half";
    private static final String HAND_WRITE_RECOG = "hw_recog=";
    public static final String HAND_WRITE_VIEW = "hand_write_view";
    private static final String LEFT_SCROLL = "left_scroll";
    private static final String POPUP_EXPLICIT = "popup_explicit";
    private static final String POPUP_REVERT = "popup_revert";
    private static final String POPUP_REVERT_INLINE = "popup_revert_inline";
    private static final String REVERSE_ALT_TITLE = "reverse_alt_title";
    private static final String SELECTION = "selection";
    private static final String SK_CLEAR = "sk_clear";
    private static final String SK_ENTER_EXPLICIT = "sk_ent_explicit";
    private static final String SK_SEPARATOR = "sk_separator";
    private static final String SK_SEP_SFT = "sk_sep_sft";
    private static final String SK_SINGLE_WORD = "sk_single_word";
    private static final String STROKE_FADE_OUT = "stroke_fade_out";
    private static final String TAG = "SurfaceManager";
    private static final String TYPING_SPEED_BAR = "typing_speed_bar";
    private static final String URL_NAVIGATOR_VIEW = "url_navigator_view";
    private static final String VOICE_VIEW = "voice_view";
    private static final String WEB_KEY = "web_key";
    private static final String ZHUYIN_FIRST_TONE = "zhuyin_first_tone";
    public static boolean isRightToLeftMode = false;
    private boolean isRunningRecord = false;
    /* access modifiers changed from: private */
    public Context mContext;
    private boolean mDoShortcutBarAnimation = true;
    /* access modifiers changed from: private */
    public Engine mEngine;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    /* access modifiers changed from: private */
    public boolean mInSurfaceDisplayAnimation = false;
    /* access modifiers changed from: private */
    public ViewGroup.LayoutParams mInputViewContainerParam = null;
    private int mInputWindowBgState = 0;
    /* access modifiers changed from: private */
    public boolean mIsDoingAnimation = false;
    /* access modifiers changed from: private */
    public AnimationListener mKeyboardAnimListener = new AnimationListener();
    /* access modifiers changed from: private */
    public Animation[][] mKeyboardAnimations = new Animation[2][];
    private double mLastHeightZoomParam;
    private double mLastWidthZoomParam;
    private String mPrevLanguageId;
    private String mPrevOrientation;
    private String mPrevSubTypeName;
    private ArrayList<Runnable> mRecordRunnables;
    private ShadowView mShadowView;
    private ViewGroup mShadowViewContainer;
    private ShadowView mShadowViewNew;
    private AnimationListener mSlipAnimListener = new AnimationListener();
    private SlipAnimationType mSlipAnimationType = SlipAnimationType.ANIM_NONE;
    private Animation[][] mSlipAnimations = new Animation[2][];

    public enum SlipAnimationType {
        ANIM_NONE,
        ANIM_SLIP_LEFT,
        ANIM_SLIP_RIGHT,
        ANIM_SLIP_UP,
        ANIM_SLIP_DOWN
    }

    public enum ScreenOrientation {
        PORTRAIT(1),
        LANDSCAPE(2),
        SQUARE(3);
        
        public int value;

        private ScreenOrientation(int i) {
            this.value = i;
        }
    }

    public enum SurfaceSubType {
        PHONEPAD(1),
        QWERTY(2),
        TPLUS(3);
        
        public int value;

        private SurfaceSubType(int i) {
            this.value = i;
        }
    }

    public SurfaceManager(Engine engine) {
        this.mEngine = engine;
        this.mContext = this.mEngine.getIms();
        this.mRecordRunnables = new ArrayList<>();
        initAnimations();
    }

    private void initAnimations() {
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.layout_switch_zdist);
        this.mSlipAnimations[0] = new Animation[2];
        this.mSlipAnimations[0][0] = new C2828F(false, true, dimensionPixelSize);
        this.mSlipAnimations[0][1] = new C2828F(true, true, dimensionPixelSize);
        this.mSlipAnimations[0][1].setAnimationListener(this.mSlipAnimListener);
        this.mSlipAnimations[1] = new Animation[2];
        this.mSlipAnimations[1][0] = new C2828F(false, false, dimensionPixelSize);
        this.mSlipAnimations[1][1] = new C2828F(true, false, dimensionPixelSize);
        this.mSlipAnimations[1][1].setAnimationListener(this.mSlipAnimListener);
        this.mKeyboardAnimations[0] = new Animation[2];
        this.mKeyboardAnimations[0][0] = AnimationUtils.loadAnimation(this.mContext, R.anim.up_in);
        this.mKeyboardAnimations[0][1] = AnimationUtils.loadAnimation(this.mContext, R.anim.down_out);
        this.mKeyboardAnimations[0][1].setAnimationListener(this.mKeyboardAnimListener);
        this.mKeyboardAnimations[1] = new Animation[2];
        this.mKeyboardAnimations[1][0] = AnimationUtils.loadAnimation(this.mContext, R.anim.down_in);
        this.mKeyboardAnimations[1][1] = AnimationUtils.loadAnimation(this.mContext, R.anim.up_out);
        this.mKeyboardAnimations[1][1].setAnimationListener(this.mKeyboardAnimListener);
    }

    public void setAnimationType(SlipAnimationType slipAnimationType) {
        this.mSlipAnimationType = slipAnimationType;
    }

    public void updateAnimation() {
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.layout_switch_zdist);
        ((C2828F) this.mSlipAnimations[0][0]).mo9269a(dimensionPixelSize);
        ((C2828F) this.mSlipAnimations[0][1]).mo9269a(dimensionPixelSize);
        ((C2828F) this.mSlipAnimations[1][0]).mo9269a(dimensionPixelSize);
        ((C2828F) this.mSlipAnimations[1][1]).mo9269a(dimensionPixelSize);
    }

    private boolean prepareInputMethodWindowSize() {
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        ad.mo9244c();
        if (ad.mo9263u()) {
            ad.mo9246d();
            ad.mo9257o();
            if (needUpdateLayoutSize(ad.mo9250h(), ad.mo9251i())) {
                ad.mo9240b();
            }
        }
        return true;
    }

    private boolean needUpdateLayoutSize(double d, double d2) {
        boolean z = (this.mLastWidthZoomParam == d && this.mLastHeightZoomParam == d2) ? false : true;
        this.mLastWidthZoomParam = d;
        this.mLastHeightZoomParam = d2;
        return z;
    }

    public void updateSurface() {
        boolean z;
        boolean z2;
        boolean z3;
        BackSpaceKey backSpaceKey;
        int intSetting;
        if (!Engine.isBusy()) {
            boolean z4 = false;
            stopAnimation();
            String surfaceTemplate = this.mEngine.getSurfaceTemplate();
            C2917du widgetManager = this.mEngine.getWidgetManager();
            if (surfaceTemplate == null) {
                SoftKeyboardView g = this.mEngine.getWidgetManager().mo9648g();
                if (g != null) {
                    g.mo8733b();
                    return;
                }
                return;
            }
            prepareInputMethodWindowSize();
            String currentLanguageId = this.mEngine.getCurrentLanguageId();
            String surfaceSubTypeName = getSurfaceSubTypeName();
            if (currentLanguageId != null) {
                if (this.mEngine.getSurfaceType() == 1) {
                    CandidateManager.updateUseSimpleCandidateFlag(currentLanguageId, this.mEngine.getSurfaceSubType());
                }
                boolean z5 = !TextUtils.equals(currentLanguageId, this.mPrevLanguageId);
                boolean z6 = !TextUtils.equals(surfaceSubTypeName, this.mPrevSubTypeName);
                if (z5) {
                    C1368X.m6320c().mo5842o().mo5980z(currentLanguageId);
                }
                if (z5 || z6) {
                    this.mEngine.collectInputData(this.mPrevLanguageId);
                }
                ClokeManager.updateCurrentLanguageCloudInputCategory(currentLanguageId);
                C1368X.m6320c().mo5842o().mo5978x(currentLanguageId);
                if (C1368X.m6320c().mo5842o().mo5954l(currentLanguageId) != null) {
                    isRightToLeftMode = C1368X.m6320c().mo5842o().mo5954l(currentLanguageId).f4735n;
                }
                if (!C2564f.m11470c() && !C1368X.m6320c().mo5850w().mo8415d()) {
                    if (C1593bR.m7162a().f5075a) {
                        if (Settings.getInstance().getBoolSetting(Settings.FIRST_START_KEYBOARD)) {
                            Settings.getInstance().setBoolSetting(Settings.SHOW_LANG_FIRST_SETUP_DLG, false, 17, currentLanguageId, (Config) null, true);
                        } else if (Settings.getInstance().getBoolSetting(Settings.SHOW_LANG_FIRST_SETUP_DLG, 17, currentLanguageId, (Config) null)) {
                            z4 = Engine.getInstance().getDialogManager().showLangFirstSetupDialog(currentLanguageId);
                        }
                    }
                    Settings.getInstance().setIntSetting(Settings.LANGUAGE_USED_TIMES, Settings.getInstance().getIntSetting(Settings.LANGUAGE_USED_TIMES, 17, currentLanguageId, (Config) null) + 1, 17, currentLanguageId, (Config) null, true);
                }
            }
            boolean z7 = z4;
            this.mEngine.updateCachedLayoutAlias();
            if (Settings.getInstance().getBoolSetting(Settings.FIRST_START_KEYBOARD)) {
                Settings.getInstance().setBoolSetting(Settings.FIRST_START_KEYBOARD, false);
                Settings.getInstance().setIntSetting(120, (int) (System.currentTimeMillis() / 1000));
            }
            if (widgetManager.mo9641c(false) != null && widgetManager.mo9641c(false).mo8631d()) {
                widgetManager.mo9641c(false).mo8632e();
            }
            if (widgetManager.mo9642d(false) != null && widgetManager.mo9642d(false).mo8604d()) {
                widgetManager.mo9642d(false).mo8605e();
            }
            if (widgetManager.mo9644e(false) != null && widgetManager.mo9644e(false).mo8623g()) {
                widgetManager.mo9644e(false).mo8624h();
            }
            if (widgetManager.mo9659p() != null) {
                widgetManager.mo9659p().setVisible(false);
            }
            if (widgetManager.mo9653j() != null) {
                widgetManager.mo9653j().mo9120b();
            }
            if (widgetManager.mo9657n() != null) {
                widgetManager.mo9657n().mo9395d();
                widgetManager.mo9657n().mo9396e();
            }
            widgetManager.mo9662s();
            this.mEngine.getWidgetManager().mo9667x().mo9305a(true);
            this.mEngine.getEditor().removeAllListener();
            removeOldKeyboard();
            this.mInSurfaceDisplayAnimation = false;
            SoftKeyboardView g2 = this.mEngine.getWidgetManager().mo9648g();
            if (g2 != null) {
                g2.mo8733b();
            }
            if (!Settings.getInstance().getBoolSetting(87) || g2 == null || SlipAnimationType.ANIM_NONE == this.mSlipAnimationType) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                ViewGroup viewGroup = (ViewGroup) g2.getParent();
                this.mShadowView = new ShadowView(this.mContext);
                this.mShadowView.mo9381a(viewGroup, 0, 0, viewGroup.getWidth(), viewGroup.getHeight());
            }
            SoftKeyboardView a = this.mEngine.getWidgetManager().mo9622a(surfaceTemplate);
            C2811cf cfVar = null;
            if (!(a == null || a.getKeyboard() == null)) {
                cfVar = a.getKeyboard();
                cfVar.mo9189k();
            }
            this.mEngine.getVoiceProcessor().cancelInputVoice();
            this.mEngine.getCandidateManager().removeAllCandidateListener();
            this.mEngine.getFilterManager().removeAllFilterListener();
            this.mEngine.getExplicitManager().removeAllListener();
            this.mEngine.getClokeManager().removeAllClokeListener();
            this.mEngine.getSlideSentenceManager().mo4618a();
            this.mEngine.getInlineManager().removeAllListener();
            this.mEngine.getWarningManager().removeAllListener();
            this.mEngine.getVerboseManager().removeAllListener();
            this.mEngine.getCommitManager().removeAllCommitTextListener();
            this.mEngine.removeAllSelectionListener();
            this.mEngine.getWarningManager().registerListener(0, ((TouchPalIME) this.mEngine.getIms()).getHardKeyProcessor());
            this.mEngine.getWarningManager().registerListener(2, C1368X.m6320c().mo5820F());
            C2934m i = this.mEngine.getWidgetManager().mo9651i();
            i.mo9712a(this.mEngine);
            this.mEngine.getCandidateManager().registerCandidateListener(i);
            this.mEngine.getFilterManager().registerFilterListener(i);
            this.mEngine.getVerboseManager().registerListener(i);
            this.mEngine.getCommitManager().registerCommitTextListener(i);
            this.mEngine.setMutiTouchPaused(false);
            if (cfVar != null && (cfVar instanceof CandidateManager.ICandidateListener)) {
                this.mEngine.getCandidateManager().registerCandidateListener((CandidateManager.ICandidateListener) cfVar);
            }
            widgetManager.mo9626a(a);
            Engine.getInstance().getWidgetManager().mo9637b().getLocationOnScreen(new int[2]);
            boolean z8 = false;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                z2 = z8;
                z3 = z7;
                if (i3 >= this.mEngine.getSurfaceExtraElementsCount()) {
                    break;
                }
                String surfaceExtraElement = this.mEngine.getSurfaceExtraElement(i3);
                if (surfaceExtraElement.equals(POPUP_REVERT)) {
                    this.mEngine.getExplicitManager().registerListener(widgetManager.mo9596A());
                } else if (surfaceExtraElement.equals(POPUP_REVERT_INLINE)) {
                    this.mEngine.getInlineManager().registerListener(widgetManager.mo9596A());
                } else if (surfaceExtraElement.equals(POPUP_EXPLICIT)) {
                    this.mEngine.getExplicitManager().registerListener(widgetManager.mo9597B());
                    this.mEngine.getClokeManager().registerClokeListener(widgetManager.mo9597B());
                } else if (surfaceExtraElement.equals(SK_SINGLE_WORD)) {
                    this.mEngine.getVerboseManager().registerListener((VerboseManager.IVerboseListener) cfVar.mo9182b("sk_1_1"));
                } else if (surfaceExtraElement.equals(SK_SEPARATOR)) {
                    this.mEngine.getExplicitManager().registerListener((ExplicitManager.IExplicitListener) cfVar.mo9182b("sk_sep"));
                } else if (surfaceExtraElement.equals(SK_CLEAR)) {
                    C2806cb b = cfVar.mo9182b("sk_2_4");
                    this.mEngine.getCandidateManager().registerCandidateListener((CandidateManager.ICandidateListener) b);
                    this.mEngine.getExplicitManager().registerListener((ExplicitManager.IExplicitListener) b);
                } else if (surfaceExtraElement.equals(SK_SEP_SFT)) {
                    this.mEngine.getExplicitManager().registerListener((ExplicitManager.IExplicitListener) cfVar.mo9182b(SK_SEP_SFT));
                } else if (surfaceExtraElement.startsWith(HAND_WRITE_VIEW)) {
                    if (C1368X.m6320c().mo5848u().mo5599c()) {
                        widgetManager.mo9598C().setEngineProviderWatermark(surfaceExtraElement.contains(ENGINE_PROVIDER_WATERMARK));
                        widgetManager.mo9598C().setTopView(i.mo9716b());
                        widgetManager.mo9598C().setInputView(a);
                        widgetManager.mo9598C().mo8630c();
                        this.mEngine.getFilterManager().registerFilterListener(widgetManager.mo9598C());
                        this.mEngine.getCandidateManager().registerCandidateListener(widgetManager.mo9598C());
                    } else {
                        Settings.getInstance().setIntSetting(3, 1, 1, C1368X.m6320c().mo5835h().getLanguageCategory(C1549b.f4835f, 1), (Config) null, true);
                    }
                } else if (surfaceExtraElement.startsWith(HAND_WRITE_HALF)) {
                    widgetManager.mo9599D().setEngineProviderWatermark(surfaceExtraElement.contains(ENGINE_PROVIDER_WATERMARK));
                    widgetManager.mo9599D().setTopView(i.mo9716b());
                    widgetManager.mo9599D().setInputView(a);
                    widgetManager.mo9599D().mo8603c();
                    this.mEngine.getFilterManager().registerFilterListener(widgetManager.mo9599D());
                    this.mEngine.getCandidateManager().registerCandidateListener(widgetManager.mo9599D());
                    if (!C1368X.m6320c().mo5848u().mo5599c()) {
                        this.mEngine.getHandWriteMaskManager().showDownloadInfo();
                        z3 = true;
                    }
                } else if (surfaceExtraElement.startsWith(HAND_WRITE_RECOG)) {
                    Settings.getInstance().setIntSetting(29, Settings.HW_RECOG_RANGE_ALL, 8, C1549b.f4835f, (Config) null, true);
                } else if (surfaceExtraElement.equals(VOICE_VIEW)) {
                    widgetManager.mo9601F();
                } else if (surfaceExtraElement.equals(CLIPBOARD_VIEW)) {
                    widgetManager.mo9602G();
                } else if (surfaceExtraElement.equals(URL_NAVIGATOR_VIEW)) {
                    widgetManager.mo9616V();
                } else if (surfaceExtraElement.equals(SK_ENTER_EXPLICIT)) {
                    z2 = true;
                } else if (surfaceExtraElement.equals(LEFT_SCROLL)) {
                    widgetManager.mo9660q();
                    this.mEngine.getFilterManager().registerFilterListener(widgetManager.mo9604J());
                } else if (surfaceExtraElement.equals(SELECTION)) {
                    this.mEngine.getEditor().registerSelectChangedListener((Editor.ISelectChangedListener) cfVar.mo9182b("sk_select"));
                    this.mEngine.getEditor().checkSelectStatus();
                } else if (surfaceExtraElement.equals(ZHUYIN_FIRST_TONE)) {
                    C2806cb b2 = cfVar.mo9182b("sk_sp");
                    if (b2 != null) {
                        this.mEngine.getCandidateManager().registerCandidateListener((CandidateManager.ICandidateListener) b2);
                    }
                } else if (surfaceExtraElement.equals(WEB_KEY)) {
                    C2806cb b3 = cfVar.mo9182b("sk_email_uri");
                    if (b3 != null) {
                        this.mEngine.registerSelectionListener((Engine.ISelectionListener) b3);
                    }
                } else if (surfaceExtraElement.equals("reverse_alt_title")) {
                    this.mEngine.registerSelectionListener(new SpanishChecker());
                } else if (surfaceExtraElement.equals(TYPING_SPEED_BAR)) {
                    this.mEngine.getWidgetManager().mo9653j().mo9119a();
                } else {
                    widgetManager.mo9638b(surfaceExtraElement);
                }
                z8 = z2;
                z7 = z3;
                i2 = i3 + 1;
            }
            if (a != null && widgetManager.mo9605K() != null && widgetManager.mo9605K().getParent() == a.getParent() && (intSetting = Settings.getInstance().getIntSetting(96)) > 0) {
                Toast.makeText(this.mContext, C1974m.m9063a(this.mContext, (int) R.string.symbol_tab_prompt), 1).show();
                Settings.getInstance().setIntSetting(96, intSetting - 1);
            }
            if (cfVar != null) {
                EnterKey enterKey = (EnterKey) cfVar.mo9182b("sk_ent");
                if (enterKey != null) {
                    enterKey.setupKeyTitle();
                    if (z2) {
                        this.mEngine.getExplicitManager().registerListener(enterKey);
                    } else {
                        this.mEngine.getInlineManager().registerListener(enterKey);
                    }
                }
                if (CandidateManager.useSimpleCandidateStyle() && (backSpaceKey = (BackSpaceKey) cfVar.mo9182b("sk_bk")) != null) {
                    this.mEngine.getCandidateManager().registerCandidateListener(backSpaceKey);
                }
                if (cfVar.mo9199u()) {
                    widgetManager.mo9654k();
                    widgetManager.mo9658o();
                    widgetManager.mo9659p().setPartRects(cfVar.f12539L);
                }
            }
            if (z) {
                if (a != null) {
                    ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                    ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                    viewGroup3.addView(this.mShadowView, viewGroup2.getLayoutParams());
                    char c = SlipAnimationType.ANIM_SLIP_LEFT == this.mSlipAnimationType ? (char) 0 : 1;
                    this.mSlipAnimListener.setEndTask(new Runnable() {
                        public void run() {
                            SurfaceManager.this.removeOldKeyboard();
                            boolean unused = SurfaceManager.this.mIsDoingAnimation = false;
                        }
                    });
                    this.mInputViewContainerParam = viewGroup3.getLayoutParams();
                    viewGroup3.setLayoutParams(viewGroup2.getLayoutParams());
                    viewGroup3.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.bg_keyboard_ctrl));
                    this.mIsDoingAnimation = true;
                    this.mShadowView.startAnimation(this.mSlipAnimations[c][1]);
                    viewGroup2.startAnimation(this.mSlipAnimations[c][0]);
                    this.mEngine.setInputPaused(true);
                } else {
                    this.mShadowView.mo9379a();
                }
            }
            if (this.mDoShortcutBarAnimation && Settings.getInstance().getBoolSetting(87)) {
                this.mDoShortcutBarAnimation = false;
                FunctionBar h = this.mEngine.getWidgetManager().mo9650h();
                if (h != null) {
                    h.mo8559s();
                }
            }
            C1252b.f4003h = C1593bR.m7162a().f5075a && cfVar != null && cfVar.f12547T.mo9208a(7);
            if (C1252b.f4003h) {
                widgetManager.mo9656m();
                this.mEngine.getSlideSentenceManager().mo4621a((C1252b.C1253a) widgetManager.mo9657n());
            }
            if (!C1252b.f4003h || !Settings.getInstance().getBoolSetting(Settings.WAVE_WITHOUT_NEXT_WORD_ON_CANDIDATE)) {
                Settings.getInstance().setBoolSetting(2, Settings.getInstance().getAdvancedPredictionSetting(), 4, "western", (Config) null, true);
            } else {
                Settings.getInstance().setBoolSetting(2, false, 4, "western", (Config) null, true);
            }
            collectUserData(surfaceTemplate);
            checkPrompts(z3);
            setInputMethodWindowBg();
        }
    }

    public void checkInputMethodWindowBg() {
        if (this.mInputWindowBgState != 0) {
            int i = 0;
            if (C1368X.m6320c().mo5841n().mo6298t()) {
                i = 1;
                if (Engine.getInstance().getIms().isFullscreenMode()) {
                    i = 3;
                } else if (Engine.getInstance().getWidgetManager().mo9630ad().mo9260r()) {
                    i = 5;
                }
            }
            if (i != this.mInputWindowBgState) {
                setInputMethodWindowBg();
            }
        }
    }

    private void setInputMethodWindowBg() {
        int i;
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        ad.mo9249g();
        this.mInputWindowBgState = 0;
        C1602bh n = C1368X.m6320c().mo5841n();
        if (n.mo6298t() || n.mo6246C().f11468f) {
            this.mInputWindowBgState |= 1;
            if (Engine.getInstance().getIms().isFullscreenMode()) {
                this.mInputWindowBgState |= 2;
                View findViewById = Engine.getInstance().getIms().getWindow().findViewById(16908317);
                View findViewById2 = Engine.getInstance().getIms().getWindow().findViewById(16908318);
                BitmapDrawable w = C1368X.m6320c().mo5841n().mo6301w();
                if (!(findViewById == null || findViewById2 == null || w == null || Engine.getInstance().getWidgetManager().mo9648g() == null)) {
                    int g = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9134g();
                    if (((TouchPalIME) Engine.getInstance().getIms()).isCandidatesViewShown()) {
                        i = Engine.getInstance().getWidgetManager().mo9651i().mo9718d();
                    } else {
                        i = 0;
                    }
                    if (i == 0) {
                        findViewById2.setBackgroundDrawable(w);
                    } else {
                        Bitmap[] a = C1584bI.m7142a(w.getBitmap(), new int[]{i, g});
                        if (a[0] != null) {
                            findViewById.setBackgroundDrawable(new BitmapDrawable(this.mContext.getResources(), a[0]));
                        }
                        if (a[1] != null) {
                            findViewById2.setBackgroundDrawable(new BitmapDrawable(this.mContext.getResources(), a[1]));
                        }
                    }
                }
            } else {
                clearCandidateAndInputBackground();
                ViewGroup b = Engine.getInstance().getWidgetManager().mo9637b();
                if (ad.mo9266x() != 0 && !ad.mo9259q()) {
                    this.mInputWindowBgState |= 4;
                    ad.mo9237a((Drawable) C1368X.m6320c().mo5841n().mo6301w());
                    if (b != null) {
                        b.setBackgroundDrawable((Drawable) null);
                    }
                } else if (b != null) {
                    ad.mo9237a((Drawable) null);
                    b.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6301w());
                } else {
                    return;
                }
            }
        } else {
            clearCandidateAndInputBackground();
            C1368X.m6320c().mo5841n().mo6244A();
            Drawable a2 = C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.bg_keyboard_ctrl, C2726bF.KEYBOARD_BG);
            if (Engine.getInstance().getIms().isFullscreenMode()) {
                ad.mo9237a((Drawable) null);
                ViewGroup b2 = Engine.getInstance().getWidgetManager().mo9637b();
                if (b2 != null) {
                    b2.setBackgroundDrawable(a2);
                }
            } else {
                ViewGroup b3 = Engine.getInstance().getWidgetManager().mo9637b();
                if (b3 != null) {
                    b3.setBackgroundDrawable((Drawable) null);
                }
                ad.mo9237a(a2);
            }
        }
        if (Engine.getInstance().getWidgetManager().mo9637b() != null) {
            Engine.getInstance().getWidgetManager().mo9637b().bringToFront();
        }
    }

    private void clearCandidateAndInputBackground() {
        View findViewById = Engine.getInstance().getIms().getWindow().findViewById(16908318);
        if (findViewById != null) {
            findViewById.setBackgroundDrawable((Drawable) null);
            View findViewById2 = findViewById.findViewById(R.id.Keyboard);
            if (findViewById2 != null) {
                findViewById2.setBackgroundDrawable((Drawable) null);
            }
        }
        View findViewById3 = Engine.getInstance().getIms().getWindow().findViewById(16908317);
        if (findViewById3 != null) {
            findViewById3.setBackgroundDrawable((Drawable) null);
        }
    }

    private boolean enterHandWrite() {
        if (this.mEngine.isHandwriteMaskVisible()) {
            return true;
        }
        for (int i = 0; i < this.mEngine.getSurfaceExtraElementsCount(); i++) {
            String surfaceExtraElement = this.mEngine.getSurfaceExtraElement(i);
            if (surfaceExtraElement.startsWith(HAND_WRITE_HALF) || surfaceExtraElement.startsWith(HAND_WRITE_VIEW)) {
                return true;
            }
        }
        return false;
    }

    private void checkPrompts(boolean z) {
        if (Engine.getInstance().isNormalModeKeyboard() && !Engine.getInstance().getWidgetManager().mo9632af().mo10105g() && !z) {
            if (C1319a.m6097a(C1368X.m6313b(), C1334o.WUBI_Z_MODE)) {
                this.mHandler.postDelayed(new Runnable() {
                    public void run() {
                        SurfaceManager.this.mEngine.getDialogManager().showWizardTipsDialog(C1334o.WUBI_Z_MODE);
                    }
                }, 10);
            } else if (C1319a.m6097a(C1368X.m6313b(), C1334o.SLIDE_INPUT_SYMBOL)) {
                this.mHandler.postDelayed(new Runnable() {
                    public void run() {
                        SurfaceManager.this.mEngine.getDialogManager().showWizardTipsDialog(C1334o.SLIDE_INPUT_SYMBOL);
                    }
                }, 10);
            } else if (C1319a.m6097a(C1368X.m6313b(), C1334o.SPACE_LONG_PRESS)) {
                this.mHandler.postDelayed(new Runnable() {
                    public void run() {
                        SurfaceManager.this.mEngine.getDialogManager().showWizardTipsDialog(C1334o.SPACE_LONG_PRESS);
                    }
                }, 10);
            }
        }
    }

    private void collectUserData(String str) {
        String str2;
        if ("number".equals(str)) {
            C1246d.m6010a(this.mContext).mo4594a(C1246d.f3757aa, true, C1246d.f3783b);
        } else if ("abc".equals(str)) {
            C1246d.m6010a(this.mContext).mo4594a(C1246d.f3758ab, true, C1246d.f3783b);
        } else if (C2922a.f13254a.equals(str)) {
            C1246d.m6010a(this.mContext).mo4594a(C1246d.f3762af, true, C1246d.f3783b);
        } else if (this.mEngine.getSurfaceType() == 1) {
            ScreenOrientation[] values = ScreenOrientation.values();
            int i = 0;
            while (true) {
                if (i >= values.length) {
                    str2 = null;
                    break;
                } else if (values[i].value == Settings.getInstance().getConfig().getOrientation()) {
                    str2 = values[i].name();
                    break;
                } else {
                    i++;
                }
            }
            String surfaceSubTypeName = getSurfaceSubTypeName();
            String currentLanguageId = this.mEngine.getCurrentLanguageId();
            if (currentLanguageId != null && str2 != null && surfaceSubTypeName != null) {
                if (!TextUtils.equals(currentLanguageId, this.mPrevLanguageId) || !TextUtils.equals(str2, this.mPrevOrientation) || !TextUtils.equals(surfaceSubTypeName, this.mPrevSubTypeName)) {
                    C1246d.m6010a(this.mContext).mo4591a(C1246d.f3761ae, currentLanguageId + "__" + str2 + "__" + surfaceSubTypeName, C1246d.f3783b);
                    if (C1549b.f4831b.equalsIgnoreCase(currentLanguageId) && Settings.getInstance().getIntSetting(51) != 1) {
                        currentLanguageId + "(shuangpin)";
                    }
                    this.mPrevLanguageId = currentLanguageId;
                    this.mPrevOrientation = str2;
                    this.mPrevSubTypeName = surfaceSubTypeName;
                }
            }
        }
    }

    private String getSurfaceSubTypeName() {
        SurfaceSubType[] values = SurfaceSubType.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].value == this.mEngine.getSurfaceSubType()) {
                return values[i].name();
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void removeOldKeyboard() {
        if (this.mShadowView != null) {
            ViewGroup viewGroup = (ViewGroup) this.mShadowView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.mShadowView);
                viewGroup.removeView(this.mShadowViewNew);
                viewGroup.removeView(this.mShadowViewContainer);
                viewGroup.setBackgroundDrawable((Drawable) null);
                viewGroup.setLayoutParams(this.mInputViewContainerParam);
            }
            resetSlipAnimations();
            if (this.mShadowView != null) {
                this.mShadowView.mo9379a();
                this.mShadowView = null;
            }
            if (this.mShadowViewNew != null) {
                this.mShadowViewNew.mo9379a();
                this.mShadowViewNew = null;
            }
            this.mShadowViewContainer = null;
            this.mEngine.setInputPaused(false);
        }
    }

    /* access modifiers changed from: private */
    public void resetSlipAnimations() {
        this.mSlipAnimationType = SlipAnimationType.ANIM_NONE;
        for (int i = 0; i < this.mSlipAnimations.length; i++) {
            for (Animation reset : this.mSlipAnimations[i]) {
                reset.reset();
            }
        }
        for (int i2 = 0; i2 < this.mKeyboardAnimations.length; i2++) {
            for (Animation reset2 : this.mKeyboardAnimations[i2]) {
                reset2.reset();
            }
        }
    }

    public void resetFunctionBarAnimation() {
        this.mDoShortcutBarAnimation = true;
    }

    public void updateSurfaceOperation() {
        FunctionBar h = this.mEngine.getWidgetManager().mo9650h();
        if (h != null) {
            h.mo8548k();
        }
    }

    public void updateSurfaceDisplay() {
        final int i = 0;
        SoftKeyboardView g = this.mEngine.getWidgetManager().mo9648g();
        if (g instanceof SoftKeyboardView) {
            final SoftKeyboardView softKeyboardView = g;
            removeOldKeyboard();
            if (!(softKeyboardView == null || SlipAnimationType.ANIM_NONE == this.mSlipAnimationType)) {
                softKeyboardView.mo8733b();
            }
            final ViewGroup viewGroup = (ViewGroup) softKeyboardView.getParent();
            final ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            final Rect rect = softKeyboardView.getKeyboard().f12538K;
            boolean z = Settings.getInstance().getBoolSetting(87) && SlipAnimationType.ANIM_NONE != this.mSlipAnimationType && !this.mInSurfaceDisplayAnimation;
            final ShadowView shadowView = null;
            if (z) {
                this.mInSurfaceDisplayAnimation = true;
                shadowView = new ShadowView(this.mContext);
                if (rect == null || rect.isEmpty()) {
                    shadowView.mo9380a(viewGroup);
                } else {
                    shadowView.mo9382a(viewGroup, rect);
                }
            }
            softKeyboardView.getKeyboard().mo7433a();
            if (z) {
                if (SlipAnimationType.ANIM_SLIP_UP != this.mSlipAnimationType) {
                    i = 1;
                }
                this.mHandler.post(new Runnable() {
                    public void run() {
                        if (SurfaceManager.this.mInSurfaceDisplayAnimation) {
                            final boolean t = C1368X.m6320c().mo5841n().mo6298t();
                            final ShadowView shadowView = new ShadowView(SurfaceManager.this.mContext);
                            if (rect == null || rect.isEmpty()) {
                                shadowView.mo9380a(viewGroup);
                            } else {
                                shadowView.mo9382a(viewGroup, rect);
                            }
                            final FrameLayout frameLayout = new FrameLayout(SurfaceManager.this.mContext);
                            frameLayout.setClipToPadding(true);
                            int i = softKeyboardView.getKeyboard().f12538K.left;
                            if (i == 0) {
                                i = 1;
                            }
                            frameLayout.setPadding(i, softKeyboardView.getKeyboard().f12538K.top, softKeyboardView.getWidth() - softKeyboardView.getKeyboard().f12538K.right, softKeyboardView.getHeight() - softKeyboardView.getKeyboard().f12538K.bottom);
                            frameLayout.addView(shadowView, new ViewGroup.LayoutParams(-1, -1));
                            frameLayout.addView(shadowView, new ViewGroup.LayoutParams(-1, -1));
                            viewGroup2.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                            if (t) {
                                softKeyboardView.setClipRegion(rect);
                                softKeyboardView.mo8725a();
                            }
                            final C12991 r0 = new Runnable() {
                                public void run() {
                                    SurfaceManager.this.mHandler.removeCallbacks(this);
                                    if (shadowView != null) {
                                        ViewGroup viewGroup = (ViewGroup) shadowView.getParent();
                                        if (viewGroup != null) {
                                            viewGroup.removeView(shadowView);
                                            viewGroup.removeView(shadowView);
                                            viewGroup.removeView(frameLayout);
                                            viewGroup.setBackgroundDrawable((Drawable) null);
                                            viewGroup.setLayoutParams(SurfaceManager.this.mInputViewContainerParam);
                                            if (t) {
                                                softKeyboardView.setClipRegion((Rect) null);
                                                softKeyboardView.mo8725a();
                                            }
                                        }
                                        SurfaceManager.this.resetSlipAnimations();
                                        if (shadowView != null) {
                                            shadowView.mo9379a();
                                        }
                                        if (shadowView != null) {
                                            shadowView.mo9379a();
                                        }
                                        SurfaceManager.this.mEngine.setInputPaused(false);
                                    }
                                    boolean unused = SurfaceManager.this.mInSurfaceDisplayAnimation = false;
                                }
                            };
                            SurfaceManager.this.mKeyboardAnimListener.setEndTask(r0);
                            SurfaceManager.this.mKeyboardAnimListener.setStartTask(new Runnable() {
                                public void run() {
                                    SurfaceManager.this.mHandler.postDelayed(r0, SurfaceManager.this.mKeyboardAnimations[i][1].getDuration() + 10);
                                }
                            });
                            ViewGroup.LayoutParams unused = SurfaceManager.this.mInputViewContainerParam = viewGroup2.getLayoutParams();
                            viewGroup2.setLayoutParams(viewGroup.getLayoutParams());
                            viewGroup2.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.bg_keyboard_ctrl));
                            shadowView.startAnimation(SurfaceManager.this.mKeyboardAnimations[i][1]);
                            shadowView.startAnimation(SurfaceManager.this.mKeyboardAnimations[i][0]);
                        }
                    }
                });
            }
        }
    }

    public void updatePopupSurface() {
        C2917du widgetManager = this.mEngine.getWidgetManager();
        if (widgetManager.mo9669z().mo8951c()) {
            widgetManager.mo9669z().mo8948b();
            return;
        }
        SoftKeyboardView g = this.mEngine.getWidgetManager().mo9648g();
        if (g != null) {
            g.mo8735d();
        }
    }

    public void onKeycode(int i) {
        this.mEngine.getWidgetManager().mo9624a(i);
    }

    public void onHide() {
        this.mEngine.getWidgetManager().mo9665v();
        this.mInputWindowBgState = 0;
    }

    private class SpanishChecker implements Engine.ISelectionListener {
        private boolean isFirstTime;
        private boolean mLastPositionIsHead;

        private SpanishChecker() {
            this.mLastPositionIsHead = false;
            this.isFirstTime = true;
        }

        public void onUpdateSelection() {
            doSpanishCheck();
            this.isFirstTime = false;
        }

        public void doSpanishCheck() {
            if (Engine.isInitialized()) {
                Engine instance = Engine.getInstance();
                if (instance.getEditor().getCurrentCursor() == 2) {
                    if (!this.mLastPositionIsHead || this.isFirstTime) {
                        instance.fireLuaCallOperation("reverse_alt_title");
                        instance.processEvent();
                    }
                    this.mLastPositionIsHead = true;
                    return;
                }
                if (this.mLastPositionIsHead || this.isFirstTime) {
                    instance.fireLuaCallOperation(Engine.LUA_CALL_RESTORE_ALT_TITLE);
                    instance.processEvent();
                }
                this.mLastPositionIsHead = false;
            }
        }
    }

    public void recordRunnable(Runnable runnable) {
        this.mRecordRunnables.add(runnable);
    }

    public void runRecordedRunnables() {
        if (!this.isRunningRecord) {
            this.isRunningRecord = true;
            if (this.mRecordRunnables != null && this.mRecordRunnables.size() > 0) {
                Iterator<Runnable> it = this.mRecordRunnables.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                this.mRecordRunnables.clear();
                if (Engine.isInitialized()) {
                    Engine.getInstance().updateResult(1, -1);
                }
            }
            this.isRunningRecord = false;
        }
    }

    public void stopAnimation() {
        SoftKeyboardView g;
        ViewGroup viewGroup;
        if (this.mIsDoingAnimation) {
            if (!(!Engine.isInitialized() || (g = Engine.getInstance().getWidgetManager().mo9648g()) == null || (viewGroup = (ViewGroup) g.getParent()) == null)) {
                viewGroup.clearAnimation();
            }
            this.mIsDoingAnimation = false;
        }
    }
}
