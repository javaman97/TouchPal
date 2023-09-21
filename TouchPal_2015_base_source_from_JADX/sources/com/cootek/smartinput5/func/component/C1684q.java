package com.cootek.smartinput5.func.component;

import android.content.Context;
import android.os.Handler;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.component.C1671f;
import com.cootek.smartinput5.net.login.C2339l;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.func.component.q */
/* compiled from: CloudSyncManager */
public class C1684q implements C1617br.C1620c {

    /* renamed from: a */
    public static final String f5492a = ".as3";

    /* renamed from: b */
    public static final int f5493b = 1;

    /* renamed from: c */
    public static final int f5494c = 0;

    /* renamed from: d */
    public static final int f5495d = 1;

    /* renamed from: e */
    public static final int f5496e = 2;

    /* renamed from: f */
    private static final String f5497f = "CloudSyncManager";

    /* renamed from: h */
    private static C1684q f5498h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static Integer[] f5499i = {1};

    /* renamed from: g */
    private HashMap<Integer, C1671f.C1672a> f5500g;

    /* renamed from: a */
    public static C1684q m7769a() {
        if (f5498h == null) {
            f5498h = new C1684q();
            f5498h.m7773d();
        }
        return f5498h;
    }

    /* renamed from: d */
    private void m7773d() {
        this.f5500g = new HashMap<>();
        C1617br.m7367a().mo6329a((C1617br.C1620c) this);
    }

    public void finalize() throws Throwable {
        super.finalize();
        C1617br.m7367a().mo6334b((C1617br.C1620c) this);
    }

    /* renamed from: b */
    public static void m7770b() {
        if (f5498h != null) {
            try {
                f5498h.finalize();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            f5498h = null;
        }
    }

    /* renamed from: a */
    public void mo6551a(Context context, Integer num) {
        mo6553b(context, num).mo6487a().mo6457e();
    }

    /* renamed from: a */
    public void mo6552a(Context context, Integer num, boolean z) {
        C1671f.C1672a b = mo6553b(context, num);
        if (b.mo6487a().mo6539g() == z) {
            b.mo6487a().mo6457e();
        }
    }

    /* renamed from: b */
    public void mo6554b(Context context, Integer num, boolean z) {
        mo6553b(context, num).mo6487a().mo6530a(z);
    }

    /* renamed from: a */
    public void mo6550a(Context context) {
        new Handler().post(new C1685r(this, context));
    }

    /* renamed from: c */
    public void mo6555c(Context context, Integer num, boolean z) {
        C1671f.C1672a b = mo6553b(context, num);
        if (b != null) {
            b.mo6504a(z);
        }
    }

    /* renamed from: d */
    public void mo6556d(Context context, Integer num, boolean z) {
        C1671f.C1672a b = mo6553b(context, num);
        if (b != null) {
            b.mo6510b(z);
        }
    }

    /* renamed from: c */
    private C1671f.C1672a m7771c(Context context, Integer num) {
        switch (num.intValue()) {
            case 1:
                return new C1664Y(context);
            default:
                return null;
        }
    }

    /* renamed from: b */
    public C1671f.C1672a mo6553b(Context context, Integer num) {
        if (!this.f5500g.containsKey(num) || this.f5500g.get(num) == null) {
            C1671f.C1672a c = m7771c(context, num);
            this.f5500g.put(num, c);
            return c;
        }
        C1671f.C1672a aVar = this.f5500g.get(num);
        aVar.mo6491a(context);
        return aVar;
    }

    /* renamed from: a */
    public void mo6058a(String str, String str2) {
        if (str != null && C2339l.f10311k.equals(str2)) {
            Settings.getInstance().setLongSetting(Settings.CLOUD_SERVICE_LAST_SYNC_TIME, 0);
        }
    }
}
