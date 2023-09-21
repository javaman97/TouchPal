package com.cootek.smartinput5.engine;

import com.cootek.smartinput.utilities.C1000h;
import com.cootek.smartinput.utilities.C1001i;
import com.cootek.smartinput.utilities.C1018z;
import com.cootek.smartinput5.engine.CandidateManager;

public class UserwordProvider implements CandidateManager.ICandidateProvider {
    private static final int USERWORD_POOL = 2;
    private Engine engine;
    private C1000h<CandidateItem> userwordPool = new C1018z(new C1001i<CandidateItem>() {
        public CandidateItem createInstance(Object... objArr) {
            return new CandidateItem();
        }
    }, 2);

    public UserwordProvider(Engine engine2) {
        this.engine = engine2;
    }

    public int getFirstIndex() {
        return 0;
    }

    public CandidateItem get(int i) {
        return this.engine.getUserWordItem(i, this.userwordPool.mo4087a(new Object[0]));
    }

    public int getProviderType() {
        return 1;
    }

    public boolean hasCandidates() {
        return this.engine.hasUserword();
    }

    public void reset() {
        this.userwordPool.mo4088a();
    }
}
