package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.games.C3563d;
import com.google.android.gms.games.Player;
import com.google.android.gms.internal.C3775h;
import com.google.android.gms.internal.C3799r;

/* renamed from: com.google.android.gms.games.achievement.a */
public final class C3560a extends C3523b implements Achievement {
    C3560a(C3525d dVar, int i) {
        super(dVar, i);
    }

    public String getAchievementId() {
        return getString("external_achievement_id");
    }

    public int getCurrentSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C3775h.m16565a(z);
        return getInteger("current_steps");
    }

    public String getDescription() {
        return getString("description");
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        mo10964a("description", charArrayBuffer);
    }

    public String getFormattedCurrentSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C3775h.m16565a(z);
        return getString("formatted_current_steps");
    }

    public void getFormattedCurrentSteps(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C3775h.m16565a(z);
        mo10964a("formatted_current_steps", charArrayBuffer);
    }

    public String getFormattedTotalSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C3775h.m16565a(z);
        return getString("formatted_total_steps");
    }

    public void getFormattedTotalSteps(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C3775h.m16565a(z);
        mo10964a("formatted_total_steps", charArrayBuffer);
    }

    public long getLastUpdatedTimestamp() {
        return getLong("last_updated_timestamp");
    }

    public String getName() {
        return getString("name");
    }

    public void getName(CharArrayBuffer charArrayBuffer) {
        mo10964a("name", charArrayBuffer);
    }

    public Player getPlayer() {
        return new C3563d(this.f15258S, this.f15259V);
    }

    public Uri getRevealedImageUri() {
        return mo10965d("revealed_icon_image_uri");
    }

    public int getState() {
        return getInteger("state");
    }

    public int getTotalSteps() {
        boolean z = true;
        if (getType() != 1) {
            z = false;
        }
        C3775h.m16565a(z);
        return getInteger("total_steps");
    }

    public int getType() {
        return getInteger("type");
    }

    public Uri getUnlockedImageUri() {
        return mo10965d("unlocked_icon_image_uri");
    }

    public String toString() {
        C3799r.C3801a a = C3799r.m16670c(this).mo12413a("id", getAchievementId()).mo12413a("name", getName()).mo12413a("state", Integer.valueOf(getState())).mo12413a("type", Integer.valueOf(getType()));
        if (getType() == 1) {
            a.mo12413a("steps", getCurrentSteps() + "/" + getTotalSteps());
        }
        return a.toString();
    }
}
