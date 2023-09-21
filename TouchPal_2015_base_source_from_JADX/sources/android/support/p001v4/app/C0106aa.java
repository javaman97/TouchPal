package android.support.p001v4.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.p001v4.app.C0038F;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.app.aa */
/* compiled from: NotificationManagerCompat */
public class C0106aa {

    /* renamed from: a */
    public static final String f290a = "android.support.useSideChannel";

    /* renamed from: b */
    public static final String f291b = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* renamed from: c */
    private static final String f292c = "NotifManCompat";

    /* renamed from: d */
    private static final int f293d = 1000;

    /* renamed from: e */
    private static final int f294e = 6;

    /* renamed from: f */
    private static final String f295f = "enabled_notification_listeners";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final int f296g = f302o.mo379a();

    /* renamed from: h */
    private static final Object f297h = new Object();

    /* renamed from: i */
    private static String f298i;

    /* renamed from: j */
    private static Set<String> f299j = new HashSet();

    /* renamed from: m */
    private static final Object f300m = new Object();

    /* renamed from: n */
    private static C0114h f301n;

    /* renamed from: o */
    private static final C0108b f302o;

    /* renamed from: k */
    private final Context f303k;

    /* renamed from: l */
    private final NotificationManager f304l = ((NotificationManager) this.f303k.getSystemService("notification"));

    /* renamed from: android.support.v4.app.aa$b */
    /* compiled from: NotificationManagerCompat */
    interface C0108b {
        /* renamed from: a */
        int mo379a();

        /* renamed from: a */
        void mo380a(NotificationManager notificationManager, String str, int i);

        /* renamed from: a */
        void mo381a(NotificationManager notificationManager, String str, int i, Notification notification);
    }

    /* renamed from: android.support.v4.app.aa$i */
    /* compiled from: NotificationManagerCompat */
    private interface C0116i {
        /* renamed from: a */
        void mo377a(C0038F f) throws RemoteException;
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f302o = new C0111e();
        } else if (Build.VERSION.SDK_INT >= 5) {
            f302o = new C0110d();
        } else {
            f302o = new C0109c();
        }
    }

    /* renamed from: a */
    public static C0106aa m428a(Context context) {
        return new C0106aa(context);
    }

    private C0106aa(Context context) {
        this.f303k = context;
    }

    /* renamed from: android.support.v4.app.aa$c */
    /* compiled from: NotificationManagerCompat */
    static class C0109c implements C0108b {
        C0109c() {
        }

        /* renamed from: a */
        public void mo380a(NotificationManager notificationManager, String str, int i) {
            notificationManager.cancel(i);
        }

        /* renamed from: a */
        public void mo381a(NotificationManager notificationManager, String str, int i, Notification notification) {
            notificationManager.notify(i, notification);
        }

        /* renamed from: a */
        public int mo379a() {
            return 1;
        }
    }

    /* renamed from: android.support.v4.app.aa$d */
    /* compiled from: NotificationManagerCompat */
    static class C0110d extends C0109c {
        C0110d() {
        }

        /* renamed from: a */
        public void mo380a(NotificationManager notificationManager, String str, int i) {
            C0117ab.m460a(notificationManager, str, i);
        }

        /* renamed from: a */
        public void mo381a(NotificationManager notificationManager, String str, int i, Notification notification) {
            C0117ab.m461a(notificationManager, str, i, notification);
        }
    }

    /* renamed from: android.support.v4.app.aa$e */
    /* compiled from: NotificationManagerCompat */
    static class C0111e extends C0110d {
        C0111e() {
        }

        /* renamed from: a */
        public int mo379a() {
            return 33;
        }
    }

    /* renamed from: a */
    public void mo373a(int i) {
        mo375a((String) null, i);
    }

    /* renamed from: a */
    public void mo375a(String str, int i) {
        f302o.mo380a(this.f304l, str, i);
        m429a((C0116i) new C0107a(this.f303k.getPackageName(), i, str));
    }

    /* renamed from: a */
    public void mo372a() {
        this.f304l.cancelAll();
        m429a((C0116i) new C0107a(this.f303k.getPackageName()));
    }

    /* renamed from: a */
    public void mo374a(int i, Notification notification) {
        mo376a((String) null, i, notification);
    }

    /* renamed from: a */
    public void mo376a(String str, int i, Notification notification) {
        if (m430a(notification)) {
            m429a((C0116i) new C0112f(this.f303k.getPackageName(), i, str, notification));
        } else {
            f302o.mo381a(this.f304l, str, i, notification);
        }
    }

    /* renamed from: b */
    public static Set<String> m432b(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), f295f);
        if (string != null && !string.equals(f298i)) {
            String[] split = string.split(":");
            HashSet hashSet = new HashSet(split.length);
            for (String unflattenFromString : split) {
                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                if (unflattenFromString2 != null) {
                    hashSet.add(unflattenFromString2.getPackageName());
                }
            }
            synchronized (f297h) {
                f299j = hashSet;
                f298i = string;
            }
        }
        return f299j;
    }

    /* renamed from: a */
    private static boolean m430a(Notification notification) {
        Bundle a = C0062Q.m169a(notification);
        return a != null && a.getBoolean(f290a);
    }

    /* renamed from: a */
    private void m429a(C0116i iVar) {
        synchronized (f300m) {
            if (f301n == null) {
                f301n = new C0114h(this.f303k.getApplicationContext());
            }
        }
        f301n.mo383a(iVar);
    }

    /* renamed from: android.support.v4.app.aa$h */
    /* compiled from: NotificationManagerCompat */
    private static class C0114h implements ServiceConnection, Handler.Callback {

        /* renamed from: a */
        private static final int f315a = 0;

        /* renamed from: b */
        private static final int f316b = 1;

        /* renamed from: c */
        private static final int f317c = 2;

        /* renamed from: d */
        private static final int f318d = 3;

        /* renamed from: e */
        private static final String f319e = "binder";

        /* renamed from: f */
        private final Context f320f;

        /* renamed from: g */
        private final HandlerThread f321g;

        /* renamed from: h */
        private final Handler f322h;

        /* renamed from: i */
        private final Map<ComponentName, C0115a> f323i = new HashMap();

        /* renamed from: j */
        private Set<String> f324j = new HashSet();

        public C0114h(Context context) {
            this.f320f = context;
            this.f321g = new HandlerThread("NotificationManagerCompat");
            this.f321g.start();
            this.f322h = new Handler(this.f321g.getLooper(), this);
        }

        /* renamed from: a */
        public void mo383a(C0116i iVar) {
            this.f322h.obtainMessage(0, iVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    m455b((C0116i) message.obj);
                    return true;
                case 1:
                    C0113g gVar = (C0113g) message.obj;
                    m451a(gVar.f313a, gVar.f314b);
                    return true;
                case 2:
                    m450a((ComponentName) message.obj);
                    return true;
                case 3:
                    m453b((ComponentName) message.obj);
                    return true;
                default:
                    return false;
            }
        }

        /* renamed from: b */
        private void m455b(C0116i iVar) {
            m449a();
            for (C0115a next : this.f323i.values()) {
                next.f328d.add(iVar);
                m457d(next);
            }
        }

        /* renamed from: a */
        private void m451a(ComponentName componentName, IBinder iBinder) {
            C0115a aVar = this.f323i.get(componentName);
            if (aVar != null) {
                aVar.f327c = C0038F.C0039a.m72a(iBinder);
                aVar.f329e = 0;
                m457d(aVar);
            }
        }

        /* renamed from: a */
        private void m450a(ComponentName componentName) {
            C0115a aVar = this.f323i.get(componentName);
            if (aVar != null) {
                m454b(aVar);
            }
        }

        /* renamed from: b */
        private void m453b(ComponentName componentName) {
            C0115a aVar = this.f323i.get(componentName);
            if (aVar != null) {
                m457d(aVar);
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(C0106aa.f292c, 3)) {
                Log.d(C0106aa.f292c, "Connected to service " + componentName);
            }
            this.f322h.obtainMessage(1, new C0113g(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(C0106aa.f292c, 3)) {
                Log.d(C0106aa.f292c, "Disconnected from service " + componentName);
            }
            this.f322h.obtainMessage(2, componentName).sendToTarget();
        }

        /* renamed from: a */
        private void m449a() {
            Set<String> b = C0106aa.m432b(this.f320f);
            if (!b.equals(this.f324j)) {
                this.f324j = b;
                List<ResolveInfo> queryIntentServices = this.f320f.getPackageManager().queryIntentServices(new Intent().setAction(C0106aa.f291b), 4);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (b.contains(next.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w(C0106aa.f292c, "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f323i.containsKey(componentName2)) {
                        if (Log.isLoggable(C0106aa.f292c, 3)) {
                            Log.d(C0106aa.f292c, "Adding listener record for " + componentName2);
                        }
                        this.f323i.put(componentName2, new C0115a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C0115a>> it = this.f323i.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable(C0106aa.f292c, 3)) {
                            Log.d(C0106aa.f292c, "Removing listener record for " + next2.getKey());
                        }
                        m454b((C0115a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m452a(C0115a aVar) {
            if (aVar.f326b) {
                return true;
            }
            aVar.f326b = this.f320f.bindService(new Intent(C0106aa.f291b).setComponent(aVar.f325a), this, C0106aa.f296g);
            if (aVar.f326b) {
                aVar.f329e = 0;
            } else {
                Log.w(C0106aa.f292c, "Unable to bind to listener " + aVar.f325a);
                this.f320f.unbindService(this);
            }
            return aVar.f326b;
        }

        /* renamed from: b */
        private void m454b(C0115a aVar) {
            if (aVar.f326b) {
                this.f320f.unbindService(this);
                aVar.f326b = false;
            }
            aVar.f327c = null;
        }

        /* renamed from: c */
        private void m456c(C0115a aVar) {
            if (!this.f322h.hasMessages(3, aVar.f325a)) {
                aVar.f329e++;
                if (aVar.f329e > 6) {
                    Log.w(C0106aa.f292c, "Giving up on delivering " + aVar.f328d.size() + " tasks to " + aVar.f325a + " after " + aVar.f329e + " retries");
                    aVar.f328d.clear();
                    return;
                }
                int i = (1 << (aVar.f329e - 1)) * 1000;
                if (Log.isLoggable(C0106aa.f292c, 3)) {
                    Log.d(C0106aa.f292c, "Scheduling retry for " + i + " ms");
                }
                this.f322h.sendMessageDelayed(this.f322h.obtainMessage(3, aVar.f325a), (long) i);
            }
        }

        /* renamed from: d */
        private void m457d(C0115a aVar) {
            if (Log.isLoggable(C0106aa.f292c, 3)) {
                Log.d(C0106aa.f292c, "Processing component " + aVar.f325a + ", " + aVar.f328d.size() + " queued tasks");
            }
            if (!aVar.f328d.isEmpty()) {
                if (!m452a(aVar) || aVar.f327c == null) {
                    m456c(aVar);
                    return;
                }
                while (true) {
                    C0116i peek = aVar.f328d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(C0106aa.f292c, 3)) {
                            Log.d(C0106aa.f292c, "Sending task " + peek);
                        }
                        peek.mo377a(aVar.f327c);
                        aVar.f328d.remove();
                    } catch (DeadObjectException e) {
                        if (Log.isLoggable(C0106aa.f292c, 3)) {
                            Log.d(C0106aa.f292c, "Remote service has died: " + aVar.f325a);
                        }
                    } catch (RemoteException e2) {
                        Log.w(C0106aa.f292c, "RemoteException communicating with " + aVar.f325a, e2);
                    }
                }
                if (!aVar.f328d.isEmpty()) {
                    m456c(aVar);
                }
            }
        }

        /* renamed from: android.support.v4.app.aa$h$a */
        /* compiled from: NotificationManagerCompat */
        private static class C0115a {

            /* renamed from: a */
            public final ComponentName f325a;

            /* renamed from: b */
            public boolean f326b = false;

            /* renamed from: c */
            public C0038F f327c;

            /* renamed from: d */
            public LinkedList<C0116i> f328d = new LinkedList<>();

            /* renamed from: e */
            public int f329e = 0;

            public C0115a(ComponentName componentName) {
                this.f325a = componentName;
            }
        }
    }

    /* renamed from: android.support.v4.app.aa$g */
    /* compiled from: NotificationManagerCompat */
    private static class C0113g {

        /* renamed from: a */
        final ComponentName f313a;

        /* renamed from: b */
        final IBinder f314b;

        public C0113g(ComponentName componentName, IBinder iBinder) {
            this.f313a = componentName;
            this.f314b = iBinder;
        }
    }

    /* renamed from: android.support.v4.app.aa$f */
    /* compiled from: NotificationManagerCompat */
    private static class C0112f implements C0116i {

        /* renamed from: a */
        final String f309a;

        /* renamed from: b */
        final int f310b;

        /* renamed from: c */
        final String f311c;

        /* renamed from: d */
        final Notification f312d;

        public C0112f(String str, int i, String str2, Notification notification) {
            this.f309a = str;
            this.f310b = i;
            this.f311c = str2;
            this.f312d = notification;
        }

        /* renamed from: a */
        public void mo377a(C0038F f) throws RemoteException {
            f.mo58a(this.f309a, this.f310b, this.f311c, this.f312d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:").append(this.f309a);
            sb.append(", id:").append(this.f310b);
            sb.append(", tag:").append(this.f311c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.app.aa$a */
    /* compiled from: NotificationManagerCompat */
    private static class C0107a implements C0116i {

        /* renamed from: a */
        final String f305a;

        /* renamed from: b */
        final int f306b;

        /* renamed from: c */
        final String f307c;

        /* renamed from: d */
        final boolean f308d;

        public C0107a(String str) {
            this.f305a = str;
            this.f306b = 0;
            this.f307c = null;
            this.f308d = true;
        }

        public C0107a(String str, int i, String str2) {
            this.f305a = str;
            this.f306b = i;
            this.f307c = str2;
            this.f308d = false;
        }

        /* renamed from: a */
        public void mo377a(C0038F f) throws RemoteException {
            if (this.f308d) {
                f.mo56a(this.f305a);
            } else {
                f.mo57a(this.f305a, this.f306b, this.f307c);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:").append(this.f305a);
            sb.append(", id:").append(this.f306b);
            sb.append(", tag:").append(this.f307c);
            sb.append(", all:").append(this.f308d);
            sb.append("]");
            return sb.toString();
        }
    }
}
