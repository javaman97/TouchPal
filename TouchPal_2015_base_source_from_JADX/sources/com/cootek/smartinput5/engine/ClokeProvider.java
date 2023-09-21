package com.cootek.smartinput5.engine;

import com.cootek.smartinput.utilities.C1000h;
import com.cootek.smartinput.utilities.C1001i;
import com.cootek.smartinput.utilities.C1003k;
import com.cootek.smartinput.utilities.C1018z;
import com.cootek.smartinput5.engine.ClokeManager;

public class ClokeProvider implements ClokeManager.IClokeProvider {
    private static final int CLOKE_POOL = 4;
    public static final int CLOUD_SEARCH_TYPE_COUNT = 2;
    public static final int INVALID_CLOUD_SEARCH_TYPE = -1;
    public static final int LOCAL_CLOUD_SEARCH_TYPE = 1;
    public static final int ONLINE_CLOUD_SEARCH_TYPE = 0;
    private C1003k<CandidateItem> clokeList = new C1003k<CandidateItem>() {
        public CandidateItem provide(int i) {
            return ClokeProvider.this.provide(i, (CandidateItem) ClokeProvider.this.clokePool.mo4087a(new Object[0]), ClokeProvider.this.mCloudSearchType);
        }
    };
    /* access modifiers changed from: private */
    public C1000h<CandidateItem> clokePool = new C1018z(new C1001i<CandidateItem>() {
        public CandidateItem createInstance(Object... objArr) {
            return new CandidateItem();
        }
    }, 4);
    private Engine engine;
    /* access modifiers changed from: private */
    public int mCloudSearchType = -1;

    public ClokeProvider(Engine engine2) {
        this.engine = engine2;
    }

    /* access modifiers changed from: private */
    public CandidateItem provide(int i, CandidateItem candidateItem, int i2) {
        return this.engine.getCloudCandidateItem(i, candidateItem, this.mCloudSearchType);
    }

    public CandidateItem get(int i) {
        return this.clokeList.get(i);
    }

    public boolean hasCloke() {
        return this.engine.hasCloudCandidate(this.mCloudSearchType);
    }

    public void reset(int i) {
        this.mCloudSearchType = i;
        this.clokeList.clear();
        this.clokePool.mo4088a();
    }

    public int getProviderType() {
        return this.mCloudSearchType;
    }
}
