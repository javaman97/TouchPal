package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.VerboseManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.SingleWordKey */
public class SingleWordKey extends C2806cb implements VerboseManager.IVerboseListener {
    private static final int ALL = 0;
    private static final int MAIN = -1;
    private static final int MULTI = 2;
    private static final int SINGLE = 1;
    private Drawable ICON_ALL;
    private Drawable ICON_MULTI;
    private Drawable ICON_SINGLE;
    private int mExFilter = -1;
    private String mMainTitle;
    private int mSupportOp;

    public SingleWordKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
        setupIcons();
        if (TextUtils.isEmpty(Engine.getInstance().getExplicitText()) || Engine.getInstance().getCandidateItemSource(0) == 8) {
            this.mMainTitle = this.mSoftKeyInfo.mainTitle;
            this.mSupportOp = this.mSoftKeyInfo.supportedOperation;
            if (this.mKeyboard instanceof C2744bW) {
                this.icon = this.ICON_ALL;
                this.mExFilter = 0;
                this.mSoftKeyInfo.supportedOperation = 0;
                return;
            }
            this.icon = null;
        }
    }

    private void setupIcons() {
        C2726bF bFVar;
        if (this.mKeyboard instanceof C2744bW) {
            bFVar = C2726bF.LETTER_WORD_SWITCH_FUNC;
        } else {
            bFVar = C2726bF.LETTER_WORD_SWITCH_NORMAL;
        }
        C1602bh n = C1368X.m6320c().mo5841n();
        this.ICON_ALL = n.mo6250a((int) R.drawable.letter_word_switch_all, bFVar);
        this.ICON_SINGLE = n.mo6250a((int) R.drawable.letter_word_switch_single, bFVar);
        this.ICON_MULTI = n.mo6250a((int) R.drawable.letter_word_switch_multi, bFVar);
    }

    /* access modifiers changed from: protected */
    public void refreshIconColor() {
        setupIcons();
        super.refreshIconColor();
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        if (this.mMainTitle == null) {
            super.updateKeyInfo();
            this.mMainTitle = this.mSoftKeyInfo.mainTitle;
            this.mSupportOp = this.mSoftKeyInfo.supportedOperation;
            if (this.mKeyboard instanceof C2744bW) {
                this.icon = this.ICON_ALL;
                this.mExFilter = 0;
                if (TextUtils.isEmpty(Engine.getInstance().getExplicitText()) || Engine.getInstance().getCandidateItemSource(0) == 8) {
                    this.mSoftKeyInfo.supportedOperation = 0;
                    return;
                }
                return;
            }
            this.icon = null;
        }
    }

    public void onOperationFinished() {
        int wordFilter = Engine.getInstance().getWordFilter();
        if (TextUtils.isEmpty(Engine.getInstance().getExplicitText())) {
            wordFilter = -1;
        }
        updateDisplay(wordFilter);
    }

    private void updateDisplay(int i) {
        if (i != this.mExFilter) {
            if (i == 0) {
                this.mSoftKeyInfo.printTitle &= -2;
                this.icon = this.ICON_ALL;
                this.mSoftKeyInfo.supportedOperation = this.mSupportOp & -3;
            } else if (i == 1) {
                this.mSoftKeyInfo.printTitle &= -2;
                this.icon = this.ICON_SINGLE;
                this.mSoftKeyInfo.supportedOperation = this.mSupportOp & -3;
            } else if (i == 2) {
                this.mSoftKeyInfo.printTitle &= -2;
                this.icon = this.ICON_MULTI;
                this.mSoftKeyInfo.supportedOperation = this.mSupportOp & -3;
            } else if (!(this.mKeyboard instanceof C2744bW)) {
                this.mSoftKeyInfo.printTitle |= 1;
                this.mSoftKeyInfo.supportedOperation = this.mSupportOp;
                this.icon = null;
                this.iconPreview = null;
            } else {
                this.mSoftKeyInfo.printTitle &= -2;
                if (TextUtils.isEmpty(Engine.getInstance().getExplicitText()) || Engine.getInstance().getCandidateItemSource(0) == 8) {
                    this.mSoftKeyInfo.supportedOperation = 0;
                } else {
                    this.mSoftKeyInfo.supportedOperation = this.mSupportOp;
                }
                this.icon = this.ICON_ALL;
            }
            this.mExFilter = i;
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
    }

    /* access modifiers changed from: protected */
    public String getPreviewText(int i) {
        if (i == 0) {
            return this.mSoftKeyInfo.mainTitle;
        }
        return super.getPreviewText(i);
    }

    /* access modifiers changed from: protected */
    public Drawable getPreviewIcon(int i) {
        if (i == 0) {
            return this.iconPreview;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C2809cd getSoftKeyDrawInfo() {
        C2809cd softKeyDrawInfo = super.getSoftKeyDrawInfo();
        softKeyDrawInfo.f12457b = this.mExFilter;
        return softKeyDrawInfo;
    }
}
