package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.cootek.smartinput5.presentations.PresentationLaunchLocalPageActivity;
import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;

/* renamed from: com.google.android.gms.games.b */
public final class C3561b extends C3523b implements Game {
    public C3561b(C3525d dVar, int i) {
        super(dVar, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return GameEntity.m15495a(this, obj);
    }

    public Game freeze() {
        return new GameEntity(this);
    }

    public int getAchievementTotalCount() {
        return getInteger("achievement_total_count");
    }

    public String getApplicationId() {
        return getString("external_game_id");
    }

    public String getDescription() {
        return getString("game_description");
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        mo10964a("game_description", charArrayBuffer);
    }

    public String getDeveloperName() {
        return getString("developer_name");
    }

    public void getDeveloperName(CharArrayBuffer charArrayBuffer) {
        mo10964a("developer_name", charArrayBuffer);
    }

    public String getDisplayName() {
        return getString("display_name");
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        mo10964a("display_name", charArrayBuffer);
    }

    public Uri getFeaturedImageUri() {
        return mo10965d("featured_image_uri");
    }

    public int getGameplayAclStatus() {
        return getInteger("gameplay_acl_status");
    }

    public Uri getHiResImageUri() {
        return mo10965d("game_hi_res_image_uri");
    }

    public Uri getIconImageUri() {
        return mo10965d("game_icon_image_uri");
    }

    public String getInstancePackageName() {
        return getString(PresentationLaunchLocalPageActivity.f10781o);
    }

    public int getLeaderboardCount() {
        return getInteger("leaderboard_count");
    }

    public String getPrimaryCategory() {
        return getString("primary_category");
    }

    public String getSecondaryCategory() {
        return getString("secondary_category");
    }

    public int hashCode() {
        return GameEntity.m15494a(this);
    }

    public boolean isInstanceInstalled() {
        return getInteger("installed") > 0;
    }

    public boolean isPlayEnabledGame() {
        return getBoolean("play_enabled_game");
    }

    public String toString() {
        return GameEntity.m15497b((Game) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((GameEntity) freeze()).writeToParcel(parcel, i);
    }
}
