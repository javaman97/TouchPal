package com.cootek.smartinput5.engine;

import java.util.ArrayList;
import java.util.Iterator;

public class FilterManager {
    private Engine engine;
    private ArrayList<IFilterListener> observers = new ArrayList<>();
    private IFilterProvider provider;

    public interface IFilterListener {
        void onFilterUpdated(boolean z, IFilterProvider iFilterProvider, boolean z2);
    }

    public interface IFilterProvider {
        FilterItem get(int i);

        int getSize();

        int getType();
    }

    public FilterManager(Engine engine2, IFilterProvider iFilterProvider) {
        this.engine = engine2;
        this.provider = iFilterProvider;
    }

    public void registerFilterListener(IFilterListener iFilterListener) {
        if (!this.observers.contains(iFilterListener)) {
            this.observers.add(iFilterListener);
            iFilterListener.onFilterUpdated(hasFilter(), this.provider, true);
        }
    }

    public void unregisterFilterListener(IFilterListener iFilterListener) {
        if (this.observers.contains(iFilterListener)) {
            this.observers.remove(iFilterListener);
        }
    }

    public void removeAllFilterListener() {
        this.observers.clear();
    }

    public void removeFilterListener(IFilterListener iFilterListener) {
        this.observers.remove(iFilterListener);
    }

    public void updateFilter() {
        Iterator<IFilterListener> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onFilterUpdated(hasFilter(), this.provider, true);
        }
    }

    public void updateActiveFilter() {
        Iterator<IFilterListener> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onFilterUpdated(hasFilter(), this.provider, false);
        }
    }

    private boolean hasFilter() {
        return this.engine.getFilterSize() > 0;
    }

    public FilterItem getItem(int i) {
        return this.provider.get(i);
    }
}
