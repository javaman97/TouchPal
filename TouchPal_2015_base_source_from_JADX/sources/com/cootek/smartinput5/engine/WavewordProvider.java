package com.cootek.smartinput5.engine;

import com.cootek.smartinput.utilities.C1000h;
import com.cootek.smartinput.utilities.C1001i;
import com.cootek.smartinput.utilities.C1003k;
import com.cootek.smartinput.utilities.C1018z;
import com.cootek.smartinput5.p049e.C1252b;

public class WavewordProvider implements C1252b.C1254b {
    private Engine engine;
    private C1003k<CandidateItem> wavewordList = new C1003k<CandidateItem>() {
        public CandidateItem provide(int i) {
            return WavewordProvider.this.provide(i, (CandidateItem) WavewordProvider.this.wavewordPool.mo4087a(new Object[0]));
        }
    };
    /* access modifiers changed from: private */
    public C1000h<CandidateItem> wavewordPool = new C1018z(new C1001i<CandidateItem>() {
        public CandidateItem createInstance(Object... objArr) {
            return new CandidateItem();
        }
    }, 10);

    public WavewordProvider(Engine engine2) {
        this.engine = engine2;
    }

    /* access modifiers changed from: private */
    public CandidateItem provide(int i, CandidateItem candidateItem) {
        return this.engine.getCandidateItem(i, candidateItem);
    }

    public boolean hasSlideSentence() {
        return this.engine.hasCandidate();
    }

    public CandidateItem get(int i) {
        return this.wavewordList.get(i);
    }

    public void reset() {
        this.wavewordList.clear();
        this.wavewordPool.mo4088a();
    }
}
