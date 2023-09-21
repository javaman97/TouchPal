package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.ExplicitInfo;
import com.cootek.smartinput5.engine.ExplicitManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.ClearKey */
public class ClearKey extends C2806cb implements CandidateManager.ICandidateListener, ExplicitManager.IExplicitListener {
    private static final int MSG_UPDATE_MAINTITLE = 0;
    private boolean mCanClearCandidate;
    private boolean mCanClearExplicit;
    private final int mClearKeyColor;
    private String mClearTitle = C1974m.m9063a(C1368X.m6313b(), (int) R.string.chs_key_clear_title);
    private Handler mHandler = new C2938p(this);
    private String mNumTitle = C1974m.m9063a(C1368X.m6313b(), (int) R.string.chs_key_num_title);

    public ClearKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
        this.mSoftKeyInfo.mainTitle = this.mNumTitle;
        this.mSoftKeyInfo.printTitle |= 1;
        this.mClearKeyColor = C1368X.m6320c().mo5841n().mo6248a((int) R.color.clear_key_text_color, C2787cK.CLEAR_KEY);
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        boolean z5;
        if (!z || iCandidateProvider.get(0) == null || iCandidateProvider.get(0).getSource() == 6) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.mCanClearCandidate = z5;
        this.mHandler.sendEmptyMessage(0);
    }

    public void onTextUpdated(CharSequence charSequence, ExplicitInfo explicitInfo) {
        boolean z;
        if (!TextUtils.isEmpty(charSequence)) {
            z = true;
        } else {
            z = false;
        }
        this.mCanClearExplicit = z;
        this.mHandler.sendEmptyMessage(0);
    }

    /* access modifiers changed from: private */
    public void updateMainTitle() {
        this.mHandler.removeMessages(0);
        String str = this.mSoftKeyInfo.mainTitle;
        if (this.mCanClearExplicit || this.mCanClearCandidate) {
            this.mSoftKeyInfo.mainTitle = this.mClearTitle;
            this.mSoftKeyInfo.printTitle |= 1;
        } else {
            this.mSoftKeyInfo.mainTitle = this.mNumTitle;
            this.mSoftKeyInfo.printTitle |= 1;
        }
        if (str != this.mSoftKeyInfo.mainTitle) {
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        super.updateKeyInfo();
        this.mSoftKeyInfo.printTitle |= 1;
    }

    /* access modifiers changed from: protected */
    public Integer getForeColor() {
        if (this.mClearTitle.equals(this.mSoftKeyInfo.mainTitle)) {
            return Integer.valueOf(this.mClearKeyColor);
        }
        return null;
    }
}
