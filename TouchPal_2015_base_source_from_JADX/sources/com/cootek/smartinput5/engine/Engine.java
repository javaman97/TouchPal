package com.cootek.smartinput5.engine;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.inputmethodservice.InputMethodService;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import android.widget.Toast;
import com.baidu.pcs.BaiduPCSClient;
import com.cootek.p042a.p043a.C0898b;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.StartupToast;
import com.cootek.smartinput5.GuideIntroM;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.cust.CustomizeSettings;
import com.cootek.smartinput5.daemon.DaemonManager;
import com.cootek.smartinput5.engine.cloke.CloudFeedback;
import com.cootek.smartinput5.engine.cloke.CloudParameters;
import com.cootek.smartinput5.engine.cloke.CloudResultList;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1372a;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1579bD;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1608bk;
import com.cootek.smartinput5.func.C1725i;
import com.cootek.smartinput5.func.LocaleLanguageDownloadReceiver;
import com.cootek.smartinput5.func.SuperDictDownloadReceiver;
import com.cootek.smartinput5.func.component.C1659T;
import com.cootek.smartinput5.func.component.C1665Z;
import com.cootek.smartinput5.func.learnmanager.C1819b;
import com.cootek.smartinput5.func.nativeads.C1896t;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p052b.C1550c;
import com.cootek.smartinput5.func.p053c.C1630a;
import com.cootek.smartinput5.func.p054d.C1705a;
import com.cootek.smartinput5.func.p054d.C1706b;
import com.cootek.smartinput5.func.p054d.C1708d;
import com.cootek.smartinput5.func.p054d.C1709e;
import com.cootek.smartinput5.func.p054d.C1710f;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.share.C1979a;
import com.cootek.smartinput5.func.skin.C1997k;
import com.cootek.smartinput5.func.yahoosearch.C2137q;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.net.cmd.C2268c;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p047c.C1194T;
import com.cootek.smartinput5.p047c.C1199d;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p049e.C1252b;
import com.cootek.smartinput5.p050f.C1319a;
import com.cootek.smartinput5.p050f.C1334o;
import com.cootek.smartinput5.p066ui.C2618H;
import com.cootek.smartinput5.p066ui.C2626M;
import com.cootek.smartinput5.p066ui.C2678aR;
import com.cootek.smartinput5.p066ui.C2810ce;
import com.cootek.smartinput5.p066ui.C2892cy;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.SoftKeyActionInfo;
import com.cootek.smartinput5.p066ui.SoftKeyInfo;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.cootek.smartinput5.p066ui.control.C2829G;
import com.cootek.smartinput5.p066ui.control.C2849W;
import com.cootek.smartinput5.p066ui.p068b.C2717b;
import com.cootek.smartinput5.p066ui.settings.InvitationDialog;
import com.cootek.smartinput5.p066ui.settings.KeyboardCustomizeActivity;
import com.cootek.smartinput5.p066ui.settings.SkinCustomizeActivity;
import com.cootek.smartinput5.p066ui.settings.UsrWordManageActivity;
import com.cootek.smartinput5.presentations.C2515q;
import com.cootek.smartinput5.presentations.PresentationWebviewActivity;
import com.cootek.smartinput5.teaching.p065a.C2564f;
import com.emoji.keyboard.touchpal.R;
import com.google.android.voiceime.VoiceRecognitionTrigger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

public class Engine {
    public static final int CHANGE_ACCESSIBILITY = 2097152;
    public static final int CHANGE_ACTIVE_CORRECT = 32768;
    public static final int CHANGE_ACTIVE_FILTER = 128;
    public static final int CHANGE_CANDIDATE = 16;
    public static final int CHANGE_CLOUD_CANDIDATE = 262144;
    public static final int CHANGE_CLOUD_FEEDBACK = 524288;
    public static final int CHANGE_CLOUD_SEARCH = 1048576;
    public static final int CHANGE_COMMIT = 1024;
    public static final int CHANGE_CONFIRMEDTEXT = 16777216;
    public static final int CHANGE_DEFAULT_CANDIDATE = 32;
    public static final int CHANGE_DIALECT_LIST = 8192;
    public static final int CHANGE_EXPLICITTEXT = 512;
    public static final int CHANGE_FILTER_LIST = 64;
    public static final int CHANGE_FINISH_COMPOSING = 65536;
    public static final int CHANGE_HANDWRITE_MASK = 131072;
    public static final int CHANGE_INLINETEXT = 256;
    private static final int CHANGE_INPUT_CONNECTION = 66816;
    public static final int CHANGE_LOCAL_CLOUD_RESULT = 33554432;
    public static final int CHANGE_LOCAL_CLOUD_SEARCH = 67108864;
    public static final int CHANGE_MISTYPE_CORRECT = 16384;
    public static final int CHANGE_NEXTPHRASE_CANDIDATE = 8388608;
    public static final int CHANGE_NEXTWORD_CANDIDATE = 4194304;
    public static final int CHANGE_SURFACE = 1;
    public static final int CHANGE_SURFACE_DISPLAY = 2;
    public static final int CHANGE_SURFACE_OPERATION = 8;
    public static final int CHANGE_SURFACE_POPUP = 4;
    public static final int CHANGE_TAB_LIST = 2048;
    public static final int CHANGE_USERWORD_LIST = 4096;
    public static final int COMMIT_TYPE_KEYCODE = 2;
    public static final int COMMIT_TYPE_TEXT = 1;
    private static final int DAY_OF_VALENTINES_DAY = 14;
    private static final int DELETE_TYPE_AROUND = 0;
    private static final int DELETE_TYPE_DEL_AFTER_ONLY = 2;
    private static final int DELETE_TYPE_DEL_BEFORE_ONLY = 1;
    public static final int DICT_TYPE_CHINESEBIHUA = 2;
    public static final int DICT_TYPE_CHINESEPINYIN = 1;
    public static final int DICT_TYPE_CHINESEZHUYIN = 3;
    public static final int DICT_TYPE_UNDEFINED = -1;
    public static final int DICT_TYPE_WESTERN = 0;
    public static final int EXCEPTION_ERROR = 268435456;
    public static final int EXCEPTION_WARN = 134217728;
    private static final int HARD_KEY_MODE = 1;
    public static final int IMAGE_TYPE_RAM = 2;
    public static final int IMAGE_TYPE_ROM = 1;
    public static final int IMAGE_TYPE_UNDEFINED = -1;
    public static final int IMAGE_TYPE_USR = 3;
    public static final int KEYCODE_BACKSPACE = 131080;
    public static final int KEYCODE_BACKSPACE_HANDWRITE = 3145785;
    public static final int KEYCODE_COPY = 131216;
    public static final int KEYCODE_DEL = 131201;
    public static final int KEYCODE_EDIT_ADD_NEW_WORD = 3211281;
    public static final int KEYCODE_EDIT_CLIPBOARD = 3211283;
    public static final int KEYCODE_EDIT_COPY = 3211265;
    public static final int KEYCODE_EDIT_CUT = 3211267;
    public static final int KEYCODE_EDIT_DEL = 3211277;
    public static final int KEYCODE_EDIT_DONE = 3211280;
    public static final int KEYCODE_EDIT_DOWN = 3211269;
    public static final int KEYCODE_EDIT_END = 3211275;
    public static final int KEYCODE_EDIT_HOME = 3211274;
    public static final int KEYCODE_EDIT_KEY_BEGIN = 3211265;
    public static final int KEYCODE_EDIT_KEY_END = 3211282;
    public static final int KEYCODE_EDIT_LEFT = 3211270;
    public static final int KEYCODE_EDIT_OPEN_OPERATION = 3211282;
    public static final int KEYCODE_EDIT_PASTE = 3211266;
    public static final int KEYCODE_EDIT_PDOWN = 3211272;
    public static final int KEYCODE_EDIT_PUP = 3211273;
    public static final int KEYCODE_EDIT_RIGHT = 3211271;
    public static final int KEYCODE_EDIT_SELECT = 3211276;
    public static final int KEYCODE_EDIT_SELECTALL = 3211278;
    public static final int KEYCODE_EDIT_SPACE = 3211279;
    public static final int KEYCODE_EDIT_UP = 3211268;
    public static final int KEYCODE_ENTER = 131213;
    public static final int KEYCODE_FUN_BACK = 3145765;
    public static final int KEYCODE_FUN_CANCEL_VOICE = 3276802;
    public static final int KEYCODE_FUN_CANDIDATE_DOWN = 3145769;
    public static final int KEYCODE_FUN_CANDIDATE_LEFT = 3145770;
    public static final int KEYCODE_FUN_CANDIDATE_RIGHT = 3145771;
    public static final int KEYCODE_FUN_CANDIDATE_UP = 3145768;
    public static final int KEYCODE_FUN_CLOSE = 3145740;
    public static final int KEYCODE_FUN_CLOSE_SMILEY_PANEL = 3276807;
    public static final int KEYCODE_FUN_COPY = 3145735;
    public static final int KEYCODE_FUN_CUSTOM_SYMBOL_EN = 3145789;
    public static final int KEYCODE_FUN_CUSTOM_SYMBOL_ZH = 3145788;
    public static final int KEYCODE_FUN_CUT = 3145738;
    public static final int KEYCODE_FUN_DELWORD = 3145787;
    public static final int KEYCODE_FUN_DEL_AROUND_WORD = 3145794;
    public static final int KEYCODE_FUN_DICT = 3145729;
    public static final int KEYCODE_FUN_DOWN = 3145732;
    public static final int KEYCODE_FUN_GUESS_EMOJI = 3276810;
    public static final int KEYCODE_FUN_HANDWRITE_PAOPAO = 3145790;
    public static final int KEYCODE_FUN_HARD_SHIFT = 3145744;
    public static final int KEYCODE_FUN_HARD_SYMBOL_END = 3145783;
    public static final int KEYCODE_FUN_HARD_SYMBOL_TAB_LEFT = 3145772;
    public static final int KEYCODE_FUN_HARD_SYMBOL_TAB_MODE = 3145775;
    public static final int KEYCODE_FUN_HARD_SYMBOL_TAB_RIGHT = 3145773;
    public static final int KEYCODE_FUN_LANG = 3145730;
    public static final int KEYCODE_FUN_LANG_OPTION = 3145761;
    public static final int KEYCODE_FUN_LEFT = 3145733;
    public static final int KEYCODE_FUN_NEXT = 3276809;
    public static final int KEYCODE_FUN_OPEN_SMILEY_PANEL = 3276806;
    public static final int KEYCODE_FUN_OPTION = 3145743;
    public static final int KEYCODE_FUN_PASTE = 3145736;
    public static final int KEYCODE_FUN_PINYIN_DISABLED = 3145793;
    public static final int KEYCODE_FUN_PREV = 3276808;
    public static final int KEYCODE_FUN_QUICK_SWITCHER_NO_SETTING_PROMPT = 3145784;
    public static final int KEYCODE_FUN_RIGHT = 3145734;
    public static final int KEYCODE_FUN_SELECT = 3145737;
    public static final int KEYCODE_FUN_SELECT_ALL = 3145739;
    public static final int KEYCODE_FUN_SHOW_AUTO_SPACE_TIP_DIALOG = 3276804;
    public static final int KEYCODE_FUN_SHOW_VOICE_MASK = 3276805;
    public static final int KEYCODE_FUN_SPACE_DOUBLE_CLICK = 3145764;
    public static final int KEYCODE_FUN_SWITCH_CHS_TO_ENG = 3145796;
    public static final int KEYCODE_FUN_SWITCH_ENG_TO_CHS = 3145795;
    public static final int KEYCODE_FUN_SWITCH_LAST_LANG = 3145791;
    public static final int KEYCODE_FUN_SWITCH_NEXT_LANG = 3145792;
    public static final int KEYCODE_FUN_SYMBOL_EMO = 3145746;
    public static final int KEYCODE_FUN_SYMBOL_NUM = 3145745;
    public static final int KEYCODE_FUN_SYMBOL_OTH = 3145747;
    public static final int KEYCODE_FUN_TRACK = 3145741;
    public static final int KEYCODE_FUN_UP = 3145731;
    public static final int KEYCODE_FUN_VOICE = 3276801;
    public static final int KEYCODE_FUN_VOICE_STOP = 3276803;
    public static final int KEYCODE_PASTE = 131217;
    public static final int KEYCODE_SELECT = 131214;
    public static final int KEYCODE_SPACE = 131200;
    public static final int KEYCODE_UNSELECT = 131215;
    public static final String KEY_NAME_CLEAR_SHIFT_STATE = "sk_clear_shift_state";
    public static final String KEY_NAME_HARD_CHARACTER_LISTENER = "sk_hard_character_listener";
    public static final String KEY_NAME_UPDATE_SELECTION_LISTENER = "sk_update_selection_listener";
    public static final String LUA_CALL_COMMIT_INPUT = "commit_input";
    public static final String LUA_CALL_COMPOUND_WORD_INPUT = "compound_word_input";
    public static final String LUA_CALL_RESTORE_ALT_TITLE = "restore_alt_title";
    public static final String LUA_CALL_REVERSE_ALT_TITLE = "reverse_alt_title";
    public static final String LUA_CALL_SYNC_SK_LNG = "sync_sk_lng";
    public static final String LUA_CALL_UPDATE_VOICE_SYM_KEY = "update_voice_sym_key";
    public static final String LUA_CALL_VOICE_RECOGNIZE_END = "voice_recognize_end";
    public static final String LUA_CALL_VOICE_RECOGNIZE_START = "voice_recognize_start";
    private static final int MAX_WESTERN_WORD_LENGTH = 36;
    private static final int MONTH_OF_VALENTINES_DAY = 1;
    private static final int MSG_OPEN_PAOPAO = 2;
    private static final int MSG_POST_CLEAN_UP = 0;
    private static final int MSG_SHOW_INCOMPATIBLE_DIALOG = 3;
    private static final int MSG_UPDATE_INPUT_DATA = 1;
    public static final int OKINAWA_MAX_KEYCODE = 3276800;
    public static final int OPERATION_COUNT = 3;
    public static final int OPERATION_HANDWRITE = 1;
    public static final int OPERATION_HARDKEY = 0;
    public static final int OPERATION_IMPORTV4 = 2;
    public static final int OPERATION_UNKNOWN = -1;
    public static final int REQUEST_CANDIDATE_END = Integer.MIN_VALUE;
    private static final int SOFT_KEY_MODE = 0;
    private static final String TAG = "Engine";
    public static final int TRANS_BEGIN = 1;
    public static final int TRANS_END = 2;
    public static final int TRI_STATUS_LOCKED = 3;
    public static final int TRI_STATUS_NORMAL = 1;
    public static final int TRI_STATUS_TOGGLED = 2;
    public static final int TRI_TYPE_HINDISHIFT = 2;
    public static final int TRI_TYPE_SEPERATOR = 1;
    public static final int TRI_TYPE_SHIFT = 0;
    public static final int UPDATE_TYPE_AUTO = 1;
    public static final int UPDATE_TYPE_MANUAL = 2;
    private static final int WORD_ATTR_CHS = 2;
    private static final int WORD_ATTR_NONE = 1;
    private static final int WORD_ATTR_WESTERN = 3;
    private static boolean isLongPressDelete = false;
    private static boolean isPreciseMode = false;
    public static long lastWindowShownTime = 0;
    /* access modifiers changed from: private */
    public static InputMethodService sContext;
    private static Engine sInstance;
    private static boolean sIsBusy = false;
    public static boolean uStartToInput = false;
    private final int FIRST_SHOW_DRAWER_DELAY;
    private AudioManager audioManager;
    private CandidateManager candidateManager;
    private ClokeManager clokeManager;
    private CommitManager commitManager;
    private Context context;
    private int currentKeyMode;
    private DialogManager dialogManager;
    private Editor editor;
    private ExplicitManager explicitManager;
    private FilterManager filterManager;
    private HandWriteMaskManager handWriteMaskManager;
    /* access modifiers changed from: private */
    public InputMethodService ims;
    private InlineManager inlineManager;
    private boolean isInputPaused;
    private boolean isMultiTouchPaused;
    public boolean isMultitouch;
    private boolean isNormalKeyboard;
    private int lastKeyMode;
    private String mCachedCell;
    private int mCachedDictOptions;
    private String mCachedInlineText;
    private String mCachedInput;
    private String mCachedInputOp;
    private ArrayList<C1708d> mCachedInputSequence;
    private String mCachedLayoutAlias;
    private int mCapsMode;
    private ExplicitInfo mConfirmedInfo;
    private boolean mEnabled;
    private ExplicitInfo mExplicitInfo;
    /* access modifiers changed from: private */
    public Handler mHandler;
    private boolean mHardKeyDisabled;
    private ExplicitInfo mInlineInfo;
    private int mInputType;
    private boolean mInvitationDlgShowing;
    private int mOldSpellCheckSetting;
    private Operation mPreloadedOperation;
    private ArrayList<Runnable> mRunblaeList;
    private boolean mShouldCollectCommitInfo;
    private boolean mStartInput;
    private boolean mStartInputView;
    private C1665Z mUsrDicChecker;
    private VoiceRecognitionTrigger mVoiceTypingTrigger;
    private boolean needChangeSymbol;
    private Okinawa okinawa;
    private ArrayList<ISelectionListener> selectionListeners;
    private C1252b slideSentenceManager;
    private SurfaceManager surfaceManager;
    private VerboseManager verboseManager;
    private VoiceProcessor voiceProcessor;
    private WarningManager warningManager;
    private C2917du widgetManager;

    public interface ISelectionListener {
        void onUpdateSelection();
    }

    public static class Operation {
        public String keyName;
    }

    public static synchronized void initialize(InputMethodService inputMethodService) {
        synchronized (Engine.class) {
            if (inputMethodService == null) {
                throw new IllegalArgumentException("Param InputMethodService is null.");
            }
            if (sInstance != null) {
                destroy();
            }
            sContext = inputMethodService;
            sInstance = new Engine();
        }
    }

    public void setEnable(boolean z) {
        this.mEnabled = z;
    }

    public static boolean isInitialized() {
        return sInstance != null && sInstance.mEnabled;
    }

    public static void destroy() {
        if (sInstance != null) {
            sInstance.onCleanup();
            sInstance.release();
        }
        sInstance = null;
        sContext = null;
    }

    public static Engine getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        throw new IllegalArgumentException("Parameter InputMethodService is null. Call Engine.initialize(InputMethodService) first. Use Engine.isInitialized() to check if InputMethodService is assigned.");
    }

    public void setNeedChangeSymbol(boolean z) {
        this.needChangeSymbol = z;
    }

    public void setPreloadedOperation(Operation operation) {
        this.mPreloadedOperation = operation;
    }

    private Engine() {
        this.isNormalKeyboard = true;
        this.mUsrDicChecker = new C1665Z();
        this.mShouldCollectCommitInfo = false;
        this.mCachedInputOp = "";
        this.mCachedInput = "";
        this.mCachedDictOptions = 0;
        this.mCachedLayoutAlias = "";
        this.mCachedCell = "";
        this.mCachedInputSequence = new ArrayList<>();
        this.FIRST_SHOW_DRAWER_DELAY = 200;
        this.lastKeyMode = 0;
        this.currentKeyMode = 0;
        this.mRunblaeList = new ArrayList<>();
        this.mHandler = new Handler() {
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 0:
                        Engine.this.onPostCleanup();
                        return;
                    case 1:
                        new Thread() {
                            public void run() {
                                Engine.this.doUpdateInputData();
                            }
                        }.start();
                        return;
                    case 2:
                        if (!SkinCustomizeActivity.m14013a() && Engine.isInitialized()) {
                            Settings.getInstance().setBoolSetting(Settings.FIRST_KEYBOARD_SHOWN_OPEN_DRAWER, false);
                            Engine.getInstance().getWidgetManager().mo9617W().mo7130e();
                            return;
                        }
                        return;
                    case 3:
                        if (Engine.isInitialized() && Engine.this.showInstallIncompatibleLanguageSkinDialog()) {
                            Settings.getInstance().setBoolSetting(Settings.SHOW_INSTALL_INCOMPATIBLE_LANGUAGE, false);
                            Settings.getInstance().setBoolSetting(Settings.DEFUALT_SKIN_UPDATED, true);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        this.mOldSpellCheckSetting = 0;
        this.needChangeSymbol = false;
        this.isMultitouch = false;
        this.mInvitationDlgShowing = false;
        this.ims = sContext;
        this.context = sContext;
        this.mStartInput = false;
        this.mStartInputView = false;
        this.isMultitouch = false;
        this.editor = new Editor(this);
        this.widgetManager = new C2917du(this.ims);
        this.surfaceManager = new SurfaceManager(this);
        this.candidateManager = new CandidateManager(this, new CandidateProvider(this), new UserwordProvider(this), new DialectProvider(this));
        this.slideSentenceManager = new C1252b(new NextwordProvider(this), new NextphraseProvider(this), new WavewordProvider(this));
        this.filterManager = new FilterManager(this, new FilterProvider(this));
        this.inlineManager = new InlineManager(this);
        this.explicitManager = new ExplicitManager(this);
        this.clokeManager = new ClokeManager(this, new ClokeProvider(this));
        this.handWriteMaskManager = new HandWriteMaskManager(this);
        this.warningManager = new WarningManager(this);
        this.commitManager = new CommitManager(this);
        this.dialogManager = new DialogManager(this);
        this.audioManager = (AudioManager) this.context.getSystemService(BaiduPCSClient.Type_Stream_Audio);
        this.voiceProcessor = new VoiceProcessor(this);
        this.verboseManager = new VerboseManager();
        this.okinawa = C1368X.m6320c().mo5835h().setEngine(this);
        this.selectionListeners = new ArrayList<>();
        this.mEnabled = true;
        registerListeners();
        initSettings();
        setup();
    }

    private void initSettings() {
        if (getEnabledLanguageCount() == 0) {
            Settings.getInstance().setLanguageEnabled(C1549b.f4791a, true);
        }
    }

    private void setup() {
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5815A().mo5569b();
            C1368X.m6320c().mo5846s().mo6307a();
            C1368X.m6320c().mo5848u();
        }
        ClipboardBackend.initialize(this.context);
    }

    private void registerListeners() {
        this.commitManager.setImsObserver((TouchPalIME) this.ims);
        this.inlineManager.registerUniqueInlineListener((TouchPalIME) this.ims);
    }

    public void onStartInput(EditorInfo editorInfo, boolean z) {
        int i;
        if (this.mStartInputView && !z) {
            onFinishInputView();
        }
        if (this.mStartInput && !z) {
            onFinishInput();
        }
        this.editor.updateInputInfo(editorInfo);
        this.mInputType = this.editor.getInputType();
        this.mCapsMode = this.editor.getCapsMode();
        C1368X.m6320c().mo5826L().mo6212b();
        C1351J.m6188a().mo5643c();
        if ((editorInfo.inputType & 15) == 1 && (i = editorInfo.inputType & 4080) != 128 && i != 144 && i != 32 && i != 16) {
            if (Build.VERSION.SDK_INT >= 11 ? (i == 208 || i == 224) ? false : true : true) {
                fireStartInputOperation(this.editor.getCapsMode(), this.editor.getInputType(), z);
                this.mStartInput = true;
                processEvent();
                this.lastKeyMode = this.currentKeyMode;
                this.currentKeyMode = 1;
                int intSetting = Settings.getInstance().getIntSetting(Settings.HARD_KEYBOARD_TIP_SHOWN_TIMES);
                if (this.lastKeyMode == 0 && intSetting <= 3) {
                    Toast.makeText(sContext, getResString(sContext, R.string.hard_keyboard_tip), 1).show();
                    Settings.getInstance().setIntSetting(Settings.HARD_KEYBOARD_TIP_SHOWN_TIMES, intSetting + 1);
                }
            }
        }
    }

    private static String getResString(Context context2, int i) {
        return C1974m.m9063a(context2, i);
    }

    private static String getString(Context context2, int i, Object... objArr) {
        return C1974m.m9064a(context2, i, objArr);
    }

    public void onStartInputView(EditorInfo editorInfo, boolean z) {
        boolean z2 = true;
        if (this.mStartInputView && !z) {
            onFinishInputView();
        }
        if (this.mStartInput && !z) {
            onFinishInput();
        }
        this.mHandler.removeMessages(0);
        this.widgetManager.mo9652i(true);
        C1368X.m6320c().mo5826L().mo6212b();
        C1368X.m6320c().mo5842o().mo5977x();
        this.editor.updateInputInfo(editorInfo);
        this.mInputType = this.editor.getInputType();
        this.mCapsMode = this.editor.getCapsMode();
        TempExcludeSettingsManager.checkTempExcludeSettings();
        this.clokeManager.updateCloudSearchStrategy();
        Settings.getInstance().setBoolSetting(61, (this.clokeManager.getCloudSearchStrategy() & 2) != 0);
        boolean canShowCandidateOnStartInput = canShowCandidateOnStartInput();
        if (canShowCandidateOnStartInput) {
            Settings.getInstance().setBoolSetting(65, true);
            C1246d.m6010a((Context) sContext).mo4591a(C1246d.f3866cd, "SHOW", C1246d.f3836c);
        }
        if (C1368X.m6320c().mo5842o().mo5972u() || C1368X.m6320c().mo5841n().mo6296r()) {
            C2361q.m10797b().mo8011d();
        }
        C1997k.m9167a().mo7302b();
        if (Settings.getInstance().getBoolSetting(Settings.FIRST_START_KEYBOARD)) {
            C1368X.m6320c().mo5842o().mo5976w();
        }
        fireStartInputViewOperation(this.editor.getCapsMode(), this.editor.getInputType(), z);
        this.mStartInputView = true;
        processEvent();
        if (canShowCandidateOnStartInput) {
            Settings.getInstance().setBoolSetting(65, false);
            Settings.getInstance().setBoolSetting(Settings.FIRST_SHOW_CANDIDATE_ON_STARTINPUT, false);
        }
        this.lastKeyMode = this.currentKeyMode;
        this.currentKeyMode = 0;
        if (this.mInputType == 32) {
            z2 = false;
        }
        this.mShouldCollectCommitInfo = z2;
        this.mCachedInputOp = "";
        this.mCachedInput = "";
        this.mCachedInputSequence.clear();
        this.mCachedDictOptions = getDictOptions();
        this.mCachedLayoutAlias = getLayoutAlias();
        this.mCachedCell = getCurrentCell();
        if (this.needChangeSymbol) {
            fireKeyOperation(getKeyId("sk_sym"), 0, 0);
            processEvent();
        }
        if (this.mPreloadedOperation != null) {
            fireKeyOperation(getKeyId(this.mPreloadedOperation.keyName), 0);
            this.mPreloadedOperation = null;
            processEvent();
        }
        this.surfaceManager.updateAnimation();
        C1351J.m6188a().mo5643c();
        if (this.mVoiceTypingTrigger != null) {
            this.mVoiceTypingTrigger.onStartInputView();
        }
        C1368X.m6320c().mo5841n().mo6292p();
        this.mHandler.postDelayed(new Runnable() {
            public void run() {
                String b = C2137q.m9700a((Context) Engine.sContext).mo7539b();
                if (!TextUtils.isEmpty(b) && Engine.this.ims.getCurrentInputConnection() != null) {
                    Engine.this.ims.getCurrentInputConnection().commitText(b, 0);
                    Settings.getInstance().setStringSetting(Settings.SAVED_SEARCH_RESULT, "");
                }
            }
        }, 200);
    }

    private boolean canShowCandidateOnStartInput() {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(2);
        int i2 = instance.get(5);
        if (i != 1 || i2 != 14 || this.mInputType != 0 || this.mCapsMode != 3 || !Settings.getInstance().getBoolSetting(Settings.FIRST_SHOW_CANDIDATE_ON_STARTINPUT) || Settings.getInstance().getBoolSetting(Settings.FIRST_KEYBOARD_SHOWN_OPEN_DRAWER)) {
            return false;
        }
        String stringSetting = Settings.getInstance().getStringSetting(10);
        if (C1549b.f4791a.equals(stringSetting) || C1549b.f4773I.equals(stringSetting)) {
            return true;
        }
        return false;
    }

    private void checkEnableTouchPalNotification() {
        if (Settings.getInstance().getBoolSetting(Settings.SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION)) {
            ((NotificationManager) C1368X.m6313b().getSystemService("notification")).cancel(Settings.SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION);
            Settings.getInstance().setBoolSetting(Settings.SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION, false);
        }
    }

    public void onWindowShown() {
        StartupToast f;
        lastWindowShownTime = System.currentTimeMillis();
        C1896t.m8712a().mo7040d();
        if (!showGuideBeforeKeyboardStart()) {
            checkDynamicSkin();
            C1351J.m6188a().mo5648f();
            this.widgetManager.mo9637b().clearAnimation();
            activating();
            checkEnableTouchPalNotification();
            C1368X.m6320c().mo5844q().mo5859a((int) R.string.accessibility_open_keyboard);
            if (this.mInvitationDlgShowing || Settings.getInstance().getBoolSetting(Settings.INVITE_SUCCEED)) {
                if (!this.mInvitationDlgShowing) {
                    Settings.getInstance().setDisableSpecial(true);
                    C1368X.m6320c().mo5849v().mo6427e();
                    Settings.getInstance().setDisableSpecial(false);
                    setInputPaused(false);
                    if (this.isNormalKeyboard && !C2564f.m11470c()) {
                        if (C1368X.m6324d() && C1368X.m6320c().mo5850w().mo8415d()) {
                            return;
                        }
                        if (!C2515q.m11248a() || (f = C2515q.m11251b().mo8322f()) == null) {
                            C1368X.m6320c().mo5835h().getLanguageCategory(getCurrentLanguageId(), 1);
                            if (Settings.getInstance().getBoolSetting(399)) {
                                Toast.makeText(this.context, R.string.auto_adjust_special_keyboard_size, 1).show();
                                Settings.getInstance().setBoolSetting(399, false, false);
                            }
                            if (canShowTips()) {
                                if (Settings.getInstance().getBoolSetting(Settings.FIRST_KEYBOARD_SHOWN_OPEN_DRAWER)) {
                                    this.mHandler.sendEmptyMessageDelayed(2, 200);
                                } else if (C1319a.m6097a((Context) sContext, C1334o.IMPORT_V4_USRDICT)) {
                                    showTip(new Runnable() {
                                        public void run() {
                                            if (C1319a.m6097a((Context) Engine.sContext, C1334o.IMPORT_V4_USRDICT)) {
                                                Engine.this.getDialogManager().showWizardTipsDialog(C1334o.IMPORT_V4_USRDICT);
                                            }
                                        }
                                    });
                                } else if (Settings.getInstance().getBoolSetting(Settings.SHOW_WRONG_UPDATE_DIALOG) && Settings.getInstance().getIntSetting(Settings.PRODUCT_TYPE) != Settings.getInstance().getIntSetting(Settings.LAST_PRODUCT_TYPE) && this.mInputType == 0) {
                                    showWrongUpdateDialog();
                                } else if (C1319a.m6097a((Context) sContext, C1334o.SPACE_LONG_PRESS)) {
                                    showTip(new Runnable() {
                                        public void run() {
                                            if (C1319a.m6097a((Context) Engine.sContext, C1334o.SPACE_LONG_PRESS)) {
                                                Engine.this.getDialogManager().showWizardTipsDialog(C1334o.SPACE_LONG_PRESS);
                                            }
                                        }
                                    });
                                } else if (C1319a.m6097a((Context) sContext, C1334o.SWITCH_LANGUAGE)) {
                                    showTip(new Runnable() {
                                        public void run() {
                                            if (C1319a.m6097a((Context) Engine.sContext, C1334o.SWITCH_LANGUAGE)) {
                                                Engine.this.getDialogManager().showWizardTipsDialog(C1334o.SWITCH_LANGUAGE);
                                                Settings.getInstance().setBoolSetting(Settings.SHOW_SWITCH_LANGUAGE_TIP, false);
                                            }
                                        }
                                    });
                                } else if (C1319a.m6097a((Context) sContext, C1334o.OPEN_EMOJI)) {
                                    showTip(new Runnable() {
                                        public void run() {
                                            if (C1319a.m6097a((Context) Engine.sContext, C1334o.OPEN_EMOJI)) {
                                                Engine.this.getDialogManager().showWizardTipsDialog(C1334o.OPEN_EMOJI);
                                                Settings.getInstance().setBoolSetting(Settings.SHOW_EMOJI_IN_APP_TIP, false);
                                            }
                                        }
                                    });
                                } else if (!showSwitchLanguageDialog()) {
                                    if (canShowSwitchCurveDialog()) {
                                        showSwitchCurveDialog();
                                    } else if (C1579bD.m7105i()) {
                                        C1579bD.m7106j();
                                    }
                                }
                            }
                            checkLocaleLanguageInstalled();
                            checkSuperDictReminder();
                            if (this.mInputType == 0 && Settings.getInstance().getLongSetting(Settings.NEXT_STATISTIC_WORD_PREDIC_STATUS_TIME) < lastWindowShownTime) {
                                Settings.getInstance().setLongSetting(Settings.NEXT_STATISTIC_WORD_PREDIC_STATUS_TIME, lastWindowShownTime + 86400000);
                            }
                            C1056a.m5588a().mo4264a(C1056a.f2978i, sContext);
                            uStartToInput = true;
                            return;
                        }
                        C2515q.m11251b().mo8312a(f);
                    }
                }
            } else if (!InvitationDialog.f13461f) {
                showInvitationDlg();
            }
        }
    }

    private boolean showGuideBeforeKeyboardStart() {
        if (!C1593bR.m7162a().f5076b || Settings.getInstance().getBoolSetting(Settings.HAS_SHOWN_GUIDE_INTRO_VIEW) || this.mInputType != 0) {
            return false;
        }
        new Handler().post(new Runnable() {
            public void run() {
                boolean z = false;
                if (Engine.this.ims != null) {
                    Engine.this.ims.requestHideSelf(0);
                }
                Intent intent = new Intent(Engine.sContext, GuideIntroM.class);
                if (!Settings.getInstance().getBoolSetting(Settings.TOTALLY_NEW_PACK)) {
                    z = true;
                }
                intent.putExtra(GuideIntroM.f2779a, z);
                intent.addFlags(Engine.EXCEPTION_ERROR);
                Engine.sContext.startActivity(intent);
            }
        });
        return true;
    }

    private boolean canShowTips() {
        if (!KeyboardCustomizeActivity.m13804a() && !showInstallIncompatibleLanguageSkinDialogDelayed()) {
            return true;
        }
        return false;
    }

    private void checkLocaleLanguageInstalled() {
        if (C2188Q.m9853a().mo7686f()) {
            Locale locale = sContext.getResources().getConfiguration().locale;
            if (!TextUtils.equals(locale.getLanguage(), Locale.ENGLISH.getLanguage())) {
                String locale2 = locale.toString();
                boolean z = !TextUtils.equals(locale2, Settings.getInstance().getStringSetting(Settings.RECENT_LOACALE));
                if (z) {
                    Settings.getInstance().setStringSetting(Settings.RECENT_LOACALE, locale2);
                }
                boolean boolSetting = Settings.getInstance().getBoolSetting(Settings.IS_FIRST_KEYBOARD_SHOW);
                if (boolSetting) {
                    Settings.getInstance().setBoolSetting(Settings.IS_FIRST_KEYBOARD_SHOW, false);
                }
                if (z || boolSetting) {
                    checkLocaleLanguage();
                }
            }
        }
    }

    private void checkLocaleLanguage() {
        C1389aD o = C1368X.m6320c().mo5842o();
        if (o != null && o.mo5925M()) {
            showLangaugeAvailableNotification();
        }
    }

    private void showLangaugeAvailableNotification() {
        Notification notification = new Notification();
        notification.icon = R.drawable.icon_small;
        notification.flags = 16;
        NotificationManager notificationManager = (NotificationManager) sContext.getSystemService("notification");
        Intent intent = new Intent("com.emoji.keyboard.touchpal.INTERNAL_ACTION.download_locale_langauge");
        intent.setAction(LocaleLanguageDownloadReceiver.ACTION_LOCALE_LANGUAGE_DOWNLOAD);
        PendingIntent broadcast = PendingIntent.getBroadcast(sContext, R.string.app_name, intent, EXCEPTION_WARN);
        C1550c a = C1550c.m6998a(C1974m.m9063a((Context) sContext, (int) R.string.CURRENT_LANGUAGE));
        if (a != null) {
            String a2 = a.mo6191a((Context) sContext);
            String a3 = C1974m.m9064a((Context) sContext, (int) R.string.paopao_locale_language_title, a2);
            notification.tickerText = a3;
            notification.setLatestEventInfo(sContext, a3, C1974m.m9063a((Context) sContext, (int) R.string.super_dict_notification_sub_title), broadcast);
            try {
                notificationManager.notify(C1630a.f5263k, notification);
            } catch (Exception e) {
            }
            C1056a.m5588a().mo4264a(C1056a.f2948I, sContext);
        }
    }

    private void checkSuperDictReminder() {
        if (TextUtils.equals(getCurrentLanguageId(), C1549b.f4831b) && this.mInputType == 0 && C2188Q.m9853a().mo7685e()) {
            if (Settings.getInstance().getBoolSetting(Settings.SHOW_SUPER_DICT_EXPIRED_REMINDER)) {
                showSuperDictDownloadReminder(getResString(sContext, R.string.super_dict_expire_notification_title), getResString(sContext, R.string.super_dict_notification_sub_title));
                Settings.getInstance().setBoolSetting(Settings.SHOW_SUPER_DICT_EXPIRED_REMINDER, false);
                Settings.getInstance().writeBack();
            } else if (canShowSuperDictDownloadReminder()) {
                showSuperDictDownloadReminder(getResString(sContext, R.string.super_dict_notification_title), getResString(sContext, R.string.super_dict_notification_sub_title));
                Settings.getInstance().setBoolSetting(Settings.SHOW_SUPER_DICT_DOWNLOAD_REMINDER, false);
                Settings.getInstance().writeBack();
            }
        }
    }

    private boolean canShowSuperDictDownloadReminder() {
        if (!Settings.getInstance().getBoolSetting(Settings.SHOW_SUPER_DICT_DOWNLOAD_REMINDER)) {
            return false;
        }
        C1608bk s = C1368X.m6320c().mo5846s();
        s.mo6311b();
        if (Settings.getInstance().getBoolSetting(Settings.SUPER_DICT_DOWNLOADED) || s.mo6314c()) {
            return false;
        }
        return true;
    }

    private void showSuperDictDownloadReminder(CharSequence charSequence, CharSequence charSequence2) {
        Notification notification = new Notification();
        notification.icon = R.drawable.icon_small;
        notification.flags = 16;
        Intent intent = new Intent(SuperDictDownloadReceiver.ACTION_SUPER_DICT_DOWNLOAD);
        intent.setAction(SuperDictDownloadReceiver.ACTION_SUPER_DICT_DOWNLOAD);
        PendingIntent broadcast = PendingIntent.getBroadcast(sContext, R.string.app_name, intent, EXCEPTION_WARN);
        notification.tickerText = charSequence;
        notification.setLatestEventInfo(sContext, charSequence, charSequence2, broadcast);
        ((NotificationManager) sContext.getSystemService("notification")).notify(Settings.SHOW_SUPER_DICT_DOWNLOAD_REMINDER, notification);
    }

    private void activating() {
        C2209a.m9956a().mo7727a(sContext, C2209a.C2210a.CHECK_STATE, true, C2268c.C2269a.OWS);
        C2209a.m9956a().mo7728a((Context) sContext);
    }

    public void onInvitationDialogHidden() {
        this.mInvitationDlgShowing = false;
    }

    public void onInvitationDialogShown() {
        this.mInvitationDlgShowing = true;
    }

    private void showInvitationDlg() {
        Intent intent = new Intent();
        intent.setClass(this.ims, InvitationDialog.class);
        intent.addFlags(335544320);
        this.ims.startActivity(intent);
    }

    private boolean canShowSwitchCurveDialog() {
        return Settings.getInstance().getBoolSetting(Settings.CURVE_DOWNLOAD_PROMPTED) && Settings.getInstance().getBoolSetting(Settings.CURVE_ENABLED_UI);
    }

    private void showSwitchCurveDialog() {
        String languageCategory = C1368X.m6320c().mo5835h().getLanguageCategory(getCurrentLanguageId(), 1);
        final String stringSetting = Settings.getInstance().getStringSetting(Settings.CURVE_DOWNLOAD_LANGUAGE);
        int intSetting = Settings.getInstance().getIntSetting(3, 1, languageCategory, (Config) null);
        if (C1549b.f4831b.equals(stringSetting)) {
            showPinyinCurveTutorial(this.ims);
            doSwitchCurve(stringSetting);
            Settings.getInstance().setBoolSetting(Settings.CURVE_DOWNLOAD_PROMPTED, false);
        } else if (getCurrentLanguageId() == null || (intSetting == 2 && getCurrentLanguageId().equals(stringSetting))) {
            Settings.getInstance().setBoolSetting(Settings.CURVE_DOWNLOAD_PROMPTED, false);
        } else {
            final C2618H h = new C2618H(this.ims);
            h.mo8568a(C1593bR.m7162a().mo6232a(16));
            h.mo8580b(getResString(this.ims, R.string.quick_setting_enable_curve_msg));
            h.mo8574a(getResString(this.ims, 17039379), (View.OnClickListener) new View.OnClickListener() {
                public void onClick(View view) {
                    Engine.this.doSwitchCurve(stringSetting);
                }
            });
            h.mo8581b(getResString(this.ims, 17039369), (View.OnClickListener) null);
            postRunnableDelayed(new Runnable() {
                public void run() {
                    Engine.this.removeRunnable(this);
                    h.mo8567a();
                    Settings.getInstance().setBoolSetting(Settings.CURVE_DOWNLOAD_PROMPTED, false);
                }
            }, 60);
        }
    }

    /* access modifiers changed from: private */
    public void doSwitchCurve(String str) {
        boolean z;
        Settings.getInstance().setBoolSetting(1, true);
        String[] g = C1368X.m6320c().mo5842o().mo5945g();
        int i = 0;
        while (true) {
            if (i >= g.length) {
                z = false;
                break;
            } else if (g[i].equals(str)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            String languageCategory = C1368X.m6320c().mo5835h().getLanguageCategory(str, 1);
            if (!str.equals(getCurrentLanguageId())) {
                Settings.getInstance().setIntSetting(3, 2, 1, languageCategory, (Config) null, false);
                Settings.getInstance().setStringSetting(10, str, true);
                return;
            }
            Settings.getInstance().setIntSetting(3, 2, 1, languageCategory, (Config) null, true);
        }
    }

    private void showWrongUpdateDialog() {
        C2618H h = new C2618H(this.ims);
        h.mo8583c(C1593bR.m7162a().mo6232a(21));
        h.mo8574a(getResString(this.ims, R.string.ok), (View.OnClickListener) null);
        Settings.getInstance().setBoolSetting(Settings.SHOW_WRONG_UPDATE_DIALOG, false);
        h.mo8567a();
    }

    public static void showPinyinCurveTutorial(final Context context2) {
        if (Settings.getInstance().getBoolSetting(Settings.SHOW_PINYINCURVE_TUTORIAL_DIALOG)) {
            C2618H h = new C2618H(context2);
            h.mo8580b(getResString(context2, R.string.paopao_enable_pinyincurve_dialog));
            h.mo8574a(getResString(context2, R.string.paopao_enable_wave_dialog_positive_button), (View.OnClickListener) new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C2225al.m10054a(context2, context2.getString(C1593bR.m7162a().mo6232a(18)))));
                    intent.addFlags(Engine.EXCEPTION_ERROR);
                    context2.startActivity(intent);
                }
            });
            h.mo8581b(getResString(context2, R.string.paopao_enable_wave_dialog_negetive_button), (View.OnClickListener) null);
            Settings.getInstance().setBoolSetting(Settings.SHOW_PINYINCURVE_TUTORIAL_DIALOG, false);
            h.mo8567a();
        }
    }

    public static void showWaveGuide(Context context2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C2225al.m10054a(context2, getResString(context2, C1593bR.m7162a().mo6232a(17)))));
        intent.addFlags(EXCEPTION_ERROR);
        C1584bI.m7130a(context2, intent, 1);
    }

    private void postRunnableDelayed(Runnable runnable, long j) {
        this.mRunblaeList.add(runnable);
        this.mHandler.postDelayed(runnable, j);
    }

    /* access modifiers changed from: private */
    public void removeRunnable(Runnable runnable) {
        this.mRunblaeList.remove(runnable);
        this.mHandler.removeCallbacks(runnable);
    }

    private void removeAllRunnables() {
        Iterator<Runnable> it = this.mRunblaeList.iterator();
        while (it.hasNext()) {
            this.mHandler.removeCallbacks(it.next());
        }
        this.mRunblaeList.clear();
    }

    private boolean showSwitchLanguageDialog() {
        String stringSetting = Settings.getInstance().getStringSetting(Settings.LANGUAGE_JUST_INSTALLED);
        if (TextUtils.isEmpty(stringSetting)) {
            return false;
        }
        final C1498a m = C1368X.m6320c().mo5842o().mo5956m(stringSetting);
        String stringSetting2 = Settings.getInstance().getStringSetting(10);
        if (m == null) {
            return false;
        }
        if (m.f4727f.equals(stringSetting2) || !m.mo6156f() || getEditor().isSpecialMode()) {
            Settings.getInstance().setStringSetting(Settings.LANGUAGE_JUST_INSTALLED, "");
            return false;
        }
        postRunnableDelayed(new Runnable() {
            public void run() {
                Engine.this.removeRunnable(this);
                if (Engine.isInitialized()) {
                    new C2892cy(Engine.this.ims).mo9564a(m);
                    Settings.getInstance().setStringSetting(Settings.LANGUAGE_JUST_INSTALLED, "");
                }
            }
        }, 150);
        return true;
    }

    public boolean showInstallIncompatibleLanguageSkinDialog() {
        if (!canShowIncompatibleLanguageSkinDialog()) {
            return false;
        }
        return new C2678aR(this.ims).mo8913a(C1368X.m6320c().mo5842o().mo5965q(), C1368X.m6320c().mo5841n().mo6294q());
    }

    public boolean showInstallIncompatibleLanguageSkinDialogDelayed() {
        if (!canShowIncompatibleLanguageSkinDialog()) {
            return false;
        }
        this.mHandler.sendEmptyMessageDelayed(3, 150);
        return true;
    }

    private boolean canShowIncompatibleLanguageSkinDialog() {
        if (!Settings.getInstance().getBoolSetting(Settings.SHOW_INSTALL_INCOMPATIBLE_LANGUAGE) && Settings.getInstance().getBoolSetting(Settings.DEFUALT_SKIN_UPDATED)) {
            return false;
        }
        return true;
    }

    private void showTip(final Runnable runnable) {
        postRunnableDelayed(new Runnable() {
            public void run() {
                Engine.this.removeRunnable(this);
                if (Engine.this.getIms().getWindow().getWindow().getDecorView().getWindowToken() == null) {
                    Engine.this.mHandler.postDelayed(this, 50);
                } else {
                    Engine.this.mHandler.post(runnable);
                }
            }
        }, 0);
    }

    public View onCreateInputView() {
        return this.widgetManager.mo9640c();
    }

    public void onFinishInputView() {
        if (this.mStartInputView) {
            this.widgetManager.mo9652i(false);
            updateInputData(true);
            fireLearnTextOperation(this.mCachedInput, C1819b.f6058a, C1819b.f6064g);
            collectInputData();
            this.mShouldCollectCommitInfo = false;
            this.surfaceManager.runRecordedRunnables();
            this.editor.updateInputInfo((EditorInfo) null);
            this.surfaceManager.onHide();
            this.dialogManager.onHide();
            fireFinishInputViewOperation();
            ClipboardBackend.getInstance().update();
            Settings.getInstance().clearTempExcludeSettings();
            Settings.getInstance().writeBack();
            if (!this.mStartInput) {
                onFinishInput();
            }
            this.needChangeSymbol = false;
            this.mStartInputView = false;
            processEvent();
        }
    }

    public void onFinishInput() {
        this.editor.updateInputInfo((EditorInfo) null);
        fireFinishInputOperation();
        Settings.getInstance().writeBack();
        this.mStartInput = false;
        processEvent();
    }

    private void onCleanup() {
        this.mHandler.sendEmptyMessage(0);
        fireCleanupOperation();
        processEvent();
    }

    /* access modifiers changed from: private */
    public void onPostCleanup() {
        C1368X.m6320c().mo5842o().mo5979z();
        C1368X.m6320c().mo5824J().mo6008b();
    }

    public void onWindowHidden() {
        switchNextDynamicSkin();
        activateReport();
        if (getInstance().getWidgetManager().mo9632af().mo10105g()) {
            getInstance().getWidgetManager().mo9632af().mo10103e();
        }
        this.surfaceManager.resetFunctionBarAnimation();
        this.surfaceManager.onHide();
        C1351J.m6188a().mo5646d();
        C1368X.m6320c().mo5850w().mo8408a();
        C1368X.m6320c().mo5844q().mo5858a();
        PresentationManager.hostAppClosed();
        C1979a.m9112b((Context) sContext);
        removeAllRunnables();
        if (!isBusy() && !this.mStartInput && !this.mStartInputView) {
            onCleanup();
        }
        DaemonManager.m6037a();
        C1056a.m5588a().mo4264a(C1056a.f2963X, this.context);
        C1056a.m5588a().mo4266b();
        C1060e.m5598b().mo4270a();
        C1060e.m5598b().mo4276c();
    }

    private void takeKeyboardScreenshot() {
        SoftKeyboardView g;
        if (getWidgetManager() != null && (g = getWidgetManager().mo9648g()) != null && g.getParent() != null && g.getParent().getParent() != null && g.getParent().getParent().getParent() != null && g.getParent().getParent().getParent().getParent() != null) {
            C1584bI.m7138a(Settings.KEYBOARD_SCREENSHOT, (View) g.getParent().getParent().getParent().getParent());
        }
    }

    private void switchNextDynamicSkin() {
        C2626M C = C1368X.m6320c().mo5841n().mo6246C();
        if (C.f11468f) {
            C.mo8665b();
        }
    }

    private void checkDynamicSkin() {
        C2626M C = C1368X.m6320c().mo5841n().mo6246C();
        if (C.f11468f) {
            C.mo8667d();
        }
    }

    private void activateReport() {
        C1725i.m7937a(false);
    }

    public void onUpdateSelection(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        fireUpdateSelectionOperation(i, i2, i3, i4, i5, i6, i7);
        processEvent();
        Iterator<ISelectionListener> it = this.selectionListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdateSelection();
        }
    }

    public boolean onUpdateSelection(int i) {
        switch (i) {
            case 1:
                int[] iArr = new int[2];
                int[] selection = this.editor.getSelection();
                int i2 = selection[0];
                int i3 = selection[1];
                if (i2 == -1 || i3 == -1) {
                    return false;
                }
                onUpdateSelection(-1, -1, i2, i3, -1, -1, i);
                return true;
            case 2:
                onUpdateSelection(-1, -1, -1, -1, -1, -1, i);
                return true;
            default:
                return false;
        }
    }

    public void registerSelectionListener(ISelectionListener iSelectionListener) {
        this.selectionListeners.add(iSelectionListener);
        iSelectionListener.onUpdateSelection();
    }

    public void removeAllSelectionListener() {
        this.selectionListeners.clear();
    }

    public void onConfigurationChanged(int i, int i2) {
        this.widgetManager.mo9666w();
        Settings.getInstance().onConfigurationChanged();
        getInstance().getWidgetManager().mo9630ad().mo9267y();
        if (i != i2) {
            this.dialogManager.onOrientationChanged();
        }
        C1368X.m6320c().mo5850w().mo8408a();
        onFinishInputView();
        onFinishInput();
        fireConfigChangeOperation();
        processEvent();
    }

    public boolean isHardKeyDisabled() {
        return this.mHardKeyDisabled;
    }

    public boolean isHardKeyMode() {
        return this.mStartInput && !this.mStartInputView;
    }

    public boolean isSoftKeyMode() {
        return this.mStartInputView;
    }

    public Editor getEditor() {
        return this.editor;
    }

    public InputMethodService getIms() {
        return this.ims;
    }

    public VoiceProcessor getVoiceProcessor() {
        return this.voiceProcessor;
    }

    public VoiceRecognitionTrigger getVoiceTypingTrigger() {
        if (this.mVoiceTypingTrigger == null) {
            this.mVoiceTypingTrigger = new VoiceRecognitionTrigger(sContext);
        }
        return this.mVoiceTypingTrigger;
    }

    public CommitManager getCommitManager() {
        return this.commitManager;
    }

    public SurfaceManager getSurfaceManager() {
        return this.surfaceManager;
    }

    public C2917du getWidgetManager() {
        return this.widgetManager;
    }

    public CandidateManager getCandidateManager() {
        return this.candidateManager;
    }

    public C1252b getSlideSentenceManager() {
        return this.slideSentenceManager;
    }

    public InlineManager getInlineManager() {
        return this.inlineManager;
    }

    public ExplicitManager getExplicitManager() {
        return this.explicitManager;
    }

    public ClokeManager getClokeManager() {
        return this.clokeManager;
    }

    public DialogManager getDialogManager() {
        return this.dialogManager;
    }

    public FilterManager getFilterManager() {
        return this.filterManager;
    }

    public WarningManager getWarningManager() {
        return this.warningManager;
    }

    public VerboseManager getVerboseManager() {
        return this.verboseManager;
    }

    public HandWriteMaskManager getHandWriteMaskManager() {
        return this.handWriteMaskManager;
    }

    public boolean isInDynamicSpellCheck() {
        return this.mOldSpellCheckSetting != 0;
    }

    public void recordOldSpellCheckSetting(int i) {
        this.mOldSpellCheckSetting = i;
    }

    private void initOldSpellCheckSetting() {
        this.mOldSpellCheckSetting = 0;
    }

    public int getOldSpellCheckSetting() {
        return this.mOldSpellCheckSetting;
    }

    private void updateDynamicSpellCheckState() {
        if (isInDynamicSpellCheck() && TextUtils.isEmpty(getInlineText()) && TextUtils.isEmpty(getExplicitText())) {
            Settings.getInstance().setIntSetting(33, this.mOldSpellCheckSetting);
            initOldSpellCheckSetting();
        }
    }

    public void updateResult(int i, int i2) {
        boolean z;
        boolean z2;
        int candidateItemSource;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C0904g.m4916a().mo3404a(C0898b.UPDATE_RESULT);
        if ((i & EXCEPTION_WARN) != 0) {
            switch (getErrorCode()) {
                case 5:
                    UsrWordManageActivity.f13782e = 1;
                    break;
                case 10:
                    C1368X.m6320c().mo5852y().mo6379a(true);
                    break;
                case 11:
                    if (C1389aD.m6426G(getErrorLanguageId())) {
                        isPreciseMode = true;
                        Settings.getInstance().setBoolSetting(1, false);
                        break;
                    }
                    break;
                case 12:
                    C1368X.m6320c().mo5826L().mo6213b(getErrorMsg());
                    break;
                case 13:
                    UsrWordManageActivity.f13782e = 2;
                    break;
                case 14:
                    addInputAction(new C1709e());
                    break;
                case 15:
                    C1659T.m7604c(true);
                    break;
                case 16:
                    C1659T.m7601b(true);
                    break;
            }
        }
        if ((268435456 & i) != 0) {
            this.ims.requestHideSelf(0);
            return;
        }
        if ((CHANGE_INPUT_CONNECTION & i) != 0) {
            C0904g.m4916a().mo3404a(C0898b.CHANGE_INPUT_CONN);
            boolean z7 = (65536 & i) != 0;
            if ((i & 1024) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i & 256) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            String inlineText = getInlineText();
            String inlineText2 = getInlineText(true);
            if (z7 && inlineText2.length() == 0) {
                addInputAction(new C1710f(inlineText));
            }
            TouchPalIME touchPalIME = (TouchPalIME) getIms();
            boolean f = C1368X.m6320c().mo5821G().mo7189f();
            if (f) {
                touchPalIME.beginBatchEdit();
            }
            if (z7) {
                this.inlineManager.finishComposing();
            }
            if (z5) {
                this.commitManager.updateCommit();
            }
            if (z6) {
                C0904g.m4916a().mo3404a(C0898b.CHANGE_INLINE);
                this.inlineManager.updateText(inlineText2, getInlineInfo(), getEraseCountBeforeCursor(), getEraseCountAfterCursor(), (65536 & i) != 0);
                updateDynamicSpellCheckState();
                C0904g.m4916a().mo3409b(C0898b.CHANGE_INLINE);
            }
            if (f) {
                touchPalIME.endBatchEdit();
            }
            C0904g.m4916a().mo3409b(C0898b.CHANGE_INPUT_CONN);
        }
        if ((i & 8192) != 0) {
            this.candidateManager.updateCandidate(2);
        }
        if ((i & 32) != 0) {
            this.candidateManager.updateCandidate(0, false);
        } else if ((i & 4096) != 0) {
            this.candidateManager.updateCandidate(1);
        } else if ((i & 16) != 0) {
            C0904g.m4916a().mo3404a(C0898b.CHANGE_CANDIDATE);
            this.candidateManager.updateCandidate(0);
            this.clokeManager.onClokeStateRefresh();
            C0904g.m4916a().mo3409b(C0898b.CHANGE_CANDIDATE);
        }
        if ((4194304 & i) != 0 && hasNextword()) {
            this.slideSentenceManager.mo4619a(0);
        } else if ((8388608 & i) != 0 && C1252b.f4004i) {
            this.slideSentenceManager.mo4619a(1);
        } else if ((i & 16) != 0) {
            if (hasCandidate()) {
                if (!Settings.getInstance().getBoolSetting(Settings.WAVE_WITHOUT_NEXT_WORD_ON_CANDIDATE)) {
                    candidateItemSource = getCandidateItemSource(0);
                    z3 = candidateItemSource != 10;
                } else if (getDefaultCandidateItemIndex() != -1) {
                    z3 = true;
                    candidateItemSource = -1;
                } else {
                    z3 = false;
                    candidateItemSource = -1;
                }
                if (candidateItemSource == -1) {
                    candidateItemSource = getCandidateItemSource(0);
                }
                if (candidateItemSource == 10) {
                    z2 = z3;
                    z = true;
                } else {
                    z2 = z3;
                    z = false;
                }
            } else {
                z = true;
                z2 = false;
            }
            if (z2) {
                this.slideSentenceManager.mo4619a(2);
            }
            if (z) {
                this.slideSentenceManager.mo4620a(2, false);
            }
        } else if ((4194304 & i) != 0) {
            this.slideSentenceManager.mo4620a(0, false);
        }
        if ((16777216 & i) != 0) {
            this.slideSentenceManager.mo4622a(getConfirmedText());
        }
        if ((i & 512) != 0) {
            C0904g.m4916a().mo3404a(C0898b.CHANGE_EXPLICIT);
            this.explicitManager.updateText(getExplicitText(), getExplicitInfo());
            C1368X.m6320c().mo5828N().mo7984a();
            updateDynamicSpellCheckState();
            C0904g.m4916a().mo3409b(C0898b.CHANGE_EXPLICIT);
        }
        if ((i & 1) != 0) {
            C0904g.m4916a().mo3404a(C0898b.CHANGE_SURFACE);
            this.surfaceManager.updateSurface();
            this.surfaceManager.updateSurfaceOperation();
            ((TouchPalIME) this.ims).updateIcon();
            C0904g.m4916a().mo3409b(C0898b.CHANGE_SURFACE);
        } else if ((i & 2) != 0) {
            C0904g.m4916a().mo3404a(C0898b.CHANGE_SURFACE_DISPLAY);
            this.surfaceManager.updateSurfaceDisplay();
            ((TouchPalIME) this.ims).updateIcon();
            C0904g.m4916a().mo3409b(C0898b.CHANGE_SURFACE_DISPLAY);
        }
        if ((i & 8) != 0) {
            this.surfaceManager.updateSurfaceOperation();
        }
        if ((i & 4) != 0) {
            this.surfaceManager.updatePopupSurface();
        }
        if ((131072 & i) != 0) {
            this.handWriteMaskManager.updateHandWriteMask(isHandwriteMaskVisible());
        }
        if ((i & 64) != 0) {
            this.filterManager.updateFilter();
        } else if ((i & 128) != 0) {
            this.filterManager.updateActiveFilter();
        }
        if ((i & EXCEPTION_WARN) != 0) {
            if (i2 != -1) {
                WarningManager warningManager2 = this.warningManager;
                if ((i & EXCEPTION_WARN) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                warningManager2.processWarn(i2, z4);
            } else if (getErrorCode() == 9) {
                C1368X.m6320c().mo5848u().mo5602g();
                this.handWriteMaskManager.showDownloadInfo();
            }
        }
        if ((CHANGE_INPUT_CONNECTION & i) != 0) {
            this.editor.needUpdateSelection(getInlineText().length());
        }
        if ((1048576 & i) != 0) {
            C1368X.m6320c().mo5828N().mo7987d();
        }
        if ((67108864 & i) != 0) {
            C1368X.m6320c().mo5828N().mo7988e();
        }
        if ((262144 & i) != 0) {
            this.clokeManager.updateCloke(0);
        }
        if (!((33554432 & i) == 0 || (this.clokeManager.getCloudSearchStrategy() & 2) == 0)) {
            this.clokeManager.updateCloke(1);
        }
        if ((524288 & i) != 0) {
            C1368X.m6320c().mo5828N().mo7990g();
        }
        if ((2097152 & i) != 0) {
            C1368X.m6320c().mo5844q().mo5861a(getInstance().getAccessibilityString());
        }
        C0904g.m4916a().mo3404a(C0898b.CHANGE_VERBOSE);
        this.verboseManager.update();
        C0904g.m4916a().mo3409b(C0898b.CHANGE_VERBOSE);
        C0904g.m4916a().mo3409b(C0898b.UPDATE_RESULT);
    }

    private String deleteWordAroundCursor(int i) {
        int i2;
        String str;
        int i3;
        String str2;
        String str3;
        String str4 = null;
        InputConnection currentInputConnection = this.ims.getCurrentInputConnection();
        if (currentInputConnection == null) {
            return "";
        }
        int[] selection = this.editor.getSelection();
        if (selection[0] != selection[1]) {
            this.ims.sendDownUpKeyEvents(67);
            return "";
        }
        if (i != 2) {
            String textBeforeCursor = this.editor.getTextBeforeCursor(36);
            i2 = getDeleteWordLength(textBeforeCursor, true);
            str = textBeforeCursor;
        } else {
            i2 = 0;
            str = null;
        }
        if (i == 1 || (str != null && (str.equals("") || Character.isWhitespace(str.charAt(str.length() - 1))))) {
            i3 = 0;
            str2 = null;
        } else {
            String textAfterCursor = this.editor.getTextAfterCursor(36);
            if (textAfterCursor == null || textAfterCursor.length() <= 0 || !Character.isWhitespace(textAfterCursor.charAt(0))) {
                str4 = textAfterCursor;
            }
            i3 = getDeleteWordLength(str4, false);
            str2 = str4;
        }
        if (str == null && str2 == null) {
            return "";
        }
        if (str != null) {
            str3 = str.substring(str.length() - i2, str.length());
        } else {
            str3 = "";
        }
        if (str2 != null) {
            str3 = str3 + str2.substring(0, i3);
        }
        if (i2 + i3 <= 1) {
            this.ims.sendDownUpKeyEvents(67);
            return str3;
        }
        C1372a q = C1368X.m6320c().mo5844q();
        if (q != null && q.mo5864c()) {
            q.mo5861a("@string/accessibility_delete&" + str3);
        }
        currentInputConnection.deleteSurroundingText(i2, i3);
        return str3;
    }

    private int getDeleteWordLength(String str, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        if (str != null) {
            if (z) {
                i3 = str.length() - 1;
                i4 = -1;
                i = 0;
                i2 = 0;
                z2 = true;
            } else {
                i4 = 1;
                i3 = 0;
                i = 0;
                i2 = 0;
                z2 = true;
            }
            while (true) {
                if (i3 >= str.length() || i3 < 0) {
                    break;
                }
                char charAt = str.charAt(i3);
                if (Character.isWhitespace(charAt)) {
                    if (i > 0 || charAt != ' ') {
                        break;
                    }
                    i2++;
                } else if (!C2829G.m12929a(charAt)) {
                    if (i2 > 1 || z2) {
                        break;
                    }
                    i++;
                    z2 = true;
                } else if (i2 <= 0 && !z2) {
                    i++;
                }
                i3 += i4;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        return i2 + i;
    }

    private void onSpaceDoubleClick() {
        int i = 2;
        InputConnection currentInputConnection = this.ims.getCurrentInputConnection();
        if (currentInputConnection != null) {
            String textBeforeCursor = this.editor.getTextBeforeCursor(3);
            if (textBeforeCursor != null) {
                if ((textBeforeCursor.length() == 2 && Character.isLetterOrDigit(textBeforeCursor.charAt(0)) && textBeforeCursor.charAt(1) == ' ') || (textBeforeCursor.length() == 3 && Character.isLetterOrDigit(textBeforeCursor.charAt(1)) && textBeforeCursor.charAt(2) == ' ')) {
                    i = 1;
                } else if (!(textBeforeCursor.length() == 3 && Character.isLetterOrDigit(textBeforeCursor.charAt(0)) && textBeforeCursor.charAt(1) == ' ' && textBeforeCursor.charAt(2) == ' ')) {
                    i = 0;
                }
                if (i > 0) {
                    currentInputConnection.beginBatchEdit();
                    currentInputConnection.deleteSurroundingText(i, 0);
                    currentInputConnection.endBatchEdit();
                }
                if (i > 0) {
                    fireCommitOperation(C1389aD.f4374j);
                    fireCommitOperation(" ");
                } else {
                    fireCommitOperation(" ");
                }
            } else {
                fireCommitOperation(" ");
            }
            processEvent();
        }
    }

    public void commitKeyEvent(int i) {
        String resString;
        int i2 = 0;
        if (i >= 3211265 && i <= 3211282) {
            this.editor.onKeyClick(i);
        } else if (i == 131080) {
            C1368X.m6320c().mo5844q().mo5859a((int) R.string.accessibility_delete);
            this.ims.sendDownUpKeyEvents(67);
            this.editor.changeSelect(false);
            addInputAction(new C1706b(""));
        } else if (i == 3211283) {
            this.widgetManager.mo9610P().setVisibility(0);
            this.widgetManager.mo9610P().mo8512f();
            Settings.getInstance().setBoolSetting(Settings.FIRST_START_CLIPBOARD, false);
            C1246d.m6010a((Context) sContext).mo4591a(C1246d.f3752aV, C1246d.f3812bc, C1246d.f3783b);
        } else if (i == 3145787) {
            addInputAction(new C1706b(deleteWordAroundCursor(1)));
        } else if (i == 3145794) {
            addInputAction(new C1706b(deleteWordAroundCursor(0)));
        } else if (i == 3145785) {
            if (this.ims.getCurrentInputConnection() != null) {
                this.ims.getCurrentInputConnection().deleteSurroundingText(1, 0);
            }
            this.editor.changeSelect(false);
        } else if (i == 131200) {
            this.ims.sendKeyChar(' ');
            C1368X.m6320c().mo5844q().mo5861a(" ");
        } else if (i == 131213) {
            if (this.editor.getEditorInfo() != null) {
                i2 = this.editor.getEditorInfo().inputType;
            }
            switch (i2 & 4080) {
                case 64:
                case Settings.SKIN:
                    this.ims.getCurrentInputConnection().commitText(C0911j.f2473c, 1);
                    return;
                default:
                    this.ims.sendKeyChar(10);
                    return;
            }
        } else if (i == 3145729) {
            if (C1389aD.m6468r()) {
                Toast.makeText(sContext, getResString(sContext, R.string.prediction_invalidate_without_sdcard), 1).show();
                return;
            }
            boolean z = !Settings.getInstance().getBoolSetting(1);
            Settings.getInstance().setBoolSetting(1, z);
            if (getWidgetManager().mo9648g() != null) {
                getWidgetManager().mo9648g().mo8734c();
            }
            C1199d a = C1194T.m5771a(C2717b.PLUGIN_PREDICTION.toString());
            if (a.mo4458f() && a.mo4456d().mo4469b() && getWidgetManager().mo9650h() != null) {
                getWidgetManager().mo9650h().mo8558r();
            }
            C2849W a2 = C2849W.m13205a();
            if (z) {
                resString = getResString(sContext, R.string.prediction_on);
            } else {
                resString = getResString(sContext, R.string.prediction_off);
            }
            a2.mo9476a(resString);
        } else if (i == 3145791) {
            C1368X.m6320c().mo5842o().mo5923K();
        } else if (i == 3145792) {
            C1368X.m6320c().mo5842o().mo5924L();
        } else if (i == 3145793) {
            Toast makeText = Toast.makeText(sContext, getResString(sContext, R.string.enabled_chinese_pinyin), 0);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        } else if (i == 3145740) {
            this.ims.requestHideSelf(0);
        } else if (i == 3145741) {
        } else {
            if (i == 3145743) {
                Intent intent = new Intent();
                intent.setClass(this.ims, TouchPalOption.class);
                intent.addFlags(EXCEPTION_ERROR);
                this.ims.startActivity(intent);
            } else if (i == 3145788) {
                Intent intent2 = new Intent();
                intent2.setClass(this.ims, CustomizeSettings.class);
                intent2.addFlags(EXCEPTION_ERROR);
                intent2.setType("cn");
                this.ims.startActivity(intent2);
            } else if (i == 3145789) {
                Intent intent3 = new Intent();
                intent3.setClass(this.ims, CustomizeSettings.class);
                intent3.addFlags(EXCEPTION_ERROR);
                intent3.setType("en");
                this.ims.startActivity(intent3);
            } else if (i == 3145744) {
                this.ims.sendDownUpKeyEvents(59);
            } else if (i >= 3145745 && i <= 3145747) {
            } else {
                if (i == 3145730) {
                    switchToNextLanguage();
                } else if (i == 3145730 || i == 3145761) {
                    this.widgetManager.mo9636aj();
                } else if (i == 3276804) {
                    this.dialogManager.onKeycode(i);
                } else if (i == 3276808 || i == 3276809) {
                    this.surfaceManager.onKeycode(i);
                } else if (i == 3145764) {
                    onSpaceDoubleClick();
                } else if (i == 3145765) {
                    if (((TouchPalIME) this.ims).isCandidatesViewShown()) {
                        this.ims.setCandidatesViewShown(false);
                    } else {
                        this.ims.sendDownUpKeyEvents(4);
                    }
                } else if (i == 3276801) {
                    this.voiceProcessor.startInputVoice();
                } else if (i == 3276802) {
                    this.voiceProcessor.cancelInputVoice();
                } else if (i == 3276803) {
                    this.voiceProcessor.stopInputVoice();
                } else if (i >= 3145768 && i <= 3145771) {
                    this.widgetManager.mo9624a(i);
                } else if (i >= 3145772 && i <= 3145783) {
                    this.widgetManager.mo9624a(i);
                } else if (i == 3145784) {
                    Toast.makeText(this.context, getResString(this.context, R.string.quick_switcher_no_setting_prompt), 1).show();
                } else if (i == 3276805) {
                    this.widgetManager.mo9611Q();
                } else if (i == 3276806) {
                    this.widgetManager.mo9618X().mo7424b();
                } else if (i == 3276807) {
                    this.widgetManager.mo9618X().mo7420a(true);
                } else if (i == 3276810) {
                    C1584bI.m7145b(sContext, new Runnable() {
                        public void run() {
                            Intent intent = new Intent(Engine.sContext, PresentationWebviewActivity.class);
                            String a = C1132b.m5654a((Context) Engine.sContext).mo4402a(C1135d.WEBVIEW_URL_GUESS_EMOJI, C2225al.m10054a((Context) Engine.sContext, C1974m.m9063a((Context) Engine.sContext, (int) R.string.guess_emoji_url)));
                            String a2 = C1974m.m9063a((Context) Engine.sContext, (int) R.string.guess_emoji);
                            intent.addFlags(Engine.EXCEPTION_ERROR);
                            intent.putExtra(C2515q.f10829b, a);
                            intent.putExtra(C2515q.f10834g, a2);
                            intent.putExtra(C2515q.f10832e, false);
                            Engine.sContext.startActivity(intent);
                            Engine.this.ims.requestHideSelf(0);
                        }
                    }, true);
                    C1246d.m6010a((Context) sContext).mo4594a(C1246d.f3862cZ, true, C1246d.f3783b);
                } else {
                    if (i < KeyEvent.getMaxKeyCode()) {
                    }
                }
            }
        }
    }

    public void updateCachedLayoutAlias() {
        this.mCachedLayoutAlias = getLayoutAlias();
    }

    public void updateInputOp(String str) {
        if (this.mShouldCollectCommitInfo) {
            this.mCachedInputOp += str;
        }
    }

    public void addInputAction(C1708d dVar) {
        if (this.mShouldCollectCommitInfo) {
            this.mCachedInputSequence.add(dVar);
        }
    }

    public void updateInputData(boolean z) {
        if (this.mShouldCollectCommitInfo) {
            this.mHandler.removeMessages(1);
            if (z) {
                doUpdateInputData();
            } else {
                this.mHandler.sendEmptyMessageDelayed(1, 300);
            }
        }
    }

    /* access modifiers changed from: private */
    public void doUpdateInputData() {
        InputConnection currentInputConnection;
        ExtractedText extractedText;
        if (this.mShouldCollectCommitInfo && this.ims != null && (currentInputConnection = this.ims.getCurrentInputConnection()) != null && (extractedText = ExtractTextProvider.getIns().getExtractedText(currentInputConnection, 0, 0)) != null) {
            if (TextUtils.isEmpty(extractedText.text)) {
                this.mCachedInput = "";
            } else {
                this.mCachedInput = extractedText.text.toString();
            }
        }
    }

    private void collectInputData() {
        collectInputData((String) null);
    }

    private boolean canCollectInputData() {
        boolean z;
        boolean z2 = this.mShouldCollectCommitInfo;
        if (z2) {
            Iterator<C1708d> it = this.mCachedInputSequence.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() instanceof C1705a) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z2 || !z) {
                return false;
            }
            return true;
        }
        z = false;
        if (z2) {
        }
        return false;
    }

    public void collectInputData(String str) {
        EditorInfo currentInputEditorInfo;
        String str2;
        if (canCollectInputData() && (currentInputEditorInfo = this.ims.getCurrentInputEditorInfo()) != null) {
            int i = currentInputEditorInfo.imeOptions & 1073742079;
            if (TextUtils.isEmpty(str)) {
                str2 = getCurrentLanguageId();
            } else {
                str2 = str;
            }
            String str3 = null;
            if (C1368X.m6324d()) {
                str3 = C1368X.m6320c().mo5842o().mo5975w(str2);
            }
            C1712h.m7887a((Context) getIms(), 3, str2, this.mCachedInput, currentInputEditorInfo.packageName, this.mCachedInputOp, this.mInputType, i, str3, this.mCachedDictOptions, this.mCachedLayoutAlias, this.mCachedInputSequence, this.mCachedCell, 0);
        }
        this.mCachedInput = "";
        this.mCachedInputOp = "";
        this.mCachedInputSequence.clear();
        this.mCachedDictOptions = getDictOptions();
        this.mCachedLayoutAlias = getLayoutAlias();
        this.mCachedCell = getCurrentCell();
    }

    public static void switchToLanguage(String str) {
        if (C1389aD.m6470y(str)) {
            Settings.getInstance().setStringSetting(Settings.PREUSED_CHS_LANGUAGE, str, true);
        }
        Settings.getInstance().setStringSetting(11, Settings.getInstance().getStringSetting(10));
        Settings.getInstance().setStringSetting(10, str);
        C1060e.m5598b().mo4274a(C1060e.f3014e, (Object) str);
        C1056a.m5588a().mo4264a(C1056a.f2965Z + str, sContext);
    }

    public void clearShiftState() {
        int keyId = getKeyId(KEY_NAME_CLEAR_SHIFT_STATE);
        if (keyId != -1) {
            fireKeyOperation(keyId, 0);
            processEvent();
        }
    }

    private void switchToNextLanguage() {
        C1389aD o = C1368X.m6320c().mo5842o();
        String[] g = o.mo5945g();
        int i = 0;
        while (true) {
            if (i >= g.length) {
                i = -1;
                break;
            } else if (g[i].equals(getCurrentLanguageId())) {
                break;
            } else {
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < g.length; i3++) {
            i2 = ((i + 1) + i3) % g.length;
            if (o.mo5954l(g[i2]).f4731j) {
                break;
            }
        }
        switchToLanguage(g[i2]);
    }

    public void feedback(boolean z) {
        if (z) {
            C1368X.m6320c().mo5852y().mo6379a(true);
        } else if (HighFreqSettings.getInstance().vibrate != 0 || HighFreqSettings.getInstance().applySystemVibrate) {
            C1368X.m6320c().mo5852y().mo6379a(false);
        }
        if (HighFreqSettings.getInstance().applySystemVolume) {
            float streamVolume = ((float) this.audioManager.getStreamVolume(2)) / ((float) this.audioManager.getStreamMaxVolume(2));
            if (streamVolume != 0.0f) {
                this.audioManager.playSoundEffect(5, streamVolume);
                return;
            }
            return;
        }
        int i = HighFreqSettings.getInstance().sound;
        if (i != 0) {
            float f = ((float) i) / ((float) HighFreqSettings.getInstance().MAX_SOUND_VOLUME);
            if (f != 0.0f) {
                this.audioManager.playSoundEffect(5, f * f);
            }
        }
    }

    public void feedback() {
        feedback(false);
    }

    public void settingChanged(int i) {
        if (i == 7 || i == 4 || (i == 123 && !getIms().isInputViewShown())) {
            this.widgetManager.mo9666w();
        } else if (i == 31 || i == 53) {
            this.widgetManager.mo9606L().mo9708b();
        } else if (i == 81 && !getIms().isInputViewShown()) {
            this.widgetManager.mo9666w();
        } else if (i == 335 || i == 14) {
            this.widgetManager.mo9608N();
        } else if (i == 362) {
            C1368X.m6320c().mo5841n().mo6244A();
        }
        HighFreqSettings.reset();
    }

    public void release() {
        this.okinawa.setEngine((Engine) null);
    }

    public void postProcessEvent() {
        this.okinawa.postProcessEvent();
    }

    public void processEvent() {
        C0904g.m4916a().mo3404a(C0898b.PROCESS_EVENT);
        this.okinawa.processEvent();
        C0904g.m4916a().mo3409b(C0898b.PROCESS_EVENT);
    }

    public void fireStartInputOperation(int i, int i2, boolean z) {
        this.okinawa.fireStartInputOperation(i, i2, z);
    }

    public void fireStartInputViewOperation(int i, int i2, boolean z) {
        this.okinawa.fireStartInputViewOperation(i, i2, z);
    }

    public void fireFinishInputViewOperation() {
        this.okinawa.fireFinishInputViewOperation();
    }

    public void fireFinishInputOperation() {
        this.okinawa.fireFinishInputOperation();
    }

    public void fireCleanupOperation() {
        this.okinawa.fireCleanupOperation();
    }

    public void fireUpdateSelectionOperation(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.okinawa.fireUpdateSelectionOperation(i, i2, i3, i4, i5, i6, i7);
    }

    public void fireImportUserDictOperation() {
        this.okinawa.fireImportUserDataOperation();
    }

    public void fireRetrieveNextwordOperation() {
        this.okinawa.fireRetrieveNextwordOperation();
    }

    public void fireClearNextwordOperation() {
        this.okinawa.fireClearNextwordOperation();
    }

    public void fireConfirmNextwordOperation(int i) {
        this.okinawa.fireConfirmNextwordOperation(i);
    }

    public void fireConfirmNextphraseOperation(int i) {
        this.okinawa.fireConfirmNextphraseOperation(i);
    }

    public void fireConfirmCandidateOperation(int i) {
        this.okinawa.fireConfirmCandidateOperation(i);
    }

    public void fireConfigChangeOperation() {
        this.okinawa.fireConfigChangeOperation();
    }

    public void fireKeyOperation(int i, int i2) {
        fireKeyOperation(i, i2, 0);
    }

    public void fireKeyOperation(int i, int i2, int i3) {
        fireKeyOperation(new SoftKeyActionInfo(new C2810ce(i)), i2, i3);
    }

    public void fireKeyOperation(SoftKeyActionInfo softKeyActionInfo, int i, int i2) {
        this.okinawa.fireKeyOperation(softKeyActionInfo, i, i2);
    }

    public void fireSlipOperation(int i) {
        this.okinawa.fireSlipOperation(i);
    }

    public void fireSettingsChangedOperation(int i) {
        this.okinawa.fireSettingsChangedOperation(i);
    }

    public void fireTimeOperation(int i, int i2) {
        this.okinawa.fireTimeOperation(i, i2);
    }

    public void fireSelectCandidateOperation(int i) {
        this.okinawa.fireSelectCandidateOperation(i);
    }

    public void fireSetDefaultCandidateOperation(int i) {
        this.okinawa.fireSetDefaultCandidateOperation(i);
    }

    public void fireAddCandidateOperation(String str) {
        this.okinawa.fireAddCandidateOperation(str);
    }

    public void fireAddCandidateEndOperation() {
        this.okinawa.fireAddCandidateEndOperation();
    }

    public void fireSelectFilterOperation(int i) {
        this.okinawa.fireSelectFilterOperation(i);
    }

    public void fireSelectMistypeCorrectOperation(int i) {
        this.okinawa.fireSelectMistypeCorrectOperation(i);
    }

    public void fireCandidateEndOperation(int i) {
        this.okinawa.fireCandidateEndOperation(i);
    }

    public void fireSelectUserwordOperation(int i) {
        this.okinawa.fireSelectUserwordOperation(i);
    }

    public void fireSelectDialectOperation(int i) {
        this.okinawa.fireSelectDialectOperation(i);
    }

    public String getCurrentLanguageShortName() {
        return this.okinawa.getCurrentLanguageShortName();
    }

    public String getPreUsedLanguageShortName() {
        return this.okinawa.getPreUsedLanguageShortName();
    }

    public String getCurrentLanguageId() {
        return this.okinawa.getCurrentLanguageId();
    }

    public boolean isCurrentLanguageSupportCurve() {
        return this.okinawa.isCurrentLanguageSupportCurve();
    }

    public int getLanguageSupportSubType(String str) {
        return this.okinawa.getLanguageSupportSubType(str);
    }

    public int getLanguageSupportLayout(String str) {
        return this.okinawa.getLanguageSupportLayout(str);
    }

    public int getEnabledLanguageCount() {
        return this.okinawa.getEnabledLanguageCount();
    }

    public String getEnabledLanguageFullName(int i) {
        return this.okinawa.getEnabledLanguageFullName(i);
    }

    public String getEnabledLanguageId(int i) {
        return this.okinawa.getEnabledLanguageId(i);
    }

    public String getOriginalLetters(String str) {
        return this.okinawa.getOriginalLetters(str);
    }

    public boolean hasCandidate() {
        return this.okinawa.hasCandidate();
    }

    public int getCandidateFirstIndex() {
        return this.okinawa.getCandidateFirstIndex();
    }

    public CandidateItem getCandidateItem(int i, CandidateItem candidateItem) {
        return this.okinawa.getCandidateItem(i, candidateItem);
    }

    public String getCandidateItemPredictText(int i) {
        return this.okinawa.getCandidateItemPredictText(i);
    }

    public int getCandidateItemSource(int i) {
        return this.okinawa.getCandidateItemSource(i);
    }

    public int getCandidateItemPriority(int i) {
        return this.okinawa.getCandidateItemPriority(i);
    }

    public int getDefaultCandidateItemIndex() {
        return this.okinawa.getDefaultCandidateItemIndex();
    }

    public boolean hasNextword() {
        return this.okinawa.hasNextword();
    }

    public CandidateItem getNextwordItemDirectly(int i, CandidateItem candidateItem) {
        return this.okinawa.getNextwordItemDirectly(i, candidateItem);
    }

    public boolean hasNextphrase() {
        return this.okinawa.hasNextphrase();
    }

    public CandidateItem getNextphraseItemDirectly(int i, CandidateItem candidateItem) {
        return this.okinawa.getNextphraseItemDirectly(i, candidateItem);
    }

    public int getFilterSize() {
        return this.okinawa.getFilterSize();
    }

    public int getFilterType() {
        return this.okinawa.getFilterType();
    }

    public FilterItem getFilterItem(int i, FilterItem filterItem) {
        return this.okinawa.getFilterItem(i, filterItem);
    }

    public String getInlineText() {
        return getInlineText(false);
    }

    public String getInlineText(boolean z) {
        if (this.mCachedInlineText == null || z) {
            this.mCachedInlineText = this.okinawa.getInlineText();
        }
        return this.mCachedInlineText;
    }

    public ExplicitInfo getInlineInfo() {
        if (this.mInlineInfo == null) {
            this.mInlineInfo = new ExplicitInfo();
        }
        return this.okinawa.getInlineInfo(this.mInlineInfo);
    }

    public int getEraseCountBeforeCursor() {
        return this.okinawa.getEraseCountBeforeCursor();
    }

    public int getEraseCountAfterCursor() {
        return this.okinawa.getEraseCountAfterCursor();
    }

    public String getExplicitText() {
        return this.okinawa.getExplicitText();
    }

    public ExplicitInfo getExplicitInfo() {
        if (this.mExplicitInfo == null) {
            this.mExplicitInfo = new ExplicitInfo();
        }
        return this.okinawa.getExplicitInfo(this.mExplicitInfo);
    }

    public String getConfirmedText() {
        return this.okinawa.getConfirmedText();
    }

    public ExplicitInfo getConfirmedInfo() {
        if (this.mConfirmedInfo == null) {
            this.mConfirmedInfo = new ExplicitInfo();
        }
        return this.okinawa.getConfirmedInfo(this.mConfirmedInfo);
    }

    public int getCommitCount() {
        return this.okinawa.getCommitCount();
    }

    public int getCommitType(int i) {
        return this.okinawa.getCommitType(i);
    }

    public String getCommitText(int i) {
        return this.okinawa.getCommitText(i);
    }

    public String getCommitEvidence(int i) {
        return this.okinawa.getCommitEvidence(i);
    }

    public int getCommitInternalSource(int i) {
        return this.okinawa.getCommitSource(i);
    }

    public String[] getCommitHistory(int i) {
        return this.okinawa.getCommitHistory(i);
    }

    public int getCommitDictTag(int i) {
        return this.okinawa.getCommitDictTag(i);
    }

    public int getCommitCorrectionCount(int i) {
        return this.okinawa.getCommitCorrectionCount(i);
    }

    public String getCommitLangId(int i) {
        return this.okinawa.getCommitLangId(i);
    }

    public String getCommitDefaultItemText(int i) {
        return this.okinawa.getCommitDefaultItemText(i);
    }

    public int getCommitWrongInputTimes(int i) {
        return this.okinawa.getCommitWrongInputTimes(i);
    }

    public boolean isCommitActive(int i) {
        return this.okinawa.isCommitActive(i);
    }

    public SibCandidateItem[] getCommitSibCandidateItems(int i, SibCandidateItem[] sibCandidateItemArr) {
        return this.okinawa.getCommitSibCandidateItems(i, sibCandidateItemArr);
    }

    public int getCommitSibCandidateItemsSize(int i) {
        return this.okinawa.getCommitSibCandidateItemsSize(i);
    }

    public int getCommitEffectiveInputType(int i) {
        return this.okinawa.getCommitEffectiveInputType(i);
    }

    public int getCommitEffectiveTouchInputCodesSize(int i) {
        return this.okinawa.getCommitEffectiveTouchInputCodesSize(i);
    }

    public TouchInputContext getCommitEffectiveTouchInputContext(int i, TouchInputContext touchInputContext, TouchInputCode[] touchInputCodeArr) {
        return this.okinawa.getCommitEffectiveTouchInputContext(i, touchInputContext, touchInputCodeArr);
    }

    public int getCommitEffectiveCurveInputPointsSize(int i) {
        return this.okinawa.getCommitEffectiveCurveInputPointsSize(i);
    }

    public CurveInputContext getCommitEffectiveCurveInputContext(int i, CurveInputContext curveInputContext, CurveInputPoint[] curveInputPointArr) {
        return this.okinawa.getCommitEffectiveCurveInputContext(i, curveInputContext, curveInputPointArr);
    }

    public int getCommitLastWrongInputType(int i) {
        return this.okinawa.getCommitLastWrongInputType(i);
    }

    public int getCommitLastWrongTouchInputCodesSize(int i) {
        return this.okinawa.getCommitLastWrongTouchInputCodesSize(i);
    }

    public TouchInputContext getCommitLastWrongTouchInputContext(int i, TouchInputContext touchInputContext, TouchInputCode[] touchInputCodeArr) {
        return this.okinawa.getCommitLastWrongTouchInputContext(i, touchInputContext, touchInputCodeArr);
    }

    public int getCommitLastWrongCurveInputPointsSize(int i) {
        return this.okinawa.getCommitLastWrongCurveInputPointsSize(i);
    }

    public CurveInputContext getCommitLastWrongCurveInputContext(int i, CurveInputContext curveInputContext, CurveInputPoint[] curveInputPointArr) {
        return this.okinawa.getCommitLastWrongCurveInputContext(i, curveInputContext, curveInputPointArr);
    }

    public int getCommitKeyEvent(int i) {
        return this.okinawa.getCommitKeyEvent(i);
    }

    public String getSurfaceTemplate() {
        return this.okinawa.getSurfaceTemplate();
    }

    public int getSurfaceSupportedOperation() {
        return this.okinawa.getSurfaceSupportedOperation();
    }

    public int getSurfaceSupportedMode() {
        return this.okinawa.getSurfaceSupportedMode();
    }

    public int getSurfaceAttribute() {
        return this.okinawa.getSurfaceAttribute();
    }

    public int getSurfaceExtraElementsCount() {
        return this.okinawa.getSurfaceExtraElementsCount();
    }

    public String getSurfaceExtraElement(int i) {
        return this.okinawa.getSurfaceExtraElement(i);
    }

    public int getSurfaceType() {
        return this.okinawa.getSurfaceType();
    }

    public int getSurfaceSubType() {
        return this.okinawa.getSurfaceSubType();
    }

    public int getKeySupportedOperation(int i) {
        return this.okinawa.getKeySupportedOperation(i);
    }

    public int getTriStatus(int i) {
        return this.okinawa.getTriStatus(i);
    }

    public int getKeyId(String str) {
        return this.okinawa.getKeyId(str);
    }

    public int[] getAllKeyId() {
        return this.okinawa.getAllKeyId();
    }

    public boolean isHandwriteMaskVisible() {
        return this.okinawa.isHandwriteMaskVisible();
    }

    public void updateKey(int i, SoftKeyInfo softKeyInfo) {
        this.okinawa.updateKey(i, softKeyInfo);
    }

    public String getPreviewText(int i, int i2) {
        return C1368X.m6320c().mo5838k().mo6241b(this.okinawa.getPreviewText(i, i2));
    }

    public String[] getShortcutList() {
        return this.okinawa.getShortcutList();
    }

    public boolean hasUserword() {
        return this.okinawa.hasUserword();
    }

    public CandidateItem getUserWordItem(int i, CandidateItem candidateItem) {
        return this.okinawa.getUserWordItem(i, candidateItem);
    }

    public boolean hasDialect() {
        return this.okinawa.hasDialect();
    }

    public CandidateItem getDialectItem(int i, CandidateItem candidateItem) {
        return this.okinawa.getDialectItem(i, candidateItem);
    }

    public boolean isUserWordMode() {
        return this.okinawa.isUserWordMode();
    }

    public int getErrorCode() {
        return this.okinawa.getErrorCode();
    }

    public int getInternalErrorCode() {
        return this.okinawa.getInternalErrorCode();
    }

    public String getErrorMsg() {
        return this.okinawa.getErrorMsg();
    }

    public String getErrorLanguageId() {
        return this.okinawa.getErrorLanguageId();
    }

    public void fireHandwriteOperation(MoveContrail moveContrail) {
        this.okinawa.fireHandwriteOperation(moveContrail);
    }

    public boolean cloudHandwriteUpdate() {
        return this.okinawa.cloudHandwriteUpdate();
    }

    public void fireDeleteUserWordOperation(int i, boolean z) {
        this.okinawa.fireDeleteUserWordOperation(i, z);
    }

    public void fireDeleteUserWordOperation(String str, String str2, int i, boolean z) {
        this.okinawa.fireDeleteUserWordOperation(str, str2, i, z);
    }

    public void fireAdjustWordpriorityOperation(int i, int i2, int i3) {
        this.okinawa.fireAdjustWordpriorityOperation(i, i2, i3);
    }

    public void fireCommitOperation(String str, int i, int i2) {
        this.okinawa.fireCommitOperation(str, i, i2);
    }

    public void fireCommitOperation(String str) {
        this.okinawa.fireCommitOperation(str);
    }

    public void fireCommitOperation(int i) {
        this.okinawa.fireCommitOperation(i);
    }

    public void fireAddUserwordOperation(String str, String str2, int i) {
        this.okinawa.fireAddUserwordOperation(str, str2, i);
    }

    public void fireHardKeyOperation(int i, int i2, int i3) {
        this.okinawa.fireHardKeyOperation(i, i2, i3);
    }

    public void fireHardKeyOperation(int i, int i2) {
        fireHardKeyOperation(i, i2, 0);
    }

    public void fireInputMultiOperation(String str, boolean z) {
        this.okinawa.fireInputMultiOperation(str, z);
    }

    public void fireLearnTextOperation(String str, int i, int i2) {
        this.okinawa.fireLearnTextOperation(str, i, i2);
    }

    public void fireTransactionOperation(int i) {
        this.okinawa.fireTransactionOperation(i);
    }

    public void fireCloudCandidateOperation(int i, int i2) {
        this.okinawa.fireCloudCandidateOperation(i, i2);
    }

    public void fireCloudResultOperation(String str, String str2, CloudResultList[] cloudResultListArr) {
        this.okinawa.fireCloudResultOperation(str, str2, cloudResultListArr);
    }

    public void fireLocalCloudSearchOperation() {
        this.okinawa.fireLocalCloudSearchOperation();
    }

    public void fireLocalCloudResultOperation() {
        this.okinawa.fireLocalCloudResultOperation();
    }

    public int getStatisticDataCount() {
        return this.okinawa.getStatisticDataCount();
    }

    public String getStatisticDataPath(int i) {
        return this.okinawa.getStatisticDataPath(i);
    }

    public String getStatisticDataValue(String str) {
        return this.okinawa.getStatisticDataValue(str);
    }

    public int getWordFilter() {
        return this.okinawa.getWordFilter();
    }

    public boolean isBopomofoTone(int i) {
        return this.okinawa.isBopomofoTone(i);
    }

    public boolean isClickTransMode() {
        return this.okinawa.isClickTransMode();
    }

    public void setClickTransMode(boolean z) {
        this.okinawa.setClickTransMode(z);
    }

    public boolean isTransactionMode() {
        return this.okinawa.isTransactionMode();
    }

    public boolean isInputPaused() {
        return this.isInputPaused;
    }

    public void setInputPaused(boolean z) {
        this.isInputPaused = z;
    }

    public boolean isMutiTouchPaused() {
        return this.isMultiTouchPaused;
    }

    public void setMutiTouchPaused(boolean z) {
        this.isMultiTouchPaused = z;
    }

    public int getDefaultKeyId() {
        return this.okinawa.getDefaultKeyId();
    }

    public void fireDeleteAdOperation(String str) {
        this.okinawa.fireDeleteAdOperation(str);
    }

    public boolean isWordContact(String str, String str2) {
        return this.okinawa.isWordContact(str, str2);
    }

    public boolean hasCloudCandidate(int i) {
        return this.okinawa.hasCloudCandidate(i);
    }

    public String getCloudCandidateItemPredictText(int i) {
        return this.okinawa.getCloudCandidateItemPredictText(i);
    }

    public CandidateItem getCloudCandidateItem(int i, CandidateItem candidateItem, int i2) {
        return this.okinawa.getCloudCandidateItem(i, candidateItem, i2);
    }

    public CloudFeedback getCloudFeedback(CloudFeedback cloudFeedback) {
        return this.okinawa.getCloudFeedback(cloudFeedback);
    }

    public int getCloudInputType() {
        return this.okinawa.getCloudInputType();
    }

    public CloudParameters getCloudParameters(String str, CloudParameters cloudParameters) {
        return this.okinawa.getCloudParameters(str, cloudParameters);
    }

    public void fireLuaCallOperation(String str) {
        this.okinawa.fireLuaCallOperation(str);
    }

    public void fireCheckImageOperation(String str, int i, int i2) {
        this.okinawa.fireCheckImageOperation(str, i, i2);
    }

    public void fireImportUserDictionaryOperation(String str, String str2) {
        this.okinawa.fireImportUserDictionaryOperation(str, str2);
    }

    public void fireExportUserDictionaryOperation(String str, String str2) {
        this.okinawa.fireExportUserDictionaryOperation(str, str2);
    }

    public String getAccessibilityString() {
        return this.okinawa.getAccessibilityString();
    }

    public String getLearnedSentence() {
        return this.okinawa.getLearnedSentence();
    }

    public int getDictOptions() {
        return this.okinawa.getDictOptions();
    }

    public String getLayoutAlias() {
        return this.okinawa.getLayoutAlias();
    }

    public String getCurrentCell() {
        return this.okinawa.getCurrentCell();
    }

    public static void setPreciseMode(boolean z) {
        isPreciseMode = z;
    }

    public static boolean isPreciseMode() {
        return isPreciseMode;
    }

    public static void setLongPressDelete(boolean z) {
        isLongPressDelete = z;
    }

    public static boolean isLongPressDelete() {
        return isLongPressDelete;
    }

    public void setKeyboardMode(boolean z) {
        this.isNormalKeyboard = z;
    }

    public boolean isNormalModeKeyboard() {
        return this.isNormalKeyboard;
    }

    public C1665Z getUsrDicChecker() {
        if (this.mUsrDicChecker == null) {
            this.mUsrDicChecker = new C1665Z();
        }
        return this.mUsrDicChecker;
    }

    public static void setBusyState(boolean z) {
        sIsBusy = z;
    }

    public static boolean isBusy() {
        return sIsBusy;
    }

    public static void recordDailyUsage(Context context2, int i, String str) {
        long longSetting = Settings.getInstance().getLongSetting(i);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longSetting > 43200000) {
            Settings.getInstance().setLongSetting(i, currentTimeMillis);
            C1246d.m6010a(context2).mo4591a(str, C1246d.f3707D, C1246d.f3836c);
        }
    }
}
