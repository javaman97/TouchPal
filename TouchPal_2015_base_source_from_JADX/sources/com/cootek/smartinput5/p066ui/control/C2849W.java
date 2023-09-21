package com.cootek.smartinput5.p066ui.control;

import android.os.Handler;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.ui.control.W */
/* compiled from: ToastWidget */
public class C2849W {

    /* renamed from: a */
    private static final int f12995a = 1000;

    /* renamed from: b */
    private static final int f12996b = 2000;

    /* renamed from: j */
    private static final C2849W f12997j = new C2849W();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Toast f12998c;

    /* renamed from: d */
    private Thread f12999d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f13000e = new Handler();

    /* renamed from: f */
    private Runnable f13001f;

    /* renamed from: g */
    private Runnable f13002g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f13003h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f13004i;

    /* renamed from: a */
    static /* synthetic */ int m13204a(C2849W w, int i) {
        int i2 = w.f13004i - i;
        w.f13004i = i2;
        return i2;
    }

    private C2849W() {
        try {
            this.f12998c = Toast.makeText(C1368X.m6313b(), "", 0);
            this.f12999d = Thread.currentThread();
        } catch (NullPointerException e) {
        }
    }

    /* renamed from: a */
    public static C2849W m13205a() {
        return f12997j;
    }

    /* renamed from: a */
    public void mo9476a(String str) {
        m13213c();
        mo9478a(str, true);
    }

    /* renamed from: a */
    public void mo9478a(String str, boolean z) {
        m13213c();
        m13211b(str, z);
    }

    /* renamed from: a */
    public void mo9477a(String str, int i) {
        m13213c();
        if (i > 0) {
            if (i < 1000) {
                m13210b(str, i);
                return;
            }
            this.f13004i = i;
            m13216d();
            m13211b(str, true);
            this.f13000e.postDelayed(this.f13002g, 1000);
        }
    }

    /* renamed from: b */
    public void mo9479b() {
        if (this.f12998c != null) {
            m13213c();
            this.f12998c.cancel();
        }
    }

    /* renamed from: c */
    private void m13213c() {
        this.f13000e.removeCallbacks(this.f13002g);
        this.f13000e.removeCallbacks(this.f13001f);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13211b(String str, boolean z) {
        if (Thread.currentThread() == this.f12999d) {
            m13214c(str, z);
        } else {
            this.f13000e.post(new C2850X(this, str, z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m13214c(String str, boolean z) {
        if (this.f12998c != null) {
            this.f13003h = str;
            this.f12998c.setText(str);
            this.f12998c.setDuration(z ? 0 : 1);
            try {
                this.f12998c.show();
            } catch (NullPointerException e) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13210b(String str, int i) {
        this.f13003h = str;
        m13217e();
        m13211b(str, true);
        this.f13000e.postDelayed(this.f13001f, (long) i);
    }

    /* renamed from: d */
    private void m13216d() {
        if (this.f13002g == null) {
            this.f13002g = new C2851Y(this);
        }
    }

    /* renamed from: e */
    private void m13217e() {
        if (this.f13001f == null) {
            this.f13001f = new C2852Z(this);
        }
    }
}
