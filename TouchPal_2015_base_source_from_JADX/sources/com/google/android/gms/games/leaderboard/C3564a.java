package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.internal.C3799r;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.leaderboard.a */
public final class C3564a extends C3523b implements Leaderboard {

    /* renamed from: eo */
    private final int f15373eo;

    C3564a(C3525d dVar, int i, int i2) {
        super(dVar, i);
        this.f15373eo = i2;
    }

    public String getDisplayName() {
        return getString("name");
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        mo10964a("name", charArrayBuffer);
    }

    public Uri getIconImageUri() {
        return mo10965d("board_icon_image_uri");
    }

    public String getLeaderboardId() {
        return getString("external_leaderboard_id");
    }

    public int getScoreOrder() {
        return getInteger("score_order");
    }

    public ArrayList<LeaderboardVariant> getVariants() {
        ArrayList<LeaderboardVariant> arrayList = new ArrayList<>(this.f15373eo);
        for (int i = 0; i < this.f15373eo; i++) {
            arrayList.add(new C3568e(this.f15258S, this.f15259V + i));
        }
        return arrayList;
    }

    public String toString() {
        return C3799r.m16670c(this).mo12413a("ID", getLeaderboardId()).mo12413a("DisplayName", getDisplayName()).mo12413a("IconImageURI", getIconImageUri()).mo12413a("ScoreOrder", Integer.valueOf(getScoreOrder())).toString();
    }
}
