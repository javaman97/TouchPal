package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.p066ui.C2806cb;

/* renamed from: com.cootek.smartinput5.ui.bY */
/* compiled from: SoftCandidatePage */
class C2746bY implements C2806cb.C2807a {

    /* renamed from: a */
    final /* synthetic */ SoftCandidatePage f12255a;

    C2746bY(SoftCandidatePage softCandidatePage) {
        this.f12255a = softCandidatePage;
    }

    /* renamed from: a */
    public void mo8670a(int i) {
        if (i == 0 && this.f12255a.keyName != null) {
            if (this.f12255a.keyName.contains(EnterKey.NEXT)) {
                this.f12255a.mKeyboard.f12548W.mo9205a(5);
            } else if (this.f12255a.keyName.contains("prev") && ((C2744bW) this.f12255a.mKeyboard).mo9018c() > 0) {
                this.f12255a.mKeyboard.f12548W.mo9205a(6);
            }
        }
    }
}
