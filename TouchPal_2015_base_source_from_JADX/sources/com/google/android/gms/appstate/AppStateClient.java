package com.google.android.gms.appstate;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.internal.C3726c;
import com.google.android.gms.internal.C3802s;

public final class AppStateClient implements GooglePlayServicesClient {
    public static final int STATUS_CLIENT_RECONNECT_REQUIRED = 2;
    public static final int STATUS_DEVELOPER_ERROR = 7;
    public static final int STATUS_INTERNAL_ERROR = 1;
    public static final int STATUS_NETWORK_ERROR_NO_DATA = 4;
    public static final int STATUS_NETWORK_ERROR_OPERATION_DEFERRED = 5;
    public static final int STATUS_NETWORK_ERROR_OPERATION_FAILED = 6;
    public static final int STATUS_NETWORK_ERROR_STALE_DATA = 3;
    public static final int STATUS_OK = 0;
    public static final int STATUS_STATE_KEY_LIMIT_EXCEEDED = 2003;
    public static final int STATUS_STATE_KEY_NOT_FOUND = 2002;
    public static final int STATUS_WRITE_OUT_OF_DATE_VERSION = 2000;
    public static final int STATUS_WRITE_SIZE_EXCEEDED = 2001;

    /* renamed from: b */
    private final C3726c f15218b;

    public static final class Builder {

        /* renamed from: c */
        private static final String[] f15219c = {Scopes.APP_STATE};

        /* renamed from: d */
        private GooglePlayServicesClient.ConnectionCallbacks f15220d;

        /* renamed from: e */
        private GooglePlayServicesClient.OnConnectionFailedListener f15221e;

        /* renamed from: f */
        private String[] f15222f = f15219c;

        /* renamed from: g */
        private String f15223g = "<<default account>>";
        private Context mContext;

        public Builder(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.mContext = context;
            this.f15220d = connectionCallbacks;
            this.f15221e = onConnectionFailedListener;
        }

        public AppStateClient create() {
            return new AppStateClient(this.mContext, this.f15220d, this.f15221e, this.f15223g, this.f15222f);
        }

        public Builder setAccountName(String str) {
            this.f15223g = (String) C3802s.m16678d(str);
            return this;
        }

        public Builder setScopes(String... strArr) {
            this.f15222f = strArr;
            return this;
        }
    }

    private AppStateClient(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener, String str, String[] strArr) {
        this.f15218b = new C3726c(context, connectionCallbacks, onConnectionFailedListener, str, strArr);
    }

    public void connect() {
        this.f15218b.connect();
    }

    public void deleteState(OnStateDeletedListener onStateDeletedListener, int i) {
        this.f15218b.deleteState(onStateDeletedListener, i);
    }

    public void disconnect() {
        this.f15218b.disconnect();
    }

    public int getMaxNumKeys() {
        return this.f15218b.getMaxNumKeys();
    }

    public int getMaxStateSize() {
        return this.f15218b.getMaxStateSize();
    }

    public boolean isConnected() {
        return this.f15218b.isConnected();
    }

    public boolean isConnecting() {
        return this.f15218b.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        return this.f15218b.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f15218b.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    public void listStates(OnStateListLoadedListener onStateListLoadedListener) {
        this.f15218b.listStates(onStateListLoadedListener);
    }

    public void loadState(OnStateLoadedListener onStateLoadedListener, int i) {
        this.f15218b.loadState(onStateLoadedListener, i);
    }

    public void reconnect() {
        this.f15218b.disconnect();
        this.f15218b.connect();
    }

    public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f15218b.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15218b.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void resolveState(OnStateLoadedListener onStateLoadedListener, int i, String str, byte[] bArr) {
        this.f15218b.resolveState(onStateLoadedListener, i, str, bArr);
    }

    public void signOut() {
        this.f15218b.signOut((OnSignOutCompleteListener) null);
    }

    public void signOut(OnSignOutCompleteListener onSignOutCompleteListener) {
        C3802s.m16675b(onSignOutCompleteListener, (Object) "Must provide a valid listener");
        this.f15218b.signOut(onSignOutCompleteListener);
    }

    public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f15218b.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15218b.unregisterConnectionFailedListener(onConnectionFailedListener);
    }

    public void updateState(int i, byte[] bArr) {
        this.f15218b.mo12023a((OnStateLoadedListener) null, i, bArr);
    }

    public void updateStateImmediate(OnStateLoadedListener onStateLoadedListener, int i, byte[] bArr) {
        C3802s.m16675b(onStateLoadedListener, (Object) "Must provide a valid listener");
        this.f15218b.mo12023a(onStateLoadedListener, i, bArr);
    }
}
