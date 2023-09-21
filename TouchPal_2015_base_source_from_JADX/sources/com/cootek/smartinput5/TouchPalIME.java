package com.cootek.smartinput5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.inputmethodservice.AbstractInputMethodService;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSession;
import android.widget.Toast;
import com.cootek.p042a.p043a.C0898b;
import com.cootek.p042a.p043a.C0902f;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.smartinput.upgrade.PackageUninstallerActivty;
import com.cootek.smartinput.utilities.C0992a;
import com.cootek.smartinput.utilities.C0993b;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.cust.C1240a;
import com.cootek.smartinput5.daemon.DaemonManager;
import com.cootek.smartinput5.engine.CommitManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.ExplicitInfo;
import com.cootek.smartinput5.engine.ExplicitManager;
import com.cootek.smartinput5.engine.ExtractTextProvider;
import com.cootek.smartinput5.engine.InlineManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1372a;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1579bD;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.asset.C1452i;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.asset.DummyNotificationActionReceiver;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2309g;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.C2674aN;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.settings.EmotionKeyDialog;
import com.cootek.smartinput5.p066ui.settings.KeyboardCustomizeActivity;
import com.cootek.smartinput5.presentations.C2515q;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;

public class TouchPalIME extends InputMethodService implements CommitManager.ICommitTextListener, InlineManager.IInlineListener {
    private static final int ALL_META_STATE = 247;
    private static final int MSG_DELAY_MILLIS = 30;
    private static final int MSG_DO_UNDERLINE_WORD = 0;
    private static final int MSG_FAKE_ANIMATION_DELAY_MILLIS = 100;
    private static final int MSG_START_FAKE_KEYBOARD_ANIMATION = 1;
    private static final String TAG = "TouchPalIME";
    public static int mComposingNum;
    private static boolean mInstanceInitialized;
    private Constructor correctionInfoCons;
    private boolean forceExitFullscreenMode = false;
    /* access modifiers changed from: private */
    public boolean forceManual = false;
    private boolean isOrientationChangedAndInputShown = false;
    private boolean isWindowHidden = false;
    private int lastInputViewType = -1;
    private View lastView;
    private int mComposingAfter;
    private int mComposingBefore;
    private int mComposingCursor = -1;
    private Configuration mConfig;
    private String mCrashTypeInfo = null;
    private Locale mCreateLocale = null;
    private C1452i.C1453a mDismissNotificationListener = new C1049U(this);
    private boolean mDisplayLoadFailedDialog = false;
    C1055a mFakeKeyboard;
    private boolean mForceRefreshCandidatesView = false;
    private Handler mHandler = new C1109af(this);
    C2674aN mHardKeyProcessor;
    private InputMethodManager mImm;
    private int mInlineEraseAfter = 0;
    private int mInlineEraseBefore = 0;
    private String mInlineText = "";
    private boolean mInputViewHasSet = false;
    private boolean mIsCandidatesViewShown;
    private boolean mIsInputViewHidden = true;
    private Method mMethodCommitCorrection;
    private Method mMethodSetComposingRegion;
    private boolean mMethodsInitialized;
    private C1452i.C1453a mOnWindowShowListener = new C1108ae(this);
    private double mScreenDiagonalLength;
    /* access modifiers changed from: private */
    public IBinder mToken;
    /* access modifiers changed from: private */
    public Stack<C1044c> mUSStack = null;
    private boolean mUseLowerMethodToReselect = false;
    private ArrayList<C1042a> observers;
    private int query_day = 0;

    /* renamed from: com.cootek.smartinput5.TouchPalIME$a */
    public interface C1042a {
        /* renamed from: a */
        void mo4215a();
    }

    public void onCreate() {
        if (DaemonManager.f3959a) {
            DaemonManager.m6039a((Context) this);
        }
        C0904g.m4916a().mo3412c(C0902f.C0903a.INIT);
        C0904g.m4916a().mo3404a(C0898b.ON_CREATE);
        checkCrashState();
        checkRebuildState();
        C1466av.m6852b(this, C1466av.f4709r);
        C1368X.m6318b(true);
        super.onCreate();
        try {
            Thread.setDefaultUncaughtExceptionHandler(new C0993b(this));
        } catch (IllegalAccessException | SecurityException e) {
        }
        this.mMethodsInitialized = false;
        mInstanceInitialized = false;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        double d = ((double) displayMetrics.heightPixels) / ((double) displayMetrics.densityDpi);
        double d2 = ((double) displayMetrics.widthPixels) / ((double) displayMetrics.densityDpi);
        this.mScreenDiagonalLength = Math.sqrt((d2 * d2) + (d * d));
        new C1041T(this).start();
        this.mCreateLocale = getResources().getConfiguration().locale;
        this.observers = new ArrayList<>();
        C1460o.m6799b().mo6125a((C1452i.C1453a) new C1053Y(this));
        C1460o.m6799b().mo6124a((Context) this, true);
        C0904g.m4916a().mo3409b(C0898b.ON_CREATE);
        C1017y.m5222c(C1017y.f2685n, TAG, "Create TouchPal.");
    }

    public int getCandidatesHiddenVisibility() {
        if (this.isWindowHidden) {
            return super.getCandidatesHiddenVisibility();
        }
        return 8;
    }

    public void onDestroy() {
        C1466av.m6853c(this, C1466av.f4709r);
        C1466av.m6853c(this, C1466av.f4711t);
        C1368X.m6318b(false);
        super.onDestroy();
        destroy();
        this.mMethodSetComposingRegion = null;
        this.mMethodCommitCorrection = null;
        this.correctionInfoCons = null;
        this.mMethodsInitialized = false;
        this.mUseLowerMethodToReselect = false;
        C1017y.m5222c(C1017y.f2685n, TAG, "TouchPal destroyed.");
    }

    private void generateCrashLog() {
        new C1054Z(this).start();
    }

    public void requestHideSelf(int i) {
        super.requestHideSelf(i);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C0904g.m4916a().mo3411c();
        if (i == 4 && Engine.isInitialized()) {
            if (KeyboardCustomizeActivity.m13804a()) {
                return false;
            }
            C2917du widgetManager = Engine.getInstance().getWidgetManager();
            if (widgetManager != null && widgetManager.mo9633ag()) {
                return true;
            }
        }
        if (i == 82 && Engine.isInitialized() && Engine.getInstance().isSoftKeyMode()) {
            C2917du widgetManager2 = Engine.getInstance().getWidgetManager();
            if (!(widgetManager2.mo9651i() == null || widgetManager2.mo9651i().mo9720f() == null || !widgetManager2.mo9651i().mo9720f().isShown())) {
                return true;
            }
        }
        if (Engine.isInitialized() && this.mHardKeyProcessor != null && this.mHardKeyProcessor.mo8909b(keyEvent) && Engine.getInstance().isSoftKeyMode()) {
            requestHideSelf(0);
        }
        if (Engine.isInitialized() && this.mHardKeyProcessor != null && this.mHardKeyProcessor.mo8909b(keyEvent) && !Engine.getInstance().isHardKeyMode() && !Engine.getInstance().isSoftKeyMode()) {
            Engine.getInstance().onStartInput(getCurrentInputEditorInfo(), false);
        }
        if (!Engine.isInitialized() || this.mHardKeyProcessor == null || !this.mHardKeyProcessor.mo8905a(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C2917du widgetManager;
        if (i != 4 || !Engine.isInitialized() || (widgetManager = Engine.getInstance().getWidgetManager()) == null || !widgetManager.mo9633ag()) {
            if (i == 82 && Engine.isInitialized() && Engine.getInstance().isSoftKeyMode()) {
                C2917du widgetManager2 = Engine.getInstance().getWidgetManager();
                if (!(widgetManager2.mo9651i() == null || widgetManager2.mo9651i().mo9720f() == null || !widgetManager2.mo9651i().mo9720f().isShown())) {
                    return true;
                }
            }
            if (!Engine.isInitialized() || !this.mHardKeyProcessor.mo8908b(i, keyEvent)) {
                return super.onKeyUp(i, keyEvent);
            }
            return true;
        }
        widgetManager.mo9634ah();
        return true;
    }

    /* access modifiers changed from: private */
    public void setupInputView() {
        if (Engine.isInitialized() && !this.mInputViewHasSet) {
            if (C2515q.m11248a()) {
                C2515q.m11251b().mo8316c();
            }
            setInputView(Engine.getInstance().onCreateInputView());
            this.mInputViewHasSet = true;
        }
    }

    public void onStartInput(EditorInfo editorInfo, boolean z) {
        C0904g.m4916a().mo3404a(C0898b.ON_START_INPUT);
        ExtractTextProvider.getIns().resetState(editorInfo);
        C1460o.m6799b().mo6125a((C1452i.C1453a) new C1090aa(this, editorInfo, z));
        checkAssetsInBackground();
        super.onStartInput(editorInfo, z);
    }

    /* access modifiers changed from: private */
    public void stopCheckAssetsInBackground(C1452i.C1454b bVar) {
        DummyNotificationActionReceiver.removeInitializingNotification(this);
        if (bVar == C1452i.C1454b.extract_failed) {
            showExtractFailed();
        } else if (bVar == C1452i.C1454b.load_library_failed && !this.mDisplayLoadFailedDialog) {
            this.mDisplayLoadFailedDialog = true;
            C1584bI.m7156i(this);
            C1460o.m6799b().mo6128c(this);
        }
    }

    /* access modifiers changed from: private */
    public void showExtractFailed() {
        DummyNotificationActionReceiver.showExtracFailedNotification(getApplicationContext());
        Toast.makeText(getApplicationContext(), R.string.extract_failed_msg, 1).show();
    }

    private void checkAssetsInBackground() {
        C1460o.m6799b().mo6124a((Context) this, true);
        if (C1460o.m6799b().mo6129c()) {
            this.mDisplayLoadFailedDialog = false;
            DummyNotificationActionReceiver.showInitializingNotification(this);
        }
    }

    public View onCreateInputView() {
        C0904g.m4916a().mo3404a(C0898b.ON_CREATE_INPUT_VIEW);
        C1460o.m6799b().mo6125a((C1452i.C1453a) new C1091ab(this));
        checkAssetsInBackground();
        View view = null;
        if (C1460o.m6799b().mo6129c()) {
            view = getPreparingWindow();
            this.mHandler.sendEmptyMessageDelayed(1, (long) 100);
        } else if (Engine.isInitialized()) {
            view = Engine.getInstance().getWidgetManager().mo9643e();
        }
        C0904g.m4916a().mo3409b(C0898b.ON_CREATE_INPUT_VIEW);
        return view;
    }

    private View getPreparingWindow() {
        if (this.mFakeKeyboard == null) {
            this.mFakeKeyboard = new C1055a(this);
        }
        return this.mFakeKeyboard.mo4261a();
    }

    /* access modifiers changed from: private */
    public void stopPreparingWindow() {
        if (this.mFakeKeyboard != null) {
            this.mFakeKeyboard.mo4263c();
            this.mFakeKeyboard = null;
        }
    }

    public View onCreateCandidatesView() {
        return this.lastView;
    }

    public void onStartInputView(EditorInfo editorInfo, boolean z) {
        C0904g.m4916a().mo3412c(C0902f.C0903a.SHOW_KEYBOARD);
        C0904g.m4916a().mo3404a(C0898b.ON_START_INPUT_VIEW);
        C1056a.m5588a().mo4265a(C1056a.f2977h, this, false);
        ExtractTextProvider.getIns().resetState(editorInfo);
        C1460o.m6799b().mo6125a((C1452i.C1453a) new C1092ac(this, editorInfo, z));
        checkAssetsInBackground();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doOnStartInputView(android.view.inputmethod.EditorInfo r9, boolean r10) {
        /*
            r8 = this;
            r5 = -1
            r7 = 1
            r1 = 0
            boolean r0 = r8.checkEngineState()
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            return
        L_0x000a:
            int r0 = r9.inputType
            if (r0 != 0) goto L_0x002a
            boolean r0 = r8.mIsInputViewHidden
            if (r0 != 0) goto L_0x002a
            com.cootek.smartinput5.func.X r0 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.q r0 = r0.mo5821G()
            boolean r0 = r0.mo7188e(r9)
            if (r0 == 0) goto L_0x002a
            int r0 = r8.lastInputViewType
            if (r0 == 0) goto L_0x0009
            r8.lastInputViewType = r1
            r8.requestHideSelf(r1)
            goto L_0x0009
        L_0x002a:
            boolean r0 = com.cootek.smartinput5.engine.Engine.isInitialized()
            if (r0 == 0) goto L_0x003d
            com.cootek.smartinput5.engine.Engine r0 = com.cootek.smartinput5.engine.Engine.getInstance()
            java.lang.String r2 = ""
            int r3 = com.cootek.smartinput5.func.learnmanager.C1819b.f6058a
            int r4 = com.cootek.smartinput5.func.learnmanager.C1819b.f6063f
            r0.fireLearnTextOperation(r2, r3, r4)
        L_0x003d:
            if (r10 == 0) goto L_0x007c
            int r0 = r8.lastInputViewType
            int r2 = r9.inputType
            if (r0 != r2) goto L_0x007c
            com.cootek.smartinput5.engine.Engine r0 = com.cootek.smartinput5.engine.Engine.getInstance()
            com.cootek.smartinput5.engine.Editor r0 = r0.getEditor()
            java.lang.String r2 = r0.getTextBeforeCursor(r7)
            java.lang.String r0 = r0.getTextAfterCursor(r7)
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x00dd
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00dd
            boolean r0 = r8.isInputViewShown()
            if (r0 == 0) goto L_0x007c
            boolean r0 = com.cootek.smartinput5.engine.Engine.isInitialized()
            if (r0 == 0) goto L_0x007c
            com.cootek.smartinput5.engine.Engine r0 = com.cootek.smartinput5.engine.Engine.getInstance()
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r0.onUpdateSelection(r1, r2, r3, r4, r5, r6, r7)
        L_0x007c:
            if (r10 == 0) goto L_0x00ec
            boolean r0 = com.cootek.smartinput5.engine.Engine.isInitialized()
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = r8.mInlineText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ec
            com.cootek.smartinput5.engine.Engine r0 = com.cootek.smartinput5.engine.Engine.getInstance()
            com.cootek.smartinput5.engine.Editor r0 = r0.getEditor()
            java.lang.String r2 = r8.mInlineText
            int r2 = r2.length()
            java.lang.String r0 = r0.getTextBeforeCursor(r2)
            java.lang.String r2 = r8.mInlineText
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00ec
            r0 = r1
        L_0x00a7:
            boolean r2 = com.cootek.smartinput5.engine.Engine.isInitialized()
            if (r2 == 0) goto L_0x00b4
            com.cootek.smartinput5.engine.Engine r2 = com.cootek.smartinput5.engine.Engine.getInstance()
            r2.onStartInputView(r9, r0)
        L_0x00b4:
            boolean r2 = r8.useLowerMethodToReselect()
            r8.mUseLowerMethodToReselect = r2
            int r2 = r9.inputType
            r8.lastInputViewType = r2
            super.onStartInputView(r9, r10)
            boolean r2 = r8.isFullscreenMode()
            if (r2 == 0) goto L_0x00d6
            boolean r2 = r8.isExtractViewShown()
            if (r2 != 0) goto L_0x00d6
            boolean r2 = r8.isOrientationChangedAndInputShown
            if (r2 == 0) goto L_0x00d6
            r8.requestHideSelf(r1)
            r8.isOrientationChangedAndInputShown = r1
        L_0x00d6:
            if (r0 == 0) goto L_0x0009
            r8.onPostExecuteRestarting()
            goto L_0x0009
        L_0x00dd:
            if (r2 == 0) goto L_0x00e1
            if (r0 != 0) goto L_0x007c
        L_0x00e1:
            android.os.Handler r0 = r8.mHandler
            com.cootek.smartinput5.ad r2 = new com.cootek.smartinput5.ad
            r2.<init>(r8)
            r0.post(r2)
            goto L_0x007c
        L_0x00ec:
            r0 = r10
            goto L_0x00a7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.TouchPalIME.doOnStartInputView(android.view.inputmethod.EditorInfo, boolean):void");
    }

    public void onWindowShown() {
        C0904g.m4916a().mo3404a(C0898b.ON_WINDOW_SHOWN);
        C1460o.m6799b().mo6125a(this.mOnWindowShowListener);
        C1460o.m6799b().mo6124a((Context) this, true);
        C0904g.m4916a().mo3409b(C0898b.ON_WINDOW_SHOWN);
    }

    public void doOnWindowShown() {
        Engine.recordDailyUsage(this, Settings.LAST_RECORD_OPEN_KEYBOARD_TIME, C1246d.f3760ad);
        if (C2309g.m10582a().mo7910c()) {
            C2309g.m10582a().mo7909a((Context) this);
        }
        handleCrashCheckerOnKeyboardShown();
        if (Engine.isInitialized()) {
            Engine.getInstance().onWindowShown();
        }
        super.onWindowShown();
        if (needUninstallSelf()) {
            Intent intent = new Intent();
            intent.setClass(this, PackageUninstallerActivty.class);
            intent.setFlags(Engine.EXCEPTION_ERROR);
            startActivity(intent);
        }
        if (isFullscreenMode() && !isExtractViewShown()) {
            this.forceExitFullscreenMode = true;
            updateFullscreenMode();
        }
        this.mIsInputViewHidden = false;
    }

    private boolean needUninstallSelf() {
        int i;
        int currentTimeMillis;
        if (!getPackageName().equals(C1132b.f3170b)) {
            return false;
        }
        try {
            i = getPackageManager().getPackageInfo(C1132b.f3170b, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            i = 0;
        }
        if (i > getResources().getInteger(R.integer.ime_version_code) || (currentTimeMillis = (int) (((System.currentTimeMillis() / 3600) / 24) / 1000)) < this.query_day) {
            return false;
        }
        this.query_day = currentTimeMillis + 1;
        return true;
    }

    public void onFinishInputView(boolean z) {
        C0904g.m4916a().mo3414d(C0902f.C0903a.SHOW_KEYBOARD);
        C0904g.m4916a().mo3414d(C0902f.C0903a.CLICK);
        C0904g.m4916a().mo3412c(C0902f.C0903a.HIDE_KEYBOARD);
        C0904g.m4916a().mo3404a(C0898b.ON_FINISH_INPUT_VIEW);
        if (Engine.isInitialized()) {
            Engine.getInstance().onFinishInputView();
        }
        super.onFinishInputView(z);
        C0904g.m4916a().mo3409b(C0898b.ON_FINISH_INPUT_VIEW);
    }

    public void onWindowHidden() {
        C0904g.m4916a().mo3404a(C0898b.ON_WINDOW_HIDDEN);
        C1056a.m5588a().mo4264a(C1056a.f2964Y, this);
        if (Engine.isInitialized()) {
            Engine.getInstance().onWindowHidden();
            this.mHandler.postDelayed(new C1050V(this), 500);
        }
        this.isWindowHidden = true;
        setCandidatesViewShown(false);
        this.isWindowHidden = false;
        handleCrashCheckerOnKeyboardHidden();
        super.onWindowHidden();
        this.mHandler.postDelayed(new C1051W(this), 100);
        this.isOrientationChangedAndInputShown = false;
        Iterator<C1042a> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().mo4215a();
        }
        C1460o.m6799b().mo6133e();
        C1460o.m6799b().mo6125a(this.mDismissNotificationListener);
        this.mIsInputViewHidden = true;
        C0904g.m4916a().mo3409b(C0898b.ON_WINDOW_HIDDEN);
        C0904g.m4916a().mo3414d(C0902f.C0903a.HIDE_KEYBOARD);
    }

    public void onFinishInput() {
        C0904g.m4916a().mo3414d(C0902f.C0903a.CLICK);
        C0904g.m4916a().mo3414d(C0902f.C0903a.SHOW_KEYBOARD);
        C0904g.m4916a().mo3404a(C0898b.ON_FINISH_INPUT);
        if (Engine.isInitialized()) {
            Engine.getInstance().onFinishInput();
        }
        super.onFinishInput();
        C0904g.m4916a().mo3409b(C0898b.ON_FINISH_INPUT);
    }

    /* renamed from: com.cootek.smartinput5.TouchPalIME$c */
    public class C1044c {

        /* renamed from: a */
        public int f2860a;

        /* renamed from: b */
        public int f2861b;

        /* renamed from: c */
        public int f2862c;

        /* renamed from: d */
        public int f2863d;

        /* renamed from: e */
        public int f2864e;

        /* renamed from: f */
        public int f2865f;

        public C1044c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2860a = i;
            this.f2861b = i2;
            this.f2862c = i3;
            this.f2863d = i4;
            this.f2864e = i5;
            this.f2865f = i6;
        }
    }

    public void sendUpdateSelectionAuto() {
        if (Engine.isInitialized() && !Engine.getInstance().onUpdateSelection(1)) {
            Engine.getInstance().onUpdateSelection(0, 0, 0, 0, -1, -1, 1);
        }
    }

    public void onUpdateSelection(int i, int i2, int i3, int i4, int i5, int i6) {
        if (Engine.isInitialized()) {
            this.forceManual = false;
            if (C1368X.m6320c().mo5821G().mo7181b() && !(i3 == 0 && i4 == 0)) {
                this.forceManual = true;
            }
            if (this.mUSStack == null) {
                this.mUSStack = new Stack<>();
            }
            this.mUSStack.push(new C1044c(i, i2, i3, i4, i5, i6));
            this.mHandler.post(new C1052X(this));
            if (Engine.isLongPressDelete() && Settings.getInstance().getBoolSetting(Settings.ADVANCED_VIBRATION)) {
                C1368X.m6320c().mo5852y().mo6379a(false);
            }
        }
        super.onUpdateSelection(i, i2, i3, i4, i5, i6);
    }

    private void refreshAttachedPkgs() {
        C1811k.m8322a().mo6815a(2);
        C1811k.m8322a().mo6815a(3);
        C1811k.m8322a().mo6815a(0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.mConfig != null && this.mConfig.diff(configuration) != 0) {
            if (C1240a.m5987a() != null) {
                C1240a.m5987a().mo4570b(configuration.locale.getCountry());
            }
            if (!configuration.locale.equals(this.mConfig.locale)) {
                C1974m.m9065a((Context) this);
                refreshAttachedPkgs();
                if (C1368X.m6324d()) {
                    C1368X.m6320c().mo5841n().mo6277h();
                }
            }
            if (Engine.isInitialized()) {
                Engine.getInstance().onConfigurationChanged(this.mConfig.orientation, configuration.orientation);
            }
            if (configuration.orientation != 2 || !isInputViewShown()) {
                this.isOrientationChangedAndInputShown = false;
                this.forceExitFullscreenMode = false;
            } else {
                this.isOrientationChangedAndInputShown = true;
            }
            this.mConfig = new Configuration(configuration);
            super.onConfigurationChanged(configuration);
        }
    }

    public void setInputView(View view) {
        if (!(view == null || view.getParent() == null)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        super.setInputView(view);
    }

    public boolean onEvaluateFullscreenMode() {
        boolean z = true;
        if (C1368X.m6324d() && C1368X.m6320c().mo5821G().mo7183c() && Engine.isInitialized()) {
            sendUpdateSelectionAuto();
        }
        boolean z2 = this.mScreenDiagonalLength >= 7.0d;
        Configuration configuration = getResources().getConfiguration();
        if (!Settings.isInitialized()) {
            z = false;
        } else if (!(configuration.orientation == 2 && Settings.getInstance().getIntSetting(Settings.LANDSCAPE_SCREEN_MODE) == 1)) {
            z = false;
        }
        if (this.forceExitFullscreenMode || z || z2) {
            return false;
        }
        try {
            return super.onEvaluateFullscreenMode();
        } catch (Exception e) {
            return false;
        }
    }

    public void updateFullscreenMode() {
        try {
            super.updateFullscreenMode();
        } catch (Exception e) {
        }
        checkCandidatesShown();
        if (Engine.isInitialized() && Engine.getInstance().getSurfaceManager() != null) {
            Engine.getInstance().getSurfaceManager().checkInputMethodWindowBg();
        }
    }

    private void checkCandidatesShown() {
        View view;
        if (this.lastView != null && (view = (View) this.lastView.getParent()) != null && view.getParent() != null && isCandidatesViewShown() && !((ViewGroup) view.getParent()).isShown()) {
            ((ViewGroup) view.getParent()).setVisibility(0);
            ((ViewGroup) view.getParent()).requestLayout();
        }
    }

    public void onComputeInsets(InputMethodService.Insets insets) {
        super.onComputeInsets(insets);
        if (!isFullscreenMode()) {
            insets.contentTopInsets = insets.visibleTopInsets;
        }
    }

    public void sendKeyChar(char c) {
        super.sendKeyChar(c);
        if (Engine.isInitialized()) {
            Engine.getInstance().getEditor().changeSelect(false);
        }
    }

    public void commitText(CharSequence charSequence) {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection != null) {
            autoDelete(currentInputConnection);
            showReselectHighLight(currentInputConnection, charSequence);
            showCommitHighLight(currentInputConnection, charSequence);
            this.mComposingCursor = -1;
            this.mComposingBefore = 0;
            this.mComposingAfter = 0;
            currentInputConnection.commitText(charSequence, 1);
            if (Engine.isInitialized()) {
                Engine.getInstance().getEditor().changeSelect(false);
                Engine.getInstance().getEditor().setEdit(false);
                Engine.getInstance().updateInputData(false);
            }
        }
    }

    public void beginBatchEdit() {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection != null) {
            currentInputConnection.beginBatchEdit();
        }
    }

    public void endBatchEdit() {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection != null) {
            currentInputConnection.endBatchEdit();
        }
    }

    public void onTextUpdated(CharSequence charSequence, ExplicitInfo explicitInfo) {
        onInlineUpdated(charSequence, explicitInfo, 0, 0, false);
    }

    public void onInlineUpdated(CharSequence charSequence, ExplicitInfo explicitInfo, int i, int i2, boolean z) {
        this.mInlineEraseBefore = i;
        this.mInlineEraseAfter = i2;
        if (!z || charSequence.length() != 0) {
            InputConnection currentInputConnection = getCurrentInputConnection();
            if (i == 0 && i2 == 0) {
                CharSequence generateInline = ExplicitManager.generateInline(charSequence, explicitInfo);
                if (currentInputConnection != null) {
                    if (!TextUtils.isEmpty(generateInline)) {
                        autoDelete(currentInputConnection);
                        showReselectHighLight(currentInputConnection, charSequence);
                        this.mComposingCursor = -1;
                        this.mComposingBefore = 0;
                        this.mComposingAfter = 0;
                    }
                    mComposingNum = generateInline.length();
                    currentInputConnection.setComposingText(generateInline, 1);
                    if (Engine.isInitialized()) {
                        Engine.getInstance().getEditor().changeSelect(false);
                        Engine.getInstance().getEditor().setEdit(false);
                    }
                }
            } else {
                Engine.getInstance().updateInputOp(C1712h.f5598t);
                this.mHandler.removeMessages(0);
                this.mHandler.sendEmptyMessageDelayed(0, 30);
            }
            this.mInlineText = charSequence.toString();
        }
    }

    private void autoDelete(InputConnection inputConnection) {
        if (this.mMethodSetComposingRegion != null && !this.mUseLowerMethodToReselect) {
            return;
        }
        if (!(this.mComposingBefore == 0 && this.mComposingAfter == 0) && this.mComposingCursor == getCursorPosition(inputConnection)) {
            inputConnection.deleteSurroundingText(this.mComposingBefore, this.mComposingAfter);
        }
    }

    private void showReselectHighLight(InputConnection inputConnection, CharSequence charSequence) {
        if (!this.mMethodsInitialized) {
            initializeMethodsForReflection();
        }
        if (this.mMethodCommitCorrection != null && this.correctionInfoCons != null && this.mComposingCursor != -1 && this.mComposingCursor == getCursorPosition(inputConnection, true)) {
            try {
                Object newInstance = this.correctionInfoCons.newInstance(new Object[]{Integer.valueOf(this.mComposingCursor - this.mComposingBefore), this.mInlineText, charSequence});
                this.mMethodCommitCorrection.invoke(inputConnection, new Object[]{newInstance});
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
            }
        }
    }

    private void showCommitHighLight(InputConnection inputConnection, CharSequence charSequence) {
        if (!this.mMethodsInitialized) {
            initializeMethodsForReflection();
        }
        if (this.mMethodCommitCorrection != null && this.correctionInfoCons != null && inputConnection != null && !TextUtils.isEmpty(charSequence) && this.mComposingBefore == 0 && this.mComposingAfter == 0 && Engine.isInitialized() && commitFullWord() && !this.mInlineText.toString().equals(charSequence.toString().trim())) {
            try {
                int cursorPosition = getCursorPosition(inputConnection, true);
                Object newInstance = this.correctionInfoCons.newInstance(new Object[]{Integer.valueOf(cursorPosition - mComposingNum), this.mInlineText, charSequence});
                this.mMethodCommitCorrection.invoke(inputConnection, new Object[]{newInstance});
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
            }
        }
    }

    private boolean commitFullWord() {
        boolean z = false;
        if (Engine.isInitialized()) {
            int commitCount = Engine.getInstance().getCommitCount();
            for (int i = 0; i < commitCount; i++) {
                if (Engine.getInstance().getCommitType(i) == 1 && CommitManager.isFullWord(Engine.getInstance().getCommitInternalSource(i))) {
                    z = true;
                }
            }
        }
        return z;
    }

    public void finishComposing() {
        InputConnection currentInputConnection = getCurrentInputConnection();
        this.mComposingCursor = -1;
        this.mComposingBefore = 0;
        this.mComposingAfter = 0;
        mComposingNum = 0;
        this.mInlineText = "";
        if (currentInputConnection != null) {
            currentInputConnection.finishComposingText();
        }
    }

    private void initializeMethodsForReflection() {
        Class<InputConnection> cls = InputConnection.class;
        try {
            this.mMethodSetComposingRegion = cls.getMethod("setComposingRegion", new Class[]{Integer.TYPE, Integer.TYPE});
        } catch (NoSuchMethodException e) {
            this.mMethodSetComposingRegion = null;
        }
        try {
            Class<?> cls2 = Class.forName("android.view.inputmethod.CorrectionInfo");
            this.mMethodCommitCorrection = InputConnection.class.getMethod("commitCorrection", new Class[]{cls2});
            this.correctionInfoCons = cls2.getConstructor(new Class[]{Integer.TYPE, CharSequence.class, CharSequence.class});
        } catch (ClassNotFoundException e2) {
            this.correctionInfoCons = null;
        } catch (NoSuchMethodException e3) {
            this.mMethodCommitCorrection = null;
        }
        this.mMethodsInitialized = true;
    }

    private boolean useLowerMethodToReselect() {
        EditorInfo editorInfo = null;
        if (Engine.isInitialized()) {
            editorInfo = Engine.getInstance().getEditor().getEditorInfo();
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 16 || editorInfo == null || !"com.htc.android.mail".equalsIgnoreCase(editorInfo.packageName)) {
            return false;
        }
        return true;
    }

    private static int getCursorPosition(InputConnection inputConnection) {
        return getCursorPosition(inputConnection, false);
    }

    private static int getCursorPosition(InputConnection inputConnection, boolean z) {
        ExtractedText extractedText = ExtractTextProvider.getIns().getExtractedText(inputConnection, 0, 0, z);
        if (extractedText == null) {
            return -1;
        }
        return extractedText.selectionStart + extractedText.startOffset;
    }

    private void underlineWord(InputConnection inputConnection, int i, int i2) {
        int cursorPosition = getCursorPosition(inputConnection);
        setComposingRegion(inputConnection, cursorPosition - i, cursorPosition + i2);
        this.mComposingCursor = cursorPosition;
        this.mComposingBefore = i;
        this.mComposingAfter = i2;
        C1372a q = C1368X.m6320c().mo5844q();
        if (this.mComposingCursor != -1 && q.mo5864c()) {
            q.mo5861a(this.mInlineText);
        }
    }

    /* access modifiers changed from: private */
    public void doUnderlineWord() {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection == null) {
            return;
        }
        if (this.mInlineEraseBefore != 0 || this.mInlineEraseAfter != 0) {
            underlineWord(currentInputConnection, this.mInlineEraseBefore, this.mInlineEraseAfter);
        }
    }

    private void setComposingRegion(InputConnection inputConnection, int i, int i2) {
        if (!this.mMethodsInitialized) {
            initializeMethodsForReflection();
        }
        if (this.mMethodSetComposingRegion != null && !this.mUseLowerMethodToReselect) {
            try {
                this.mMethodSetComposingRegion.invoke(inputConnection, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            }
        }
    }

    public void onUpdateExtractedText(int i, ExtractedText extractedText) {
        if (!Engine.isInitialized() || !Engine.getInstance().getEditor().inEdit() || getCurrentInputConnection() == null) {
            super.onUpdateExtractedText(i, extractedText);
            return;
        }
        super.onUpdateExtractedText(i, ExtractTextProvider.getIns().getExtractedText(getCurrentInputConnection(), 0, 0));
    }

    public void onExtractedTextClicked() {
    }

    private void onPostExecuteRestarting() {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection != null && !TextUtils.isEmpty(this.mInlineText)) {
            int cursorPosition = getCursorPosition(currentInputConnection);
            setComposingRegion(currentInputConnection, cursorPosition - this.mInlineText.length(), cursorPosition);
        }
    }

    public void updateIcon() {
        boolean z = true;
        int i = 0;
        if (Engine.isInitialized() && Engine.getInstance().isHardKeyMode()) {
            if (this.mHardKeyProcessor.mo8911d()) {
                i = R.drawable.tray_alt_lock;
            } else if (this.mHardKeyProcessor.mo8910c()) {
                i = R.drawable.tray_alt_on;
            } else if (this.mHardKeyProcessor.mo8907b()) {
                i = R.drawable.tray_shift_lock;
            } else if (this.mHardKeyProcessor.mo8904a()) {
                i = R.drawable.tray_shift_on;
            } else {
                String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
                if (!C1549b.f4791a.equals(currentLanguageId) || Settings.getInstance().getBoolSetting(1)) {
                    z = false;
                }
                if (currentLanguageId != null && !z) {
                    C1389aD o = C1368X.m6320c().mo5842o();
                    i = o.mo5971u(o.mo5954l(currentLanguageId).f4727f);
                }
            }
        }
        if (i > 0) {
            this.mImm.showStatusIcon(this.mToken, getPackageName(), i);
            return;
        }
        try {
            hideStatusIcon();
        } catch (RuntimeException e) {
        }
    }

    public AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() {
        return new C1043b();
    }

    /* renamed from: com.cootek.smartinput5.TouchPalIME$b */
    class C1043b extends InputMethodService.InputMethodImpl {
        C1043b() {
            super(TouchPalIME.this);
        }

        public void attachToken(IBinder iBinder) {
            super.attachToken(iBinder);
            IBinder unused = TouchPalIME.this.mToken = iBinder;
        }

        public void setSessionEnabled(InputMethodSession inputMethodSession, boolean z) {
            if (inputMethodSession != null) {
                super.setSessionEnabled(inputMethodSession, z);
            }
        }
    }

    public C2674aN getHardKeyProcessor() {
        return this.mHardKeyProcessor;
    }

    public void setCandidatesViewShown(boolean z) {
        this.mIsCandidatesViewShown = z;
        super.setCandidatesViewShown(z);
    }

    public void setCandidatesView(View view) {
        if (view != this.lastView || this.mForceRefreshCandidatesView) {
            this.mForceRefreshCandidatesView = false;
            this.lastView = view;
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            super.setCandidatesView(view);
        }
    }

    public void setForceRefreshCandidates(boolean z) {
        this.mForceRefreshCandidatesView = z;
    }

    public boolean isCandidatesViewShown() {
        return this.mIsCandidatesViewShown;
    }

    public void onAppPrivateCommand(String str, Bundle bundle) {
        if (str != null && str.equals(EmotionKeyDialog.f13430a)) {
            Engine.getInstance().setNeedChangeSymbol(bundle.getBoolean(EmotionKeyDialog.f13431b));
        }
    }

    /* access modifiers changed from: private */
    public boolean initialize() {
        if (mInstanceInitialized) {
            return false;
        }
        C1368X.m6317b((Context) this);
        Engine.initialize(this);
        this.mHardKeyProcessor = new C2674aN(Engine.getInstance(), this);
        this.mConfig = new Configuration(getResources().getConfiguration());
        this.mImm = (InputMethodManager) getSystemService("input_method");
        checkImportedData();
        addAdditionalSubtype();
        if (this.mCrashTypeInfo != null) {
            doCrashStateDataCollect(this.mCrashTypeInfo);
            this.mCrashTypeInfo = null;
        }
        if (!this.mConfig.locale.equals(this.mCreateLocale)) {
            refreshAttachedPkgs();
            this.mCreateLocale = this.mConfig.locale;
        }
        C0992a.m5153a();
        mInstanceInitialized = true;
        return true;
    }

    private void checkImportedData() {
        if (Settings.getInstance().getBoolSetting(Settings.NEED_CHECK_IMPORTED_DATA)) {
            Settings.getInstance().setBoolSetting(Settings.NEED_CHECK_IMPORTED_DATA, false);
            Settings.getInstance().writeBack();
            C1579bD.m7096a((Integer) 1);
            C1368X.m6320c().mo5826L().mo6212b();
        }
    }

    private void addAdditionalSubtype() {
        if (this.mImm != null && Build.VERSION.SDK_INT >= 16) {
            List<InputMethodInfo> list = null;
            try {
                list = this.mImm.getInputMethodList();
            } catch (Exception e) {
            }
            String str = null;
            if (list != null) {
                Iterator<InputMethodInfo> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InputMethodInfo next = it.next();
                    if (getPackageName().equals(next.getPackageName())) {
                        str = next.getId();
                        break;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    Class cls = Class.forName("android.view.inputmethod.InputMethodSubtype");
                    Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE}).newInstance(new Object[]{Integer.valueOf(R.string.brand_name), Integer.valueOf(R.drawable.icon), "", C1411aV.f4486m, "", false, true});
                    Object obj = (Object[]) Array.newInstance(cls, 1);
                    Array.set(obj, 0, newInstance);
                    InputMethodManager.class.getMethod("setAdditionalInputMethodSubtypes", new Class[]{String.class, obj.getClass()}).invoke(this.mImm, new Object[]{str, obj});
                    InputMethodManager.class.getMethod("setInputMethodAndSubtype", new Class[]{IBinder.class, String.class, cls}).invoke(this.mImm, new Object[]{this.mToken, str, newInstance});
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private boolean destroy() {
        if (Settings.isInitialized()) {
            Settings.getInstance().setBoolSetting(Settings.BIND_GOOGLE_SERVICE_FAILED, false);
        }
        if (mInstanceInitialized) {
            Engine.destroy();
            C1368X.m6325e();
            this.mHardKeyProcessor = null;
            this.mConfig = null;
            this.mImm = null;
            mInstanceInitialized = false;
            return true;
        } else if (C1368X.m6324d()) {
            C1368X.m6325e();
            return true;
        } else {
            System.exit(0);
            return true;
        }
    }

    public void registerTouchPalIMEListener(C1042a aVar) {
        this.observers.add(aVar);
    }

    public void unregisterTouchPalIMEListener(C1042a aVar) {
        this.observers.remove(aVar);
    }

    public void removeAllListeners() {
        this.observers.clear();
    }

    public void showSoftInputWindow() {
        if (this.mImm != null && this.mToken != null) {
            this.mImm.showSoftInputFromInputMethod(this.mToken, 0);
        }
    }

    private void handleCrashCheckerOnKeyboardHidden() {
        C1466av.m6853c(this, C1466av.f4711t);
    }

    private void handleCrashCheckerOnKeyboardShown() {
        String str;
        if (C1466av.m6854d(this, C1466av.f4713v)) {
            C1466av.m6853c(this, C1466av.f4713v);
            if (Settings.isInitialized() && Settings.getInstance().getBoolSetting(63)) {
                Settings.getInstance().setBoolSetting(Settings.USER_DICT_REPORT_ENABLE, true, false);
                C1579bD.m7100c(C1579bD.f4986h);
            }
        }
        if (!C1466av.m6854d(this, C1466av.f4711t)) {
            C1466av.m6852b(this, C1466av.f4711t);
            return;
        }
        if (C1466av.m6854d(this, C1466av.f4712u)) {
            C1466av.m6853c(this, C1466av.f4712u);
            str = C1246d.f3802bS;
            C1060e.m5598b().mo4272a("JAVA_CRASH");
            C1056a.m5588a().mo4264a(C1056a.f2960U, this);
        } else {
            str = C1246d.f3803bT;
            if (Settings.isInitialized() && Settings.getInstance().getBoolSetting(63)) {
                Settings.getInstance().setBoolSetting(Settings.USER_DICT_REPORT_ENABLE, true, false);
                C1579bD.m7100c(C1579bD.f4985g);
            }
            C1060e.m5598b().mo4272a(C1060e.f3017h);
            C1056a.m5588a().mo4264a(C1056a.f2961V, this);
        }
        doCrashStateDataCollect(str);
    }

    private void checkCrashState() {
        if (C1466av.m6854d(this, C1466av.f4709r)) {
            if (C1466av.m6854d(this, C1466av.f4710s)) {
                C1466av.m6853c(this, C1466av.f4710s);
                generateCrashLog();
                this.mCrashTypeInfo = "JAVA_CRASH";
            } else if (C1466av.m6854d(this, C1466av.f4703l)) {
                C1579bD.m7096a((Integer) 0);
                this.mCrashTypeInfo = C1246d.f3800bQ;
            }
        }
    }

    private void doCrashStateDataCollect(String str) {
        if (str != null) {
            C1246d.m6010a((Context) this).mo4591a(C1246d.f3798bO + str, C1246d.f3707D, C1246d.f3836c);
        }
    }

    /* access modifiers changed from: private */
    public boolean checkEngineState() {
        boolean isBusy = Engine.isBusy();
        if (isBusy) {
            Toast.makeText(this, C1974m.m9063a((Context) this, (int) R.string.usr_dict_busy), 1).show();
            requestHideSelf(0);
        }
        return isBusy;
    }

    private void checkRebuildState() {
        File a = C1466av.m6848a(this);
        File a2 = C1466av.m6849a((Context) this, C1466av.f4698g);
        if (a2 != null && a2.exists()) {
            File[] listFiles = a2.listFiles();
            if (listFiles != null) {
                if (C1368X.m6324d()) {
                    C1368X.m6320c().mo5835h().release();
                }
                for (File file : listFiles) {
                    C0997e.m5173a(file, new File(a, file.getName()));
                    file.delete();
                }
                if (C1368X.m6324d()) {
                    C1368X.m6320c().mo5835h().init();
                }
            }
            C0997e.m5172a(a2);
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5824J().mo6010c();
        }
    }
}
