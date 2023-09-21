package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.C3810a;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.bg */
public class C3677bg {

    /* renamed from: fG */
    private final C3688bk<C3674bf> f15573fG;

    /* renamed from: fH */
    private ContentProviderClient f15574fH = null;

    /* renamed from: fI */
    private boolean f15575fI = false;

    /* renamed from: fJ */
    private HashMap<LocationListener, C3679b> f15576fJ = new HashMap<>();
    private final ContentResolver mContentResolver;

    /* renamed from: com.google.android.gms.internal.bg$a */
    private static class C3678a extends Handler {

        /* renamed from: fK */
        private final LocationListener f15577fK;

        public C3678a(LocationListener locationListener) {
            this.f15577fK = locationListener;
        }

        public C3678a(LocationListener locationListener, Looper looper) {
            super(looper);
            this.f15577fK = locationListener;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f15577fK.onLocationChanged(new Location((Location) message.obj));
                    return;
                default:
                    Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
                    return;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.bg$b */
    private static class C3679b extends C3810a.C3811a {

        /* renamed from: fL */
        private Handler f15578fL;

        C3679b(LocationListener locationListener, Looper looper) {
            this.f15578fL = looper == null ? new C3678a(locationListener) : new C3678a(locationListener, looper);
        }

        public void onLocationChanged(Location location) {
            if (this.f15578fL == null) {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = location;
            this.f15578fL.sendMessage(obtain);
        }

        public void release() {
            this.f15578fL = null;
        }
    }

    public C3677bg(Context context, C3688bk<C3674bf> bkVar) {
        this.f15573fG = bkVar;
        this.mContentResolver = context.getContentResolver();
    }

    /* renamed from: aR */
    public void mo11713aR() {
        if (this.f15575fI) {
            setMockMode(false);
        }
    }

    public Location getLastLocation() {
        this.f15573fG.mo11740B();
        try {
            return this.f15573fG.mo11741C().mo11707aQ();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeAllListeners() {
        try {
            synchronized (this.f15576fJ) {
                for (C3679b next : this.f15576fJ.values()) {
                    if (next != null) {
                        this.f15573fG.mo11741C().mo11704a((C3810a) next);
                    }
                }
                this.f15576fJ.clear();
            }
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeLocationUpdates(PendingIntent pendingIntent) {
        this.f15573fG.mo11740B();
        try {
            this.f15573fG.mo11741C().mo11699a(pendingIntent);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeLocationUpdates(LocationListener locationListener) {
        this.f15573fG.mo11740B();
        C3802s.m16675b(locationListener, (Object) "Invalid null listener");
        synchronized (this.f15576fJ) {
            C3679b remove = this.f15576fJ.remove(locationListener);
            if (this.f15574fH != null && this.f15576fJ.isEmpty()) {
                this.f15574fH.release();
                this.f15574fH = null;
            }
            if (remove != null) {
                remove.release();
                try {
                    this.f15573fG.mo11741C().mo11704a((C3810a) remove);
                } catch (RemoteException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    public void requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        this.f15573fG.mo11740B();
        try {
            this.f15573fG.mo11741C().mo11702a(locationRequest, pendingIntent);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        this.f15573fG.mo11740B();
        if (looper == null) {
            C3802s.m16675b(Looper.myLooper(), (Object) "Can't create handler inside thread that has not called Looper.prepare()");
        }
        synchronized (this.f15576fJ) {
            C3679b bVar = this.f15576fJ.get(locationListener);
            C3679b bVar2 = bVar == null ? new C3679b(locationListener, looper) : bVar;
            this.f15576fJ.put(locationListener, bVar2);
            try {
                this.f15573fG.mo11741C().mo11703a(locationRequest, (C3810a) bVar2);
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public void setMockLocation(Location location) {
        this.f15573fG.mo11740B();
        try {
            this.f15573fG.mo11741C().setMockLocation(location);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setMockMode(boolean z) {
        this.f15573fG.mo11740B();
        try {
            this.f15573fG.mo11741C().setMockMode(z);
            this.f15575fI = z;
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
