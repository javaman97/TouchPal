package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.ExplicitInfo;
import com.cootek.smartinput5.engine.ExplicitManager;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.SeparatorKey */
public class SeparatorKey extends C2806cb implements ExplicitManager.IExplicitListener {
    private String mFunctionTitle = "";
    private String mSeparatorTitle = "";
    final Drawable numberIcon;
    boolean originalHasLongPressIcon;
    int originalSupportOp;
    final Drawable previewIcon;

    public SeparatorKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
        updateTitle();
        this.numberIcon = this.icon;
        this.previewIcon = this.iconPreview;
        this.icon = null;
        this.originalHasLongPressIcon = this.hasLongPressIcon;
    }

    private void updateTitle() {
        if (this.mSoftKeyInfo != null) {
            this.mSeparatorTitle = this.mSoftKeyInfo.mainTitle;
            this.mFunctionTitle = this.mSoftKeyInfo.altTitle;
            this.originalSupportOp = this.mSoftKeyInfo.supportedOperation;
            if (!TextUtils.isEmpty(this.mFunctionTitle)) {
                this.mSoftKeyInfo.printTitle = 1;
            } else if (this.numberIcon != null && this.previewIcon != null) {
                this.iconPreview = this.previewIcon;
                this.icon = this.numberIcon;
                this.mSoftKeyInfo.printTitle = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        super.updateKeyInfo();
        updateTitle();
    }

    public void onTextUpdated(CharSequence charSequence, ExplicitInfo explicitInfo) {
        Drawable drawable = this.icon;
        String str = this.mSoftKeyInfo.mainTitle;
        if (charSequence.length() == 0) {
            if (!TextUtils.isEmpty(this.mFunctionTitle)) {
                this.mSoftKeyInfo.mainTitle = this.mFunctionTitle;
                this.mSoftKeyInfo.printTitle = 1;
                this.icon = null;
                this.iconPreview = null;
            } else {
                this.mSoftKeyInfo.printTitle = 0;
                this.iconPreview = this.previewIcon;
                this.icon = this.numberIcon;
            }
            this.hasLongPressIcon = this.originalHasLongPressIcon;
            this.mSoftKeyInfo.supportedOperation = this.originalSupportOp;
        } else {
            this.icon = null;
            this.iconPreview = null;
            this.mSoftKeyInfo.mainTitle = this.mSeparatorTitle;
            this.mSoftKeyInfo.printTitle = 1;
            this.hasLongPressIcon = false;
            this.mSoftKeyInfo.supportedOperation &= -3;
        }
        if (drawable != this.icon || !TextUtils.equals(str, this.mSoftKeyInfo.mainTitle)) {
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
    }
}
