package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.C3604ao;
import com.google.android.gms.internal.C3654av;
import com.google.android.gms.internal.C3799r;

public final class ParticipantEntity extends C3654av implements Participant {
    public static final Parcelable.Creator<ParticipantEntity> CREATOR = new C3570a();

    /* renamed from: ab */
    private final int f15393ab;

    /* renamed from: cl */
    private final String f15394cl;

    /* renamed from: dX */
    private final String f15395dX;

    /* renamed from: dk */
    private final Uri f15396dk;

    /* renamed from: dl */
    private final Uri f15397dl;

    /* renamed from: eN */
    private final int f15398eN;

    /* renamed from: eO */
    private final String f15399eO;

    /* renamed from: eP */
    private final boolean f15400eP;

    /* renamed from: eQ */
    private final PlayerEntity f15401eQ;

    /* renamed from: eR */
    private final int f15402eR;

    /* renamed from: com.google.android.gms.games.multiplayer.ParticipantEntity$a */
    static final class C3570a extends C3573c {
        C3570a() {
        }

        /* renamed from: q */
        public ParticipantEntity createFromParcel(Parcel parcel) {
            boolean z = false;
            if (ParticipantEntity.m15848c(ParticipantEntity.m16573v()) || ParticipantEntity.m16571h(ParticipantEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Uri parse = readString3 == null ? null : Uri.parse(readString3);
            String readString4 = parcel.readString();
            Uri parse2 = readString4 == null ? null : Uri.parse(readString4);
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            boolean z2 = parcel.readInt() > 0;
            if (parcel.readInt() > 0) {
                z = true;
            }
            return new ParticipantEntity(1, readString, readString2, parse, parse2, readInt, readString5, z2, z ? PlayerEntity.CREATOR.createFromParcel(parcel) : null, 7);
        }
    }

    ParticipantEntity(int i, String str, String str2, Uri uri, Uri uri2, int i2, String str3, boolean z, PlayerEntity playerEntity, int i3) {
        this.f15393ab = i;
        this.f15395dX = str;
        this.f15394cl = str2;
        this.f15396dk = uri;
        this.f15397dl = uri2;
        this.f15398eN = i2;
        this.f15399eO = str3;
        this.f15400eP = z;
        this.f15401eQ = playerEntity;
        this.f15402eR = i3;
    }

    public ParticipantEntity(Participant participant) {
        this.f15393ab = 1;
        this.f15395dX = participant.getParticipantId();
        this.f15394cl = participant.getDisplayName();
        this.f15396dk = participant.getIconImageUri();
        this.f15397dl = participant.getHiResImageUri();
        this.f15398eN = participant.getStatus();
        this.f15399eO = participant.mo11268aM();
        this.f15400eP = participant.isConnectedToRoom();
        Player player = participant.getPlayer();
        this.f15401eQ = player == null ? null : new PlayerEntity(player);
        this.f15402eR = participant.mo11269aN();
    }

    /* renamed from: a */
    static int m15541a(Participant participant) {
        return C3799r.hashCode(participant.getPlayer(), Integer.valueOf(participant.getStatus()), participant.mo11268aM(), Boolean.valueOf(participant.isConnectedToRoom()), participant.getDisplayName(), participant.getIconImageUri(), participant.getHiResImageUri(), Integer.valueOf(participant.mo11269aN()));
    }

    /* renamed from: a */
    static boolean m15542a(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return C3799r.m16669a(participant2.getPlayer(), participant.getPlayer()) && C3799r.m16669a(Integer.valueOf(participant2.getStatus()), Integer.valueOf(participant.getStatus())) && C3799r.m16669a(participant2.mo11268aM(), participant.mo11268aM()) && C3799r.m16669a(Boolean.valueOf(participant2.isConnectedToRoom()), Boolean.valueOf(participant.isConnectedToRoom())) && C3799r.m16669a(participant2.getDisplayName(), participant.getDisplayName()) && C3799r.m16669a(participant2.getIconImageUri(), participant.getIconImageUri()) && C3799r.m16669a(participant2.getHiResImageUri(), participant.getHiResImageUri()) && C3799r.m16669a(Integer.valueOf(participant2.mo11269aN()), Integer.valueOf(participant.mo11269aN()));
    }

    /* renamed from: b */
    static String m15544b(Participant participant) {
        return C3799r.m16670c(participant).mo12413a("Player", participant.getPlayer()).mo12413a("Status", Integer.valueOf(participant.getStatus())).mo12413a("ClientAddress", participant.mo11268aM()).mo12413a("ConnectedToRoom", Boolean.valueOf(participant.isConnectedToRoom())).mo12413a("DisplayName", participant.getDisplayName()).mo12413a("IconImage", participant.getIconImageUri()).mo12413a("HiResImage", participant.getHiResImageUri()).mo12413a("Capabilities", Integer.valueOf(participant.mo11269aN())).toString();
    }

    /* renamed from: aM */
    public String mo11268aM() {
        return this.f15399eO;
    }

    /* renamed from: aN */
    public int mo11269aN() {
        return this.f15402eR;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m15542a(this, obj);
    }

    public Participant freeze() {
        return this;
    }

    public String getDisplayName() {
        return this.f15401eQ == null ? this.f15394cl : this.f15401eQ.getDisplayName();
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        if (this.f15401eQ == null) {
            C3604ao.m15693b(this.f15394cl, charArrayBuffer);
        } else {
            this.f15401eQ.getDisplayName(charArrayBuffer);
        }
    }

    public Uri getHiResImageUri() {
        return this.f15401eQ == null ? this.f15397dl : this.f15401eQ.getHiResImageUri();
    }

    public Uri getIconImageUri() {
        return this.f15401eQ == null ? this.f15396dk : this.f15401eQ.getIconImageUri();
    }

    public String getParticipantId() {
        return this.f15395dX;
    }

    public Player getPlayer() {
        return this.f15401eQ;
    }

    public int getStatus() {
        return this.f15398eN;
    }

    public int hashCode() {
        return m15541a(this);
    }

    /* renamed from: i */
    public int mo11281i() {
        return this.f15393ab;
    }

    public boolean isConnectedToRoom() {
        return this.f15400eP;
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m15544b((Participant) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        int i2 = 0;
        if (!mo12354w()) {
            C3573c.m15556a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f15395dX);
        parcel.writeString(this.f15394cl);
        parcel.writeString(this.f15396dk == null ? null : this.f15396dk.toString());
        if (this.f15397dl != null) {
            str = this.f15397dl.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.f15398eN);
        parcel.writeString(this.f15399eO);
        parcel.writeInt(this.f15400eP ? 1 : 0);
        if (this.f15401eQ != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (this.f15401eQ != null) {
            this.f15401eQ.writeToParcel(parcel, i);
        }
    }
}
