package com.cootek.smartinput.utilities;

import java.util.ArrayList;

/* renamed from: com.cootek.smartinput.utilities.k */
/* compiled from: LazyLoadArrayList */
public abstract class C1003k<T> {
    private ArrayList<T> cacheList = new ArrayList<>();

    public abstract T provide(int i);

    public synchronized T get(int i) {
        T t;
        int size = this.cacheList.size();
        if (i >= size) {
            while (size <= i) {
                Object provide = provide(size);
                if (provide == null) {
                    break;
                }
                this.cacheList.add(size, provide);
                size++;
            }
        }
        if (i >= this.cacheList.size() || i < 0) {
            t = null;
        } else {
            t = this.cacheList.get(i);
        }
        return t;
    }

    public int getCurrentSize() {
        return this.cacheList.size();
    }

    public synchronized void clear() {
        this.cacheList.clear();
    }
}
