package android.support.p001v4.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.p001v4.content.C0194b;
import android.util.Log;
import com.cootek.smartinput5.engine.Engine;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.app.an */
/* compiled from: TaskStackBuilder */
public class C0142an implements Iterable<Intent> {

    /* renamed from: a */
    private static final String f371a = "TaskStackBuilder";

    /* renamed from: b */
    private static final C0144b f372b;

    /* renamed from: c */
    private final ArrayList<Intent> f373c = new ArrayList<>();

    /* renamed from: d */
    private final Context f374d;

    /* renamed from: android.support.v4.app.an$a */
    /* compiled from: TaskStackBuilder */
    public interface C0143a {
        /* renamed from: a */
        Intent mo460a();
    }

    /* renamed from: android.support.v4.app.an$b */
    /* compiled from: TaskStackBuilder */
    interface C0144b {
        /* renamed from: a */
        PendingIntent mo461a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle);
    }

    /* renamed from: android.support.v4.app.an$c */
    /* compiled from: TaskStackBuilder */
    static class C0145c implements C0144b {
        C0145c() {
        }

        /* renamed from: a */
        public PendingIntent mo461a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            return PendingIntent.getActivity(context, i, intent, i2);
        }
    }

    /* renamed from: android.support.v4.app.an$d */
    /* compiled from: TaskStackBuilder */
    static class C0146d implements C0144b {
        C0146d() {
        }

        /* renamed from: a */
        public PendingIntent mo461a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle) {
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return C0148ao.m583a(context, i, intentArr, i2);
        }
    }

    /* renamed from: android.support.v4.app.an$e */
    /* compiled from: TaskStackBuilder */
    static class C0147e implements C0144b {
        C0147e() {
        }

        /* renamed from: a */
        public PendingIntent mo461a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle) {
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return C0149ap.m584a(context, i, intentArr, i2, bundle);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f372b = new C0146d();
        } else {
            f372b = new C0145c();
        }
    }

    private C0142an(Context context) {
        this.f374d = context;
    }

    /* renamed from: a */
    public static C0142an m563a(Context context) {
        return new C0142an(context);
    }

    /* renamed from: b */
    public static C0142an m564b(Context context) {
        return m563a(context);
    }

    /* renamed from: a */
    public C0142an mo452a(Intent intent) {
        this.f373c.add(intent);
        return this;
    }

    /* renamed from: b */
    public C0142an mo456b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f374d.getPackageManager());
        }
        if (component != null) {
            mo451a(component);
        }
        mo452a(intent);
        return this;
    }

    /* renamed from: a */
    public C0142an mo450a(Activity activity) {
        Intent intent;
        Intent intent2 = null;
        if (activity instanceof C0143a) {
            intent2 = ((C0143a) activity).mo460a();
        }
        if (intent2 == null) {
            intent = C0052L.m142b(activity);
        } else {
            intent = intent2;
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f374d.getPackageManager());
            }
            mo451a(component);
            mo452a(intent);
        }
        return this;
    }

    /* renamed from: a */
    public C0142an mo453a(Class<?> cls) {
        return mo451a(new ComponentName(this.f374d, cls));
    }

    /* renamed from: a */
    public C0142an mo451a(ComponentName componentName) {
        int size = this.f373c.size();
        try {
            Intent a = C0052L.m138a(this.f374d, componentName);
            while (a != null) {
                this.f373c.add(size, a);
                a = C0052L.m138a(this.f374d, a.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f371a, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public int mo446a() {
        return this.f373c.size();
    }

    /* renamed from: a */
    public Intent mo449a(int i) {
        return mo455b(i);
    }

    /* renamed from: b */
    public Intent mo455b(int i) {
        return this.f373c.get(i);
    }

    public Iterator<Intent> iterator() {
        return this.f373c.iterator();
    }

    /* renamed from: b */
    public void mo457b() {
        mo454a((Bundle) null);
    }

    /* renamed from: a */
    public void mo454a(Bundle bundle) {
        if (this.f373c.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f373c.toArray(new Intent[this.f373c.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!C0194b.m798a(this.f374d, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            this.f374d.startActivity(intent);
        }
    }

    /* renamed from: a */
    public PendingIntent mo447a(int i, int i2) {
        return mo448a(i, i2, (Bundle) null);
    }

    /* renamed from: a */
    public PendingIntent mo448a(int i, int i2, Bundle bundle) {
        if (this.f373c.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f373c.toArray(new Intent[this.f373c.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return f372b.mo461a(this.f374d, intentArr, i, i2, bundle);
    }

    /* renamed from: c */
    public Intent[] mo458c() {
        Intent[] intentArr = new Intent[this.f373c.size()];
        if (intentArr.length == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f373c.get(0)).addFlags(268484608);
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= intentArr.length) {
                return intentArr;
            }
            intentArr[i2] = new Intent(this.f373c.get(i2));
            i = i2 + 1;
        }
    }
}
