package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.internal.C3669bc;
import com.google.android.gms.internal.C3670bd;
import com.google.android.gms.internal.C3799r;

/* renamed from: com.google.android.gms.games.leaderboard.e */
public final class C3568e extends C3523b implements LeaderboardVariant {
    C3568e(C3525d dVar, int i) {
        super(dVar, i);
    }

    /* renamed from: aI */
    public String mo11246aI() {
        return getString("top_page_token_next");
    }

    /* renamed from: aJ */
    public String mo11247aJ() {
        return getString("window_page_token_prev");
    }

    /* renamed from: aK */
    public String mo11248aK() {
        return getString("window_page_token_next");
    }

    public int getCollection() {
        return getInteger("collection");
    }

    public String getDisplayPlayerRank() {
        return getString("player_display_rank");
    }

    public String getDisplayPlayerScore() {
        return getString("player_display_score");
    }

    public long getNumScores() {
        if (mo10966e("total_scores")) {
            return -1;
        }
        return getLong("total_scores");
    }

    public long getPlayerRank() {
        if (mo10966e("player_rank")) {
            return -1;
        }
        return getLong("player_rank");
    }

    public long getRawPlayerScore() {
        if (mo10966e("player_raw_score")) {
            return -1;
        }
        return getLong("player_raw_score");
    }

    public int getTimeSpan() {
        return getInteger("timespan");
    }

    public boolean hasPlayerInfo() {
        return !mo10966e("player_raw_score");
    }

    public String toString() {
        return C3799r.m16670c(this).mo12413a("TimeSpan", C3670bd.m16096G(getTimeSpan())).mo12413a("Collection", C3669bc.m16095G(getCollection())).mo12413a("RawPlayerScore", hasPlayerInfo() ? Long.valueOf(getRawPlayerScore()) : "none").mo12413a("DisplayPlayerScore", hasPlayerInfo() ? getDisplayPlayerScore() : "none").mo12413a("PlayerRank", hasPlayerInfo() ? Long.valueOf(getPlayerRank()) : "none").mo12413a("DisplayPlayerRank", hasPlayerInfo() ? getDisplayPlayerRank() : "none").mo12413a("NumScores", Long.valueOf(getNumScores())).mo12413a("TopPageNextToken", mo11246aI()).mo12413a("WindowPageNextToken", mo11248aK()).mo12413a("WindowPagePrevToken", mo11247aJ()).toString();
    }
}
