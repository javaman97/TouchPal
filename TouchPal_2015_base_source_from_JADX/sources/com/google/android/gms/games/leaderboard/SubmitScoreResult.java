package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.internal.C3670bd;
import com.google.android.gms.internal.C3799r;
import com.google.android.gms.internal.C3802s;
import java.util.HashMap;

public final class SubmitScoreResult {

    /* renamed from: eB */
    private static final String[] f15368eB = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest"};

    /* renamed from: dx */
    private String f15369dx;

    /* renamed from: eC */
    private String f15370eC;

    /* renamed from: eD */
    private HashMap<Integer, Result> f15371eD;

    /* renamed from: p */
    private int f15372p;

    public static final class Result {
        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;

        public Result(long j, String str, boolean z) {
            this.rawScore = j;
            this.formattedScore = str;
            this.newBest = z;
        }

        public String toString() {
            return C3799r.m16670c(this).mo12413a("RawScore", Long.valueOf(this.rawScore)).mo12413a("FormattedScore", this.formattedScore).mo12413a("NewBest", Boolean.valueOf(this.newBest)).toString();
        }
    }

    public SubmitScoreResult(int i, String str, String str2) {
        this(i, str, str2, new HashMap());
    }

    public SubmitScoreResult(int i, String str, String str2, HashMap<Integer, Result> hashMap) {
        this.f15372p = i;
        this.f15370eC = str;
        this.f15369dx = str2;
        this.f15371eD = hashMap;
    }

    public SubmitScoreResult(C3525d dVar) {
        this.f15372p = dVar.getStatusCode();
        this.f15371eD = new HashMap<>();
        int count = dVar.getCount();
        C3802s.m16677c(count == 3);
        for (int i = 0; i < count; i++) {
            int e = dVar.mo10981e(i);
            if (i == 0) {
                this.f15370eC = dVar.mo10977c("leaderboardId", i, e);
                this.f15369dx = dVar.mo10977c("playerId", i, e);
            }
            if (dVar.mo10979d("hasResult", i, e)) {
                m15518a(new Result(dVar.mo10974a("rawScore", i, e), dVar.mo10977c("formattedScore", i, e), dVar.mo10979d("newBest", i, e)), dVar.mo10976b("timeSpan", i, e));
            }
        }
    }

    /* renamed from: a */
    private void m15518a(Result result, int i) {
        this.f15371eD.put(Integer.valueOf(i), result);
    }

    public String getLeaderboardId() {
        return this.f15370eC;
    }

    public String getPlayerId() {
        return this.f15369dx;
    }

    public Result getScoreResult(int i) {
        return this.f15371eD.get(Integer.valueOf(i));
    }

    public int getStatusCode() {
        return this.f15372p;
    }

    public String toString() {
        C3799r.C3801a a = C3799r.m16670c(this).mo12413a("PlayerId", this.f15369dx).mo12413a("StatusCode", Integer.valueOf(this.f15372p));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 3) {
                return a.toString();
            }
            Result result = this.f15371eD.get(Integer.valueOf(i2));
            a.mo12413a("TimesSpan", C3670bd.m16096G(i2));
            a.mo12413a("Result", result == null ? "null" : result.toString());
            i = i2 + 1;
        }
    }
}
