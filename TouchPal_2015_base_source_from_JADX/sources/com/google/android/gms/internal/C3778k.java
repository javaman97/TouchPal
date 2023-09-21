package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.C3525d;
import com.google.android.gms.internal.C3790o;
import com.google.android.gms.internal.C3793p;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.k */
public abstract class C3778k<T extends IInterface> implements GooglePlayServicesClient {

    /* renamed from: bD */
    public static final String[] f15852bD = {"service_esmobile", "service_googleme"};

    /* renamed from: bA */
    boolean f15853bA = false;

    /* renamed from: bB */
    boolean f15854bB = false;
    /* access modifiers changed from: private */

    /* renamed from: bC */
    public final Object f15855bC = new Object();
    /* access modifiers changed from: private */

    /* renamed from: bs */
    public T f15856bs;
    /* access modifiers changed from: private */

    /* renamed from: bt */
    public ArrayList<GooglePlayServicesClient.ConnectionCallbacks> f15857bt;

    /* renamed from: bu */
    final ArrayList<GooglePlayServicesClient.ConnectionCallbacks> f15858bu = new ArrayList<>();

    /* renamed from: bv */
    private boolean f15859bv = false;

    /* renamed from: bw */
    private ArrayList<GooglePlayServicesClient.OnConnectionFailedListener> f15860bw;

    /* renamed from: bx */
    private boolean f15861bx = false;
    /* access modifiers changed from: private */

    /* renamed from: by */
    public final ArrayList<C3778k<T>.b<?>> f15862by = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: bz */
    public C3778k<T>.e f15863bz;

    /* renamed from: f */
    private final String[] f15864f;
    /* access modifiers changed from: private */
    public final Context mContext;
    final Handler mHandler;

    /* renamed from: com.google.android.gms.internal.k$a */
    final class C3779a extends Handler {
        public C3779a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what != 1 || C3778k.this.isConnecting()) {
                synchronized (C3778k.this.f15855bC) {
                    C3778k.this.f15854bB = false;
                }
                if (message.what == 3) {
                    C3778k.this.mo11517a(new ConnectionResult(((Integer) message.obj).intValue(), (PendingIntent) null));
                } else if (message.what == 4) {
                    synchronized (C3778k.this.f15857bt) {
                        if (C3778k.this.f15853bA && C3778k.this.isConnected() && C3778k.this.f15857bt.contains(message.obj)) {
                            ((GooglePlayServicesClient.ConnectionCallbacks) message.obj).onConnected(C3778k.this.mo11567z());
                        }
                    }
                } else if (message.what == 2 && !C3778k.this.isConnected()) {
                    C3780b bVar = (C3780b) message.obj;
                    bVar.mo11574d();
                    bVar.unregister();
                } else if (message.what == 2 || message.what == 1) {
                    ((C3780b) message.obj).mo12363D();
                } else {
                    Log.wtf("GmsClient", "Don't know how to handle this message.");
                }
            } else {
                C3780b bVar2 = (C3780b) message.obj;
                bVar2.mo11574d();
                bVar2.unregister();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.k$b */
    protected abstract class C3780b<TListener> {

        /* renamed from: bF */
        private boolean f15867bF = false;
        private TListener mListener;

        public C3780b(TListener tlistener) {
            this.mListener = tlistener;
        }

        /* renamed from: D */
        public void mo12363D() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.mListener;
                if (this.f15867bF) {
                    Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
                }
            }
            if (tlistener != null) {
                try {
                    mo11573a(tlistener);
                } catch (RuntimeException e) {
                    mo11574d();
                    throw e;
                }
            } else {
                mo11574d();
            }
            synchronized (this) {
                this.f15867bF = true;
            }
            unregister();
        }

        /* renamed from: E */
        public void mo12364E() {
            synchronized (this) {
                this.mListener = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo11573a(TListener tlistener);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo11574d();

        public void unregister() {
            mo12364E();
            synchronized (C3778k.this.f15862by) {
                C3778k.this.f15862by.remove(this);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.k$c */
    public abstract class C3781c<TListener> extends C3778k<T>.b<TListener> {

        /* renamed from: S */
        private final C3525d f15868S;

        public C3781c(TListener tlistener, C3525d dVar) {
            super(tlistener);
            this.f15868S = dVar;
        }

        /* renamed from: D */
        public /* bridge */ /* synthetic */ void mo12363D() {
            super.mo12363D();
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ void mo12364E() {
            super.mo12364E();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo11573a(TListener tlistener) {
            mo11571a(tlistener, this.f15868S);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo11571a(TListener tlistener, C3525d dVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
            if (this.f15868S != null) {
                this.f15868S.close();
            }
        }

        public /* bridge */ /* synthetic */ void unregister() {
            super.unregister();
        }
    }

    /* renamed from: com.google.android.gms.internal.k$d */
    public static final class C3782d extends C3790o.C3791a {

        /* renamed from: bG */
        private C3778k f15870bG;

        public C3782d(C3778k kVar) {
            this.f15870bG = kVar;
        }

        /* renamed from: b */
        public void mo12366b(int i, IBinder iBinder, Bundle bundle) {
            C3802s.m16675b("onPostInitComplete can be called only once per call to getServiceFromBroker", (Object) this.f15870bG);
            this.f15870bG.mo11515a(i, iBinder, bundle);
            this.f15870bG = null;
        }
    }

    /* renamed from: com.google.android.gms.internal.k$e */
    final class C3783e implements ServiceConnection {
        C3783e() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C3778k.this.mo12359f(iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            IInterface unused = C3778k.this.f15856bs = null;
            C3778k.this.mo12355A();
        }
    }

    /* renamed from: com.google.android.gms.internal.k$f */
    protected final class C3784f extends C3778k<T>.b<Boolean> {

        /* renamed from: bH */
        public final Bundle f15873bH;

        /* renamed from: bI */
        public final IBinder f15874bI;
        public final int statusCode;

        public C3784f(int i, IBinder iBinder, Bundle bundle) {
            super(true);
            this.statusCode = i;
            this.f15874bI = iBinder;
            this.f15873bH = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo11573a(Boolean bool) {
            if (bool != null) {
                switch (this.statusCode) {
                    case 0:
                        try {
                            if (C3778k.this.mo11528c().equals(this.f15874bI.getInterfaceDescriptor())) {
                                IInterface unused = C3778k.this.f15856bs = C3778k.this.mo11527c(this.f15874bI);
                                if (C3778k.this.f15856bs != null) {
                                    C3778k.this.mo11566y();
                                    return;
                                }
                            }
                        } catch (RemoteException e) {
                        }
                        C3785l.m16612g(C3778k.this.mContext).mo12371b(C3778k.this.mo11525b(), C3778k.this.f15863bz);
                        C3783e unused2 = C3778k.this.f15863bz = null;
                        IInterface unused3 = C3778k.this.f15856bs = null;
                        C3778k.this.mo11517a(new ConnectionResult(8, (PendingIntent) null));
                        return;
                    case 10:
                        throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                    default:
                        PendingIntent pendingIntent = this.f15873bH != null ? (PendingIntent) this.f15873bH.getParcelable("pendingIntent") : null;
                        if (C3778k.this.f15863bz != null) {
                            C3785l.m16612g(C3778k.this.mContext).mo12371b(C3778k.this.mo11525b(), C3778k.this.f15863bz);
                            C3783e unused4 = C3778k.this.f15863bz = null;
                        }
                        IInterface unused5 = C3778k.this.f15856bs = null;
                        C3778k.this.mo11517a(new ConnectionResult(this.statusCode, pendingIntent));
                        return;
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11574d() {
        }
    }

    protected C3778k(Context context, GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener, String... strArr) {
        this.mContext = (Context) C3802s.m16678d(context);
        this.f15857bt = new ArrayList<>();
        this.f15857bt.add(C3802s.m16678d(connectionCallbacks));
        this.f15860bw = new ArrayList<>();
        this.f15860bw.add(C3802s.m16678d(onConnectionFailedListener));
        this.mHandler = new C3779a(context.getMainLooper());
        mo11523a(strArr);
        this.f15864f = strArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo12355A() {
        this.mHandler.removeMessages(4);
        synchronized (this.f15857bt) {
            this.f15859bv = true;
            ArrayList<GooglePlayServicesClient.ConnectionCallbacks> arrayList = this.f15857bt;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f15853bA; i++) {
                if (this.f15857bt.contains(arrayList.get(i))) {
                    arrayList.get(i).onDisconnected();
                }
            }
            this.f15859bv = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo12356B() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final T mo12357C() {
        mo12356B();
        return this.f15856bs;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11515a(int i, IBinder iBinder, Bundle bundle) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, new C3784f(i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11517a(ConnectionResult connectionResult) {
        this.mHandler.removeMessages(4);
        synchronized (this.f15860bw) {
            this.f15861bx = true;
            ArrayList<GooglePlayServicesClient.OnConnectionFailedListener> arrayList = this.f15860bw;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (this.f15853bA) {
                    if (this.f15860bw.contains(arrayList.get(i))) {
                        arrayList.get(i).onConnectionFailed(connectionResult);
                    }
                    i++;
                } else {
                    return;
                }
            }
            this.f15861bx = false;
        }
    }

    /* renamed from: a */
    public final void mo12358a(C3778k<T>.b<?> bVar) {
        synchronized (this.f15862by) {
            this.f15862by.add(bVar);
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11522a(C3793p pVar, C3782d dVar) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11523a(String... strArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo11525b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo11527c(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo11528c();

    public void connect() {
        this.f15853bA = true;
        synchronized (this.f15855bC) {
            this.f15854bB = true;
        }
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.mContext);
        if (isGooglePlayServicesAvailable != 0) {
            this.mHandler.sendMessage(this.mHandler.obtainMessage(3, Integer.valueOf(isGooglePlayServicesAvailable)));
            return;
        }
        if (this.f15863bz != null) {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
            this.f15856bs = null;
            C3785l.m16612g(this.mContext).mo12371b(mo11525b(), this.f15863bz);
        }
        this.f15863bz = new C3783e();
        if (!C3785l.m16612g(this.mContext).mo12370a(mo11525b(), this.f15863bz)) {
            Log.e("GmsClient", "unable to connect to service: " + mo11525b());
            this.mHandler.sendMessage(this.mHandler.obtainMessage(3, 9));
        }
    }

    public void disconnect() {
        this.f15853bA = false;
        synchronized (this.f15855bC) {
            this.f15854bB = false;
        }
        synchronized (this.f15862by) {
            int size = this.f15862by.size();
            for (int i = 0; i < size; i++) {
                this.f15862by.get(i).mo12364E();
            }
            this.f15862by.clear();
        }
        this.f15856bs = null;
        if (this.f15863bz != null) {
            C3785l.m16612g(this.mContext).mo12371b(mo11525b(), this.f15863bz);
            this.f15863bz = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo12359f(IBinder iBinder) {
        try {
            mo11522a(C3793p.C3794a.m16652h(iBinder), new C3782d(this));
        } catch (RemoteException e) {
            Log.w("GmsClient", "service died");
        }
    }

    public final Context getContext() {
        return this.mContext;
    }

    public boolean isConnected() {
        return this.f15856bs != null;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.f15855bC) {
            z = this.f15854bB;
        }
        return z;
    }

    public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        boolean contains;
        C3802s.m16678d(connectionCallbacks);
        synchronized (this.f15857bt) {
            contains = this.f15857bt.contains(connectionCallbacks);
        }
        return contains;
    }

    public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        C3802s.m16678d(onConnectionFailedListener);
        synchronized (this.f15860bw) {
            contains = this.f15860bw.contains(onConnectionFailedListener);
        }
        return contains;
    }

    public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        C3802s.m16678d(connectionCallbacks);
        synchronized (this.f15857bt) {
            if (this.f15857bt.contains(connectionCallbacks)) {
                Log.w("GmsClient", "registerConnectionCallbacks(): listener " + connectionCallbacks + " is already registered");
            } else {
                if (this.f15859bv) {
                    this.f15857bt = new ArrayList<>(this.f15857bt);
                }
                this.f15857bt.add(connectionCallbacks);
            }
        }
        if (isConnected()) {
            this.mHandler.sendMessage(this.mHandler.obtainMessage(4, connectionCallbacks));
        }
    }

    public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        C3802s.m16678d(onConnectionFailedListener);
        synchronized (this.f15860bw) {
            if (this.f15860bw.contains(onConnectionFailedListener)) {
                Log.w("GmsClient", "registerConnectionFailedListener(): listener " + onConnectionFailedListener + " is already registered");
            } else {
                if (this.f15861bx) {
                    this.f15860bw = new ArrayList<>(this.f15860bw);
                }
                this.f15860bw.add(onConnectionFailedListener);
            }
        }
    }

    public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks) {
        C3802s.m16678d(connectionCallbacks);
        synchronized (this.f15857bt) {
            if (this.f15857bt != null) {
                if (this.f15859bv) {
                    this.f15857bt = new ArrayList<>(this.f15857bt);
                }
                if (!this.f15857bt.remove(connectionCallbacks)) {
                    Log.w("GmsClient", "unregisterConnectionCallbacks(): listener " + connectionCallbacks + " not found");
                } else if (this.f15859bv && !this.f15858bu.contains(connectionCallbacks)) {
                    this.f15858bu.add(connectionCallbacks);
                }
            }
        }
    }

    public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener onConnectionFailedListener) {
        C3802s.m16678d(onConnectionFailedListener);
        synchronized (this.f15860bw) {
            if (this.f15860bw != null) {
                if (this.f15861bx) {
                    this.f15860bw = new ArrayList<>(this.f15860bw);
                }
                if (!this.f15860bw.remove(onConnectionFailedListener)) {
                    Log.w("GmsClient", "unregisterConnectionFailedListener(): listener " + onConnectionFailedListener + " not found");
                }
            }
        }
    }

    /* renamed from: x */
    public final String[] mo12361x() {
        return this.f15864f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo11566y() {
        boolean z = true;
        synchronized (this.f15857bt) {
            C3802s.m16672a(!this.f15859bv);
            this.mHandler.removeMessages(4);
            this.f15859bv = true;
            if (this.f15858bu.size() != 0) {
                z = false;
            }
            C3802s.m16672a(z);
            Bundle z2 = mo11567z();
            ArrayList<GooglePlayServicesClient.ConnectionCallbacks> arrayList = this.f15857bt;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f15853bA && isConnected(); i++) {
                this.f15858bu.size();
                if (!this.f15858bu.contains(arrayList.get(i))) {
                    arrayList.get(i).onConnected(z2);
                }
            }
            this.f15858bu.clear();
            this.f15859bv = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Bundle mo11567z() {
        return null;
    }
}
