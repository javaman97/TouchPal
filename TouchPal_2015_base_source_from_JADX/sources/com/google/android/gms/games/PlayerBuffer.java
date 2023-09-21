package com.google.android.gms.games;

import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.common.data.DataBuffer;

public final class PlayerBuffer extends DataBuffer<Player> {
    public PlayerBuffer(C3525d dVar) {
        super(dVar);
    }

    public Player get(int i) {
        return new C3563d(this.f15255S, i);
    }
}
