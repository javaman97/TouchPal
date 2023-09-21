package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.games.C3563d;
import com.google.android.gms.games.Player;

/* renamed from: com.google.android.gms.games.leaderboard.d */
public final class C3567d extends C3523b implements LeaderboardScore {

    /* renamed from: eA */
    private final C3563d f15384eA;

    C3567d(C3525d dVar, int i) {
        super(dVar, i);
        this.f15384eA = new C3563d(dVar, i);
    }

    /* renamed from: aH */
    public LeaderboardScore freeze() {
        return new C3566c(this);
    }

    public boolean equals(Object obj) {
        return C3566c.m15521a(this, obj);
    }

    public String getDisplayRank() {
        return getString("display_rank");
    }

    public void getDisplayRank(CharArrayBuffer charArrayBuffer) {
        mo10964a("display_rank", charArrayBuffer);
    }

    public String getDisplayScore() {
        return getString("display_score");
    }

    public void getDisplayScore(CharArrayBuffer charArrayBuffer) {
        mo10964a("display_score", charArrayBuffer);
    }

    public long getRank() {
        return getLong("rank");
    }

    public long getRawScore() {
        return getLong("raw_score");
    }

    public Player getScoreHolder() {
        if (mo10966e("external_player_id")) {
            return null;
        }
        return this.f15384eA;
    }

    public String getScoreHolderDisplayName() {
        return mo10966e("external_player_id") ? getString("default_display_name") : this.f15384eA.getDisplayName();
    }

    public void getScoreHolderDisplayName(CharArrayBuffer charArrayBuffer) {
        if (mo10966e("external_player_id")) {
            mo10964a("default_display_name", charArrayBuffer);
        } else {
            this.f15384eA.getDisplayName(charArrayBuffer);
        }
    }

    public Uri getScoreHolderHiResImageUri() {
        if (mo10966e("external_player_id")) {
            return null;
        }
        return this.f15384eA.getHiResImageUri();
    }

    public Uri getScoreHolderIconImageUri() {
        return mo10966e("external_player_id") ? mo10965d("default_display_image_uri") : this.f15384eA.getIconImageUri();
    }

    public long getTimestampMillis() {
        return getLong("achieved_timestamp");
    }

    public int hashCode() {
        return C3566c.m15520a(this);
    }

    public String toString() {
        return C3566c.m15522b(this);
    }
}
