package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class DataBuffer<T> implements Iterable<T> {

    /* renamed from: S */
    protected final C3525d f15255S;

    protected DataBuffer(C3525d dVar) {
        this.f15255S = dVar;
    }

    public void close() {
        this.f15255S.close();
    }

    public int describeContents() {
        return 0;
    }

    public abstract T get(int i);

    public int getCount() {
        return this.f15255S.getCount();
    }

    public boolean isClosed() {
        return this.f15255S.isClosed();
    }

    public Iterator<T> iterator() {
        return new C3522a(this);
    }
}
