package com.cootek.smartinput5.engine;

import com.cootek.smartinput.utilities.C1000h;
import com.cootek.smartinput.utilities.C1001i;
import com.cootek.smartinput.utilities.C1003k;
import com.cootek.smartinput.utilities.C1018z;
import com.cootek.smartinput5.p049e.C1252b;

public class NextphraseProvider implements C1252b.C1254b {
    private Engine engine;
    private C1003k<CandidateItem> nextphraseList = new C1003k<CandidateItem>() {
        public CandidateItem provide(int i) {
            return NextphraseProvider.this.provide(i, (CandidateItem) NextphraseProvider.this.nextphrasePool.mo4087a(new Object[0]));
        }
    };
    /* access modifiers changed from: private */
    public C1000h<CandidateItem> nextphrasePool = new C1018z(new C1001i<CandidateItem>() {
        public CandidateItem createInstance(Object... objArr) {
            return new CandidateItem();
        }
    }, 10);

    public NextphraseProvider(Engine engine2) {
        this.engine = engine2;
    }

    /* access modifiers changed from: private */
    public CandidateItem provide(int i, CandidateItem candidateItem) {
        return this.engine.getNextphraseItemDirectly(i, candidateItem);
    }

    public boolean hasSlideSentence() {
        return this.engine.hasNextphrase();
    }

    public CandidateItem get(int i) {
        return this.nextphraseList.get(i);
    }

    public void reset() {
        this.nextphraseList.clear();
        this.nextphrasePool.mo4088a();
    }
}
