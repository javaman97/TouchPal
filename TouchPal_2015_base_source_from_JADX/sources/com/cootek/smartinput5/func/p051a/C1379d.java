package com.cootek.smartinput5.func.p051a;

import android.content.Context;
import android.os.Handler;
import com.cootek.smartinput.utilities.C1017y;

/* renamed from: com.cootek.smartinput5.func.a.d */
/* compiled from: HttpErrorHandler */
public class C1379d {

    /* renamed from: a */
    private static final String f4321a = C1379d.class.getSimpleName();

    /* renamed from: b */
    private Exception f4322b;

    /* renamed from: c */
    private Handler f4323c;

    /* renamed from: d */
    private Runnable f4324d;

    public C1379d(Context context) {
    }

    public C1379d(Context context, Handler handler, Runnable runnable) {
        this.f4323c = handler;
        this.f4324d = runnable;
    }

    /* renamed from: a */
    public void mo5883a(Exception exc) {
        this.f4322b = exc;
        C1017y.m5212a(C1017y.f2696y, f4321a, "report error", (Throwable) exc);
        if (this.f4323c != null && this.f4324d != null) {
            this.f4323c.post(this.f4324d);
        }
    }

    /* renamed from: b */
    public void mo5884b(Exception exc) {
        this.f4322b.printStackTrace();
        mo5883a(exc);
    }
}
