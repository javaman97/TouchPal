package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.C3654av;
import com.google.android.gms.internal.C3799r;
import com.google.android.gms.internal.C3802s;
import java.util.ArrayList;

public final class InvitationEntity extends C3654av implements Invitation {
    public static final Parcelable.Creator<InvitationEntity> CREATOR = new C3569a();

    /* renamed from: ab */
    private final int f15385ab;

    /* renamed from: eE */
    private final GameEntity f15386eE;

    /* renamed from: eF */
    private final String f15387eF;

    /* renamed from: eG */
    private final long f15388eG;

    /* renamed from: eH */
    private final int f15389eH;

    /* renamed from: eI */
    private final ParticipantEntity f15390eI;

    /* renamed from: eJ */
    private final ArrayList<ParticipantEntity> f15391eJ;

    /* renamed from: eK */
    private final int f15392eK;

    /* renamed from: com.google.android.gms.games.multiplayer.InvitationEntity$a */
    static final class C3569a extends C3571a {
        C3569a() {
        }

        /* renamed from: p */
        public InvitationEntity createFromParcel(Parcel parcel) {
            if (InvitationEntity.m15848c(InvitationEntity.m16573v()) || InvitationEntity.m16571h(InvitationEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            GameEntity createFromParcel = GameEntity.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ParticipantEntity createFromParcel2 = ParticipantEntity.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new InvitationEntity(1, createFromParcel, readString, readLong, readInt, createFromParcel2, arrayList, -1);
        }
    }

    InvitationEntity(int i, GameEntity gameEntity, String str, long j, int i2, ParticipantEntity participantEntity, ArrayList<ParticipantEntity> arrayList, int i3) {
        this.f15385ab = i;
        this.f15386eE = gameEntity;
        this.f15387eF = str;
        this.f15388eG = j;
        this.f15389eH = i2;
        this.f15390eI = participantEntity;
        this.f15391eJ = arrayList;
        this.f15392eK = i3;
    }

    InvitationEntity(Invitation invitation) {
        this.f15385ab = 1;
        this.f15386eE = new GameEntity(invitation.getGame());
        this.f15387eF = invitation.getInvitationId();
        this.f15388eG = invitation.getCreationTimestamp();
        this.f15389eH = invitation.mo11250aL();
        this.f15392eK = invitation.getVariant();
        String participantId = invitation.getInviter().getParticipantId();
        Participant participant = null;
        ArrayList<Participant> participants = invitation.getParticipants();
        int size = participants.size();
        this.f15391eJ = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Participant participant2 = participants.get(i);
            if (participant2.getParticipantId().equals(participantId)) {
                participant = participant2;
            }
            this.f15391eJ.add((ParticipantEntity) participant2.freeze());
        }
        C3802s.m16675b(participant, (Object) "Must have a valid inviter!");
        this.f15390eI = (ParticipantEntity) participant.freeze();
    }

    /* renamed from: a */
    static int m15530a(Invitation invitation) {
        return C3799r.hashCode(invitation.getGame(), invitation.getInvitationId(), Long.valueOf(invitation.getCreationTimestamp()), Integer.valueOf(invitation.mo11250aL()), invitation.getInviter(), invitation.getParticipants(), Integer.valueOf(invitation.getVariant()));
    }

    /* renamed from: a */
    static boolean m15531a(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return C3799r.m16669a(invitation2.getGame(), invitation.getGame()) && C3799r.m16669a(invitation2.getInvitationId(), invitation.getInvitationId()) && C3799r.m16669a(Long.valueOf(invitation2.getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) && C3799r.m16669a(Integer.valueOf(invitation2.mo11250aL()), Integer.valueOf(invitation.mo11250aL())) && C3799r.m16669a(invitation2.getInviter(), invitation.getInviter()) && C3799r.m16669a(invitation2.getParticipants(), invitation.getParticipants()) && C3799r.m16669a(Integer.valueOf(invitation2.getVariant()), Integer.valueOf(invitation.getVariant()));
    }

    /* renamed from: b */
    static String m15533b(Invitation invitation) {
        return C3799r.m16670c(invitation).mo12413a("Game", invitation.getGame()).mo12413a("InvitationId", invitation.getInvitationId()).mo12413a("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).mo12413a("InvitationType", Integer.valueOf(invitation.mo11250aL())).mo12413a("Inviter", invitation.getInviter()).mo12413a("Participants", invitation.getParticipants()).mo12413a("Variant", Integer.valueOf(invitation.getVariant())).toString();
    }

    /* renamed from: aL */
    public int mo11250aL() {
        return this.f15389eH;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m15531a(this, obj);
    }

    public Invitation freeze() {
        return this;
    }

    public long getCreationTimestamp() {
        return this.f15388eG;
    }

    public Game getGame() {
        return this.f15386eE;
    }

    public String getInvitationId() {
        return this.f15387eF;
    }

    public Participant getInviter() {
        return this.f15390eI;
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList<>(this.f15391eJ);
    }

    public int getVariant() {
        return this.f15392eK;
    }

    public int hashCode() {
        return m15530a(this);
    }

    /* renamed from: i */
    public int mo11261i() {
        return this.f15385ab;
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m15533b((Invitation) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (!mo12354w()) {
            C3571a.m15552a(this, parcel, i);
            return;
        }
        this.f15386eE.writeToParcel(parcel, i);
        parcel.writeString(this.f15387eF);
        parcel.writeLong(this.f15388eG);
        parcel.writeInt(this.f15389eH);
        this.f15390eI.writeToParcel(parcel, i);
        int size = this.f15391eJ.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f15391eJ.get(i2).writeToParcel(parcel, i);
        }
    }
}
