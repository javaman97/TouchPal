package com.cootek.smartinput5.engine;

import com.cootek.smartinput.utilities.C1000h;
import com.cootek.smartinput.utilities.C1001i;
import com.cootek.smartinput.utilities.C1018z;
import com.cootek.smartinput5.engine.CandidateManager;

public class DialectProvider implements CandidateManager.ICandidateProvider {
    private static final int Dialect_POOL = 2;
    private C1000h<CandidateItem> dialectPool = new C1018z(new C1001i<CandidateItem>() {
        public CandidateItem createInstance(Object... objArr) {
            return new CandidateItem();
        }
    }, 2);
    private Engine engine;

    public DialectProvider(Engine engine2) {
        this.engine = engine2;
    }

    public int getFirstIndex() {
        return 0;
    }

    public CandidateItem get(int i) {
        return this.engine.getDialectItem(i, this.dialectPool.mo4087a(new Object[0]));
    }

    public int getProviderType() {
        return 2;
    }

    public boolean hasCandidates() {
        return this.engine.hasDialect();
    }

    public void reset() {
        this.dialectPool.mo4088a();
    }
}
