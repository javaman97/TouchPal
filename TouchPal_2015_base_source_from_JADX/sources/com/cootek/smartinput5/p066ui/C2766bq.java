package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.p066ui.C2806cb;

/* renamed from: com.cootek.smartinput5.ui.bq */
/* compiled from: PageKey */
class C2766bq implements C2806cb.C2807a {

    /* renamed from: a */
    final /* synthetic */ PageKey f12335a;

    C2766bq(PageKey pageKey) {
        this.f12335a = pageKey;
    }

    /* renamed from: a */
    public void mo8670a(int i) {
        if (i == 0 && this.f12335a.keyName != null) {
            if (this.f12335a.keyName.contains(EnterKey.NEXT)) {
                this.f12335a.mKeyboard.f12548W.mo9205a(5);
            } else if (this.f12335a.keyName.contains("prev")) {
                this.f12335a.mKeyboard.f12548W.mo9205a(6);
            }
        }
    }
}
