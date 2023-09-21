package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2806cb;

/* renamed from: com.cootek.smartinput5.ui.aJ */
/* compiled from: HandWriteRecogKey */
class C2670aJ implements C2806cb.C2807a {

    /* renamed from: a */
    final /* synthetic */ HandWriteRecogKey f11991a;

    C2670aJ(HandWriteRecogKey handWriteRecogKey) {
        this.f11991a = handWriteRecogKey;
    }

    /* renamed from: a */
    public void mo8670a(int i) {
        if (this.f11991a.mCombineFlag == 0) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId(this.f11991a.keyName), i, this.f11991a.mKeyboard.mo9200v());
            this.f11991a.mKeyboard.mo9201w();
            Engine.getInstance().processEvent();
        } else if (!this.f11991a.mKeyboard.mo9202x()) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId(this.f11991a.keyName), i);
            Engine.getInstance().processEvent();
        }
        this.f11991a.mKeyboard.mo7433a();
    }
}
