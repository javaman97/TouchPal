package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2856c;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.emoji.keyboard.touchpal.R;
import java.lang.ref.WeakReference;

/* renamed from: com.cootek.smartinput5.ui.SpaceKey */
public class SpaceKey extends C2806cb implements CandidateManager.ICandidateListener {
    private static final int CHANGE_SLIDE_DIRECTION_REQUIRED_MARGIN = 3;
    private static final int LONGPRESS_SLIDE_DISTANCE_THRESHOLD = 15;
    private static final float MIN_DISTANCE_THRESHOLD_LONG = 1.0f;
    private static final int SLIDE_NOT_START = 2;
    private static final int SLIDE_TO_LEFT = 0;
    private static final int SLIDE_TO_RIGHT = 1;
    private static final int SPACEKEY_MODE_COUNT = 3;
    private static final int SPACEKEY_MODE_IDLE = 0;
    private static final int SPACEKEY_MODE_OPEN_EMOJI = 2;
    private static final int SPACEKEY_MODE_SWITCH_LANGUAGE = 1;
    private static final int THRESHOLD_LONGPRESS_ONCE = 300;
    private static final long TIME_THRESHOLD = 200;
    final int REQUIRED_SLIDE_DISTANCE_PER_CURSOR_MOVE;
    private boolean isSmileySupported;
    private String languageName;
    private String mBrandName;
    private String mCurrentLanguageId;
    private String mDemoString;
    private final GestureDetector mGestrueDetector;
    private C2635a mGestureListener;
    private int mLastPrintTitle;
    private int mLastXPosition;
    /* access modifiers changed from: private */
    public long mPressTime;
    private boolean mShowBopomofoTone = false;
    private int mSlideDirection;
    private int mSlideDistance;
    private int mSpacekeyMode;
    /* access modifiers changed from: private */
    public long mTimeThreshold;

    public SpaceKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
        this.altTextSize = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.keyboard_alt_text_size_small);
        this.REQUIRED_SLIDE_DISTANCE_PER_CURSOR_MOVE = resources.getDisplayMetrics().widthPixels / 10;
        this.mGestureListener = new C2635a();
        this.mGestrueDetector = new GestureDetector(this.mGestureListener);
        this.isSmileySupported = isSmileySupported();
        reset();
    }

    private boolean isSmileySupported() {
        if (!Engine.isInitialized() || Engine.getInstance().getKeyId("sk_sur_change_to_smiley") == -1 || Engine.getInstance().getKeyId("sk_smiley_open") == -1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        super.updateKeyInfo();
        this.mLastPrintTitle = this.mSoftKeyInfo.printTitle;
        this.mainOnlyTextSize = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.space_button_textsize);
        String brandName = getBrandName();
        if (TextUtils.isEmpty(brandName)) {
            this.mSoftKeyInfo.printTitle |= 1;
        } else if (canApplySwitchLanguageMode()) {
            this.mSoftKeyInfo.printTitle = 2;
            this.mSoftKeyInfo.altTitle = brandName;
            this.mSoftKeyInfo.mainTitle = null;
        } else {
            this.mSoftKeyInfo.printTitle = 1;
            this.mSoftKeyInfo.mainTitle = brandName;
            this.mSoftKeyInfo.altTitle = null;
        }
        updateLanguageName();
        this.icon = null;
        this.icon = getIcon();
        this.mSoftKeyInfo.needUpdate = true;
        if (this.mKeyboard.f12546S != null) {
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
    }

    private String getBrandName() {
        if (this.mBrandName == null) {
            if (C1132b.m5654a(C1368X.m6313b()).mo4392a(C1135d.BRAND_NAME_SHOW_ON_SPACE, (Boolean) false).booleanValue()) {
                this.mBrandName = C1974m.m9063a(C1368X.m6313b(), (int) R.string.brand_name);
            } else {
                this.mBrandName = "";
            }
            this.mDemoString = getDemoString();
            if (this.mDemoString != null) {
                this.mBrandName += this.mDemoString;
            }
        }
        return this.mBrandName;
    }

    private String getDemoString() {
        if (this.mDemoString == null && C1132b.m5654a(C1368X.m6313b()).mo4392a(C1135d.DEMO_SHOW_ON_SPACEKEY, (Boolean) false).booleanValue()) {
            this.mDemoString = C1974m.m9063a(C1368X.m6313b(), (int) R.string.demo_string);
        }
        return this.mDemoString;
    }

    private void updateLanguageName() {
        this.mCurrentLanguageId = Engine.getInstance().getCurrentLanguageId();
        if (this.mCurrentLanguageId != null) {
            if (C1389aD.m6470y(this.mCurrentLanguageId)) {
                this.languageName = C1974m.m9063a(C1368X.m6313b(), (int) R.string.chinese);
            } else {
                this.languageName = C1368X.m6320c().mo5842o().mo5954l(this.mCurrentLanguageId).f4728g;
            }
        } else if (this.languageName == null) {
            this.languageName = Settings.getInstance().getStringSetting(10);
        }
    }

    /* access modifiers changed from: protected */
    public void onRelease() {
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        boolean R = widgetManager.mo9612R();
        boolean S = widgetManager.mo9613S();
        if (R || S) {
            if (widgetManager.mo9614T()) {
                widgetManager.mo9625a(0, 1, 48);
            } else {
                Engine.getInstance().getVoiceProcessor().stopInputVoice();
            }
        }
        super.onRelease();
    }

    public void releasePress() {
        super.onRelease();
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        C1602bh n = C1368X.m6320c().mo5841n();
        if (Engine.getInstance().isBopomofoTone(1)) {
            this.mShowBopomofoTone = true;
            this.mSoftKeyInfo.mainTitle = "ˉ";
            this.mSoftKeyInfo.printTitle |= 1;
            this.icon = n.mo6250a((int) R.drawable.key_sp_normal, C2726bF.KEY_NORMAL_ICON);
        } else {
            this.mShowBopomofoTone = false;
            this.icon = getIcon();
            this.mSoftKeyInfo.mainTitle = null;
            this.mSoftKeyInfo.printTitle &= -2;
        }
        if (this.mLastPrintTitle != this.mSoftKeyInfo.printTitle) {
            if (this.mKeyboard.f12546S != null) {
                this.mKeyboard.f12546S.mo8732a((C2806cb) this);
            }
            this.mLastPrintTitle = this.mSoftKeyInfo.printTitle;
        }
    }

    private Drawable getIcon() {
        C1602bh n = C1368X.m6320c().mo5841n();
        C2726bF bFVar = C2726bF.KEY_NORMAL_ICON;
        if (!canApplySwitchLanguageMode()) {
            return n.mo6250a((int) R.drawable.key_sp_normal, bFVar);
        }
        return getIconWithLanguage();
    }

    private Drawable getIconWithLanguage() {
        return getIconWithArrows(" " + this.languageName + " ", true);
    }

    private BitmapDrawable getIconWithArrows(String str, boolean z) {
        int i;
        int i2;
        float measureText;
        Paint.FontMetrics fontMetrics;
        float f;
        C1602bh n = C1368X.m6320c().mo5841n();
        C2726bF bFVar = C2726bF.KEY_NORMAL_ICON;
        Drawable a = n.mo6250a((int) R.drawable.key_sp_normal, bFVar);
        Drawable a2 = n.mo6250a((int) R.drawable.key_sp_left_arrow, bFVar);
        Drawable a3 = n.mo6250a((int) R.drawable.key_sp_right_arrow, bFVar);
        int c = n.mo6265c((int) R.dimen.space_key_lang_name_text_size);
        int c2 = n.mo6265c((int) R.dimen.space_key_lang_name_min_text_size);
        int a4 = n.mo6248a((int) R.color.key_alt_text_color, C2787cK.KEY_TEXT);
        Drawable a5 = n.mo6249a((int) R.drawable.key_btn_ctrl);
        Rect rect = new Rect();
        a5.getPadding(rect);
        int i3 = (this.height - rect.top) - rect.bottom;
        int i4 = (this.width - rect.left) - rect.right;
        if (i3 <= 0) {
            i = this.mKeyboard.f12588x;
        } else {
            i = i3;
        }
        if (i4 <= 0) {
            i2 = this.mKeyboard.f12589y;
        } else {
            i2 = i4;
        }
        if (i <= 0 || i2 <= 0) {
            return new BitmapDrawable();
        }
        Rect rect2 = new Rect();
        a.getPadding(rect2);
        Bitmap bitmap = (Bitmap) new WeakReference(Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888)).get();
        bitmap.setDensity(C1368X.m6313b().getResources().getDisplayMetrics().densityDpi);
        Canvas canvas = new Canvas(bitmap);
        canvas.setBitmap(bitmap);
        C2856c cVar = new C2856c(true);
        cVar.setAntiAlias(true);
        cVar.setAlpha(255);
        cVar.setTypeface(C1624bv.m7418a());
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        int j = (int) (((double) c) * ad.mo9252j());
        int j2 = (int) (((double) c2) * ad.mo9252j());
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int intrinsicHeight = a2.getIntrinsicHeight();
        int intrinsicWidth = a2.getIntrinsicWidth();
        if (!z) {
            intrinsicHeight = 0;
            intrinsicWidth = 0;
        }
        int i5 = (i2 - rect2.left) - rect2.right;
        do {
            cVar.setTextSize((float) j);
            measureText = cVar.measureText(str);
            fontMetrics = cVar.getFontMetrics();
            f = fontMetrics.descent - fontMetrics.ascent;
            float f2 = f / ((float) intrinsicHeight);
            intrinsicHeight = (int) (((float) intrinsicHeight) * f2);
            intrinsicWidth = (int) (((float) intrinsicWidth) * f2);
            j -= 2;
            if (((float) (intrinsicWidth * 2)) + measureText <= ((float) i5)) {
                break;
            }
        } while (j > j2);
        if (z) {
            a2.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            a3.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        a.setBounds(0, 0, i2, i);
        a.draw(canvas);
        if (z) {
            canvas.translate(((((float) (i5 - (intrinsicWidth * 2))) - measureText) / 2.0f) + ((float) rect2.left), (((float) i) - f) / 2.0f);
            a2.draw(canvas);
            canvas.translate(((float) intrinsicWidth) + measureText, 0.0f);
            a3.draw(canvas);
            canvas.translate(-((((float) i2) + measureText) / 2.0f), (-(((float) i) - f)) / 2.0f);
        }
        cVar.setColor(a4);
        cVar.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, (float) (i2 / 2), ((((float) i) - fontMetrics.bottom) - fontMetrics.top) / 2.0f, cVar);
        return new BitmapDrawable(C1368X.m6313b().getResources(), bitmap);
    }

    /* access modifiers changed from: protected */
    public void refreshIconColor() {
        if (!this.mShowBopomofoTone) {
            this.icon = getIcon();
        } else {
            super.refreshIconColor();
        }
    }

    /* access modifiers changed from: protected */
    public void showPreview(int i) {
    }

    /* access modifiers changed from: protected */
    public int getLongpressOnceThreshold() {
        return 300;
    }

    public void onMotionEvent(MotionEvent motionEvent, boolean z) {
        if (motionEvent != null) {
            updateSlideDistance(motionEvent);
            if (!this.isSmileySupported || !C1351J.m6188a().mo5647e() || !isEventConsumed(motionEvent)) {
                super.onMotionEvent(motionEvent, z);
            }
            if (motionEvent.getAction() != 2) {
                reset();
            }
        }
    }

    private void reset() {
        this.mSpacekeyMode = 0;
        this.mSlideDistance = 0;
        this.mSlideDirection = 2;
    }

    private void updateSlideDistance(MotionEvent motionEvent) {
        int i;
        boolean z;
        int i2 = 0;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        if (action == 2) {
            int i3 = this.mLastXPosition - x;
            boolean z2 = Math.abs(i3) > 3;
            if (x < this.mLastXPosition) {
                i = 0;
            } else {
                i = 1;
            }
            if (!z2 || i == this.mSlideDirection) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.mSlideDistance = 0;
                if (x >= this.mLastXPosition) {
                    i2 = 1;
                }
                this.mSlideDirection = i2;
            }
            this.mSlideDistance += Math.abs(i3);
        }
        this.mLastXPosition = x;
    }

    private boolean isEventConsumed(MotionEvent motionEvent) {
        if (!Engine.getInstance().getWidgetManager().mo9612R() && this.mGestrueDetector.onTouchEvent(motionEvent) && motionEvent != null && motionEvent.getAction() != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void openSmileyPanel(boolean z) {
        Engine.getInstance().getWidgetManager().mo9618X().mo7428c(true);
        Engine.getInstance().getWidgetManager().mo9618X().mo7426b(z);
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_smiley_open"), 0);
        Engine.getInstance().processEvent();
        if (z && Settings.getInstance().getBoolSetting(Settings.ADVANCED_VIBRATION)) {
            C1368X.m6320c().mo5852y().mo6379a(false);
        }
        this.mSpacekeyMode = 2;
    }

    private boolean canApplySwitchLanguageMode() {
        boolean z;
        C1389aD o = C1368X.m6320c().mo5842o();
        if (o.mo5922J().length > 1) {
            z = true;
        } else {
            z = false;
        }
        if ((Settings.getInstance().getBoolSetting(Settings.LANG_KEY_ENABLED) || !z) && o.mo5926N() != 2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public boolean canApplyOpenEmojiMode() {
        return this.mSpacekeyMode == 0 || this.mSpacekeyMode == 2;
    }

    /* access modifiers changed from: protected */
    public int judgeLongPressType(Message message) {
        int i = 15;
        if (!canApplySwitchLanguageMode()) {
            return 1;
        }
        if (this.mSlideDistance <= 15 && this.mSpacekeyMode != 1) {
            return 1;
        }
        if (this.mSlideDirection == 0) {
            i = 14;
        } else if (this.mSlideDirection != 1) {
            i = 1;
        }
        if (this.mSpacekeyMode == 1) {
            return i;
        }
        this.mSpacekeyMode = 1;
        return i;
    }

    /* renamed from: com.cootek.smartinput5.ui.SpaceKey$a */
    private class C2635a extends GestureDetector.SimpleOnGestureListener {
        private C2635a() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            super.onDown(motionEvent);
            long unused = SpaceKey.this.mPressTime = System.currentTimeMillis();
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!m11948a() || !m11953c(motionEvent, motionEvent2) || !Engine.getInstance().getWidgetManager().mo9618X().mo7429d() || !m11952b(motionEvent, motionEvent2)) {
                return false;
            }
            SpaceKey.this.openSmileyPanel(true);
            SpaceKey.this.releasePress();
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!m11948a() || !m11950a(motionEvent, motionEvent2) || !m11949a(f, f2) || !m11952b(motionEvent, motionEvent2) || !Engine.getInstance().getWidgetManager().mo9618X().mo7429d()) {
                return false;
            }
            Engine.getInstance().getWidgetManager().mo9618X().mo7419a(m11947a(motionEvent));
            SpaceKey.this.openSmileyPanel(false);
            return true;
        }

        /* renamed from: a */
        private boolean m11948a() {
            if (!Engine.isInitialized() || !TextUtils.isEmpty(Engine.getInstance().getExplicitText()) || !SpaceKey.this.canApplyOpenEmojiMode()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private boolean m11950a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            long unused = SpaceKey.this.mTimeThreshold = System.currentTimeMillis() - SpaceKey.this.mPressTime;
            if (motionEvent == null || motionEvent2 == null || SpaceKey.this.mTimeThreshold < SpaceKey.TIME_THRESHOLD || motionEvent.getY() - motionEvent2.getY() <= 1.0f * ((float) m11951b())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private int m11947a(MotionEvent motionEvent) {
            if (motionEvent != null) {
                return (int) (((float) (SpaceKey.this.f12454y + m11951b())) - motionEvent.getY());
            }
            return 0;
        }

        /* renamed from: b */
        private int m11951b() {
            int g = SpaceKey.this.mKeyboard.mo9134g() / 4;
            return SpaceKey.this.height > g ? SpaceKey.this.height : g;
        }

        /* renamed from: b */
        private boolean m11952b(MotionEvent motionEvent, MotionEvent motionEvent2) {
            if (motionEvent == null || motionEvent2 == null || ((int) Math.abs(motionEvent2.getY() - motionEvent.getY())) <= ((int) Math.abs(motionEvent2.getX() - motionEvent.getX()))) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private boolean m11953c(MotionEvent motionEvent, MotionEvent motionEvent2) {
            if (motionEvent == null || motionEvent2 == null || motionEvent.getY() - motionEvent2.getY() <= ((float) m11951b())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private boolean m11949a(float f, float f2) {
            if (f2 >= 0.0f) {
                return true;
            }
            return false;
        }
    }
}
