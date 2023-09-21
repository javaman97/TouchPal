package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C3689bl;
import com.google.android.gms.internal.C3692bm;
import com.google.android.gms.internal.C3778k;
import com.google.android.gms.panorama.PanoramaClient;

/* renamed from: com.google.android.gms.internal.bn */
public class C3695bn extends C3778k<C3692bm> {

    /* renamed from: com.google.android.gms.internal.bn$a */
    final class C3696a extends C3778k<C3692bm>.b<PanoramaClient.C3926a> {

        /* renamed from: hO */
        public final ConnectionResult f15603hO;

        /* renamed from: hP */
        public final Intent f15604hP;
        public final int type;

        public C3696a(PanoramaClient.C3926a aVar, ConnectionResult connectionResult, int i, Intent intent) {
            super(aVar);
            this.f15603hO = connectionResult;
            this.type = i;
            this.f15604hP = intent;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11573a(PanoramaClient.C3926a aVar) {
            if (aVar != null) {
                aVar.mo13234a(this.f15603hO, this.type, this.f15604hP);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.bn$b */
    final class C3697b extends C3689bl.C3690a {

        /* renamed from: hR */
        private final PanoramaClient.C3926a f15607hR = null;

        /* renamed from: hS */
        private final PanoramaClient.OnPanoramaInfoLoadedListener f15608hS;

        /* renamed from: hT */
        private final Uri f15609hT;

        public C3697b(PanoramaClient.OnPanoramaInfoLoadedListener onPanoramaInfoLoadedListener, Uri uri) {
            this.f15608hS = onPanoramaInfoLoadedListener;
            this.f15609hT = uri;
        }

        /* renamed from: a */
        public void mo11761a(int i, Bundle bundle, int i2, Intent intent) {
            if (this.f15609hT != null) {
                C3695bn.this.getContext().revokeUriPermission(this.f15609hT, 1);
            }
            PendingIntent pendingIntent = null;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            if (this.f15607hR != null) {
                C3695bn.this.mo12358a((C3778k<T>.b<?>) new C3696a(this.f15607hR, connectionResult, i2, intent));
            } else {
                C3695bn.this.mo12358a((C3778k<T>.b<?>) new C3698c(this.f15608hS, connectionResult, intent));
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.bn$c */
    final class C3698c extends C3778k<C3692bm>.b<PanoramaClient.OnPanoramaInfoLoadedListener> {

        /* renamed from: hO */
        private final ConnectionResult f15610hO;

        /* renamed from: hP */
        private final Intent f15611hP;

        public C3698c(PanoramaClient.OnPanoramaInfoLoadedListener onPanoramaInfoLoadedListener, ConnectionResult connectionResult, Intent intent) {
            super(onPanoramaInfoLoadedListener);
            this.f15610hO = connectionResult;
            this.f15611hP = intent;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11573a(PanoramaClient.OnPanoramaInfoLoadedListener onPanoramaInfoLoadedListener) {
            if (onPanoramaInfoLoadedListener != null) {
                onPanoramaInfoLoadedListener.onPanoramaInfoLoaded(this.f15610hO, this.f15611hP);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    public C3695bn(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, connectionCallbacks, onConnectionFailedListener, (String[]) null);
    }

    /* renamed from: X */
    public C3692bm mo11527c(IBinder iBinder) {
        return C3692bm.C3693a.m16155W(iBinder);
    }

    /* renamed from: a */
    public void mo11769a(C3697b bVar, Uri uri, Bundle bundle, boolean z) {
        mo12356B();
        if (z) {
            getContext().grantUriPermission(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, uri, 1);
        }
        try {
            ((C3692bm) mo12357C()).mo11765a(bVar, uri, bundle, z);
        } catch (RemoteException e) {
            bVar.mo11761a(8, (Bundle) null, 0, (Intent) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11522a(C3793p pVar, C3778k.C3782d dVar) throws RemoteException {
        pVar.mo12397a(dVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), new Bundle());
    }

    /* renamed from: a */
    public void mo11770a(PanoramaClient.OnPanoramaInfoLoadedListener onPanoramaInfoLoadedListener, Uri uri, boolean z) {
        mo11769a(new C3697b(onPanoramaInfoLoadedListener, z ? uri : null), uri, (Bundle) null, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo11525b() {
        return "com.google.android.gms.panorama.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo11528c() {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }
}
