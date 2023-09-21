package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.cootek.smartinput5.engine.Settings;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C3778k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.l */
public final class C3785l implements Handler.Callback {

    /* renamed from: bJ */
    private static final Object f15875bJ = new Object();

    /* renamed from: bK */
    private static C3785l f15876bK;

    /* renamed from: bL */
    private final Context f15877bL;
    /* access modifiers changed from: private */

    /* renamed from: bM */
    public final HashMap<String, C3786a> f15878bM = new HashMap<>();
    private final Handler mHandler;

    /* renamed from: com.google.android.gms.internal.l$a */
    final class C3786a {

        /* renamed from: bN */
        private final String f15879bN;

        /* renamed from: bO */
        private final C3787a f15880bO = new C3787a();
        /* access modifiers changed from: private */

        /* renamed from: bP */
        public final HashSet<C3778k<?>.e> f15881bP = new HashSet<>();

        /* renamed from: bQ */
        private boolean f15882bQ;
        /* access modifiers changed from: private */

        /* renamed from: bR */
        public IBinder f15883bR;
        /* access modifiers changed from: private */

        /* renamed from: bS */
        public ComponentName f15884bS;
        /* access modifiers changed from: private */
        public int mState = 0;

        /* renamed from: com.google.android.gms.internal.l$a$a */
        public class C3787a implements ServiceConnection {
            public C3787a() {
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                synchronized (C3785l.this.f15878bM) {
                    IBinder unused = C3786a.this.f15883bR = iBinder;
                    ComponentName unused2 = C3786a.this.f15884bS = componentName;
                    Iterator it = C3786a.this.f15881bP.iterator();
                    while (it.hasNext()) {
                        ((C3778k.C3783e) it.next()).onServiceConnected(componentName, iBinder);
                    }
                    int unused3 = C3786a.this.mState = 1;
                }
            }

            public void onServiceDisconnected(ComponentName componentName) {
                synchronized (C3785l.this.f15878bM) {
                    IBinder unused = C3786a.this.f15883bR = null;
                    ComponentName unused2 = C3786a.this.f15884bS = componentName;
                    Iterator it = C3786a.this.f15881bP.iterator();
                    while (it.hasNext()) {
                        ((C3778k.C3783e) it.next()).onServiceDisconnected(componentName);
                    }
                    int unused3 = C3786a.this.mState = 2;
                }
            }
        }

        public C3786a(String str) {
            this.f15879bN = str;
        }

        /* renamed from: F */
        public C3787a mo12373F() {
            return this.f15880bO;
        }

        /* renamed from: G */
        public String mo12374G() {
            return this.f15879bN;
        }

        /* renamed from: H */
        public boolean mo12375H() {
            return this.f15881bP.isEmpty();
        }

        /* renamed from: a */
        public void mo12376a(C3778k<?>.e eVar) {
            this.f15881bP.add(eVar);
        }

        /* renamed from: b */
        public void mo12377b(C3778k<?>.e eVar) {
            this.f15881bP.remove(eVar);
        }

        /* renamed from: b */
        public void mo12378b(boolean z) {
            this.f15882bQ = z;
        }

        /* renamed from: c */
        public boolean mo12379c(C3778k<?>.e eVar) {
            return this.f15881bP.contains(eVar);
        }

        public IBinder getBinder() {
            return this.f15883bR;
        }

        public ComponentName getComponentName() {
            return this.f15884bS;
        }

        public int getState() {
            return this.mState;
        }

        public boolean isBound() {
            return this.f15882bQ;
        }
    }

    private C3785l(Context context) {
        this.mHandler = new Handler(context.getMainLooper(), this);
        this.f15877bL = context.getApplicationContext();
    }

    /* renamed from: g */
    public static C3785l m16612g(Context context) {
        synchronized (f15875bJ) {
            if (f15876bK == null) {
                f15876bK = new C3785l(context.getApplicationContext());
            }
        }
        return f15876bK;
    }

    /* renamed from: a */
    public boolean mo12370a(String str, C3778k<?>.e eVar) {
        boolean isBound;
        synchronized (this.f15878bM) {
            C3786a aVar = this.f15878bM.get(str);
            if (aVar != null) {
                this.mHandler.removeMessages(0, aVar);
                if (!aVar.mo12379c(eVar)) {
                    aVar.mo12376a(eVar);
                    switch (aVar.getState()) {
                        case 1:
                            eVar.onServiceConnected(aVar.getComponentName(), aVar.getBinder());
                            break;
                        case 2:
                            aVar.mo12378b(this.f15877bL.bindService(new Intent(str).setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE), aVar.mo12373F(), Settings.RECENTLY_USED_SYMBOLS_CHS));
                            break;
                    }
                } else {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + str);
                }
            } else {
                aVar = new C3786a(str);
                aVar.mo12376a(eVar);
                aVar.mo12378b(this.f15877bL.bindService(new Intent(str).setPackage(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE), aVar.mo12373F(), Settings.RECENTLY_USED_SYMBOLS_CHS));
                this.f15878bM.put(str, aVar);
            }
            isBound = aVar.isBound();
        }
        return isBound;
    }

    /* renamed from: b */
    public void mo12371b(String str, C3778k<?>.e eVar) {
        synchronized (this.f15878bM) {
            C3786a aVar = this.f15878bM.get(str);
            if (aVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + str);
            } else if (!aVar.mo12379c(eVar)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + str);
            } else {
                aVar.mo12377b(eVar);
                if (aVar.mo12375H()) {
                    this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, aVar), 5000);
                }
            }
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                C3786a aVar = (C3786a) message.obj;
                synchronized (this.f15878bM) {
                    if (aVar.mo12375H()) {
                        this.f15877bL.unbindService(aVar.mo12373F());
                        this.f15878bM.remove(aVar.mo12374G());
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
