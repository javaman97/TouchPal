package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2806cb;

/* renamed from: com.cootek.smartinput5.ui.cE */
/* compiled from: SymTypeKey */
class C2781cE implements C2806cb.C2807a {

    /* renamed from: a */
    final /* synthetic */ SymTypeKey f12379a;

    C2781cE(SymTypeKey symTypeKey) {
        this.f12379a = symTypeKey;
    }

    /* renamed from: a */
    public void mo8670a(int i) {
        if (this.f12379a.mCombineFlag == 0) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId(this.f12379a.keyName), i, this.f12379a.mKeyboard.mo9200v());
            this.f12379a.mKeyboard.mo9201w();
            Engine.getInstance().processEvent();
        } else if (!this.f12379a.mKeyboard.mo9202x()) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId(this.f12379a.keyName), i);
            Engine.getInstance().processEvent();
        }
        this.f12379a.mKeyboard.mo7433a();
    }
}
