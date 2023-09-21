package p018cn.sharesdk.framework;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.cootek.geo.AbsGeoLocationItem;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import p018cn.sharesdk.framework.p019a.C0616g;
import p018cn.sharesdk.framework.utils.C0666e;
import p018cn.sharesdk.framework.utils.UIHandler;

/* renamed from: cn.sharesdk.framework.m */
public class C0658m extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    private Context f1608a;

    /* renamed from: b */
    private Handler f1609b;

    /* renamed from: c */
    private HashMap<String, HashMap<String, String>> f1610c;

    /* renamed from: d */
    private C0659a f1611d = C0659a.IDLE;

    /* renamed from: e */
    private String f1612e;

    /* renamed from: f */
    private String f1613f;

    /* renamed from: g */
    private boolean f1614g;

    /* renamed from: h */
    private boolean f1615h;

    /* renamed from: i */
    private ArrayList<Platform> f1616i;

    /* renamed from: j */
    private HashMap<Integer, CustomPlatform> f1617j;

    /* renamed from: k */
    private HashMap<Integer, Service> f1618k;

    /* renamed from: l */
    private HashMap<Integer, HashMap<String, Object>> f1619l;

    /* renamed from: cn.sharesdk.framework.m$a */
    private enum C0659a {
        IDLE,
        INITIALIZING,
        READY
    }

    public C0658m(Context context) {
        super("Thread-" + Math.abs(15420));
        this.f1608a = context.getApplicationContext();
        UIHandler.prepare();
        start();
        this.f1609b = new Handler(getLooper(), this);
        this.f1610c = new HashMap<>();
        this.f1616i = new ArrayList<>();
        this.f1617j = new HashMap<>();
        this.f1619l = new HashMap<>();
        this.f1618k = new HashMap<>();
    }

    /* renamed from: c */
    private void m3752c(String str) {
        HashMap remove;
        synchronized (this.f1610c) {
            this.f1610c.clear();
            m3753h();
            this.f1612e = str;
            if (this.f1610c.containsKey("ShareSDK") && (remove = this.f1610c.remove("ShareSDK")) != null) {
                if (this.f1612e == null) {
                    this.f1612e = (String) remove.get("AppKey");
                }
                this.f1613f = remove.containsKey("UseVersion") ? (String) remove.get("UseVersion") : AbsGeoLocationItem.LOCATION_RESULTTYPE_LATEST;
            }
        }
    }

    /* renamed from: h */
    private void m3753h() {
        XmlPullParser newPullParser;
        InputStream open;
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            newPullParser = newInstance.newPullParser();
            open = this.f1608a.getAssets().open("ShareSDK.xml");
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return;
        }
        newPullParser.setInput(open, "utf-8");
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                String name = newPullParser.getName();
                HashMap hashMap = new HashMap();
                int attributeCount = newPullParser.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    hashMap.put(newPullParser.getAttributeName(i), newPullParser.getAttributeValue(i));
                }
                this.f1610c.put(name, hashMap);
            }
        }
        open.close();
    }

    /* renamed from: i */
    private void m3754i() {
        synchronized (this.f1616i) {
            m3755j();
            m3756k();
            this.f1611d = C0659a.READY;
            this.f1616i.notify();
        }
    }

    /* renamed from: j */
    private void m3755j() {
        this.f1616i.clear();
        ArrayList<Platform> a = new C0656k().mo2429a(this.f1608a);
        if (a != null) {
            this.f1616i.addAll(a);
        }
    }

    /* renamed from: k */
    private void m3756k() {
        C0656k kVar = new C0656k();
        kVar.mo2432a(this);
        kVar.mo2431a(this.f1608a, this.f1612e, this.f1614g);
    }

    /* renamed from: a */
    public Platform mo2440a(String str) {
        Platform[] b;
        if (str == null || (b = mo2455b()) == null) {
            return null;
        }
        for (Platform platform : b) {
            if (str.equals(platform.getName())) {
                return platform;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo2441a(int i, String str) {
        return new C0656k().mo2428a(i, str, this.f1619l);
    }

    /* renamed from: a */
    public String mo2442a(String str, String str2) {
        String str3;
        synchronized (this.f1610c) {
            HashMap hashMap = this.f1610c.get(str);
            str3 = hashMap == null ? null : (String) hashMap.get(str2);
        }
        return str3;
    }

    /* renamed from: a */
    public void mo2443a() {
        synchronized (this.f1618k) {
            for (Map.Entry<Integer, Service> value : this.f1618k.entrySet()) {
                ((Service) value.getValue()).onUnbind();
            }
            this.f1618k.clear();
        }
        synchronized (this.f1617j) {
            this.f1617j.clear();
        }
        try {
            new C0656k().mo2437b(this.f1608a);
        } catch (Throwable th) {
            C0666e.m3838b(th);
        }
        getLooper().quit();
        this.f1611d = C0659a.IDLE;
    }

    /* renamed from: a */
    public void mo2444a(int i) {
        C0616g.f1476a = i;
    }

    /* renamed from: a */
    public void mo2445a(int i, Platform platform) {
        new C0656k().mo2430a(i, platform);
    }

    /* renamed from: a */
    public void mo2446a(Class<? extends CustomPlatform> cls) {
        synchronized (this.f1617j) {
            if (!this.f1617j.containsKey(Integer.valueOf(cls.hashCode()))) {
                try {
                    Constructor<? extends CustomPlatform> constructor = cls.getConstructor(new Class[]{Context.class});
                    Object[] objArr = {this.f1608a};
                    this.f1617j.put(Integer.valueOf(cls.hashCode()), (CustomPlatform) constructor.newInstance(objArr));
                } catch (Throwable th) {
                    C0666e.m3838b(th);
                }
                return;
            }
            return;
        }
    }

    /* renamed from: a */
    public void mo2447a(String str, int i) {
        new C0656k().mo2433a(str, i);
    }

    /* renamed from: a */
    public void mo2448a(String str, HashMap<String, Object> hashMap) {
        synchronized (this.f1610c) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry next : hashMap.entrySet()) {
                String str2 = (String) next.getKey();
                Object value = next.getValue();
                if (value != null) {
                    hashMap2.put(str2, String.valueOf(value));
                }
            }
            this.f1610c.put(str, hashMap2);
        }
    }

    /* renamed from: a */
    public void mo2449a(String str, boolean z) {
        this.f1611d = C0659a.INITIALIZING;
        this.f1614g = z;
        m3752c(str);
        Message message = new Message();
        message.what = 1;
        this.f1609b.sendMessage(message);
    }

    /* renamed from: a */
    public void mo2450a(boolean z) {
        this.f1615h = z;
    }

    /* renamed from: a */
    public boolean mo2451a(HashMap<String, Object> hashMap) {
        this.f1619l.clear();
        return new C0656k().mo2435a(hashMap, this.f1619l);
    }

    /* renamed from: b */
    public int mo2452b(String str) {
        Platform a = mo2440a(str);
        if (a == null) {
            return 0;
        }
        return a.getPlatformId();
    }

    /* renamed from: b */
    public void mo2453b(int i) {
        C0616g.f1477b = i;
    }

    /* renamed from: b */
    public void mo2454b(Class<? extends CustomPlatform> cls) {
        int hashCode = cls.hashCode();
        synchronized (this.f1617j) {
            this.f1617j.remove(Integer.valueOf(hashCode));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r6 = new java.util.ArrayList();
        r3 = r8.f1616i.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r3.hasNext() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r0 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r0.mo2100a() == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r6.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        r3 = r8.f1617j.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r3.hasNext() == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r0 = (p018cn.sharesdk.framework.Platform) r3.next().getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        if (r0.mo2100a() == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        r6.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        if (r6.size() > 0) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        r3 = new p018cn.sharesdk.framework.Platform[r6.size()];
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
        if (r1 >= r3.length) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        r3[r1] = (p018cn.sharesdk.framework.Platform) r6.get(r1);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        p018cn.sharesdk.framework.utils.C0666e.m3837b("sort list use time: %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return r3;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p018cn.sharesdk.framework.Platform[] mo2455b() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            long r4 = java.lang.System.currentTimeMillis()
            java.util.ArrayList<cn.sharesdk.framework.Platform> r3 = r8.f1616i
            monitor-enter(r3)
            cn.sharesdk.framework.m$a r0 = r8.f1611d     // Catch:{ all -> 0x0046 }
            cn.sharesdk.framework.m$a r6 = p018cn.sharesdk.framework.C0658m.C0659a.IDLE     // Catch:{ all -> 0x0046 }
            if (r0 != r6) goto L_0x0012
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            r0 = r1
        L_0x0011:
            return r0
        L_0x0012:
            cn.sharesdk.framework.m$a r0 = r8.f1611d     // Catch:{ all -> 0x0046 }
            cn.sharesdk.framework.m$a r6 = p018cn.sharesdk.framework.C0658m.C0659a.INITIALIZING     // Catch:{ all -> 0x0046 }
            if (r0 != r6) goto L_0x001d
            java.util.ArrayList<cn.sharesdk.framework.Platform> r0 = r8.f1616i     // Catch:{ Throwable -> 0x0041 }
            r0.wait()     // Catch:{ Throwable -> 0x0041 }
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList<cn.sharesdk.framework.Platform> r0 = r8.f1616i
            java.util.Iterator r3 = r0.iterator()
        L_0x0029:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r3.next()
            cn.sharesdk.framework.Platform r0 = (p018cn.sharesdk.framework.Platform) r0
            if (r0 == 0) goto L_0x0029
            boolean r7 = r0.mo2100a()
            if (r7 == 0) goto L_0x0029
            r6.add(r0)
            goto L_0x0029
        L_0x0041:
            r0 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x001d
        L_0x0046:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            throw r0
        L_0x0049:
            java.util.HashMap<java.lang.Integer, cn.sharesdk.framework.CustomPlatform> r0 = r8.f1617j
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0053:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            cn.sharesdk.framework.Platform r0 = (p018cn.sharesdk.framework.Platform) r0
            if (r0 == 0) goto L_0x0053
            boolean r7 = r0.mo2100a()
            if (r7 == 0) goto L_0x0053
            r6.add(r0)
            goto L_0x0053
        L_0x0071:
            int r0 = r6.size()
            if (r0 > 0) goto L_0x0079
            r0 = r1
            goto L_0x0011
        L_0x0079:
            int r0 = r6.size()
            cn.sharesdk.framework.Platform[] r3 = new p018cn.sharesdk.framework.Platform[r0]
            r1 = r2
        L_0x0080:
            int r0 = r3.length
            if (r1 >= r0) goto L_0x008f
            java.lang.Object r0 = r6.get(r1)
            cn.sharesdk.framework.Platform r0 = (p018cn.sharesdk.framework.Platform) r0
            r3[r1] = r0
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0080
        L_0x008f:
            java.lang.String r0 = "sort list use time: %s"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r6 = java.lang.System.currentTimeMillis()
            long r4 = r6 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1[r2] = r4
            p018cn.sharesdk.framework.utils.C0666e.m3837b(r0, r1)
            r0 = r3
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: p018cn.sharesdk.framework.C0658m.mo2455b():cn.sharesdk.framework.Platform[]");
    }

    /* renamed from: c */
    public String mo2456c(int i) {
        Platform[] b = mo2455b();
        if (b == null) {
            return null;
        }
        for (Platform platform : b) {
            if (platform != null && platform.getPlatformId() == i) {
                return platform.getName();
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo2457c(Class<? extends Service> cls) {
        synchronized (this.f1618k) {
            if (!this.f1618k.containsKey(Integer.valueOf(cls.hashCode()))) {
                try {
                    Service service = (Service) cls.newInstance();
                    this.f1618k.put(Integer.valueOf(cls.hashCode()), service);
                    service.mo2148a(this.f1608a);
                    service.mo2149a(this.f1612e);
                    service.onBind();
                } catch (Throwable th) {
                    C0666e.m3838b(th);
                }
                return;
            }
            return;
        }
    }

    /* renamed from: c */
    public boolean mo2458c() {
        return this.f1615h;
    }

    /* renamed from: d */
    public void mo2459d(Class<? extends Service> cls) {
        synchronized (this.f1618k) {
            int hashCode = cls.hashCode();
            if (this.f1618k.containsKey(Integer.valueOf(hashCode))) {
                this.f1618k.get(Integer.valueOf(hashCode)).onUnbind();
                this.f1618k.remove(Integer.valueOf(hashCode));
            }
        }
    }

    /* renamed from: d */
    public boolean mo2460d() {
        return this.f1614g;
    }

    /* renamed from: e */
    public <T extends Service> T mo2461e(Class<T> cls) {
        T t;
        synchronized (this.f1618k) {
            try {
                t = (Service) cls.cast(this.f1618k.get(Integer.valueOf(cls.hashCode())));
            } catch (Throwable th) {
                System.err.println(cls.getName() + " has not registered");
                C0666e.m3838b(th);
                t = null;
            }
        }
        return t;
    }

    /* renamed from: e */
    public boolean mo2462e() {
        return this.f1619l != null && this.f1619l.size() > 0;
    }

    /* renamed from: f */
    public String mo2463f() {
        try {
            return new C0656k().mo2427a();
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return "2.3.6";
        }
    }

    /* renamed from: g */
    public int mo2464g() {
        try {
            return new C0656k().mo2436b();
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return 31;
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                m3754i();
                return false;
            default:
                return false;
        }
    }
}
