package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.C3680bh;

public class ActivityRecognitionClient implements GooglePlayServicesClient {

    /* renamed from: fo */
    private final C3680bh f15912fo;

    public ActivityRecognitionClient(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15912fo = new C3680bh(context, connectionCallbacks, onConnectionFailedListener, "activity_recognition");
    }

    public void connect() {
        this.f15912fo.connect();
    }

    public void disconnect() {
        this.f15912fo.disconnect();
    }

    public boolean isConnected() {
        return this.f15912fo.isConnected();
    }

    public boolean isConnecting() {
        return this.f15912fo.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        return this.f15912fo.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f15912fo.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f15912fo.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15912fo.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void removeActivityUpdates(PendingIntent pendingIntent) {
        this.f15912fo.removeActivityUpdates(pendingIntent);
    }

    public void requestActivityUpdates(long j, PendingIntent pendingIntent) {
        this.f15912fo.requestActivityUpdates(j, pendingIntent);
    }

    public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f15912fo.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15912fo.unregisterConnectionFailedListener(onConnectionFailedListener);
    }
}
