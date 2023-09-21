package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.internal.C3736cb;

public final class MomentBuffer extends DataBuffer<Moment> {
    public MomentBuffer(C3525d dVar) {
        super(dVar);
    }

    public Moment get(int i) {
        return new C3736cb(this.f15255S, i);
    }
}
