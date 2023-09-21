package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.common.data.C3529f;

public final class LeaderboardBuffer extends C3529f<Leaderboard> {
    public LeaderboardBuffer(C3525d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: getEntry */
    public Leaderboard mo10998a(int i, int i2) {
        return new C3564a(this.f15255S, i, i2);
    }

    /* access modifiers changed from: protected */
    public String getPrimaryDataMarkerColumn() {
        return "external_leaderboard_id";
    }
}
