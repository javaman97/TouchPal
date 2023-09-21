package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.appstate.AppState;
import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.appstate.OnSignOutCompleteListener;
import com.google.android.gms.appstate.OnStateDeletedListener;
import com.google.android.gms.appstate.OnStateListLoadedListener;
import com.google.android.gms.appstate.OnStateLoadedListener;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.internal.C3766e;
import com.google.android.gms.internal.C3778k;

/* renamed from: com.google.android.gms.internal.c */
public final class C3726c extends C3778k<C3766e> {

    /* renamed from: g */
    private final String f15705g;

    /* renamed from: com.google.android.gms.internal.c$a */
    final class C3727a extends C3663b {

        /* renamed from: n */
        private final OnStateDeletedListener f15706n;

        public C3727a(OnStateDeletedListener onStateDeletedListener) {
            this.f15706n = (OnStateDeletedListener) C3802s.m16675b(onStateDeletedListener, (Object) "Listener must not be null");
        }

        public void onStateDeleted(int i, int i2) {
            C3726c.this.mo12358a((C3778k<T>.b<?>) new C3728b(this.f15706n, i, i2));
        }
    }

    /* renamed from: com.google.android.gms.internal.c$b */
    final class C3728b extends C3778k<C3766e>.b<OnStateDeletedListener> {

        /* renamed from: p */
        private final int f15709p;

        /* renamed from: q */
        private final int f15710q;

        public C3728b(OnStateDeletedListener onStateDeletedListener, int i, int i2) {
            super(onStateDeletedListener);
            this.f15709p = i;
            this.f15710q = i2;
        }

        /* renamed from: a */
        public void mo11573a(OnStateDeletedListener onStateDeletedListener) {
            onStateDeletedListener.onStateDeleted(this.f15709p, this.f15710q);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    /* renamed from: com.google.android.gms.internal.c$c */
    final class C3729c extends C3663b {

        /* renamed from: r */
        private final OnStateListLoadedListener f15712r;

        public C3729c(OnStateListLoadedListener onStateListLoadedListener) {
            this.f15712r = (OnStateListLoadedListener) C3802s.m16675b(onStateListLoadedListener, (Object) "Listener must not be null");
        }

        /* renamed from: a */
        public void mo11679a(C3525d dVar) {
            C3726c.this.mo12358a((C3778k<T>.b<?>) new C3730d(this.f15712r, dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.c$d */
    final class C3730d extends C3778k<C3766e>.c<OnStateListLoadedListener> {
        public C3730d(OnStateListLoadedListener onStateListLoadedListener, C3525d dVar) {
            super(onStateListLoadedListener, dVar);
        }

        /* renamed from: a */
        public void mo11571a(OnStateListLoadedListener onStateListLoadedListener, C3525d dVar) {
            onStateListLoadedListener.onStateListLoaded(dVar.getStatusCode(), new AppStateBuffer(dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.c$e */
    final class C3731e extends C3663b {

        /* renamed from: s */
        private final OnStateLoadedListener f15715s;

        public C3731e(OnStateLoadedListener onStateLoadedListener) {
            this.f15715s = (OnStateLoadedListener) C3802s.m16675b(onStateLoadedListener, (Object) "Listener must not be null");
        }

        /* renamed from: a */
        public void mo11678a(int i, C3525d dVar) {
            C3726c.this.mo12358a((C3778k<T>.b<?>) new C3732f(this.f15715s, i, dVar));
        }
    }

    /* renamed from: com.google.android.gms.internal.c$f */
    final class C3732f extends C3778k<C3766e>.c<OnStateLoadedListener> {

        /* renamed from: q */
        private final int f15717q;

        public C3732f(OnStateLoadedListener onStateLoadedListener, int i, C3525d dVar) {
            super(onStateLoadedListener, dVar);
            this.f15717q = i;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public void mo11571a(OnStateLoadedListener onStateLoadedListener, C3525d dVar) {
            byte[] bArr;
            String str;
            byte[] bArr2 = null;
            AppStateBuffer appStateBuffer = new AppStateBuffer(dVar);
            try {
                if (appStateBuffer.getCount() > 0) {
                    AppState appState = appStateBuffer.get(0);
                    str = appState.getConflictVersion();
                    bArr = appState.getLocalData();
                    bArr2 = appState.getConflictData();
                } else {
                    bArr = null;
                    str = null;
                }
                appStateBuffer.close();
                int statusCode = dVar.getStatusCode();
                if (statusCode == 2000) {
                    onStateLoadedListener.onStateConflict(this.f15717q, str, bArr, bArr2);
                } else {
                    onStateLoadedListener.onStateLoaded(statusCode, this.f15717q, bArr);
                }
            } catch (Throwable th) {
                appStateBuffer.close();
                throw th;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.c$g */
    final class C3733g extends C3663b {

        /* renamed from: t */
        private final OnSignOutCompleteListener f15719t;

        public C3733g(OnSignOutCompleteListener onSignOutCompleteListener) {
            this.f15719t = (OnSignOutCompleteListener) C3802s.m16675b(onSignOutCompleteListener, (Object) "Listener must not be null");
        }

        public void onSignOutComplete() {
            C3726c.this.mo12358a((C3778k<T>.b<?>) new C3734h(this.f15719t));
        }
    }

    /* renamed from: com.google.android.gms.internal.c$h */
    final class C3734h extends C3778k<C3766e>.b<OnSignOutCompleteListener> {
        public C3734h(OnSignOutCompleteListener onSignOutCompleteListener) {
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

    public C3726c(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener, String str, String[] strArr) {
        super(context, connectionCallbacks, onConnectionFailedListener, strArr);
        this.f15705g = (String) C3802s.m16678d(str);
    }

    /* renamed from: a */
    public void mo12023a(OnStateLoadedListener onStateLoadedListener, int i, byte[] bArr) {
        try {
            ((C3766e) mo12357C()).mo12317a(onStateLoadedListener == null ? null : new C3731e(onStateLoadedListener), i, bArr);
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11522a(C3793p pVar, C3778k.C3782d dVar) throws RemoteException {
        pVar.mo12398a(dVar, GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE, getContext().getPackageName(), this.f15705g, mo12361x());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11523a(String... strArr) {
        boolean z = false;
        for (String equals : strArr) {
            if (equals.equals(Scopes.APP_STATE)) {
                z = true;
            }
        }
        C3802s.m16673a(z, String.format("AppStateClient requires %s to function.", new Object[]{Scopes.APP_STATE}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C3766e mo11527c(IBinder iBinder) {
        return C3766e.C3767a.m16552e(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo11525b() {
        return "com.google.android.gms.appstate.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo11528c() {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }

    public void deleteState(OnStateDeletedListener onStateDeletedListener, int i) {
        try {
            ((C3766e) mo12357C()).mo12319b(new C3727a(onStateDeletedListener), i);
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    public int getMaxNumKeys() {
        try {
            return ((C3766e) mo12357C()).getMaxNumKeys();
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
            return 2;
        }
    }

    public int getMaxStateSize() {
        try {
            return ((C3766e) mo12357C()).getMaxStateSize();
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
            return 2;
        }
    }

    public void listStates(OnStateListLoadedListener onStateListLoadedListener) {
        try {
            ((C3766e) mo12357C()).mo12314a(new C3729c(onStateListLoadedListener));
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    public void loadState(OnStateLoadedListener onStateLoadedListener, int i) {
        try {
            ((C3766e) mo12357C()).mo12315a(new C3731e(onStateLoadedListener), i);
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    public void resolveState(OnStateLoadedListener onStateLoadedListener, int i, String str, byte[] bArr) {
        try {
            ((C3766e) mo12357C()).mo12316a(new C3731e(onStateLoadedListener), i, str, bArr);
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }

    public void signOut(OnSignOutCompleteListener onSignOutCompleteListener) {
        try {
            ((C3766e) mo12357C()).mo12318b(onSignOutCompleteListener == null ? null : new C3733g(onSignOutCompleteListener));
        } catch (RemoteException e) {
            Log.w("AppStateClient", "service died");
        }
    }
}
