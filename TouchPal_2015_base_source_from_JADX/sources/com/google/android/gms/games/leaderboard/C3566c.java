package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.C3604ao;
import com.google.android.gms.internal.C3799r;
import com.google.android.gms.internal.C3802s;

/* renamed from: com.google.android.gms.games.leaderboard.c */
public final class C3566c implements LeaderboardScore {

    /* renamed from: er */
    private final long f15375er;

    /* renamed from: es */
    private final String f15376es;

    /* renamed from: et */
    private final String f15377et;

    /* renamed from: eu */
    private final long f15378eu;

    /* renamed from: ev */
    private final long f15379ev;

    /* renamed from: ew */
    private final String f15380ew;

    /* renamed from: ex */
    private final Uri f15381ex;

    /* renamed from: ey */
    private final Uri f15382ey;

    /* renamed from: ez */
    private final PlayerEntity f15383ez;

    public C3566c(LeaderboardScore leaderboardScore) {
        this.f15375er = leaderboardScore.getRank();
        this.f15376es = (String) C3802s.m16678d(leaderboardScore.getDisplayRank());
        this.f15377et = (String) C3802s.m16678d(leaderboardScore.getDisplayScore());
        this.f15378eu = leaderboardScore.getRawScore();
        this.f15379ev = leaderboardScore.getTimestampMillis();
        this.f15380ew = leaderboardScore.getScoreHolderDisplayName();
        this.f15381ex = leaderboardScore.getScoreHolderIconImageUri();
        this.f15382ey = leaderboardScore.getScoreHolderHiResImageUri();
        Player scoreHolder = leaderboardScore.getScoreHolder();
        this.f15383ez = scoreHolder == null ? null : (PlayerEntity) scoreHolder.freeze();
    }

    /* renamed from: a */
    static int m15520a(LeaderboardScore leaderboardScore) {
        return C3799r.hashCode(Long.valueOf(leaderboardScore.getRank()), leaderboardScore.getDisplayRank(), Long.valueOf(leaderboardScore.getRawScore()), leaderboardScore.getDisplayScore(), Long.valueOf(leaderboardScore.getTimestampMillis()), leaderboardScore.getScoreHolderDisplayName(), leaderboardScore.getScoreHolderIconImageUri(), leaderboardScore.getScoreHolderHiResImageUri(), leaderboardScore.getScoreHolder());
    }

    /* renamed from: a */
    static boolean m15521a(LeaderboardScore leaderboardScore, Object obj) {
        if (!(obj instanceof LeaderboardScore)) {
            return false;
        }
        if (leaderboardScore == obj) {
            return true;
        }
        LeaderboardScore leaderboardScore2 = (LeaderboardScore) obj;
        return C3799r.m16669a(Long.valueOf(leaderboardScore2.getRank()), Long.valueOf(leaderboardScore.getRank())) && C3799r.m16669a(leaderboardScore2.getDisplayRank(), leaderboardScore.getDisplayRank()) && C3799r.m16669a(Long.valueOf(leaderboardScore2.getRawScore()), Long.valueOf(leaderboardScore.getRawScore())) && C3799r.m16669a(leaderboardScore2.getDisplayScore(), leaderboardScore.getDisplayScore()) && C3799r.m16669a(Long.valueOf(leaderboardScore2.getTimestampMillis()), Long.valueOf(leaderboardScore.getTimestampMillis())) && C3799r.m16669a(leaderboardScore2.getScoreHolderDisplayName(), leaderboardScore.getScoreHolderDisplayName()) && C3799r.m16669a(leaderboardScore2.getScoreHolderIconImageUri(), leaderboardScore.getScoreHolderIconImageUri()) && C3799r.m16669a(leaderboardScore2.getScoreHolderHiResImageUri(), leaderboardScore.getScoreHolderHiResImageUri()) && C3799r.m16669a(leaderboardScore2.getScoreHolder(), leaderboardScore.getScoreHolder());
    }

    /* renamed from: b */
    static String m15522b(LeaderboardScore leaderboardScore) {
        return C3799r.m16670c(leaderboardScore).mo12413a("Rank", Long.valueOf(leaderboardScore.getRank())).mo12413a("DisplayRank", leaderboardScore.getDisplayRank()).mo12413a("Score", Long.valueOf(leaderboardScore.getRawScore())).mo12413a("DisplayScore", leaderboardScore.getDisplayScore()).mo12413a("Timestamp", Long.valueOf(leaderboardScore.getTimestampMillis())).mo12413a("DisplayName", leaderboardScore.getScoreHolderDisplayName()).mo12413a("IconImageUri", leaderboardScore.getScoreHolderIconImageUri()).mo12413a("HiResImageUri", leaderboardScore.getScoreHolderHiResImageUri()).mo12413a("Player", leaderboardScore.getScoreHolder() == null ? null : leaderboardScore.getScoreHolder()).toString();
    }

    /* renamed from: aH */
    public LeaderboardScore freeze() {
        return this;
    }

    public boolean equals(Object obj) {
        return m15521a(this, obj);
    }

    public String getDisplayRank() {
        return this.f15376es;
    }

    public void getDisplayRank(CharArrayBuffer charArrayBuffer) {
        C3604ao.m15693b(this.f15376es, charArrayBuffer);
    }

    public String getDisplayScore() {
        return this.f15377et;
    }

    public void getDisplayScore(CharArrayBuffer charArrayBuffer) {
        C3604ao.m15693b(this.f15377et, charArrayBuffer);
    }

    public long getRank() {
        return this.f15375er;
    }

    public long getRawScore() {
        return this.f15378eu;
    }

    public Player getScoreHolder() {
        return this.f15383ez;
    }

    public String getScoreHolderDisplayName() {
        return this.f15383ez == null ? this.f15380ew : this.f15383ez.getDisplayName();
    }

    public void getScoreHolderDisplayName(CharArrayBuffer charArrayBuffer) {
        if (this.f15383ez == null) {
            C3604ao.m15693b(this.f15380ew, charArrayBuffer);
        } else {
            this.f15383ez.getDisplayName(charArrayBuffer);
        }
    }

    public Uri getScoreHolderHiResImageUri() {
        return this.f15383ez == null ? this.f15382ey : this.f15383ez.getHiResImageUri();
    }

    public Uri getScoreHolderIconImageUri() {
        return this.f15383ez == null ? this.f15381ex : this.f15383ez.getIconImageUri();
    }

    public long getTimestampMillis() {
        return this.f15379ev;
    }

    public int hashCode() {
        return m15520a(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m15522b(this);
    }
}
