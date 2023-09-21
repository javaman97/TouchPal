package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.C3574d;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.realtime.c */
public final class C3580c extends C3523b implements Room {

    /* renamed from: eo */
    private final int f15436eo;

    C3580c(C3525d dVar, int i, int i2) {
        super(dVar, i);
        this.f15436eo = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return RoomEntity.m15564a(this, obj);
    }

    public Room freeze() {
        return new RoomEntity(this);
    }

    public Bundle getAutoMatchCriteria() {
        if (!getBoolean("has_automatch_criteria")) {
            return null;
        }
        return RoomConfig.createAutoMatchCriteria(getInteger("automatch_min_players"), getInteger("automatch_max_players"), getLong("automatch_bit_mask"));
    }

    public int getAutoMatchWaitEstimateSeconds() {
        return getInteger("automatch_wait_estimate_sec");
    }

    public long getCreationTimestamp() {
        return getLong("creation_timestamp");
    }

    public String getCreatorId() {
        return getString("creator_external");
    }

    public String getDescription() {
        return getString("description");
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        mo10964a("description", charArrayBuffer);
    }

    public String getParticipantId(String str) {
        ArrayList<Participant> participants = getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = participants.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(str)) {
                return participant.getParticipantId();
            }
        }
        return null;
    }

    public ArrayList<String> getParticipantIds() {
        ArrayList<Participant> participants = getParticipants();
        ArrayList<String> arrayList = new ArrayList<>(this.f15436eo);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f15436eo) {
                return arrayList;
            }
            arrayList.add(participants.get(i2).getParticipantId());
            i = i2 + 1;
        }
    }

    public int getParticipantStatus(String str) {
        ArrayList<Participant> participants = getParticipants();
        int size = participants.size();
        for (int i = 0; i < size; i++) {
            Participant participant = participants.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant.getStatus();
            }
        }
        throw new IllegalStateException("Participant " + str + " is not in room " + getRoomId());
    }

    public ArrayList<Participant> getParticipants() {
        ArrayList<Participant> arrayList = new ArrayList<>(this.f15436eo);
        for (int i = 0; i < this.f15436eo; i++) {
            arrayList.add(new C3574d(this.f15258S, this.f15259V + i));
        }
        return arrayList;
    }

    public String getRoomId() {
        return getString("external_match_id");
    }

    public int getStatus() {
        return getInteger("status");
    }

    public int getVariant() {
        return getInteger("variant");
    }

    public int hashCode() {
        return RoomEntity.m15563a(this);
    }

    public String toString() {
        return RoomEntity.m15566b((Room) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((RoomEntity) freeze()).writeToParcel(parcel, i);
    }
}
