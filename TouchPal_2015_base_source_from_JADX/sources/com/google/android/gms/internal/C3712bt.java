package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.internal.C3709bs;
import com.google.android.gms.internal.C3778k;
import com.google.android.gms.plus.C3932a;
import com.google.android.gms.plus.PlusClient;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.bt */
public class C3712bt extends C3778k<C3709bs> {

    /* renamed from: ip */
    private Person f15617ip;

    /* renamed from: iq */
    private C3932a f15618iq;

    /* renamed from: com.google.android.gms.internal.bt$a */
    final class C3713a extends C3699bo {

        /* renamed from: ir */
        private final PlusClient.OnMomentsLoadedListener f15619ir;

        public C3713a(PlusClient.OnMomentsLoadedListener onMomentsLoadedListener) {
            this.f15619ir = onMomentsLoadedListener;
        }

        /* renamed from: a */
        public void mo11785a(C3525d dVar, String str, String str2) {
            C3525d dVar2;
            ConnectionResult connectionResult = new ConnectionResult(dVar.getStatusCode(), dVar.mo10992l() != null ? (PendingIntent) dVar.mo10992l().getParcelable("pendingIntent") : null);
            if (connectionResult.isSuccess() || dVar == null) {
                dVar2 = dVar;
            } else {
                if (!dVar.isClosed()) {
                    dVar.close();
                }
                dVar2 = null;
            }
            C3712bt.this.mo12358a((C3778k<T>.b<?>) new C3714b(this.f15619ir, connectionResult, dVar2, str, str2));
        }
    }

    /* renamed from: com.google.android.gms.internal.bt$b */
    final class C3714b extends C3778k<C3709bs>.c<PlusClient.OnMomentsLoadedListener> {

        /* renamed from: it */
        private final ConnectionResult f15622it;

        /* renamed from: iu */
        private final String f15623iu;

        /* renamed from: iv */
        private final String f15624iv;

        public C3714b(PlusClient.OnMomentsLoadedListener onMomentsLoadedListener, ConnectionResult connectionResult, C3525d dVar, String str, String str2) {
            super(onMomentsLoadedListener, dVar);
            this.f15622it = connectionResult;
            this.f15623iu = str;
            this.f15624iv = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11571a(PlusClient.OnMomentsLoadedListener onMomentsLoadedListener, C3525d dVar) {
            onMomentsLoadedListener.onMomentsLoaded(this.f15622it, dVar != null ? new MomentBuffer(dVar) : null, this.f15623iu, this.f15624iv);
        }
    }

    /* renamed from: com.google.android.gms.internal.bt$c */
    final class C3715c extends C3699bo {

        /* renamed from: iw */
        private final PlusClient.OnPeopleLoadedListener f15626iw;

        public C3715c(PlusClient.OnPeopleLoadedListener onPeopleLoadedListener) {
            this.f15626iw = onPeopleLoadedListener;
        }

        /* renamed from: a */
        public void mo11784a(C3525d dVar, String str) {
            C3525d dVar2;
            ConnectionResult connectionResult = new ConnectionResult(dVar.getStatusCode(), dVar.mo10992l() != null ? (PendingIntent) dVar.mo10992l().getParcelable("pendingIntent") : null);
            if (connectionResult.isSuccess() || dVar == null) {
                dVar2 = dVar;
            } else {
                if (!dVar.isClosed()) {
                    dVar.close();
                }
                dVar2 = null;
            }
            C3712bt.this.mo12358a((C3778k<T>.b<?>) new C3716d(this.f15626iw, connectionResult, dVar2, str));
        }
    }

    /* renamed from: com.google.android.gms.internal.bt$d */
    final class C3716d extends C3778k<C3709bs>.c<PlusClient.OnPeopleLoadedListener> {

        /* renamed from: it */
        private final ConnectionResult f15628it;

        /* renamed from: iu */
        private final String f15629iu;

        public C3716d(PlusClient.OnPeopleLoadedListener onPeopleLoadedListener, ConnectionResult connectionResult, C3525d dVar, String str) {
            super(onPeopleLoadedListener, dVar);
            this.f15628it = connectionResult;
            this.f15629iu = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11571a(PlusClient.OnPeopleLoadedListener onPeopleLoadedListener, C3525d dVar) {
            onPeopleLoadedListener.onPeopleLoaded(this.f15628it, dVar != null ? new PersonBuffer(dVar) : null, this.f15629iu);
        }
    }

    /* renamed from: com.google.android.gms.internal.bt$e */
    final class C3717e extends C3699bo {

        /* renamed from: ix */
        private final PlusClient.OnAccessRevokedListener f15631ix;

        public C3717e(PlusClient.OnAccessRevokedListener onAccessRevokedListener) {
            this.f15631ix = onAccessRevokedListener;
        }

        /* renamed from: b */
        public void mo11786b(int i, Bundle bundle) {
            PendingIntent pendingIntent = null;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            C3712bt.this.mo12358a((C3778k<T>.b<?>) new C3718f(this.f15631ix, new ConnectionResult(i, pendingIntent)));
        }
    }

    /* renamed from: com.google.android.gms.internal.bt$f */
    final class C3718f extends C3778k<C3709bs>.b<PlusClient.OnAccessRevokedListener> {

        /* renamed from: it */
        private final ConnectionResult f15633it;

        public C3718f(PlusClient.OnAccessRevokedListener onAccessRevokedListener, ConnectionResult connectionResult) {
            super(onAccessRevokedListener);
            this.f15633it = connectionResult;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11573a(PlusClient.OnAccessRevokedListener onAccessRevokedListener) {
            C3712bt.this.disconnect();
            if (onAccessRevokedListener != null) {
                onAccessRevokedListener.onAccessRevoked(this.f15633it);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    public C3712bt(Context context, C3932a aVar, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, connectionCallbacks, onConnectionFailedListener, aVar.mo13292by());
        this.f15618iq = aVar;
    }

    /* renamed from: F */
    public boolean mo11842F(String str) {
        return Arrays.asList(mo12361x()).contains(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11515a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.f15617ip = C3737cc.m16389d(bundle.getByteArray("loaded_person"));
        }
        super.mo11515a(i, iBinder, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11522a(C3793p pVar, C3778k.C3782d dVar) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putBoolean("skip_oob", false);
        bundle.putStringArray("request_visible_actions", this.f15618iq.mo13293bz());
        if (this.f15618iq.mo13288bA() != null) {
            bundle.putStringArray("required_features", this.f15618iq.mo13288bA());
        }
        if (this.f15618iq.mo13291bD() != null) {
            bundle.putString("application_name", this.f15618iq.mo13291bD());
        }
        pVar.mo12399a(dVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, this.f15618iq.mo13290bC(), this.f15618iq.mo13289bB(), mo12361x(), this.f15618iq.getAccountName(), bundle);
    }

    /* renamed from: a */
    public void mo11843a(PlusClient.OnPeopleLoadedListener onPeopleLoadedListener, Collection<String> collection) {
        mo12356B();
        C3715c cVar = new C3715c(onPeopleLoadedListener);
        try {
            ((C3709bs) mo12357C()).mo11823a((C3700bp) cVar, (List<String>) new ArrayList(collection));
        } catch (RemoteException e) {
            cVar.mo11784a(C3525d.m15356f(8), (String) null);
        }
    }

    /* renamed from: a */
    public void mo11844a(PlusClient.OnPeopleLoadedListener onPeopleLoadedListener, String[] strArr) {
        mo11843a(onPeopleLoadedListener, (Collection<String>) Arrays.asList(strArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public C3709bs mo11527c(IBinder iBinder) {
        return C3709bs.C3710a.m16264ab(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo11525b() {
        return "com.google.android.gms.plus.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo11528c() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    public void clearDefaultAccount() {
        mo12356B();
        try {
            this.f15617ip = null;
            ((C3709bs) mo12357C()).clearDefaultAccount();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public String getAccountName() {
        mo12356B();
        try {
            return ((C3709bs) mo12357C()).getAccountName();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public Person getCurrentPerson() {
        mo12356B();
        return this.f15617ip;
    }

    public void loadMoments(PlusClient.OnMomentsLoadedListener onMomentsLoadedListener) {
        loadMoments(onMomentsLoadedListener, 20, (String) null, (Uri) null, (String) null, "me");
    }

    public void loadMoments(PlusClient.OnMomentsLoadedListener onMomentsLoadedListener, int i, String str, Uri uri, String str2, String str3) {
        mo12356B();
        C3713a aVar = onMomentsLoadedListener != null ? new C3713a(onMomentsLoadedListener) : null;
        try {
            ((C3709bs) mo12357C()).mo11808a(aVar, i, str, uri, str2, str3);
        } catch (RemoteException e) {
            aVar.mo11785a(C3525d.m15356f(8), (String) null, (String) null);
        }
    }

    public void loadVisiblePeople(PlusClient.OnPeopleLoadedListener onPeopleLoadedListener, int i, String str) {
        mo12356B();
        C3715c cVar = new C3715c(onPeopleLoadedListener);
        try {
            ((C3709bs) mo12357C()).mo11804a((C3700bp) cVar, 1, i, -1, str);
        } catch (RemoteException e) {
            cVar.mo11784a(C3525d.m15356f(8), (String) null);
        }
    }

    public void loadVisiblePeople(PlusClient.OnPeopleLoadedListener onPeopleLoadedListener, String str) {
        loadVisiblePeople(onPeopleLoadedListener, 0, str);
    }

    public void removeMoment(String str) {
        mo12356B();
        try {
            ((C3709bs) mo12357C()).removeMoment(str);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    public void revokeAccessAndDisconnect(PlusClient.OnAccessRevokedListener onAccessRevokedListener) {
        mo12356B();
        clearDefaultAccount();
        C3717e eVar = new C3717e(onAccessRevokedListener);
        try {
            ((C3709bs) mo12357C()).mo11827c(eVar);
        } catch (RemoteException e) {
            eVar.mo11786b(8, (Bundle) null);
        }
    }

    public void writeMoment(Moment moment) {
        mo12356B();
        try {
            ((C3709bs) mo12357C()).mo11802a(C3600ak.m15663a((C3725bz) moment));
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
