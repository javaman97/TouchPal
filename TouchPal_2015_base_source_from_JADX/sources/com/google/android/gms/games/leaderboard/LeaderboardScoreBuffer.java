package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.common.data.DataBuffer;

public final class LeaderboardScoreBuffer extends DataBuffer<LeaderboardScore> {

    /* renamed from: ep */
    private final C3565b f15367ep;

    public LeaderboardScoreBuffer(C3525d dVar) {
        super(dVar);
        this.f15367ep = new C3565b(dVar.mo10992l());
    }

    /* renamed from: aF */
    public C3565b mo11220aF() {
        return this.f15367ep;
    }

    public LeaderboardScore get(int i) {
        return new C3567d(this.f15255S, i);
    }
}
