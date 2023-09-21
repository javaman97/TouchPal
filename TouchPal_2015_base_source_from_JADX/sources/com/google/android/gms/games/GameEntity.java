package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C3604ao;
import com.google.android.gms.internal.C3654av;
import com.google.android.gms.internal.C3799r;

public final class GameEntity extends C3654av implements Game {
    public static final Parcelable.Creator<GameEntity> CREATOR = new C3556a();

    /* renamed from: ab */
    private final int f15337ab;

    /* renamed from: cl */
    private final String f15338cl;

    /* renamed from: df */
    private final String f15339df;

    /* renamed from: dg */
    private final String f15340dg;

    /* renamed from: dh */
    private final String f15341dh;

    /* renamed from: di */
    private final String f15342di;

    /* renamed from: dj */
    private final String f15343dj;

    /* renamed from: dk */
    private final Uri f15344dk;

    /* renamed from: dl */
    private final Uri f15345dl;

    /* renamed from: dm */
    private final Uri f15346dm;

    /* renamed from: dn */
    private final boolean f15347dn;

    /* renamed from: do */
    private final boolean f15348do;

    /* renamed from: dp */
    private final String f15349dp;

    /* renamed from: dq */
    private final int f15350dq;

    /* renamed from: dr */
    private final int f15351dr;

    /* renamed from: ds */
    private final int f15352ds;

    /* renamed from: com.google.android.gms.games.GameEntity$a */
    static final class C3556a extends C3559a {
        C3556a() {
        }

        /* renamed from: n */
        public GameEntity createFromParcel(Parcel parcel) {
            if (GameEntity.m15848c(GameEntity.m16573v()) || GameEntity.m16571h(GameEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Uri parse = readString7 == null ? null : Uri.parse(readString7);
            String readString8 = parcel.readString();
            Uri parse2 = readString8 == null ? null : Uri.parse(readString8);
            String readString9 = parcel.readString();
            return new GameEntity(1, readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString9 == null ? null : Uri.parse(readString9), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    GameEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i2, int i3, int i4) {
        this.f15337ab = i;
        this.f15339df = str;
        this.f15338cl = str2;
        this.f15340dg = str3;
        this.f15341dh = str4;
        this.f15342di = str5;
        this.f15343dj = str6;
        this.f15344dk = uri;
        this.f15345dl = uri2;
        this.f15346dm = uri3;
        this.f15347dn = z;
        this.f15348do = z2;
        this.f15349dp = str7;
        this.f15350dq = i2;
        this.f15351dr = i3;
        this.f15352ds = i4;
    }

    public GameEntity(Game game) {
        this.f15337ab = 1;
        this.f15339df = game.getApplicationId();
        this.f15340dg = game.getPrimaryCategory();
        this.f15341dh = game.getSecondaryCategory();
        this.f15342di = game.getDescription();
        this.f15343dj = game.getDeveloperName();
        this.f15338cl = game.getDisplayName();
        this.f15344dk = game.getIconImageUri();
        this.f15345dl = game.getHiResImageUri();
        this.f15346dm = game.getFeaturedImageUri();
        this.f15347dn = game.isPlayEnabledGame();
        this.f15348do = game.isInstanceInstalled();
        this.f15349dp = game.getInstancePackageName();
        this.f15350dq = game.getGameplayAclStatus();
        this.f15351dr = game.getAchievementTotalCount();
        this.f15352ds = game.getLeaderboardCount();
    }

    /* renamed from: a */
    static int m15494a(Game game) {
        return C3799r.hashCode(game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.isPlayEnabledGame()), Boolean.valueOf(game.isInstanceInstalled()), game.getInstancePackageName(), Integer.valueOf(game.getGameplayAclStatus()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()));
    }

    /* renamed from: a */
    static boolean m15495a(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        return C3799r.m16669a(game2.getApplicationId(), game.getApplicationId()) && C3799r.m16669a(game2.getDisplayName(), game.getDisplayName()) && C3799r.m16669a(game2.getPrimaryCategory(), game.getPrimaryCategory()) && C3799r.m16669a(game2.getSecondaryCategory(), game.getSecondaryCategory()) && C3799r.m16669a(game2.getDescription(), game.getDescription()) && C3799r.m16669a(game2.getDeveloperName(), game.getDeveloperName()) && C3799r.m16669a(game2.getIconImageUri(), game.getIconImageUri()) && C3799r.m16669a(game2.getHiResImageUri(), game.getHiResImageUri()) && C3799r.m16669a(game2.getFeaturedImageUri(), game.getFeaturedImageUri()) && C3799r.m16669a(Boolean.valueOf(game2.isPlayEnabledGame()), Boolean.valueOf(game.isPlayEnabledGame())) && C3799r.m16669a(Boolean.valueOf(game2.isInstanceInstalled()), Boolean.valueOf(game.isInstanceInstalled())) && C3799r.m16669a(game2.getInstancePackageName(), game.getInstancePackageName()) && C3799r.m16669a(Integer.valueOf(game2.getGameplayAclStatus()), Integer.valueOf(game.getGameplayAclStatus())) && C3799r.m16669a(Integer.valueOf(game2.getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) && C3799r.m16669a(Integer.valueOf(game2.getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount()));
    }

    /* renamed from: b */
    static String m15497b(Game game) {
        return C3799r.m16670c(game).mo12413a("ApplicationId", game.getApplicationId()).mo12413a("DisplayName", game.getDisplayName()).mo12413a("PrimaryCategory", game.getPrimaryCategory()).mo12413a("SecondaryCategory", game.getSecondaryCategory()).mo12413a("Description", game.getDescription()).mo12413a("DeveloperName", game.getDeveloperName()).mo12413a("IconImageUri", game.getIconImageUri()).mo12413a("HiResImageUri", game.getHiResImageUri()).mo12413a("FeaturedImageUri", game.getFeaturedImageUri()).mo12413a("PlayEnabledGame", Boolean.valueOf(game.isPlayEnabledGame())).mo12413a("InstanceInstalled", Boolean.valueOf(game.isInstanceInstalled())).mo12413a("InstancePackageName", game.getInstancePackageName()).mo12413a("GameplayAclStatus", Integer.valueOf(game.getGameplayAclStatus())).mo12413a("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).mo12413a("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m15495a(this, obj);
    }

    public Game freeze() {
        return this;
    }

    public int getAchievementTotalCount() {
        return this.f15351dr;
    }

    public String getApplicationId() {
        return this.f15339df;
    }

    public String getDescription() {
        return this.f15342di;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        C3604ao.m15693b(this.f15342di, charArrayBuffer);
    }

    public String getDeveloperName() {
        return this.f15343dj;
    }

    public void getDeveloperName(CharArrayBuffer charArrayBuffer) {
        C3604ao.m15693b(this.f15343dj, charArrayBuffer);
    }

    public String getDisplayName() {
        return this.f15338cl;
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        C3604ao.m15693b(this.f15338cl, charArrayBuffer);
    }

    public Uri getFeaturedImageUri() {
        return this.f15346dm;
    }

    public int getGameplayAclStatus() {
        return this.f15350dq;
    }

    public Uri getHiResImageUri() {
        return this.f15345dl;
    }

    public Uri getIconImageUri() {
        return this.f15344dk;
    }

    public String getInstancePackageName() {
        return this.f15349dp;
    }

    public int getLeaderboardCount() {
        return this.f15352ds;
    }

    public String getPrimaryCategory() {
        return this.f15340dg;
    }

    public String getSecondaryCategory() {
        return this.f15341dh;
    }

    public int hashCode() {
        return m15494a(this);
    }

    /* renamed from: i */
    public int mo11082i() {
        return this.f15337ab;
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isInstanceInstalled() {
        return this.f15348do;
    }

    public boolean isPlayEnabledGame() {
        return this.f15347dn;
    }

    public String toString() {
        return m15497b((Game) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        String str = null;
        if (!mo12354w()) {
            C3559a.m15510a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f15339df);
        parcel.writeString(this.f15338cl);
        parcel.writeString(this.f15340dg);
        parcel.writeString(this.f15341dh);
        parcel.writeString(this.f15342di);
        parcel.writeString(this.f15343dj);
        parcel.writeString(this.f15344dk == null ? null : this.f15344dk.toString());
        parcel.writeString(this.f15345dl == null ? null : this.f15345dl.toString());
        if (this.f15346dm != null) {
            str = this.f15346dm.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.f15347dn ? 1 : 0);
        if (!this.f15348do) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f15349dp);
        parcel.writeInt(this.f15350dq);
        parcel.writeInt(this.f15351dr);
        parcel.writeInt(this.f15352ds);
    }
}
