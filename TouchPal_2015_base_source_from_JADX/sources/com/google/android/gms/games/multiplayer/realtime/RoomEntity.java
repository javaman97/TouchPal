package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.C3604ao;
import com.google.android.gms.internal.C3654av;
import com.google.android.gms.internal.C3799r;
import java.util.ArrayList;

public final class RoomEntity extends C3654av implements Room {
    public static final Parcelable.Creator<RoomEntity> CREATOR = new C3577a();

    /* renamed from: ab */
    private final int f15426ab;

    /* renamed from: dV */
    private final String f15427dV;

    /* renamed from: di */
    private final String f15428di;

    /* renamed from: eG */
    private final long f15429eG;

    /* renamed from: eJ */
    private final ArrayList<ParticipantEntity> f15430eJ;

    /* renamed from: eK */
    private final int f15431eK;

    /* renamed from: fa */
    private final Bundle f15432fa;

    /* renamed from: fe */
    private final String f15433fe;

    /* renamed from: ff */
    private final int f15434ff;

    /* renamed from: fg */
    private final int f15435fg;

    /* renamed from: com.google.android.gms.games.multiplayer.realtime.RoomEntity$a */
    static final class C3577a extends C3579b {
        C3577a() {
        }

        /* renamed from: s */
        public RoomEntity createFromParcel(Parcel parcel) {
            if (RoomEntity.m15848c(RoomEntity.m16573v()) || RoomEntity.m16571h(RoomEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            Bundle readBundle = parcel.readBundle();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i = 0; i < readInt3; i++) {
                arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new RoomEntity(2, readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
        }
    }

    RoomEntity(int i, String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList<ParticipantEntity> arrayList, int i4) {
        this.f15426ab = i;
        this.f15427dV = str;
        this.f15433fe = str2;
        this.f15429eG = j;
        this.f15434ff = i2;
        this.f15428di = str3;
        this.f15431eK = i3;
        this.f15432fa = bundle;
        this.f15430eJ = arrayList;
        this.f15435fg = i4;
    }

    public RoomEntity(Room room) {
        this.f15426ab = 2;
        this.f15427dV = room.getRoomId();
        this.f15433fe = room.getCreatorId();
        this.f15429eG = room.getCreationTimestamp();
        this.f15434ff = room.getStatus();
        this.f15428di = room.getDescription();
        this.f15431eK = room.getVariant();
        this.f15432fa = room.getAutoMatchCriteria();
        ArrayList<Participant> participants = room.getParticipants();
        int size = participants.size();
        this.f15430eJ = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f15430eJ.add((ParticipantEntity) participants.get(i).freeze());
        }
        this.f15435fg = room.getAutoMatchWaitEstimateSeconds();
    }

    /* renamed from: a */
    static int m15563a(Room room) {
        return C3799r.hashCode(room.getRoomId(), room.getCreatorId(), Long.valueOf(room.getCreationTimestamp()), Integer.valueOf(room.getStatus()), room.getDescription(), Integer.valueOf(room.getVariant()), room.getAutoMatchCriteria(), room.getParticipants(), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()));
    }

    /* renamed from: a */
    static boolean m15564a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return C3799r.m16669a(room2.getRoomId(), room.getRoomId()) && C3799r.m16669a(room2.getCreatorId(), room.getCreatorId()) && C3799r.m16669a(Long.valueOf(room2.getCreationTimestamp()), Long.valueOf(room.getCreationTimestamp())) && C3799r.m16669a(Integer.valueOf(room2.getStatus()), Integer.valueOf(room.getStatus())) && C3799r.m16669a(room2.getDescription(), room.getDescription()) && C3799r.m16669a(Integer.valueOf(room2.getVariant()), Integer.valueOf(room.getVariant())) && C3799r.m16669a(room2.getAutoMatchCriteria(), room.getAutoMatchCriteria()) && C3799r.m16669a(room2.getParticipants(), room.getParticipants()) && C3799r.m16669a(Integer.valueOf(room2.getAutoMatchWaitEstimateSeconds()), Integer.valueOf(room.getAutoMatchWaitEstimateSeconds()));
    }

    /* renamed from: b */
    static String m15566b(Room room) {
        return C3799r.m16670c(room).mo12413a("RoomId", room.getRoomId()).mo12413a("CreatorId", room.getCreatorId()).mo12413a("CreationTimestamp", Long.valueOf(room.getCreationTimestamp())).mo12413a("RoomStatus", Integer.valueOf(room.getStatus())).mo12413a("Description", room.getDescription()).mo12413a("Variant", Integer.valueOf(room.getVariant())).mo12413a("AutoMatchCriteria", room.getAutoMatchCriteria()).mo12413a("Participants", room.getParticipants()).mo12413a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.getAutoMatchWaitEstimateSeconds())).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m15564a(this, obj);
    }

    public Room freeze() {
        return this;
    }

    public Bundle getAutoMatchCriteria() {
        return this.f15432fa;
    }

    public int getAutoMatchWaitEstimateSeconds() {
        return this.f15435fg;
    }

    public long getCreationTimestamp() {
        return this.f15429eG;
    }

    public String getCreatorId() {
        return this.f15433fe;
    }

    public String getDescription() {
        return this.f15428di;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        C3604ao.m15693b(this.f15428di, charArrayBuffer);
    }

    public String getParticipantId(String str) {
        int size = this.f15430eJ.size();
        for (int i = 0; i < size; i++) {
            Participant participant = this.f15430eJ.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(str)) {
                return participant.getParticipantId();
            }
        }
        return null;
    }

    public ArrayList<String> getParticipantIds() {
        int size = this.f15430eJ.size();
        ArrayList<String> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(this.f15430eJ.get(i).getParticipantId());
        }
        return arrayList;
    }

    public int getParticipantStatus(String str) {
        int size = this.f15430eJ.size();
        for (int i = 0; i < size; i++) {
            Participant participant = this.f15430eJ.get(i);
            if (participant.getParticipantId().equals(str)) {
                return participant.getStatus();
            }
        }
        throw new IllegalStateException("Participant " + str + " is not in room " + getRoomId());
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList<>(this.f15430eJ);
    }

    public String getRoomId() {
        return this.f15427dV;
    }

    public int getStatus() {
        return this.f15434ff;
    }

    public int getVariant() {
        return this.f15431eK;
    }

    public int hashCode() {
        return m15563a(this);
    }

    /* renamed from: i */
    public int mo11339i() {
        return this.f15426ab;
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m15566b((Room) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (!mo12354w()) {
            C3579b.m15573a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f15427dV);
        parcel.writeString(this.f15433fe);
        parcel.writeLong(this.f15429eG);
        parcel.writeInt(this.f15434ff);
        parcel.writeString(this.f15428di);
        parcel.writeInt(this.f15431eK);
        parcel.writeBundle(this.f15432fa);
        int size = this.f15430eJ.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f15430eJ.get(i2).writeToParcel(parcel, i);
        }
    }
}
