package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataBuffer;

public final class ParticipantBuffer extends DataBuffer<Participant> {
    public Participant get(int i) {
        return new C3574d(this.f15255S, i);
    }
}
