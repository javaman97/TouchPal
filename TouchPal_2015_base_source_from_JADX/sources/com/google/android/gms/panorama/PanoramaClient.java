package com.google.android.gms.panorama;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.C3695bn;

public class PanoramaClient implements GooglePlayServicesClient {

    /* renamed from: hN */
    private final C3695bn f16112hN;

    public interface OnPanoramaInfoLoadedListener {
        void onPanoramaInfoLoaded(ConnectionResult connectionResult, Intent intent);
    }

    /* renamed from: com.google.android.gms.panorama.PanoramaClient$a */
    public interface C3926a {
        /* renamed from: a */
        void mo13234a(ConnectionResult connectionResult, int i, Intent intent);
    }

    public PanoramaClient(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f16112hN = new C3695bn(context, connectionCallbacks, onConnectionFailedListener);
    }

    public void connect() {
        this.f16112hN.connect();
    }

    public void disconnect() {
        this.f16112hN.disconnect();
    }

    public boolean isConnected() {
        return this.f16112hN.isConnected();
    }

    public boolean isConnecting() {
        return this.f16112hN.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        return this.f16112hN.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f16112hN.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    public void loadPanoramaInfo(OnPanoramaInfoLoadedListener onPanoramaInfoLoadedListener, Uri uri) {
        this.f16112hN.mo11770a(onPanoramaInfoLoadedListener, uri, false);
    }

    public void loadPanoramaInfoAndGrantAccess(OnPanoramaInfoLoadedListener onPanoramaInfoLoadedListener, Uri uri) {
        this.f16112hN.mo11770a(onPanoramaInfoLoadedListener, uri, true);
    }

    public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f16112hN.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f16112hN.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f16112hN.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f16112hN.unregisterConnectionFailedListener(onConnectionFailedListener);
    }
}
