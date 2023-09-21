package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.C3680bh;
import com.google.android.gms.internal.C3686bi;
import com.google.android.gms.internal.C3802s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LocationClient implements GooglePlayServicesClient {
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    /* renamed from: fo */
    private final C3680bh f15927fo;

    public interface OnAddGeofencesResultListener {
        void onAddGeofencesResult(int i, String[] strArr);
    }

    public interface OnRemoveGeofencesResultListener {
        void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingIntent);

        void onRemoveGeofencesByRequestIdsResult(int i, String[] strArr);
    }

    public LocationClient(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15927fo = new C3680bh(context, connectionCallbacks, onConnectionFailedListener, "location");
    }

    public static int getErrorCode(Intent intent) {
        return intent.getIntExtra("gms_error_code", -1);
    }

    public static int getGeofenceTransition(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra == -1) {
            return -1;
        }
        if (intExtra == 1 || intExtra == 2) {
            return intExtra;
        }
        return -1;
    }

    public static List<Geofence> getTriggeringGeofences(Intent intent) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C3686bi.m16141c((byte[]) it.next()));
        }
        return arrayList2;
    }

    public static boolean hasError(Intent intent) {
        return intent.hasExtra("gms_error_code");
    }

    public void addGeofences(List<Geofence> list, PendingIntent pendingIntent, OnAddGeofencesResultListener onAddGeofencesResultListener) {
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Geofence next : list) {
                C3802s.m16676b(next instanceof C3686bi, (Object) "Geofence must be created using Geofence.Builder.");
                arrayList2.add((C3686bi) next);
            }
            arrayList = arrayList2;
        }
        this.f15927fo.addGeofences(arrayList, pendingIntent, onAddGeofencesResultListener);
    }

    public void connect() {
        this.f15927fo.connect();
    }

    public void disconnect() {
        this.f15927fo.disconnect();
    }

    public Location getLastLocation() {
        return this.f15927fo.getLastLocation();
    }

    public boolean isConnected() {
        return this.f15927fo.isConnected();
    }

    public boolean isConnecting() {
        return this.f15927fo.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        return this.f15927fo.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f15927fo.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f15927fo.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15927fo.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void removeGeofences(PendingIntent pendingIntent, OnRemoveGeofencesResultListener onRemoveGeofencesResultListener) {
        this.f15927fo.removeGeofences(pendingIntent, onRemoveGeofencesResultListener);
    }

    public void removeGeofences(List<String> list, OnRemoveGeofencesResultListener onRemoveGeofencesResultListener) {
        this.f15927fo.removeGeofences(list, onRemoveGeofencesResultListener);
    }

    public void removeLocationUpdates(PendingIntent pendingIntent) {
        this.f15927fo.removeLocationUpdates(pendingIntent);
    }

    public void removeLocationUpdates(LocationListener locationListener) {
        this.f15927fo.removeLocationUpdates(locationListener);
    }

    public void requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        this.f15927fo.requestLocationUpdates(locationRequest, pendingIntent);
    }

    public void requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener) {
        this.f15927fo.requestLocationUpdates(locationRequest, locationListener);
    }

    public void requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        this.f15927fo.requestLocationUpdates(locationRequest, locationListener, looper);
    }

    public void setMockLocation(Location location) {
        this.f15927fo.setMockLocation(location);
    }

    public void setMockMode(boolean z) {
        this.f15927fo.setMockMode(z);
    }

    public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        this.f15927fo.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15927fo.unregisterConnectionFailedListener(onConnectionFailedListener);
    }
}
