package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C3671be;
import com.google.android.gms.internal.C3674bf;
import com.google.android.gms.internal.C3778k;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.List;

/* renamed from: com.google.android.gms.internal.bh */
public class C3680bh extends C3778k<C3674bf> {

    /* renamed from: fG */
    private final C3688bk<C3674bf> f15579fG = new C3684c();

    /* renamed from: fM */
    private final C3677bg f15580fM;

    /* renamed from: fN */
    private final String f15581fN;

    /* renamed from: com.google.android.gms.internal.bh$a */
    private final class C3682a extends C3778k<C3674bf>.b<LocationClient.OnAddGeofencesResultListener> {

        /* renamed from: fO */
        private final String[] f15582fO;

        /* renamed from: p */
        private final int f15584p;

        public C3682a(LocationClient.OnAddGeofencesResultListener onAddGeofencesResultListener, int i, String[] strArr) {
            super(onAddGeofencesResultListener);
            this.f15584p = LocationStatusCodes.m16715O(i);
            this.f15582fO = strArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11573a(LocationClient.OnAddGeofencesResultListener onAddGeofencesResultListener) {
            if (onAddGeofencesResultListener != null) {
                onAddGeofencesResultListener.onAddGeofencesResult(this.f15584p, this.f15582fO);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.bh$b */
    private static final class C3683b extends C3671be.C3672a {

        /* renamed from: fQ */
        private LocationClient.OnAddGeofencesResultListener f15585fQ;

        /* renamed from: fR */
        private LocationClient.OnRemoveGeofencesResultListener f15586fR;

        /* renamed from: fS */
        private C3680bh f15587fS;

        public C3683b(LocationClient.OnAddGeofencesResultListener onAddGeofencesResultListener, C3680bh bhVar) {
            this.f15585fQ = onAddGeofencesResultListener;
            this.f15586fR = null;
            this.f15587fS = bhVar;
        }

        public C3683b(LocationClient.OnRemoveGeofencesResultListener onRemoveGeofencesResultListener, C3680bh bhVar) {
            this.f15586fR = onRemoveGeofencesResultListener;
            this.f15585fQ = null;
            this.f15587fS = bhVar;
        }

        public void onAddGeofencesResult(int i, String[] strArr) throws RemoteException {
            if (this.f15587fS == null) {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            }
            C3680bh bhVar = this.f15587fS;
            C3680bh bhVar2 = this.f15587fS;
            bhVar2.getClass();
            bhVar.mo12358a((C3778k<T>.b<?>) new C3682a(this.f15585fQ, i, strArr));
            this.f15587fS = null;
            this.f15585fQ = null;
            this.f15586fR = null;
        }

        public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingIntent) {
            if (this.f15587fS == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            }
            C3680bh bhVar = this.f15587fS;
            C3680bh bhVar2 = this.f15587fS;
            bhVar2.getClass();
            bhVar.mo12358a((C3778k<T>.b<?>) new C3685d(bhVar2, 1, this.f15586fR, i, pendingIntent));
            this.f15587fS = null;
            this.f15585fQ = null;
            this.f15586fR = null;
        }

        public void onRemoveGeofencesByRequestIdsResult(int i, String[] strArr) {
            if (this.f15587fS == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            }
            C3680bh bhVar = this.f15587fS;
            C3680bh bhVar2 = this.f15587fS;
            bhVar2.getClass();
            bhVar.mo12358a((C3778k<T>.b<?>) new C3685d(2, this.f15586fR, i, strArr));
            this.f15587fS = null;
            this.f15585fQ = null;
            this.f15586fR = null;
        }
    }

    /* renamed from: com.google.android.gms.internal.bh$c */
    private final class C3684c implements C3688bk<C3674bf> {
        private C3684c() {
        }

        /* renamed from: B */
        public void mo11740B() {
            C3680bh.this.mo12356B();
        }

        /* renamed from: aS */
        public C3674bf mo11741C() {
            return (C3674bf) C3680bh.this.mo12357C();
        }
    }

    /* renamed from: com.google.android.gms.internal.bh$d */
    private final class C3685d extends C3778k<C3674bf>.b<LocationClient.OnRemoveGeofencesResultListener> {

        /* renamed from: fO */
        private final String[] f15589fO;

        /* renamed from: fT */
        private final int f15591fT;
        private final PendingIntent mPendingIntent;

        /* renamed from: p */
        private final int f15592p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3685d(C3680bh bhVar, int i, LocationClient.OnRemoveGeofencesResultListener onRemoveGeofencesResultListener, int i2, PendingIntent pendingIntent) {
            super(onRemoveGeofencesResultListener);
            boolean z = true;
            C3680bh.this = bhVar;
            C3775h.m16565a(i != 1 ? false : z);
            this.f15591fT = i;
            this.f15592p = LocationStatusCodes.m16715O(i2);
            this.mPendingIntent = pendingIntent;
            this.f15589fO = null;
        }

        public C3685d(int i, LocationClient.OnRemoveGeofencesResultListener onRemoveGeofencesResultListener, int i2, String[] strArr) {
            super(onRemoveGeofencesResultListener);
            C3775h.m16565a(i == 2);
            this.f15591fT = i;
            this.f15592p = LocationStatusCodes.m16715O(i2);
            this.f15589fO = strArr;
            this.mPendingIntent = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11573a(LocationClient.OnRemoveGeofencesResultListener onRemoveGeofencesResultListener) {
            if (onRemoveGeofencesResultListener != null) {
                switch (this.f15591fT) {
                    case 1:
                        onRemoveGeofencesResultListener.onRemoveGeofencesByPendingIntentResult(this.f15592p, this.mPendingIntent);
                        return;
                    case 2:
                        onRemoveGeofencesResultListener.onRemoveGeofencesByRequestIdsResult(this.f15592p, this.f15589fO);
                        return;
                    default:
                        Log.wtf("LocationClientImpl", "Unsupported action: " + this.f15591fT);
                        return;
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    public C3680bh(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener, String str) {
        super(context, connectionCallbacks, onConnectionFailedListener, new String[0]);
        this.f15580fM = new C3677bg(context, this.f15579fG);
        this.f15581fN = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11522a(C3793p pVar, C3778k.C3782d dVar) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f15581fN);
        pVar.mo12404e(dVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), bundle);
    }

    public void addGeofences(List<C3686bi> list, PendingIntent pendingIntent, LocationClient.OnAddGeofencesResultListener onAddGeofencesResultListener) {
        mo12356B();
        C3802s.m16676b(list != null && list.size() > 0, (Object) "At least one geofence must be specified.");
        C3802s.m16675b(pendingIntent, (Object) "PendingIntent must be specified.");
        C3802s.m16675b(onAddGeofencesResultListener, (Object) "OnAddGeofencesResultListener not provided.");
        try {
            ((C3674bf) mo12357C()).mo11705a(list, pendingIntent, onAddGeofencesResultListener == null ? null : new C3683b(onAddGeofencesResultListener, this), getContext().getPackageName());
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo11525b() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo11528c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public void disconnect() {
        synchronized (this.f15580fM) {
            if (isConnected()) {
                this.f15580fM.removeAllListeners();
                this.f15580fM.mo11713aR();
            }
            super.disconnect();
        }
    }

    public Location getLastLocation() {
        return this.f15580fM.getLastLocation();
    }

    public void removeActivityUpdates(PendingIntent pendingIntent) {
        mo12356B();
        C3802s.m16678d(pendingIntent);
        try {
            ((C3674bf) mo12357C()).removeActivityUpdates(pendingIntent);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeGeofences(PendingIntent pendingIntent, LocationClient.OnRemoveGeofencesResultListener onRemoveGeofencesResultListener) {
        mo12356B();
        C3802s.m16675b(pendingIntent, (Object) "PendingIntent must be specified.");
        C3802s.m16675b(onRemoveGeofencesResultListener, (Object) "OnRemoveGeofencesResultListener not provided.");
        try {
            ((C3674bf) mo12357C()).mo11700a(pendingIntent, (C3671be) onRemoveGeofencesResultListener == null ? null : new C3683b(onRemoveGeofencesResultListener, this), getContext().getPackageName());
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeGeofences(List<String> list, LocationClient.OnRemoveGeofencesResultListener onRemoveGeofencesResultListener) {
        mo12356B();
        C3802s.m16676b(list != null && list.size() > 0, (Object) "geofenceRequestIds can't be null nor empty.");
        C3802s.m16675b(onRemoveGeofencesResultListener, (Object) "OnRemoveGeofencesResultListener not provided.");
        try {
            ((C3674bf) mo12357C()).mo11706a((String[]) list.toArray(new String[0]), (C3671be) onRemoveGeofencesResultListener == null ? null : new C3683b(onRemoveGeofencesResultListener, this), getContext().getPackageName());
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeLocationUpdates(PendingIntent pendingIntent) {
        this.f15580fM.removeLocationUpdates(pendingIntent);
    }

    public void removeLocationUpdates(LocationListener locationListener) {
        this.f15580fM.removeLocationUpdates(locationListener);
    }

    public void requestActivityUpdates(long j, PendingIntent pendingIntent) {
        boolean z = true;
        mo12356B();
        C3802s.m16678d(pendingIntent);
        if (j < 0) {
            z = false;
        }
        C3802s.m16676b(z, (Object) "detectionIntervalMillis must be >= 0");
        try {
            ((C3674bf) mo12357C()).mo11698a(j, true, pendingIntent);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        this.f15580fM.requestLocationUpdates(locationRequest, pendingIntent);
    }

    public void requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener) {
        requestLocationUpdates(locationRequest, locationListener, (Looper) null);
    }

    public void requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        synchronized (this.f15580fM) {
            this.f15580fM.requestLocationUpdates(locationRequest, locationListener, looper);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public C3674bf mo11527c(IBinder iBinder) {
        return C3674bf.C3675a.m16108r(iBinder);
    }

    public void setMockLocation(Location location) {
        this.f15580fM.setMockLocation(location);
    }

    public void setMockMode(boolean z) {
        this.f15580fM.setMockMode(z);
    }
}
