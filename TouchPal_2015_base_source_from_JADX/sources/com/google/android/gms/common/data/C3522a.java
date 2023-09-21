package com.google.android.gms.common.data;

import com.google.android.gms.internal.C3802s;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.data.a */
public final class C3522a<T> implements Iterator<T> {

    /* renamed from: T */
    private final DataBuffer<T> f15256T;

    /* renamed from: U */
    private int f15257U = -1;

    public C3522a(DataBuffer<T> dataBuffer) {
        this.f15256T = (DataBuffer) C3802s.m16678d(dataBuffer);
    }

    public boolean hasNext() {
        return this.f15257U < this.f15256T.getCount() + -1;
    }

    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f15257U);
        }
        DataBuffer<T> dataBuffer = this.f15256T;
        int i = this.f15257U + 1;
        this.f15257U = i;
        return dataBuffer.get(i);
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
