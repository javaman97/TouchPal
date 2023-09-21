package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.engine.MoveContrail;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1599be;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p049e.C1252b;
import com.cootek.smartinput5.p050f.C1319a;
import com.cootek.smartinput5.p050f.C1334o;
import com.cootek.smartinput5.p066ui.C2694ag;
import com.cootek.smartinput5.p066ui.control.C2833K;
import com.cootek.smartinput5.p066ui.control.C2845U;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.teaching.p065a.C2564f;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: com.cootek.smartinput5.ui.cb */
/* compiled from: SoftKey */
public class C2806cb implements C2694ag.C2695a {
    public static final int BACKGROUND_CLEAN = 3;
    public static final int BACKGROUND_FUN = 1;
    public static final int BACKGROUND_FUN_HIGHLIGHT = 2;
    public static final int BACKGROUND_NORMAL = 0;
    protected static final int BIN_TYPE_DICT = 0;
    protected static final int BIN_TYPE_UNDEFINE = -1;
    private static final int COUNT = 3;
    static final long CURVE_TIMEOUT = 300;
    private static final long DOUBLE_CLICK_TIME_OUT = 500;
    private static final int DOUBLE_CLICK_TIME_OUT_SHIFT = 300;
    static final int FOREICON_SCALE_TYPE_CENTER = 0;
    static final int FOREICON_SCALE_TYPE_FIT_CENTER = 1;
    protected static final int LONGPRESS_MULTI_THRESHOLD = 500;
    private static final int MAX_DIS = 1073741823;
    public static final String NORMAL_KEY_MATCH = "(sk|sk_sub)_[0-9]+_[0-9]+";
    public static final int NOT_AN_ID_KEY = -1;
    static final boolean NOT_NEW_FUNCTION = false;
    static final int NO_DISPLAY_LIMIT = -1;
    private static final int POPUP_PREVIEW_CONTENT_WRAPCONTENT = -1;
    private static final int QUADRANT_1 = 0;
    private static final int QUADRANT_2 = 1;
    private static final int QUADRANT_3 = 2;
    private static final int QUADRANT_4 = 3;
    protected static final int[] STATE_BIN_OFF_CURRENT = {R.attr.state_bin_off};
    protected static final int[] STATE_BIN_OFF_DEFAULT = {R.attr.state_bin_off};
    protected static final int[] STATE_BIN_ON_CURRENT = {R.attr.state_bin_on};
    protected static final int[] STATE_BIN_ON_DEFAULT = {R.attr.state_bin_on};
    protected static final int[] STATE_FOCUSED = {16842908};
    protected static final int[] STATE_PRESSED = {16842919};
    protected static final int[] STATE_TRI_FORTH_CURRENT = {R.attr.state_tri_forth};
    protected static final int[] STATE_TRI_FORTH_DEFAULT = {R.attr.state_tri_forth};
    protected static final int[] STATE_TRI_LOCK_CURRENT = {R.attr.state_tri_lock};
    protected static final int[] STATE_TRI_LOCK_DEFAULT = {R.attr.state_tri_lock};
    protected static final int[] STATE_TRI_NONE_CURRENT = {R.attr.state_tri_none};
    protected static final int[] STATE_TRI_NONE_DEFAULT = {R.attr.state_tri_none};
    protected static final int[] STATE_TRI_TOGGLE_CURRENT = {R.attr.state_tri_toggled};
    protected static final int[] STATE_TRI_TOGGLE_DEFAULT = {R.attr.state_tri_toggled};
    private static final String TAG = "SoftKey";
    public static final int TRACE_TYPE_CURVE = 16;
    private static final int TRI_FROM_OKINAWA = 2;
    private static final int TRI_STATUS_LOCKED = 3;
    private static final int TRI_STATUS_NORMAL = 1;
    private static final int TRI_STATUS_TOGGLED = 2;
    private static final int TRI_TYPE_HINDISHIFT = 2;
    private static final int TRI_TYPE_LOCK = 4;
    private static final int TRI_TYPE_OPT_CURVE = 3;
    private static final int TRI_TYPE_SEPERATOR = 1;
    private static final int TRI_TYPE_SHIFT = 0;
    protected static final int TRI_TYPE_UNDEFINE = -1;
    static final int USE_DEFAULT = -1;
    public static final String WORD_SPLIT_SEPARATOR = " ";
    private static final int[][] action = {new int[]{7, 11, 5}, new int[]{6, 10, 5}, new int[]{6, 8, 4}, new int[]{7, 9, 4}};
    private static final int[] denominator = {1, 2, 1};
    static C2806cb lastInputKey;
    private static final int[][] param = {new int[]{0, 1}, new int[]{1, -1}, new int[]{1, 0}};
    static final Hashtable<String, Integer> sBackgroundMap = new Hashtable<>();
    private static final Hashtable<String, Integer> sBinTypeMap = new Hashtable<>();
    static final Hashtable<String, Integer> sForeIconMap = new Hashtable<>();
    private static final Hashtable<String, Integer> sTriTypeMap = new Hashtable<>();
    private final int HEIGHT_THRESHOLD;
    private final Pattern PATTERN_NORMAL_KEY;
    private final int WIDTH_THRESHOLD;
    boolean allowMultiLine;
    boolean altTextInCorner;
    Point altTextPos;
    int altTextSize;
    Paint.Align altTextXAlign;
    Paint.Align altTextYAlign;
    public boolean altTitlePreviewOnly;
    Drawable background;
    int backgroundType;
    int[] dis;
    int[] disSupport;
    private int downX;
    private int downY;
    public int edgeFlags;
    int foreIconType;
    int gap;
    public boolean hasLongPressIcon;
    public int height;
    Drawable icon;
    Drawable iconPreview;
    Drawable iconPreviewRight;
    public boolean iconWithMainTitle;
    int intTag;
    boolean isMultiLineMode;
    public String keyName;
    Point leftTextPos;
    ArrayList<Integer> lineInfo;
    Drawable longPressIcon;
    C2807a mActionListener;
    protected int mBinType;
    private boolean mCachable;
    int mCombineFlag;
    private boolean mComputedRightNow;
    private int mCurveKeyId;
    private MoveContrail mCurvePoints;
    String mFunctionSettingId;
    private boolean mIgnoreCurve;
    private boolean mIgnoreSlip;
    private boolean mIgnoreStroke;
    private boolean mInThreshold;
    C2811cf mKeyboard;
    private long mLastClickTime;
    private int mLastPointX;
    private int mLastPointY;
    private int mLastPreviewOperation;
    private boolean mListening;
    private boolean mLongPressPendingState;
    private int mLongPressType;
    private boolean mLongPressed;
    private int mLongpressThreshold;
    int mMaxDisplay;
    MoveContrail mMoveContrail;
    int mMovePointCount;
    private boolean mPressed;
    private HashMap<Drawable, C2725bE> mRendingMap;
    private int mSlideThresholdSquare;
    C2809cd mSoftKeyDrawInfo;
    SoftKeyInfo mSoftKeyInfo;
    private boolean mStartWaveFromGesture;
    private boolean mSupportCustomSkin;
    protected boolean mSupportPreviewPopup;
    private boolean mTraceCurveInTime;
    private boolean mTraceLongPress;
    private boolean mTraceSlide;
    protected int mTriType;
    int mainOnlyAdjustedTextSize;
    int mainOnlyTextSize;
    Point mainTextPos;
    int mainTextSize;
    Paint.Align mainTextXAlign;
    Paint.Align mainTextYAlign;
    public String mainTitleRef;
    Point rightTextPos;
    boolean splitWord;
    public int width;

    /* renamed from: x */
    public int f12453x;

    /* renamed from: y */
    public int f12454y;

    /* renamed from: com.cootek.smartinput5.ui.cb$a */
    /* compiled from: SoftKey */
    protected interface C2807a {
        /* renamed from: a */
        void mo8670a(int i);
    }

    static {
        sBackgroundMap.put(Settings.INPUT_TYPE_NORMAL, 0);
        sBackgroundMap.put("fun", 1);
        sBackgroundMap.put("fun_highlight", 2);
        sForeIconMap.put("center", 0);
        sForeIconMap.put("fitCenter", 1);
        sTriTypeMap.put("shift", 0);
        sTriTypeMap.put("separator", 1);
        sTriTypeMap.put("hindishift", 2);
        sTriTypeMap.put("opt_curve", 3);
        sTriTypeMap.put("lock", 4);
        sBinTypeMap.put("dict", 0);
    }

    public static void updateAttrId(boolean z) {
        if (z) {
            STATE_TRI_NONE_CURRENT[0] = R.attr.state_tri_none;
            STATE_TRI_TOGGLE_CURRENT[0] = R.attr.state_tri_toggled;
            STATE_TRI_LOCK_CURRENT[0] = R.attr.state_tri_lock;
            STATE_TRI_FORTH_CURRENT[0] = R.attr.state_tri_forth;
            STATE_BIN_ON_CURRENT[0] = R.attr.state_bin_on;
            STATE_BIN_OFF_CURRENT[0] = R.attr.state_bin_off;
            return;
        }
        STATE_TRI_NONE_CURRENT[0] = C1368X.m6320c().mo5841n().mo6276h((int) R.attr.state_tri_none);
        STATE_TRI_TOGGLE_CURRENT[0] = C1368X.m6320c().mo5841n().mo6276h((int) R.attr.state_tri_toggled);
        STATE_TRI_LOCK_CURRENT[0] = C1368X.m6320c().mo5841n().mo6276h((int) R.attr.state_tri_lock);
        STATE_TRI_FORTH_CURRENT[0] = C1368X.m6320c().mo5841n().mo6276h((int) R.attr.state_tri_forth);
        STATE_BIN_ON_CURRENT[0] = C1368X.m6320c().mo5841n().mo6276h((int) R.attr.state_bin_on);
        STATE_BIN_OFF_CURRENT[0] = C1368X.m6320c().mo5841n().mo6276h((int) R.attr.state_bin_off);
    }

    public C2806cb(C2811cf cfVar) {
        this.PATTERN_NORMAL_KEY = Pattern.compile(NORMAL_KEY_MATCH);
        this.mainOnlyAdjustedTextSize = -1;
        this.mTraceSlide = false;
        this.mLongPressed = false;
        this.mTraceLongPress = false;
        this.mSupportPreviewPopup = true;
        this.mSupportCustomSkin = true;
        this.mLastPreviewOperation = -1;
        this.mLongPressPendingState = false;
        this.mMovePointCount = 0;
        this.dis = new int[3];
        this.disSupport = new int[3];
        this.mTraceCurveInTime = false;
        float f = C1368X.m6313b().getResources().getDisplayMetrics().density;
        this.WIDTH_THRESHOLD = (int) (12.0f * f);
        this.HEIGHT_THRESHOLD = (int) (f * 18.0f);
        this.mKeyboard = cfVar;
        this.backgroundType = 0;
        this.mMaxDisplay = -1;
        this.mainOnlyTextSize = -1;
        this.mainTextSize = -1;
        this.altTextSize = -1;
        this.mSlideThresholdSquare = cfVar.f12529B;
        this.altTextInCorner = cfVar.f12583s;
        this.mTriType = -1;
        this.mBinType = -1;
        this.mMoveContrail = new MoveContrail();
        this.mCurvePoints = new MoveContrail();
        this.mMoveContrail.setCanvasSize(this.mKeyboard.f12535H, this.mKeyboard.f12532E);
        this.mCurvePoints.setCanvasSize(this.mKeyboard.f12535H, this.mKeyboard.f12533F);
        this.mSoftKeyInfo = new SoftKeyInfo();
    }

    private void copyFromParent(C2806cb cbVar) {
        if (cbVar != null) {
            this.mainOnlyTextSize = cbVar.mainOnlyTextSize;
            this.mainTextSize = cbVar.mainTextSize;
            this.altTextSize = cbVar.altTextSize;
            this.width = cbVar.width;
            this.height = cbVar.height;
            this.gap = cbVar.gap;
            this.mSlideThresholdSquare = cbVar.mSlideThresholdSquare;
            this.altTextInCorner = cbVar.altTextInCorner;
            this.mainTextXAlign = cbVar.mainTextXAlign;
            this.mainTextYAlign = cbVar.mainTextYAlign;
            this.altTextXAlign = cbVar.altTextXAlign;
            this.altTextYAlign = cbVar.altTextYAlign;
            this.mainTextPos = cbVar.mainTextPos;
            this.altTextPos = cbVar.altTextPos;
            this.leftTextPos = cbVar.leftTextPos;
            this.rightTextPos = cbVar.rightTextPos;
            this.backgroundType = cbVar.backgroundType;
            this.mTriType = cbVar.mTriType;
            this.mBinType = cbVar.mBinType;
            this.foreIconType = cbVar.foreIconType;
            this.mCombineFlag = cbVar.mCombineFlag;
            this.mIgnoreCurve = cbVar.mIgnoreCurve;
            this.mIgnoreSlip = cbVar.mIgnoreSlip;
            this.allowMultiLine = cbVar.allowMultiLine;
            this.splitWord = cbVar.splitWord;
            this.altTitlePreviewOnly = cbVar.altTitlePreviewOnly;
            this.iconWithMainTitle = cbVar.iconWithMainTitle;
            this.hasLongPressIcon = cbVar.hasLongPressIcon;
            this.longPressIcon = cbVar.longPressIcon;
            this.mMaxDisplay = cbVar.mMaxDisplay;
            this.intTag = cbVar.intTag;
            this.mSupportPreviewPopup = cbVar.mSupportPreviewPopup;
            this.edgeFlags = cbVar.edgeFlags;
        }
    }

    public String toString() {
        return "SoftKey [width=" + this.width + ", height=" + this.height + ", x=" + this.f12453x + ", y=" + this.f12454y + ", mainTextPos=" + this.mainTextPos + ", altTextPos=" + this.altTextPos + ", altTextXAlign=" + this.altTextXAlign + ", altTextYAlign=" + this.altTextYAlign + ", keyName=" + this.keyName + "]";
    }

    public C2806cb(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        this(resources, cqVar.f13104f, cqVar, i, i2, bVar);
    }

    public C2806cb(Resources resources, C2811cf cfVar, C2884cq cqVar, int i, int i2, C2944b bVar) {
        C2806cb cbVar;
        boolean z;
        C2726bF bFVar;
        C2726bF bFVar2 = null;
        this.PATTERN_NORMAL_KEY = Pattern.compile(NORMAL_KEY_MATCH);
        this.mainOnlyAdjustedTextSize = -1;
        this.mTraceSlide = false;
        this.mLongPressed = false;
        this.mTraceLongPress = false;
        this.mSupportPreviewPopup = true;
        this.mSupportCustomSkin = true;
        this.mLastPreviewOperation = -1;
        this.mLongPressPendingState = false;
        this.mMovePointCount = 0;
        this.dis = new int[3];
        this.disSupport = new int[3];
        this.mTraceCurveInTime = false;
        this.mKeyboard = cfVar;
        if (cqVar != null && cqVar.f13105g != null) {
            cbVar = cqVar.f13105g;
        } else if (cfVar == null || cfVar.f12544Q == null) {
            cbVar = null;
        } else {
            cbVar = cfVar.f12544Q;
        }
        copyFromParent(cbVar);
        if (cbVar != null) {
            z = true;
        } else {
            z = false;
        }
        C2786cJ cJVar = new C2786cJ(z);
        this.f12453x = i;
        this.f12454y = i2;
        float f = C1368X.m6313b().getResources().getDisplayMetrics().density;
        this.WIDTH_THRESHOLD = (int) (12.0f * f);
        this.HEIGHT_THRESHOLD = (int) (f * 18.0f);
        try {
            String packageName = this.mKeyboard.f12571ac.getPackageName();
            this.mainOnlyTextSize = cJVar.mo9112b(resources, packageName, bVar.mainOnlyTextSize, -1, this.mainOnlyTextSize);
            this.mainTextSize = cJVar.mo9112b(resources, packageName, bVar.mainTextSize, -1, this.mainTextSize);
            this.altTextSize = cJVar.mo9112b(resources, packageName, bVar.altTextSize, -1, this.altTextSize);
            this.width = cJVar.mo9107a(resources, packageName, bVar.keyWidth, this.mKeyboard.f12535H, this.mKeyboard.f12589y, this.width);
            this.height = cJVar.mo9107a(resources, packageName, bVar.keyHeight, this.mKeyboard.f12532E, this.mKeyboard.f12588x, this.height);
            this.gap = cJVar.mo9107a(resources, packageName, bVar.horizontalGap, this.mKeyboard.f12535H, this.mKeyboard.f12590z, this.gap);
            this.mSlideThresholdSquare = this.mKeyboard.f12529B;
            this.altTextInCorner = cJVar.mo9111a(resources, packageName, bVar.altTextInCorner, this.mKeyboard.f12583s, this.altTextInCorner);
            this.f12453x += this.gap;
            this.f12453x = cJVar.mo9107a(resources, packageName, bVar.keyX, this.mKeyboard.f12535H, this.f12453x, this.f12453x);
            int a = C1599be.m7199a(resources, packageName, bVar.keyR, this.mKeyboard.f12535H, -1);
            this.width = a > 0 ? a - this.f12453x : this.width;
            this.f12454y = cJVar.mo9107a(resources, packageName, bVar.keyY, this.mKeyboard.f12532E, this.f12454y, this.f12454y);
            this.mainTextXAlign = cJVar.mo9109a(bVar.mainTextXAlign, this.mainTextXAlign);
            this.mainTextYAlign = cJVar.mo9109a(bVar.mainTextYAlign, this.mainTextYAlign);
            this.altTextXAlign = cJVar.mo9109a(bVar.altTextXAlign, this.altTextXAlign);
            this.altTextYAlign = cJVar.mo9109a(bVar.altTextYAlign, this.altTextYAlign);
            String str = bVar.mainTextX;
            if (!TextUtils.isEmpty(str)) {
                this.mainTextPos = new Point(C1599be.m7199a(resources, packageName, str, this.width, 0), C1599be.m7199a(resources, packageName, bVar.mainTextY, this.height, 0));
            }
            String str2 = bVar.altTextX;
            if (!TextUtils.isEmpty(str2)) {
                this.altTextPos = new Point(C1599be.m7199a(resources, packageName, str2, this.width, 0), C1599be.m7199a(resources, packageName, bVar.altTextY, this.height, 0));
            }
            String str3 = bVar.leftTextX;
            if (!TextUtils.isEmpty(str3)) {
                this.leftTextPos = new Point(C1599be.m7199a(resources, packageName, str3, this.width, 0), C1599be.m7199a(resources, packageName, bVar.leftTextY, this.height, 0));
            }
            String str4 = bVar.rightTextX;
            if (!TextUtils.isEmpty(str4)) {
                this.rightTextPos = new Point(C1599be.m7199a(resources, packageName, str4, this.width, 0), C1599be.m7199a(resources, packageName, bVar.rightTextY, this.height, 0));
            }
            this.keyName = bVar.keyName;
            this.mainTitleRef = bVar.mainTitleRef;
            this.backgroundType = cJVar.mo9108a(resources, packageName, bVar.backgroundType, sBackgroundMap, 0, this.backgroundType);
            this.mTriType = cJVar.mo9108a(resources, packageName, bVar.triType, sTriTypeMap, -1, this.mTriType);
            this.mBinType = cJVar.mo9108a(resources, packageName, bVar.binType, sBinTypeMap, -1, this.mBinType);
            this.foreIconType = cJVar.mo9108a(resources, packageName, bVar.foregroundType, sForeIconMap, 0, this.foreIconType);
            this.mCombineFlag = cJVar.mo9108a(resources, packageName, bVar.combineFlag, C2811cf.f12527r, 0, this.mCombineFlag);
            this.mIgnoreCurve = cJVar.mo9111a(resources, packageName, bVar.ignoreCurve, false, this.mIgnoreCurve);
            this.mIgnoreStroke = cJVar.mo9111a(resources, packageName, bVar.ignoreStroke, false, this.mIgnoreStroke);
            this.mIgnoreSlip = cJVar.mo9111a(resources, packageName, bVar.ignoreSlip, false, this.mIgnoreSlip);
            this.mCachable = C1599be.m7214a(resources, packageName, bVar.caheable, true);
            this.allowMultiLine = cJVar.mo9111a(resources, packageName, bVar.allowMultiLine, false, this.allowMultiLine);
            this.splitWord = cJVar.mo9111a(resources, packageName, bVar.splitWord, false, this.splitWord);
            this.altTitlePreviewOnly = cJVar.mo9111a(resources, packageName, bVar.altTitlePreviewOnly, false, this.altTitlePreviewOnly);
            this.iconWithMainTitle = cJVar.mo9111a(resources, packageName, bVar.iconWithMainTitle, false, this.iconWithMainTitle);
            this.hasLongPressIcon = cJVar.mo9111a(resources, packageName, bVar.hasLongPressIcon, false, this.hasLongPressIcon);
            this.mMaxDisplay = cJVar.mo9106a(resources, packageName, bVar.maxDiaplay, -1, this.mMaxDisplay);
            this.intTag = cJVar.mo9106a(resources, packageName, bVar.intTag, 0, this.intTag);
            this.mSupportPreviewPopup = cJVar.mo9111a(resources, packageName, bVar.supportPreviewPopup, true, this.mSupportPreviewPopup);
            this.mSupportCustomSkin = cJVar.mo9111a(resources, packageName, bVar.supportCustomSkin, true, this.mSupportCustomSkin);
            this.mFunctionSettingId = bVar.functionSettingId;
            String str5 = bVar.keyIcon;
            if (str5 != null) {
                C2726bF bFVar3 = C2726bF.KEY_NORMAL_ICON;
                switch (this.backgroundType) {
                    case 1:
                        bFVar3 = C2726bF.KEY_FUN_ICON;
                        break;
                    case 2:
                        bFVar3 = C2726bF.KEY_FUN_HIGHLIGHT_ICON;
                        break;
                }
                bFVar3 = !this.mSupportCustomSkin ? null : bFVar3;
                this.icon = C1599be.m7205a(resources, packageName, str5, bFVar3, true);
                cacheRendingColor(this.icon, bFVar3);
                if (this.icon != null) {
                    this.icon.setBounds(0, 0, this.icon.getIntrinsicWidth(), this.icon.getIntrinsicHeight());
                }
            }
            String str6 = bVar.longPressIcon;
            if (str6 != null) {
                C2726bF bFVar4 = C2726bF.KEY_FUN_LONGPRESS_ICON;
                if (this.backgroundType == 0) {
                    bFVar = C2726bF.KEY_NORMAL_LONGPRESS_ICON;
                } else {
                    bFVar = C2726bF.KEY_FUN_LONGPRESS_ICON;
                }
                bFVar2 = this.mSupportCustomSkin ? bFVar : bFVar2;
                this.longPressIcon = C1599be.m7204a(resources, packageName, str6, bFVar2);
                cacheRendingColor(this.longPressIcon, bFVar2);
            }
            String str7 = bVar.iconPreview;
            if (str7 != null) {
                this.iconPreview = C1599be.m7204a(resources, packageName, str7, C2726bF.KEY_NORMAL_ICON);
                if (this.iconPreview != null) {
                    this.iconPreview.setBounds(0, 0, this.iconPreview.getIntrinsicWidth(), this.iconPreview.getIntrinsicHeight());
                }
            }
            String str8 = bVar.iconPreviewRight;
            if (str8 != null) {
                this.iconPreviewRight = C1599be.m7204a(resources, packageName, str8, C2726bF.KEY_NORMAL_ICON);
                if (this.iconPreviewRight != null) {
                    this.iconPreviewRight.setBounds(0, 0, this.iconPreviewRight.getIntrinsicWidth(), this.iconPreviewRight.getIntrinsicHeight());
                }
            }
            String str9 = bVar.background;
            if (str9 != null && this.background == null) {
                this.background = C1599be.m7220c(resources, packageName, str9);
            }
            this.edgeFlags = C1599be.m7200a(resources, packageName, bVar.keyEdgeFlags, C2811cf.f12521l, 0);
        } catch (Exception e) {
            C1017y.m5219b(TAG, "Parse error:" + e);
            e.printStackTrace();
        }
        this.mMoveContrail = new MoveContrail();
        this.mCurvePoints = new MoveContrail();
        this.mMoveContrail.setCanvasSize(this.mKeyboard.f12535H, this.mKeyboard.f12532E);
        this.mCurvePoints.setCanvasSize(this.mKeyboard.f12535H, this.mKeyboard.f12533F);
        this.mSoftKeyInfo = new SoftKeyInfo();
        prepareData();
    }

    /* access modifiers changed from: protected */
    public void prepareData() {
        updateKeyInfo();
        updateActionListener();
    }

    /* access modifiers changed from: protected */
    public void cacheRendingColor(Drawable drawable, C2726bF bFVar) {
        if (bFVar != null && bFVar.mo8999a() != null) {
            if (this.mRendingMap == null) {
                this.mRendingMap = new HashMap<>();
            }
            this.mRendingMap.put(drawable, bFVar.mo8999a());
        }
    }

    public void updateRendingDrawable() {
        if (C1368X.m6320c().mo5841n().mo6298t() && this.mRendingMap != null) {
            for (Drawable next : this.mRendingMap.keySet()) {
                C2725bE bEVar = this.mRendingMap.get(next);
                if (bEVar != null) {
                    bEVar.mo8995a(next);
                }
            }
        }
    }

    private void resetRendingMap() {
        if (this.mRendingMap != null) {
            this.mRendingMap.clear();
            this.mRendingMap = null;
        }
    }

    public void destroy() {
        resetRendingMap();
    }

    /* access modifiers changed from: protected */
    public void updateActionListener() {
        this.mActionListener = new C2808cc(this);
    }

    /* access modifiers changed from: protected */
    public void doKeyAction(int i) {
        lastInputKey = this;
        if (this.mCombineFlag == 0) {
            if (i == 0) {
                if (this.backgroundType == 0 && isNormalKey()) {
                    Engine.getInstance().updateInputOp(C1712h.f5591m);
                } else if ("sk_sp".equals(this.keyName)) {
                    Engine.getInstance().updateInputOp(C1712h.f5592n);
                }
            }
            if ((i != 6 && i != 7 && i != 14 && i != 15) || !"sk_sp".equals(this.keyName) || !jumpToLangSetting()) {
                if (i != 0 || !"sk_lng".equals(this.keyName) || !jumpToLangSetting()) {
                    if ((this.backgroundType != 0 || !isNormalKey()) && i != 12) {
                        if (i == 0 && Engine.getInstance().isClickTransMode()) {
                            Engine.getInstance().setClickTransMode(false);
                            Engine.getInstance().fireTransactionOperation(2);
                        }
                    } else if (!Engine.getInstance().isClickTransMode()) {
                        Engine.getInstance().fireTransactionOperation(1);
                        Engine.getInstance().setClickTransMode(true);
                    }
                    if ((((i == 6 || i == 7) && Engine.getInstance().isMultitouch) || i == 1) && ((!"sk_sp".equals(this.keyName) || !jumpToLangSetting()) && Engine.getInstance().isClickTransMode())) {
                        Engine.getInstance().setClickTransMode(false);
                        Engine.getInstance().fireTransactionOperation(2);
                    }
                    Engine.getInstance().fireKeyOperation(SoftKeyActionInfo.getActionInfo(this, this.mKeyboard, i), i, this.mKeyboard.mo9200v());
                    if (i == 13) {
                        if (Engine.getInstance().isClickTransMode()) {
                            Engine.getInstance().setClickTransMode(false);
                            Engine.getInstance().fireTransactionOperation(2);
                        }
                    } else if (i == 6 && "sk_bk".equals(this.keyName) && Settings.getInstance().getBoolSetting(Settings.ADVANCED_VIBRATION)) {
                        C1368X.m6320c().mo5852y().mo6379a(false);
                    }
                    this.mKeyboard.mo9201w();
                    this.mKeyboard.mo9203y();
                }
            }
        } else if (!this.mKeyboard.mo9202x()) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId(this.keyName), i);
            this.mKeyboard.mo9203y();
        }
    }

    /* access modifiers changed from: protected */
    public boolean jumpToLangSetting() {
        if (!Settings.getInstance().getBoolSetting(Settings.FIRST_SWITCH_LANGUAGE)) {
            return false;
        }
        Context b = C1368X.m6313b();
        Engine.getInstance().getIms().requestHideSelf(0);
        Intent intent = new Intent(b, C1593bR.m7162a().mo6234b(0));
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.putExtra("SHOW_ALL_LANGUAGE", true);
        b.startActivity(intent);
        Settings.getInstance().setBoolSetting(Settings.FIRST_SWITCH_LANGUAGE, false);
        return true;
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        int keyId = Engine.getInstance().getKeyId(this.keyName);
        if (keyId != -1) {
            this.mSoftKeyInfo.setSupportedOperation(Engine.getInstance().getKeySupportedOperation(keyId));
            Engine.getInstance().updateKey(keyId, this.mSoftKeyInfo);
        }
        if (this.mSoftKeyInfo.needUpdate) {
            if (this.mKeyboard.f12546S != null) {
                this.mKeyboard.f12546S.mo8732a(this);
            }
        } else if ((this.mTriType != -1 || this.mBinType != -1) && this.mKeyboard.f12546S != null) {
            this.mKeyboard.f12546S.mo8732a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateDisplay() {
    }

    /* access modifiers changed from: package-private */
    public C2809cd getSoftKeyDrawInfo() {
        if (this.mSoftKeyDrawInfo == null) {
            this.mSoftKeyDrawInfo = new C2809cd();
        }
        C2809cd cdVar = this.mSoftKeyDrawInfo;
        cdVar.f12459d = this.f12453x;
        cdVar.f12460e = this.f12454y;
        cdVar.f12461f = this.width;
        cdVar.f12462g = this.height;
        cdVar.f12465j = this.mSoftKeyInfo.mainTitle;
        cdVar.f12466k = this.mSoftKeyInfo.leftTitle;
        cdVar.f12467l = this.mSoftKeyInfo.rightTitle;
        cdVar.f12468m = this.mSoftKeyInfo.altTitle;
        cdVar.f12463h = this.mSoftKeyInfo.printTitle;
        cdVar.f12469n = this.mainTextXAlign;
        cdVar.f12470o = this.mainTextYAlign;
        cdVar.f12471p = this.mainTextPos;
        cdVar.f12472q = this.altTextPos;
        cdVar.f12473r = this.altTextXAlign;
        cdVar.f12474s = this.altTextYAlign;
        cdVar.f12475t = this.leftTextPos;
        cdVar.f12476u = this.rightTextPos;
        cdVar.f12456a = hashCode();
        return cdVar;
    }

    /* access modifiers changed from: protected */
    public Integer getForeColor() {
        return null;
    }

    public int[] getCurrentDrawableState() {
        return C2845U.m13131a(getBackState(), getForeState());
    }

    /* access modifiers changed from: protected */
    public int[] getForeState() {
        boolean a = C1368X.m6320c().mo5841n().mo6256a(this.icon);
        if (this.mBinType != -1) {
            boolean z = false;
            if (!C1389aD.m6468r() && this.mBinType == 0) {
                z = Settings.getInstance().getBoolSetting(1);
            }
            if (!z) {
                return a ? STATE_BIN_OFF_DEFAULT : STATE_BIN_OFF_CURRENT;
            }
            if (a) {
                return STATE_BIN_ON_DEFAULT;
            }
            return STATE_BIN_ON_CURRENT;
        } else if (this.mTriType == -1) {
            return null;
        } else {
            if (this.mTriType <= 2) {
                if (!Engine.isInitialized()) {
                    return null;
                }
                switch (Engine.getInstance().getTriStatus(this.mTriType)) {
                    case 1:
                        return a ? STATE_TRI_NONE_DEFAULT : STATE_TRI_NONE_CURRENT;
                    case 2:
                        return a ? STATE_TRI_TOGGLE_DEFAULT : STATE_TRI_TOGGLE_CURRENT;
                    case 3:
                        return a ? STATE_TRI_LOCK_DEFAULT : STATE_TRI_LOCK_CURRENT;
                    default:
                        return null;
                }
            } else if (this.mTriType != 4) {
                return null;
            } else {
                int intSetting = Settings.getInstance().getIntSetting(127);
                return intSetting == 0 ? a ? STATE_TRI_NONE_DEFAULT : STATE_TRI_NONE_CURRENT : intSetting == 1 ? a ? STATE_TRI_TOGGLE_DEFAULT : STATE_TRI_TOGGLE_CURRENT : intSetting >= 4 ? a ? STATE_TRI_FORTH_DEFAULT : STATE_TRI_FORTH_CURRENT : a ? STATE_TRI_LOCK_DEFAULT : STATE_TRI_LOCK_CURRENT;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int[] getBackState() {
        if (this.mPressed) {
            return STATE_PRESSED;
        }
        return null;
    }

    public boolean isInside(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = (this.edgeFlags & 1) > 0;
        if ((this.edgeFlags & 2) > 0) {
            z = true;
        } else {
            z = false;
        }
        if ((this.edgeFlags & 4) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.edgeFlags & 8) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i >= this.f12453x || (z4 && i <= this.f12453x + this.width)) && ((i < this.f12453x + this.width || (z && i >= this.f12453x)) && (i2 >= this.f12454y || (z2 && i2 <= this.f12454y + this.height)))) {
            if (i2 < this.f12454y + this.height) {
                return true;
            }
            if (z3 && i2 >= this.f12454y) {
                return true;
            }
        }
        return false;
    }

    public int squaredDistanceFrom(int i, int i2) {
        int i3 = (this.f12453x + (this.width / 2)) - i;
        int i4 = (this.f12454y + (this.height / 2)) - i2;
        return (i3 * i3) + (i4 * i4);
    }

    /* access modifiers changed from: protected */
    public void onPress() {
        Context b;
        this.mPressed = true;
        this.mMoveContrail.clear();
        this.mCurvePoints.clear();
        if ("sk_back".equals(this.keyName) && "eng_edit".equals(Engine.getInstance().getSurfaceTemplate()) && (b = C1368X.m6313b()) != null) {
            C1246d.m6010a(b).mo4591a(C1246d.f3751aU, C1246d.f3810ba, C1246d.f3783b);
        }
        Engine.getInstance().feedback();
        this.mKeyboard.f12546S.mo8732a(this);
    }

    /* access modifiers changed from: protected */
    public void releaseCallback() {
        C2806cb cbVar;
        if ("sk_sft".equals(this.keyName)) {
            Iterator<C2806cb> it = this.mKeyboard.f12545R.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cbVar = null;
                    break;
                }
                cbVar = it.next();
                if (cbVar.keyName.equals(this.keyName) && this != cbVar) {
                    break;
                }
            }
            if (cbVar != null && this.mKeyboard.f12546S != null) {
                this.mKeyboard.f12546S.mo8732a(cbVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRelease() {
        if (this.mPressed) {
            this.mPressed = false;
            int idByKey = Settings.getInstance().getIdByKey(this.mFunctionSettingId);
            if (idByKey >= 0 && Settings.getInstance().getBoolSetting(idByKey)) {
                Settings.getInstance().setBoolSetting(idByKey, false);
            }
            if (this.mKeyboard.f12546S != null) {
                this.mKeyboard.f12546S.mo8732a(this);
            }
            dismissPreview();
            releaseCallback();
        }
    }

    private void beginListen() {
        this.mListening = true;
    }

    private void endListen() {
        this.mListening = false;
        if (this.mKeyboard.mo9198t()) {
            Engine.getInstance().getWidgetManager().mo9655l().mo8602b();
        }
    }

    private void pauseMultiTouch() {
        Engine.getInstance().setMutiTouchPaused(true);
    }

    private void unPauseMultiTouch() {
        Engine.getInstance().setMutiTouchPaused(false);
    }

    public void onMotionEvent(MotionEvent motionEvent, boolean z) {
        boolean z2;
        int slideDirection;
        boolean z3;
        if (this.mSoftKeyInfo.supportedOperation != 0) {
            if (!z || this.mCombineFlag == 0) {
                int action2 = motionEvent.getAction();
                if (this.mListening || action2 == 0) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    long eventTime = motionEvent.getEventTime();
                    C2694ag z4 = Engine.getInstance().getWidgetManager().mo9669z();
                    if (z4.mo8951c()) {
                        if (z4.mo8947a(motionEvent)) {
                            this.mMoveContrail.addPoint(x, y, action2);
                            if (action2 == 3) {
                                onRelease();
                                return;
                            }
                            return;
                        }
                        Settings.getInstance().setBoolSetting(39, Settings.getInstance().getBoolSetting(39));
                    }
                    if (action2 == 0) {
                        onPress();
                        beginListen();
                        if (Engine.uStartToInput) {
                            C1056a.m5588a().mo4264a(C1056a.f2979j, C1368X.m6313b());
                            Engine.uStartToInput = false;
                        }
                    }
                    this.mMoveContrail.addPoint(x, y, action2);
                    if (action2 == 0) {
                        this.mLongPressed = false;
                        this.downX = x;
                        this.downY = y;
                        this.mMovePointCount = 0;
                        this.mKeyboard.f12575ah = x;
                        this.mCurvePoints.clear();
                        this.mCurveKeyId = -1;
                        this.mLastPointX = x;
                        this.mLastPointY = y;
                        addCurvePoints(x, y, action2, true);
                        this.mInThreshold = false;
                        this.mComputedRightNow = false;
                        this.mTraceSlide = true;
                        if (C1252b.f4003h) {
                            Engine.getInstance().getWidgetManager().mo9657n().mo9393b(x, y);
                        }
                        startTraceLongPress();
                        stopTraceCurveInTime();
                        if (this.mCombineFlag != 0) {
                            this.mKeyboard.mo9186f(this.mCombineFlag);
                        }
                        dismissPreview();
                        showPreview(0);
                    } else if (action2 == 2) {
                        this.mMovePointCount++;
                        if (!this.mLongPressed) {
                            int i = 0;
                            boolean traceLongPressSlide = traceLongPressSlide();
                            if (!isInside(x, y) && !traceLongPressSlide) {
                                stopTraceLongPress();
                            }
                            if (this.mTraceSlide) {
                                if (isSlide(this.downX, this.downY, x, y) && !traceLongPressSlide) {
                                    stopTraceLongPress();
                                    i = getSlideDirection(x - this.downX, y - this.downY);
                                    if (i == 0 || !this.mSoftKeyInfo.isOperationSupported(i)) {
                                        this.mTraceSlide = false;
                                    }
                                }
                                if (canAddCurvePoints(x, y, action2)) {
                                    addCurvePoints(x, y, action2, true);
                                }
                            }
                            int i2 = i;
                            boolean z5 = true;
                            int a = this.mKeyboard.mo9176a(this.downX, this.downY, x, y, this.mMovePointCount);
                            if (!this.mTraceSlide && !this.mIgnoreCurve && this.mKeyboard.mo9183b(this.mMoveContrail)) {
                                stopTraceLongPress();
                                if (this.mMovePointCount <= 4 && Settings.getInstance().getBoolSetting(30)) {
                                    Settings.getInstance().setBoolSetting(30, false);
                                }
                                SoftKeyboardView softKeyboardView = this.mKeyboard.f12546S;
                                if (softKeyboardView == null) {
                                    addCurvePoints(x, y, action2, true);
                                } else {
                                    int a2 = softKeyboardView.mo8724a(x, y);
                                    if (a2 != this.mCurveKeyId || canAddCurvePoints(x, y, action2)) {
                                        addCurvePoints(x, y, action2, true);
                                    }
                                    if (Settings.getInstance().getBoolSetting(82)) {
                                        if (a2 != this.mCurveKeyId) {
                                            if (Math.abs(x - this.mLastPointX) > this.WIDTH_THRESHOLD || Math.abs(y - this.mLastPointY) > this.HEIGHT_THRESHOLD) {
                                                this.mInThreshold = false;
                                                this.mComputedRightNow = false;
                                            } else {
                                                this.mInThreshold = true;
                                                this.mComputedRightNow = true;
                                            }
                                            stopTraceCurveInTime();
                                        } else if (!this.mTraceCurveInTime && (Engine.getInstance().getWidgetManager().mo9657n() == null || !Engine.getInstance().getWidgetManager().mo9657n().mo9404k())) {
                                            startTraceCurveInTime();
                                            pauseMultiTouch();
                                        }
                                    }
                                    this.mCurveKeyId = a2;
                                    this.mLastPointX = x;
                                    this.mLastPointY = y;
                                }
                                if (this.mKeyboard.mo9198t()) {
                                    Engine.getInstance().getWidgetManager().mo9655l().mo9343a(this.mMoveContrail);
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                onRelease();
                                z5 = z3;
                            } else if (!this.mIgnoreSlip && a != -1 && a != -2) {
                                stopTraceLongPress();
                                this.mKeyboard.f12548W.mo9205a(a);
                                z5 = false;
                                onRelease();
                                endListen();
                            } else if (this.mIgnoreStroke || !this.mKeyboard.mo9185c(this.mMoveContrail)) {
                                this.mTraceSlide = true;
                                if (isSlide(this.downX, this.downY, x, y)) {
                                    pauseMultiTouch();
                                }
                            } else {
                                stopTraceLongPress();
                                if (this.mKeyboard.mo9198t()) {
                                    Engine.getInstance().getWidgetManager().mo9655l().mo9343a(this.mMoveContrail);
                                    z5 = false;
                                    pauseMultiTouch();
                                }
                                onRelease();
                            }
                            if (a == -2) {
                                this.mMovePointCount--;
                            } else {
                                lastInputKey = null;
                            }
                            if (this.mPressed && z5) {
                                showPreview(i2);
                            }
                        }
                        if (C1252b.f4003h) {
                            if (Settings.getInstance().getBoolSetting(Settings.SHOW_WAVE_TIP_SLIDE_DOWN)) {
                                stopTraceCurveInTime();
                            }
                            if (this.mStartWaveFromGesture) {
                                Engine.getInstance().getWidgetManager().mo9657n().mo9390a(x, y);
                                stopTraceCurveInTime();
                                this.mMoveContrail.clear();
                                this.mCurvePoints.clear();
                                onRelease();
                            } else if (Engine.getInstance().getWidgetManager().mo9657n().mo9393b(x, y)) {
                                stopTraceCurveInTime();
                                this.mMoveContrail.clear();
                                this.mCurvePoints.clear();
                                Engine.getInstance().getWidgetManager().mo9655l().mo8602b();
                                this.mStartWaveFromGesture = true;
                                pauseMultiTouch();
                            }
                        }
                    } else if (action2 == 1) {
                        stopTraceLongPress();
                        stopTraceCurveInTime();
                        boolean z6 = false;
                        if (C1252b.f4003h) {
                            z6 = Engine.getInstance().getWidgetManager().mo9657n().mo9401h();
                            Engine.getInstance().getWidgetManager().mo9657n().mo9403j();
                        }
                        this.mStartWaveFromGesture = false;
                        if (this.mLongPressed || z6) {
                            z2 = false;
                        } else {
                            if (this.mTraceSlide && isSlide(this.downX, this.downY, x, y) && ((slideDirection = getSlideDirection(x - this.downX, y - this.downY)) == 0 || !this.mSoftKeyInfo.isOperationSupported(slideDirection))) {
                                this.mTraceSlide = false;
                            }
                            if ((!this.mTraceSlide && !this.mIgnoreCurve && this.mKeyboard.mo9183b(this.mMoveContrail)) || (!this.mIgnoreStroke && this.mKeyboard.mo9185c(this.mMoveContrail))) {
                                stopTraceLongPress();
                                stopTraceCurveInTime();
                                Engine.getInstance().getWidgetManager().mo9655l().mo9343a(this.mMoveContrail);
                                dismissPreview();
                                SoftKeyboardView softKeyboardView2 = this.mKeyboard.f12546S;
                                if (softKeyboardView2 == null || !this.mKeyboard.mo9183b(this.mMoveContrail)) {
                                    this.mKeyboard.f12548W.mo9206a(this.mMoveContrail);
                                    long longSetting = Settings.getInstance().getLongSetting(Settings.NEXT_STAT_STROKE_FILTER_TIME);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (longSetting < currentTimeMillis && C1549b.f4831b.equals(Settings.getInstance().getStringSetting(10))) {
                                        Settings.getInstance().setLongSetting(Settings.NEXT_STAT_STROKE_FILTER_TIME, 86400000 + currentTimeMillis);
                                    }
                                } else {
                                    if (softKeyboardView2.mo8724a(x, y) == this.mCurveKeyId || !canAddCurvePoints(x, y, action2)) {
                                        if (this.mComputedRightNow && this.mInThreshold) {
                                            this.mComputedRightNow = false;
                                        }
                                        addCurvePoints(this.mCurvePoints.getX(this.mCurvePoints.size() - 1), this.mCurvePoints.getY(this.mCurvePoints.size() - 1), 1, false);
                                    } else {
                                        addCurvePoints(x, y, action2, true);
                                        this.mComputedRightNow = false;
                                    }
                                    this.mKeyboard.f12548W.mo9206a(this.mCurvePoints);
                                }
                                z2 = false;
                            } else if (isSlide(this.downX, this.downY, x, y)) {
                                this.mActionListener.mo8670a(getSlideDirection(x - this.downX, y - this.downY));
                                z2 = false;
                            } else {
                                if (Engine.getInstance().isMultitouch && isEdgeFuncKey()) {
                                    if (this.mCombineFlag != 0) {
                                        this.mKeyboard.mo9187g(this.mCombineFlag);
                                    }
                                    if (Engine.getInstance().getWidgetManager().mo9657n() != null) {
                                        Engine.getInstance().getWidgetManager().mo9657n().mo9395d();
                                    }
                                    onRelease();
                                    if (this.mKeyboard.f12546S != null) {
                                        this.mKeyboard.f12546S.mo8732a(this);
                                    }
                                    dismissPreview();
                                    if (lastInputKey != null && !lastInputKey.keyName.equals("sk_sft")) {
                                        return;
                                    }
                                }
                                boolean z7 = lastInputKey == this;
                                boolean z8 = false;
                                if (this.mSoftKeyInfo.isOperationSupported(3) && z7) {
                                    z8 = "sk_sft".equals(this.keyName) ? eventTime - this.mLastClickTime < CURVE_TIMEOUT : eventTime - this.mLastClickTime < DOUBLE_CLICK_TIME_OUT;
                                }
                                if (this.mKeyboard != null) {
                                    if (!z7) {
                                        this.mKeyboard.f12573ae = 0;
                                    }
                                    this.mKeyboard.f12573ae++;
                                }
                                if (z8) {
                                    this.mActionListener.mo8670a(3);
                                    this.mLastClickTime = 0;
                                    if (HighFreqSettings.getInstance().showDoubleClickShiftTips && "sk_sft".equals(this.keyName) && this.mTriType == 0 && !C1368X.m6320c().mo5850w().mo8415d() && !C2564f.m11470c()) {
                                        Settings.getInstance().setBoolSetting(Settings.SHOW_DOUBLE_CLICK_SHIFT_TIPS, false);
                                    }
                                } else {
                                    this.mActionListener.mo8670a(0);
                                    this.mLastClickTime = eventTime;
                                    if (HighFreqSettings.getInstance().showDoubleClickShiftTips && "sk_sft".equals(this.keyName) && this.mKeyboard != null && this.mKeyboard.f12573ae == 2 && !C2564f.m11470c() && !C1368X.m6320c().mo5850w().mo8415d() && this.mTriType == 0) {
                                        Toast.makeText(C1368X.m6313b(), C1974m.m9063a(C1368X.m6313b(), (int) R.string.double_click_shift_tips), 1).show();
                                    }
                                }
                                if (this.mKeyboard != null && "sk_bk".equals(this.keyName) && this.mKeyboard.f12573ae >= 3 && C1319a.m6097a(C1368X.m6313b(), C1334o.DELETE_SLIDE_LEFT)) {
                                    Engine.getInstance().getDialogManager().showWizardTipsDialog(C1334o.DELETE_SLIDE_LEFT);
                                }
                                z2 = true;
                            }
                        }
                        if (!z2 && this.mKeyboard != null) {
                            this.mKeyboard.f12573ae = 0;
                        }
                        if (this.mCombineFlag != 0) {
                            this.mKeyboard.mo9187g(this.mCombineFlag);
                        }
                    } else if (action2 == 3) {
                        stopTraceLongPress();
                        stopTraceCurveInTime();
                        if (this.mCombineFlag != 0) {
                            this.mKeyboard.mo9187g(this.mCombineFlag);
                        }
                        if (Engine.getInstance().getWidgetManager().mo9657n() != null) {
                            Engine.getInstance().getWidgetManager().mo9657n().mo9395d();
                        }
                    } else {
                        stopTraceLongPress();
                        stopTraceCurveInTime();
                        if (this.mCombineFlag != 0) {
                            this.mKeyboard.mo9187g(this.mCombineFlag);
                        }
                        if (Engine.getInstance().getWidgetManager().mo9657n() != null) {
                            Engine.getInstance().getWidgetManager().mo9657n().mo9395d();
                        }
                        dismissPreview();
                    }
                    if (action2 == 1 || action2 == 3) {
                        unPauseMultiTouch();
                        onRelease();
                        endListen();
                    }
                }
            }
        }
    }

    private void addCurvePoints(int i, int i2, int i3, boolean z) {
        if (!z || !isCorrectCurvePoint()) {
            this.mCurvePoints.addPoint(i, i2, i3);
            return;
        }
        this.mCurvePoints.addPoint(i, i2 - this.mKeyboard.f12534G, i3);
    }

    private boolean isCorrectCurvePoint() {
        return this.mKeyboard != null && this.mKeyboard.mo9188j() != null && !TextUtils.isEmpty(this.mKeyboard.mo9188j().getNumKeyboardSchemaId()) && Settings.getInstance().getBoolSetting(Settings.KEYBOARD_NUMBER_ROW_STYLE);
    }

    private boolean canAddCurvePoints(int i, int i2, int i3) {
        if (this.mCurvePoints.size() != 0 && Math.abs(i - this.mCurvePoints.getX(this.mCurvePoints.size() - 1)) <= this.WIDTH_THRESHOLD && Math.abs(i2 - this.mCurvePoints.getY(this.mCurvePoints.size() - 1)) <= this.HEIGHT_THRESHOLD) {
            return false;
        }
        return true;
    }

    public boolean isEdgeFuncKey() {
        if (this.keyName == null || this.backgroundType == 0 || this.keyName.equals("sk_sft")) {
            return false;
        }
        return true;
    }

    private boolean isSlide(int i, int i2, int i3, int i4) {
        return isSlide(i3 - i, i4 - i2);
    }

    /* access modifiers changed from: package-private */
    public boolean isSlide(int i, int i2) {
        return (i * i) + (i2 * i2) > this.mSlideThresholdSquare;
    }

    /* access modifiers changed from: package-private */
    public int getSlideDirection(int i, int i2) {
        int quadrant = quadrant(i, i2);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int i3 = MAX_DIS;
        int i4 = -1;
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = (param[i5][0] * abs) + (param[i5][1] * abs2);
            this.dis[i5] = (i6 * i6) / denominator[i5];
            this.disSupport[i5] = this.dis[i5] + supportOperation(i5, quadrant);
            if (this.disSupport[i5] < i3) {
                i3 = this.disSupport[i5];
                i4 = i5;
            }
        }
        if (i4 == -1 || this.dis[i4] > this.dis[2 - i4]) {
            return 0;
        }
        return action[quadrant][i4];
    }

    private int supportOperation(int i, int i2) {
        if (this.mSoftKeyInfo.isOperationSupported(action[i2][i])) {
            return 0;
        }
        return MAX_DIS;
    }

    private int quadrant(int i, int i2) {
        if (i2 > 0) {
            if (i > 0) {
                return 0;
            }
            return 1;
        } else if (i > 0) {
            return 3;
        } else {
            return 2;
        }
    }

    /* access modifiers changed from: protected */
    public void showPreview(int i) {
        boolean z = true;
        if (HighFreqSettings.getInstance().previewLevel == 0 || !this.mSupportPreviewPopup || !Engine.isInitialized() || !Engine.getInstance().getIms().isInputViewShown()) {
            return;
        }
        if (this.mCombineFlag == 0 || !this.mKeyboard.mo9202x()) {
            if (!this.mSoftKeyInfo.isOperationSupported(i)) {
                i = 0;
            }
            if (!Engine.getInstance().getWidgetManager().mo9667x().mo9318d() || this.mLastPreviewOperation != i) {
                this.mLastPreviewOperation = i;
                String previewText = getPreviewText(i);
                Rect a = C2833K.m12972a((View) this.mKeyboard.f12546S, this.f12453x, this.f12454y, this.width, this.height);
                Drawable previewIcon = getPreviewIcon(i);
                if (!TextUtils.isEmpty(previewText) && this.altTitlePreviewOnly) {
                    previewIcon = null;
                }
                C2833K x = Engine.getInstance().getWidgetManager().mo9667x();
                if (!TextUtils.isEmpty(previewText) && previewIcon == null) {
                    Engine.getInstance().getWidgetManager().mo9667x().mo9295a(hasExtendKey() ? 1 : 0);
                    if (this.backgroundType == 1 || this.backgroundType == 2) {
                        z = false;
                    }
                    x.mo9307b(this.backgroundType);
                    x.mo9303a(a, previewText, z);
                } else if (previewIcon == null) {
                } else {
                    if (this.iconWithMainTitle) {
                        if (!hasExtendKey()) {
                            z = false;
                        }
                        x.mo9295a(z ? 1 : 0);
                        x.mo9307b(this.backgroundType);
                        x.mo9302a(a, previewText, previewIcon, getCurrentDrawableState());
                        return;
                    }
                    if (!hasExtendKey()) {
                        z = false;
                    }
                    x.mo9295a(z ? 1 : 0);
                    x.mo9299a(a, previewIcon, getCurrentDrawableState(), getPreviewWidth(), getPreviewHeight());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getPreviewWidth() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getPreviewHeight() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public String getPreviewText(int i) {
        String str = "";
        int keyId = Engine.getInstance().getKeyId(this.keyName);
        if (keyId != -1) {
            str = Engine.getInstance().getPreviewText(keyId, i);
        }
        if (TextUtils.isEmpty(str)) {
            return this.mSoftKeyInfo.mainTitle;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public Drawable getPreviewIcon(int i) {
        if (i == 7 && this.iconPreviewRight != null) {
            return this.iconPreviewRight;
        }
        if (this.iconPreview != null) {
            return this.iconPreview;
        }
        if (this.icon != null) {
            return this.icon;
        }
        return null;
    }

    private void dismissPreview() {
        this.mLastPreviewOperation = -1;
        Engine.getInstance().getWidgetManager().mo9667x().mo9294a();
    }

    public void showExtendSurface(int i) {
        if (Engine.isInitialized() && Engine.getInstance().getIms().isInputViewShown()) {
            int[] allKeyId = Engine.getInstance().getAllKeyId();
            if (this.altTitlePreviewOnly) {
                allKeyId = removeMainTitle(allKeyId);
            }
            if (allKeyId != null && allKeyId.length != 0) {
                Rect a = C2833K.m12972a((View) this.mKeyboard.f12546S, this.f12453x, this.f12454y, this.width, this.height);
                Engine.getInstance().getWidgetManager().mo9669z().mo8945a((C2694ag.C2695a) this);
                Engine.getInstance().getWidgetManager().mo9669z().mo8944a(a, allKeyId, i);
                if (Settings.getInstance().getBoolSetting(Settings.ADVANCED_VIBRATION)) {
                    C1368X.m6320c().mo5852y().mo6379a(false);
                }
            }
        }
    }

    public int[] removeMainTitle(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return null;
        }
        String str = this.mSoftKeyInfo.mainTitle;
        String str2 = this.mSoftKeyInfo.altTitle;
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        if (str == null || str.length() == 0) {
            return iArr;
        }
        int length = str.length();
        int length2 = str2.length();
        int[] iArr2 = new int[length2];
        int i = length;
        while (i - length < length2 && i < iArr.length) {
            iArr2[i - length] = iArr[i];
            i++;
        }
        return iArr2;
    }

    public void onClickExtendKey(int i) {
        if (Engine.isInitialized() && Engine.getInstance().getWidgetManager().mo9669z().mo8951c()) {
            Engine.getInstance().fireKeyOperation(i, 0);
            Engine.getInstance().processEvent();
            Engine.getInstance().getWidgetManager().mo9669z().mo8948b();
        }
        onRelease();
    }

    private boolean hasExtendKey() {
        return this.mTraceLongPress && this.mSoftKeyInfo.isOperationSupported(1);
    }

    /* access modifiers changed from: protected */
    public boolean getVisible() {
        return (this.mSoftKeyInfo.printTitle == 0 && this.icon == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void longPress(Message message) {
        int i = message.what;
        if (this.mLongPressPendingState) {
            i = judgeLongPressType(message);
        }
        if (i == 2) {
            doLongPressMulti(message);
        } else if (i == 1) {
            doLongPressOnce(message);
        } else if (i == 14) {
            doLongPressLeftSlide(message);
        } else if (i == 15) {
            doLongPressRightSlide(message);
        }
    }

    /* access modifiers changed from: protected */
    public int judgeLongPressType(Message message) {
        return -1;
    }

    /* access modifiers changed from: protected */
    public void doLongPressMulti(Message message) {
        if (!this.mLongPressed && this.mSoftKeyInfo.isOperationSupported(12)) {
            this.mActionListener.mo8670a(12);
        }
        this.mLongPressed = true;
        Engine.getInstance().getCandidateManager().EnableUpdate(false);
        this.mActionListener.mo8670a(2);
        Engine.getInstance().processEvent();
        restartLongPressMultiCycle(message);
        if ("sk_bk".equals(this.keyName)) {
            Engine.setLongPressDelete(true);
        }
    }

    /* access modifiers changed from: protected */
    public void restartLongPressMultiCycle(Message message) {
        if (this.mTraceLongPress) {
            this.mKeyboard.mo9196r().sendMessageDelayed(Message.obtain(message), 50);
        }
        this.mLongPressed = true;
    }

    /* access modifiers changed from: protected */
    public void doLongPressOnce(Message message) {
        dismissPreview();
        if (!Settings.getInstance().getBoolSetting(Settings.SHOW_WAVE_TIP_SLIDE_DOWN) || Engine.getInstance().getWidgetManager().mo9657n() == null || !Engine.getInstance().getWidgetManager().mo9657n().mo9404k()) {
            this.mLongPressed = true;
            this.mActionListener.mo8670a(1);
            Engine.getInstance().processEvent();
        }
    }

    /* access modifiers changed from: protected */
    public void doLongPressLeftSlide(Message message) {
        this.mLongPressed = true;
        this.mActionListener.mo8670a(14);
        Engine.getInstance().processEvent();
        restartLongPressMultiCycle(message);
    }

    /* access modifiers changed from: protected */
    public void doLongPressRightSlide(Message message) {
        this.mLongPressed = true;
        this.mActionListener.mo8670a(15);
        Engine.getInstance().processEvent();
        restartLongPressMultiCycle(message);
    }

    public void curveInTime(Message message) {
        if (message.what == 16) {
            if (Engine.getInstance().getWidgetManager().mo9657n() != null) {
                Engine.getInstance().getWidgetManager().mo9657n().mo9402i();
            }
            if (this.mInThreshold) {
                this.mInThreshold = false;
                this.mComputedRightNow = false;
            }
            if (!this.mComputedRightNow) {
                if (!Settings.getInstance().getBoolSetting(30)) {
                    Settings.getInstance().setBoolSetting(30, true);
                }
                this.mKeyboard.f12548W.mo9206a(this.mCurvePoints);
                this.mComputedRightNow = true;
            }
        }
    }

    private void startTraceCurveInTime() {
        this.mKeyboard.mo9196r().sendMessageDelayed(this.mKeyboard.mo9196r().obtainMessage(16, this), CURVE_TIMEOUT);
        this.mTraceCurveInTime = true;
    }

    private void stopTraceCurveInTime() {
        this.mKeyboard.mo9196r().removeMessages(16);
        this.mTraceCurveInTime = false;
    }

    private void startTraceLongPress() {
        this.mLongPressType = -1;
        boolean isOperationSupported = this.mSoftKeyInfo.isOperationSupported(2);
        boolean isOperationSupported2 = this.mSoftKeyInfo.isOperationSupported(1);
        boolean isOperationSupported3 = this.mSoftKeyInfo.isOperationSupported(14);
        boolean isOperationSupported4 = this.mSoftKeyInfo.isOperationSupported(15);
        if ((isOperationSupported3 || isOperationSupported4) && (isOperationSupported || isOperationSupported2)) {
            this.mLongPressPendingState = true;
            this.mLongpressThreshold = Math.min(getLongpressMultiThreshold(), getLongpressOnceThreshold());
        } else if (isOperationSupported) {
            this.mLongPressType = 2;
            this.mLongpressThreshold = getLongpressMultiThreshold();
        } else if (isOperationSupported2) {
            this.mLongPressType = 1;
            this.mLongpressThreshold = getLongpressOnceThreshold();
        } else if (isOperationSupported3 || isOperationSupported4) {
            this.mLongPressPendingState = true;
            this.mLongpressThreshold = getLongpressMultiThreshold();
        }
        if (this.mLongPressType != -1 || this.mLongPressPendingState) {
            this.mKeyboard.mo9196r().sendMessageDelayed(this.mKeyboard.mo9196r().obtainMessage(this.mLongPressType, this), (long) this.mLongpressThreshold);
            this.mTraceLongPress = true;
            return;
        }
        this.mTraceLongPress = false;
    }

    private void stopTraceLongPress() {
        if (this.mTraceLongPress) {
            this.mLastPreviewOperation = -1;
        }
        this.mKeyboard.mo9196r().removeMessages(this.mLongPressType);
        this.mTraceLongPress = false;
        this.mLongPressPendingState = false;
        if (this.mLongPressed && this.mLongPressType == 2 && this.mSoftKeyInfo.isOperationSupported(13)) {
            this.mActionListener.mo8670a(13);
        }
        Engine.getInstance().getCandidateManager().EnableUpdate(true);
        if (Engine.isLongPressDelete() && Settings.getInstance().getBoolSetting(Settings.ADVANCED_VIBRATION)) {
            C1368X.m6320c().mo5852y().mo6377a();
        }
        Engine.setLongPressDelete(false);
    }

    private boolean traceLongPressSlide() {
        return this.mSoftKeyInfo.isOperationSupported(14) || this.mSoftKeyInfo.isOperationSupported(15);
    }

    public void layoutMainOnlyText(int i, int i2, Paint paint) {
        String str = this.mSoftKeyInfo.mainTitle;
        if (this.lineInfo == null) {
            this.lineInfo = new ArrayList<>();
        }
        this.lineInfo.clear();
        float fontSpacing = paint.getFontSpacing();
        int i3 = 0;
        int i4 = 0;
        while (i4 < str.length() && (((float) i3) * fontSpacing) + fontSpacing <= ((float) i2)) {
            int breakText = paint.breakText(str, i4, str.length(), true, (float) i, (float[]) null);
            this.lineInfo.add(Integer.valueOf(breakText));
            i4 += breakText;
            i3++;
        }
    }

    public boolean isNormalKey() {
        return !TextUtils.isEmpty(this.keyName) && this.PATTERN_NORMAL_KEY.matcher(this.keyName).matches();
    }

    public boolean isFuncKey() {
        return this.backgroundType == 1 || this.backgroundType == 2;
    }

    public boolean isCachable() {
        return this.mCachable;
    }

    /* access modifiers changed from: protected */
    public int getLongpressMultiThreshold() {
        return 500;
    }

    /* access modifiers changed from: protected */
    public int getLongpressOnceThreshold() {
        return HighFreqSettings.getInstance().longPressDelay;
    }

    /* access modifiers changed from: protected */
    public void refreshIconColor() {
        if (C1368X.m6320c().mo5841n().mo6298t() && this.mSupportCustomSkin) {
            C2726bF bFVar = C2726bF.KEY_FUN_ICON;
            bFVar.mo9001c();
            C2725bE a = bFVar.mo8999a();
            if (a != null) {
                a.mo8995a(this.icon);
                if (this.mRendingMap == null) {
                    this.mRendingMap = new HashMap<>();
                }
                if (a != null) {
                    a.mo8995a(this.icon);
                    this.mRendingMap.put(this.icon, a);
                }
            }
        }
    }

    public int getDownX() {
        return this.downX;
    }

    public int getDownY() {
        return this.downY;
    }

    public int getRelativeX() {
        if (this.width > 0) {
            return ((this.downX - this.f12453x) * 100) / this.width;
        }
        return 0;
    }

    public int getRelativeY() {
        if (this.height > 0) {
            return ((this.downY - this.f12454y) * 100) / this.height;
        }
        return 0;
    }
}
