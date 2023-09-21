package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.games.C3563d;
import com.google.android.gms.games.Player;

/* renamed from: com.google.android.gms.games.multiplayer.d */
public final class C3574d extends C3523b implements Participant {

    /* renamed from: eS */
    private final C3563d f15406eS;

    public C3574d(C3525d dVar, int i) {
        super(dVar, i);
        this.f15406eS = new C3563d(dVar, i);
    }

    /* renamed from: aM */
    public String mo11268aM() {
        return getString("client_address");
    }

    /* renamed from: aN */
    public int mo11269aN() {
        return getInteger("capabilities");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return ParticipantEntity.m15542a(this, obj);
    }

    public Participant freeze() {
        return new ParticipantEntity(this);
    }

    public String getDisplayName() {
        return mo10966e("external_player_id") ? getString("default_display_name") : this.f15406eS.getDisplayName();
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        if (mo10966e("external_player_id")) {
            mo10964a("default_display_name", charArrayBuffer);
        } else {
            this.f15406eS.getDisplayName(charArrayBuffer);
        }
    }

    public Uri getHiResImageUri() {
        if (mo10966e("external_player_id")) {
            return null;
        }
        return this.f15406eS.getHiResImageUri();
    }

    public Uri getIconImageUri() {
        return mo10966e("external_player_id") ? mo10965d("default_display_image_uri") : this.f15406eS.getIconImageUri();
    }

    public String getParticipantId() {
        return getString("external_participant_id");
    }

    public Player getPlayer() {
        if (mo10966e("external_player_id")) {
            return null;
        }
        return this.f15406eS;
    }

    public int getStatus() {
        return getInteger("player_status");
    }

    public int hashCode() {
        return ParticipantEntity.m15541a(this);
    }

    public boolean isConnectedToRoom() {
        return getInteger("connected") > 0;
    }

    public String toString() {
        return ParticipantEntity.m15544b((Participant) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((ParticipantEntity) freeze()).writeToParcel(parcel, i);
    }
}
