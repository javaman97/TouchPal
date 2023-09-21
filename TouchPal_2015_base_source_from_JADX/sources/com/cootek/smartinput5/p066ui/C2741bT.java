package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2806cb;

/* renamed from: com.cootek.smartinput5.ui.bT */
/* compiled from: SmileyTabKey */
class C2741bT implements C2806cb.C2807a {

    /* renamed from: a */
    final /* synthetic */ SmileyTabKey f12239a;

    C2741bT(SmileyTabKey smileyTabKey) {
        this.f12239a = smileyTabKey;
    }

    /* renamed from: a */
    public void mo8670a(int i) {
        if (this.f12239a.mCombineFlag == 0) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId(this.f12239a.keyName), i, this.f12239a.mKeyboard.mo9200v());
            this.f12239a.mKeyboard.mo9201w();
            Engine.getInstance().processEvent();
        } else if (!this.f12239a.mKeyboard.mo9202x()) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId(this.f12239a.keyName), i);
            Engine.getInstance().processEvent();
        }
    }
}
