package com.google.android.gms.games.achievement;

import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.common.data.DataBuffer;

public final class AchievementBuffer extends DataBuffer<Achievement> {
    public AchievementBuffer(C3525d dVar) {
        super(dVar);
    }

    public Achievement get(int i) {
        return new C3560a(this.f15255S, i);
    }
}
