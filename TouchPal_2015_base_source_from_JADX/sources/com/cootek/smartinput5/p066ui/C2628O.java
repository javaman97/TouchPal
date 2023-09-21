package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2806cb;

/* renamed from: com.cootek.smartinput5.ui.O */
/* compiled from: EmotionKey */
class C2628O implements C2806cb.C2807a {

    /* renamed from: a */
    final /* synthetic */ EmotionKey f11480a;

    C2628O(EmotionKey emotionKey) {
        this.f11480a = emotionKey;
    }

    /* renamed from: a */
    public void mo8670a(int i) {
        C2806cb.lastInputKey = this.f11480a;
        if (1 == i) {
            this.f11480a.processLongPress(i);
            return;
        }
        C2806cb.lastInputKey = this.f11480a;
        if (this.f11480a.mCombineFlag == 0) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId(this.f11480a.keyName), i, this.f11480a.mKeyboard.mo9200v());
            this.f11480a.mKeyboard.mo9201w();
            this.f11480a.mKeyboard.mo9203y();
        } else if (!this.f11480a.mKeyboard.mo9202x()) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId(this.f11480a.keyName), i);
            this.f11480a.mKeyboard.mo9203y();
        }
    }
}
