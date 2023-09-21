package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.C3604ao;
import com.google.android.gms.internal.C3654av;
import com.google.android.gms.internal.C3775h;
import com.google.android.gms.internal.C3799r;

public final class PlayerEntity extends C3654av implements Player {
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new C3558a();

    /* renamed from: ab */
    private final int f15361ab;

    /* renamed from: cl */
    private final String f15362cl;

    /* renamed from: dk */
    private final Uri f15363dk;

    /* renamed from: dl */
    private final Uri f15364dl;

    /* renamed from: dx */
    private final String f15365dx;

    /* renamed from: dy */
    private final long f15366dy;

    /* renamed from: com.google.android.gms.games.PlayerEntity$a */
    static final class C3558a extends C3562c {
        C3558a() {
        }

        /* renamed from: o */
        public PlayerEntity createFromParcel(Parcel parcel) {
            Uri uri = null;
            if (PlayerEntity.m15848c(PlayerEntity.m16573v()) || PlayerEntity.m16571h(PlayerEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Uri parse = readString3 == null ? null : Uri.parse(readString3);
            if (readString4 != null) {
                uri = Uri.parse(readString4);
            }
            return new PlayerEntity(1, readString, readString2, parse, uri, parcel.readLong());
        }
    }

    PlayerEntity(int i, String str, String str2, Uri uri, Uri uri2, long j) {
        this.f15361ab = i;
        this.f15365dx = str;
        this.f15362cl = str2;
        this.f15363dk = uri;
        this.f15364dl = uri2;
        this.f15366dy = j;
    }

    public PlayerEntity(Player player) {
        boolean z = true;
        this.f15361ab = 1;
        this.f15365dx = player.getPlayerId();
        this.f15362cl = player.getDisplayName();
        this.f15363dk = player.getIconImageUri();
        this.f15364dl = player.getHiResImageUri();
        this.f15366dy = player.getRetrievedTimestamp();
        C3775h.m16567b(this.f15365dx);
        C3775h.m16567b(this.f15362cl);
        C3775h.m16565a(this.f15366dy <= 0 ? false : z);
    }

    /* renamed from: a */
    static int m15502a(Player player) {
        return C3799r.hashCode(player.getPlayerId(), player.getDisplayName(), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()));
    }

    /* renamed from: a */
    static boolean m15503a(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return C3799r.m16669a(player2.getPlayerId(), player.getPlayerId()) && C3799r.m16669a(player2.getDisplayName(), player.getDisplayName()) && C3799r.m16669a(player2.getIconImageUri(), player.getIconImageUri()) && C3799r.m16669a(player2.getHiResImageUri(), player.getHiResImageUri()) && C3799r.m16669a(Long.valueOf(player2.getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp()));
    }

    /* renamed from: b */
    static String m15505b(Player player) {
        return C3799r.m16670c(player).mo12413a("PlayerId", player.getPlayerId()).mo12413a("DisplayName", player.getDisplayName()).mo12413a("IconImageUri", player.getIconImageUri()).mo12413a("HiResImageUri", player.getHiResImageUri()).mo12413a("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m15503a(this, obj);
    }

    public Player freeze() {
        return this;
    }

    public String getDisplayName() {
        return this.f15362cl;
    }

    public void getDisplayName(CharArrayBuffer charArrayBuffer) {
        C3604ao.m15693b(this.f15362cl, charArrayBuffer);
    }

    public Uri getHiResImageUri() {
        return this.f15364dl;
    }

    public Uri getIconImageUri() {
        return this.f15363dk;
    }

    public String getPlayerId() {
        return this.f15365dx;
    }

    public long getRetrievedTimestamp() {
        return this.f15366dy;
    }

    public boolean hasHiResImage() {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage() {
        return getIconImageUri() != null;
    }

    public int hashCode() {
        return m15502a(this);
    }

    /* renamed from: i */
    public int mo11161i() {
        return this.f15361ab;
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return m15505b((Player) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        if (!mo12354w()) {
            C3562c.m15513a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f15365dx);
        parcel.writeString(this.f15362cl);
        parcel.writeString(this.f15363dk == null ? null : this.f15363dk.toString());
        if (this.f15364dl != null) {
            str = this.f15364dl.toString();
        }
        parcel.writeString(str);
        parcel.writeLong(this.f15366dy);
    }
}
