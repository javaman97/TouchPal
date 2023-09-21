package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;

/* renamed from: com.google.android.gms.games.d */
public final class C3563d extends C3523b implements Player {
    public C3563d(C3525d dVar, int i) {
        super(dVar, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return PlayerEntity.m15503a(this, obj);
    }

    public Player freeze() {
        return new PlayerEntity(this);
    }

    public String getDisplayName() {
        return getString("profile_name");
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        mo10964a("profile_name", charArrayBuffer);
    }

    public Uri getHiResImageUri() {
        return mo10965d("profile_hi_res_image_uri");
    }

    public Uri getIconImageUri() {
        return mo10965d("profile_icon_image_uri");
    }

    public String getPlayerId() {
        return getString("external_player_id");
    }

    public long getRetrievedTimestamp() {
        return getLong("last_updated");
    }

    public boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    public int hashCode() {
        return PlayerEntity.m15502a(this);
    }

    public String toString() {
        return PlayerEntity.m15505b((Player) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) freeze()).writeToParcel(parcel, i);
    }
}
