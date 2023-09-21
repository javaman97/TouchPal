package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.C3523b;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.games.C3561b;
import com.google.android.gms.games.Game;
import com.google.android.gms.internal.C3802s;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.games.multiplayer.b */
public final class C3572b extends C3523b implements Invitation {

    /* renamed from: eJ */
    private final ArrayList<Participant> f15403eJ;

    /* renamed from: eL */
    private final Game f15404eL;

    /* renamed from: eM */
    private final C3574d f15405eM;

    C3572b(C3525d dVar, int i, int i2) {
        super(dVar, i);
        this.f15404eL = new C3561b(dVar, i);
        this.f15403eJ = new ArrayList<>(i2);
        String string = getString("external_inviter_id");
        C3574d dVar2 = null;
        for (int i3 = 0; i3 < i2; i3++) {
            C3574d dVar3 = new C3574d(this.f15258S, this.f15259V + i3);
            if (dVar3.getParticipantId().equals(string)) {
                dVar2 = dVar3;
            }
            this.f15403eJ.add(dVar3);
        }
        this.f15405eM = (C3574d) C3802s.m16675b(dVar2, (Object) "Must have a valid inviter!");
    }

    /* renamed from: aL */
    public int mo11250aL() {
        return getInteger("type");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return InvitationEntity.m15531a(this, obj);
    }

    public Invitation freeze() {
        return new InvitationEntity(this);
    }

    public long getCreationTimestamp() {
        return getLong("creation_timestamp");
    }

    public Game getGame() {
        return this.f15404eL;
    }

    public String getInvitationId() {
        return getString("external_invitation_id");
    }

    public Participant getInviter() {
        return this.f15405eM;
    }

    public ArrayList<Participant> getParticipants() {
        return this.f15403eJ;
    }

    public int getVariant() {
        return getInteger("variant");
    }

    public int hashCode() {
        return InvitationEntity.m15530a(this);
    }

    public String toString() {
        return InvitationEntity.m15533b((Invitation) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((InvitationEntity) freeze()).writeToParcel(parcel, i);
    }
}
