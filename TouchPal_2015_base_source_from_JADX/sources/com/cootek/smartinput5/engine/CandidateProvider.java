package com.cootek.smartinput5.engine;

import com.cootek.smartinput.utilities.C1000h;
import com.cootek.smartinput.utilities.C1001i;
import com.cootek.smartinput.utilities.C1003k;
import com.cootek.smartinput.utilities.C1018z;
import com.cootek.smartinput5.engine.CandidateManager;

public class CandidateProvider implements CandidateManager.ICandidateProvider {
    private static final int CANDIDATE_POOL = 25;
    private C1003k<CandidateItem> candidateList = new C1003k<CandidateItem>() {
        public CandidateItem provide(int i) {
            return CandidateProvider.this.provide(i, (CandidateItem) CandidateProvider.this.candidatePool.mo4087a(new Object[0]));
        }
    };
    /* access modifiers changed from: private */
    public C1000h<CandidateItem> candidatePool = new C1018z(new C1001i<CandidateItem>() {
        public CandidateItem createInstance(Object... objArr) {
            return new CandidateItem();
        }
    }, 25);
    private Engine engine;

    public CandidateProvider(Engine engine2) {
        this.engine = engine2;
    }

    public int getFirstIndex() {
        return this.engine.getCandidateFirstIndex();
    }

    public CandidateItem get(int i) {
        return this.candidateList.get(i);
    }

    public int getProviderType() {
        return 0;
    }

    public boolean hasCandidates() {
        return this.engine.hasCandidate();
    }

    public void reset() {
        this.candidateList.clear();
        this.candidatePool.mo4088a();
    }

    /* access modifiers changed from: private */
    public CandidateItem provide(int i, CandidateItem candidateItem) {
        return this.engine.getCandidateItem(i, candidateItem);
    }
}
