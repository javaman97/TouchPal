package com.cootek.smartinput5.engine;

import com.cootek.smartinput.utilities.C1000h;
import com.cootek.smartinput.utilities.C1001i;
import com.cootek.smartinput.utilities.C1018z;
import com.cootek.smartinput5.engine.FilterManager;

public class FilterProvider implements FilterManager.IFilterProvider {
    private static final int FILTER_POOL = 24;
    private Engine engine;
    private C1000h<FilterItem> filterPool = new C1018z(new C1001i<FilterItem>() {
        public FilterItem createInstance(Object... objArr) {
            return new FilterItem();
        }
    }, 24);

    public FilterProvider(Engine engine2) {
        this.engine = engine2;
    }

    public int getSize() {
        return this.engine.getFilterSize();
    }

    public int getType() {
        return this.engine.getFilterType();
    }

    public FilterItem get(int i) {
        return this.engine.getFilterItem(i, this.filterPool.mo4087a(new Object[0]));
    }
}
