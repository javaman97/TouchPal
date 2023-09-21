package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.games.achievement.OnAchievementUpdatedListener;
import com.google.android.gms.games.achievement.OnAchievementsLoadedListener;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.OnLeaderboardMetadataLoadedListener;
import com.google.android.gms.games.leaderboard.OnLeaderboardScoresLoadedListener;
import com.google.android.gms.games.leaderboard.OnScoreSubmittedListener;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.OnInvitationsLoadedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeReliableMessageSentListener;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.internal.C3610au;
import com.google.android.gms.internal.C3802s;
import java.util.List;

public final class GamesClient implements GooglePlayServicesClient {
    public static final String EXTRA_EXCLUSIVE_BIT_MASK = "exclusive_bit_mask";
    public static final String EXTRA_INVITATION = "invitation";
    public static final String EXTRA_MAX_AUTOMATCH_PLAYERS = "max_automatch_players";
    public static final String EXTRA_MIN_AUTOMATCH_PLAYERS = "min_automatch_players";
    public static final String EXTRA_PLAYERS = "players";
    public static final String EXTRA_ROOM = "room";
    public static final int MAX_RELIABLE_MESSAGE_LEN = 1400;
    public static final int MAX_UNRELIABLE_MESSAGE_LEN = 1168;
    public static final int NOTIFICATION_TYPES_ALL = -1;
    public static final int NOTIFICATION_TYPES_MULTIPLAYER = 1;
    public static final int NOTIFICATION_TYPE_INVITATION = 1;
    public static final int STATUS_ACHIEVEMENT_NOT_INCREMENTAL = 3002;
    public static final int STATUS_ACHIEVEMENT_UNKNOWN = 3001;
    public static final int STATUS_ACHIEVEMENT_UNLOCKED = 3003;
    public static final int STATUS_ACHIEVEMENT_UNLOCK_FAILURE = 3000;
    public static final int STATUS_CLIENT_RECONNECT_REQUIRED = 2;
    public static final int STATUS_INTERNAL_ERROR = 1;
    public static final int STATUS_INVALID_REAL_TIME_ROOM_ID = 7002;
    public static final int STATUS_LICENSE_CHECK_FAILED = 7;
    public static final int STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED = 6000;
    public static final int STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER = 6001;
    public static final int STATUS_NETWORK_ERROR_NO_DATA = 4;
    public static final int STATUS_NETWORK_ERROR_OPERATION_DEFERRED = 5;
    public static final int STATUS_NETWORK_ERROR_OPERATION_FAILED = 6;
    public static final int STATUS_NETWORK_ERROR_STALE_DATA = 3;
    public static final int STATUS_OK = 0;
    public static final int STATUS_PARTICIPANT_NOT_CONNECTED = 7003;
    public static final int STATUS_REAL_TIME_CONNECTION_FAILED = 7000;
    public static final int STATUS_REAL_TIME_INACTIVE_ROOM = 7005;
    public static final int STATUS_REAL_TIME_MESSAGE_FAILED = -1;
    public static final int STATUS_REAL_TIME_MESSAGE_SEND_FAILED = 7001;
    public static final int STATUS_REAL_TIME_ROOM_NOT_JOINED = 7004;

    /* renamed from: dt */
    private final C3610au f15353dt;

    public static final class Builder {

        /* renamed from: d */
        private final GooglePlayServicesClient.ConnectionCallbacks f15354d;

        /* renamed from: du */
        private String f15355du;

        /* renamed from: dv */
        private int f15356dv = 49;

        /* renamed from: dw */
        private View f15357dw;

        /* renamed from: e */
        private final GooglePlayServicesClient.OnConnectionFailedListener f15358e;

        /* renamed from: f */
        private String[] f15359f = {Scopes.GAMES};

        /* renamed from: g */
        private String f15360g = "<<default account>>";
        private final Context mContext;

        public Builder(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.mContext = context;
            this.f15355du = context.getPackageName();
            this.f15354d = connectionCallbacks;
            this.f15358e = onConnectionFailedListener;
        }

        public GamesClient create() {
            return new GamesClient(this.mContext, this.f15355du, this.f15360g, this.f15354d, this.f15358e, this.f15359f, this.f15356dv, this.f15357dw);
        }

        public Builder setAccountName(String str) {
            this.f15360g = (String) C3802s.m16678d(str);
            return this;
        }

        public Builder setGravityForPopups(int i) {
            this.f15356dv = i;
            return this;
        }

        public Builder setScopes(String... strArr) {
            this.f15359f = strArr;
            return this;
        }

        public Builder setViewForPopups(View view) {
            this.f15357dw = (View) C3802s.m16678d(view);
            return this;
        }
    }

    private GamesClient(Context context, String str, String str2, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener, String[] strArr, int i, View view) {
        this.f15353dt = new C3610au(context, str, str2, connectionCallbacks, onConnectionFailedListener, strArr, i, view, false);
    }

    public void clearAllNotifications() {
        this.f15353dt.clearNotifications(-1);
    }

    public void clearNotifications(int i) {
        this.f15353dt.clearNotifications(i);
    }

    public void connect() {
        this.f15353dt.connect();
    }

    public void createRoom(RoomConfig roomConfig) {
        this.f15353dt.createRoom(roomConfig);
    }

    public void declineRoomInvitation(String str) {
        this.f15353dt.mo11545i(str, 0);
    }

    public void disconnect() {
        this.f15353dt.disconnect();
    }

    public void dismissRoomInvitation(String str) {
        this.f15353dt.mo11544h(str, 0);
    }

    public Intent getAchievementsIntent() {
        return this.f15353dt.getAchievementsIntent();
    }

    public Intent getAllLeaderboardsIntent() {
        return this.f15353dt.getAllLeaderboardsIntent();
    }

    public String getAppId() {
        return this.f15353dt.getAppId();
    }

    public String getCurrentAccountName() {
        return this.f15353dt.getCurrentAccountName();
    }

    public Game getCurrentGame() {
        return this.f15353dt.getCurrentGame();
    }

    public Player getCurrentPlayer() {
        return this.f15353dt.getCurrentPlayer();
    }

    public String getCurrentPlayerId() {
        return this.f15353dt.getCurrentPlayerId();
    }

    public Intent getInvitationInboxIntent() {
        return this.f15353dt.getInvitationInboxIntent();
    }

    public Intent getLeaderboardIntent(String str) {
        return this.f15353dt.getLeaderboardIntent(str);
    }

    public RealTimeSocket getRealTimeSocketForParticipant(String str, String str2) {
        return this.f15353dt.getRealTimeSocketForParticipant(str, str2);
    }

    public Intent getRealTimeWaitingRoomIntent(Room room, int i) {
        return this.f15353dt.getRealTimeWaitingRoomIntent(room, i);
    }

    public Intent getSelectPlayersIntent(int i, int i2) {
        return this.f15353dt.getSelectPlayersIntent(i, i2);
    }

    public Intent getSettingsIntent() {
        return this.f15353dt.getSettingsIntent();
    }

    public void incrementAchievement(String str, int i) {
        this.f15353dt.mo11520a((OnAchievementUpdatedListener) null, str, i);
    }

    public void incrementAchievementImmediate(OnAchievementUpdatedListener onAchievementUpdatedListener, String str, int i) {
        this.f15353dt.mo11520a(onAchievementUpdatedListener, str, i);
    }

    public boolean isConnected() {
        return this.f15353dt.isConnected();
    }

    public boolean isConnecting() {
        return this.f15353dt.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        return this.f15353dt.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f15353dt.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    public void joinRoom(RoomConfig roomConfig) {
        this.f15353dt.joinRoom(roomConfig);
    }

    public void leaveRoom(RoomUpdateListener roomUpdateListener, String str) {
        this.f15353dt.leaveRoom(roomUpdateListener, str);
    }

    public void loadAchievements(OnAchievementsLoadedListener onAchievementsLoadedListener, boolean z) {
        this.f15353dt.loadAchievements(onAchievementsLoadedListener, z);
    }

    public void loadGame(OnGamesLoadedListener onGamesLoadedListener) {
        this.f15353dt.loadGame(onGamesLoadedListener);
    }

    public void loadInvitablePlayers(OnPlayersLoadedListener onPlayersLoadedListener, int i, boolean z) {
        this.f15353dt.mo11518a(onPlayersLoadedListener, i, false, z);
    }

    public void loadInvitations(OnInvitationsLoadedListener onInvitationsLoadedListener) {
        this.f15353dt.loadInvitations(onInvitationsLoadedListener);
    }

    @Deprecated
    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onLeaderboardMetadataLoadedListener) {
        loadLeaderboardMetadata(onLeaderboardMetadataLoadedListener, false);
    }

    @Deprecated
    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onLeaderboardMetadataLoadedListener, String str) {
        loadLeaderboardMetadata(onLeaderboardMetadataLoadedListener, str, false);
    }

    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onLeaderboardMetadataLoadedListener, String str, boolean z) {
        this.f15353dt.loadLeaderboardMetadata(onLeaderboardMetadataLoadedListener, str, z);
    }

    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onLeaderboardMetadataLoadedListener, boolean z) {
        this.f15353dt.loadLeaderboardMetadata(onLeaderboardMetadataLoadedListener, z);
    }

    public void loadMoreInvitablePlayers(OnPlayersLoadedListener onPlayersLoadedListener, int i) {
        this.f15353dt.mo11518a(onPlayersLoadedListener, i, true, false);
    }

    public void loadMoreScores(OnLeaderboardScoresLoadedListener onLeaderboardScoresLoadedListener, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
        this.f15353dt.loadMoreScores(onLeaderboardScoresLoadedListener, leaderboardScoreBuffer, i, i2);
    }

    public void loadPlayer(OnPlayersLoadedListener onPlayersLoadedListener, String str) {
        this.f15353dt.loadPlayer(onPlayersLoadedListener, str);
    }

    public void loadPlayerCenteredScores(OnLeaderboardScoresLoadedListener onLeaderboardScoresLoadedListener, String str, int i, int i2, int i3) {
        this.f15353dt.loadPlayerCenteredScores(onLeaderboardScoresLoadedListener, str, i, i2, i3, false);
    }

    public void loadPlayerCenteredScores(OnLeaderboardScoresLoadedListener onLeaderboardScoresLoadedListener, String str, int i, int i2, int i3, boolean z) {
        this.f15353dt.loadPlayerCenteredScores(onLeaderboardScoresLoadedListener, str, i, i2, i3, z);
    }

    public void loadTopScores(OnLeaderboardScoresLoadedListener onLeaderboardScoresLoadedListener, String str, int i, int i2, int i3) {
        this.f15353dt.loadTopScores(onLeaderboardScoresLoadedListener, str, i, i2, i3, false);
    }

    public void loadTopScores(OnLeaderboardScoresLoadedListener onLeaderboardScoresLoadedListener, String str, int i, int i2, int i3, boolean z) {
        this.f15353dt.loadTopScores(onLeaderboardScoresLoadedListener, str, i, i2, i3, z);
    }

    public void reconnect() {
        this.f15353dt.disconnect();
        this.f15353dt.connect();
    }

    public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f15353dt.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15353dt.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void registerInvitationListener(OnInvitationReceivedListener onInvitationReceivedListener) {
        this.f15353dt.registerInvitationListener(onInvitationReceivedListener);
    }

    public void revealAchievement(String str) {
        this.f15353dt.mo11519a((OnAchievementUpdatedListener) null, str);
    }

    public void revealAchievementImmediate(OnAchievementUpdatedListener onAchievementUpdatedListener, String str) {
        this.f15353dt.mo11519a(onAchievementUpdatedListener, str);
    }

    public int sendReliableRealTimeMessage(RealTimeReliableMessageSentListener realTimeReliableMessageSentListener, byte[] bArr, String str, String str2) {
        return this.f15353dt.sendReliableRealTimeMessage(realTimeReliableMessageSentListener, bArr, str, str2);
    }

    public int sendUnreliableRealTimeMessage(byte[] bArr, String str, String str2) {
        return this.f15353dt.mo11514a(bArr, str, new String[]{str2});
    }

    public int sendUnreliableRealTimeMessage(byte[] bArr, String str, List<String> list) {
        return this.f15353dt.mo11514a(bArr, str, (String[]) list.toArray(new String[list.size()]));
    }

    public int sendUnreliableRealTimeMessageToAll(byte[] bArr, String str) {
        return this.f15353dt.sendUnreliableRealTimeMessageToAll(bArr, str);
    }

    public void setGravityForPopups(int i) {
        this.f15353dt.setGravityForPopups(i);
    }

    public void setUseNewPlayerNotificationsFirstParty(boolean z) {
        this.f15353dt.setUseNewPlayerNotificationsFirstParty(z);
    }

    public void setViewForPopups(View view) {
        C3802s.m16678d(view);
        this.f15353dt.setViewForPopups(view);
    }

    public void signOut() {
        this.f15353dt.signOut((OnSignOutCompleteListener) null);
    }

    public void signOut(OnSignOutCompleteListener onSignOutCompleteListener) {
        this.f15353dt.signOut(onSignOutCompleteListener);
    }

    public void submitScore(String str, long j) {
        this.f15353dt.mo11521a((OnScoreSubmittedListener) null, str, j);
    }

    public void submitScoreImmediate(OnScoreSubmittedListener onScoreSubmittedListener, String str, long j) {
        this.f15353dt.mo11521a(onScoreSubmittedListener, str, j);
    }

    public void unlockAchievement(String str) {
        this.f15353dt.mo11526b((OnAchievementUpdatedListener) null, str);
    }

    public void unlockAchievementImmediate(OnAchievementUpdatedListener onAchievementUpdatedListener, String str) {
        this.f15353dt.mo11526b(onAchievementUpdatedListener, str);
    }

    public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f15353dt.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15353dt.unregisterConnectionFailedListener(onConnectionFailedListener);
    }

    public void unregisterInvitationListener() {
        this.f15353dt.unregisterInvitationListener();
    }
}
