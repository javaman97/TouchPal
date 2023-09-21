package com.cootek.smartinput5.func.iab.google;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.iab.C1778f;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.iab.google.g */
/* compiled from: IabService */
public class C1787g {

    /* renamed from: a */
    public static final String f5879a = "keyPurchasingType";

    /* renamed from: b */
    private static final String f5880b = "IabService";

    /* renamed from: c */
    private static final String f5881c = "com.android.vending.billing.InAppBillingService.BIND";

    /* renamed from: d */
    private static final String f5882d = "com.android.vending";

    /* renamed from: e */
    private static C1787g f5883e;

    /* renamed from: f */
    private Context f5884f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public IInAppBillingService f5885g;

    /* renamed from: h */
    private String f5886h;

    /* renamed from: i */
    private ArrayList<C1786f> f5887i = new ArrayList<>();

    /* renamed from: j */
    private ServiceConnection f5888j = new C1788h(this);

    /* renamed from: a */
    public static void m8208a(Context context) {
        if (f5883e == null) {
            f5883e = new C1787g(context);
        }
    }

    private C1787g(Context context) {
        this.f5884f = context.getApplicationContext();
    }

    /* renamed from: a */
    public static boolean m8211a() {
        return f5883e != null;
    }

    /* renamed from: b */
    public static C1787g m8212b() {
        return f5883e;
    }

    /* renamed from: a */
    public int mo6780a(String str) throws RemoteException {
        if (mo6791e()) {
            return this.f5885g.mo3017a(3, this.f5884f.getPackageName(), str);
        }
        return C1778f.f5837o;
    }

    /* renamed from: a */
    public void mo6785a(C1786f fVar) {
        if (fVar != null && !this.f5887i.contains(fVar)) {
            this.f5887i.add(fVar);
        }
    }

    /* renamed from: b */
    public void mo6788b(C1786f fVar) {
        if (this.f5887i.contains(fVar)) {
            this.f5887i.remove(fVar);
        }
    }

    /* renamed from: a */
    public Bundle mo6781a(String str, Bundle bundle) throws RemoteException {
        if (mo6791e()) {
            return this.f5885g.mo3018a(3, this.f5884f.getPackageName(), str, bundle);
        }
        return null;
    }

    /* renamed from: a */
    public Bundle mo6782a(String str, String str2) throws RemoteException {
        if (!mo6791e()) {
            return null;
        }
        try {
            return this.f5885g.mo3019a(3, this.f5884f.getPackageName(), str, str2);
        } catch (IllegalStateException e) {
            return null;
        }
    }

    /* renamed from: b */
    public int mo6787b(String str) throws RemoteException {
        if (mo6791e()) {
            return this.f5885g.mo3021b(3, this.f5884f.getPackageName(), str);
        }
        return C1778f.f5837o;
    }

    /* renamed from: c */
    public boolean mo6789c() {
        if (!C1584bI.m7155h(this.f5884f)) {
            m8205a(3);
            return false;
        } else if (this.f5885g == null) {
            Intent intent = new Intent(f5881c);
            intent.setPackage("com.android.vending");
            boolean bindService = this.f5884f.bindService(intent, this.f5888j, 1);
            if (bindService) {
                return bindService;
            }
            m8205a(3);
            return bindService;
        } else {
            m8205a(0);
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void mo6784a(Activity activity, String str, String str2, String str3) throws RemoteException {
        if (mo6791e()) {
            Bundle a = this.f5885g.mo3020a(3, activity.getPackageName(), str, str2, str3);
            if (a != null) {
                this.f5886h = str2;
                m8207a(activity, a, str2);
            } else {
                mo6783a((int) C1778f.f5836n, str2);
            }
        } else {
            mo6789c();
            mo6783a((int) C1778f.f5837o, str2);
        }
    }

    /* renamed from: a */
    private void m8207a(Activity activity, Bundle bundle, String str) {
        int a = m8203a(bundle);
        if (a == 0) {
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(C1778f.f5811ae);
            if (pendingIntent != null) {
                try {
                    activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1000, new Intent(), 0, 0, 0);
                } catch (IntentSender.SendIntentException e) {
                    m8212b().mo6783a((int) C1778f.f5840r, str);
                }
            } else {
                m8212b().mo6783a((int) C1778f.f5839q, str);
            }
        } else {
            mo6783a(a, str);
        }
    }

    /* renamed from: a */
    private int m8203a(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt(C1778f.f5809ac, 6);
        }
        return C1778f.f5836n;
    }

    /* renamed from: a */
    public boolean mo6786a(int i, int i2, Intent intent) {
        int i3;
        String str;
        String str2 = null;
        if (i != 1000) {
            return false;
        }
        if (i2 == -1) {
            if (intent != null) {
                i3 = intent.getIntExtra(C1778f.f5809ac, C1778f.f5834l);
                if (i3 == 0) {
                    str = intent.getStringExtra(C1778f.f5812af);
                    str2 = intent.getStringExtra(C1778f.f5813ag);
                } else {
                    str = null;
                }
            } else {
                i3 = -1004;
                str = null;
            }
        } else if (i2 != 0) {
            i3 = 6;
            str = null;
        } else if (intent != null) {
            intent.getStringExtra(C1778f.f5812af);
            str = null;
            i3 = 1;
        } else {
            str = null;
            i3 = 1;
        }
        m8206a(i3, str, str2, this.f5886h);
        return true;
    }

    /* renamed from: a */
    public void mo6783a(int i, String str) {
        m8206a(i, (String) null, (String) null, str);
    }

    /* renamed from: d */
    public void mo6790d() {
        m8213f();
        f5883e = null;
    }

    /* renamed from: f */
    private void m8213f() {
        if (this.f5885g != null) {
            this.f5884f.unbindService(this.f5888j);
            this.f5885g = null;
        }
    }

    /* renamed from: e */
    public boolean mo6791e() {
        return this.f5885g != null;
    }

    /* renamed from: a */
    private void m8206a(int i, String str, String str2, String str3) {
        if (this.f5887i != null) {
            Iterator it = new ArrayList(this.f5887i).iterator();
            while (it.hasNext()) {
                ((C1786f) it.next()).mo6698a(i, str, str2, str3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8205a(int i) {
        if (this.f5887i != null) {
            Iterator it = new ArrayList(this.f5887i).iterator();
            while (it.hasNext()) {
                ((C1786f) it.next()).mo6697a(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m8214g() {
        if (this.f5887i != null) {
            Iterator it = new ArrayList(this.f5887i).iterator();
            while (it.hasNext()) {
                ((C1786f) it.next()).mo6696a();
            }
        }
    }
}
