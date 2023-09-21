package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.CandidateItem;

/* renamed from: com.cootek.smartinput5.ui.SoftCandidate */
class SoftCandidate extends C2806cb {
    private static final String TAG = "SoftCandidate";
    public int candidateIndex;

    public SoftCandidate(C2811cf cfVar) {
        super(cfVar);
        this.mSupportPreviewPopup = false;
    }

    /* access modifiers changed from: protected */
    public void updateActionListener() {
        this.mActionListener = new C2742bU(this);
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        this.mSoftKeyInfo.printTitle = 1;
        this.mSoftKeyInfo.setSupportedOperation(1);
        if (this.mKeyboard != null && this.mKeyboard.f12546S != null) {
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateDisplay() {
        CandidateItem b = ((C2744bW) this.mKeyboard).mo9017b(this.candidateIndex);
        if (b != null) {
            this.mSoftKeyInfo.printTitle = 1;
            this.mSoftKeyInfo.mainTitle = b.word;
            return;
        }
        this.mSoftKeyInfo.printTitle = 0;
        this.mSoftKeyInfo.mainTitle = null;
    }
}
