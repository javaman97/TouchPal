package android.support.p001v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.app.C0084S;
import android.support.p001v4.app.C0086T;
import android.support.p001v4.app.C0093Y;
import android.support.p001v4.app.C0095Z;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.Q */
/* compiled from: NotificationCompat */
public class C0062Q {

    /* renamed from: A */
    public static final String f113A = "android.icon";

    /* renamed from: B */
    public static final String f114B = "android.largeIcon";

    /* renamed from: C */
    public static final String f115C = "android.largeIcon.big";

    /* renamed from: D */
    public static final String f116D = "android.progress";

    /* renamed from: E */
    public static final String f117E = "android.progressMax";

    /* renamed from: F */
    public static final String f118F = "android.progressIndeterminate";

    /* renamed from: G */
    public static final String f119G = "android.showChronometer";

    /* renamed from: H */
    public static final String f120H = "android.picture";

    /* renamed from: I */
    public static final String f121I = "android.textLines";

    /* renamed from: J */
    public static final String f122J = "android.people";
    /* access modifiers changed from: private */

    /* renamed from: K */
    public static final C0073g f123K;

    /* renamed from: a */
    public static final int f124a = -1;

    /* renamed from: b */
    public static final int f125b = 1;

    /* renamed from: c */
    public static final int f126c = 2;

    /* renamed from: d */
    public static final int f127d = 4;

    /* renamed from: e */
    public static final int f128e = -1;

    /* renamed from: f */
    public static final int f129f = 1;

    /* renamed from: g */
    public static final int f130g = 2;

    /* renamed from: h */
    public static final int f131h = 4;

    /* renamed from: i */
    public static final int f132i = 8;

    /* renamed from: j */
    public static final int f133j = 16;

    /* renamed from: k */
    public static final int f134k = 32;

    /* renamed from: l */
    public static final int f135l = 64;

    /* renamed from: m */
    public static final int f136m = 128;

    /* renamed from: n */
    public static final int f137n = 256;

    /* renamed from: o */
    public static final int f138o = 512;

    /* renamed from: p */
    public static final int f139p = 0;

    /* renamed from: q */
    public static final int f140q = -1;

    /* renamed from: r */
    public static final int f141r = -2;

    /* renamed from: s */
    public static final int f142s = 1;

    /* renamed from: t */
    public static final int f143t = 2;

    /* renamed from: u */
    public static final String f144u = "android.title";

    /* renamed from: v */
    public static final String f145v = "android.title.big";

    /* renamed from: w */
    public static final String f146w = "android.text";

    /* renamed from: x */
    public static final String f147x = "android.subText";

    /* renamed from: y */
    public static final String f148y = "android.infoText";

    /* renamed from: z */
    public static final String f149z = "android.summaryText";

    /* renamed from: android.support.v4.app.Q$e */
    /* compiled from: NotificationCompat */
    public interface C0071e {
        /* renamed from: a */
        C0070d mo292a(C0070d dVar);
    }

    /* renamed from: android.support.v4.app.Q$g */
    /* compiled from: NotificationCompat */
    interface C0073g {
        /* renamed from: a */
        Notification mo296a(C0070d dVar);

        /* renamed from: a */
        Bundle mo297a(Notification notification);

        /* renamed from: a */
        C0064a mo298a(Notification notification, int i);

        /* renamed from: a */
        ArrayList<Parcelable> mo299a(C0064a[] aVarArr);

        /* renamed from: a */
        C0064a[] mo300a(ArrayList<Parcelable> arrayList);

        /* renamed from: b */
        int mo301b(Notification notification);

        /* renamed from: c */
        boolean mo302c(Notification notification);

        /* renamed from: d */
        String mo303d(Notification notification);

        /* renamed from: e */
        boolean mo304e(Notification notification);

        /* renamed from: f */
        String mo305f(Notification notification);
    }

    /* renamed from: android.support.v4.app.Q$i */
    /* compiled from: NotificationCompat */
    static class C0075i implements C0073g {
        C0075i() {
        }

        /* renamed from: a */
        public Notification mo296a(C0070d dVar) {
            Notification notification = dVar.f192w;
            notification.setLatestEventInfo(dVar.f170a, dVar.f171b, dVar.f172c, dVar.f173d);
            if (dVar.f179j > 0) {
                notification.flags |= 128;
            }
            return notification;
        }

        /* renamed from: a */
        public Bundle mo297a(Notification notification) {
            return null;
        }

        /* renamed from: b */
        public int mo301b(Notification notification) {
            return 0;
        }

        /* renamed from: a */
        public C0064a mo298a(Notification notification, int i) {
            return null;
        }

        /* renamed from: a */
        public C0064a[] mo300a(ArrayList<Parcelable> arrayList) {
            return null;
        }

        /* renamed from: a */
        public ArrayList<Parcelable> mo299a(C0064a[] aVarArr) {
            return null;
        }

        /* renamed from: c */
        public boolean mo302c(Notification notification) {
            return false;
        }

        /* renamed from: d */
        public String mo303d(Notification notification) {
            return null;
        }

        /* renamed from: e */
        public boolean mo304e(Notification notification) {
            return false;
        }

        /* renamed from: f */
        public String mo305f(Notification notification) {
            return null;
        }
    }

    /* renamed from: android.support.v4.app.Q$j */
    /* compiled from: NotificationCompat */
    static class C0076j extends C0075i {
        C0076j() {
        }

        /* renamed from: a */
        public Notification mo296a(C0070d dVar) {
            Notification notification = dVar.f192w;
            notification.setLatestEventInfo(dVar.f170a, dVar.f171b, dVar.f172c, dVar.f173d);
            Notification a = C0090V.m361a(notification, dVar.f170a, dVar.f171b, dVar.f172c, dVar.f173d, dVar.f174e);
            if (dVar.f179j > 0) {
                a.flags |= 128;
            }
            return a;
        }
    }

    /* renamed from: android.support.v4.app.Q$k */
    /* compiled from: NotificationCompat */
    static class C0077k extends C0075i {
        C0077k() {
        }

        /* renamed from: a */
        public Notification mo296a(C0070d dVar) {
            return C0091W.m362a(dVar.f170a, dVar.f192w, dVar.f171b, dVar.f172c, dVar.f177h, dVar.f175f, dVar.f178i, dVar.f173d, dVar.f174e, dVar.f176g);
        }
    }

    /* renamed from: android.support.v4.app.Q$l */
    /* compiled from: NotificationCompat */
    static class C0078l extends C0075i {
        C0078l() {
        }

        /* renamed from: a */
        public Notification mo296a(C0070d dVar) {
            return C0092X.m363a(dVar.f170a, dVar.f192w, dVar.f171b, dVar.f172c, dVar.f177h, dVar.f175f, dVar.f178i, dVar.f173d, dVar.f174e, dVar.f176g, dVar.f183n, dVar.f184o, dVar.f185p);
        }
    }

    /* renamed from: android.support.v4.app.Q$m */
    /* compiled from: NotificationCompat */
    static class C0079m extends C0075i {
        C0079m() {
        }

        /* renamed from: a */
        public Notification mo296a(C0070d dVar) {
            C0093Y.C0094a aVar = new C0093Y.C0094a(dVar.f170a, dVar.f192w, dVar.f171b, dVar.f172c, dVar.f177h, dVar.f175f, dVar.f178i, dVar.f173d, dVar.f174e, dVar.f176g, dVar.f183n, dVar.f184o, dVar.f185p, dVar.f180k, dVar.f179j, dVar.f182m, dVar.f190u, dVar.f191v, dVar.f186q, dVar.f187r, dVar.f188s);
            C0062Q.m176b((C0060O) aVar, dVar.f189t);
            C0062Q.m177b((C0061P) aVar, dVar.f181l);
            return aVar.mo347b();
        }

        /* renamed from: a */
        public Bundle mo297a(Notification notification) {
            return C0093Y.m365a(notification);
        }

        /* renamed from: b */
        public int mo301b(Notification notification) {
            return C0093Y.m377b(notification);
        }

        /* renamed from: a */
        public C0064a mo298a(Notification notification, int i) {
            return (C0064a) C0093Y.m367a(notification, i, C0064a.f150d, C0119ad.f333c);
        }

        /* renamed from: a */
        public C0064a[] mo300a(ArrayList<Parcelable> arrayList) {
            return (C0064a[]) C0093Y.m376a(arrayList, C0064a.f150d, C0119ad.f333c);
        }

        /* renamed from: a */
        public ArrayList<Parcelable> mo299a(C0064a[] aVarArr) {
            return C0093Y.m371a((C0086T.C0087a[]) aVarArr);
        }

        /* renamed from: c */
        public boolean mo302c(Notification notification) {
            return C0093Y.m378c(notification);
        }

        /* renamed from: d */
        public String mo303d(Notification notification) {
            return C0093Y.m379d(notification);
        }

        /* renamed from: e */
        public boolean mo304e(Notification notification) {
            return C0093Y.m380e(notification);
        }

        /* renamed from: f */
        public String mo305f(Notification notification) {
            return C0093Y.m381f(notification);
        }
    }

    /* renamed from: android.support.v4.app.Q$n */
    /* compiled from: NotificationCompat */
    static class C0080n extends C0079m {
        C0080n() {
        }

        /* renamed from: a */
        public Notification mo296a(C0070d dVar) {
            C0095Z.C0096a aVar = new C0095Z.C0096a(dVar.f170a, dVar.f192w, dVar.f171b, dVar.f172c, dVar.f177h, dVar.f175f, dVar.f178i, dVar.f173d, dVar.f174e, dVar.f176g, dVar.f183n, dVar.f184o, dVar.f185p, dVar.f180k, dVar.f179j, dVar.f182m, dVar.f190u, dVar.f191v, dVar.f186q, dVar.f187r, dVar.f188s);
            C0062Q.m176b((C0060O) aVar, dVar.f189t);
            C0062Q.m177b((C0061P) aVar, dVar.f181l);
            return aVar.mo348b();
        }

        /* renamed from: a */
        public Bundle mo297a(Notification notification) {
            return C0095Z.m386a(notification);
        }

        /* renamed from: b */
        public int mo301b(Notification notification) {
            return C0095Z.m388b(notification);
        }

        /* renamed from: a */
        public C0064a mo298a(Notification notification, int i) {
            return (C0064a) C0095Z.m387a(notification, i, C0064a.f150d, C0119ad.f333c);
        }

        /* renamed from: c */
        public boolean mo302c(Notification notification) {
            return C0095Z.m389c(notification);
        }

        /* renamed from: d */
        public String mo303d(Notification notification) {
            return C0095Z.m390d(notification);
        }

        /* renamed from: e */
        public boolean mo304e(Notification notification) {
            return C0095Z.m391e(notification);
        }

        /* renamed from: f */
        public String mo305f(Notification notification) {
            return C0095Z.m392f(notification);
        }
    }

    /* renamed from: android.support.v4.app.Q$h */
    /* compiled from: NotificationCompat */
    static class C0074h extends C0080n {
        C0074h() {
        }

        /* renamed from: a */
        public Notification mo296a(C0070d dVar) {
            C0084S.C0085a aVar = new C0084S.C0085a(dVar.f170a, dVar.f192w, dVar.f171b, dVar.f172c, dVar.f177h, dVar.f175f, dVar.f178i, dVar.f173d, dVar.f174e, dVar.f176g, dVar.f183n, dVar.f184o, dVar.f185p, dVar.f180k, dVar.f179j, dVar.f182m, dVar.f190u, dVar.f191v, dVar.f186q, dVar.f187r, dVar.f188s);
            C0062Q.m176b((C0060O) aVar, dVar.f189t);
            C0062Q.m177b((C0061P) aVar, dVar.f181l);
            return aVar.mo346b();
        }

        /* renamed from: a */
        public C0064a mo298a(Notification notification, int i) {
            return (C0064a) C0084S.m344a(notification, i, C0064a.f150d, C0119ad.f333c);
        }

        /* renamed from: a */
        public C0064a[] mo300a(ArrayList<Parcelable> arrayList) {
            return (C0064a[]) C0084S.m347a(arrayList, C0064a.f150d, C0119ad.f333c);
        }

        /* renamed from: a */
        public ArrayList<Parcelable> mo299a(C0064a[] aVarArr) {
            return C0084S.m345a((C0086T.C0087a[]) aVarArr);
        }

        /* renamed from: c */
        public boolean mo302c(Notification notification) {
            return C0084S.m346a(notification);
        }

        /* renamed from: d */
        public String mo303d(Notification notification) {
            return C0084S.m348b(notification);
        }

        /* renamed from: e */
        public boolean mo304e(Notification notification) {
            return C0084S.m349c(notification);
        }

        /* renamed from: f */
        public String mo305f(Notification notification) {
            return C0084S.m350d(notification);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m176b(C0060O o, ArrayList<C0064a> arrayList) {
        Iterator<C0064a> it = arrayList.iterator();
        while (it.hasNext()) {
            o.mo228a(it.next());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m177b(C0061P p, C0081o oVar) {
        if (oVar == null) {
            return;
        }
        if (oVar instanceof C0069c) {
            C0069c cVar = (C0069c) oVar;
            C0093Y.m373a(p, cVar.f195e, cVar.f197g, cVar.f196f, cVar.f169a);
        } else if (oVar instanceof C0072f) {
            C0072f fVar = (C0072f) oVar;
            C0093Y.m374a(p, fVar.f195e, fVar.f197g, fVar.f196f, fVar.f193a);
        } else if (oVar instanceof C0068b) {
            C0068b bVar = (C0068b) oVar;
            C0093Y.m372a(p, bVar.f195e, bVar.f197g, bVar.f196f, bVar.f166a, bVar.f167b, bVar.f168c);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 20) {
            f123K = new C0074h();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f123K = new C0080n();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f123K = new C0079m();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f123K = new C0078l();
        } else if (Build.VERSION.SDK_INT >= 11) {
            f123K = new C0077k();
        } else if (Build.VERSION.SDK_INT >= 9) {
            f123K = new C0076j();
        } else {
            f123K = new C0075i();
        }
    }

    /* renamed from: android.support.v4.app.Q$d */
    /* compiled from: NotificationCompat */
    public static class C0070d {

        /* renamed from: a */
        Context f170a;

        /* renamed from: b */
        CharSequence f171b;

        /* renamed from: c */
        CharSequence f172c;

        /* renamed from: d */
        PendingIntent f173d;

        /* renamed from: e */
        PendingIntent f174e;

        /* renamed from: f */
        RemoteViews f175f;

        /* renamed from: g */
        Bitmap f176g;

        /* renamed from: h */
        CharSequence f177h;

        /* renamed from: i */
        int f178i;

        /* renamed from: j */
        int f179j;

        /* renamed from: k */
        boolean f180k;

        /* renamed from: l */
        C0081o f181l;

        /* renamed from: m */
        CharSequence f182m;

        /* renamed from: n */
        int f183n;

        /* renamed from: o */
        int f184o;

        /* renamed from: p */
        boolean f185p;

        /* renamed from: q */
        String f186q;

        /* renamed from: r */
        boolean f187r;

        /* renamed from: s */
        String f188s;

        /* renamed from: t */
        ArrayList<C0064a> f189t = new ArrayList<>();

        /* renamed from: u */
        boolean f190u = false;

        /* renamed from: v */
        Bundle f191v;

        /* renamed from: w */
        Notification f192w = new Notification();

        public C0070d(Context context) {
            this.f170a = context;
            this.f192w.when = System.currentTimeMillis();
            this.f192w.audioStreamType = -1;
            this.f179j = 0;
        }

        /* renamed from: a */
        public C0070d mo259a(long j) {
            this.f192w.when = j;
            return this;
        }

        /* renamed from: a */
        public C0070d mo273a(boolean z) {
            this.f180k = z;
            return this;
        }

        /* renamed from: a */
        public C0070d mo254a(int i) {
            this.f192w.icon = i;
            return this;
        }

        /* renamed from: a */
        public C0070d mo255a(int i, int i2) {
            this.f192w.icon = i;
            this.f192w.iconLevel = i2;
            return this;
        }

        /* renamed from: a */
        public C0070d mo270a(CharSequence charSequence) {
            this.f171b = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0070d mo279b(CharSequence charSequence) {
            this.f172c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0070d mo284c(CharSequence charSequence) {
            this.f182m = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0070d mo276b(int i) {
            this.f178i = i;
            return this;
        }

        /* renamed from: d */
        public C0070d mo287d(CharSequence charSequence) {
            this.f177h = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0070d mo257a(int i, int i2, boolean z) {
            this.f183n = i;
            this.f184o = i2;
            this.f185p = z;
            return this;
        }

        /* renamed from: a */
        public C0070d mo269a(RemoteViews remoteViews) {
            this.f192w.contentView = remoteViews;
            return this;
        }

        /* renamed from: a */
        public C0070d mo260a(PendingIntent pendingIntent) {
            this.f173d = pendingIntent;
            return this;
        }

        /* renamed from: b */
        public C0070d mo277b(PendingIntent pendingIntent) {
            this.f192w.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public C0070d mo261a(PendingIntent pendingIntent, boolean z) {
            this.f174e = pendingIntent;
            m208a(128, z);
            return this;
        }

        /* renamed from: e */
        public C0070d mo289e(CharSequence charSequence) {
            this.f192w.tickerText = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0070d mo271a(CharSequence charSequence, RemoteViews remoteViews) {
            this.f192w.tickerText = charSequence;
            this.f175f = remoteViews;
            return this;
        }

        /* renamed from: a */
        public C0070d mo262a(Bitmap bitmap) {
            this.f176g = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0070d mo263a(Uri uri) {
            this.f192w.sound = uri;
            this.f192w.audioStreamType = -1;
            return this;
        }

        /* renamed from: a */
        public C0070d mo264a(Uri uri, int i) {
            this.f192w.sound = uri;
            this.f192w.audioStreamType = i;
            return this;
        }

        /* renamed from: a */
        public C0070d mo274a(long[] jArr) {
            this.f192w.vibrate = jArr;
            return this;
        }

        /* renamed from: a */
        public C0070d mo256a(int i, int i2, int i3) {
            boolean z;
            int i4 = 1;
            this.f192w.ledARGB = i;
            this.f192w.ledOnMS = i2;
            this.f192w.ledOffMS = i3;
            if (this.f192w.ledOnMS == 0 || this.f192w.ledOffMS == 0) {
                z = false;
            } else {
                z = true;
            }
            Notification notification = this.f192w;
            int i5 = this.f192w.flags & -2;
            if (!z) {
                i4 = 0;
            }
            notification.flags = i5 | i4;
            return this;
        }

        /* renamed from: b */
        public C0070d mo281b(boolean z) {
            m208a(2, z);
            return this;
        }

        /* renamed from: c */
        public C0070d mo285c(boolean z) {
            m208a(8, z);
            return this;
        }

        /* renamed from: d */
        public C0070d mo288d(boolean z) {
            m208a(16, z);
            return this;
        }

        /* renamed from: e */
        public C0070d mo290e(boolean z) {
            this.f190u = z;
            return this;
        }

        /* renamed from: c */
        public C0070d mo283c(int i) {
            this.f192w.defaults = i;
            if ((i & 4) != 0) {
                this.f192w.flags |= 1;
            }
            return this;
        }

        /* renamed from: a */
        private void m208a(int i, boolean z) {
            if (z) {
                this.f192w.flags |= i;
                return;
            }
            this.f192w.flags &= i ^ -1;
        }

        /* renamed from: d */
        public C0070d mo286d(int i) {
            this.f179j = i;
            return this;
        }

        /* renamed from: a */
        public C0070d mo272a(String str) {
            this.f186q = str;
            return this;
        }

        /* renamed from: f */
        public C0070d mo291f(boolean z) {
            this.f187r = z;
            return this;
        }

        /* renamed from: b */
        public C0070d mo280b(String str) {
            this.f188s = str;
            return this;
        }

        /* renamed from: a */
        public C0070d mo265a(Bundle bundle) {
            if (bundle != null) {
                if (this.f191v == null) {
                    this.f191v = new Bundle(bundle);
                } else {
                    this.f191v.putAll(bundle);
                }
            }
            return this;
        }

        /* renamed from: b */
        public C0070d mo278b(Bundle bundle) {
            this.f191v = bundle;
            return this;
        }

        /* renamed from: a */
        public Bundle mo253a() {
            if (this.f191v == null) {
                this.f191v = new Bundle();
            }
            return this.f191v;
        }

        /* renamed from: a */
        public C0070d mo258a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f189t.add(new C0064a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C0070d mo266a(C0064a aVar) {
            this.f189t.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C0070d mo268a(C0081o oVar) {
            if (this.f181l != oVar) {
                this.f181l = oVar;
                if (this.f181l != null) {
                    this.f181l.mo307a(this);
                }
            }
            return this;
        }

        /* renamed from: a */
        public C0070d mo267a(C0071e eVar) {
            eVar.mo292a(this);
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public Notification mo275b() {
            return C0062Q.f123K.mo296a(this);
        }

        /* renamed from: c */
        public Notification mo282c() {
            return C0062Q.f123K.mo296a(this);
        }
    }

    /* renamed from: android.support.v4.app.Q$o */
    /* compiled from: NotificationCompat */
    public static abstract class C0081o {

        /* renamed from: d */
        C0070d f194d;

        /* renamed from: e */
        CharSequence f195e;

        /* renamed from: f */
        CharSequence f196f;

        /* renamed from: g */
        boolean f197g = false;

        /* renamed from: a */
        public void mo307a(C0070d dVar) {
            if (this.f194d != dVar) {
                this.f194d = dVar;
                if (this.f194d != null) {
                    this.f194d.mo268a(this);
                }
            }
        }

        /* renamed from: a */
        public Notification mo306a() {
            if (this.f194d != null) {
                return this.f194d.mo282c();
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.app.Q$b */
    /* compiled from: NotificationCompat */
    public static class C0068b extends C0081o {

        /* renamed from: a */
        Bitmap f166a;

        /* renamed from: b */
        Bitmap f167b;

        /* renamed from: c */
        boolean f168c;

        public C0068b() {
        }

        public C0068b(C0070d dVar) {
            mo307a(dVar);
        }

        /* renamed from: a */
        public C0068b mo247a(CharSequence charSequence) {
            this.f195e = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0068b mo249b(CharSequence charSequence) {
            this.f196f = charSequence;
            this.f197g = true;
            return this;
        }

        /* renamed from: a */
        public C0068b mo246a(Bitmap bitmap) {
            this.f166a = bitmap;
            return this;
        }

        /* renamed from: b */
        public C0068b mo248b(Bitmap bitmap) {
            this.f167b = bitmap;
            this.f168c = true;
            return this;
        }
    }

    /* renamed from: android.support.v4.app.Q$c */
    /* compiled from: NotificationCompat */
    public static class C0069c extends C0081o {

        /* renamed from: a */
        CharSequence f169a;

        public C0069c() {
        }

        public C0069c(C0070d dVar) {
            mo307a(dVar);
        }

        /* renamed from: a */
        public C0069c mo250a(CharSequence charSequence) {
            this.f195e = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0069c mo251b(CharSequence charSequence) {
            this.f196f = charSequence;
            this.f197g = true;
            return this;
        }

        /* renamed from: c */
        public C0069c mo252c(CharSequence charSequence) {
            this.f169a = charSequence;
            return this;
        }
    }

    /* renamed from: android.support.v4.app.Q$f */
    /* compiled from: NotificationCompat */
    public static class C0072f extends C0081o {

        /* renamed from: a */
        ArrayList<CharSequence> f193a = new ArrayList<>();

        public C0072f() {
        }

        public C0072f(C0070d dVar) {
            mo307a(dVar);
        }

        /* renamed from: a */
        public C0072f mo293a(CharSequence charSequence) {
            this.f195e = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0072f mo294b(CharSequence charSequence) {
            this.f196f = charSequence;
            this.f197g = true;
            return this;
        }

        /* renamed from: c */
        public C0072f mo295c(CharSequence charSequence) {
            this.f193a.add(charSequence);
            return this;
        }
    }

    /* renamed from: android.support.v4.app.Q$a */
    /* compiled from: NotificationCompat */
    public static class C0064a extends C0086T.C0087a {

        /* renamed from: d */
        public static final C0086T.C0087a.C0088a f150d = new C0083R();

        /* renamed from: a */
        public int f151a;

        /* renamed from: b */
        public CharSequence f152b;

        /* renamed from: c */
        public PendingIntent f153c;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Bundle f154e;

        /* renamed from: f */
        private final C0119ad[] f155f;

        /* renamed from: android.support.v4.app.Q$a$b */
        /* compiled from: NotificationCompat */
        public interface C0066b {
            /* renamed from: a */
            C0065a mo241a(C0065a aVar);
        }

        public C0064a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), (C0119ad[]) null);
        }

        private C0064a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0119ad[] adVarArr) {
            this.f151a = i;
            this.f152b = charSequence;
            this.f153c = pendingIntent;
            this.f154e = bundle == null ? new Bundle() : bundle;
            this.f155f = adVarArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo230a() {
            return this.f151a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public CharSequence mo231b() {
            return this.f152b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public PendingIntent mo232c() {
            return this.f153c;
        }

        /* renamed from: d */
        public Bundle mo233d() {
            return this.f154e;
        }

        /* renamed from: e */
        public C0119ad[] mo235f() {
            return this.f155f;
        }

        /* renamed from: android.support.v4.app.Q$a$a */
        /* compiled from: NotificationCompat */
        public static final class C0065a {

            /* renamed from: a */
            private final int f156a;

            /* renamed from: b */
            private final CharSequence f157b;

            /* renamed from: c */
            private final PendingIntent f158c;

            /* renamed from: d */
            private final Bundle f159d;

            /* renamed from: e */
            private ArrayList<C0119ad> f160e;

            public C0065a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle());
            }

            public C0065a(C0064a aVar) {
                this(aVar.f151a, aVar.f152b, aVar.f153c, new Bundle(aVar.f154e));
            }

            private C0065a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
                this.f156a = i;
                this.f157b = charSequence;
                this.f158c = pendingIntent;
                this.f159d = bundle;
            }

            /* renamed from: a */
            public C0065a mo237a(Bundle bundle) {
                if (bundle != null) {
                    this.f159d.putAll(bundle);
                }
                return this;
            }

            /* renamed from: a */
            public Bundle mo236a() {
                return this.f159d;
            }

            /* renamed from: a */
            public C0065a mo239a(C0119ad adVar) {
                if (this.f160e == null) {
                    this.f160e = new ArrayList<>();
                }
                this.f160e.add(adVar);
                return this;
            }

            /* renamed from: a */
            public C0065a mo238a(C0066b bVar) {
                bVar.mo241a(this);
                return this;
            }

            /* renamed from: b */
            public C0064a mo240b() {
                C0119ad[] adVarArr;
                if (this.f160e != null) {
                    adVarArr = (C0119ad[]) this.f160e.toArray(new C0119ad[this.f160e.size()]);
                } else {
                    adVarArr = null;
                }
                return new C0064a(this.f156a, this.f157b, this.f158c, this.f159d, adVarArr);
            }
        }

        /* renamed from: android.support.v4.app.Q$a$c */
        /* compiled from: NotificationCompat */
        public static final class C0067c implements C0066b {

            /* renamed from: a */
            private static final String f161a = "android.wearable.EXTENSIONS";

            /* renamed from: b */
            private static final String f162b = "flags";

            /* renamed from: c */
            private static final int f163c = 1;

            /* renamed from: d */
            private static final int f164d = 1;

            /* renamed from: e */
            private int f165e = 1;

            public C0067c() {
            }

            public C0067c(C0064a aVar) {
                Bundle bundle = aVar.mo233d().getBundle(f161a);
                if (bundle != null) {
                    this.f165e = bundle.getInt(f162b, 1);
                }
            }

            /* renamed from: a */
            public C0065a mo241a(C0065a aVar) {
                Bundle bundle = new Bundle();
                if (this.f165e != 1) {
                    bundle.putInt(f162b, this.f165e);
                }
                aVar.mo236a().putBundle(f161a, bundle);
                return aVar;
            }

            /* renamed from: a */
            public C0067c clone() {
                C0067c cVar = new C0067c();
                cVar.f165e = this.f165e;
                return cVar;
            }

            /* renamed from: a */
            public C0067c mo243a(boolean z) {
                m196a(1, z);
                return this;
            }

            /* renamed from: b */
            public boolean mo244b() {
                return (this.f165e & 1) != 0;
            }

            /* renamed from: a */
            private void m196a(int i, boolean z) {
                if (z) {
                    this.f165e |= i;
                } else {
                    this.f165e &= i ^ -1;
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.Q$p */
    /* compiled from: NotificationCompat */
    public static final class C0082p implements C0071e {

        /* renamed from: a */
        public static final int f198a = -1;

        /* renamed from: b */
        public static final int f199b = 0;

        /* renamed from: c */
        public static final int f200c = 1;

        /* renamed from: d */
        public static final int f201d = 2;

        /* renamed from: e */
        public static final int f202e = 3;

        /* renamed from: f */
        public static final int f203f = 4;

        /* renamed from: g */
        public static final int f204g = 5;

        /* renamed from: h */
        private static final String f205h = "android.wearable.EXTENSIONS";

        /* renamed from: i */
        private static final String f206i = "actions";

        /* renamed from: j */
        private static final String f207j = "flags";

        /* renamed from: k */
        private static final String f208k = "displayIntent";

        /* renamed from: l */
        private static final String f209l = "pages";

        /* renamed from: m */
        private static final String f210m = "background";

        /* renamed from: n */
        private static final String f211n = "contentIcon";

        /* renamed from: o */
        private static final String f212o = "contentIconGravity";

        /* renamed from: p */
        private static final String f213p = "contentActionIndex";

        /* renamed from: q */
        private static final String f214q = "customSizePreset";

        /* renamed from: r */
        private static final String f215r = "customContentHeight";

        /* renamed from: s */
        private static final String f216s = "gravity";

        /* renamed from: t */
        private static final int f217t = 1;

        /* renamed from: u */
        private static final int f218u = 2;

        /* renamed from: v */
        private static final int f219v = 4;

        /* renamed from: w */
        private static final int f220w = 8;

        /* renamed from: x */
        private static final int f221x = 1;

        /* renamed from: y */
        private static final int f222y = 8388613;

        /* renamed from: z */
        private static final int f223z = 80;

        /* renamed from: A */
        private ArrayList<C0064a> f224A = new ArrayList<>();

        /* renamed from: B */
        private int f225B = 1;

        /* renamed from: C */
        private PendingIntent f226C;

        /* renamed from: D */
        private ArrayList<Notification> f227D = new ArrayList<>();

        /* renamed from: E */
        private Bitmap f228E;

        /* renamed from: F */
        private int f229F;

        /* renamed from: G */
        private int f230G = 8388613;

        /* renamed from: H */
        private int f231H = -1;

        /* renamed from: I */
        private int f232I = 0;

        /* renamed from: J */
        private int f233J;

        /* renamed from: K */
        private int f234K = 80;

        public C0082p() {
        }

        public C0082p(Notification notification) {
            Bundle a = C0062Q.m169a(notification);
            Bundle bundle = a != null ? a.getBundle(f205h) : null;
            if (bundle != null) {
                C0064a[] a2 = C0062Q.f123K.mo300a((ArrayList<Parcelable>) bundle.getParcelableArrayList(f206i));
                if (a2 != null) {
                    Collections.addAll(this.f224A, a2);
                }
                this.f225B = bundle.getInt(f207j, 1);
                this.f226C = (PendingIntent) bundle.getParcelable(f208k);
                Notification[] a3 = C0062Q.m178b(bundle, f209l);
                if (a3 != null) {
                    Collections.addAll(this.f227D, a3);
                }
                this.f228E = (Bitmap) bundle.getParcelable(f210m);
                this.f229F = bundle.getInt(f211n);
                this.f230G = bundle.getInt(f212o, 8388613);
                this.f231H = bundle.getInt(f213p, -1);
                this.f232I = bundle.getInt(f214q, 0);
                this.f233J = bundle.getInt(f215r);
                this.f234K = bundle.getInt(f216s, 80);
            }
        }

        /* renamed from: a */
        public C0070d mo292a(C0070d dVar) {
            Bundle bundle = new Bundle();
            if (!this.f224A.isEmpty()) {
                bundle.putParcelableArrayList(f206i, C0062Q.f123K.mo299a((C0064a[]) this.f224A.toArray(new C0064a[this.f224A.size()])));
            }
            if (this.f225B != 1) {
                bundle.putInt(f207j, this.f225B);
            }
            if (this.f226C != null) {
                bundle.putParcelable(f208k, this.f226C);
            }
            if (!this.f227D.isEmpty()) {
                bundle.putParcelableArray(f209l, (Parcelable[]) this.f227D.toArray(new Notification[this.f227D.size()]));
            }
            if (this.f228E != null) {
                bundle.putParcelable(f210m, this.f228E);
            }
            if (this.f229F != 0) {
                bundle.putInt(f211n, this.f229F);
            }
            if (this.f230G != 8388613) {
                bundle.putInt(f212o, this.f230G);
            }
            if (this.f231H != -1) {
                bundle.putInt(f213p, this.f231H);
            }
            if (this.f232I != 0) {
                bundle.putInt(f214q, this.f232I);
            }
            if (this.f233J != 0) {
                bundle.putInt(f215r, this.f233J);
            }
            if (this.f234K != 80) {
                bundle.putInt(f216s, this.f234K);
            }
            dVar.mo253a().putBundle(f205h, bundle);
            return dVar;
        }

        /* renamed from: a */
        public C0082p clone() {
            C0082p pVar = new C0082p();
            pVar.f224A = new ArrayList<>(this.f224A);
            pVar.f225B = this.f225B;
            pVar.f226C = this.f226C;
            pVar.f227D = new ArrayList<>(this.f227D);
            pVar.f228E = this.f228E;
            pVar.f229F = this.f229F;
            pVar.f230G = this.f230G;
            pVar.f231H = this.f231H;
            pVar.f232I = this.f232I;
            pVar.f233J = this.f233J;
            pVar.f234K = this.f234K;
            return pVar;
        }

        /* renamed from: a */
        public C0082p mo313a(C0064a aVar) {
            this.f224A.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C0082p mo314a(List<C0064a> list) {
            this.f224A.addAll(list);
            return this;
        }

        /* renamed from: b */
        public C0082p mo316b() {
            this.f224A.clear();
            return this;
        }

        /* renamed from: c */
        public List<C0064a> mo322c() {
            return this.f224A;
        }

        /* renamed from: a */
        public C0082p mo311a(PendingIntent pendingIntent) {
            this.f226C = pendingIntent;
            return this;
        }

        /* renamed from: d */
        public PendingIntent mo324d() {
            return this.f226C;
        }

        /* renamed from: a */
        public C0082p mo310a(Notification notification) {
            this.f227D.add(notification);
            return this;
        }

        /* renamed from: b */
        public C0082p mo318b(List<Notification> list) {
            this.f227D.addAll(list);
            return this;
        }

        /* renamed from: e */
        public C0082p mo327e() {
            this.f227D.clear();
            return this;
        }

        /* renamed from: f */
        public List<Notification> mo330f() {
            return this.f227D;
        }

        /* renamed from: a */
        public C0082p mo312a(Bitmap bitmap) {
            this.f228E = bitmap;
            return this;
        }

        /* renamed from: g */
        public Bitmap mo331g() {
            return this.f228E;
        }

        /* renamed from: a */
        public C0082p mo309a(int i) {
            this.f229F = i;
            return this;
        }

        /* renamed from: h */
        public int mo332h() {
            return this.f229F;
        }

        /* renamed from: b */
        public C0082p mo317b(int i) {
            this.f230G = i;
            return this;
        }

        /* renamed from: i */
        public int mo333i() {
            return this.f230G;
        }

        /* renamed from: c */
        public C0082p mo320c(int i) {
            this.f231H = i;
            return this;
        }

        /* renamed from: j */
        public int mo334j() {
            return this.f231H;
        }

        /* renamed from: d */
        public C0082p mo325d(int i) {
            this.f234K = i;
            return this;
        }

        /* renamed from: k */
        public int mo335k() {
            return this.f234K;
        }

        /* renamed from: e */
        public C0082p mo328e(int i) {
            this.f232I = i;
            return this;
        }

        /* renamed from: l */
        public int mo336l() {
            return this.f232I;
        }

        /* renamed from: f */
        public C0082p mo329f(int i) {
            this.f233J = i;
            return this;
        }

        /* renamed from: m */
        public int mo337m() {
            return this.f233J;
        }

        /* renamed from: a */
        public C0082p mo315a(boolean z) {
            m303a(8, z);
            return this;
        }

        /* renamed from: n */
        public boolean mo338n() {
            return (this.f225B & 8) != 0;
        }

        /* renamed from: b */
        public C0082p mo319b(boolean z) {
            m303a(1, z);
            return this;
        }

        /* renamed from: o */
        public boolean mo339o() {
            return (this.f225B & 1) != 0;
        }

        /* renamed from: c */
        public C0082p mo321c(boolean z) {
            m303a(2, z);
            return this;
        }

        /* renamed from: p */
        public boolean mo340p() {
            return (this.f225B & 2) != 0;
        }

        /* renamed from: d */
        public C0082p mo326d(boolean z) {
            m303a(4, z);
            return this;
        }

        /* renamed from: q */
        public boolean mo341q() {
            return (this.f225B & 4) != 0;
        }

        /* renamed from: a */
        private void m303a(int i, boolean z) {
            if (z) {
                this.f225B |= i;
            } else {
                this.f225B &= i ^ -1;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Notification[] m178b(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < parcelableArray.length) {
                notificationArr[i2] = (Notification) parcelableArray[i2];
                i = i2 + 1;
            } else {
                bundle.putParcelableArray(str, notificationArr);
                return notificationArr;
            }
        }
    }

    /* renamed from: a */
    public static Bundle m169a(Notification notification) {
        return f123K.mo297a(notification);
    }

    /* renamed from: b */
    public static int m175b(Notification notification) {
        return f123K.mo301b(notification);
    }

    /* renamed from: a */
    public static C0064a m170a(Notification notification, int i) {
        return f123K.mo298a(notification, i);
    }

    /* renamed from: c */
    public static boolean m179c(Notification notification) {
        return f123K.mo302c(notification);
    }

    /* renamed from: d */
    public static String m180d(Notification notification) {
        return f123K.mo303d(notification);
    }

    /* renamed from: e */
    public static boolean m181e(Notification notification) {
        return f123K.mo304e(notification);
    }

    /* renamed from: f */
    public static String m182f(Notification notification) {
        return f123K.mo305f(notification);
    }
}
