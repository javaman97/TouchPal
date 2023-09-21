package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.games.GamesClient;
import com.google.android.gms.internal.C3802s;
import java.util.ArrayList;
import java.util.Arrays;

public final class RoomConfig {

    /* renamed from: eF */
    private final String f15410eF;

    /* renamed from: eK */
    private final int f15411eK;

    /* renamed from: eW */
    private final RoomUpdateListener f15412eW;

    /* renamed from: eX */
    private final RoomStatusUpdateListener f15413eX;

    /* renamed from: eY */
    private final RealTimeMessageReceivedListener f15414eY;

    /* renamed from: eZ */
    private final String[] f15415eZ;

    /* renamed from: fa */
    private final Bundle f15416fa;

    /* renamed from: fb */
    private final boolean f15417fb;

    public static final class Builder {

        /* renamed from: eK */
        int f15418eK;

        /* renamed from: eW */
        final RoomUpdateListener f15419eW;

        /* renamed from: eX */
        RoomStatusUpdateListener f15420eX;

        /* renamed from: eY */
        RealTimeMessageReceivedListener f15421eY;

        /* renamed from: fa */
        Bundle f15422fa;

        /* renamed from: fb */
        boolean f15423fb;

        /* renamed from: fc */
        String f15424fc;

        /* renamed from: fd */
        ArrayList<String> f15425fd;

        private Builder(RoomUpdateListener roomUpdateListener) {
            this.f15424fc = null;
            this.f15418eK = -1;
            this.f15425fd = new ArrayList<>();
            this.f15423fb = false;
            this.f15419eW = (RoomUpdateListener) C3802s.m16675b(roomUpdateListener, (Object) "Must provide a RoomUpdateListener");
        }

        public Builder addPlayersToInvite(ArrayList<String> arrayList) {
            C3802s.m16678d(arrayList);
            this.f15425fd.addAll(arrayList);
            return this;
        }

        public Builder addPlayersToInvite(String... strArr) {
            C3802s.m16678d(strArr);
            this.f15425fd.addAll(Arrays.asList(strArr));
            return this;
        }

        public RoomConfig build() {
            return new RoomConfig(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle) {
            this.f15422fa = bundle;
            return this;
        }

        public Builder setInvitationIdToAccept(String str) {
            C3802s.m16678d(str);
            this.f15424fc = str;
            return this;
        }

        public Builder setMessageReceivedListener(RealTimeMessageReceivedListener realTimeMessageReceivedListener) {
            this.f15421eY = realTimeMessageReceivedListener;
            return this;
        }

        public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener roomStatusUpdateListener) {
            this.f15420eX = roomStatusUpdateListener;
            return this;
        }

        public Builder setSocketCommunicationEnabled(boolean z) {
            this.f15423fb = z;
            return this;
        }

        public Builder setVariant(int i) {
            this.f15418eK = i;
            return this;
        }
    }

    private RoomConfig(Builder builder) {
        this.f15412eW = builder.f15419eW;
        this.f15413eX = builder.f15420eX;
        this.f15414eY = builder.f15421eY;
        this.f15410eF = builder.f15424fc;
        this.f15411eK = builder.f15418eK;
        this.f15416fa = builder.f15422fa;
        this.f15417fb = builder.f15423fb;
        this.f15415eZ = (String[]) builder.f15425fd.toArray(new String[builder.f15425fd.size()]);
        if (this.f15414eY == null) {
            C3802s.m16673a(this.f15417fb, "Must either enable sockets OR specify a message listener");
        }
    }

    public static Builder builder(RoomUpdateListener roomUpdateListener) {
        return new Builder(roomUpdateListener);
    }

    public static Bundle createAutoMatchCriteria(int i, int i2, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt(GamesClient.EXTRA_MIN_AUTOMATCH_PLAYERS, i);
        bundle.putInt(GamesClient.EXTRA_MAX_AUTOMATCH_PLAYERS, i2);
        bundle.putLong(GamesClient.EXTRA_EXCLUSIVE_BIT_MASK, j);
        return bundle;
    }

    public Bundle getAutoMatchCriteria() {
        return this.f15416fa;
    }

    public String getInvitationId() {
        return this.f15410eF;
    }

    public String[] getInvitedPlayerIds() {
        return this.f15415eZ;
    }

    public RealTimeMessageReceivedListener getMessageReceivedListener() {
        return this.f15414eY;
    }

    public RoomStatusUpdateListener getRoomStatusUpdateListener() {
        return this.f15413eX;
    }

    public RoomUpdateListener getRoomUpdateListener() {
        return this.f15412eW;
    }

    public int getVariant() {
        return this.f15411eK;
    }

    public boolean isSocketEnabled() {
        return this.f15417fb;
    }
}
