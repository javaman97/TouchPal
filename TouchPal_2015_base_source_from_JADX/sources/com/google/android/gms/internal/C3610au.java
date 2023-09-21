package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.GamesClient;
import com.google.android.gms.games.OnGamesLoadedListener;
import com.google.android.gms.games.OnPlayersLoadedListener;
import com.google.android.gms.games.OnSignOutCompleteListener;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.RealTimeSocket;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.OnAchievementUpdatedListener;
import com.google.android.gms.games.achievement.OnAchievementsLoadedListener;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.OnLeaderboardMetadataLoadedListener;
import com.google.android.gms.games.leaderboard.OnLeaderboardScoresLoadedListener;
import com.google.android.gms.games.leaderboard.OnScoreSubmittedListener;
import com.google.android.gms.games.leaderboard.SubmitScoreResult;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.OnInvitationsLoadedListener;
import com.google.android.gms.games.multiplayer.ParticipantUtils;
import com.google.android.gms.games.multiplayer.realtime.C3578a;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeReliableMessageSentListener;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.internal.C3660az;
import com.google.android.gms.internal.C3778k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.au */
public final class C3610au extends C3778k<C3660az> {

    /* renamed from: dA */
    private final Map<String, C3668bb> f15477dA;

    /* renamed from: dB */
    private PlayerEntity f15478dB;

    /* renamed from: dC */
    private GameEntity f15479dC;

    /* renamed from: dD */
    private final C3664ba f15480dD;

    /* renamed from: dE */
    private boolean f15481dE = false;

    /* renamed from: dF */
    private final Binder f15482dF;

    /* renamed from: dG */
    private final long f15483dG;

    /* renamed from: dH */
    private final boolean f15484dH;

    /* renamed from: dz */
    private final String f15485dz;

    /* renamed from: g */
    private final String f15486g;

    /* renamed from: com.google.android.gms.internal.au$a */
    abstract class C3611a extends C3630c {

        /* renamed from: dI */
        private final ArrayList<String> f15487dI = new ArrayList<>();

        C3611a(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar, String[] strArr) {
            super(roomStatusUpdateListener, dVar);
            for (String add : strArr) {
                this.f15487dI.add(add);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11568a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            mo11569a(roomStatusUpdateListener, room, this.f15487dI);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo11569a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList);
    }

    /* renamed from: com.google.android.gms.internal.au$aa */
    final class C3612aa extends C3611a {
        C3612aa(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar, String[] strArr) {
            super(roomStatusUpdateListener, dVar, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11569a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeersDisconnected(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$ab */
    final class C3613ab extends C3611a {
        C3613ab(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar, String[] strArr) {
            super(roomStatusUpdateListener, dVar, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11569a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerInvitedToRoom(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$ac */
    final class C3614ac extends C3611a {
        C3614ac(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar, String[] strArr) {
            super(roomStatusUpdateListener, dVar, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11569a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerJoined(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$ad */
    final class C3615ad extends C3611a {
        C3615ad(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar, String[] strArr) {
            super(roomStatusUpdateListener, dVar, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11569a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerLeft(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$ae */
    final class C3616ae extends C3609at {

        /* renamed from: dY */
        private final OnPlayersLoadedListener f15494dY;

        C3616ae(OnPlayersLoadedListener onPlayersLoadedListener) {
            this.f15494dY = (OnPlayersLoadedListener) C3802s.m16675b(onPlayersLoadedListener, (Object) "Listener must not be null");
        }

        /* renamed from: e */
        public void mo11487e(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3617af(this.f15494dY, dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$af */
    final class C3617af extends C3778k<C3660az>.c<OnPlayersLoadedListener> {
        C3617af(OnPlayersLoadedListener onPlayersLoadedListener, C3525d dVar) {
            super(onPlayersLoadedListener, dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11571a(OnPlayersLoadedListener onPlayersLoadedListener, C3525d dVar) {
            onPlayersLoadedListener.onPlayersLoaded(dVar.getStatusCode(), new PlayerBuffer(dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$ag */
    final class C3618ag extends C3778k<C3660az>.b<RealTimeReliableMessageSentListener> {

        /* renamed from: dZ */
        private final String f15497dZ;

        /* renamed from: ea */
        private final int f15498ea;

        /* renamed from: p */
        private final int f15499p;

        C3618ag(RealTimeReliableMessageSentListener realTimeReliableMessageSentListener, int i, int i2, String str) {
            super(realTimeReliableMessageSentListener);
            this.f15499p = i;
            this.f15498ea = i2;
            this.f15497dZ = str;
        }

        /* renamed from: a */
        public void mo11573a(RealTimeReliableMessageSentListener realTimeReliableMessageSentListener) {
            if (realTimeReliableMessageSentListener != null) {
                realTimeReliableMessageSentListener.onRealTimeMessageSent(this.f15499p, this.f15498ea, this.f15497dZ);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.au$ah */
    final class C3619ah extends C3609at {

        /* renamed from: eb */
        final RealTimeReliableMessageSentListener f15501eb;

        public C3619ah(RealTimeReliableMessageSentListener realTimeReliableMessageSentListener) {
            this.f15501eb = realTimeReliableMessageSentListener;
        }

        /* renamed from: a */
        public void mo11476a(int i, int i2, String str) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3618ag(this.f15501eb, i, i2, str));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$ai */
    final class C3620ai extends C3630c {
        C3620ai(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar) {
            super(roomStatusUpdateListener, dVar);
        }

        /* renamed from: a */
        public void mo11568a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onRoomAutoMatching(room);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$aj */
    final class C3621aj extends C3609at {

        /* renamed from: ec */
        private final RoomUpdateListener f15504ec;

        /* renamed from: ed */
        private final RoomStatusUpdateListener f15505ed;

        /* renamed from: ee */
        private final RealTimeMessageReceivedListener f15506ee;

        public C3621aj(RoomUpdateListener roomUpdateListener) {
            this.f15504ec = (RoomUpdateListener) C3802s.m16675b(roomUpdateListener, (Object) "Callbacks must not be null");
            this.f15505ed = null;
            this.f15506ee = null;
        }

        public C3621aj(RoomUpdateListener roomUpdateListener, RoomStatusUpdateListener roomStatusUpdateListener, RealTimeMessageReceivedListener realTimeMessageReceivedListener) {
            this.f15504ec = (RoomUpdateListener) C3802s.m16675b(roomUpdateListener, (Object) "Callbacks must not be null");
            this.f15505ed = roomStatusUpdateListener;
            this.f15506ee = realTimeMessageReceivedListener;
        }

        /* renamed from: a */
        public void mo11480a(C3525d dVar, String[] strArr) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3613ab(this.f15505ed, dVar, strArr));
        }

        /* renamed from: b */
        public void mo11482b(C3525d dVar, String[] strArr) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3614ac(this.f15505ed, dVar, strArr));
        }

        /* renamed from: c */
        public void mo11484c(C3525d dVar, String[] strArr) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3615ad(this.f15505ed, dVar, strArr));
        }

        /* renamed from: d */
        public void mo11486d(C3525d dVar, String[] strArr) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3653z(this.f15505ed, dVar, strArr));
        }

        /* renamed from: e */
        public void mo11488e(C3525d dVar, String[] strArr) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3652y(this.f15505ed, dVar, strArr));
        }

        /* renamed from: f */
        public void mo11490f(C3525d dVar, String[] strArr) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3612aa(this.f15505ed, dVar, strArr));
        }

        /* renamed from: n */
        public void mo11498n(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3624am(this.f15504ec, dVar));
        }

        /* renamed from: o */
        public void mo11499o(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3643p(this.f15504ec, dVar));
        }

        public void onLeftRoom(int i, String str) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3648u(this.f15504ec, i, str));
        }

        public void onP2PConnected(String str) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3650w(this.f15505ed, str));
        }

        public void onP2PDisconnected(String str) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3651x(this.f15505ed, str));
        }

        public void onRealTimeMessageReceived(RealTimeMessage realTimeMessage) {
            C3656ax.m15850a("GamesClient", "RoomBinderCallbacks: onRealTimeMessageReceived");
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3649v(this.f15506ee, realTimeMessage));
        }

        /* renamed from: p */
        public void mo11506p(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3623al(this.f15505ed, dVar));
        }

        /* renamed from: q */
        public void mo11507q(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3620ai(this.f15505ed, dVar));
        }

        /* renamed from: r */
        public void mo11508r(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3622ak(this.f15504ec, dVar));
        }

        /* renamed from: s */
        public void mo11509s(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3635h(this.f15505ed, dVar));
        }

        /* renamed from: t */
        public void mo11510t(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3636i(this.f15505ed, dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$ak */
    final class C3622ak extends C3629b {
        C3622ak(RoomUpdateListener roomUpdateListener, C3525d dVar) {
            super(roomUpdateListener, dVar);
        }

        /* renamed from: a */
        public void mo11575a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onRoomConnected(i, room);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$al */
    final class C3623al extends C3630c {
        C3623al(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar) {
            super(roomStatusUpdateListener, dVar);
        }

        /* renamed from: a */
        public void mo11568a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onRoomConnecting(room);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$am */
    final class C3624am extends C3629b {
        public C3624am(RoomUpdateListener roomUpdateListener, C3525d dVar) {
            super(roomUpdateListener, dVar);
        }

        /* renamed from: a */
        public void mo11575a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onRoomCreated(i, room);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$an */
    final class C3625an extends C3609at {

        /* renamed from: ef */
        private final OnSignOutCompleteListener f15511ef;

        public C3625an(OnSignOutCompleteListener onSignOutCompleteListener) {
            this.f15511ef = (OnSignOutCompleteListener) C3802s.m16675b(onSignOutCompleteListener, (Object) "Listener must not be null");
        }

        public void onSignOutComplete() {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3626ao(this.f15511ef));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$ao */
    final class C3626ao extends C3778k<C3660az>.b<OnSignOutCompleteListener> {
        public C3626ao(OnSignOutCompleteListener onSignOutCompleteListener) {
            super(onSignOutCompleteListener);
        }

        /* renamed from: a */
        public void mo11573a(OnSignOutCompleteListener onSignOutCompleteListener) {
            onSignOutCompleteListener.onSignOutComplete();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.au$ap */
    final class C3627ap extends C3609at {

        /* renamed from: eg */
        private final OnScoreSubmittedListener f15514eg;

        public C3627ap(OnScoreSubmittedListener onScoreSubmittedListener) {
            this.f15514eg = (OnScoreSubmittedListener) C3802s.m16675b(onScoreSubmittedListener, (Object) "Listener must not be null");
        }

        /* renamed from: d */
        public void mo11485d(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3628aq(this.f15514eg, new SubmitScoreResult(dVar)));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$aq */
    final class C3628aq extends C3778k<C3660az>.b<OnScoreSubmittedListener> {

        /* renamed from: eh */
        private final SubmitScoreResult f15516eh;

        public C3628aq(OnScoreSubmittedListener onScoreSubmittedListener, SubmitScoreResult submitScoreResult) {
            super(onScoreSubmittedListener);
            this.f15516eh = submitScoreResult;
        }

        /* renamed from: a */
        public void mo11573a(OnScoreSubmittedListener onScoreSubmittedListener) {
            onScoreSubmittedListener.onScoreSubmitted(this.f15516eh.getStatusCode(), this.f15516eh);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.au$b */
    abstract class C3629b extends C3778k<C3660az>.c<RoomUpdateListener> {
        C3629b(RoomUpdateListener roomUpdateListener, C3525d dVar) {
            super(roomUpdateListener, dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11571a(RoomUpdateListener roomUpdateListener, C3525d dVar) {
            mo11575a(roomUpdateListener, C3610au.this.m15744x(dVar), dVar.getStatusCode());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo11575a(RoomUpdateListener roomUpdateListener, Room room, int i);
    }

    /* renamed from: com.google.android.gms.internal.au$c */
    abstract class C3630c extends C3778k<C3660az>.c<RoomStatusUpdateListener> {
        C3630c(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar) {
            super(roomStatusUpdateListener, dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11571a(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar) {
            mo11568a(roomStatusUpdateListener, C3610au.this.m15744x(dVar));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo11568a(RoomStatusUpdateListener roomStatusUpdateListener, Room room);
    }

    /* renamed from: com.google.android.gms.internal.au$d */
    final class C3631d extends C3609at {

        /* renamed from: dK */
        private final OnAchievementUpdatedListener f15520dK;

        C3631d(OnAchievementUpdatedListener onAchievementUpdatedListener) {
            this.f15520dK = (OnAchievementUpdatedListener) C3802s.m16675b(onAchievementUpdatedListener, (Object) "Listener must not be null");
        }

        public void onAchievementUpdated(int i, String str) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3632e(this.f15520dK, i, str));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$e */
    final class C3632e extends C3778k<C3660az>.b<OnAchievementUpdatedListener> {

        /* renamed from: dL */
        private final String f15522dL;

        /* renamed from: p */
        private final int f15523p;

        C3632e(OnAchievementUpdatedListener onAchievementUpdatedListener, int i, String str) {
            super(onAchievementUpdatedListener);
            this.f15523p = i;
            this.f15522dL = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11573a(OnAchievementUpdatedListener onAchievementUpdatedListener) {
            onAchievementUpdatedListener.onAchievementUpdated(this.f15523p, this.f15522dL);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.au$f */
    final class C3633f extends C3609at {

        /* renamed from: dM */
        private final OnAchievementsLoadedListener f15525dM;

        C3633f(OnAchievementsLoadedListener onAchievementsLoadedListener) {
            this.f15525dM = (OnAchievementsLoadedListener) C3802s.m16675b(onAchievementsLoadedListener, (Object) "Listener must not be null");
        }

        /* renamed from: b */
        public void mo11481b(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3634g(this.f15525dM, dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$g */
    final class C3634g extends C3778k<C3660az>.c<OnAchievementsLoadedListener> {
        C3634g(OnAchievementsLoadedListener onAchievementsLoadedListener, C3525d dVar) {
            super(onAchievementsLoadedListener, dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11571a(OnAchievementsLoadedListener onAchievementsLoadedListener, C3525d dVar) {
            onAchievementsLoadedListener.onAchievementsLoaded(dVar.getStatusCode(), new AchievementBuffer(dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$h */
    final class C3635h extends C3630c {
        C3635h(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar) {
            super(roomStatusUpdateListener, dVar);
        }

        /* renamed from: a */
        public void mo11568a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onConnectedToRoom(room);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$i */
    final class C3636i extends C3630c {
        C3636i(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar) {
            super(roomStatusUpdateListener, dVar);
        }

        /* renamed from: a */
        public void mo11568a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onDisconnectedFromRoom(room);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$j */
    final class C3637j extends C3609at {

        /* renamed from: dN */
        private final OnGamesLoadedListener f15530dN;

        C3637j(OnGamesLoadedListener onGamesLoadedListener) {
            this.f15530dN = (OnGamesLoadedListener) C3802s.m16675b(onGamesLoadedListener, (Object) "Listener must not be null");
        }

        /* renamed from: g */
        public void mo11491g(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3638k(this.f15530dN, dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$k */
    final class C3638k extends C3778k<C3660az>.c<OnGamesLoadedListener> {
        C3638k(OnGamesLoadedListener onGamesLoadedListener, C3525d dVar) {
            super(onGamesLoadedListener, dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11571a(OnGamesLoadedListener onGamesLoadedListener, C3525d dVar) {
            onGamesLoadedListener.onGamesLoaded(dVar.getStatusCode(), new GameBuffer(dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$l */
    final class C3639l extends C3609at {

        /* renamed from: dO */
        private final OnInvitationReceivedListener f15533dO;

        C3639l(OnInvitationReceivedListener onInvitationReceivedListener) {
            this.f15533dO = onInvitationReceivedListener;
        }

        /* renamed from: k */
        public void mo11495k(C3525d dVar) {
            InvitationBuffer invitationBuffer = new InvitationBuffer(dVar);
            Invitation invitation = null;
            try {
                if (invitationBuffer.getCount() > 0) {
                    invitation = (Invitation) ((Invitation) invitationBuffer.get(0)).freeze();
                }
                if (invitation != null) {
                    C3610au.this.mo12358a((C3778k<T>.b<?>) new C3640m(this.f15533dO, invitation));
                }
            } finally {
                invitationBuffer.close();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.au$m */
    final class C3640m extends C3778k<C3660az>.b<OnInvitationReceivedListener> {

        /* renamed from: dP */
        private final Invitation f15535dP;

        C3640m(OnInvitationReceivedListener onInvitationReceivedListener, Invitation invitation) {
            super(onInvitationReceivedListener);
            this.f15535dP = invitation;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11573a(OnInvitationReceivedListener onInvitationReceivedListener) {
            onInvitationReceivedListener.onInvitationReceived(this.f15535dP);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.au$n */
    final class C3641n extends C3609at {

        /* renamed from: dQ */
        private final OnInvitationsLoadedListener f15537dQ;

        C3641n(OnInvitationsLoadedListener onInvitationsLoadedListener) {
            this.f15537dQ = onInvitationsLoadedListener;
        }

        /* renamed from: j */
        public void mo11494j(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3642o(this.f15537dQ, dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$o */
    final class C3642o extends C3778k<C3660az>.c<OnInvitationsLoadedListener> {
        C3642o(OnInvitationsLoadedListener onInvitationsLoadedListener, C3525d dVar) {
            super(onInvitationsLoadedListener, dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11571a(OnInvitationsLoadedListener onInvitationsLoadedListener, C3525d dVar) {
            onInvitationsLoadedListener.onInvitationsLoaded(dVar.getStatusCode(), new InvitationBuffer(dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$p */
    final class C3643p extends C3629b {
        public C3643p(RoomUpdateListener roomUpdateListener, C3525d dVar) {
            super(roomUpdateListener, dVar);
        }

        /* renamed from: a */
        public void mo11575a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onJoinedRoom(i, room);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$q */
    final class C3644q extends C3609at {

        /* renamed from: dR */
        private final OnLeaderboardScoresLoadedListener f15541dR;

        C3644q(OnLeaderboardScoresLoadedListener onLeaderboardScoresLoadedListener) {
            this.f15541dR = (OnLeaderboardScoresLoadedListener) C3802s.m16675b(onLeaderboardScoresLoadedListener, (Object) "Listener must not be null");
        }

        /* renamed from: a */
        public void mo11479a(C3525d dVar, C3525d dVar2) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3645r(this.f15541dR, dVar, dVar2));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$r */
    final class C3645r extends C3778k<C3660az>.b<OnLeaderboardScoresLoadedListener> {

        /* renamed from: dS */
        private final C3525d f15543dS;

        /* renamed from: dT */
        private final C3525d f15544dT;

        C3645r(OnLeaderboardScoresLoadedListener onLeaderboardScoresLoadedListener, C3525d dVar, C3525d dVar2) {
            super(onLeaderboardScoresLoadedListener);
            this.f15543dS = dVar;
            this.f15544dT = dVar2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11573a(OnLeaderboardScoresLoadedListener onLeaderboardScoresLoadedListener) {
            C3525d dVar;
            C3525d dVar2 = null;
            C3525d dVar3 = this.f15543dS;
            C3525d dVar4 = this.f15544dT;
            if (onLeaderboardScoresLoadedListener != null) {
                try {
                    onLeaderboardScoresLoadedListener.onLeaderboardScoresLoaded(dVar4.getStatusCode(), new LeaderboardBuffer(dVar3), new LeaderboardScoreBuffer(dVar4));
                    dVar = null;
                } catch (Throwable th) {
                    if (dVar3 != null) {
                        dVar3.close();
                    }
                    if (dVar4 != null) {
                        dVar4.close();
                    }
                    throw th;
                }
            } else {
                dVar2 = dVar4;
                dVar = dVar3;
            }
            if (dVar != null) {
                dVar.close();
            }
            if (dVar2 != null) {
                dVar2.close();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
            if (this.f15543dS != null) {
                this.f15543dS.close();
            }
            if (this.f15544dT != null) {
                this.f15544dT.close();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.au$s */
    final class C3646s extends C3609at {

        /* renamed from: dU */
        private final OnLeaderboardMetadataLoadedListener f15546dU;

        C3646s(OnLeaderboardMetadataLoadedListener onLeaderboardMetadataLoadedListener) {
            this.f15546dU = (OnLeaderboardMetadataLoadedListener) C3802s.m16675b(onLeaderboardMetadataLoadedListener, (Object) "Listener must not be null");
        }

        /* renamed from: c */
        public void mo11483c(C3525d dVar) {
            C3610au.this.mo12358a((C3778k<T>.b<?>) new C3647t(this.f15546dU, dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$t */
    final class C3647t extends C3778k<C3660az>.c<OnLeaderboardMetadataLoadedListener> {
        C3647t(OnLeaderboardMetadataLoadedListener onLeaderboardMetadataLoadedListener, C3525d dVar) {
            super(onLeaderboardMetadataLoadedListener, dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11571a(OnLeaderboardMetadataLoadedListener onLeaderboardMetadataLoadedListener, C3525d dVar) {
            onLeaderboardMetadataLoadedListener.onLeaderboardMetadataLoaded(dVar.getStatusCode(), new LeaderboardBuffer(dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.au$u */
    final class C3648u extends C3778k<C3660az>.b<RoomUpdateListener> {

        /* renamed from: dV */
        private final String f15549dV;

        /* renamed from: p */
        private final int f15550p;

        C3648u(RoomUpdateListener roomUpdateListener, int i, String str) {
            super(roomUpdateListener);
            this.f15550p = i;
            this.f15549dV = str;
        }

        /* renamed from: a */
        public void mo11573a(RoomUpdateListener roomUpdateListener) {
            roomUpdateListener.onLeftRoom(this.f15550p, this.f15549dV);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.au$v */
    final class C3649v extends C3778k<C3660az>.b<RealTimeMessageReceivedListener> {

        /* renamed from: dW */
        private final RealTimeMessage f15552dW;

        C3649v(RealTimeMessageReceivedListener realTimeMessageReceivedListener, RealTimeMessage realTimeMessage) {
            super(realTimeMessageReceivedListener);
            this.f15552dW = realTimeMessage;
        }

        /* renamed from: a */
        public void mo11573a(RealTimeMessageReceivedListener realTimeMessageReceivedListener) {
            C3656ax.m15850a("GamesClient", "Deliver Message received callback");
            if (realTimeMessageReceivedListener != null) {
                realTimeMessageReceivedListener.onRealTimeMessageReceived(this.f15552dW);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.au$w */
    final class C3650w extends C3778k<C3660az>.b<RoomStatusUpdateListener> {

        /* renamed from: dX */
        private final String f15554dX;

        C3650w(RoomStatusUpdateListener roomStatusUpdateListener, String str) {
            super(roomStatusUpdateListener);
            this.f15554dX = str;
        }

        /* renamed from: a */
        public void mo11573a(RoomStatusUpdateListener roomStatusUpdateListener) {
            if (roomStatusUpdateListener != null) {
                roomStatusUpdateListener.onP2PConnected(this.f15554dX);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.au$x */
    final class C3651x extends C3778k<C3660az>.b<RoomStatusUpdateListener> {

        /* renamed from: dX */
        private final String f15556dX;

        C3651x(RoomStatusUpdateListener roomStatusUpdateListener, String str) {
            super(roomStatusUpdateListener);
            this.f15556dX = str;
        }

        /* renamed from: a */
        public void mo11573a(RoomStatusUpdateListener roomStatusUpdateListener) {
            if (roomStatusUpdateListener != null) {
                roomStatusUpdateListener.onP2PDisconnected(this.f15556dX);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.au$y */
    final class C3652y extends C3611a {
        C3652y(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar, String[] strArr) {
            super(roomStatusUpdateListener, dVar, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11569a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeersConnected(room, arrayList);
        }
    }

    /* renamed from: com.google.android.gms.internal.au$z */
    final class C3653z extends C3611a {
        C3653z(RoomStatusUpdateListener roomStatusUpdateListener, C3525d dVar, String[] strArr) {
            super(roomStatusUpdateListener, dVar, strArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11569a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerDeclined(room, arrayList);
        }
    }

    public C3610au(Context context, String str, String str2, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener, String[] strArr, int i, View view, boolean z) {
        super(context, connectionCallbacks, onConnectionFailedListener, strArr);
        this.f15485dz = str;
        this.f15486g = (String) C3802s.m16678d(str2);
        this.f15482dF = new Binder();
        this.f15477dA = new HashMap();
        this.f15480dD = C3664ba.m16084a(this, i);
        setViewForPopups(view);
        this.f15483dG = (long) hashCode();
        this.f15484dH = z;
    }

    /* renamed from: av */
    private void m15741av() {
        this.f15478dB = null;
    }

    /* renamed from: aw */
    private void m15742aw() {
        for (C3668bb close : this.f15477dA.values()) {
            try {
                close.close();
            } catch (IOException e) {
                C3656ax.m15851a("GamesClient", "IOException:", e);
            }
        }
        this.f15477dA.clear();
    }

    /* renamed from: t */
    private C3668bb m15743t(String str) {
        try {
            String v = ((C3660az) mo12357C()).mo11670v(str);
            if (v == null) {
                return null;
            }
            C3656ax.m15854d("GamesClient", "Creating a socket to bind to:" + v);
            LocalSocket localSocket = new LocalSocket();
            try {
                localSocket.connect(new LocalSocketAddress(v));
                C3668bb bbVar = new C3668bb(localSocket, str);
                this.f15477dA.put(str, bbVar);
                return bbVar;
            } catch (IOException e) {
                C3656ax.m15853c("GamesClient", "connect() call failed on socket: " + e.getMessage());
                return null;
            }
        } catch (RemoteException e2) {
            C3656ax.m15853c("GamesClient", "Unable to create socket. Service died.");
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public Room m15744x(C3525d dVar) {
        C3578a aVar = new C3578a(dVar);
        Room room = null;
        try {
            if (aVar.getCount() > 0) {
                room = (Room) ((Room) aVar.get(0)).freeze();
            }
            return room;
        } finally {
            aVar.close();
        }
    }

    /* renamed from: a */
    public int mo11514a(byte[] bArr, String str, String[] strArr) {
        C3802s.m16675b(strArr, (Object) "Participant IDs must not be null");
        try {
            return ((C3660az) mo12357C()).mo11622b(bArr, str, strArr);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11515a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null) {
            this.f15481dE = bundle.getBoolean("show_welcome_popup");
        }
        super.mo11515a(i, iBinder, bundle);
    }

    /* renamed from: a */
    public void mo11516a(IBinder iBinder, Bundle bundle) {
        if (isConnected()) {
            try {
                ((C3660az) mo12357C()).mo11596a(iBinder, bundle);
            } catch (RemoteException e) {
                C3656ax.m15852b("GamesClient", "service died");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11517a(ConnectionResult connectionResult) {
        super.mo11517a(connectionResult);
        this.f15481dE = false;
    }

    /* renamed from: a */
    public void mo11518a(OnPlayersLoadedListener onPlayersLoadedListener, int i, boolean z, boolean z2) {
        try {
            ((C3660az) mo12357C()).mo11599a((C3657ay) new C3616ae(onPlayersLoadedListener), i, z, z2);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    /* renamed from: a */
    public void mo11519a(OnAchievementUpdatedListener onAchievementUpdatedListener, String str) {
        try {
            ((C3660az) mo12357C()).mo11610a((C3657ay) onAchievementUpdatedListener == null ? null : new C3631d(onAchievementUpdatedListener), str, this.f15480dD.mo11686aD(), this.f15480dD.mo11685aC());
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    /* renamed from: a */
    public void mo11520a(OnAchievementUpdatedListener onAchievementUpdatedListener, String str, int i) {
        try {
            ((C3660az) mo12357C()).mo11606a((C3657ay) onAchievementUpdatedListener == null ? null : new C3631d(onAchievementUpdatedListener), str, i, this.f15480dD.mo11686aD(), this.f15480dD.mo11685aC());
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    /* renamed from: a */
    public void mo11521a(OnScoreSubmittedListener onScoreSubmittedListener, String str, long j) {
        try {
            ((C3660az) mo12357C()).mo11609a((C3657ay) onScoreSubmittedListener == null ? null : new C3627ap(onScoreSubmittedListener), str, j);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11522a(C3793p pVar, C3778k.C3782d dVar) throws RemoteException {
        String locale = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.f15484dH);
        pVar.mo12400a(dVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), this.f15486g, mo12361x(), this.f15485dz, this.f15480dD.mo11686aD(), locale, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11523a(String... strArr) {
        boolean z = false;
        boolean z2 = false;
        for (String str : strArr) {
            if (str.equals(Scopes.GAMES)) {
                z2 = true;
            } else if (str.equals("https://www.googleapis.com/auth/games.firstparty")) {
                z = true;
            }
        }
        if (z) {
            C3802s.m16673a(!z2, String.format("Cannot have both %s and %s!", new Object[]{Scopes.GAMES, "https://www.googleapis.com/auth/games.firstparty"}));
            return;
        }
        C3802s.m16673a(z2, String.format("GamesClient requires %s to function.", new Object[]{Scopes.GAMES}));
    }

    /* renamed from: ax */
    public void mo11524ax() {
        if (isConnected()) {
            try {
                ((C3660az) mo12357C()).mo11619ax();
            } catch (RemoteException e) {
                C3656ax.m15852b("GamesClient", "service died");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo11525b() {
        return "com.google.android.gms.games.service.START";
    }

    /* renamed from: b */
    public void mo11526b(OnAchievementUpdatedListener onAchievementUpdatedListener, String str) {
        try {
            ((C3660az) mo12357C()).mo11630b((C3657ay) onAchievementUpdatedListener == null ? null : new C3631d(onAchievementUpdatedListener), str, this.f15480dD.mo11686aD(), this.f15480dD.mo11685aC());
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo11528c() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public void clearNotifications(int i) {
        try {
            ((C3660az) mo12357C()).clearNotifications(i);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void connect() {
        m15741av();
        super.connect();
    }

    public void createRoom(RoomConfig roomConfig) {
        try {
            ((C3660az) mo12357C()).mo11602a((C3657ay) new C3621aj(roomConfig.getRoomUpdateListener(), roomConfig.getRoomStatusUpdateListener(), roomConfig.getMessageReceivedListener()), (IBinder) this.f15482dF, roomConfig.getVariant(), roomConfig.getInvitedPlayerIds(), roomConfig.getAutoMatchCriteria(), roomConfig.isSocketEnabled(), this.f15483dG);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void disconnect() {
        this.f15481dE = false;
        if (isConnected()) {
            try {
                C3660az azVar = (C3660az) mo12357C();
                azVar.mo11619ax();
                azVar.mo11624b(this.f15483dG);
                azVar.mo11595a(this.f15483dG);
            } catch (RemoteException e) {
                C3656ax.m15852b("GamesClient", "Failed to notify client disconnect.");
            }
        }
        m15742aw();
        super.disconnect();
    }

    public Intent getAchievementsIntent() {
        mo12356B();
        Intent intent = new Intent("com.google.android.gms.games.VIEW_ACHIEVEMENTS");
        intent.addFlags(Engine.CHANGE_LOCAL_CLOUD_SEARCH);
        return C3655aw.m15849b(intent);
    }

    public Intent getAllLeaderboardsIntent() {
        mo12356B();
        Intent intent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARDS");
        intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", this.f15485dz);
        intent.addFlags(Engine.CHANGE_LOCAL_CLOUD_SEARCH);
        return C3655aw.m15849b(intent);
    }

    public String getAppId() {
        try {
            return ((C3660az) mo12357C()).getAppId();
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
            return null;
        }
    }

    public String getCurrentAccountName() {
        try {
            return ((C3660az) mo12357C()).getCurrentAccountName();
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
            return null;
        }
    }

    public Game getCurrentGame() {
        GameBuffer gameBuffer;
        mo12356B();
        synchronized (this) {
            if (this.f15479dC == null) {
                try {
                    gameBuffer = new GameBuffer(((C3660az) mo12357C()).mo11618aA());
                    if (gameBuffer.getCount() > 0) {
                        this.f15479dC = (GameEntity) gameBuffer.get(0).freeze();
                    }
                    gameBuffer.close();
                } catch (RemoteException e) {
                    C3656ax.m15852b("GamesClient", "service died");
                } catch (Throwable th) {
                    gameBuffer.close();
                    throw th;
                }
            }
        }
        return this.f15479dC;
    }

    public Player getCurrentPlayer() {
        PlayerBuffer playerBuffer;
        mo12356B();
        synchronized (this) {
            if (this.f15478dB == null) {
                try {
                    playerBuffer = new PlayerBuffer(((C3660az) mo12357C()).mo11620ay());
                    if (playerBuffer.getCount() > 0) {
                        this.f15478dB = (PlayerEntity) playerBuffer.get(0).freeze();
                    }
                    playerBuffer.close();
                } catch (RemoteException e) {
                    C3656ax.m15852b("GamesClient", "service died");
                } catch (Throwable th) {
                    playerBuffer.close();
                    throw th;
                }
            }
        }
        return this.f15478dB;
    }

    public String getCurrentPlayerId() {
        try {
            return ((C3660az) mo12357C()).getCurrentPlayerId();
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
            return null;
        }
    }

    public Intent getInvitationInboxIntent() {
        mo12356B();
        Intent intent = new Intent("com.google.android.gms.games.SHOW_INVITATIONS");
        intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", this.f15485dz);
        return C3655aw.m15849b(intent);
    }

    public Intent getLeaderboardIntent(String str) {
        mo12356B();
        Intent intent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARD_SCORES");
        intent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", str);
        intent.addFlags(Engine.CHANGE_LOCAL_CLOUD_SEARCH);
        return C3655aw.m15849b(intent);
    }

    public RealTimeSocket getRealTimeSocketForParticipant(String str, String str2) {
        if (str2 == null || !ParticipantUtils.m15551z(str2)) {
            throw new IllegalArgumentException("Bad participant ID");
        }
        C3668bb bbVar = this.f15477dA.get(str2);
        return (bbVar == null || bbVar.isClosed()) ? m15743t(str2) : bbVar;
    }

    public Intent getRealTimeWaitingRoomIntent(Room room, int i) {
        mo12356B();
        Intent intent = new Intent("com.google.android.gms.games.SHOW_REAL_TIME_WAITING_ROOM");
        C3802s.m16675b(room, (Object) "Room parameter must not be null");
        intent.putExtra(GamesClient.EXTRA_ROOM, (Parcelable) room.freeze());
        C3802s.m16673a(i >= 0, "minParticipantsToStart must be >= 0");
        intent.putExtra("com.google.android.gms.games.MIN_PARTICIPANTS_TO_START", i);
        return C3655aw.m15849b(intent);
    }

    public Intent getSelectPlayersIntent(int i, int i2) {
        mo12356B();
        Intent intent = new Intent("com.google.android.gms.games.SELECT_PLAYERS");
        intent.putExtra("com.google.android.gms.games.MIN_SELECTIONS", i);
        intent.putExtra("com.google.android.gms.games.MAX_SELECTIONS", i2);
        return C3655aw.m15849b(intent);
    }

    public Intent getSettingsIntent() {
        mo12356B();
        Intent intent = new Intent("com.google.android.gms.games.SHOW_SETTINGS");
        intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", this.f15485dz);
        intent.addFlags(Engine.CHANGE_LOCAL_CLOUD_SEARCH);
        return C3655aw.m15849b(intent);
    }

    /* renamed from: h */
    public void mo11544h(String str, int i) {
        try {
            ((C3660az) mo12357C()).mo11660h(str, i);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    /* renamed from: i */
    public void mo11545i(String str, int i) {
        try {
            ((C3660az) mo12357C()).mo11663i(str, i);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void joinRoom(RoomConfig roomConfig) {
        try {
            ((C3660az) mo12357C()).mo11603a((C3657ay) new C3621aj(roomConfig.getRoomUpdateListener(), roomConfig.getRoomStatusUpdateListener(), roomConfig.getMessageReceivedListener()), (IBinder) this.f15482dF, roomConfig.getInvitationId(), roomConfig.isSocketEnabled(), this.f15483dG);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void leaveRoom(RoomUpdateListener roomUpdateListener, String str) {
        try {
            ((C3660az) mo12357C()).mo11649e((C3657ay) new C3621aj(roomUpdateListener), str);
            m15742aw();
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void loadAchievements(OnAchievementsLoadedListener onAchievementsLoadedListener, boolean z) {
        try {
            ((C3660az) mo12357C()).mo11635b((C3657ay) new C3633f(onAchievementsLoadedListener), z);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void loadGame(OnGamesLoadedListener onGamesLoadedListener) {
        try {
            ((C3660az) mo12357C()).mo11643d(new C3637j(onGamesLoadedListener));
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void loadInvitations(OnInvitationsLoadedListener onInvitationsLoadedListener) {
        try {
            ((C3660az) mo12357C()).mo11647e(new C3641n(onInvitationsLoadedListener));
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onLeaderboardMetadataLoadedListener, String str, boolean z) {
        try {
            ((C3660az) mo12357C()).mo11640c((C3657ay) new C3646s(onLeaderboardMetadataLoadedListener), str, z);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onLeaderboardMetadataLoadedListener, boolean z) {
        try {
            ((C3660az) mo12357C()).mo11641c((C3657ay) new C3646s(onLeaderboardMetadataLoadedListener), z);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void loadMoreScores(OnLeaderboardScoresLoadedListener onLeaderboardScoresLoadedListener, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
        try {
            ((C3660az) mo12357C()).mo11601a((C3657ay) new C3644q(onLeaderboardScoresLoadedListener), leaderboardScoreBuffer.mo11220aF().mo11239aG(), i, i2);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void loadPlayer(OnPlayersLoadedListener onPlayersLoadedListener, String str) {
        try {
            ((C3660az) mo12357C()).mo11638c((C3657ay) new C3616ae(onPlayersLoadedListener), str);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void loadPlayerCenteredScores(OnLeaderboardScoresLoadedListener onLeaderboardScoresLoadedListener, String str, int i, int i2, int i3, boolean z) {
        try {
            ((C3660az) mo12357C()).mo11628b(new C3644q(onLeaderboardScoresLoadedListener), str, i, i2, i3, z);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void loadTopScores(OnLeaderboardScoresLoadedListener onLeaderboardScoresLoadedListener, String str, int i, int i2, int i3, boolean z) {
        try {
            ((C3660az) mo12357C()).mo11605a(new C3644q(onLeaderboardScoresLoadedListener), str, i, i2, i3, z);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C3660az mo11527c(IBinder iBinder) {
        return C3660az.C3661a.m16004o(iBinder);
    }

    public void registerInvitationListener(OnInvitationReceivedListener onInvitationReceivedListener) {
        try {
            ((C3660az) mo12357C()).mo11600a((C3657ay) new C3639l(onInvitationReceivedListener), this.f15483dG);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public int sendReliableRealTimeMessage(RealTimeReliableMessageSentListener realTimeReliableMessageSentListener, byte[] bArr, String str, String str2) {
        try {
            return ((C3660az) mo12357C()).mo11594a((C3657ay) new C3619ah(realTimeReliableMessageSentListener), bArr, str, str2);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
            return -1;
        }
    }

    public int sendUnreliableRealTimeMessageToAll(byte[] bArr, String str) {
        try {
            return ((C3660az) mo12357C()).mo11622b(bArr, str, (String[]) null);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
            return -1;
        }
    }

    public void setGravityForPopups(int i) {
        this.f15480dD.setGravity(i);
    }

    public void setUseNewPlayerNotificationsFirstParty(boolean z) {
        try {
            ((C3660az) mo12357C()).setUseNewPlayerNotificationsFirstParty(z);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void setViewForPopups(View view) {
        this.f15480dD.mo11683a(view);
    }

    public void signOut(OnSignOutCompleteListener onSignOutCompleteListener) {
        try {
            ((C3660az) mo12357C()).mo11597a((C3657ay) onSignOutCompleteListener == null ? null : new C3625an(onSignOutCompleteListener));
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    public void unregisterInvitationListener() {
        try {
            ((C3660az) mo12357C()).mo11624b(this.f15483dG);
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo11566y() {
        super.mo11566y();
        if (this.f15481dE) {
            this.f15480dD.mo11684aB();
            this.f15481dE = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Bundle mo11567z() {
        try {
            Bundle z = ((C3660az) mo12357C()).mo11674z();
            if (z == null) {
                return z;
            }
            z.setClassLoader(C3610au.class.getClassLoader());
            return z;
        } catch (RemoteException e) {
            C3656ax.m15852b("GamesClient", "service died");
            return null;
        }
    }
}
