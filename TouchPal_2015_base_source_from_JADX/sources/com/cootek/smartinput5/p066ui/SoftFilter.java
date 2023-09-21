package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.FilterItem;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1599be;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.SoftFilter */
class SoftFilter extends C2806cb {
    private static final String TAG = "SoftFilter";
    /* access modifiers changed from: private */
    public int mFilterIndex;
    private int mFocusColor = C1368X.m6320c().mo5841n().mo6260b((int) R.color.key_main_focus_text_color);
    private FilterItem mItem;

    SoftFilter(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
        try {
            this.mFilterIndex = C1599be.m7198a(resources, this.mKeyboard.f12571ac.getPackageName(), bVar.filterIndex, 0);
        } catch (Exception e) {
            C1017y.m5219b(TAG, "Parse error:" + e);
            e.printStackTrace();
        }
    }

    public void setFilterIndex(int i) {
        this.mFilterIndex = i;
    }

    /* access modifiers changed from: protected */
    public void updateActionListener() {
        this.mActionListener = new C2747bZ(this);
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        this.mSoftKeyInfo.printTitle = 0;
        this.mSoftKeyInfo.setSupportedOperation(1);
    }

    /* access modifiers changed from: package-private */
    public void updateDisplay() {
        this.mItem = ((C2805ca) this.mKeyboard).mo9132b(this.mFilterIndex);
        if (this.mItem != null) {
            this.mSoftKeyInfo.printTitle = 1;
            this.mSoftKeyInfo.mainTitle = this.mItem.filter;
        } else {
            this.mSoftKeyInfo.printTitle = 0;
            this.mSoftKeyInfo.mainTitle = null;
        }
        this.mSoftKeyInfo.needUpdate = true;
    }

    /* access modifiers changed from: protected */
    public int[] getBackState() {
        if (this.mItem == null || this.mItem.getTag() == 0) {
            return super.getBackState();
        }
        return STATE_FOCUSED;
    }

    /* access modifiers changed from: protected */
    public Integer getForeColor() {
        if (this.mItem == null || this.mItem.getTag() == 0) {
            return super.getForeColor();
        }
        return Integer.valueOf(this.mFocusColor);
    }
}
