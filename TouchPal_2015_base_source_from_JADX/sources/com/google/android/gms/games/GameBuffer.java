package com.google.android.gms.games;

import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.common.data.DataBuffer;

public final class GameBuffer extends DataBuffer<Game> {
    public GameBuffer(C3525d dVar) {
        super(dVar);
    }

    public Game get(int i) {
        return new C3561b(this.f15255S, i);
    }
}
